/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bzt
/*    */   extends bud
/*    */   implements bzu
/*    */ {
/* 26 */   public static final cey a = cex.C;
/*    */   
/* 28 */   protected static final ddh b = buo.a(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
/*    */   private final cfq c;
/*    */   
/*    */   protected bzt(ceg.c ☃, cfq cfq1) {
/* 32 */     super(☃);
/* 33 */     this.c = cfq1;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 38 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 39 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*    */     }
/*    */     
/* 42 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 47 */     return b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean ai_() {
/* 52 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ccj a(brc ☃) {
/* 57 */     return new cdf();
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 62 */     bmb bmb = bfw1.b(aot1);
/* 63 */     boolean bool = (bmb.b() instanceof bky && bfw1.bC.e);
/*    */     
/* 65 */     if (brx1.v) {
/* 66 */       return bool ? aou.a : aou.b;
/*    */     }
/*    */     
/* 69 */     ccj ccj = brx1.c(fx1);
/* 70 */     if (ccj instanceof cdf) {
/* 71 */       cdf cdf = (cdf)ccj;
/* 72 */       if (bool) {
/* 73 */         boolean bool1 = cdf.a(((bky)bmb.b()).d());
/* 74 */         if (bool1 && !bfw1.b_()) {
/* 75 */           bmb.g(1);
/*    */         }
/*    */       } 
/*    */       
/* 79 */       return cdf.b(bfw1) ? aou.a : aou.c;
/*    */     } 
/*    */     
/* 82 */     return aou.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public cux d(ceh ☃) {
/* 87 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 88 */       return cuy.c.a(false);
/*    */     }
/* 90 */     return super.d(☃);
/*    */   }
/*    */   
/*    */   public cfq c() {
/* 94 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */