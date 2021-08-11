/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dtx<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   
/*    */   public dtx() {
/* 18 */     float ☃ = 18.0F;
/* 19 */     float f1 = -8.0F;
/*    */     
/* 21 */     this.a = new dwn(this, 22, 0);
/* 22 */     this.a.a(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F);
/* 23 */     this.a.a(0.0F, 22.0F, -5.0F);
/* 24 */     dwn dwn1 = new dwn(this, 51, 0);
/* 25 */     dwn1.a(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F);
/* 26 */     dwn1.d = 1.0471976F;
/* 27 */     this.a.b(dwn1);
/* 28 */     dwn dwn2 = new dwn(this, 48, 20);
/* 29 */     dwn2.g = true;
/* 30 */     dwn2.a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
/* 31 */     dwn2.a(2.0F, -2.0F, 4.0F);
/* 32 */     dwn2.d = 1.0471976F;
/* 33 */     dwn2.f = 2.0943952F;
/* 34 */     this.a.b(dwn2);
/* 35 */     dwn dwn3 = new dwn(this, 48, 20);
/* 36 */     dwn3.a(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
/* 37 */     dwn3.a(-2.0F, -2.0F, 4.0F);
/* 38 */     dwn3.d = 1.0471976F;
/* 39 */     dwn3.f = -2.0943952F;
/* 40 */     this.a.b(dwn3);
/* 41 */     this.b = new dwn(this, 0, 19);
/* 42 */     this.b.a(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F);
/* 43 */     this.b.a(0.0F, -2.5F, 11.0F);
/* 44 */     this.b.d = -0.10471976F;
/* 45 */     this.a.b(this.b);
/* 46 */     this.f = new dwn(this, 19, 20);
/* 47 */     this.f.a(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F);
/* 48 */     this.f.a(0.0F, 0.0F, 9.0F);
/* 49 */     this.f.d = 0.0F;
/* 50 */     this.b.b(this.f);
/*    */     
/* 52 */     dwn dwn4 = new dwn(this, 0, 0);
/* 53 */     dwn4.a(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F);
/* 54 */     dwn4.a(0.0F, -4.0F, -3.0F);
/* 55 */     dwn dwn5 = new dwn(this, 0, 13);
/* 56 */     dwn5.a(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F);
/* 57 */     dwn4.b(dwn5);
/* 58 */     this.a.b(dwn4);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 63 */     return (Iterable<dwn>)ImmutableList.of(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 68 */     this.a.d = f5 * 0.017453292F;
/* 69 */     this.a.e = f4 * 0.017453292F;
/*    */     
/* 71 */     if (aqa.c(☃.cC()) > 1.0E-7D) {
/* 72 */       this.a.d += -0.05F + -0.05F * afm.b(f3 * 0.3F);
/* 73 */       this.b.d = -0.1F * afm.b(f3 * 0.3F);
/* 74 */       this.f.d = -0.2F * afm.b(f3 * 0.3F);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */