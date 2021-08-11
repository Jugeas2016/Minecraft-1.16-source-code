/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class bsh
/*    */   implements brc
/*    */ {
/*    */   private final ceh[] a;
/*    */   
/*    */   public bsh(ceh[] ☃) {
/* 15 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ccj c(fx ☃) {
/* 21 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh d_(fx ☃) {
/* 26 */     int i = ☃.v();
/* 27 */     if (i < 0 || i >= this.a.length) {
/* 28 */       return bup.a.n();
/*    */     }
/* 30 */     return this.a[i];
/*    */   }
/*    */ 
/*    */   
/*    */   public cux b(fx ☃) {
/* 35 */     return d_(☃).m();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */