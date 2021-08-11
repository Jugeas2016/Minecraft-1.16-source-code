/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dzg
/*    */   extends dzb
/*    */ {
/*    */   protected dzg(dwt ☃, double d1, double d2, double d3) {
/* 10 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 11 */     this.j *= 0.30000001192092896D;
/* 12 */     this.k = Math.random() * 0.20000000298023224D + 0.10000000149011612D;
/* 13 */     this.l *= 0.30000001192092896D;
/*    */     
/* 15 */     a(0.01F, 0.01F);
/* 16 */     this.u = 0.06F;
/*    */     
/* 18 */     this.t = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 23 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 28 */     this.d = this.g;
/* 29 */     this.e = this.h;
/* 30 */     this.f = this.i;
/*    */     
/* 32 */     if (this.t-- <= 0) {
/* 33 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 37 */     this.k -= this.u;
/* 38 */     a(this.j, this.k, this.l);
/* 39 */     this.j *= 0.9800000190734863D;
/* 40 */     this.k *= 0.9800000190734863D;
/* 41 */     this.l *= 0.9800000190734863D;
/*    */     
/* 43 */     if (this.m) {
/* 44 */       if (Math.random() < 0.5D) {
/* 45 */         j();
/*    */       }
/* 47 */       this.j *= 0.699999988079071D;
/* 48 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */     
/* 51 */     fx ☃ = new fx(this.g, this.h, this.i);
/* 52 */     double d = Math.max(this.c
/* 53 */         .d_(☃).k(this.c, ☃).b(gc.a.b, this.g - ☃.u(), this.i - ☃.w()), this.c
/* 54 */         .b(☃).a(this.c, ☃));
/*    */ 
/*    */     
/* 57 */     if (d > 0.0D && this.h < ☃.v() + d)
/* 58 */       j(); 
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 66 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 71 */       dzg dzg = new dzg(dwt1, d1, d2, d3);
/* 72 */       dzg.a(this.a);
/* 73 */       return dzg;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */