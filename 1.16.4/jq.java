/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jq
/*    */   implements jp.a
/*    */ {
/* 14 */   private static final Logger a = LogManager.getLogger();
/*    */ 
/*    */   
/*    */   public md a(String ☃, md md1) {
/* 18 */     if (☃.startsWith("data/minecraft/structures/")) {
/* 19 */       return b(☃, a(md1));
/*    */     }
/* 21 */     return md1;
/*    */   }
/*    */   
/*    */   private static md a(md ☃) {
/* 25 */     if (!☃.c("DataVersion", 99)) {
/* 26 */       ☃.b("DataVersion", 500);
/*    */     }
/* 28 */     return ☃;
/*    */   }
/*    */   
/*    */   private static md b(String ☃, md md1) {
/* 32 */     ctb ctb = new ctb();
/* 33 */     int i = md1.h("DataVersion");
/* 34 */     int j = 2532;
/* 35 */     if (i < 2532) {
/* 36 */       a.warn("SNBT Too old, do not forget to update: " + i + " < " + '৤' + ": " + ☃);
/*    */     }
/* 38 */     md md2 = mp.a(agb.a(), aga.f, md1, i);
/* 39 */     ctb.b(md2);
/* 40 */     return ctb.a(new md());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */