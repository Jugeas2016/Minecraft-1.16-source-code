/*     */ import java.util.Optional;
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
/*     */ public abstract class bue
/*     */   extends buo
/*     */ {
/*     */   private final float b;
/*  28 */   protected static final ddh a = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
/*     */   
/*     */   public bue(ceg.c ☃, float f) {
/*  31 */     super(☃);
/*  32 */     this.b = f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  37 */     return a(☃.p(), ☃.a());
/*     */   }
/*     */   
/*     */   public static ceh a(brc ☃, fx fx1) {
/*  41 */     fx fx2 = fx1.c();
/*  42 */     ceh ceh = ☃.d_(fx2);
/*     */     
/*  44 */     if (cac.c(ceh.b())) {
/*  45 */       return bup.bO.n();
/*     */     }
/*     */     
/*  48 */     return ((bws)bup.bN).b(☃, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  53 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  58 */     if (random.nextInt(24) == 0) {
/*  59 */       brx1.a(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, adq.ei, adr.e, 1.0F + random.nextFloat(), random.nextFloat() * 0.7F + 0.3F, false);
/*     */     }
/*     */     
/*  62 */     fx fx2 = fx1.c();
/*  63 */     ceh ceh1 = brx1.d_(fx2);
/*  64 */     if (e(ceh1) || ceh1.d(brx1, fx2, gc.b)) {
/*  65 */       for (int i = 0; i < 3; i++) {
/*  66 */         double d1 = fx1.u() + random.nextDouble();
/*  67 */         double d2 = fx1.v() + random.nextDouble() * 0.5D + 0.5D;
/*  68 */         double d3 = fx1.w() + random.nextDouble();
/*  69 */         brx1.a(hh.L, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } else {
/*  72 */       if (e(brx1.d_(fx1.f()))) {
/*  73 */         for (int i = 0; i < 2; i++) {
/*  74 */           double d1 = fx1.u() + random.nextDouble() * 0.10000000149011612D;
/*  75 */           double d2 = fx1.v() + random.nextDouble();
/*  76 */           double d3 = fx1.w() + random.nextDouble();
/*  77 */           brx1.a(hh.L, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/*  80 */       if (e(brx1.d_(fx1.g()))) {
/*  81 */         for (int i = 0; i < 2; i++) {
/*  82 */           double d1 = (fx1.u() + 1) - random.nextDouble() * 0.10000000149011612D;
/*  83 */           double d2 = fx1.v() + random.nextDouble();
/*  84 */           double d3 = fx1.w() + random.nextDouble();
/*  85 */           brx1.a(hh.L, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/*  88 */       if (e(brx1.d_(fx1.d()))) {
/*  89 */         for (int i = 0; i < 2; i++) {
/*  90 */           double d1 = fx1.u() + random.nextDouble();
/*  91 */           double d2 = fx1.v() + random.nextDouble();
/*  92 */           double d3 = fx1.w() + random.nextDouble() * 0.10000000149011612D;
/*  93 */           brx1.a(hh.L, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/*  96 */       if (e(brx1.d_(fx1.e()))) {
/*  97 */         for (int i = 0; i < 2; i++) {
/*  98 */           double d1 = fx1.u() + random.nextDouble();
/*  99 */           double d2 = fx1.v() + random.nextDouble();
/* 100 */           double d3 = (fx1.w() + 1) - random.nextDouble() * 0.10000000149011612D;
/* 101 */           brx1.a(hh.L, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/* 104 */       if (e(brx1.d_(fx1.b()))) {
/* 105 */         for (int i = 0; i < 2; i++) {
/* 106 */           double d1 = fx1.u() + random.nextDouble();
/* 107 */           double d2 = (fx1.v() + 1) - random.nextDouble() * 0.10000000149011612D;
/* 108 */           double d3 = fx1.w() + random.nextDouble();
/* 109 */           brx1.a(hh.L, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract boolean e(ceh paramceh);
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/* 119 */     if (!aqa1.aD()) {
/* 120 */       aqa1.g(aqa1.al() + 1);
/* 121 */       if (aqa1.al() == 0) {
/* 122 */         aqa1.f(8);
/*     */       }
/*     */       
/* 125 */       aqa1.a(apk.a, this.b);
/*     */     } 
/*     */     
/* 128 */     super.a(☃, brx1, fx1, aqa1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 133 */     if (ceh1.a(☃.b())) {
/*     */       return;
/*     */     }
/* 136 */     if (a(brx1)) {
/* 137 */       Optional<cxn> optional = cxn.a(brx1, fx1, gc.a.a);
/*     */       
/* 139 */       if (optional.isPresent()) {
/* 140 */         ((cxn)optional.get()).b();
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/* 146 */     if (!☃.a(brx1, fx1)) {
/* 147 */       brx1.a(fx1, false);
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean a(brx ☃) {
/* 152 */     return (☃.Y() == brx.g || ☃.Y() == brx.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/* 157 */     if (!☃.s_()) {
/* 158 */       ☃.a((bfw)null, 1009, fx1, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean a(brx ☃, fx fx1, gc gc1) {
/* 163 */     ceh ceh = ☃.d_(fx1);
/*     */     
/* 165 */     if (!ceh.g()) {
/* 166 */       return false;
/*     */     }
/*     */     
/* 169 */     return (a(☃, fx1).a(☃, fx1) || b(☃, fx1, gc1));
/*     */   }
/*     */   
/*     */   private static boolean b(brx ☃, fx fx1, gc gc1) {
/* 173 */     if (!a(☃)) {
/* 174 */       return false;
/*     */     }
/* 176 */     fx.a a = fx1.i();
/* 177 */     boolean bool = false;
/* 178 */     for (gc gc2 : gc.values()) {
/* 179 */       if (☃.d_(a.g(fx1).c(gc2)).a(bup.bK)) {
/* 180 */         bool = true;
/*     */         break;
/*     */       } 
/*     */     } 
/* 184 */     return (bool && cxn.a(☃, fx1, gc1.h().n()).isPresent());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */