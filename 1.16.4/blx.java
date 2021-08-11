/*     */ import com.google.common.collect.ImmutableMultimap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Multimap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class blx
/*     */   implements brw
/*     */ {
/*  46 */   public static final Map<buo, blx> e = Maps.newHashMap();
/*     */   
/*  48 */   protected static final UUID f = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
/*  49 */   protected static final UUID g = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
/*     */   
/*  51 */   protected static final Random h = new Random(); protected final bks i; private final bmp a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   
/*     */   public static int a(blx ☃) {
/*  56 */     return (☃ == null) ? 0 : gm.T.a(☃);
/*     */   } private final boolean d; private final blx j; @Nullable
/*     */   private String k; @Nullable
/*     */   private final bhz l; public static blx b(int ☃) {
/*  60 */     return gm.T.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static blx a(buo ☃) {
/*  66 */     return e.getOrDefault(☃, bmd.a);
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
/*     */   public blx(a ☃) {
/*  85 */     this.i = a.a(☃);
/*  86 */     this.a = a.b(☃);
/*  87 */     this.j = a.c(☃);
/*  88 */     this.c = a.d(☃);
/*  89 */     this.b = a.e(☃);
/*  90 */     this.l = a.f(☃);
/*  91 */     this.d = a.g(☃);
/*     */   }
/*     */   
/*     */   public static class a {
/*  95 */     private int a = 64;
/*     */     private int b;
/*     */     private blx c;
/*     */     private bks d;
/*  99 */     private bmp e = bmp.a;
/*     */     private bhz f;
/*     */     private boolean g;
/*     */     
/*     */     public a a(bhz ☃) {
/* 104 */       this.f = ☃;
/* 105 */       return this;
/*     */     }
/*     */     
/*     */     public a a(int ☃) {
/* 109 */       if (this.b > 0) {
/* 110 */         throw new RuntimeException("Unable to have damage AND stack.");
/*     */       }
/* 112 */       this.a = ☃;
/* 113 */       return this;
/*     */     }
/*     */     
/*     */     public a b(int ☃) {
/* 117 */       return (this.b == 0) ? c(☃) : this;
/*     */     }
/*     */     
/*     */     public a c(int ☃) {
/* 121 */       this.b = ☃;
/* 122 */       this.a = 1;
/* 123 */       return this;
/*     */     }
/*     */     
/*     */     public a a(blx ☃) {
/* 127 */       this.c = ☃;
/* 128 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bks ☃) {
/* 132 */       this.d = ☃;
/* 133 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bmp ☃) {
/* 137 */       this.e = ☃;
/* 138 */       return this;
/*     */     }
/*     */     
/*     */     public a a() {
/* 142 */       this.g = true;
/* 143 */       return this;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, aqm aqm1, bmb bmb1, int i) {}
/*     */   
/*     */   public boolean b(md ☃) {
/* 151 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {
/* 155 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public blx h() {
/* 160 */     return this;
/*     */   }
/*     */   
/*     */   public aou a(boa ☃) {
/* 164 */     return aou.c;
/*     */   }
/*     */   
/*     */   public float a(bmb ☃, ceh ceh1) {
/* 168 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 172 */     if (s()) {
/* 173 */       bmb bmb = bfw1.b(aot1);
/* 174 */       if (bfw1.q(t().d())) {
/* 175 */         bfw1.c(aot1);
/* 176 */         return aov.b(bmb);
/*     */       } 
/* 178 */       return aov.d(bmb);
/*     */     } 
/* 180 */     return aov.c(bfw1.b(aot1));
/*     */   }
/*     */   
/*     */   public bmb a(bmb ☃, brx brx1, aqm aqm1) {
/* 184 */     if (s()) {
/* 185 */       return aqm1.a(brx1, ☃);
/*     */     }
/* 187 */     return ☃;
/*     */   }
/*     */   
/*     */   public final int i() {
/* 191 */     return this.b;
/*     */   }
/*     */   
/*     */   public final int j() {
/* 195 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 199 */     return (this.c > 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, aqm aqm1, aqm aqm2) {
/* 206 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, brx brx1, ceh ceh1, fx fx1, aqm aqm1) {
/* 213 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(ceh ☃) {
/* 217 */     return false;
/*     */   }
/*     */   
/*     */   public aou a(bmb ☃, bfw bfw1, aqm aqm1, aot aot1) {
/* 221 */     return aou.c;
/*     */   }
/*     */   
/*     */   public nr l() {
/* 225 */     return new of(a());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 231 */     return gm.T.b(this).a();
/*     */   }
/*     */   
/*     */   protected String m() {
/* 235 */     if (this.k == null) {
/* 236 */       this.k = x.a("item", gm.T.b(this));
/*     */     }
/* 238 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 245 */     return m();
/*     */   }
/*     */   
/*     */   public String f(bmb ☃) {
/* 249 */     return a();
/*     */   }
/*     */   
/*     */   public boolean n() {
/* 253 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final blx o() {
/* 259 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean p() {
/* 263 */     return (this.j != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, brx brx1, aqa aqa1, int i, boolean bool) {}
/*     */ 
/*     */   
/*     */   public void b(bmb ☃, brx brx1, bfw bfw1) {}
/*     */   
/*     */   public boolean ac_() {
/* 273 */     return false;
/*     */   }
/*     */   
/*     */   public bnn d_(bmb ☃) {
/* 277 */     return ☃.b().s() ? bnn.b : bnn.a;
/*     */   }
/*     */   
/*     */   public int e_(bmb ☃) {
/* 281 */     if (☃.b().s()) {
/* 282 */       return t().e() ? 16 : 32;
/*     */     }
/* 284 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, brx brx1, aqm aqm1, int i) {}
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brx brx1, List<nr> list, bnl bnl1) {}
/*     */   
/*     */   public nr h(bmb ☃) {
/* 294 */     return new of(f(☃));
/*     */   }
/*     */   
/*     */   public boolean e(bmb ☃) {
/* 298 */     return ☃.x();
/*     */   }
/*     */   
/*     */   public bmp i(bmb ☃) {
/* 302 */     if (!☃.x()) {
/* 303 */       return this.a;
/*     */     }
/*     */     
/* 306 */     switch (null.a[this.a.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 309 */         return bmp.c;
/*     */       
/*     */       case 3:
/* 312 */         return bmp.d;
/*     */     } 
/*     */ 
/*     */     
/* 316 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f_(bmb ☃) {
/* 321 */     return (i() == 1 && k());
/*     */   }
/*     */   
/*     */   protected static dcj a(brx ☃, bfw bfw1, brf.b b1) {
/* 325 */     float f1 = bfw1.q;
/* 326 */     float f2 = bfw1.p;
/* 327 */     dcn dcn1 = bfw1.j(1.0F);
/*     */ 
/*     */     
/* 330 */     float f3 = afm.b(-f2 * 0.017453292F - 3.1415927F);
/* 331 */     float f4 = afm.a(-f2 * 0.017453292F - 3.1415927F);
/* 332 */     float f5 = -afm.b(-f1 * 0.017453292F);
/* 333 */     float f6 = afm.a(-f1 * 0.017453292F);
/*     */     
/* 335 */     float f7 = f4 * f5;
/* 336 */     float f8 = f6;
/* 337 */     float f9 = f3 * f5;
/*     */     
/* 339 */     double d = 5.0D;
/* 340 */     dcn dcn2 = dcn1.b(f7 * 5.0D, f8 * 5.0D, f9 * 5.0D);
/*     */     
/* 342 */     return ☃.a(new brf(dcn1, dcn2, brf.a.b, b1, bfw1));
/*     */   }
/*     */   
/*     */   public int c() {
/* 346 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(bks ☃, gj<bmb> gj1) {
/* 350 */     if (a(☃)) {
/* 351 */       gj1.add(new bmb(this));
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean a(bks ☃) {
/* 356 */     bks bks1 = q();
/* 357 */     return (bks1 != null && (☃ == bks.g || ☃ == bks1));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final bks q() {
/* 362 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean a(bmb ☃, bmb bmb1) {
/* 366 */     return false;
/*     */   }
/*     */   
/*     */   public Multimap<arg, arj> a(aqf ☃) {
/* 370 */     return (Multimap<arg, arj>)ImmutableMultimap.of();
/*     */   }
/*     */   
/*     */   public boolean j(bmb ☃) {
/* 374 */     return (☃.b() == bmd.qQ);
/*     */   }
/*     */   
/*     */   public bmb r() {
/* 378 */     return new bmb(this);
/*     */   }
/*     */   
/*     */   public boolean a(ael<blx> ☃) {
/* 382 */     return ☃.a(this);
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 386 */     return (this.l != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bhz t() {
/* 391 */     return this.l;
/*     */   }
/*     */   
/*     */   public adp ae_() {
/* 395 */     return adq.eJ;
/*     */   }
/*     */   
/*     */   public adp ad_() {
/* 399 */     return adq.eK;
/*     */   }
/*     */   
/*     */   public boolean u() {
/* 403 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean a(apk ☃) {
/* 407 */     return (!this.d || !☃.p());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\blx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */