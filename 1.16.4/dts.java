/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dts<T extends aqa>
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
/*    */   public dts() {
/* 21 */     int ☃ = 22;
/*    */     
/* 23 */     this.a = new dwn(this, 0, 0);
/* 24 */     this.a.a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F);
/* 25 */     this.a.a(0.0F, 22.0F, 0.0F);
/*    */     
/* 27 */     this.f = new dwn(this, 11, 0);
/* 28 */     this.f.a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
/* 29 */     this.f.a(0.0F, 22.0F, 0.0F);
/*    */     
/* 31 */     this.g = new dwn(this, 0, 0);
/* 32 */     this.g.a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F);
/* 33 */     this.g.a(0.0F, 22.0F, -3.0F);
/*    */     
/* 35 */     this.h = new dwn(this, 22, 1);
/* 36 */     this.h.a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
/* 37 */     this.h.a(-1.0F, 23.0F, 0.0F);
/* 38 */     this.h.f = -0.7853982F;
/*    */     
/* 40 */     this.i = new dwn(this, 22, 4);
/* 41 */     this.i.a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
/* 42 */     this.i.a(1.0F, 23.0F, 0.0F);
/* 43 */     this.i.f = 0.7853982F;
/*    */     
/* 45 */     this.j = new dwn(this, 22, 3);
/* 46 */     this.j.a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F);
/* 47 */     this.j.a(0.0F, 22.0F, 7.0F);
/*    */     
/* 49 */     this.b = new dwn(this, 20, -6);
/* 50 */     this.b.a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F);
/* 51 */     this.b.a(0.0F, 20.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 56 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.f, this.g, this.h, this.i, this.j, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 61 */     float f = 1.0F;
/* 62 */     if (!☃.aE()) {
/* 63 */       f = 1.5F;
/*    */     }
/* 65 */     this.j.e = -f * 0.45F * afm.a(0.6F * f3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */