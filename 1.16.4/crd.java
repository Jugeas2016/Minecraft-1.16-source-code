/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class crd
/*     */ {
/*  30 */   private static final csx a = (new csx()).a(true).a(cse.b);
/*  31 */   private static final csx b = (new csx()).a(true).a(cse.d);
/*     */   
/*     */   private static a b(csw ☃, a a1, fx fx1, String str, bzm bzm1, boolean bool) {
/*  34 */     a a2 = new a(☃, str, a1.c, bzm1, bool);
/*  35 */     fx fx2 = a1.a.a(a1.b, fx1, a2.b, fx.b);
/*  36 */     a2.a(fx2.u(), fx2.v(), fx2.w());
/*     */     
/*  38 */     return a2;
/*     */   }
/*     */   
/*     */   public static class a extends crx {
/*     */     private final String d;
/*     */     private final bzm e;
/*     */     private final boolean f;
/*     */     
/*     */     public a(csw ☃, String str, fx fx1, bzm bzm1, boolean bool) {
/*  47 */       super(clb.Y, 0);
/*     */       
/*  49 */       this.d = str;
/*  50 */       this.c = fx1;
/*  51 */       this.e = bzm1;
/*  52 */       this.f = bool;
/*     */       
/*  54 */       a(☃);
/*     */     }
/*     */     
/*     */     public a(csw ☃, md md1) {
/*  58 */       super(clb.Y, md1);
/*     */       
/*  60 */       this.d = md1.l("Template");
/*  61 */       this.e = bzm.valueOf(md1.l("Rot"));
/*  62 */       this.f = md1.q("OW");
/*     */       
/*  64 */       a(☃);
/*     */     }
/*     */     
/*     */     private void a(csw ☃) {
/*  68 */       ctb ctb = ☃.a(new vk("end_city/" + this.d));
/*  69 */       csx csx = (this.f ? crd.a() : crd.b()).a().a(this.e);
/*     */       
/*  71 */       a(ctb, this.c, csx);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(md ☃) {
/*  76 */       super.a(☃);
/*     */       
/*  78 */       ☃.a("Template", this.d);
/*  79 */       ☃.a("Rot", this.e.name());
/*  80 */       ☃.a("OW", this.f);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {
/*  85 */       if (☃.startsWith("Chest")) {
/*  86 */         fx fx2 = fx1.c();
/*     */         
/*  88 */         if (cra1.b(fx2)) {
/*  89 */           cdd.a(bsk1, random, fx2, cyq.c);
/*     */         }
/*  91 */       } else if (☃.startsWith("Sentry")) {
/*  92 */         bdw bdw = aqe.as.a(bsk1.E());
/*  93 */         bdw.d(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D);
/*  94 */         bdw.h(fx1);
/*  95 */         bsk1.c(bdw);
/*  96 */       } else if (☃.startsWith("Elytra")) {
/*  97 */         bcp bcp = new bcp(bsk1.E(), fx1, this.e.a(gc.d));
/*  98 */         bcp.a(new bmb(bmd.qo), false);
/*  99 */         bsk1.c(bcp);
/*     */       } 
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
/*     */   public static void a(csw ☃, fx fx1, bzm bzm1, List<cru> list, Random random) {
/* 113 */     h.a();
/* 114 */     c.a();
/* 115 */     f.a();
/* 116 */     e.a();
/*     */     
/* 118 */     a a = b(list, new a(☃, "base_floor", fx1, bzm1, true));
/* 119 */     a = b(list, b(☃, a, new fx(-1, 0, -1), "second_floor_1", bzm1, false));
/* 120 */     a = b(list, b(☃, a, new fx(-1, 4, -1), "third_floor_1", bzm1, false));
/* 121 */     a = b(list, b(☃, a, new fx(-1, 8, -1), "third_roof", bzm1, true));
/*     */     
/* 123 */     b(☃, e, 1, a, null, list, random);
/*     */   }
/*     */   
/*     */   private static a b(List<cru> ☃, a a1) {
/* 127 */     ☃.add(a1);
/* 128 */     return a1;
/*     */   }
/*     */   
/*     */   private static boolean b(csw ☃, b b1, int i, a a1, fx fx1, List<cru> list, Random random) {
/* 132 */     if (i > 8) {
/* 133 */       return false;
/*     */     }
/*     */     
/* 136 */     List<cru> list1 = Lists.newArrayList();
/* 137 */     if (b1.a(☃, i, a1, fx1, list1, random)) {
/*     */       
/* 139 */       boolean bool = false;
/* 140 */       int j = random.nextInt();
/* 141 */       for (cru cru1 : list1) {
/* 142 */         cru1.o = j;
/* 143 */         cru cru2 = cru.a(list, cru1.g());
/* 144 */         if (cru2 != null && cru2.o != a1.o) {
/* 145 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 149 */       if (!bool) {
/* 150 */         list.addAll(list1);
/* 151 */         return true;
/*     */       } 
/*     */     } 
/* 154 */     return false;
/*     */   }
/*     */   
/* 157 */   private static final b c = new b()
/*     */     {
/*     */       public void a() {}
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean a(csw ☃, int i, crd.a a1, fx fx1, List<cru> list, Random random) {
/* 164 */         if (i > 8) {
/* 165 */           return false;
/*     */         }
/*     */         
/* 168 */         bzm bzm = a1.b.d();
/* 169 */         crd.a a2 = crd.a(list, crd.a(☃, a1, fx1, "base_floor", bzm, true));
/*     */         
/* 171 */         int j = random.nextInt(3);
/* 172 */         if (j == 0) {
/* 173 */           a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 4, -1), "base_roof", bzm, true));
/* 174 */         } else if (j == 1) {
/* 175 */           a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 0, -1), "second_floor_2", bzm, false));
/* 176 */           a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 8, -1), "second_roof", bzm, false));
/*     */           
/* 178 */           crd.a(☃, crd.c(), i + 1, a2, null, list, random);
/* 179 */         } else if (j == 2) {
/* 180 */           a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 0, -1), "second_floor_2", bzm, false));
/* 181 */           a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 4, -1), "third_floor_2", bzm, false));
/* 182 */           a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 8, -1), "third_roof", bzm, true));
/*     */           
/* 184 */           crd.a(☃, crd.c(), i + 1, a2, null, list, random);
/*     */         } 
/* 186 */         return true;
/*     */       }
/*     */     };
/*     */   
/* 190 */   private static final List<afv<bzm, fx>> d = Lists.newArrayList((Object[])new afv[] { new afv<>(bzm.a, new fx(1, -1, 0)), new afv<>(bzm.b, new fx(6, -1, 1)), new afv<>(bzm.d, new fx(0, -1, 5)), new afv<>(bzm.c, new fx(5, -1, 6)) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 197 */   private static final b e = new b()
/*     */     {
/*     */       public void a() {}
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean a(csw ☃, int i, crd.a a1, fx fx1, List<cru> list, Random random) {
/* 204 */         bzm bzm = a1.b.d();
/* 205 */         crd.a a2 = a1;
/* 206 */         a2 = crd.a(list, crd.a(☃, a2, new fx(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", bzm, true));
/* 207 */         a2 = crd.a(list, crd.a(☃, a2, new fx(0, 7, 0), "tower_piece", bzm, true));
/*     */         
/* 209 */         crd.a a3 = (random.nextInt(3) == 0) ? a2 : null;
/*     */         
/* 211 */         int j = 1 + random.nextInt(3);
/* 212 */         for (int k = 0; k < j; k++) {
/* 213 */           a2 = crd.a(list, crd.a(☃, a2, new fx(0, 4, 0), "tower_piece", bzm, true));
/* 214 */           if (k < j - 1 && random.nextBoolean()) {
/* 215 */             a3 = a2;
/*     */           }
/*     */         } 
/*     */         
/* 219 */         if (a3 != null) {
/* 220 */           for (afv<bzm, fx> afv : (Iterable<afv<bzm, fx>>)crd.d()) {
/* 221 */             if (random.nextBoolean()) {
/*     */               
/* 223 */               crd.a a4 = crd.a(list, crd.a(☃, a3, afv.b(), "bridge_end", bzm.a(afv.a()), true));
/* 224 */               crd.a(☃, crd.e(), i + 1, a4, null, list, random);
/*     */             } 
/*     */           } 
/*     */           
/* 228 */           a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 4, -1), "tower_top", bzm, true));
/*     */         }
/* 230 */         else if (i == 7) {
/* 231 */           a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 4, -1), "tower_top", bzm, true));
/*     */         } else {
/* 233 */           return crd.a(☃, crd.f(), i + 1, a2, null, list, random);
/*     */         } 
/*     */         
/* 236 */         return true;
/*     */       }
/*     */     };
/*     */   
/* 240 */   private static final b f = new b()
/*     */     {
/*     */       public boolean a;
/*     */       
/*     */       public void a() {
/* 245 */         this.a = false;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean a(csw ☃, int i, crd.a a1, fx fx1, List<cru> list, Random random) {
/* 250 */         bzm bzm = a1.b.d();
/* 251 */         int j = random.nextInt(4) + 1;
/*     */         
/* 253 */         crd.a a2 = crd.a(list, crd.a(☃, a1, new fx(0, 0, -4), "bridge_piece", bzm, true));
/* 254 */         a2.o = -1;
/* 255 */         int k = 0;
/* 256 */         for (int m = 0; m < j; m++) {
/* 257 */           if (random.nextBoolean()) {
/* 258 */             a2 = crd.a(list, crd.a(☃, a2, new fx(0, k, -4), "bridge_piece", bzm, true));
/* 259 */             k = 0;
/*     */           } else {
/* 261 */             if (random.nextBoolean()) {
/* 262 */               a2 = crd.a(list, crd.a(☃, a2, new fx(0, k, -4), "bridge_steep_stairs", bzm, true));
/*     */             } else {
/* 264 */               a2 = crd.a(list, crd.a(☃, a2, new fx(0, k, -8), "bridge_gentle_stairs", bzm, true));
/*     */             } 
/* 266 */             k = 4;
/*     */           } 
/*     */         } 
/*     */         
/* 270 */         if (this.a || random.nextInt(10 - i) != 0) {
/* 271 */           if (!crd.a(☃, crd.g(), i + 1, a2, new fx(-3, k + 1, -11), list, random)) {
/* 272 */             return false;
/*     */           }
/*     */         } else {
/*     */           
/* 276 */           crd.a(list, crd.a(☃, a2, new fx(-8 + random.nextInt(8), k, -70 + random.nextInt(10)), "ship", bzm, true));
/* 277 */           this.a = true;
/*     */         } 
/*     */ 
/*     */         
/* 281 */         a2 = crd.a(list, crd.a(☃, a2, new fx(4, k, 0), "bridge_end", bzm.a(bzm.c), true));
/* 282 */         a2.o = -1;
/*     */         
/* 284 */         return true;
/*     */       }
/*     */     };
/*     */   
/* 288 */   private static final List<afv<bzm, fx>> g = Lists.newArrayList((Object[])new afv[] { new afv<>(bzm.a, new fx(4, -1, 0)), new afv<>(bzm.b, new fx(12, -1, 4)), new afv<>(bzm.d, new fx(0, -1, 8)), new afv<>(bzm.c, new fx(8, -1, 12)) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 295 */   private static final b h = new b()
/*     */     {
/*     */       public void a() {}
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public boolean a(csw ☃, int i, crd.a a1, fx fx1, List<cru> list, Random random) {
/* 303 */         bzm bzm = a1.b.d();
/*     */         
/* 305 */         crd.a a2 = crd.a(list, crd.a(☃, a1, new fx(-3, 4, -3), "fat_tower_base", bzm, true));
/* 306 */         a2 = crd.a(list, crd.a(☃, a2, new fx(0, 4, 0), "fat_tower_middle", bzm, true));
/* 307 */         for (int j = 0; j < 2 && 
/* 308 */           random.nextInt(3) != 0; j++) {
/*     */ 
/*     */           
/* 311 */           a2 = crd.a(list, crd.a(☃, a2, new fx(0, 8, 0), "fat_tower_middle", bzm, true));
/*     */           
/* 313 */           for (afv<bzm, fx> afv : (Iterable<afv<bzm, fx>>)crd.h()) {
/* 314 */             if (random.nextBoolean()) {
/*     */               
/* 316 */               crd.a a3 = crd.a(list, crd.a(☃, a2, afv.b(), "bridge_end", bzm.a(afv.a()), true));
/* 317 */               crd.a(☃, crd.e(), i + 1, a3, null, list, random);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 322 */         a2 = crd.a(list, crd.a(☃, a2, new fx(-2, 8, -2), "fat_tower_top", bzm, true));
/* 323 */         return true;
/*     */       }
/*     */     };
/*     */   
/*     */   static interface b {
/*     */     void a();
/*     */     
/*     */     boolean a(csw param1csw, int param1Int, crd.a param1a, fx param1fx, List<cru> param1List, Random param1Random);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */