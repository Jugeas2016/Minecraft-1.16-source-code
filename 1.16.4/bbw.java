/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bbw
/*    */   extends bbt
/*    */ {
/*    */   private dcn b;
/*    */   private int c;
/*    */   
/*    */   public bbw(bbr ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 22 */     if (this.c++ % 10 == 0) {
/* 23 */       float ☃ = (this.a.cY().nextFloat() - 0.5F) * 8.0F;
/* 24 */       float f1 = (this.a.cY().nextFloat() - 0.5F) * 4.0F;
/* 25 */       float f2 = (this.a.cY().nextFloat() - 0.5F) * 8.0F;
/* 26 */       this.a.l.a(hh.v, this.a.cD() + ☃, this.a.cE() + 2.0D + f1, this.a.cH() + f2, 0.0D, 0.0D, 0.0D);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 32 */     this.c++;
/*    */     
/* 34 */     if (this.b == null) {
/* 35 */       fx fx = this.a.l.a(chn.a.e, cjk.a);
/* 36 */       this.b = dcn.c(fx);
/*    */     } 
/*    */     
/* 39 */     double ☃ = this.b.c(this.a.cD(), this.a.cE(), this.a.cH());
/* 40 */     if (☃ < 100.0D || ☃ > 22500.0D || this.a.u || this.a.v) {
/* 41 */       this.a.c(0.0F);
/*    */     } else {
/* 43 */       this.a.c(1.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 49 */     this.b = null;
/* 50 */     this.c = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public float f() {
/* 55 */     return 3.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public dcn g() {
/* 61 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public bch<bbw> i() {
/* 66 */     return bch.j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */