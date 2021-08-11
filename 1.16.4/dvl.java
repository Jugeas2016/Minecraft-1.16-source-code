/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvl<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   
/*    */   public dvl() {
/* 19 */     int ☃ = 20;
/*    */     
/* 21 */     this.a = new dwn(this, 0, 0);
/* 22 */     this.a.a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
/* 23 */     this.a.a(0.0F, 20.0F, 0.0F);
/*    */     
/* 25 */     this.b = new dwn(this, 0, 13);
/* 26 */     this.b.a(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
/* 27 */     this.b.a(0.0F, 20.0F, 8.0F);
/*    */     
/* 29 */     this.f = new dwn(this, 22, 0);
/* 30 */     this.f.a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
/* 31 */     this.f.a(0.0F, 20.0F, 0.0F);
/*    */     
/* 33 */     dwn dwn1 = new dwn(this, 20, 10);
/* 34 */     dwn1.a(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F);
/* 35 */     dwn1.a(0.0F, 0.0F, 8.0F);
/* 36 */     this.b.b(dwn1);
/*    */     
/* 38 */     dwn dwn2 = new dwn(this, 2, 1);
/* 39 */     dwn2.a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F);
/* 40 */     dwn2.a(0.0F, -4.5F, 5.0F);
/* 41 */     this.a.b(dwn2);
/*    */     
/* 43 */     dwn dwn3 = new dwn(this, 0, 2);
/* 44 */     dwn3.a(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F);
/* 45 */     dwn3.a(0.0F, -4.5F, -1.0F);
/* 46 */     this.b.b(dwn3);
/*    */     
/* 48 */     this.g = new dwn(this, -4, 0);
/* 49 */     this.g.a(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
/* 50 */     this.g.a(-1.5F, 21.5F, 0.0F);
/* 51 */     this.g.f = -0.7853982F;
/*    */     
/* 53 */     this.h = new dwn(this, 0, 0);
/* 54 */     this.h.a(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
/* 55 */     this.h.a(1.5F, 21.5F, 0.0F);
/* 56 */     this.h.f = 0.7853982F;
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 61 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.g, this.h);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 66 */     float f6 = 1.0F;
/* 67 */     float f7 = 1.0F;
/* 68 */     if (!☃.aE()) {
/* 69 */       f6 = 1.3F;
/* 70 */       f7 = 1.7F;
/*    */     } 
/* 72 */     this.b.e = -f6 * 0.25F * afm.a(f7 * 0.6F * f3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */