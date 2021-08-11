/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Spliterator;
/*    */ import java.util.Spliterators;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.stream.Stream;
/*    */ import java.util.stream.StreamSupport;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afo<T>
/*    */ {
/* 16 */   private final List<T> a = Lists.newArrayList();
/*    */   private final Spliterator<T> b;
/*    */   
/*    */   public afo(Stream<T> ☃) {
/* 20 */     this.b = ☃.spliterator();
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<T> a() {
/* 25 */     return StreamSupport.stream(new Spliterators.AbstractSpliterator<T>(this, Long.MAX_VALUE, 0)
/*    */         {
/*    */           private int b;
/*    */           
/*    */           public boolean tryAdvance(Consumer<? super T> ☃) {
/* 30 */             while (this.b >= afo.a(this.a).size()) {
/* 31 */               if (!afo.b(this.a).tryAdvance(afo.a(this.a)::add)) {
/* 32 */                 return false;
/*    */               }
/*    */             } 
/* 35 */             ☃.accept(afo.a(this.a).get(this.b++));
/* 36 */             return true;
/*    */           }
/*    */         }false);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */