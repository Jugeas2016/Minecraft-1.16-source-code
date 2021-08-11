/*    */ import java.util.Locale;
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
/*    */ enum a
/*    */ {
/*    */   private static final a[] e;
/* 65 */   a,
/* 66 */   b,
/* 67 */   c,
/* 68 */   d;
/*    */   static {
/* 70 */     e = values();
/*    */   }
/*    */   private static a b(String ☃) {
/* 73 */     for (a a1 : e) {
/* 74 */       if (☃.equalsIgnoreCase(a1.name())) {
/* 75 */         return a1;
/*    */       }
/*    */     } 
/* 78 */     return a;
/*    */   }
/*    */   
/*    */   public String a() {
/* 82 */     return name().toLowerCase(Locale.ROOT);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */