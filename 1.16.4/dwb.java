/*    */ import com.google.common.collect.ImmutableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dwb<T extends aqa>
/*    */   extends dtu<T>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final dwn h;
/*    */   private final dwn i;
/*    */   
/*    */   public dwb(float ☃) {
/* 20 */     int i = 19;
/*    */     
/* 22 */     this.a = new dwn(this, 0, 20);
/* 23 */     this.a.a(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, ☃);
/* 24 */     this.a.a(0.0F, 19.0F, 0.0F);
/*    */     
/* 26 */     this.b = new dwn(this, 21, 16);
/* 27 */     this.b.a(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, ☃);
/* 28 */     this.b.a(0.0F, 19.0F, 3.0F);
/*    */     
/* 30 */     this.f = new dwn(this, 2, 16);
/* 31 */     this.f.a(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, ☃);
/* 32 */     this.f.a(-1.0F, 20.0F, 0.0F);
/* 33 */     this.f.e = 0.7853982F;
/*    */     
/* 35 */     this.g = new dwn(this, 2, 12);
/* 36 */     this.g.a(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, ☃);
/* 37 */     this.g.a(1.0F, 20.0F, 0.0F);
/* 38 */     this.g.e = -0.7853982F;
/*    */     
/* 40 */     this.h = new dwn(this, 20, 11);
/* 41 */     this.h.a(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, ☃);
/* 42 */     this.h.a(0.0F, 16.0F, -3.0F);
/*    */     
/* 44 */     this.i = new dwn(this, 20, 21);
/* 45 */     this.i.a(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, ☃);
/* 46 */     this.i.a(0.0F, 22.0F, -3.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 51 */     return (Iterable<dwn>)ImmutableList.of(this.a, this.b, this.f, this.g, this.h, this.i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 56 */     float f = 1.0F;
/* 57 */     if (!☃.aE()) {
/* 58 */       f = 1.5F;
/*    */     }
/* 60 */     this.b.e = -f * 0.45F * afm.a(0.6F * f3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */