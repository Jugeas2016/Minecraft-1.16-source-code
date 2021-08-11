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
/*    */ public class dxo
/*    */   extends dzb
/*    */ {
/*    */   private boolean a;
/*    */   private final dyw b;
/*    */   
/*    */   private dxo(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/* 24 */     super(☃, d1, d2, d3);
/* 25 */     this.j = d4;
/* 26 */     this.k = d5;
/* 27 */     this.l = d6;
/*    */     
/* 29 */     this.v = afm.a(this.r, 0.7176471F, 0.8745098F);
/* 30 */     this.w = afm.a(this.r, 0.0F, 0.0F);
/* 31 */     this.x = afm.a(this.r, 0.8235294F, 0.9764706F);
/*    */     
/* 33 */     this.B *= 0.75F;
/*    */     
/* 35 */     this.t = (int)(20.0D / (this.r.nextFloat() * 0.8D + 0.2D));
/* 36 */     this.a = false;
/* 37 */     this.n = false;
/*    */     
/* 39 */     this.b = dyw1;
/* 40 */     b(dyw1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 45 */     this.d = this.g;
/* 46 */     this.e = this.h;
/* 47 */     this.f = this.i;
/*    */     
/* 49 */     if (this.s++ >= this.t) {
/* 50 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 54 */     b(this.b);
/*    */     
/* 56 */     if (this.m) {
/* 57 */       this.k = 0.0D;
/* 58 */       this.a = true;
/*    */     } 
/*    */     
/* 61 */     if (this.a) {
/* 62 */       this.k += 0.002D;
/*    */     }
/*    */     
/* 65 */     a(this.j, this.k, this.l);
/*    */     
/* 67 */     if (this.h == this.e) {
/* 68 */       this.j *= 1.1D;
/* 69 */       this.l *= 1.1D;
/*    */     } 
/*    */     
/* 72 */     this.j *= 0.9599999785423279D;
/* 73 */     this.l *= 0.9599999785423279D;
/*    */     
/* 75 */     if (this.a) {
/* 76 */       this.k *= 0.9599999785423279D;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 82 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 87 */     return this.B * afm.a((this.s + ☃) / this.t * 32.0F, 0.0F, 1.0F);
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 94 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 99 */       return new dxo(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */