/*    */ import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ 
/*    */ public class ddc
/*    */   extends AbstractDoubleList
/*    */   implements dcz {
/*    */   private final DoubleList a;
/*    */   private final DoubleList b;
/*    */   private final boolean c;
/*    */   
/*    */   public ddc(DoubleList ☃, DoubleList doubleList1, boolean bool) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = doubleList1;
/* 14 */     this.c = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public int size() {
/* 19 */     return this.a.size() + this.b.size();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(dcz.a ☃) {
/* 24 */     if (this.c) {
/* 25 */       return b((i, j, k) -> ☃.merge(j, i, k));
/*    */     }
/* 27 */     return b(☃);
/*    */   }
/*    */   
/*    */   private boolean b(dcz.a ☃) {
/* 31 */     int i = this.a.size() - 1; int j;
/* 32 */     for (j = 0; j < i; j++) {
/* 33 */       if (!☃.merge(j, -1, j)) {
/* 34 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 38 */     if (!☃.merge(i, -1, i)) {
/* 39 */       return false;
/*    */     }
/*    */     
/* 42 */     for (j = 0; j < this.b.size(); j++) {
/* 43 */       if (!☃.merge(i, j, i + 1 + j)) {
/* 44 */         return false;
/*    */       }
/*    */     } 
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getDouble(int ☃) {
/* 52 */     if (☃ < this.a.size()) {
/* 53 */       return this.a.getDouble(☃);
/*    */     }
/* 55 */     return this.b.getDouble(☃ - this.a.size());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public DoubleList a() {
/* 61 */     return (DoubleList)this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */