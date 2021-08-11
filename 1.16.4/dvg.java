/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvg<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   private final dwn i;
/*    */   private final dwn j;
/*    */   private final dwn k;
/*    */   private final dwn l;
/*    */   private final dwn m;
/*    */   private final dwn n;
/*    */   
/*    */   public dvg() {
/* 25 */     int ☃ = 22;
/*    */     
/* 27 */     this.a = new dwn(this, 12, 22);
/* 28 */     this.a.a(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F);
/* 29 */     this.a.a(0.0F, 22.0F, 0.0F);
/*    */     
/* 31 */     this.b = new dwn(this, 24, 0);
/* 32 */     this.b.a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
/* 33 */     this.b.a(-2.5F, 17.0F, -1.5F);
/*    */     
/* 35 */     this.f = new dwn(this, 24, 3);
/* 36 */     this.f.a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
/* 37 */     this.f.a(2.5F, 17.0F, -1.5F);
/*    */     
/* 39 */     this.g = new dwn(this, 15, 16);
/* 40 */     this.g.a(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F);
/* 41 */     this.g.a(0.0F, 17.0F, -2.5F);
/* 42 */     this.g.d = 0.7853982F;
/*    */     
/* 44 */     this.h = new dwn(this, 10, 16);
/* 45 */     this.h.a(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F);
/* 46 */     this.h.a(0.0F, 17.0F, 2.5F);
/* 47 */     this.h.d = -0.7853982F;
/*    */     
/* 49 */     this.i = new dwn(this, 8, 16);
/* 50 */     this.i.a(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
/* 51 */     this.i.a(-2.5F, 22.0F, -2.5F);
/* 52 */     this.i.e = -0.7853982F;
/*    */     
/* 54 */     this.j = new dwn(this, 8, 16);
/* 55 */     this.j.a(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
/* 56 */     this.j.a(-2.5F, 22.0F, 2.5F);
/* 57 */     this.j.e = 0.7853982F;
/*    */     
/* 59 */     this.k = new dwn(this, 4, 16);
/* 60 */     this.k.a(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
/* 61 */     this.k.a(2.5F, 22.0F, 2.5F);
/* 62 */     this.k.e = -0.7853982F;
/*    */     
/* 64 */     this.l = new dwn(this, 0, 16);
/* 65 */     this.l.a(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
/* 66 */     this.l.a(2.5F, 22.0F, -2.5F);
/* 67 */     this.l.e = 0.7853982F;
/*    */     
/* 69 */     this.m = new dwn(this, 8, 22);
/* 70 */     this.m.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/* 71 */     this.m.a(0.5F, 22.0F, 2.5F);
/* 72 */     this.m.d = 0.7853982F;
/*    */     
/* 74 */     this.n = new dwn(this, 17, 21);
/* 75 */     this.n.a(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F);
/* 76 */     this.n.a(0.0F, 22.0F, -2.5F);
/* 77 */     this.n.d = -0.7853982F;
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 82 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 87 */     this.b.f = -0.2F + 0.4F * afm.a(f3 * 0.2F);
/* 88 */     this.f.f = 0.2F - 0.4F * afm.a(f3 * 0.2F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */