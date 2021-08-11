/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czu
/*    */   extends czj
/*    */ {
/*    */   czu(czq[] ☃, dbo[] arrayOfDbo) {
/* 10 */     super(☃, arrayOfDbo);
/*    */   }
/*    */ 
/*    */   
/*    */   public czr a() {
/* 15 */     return czo.g;
/*    */   }
/*    */ 
/*    */   
/*    */   protected czi a(czi[] ☃) {
/* 20 */     switch (☃.length) {
/*    */       case 0:
/* 22 */         return b;
/*    */       case 1:
/* 24 */         return ☃[0];
/*    */       case 2:
/* 26 */         return ☃[0].a(☃[1]);
/*    */     } 
/* 28 */     return (cyv1, consumer) -> {
/*    */         for (czi czi1 : ☃) {
/*    */           if (!czi1.expand(cyv1, consumer))
/*    */             return false; 
/*    */         } 
/*    */         return true;
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */