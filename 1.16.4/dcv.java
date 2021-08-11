/*    */ import com.google.common.math.IntMath;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ 
/*    */ public final class dcv
/*    */   implements dcz
/*    */ {
/*    */   private final dct a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   dcv(int ☃, int i) {
/* 13 */     this.a = new dct((int)dde.a(☃, i));
/* 14 */     this.b = ☃;
/* 15 */     this.c = i;
/* 16 */     this.d = IntMath.gcd(☃, i);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(dcz.a ☃) {
/* 21 */     int i = this.b / this.d;
/* 22 */     int j = this.c / this.d;
/* 23 */     for (int k = 0; k <= this.a.size(); k++) {
/* 24 */       if (!☃.merge(k / j, k / i, k)) {
/* 25 */         return false;
/*    */       }
/*    */     } 
/* 28 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public DoubleList a() {
/* 33 */     return (DoubleList)this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */