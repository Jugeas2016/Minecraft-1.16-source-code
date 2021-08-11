/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dtk
/*    */   extends dur<azu>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   private final dwn i;
/*    */   
/*    */   public dtk() {
/* 17 */     this.r = 64;
/* 18 */     this.s = 64;
/*    */     
/* 20 */     this.a = new dwn(this, 0, 0);
/* 21 */     this.a.a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F);
/*    */     
/* 23 */     dwn ☃ = new dwn(this, 24, 0);
/* 24 */     ☃.a(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
/* 25 */     this.a.b(☃);
/* 26 */     dwn dwn1 = new dwn(this, 24, 0);
/* 27 */     dwn1.g = true;
/* 28 */     dwn1.a(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F);
/* 29 */     this.a.b(dwn1);
/*    */     
/* 31 */     this.b = new dwn(this, 0, 16);
/* 32 */     this.b.a(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F);
/* 33 */     this.b.a(0, 34).a(-5.0F, 16.0F, 0.0F, 10.0F, 6.0F, 1.0F);
/*    */     
/* 35 */     this.f = new dwn(this, 42, 0);
/* 36 */     this.f.a(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
/* 37 */     this.h = new dwn(this, 24, 16);
/* 38 */     this.h.a(-12.0F, 1.0F, 1.5F);
/* 39 */     this.h.a(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
/*    */     
/* 41 */     this.g = new dwn(this, 42, 0);
/* 42 */     this.g.g = true;
/* 43 */     this.g.a(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F);
/* 44 */     this.i = new dwn(this, 24, 16);
/* 45 */     this.i.g = true;
/* 46 */     this.i.a(12.0F, 1.0F, 1.5F);
/* 47 */     this.i.a(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F);
/*    */     
/* 49 */     this.b.b(this.f);
/* 50 */     this.b.b(this.g);
/* 51 */     this.f.b(this.h);
/* 52 */     this.g.b(this.i);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 57 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(azu ☃, float f1, float f2, float f3, float f4, float f5) {
/* 62 */     if (☃.eI()) {
/* 63 */       this.a.d = f5 * 0.017453292F;
/* 64 */       this.a.e = 3.1415927F - f4 * 0.017453292F;
/* 65 */       this.a.f = 3.1415927F;
/*    */       
/* 67 */       this.a.a(0.0F, -2.0F, 0.0F);
/* 68 */       this.f.a(-3.0F, 0.0F, 3.0F);
/* 69 */       this.g.a(3.0F, 0.0F, 3.0F);
/*    */       
/* 71 */       this.b.d = 3.1415927F;
/*    */       
/* 73 */       this.f.d = -0.15707964F;
/* 74 */       this.f.e = -1.2566371F;
/* 75 */       this.h.e = -1.7278761F;
/* 76 */       this.g.d = this.f.d;
/* 77 */       this.g.e = -this.f.e;
/* 78 */       this.i.e = -this.h.e;
/*    */     } else {
/* 80 */       this.a.d = f5 * 0.017453292F;
/* 81 */       this.a.e = f4 * 0.017453292F;
/* 82 */       this.a.f = 0.0F;
/*    */       
/* 84 */       this.a.a(0.0F, 0.0F, 0.0F);
/* 85 */       this.f.a(0.0F, 0.0F, 0.0F);
/* 86 */       this.g.a(0.0F, 0.0F, 0.0F);
/*    */       
/* 88 */       this.b.d = 0.7853982F + afm.b(f3 * 0.1F) * 0.15F;
/* 89 */       this.b.e = 0.0F;
/*    */       
/* 91 */       this.f.e = afm.b(f3 * 1.3F) * 3.1415927F * 0.25F;
/* 92 */       this.g.e = -this.f.e;
/* 93 */       this.f.e *= 0.5F;
/* 94 */       this.i.e = -this.f.e * 0.5F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */