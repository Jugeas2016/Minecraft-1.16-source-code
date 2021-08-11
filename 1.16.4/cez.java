/*    */ 
/*    */ public enum cez
/*    */   implements afs
/*    */ {
/*    */   public static final cez[] d;
/*  6 */   a("single", 0),
/*  7 */   b("left", 2),
/*  8 */   c("right", 1);
/*    */   
/*    */   static {
/* 11 */     d = values();
/*    */   }
/*    */   
/*    */   private final String e;
/*    */   
/*    */   cez(String ☃, int i) {
/* 17 */     this.e = ☃;
/* 18 */     this.f = i;
/*    */   }
/*    */   private final int f;
/*    */   
/*    */   public String a() {
/* 23 */     return this.e;
/*    */   }
/*    */   
/*    */   public cez b() {
/* 27 */     return d[this.f];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cez.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */