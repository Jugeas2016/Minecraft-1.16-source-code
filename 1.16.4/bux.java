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
/*     */ public class bux
/*     */   extends buo
/*     */ {
/*  26 */   public static final cfg a = cex.al;
/*     */ 
/*     */ 
/*     */   
/*  30 */   protected static final ddh[] b = new ddh[] {
/*  31 */       buo.a(1.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  32 */       buo.a(3.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  33 */       buo.a(5.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  34 */       buo.a(7.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  35 */       buo.a(9.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  36 */       buo.a(11.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D), 
/*  37 */       buo.a(13.0D, 0.0D, 1.0D, 15.0D, 8.0D, 15.0D)
/*     */     };
/*     */   
/*     */   protected bux(ceg.c ☃) {
/*  41 */     super(☃);
/*  42 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  47 */     return b[((Integer)☃.c(a)).intValue()];
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  52 */     if (brx1.v) {
/*  53 */       bmb bmb = bfw1.b(aot1);
/*  54 */       if (a(brx1, fx1, ☃, bfw1).a())
/*  55 */         return aou.a; 
/*  56 */       if (bmb.a()) {
/*  57 */         return aou.b;
/*     */       }
/*     */     } 
/*     */     
/*  61 */     return a(brx1, fx1, ☃, bfw1);
/*     */   }
/*     */   
/*     */   private aou a(bry ☃, fx fx1, ceh ceh1, bfw bfw1) {
/*  65 */     if (!bfw1.q(false)) {
/*  66 */       return aou.c;
/*     */     }
/*  68 */     bfw1.a(aea.T);
/*     */     
/*  70 */     bfw1.eI().a(2, 0.1F);
/*  71 */     int i = ((Integer)ceh1.c(a)).intValue();
/*  72 */     if (i < 6) {
/*  73 */       ☃.a(fx1, ceh1.a(a, Integer.valueOf(i + 1)), 3);
/*     */     } else {
/*  75 */       ☃.a(fx1, false);
/*     */     } 
/*     */     
/*  78 */     return aou.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  83 */     if (gc1 == gc.a && !☃.a(bry1, fx1)) {
/*  84 */       return bup.a.n();
/*     */     }
/*     */     
/*  87 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  92 */     return brz1.d_(fx1.c()).c().b();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/*  97 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 102 */     return (7 - ((Integer)☃.c(a)).intValue()) * 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 112 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bux.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */