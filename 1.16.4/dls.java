/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dls
/*    */   extends aok
/*    */ {
/*    */   protected float h;
/*    */   protected long i;
/*    */   
/*    */   public dls(oz ☃) {
/* 14 */     super(☃.b(), ☃.d(), ☃.f(), ☃.g());
/* 15 */     this.h = ☃.e();
/* 16 */     this.b = ☃.e();
/* 17 */     this.i = x.b();
/* 18 */     a(☃.h());
/* 19 */     b(☃.i());
/* 20 */     c(☃.j());
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(float ☃) {
/* 25 */     this.b = k();
/* 26 */     this.h = ☃;
/* 27 */     this.i = x.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public float k() {
/* 32 */     long ☃ = x.b() - this.i;
/* 33 */     float f = afm.a((float)☃ / 100.0F, 0.0F, 1.0F);
/* 34 */     return afm.g(f, this.b, this.h);
/*    */   }
/*    */   
/*    */   public void a(oz ☃) {
/* 38 */     switch (null.a[☃.c().ordinal()]) {
/*    */       case 1:
/* 40 */         a(☃.d());
/*    */         break;
/*    */       case 2:
/* 43 */         a(☃.e());
/*    */         break;
/*    */       case 3:
/* 46 */         a(☃.f());
/* 47 */         a(☃.g());
/*    */         break;
/*    */       case 4:
/* 50 */         a(☃.h());
/* 51 */         b(☃.i());
/*    */         break;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dls.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */