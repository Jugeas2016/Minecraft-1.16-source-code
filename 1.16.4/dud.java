/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dud<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   
/*    */   public dud() {
/* 14 */     this.a = new dwn(this, 0, 0);
/* 15 */     this.a.a(-5.0F, 22.0F, -5.0F);
/* 16 */     this.a.a(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F);
/*    */     
/* 18 */     this.b = new dwn(this, 40, 0);
/* 19 */     this.b.a(1.5F, 22.0F, -4.0F);
/* 20 */     this.b.a(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
/*    */     
/* 22 */     this.f = new dwn(this, 40, 0);
/* 23 */     this.f.a(-1.5F, 22.0F, 4.0F);
/* 24 */     this.f.a(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 29 */     float f6 = f1 * 2.0F;
/* 30 */     if (f6 > 1.0F) {
/* 31 */       f6 = 1.0F;
/*    */     }
/* 33 */     f6 = 1.0F - f6 * f6 * f6;
/* 34 */     this.b.f = 3.1415927F - f6 * 0.35F * 3.1415927F;
/* 35 */     this.f.f = 3.1415927F + f6 * 0.35F * 3.1415927F;
/* 36 */     this.f.e = 3.1415927F;
/*    */     
/* 38 */     float f7 = (f1 + afm.a(f1 * 2.7F)) * 0.6F * 12.0F;
/* 39 */     this.b.b = 24.0F - f7;
/* 40 */     this.f.b = this.b.b;
/* 41 */     this.a.b = this.b.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 46 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */