/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum cfo
/*    */   implements afs
/*    */ {
/*  8 */   a("save"),
/*  9 */   b("load"),
/* 10 */   c("corner"),
/* 11 */   d("data");
/*    */   
/*    */   private final String e;
/*    */   
/*    */   private final nr f;
/*    */   
/*    */   cfo(String ☃) {
/* 18 */     this.e = ☃;
/* 19 */     this.f = new of("structure_block.mode_info." + ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 24 */     return this.e;
/*    */   }
/*    */   
/*    */   public nr b() {
/* 28 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */