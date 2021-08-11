/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ase<E extends aqm>
/*    */   extends arv<E>
/*    */ {
/*    */   private final Predicate<E> b;
/*    */   private final ayd<?> c;
/*    */   
/*    */   public ase(Predicate<E> ☃, ayd<?> ayd1) {
/* 17 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd1, aye.a));
/*    */ 
/*    */     
/* 20 */     this.b = ☃;
/* 21 */     this.c = ayd1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, E e) {
/* 26 */     return this.b.test(e);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, E e, long l) {
/* 31 */     e.cJ().b(this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */