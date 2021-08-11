/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import java.util.Set;
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
/*    */ public class ayq
/*    */   extends azb<aqm>
/*    */ {
/*    */   public ayq() {
/* 22 */     this(200);
/*    */   }
/*    */   
/*    */   public ayq(int ☃) {
/* 26 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1) {
/* 31 */     a(aqm1);
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<ayd<?>> a() {
/* 36 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.g);
/*    */   }
/*    */   
/*    */   public static void a(aqm ☃) {
/* 40 */     Optional<List<aqm>> optional = ☃.cJ().c(ayd.g);
/* 41 */     if (!optional.isPresent()) {
/*    */       return;
/*    */     }
/*    */     
/* 45 */     boolean bool = ((List)optional.get()).stream().anyMatch(☃ -> ☃.X().equals(aqe.K));
/*    */     
/* 47 */     if (bool) {
/* 48 */       b(☃);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void b(aqm ☃) {
/* 53 */     ☃.cJ().a(ayd.E, Boolean.valueOf(true), 600L);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */