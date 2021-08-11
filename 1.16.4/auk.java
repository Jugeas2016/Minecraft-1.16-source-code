/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auk
/*    */   extends arv<bfj>
/*    */ {
/*    */   public auk() {
/* 16 */     super((Map<ayd<?>, aye>)ImmutableMap.of());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1, long l) {
/* 21 */     boolean bool = (aun.b(bfj1) || aun.a(bfj1) || a(bfj1));
/* 22 */     if (!bool) {
/* 23 */       bfj1.cJ().b(ayd.x);
/* 24 */       bfj1.cJ().b(ayd.y);
/* 25 */       bfj1.cJ().a(☃.U(), ☃.T());
/*    */     } 
/*    */   }
/*    */   
/*    */   private static boolean a(bfj ☃) {
/* 30 */     return ☃.cJ().<aqm>c(ayd.y)
/* 31 */       .filter(aqm1 -> (aqm1.h(☃) <= 36.0D))
/* 32 */       .isPresent();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\auk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */