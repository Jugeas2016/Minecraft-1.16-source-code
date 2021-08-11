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
/*     */ public class bvh
/*     */   extends bxm
/*     */   implements buq
/*     */ {
/*  25 */   public static final cfg a = cex.af;
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
/*  37 */   protected static final ddh[] b = new ddh[] {
/*  38 */       buo.a(11.0D, 7.0D, 6.0D, 15.0D, 12.0D, 10.0D), 
/*  39 */       buo.a(9.0D, 5.0D, 5.0D, 15.0D, 12.0D, 11.0D), 
/*  40 */       buo.a(7.0D, 3.0D, 4.0D, 15.0D, 12.0D, 12.0D)
/*     */     };
/*     */   
/*  43 */   protected static final ddh[] c = new ddh[] {
/*  44 */       buo.a(1.0D, 7.0D, 6.0D, 5.0D, 12.0D, 10.0D), 
/*  45 */       buo.a(1.0D, 5.0D, 5.0D, 7.0D, 12.0D, 11.0D), 
/*  46 */       buo.a(1.0D, 3.0D, 4.0D, 9.0D, 12.0D, 12.0D)
/*     */     };
/*     */   
/*  49 */   protected static final ddh[] d = new ddh[] {
/*  50 */       buo.a(6.0D, 7.0D, 1.0D, 10.0D, 12.0D, 5.0D), 
/*  51 */       buo.a(5.0D, 5.0D, 1.0D, 11.0D, 12.0D, 7.0D), 
/*  52 */       buo.a(4.0D, 3.0D, 1.0D, 12.0D, 12.0D, 9.0D)
/*     */     };
/*     */   
/*  55 */   protected static final ddh[] e = new ddh[] {
/*  56 */       buo.a(6.0D, 7.0D, 11.0D, 10.0D, 12.0D, 15.0D), 
/*  57 */       buo.a(5.0D, 5.0D, 9.0D, 11.0D, 12.0D, 15.0D), 
/*  58 */       buo.a(4.0D, 3.0D, 7.0D, 12.0D, 12.0D, 15.0D)
/*     */     };
/*     */   
/*     */   public bvh(ceg.c ☃) {
/*  62 */     super(☃);
/*  63 */     j(((ceh)this.n.b()).a(aq, gc.c).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/*  68 */     return (((Integer)☃.c(a)).intValue() < 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  73 */     if (aag1.t.nextInt(5) == 0) {
/*  74 */       int i = ((Integer)☃.c(a)).intValue();
/*  75 */       if (i < 2) {
/*  76 */         aag1.a(fx1, ☃.a(a, Integer.valueOf(i + 1)), 2);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  83 */     buo buo = brz1.d_(fx1.a((gc)☃.c(aq))).b();
/*  84 */     return buo.a(aed.x);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  89 */     int i = ((Integer)☃.c(a)).intValue();
/*  90 */     switch (null.a[((gc)☃.c(aq)).ordinal()])
/*     */     { case 1:
/*  92 */         return e[i];
/*     */       
/*     */       default:
/*  95 */         return d[i];
/*     */       case 3:
/*  97 */         return c[i];
/*     */       case 4:
/*  99 */         break; }  return b[i];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/* 106 */     ceh ceh = n();
/*     */     
/* 108 */     brz brz = ☃.p();
/* 109 */     fx fx = ☃.a();
/*     */     
/* 111 */     for (gc gc : ☃.e()) {
/* 112 */       if (gc.n().d()) {
/* 113 */         ceh = ceh.a(aq, gc);
/* 114 */         if (ceh.a(brz, fx)) {
/* 115 */           return ceh;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 120 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 125 */     if (gc1 == ☃.c(aq) && !☃.a(bry1, fx1)) {
/* 126 */       return bup.a.n();
/*     */     }
/*     */     
/* 129 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 134 */     return (((Integer)ceh1.c(a)).intValue() < 2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 139 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 144 */     ☃.a(fx1, ceh1.a(a, Integer.valueOf(((Integer)ceh1.c(a)).intValue() + 1)), 2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 149 */     ☃.a((cfj<?>[])new cfj[] { aq, a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 154 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */