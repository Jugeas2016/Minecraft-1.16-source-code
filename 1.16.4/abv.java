/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum abv
/*    */ {
/*  9 */   a("old"),
/* 10 */   b("new"),
/* 11 */   c("compatible");
/*    */   
/*    */   private final nr d;
/*    */   
/*    */   private final nr e;
/*    */   
/*    */   abv(String ☃) {
/* 18 */     this.d = (new of("pack.incompatible." + ☃)).a(k.h);
/* 19 */     this.e = new of("pack.incompatible.confirm." + ☃);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 23 */     return (this == c);
/*    */   }
/*    */   
/*    */   public static abv a(int ☃) {
/* 27 */     if (☃ < w.a().getPackVersion())
/* 28 */       return a; 
/* 29 */     if (☃ > w.a().getPackVersion()) {
/* 30 */       return b;
/*    */     }
/* 32 */     return c;
/*    */   }
/*    */ 
/*    */   
/*    */   public nr b() {
/* 37 */     return this.d;
/*    */   }
/*    */   
/*    */   public nr c() {
/* 41 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */