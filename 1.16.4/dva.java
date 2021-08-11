/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dva<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   private final dwn i;
/*    */   private final dwn j;
/*    */   
/*    */   public dva() {
/* 19 */     this.r = 64;
/* 20 */     this.s = 64;
/*    */     
/* 22 */     this.a = new dwn(this, 0, 8);
/* 23 */     this.a.a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F);
/* 24 */     this.i = new dwn(this, 3, 20);
/* 25 */     this.i.a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F);
/* 26 */     this.i.a(0.0F, -2.0F, 1.0F);
/* 27 */     this.a.b(this.i);
/* 28 */     this.j = new dwn(this, 4, 29);
/* 29 */     this.j.a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F);
/* 30 */     this.j.a(0.0F, 0.5F, 6.0F);
/* 31 */     this.i.b(this.j);
/*    */     
/* 33 */     this.b = new dwn(this, 23, 12);
/* 34 */     this.b.a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
/* 35 */     this.b.a(2.0F, -2.0F, -8.0F);
/* 36 */     this.f = new dwn(this, 16, 24);
/* 37 */     this.f.a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
/* 38 */     this.f.a(6.0F, 0.0F, 0.0F);
/* 39 */     this.b.b(this.f);
/*    */     
/* 41 */     this.g = new dwn(this, 23, 12);
/* 42 */     this.g.g = true;
/* 43 */     this.g.a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
/* 44 */     this.g.a(-3.0F, -2.0F, -8.0F);
/* 45 */     this.h = new dwn(this, 16, 24);
/* 46 */     this.h.g = true;
/* 47 */     this.h.a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
/* 48 */     this.h.a(-6.0F, 0.0F, 0.0F);
/* 49 */     this.g.b(this.h);
/*    */     
/* 51 */     this.b.f = 0.1F;
/* 52 */     this.f.f = 0.1F;
/* 53 */     this.g.f = -0.1F;
/* 54 */     this.h.f = -0.1F;
/* 55 */     this.a.d = -0.1F;
/*    */     
/* 57 */     dwn ☃ = new dwn(this, 0, 0);
/* 58 */     ☃.a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F);
/* 59 */     ☃.a(0.0F, 1.0F, -7.0F);
/*    */     
/* 61 */     ☃.d = 0.2F;
/*    */     
/* 63 */     this.a.b(☃);
/* 64 */     this.a.b(this.b);
/* 65 */     this.a.b(this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 70 */     return (Iterable<dwn>)ImmutableList.of(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 75 */     float f6 = ((☃.Y() * 3) + f3) * 0.13F;
/* 76 */     float f7 = 16.0F;
/* 77 */     this.b.f = afm.b(f6) * 16.0F * 0.017453292F;
/* 78 */     this.f.f = afm.b(f6) * 16.0F * 0.017453292F;
/* 79 */     this.g.f = -this.b.f;
/* 80 */     this.h.f = -this.f.f;
/*    */     
/* 82 */     this.i.d = -(5.0F + afm.b(f6 * 2.0F) * 5.0F) * 0.017453292F;
/* 83 */     this.j.d = -(5.0F + afm.b(f6 * 2.0F) * 5.0F) * 0.017453292F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dva.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */