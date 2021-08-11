/*    */ import com.google.common.collect.Streams;
/*    */ import java.util.List;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ebp
/*    */   implements ebq
/*    */ {
/*    */   private final Iterable<? extends ebq> c;
/*    */   
/*    */   public ebp(Iterable<? extends ebq> ☃) {
/* 18 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public Predicate<ceh> getPredicate(cei<buo, ceh> ☃) {
/* 23 */     List<Predicate<ceh>> list = (List<Predicate<ceh>>)Streams.stream(this.c).map(ebq1 -> ebq1.getPredicate(☃)).collect(Collectors.toList());
/*    */     
/* 25 */     return ceh1 -> ☃.stream().allMatch(());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */