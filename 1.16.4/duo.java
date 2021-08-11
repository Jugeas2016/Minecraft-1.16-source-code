/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class duo<T extends bai>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   private final dwn i;
/*    */   
/*    */   public duo() {
/* 17 */     int ☃ = 128;
/* 18 */     int i = 128;
/*    */     
/* 20 */     this.a = (new dwn(this)).b(128, 128);
/* 21 */     this.a.a(0.0F, -7.0F, -2.0F);
/* 22 */     this.a.a(0, 0).a(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F);
/* 23 */     this.a.a(24, 0).a(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, 0.0F);
/*    */     
/* 25 */     this.b = (new dwn(this)).b(128, 128);
/* 26 */     this.b.a(0.0F, -7.0F, 0.0F);
/* 27 */     this.b.a(0, 40).a(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F);
/* 28 */     this.b.a(0, 70).a(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F);
/*    */     
/* 30 */     this.f = (new dwn(this)).b(128, 128);
/* 31 */     this.f.a(0.0F, -7.0F, 0.0F);
/* 32 */     this.f.a(60, 21).a(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
/*    */     
/* 34 */     this.g = (new dwn(this)).b(128, 128);
/* 35 */     this.g.a(0.0F, -7.0F, 0.0F);
/* 36 */     this.g.a(60, 58).a(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
/*    */     
/* 38 */     this.h = (new dwn(this, 0, 22)).b(128, 128);
/* 39 */     this.h.a(-4.0F, 11.0F, 0.0F);
/* 40 */     this.h.a(37, 0).a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
/*    */     
/* 42 */     this.i = (new dwn(this, 0, 22)).b(128, 128);
/* 43 */     this.i.g = true;
/* 44 */     this.i.a(60, 0).a(5.0F, 11.0F, 0.0F);
/* 45 */     this.i.a(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 50 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.h, this.i, this.f, this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 55 */     this.a.e = f4 * 0.017453292F;
/* 56 */     this.a.d = f5 * 0.017453292F;
/*    */     
/* 58 */     this.h.d = -1.5F * afm.e(f1, 13.0F) * f2;
/* 59 */     this.i.d = 1.5F * afm.e(f1, 13.0F) * f2;
/* 60 */     this.h.e = 0.0F;
/* 61 */     this.i.e = 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3) {
/* 66 */     int i = ☃.eL();
/* 67 */     if (i > 0) {
/* 68 */       this.f.d = -2.0F + 1.5F * afm.e(i - f3, 10.0F);
/* 69 */       this.g.d = -2.0F + 1.5F * afm.e(i - f3, 10.0F);
/*    */     } else {
/* 71 */       int j = ☃.eM();
/* 72 */       if (j > 0) {
/* 73 */         this.f.d = -0.8F + 0.025F * afm.e(j, 70.0F);
/* 74 */         this.g.d = 0.0F;
/*    */       } else {
/* 76 */         this.f.d = (-0.2F + 1.5F * afm.e(f1, 13.0F)) * f2;
/* 77 */         this.g.d = (-0.2F - 1.5F * afm.e(f1, 13.0F)) * f2;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public dwn b() {
/* 83 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */