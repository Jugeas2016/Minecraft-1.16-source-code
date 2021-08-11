/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ejr
/*    */   implements AutoCloseable
/*    */ {
/*    */   private final Map<vk, ekb> a;
/*    */   
/*    */   public ejr(Collection<ekb> ☃) {
/* 15 */     this.a = (Map<vk, ekb>)☃.stream().collect(Collectors.toMap(ekb::g, Function.identity()));
/*    */   }
/*    */   
/*    */   public ekb a(vk ☃) {
/* 19 */     return this.a.get(☃);
/*    */   }
/*    */   
/*    */   public ekc a(elr ☃) {
/* 23 */     return ((ekb)this.a.get(☃.a())).a(☃.b());
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() {
/* 28 */     this.a.values().forEach(ekb::f);
/* 29 */     this.a.clear();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */