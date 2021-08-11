/*    */ import java.util.BitSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cgx
/*    */ {
/* 10 */   private final BitSet a = new BitSet();
/*    */   
/*    */   public void a(int ☃, int i) {
/* 13 */     this.a.set(☃, ☃ + i);
/*    */   }
/*    */   
/*    */   public void b(int ☃, int i) {
/* 17 */     this.a.clear(☃, ☃ + i);
/*    */   }
/*    */   
/*    */   public int a(int ☃) {
/* 21 */     int i = 0;
/*    */     while (true) {
/* 23 */       int j = this.a.nextClearBit(i);
/* 24 */       int k = this.a.nextSetBit(j);
/* 25 */       if (k == -1 || k - j >= ☃) {
/* 26 */         a(j, ☃);
/* 27 */         return j;
/*    */       } 
/* 29 */       i = k;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */