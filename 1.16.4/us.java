/*    */ 
/*    */ public class us<T>
/*    */ {
/*    */   private final int a;
/*    */   private final ut<T> b;
/*    */   
/*    */   public us(int ☃, ut<T> ut1) {
/*  8 */     this.a = ☃;
/*  9 */     this.b = ut1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 13 */     return this.a;
/*    */   }
/*    */   
/*    */   public ut<T> b() {
/* 17 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 22 */     if (this == ☃) {
/* 23 */       return true;
/*    */     }
/* 25 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 26 */       return false;
/*    */     }
/*    */     
/* 29 */     us<?> us1 = (us)☃;
/*    */     
/* 31 */     return (this.a == us1.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 36 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 41 */     return "<entity data: " + this.a + ">";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\us.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */