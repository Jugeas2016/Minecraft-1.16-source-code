/*    */ public enum djl
/*    */ {
/*    */   private static final djl[] d;
/*  4 */   a(true, false),
/*  5 */   b(false, false),
/*  6 */   c(false, true);
/*    */   
/*    */   static {
/*  9 */     d = values();
/*    */   }
/*    */   
/*    */   private boolean e;
/*    */   
/*    */   djl(boolean ☃, boolean bool1) {
/* 15 */     this.e = ☃;
/* 16 */     this.f = bool1;
/*    */   }
/*    */   private boolean f;
/*    */   public boolean a() {
/* 20 */     return this.e;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 24 */     return this.f;
/*    */   }
/*    */   
/*    */   public djl c() {
/* 28 */     return d[(ordinal() + 1) % d.length];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */