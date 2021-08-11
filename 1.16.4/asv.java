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
/*    */ 
/*    */ 
/*    */ public class asv
/*    */   extends arv<aqn>
/*    */ {
/*    */   private final int b;
/*    */   
/*    */   public asv(int ☃) {
/* 20 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.c, ayd.o, aye.a, ayd.p, aye.b));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqn aqn1) {
/* 30 */     aqm aqm = b(aqn1);
/* 31 */     return (!a(aqn1) && 
/* 32 */       arw.c(aqn1, aqm) && 
/* 33 */       arw.b(aqn1, aqm));
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean a(aqn ☃) {
/* 38 */     return ☃.a(blx1 -> (blx1 instanceof bmo && ☃.a((bmo)blx1)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqn aqn1, long l) {
/* 43 */     aqm aqm = b(aqn1);
/* 44 */     arw.a(aqn1, aqm);
/* 45 */     aqn1.a(aot.a);
/* 46 */     aqn1.B(aqm);
/* 47 */     aqn1.cJ().a(ayd.p, Boolean.valueOf(true), this.b);
/*    */   }
/*    */   
/*    */   private aqm b(aqn ☃) {
/* 51 */     return ☃.cJ().<aqm>c(ayd.o).get();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */