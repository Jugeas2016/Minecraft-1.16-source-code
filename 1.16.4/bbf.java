/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ public enum bbf
/*    */ {
/*  7 */   a(0),
/*  8 */   b(1),
/*  9 */   c(2),
/* 10 */   d(3),
/* 11 */   e(4); private static final bbf[] f;
/*    */   
/*    */   static {
/* 14 */     f = (bbf[])Arrays.<bbf>stream(values()).sorted(Comparator.comparingInt(bbf::a)).toArray(☃ -> new bbf[☃]);
/*    */   }
/*    */   private final int g;
/*    */   bbf(int ☃) {
/* 18 */     this.g = ☃;
/*    */   }
/*    */   
/*    */   public int a() {
/* 22 */     return this.g;
/*    */   }
/*    */   
/*    */   public static bbf a(int ☃) {
/* 26 */     return f[☃ % f.length];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */