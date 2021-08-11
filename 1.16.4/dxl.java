/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxl
/*    */   extends dzb
/*    */ {
/*    */   private final dyw a;
/*    */   
/*    */   private dxl(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/* 10 */     super(☃, d1, d2, d3);
/* 11 */     this.a = dyw1;
/* 12 */     this.t = 4;
/* 13 */     this.u = 0.008F;
/* 14 */     this.j = d4;
/* 15 */     this.k = d5;
/* 16 */     this.l = d6;
/* 17 */     b(dyw1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 22 */     this.d = this.g;
/* 23 */     this.e = this.h;
/* 24 */     this.f = this.i;
/*    */     
/* 26 */     if (this.s++ >= this.t) {
/* 27 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 31 */     this.k -= this.u;
/* 32 */     a(this.j, this.k, this.l);
/*    */     
/* 34 */     b(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 39 */     return dyk.b;
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 46 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 51 */       return new dxl(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */