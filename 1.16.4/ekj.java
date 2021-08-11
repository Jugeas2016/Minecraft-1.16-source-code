/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ekj
/*    */ {
/*  8 */   private static final vk a = new vk("textures/entity/steve.png");
/*  9 */   private static final vk b = new vk("textures/entity/alex.png");
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static vk a() {
/* 15 */     return a;
/*    */   }
/*    */   
/*    */   public static vk a(UUID ☃) {
/* 19 */     if (c(☃)) {
/* 20 */       return b;
/*    */     }
/* 22 */     return a;
/*    */   }
/*    */   
/*    */   public static String b(UUID ☃) {
/* 26 */     if (c(☃)) {
/* 27 */       return "slim";
/*    */     }
/* 29 */     return "default";
/*    */   }
/*    */   
/*    */   private static boolean c(UUID ☃) {
/* 33 */     return ((☃.hashCode() & 0x1) == 1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */