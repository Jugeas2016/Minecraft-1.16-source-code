/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.IntSupplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class dzw
/*     */   implements dfd, AutoCloseable
/*     */ {
/*  37 */   private static final Logger a = LogManager.getLogger();
/*  38 */   private static final dfb b = new dfb();
/*     */   
/*     */   private static dzw c;
/*     */   
/*  42 */   private static int d = -1;
/*     */ 
/*     */   
/*  45 */   private final Map<String, IntSupplier> e = Maps.newHashMap();
/*  46 */   private final List<String> f = Lists.newArrayList();
/*  47 */   private final List<Integer> g = Lists.newArrayList();
/*     */ 
/*     */   
/*  50 */   private final List<dfg> h = Lists.newArrayList();
/*  51 */   private final List<Integer> i = Lists.newArrayList();
/*  52 */   private final Map<String, dfg> j = Maps.newHashMap();
/*     */   
/*     */   private final int k;
/*     */   
/*     */   private final String l;
/*     */   
/*     */   private boolean m;
/*     */   
/*     */   private final dfc n;
/*     */   
/*     */   private final List<Integer> o;
/*     */   
/*     */   private final List<String> p;
/*     */   
/*     */   private final dfe q;
/*     */   
/*     */   private final dfe r;
/*     */   
/*     */   public dzw(ach ☃, String str) throws IOException {
/*  71 */     vk vk = new vk("shaders/program/" + str + ".json");
/*  72 */     this.l = str;
/*     */     
/*  74 */     acg acg = null;
/*     */     
/*     */     try {
/*  77 */       acg = ☃.a(vk);
/*  78 */       JsonObject jsonObject = afd.a(new InputStreamReader(acg.b(), StandardCharsets.UTF_8));
/*     */       
/*  80 */       String str1 = afd.h(jsonObject, "vertex");
/*  81 */       String str2 = afd.h(jsonObject, "fragment");
/*     */       
/*  83 */       JsonArray jsonArray1 = afd.a(jsonObject, "samplers", (JsonArray)null);
/*  84 */       if (jsonArray1 != null) {
/*  85 */         int i = 0;
/*  86 */         for (JsonElement jsonElement : jsonArray1) {
/*     */           try {
/*  88 */             a(jsonElement);
/*  89 */           } catch (Exception exception) {
/*  90 */             vn vn = vn.a(exception);
/*  91 */             vn.a("samplers[" + i + "]");
/*  92 */             throw vn;
/*     */           } 
/*  94 */           i++;
/*     */         } 
/*     */       } 
/*     */       
/*  98 */       JsonArray jsonArray2 = afd.a(jsonObject, "attributes", (JsonArray)null);
/*  99 */       if (jsonArray2 != null) {
/* 100 */         int i = 0;
/* 101 */         this.o = Lists.newArrayListWithCapacity(jsonArray2.size());
/* 102 */         this.p = Lists.newArrayListWithCapacity(jsonArray2.size());
/* 103 */         for (JsonElement jsonElement : jsonArray2) {
/*     */           try {
/* 105 */             this.p.add(afd.a(jsonElement, "attribute"));
/* 106 */           } catch (Exception exception) {
/* 107 */             vn vn = vn.a(exception);
/* 108 */             vn.a("attributes[" + i + "]");
/* 109 */             throw vn;
/*     */           } 
/* 111 */           i++;
/*     */         } 
/*     */       } else {
/* 114 */         this.o = null;
/* 115 */         this.p = null;
/*     */       } 
/*     */       
/* 118 */       JsonArray jsonArray3 = afd.a(jsonObject, "uniforms", (JsonArray)null);
/* 119 */       if (jsonArray3 != null) {
/* 120 */         int i = 0;
/* 121 */         for (JsonElement jsonElement : jsonArray3) {
/*     */           try {
/* 123 */             b(jsonElement);
/* 124 */           } catch (Exception exception) {
/* 125 */             vn vn = vn.a(exception);
/* 126 */             vn.a("uniforms[" + i + "]");
/* 127 */             throw vn;
/*     */           } 
/* 129 */           i++;
/*     */         } 
/*     */       } 
/*     */       
/* 133 */       this.n = a(afd.a(jsonObject, "blend", (JsonObject)null));
/*     */       
/* 135 */       this.q = a(☃, dfe.a.a, str1);
/* 136 */       this.r = a(☃, dfe.a.b, str2);
/*     */       
/* 138 */       this.k = dff.a();
/* 139 */       dff.b(this);
/*     */       
/* 141 */       h();
/*     */       
/* 143 */       if (this.p != null) {
/* 144 */         for (String str3 : this.p) {
/* 145 */           int i = dfg.b(this.k, str3);
/* 146 */           this.o.add(Integer.valueOf(i));
/*     */         } 
/*     */       }
/* 149 */     } catch (Exception exception) {
/*     */       String str1;
/* 151 */       if (acg != null) {
/* 152 */         str1 = " (" + acg.d() + ")";
/*     */       } else {
/* 154 */         str1 = "";
/*     */       } 
/*     */       
/* 157 */       vn vn = vn.a(exception);
/* 158 */       vn.b(vk.a() + str1);
/* 159 */       throw vn;
/*     */     } finally {
/* 161 */       IOUtils.closeQuietly(acg);
/*     */     } 
/*     */     
/* 164 */     b();
/*     */   }
/*     */   
/*     */   public static dfe a(ach ☃, dfe.a a1, String str) throws IOException {
/* 168 */     dfe dfe1 = a1.c().get(str);
/*     */     
/* 170 */     if (dfe1 == null) {
/* 171 */       vk vk = new vk("shaders/program/" + str + a1.b());
/* 172 */       acg acg = ☃.a(vk);
/*     */       try {
/* 174 */         dfe1 = dfe.a(a1, str, acg.b(), acg.d());
/*     */       } finally {
/* 176 */         IOUtils.closeQuietly(acg);
/*     */       } 
/*     */     } 
/*     */     
/* 180 */     return dfe1;
/*     */   }
/*     */   
/*     */   public static dfc a(JsonObject ☃) {
/* 184 */     if (☃ == null) {
/* 185 */       return new dfc();
/*     */     }
/* 187 */     int i = 32774;
/* 188 */     int j = 1;
/* 189 */     int k = 0;
/* 190 */     int m = 1;
/* 191 */     int n = 0;
/* 192 */     boolean bool1 = true;
/* 193 */     boolean bool2 = false;
/*     */     
/* 195 */     if (afd.a(☃, "func")) {
/* 196 */       i = dfc.a(☃.get("func").getAsString());
/* 197 */       if (i != 32774) {
/* 198 */         bool1 = false;
/*     */       }
/*     */     } 
/*     */     
/* 202 */     if (afd.a(☃, "srcrgb")) {
/* 203 */       j = dfc.b(☃.get("srcrgb").getAsString());
/* 204 */       if (j != 1) {
/* 205 */         bool1 = false;
/*     */       }
/*     */     } 
/*     */     
/* 209 */     if (afd.a(☃, "dstrgb")) {
/* 210 */       k = dfc.b(☃.get("dstrgb").getAsString());
/* 211 */       if (k != 0) {
/* 212 */         bool1 = false;
/*     */       }
/*     */     } 
/*     */     
/* 216 */     if (afd.a(☃, "srcalpha")) {
/* 217 */       m = dfc.b(☃.get("srcalpha").getAsString());
/* 218 */       if (m != 1) {
/* 219 */         bool1 = false;
/*     */       }
/* 221 */       bool2 = true;
/*     */     } 
/*     */     
/* 224 */     if (afd.a(☃, "dstalpha")) {
/* 225 */       n = dfc.b(☃.get("dstalpha").getAsString());
/* 226 */       if (n != 0) {
/* 227 */         bool1 = false;
/*     */       }
/* 229 */       bool2 = true;
/*     */     } 
/*     */ 
/*     */     
/* 233 */     if (bool1) {
/* 234 */       return new dfc();
/*     */     }
/*     */ 
/*     */     
/* 238 */     if (bool2) {
/* 239 */       return new dfc(j, k, m, n, i);
/*     */     }
/* 241 */     return new dfc(j, k, i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 247 */     for (dfg ☃ : this.h) {
/* 248 */       ☃.close();
/*     */     }
/* 250 */     dff.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 255 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 256 */     dff.a(0);
/* 257 */     d = -1;
/* 258 */     c = null;
/*     */ 
/*     */     
/* 261 */     for (int ☃ = 0; ☃ < this.g.size(); ☃++) {
/* 262 */       if (this.e.get(this.f.get(☃)) != null) {
/*     */ 
/*     */ 
/*     */         
/* 266 */         dem.q(33984 + ☃);
/* 267 */         dem.L();
/* 268 */         dem.s(0);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void f() {
/* 274 */     RenderSystem.assertThread(RenderSystem::isOnGameThread);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 282 */     this.m = false;
/*     */     
/* 284 */     c = this;
/*     */     
/* 286 */     this.n.a();
/*     */     
/* 288 */     if (this.k != d) {
/* 289 */       dff.a(this.k);
/* 290 */       d = this.k;
/*     */     } 
/*     */     
/* 293 */     for (int ☃ = 0; ☃ < this.g.size(); ☃++) {
/* 294 */       String str = this.f.get(☃);
/* 295 */       IntSupplier intSupplier = this.e.get(str);
/* 296 */       if (intSupplier != null) {
/*     */ 
/*     */ 
/*     */         
/* 300 */         RenderSystem.activeTexture(33984 + ☃);
/* 301 */         RenderSystem.enableTexture();
/* 302 */         int i = intSupplier.getAsInt();
/* 303 */         if (i != -1) {
/*     */ 
/*     */           
/* 306 */           RenderSystem.bindTexture(i);
/*     */           
/* 308 */           dfg.a(((Integer)this.g.get(☃)).intValue(), ☃);
/*     */         } 
/*     */       } 
/*     */     } 
/* 312 */     for (dfg dfg : this.h) {
/* 313 */       dfg.b();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/* 319 */     this.m = true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dfg a(String ☃) {
/* 324 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 325 */     return this.j.get(☃);
/*     */   }
/*     */   
/*     */   public dfb b(String ☃) {
/* 329 */     RenderSystem.assertThread(RenderSystem::isOnGameThread);
/* 330 */     dfg dfg = a(☃);
/* 331 */     return (dfg == null) ? b : dfg;
/*     */   }
/*     */   
/*     */   private void h() {
/* 335 */     RenderSystem.assertThread(RenderSystem::isOnRenderThread);
/* 336 */     IntArrayList intArrayList = new IntArrayList(); int ☃;
/* 337 */     for (☃ = 0; ☃ < this.f.size(); ☃++) {
/* 338 */       String str = this.f.get(☃);
/* 339 */       int i = dfg.a(this.k, str);
/* 340 */       if (i == -1) {
/* 341 */         a.warn("Shader {} could not find sampler named {} in the specified shader program.", this.l, str);
/* 342 */         this.e.remove(str);
/* 343 */         intArrayList.add(☃);
/*     */       } else {
/*     */         
/* 346 */         this.g.add(Integer.valueOf(i));
/*     */       } 
/*     */     } 
/*     */     
/* 350 */     for (☃ = intArrayList.size() - 1; ☃ >= 0; ☃--) {
/* 351 */       this.f.remove(intArrayList.getInt(☃));
/*     */     }
/*     */     
/* 354 */     for (dfg dfg : this.h) {
/* 355 */       String str = dfg.a();
/* 356 */       int i = dfg.a(this.k, str);
/* 357 */       if (i == -1) {
/* 358 */         a.warn("Could not find uniform named {} in the specified shader program.", str);
/*     */         continue;
/*     */       } 
/* 361 */       this.i.add(Integer.valueOf(i));
/* 362 */       dfg.a(i);
/* 363 */       this.j.put(str, dfg);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(JsonElement ☃) {
/* 368 */     JsonObject jsonObject = afd.m(☃, "sampler");
/* 369 */     String str = afd.h(jsonObject, "name");
/*     */     
/* 371 */     if (!afd.a(jsonObject, "file")) {
/*     */       
/* 373 */       this.e.put(str, null);
/* 374 */       this.f.add(str);
/*     */       return;
/*     */     } 
/* 377 */     this.f.add(str);
/*     */   }
/*     */   
/*     */   public void a(String ☃, IntSupplier intSupplier) {
/* 381 */     if (this.e.containsKey(☃)) {
/* 382 */       this.e.remove(☃);
/*     */     }
/*     */     
/* 385 */     this.e.put(☃, intSupplier);
/* 386 */     b();
/*     */   }
/*     */   
/*     */   private void b(JsonElement ☃) throws vn {
/* 390 */     JsonObject jsonObject = afd.m(☃, "uniform");
/* 391 */     String str = afd.h(jsonObject, "name");
/* 392 */     int i = dfg.a(afd.h(jsonObject, "type"));
/* 393 */     int j = afd.n(jsonObject, "count");
/* 394 */     float[] arrayOfFloat = new float[Math.max(j, 16)];
/*     */     
/* 396 */     JsonArray jsonArray = afd.u(jsonObject, "values");
/* 397 */     if (jsonArray.size() != j && jsonArray.size() > 1) {
/* 398 */       throw new vn("Invalid amount of values specified (expected " + j + ", found " + jsonArray.size() + ")");
/*     */     }
/*     */     
/* 401 */     int k = 0;
/* 402 */     for (JsonElement jsonElement : jsonArray) {
/*     */       try {
/* 404 */         arrayOfFloat[k] = afd.e(jsonElement, "value");
/* 405 */       } catch (Exception exception) {
/* 406 */         vn vn = vn.a(exception);
/* 407 */         vn.a("values[" + k + "]");
/* 408 */         throw vn;
/*     */       } 
/* 410 */       k++;
/*     */     } 
/*     */ 
/*     */     
/* 414 */     if (j > 1 && jsonArray.size() == 1) {
/* 415 */       for (; k < j; k++) {
/* 416 */         arrayOfFloat[k] = arrayOfFloat[0];
/*     */       }
/*     */     }
/*     */     
/* 420 */     int m = (j > 1 && j <= 4 && i < 8) ? (j - 1) : 0;
/* 421 */     dfg dfg = new dfg(str, i + m, j, this);
/*     */     
/* 423 */     if (i <= 3) {
/*     */       
/* 425 */       dfg.a((int)arrayOfFloat[0], (int)arrayOfFloat[1], (int)arrayOfFloat[2], (int)arrayOfFloat[3]);
/* 426 */     } else if (i <= 7) {
/*     */       
/* 428 */       dfg.b(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
/*     */     } else {
/*     */       
/* 431 */       dfg.a(arrayOfFloat);
/*     */     } 
/*     */     
/* 434 */     this.h.add(dfg);
/*     */   }
/*     */ 
/*     */   
/*     */   public dfe c() {
/* 439 */     return this.q;
/*     */   }
/*     */ 
/*     */   
/*     */   public dfe d() {
/* 444 */     return this.r;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a() {
/* 453 */     return this.k;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */