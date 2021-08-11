/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvf<T extends aqa>
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
/*    */   private final dwn o;
/*    */   private final dwn p;
/*    */   
/*    */   public dvf() {
/* 27 */     int ☃ = 22;
/*    */     
/* 29 */     this.a = new dwn(this, 0, 0);
/* 30 */     this.a.a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F);
/* 31 */     this.a.a(0.0F, 22.0F, 0.0F);
/*    */     
/* 33 */     this.b = new dwn(this, 24, 0);
/* 34 */     this.b.a(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
/* 35 */     this.b.a(-4.0F, 15.0F, -2.0F);
/*    */     
/* 37 */     this.f = new dwn(this, 24, 3);
/* 38 */     this.f.a(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
/* 39 */     this.f.a(4.0F, 15.0F, -2.0F);
/*    */     
/* 41 */     this.g = new dwn(this, 15, 17);
/* 42 */     this.g.a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
/* 43 */     this.g.a(0.0F, 14.0F, -4.0F);
/* 44 */     this.g.d = 0.7853982F;
/*    */     
/* 46 */     this.h = new dwn(this, 14, 16);
/* 47 */     this.h.a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F);
/* 48 */     this.h.a(0.0F, 14.0F, 0.0F);
/*    */     
/* 50 */     this.i = new dwn(this, 23, 18);
/* 51 */     this.i.a(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
/* 52 */     this.i.a(0.0F, 14.0F, 4.0F);
/* 53 */     this.i.d = -0.7853982F;
/*    */     
/* 55 */     this.j = new dwn(this, 5, 17);
/* 56 */     this.j.a(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
/* 57 */     this.j.a(-4.0F, 22.0F, -4.0F);
/* 58 */     this.j.e = -0.7853982F;
/*    */     
/* 60 */     this.k = new dwn(this, 1, 17);
/* 61 */     this.k.a(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
/* 62 */     this.k.a(4.0F, 22.0F, -4.0F);
/* 63 */     this.k.e = 0.7853982F;
/*    */     
/* 65 */     this.l = new dwn(this, 15, 20);
/* 66 */     this.l.a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
/* 67 */     this.l.a(0.0F, 22.0F, -4.0F);
/* 68 */     this.l.d = -0.7853982F;
/*    */     
/* 70 */     this.n = new dwn(this, 15, 20);
/* 71 */     this.n.a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
/* 72 */     this.n.a(0.0F, 22.0F, 0.0F);
/*    */     
/* 74 */     this.m = new dwn(this, 15, 20);
/* 75 */     this.m.a(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
/* 76 */     this.m.a(0.0F, 22.0F, 4.0F);
/* 77 */     this.m.d = 0.7853982F;
/*    */     
/* 79 */     this.o = new dwn(this, 9, 17);
/* 80 */     this.o.a(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
/* 81 */     this.o.a(-4.0F, 22.0F, 4.0F);
/* 82 */     this.o.e = 0.7853982F;
/*    */     
/* 84 */     this.p = new dwn(this, 9, 17);
/* 85 */     this.p.a(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
/* 86 */     this.p.a(4.0F, 22.0F, 4.0F);
/* 87 */     this.p.e = -0.7853982F;
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 92 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.n, this.m, this.o, (Object[])new dwn[] { this.p });
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 97 */     this.b.f = -0.2F + 0.4F * afm.a(f3 * 0.2F);
/* 98 */     this.f.f = 0.2F - 0.4F * afm.a(f3 * 0.2F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */