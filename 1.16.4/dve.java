/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dve<T extends bao>
/*    */   extends dvi<T>
/*    */ {
/*    */   public dve() {
/*  9 */     super(12, 0.0F, true, 16.0F, 4.0F, 2.25F, 2.0F, 24);
/*    */     
/* 11 */     this.r = 128;
/* 12 */     this.s = 64;
/*    */     
/* 14 */     this.a = new dwn(this, 0, 0);
/* 15 */     this.a.a(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F);
/* 16 */     this.a.a(0.0F, 10.0F, -16.0F);
/* 17 */     this.a.a(0, 44).a(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F);
/*    */     
/* 19 */     this.a.a(26, 0).a(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
/* 20 */     dwn ☃ = this.a.a(26, 0);
/* 21 */     ☃.g = true;
/* 22 */     ☃.a(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
/*    */     
/* 24 */     this.b = new dwn(this);
/* 25 */     this.b.a(0, 19).a(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, 0.0F);
/* 26 */     this.b.a(39, 0).a(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F, 0.0F);
/*    */     
/* 28 */     this.b.a(-2.0F, 9.0F, 12.0F);
/*    */     
/* 30 */     int i = 10;
/* 31 */     this.f = new dwn(this, 50, 22);
/* 32 */     this.f.a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
/* 33 */     this.f.a(-3.5F, 14.0F, 6.0F);
/*    */     
/* 35 */     this.g = new dwn(this, 50, 22);
/* 36 */     this.g.a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
/* 37 */     this.g.a(3.5F, 14.0F, 6.0F);
/*    */     
/* 39 */     this.h = new dwn(this, 50, 40);
/* 40 */     this.h.a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
/* 41 */     this.h.a(-2.5F, 14.0F, -7.0F);
/*    */     
/* 43 */     this.i = new dwn(this, 50, 40);
/* 44 */     this.i.a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
/* 45 */     this.i.a(2.5F, 14.0F, -7.0F);
/*    */     
/* 47 */     this.f.a--;
/* 48 */     this.g.a++;
/* 49 */     this.f.c += 0.0F;
/* 50 */     this.g.c += 0.0F;
/* 51 */     this.h.a--;
/* 52 */     this.i.a++;
/* 53 */     this.h.c--;
/* 54 */     this.i.c--;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 59 */     super.a(☃, f1, f2, f3, f4, f5);
/*    */     
/* 61 */     float f6 = f3 - ((bao)☃).K;
/* 62 */     float f7 = ☃.y(f6);
/* 63 */     f7 *= f7;
/* 64 */     float f8 = 1.0F - f7;
/*    */     
/* 66 */     this.b.d = 1.5707964F - f7 * 3.1415927F * 0.35F;
/* 67 */     this.b.b = 9.0F * f8 + 11.0F * f7;
/*    */     
/* 69 */     this.h.b = 14.0F * f8 - 6.0F * f7;
/* 70 */     this.h.c = -8.0F * f8 - 4.0F * f7;
/* 71 */     this.h.d -= f7 * 3.1415927F * 0.45F;
/*    */     
/* 73 */     this.i.b = this.h.b;
/* 74 */     this.i.c = this.h.c;
/* 75 */     this.i.d -= f7 * 3.1415927F * 0.45F;
/*    */     
/* 77 */     if (this.e) {
/* 78 */       this.a.b = 10.0F * f8 - 9.0F * f7;
/* 79 */       this.a.c = -16.0F * f8 - 7.0F * f7;
/*    */     } else {
/* 81 */       this.a.b = 10.0F * f8 - 14.0F * f7;
/* 82 */       this.a.c = -16.0F * f8 - 3.0F * f7;
/*    */     } 
/* 84 */     this.a.d += f7 * 3.1415927F * 0.15F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dve.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */