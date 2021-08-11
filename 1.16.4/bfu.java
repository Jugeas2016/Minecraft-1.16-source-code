/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum bfu
/*    */ {
/*  9 */   a(0, "options.chat.visibility.full"),
/* 10 */   b(1, "options.chat.visibility.system"),
/* 11 */   c(2, "options.chat.visibility.hidden"); private static final bfu[] d;
/*    */   static {
/* 13 */     d = (bfu[])Arrays.<bfu>stream(values()).sorted(Comparator.comparingInt(bfu::a)).toArray(☃ -> new bfu[☃]);
/*    */   }
/*    */   private final int e; private final String f;
/*    */   
/*    */   bfu(int ☃, String str1) {
/* 18 */     this.e = ☃;
/* 19 */     this.f = str1;
/*    */   }
/*    */   
/*    */   public int a() {
/* 23 */     return this.e;
/*    */   }
/*    */   
/*    */   public String b() {
/* 27 */     return this.f;
/*    */   }
/*    */   
/*    */   public static bfu a(int ☃) {
/* 31 */     return d[afm.b(☃, d.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */