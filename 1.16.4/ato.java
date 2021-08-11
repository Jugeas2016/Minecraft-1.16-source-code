/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ato
/*    */   extends arv<aqm>
/*    */ {
/*    */   public ato() {
/* 12 */     super((Map<ayd<?>, aye>)ImmutableMap.of());
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 17 */     return (☃.t.nextInt(20) == 0);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 22 */     arf<?> arf = aqm1.cJ();
/* 23 */     bhb bhb = ☃.b_(aqm1.cB());
/*    */     
/* 25 */     if (bhb != null)
/*    */     {
/* 27 */       if (!bhb.c() || bhb.b()) {
/* 28 */         arf.b(bhf.i);
/* 29 */         arf.a(bhf.i);
/*    */       } else {
/* 31 */         arf.b(bhf.h);
/* 32 */         arf.a(bhf.h);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ato.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */