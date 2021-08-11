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
/*     */ public class bwp
/*     */   extends buo
/*     */ {
/*  28 */   public static final cfg a = cex.aw;
/*  29 */   protected static final ddh b = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
/*     */ 
/*     */ 
/*     */   
/*     */   protected bwp(ceg.c ☃) {
/*  34 */     super(☃);
/*  35 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  40 */     if (gc1 == gc.b && !☃.a(bry1, fx1)) {
/*  41 */       bry1.J().a(fx1, this, 1);
/*     */     }
/*  43 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  48 */     ceh ceh1 = brz1.d_(fx1.b());
/*  49 */     return (!ceh1.c().b() || ceh1.b() instanceof bwr || ceh1.b() instanceof cdz);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  54 */     if (!n().a(☃.p(), ☃.a())) {
/*  55 */       return bup.j.n();
/*     */     }
/*  57 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/*  62 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  67 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  72 */     if (!☃.a(aag1, fx1)) {
/*  73 */       d(☃, aag1, fx1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  79 */     int i = ((Integer)☃.c(a)).intValue();
/*  80 */     if (a(aag1, fx1) || aag1.t(fx1.b())) {
/*  81 */       if (i < 7) {
/*  82 */         aag1.a(fx1, ☃.a(a, Integer.valueOf(7)), 2);
/*     */       }
/*  84 */     } else if (i > 0) {
/*  85 */       aag1.a(fx1, ☃.a(a, Integer.valueOf(i - 1)), 2);
/*  86 */     } else if (!a(aag1, fx1)) {
/*  87 */       d(☃, aag1, fx1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1, float f) {
/*  93 */     if (!☃.v && ☃.t.nextFloat() < f - 0.5F && aqa1 instanceof aqm && (
/*  94 */       aqa1 instanceof bfw || ☃.V().b(brt.b)))
/*     */     {
/*  96 */       if (aqa1.cy() * aqa1.cy() * aqa1.cz() > 0.512F) {
/*  97 */         d(☃.d_(fx1), ☃, fx1);
/*     */       }
/*     */     }
/*     */     
/* 101 */     super.a(☃, fx1, aqa1, f);
/*     */   }
/*     */   
/*     */   public static void d(ceh ☃, brx brx1, fx fx1) {
/* 105 */     brx1.a(fx1, a(☃, bup.j.n(), brx1, fx1));
/*     */   }
/*     */   
/*     */   private static boolean a(brc ☃, fx fx1) {
/* 109 */     buo buo1 = ☃.d_(fx1.b()).b();
/* 110 */     return (buo1 instanceof bvs || buo1 instanceof cam || buo1 instanceof btt);
/*     */   }
/*     */   
/*     */   private static boolean a(brz ☃, fx fx1) {
/* 114 */     for (fx fx2 : fx.a(fx1.b(-4, 0, -4), fx1.b(4, 1, 4))) {
/* 115 */       if (☃.b(fx2).a(aef.b)) {
/* 116 */         return true;
/*     */       }
/*     */     } 
/* 119 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 124 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 129 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */