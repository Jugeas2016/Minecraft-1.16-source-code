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
/*     */ public class cam
/*     */   extends buu
/*     */   implements buq
/*     */ {
/*  24 */   public static final cfg a = cex.ai;
/*     */ 
/*     */   
/*  27 */   protected static final ddh[] b = new ddh[] {
/*  28 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 2.0D, 9.0D), 
/*  29 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 4.0D, 9.0D), 
/*  30 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 6.0D, 9.0D), 
/*  31 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 8.0D, 9.0D), 
/*  32 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 10.0D, 9.0D), 
/*  33 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 12.0D, 9.0D), 
/*  34 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 14.0D, 9.0D), 
/*  35 */       buo.a(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D)
/*     */     };
/*     */   
/*     */   private final can c;
/*     */   
/*     */   protected cam(can ☃, ceg.c c1) {
/*  41 */     super(c1);
/*  42 */     this.c = ☃;
/*  43 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  48 */     return b[((Integer)☃.c(a)).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(ceh ☃, brc brc1, fx fx1) {
/*  53 */     return ☃.a(bup.bX);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  58 */     if (aag1.b(fx1, 0) < 9) {
/*     */       return;
/*     */     }
/*     */     
/*  62 */     float f = bvs.a(this, aag1, fx1);
/*  63 */     if (random.nextInt((int)(25.0F / f) + 1) == 0) {
/*  64 */       int i = ((Integer)☃.c(a)).intValue();
/*  65 */       if (i < 7) {
/*  66 */         ☃ = ☃.a(a, Integer.valueOf(i + 1));
/*  67 */         aag1.a(fx1, ☃, 2);
/*     */       } else {
/*  69 */         gc gc = gc.c.a.a(random);
/*  70 */         fx fx2 = fx1.a(gc);
/*     */         
/*  72 */         ceh ceh1 = aag1.d_(fx2.c());
/*  73 */         if (aag1.d_(fx2).g() && (ceh1.a(bup.bX) || ceh1.a(bup.j) || ceh1.a(bup.k) || ceh1.a(bup.l) || ceh1.a(bup.i))) {
/*  74 */           aag1.a(fx2, this.c.n());
/*  75 */           aag1.a(fx1, this.c.d().n().a(bxm.aq, gc));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected blx c() {
/*  83 */     if (this.c == bup.cK) {
/*  84 */       return bmd.nj;
/*     */     }
/*     */     
/*  87 */     if (this.c == bup.dK) {
/*  88 */       return bmd.nk;
/*     */     }
/*     */     
/*  91 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/*  96 */     blx blx = c();
/*     */     
/*  98 */     return (blx == null) ? bmb.b : new bmb(blx);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 103 */     return (((Integer)ceh1.c(a)).intValue() != 7);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 108 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 113 */     int i = Math.min(7, ((Integer)ceh1.c(a)).intValue() + afm.a(☃.t, 2, 5));
/* 114 */     ceh ceh2 = ceh1.a(a, Integer.valueOf(i));
/* 115 */     ☃.a(fx1, ceh2, 2);
/* 116 */     if (i == 7) {
/* 117 */       ceh2.b(☃, fx1, ☃.t);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 123 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */   
/*     */   public can d() {
/* 127 */     return this.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cam.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */