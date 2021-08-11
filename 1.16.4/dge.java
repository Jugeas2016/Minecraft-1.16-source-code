/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.OutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.net.HttpURLConnection;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.Proxy;
/*     */ import java.net.URL;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class dge<T extends dge<T>>
/*     */ {
/*     */   protected HttpURLConnection a;
/*     */   private boolean c;
/*     */   protected String b;
/*     */   
/*     */   public dge(String ☃, int i, int j) {
/*     */     try {
/*  25 */       this.b = ☃;
/*  26 */       Proxy proxy = dgc.a();
/*     */       
/*  28 */       if (proxy != null) {
/*  29 */         this.a = (HttpURLConnection)(new URL(☃)).openConnection(proxy);
/*     */       } else {
/*  31 */         this.a = (HttpURLConnection)(new URL(☃)).openConnection();
/*     */       } 
/*     */       
/*  34 */       this.a.setConnectTimeout(i);
/*  35 */       this.a.setReadTimeout(j);
/*  36 */     } catch (MalformedURLException malformedURLException) {
/*  37 */       throw new dhh(malformedURLException.getMessage(), malformedURLException);
/*  38 */     } catch (IOException iOException) {
/*  39 */       throw new dhh(iOException.getMessage(), iOException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃, String str1) {
/*  44 */     a(this.a, ☃, str1);
/*     */   }
/*     */   
/*     */   public static void a(HttpURLConnection ☃, String str1, String str2) {
/*  48 */     String str = ☃.getRequestProperty("Cookie");
/*  49 */     if (str == null) {
/*  50 */       ☃.setRequestProperty("Cookie", str1 + "=" + str2);
/*     */     } else {
/*  52 */       ☃.setRequestProperty("Cookie", str + ";" + str1 + "=" + str2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/*  63 */     return a(this.a);
/*     */   }
/*     */   
/*     */   public static int a(HttpURLConnection ☃) {
/*  67 */     String str = ☃.getHeaderField("Retry-After");
/*     */     try {
/*  69 */       return Integer.valueOf(str).intValue();
/*  70 */     } catch (Exception exception) {
/*  71 */       return 5;
/*     */     } 
/*     */   }
/*     */   
/*     */   public int b() {
/*     */     try {
/*  77 */       d();
/*  78 */       return this.a.getResponseCode();
/*  79 */     } catch (Exception ☃) {
/*  80 */       throw new dhh(☃.getMessage(), ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String c() {
/*     */     try {
/*  86 */       d();
/*  87 */       String ☃ = null;
/*     */       
/*  89 */       if (b() >= 400) {
/*  90 */         ☃ = a(this.a.getErrorStream());
/*     */       } else {
/*  92 */         ☃ = a(this.a.getInputStream());
/*     */       } 
/*     */       
/*  95 */       f();
/*  96 */       return ☃;
/*  97 */     } catch (IOException ☃) {
/*  98 */       throw new dhh(☃.getMessage(), ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private String a(InputStream ☃) throws IOException {
/* 103 */     if (☃ == null) {
/* 104 */       return "";
/*     */     }
/* 106 */     InputStreamReader inputStreamReader = new InputStreamReader(☃, "UTF-8");
/* 107 */     StringBuilder stringBuilder = new StringBuilder(); int i;
/* 108 */     for (i = inputStreamReader.read(); i != -1; i = inputStreamReader.read()) {
/* 109 */       stringBuilder.append((char)i);
/*     */     }
/*     */     
/* 112 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   private void f() {
/* 116 */     byte[] ☃ = new byte[1024];
/*     */     try {
/* 118 */       InputStream inputStream = this.a.getInputStream();
/* 119 */       while (inputStream.read(☃) > 0);
/*     */ 
/*     */       
/* 122 */       inputStream.close();
/* 123 */     } catch (Exception exception) {
/*     */       try {
/* 125 */         InputStream inputStream = this.a.getErrorStream();
/* 126 */         if (inputStream == null) {
/*     */           return;
/*     */         }
/*     */         
/* 130 */         while (inputStream.read(☃) > 0);
/*     */ 
/*     */         
/* 133 */         inputStream.close();
/* 134 */       } catch (IOException iOException) {}
/*     */     } finally {
/*     */       
/* 137 */       if (this.a != null) {
/* 138 */         this.a.disconnect();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected T d() {
/* 145 */     if (this.c) {
/* 146 */       return (T)this;
/*     */     }
/* 148 */     T ☃ = e();
/* 149 */     this.c = true;
/* 150 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract T e();
/*     */   
/*     */   public static dge<?> a(String ☃) {
/* 157 */     return new b(☃, 5000, 60000);
/*     */   }
/*     */   
/*     */   public static dge<?> a(String ☃, int i, int j) {
/* 161 */     return new b(☃, i, j);
/*     */   }
/*     */   
/*     */   public static dge<?> b(String ☃, String str1) {
/* 165 */     return new c(☃, str1, 5000, 60000);
/*     */   }
/*     */   
/*     */   public static dge<?> a(String ☃, String str1, int i, int j) {
/* 169 */     return new c(☃, str1, i, j);
/*     */   }
/*     */   
/*     */   public static dge<?> b(String ☃) {
/* 173 */     return new a(☃, 5000, 60000);
/*     */   }
/*     */   
/*     */   public static dge<?> c(String ☃, String str1) {
/* 177 */     return new d(☃, str1, 5000, 60000);
/*     */   }
/*     */   
/*     */   public static dge<?> b(String ☃, String str1, int i, int j) {
/* 181 */     return new d(☃, str1, i, j);
/*     */   }
/*     */   
/*     */   public String c(String ☃) {
/* 185 */     return a(this.a, ☃);
/*     */   }
/*     */   
/*     */   public static String a(HttpURLConnection ☃, String str) {
/*     */     try {
/* 190 */       return ☃.getHeaderField(str);
/* 191 */     } catch (Exception exception) {
/* 192 */       return "";
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class a extends dge<a> {
/*     */     public a(String ☃, int i, int j) {
/* 198 */       super(☃, i, j);
/*     */     }
/*     */ 
/*     */     
/*     */     public a f() {
/*     */       try {
/* 204 */         this.a.setDoOutput(true);
/* 205 */         this.a.setRequestMethod("DELETE");
/* 206 */         this.a.connect();
/* 207 */         return this;
/* 208 */       } catch (Exception ☃) {
/* 209 */         throw new dhh(☃.getMessage(), ☃);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b extends dge<b> {
/*     */     public b(String ☃, int i, int j) {
/* 216 */       super(☃, i, j);
/*     */     }
/*     */ 
/*     */     
/*     */     public b f() {
/*     */       try {
/* 222 */         this.a.setDoInput(true);
/* 223 */         this.a.setDoOutput(true);
/* 224 */         this.a.setUseCaches(false);
/* 225 */         this.a.setRequestMethod("GET");
/* 226 */         return this;
/* 227 */       } catch (Exception ☃) {
/* 228 */         throw new dhh(☃.getMessage(), ☃);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class d extends dge<d> {
/*     */     private final String c;
/*     */     
/*     */     public d(String ☃, String str1, int i, int j) {
/* 237 */       super(☃, i, j);
/* 238 */       this.c = str1;
/*     */     }
/*     */ 
/*     */     
/*     */     public d f() {
/*     */       try {
/* 244 */         if (this.c != null) {
/* 245 */           this.a.setRequestProperty("Content-Type", "application/json; charset=utf-8");
/*     */         }
/*     */         
/* 248 */         this.a.setDoOutput(true);
/* 249 */         this.a.setDoInput(true);
/* 250 */         this.a.setRequestMethod("PUT");
/* 251 */         OutputStream ☃ = this.a.getOutputStream();
/* 252 */         OutputStreamWriter outputStreamWriter = new OutputStreamWriter(☃, "UTF-8");
/* 253 */         outputStreamWriter.write(this.c);
/* 254 */         outputStreamWriter.close();
/* 255 */         ☃.flush();
/* 256 */         return this;
/* 257 */       } catch (Exception ☃) {
/* 258 */         throw new dhh(☃.getMessage(), ☃);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c extends dge<c> {
/*     */     private final String c;
/*     */     
/*     */     public c(String ☃, String str1, int i, int j) {
/* 267 */       super(☃, i, j);
/* 268 */       this.c = str1;
/*     */     }
/*     */ 
/*     */     
/*     */     public c f() {
/*     */       try {
/* 274 */         if (this.c != null) {
/* 275 */           this.a.setRequestProperty("Content-Type", "application/json; charset=utf-8");
/*     */         }
/*     */         
/* 278 */         this.a.setDoInput(true);
/* 279 */         this.a.setDoOutput(true);
/* 280 */         this.a.setUseCaches(false);
/* 281 */         this.a.setRequestMethod("POST");
/* 282 */         OutputStream ☃ = this.a.getOutputStream();
/* 283 */         OutputStreamWriter outputStreamWriter = new OutputStreamWriter(☃, "UTF-8");
/* 284 */         outputStreamWriter.write(this.c);
/* 285 */         outputStreamWriter.close();
/* 286 */         ☃.flush();
/* 287 */         return this;
/* 288 */       } catch (Exception ☃) {
/* 289 */         throw new dhh(☃.getMessage(), ☃);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */