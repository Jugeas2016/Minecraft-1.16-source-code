/*    */ 
/*    */ public enum no
/*    */ {
/*  4 */   a((byte)0, false),
/*  5 */   b((byte)1, true),
/*  6 */   c((byte)2, true);
/*    */   
/*    */   private final byte d;
/*    */   
/*    */   private final boolean e;
/*    */   
/*    */   no(byte ☃, boolean bool) {
/* 13 */     this.d = ☃;
/* 14 */     this.e = bool;
/*    */   }
/*    */   
/*    */   public byte a() {
/* 18 */     return this.d;
/*    */   }
/*    */   
/*    */   public static no a(byte ☃) {
/* 22 */     for (no no1 : values()) {
/* 23 */       if (☃ == no1.d) {
/* 24 */         return no1;
/*    */       }
/*    */     } 
/* 27 */     return a;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 31 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\no.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */