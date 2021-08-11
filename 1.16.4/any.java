/*    */ public final class any
/*    */   implements Comparable<any>
/*    */ {
/*    */   public final double a;
/*    */   public final double b;
/*    */   public final long c;
/*    */   public final String d;
/*    */   
/*    */   public any(String ☃, double d1, double d2, long l) {
/* 10 */     this.d = ☃;
/* 11 */     this.a = d1;
/* 12 */     this.b = d2;
/* 13 */     this.c = l;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(any ☃) {
/* 18 */     if (☃.a < this.a) {
/* 19 */       return -1;
/*    */     }
/* 21 */     if (☃.a > this.a) {
/* 22 */       return 1;
/*    */     }
/* 24 */     return ☃.d.compareTo(this.d);
/*    */   }
/*    */   
/*    */   public int a() {
/* 28 */     return (this.d.hashCode() & 0xAAAAAA) + 4473924;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\any.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */