/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aud
/*    */   extends arv<aqn>
/*    */ {
/*    */   private final float b;
/*    */   
/*    */   public aud(float ☃) {
/* 15 */     super((Map<ayd<?>, aye>)ImmutableMap.of());
/* 16 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqn aqn1) {
/* 21 */     return ((aqn1.aE() && aqn1.b(aef.b) > aqn1.cx()) || aqn1.aQ());
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqn aqn1, long l) {
/* 26 */     return a(☃, aqn1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(aag ☃, aqn aqn1, long l) {
/* 31 */     if (aqn1.cY().nextFloat() < this.b)
/* 32 */       aqn1.v().a(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */