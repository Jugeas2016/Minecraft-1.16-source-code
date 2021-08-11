/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
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
/*    */ public class a<T1 extends Comparable<T1>>
/*    */   extends ip
/*    */ {
/*    */   private final cfj<T1> a;
/*    */   
/*    */   private a(cfj<T1> ☃) {
/* 69 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<cfj<?>> b() {
/* 74 */     return (List<cfj<?>>)ImmutableList.of(this.a);
/*    */   }
/*    */   
/*    */   public a<T1> a(T1 ☃, List<ir> list) {
/* 78 */     iq iq = iq.a((cfj.a<?>[])new cfj.a[] { this.a
/* 79 */           .b(☃) });
/*    */     
/* 81 */     a(iq, list);
/* 82 */     return this;
/*    */   }
/*    */   
/*    */   public a<T1> a(T1 ☃, ir ir1) {
/* 86 */     return a(☃, Collections.singletonList(ir1));
/*    */   }
/*    */   
/*    */   public ip a(Function<T1, ir> ☃) {
/* 90 */     this.a.a().forEach(comparable -> a((T1)comparable, ☃.apply(comparable)));
/*    */ 
/*    */     
/* 93 */     return this;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ip$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */