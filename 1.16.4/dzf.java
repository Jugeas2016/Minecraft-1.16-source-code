/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dzf
/*    */   extends dzb
/*    */ {
/*    */   private float a;
/*    */   
/*    */   private dzf(dwt ☃, double d1, double d2, double d3) {
/* 13 */     super(☃, d1, d2, d3);
/*    */     
/* 15 */     this.t = (int)(Math.random() * 60.0D) + 30;
/*    */     
/* 17 */     this.n = false;
/*    */     
/* 19 */     this.j = 0.0D;
/* 20 */     this.k = -0.05D;
/* 21 */     this.l = 0.0D;
/*    */     
/* 23 */     a(0.02F, 0.02F);
/* 24 */     this.B *= this.r.nextFloat() * 0.6F + 0.2F;
/* 25 */     this.u = 0.002F;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 30 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 35 */     this.d = this.g;
/* 36 */     this.e = this.h;
/* 37 */     this.f = this.i;
/*    */     
/* 39 */     if (this.s++ >= this.t) {
/* 40 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 44 */     float ☃ = 0.6F;
/* 45 */     this.j += (0.6F * afm.b(this.a));
/* 46 */     this.l += (0.6F * afm.a(this.a));
/* 47 */     this.j *= 0.07D;
/* 48 */     this.l *= 0.07D;
/* 49 */     a(this.j, this.k, this.l);
/*    */     
/* 51 */     if (!this.c.b(new fx(this.g, this.h, this.i)).a(aef.b) || this.m) {
/* 52 */       j();
/*    */     }
/*    */     
/* 55 */     this.a = (float)(this.a + 0.08D);
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 62 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 67 */       dzf dzf = new dzf(dwt1, d1, d2, d3);
/* 68 */       dzf.a(this.a);
/* 69 */       return dzf;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */