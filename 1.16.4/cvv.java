/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ public class cvv
/*    */ {
/* 15 */   private static final Logger a = LogManager.getLogger();
/*    */   private final cvh b;
/*    */   
/*    */   public cvv(cvg<cvh> ☃) {
/* 19 */     this.b = ☃.make();
/*    */   }
/*    */   
/*    */   public bsv a(gm<bsv> ☃, int i, int j) {
/* 23 */     int k = this.b.a(i, j);
/* 24 */     vj<bsv> vj = kt.a(k);
/* 25 */     if (vj == null) {
/* 26 */       throw new IllegalStateException("Unknown biome id emitted by layers: " + k);
/*    */     }
/*    */     
/* 29 */     bsv bsv = ☃.a(vj);
/*    */     
/* 31 */     if (bsv == null) {
/* 32 */       if (w.d) {
/* 33 */         throw (IllegalStateException)x.c(new IllegalStateException("Unknown biome id: " + k));
/*    */       }
/* 35 */       a.warn("Unknown biome id: ", Integer.valueOf(k));
/* 36 */       return ☃.a(kt.a(0));
/*    */     } 
/*    */     
/* 39 */     return bsv;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */