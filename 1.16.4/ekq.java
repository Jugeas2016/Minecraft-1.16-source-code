/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ekq
/*     */   implements abj
/*     */ {
/*     */   private static final Map<String, Pair<cez, vk>> d;
/*     */   
/*     */   static {
/*  27 */     d = x.<Map<String, Pair<cez, vk>>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("textures/entity/chest/normal_left.png", new Pair(cez.b, new vk("textures/entity/chest/normal_double.png")));
/*     */           ☃.put("textures/entity/chest/normal_right.png", new Pair(cez.c, new vk("textures/entity/chest/normal_double.png")));
/*     */           ☃.put("textures/entity/chest/normal.png", new Pair(cez.a, new vk("textures/entity/chest/normal.png")));
/*     */           ☃.put("textures/entity/chest/trapped_left.png", new Pair(cez.b, new vk("textures/entity/chest/trapped_double.png")));
/*     */           ☃.put("textures/entity/chest/trapped_right.png", new Pair(cez.c, new vk("textures/entity/chest/trapped_double.png")));
/*     */           ☃.put("textures/entity/chest/trapped.png", new Pair(cez.a, new vk("textures/entity/chest/trapped.png")));
/*     */           ☃.put("textures/entity/chest/christmas_left.png", new Pair(cez.b, new vk("textures/entity/chest/christmas_double.png")));
/*     */           ☃.put("textures/entity/chest/christmas_right.png", new Pair(cez.c, new vk("textures/entity/chest/christmas_double.png")));
/*     */           ☃.put("textures/entity/chest/christmas.png", new Pair(cez.a, new vk("textures/entity/chest/christmas.png")));
/*     */           ☃.put("textures/entity/chest/ender.png", new Pair(cez.a, new vk("textures/entity/chest/ender.png")));
/*     */         });
/*     */   }
/*  40 */   private static final List<String> e = Lists.newArrayList((Object[])new String[] { "base", "border", "bricks", "circle", "creeper", "cross", "curly_border", "diagonal_left", "diagonal_right", "diagonal_up_left", "diagonal_up_right", "flower", "globe", "gradient", "gradient_up", "half_horizontal", "half_horizontal_bottom", "half_vertical", "half_vertical_right", "mojang", "rhombus", "skull", "small_stripes", "square_bottom_left", "square_bottom_right", "square_top_left", "square_top_right", "straight_cross", "stripe_bottom", "stripe_center", "stripe_downleft", "stripe_downright", "stripe_left", "stripe_middle", "stripe_right", "stripe_top", "triangle_bottom", "triangle_top", "triangles_bottom", "triangles_top" });
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
/*     */   private static final Set<String> f;
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
/*     */   private static final Set<String> g;
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
/*     */   static {
/*  82 */     f = (Set<String>)e.stream().map(☃ -> "textures/entity/shield/" + ☃ + ".png").collect(Collectors.toSet());
/*  83 */     g = (Set<String>)e.stream().map(☃ -> "textures/entity/banner/" + ☃ + ".png").collect(Collectors.toSet());
/*     */   }
/*  85 */   public static final vk a = new vk("textures/entity/shield_base.png");
/*  86 */   public static final vk b = new vk("textures/entity/banner_base.png");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  92 */   public static final vk c = new vk("textures/entity/iron_golem.png");
/*     */   
/*     */   private final abj h;
/*     */ 
/*     */   
/*     */   public ekq(abj ☃) {
/*  98 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream b(String ☃) throws IOException {
/* 103 */     return this.h.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(abk ☃, vk vk1) {
/* 108 */     if (!"minecraft".equals(vk1.b())) {
/* 109 */       return this.h.b(☃, vk1);
/*     */     }
/*     */     
/* 112 */     String str = vk1.a();
/*     */ 
/*     */     
/* 115 */     if ("textures/misc/enchanted_item_glint.png".equals(str)) {
/* 116 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 120 */     if ("textures/entity/iron_golem/iron_golem.png".equals(str)) {
/* 121 */       return this.h.b(☃, c);
/*     */     }
/*     */ 
/*     */     
/* 125 */     if ("textures/entity/conduit/wind.png".equals(str) || "textures/entity/conduit/wind_vertical.png".equals(str)) {
/* 126 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 130 */     if (f.contains(str)) {
/* 131 */       return (this.h.b(☃, a) && this.h.b(☃, vk1));
/*     */     }
/*     */ 
/*     */     
/* 135 */     if (g.contains(str)) {
/* 136 */       return (this.h.b(☃, b) && this.h.b(☃, vk1));
/*     */     }
/*     */     
/* 139 */     Pair<cez, vk> pair = d.get(str);
/* 140 */     if (pair != null && this.h.b(☃, (vk)pair.getSecond())) {
/* 141 */       return true;
/*     */     }
/*     */     
/* 144 */     return this.h.b(☃, vk1);
/*     */   }
/*     */ 
/*     */   
/*     */   public InputStream a(abk ☃, vk vk1) throws IOException {
/* 149 */     if (!"minecraft".equals(vk1.b())) {
/* 150 */       return this.h.a(☃, vk1);
/*     */     }
/*     */     
/* 153 */     String str = vk1.a();
/* 154 */     if ("textures/entity/iron_golem/iron_golem.png".equals(str)) {
/* 155 */       return this.h.a(☃, c);
/*     */     }
/*     */     
/* 158 */     if (f.contains(str)) {
/* 159 */       InputStream inputStream = a(this.h.a(☃, a), this.h.a(☃, vk1), 64, 2, 2, 12, 22);
/* 160 */       if (inputStream != null) {
/* 161 */         return inputStream;
/*     */       }
/* 163 */     } else if (g.contains(str)) {
/* 164 */       InputStream inputStream = a(this.h.a(☃, b), this.h.a(☃, vk1), 64, 0, 0, 42, 41);
/* 165 */       if (inputStream != null)
/* 166 */         return inputStream; 
/*     */     } else {
/* 168 */       if ("textures/entity/enderdragon/dragon.png".equals(str) || "textures/entity/enderdragon/dragon_exploding.png".equals(str))
/*     */       {
/* 170 */         try (det ☃ = det.a(this.h.a(☃, vk1))) {
/* 171 */           int i = det.a() / 256;
/*     */           
/* 173 */           for (int j = 88 * i; j < 200 * i; j++) {
/* 174 */             for (int k = 56 * i; k < 112 * i; k++) {
/* 175 */               det.a(k, j, 0);
/*     */             }
/*     */           } 
/*     */           
/* 179 */           return new ByteArrayInputStream(det.e());
/*     */         }  } 
/* 181 */       if ("textures/entity/conduit/closed_eye.png".equals(str) || "textures/entity/conduit/open_eye.png".equals(str)) {
/* 182 */         return a(this.h.a(☃, vk1));
/*     */       }
/* 184 */       Pair<cez, vk> pair = d.get(str);
/* 185 */       if (pair != null) {
/* 186 */         cez cez = (cez)pair.getFirst();
/* 187 */         InputStream inputStream = this.h.a(☃, (vk)pair.getSecond());
/*     */         
/* 189 */         if (cez == cez.a)
/* 190 */           return d(inputStream); 
/* 191 */         if (cez == cez.b)
/* 192 */           return b(inputStream); 
/* 193 */         if (cez == cez.c) {
/* 194 */           return c(inputStream);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 199 */     return this.h.a(☃, vk1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static InputStream a(InputStream ☃, InputStream inputStream1, int i, int j, int k, int m, int n) throws IOException {
/* 205 */     try(det ☃ = det.a(☃); 
/* 206 */         det ☃ = det.a(inputStream1)) {
/*     */       
/* 208 */       int i1 = det.a();
/* 209 */       int i2 = det.b();
/*     */       
/* 211 */       if (i1 == det1.a() && i2 == det1.b()) {
/* 212 */         try (det ☃ = new det(i1, i2, true)) {
/* 213 */           int i3 = i1 / i;
/* 214 */           for (int i4 = k * i3; i4 < n * i3; i4++) {
/* 215 */             for (int i5 = j * i3; i5 < m * i3; i5++) {
/* 216 */               int i6 = det.b(det1.a(i5, i4));
/* 217 */               int i7 = det.a(i5, i4);
/*     */               
/* 219 */               det2.a(i5, i4, det.a(i6, 
/*     */                     
/* 221 */                     det.d(i7), 
/* 222 */                     det.c(i7), 
/* 223 */                     det.b(i7)));
/*     */             } 
/*     */           } 
/*     */ 
/*     */           
/* 228 */           return new ByteArrayInputStream(det2.e());
/*     */         } 
/*     */       }
/*     */     } 
/* 232 */     return null;
/*     */   }
/*     */   
/*     */   public static InputStream a(InputStream ☃) throws IOException {
/* 236 */     try (det ☃ = det.a(☃)) {
/* 237 */       int i = det.a();
/* 238 */       int j = det.b();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static InputStream b(InputStream ☃) throws IOException {
/* 248 */     try (det ☃ = det.a(☃)) {
/* 249 */       int i = det.a();
/* 250 */       int j = det.b();
/*     */     } 
/*     */   }
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
/*     */   public static InputStream c(InputStream ☃) throws IOException {
/* 282 */     try (det ☃ = det.a(☃)) {
/* 283 */       int i = det.a();
/* 284 */       int j = det.b();
/*     */     } 
/*     */   }
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
/*     */   public static InputStream d(InputStream ☃) throws IOException {
/* 316 */     try (det ☃ = det.a(☃)) {
/* 317 */       int i = det.a();
/* 318 */       int j = det.b();
/*     */     } 
/*     */   }
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
/*     */   public Collection<vk> a(abk ☃, String str1, String str2, int i, Predicate<String> predicate) {
/* 353 */     return this.h.a(☃, str1, str2, i, predicate);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> a(abk ☃) {
/* 358 */     return this.h.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <T> T a(abn<T> ☃) throws IOException {
/* 364 */     return this.h.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 369 */     return this.h.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 374 */     this.h.close();
/*     */   }
/*     */   
/*     */   private static void a(det ☃, det det1, int i, int j, int k, int m, int n, int i1, int i2, boolean bool1, boolean bool2) {
/* 378 */     i1 *= i2;
/* 379 */     n *= i2;
/* 380 */     k *= i2;
/* 381 */     m *= i2;
/* 382 */     i *= i2;
/* 383 */     j *= i2;
/*     */     
/* 385 */     for (int i3 = 0; i3 < i1; i3++) {
/* 386 */       for (int i4 = 0; i4 < n; i4++)
/* 387 */         det1.a(k + i4, m + i3, ☃
/*     */ 
/*     */             
/* 390 */             .a(i + (bool1 ? (n - 1 - i4) : i4), j + (bool2 ? (i1 - 1 - i3) : i3))); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */