/*    */ 
/*    */ public class eap
/*    */ {
/*    */   private final long[] a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public eap(int ☃) {
/*  9 */     this.a = new long[☃];
/*    */   }
/*    */   
/*    */   public long a(long ☃) {
/* 13 */     if (this.b < this.a.length) {
/* 14 */       this.b++;
/*    */     }
/* 16 */     this.a[this.c] = ☃;
/* 17 */     this.c = (this.c + 1) % this.a.length;
/*    */     
/* 19 */     long l1 = Long.MAX_VALUE;
/* 20 */     long l2 = Long.MIN_VALUE;
/*    */     
/* 22 */     long l3 = 0L;
/* 23 */     for (int i = 0; i < this.b; i++) {
/* 24 */       long l = this.a[i];
/* 25 */       l3 += l;
/* 26 */       l1 = Math.min(l1, l);
/* 27 */       l2 = Math.max(l2, l);
/*    */     } 
/*    */     
/* 30 */     if (this.b > 2) {
/* 31 */       l3 -= l1 + l2;
/* 32 */       return l3 / (this.b - 2);
/*    */     } 
/*    */     
/* 35 */     if (l3 > 0L) {
/* 36 */       return this.b / l3;
/*    */     }
/* 38 */     return 0L;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */