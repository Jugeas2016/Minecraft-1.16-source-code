/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awm
/*    */   extends avv
/*    */ {
/*    */   private final brc a;
/*    */   private final aqn b;
/*    */   private aqm c;
/*    */   private int d;
/*    */   
/*    */   public awm(aqn ☃) {
/* 17 */     this.b = ☃;
/* 18 */     this.a = ☃.l;
/* 19 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 24 */     aqm ☃ = this.b.A();
/* 25 */     if (☃ == null) {
/* 26 */       return false;
/*    */     }
/* 28 */     this.c = ☃;
/* 29 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 34 */     if (!this.c.aX()) {
/* 35 */       return false;
/*    */     }
/* 37 */     if (this.b.h(this.c) > 225.0D) {
/* 38 */       return false;
/*    */     }
/* 40 */     return (!this.b.x().m() || a());
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 45 */     this.c = null;
/* 46 */     this.b.x().o();
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 51 */     this.b.t().a(this.c, 30.0F, 30.0F);
/*    */     
/* 53 */     double ☃ = (this.b.cy() * 2.0F * this.b.cy() * 2.0F);
/* 54 */     double d1 = this.b.h(this.c.cD(), this.c.cE(), this.c.cH());
/*    */     
/* 56 */     double d2 = 0.8D;
/* 57 */     if (d1 > ☃ && d1 < 16.0D) {
/* 58 */       d2 = 1.33D;
/* 59 */     } else if (d1 < 225.0D) {
/* 60 */       d2 = 0.6D;
/*    */     } 
/*    */     
/* 63 */     this.b.x().a(this.c, d2);
/*    */     
/* 65 */     this.d = Math.max(this.d - 1, 0);
/*    */     
/* 67 */     if (d1 > ☃) {
/*    */       return;
/*    */     }
/* 70 */     if (this.d > 0) {
/*    */       return;
/*    */     }
/* 73 */     this.d = 20;
/* 74 */     this.b.B(this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */