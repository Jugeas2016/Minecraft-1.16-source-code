/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ai
/*    */ {
/*  8 */   a("task", 0, k.k),
/*  9 */   b("challenge", 26, k.f),
/* 10 */   c("goal", 52, k.k);
/*    */   
/*    */   private final String d;
/*    */   
/*    */   private final int e;
/*    */   private final k f;
/*    */   private final nr g;
/*    */   
/*    */   ai(String ☃, int i, k k1) {
/* 19 */     this.d = ☃;
/* 20 */     this.e = i;
/* 21 */     this.f = k1;
/* 22 */     this.g = new of("advancements.toast." + ☃);
/*    */   }
/*    */   
/*    */   public String a() {
/* 26 */     return this.d;
/*    */   }
/*    */   
/*    */   public int b() {
/* 30 */     return this.e;
/*    */   }
/*    */   
/*    */   public static ai a(String ☃) {
/* 34 */     for (ai ai1 : values()) {
/* 35 */       if (ai1.d.equals(☃)) {
/* 36 */         return ai1;
/*    */       }
/*    */     } 
/* 39 */     throw new IllegalArgumentException("Unknown frame type '" + ☃ + "'");
/*    */   }
/*    */   
/*    */   public k c() {
/* 43 */     return this.f;
/*    */   }
/*    */   
/*    */   public nr d() {
/* 47 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */