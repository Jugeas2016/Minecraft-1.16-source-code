/*    */ 
/*    */ public enum aqf
/*    */ {
/*  4 */   a(a.a, 0, 0, "mainhand"),
/*  5 */   b(a.a, 1, 5, "offhand"),
/*  6 */   c(a.b, 0, 1, "feet"),
/*  7 */   d(a.b, 1, 2, "legs"),
/*  8 */   e(a.b, 2, 3, "chest"),
/*  9 */   f(a.b, 3, 4, "head");
/*    */   
/*    */   private final a g;
/*    */   private final int h;
/*    */   private final int i;
/*    */   private final String j;
/*    */   
/*    */   aqf(a ☃, int i, int j, String str1) {
/* 17 */     this.g = ☃;
/* 18 */     this.h = i;
/* 19 */     this.i = j;
/* 20 */     this.j = str1;
/*    */   }
/*    */   
/*    */   public a a() {
/* 24 */     return this.g;
/*    */   }
/*    */   
/*    */   public int b() {
/* 28 */     return this.h;
/*    */   }
/*    */   
/*    */   public int c() {
/* 32 */     return this.i;
/*    */   }
/*    */   
/*    */   public String d() {
/* 36 */     return this.j;
/*    */   }
/*    */   
/*    */   public enum a {
/* 40 */     a,
/* 41 */     b;
/*    */   }
/*    */   
/*    */   public static aqf a(String ☃) {
/* 45 */     for (aqf aqf1 : values()) {
/* 46 */       if (aqf1.d().equals(☃)) {
/* 47 */         return aqf1;
/*    */       }
/*    */     } 
/*    */     
/* 51 */     throw new IllegalArgumentException("Invalid slot '" + ☃ + "'");
/*    */   }
/*    */   
/*    */   public static aqf a(a ☃, int i) {
/* 55 */     for (aqf aqf1 : values()) {
/* 56 */       if (aqf1.a() == ☃ && aqf1.b() == i) {
/* 57 */         return aqf1;
/*    */       }
/*    */     } 
/*    */     
/* 61 */     throw new IllegalArgumentException("Invalid slot '" + ☃ + "': " + i);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */