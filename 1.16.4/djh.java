/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum djh
/*    */ {
/*    */   private static final djh[] d;
/*  9 */   a(0, "options.ao.off"),
/* 10 */   b(1, "options.ao.min"),
/* 11 */   c(2, "options.ao.max");
/*    */   
/*    */   static {
/* 14 */     d = (djh[])Arrays.<djh>stream(values()).sorted(Comparator.comparingInt(djh::a)).toArray(☃ -> new djh[☃]);
/*    */   }
/*    */   
/*    */   private final int e;
/*    */   
/*    */   djh(int ☃, String str1) {
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
/*    */   public static djh a(int ☃) {
/* 33 */     return d[afm.b(☃, d.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */