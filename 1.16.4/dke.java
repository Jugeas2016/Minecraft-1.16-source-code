/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum dke
/*    */ {
/*    */   private static final dke[] d;
/*  9 */   a(0, "options.particles.all"),
/* 10 */   b(1, "options.particles.decreased"),
/* 11 */   c(2, "options.particles.minimal");
/*    */   
/*    */   static {
/* 14 */     d = (dke[])Arrays.<dke>stream(values()).sorted(Comparator.comparingInt(dke::b)).toArray(☃ -> new dke[☃]);
/*    */   }
/*    */   
/*    */   private final int e;
/*    */   
/*    */   dke(int ☃, String str1) {
/* 20 */     this.e = ☃;
/* 21 */     this.f = str1;
/*    */   }
/*    */   private final String f;
/*    */   public String a() {
/* 25 */     return this.f;
/*    */   }
/*    */   
/*    */   public int b() {
/* 29 */     return this.e;
/*    */   }
/*    */   
/*    */   public static dke a(int ☃) {
/* 33 */     return d[afm.b(☃, d.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dke.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */