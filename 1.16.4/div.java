/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*    */ 
/*    */ 
/*    */ public class div
/*    */ {
/*  7 */   private static final Long2ObjectMap<String> a = (Long2ObjectMap<String>)new Long2ObjectOpenHashMap();
/*    */   
/*    */   public static String a(long ☃) {
/* 10 */     return (String)a.get(☃);
/*    */   }
/*    */   
/*    */   public static void b(long ☃) {
/* 14 */     a.remove(☃);
/*    */   }
/*    */   
/*    */   public static void a(long ☃, String str) {
/* 18 */     a.put(☃, str);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\div.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */