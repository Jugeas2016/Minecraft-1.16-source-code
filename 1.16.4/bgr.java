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
/*    */ public class bgr
/*    */   extends bga
/*    */ {
/* 15 */   private int f = 200;
/*    */   
/*    */   public bgr(aqe<? extends bgr> ☃, brx brx1) {
/* 18 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public bgr(brx ☃, aqm aqm1) {
/* 22 */     super((aqe)aqe.aB, aqm1, ☃);
/*    */   }
/*    */   
/*    */   public bgr(brx ☃, double d1, double d2, double d3) {
/* 26 */     super((aqe)aqe.aB, d1, d2, d3, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void j() {
/* 31 */     super.j();
/*    */     
/* 33 */     if (this.l.v && !this.b) {
/* 34 */       this.l.a(hh.H, cD(), cE(), cH(), 0.0D, 0.0D, 0.0D);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected bmb m() {
/* 40 */     return new bmb(bmd.qk);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aqm ☃) {
/* 45 */     super.a(☃);
/*    */     
/* 47 */     apu apu = new apu(apw.x, this.f, 0);
/* 48 */     ☃.c(apu);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 53 */     super.a(☃);
/* 54 */     if (☃.e("Duration")) {
/* 55 */       this.f = ☃.h("Duration");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(md ☃) {
/* 61 */     super.b(☃);
/* 62 */     ☃.b("Duration", this.f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */