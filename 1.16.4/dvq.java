/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvq<T extends bdw>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   
/*    */   public dvq() {
/* 15 */     super(eao::e);
/*    */     
/* 17 */     this.b = new dwn(64, 64, 0, 0);
/* 18 */     this.a = new dwn(64, 64, 0, 28);
/* 19 */     this.f = new dwn(64, 64, 0, 52);
/*    */     
/* 21 */     this.b.a(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F);
/* 22 */     this.b.a(0.0F, 24.0F, 0.0F);
/*    */     
/* 24 */     this.a.a(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F);
/* 25 */     this.a.a(0.0F, 24.0F, 0.0F);
/*    */     
/* 27 */     this.f.a(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F);
/* 28 */     this.f.a(0.0F, 12.0F, 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 33 */     float f6 = f3 - ((bdw)☃).K;
/* 34 */     float f7 = (0.5F + ☃.y(f6)) * 3.1415927F;
/* 35 */     float f8 = -1.0F + afm.a(f7);
/* 36 */     float f9 = 0.0F;
/* 37 */     if (f7 > 3.1415927F) {
/* 38 */       f9 = afm.a(f3 * 0.1F) * 0.7F;
/*    */     }
/* 40 */     this.b.a(0.0F, 16.0F + afm.a(f7) * 8.0F + f9, 0.0F);
/*    */ 
/*    */     
/* 43 */     if (☃.y(f6) > 0.3F) {
/* 44 */       this.b.e = f8 * f8 * f8 * f8 * 3.1415927F * 0.125F;
/*    */     } else {
/* 46 */       this.b.e = 0.0F;
/*    */     } 
/*    */     
/* 49 */     this.f.d = f5 * 0.017453292F;
/* 50 */     this.f.e = (((bdw)☃).aC - 180.0F - ((bdw)☃).aA) * 0.017453292F;
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 55 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b);
/*    */   }
/*    */   
/*    */   public dwn b() {
/* 59 */     return this.a;
/*    */   }
/*    */   
/*    */   public dwn c() {
/* 63 */     return this.b;
/*    */   }
/*    */   
/*    */   public dwn d() {
/* 67 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */