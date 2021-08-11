/*    */ import java.util.Properties;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
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
/*    */ public class a<V>
/*    */   implements Supplier<V>
/*    */ {
/*    */   private final String b;
/*    */   private final V c;
/*    */   private final Function<V, String> d;
/*    */   
/*    */   private a(zk ☃, String str, V v, Function<V, String> function) {
/* 28 */     this.b = str;
/* 29 */     this.c = v;
/* 30 */     this.d = function;
/*    */   }
/*    */ 
/*    */   
/*    */   public V get() {
/* 35 */     return this.c;
/*    */   }
/*    */   
/*    */   public T a(gn ☃, V v) {
/* 39 */     Properties properties = this.a.a();
/* 40 */     properties.put(this.b, this.d.apply(v));
/* 41 */     return (T)this.a.b(☃, properties);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */