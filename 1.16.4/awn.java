/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awn
/*    */   extends avv
/*    */ {
/* 10 */   private static final azg a = (new azg()).a(6.0D).b().a();
/*    */   
/*    */   private final bai b;
/*    */   
/*    */   private bfj c;
/*    */   
/*    */   private int d;
/*    */   
/*    */   public awn(bai ☃) {
/* 19 */     this.b = ☃;
/* 20 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 25 */     if (!this.b.l.M()) {
/* 26 */       return false;
/*    */     }
/* 28 */     if (this.b.cY().nextInt(8000) != 0) {
/* 29 */       return false;
/*    */     }
/* 31 */     this.c = this.b.l.<bfj>a(bfj.class, a, this.b, this.b.cD(), this.b.cE(), this.b.cH(), this.b.cc().c(6.0D, 2.0D, 6.0D));
/* 32 */     return (this.c != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 37 */     return (this.d > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 42 */     this.d = 400;
/* 43 */     this.b.t(true);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 48 */     this.b.t(false);
/* 49 */     this.c = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 54 */     this.b.t().a(this.c, 30.0F, 30.0F);
/* 55 */     this.d--;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */