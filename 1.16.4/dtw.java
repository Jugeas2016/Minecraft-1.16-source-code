/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dtw<T extends aqa>
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
/*    */   public dtw() {
/* 18 */     this(0.0F);
/*    */   }
/*    */   
/*    */   public dtw(float ☃) {
/* 22 */     int i = 6;
/*    */     
/* 24 */     this.a = new dwn(this, 0, 0);
/* 25 */     this.a.a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, ☃);
/* 26 */     this.a.a(0.0F, 6.0F, 0.0F);
/*    */ 
/*    */     
/* 29 */     this.b = new dwn(this, 32, 0);
/* 30 */     this.b.a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, ☃ + 0.5F);
/* 31 */     this.b.a(0.0F, 6.0F, 0.0F);
/*    */     
/* 33 */     this.f = new dwn(this, 16, 16);
/* 34 */     this.f.a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, ☃);
/* 35 */     this.f.a(0.0F, 6.0F, 0.0F);
/*    */     
/* 37 */     this.g = new dwn(this, 0, 16);
/* 38 */     this.g.a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, ☃);
/* 39 */     this.g.a(-2.0F, 18.0F, 4.0F);
/*    */     
/* 41 */     this.h = new dwn(this, 0, 16);
/* 42 */     this.h.a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, ☃);
/* 43 */     this.h.a(2.0F, 18.0F, 4.0F);
/*    */     
/* 45 */     this.i = new dwn(this, 0, 16);
/* 46 */     this.i.a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, ☃);
/* 47 */     this.i.a(-2.0F, 18.0F, -4.0F);
/*    */     
/* 49 */     this.j = new dwn(this, 0, 16);
/* 50 */     this.j.a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, ☃);
/* 51 */     this.j.a(2.0F, 18.0F, -4.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 56 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.f, this.g, this.h, this.i, this.j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 61 */     this.a.e = f4 * 0.017453292F;
/* 62 */     this.a.d = f5 * 0.017453292F;
/*    */     
/* 64 */     this.g.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/* 65 */     this.h.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/* 66 */     this.i.d = afm.b(f1 * 0.6662F + 3.1415927F) * 1.4F * f2;
/* 67 */     this.j.d = afm.b(f1 * 0.6662F) * 1.4F * f2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */