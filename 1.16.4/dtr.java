/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dtr<T extends aqa>
/*    */   extends dtf<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   private final dwn i;
/*    */   private final dwn j;
/*    */   private final dwn k;
/*    */   
/*    */   public dtr() {
/* 19 */     int ☃ = 16;
/* 20 */     this.a = new dwn(this, 0, 0);
/* 21 */     this.a.a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F);
/* 22 */     this.a.a(0.0F, 15.0F, -4.0F);
/*    */     
/* 24 */     this.j = new dwn(this, 14, 0);
/* 25 */     this.j.a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F);
/* 26 */     this.j.a(0.0F, 15.0F, -4.0F);
/*    */     
/* 28 */     this.k = new dwn(this, 14, 4);
/* 29 */     this.k.a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F);
/* 30 */     this.k.a(0.0F, 15.0F, -4.0F);
/*    */     
/* 32 */     this.b = new dwn(this, 0, 9);
/* 33 */     this.b.a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
/* 34 */     this.b.a(0.0F, 16.0F, 0.0F);
/*    */     
/* 36 */     this.f = new dwn(this, 26, 0);
/* 37 */     this.f.a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
/* 38 */     this.f.a(-2.0F, 19.0F, 1.0F);
/*    */     
/* 40 */     this.g = new dwn(this, 26, 0);
/* 41 */     this.g.a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
/* 42 */     this.g.a(1.0F, 19.0F, 1.0F);
/*    */     
/* 44 */     this.h = new dwn(this, 24, 13);
/* 45 */     this.h.a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
/* 46 */     this.h.a(-4.0F, 13.0F, 0.0F);
/*    */     
/* 48 */     this.i = new dwn(this, 24, 13);
/* 49 */     this.i.a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
/* 50 */     this.i.a(4.0F, 13.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Iterable<dwn> a() {
/* 55 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.j, this.k);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Iterable<dwn> b() {
/* 60 */     return (Iterable<dwn>)ImmutableList.of(this.b, this.f, this.g, this.h, this.i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 65 */     this.a.d = f5 * 0.017453292F;
/* 66 */     this.a.e = f4 * 0.017453292F;
/*    */     
/* 68 */     this.j.d = this.a.d;
/* 69 */     this.j.e = this.a.e;
/*    */     
/* 71 */     this.k.d = this.a.d;
/* 72 */     this.k.e = this.a.e;
/*    */     
/* 74 */     this.b.d = 1.5707964F;
/*    */     
/* 76 */     this.f.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/* 77 */     this.g.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/* 78 */     this.h.f = f3;
/* 79 */     this.i.f = -f3;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */