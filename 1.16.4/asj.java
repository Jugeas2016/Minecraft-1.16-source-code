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
/*    */ public class asj
/*    */   extends arv<bfj>
/*    */ {
/*    */   private final float b;
/*    */   private final int c;
/*    */   
/*    */   public asj(float ☃, int i) {
/* 20 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.b));
/*    */ 
/*    */     
/* 23 */     this.b = ☃;
/* 24 */     this.c = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1) {
/* 29 */     return !☃.a_(bfj1.cB());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1, long l) {
/* 34 */     azo azo = ☃.y();
/* 35 */     int i = azo.a(gp.a(bfj1.cB()));
/*    */     
/* 37 */     dcn dcn = null;
/* 38 */     for (int j = 0; j < 5; j++) {
/* 39 */       dcn dcn1 = azj.a(bfj1, 15, 7, fx1 -> -☃.b(gp.a(fx1)));
/* 40 */       if (dcn1 != null) {
/*    */ 
/*    */ 
/*    */         
/* 44 */         int k = azo.a(gp.a(new fx(dcn1)));
/* 45 */         if (k < i) {
/* 46 */           dcn = dcn1; break;
/*    */         } 
/* 48 */         if (k == i) {
/* 49 */           dcn = dcn1;
/*    */         }
/*    */       } 
/*    */     } 
/* 53 */     if (dcn != null)
/* 54 */       bfj1.cJ().a(ayd.m, new ayf(dcn, this.b, this.c)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */