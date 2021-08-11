/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxq
/*    */   extends dzb
/*    */ {
/*    */   private final dyw a;
/*    */   
/*    */   private dxq(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, hd hd1, dyw dyw1) {
/* 11 */     super(☃, d1, d2, d3, d4, d5, d6);
/* 12 */     this.a = dyw1;
/* 13 */     this.j *= 0.10000000149011612D;
/* 14 */     this.k *= 0.10000000149011612D;
/* 15 */     this.l *= 0.10000000149011612D;
/*    */     
/* 17 */     float f = (float)Math.random() * 0.4F + 0.6F;
/* 18 */     this.v = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * hd1.c() * f;
/* 19 */     this.w = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * hd1.d() * f;
/* 20 */     this.x = ((float)(Math.random() * 0.20000000298023224D) + 0.8F) * hd1.e() * f;
/* 21 */     this.B *= 0.75F * hd1.f();
/*    */     
/* 23 */     int i = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
/* 24 */     this.t = (int)Math.max(i * hd1.f(), 1.0F);
/* 25 */     b(dyw1);
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 30 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 35 */     return this.B * afm.a((this.s + ☃) / this.t * 32.0F, 0.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 40 */     this.d = this.g;
/* 41 */     this.e = this.h;
/* 42 */     this.f = this.i;
/*    */     
/* 44 */     if (this.s++ >= this.t) {
/* 45 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 49 */     b(this.a);
/*    */     
/* 51 */     a(this.j, this.k, this.l);
/* 52 */     if (this.h == this.e) {
/* 53 */       this.j *= 1.1D;
/* 54 */       this.l *= 1.1D;
/*    */     } 
/* 56 */     this.j *= 0.9599999785423279D;
/* 57 */     this.k *= 0.9599999785423279D;
/* 58 */     this.l *= 0.9599999785423279D;
/*    */     
/* 60 */     if (this.m) {
/* 61 */       this.j *= 0.699999988079071D;
/* 62 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hd> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 70 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hd ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 75 */       return new dxq(dwt1, d1, d2, d3, d4, d5, d6, ☃, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */