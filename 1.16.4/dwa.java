/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dwa<T extends aqa>
/*    */   extends dtu<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   
/*    */   public dwa(float ☃) {
/* 19 */     int i = 22;
/*    */     
/* 21 */     this.a = new dwn(this, 0, 0);
/* 22 */     this.a.a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, ☃);
/* 23 */     this.a.a(0.0F, 22.0F, 0.0F);
/*    */     
/* 25 */     this.b = new dwn(this, 22, -6);
/* 26 */     this.b.a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, ☃);
/* 27 */     this.b.a(0.0F, 22.0F, 3.0F);
/*    */     
/* 29 */     this.f = new dwn(this, 2, 16);
/* 30 */     this.f.a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, ☃);
/* 31 */     this.f.a(-1.0F, 22.5F, 0.0F);
/* 32 */     this.f.e = 0.7853982F;
/*    */     
/* 34 */     this.g = new dwn(this, 2, 12);
/* 35 */     this.g.a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, ☃);
/* 36 */     this.g.a(1.0F, 22.5F, 0.0F);
/* 37 */     this.g.e = -0.7853982F;
/*    */     
/* 39 */     this.h = new dwn(this, 10, -5);
/* 40 */     this.h.a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, ☃);
/* 41 */     this.h.a(0.0F, 20.5F, -3.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 46 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.g, this.h);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 51 */     float f = 1.0F;
/* 52 */     if (!☃.aE()) {
/* 53 */       f = 1.5F;
/*    */     }
/* 55 */     this.b.e = -f * 0.45F * afm.a(0.6F * f3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */