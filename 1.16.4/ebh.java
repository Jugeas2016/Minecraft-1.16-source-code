/*     */ import javax.annotation.Nullable;
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
/*     */ public class ebh
/*     */ {
/*  24 */   private static final float a = 1.0F / (float)Math.cos(0.39269909262657166D) - 1.0F;
/*  25 */   private static final float b = 1.0F / (float)Math.cos(0.7853981852531433D) - 1.0F;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public eba a(g ☃, g g1, ebc ebc1, ekc ekc1, gc gc1, elv elv1, @Nullable ebd ebd1, boolean bool, vk vk1) {
/*  31 */     ebe ebe = ebc1.d;
/*  32 */     if (elv1.c()) {
/*  33 */       ebe = a(ebc1.d, gc1, elv1.b(), vk1);
/*     */     }
/*     */     
/*  36 */     float[] arrayOfFloat = new float[ebe.a.length];
/*  37 */     System.arraycopy(ebe.a, 0, arrayOfFloat, 0, arrayOfFloat.length);
/*     */     
/*  39 */     float f1 = ekc1.p();
/*     */     
/*  41 */     float f2 = (ebe.a[0] + ebe.a[0] + ebe.a[2] + ebe.a[2]) / 4.0F;
/*  42 */     float f3 = (ebe.a[1] + ebe.a[1] + ebe.a[3] + ebe.a[3]) / 4.0F;
/*     */     
/*  44 */     ebe.a[0] = afm.g(f1, ebe.a[0], f2);
/*  45 */     ebe.a[2] = afm.g(f1, ebe.a[2], f2);
/*  46 */     ebe.a[1] = afm.g(f1, ebe.a[1], f3);
/*  47 */     ebe.a[3] = afm.g(f1, ebe.a[3], f3);
/*     */     
/*  49 */     int[] arrayOfInt = a(ebe, ekc1, gc1, a(☃, g1), elv1.b(), ebd1, bool);
/*  50 */     gc gc2 = a(arrayOfInt);
/*     */     
/*  52 */     System.arraycopy(arrayOfFloat, 0, ebe.a, 0, arrayOfFloat.length);
/*     */     
/*  54 */     if (ebd1 == null) {
/*  55 */       a(arrayOfInt, gc2);
/*     */     }
/*     */     
/*  58 */     return new eba(arrayOfInt, ebc1.b, gc2, ekc1, bool);
/*     */   }
/*     */   public static ebe a(ebe ☃, gc gc1, f f1, vk vk1) {
/*     */     float f10, f11, f12, f13;
/*  62 */     b b = fw.a(f1, gc1, () -> "Unable to resolve UVLock for model: " + ☃).c();
/*     */     
/*  64 */     float f2 = ☃.a(☃.c(0));
/*  65 */     float f3 = ☃.b(☃.c(0));
/*  66 */     h h1 = new h(f2 / 16.0F, f3 / 16.0F, 0.0F, 1.0F);
/*  67 */     h1.a(b);
/*  68 */     float f4 = 16.0F * h1.a();
/*  69 */     float f5 = 16.0F * h1.b();
/*     */     
/*  71 */     float f6 = ☃.a(☃.c(2));
/*  72 */     float f7 = ☃.b(☃.c(2));
/*  73 */     h h2 = new h(f6 / 16.0F, f7 / 16.0F, 0.0F, 1.0F);
/*  74 */     h2.a(b);
/*  75 */     float f8 = 16.0F * h2.a();
/*  76 */     float f9 = 16.0F * h2.b();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     if (Math.signum(f6 - f2) == Math.signum(f8 - f4)) {
/*  83 */       f10 = f4;
/*  84 */       f11 = f8;
/*     */     } else {
/*  86 */       f10 = f8;
/*  87 */       f11 = f4;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     if (Math.signum(f7 - f3) == Math.signum(f9 - f5)) {
/*  94 */       f12 = f5;
/*  95 */       f13 = f9;
/*     */     } else {
/*  97 */       f12 = f9;
/*  98 */       f13 = f5;
/*     */     } 
/*     */     
/* 101 */     float f14 = (float)Math.toRadians(☃.b);
/* 102 */     g g = new g(afm.b(f14), afm.a(f14), 0.0F);
/* 103 */     a a = new a(b);
/* 104 */     g.a(a);
/* 105 */     int i = Math.floorMod(-((int)Math.round(Math.toDegrees(Math.atan2(g.b(), g.a())) / 90.0D)) * 90, 360);
/* 106 */     return new ebe(new float[] { f10, f12, f11, f13 }, i);
/*     */   }
/*     */   
/*     */   private int[] a(ebe ☃, ekc ekc1, gc gc1, float[] arrayOfFloat, f f1, @Nullable ebd ebd1, boolean bool) {
/* 110 */     int[] arrayOfInt = new int[32];
/* 111 */     for (int i = 0; i < 4; i++) {
/* 112 */       a(arrayOfInt, i, gc1, ☃, arrayOfFloat, ekc1, f1, ebd1, bool);
/*     */     }
/* 114 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   private float[] a(g ☃, g g1) {
/* 118 */     float[] arrayOfFloat = new float[(gc.values()).length];
/* 119 */     arrayOfFloat[dzx.a.f] = ☃.a() / 16.0F;
/* 120 */     arrayOfFloat[dzx.a.e] = ☃.b() / 16.0F;
/* 121 */     arrayOfFloat[dzx.a.d] = ☃.c() / 16.0F;
/* 122 */     arrayOfFloat[dzx.a.c] = g1.a() / 16.0F;
/* 123 */     arrayOfFloat[dzx.a.b] = g1.b() / 16.0F;
/* 124 */     arrayOfFloat[dzx.a.a] = g1.c() / 16.0F;
/* 125 */     return arrayOfFloat;
/*     */   }
/*     */   
/*     */   private void a(int[] ☃, int i, gc gc1, ebe ebe1, float[] arrayOfFloat, ekc ekc1, f f1, @Nullable ebd ebd1, boolean bool) {
/* 129 */     dzx.b b = dzx.a(gc1).a(i);
/*     */     
/* 131 */     g g = new g(arrayOfFloat[b.a], arrayOfFloat[b.b], arrayOfFloat[b.c]);
/* 132 */     a(g, ebd1);
/* 133 */     a(g, f1);
/*     */     
/* 135 */     a(☃, i, g, ekc1, ebe1);
/*     */   }
/*     */   
/*     */   private void a(int[] ☃, int i, g g1, ekc ekc1, ebe ebe1) {
/* 139 */     int j = i * 8;
/* 140 */     ☃[j] = Float.floatToRawIntBits(g1.a());
/* 141 */     ☃[j + 1] = Float.floatToRawIntBits(g1.b());
/* 142 */     ☃[j + 2] = Float.floatToRawIntBits(g1.c());
/* 143 */     ☃[j + 3] = -1;
/* 144 */     ☃[j + 4] = Float.floatToRawIntBits(ekc1.a(ebe1.a(i)));
/* 145 */     ☃[j + 4 + 1] = Float.floatToRawIntBits(ekc1.b(ebe1.b(i)));
/*     */   }
/*     */   private void a(g ☃, @Nullable ebd ebd1) {
/*     */     g g1, g2;
/* 149 */     if (ebd1 == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 156 */     switch (null.a[ebd1.b.ordinal()]) {
/*     */       case 1:
/* 158 */         g1 = new g(1.0F, 0.0F, 0.0F);
/* 159 */         g2 = new g(0.0F, 1.0F, 1.0F);
/*     */         break;
/*     */       case 2:
/* 162 */         g1 = new g(0.0F, 1.0F, 0.0F);
/* 163 */         g2 = new g(1.0F, 0.0F, 1.0F);
/*     */         break;
/*     */       case 3:
/* 166 */         g1 = new g(0.0F, 0.0F, 1.0F);
/* 167 */         g2 = new g(1.0F, 1.0F, 0.0F);
/*     */         break;
/*     */       default:
/* 170 */         throw new IllegalArgumentException("There are only 3 axes");
/*     */     } 
/*     */     
/* 173 */     d d = new d(g1, ebd1.c, true);
/*     */     
/* 175 */     if (ebd1.d) {
/* 176 */       if (Math.abs(ebd1.c) == 22.5F) {
/* 177 */         g2.b(a);
/*     */       } else {
/* 179 */         g2.b(b);
/*     */       } 
/* 181 */       g2.c(1.0F, 1.0F, 1.0F);
/*     */     } else {
/* 183 */       g2.a(1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */     
/* 186 */     a(☃, ebd1.a.e(), new b(d), g2);
/*     */   }
/*     */   
/*     */   public void a(g ☃, f f1) {
/* 190 */     if (f1 == f.a()) {
/*     */       return;
/*     */     }
/*     */     
/* 194 */     a(☃, new g(0.5F, 0.5F, 0.5F), f1.c(), new g(1.0F, 1.0F, 1.0F));
/*     */   }
/*     */   
/*     */   private void a(g ☃, g g1, b b1, g g2) {
/* 198 */     h h = new h(☃.a() - g1.a(), ☃.b() - g1.b(), ☃.c() - g1.c(), 1.0F);
/* 199 */     h.a(b1);
/* 200 */     h.a(g2);
/* 201 */     ☃.a(h.a() + g1.a(), h.b() + g1.b(), h.c() + g1.c());
/*     */   }
/*     */   
/*     */   public static gc a(int[] ☃) {
/* 205 */     g g1 = new g(Float.intBitsToFloat(☃[0]), Float.intBitsToFloat(☃[1]), Float.intBitsToFloat(☃[2]));
/* 206 */     g g2 = new g(Float.intBitsToFloat(☃[8]), Float.intBitsToFloat(☃[9]), Float.intBitsToFloat(☃[10]));
/* 207 */     g g3 = new g(Float.intBitsToFloat(☃[16]), Float.intBitsToFloat(☃[17]), Float.intBitsToFloat(☃[18]));
/* 208 */     g g4 = g1.e();
/* 209 */     g4.b(g2);
/* 210 */     g g5 = g3.e();
/* 211 */     g5.b(g2);
/* 212 */     g g6 = g5.e();
/* 213 */     g6.d(g4);
/*     */     
/* 215 */     g6.d();
/*     */     
/* 217 */     gc gc = null;
/* 218 */     float f = 0.0F;
/* 219 */     for (gc gc1 : gc.values()) {
/* 220 */       gr gr = gc1.p();
/* 221 */       g g = new g(gr.u(), gr.v(), gr.w());
/* 222 */       float f1 = g6.c(g);
/*     */       
/* 224 */       if (f1 >= 0.0F && f1 > f) {
/* 225 */         f = f1;
/* 226 */         gc = gc1;
/*     */       } 
/*     */     } 
/* 229 */     if (gc == null) {
/* 230 */       return gc.b;
/*     */     }
/* 232 */     return gc;
/*     */   }
/*     */   
/*     */   private void a(int[] ☃, gc gc1) {
/* 236 */     int[] arrayOfInt = new int[☃.length];
/* 237 */     System.arraycopy(☃, 0, arrayOfInt, 0, ☃.length);
/*     */     
/* 239 */     float[] arrayOfFloat = new float[(gc.values()).length];
/* 240 */     arrayOfFloat[dzx.a.f] = 999.0F;
/* 241 */     arrayOfFloat[dzx.a.e] = 999.0F;
/* 242 */     arrayOfFloat[dzx.a.d] = 999.0F;
/* 243 */     arrayOfFloat[dzx.a.c] = -999.0F;
/* 244 */     arrayOfFloat[dzx.a.b] = -999.0F;
/* 245 */     arrayOfFloat[dzx.a.a] = -999.0F;
/* 246 */     for (int i = 0; i < 4; i++) {
/* 247 */       int k = 8 * i;
/* 248 */       float f1 = Float.intBitsToFloat(arrayOfInt[k]);
/* 249 */       float f2 = Float.intBitsToFloat(arrayOfInt[k + 1]);
/* 250 */       float f3 = Float.intBitsToFloat(arrayOfInt[k + 2]);
/* 251 */       if (f1 < arrayOfFloat[dzx.a.f]) {
/* 252 */         arrayOfFloat[dzx.a.f] = f1;
/*     */       }
/* 254 */       if (f2 < arrayOfFloat[dzx.a.e]) {
/* 255 */         arrayOfFloat[dzx.a.e] = f2;
/*     */       }
/* 257 */       if (f3 < arrayOfFloat[dzx.a.d]) {
/* 258 */         arrayOfFloat[dzx.a.d] = f3;
/*     */       }
/* 260 */       if (f1 > arrayOfFloat[dzx.a.c]) {
/* 261 */         arrayOfFloat[dzx.a.c] = f1;
/*     */       }
/* 263 */       if (f2 > arrayOfFloat[dzx.a.b]) {
/* 264 */         arrayOfFloat[dzx.a.b] = f2;
/*     */       }
/* 266 */       if (f3 > arrayOfFloat[dzx.a.a]) {
/* 267 */         arrayOfFloat[dzx.a.a] = f3;
/*     */       }
/*     */     } 
/*     */     
/* 271 */     dzx dzx = dzx.a(gc1);
/* 272 */     for (int j = 0; j < 4; j++) {
/* 273 */       int k = 8 * j;
/* 274 */       dzx.b b = dzx.a(j);
/*     */       
/* 276 */       float f1 = arrayOfFloat[b.a];
/* 277 */       float f2 = arrayOfFloat[b.b];
/* 278 */       float f3 = arrayOfFloat[b.c];
/*     */       
/* 280 */       ☃[k] = Float.floatToRawIntBits(f1);
/* 281 */       ☃[k + 1] = Float.floatToRawIntBits(f2);
/* 282 */       ☃[k + 2] = Float.floatToRawIntBits(f3);
/*     */       
/* 284 */       for (int m = 0; m < 4; m++) {
/* 285 */         int n = 8 * m;
/* 286 */         float f4 = Float.intBitsToFloat(arrayOfInt[n]);
/* 287 */         float f5 = Float.intBitsToFloat(arrayOfInt[n + 1]);
/* 288 */         float f6 = Float.intBitsToFloat(arrayOfInt[n + 2]);
/* 289 */         if (afm.a(f1, f4) && afm.a(f2, f5) && afm.a(f3, f6)) {
/* 290 */           ☃[k + 4] = arrayOfInt[n + 4];
/* 291 */           ☃[k + 4 + 1] = arrayOfInt[n + 4 + 1];
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */