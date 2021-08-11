/*    */ import java.util.Arrays;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum djt
/*    */ {
/*    */   private static final djt[] d;
/*  9 */   a(0, "options.graphics.fast"),
/* 10 */   b(1, "options.graphics.fancy"),
/* 11 */   c(2, "options.graphics.fabulous");
/*    */   
/*    */   static {
/* 14 */     d = (djt[])Arrays.<djt>stream(values()).sorted(Comparator.comparingInt(djt::a)).toArray(☃ -> new djt[☃]);
/*    */   }
/*    */   
/*    */   private final int e;
/*    */   
/*    */   djt(int ☃, String str1) {
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
/*    */   public djt c() {
/* 33 */     return a(a() + 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 38 */     switch (null.a[ordinal()]) {
/*    */       case 1:
/* 40 */         return "fast";
/*    */       case 2:
/* 42 */         return "fancy";
/*    */       case 3:
/* 44 */         return "fabulous";
/*    */     } 
/* 46 */     throw new IllegalArgumentException();
/*    */   }
/*    */   
/*    */   public static djt a(int ☃) {
/* 50 */     return d[afm.b(☃, d.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */