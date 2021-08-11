/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvv<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   
/*    */   public dvv() {
/* 16 */     float ☃ = 4.0F;
/* 17 */     float f1 = 0.0F;
/*    */     
/* 19 */     this.f = (new dwn(this, 0, 0)).b(64, 64);
/* 20 */     this.f.a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F);
/* 21 */     this.f.a(0.0F, 4.0F, 0.0F);
/*    */     
/* 23 */     this.g = (new dwn(this, 32, 0)).b(64, 64);
/* 24 */     this.g.a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
/* 25 */     this.g.a(0.0F, 6.0F, 0.0F);
/*    */     
/* 27 */     this.h = (new dwn(this, 32, 0)).b(64, 64);
/* 28 */     this.h.a(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
/* 29 */     this.h.a(0.0F, 6.0F, 0.0F);
/*    */     
/* 31 */     this.a = (new dwn(this, 0, 16)).b(64, 64);
/* 32 */     this.a.a(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F);
/* 33 */     this.a.a(0.0F, 13.0F, 0.0F);
/*    */     
/* 35 */     this.b = (new dwn(this, 0, 36)).b(64, 64);
/* 36 */     this.b.a(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F);
/* 37 */     this.b.a(0.0F, 24.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 42 */     this.f.e = f4 * 0.017453292F;
/* 43 */     this.f.d = f5 * 0.017453292F;
/* 44 */     this.a.e = f4 * 0.017453292F * 0.25F;
/*    */     
/* 46 */     float f6 = afm.a(this.a.e);
/* 47 */     float f7 = afm.b(this.a.e);
/*    */     
/* 49 */     this.g.f = 1.0F;
/* 50 */     this.h.f = -1.0F;
/* 51 */     this.g.e = 0.0F + this.a.e;
/* 52 */     this.h.e = 3.1415927F + this.a.e;
/*    */     
/* 54 */     this.g.a = f7 * 5.0F;
/* 55 */     this.g.c = -f6 * 5.0F;
/*    */     
/* 57 */     this.h.a = -f7 * 5.0F;
/* 58 */     this.h.c = f6 * 5.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 63 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.g, this.h);
/*    */   }
/*    */   
/*    */   public dwn b() {
/* 67 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */