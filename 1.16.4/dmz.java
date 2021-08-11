/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dmz
/*    */ {
/*    */   private final eao a;
/*    */   private final eao b;
/*    */   private final float c;
/*    */   private final float d;
/*    */   private final float e;
/*    */   private final float f;
/*    */   private final float g;
/*    */   private final float h;
/*    */   private final float i;
/*    */   private final float j;
/*    */   
/*    */   public dmz(eao ☃, eao eao1, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = eao1;
/* 22 */     this.c = f1;
/* 23 */     this.d = f2;
/* 24 */     this.e = f3;
/* 25 */     this.f = f4;
/*    */     
/* 27 */     this.g = f5;
/* 28 */     this.h = f6;
/* 29 */     this.i = f7;
/* 30 */     this.j = f8;
/*    */   }
/*    */   
/*    */   public void a(boolean ☃, float f1, float f2, b b1, dfq dfq1, float f3, float f4, float f5, float f6, int i) {
/* 34 */     int j = 3;
/*    */     
/* 36 */     float f7 = f1 + this.g;
/* 37 */     float f8 = f1 + this.h;
/*    */     
/* 39 */     float f9 = this.i - 3.0F;
/* 40 */     float f10 = this.j - 3.0F;
/*    */     
/* 42 */     float f11 = f2 + f9;
/* 43 */     float f12 = f2 + f10;
/*    */     
/* 45 */     float f13 = ☃ ? (1.0F - 0.25F * f9) : 0.0F;
/* 46 */     float f14 = ☃ ? (1.0F - 0.25F * f10) : 0.0F;
/*    */     
/* 48 */     dfq1.a(b1, f7 + f13, f11, 0.0F).a(f3, f4, f5, f6).a(this.c, this.e).a(i).d();
/* 49 */     dfq1.a(b1, f7 + f14, f12, 0.0F).a(f3, f4, f5, f6).a(this.c, this.f).a(i).d();
/* 50 */     dfq1.a(b1, f8 + f14, f12, 0.0F).a(f3, f4, f5, f6).a(this.d, this.f).a(i).d();
/* 51 */     dfq1.a(b1, f8 + f13, f11, 0.0F).a(f3, f4, f5, f6).a(this.d, this.e).a(i).d();
/*    */   }
/*    */   
/*    */   public void a(a ☃, b b1, dfq dfq1, int i) {
/* 55 */     dfq1.a(b1, ☃.a, ☃.b, ☃.e).a(☃.f, ☃.g, ☃.h, ☃.i).a(this.c, this.e).a(i).d();
/* 56 */     dfq1.a(b1, ☃.c, ☃.b, ☃.e).a(☃.f, ☃.g, ☃.h, ☃.i).a(this.c, this.f).a(i).d();
/* 57 */     dfq1.a(b1, ☃.c, ☃.d, ☃.e).a(☃.f, ☃.g, ☃.h, ☃.i).a(this.d, this.f).a(i).d();
/* 58 */     dfq1.a(b1, ☃.a, ☃.d, ☃.e).a(☃.f, ☃.g, ☃.h, ☃.i).a(this.d, this.e).a(i).d();
/*    */   }
/*    */   
/*    */   public eao a(boolean ☃) {
/* 62 */     return ☃ ? this.b : this.a;
/*    */   }
/*    */   
/*    */   public static class a {
/*    */     protected final float a;
/*    */     protected final float b;
/*    */     protected final float c;
/*    */     protected final float d;
/*    */     protected final float e;
/*    */     protected final float f;
/*    */     protected final float g;
/*    */     protected final float h;
/*    */     protected final float i;
/*    */     
/*    */     public a(float ☃, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
/* 77 */       this.a = ☃;
/* 78 */       this.b = f1;
/* 79 */       this.c = f2;
/* 80 */       this.d = f3;
/* 81 */       this.e = f4;
/* 82 */       this.f = f5;
/* 83 */       this.g = f6;
/* 84 */       this.h = f7;
/* 85 */       this.i = f8;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */