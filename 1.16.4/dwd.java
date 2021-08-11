/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Iterables;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dwd
/*    */   extends dum<bee>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   
/*    */   public dwd() {
/* 15 */     super(0.0F, 0.0F, 64, 64);
/*    */     
/* 17 */     this.l.h = false;
/* 18 */     this.g.h = false;
/*    */     
/* 20 */     this.k = new dwn(this, 32, 0);
/* 21 */     this.k.a(-1.0F, -1.0F, -2.0F, 6.0F, 10.0F, 4.0F, 0.0F);
/* 22 */     this.k.a(-1.9F, 12.0F, 0.0F);
/*    */     
/* 24 */     this.b = new dwn(this, 0, 32);
/* 25 */     this.b.a(-20.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
/*    */     
/* 27 */     this.a = new dwn(this, 0, 32);
/* 28 */     this.a.g = true;
/* 29 */     this.a.a(0.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Iterable<dwn> b() {
/* 34 */     return Iterables.concat(super.b(), (Iterable)ImmutableList.of(this.b, this.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bee ☃, float f1, float f2, float f3, float f4, float f5) {
/* 39 */     super.a(☃, f1, f2, f3, f4, f5);
/*    */     
/* 41 */     if (☃.eM()) {
/* 42 */       if (☃.dD().a()) {
/* 43 */         this.i.d = 4.712389F;
/* 44 */         this.j.d = 4.712389F;
/*    */       }
/* 46 */       else if (☃.dV() == aqi.b) {
/* 47 */         this.i.d = 3.7699115F;
/*    */       } else {
/* 49 */         this.j.d = 3.7699115F;
/*    */       } 
/*    */     }
/*    */ 
/*    */     
/* 54 */     this.k.d += 0.62831855F;
/*    */     
/* 56 */     this.b.c = 2.0F;
/* 57 */     this.a.c = 2.0F;
/* 58 */     this.b.b = 1.0F;
/* 59 */     this.a.b = 1.0F;
/* 60 */     this.b.e = 0.47123894F + afm.b(f3 * 0.8F) * 3.1415927F * 0.05F;
/* 61 */     this.a.e = -this.b.e;
/* 62 */     this.a.f = -0.47123894F;
/* 63 */     this.a.d = 0.47123894F;
/* 64 */     this.b.d = 0.47123894F;
/* 65 */     this.b.f = 0.47123894F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */