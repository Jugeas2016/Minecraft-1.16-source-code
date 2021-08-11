/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dtz<T extends aqm>
/*    */   extends dtf<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   
/*    */   public dtz() {
/* 15 */     this.b = new dwn(this, 22, 0);
/* 16 */     this.b.a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
/* 17 */     this.a = new dwn(this, 22, 0);
/* 18 */     this.a.g = true;
/* 19 */     this.a.a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Iterable<dwn> a() {
/* 24 */     return (Iterable<dwn>)ImmutableList.of();
/*    */   }
/*    */ 
/*    */   
/*    */   protected Iterable<dwn> b() {
/* 29 */     return (Iterable<dwn>)ImmutableList.of(this.b, this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 34 */     float f6 = 0.2617994F;
/* 35 */     float f7 = -0.2617994F;
/* 36 */     float f8 = 0.0F;
/* 37 */     float f9 = 0.0F;
/*    */     
/* 39 */     if (☃.ef()) {
/*    */       
/* 41 */       float f = 1.0F;
/* 42 */       dcn dcn = ☃.cC();
/* 43 */       if (dcn.c < 0.0D) {
/* 44 */         dcn dcn1 = dcn.d();
/* 45 */         f = 1.0F - (float)Math.pow(-dcn1.c, 1.5D);
/*    */       } 
/*    */       
/* 48 */       f6 = f * 0.34906584F + (1.0F - f) * f6;
/* 49 */       f7 = f * -1.5707964F + (1.0F - f) * f7;
/* 50 */     } else if (☃.bz()) {
/* 51 */       f6 = 0.6981317F;
/* 52 */       f7 = -0.7853982F;
/* 53 */       f8 = 3.0F;
/* 54 */       f9 = 0.08726646F;
/*    */     } 
/*    */     
/* 57 */     this.b.a = 5.0F;
/* 58 */     this.b.b = f8;
/*    */     
/* 60 */     if (☃ instanceof dzj) {
/* 61 */       dzj dzj = (dzj)☃;
/* 62 */       dzj.a = (float)(dzj.a + (f6 - dzj.a) * 0.1D);
/* 63 */       dzj.b = (float)(dzj.b + (f9 - dzj.b) * 0.1D);
/* 64 */       dzj.c = (float)(dzj.c + (f7 - dzj.c) * 0.1D);
/* 65 */       this.b.d = dzj.a;
/* 66 */       this.b.e = dzj.b;
/* 67 */       this.b.f = dzj.c;
/*    */     } else {
/* 69 */       this.b.d = f6;
/* 70 */       this.b.f = f7;
/* 71 */       this.b.e = f9;
/*    */     } 
/*    */     
/* 74 */     this.a.a = -this.b.a;
/* 75 */     this.a.e = -this.b.e;
/* 76 */     this.a.b = this.b.b;
/* 77 */     this.a.d = this.b.d;
/* 78 */     this.a.f = -this.b.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */