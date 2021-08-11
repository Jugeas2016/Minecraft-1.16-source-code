/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ public enum bbk
/*    */ {
/*  7 */   a(0),
/*  8 */   b(1),
/*  9 */   c(2),
/* 10 */   d(3),
/* 11 */   e(4),
/* 12 */   f(5),
/* 13 */   g(6); private static final bbk[] h;
/*    */   
/*    */   static {
/* 16 */     h = (bbk[])Arrays.<bbk>stream(values()).sorted(Comparator.comparingInt(bbk::a)).toArray(☃ -> new bbk[☃]);
/*    */   }
/*    */   private final int i;
/*    */   bbk(int ☃) {
/* 20 */     this.i = ☃;
/*    */   }
/*    */   
/*    */   public int a() {
/* 24 */     return this.i;
/*    */   }
/*    */   
/*    */   public static bbk a(int ☃) {
/* 28 */     return h[☃ % h.length];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */