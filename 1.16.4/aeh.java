/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aeh
/*    */ {
/*    */   private static volatile aen a;
/*    */   
/*    */   static {
/* 12 */     a = aen.a(
/* 13 */         aem.a((Map<vk, ael<buo>>)aed.b().stream().collect(Collectors.toMap(ael.e::a, ☃ -> ☃))), 
/* 14 */         aem.a((Map<vk, ael<blx>>)aeg.b().stream().collect(Collectors.toMap(ael.e::a, ☃ -> ☃))), 
/* 15 */         aem.a((Map<vk, ael<cuw>>)aef.b().stream().collect(Collectors.toMap(ael.e::a, ☃ -> ☃))), 
/* 16 */         aem.a((Map<vk, ael<aqe<?>>>)aee.b().stream().collect(Collectors.toMap(ael.e::a, ☃ -> ☃))));
/*    */   }
/*    */   
/*    */   public static aen a() {
/* 20 */     return a;
/*    */   }
/*    */   
/*    */   public static void a(aen ☃) {
/* 24 */     a = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aeh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */