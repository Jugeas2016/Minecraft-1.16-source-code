/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvh<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   private final dwn i;
/*    */   
/*    */   public dvh() {
/* 20 */     int ☃ = 23;
/*    */     
/* 22 */     this.a = new dwn(this, 0, 27);
/* 23 */     this.a.a(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F);
/* 24 */     this.a.a(0.0F, 23.0F, 0.0F);
/*    */     
/* 26 */     this.b = new dwn(this, 24, 6);
/* 27 */     this.b.a(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
/* 28 */     this.b.a(0.0F, 20.0F, 0.0F);
/*    */     
/* 30 */     this.f = new dwn(this, 28, 6);
/* 31 */     this.f.a(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
/* 32 */     this.f.a(0.0F, 20.0F, 0.0F);
/*    */     
/* 34 */     this.i = new dwn(this, -3, 0);
/* 35 */     this.i.a(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F);
/* 36 */     this.i.a(0.0F, 22.0F, 1.5F);
/*    */     
/* 38 */     this.g = new dwn(this, 25, 0);
/* 39 */     this.g.a(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
/* 40 */     this.g.a(-1.5F, 22.0F, -1.5F);
/*    */     
/* 42 */     this.h = new dwn(this, 25, 0);
/* 43 */     this.h.a(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
/* 44 */     this.h.a(1.5F, 22.0F, -1.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 49 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.i, this.g, this.h);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 54 */     this.g.f = -0.2F + 0.4F * afm.a(f3 * 0.2F);
/* 55 */     this.h.f = 0.2F - 0.4F * afm.a(f3 * 0.2F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */