/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eaj
/*     */   implements AutoCloseable
/*     */ {
/*     */   private final deg a;
/*     */   private final ach b;
/*     */   private final String c;
/*  38 */   private final List<eak> d = Lists.newArrayList();
/*  39 */   private final Map<String, deg> e = Maps.newHashMap();
/*  40 */   private final List<deg> f = Lists.newArrayList();
/*     */   
/*     */   private b g;
/*     */   private int h;
/*     */   private int i;
/*     */   private float j;
/*     */   private float k;
/*     */   
/*     */   public eaj(ekd ☃, ach ach1, deg deg1, vk vk1) throws IOException, JsonSyntaxException {
/*  49 */     this.b = ach1;
/*  50 */     this.a = deg1;
/*  51 */     this.j = 0.0F;
/*  52 */     this.k = 0.0F;
/*  53 */     this.h = deg1.c;
/*  54 */     this.i = deg1.d;
/*  55 */     this.c = vk1.toString();
/*  56 */     b();
/*     */     
/*  58 */     a(☃, vk1);
/*     */   }
/*     */   
/*     */   private void a(ekd ☃, vk vk1) throws IOException, JsonSyntaxException {
/*  62 */     acg acg = null;
/*     */     try {
/*  64 */       acg = this.b.a(vk1);
/*  65 */       JsonObject jsonObject = afd.a(new InputStreamReader(acg.b(), StandardCharsets.UTF_8));
/*     */       
/*  67 */       if (afd.d(jsonObject, "targets")) {
/*  68 */         JsonArray jsonArray = jsonObject.getAsJsonArray("targets");
/*  69 */         int i = 0;
/*     */         
/*  71 */         for (JsonElement jsonElement : jsonArray) {
/*     */           try {
/*  73 */             a(jsonElement);
/*  74 */           } catch (Exception exception) {
/*  75 */             vn vn = vn.a(exception);
/*  76 */             vn.a("targets[" + i + "]");
/*  77 */             throw vn;
/*     */           } 
/*  79 */           i++;
/*     */         } 
/*     */       } 
/*     */       
/*  83 */       if (afd.d(jsonObject, "passes")) {
/*  84 */         JsonArray jsonArray = jsonObject.getAsJsonArray("passes");
/*  85 */         int i = 0;
/*     */         
/*  87 */         for (JsonElement jsonElement : jsonArray) {
/*     */           try {
/*  89 */             a(☃, jsonElement);
/*  90 */           } catch (Exception exception) {
/*  91 */             vn vn = vn.a(exception);
/*  92 */             vn.a("passes[" + i + "]");
/*  93 */             throw vn;
/*     */           } 
/*  95 */           i++;
/*     */         } 
/*     */       } 
/*  98 */     } catch (Exception exception) {
/*     */       String str;
/* 100 */       if (acg != null) {
/* 101 */         str = " (" + acg.d() + ")";
/*     */       } else {
/* 103 */         str = "";
/*     */       } 
/*     */       
/* 106 */       vn vn = vn.a(exception);
/* 107 */       vn.b(vk1.a() + str);
/* 108 */       throw vn;
/*     */     } finally {
/* 110 */       IOUtils.closeQuietly(acg);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(JsonElement ☃) throws vn {
/* 115 */     if (afd.a(☃)) {
/* 116 */       a(☃.getAsString(), this.h, this.i);
/*     */     } else {
/* 118 */       JsonObject jsonObject = afd.m(☃, "target");
/*     */       
/* 120 */       String str = afd.h(jsonObject, "name");
/* 121 */       int i = afd.a(jsonObject, "width", this.h);
/* 122 */       int j = afd.a(jsonObject, "height", this.i);
/*     */       
/* 124 */       if (this.e.containsKey(str)) {
/* 125 */         throw new vn(str + " is already defined");
/*     */       }
/* 127 */       a(str, i, j);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(ekd ☃, JsonElement jsonElement) throws IOException {
/* 133 */     JsonObject jsonObject = afd.m(jsonElement, "pass");
/*     */     
/* 135 */     String str1 = afd.h(jsonObject, "name");
/* 136 */     String str2 = afd.h(jsonObject, "intarget");
/* 137 */     String str3 = afd.h(jsonObject, "outtarget");
/* 138 */     deg deg1 = b(str2);
/* 139 */     deg deg2 = b(str3);
/*     */     
/* 141 */     if (deg1 == null) {
/* 142 */       throw new vn("Input target '" + str2 + "' does not exist");
/*     */     }
/* 144 */     if (deg2 == null) {
/* 145 */       throw new vn("Output target '" + str3 + "' does not exist");
/*     */     }
/*     */     
/* 148 */     eak eak = a(str1, deg1, deg2);
/*     */     
/* 150 */     JsonArray jsonArray1 = afd.a(jsonObject, "auxtargets", (JsonArray)null);
/* 151 */     if (jsonArray1 != null) {
/* 152 */       int i = 0;
/* 153 */       for (JsonElement jsonElement1 : jsonArray1) {
/*     */         try {
/* 155 */           boolean bool; String str6; JsonObject jsonObject1 = afd.m(jsonElement1, "auxtarget");
/* 156 */           String str4 = afd.h(jsonObject1, "name");
/* 157 */           String str5 = afd.h(jsonObject1, "id");
/*     */ 
/*     */           
/* 160 */           if (str5.endsWith(":depth")) {
/* 161 */             bool = true;
/* 162 */             str6 = str5.substring(0, str5.lastIndexOf(':'));
/*     */           } else {
/* 164 */             bool = false;
/* 165 */             str6 = str5;
/*     */           } 
/* 167 */           deg deg3 = b(str6);
/*     */           
/* 169 */           if (deg3 == null) {
/* 170 */             if (bool) {
/* 171 */               throw new vn("Render target '" + str6 + "' can't be used as depth buffer");
/*     */             }
/*     */ 
/*     */             
/* 175 */             vk vk = new vk("textures/effect/" + str6 + ".png");
/* 176 */             acg acg = null;
/*     */             try {
/* 178 */               acg = this.b.a(vk);
/* 179 */             } catch (FileNotFoundException fileNotFoundException) {
/* 180 */               throw new vn("Render target or texture '" + str6 + "' does not exist");
/*     */             } finally {
/* 182 */               IOUtils.closeQuietly(acg);
/*     */             } 
/*     */             
/* 185 */             ☃.a(vk);
/* 186 */             ejq ejq = ☃.b(vk);
/* 187 */             int j = afd.n(jsonObject1, "width");
/* 188 */             int k = afd.n(jsonObject1, "height");
/* 189 */             boolean bool1 = afd.j(jsonObject1, "bilinear");
/* 190 */             if (bool1) {
/* 191 */               RenderSystem.texParameter(3553, 10241, 9729);
/* 192 */               RenderSystem.texParameter(3553, 10240, 9729);
/*     */             } else {
/* 194 */               RenderSystem.texParameter(3553, 10241, 9728);
/* 195 */               RenderSystem.texParameter(3553, 10240, 9728);
/*     */             } 
/* 197 */             eak.a(str4, ejq::b, j, k);
/*     */           }
/* 199 */           else if (bool) {
/* 200 */             eak.a(str4, deg3::g, deg3.a, deg3.b);
/*     */           } else {
/* 202 */             eak.a(str4, deg3::f, deg3.a, deg3.b);
/*     */           }
/*     */         
/* 205 */         } catch (Exception exception) {
/* 206 */           vn vn = vn.a(exception);
/* 207 */           vn.a("auxtargets[" + i + "]");
/* 208 */           throw vn;
/*     */         } 
/* 210 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 214 */     JsonArray jsonArray2 = afd.a(jsonObject, "uniforms", (JsonArray)null);
/* 215 */     if (jsonArray2 != null) {
/* 216 */       int i = 0;
/* 217 */       for (JsonElement jsonElement1 : jsonArray2) {
/*     */         try {
/* 219 */           b(jsonElement1);
/* 220 */         } catch (Exception exception) {
/* 221 */           vn vn = vn.a(exception);
/* 222 */           vn.a("uniforms[" + i + "]");
/* 223 */           throw vn;
/*     */         } 
/* 225 */         i++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(JsonElement ☃) throws vn {
/* 231 */     JsonObject jsonObject = afd.m(☃, "uniform");
/* 232 */     String str = afd.h(jsonObject, "name");
/* 233 */     dfg dfg = ((eak)this.d.get(this.d.size() - 1)).b().a(str);
/*     */     
/* 235 */     if (dfg == null) {
/* 236 */       throw new vn("Uniform '" + str + "' does not exist");
/*     */     }
/*     */     
/* 239 */     float[] arrayOfFloat = new float[4];
/* 240 */     int i = 0;
/* 241 */     JsonArray jsonArray = afd.u(jsonObject, "values");
/*     */     
/* 243 */     for (JsonElement jsonElement : jsonArray) {
/*     */       try {
/* 245 */         arrayOfFloat[i] = afd.e(jsonElement, "value");
/* 246 */       } catch (Exception exception) {
/* 247 */         vn vn = vn.a(exception);
/* 248 */         vn.a("values[" + i + "]");
/* 249 */         throw vn;
/*     */       } 
/* 251 */       i++;
/*     */     } 
/*     */     
/* 254 */     switch (i) {
/*     */ 
/*     */ 
/*     */       
/*     */       case 1:
/* 259 */         dfg.a(arrayOfFloat[0]);
/*     */         break;
/*     */       case 2:
/* 262 */         dfg.a(arrayOfFloat[0], arrayOfFloat[1]);
/*     */         break;
/*     */       case 3:
/* 265 */         dfg.a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2]);
/*     */         break;
/*     */       case 4:
/* 268 */         dfg.a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public deg a(String ☃) {
/* 274 */     return this.e.get(☃);
/*     */   }
/*     */   
/*     */   public void a(String ☃, int i, int j) {
/* 278 */     deg deg1 = new deg(i, j, true, djz.a);
/* 279 */     deg1.a(0.0F, 0.0F, 0.0F, 0.0F);
/* 280 */     this.e.put(☃, deg1);
/*     */     
/* 282 */     if (i == this.h && j == this.i) {
/* 283 */       this.f.add(deg1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 289 */     for (deg ☃ : this.e.values()) {
/* 290 */       ☃.a();
/*     */     }
/* 292 */     for (eak ☃ : this.d) {
/* 293 */       ☃.close();
/*     */     }
/* 295 */     this.d.clear();
/*     */   }
/*     */   
/*     */   public eak a(String ☃, deg deg1, deg deg2) throws IOException {
/* 299 */     eak eak = new eak(this.b, ☃, deg1, deg2);
/* 300 */     this.d.add(this.d.size(), eak);
/* 301 */     return eak;
/*     */   }
/*     */   
/*     */   private void b() {
/* 305 */     this.g = b.a(this.a.a, this.a.b, 0.1F, 1000.0F);
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/* 309 */     this.h = this.a.a;
/* 310 */     this.i = this.a.b;
/* 311 */     b();
/* 312 */     for (eak eak : this.d) {
/* 313 */       eak.a(this.g);
/*     */     }
/* 315 */     for (deg deg1 : this.f) {
/* 316 */       deg1.a(☃, i, djz.a);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 321 */     if (☃ < this.k) {
/* 322 */       this.j += 1.0F - this.k;
/* 323 */       this.j += ☃;
/*     */     } else {
/* 325 */       this.j += ☃ - this.k;
/*     */     } 
/* 327 */     this.k = ☃;
/* 328 */     while (this.j > 20.0F) {
/* 329 */       this.j -= 20.0F;
/*     */     }
/* 331 */     for (eak eak : this.d) {
/* 332 */       eak.a(this.j / 20.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public final String a() {
/* 337 */     return this.c;
/*     */   }
/*     */   
/*     */   private deg b(String ☃) {
/* 341 */     if (☃ == null) {
/* 342 */       return null;
/*     */     }
/* 344 */     if (☃.equals("minecraft:main")) {
/* 345 */       return this.a;
/*     */     }
/* 347 */     return this.e.get(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eaj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */