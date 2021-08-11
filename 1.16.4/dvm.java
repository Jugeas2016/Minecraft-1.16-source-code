/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvm<T extends bas>
/*    */   extends dvi<T>
/*    */ {
/*    */   private float j;
/*    */   
/*    */   public dvm() {
/* 10 */     super(12, 0.0F, false, 8.0F, 4.0F, 2.0F, 2.0F, 24);
/*    */     
/* 12 */     this.a = new dwn(this, 0, 0);
/* 13 */     this.a.a(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, 0.6F);
/* 14 */     this.a.a(0.0F, 6.0F, -8.0F);
/*    */     
/* 16 */     this.b = new dwn(this, 28, 8);
/* 17 */     this.b.a(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, 1.75F);
/* 18 */     this.b.a(0.0F, 5.0F, 2.0F);
/*    */     
/* 20 */     float ☃ = 0.5F;
/* 21 */     this.f = new dwn(this, 0, 16);
/* 22 */     this.f.a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
/* 23 */     this.f.a(-3.0F, 12.0F, 7.0F);
/*    */     
/* 25 */     this.g = new dwn(this, 0, 16);
/* 26 */     this.g.a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
/* 27 */     this.g.a(3.0F, 12.0F, 7.0F);
/*    */     
/* 29 */     this.h = new dwn(this, 0, 16);
/* 30 */     this.h.a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
/* 31 */     this.h.a(-3.0F, 12.0F, -5.0F);
/*    */     
/* 33 */     this.i = new dwn(this, 0, 16);
/* 34 */     this.i.a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.5F);
/* 35 */     this.i.a(3.0F, 12.0F, -5.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3) {
/* 40 */     super.a(☃, f1, f2, f3);
/*    */     
/* 42 */     this.a.b = 6.0F + ☃.y(f3) * 9.0F;
/* 43 */     this.j = ☃.z(f3);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 48 */     super.a(☃, f1, f2, f3, f4, f5);
/*    */     
/* 50 */     this.a.d = this.j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */