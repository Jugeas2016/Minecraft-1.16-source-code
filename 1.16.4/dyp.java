/*    */ 
/*    */ 
/*    */ 
/*    */ public class dyp
/*    */   extends dzb
/*    */ {
/*    */   protected final dyw a;
/*    */   private final float b;
/*  9 */   private float D = 0.91F;
/*    */   
/*    */   private float E;
/*    */   private float F;
/*    */   private float G;
/*    */   private boolean H;
/*    */   
/*    */   protected dyp(dwt ☃, double d1, double d2, double d3, dyw dyw1, float f) {
/* 17 */     super(☃, d1, d2, d3);
/* 18 */     this.a = dyw1;
/* 19 */     this.b = f;
/*    */   }
/*    */   
/*    */   public void b(int ☃) {
/* 23 */     float f1 = ((☃ & 0xFF0000) >> 16) / 255.0F;
/* 24 */     float f2 = ((☃ & 0xFF00) >> 8) / 255.0F;
/* 25 */     float f3 = ((☃ & 0xFF) >> 0) / 255.0F;
/* 26 */     float f4 = 1.0F;
/* 27 */     a(f1 * 1.0F, f2 * 1.0F, f3 * 1.0F);
/*    */   }
/*    */   
/*    */   public void c(int ☃) {
/* 31 */     this.E = ((☃ & 0xFF0000) >> 16) / 255.0F;
/* 32 */     this.F = ((☃ & 0xFF00) >> 8) / 255.0F;
/* 33 */     this.G = ((☃ & 0xFF) >> 0) / 255.0F;
/* 34 */     this.H = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 39 */     return dyk.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 44 */     this.d = this.g;
/* 45 */     this.e = this.h;
/* 46 */     this.f = this.i;
/*    */     
/* 48 */     if (this.s++ >= this.t) {
/* 49 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 53 */     b(this.a);
/*    */     
/* 55 */     if (this.s > this.t / 2) {
/* 56 */       e(1.0F - (this.s - (this.t / 2)) / this.t);
/*    */       
/* 58 */       if (this.H) {
/* 59 */         this.v += (this.E - this.v) * 0.2F;
/* 60 */         this.w += (this.F - this.w) * 0.2F;
/* 61 */         this.x += (this.G - this.x) * 0.2F;
/*    */       } 
/*    */     } 
/*    */     
/* 65 */     this.k += this.b;
/* 66 */     a(this.j, this.k, this.l);
/* 67 */     this.j *= this.D;
/* 68 */     this.k *= this.D;
/* 69 */     this.l *= this.D;
/*    */     
/* 71 */     if (this.m) {
/* 72 */       this.j *= 0.699999988079071D;
/* 73 */       this.l *= 0.699999988079071D;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(float ☃) {
/* 79 */     return 15728880;
/*    */   }
/*    */   
/*    */   protected void f(float ☃) {
/* 83 */     this.D = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */