/*    */ 
/*    */ public class cgl
/*    */ {
/*    */   public final byte[] a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   
/*    */   public cgl(byte[] ☃, int i) {
/*  9 */     this.a = ☃;
/* 10 */     this.b = i;
/* 11 */     this.c = i + 4;
/*    */   }
/*    */   
/*    */   public int a(int ☃, int i, int j) {
/* 15 */     int k = ☃ << this.c | j << this.b | i;
/* 16 */     int m = k >> 1;
/* 17 */     int n = k & 0x1;
/*    */     
/* 19 */     if (n == 0) {
/* 20 */       return this.a[m] & 0xF;
/*    */     }
/* 22 */     return this.a[m] >> 4 & 0xF;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */