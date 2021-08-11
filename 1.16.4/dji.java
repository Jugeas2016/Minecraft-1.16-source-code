/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum dji
/*    */ {
/*    */   private static final dji[] d;
/*  9 */   a(0, "options.off"),
/* 10 */   b(1, "options.attack.crosshair"),
/* 11 */   c(2, "options.attack.hotbar");
/*    */   
/*    */   static {
/* 14 */     d = (dji[])Arrays.<dji>stream(values()).sorted(Comparator.comparingInt(dji::a)).toArray(☃ -> new dji[☃]);
/*    */   }
/*    */   
/*    */   private final int e;
/*    */   
/*    */   dji(int ☃, String str1) {
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
/*    */   public static dji a(int ☃) {
/* 33 */     return d[afm.b(☃, d.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */