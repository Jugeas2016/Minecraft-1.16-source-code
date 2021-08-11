/*    */ 
/*    */ 
/*    */ 
/*    */ public class afc
/*    */ {
/*  6 */   private final long[] a = new long[240];
/*    */   
/*    */   private int b;
/*    */   
/*    */   private int c;
/*    */   
/*    */   private int d;
/*    */   
/*    */   public void a(long ☃) {
/* 15 */     this.a[this.d] = ☃;
/*    */     
/* 17 */     this.d++;
/* 18 */     if (this.d == 240) {
/* 19 */       this.d = 0;
/*    */     }
/*    */     
/* 22 */     if (this.c < 240) {
/* 23 */       this.b = 0;
/* 24 */       this.c++;
/*    */     } else {
/* 26 */       this.b = b(this.d + 1);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(long ☃, int i, int j) {
/* 47 */     double d = ☃ / (1000000000L / j);
/* 48 */     return (int)(d * i);
/*    */   }
/*    */   
/*    */   public int a() {
/* 52 */     return this.b;
/*    */   }
/*    */   
/*    */   public int b() {
/* 56 */     return this.d;
/*    */   }
/*    */   
/*    */   public int b(int ☃) {
/* 60 */     return ☃ % 240;
/*    */   }
/*    */   
/*    */   public long[] c() {
/* 64 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */