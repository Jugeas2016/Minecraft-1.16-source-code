/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum dkb
/*    */ {
/*    */   private static final dkb[] e;
/* 11 */   a(0, "options.narrator.off"),
/* 12 */   b(1, "options.narrator.all"),
/* 13 */   c(2, "options.narrator.chat"),
/* 14 */   d(3, "options.narrator.system");
/*    */   
/*    */   static {
/* 17 */     e = (dkb[])Arrays.<dkb>stream(values()).sorted(Comparator.comparingInt(dkb::a)).toArray(☃ -> new dkb[☃]);
/*    */   }
/*    */   
/*    */   private final int f;
/*    */   
/*    */   dkb(int ☃, String str1) {
/* 23 */     this.f = ☃;
/* 24 */     this.g = new of(str1);
/*    */   }
/*    */   private final nr g;
/*    */   public int a() {
/* 28 */     return this.f;
/*    */   }
/*    */   
/*    */   public nr b() {
/* 32 */     return this.g;
/*    */   }
/*    */   
/*    */   public static dkb a(int ☃) {
/* 36 */     return e[afm.b(☃, e.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */