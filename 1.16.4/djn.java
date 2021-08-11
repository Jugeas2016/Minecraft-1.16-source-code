/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum djn
/*    */ {
/*    */   private static final djn[] d;
/*  9 */   a(0, "options.off"),
/* 10 */   b(1, "options.clouds.fast"),
/* 11 */   c(2, "options.clouds.fancy");
/*    */   
/*    */   static {
/* 14 */     d = (djn[])Arrays.<djn>stream(values()).sorted(Comparator.comparingInt(djn::a)).toArray(☃ -> new djn[☃]);
/*    */   }
/*    */   
/*    */   private final int e;
/*    */   
/*    */   djn(int ☃, String str1) {
/* 20 */     this.e = ☃;
/* 21 */     this.f = str1;
/*    */   }
/*    */   private final String f;
/*    */   public int a() {
/* 25 */     return this.e;
/*    */   }
/*    */   
/*    */   public String b() {
/* 29 */     return this.f;
/*    */   }
/*    */   
/*    */   public static djn a(int ☃) {
/* 33 */     return d[afm.b(☃, d.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */