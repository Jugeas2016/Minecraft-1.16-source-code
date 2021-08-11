/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avu
/*    */   extends avv
/*    */ {
/*    */   private final azz a;
/*    */   private azz b;
/*    */   private final double c;
/*    */   private int d;
/*    */   
/*    */   public avu(azz ☃, double d) {
/* 17 */     this.a = ☃;
/* 18 */     this.c = d;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 23 */     if (this.a.i() >= 0) {
/* 24 */       return false;
/*    */     }
/*    */     
/* 27 */     List<azz> ☃ = (List)this.a.l.a(this.a.getClass(), this.a.cc().c(8.0D, 4.0D, 8.0D));
/*    */     
/* 29 */     azz azz1 = null;
/* 30 */     double d = Double.MAX_VALUE;
/* 31 */     for (azz azz2 : ☃) {
/* 32 */       if (azz2.i() < 0) {
/*    */         continue;
/*    */       }
/* 35 */       double d1 = this.a.h(azz2);
/* 36 */       if (d1 > d) {
/*    */         continue;
/*    */       }
/* 39 */       d = d1;
/* 40 */       azz1 = azz2;
/*    */     } 
/*    */     
/* 43 */     if (azz1 == null) {
/* 44 */       return false;
/*    */     }
/* 46 */     if (d < 9.0D) {
/* 47 */       return false;
/*    */     }
/* 49 */     this.b = azz1;
/* 50 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 55 */     if (this.a.i() >= 0) {
/* 56 */       return false;
/*    */     }
/* 58 */     if (!this.b.aX()) {
/* 59 */       return false;
/*    */     }
/* 61 */     double ☃ = this.a.h(this.b);
/* 62 */     if (☃ < 9.0D || ☃ > 256.0D) {
/* 63 */       return false;
/*    */     }
/* 65 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 70 */     this.d = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 75 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 80 */     if (--this.d > 0) {
/*    */       return;
/*    */     }
/* 83 */     this.d = 10;
/* 84 */     this.a.x().a(this.b, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */