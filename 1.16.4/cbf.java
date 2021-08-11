/*     */ import java.util.Random;
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
/*     */ public class cbf
/*     */   extends buo
/*     */ {
/*  36 */   private static final ddh c = buo.a(3.0D, 0.0D, 3.0D, 12.0D, 7.0D, 12.0D);
/*  37 */   private static final ddh d = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 7.0D, 15.0D);
/*     */   
/*  39 */   public static final cfg a = cex.ap;
/*  40 */   public static final cfg b = cex.ao;
/*     */   
/*     */   public cbf(ceg.c ☃) {
/*  43 */     super(☃);
/*  44 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)).a(b, Integer.valueOf(1)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1) {
/*  49 */     a(☃, fx1, aqa1, 100);
/*  50 */     super.a(☃, fx1, aqa1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1, float f) {
/*  55 */     if (!(aqa1 instanceof bej)) {
/*  56 */       a(☃, fx1, aqa1, 3);
/*     */     }
/*     */     
/*  59 */     super.a(☃, fx1, aqa1, f);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, aqa aqa1, int i) {
/*  63 */     if (!a(☃, aqa1)) {
/*     */       return;
/*     */     }
/*     */     
/*  67 */     if (!☃.v && ☃.t.nextInt(i) == 0) {
/*  68 */       ceh ceh = ☃.d_(fx1);
/*  69 */       if (ceh.a(bup.kf)) {
/*  70 */         a(☃, fx1, ceh);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1) {
/*  76 */     ☃.a((bfw)null, fx1, adq.pw, adr.e, 0.7F, 0.9F + ☃.t.nextFloat() * 0.2F);
/*  77 */     int i = ((Integer)ceh1.c(b)).intValue();
/*  78 */     if (i <= 1) {
/*     */       
/*  80 */       ☃.b(fx1, false);
/*     */     } else {
/*     */       
/*  83 */       ☃.a(fx1, ceh1.a(b, Integer.valueOf(i - 1)), 2);
/*  84 */       ☃.c(2001, fx1, buo.i(ceh1));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  90 */     if (a(aag1) && 
/*  91 */       a(aag1, fx1)) {
/*  92 */       int i = ((Integer)☃.c(a)).intValue();
/*  93 */       if (i < 2) {
/*  94 */         aag1.a((bfw)null, fx1, adq.px, adr.e, 0.7F, 0.9F + random.nextFloat() * 0.2F);
/*  95 */         aag1.a(fx1, ☃.a(a, Integer.valueOf(i + 1)), 2);
/*     */       } else {
/*     */         
/*  98 */         aag1.a((bfw)null, fx1, adq.py, adr.e, 0.7F, 0.9F + random.nextFloat() * 0.2F);
/*  99 */         aag1.a(fx1, false);
/*     */         
/* 101 */         for (int j = 0; j < ((Integer)☃.c(b)).intValue(); j++) {
/* 102 */           aag1.c(2001, fx1, buo.i(☃));
/* 103 */           bax bax = aqe.aN.a(aag1);
/* 104 */           bax.c_(-24000);
/* 105 */           bax.g(fx1);
/* 106 */           bax.b(fx1.u() + 0.3D + j * 0.2D, fx1.v(), fx1.w() + 0.3D, 0.0F, 0.0F);
/* 107 */           aag1.c(bax);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(brc ☃, fx fx1) {
/* 115 */     return b(☃, fx1.c());
/*     */   }
/*     */   
/*     */   public static boolean b(brc ☃, fx fx1) {
/* 119 */     return ☃.d_(fx1).a(aed.C);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 124 */     if (a(brx1, fx1) && !brx1.v) {
/* 125 */       brx1.c(2005, fx1, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(brx ☃) {
/* 130 */     float f = ☃.f(1.0F);
/*     */     
/* 132 */     if (f < 0.69D && f > 0.65D) {
/* 133 */       return true;
/*     */     }
/* 135 */     return (☃.t.nextInt(500) == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, bfw bfw1, fx fx1, ceh ceh1, @Nullable ccj ccj1, bmb bmb1) {
/* 140 */     super.a(☃, bfw1, fx1, ceh1, ccj1, bmb1);
/*     */     
/* 142 */     a(☃, fx1, ceh1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, bny bny1) {
/* 147 */     if (bny1.m().b() == h() && ((Integer)☃.c(b)).intValue() < 4) {
/* 148 */       return true;
/*     */     }
/* 150 */     return super.a(☃, bny1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 156 */     ceh ceh = ☃.p().d_(☃.a());
/* 157 */     if (ceh.a(this)) {
/* 158 */       return ceh.a(b, Integer.valueOf(Math.min(4, ((Integer)ceh.c(b)).intValue() + 1)));
/*     */     }
/*     */     
/* 161 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 166 */     if (((Integer)☃.c(b)).intValue() > 1) {
/* 167 */       return d;
/*     */     }
/*     */     
/* 170 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 175 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */   
/*     */   private boolean a(brx ☃, aqa aqa1) {
/* 179 */     if (aqa1 instanceof bax || aqa1 instanceof azu) {
/* 180 */       return false;
/*     */     }
/*     */     
/* 183 */     if (aqa1 instanceof aqm) {
/* 184 */       return (aqa1 instanceof bfw || ☃.V().b(brt.b));
/*     */     }
/*     */     
/* 187 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */