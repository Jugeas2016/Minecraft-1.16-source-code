/*    */ 
/*    */ 
/*    */ 
/*    */ public class dze
/*    */   extends dzb
/*    */ {
/*    */   private final dyw a;
/*    */   
/*    */   private dze(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, dyw dyw1) {
/* 10 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 11 */     this.a = dyw1;
/* 12 */     this.j *= 0.30000001192092896D;
/* 13 */     this.k = Math.random() * 0.20000000298023224D + 0.10000000149011612D;
/* 14 */     this.l *= 0.30000001192092896D;
/*    */     
/* 16 */     a(0.01F, 0.01F);
/*    */     
/* 18 */     this.t = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
/* 19 */     b(dyw1);
/* 20 */     this.u = 0.0F;
/* 21 */     this.j = d4;
/* 22 */     this.k = d5;
/* 23 */     this.l = d6;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 28 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 33 */     this.d = this.g;
/* 34 */     this.e = this.h;
/* 35 */     this.f = this.i;
/*    */     
/* 37 */     int ☃ = 60 - this.t;
/* 38 */     if (this.t-- <= 0) {
/* 39 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 43 */     this.k -= this.u;
/* 44 */     a(this.j, this.k, this.l);
/* 45 */     this.j *= 0.9800000190734863D;
/* 46 */     this.k *= 0.9800000190734863D;
/* 47 */     this.l *= 0.9800000190734863D;
/*    */     
/* 49 */     float f = ☃ * 0.001F;
/* 50 */     a(f, f);
/*    */     
/* 52 */     a(this.a.a(☃ % 4, 4));
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 59 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 64 */       return new dze(dwt1, d1, d2, d3, d4, d5, d6, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */