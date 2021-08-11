/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvu<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   
/*    */   public dvu(int ☃) {
/* 14 */     this.a = new dwn(this, 0, ☃);
/* 15 */     this.b = new dwn(this, 32, 0);
/* 16 */     this.f = new dwn(this, 32, 4);
/* 17 */     this.g = new dwn(this, 32, 8);
/*    */     
/* 19 */     if (☃ > 0) {
/* 20 */       this.a.a(-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F);
/* 21 */       this.b.a(-3.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F);
/* 22 */       this.f.a(1.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F);
/* 23 */       this.g.a(0.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F);
/*    */     } else {
/* 25 */       this.a.a(-4.0F, 16.0F, -4.0F, 8.0F, 8.0F, 8.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {}
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 35 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.g);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */