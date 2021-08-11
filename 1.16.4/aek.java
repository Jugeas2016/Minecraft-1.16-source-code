/*    */ import com.google.common.collect.HashMultimap;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aek
/*    */ {
/* 13 */   private static final Map<vk, aej<?>> a = Maps.newHashMap();
/*    */   
/*    */   public static <T> aej<T> a(vk ☃, Function<aen, aem<T>> function) {
/* 16 */     aej<T> aej = new aej<>(function);
/* 17 */     aej<?> aej1 = a.putIfAbsent(☃, aej);
/* 18 */     if (aej1 != null) {
/* 19 */       throw new IllegalStateException("Duplicate entry for static tag collection: " + ☃);
/*    */     }
/* 21 */     return aej;
/*    */   }
/*    */   
/*    */   public static void a(aen ☃) {
/* 25 */     a.values().forEach(aej1 -> aej1.a(☃));
/*    */   }
/*    */   
/*    */   public static void a() {
/* 29 */     a.values().forEach(aej::a);
/*    */   }
/*    */   
/*    */   public static Multimap<vk, vk> b(aen ☃) {
/* 33 */     HashMultimap hashMultimap = HashMultimap.create();
/* 34 */     a.forEach((vk1, aej1) -> ☃.putAll(vk1, aej1.b(aen1)));
/* 35 */     return (Multimap<vk, vk>)hashMultimap;
/*    */   }
/*    */   
/*    */   public static void b() {
/* 39 */     aej[] ☃ = { aed.a, aeg.a, aef.a, aee.a };
/* 40 */     boolean bool = Stream.<aej>of(☃).anyMatch(☃ -> !a.containsValue(☃));
/* 41 */     if (bool)
/* 42 */       throw new IllegalStateException("Missing helper registrations"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */