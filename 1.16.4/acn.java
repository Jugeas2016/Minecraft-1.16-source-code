/*     */ import com.google.gson.JsonObject;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acn
/*     */   implements acg
/*     */ {
/*     */   private final String a;
/*     */   private final vk b;
/*     */   private final InputStream c;
/*     */   private final InputStream d;
/*     */   private boolean e;
/*     */   private JsonObject f;
/*     */   
/*     */   public acn(String ☃, vk vk1, InputStream inputStream1, @Nullable InputStream inputStream2) {
/*  25 */     this.a = ☃;
/*  26 */     this.b = vk1;
/*  27 */     this.c = inputStream1;
/*  28 */     this.d = inputStream2;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a() {
/*  33 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream b() {
/*  38 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  43 */     return (this.d != null);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <T> T a(abn<T> ☃) {
/*  49 */     if (!c()) {
/*  50 */       return null;
/*     */     }
/*     */     
/*  53 */     if (this.f == null && !this.e) {
/*  54 */       this.e = true;
/*     */ 
/*     */       
/*  57 */       BufferedReader bufferedReader = null;
/*     */       try {
/*  59 */         bufferedReader = new BufferedReader(new InputStreamReader(this.d, StandardCharsets.UTF_8));
/*  60 */         this.f = afd.a(bufferedReader);
/*     */       } finally {
/*  62 */         IOUtils.closeQuietly(bufferedReader);
/*     */       } 
/*     */     } 
/*     */     
/*  66 */     if (this.f == null)
/*     */     {
/*  68 */       return null;
/*     */     }
/*     */     
/*  71 */     String str = ☃.a();
/*  72 */     return this.f.has(str) ? ☃.a(afd.t(this.f, str)) : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String d() {
/*  77 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  82 */     if (this == ☃) {
/*  83 */       return true;
/*     */     }
/*  85 */     if (!(☃ instanceof acn)) {
/*  86 */       return false;
/*     */     }
/*     */     
/*  89 */     acn acn1 = (acn)☃;
/*     */     
/*  91 */     if ((this.b != null) ? !this.b.equals(acn1.b) : (acn1.b != null)) {
/*  92 */       return false;
/*     */     }
/*  94 */     if ((this.a != null) ? !this.a.equals(acn1.a) : (acn1.a != null)) {
/*  95 */       return false;
/*     */     }
/*     */     
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 103 */     int ☃ = (this.a != null) ? this.a.hashCode() : 0;
/* 104 */     ☃ = 31 * ☃ + ((this.b != null) ? this.b.hashCode() : 0);
/* 105 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 110 */     this.c.close();
/* 111 */     if (this.d != null)
/* 112 */       this.d.close(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */