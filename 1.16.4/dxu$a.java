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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements dyj<hc>
/*    */ {
/*    */   private final dyw a;
/*    */   
/*    */   public a(dyw ☃) {
/* 76 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public dyg a(hc ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 82 */     ceh ceh = ☃.c();
/* 83 */     if (!ceh.g() && ceh.h() == bzh.a) {
/* 84 */       return null;
/*    */     }
/*    */     
/* 87 */     fx fx = new fx(d1, d2, d3);
/* 88 */     int i = djz.C().al().a(ceh, dwt1, fx);
/* 89 */     if (ceh.b() instanceof bwo) {
/* 90 */       i = ((bwo)ceh.b()).c(ceh, dwt1, fx);
/*    */     }
/* 92 */     float f1 = (i >> 16 & 0xFF) / 255.0F;
/* 93 */     float f2 = (i >> 8 & 0xFF) / 255.0F;
/* 94 */     float f3 = (i & 0xFF) / 255.0F;
/*    */     
/* 96 */     return new dxu(dwt1, d1, d2, d3, f1, f2, f3, this.a, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */