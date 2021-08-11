/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Collections;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vj<T>
/*    */ {
/* 16 */   private static final Map<String, vj<?>> a = Collections.synchronizedMap(Maps.newIdentityHashMap());
/*    */   
/*    */   private final vk b;
/*    */   private final vk c;
/*    */   
/*    */   public static <T> vj<T> a(vj<? extends gm<T>> ☃, vk vk1) {
/* 22 */     return a(☃.c, vk1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T> vj<gm<T>> a(vk ☃) {
/* 29 */     return a(gm.d, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   private static <T> vj<T> a(vk ☃, vk vk1) {
/* 34 */     String str = (☃ + ":" + vk1).intern();
/* 35 */     return (vj<T>)a.computeIfAbsent(str, str -> new vj(☃, vk1));
/*    */   }
/*    */   
/*    */   private vj(vk ☃, vk vk1) {
/* 39 */     this.b = ☃;
/* 40 */     this.c = vk1;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 45 */     return "ResourceKey[" + this.b + " / " + this.c + ']';
/*    */   }
/*    */   
/*    */   public boolean a(vj<? extends gm<?>> ☃) {
/* 49 */     return this.b.equals(☃.a());
/*    */   }
/*    */   
/*    */   public vk a() {
/* 53 */     return this.c;
/*    */   }
/*    */   
/*    */   public static <T> Function<vk, vj<T>> b(vj<? extends gm<T>> ☃) {
/* 57 */     return vk1 -> a(☃, vk1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */