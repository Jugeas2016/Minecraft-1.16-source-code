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
/*     */ public class byj
/*     */   extends buo
/*     */ {
/*  28 */   public static final cfe<gc.a> a = cex.E;
/*     */ 
/*     */   
/*  31 */   protected static final ddh b = buo.a(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
/*  32 */   protected static final ddh c = buo.a(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D);
/*     */   
/*     */   public byj(ceg.c ☃) {
/*  35 */     super(☃);
/*  36 */     j(((ceh)this.n.b()).a(a, gc.a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  41 */     switch (null.a[((gc.a)☃.c(a)).ordinal()]) {
/*     */       case 1:
/*  43 */         return c;
/*     */     } 
/*     */     
/*  46 */     return b;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  52 */     if (aag1.k().e() && aag1.V().b(brt.d) && random.nextInt(2000) < aag1.ad().a()) {
/*     */       
/*  54 */       while (aag1.d_(fx1).a(this)) {
/*  55 */         fx1 = fx1.c();
/*     */       }
/*  57 */       if (aag1.d_(fx1).a(aag1, fx1, aqe.bb)) {
/*  58 */         aqa aqa = aqe.bb.a(aag1, null, null, null, fx1.b(), aqp.d, false, false);
/*  59 */         if (aqa != null) {
/*  60 */           aqa.ah();
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  68 */     gc.a a1 = gc1.n();
/*  69 */     gc.a a2 = (gc.a)☃.c(a);
/*     */     
/*  71 */     boolean bool = (a2 != a1 && a1.d());
/*  72 */     if (bool || ceh1.a(this) || (new cxn(bry1, fx1, a2)).c()) {
/*  73 */       return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */     }
/*     */     
/*  76 */     return bup.a.n();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/*  81 */     if (!aqa1.br() && !aqa1.bs() && aqa1.bO()) {
/*  82 */       aqa1.d(fx1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  88 */     if (random.nextInt(100) == 0) {
/*  89 */       brx1.a(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, adq.lN, adr.e, 0.5F, random.nextFloat() * 0.4F + 0.8F, false);
/*     */     }
/*     */     
/*  92 */     for (int i = 0; i < 4; i++) {
/*  93 */       double d1 = fx1.u() + random.nextDouble();
/*  94 */       double d2 = fx1.v() + random.nextDouble();
/*  95 */       double d3 = fx1.w() + random.nextDouble();
/*  96 */       double d4 = (random.nextFloat() - 0.5D) * 0.5D;
/*  97 */       double d5 = (random.nextFloat() - 0.5D) * 0.5D;
/*  98 */       double d6 = (random.nextFloat() - 0.5D) * 0.5D;
/*     */       
/* 100 */       int j = random.nextInt(2) * 2 - 1;
/* 101 */       if (brx1.d_(fx1.f()).a(this) || brx1.d_(fx1.g()).a(this)) {
/* 102 */         d3 = fx1.w() + 0.5D + 0.25D * j;
/* 103 */         d6 = (random.nextFloat() * 2.0F * j);
/*     */       } else {
/* 105 */         d1 = fx1.u() + 0.5D + 0.25D * j;
/* 106 */         d4 = (random.nextFloat() * 2.0F * j);
/*     */       } 
/*     */       
/* 109 */       brx1.a(hh.Q, d1, d2, d3, d4, d5, d6);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 115 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 120 */     switch (null.b[bzm1.ordinal()]) {
/*     */       case 1:
/*     */       case 2:
/* 123 */         switch (null.a[((gc.a)☃.c(a)).ordinal()]) {
/*     */           case 2:
/* 125 */             return ☃.a(a, gc.a.c);
/*     */           case 1:
/* 127 */             return ☃.a(a, gc.a.a);
/*     */         } 
/* 129 */         return ☃;
/*     */     } 
/*     */     
/* 132 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 138 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */