/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/* 53 */   a("this", dbc.a),
/* 54 */   b("killer", dbc.d),
/* 55 */   c("killer_player", dbc.b),
/* 56 */   d("block_entity", dbc.h);
/*    */   
/*    */   public final String e;
/*    */   public final daz<?> f;
/*    */   
/*    */   a(String ☃, daz<?> daz1) {
/* 62 */     this.e = ☃;
/* 63 */     this.f = daz1;
/*    */   }
/*    */   
/*    */   public static a a(String ☃) {
/* 67 */     for (a a1 : values()) {
/* 68 */       if (a1.e.equals(☃)) {
/* 69 */         return a1;
/*    */       }
/*    */     } 
/* 72 */     throw new IllegalArgumentException("Invalid name source " + ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\daa$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */