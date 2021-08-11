/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvi<T extends aqa>
/*    */   extends dtf<T>
/*    */ {
/*    */   protected dwn a;
/*    */   protected dwn b;
/*    */   protected dwn f;
/*    */   protected dwn g;
/*    */   protected dwn h;
/*    */   protected dwn i;
/*    */   
/*    */   public dvi(int ☃, float f1, boolean bool, float f2, float f3, float f4, float f5, int i) {
/* 17 */     super(bool, f2, f3, f4, f5, i);
/* 18 */     this.a = new dwn(this, 0, 0);
/* 19 */     this.a.a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, f1);
/* 20 */     this.a.a(0.0F, (18 - ☃), -6.0F);
/*    */     
/* 22 */     this.b = new dwn(this, 28, 8);
/* 23 */     this.b.a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, f1);
/* 24 */     this.b.a(0.0F, (17 - ☃), 2.0F);
/*    */     
/* 26 */     this.f = new dwn(this, 0, 16);
/* 27 */     this.f.a(-2.0F, 0.0F, -2.0F, 4.0F, ☃, 4.0F, f1);
/* 28 */     this.f.a(-3.0F, (24 - ☃), 7.0F);
/*    */     
/* 30 */     this.g = new dwn(this, 0, 16);
/* 31 */     this.g.a(-2.0F, 0.0F, -2.0F, 4.0F, ☃, 4.0F, f1);
/* 32 */     this.g.a(3.0F, (24 - ☃), 7.0F);
/*    */     
/* 34 */     this.h = new dwn(this, 0, 16);
/* 35 */     this.h.a(-2.0F, 0.0F, -2.0F, 4.0F, ☃, 4.0F, f1);
/* 36 */     this.h.a(-3.0F, (24 - ☃), -5.0F);
/*    */     
/* 38 */     this.i = new dwn(this, 0, 16);
/* 39 */     this.i.a(-2.0F, 0.0F, -2.0F, 4.0F, ☃, 4.0F, f1);
/* 40 */     this.i.a(3.0F, (24 - ☃), -5.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Iterable<dwn> a() {
/* 45 */     return (Iterable<dwn>)ImmutableList.of(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Iterable<dwn> b() {
/* 50 */     return (Iterable<dwn>)ImmutableList.of(this.b, this.f, this.g, this.h, this.i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 55 */     this.a.d = f5 * 0.017453292F;
/* 56 */     this.a.e = f4 * 0.017453292F;
/* 57 */     this.b.d = 1.5707964F;
/*    */     
/* 59 */     this.f.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/* 60 */     this.g.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/* 61 */     this.h.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/* 62 */     this.i.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */