/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asn
/*    */   extends arv<aqu>
/*    */ {
/*    */   private final float b;
/*    */   
/*    */   public asn(float ☃) {
/* 20 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.b));
/* 21 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqu aqu1) {
/* 26 */     return !☃.e(aqu1.cB());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqu aqu1, long l) {
/* 31 */     fx fx = aqu1.cB();
/* 32 */     List<fx> list = (List<fx>)fx.b(fx.b(-1, -1, -1), fx.b(1, 1, 1)).map(fx::h).collect(Collectors.toList());
/* 33 */     Collections.shuffle(list);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 40 */     Optional<fx> optional = list.stream().filter(fx1 -> !☃.e(fx1)).filter(fx1 -> ☃.a(fx1, aqu1)).filter(fx1 -> ☃.k(aqu1)).findFirst();
/*    */     
/* 42 */     optional.ifPresent(fx1 -> ☃.cJ().a(ayd.m, new ayf(fx1, this.b, 0)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */