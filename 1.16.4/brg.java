/*    */ import java.util.function.BiPredicate;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Stream;
/*    */ import java.util.stream.StreamSupport;
/*    */ import javax.annotation.Nullable;
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
/*    */ public interface brg
/*    */   extends brc
/*    */ {
/*    */   default boolean a(@Nullable aqa ☃, ddh ddh1) {
/* 25 */     return true;
/*    */   }
/*    */   
/*    */   default boolean a(ceh ☃, fx fx1, dcs dcs1) {
/* 29 */     ddh ddh = ☃.b(this, fx1, dcs1);
/* 30 */     return (ddh.b() || a(null, ddh.a(fx1.u(), fx1.v(), fx1.w())));
/*    */   }
/*    */   
/*    */   default boolean j(aqa ☃) {
/* 34 */     return a(☃, dde.a(☃.cc()));
/*    */   }
/*    */   
/*    */   default boolean b(dci ☃) {
/* 38 */     return b((aqa)null, ☃, ☃ -> true);
/*    */   }
/*    */   
/*    */   default boolean k(aqa ☃) {
/* 42 */     return b(☃, ☃.cc(), ☃ -> true);
/*    */   }
/*    */   
/*    */   default boolean a_(aqa ☃, dci dci1) {
/* 46 */     return b(☃, dci1, ☃ -> true);
/*    */   }
/*    */   
/*    */   default boolean b(@Nullable aqa ☃, dci dci1, Predicate<aqa> predicate) {
/* 50 */     return d(☃, dci1, predicate).allMatch(ddh::b);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   default Stream<ddh> d(@Nullable aqa ☃, dci dci1, Predicate<aqa> predicate) {
/* 56 */     return Stream.concat(
/* 57 */         b(☃, dci1), 
/* 58 */         c(☃, dci1, predicate));
/*    */   }
/*    */ 
/*    */   
/*    */   default Stream<ddh> b(@Nullable aqa ☃, dci dci1) {
/* 63 */     return StreamSupport.stream(new brh(this, ☃, dci1), false);
/*    */   }
/*    */   
/*    */   default boolean a(@Nullable aqa ☃, dci dci1, BiPredicate<ceh, fx> biPredicate) {
/* 67 */     return b(☃, dci1, biPredicate).allMatch(ddh::b);
/*    */   }
/*    */   
/*    */   default Stream<ddh> b(@Nullable aqa ☃, dci dci1, BiPredicate<ceh, fx> biPredicate) {
/* 71 */     return StreamSupport.stream(new brh(this, ☃, dci1, biPredicate), false);
/*    */   }
/*    */   
/*    */   cfu f();
/*    */   
/*    */   @Nullable
/*    */   brc c(int paramInt1, int paramInt2);
/*    */   
/*    */   Stream<ddh> c(@Nullable aqa paramaqa, dci paramdci, Predicate<aqa> paramPredicate);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */