/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dyc
/*    */   extends dzb
/*    */ {
/*    */   private dyc(dwt ☃, double d1, double d2, double d3) {
/*  9 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 10 */     this.j *= 0.800000011920929D;
/* 11 */     this.k *= 0.800000011920929D;
/* 12 */     this.l *= 0.800000011920929D;
/* 13 */     this.k = (this.r.nextFloat() * 0.4F + 0.05F);
/*    */     
/* 15 */     this.B *= this.r.nextFloat() * 2.0F + 0.2F;
/*    */     
/* 17 */     this.t = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 22 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(float ☃) {
/* 27 */     int i = super.a(☃);
/*    */     
/* 29 */     int j = 240;
/* 30 */     int k = i >> 16 & 0xFF;
/* 31 */     return 0xF0 | k << 16;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 36 */     float f = (this.s + ☃) / this.t;
/* 37 */     return this.B * (1.0F - f * f);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 42 */     this.d = this.g;
/* 43 */     this.e = this.h;
/* 44 */     this.f = this.i;
/*    */     
/* 46 */     float ☃ = this.s / this.t;
/* 47 */     if (this.r.nextFloat() > ☃) {
/* 48 */       this.c.a(hh.S, this.g, this.h, this.i, this.j, this.k, this.l);
/*    */     }
/*    */     
/* 51 */     if (this.s++ >= this.t) {
/* 52 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 56 */     this.k -= 0.03D;
/* 57 */     a(this.j, this.k, this.l);
/* 58 */     this.j *= 0.9990000128746033D;
/* 59 */     this.k *= 0.9990000128746033D;
/* 60 */     this.l *= 0.9990000128746033D;
/*    */     
/* 62 */     if (this.m) {
/* 63 */       this.j *= 0.699999988079071D;
/* 64 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hi> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 72 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 77 */       dyc dyc = new dyc(dwt1, d1, d2, d3);
/* 78 */       dyc.a(this.a);
/* 79 */       return dyc;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */