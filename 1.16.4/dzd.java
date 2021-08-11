/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dzd
/*    */   extends dye
/*    */ {
/*    */   private final aqa a;
/*    */   private int b;
/*    */   private final int B;
/*    */   private final hf C;
/*    */   
/*    */   public dzd(dwt ☃, aqa aqa1, hf hf1) {
/* 15 */     this(☃, aqa1, hf1, 3);
/*    */   }
/*    */   
/*    */   public dzd(dwt ☃, aqa aqa1, hf hf1, int i) {
/* 19 */     this(☃, aqa1, hf1, i, aqa1.cC());
/*    */   }
/*    */   
/*    */   private dzd(dwt ☃, aqa aqa1, hf hf1, int i, dcn dcn1) {
/* 23 */     super(☃, aqa1.cD(), aqa1.e(0.5D), aqa1.cH(), dcn1.b, dcn1.c, dcn1.d);
/* 24 */     this.a = aqa1;
/* 25 */     this.B = i;
/* 26 */     this.C = hf1;
/* 27 */     a();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 32 */     for (int ☃ = 0; ☃ < 16; ☃++) {
/* 33 */       double d1 = (this.r.nextFloat() * 2.0F - 1.0F);
/* 34 */       double d2 = (this.r.nextFloat() * 2.0F - 1.0F);
/* 35 */       double d3 = (this.r.nextFloat() * 2.0F - 1.0F);
/* 36 */       if (d1 * d1 + d2 * d2 + d3 * d3 <= 1.0D) {
/*    */ 
/*    */         
/* 39 */         double d4 = this.a.c(d1 / 4.0D);
/* 40 */         double d5 = this.a.e(0.5D + d2 / 4.0D);
/* 41 */         double d6 = this.a.f(d3 / 4.0D);
/* 42 */         this.c.a(this.C, false, d4, d5, d6, d1, d2 + 0.2D, d3);
/*    */       } 
/* 44 */     }  this.b++;
/* 45 */     if (this.b >= this.B)
/* 46 */       j(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */