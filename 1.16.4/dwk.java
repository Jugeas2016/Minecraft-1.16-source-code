/*    */ 
/*    */ 
/*    */ 
/*    */ public class dwk<T extends bej>
/*    */   extends dum<T>
/*    */   implements dwe
/*    */ {
/*    */   private dwn a;
/*    */   
/*    */   public dwk(float ☃, boolean bool) {
/* 11 */     super(☃, 0.0F, 64, bool ? 32 : 64);
/*    */     
/* 13 */     if (bool) {
/* 14 */       this.f = new dwn(this, 0, 0);
/* 15 */       this.f.a(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, ☃);
/*    */       
/* 17 */       this.h = new dwn(this, 16, 16);
/* 18 */       this.h.a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, ☃ + 0.1F);
/*    */       
/* 20 */       this.k = new dwn(this, 0, 16);
/* 21 */       this.k.a(-2.0F, 12.0F, 0.0F);
/* 22 */       this.k.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃ + 0.1F);
/*    */       
/* 24 */       this.l = new dwn(this, 0, 16);
/* 25 */       this.l.g = true;
/* 26 */       this.l.a(2.0F, 12.0F, 0.0F);
/* 27 */       this.l.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃ + 0.1F);
/*    */     } else {
/* 29 */       this.f = new dwn(this, 0, 0);
/* 30 */       this.f.a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, ☃);
/* 31 */       this.f.a(24, 0).a(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, ☃);
/*    */       
/* 33 */       this.g = new dwn(this, 32, 0);
/* 34 */       this.g.a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, ☃ + 0.5F);
/*    */       
/* 36 */       this.a = new dwn(this);
/* 37 */       this.a.a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, ☃);
/* 38 */       this.a.d = -1.5707964F;
/* 39 */       this.g.b(this.a);
/*    */       
/* 41 */       this.h = new dwn(this, 16, 20);
/* 42 */       this.h.a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, ☃);
/* 43 */       this.h.a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, ☃ + 0.05F);
/*    */       
/* 45 */       this.i = new dwn(this, 44, 22);
/* 46 */       this.i.a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/* 47 */       this.i.a(-5.0F, 2.0F, 0.0F);
/*    */       
/* 49 */       this.j = new dwn(this, 44, 22);
/* 50 */       this.j.g = true;
/* 51 */       this.j.a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/* 52 */       this.j.a(5.0F, 2.0F, 0.0F);
/*    */       
/* 54 */       this.k = new dwn(this, 0, 22);
/* 55 */       this.k.a(-2.0F, 12.0F, 0.0F);
/* 56 */       this.k.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*    */       
/* 58 */       this.l = new dwn(this, 0, 22);
/* 59 */       this.l.g = true;
/* 60 */       this.l.a(2.0F, 12.0F, 0.0F);
/* 61 */       this.l.a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, ☃);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 67 */     super.a(☃, f1, f2, f3, f4, f5);
/*    */     
/* 69 */     dtg.a(this.j, this.i, ☃.eF(), this.c, f3);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(boolean ☃) {
/* 74 */     this.f.h = ☃;
/* 75 */     this.g.h = ☃;
/* 76 */     this.a.h = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */