/*    */ public abstract class biq {
/*    */   private int a;
/*    */   
/*    */   public static biq a(bil ☃, int i) {
/*  5 */     return new biq(☃, i)
/*    */       {
/*    */         public int b() {
/*  8 */           return this.a.a(this.b);
/*    */         }
/*    */ 
/*    */         
/*    */         public void a(int ☃) {
/* 13 */           this.a.a(this.b, ☃);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   public static biq a(int[] ☃, int i) {
/* 19 */     return new biq(☃, i)
/*    */       {
/*    */         public int b() {
/* 22 */           return this.a[this.b];
/*    */         }
/*    */ 
/*    */         
/*    */         public void a(int ☃) {
/* 27 */           this.a[this.b] = ☃;
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   public static biq a() {
/* 33 */     return new biq()
/*    */       {
/*    */         private int a;
/*    */         
/*    */         public int b() {
/* 38 */           return this.a;
/*    */         }
/*    */ 
/*    */         
/*    */         public void a(int ☃) {
/* 43 */           this.a = ☃;
/*    */         }
/*    */       };
/*    */   }
/*    */ 
/*    */   
/*    */   public abstract int b();
/*    */ 
/*    */   
/*    */   public abstract void a(int paramInt);
/*    */   
/*    */   public boolean c() {
/* 55 */     int ☃ = b();
/* 56 */     boolean bool = (☃ != this.a);
/* 57 */     this.a = ☃;
/* 58 */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\biq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */