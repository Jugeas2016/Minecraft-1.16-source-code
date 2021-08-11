/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ol
/*    */ {
/* 11 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   public static <T extends ni> void a(oj<T> ☃, T t, aag aag1) throws vu {
/* 14 */     a(☃, t, (aob<?>)aag1.l());
/*    */   }
/*    */   
/*    */   public static <T extends ni> void a(oj<T> ☃, T t, aob<?> aob1) throws vu {
/* 18 */     if (!aob1.bh()) {
/* 19 */       aob1.execute(() -> {
/*    */             if (☃.a().h()) {
/*    */               oj1.a(☃);
/*    */             } else {
/*    */               a.debug("Ignoring packet due to disconnection: " + oj1);
/*    */             } 
/*    */           });
/* 26 */       throw vu.a;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */