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
/*    */ public class bgu
/*    */   extends bgs
/*    */ {
/*    */   public bgu(aqe<? extends bgu> ☃, brx brx1) {
/* 18 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public bgu(brx ☃, aqm aqm1) {
/* 22 */     super((aqe)aqe.aG, aqm1, ☃);
/*    */   }
/*    */   
/*    */   public bgu(brx ☃, double d1, double d2, double d3) {
/* 26 */     super((aqe)aqe.aG, d1, d2, d3, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(byte ☃) {
/* 31 */     if (☃ == 3) {
/* 32 */       double d = 0.08D;
/* 33 */       for (int i = 0; i < 8; i++) {
/* 34 */         this.l.a(new he(hh.I, g()), cD(), cE(), cH(), (this.J.nextFloat() - 0.5D) * 0.08D, (this.J.nextFloat() - 0.5D) * 0.08D, (this.J.nextFloat() - 0.5D) * 0.08D);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dck ☃) {
/* 41 */     super.a(☃);
/* 42 */     ☃.a().a(apk.b(this, v()), 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dcl ☃) {
/* 47 */     super.a(☃);
/*    */     
/* 49 */     if (!this.l.v) {
/* 50 */       if (this.J.nextInt(8) == 0) {
/* 51 */         int i = 1;
/* 52 */         if (this.J.nextInt(32) == 0) {
/* 53 */           i = 4;
/*    */         }
/* 55 */         for (int j = 0; j < i; j++) {
/* 56 */           bac bac = aqe.j.a(this.l);
/* 57 */           bac.c_(-24000);
/*    */           
/* 59 */           bac.b(cD(), cE(), cH(), this.p, 0.0F);
/* 60 */           this.l.c(bac);
/*    */         } 
/*    */       } 
/*    */       
/* 64 */       this.l.a(this, (byte)3);
/* 65 */       ad();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected blx h() {
/* 71 */     return bmd.mg;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */