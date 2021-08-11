/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxy
/*    */   extends dzb
/*    */ {
/*    */   private final dyw a;
/*    */   
/*    */   private dxy(dwt ☃, double d1, double d2, double d3, double d4, dyw dyw1) {
/* 10 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 11 */     this.t = 6 + this.r.nextInt(4);
/* 12 */     float f = this.r.nextFloat() * 0.6F + 0.4F;
/* 13 */     this.v = f;
/* 14 */     this.w = f;
/* 15 */     this.x = f;
/* 16 */     this.B = 2.0F * (1.0F - (float)d4 * 0.5F);
/* 17 */     this.a = dyw1;
/* 18 */     b(dyw1);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(float ☃) {
/* 23 */     return 15728880;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 28 */     this.d = this.g;
/* 29 */     this.e = this.h;
/* 30 */     this.f = this.i;
/*    */     
/* 32 */     if (this.s++ >= this.t) {
/* 33 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 37 */     b(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 42 */     return dyk.d;
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 49 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 54 */       return new dxy(dwt1, d1, d2, d3, d4, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */