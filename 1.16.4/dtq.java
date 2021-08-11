/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dtq<T extends bba>
/*    */   extends duk<T>
/*    */ {
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   
/*    */   public dtq(float ☃) {
/* 12 */     super(☃);
/* 13 */     this.f = new dwn(this, 26, 21);
/* 14 */     this.f.a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
/* 15 */     this.g = new dwn(this, 26, 21);
/* 16 */     this.g.a(-4.0F, 0.0F, -2.0F, 8.0F, 8.0F, 3.0F);
/*    */     
/* 18 */     this.f.e = -1.5707964F;
/* 19 */     this.g.e = 1.5707964F;
/* 20 */     this.f.a(6.0F, -8.0F, 0.0F);
/* 21 */     this.g.a(-6.0F, -8.0F, 0.0F);
/*    */     
/* 23 */     this.a.b(this.f);
/* 24 */     this.a.b(this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dwn ☃) {
/* 29 */     dwn dwn1 = new dwn(this, 0, 12);
/* 30 */     dwn1.a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
/* 31 */     dwn1.a(1.25F, -10.0F, 4.0F);
/* 32 */     dwn dwn2 = new dwn(this, 0, 12);
/* 33 */     dwn2.a(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F);
/* 34 */     dwn2.a(-1.25F, -10.0F, 4.0F);
/*    */     
/* 36 */     dwn1.d = 0.2617994F;
/* 37 */     dwn1.f = 0.2617994F;
/* 38 */     dwn2.d = 0.2617994F;
/* 39 */     dwn2.f = -0.2617994F;
/*    */     
/* 41 */     ☃.b(dwn1);
/* 42 */     ☃.b(dwn2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 47 */     super.a(☃, f1, f2, f3, f4, f5);
/* 48 */     if (☃.eM()) {
/* 49 */       this.f.h = true;
/* 50 */       this.g.h = true;
/*    */     } else {
/* 52 */       this.f.h = false;
/* 53 */       this.g.h = false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */