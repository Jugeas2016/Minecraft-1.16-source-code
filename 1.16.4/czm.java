/*    */ import java.util.function.Consumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class czm
/*    */   extends czj
/*    */ {
/*    */   czm(czq[] ☃, dbo[] arrayOfDbo) {
/* 10 */     super(☃, arrayOfDbo);
/*    */   }
/*    */ 
/*    */   
/*    */   public czr a() {
/* 15 */     return czo.h;
/*    */   }
/*    */   protected czi a(czi[] ☃) {
/*    */     czi czi1;
/*    */     czi czi2;
/* 20 */     switch (☃.length) {
/*    */       case 0:
/* 22 */         return b;
/*    */       case 1:
/* 24 */         return ☃[0];
/*    */       case 2:
/* 26 */         czi1 = ☃[0];
/* 27 */         czi2 = ☃[1];
/* 28 */         return (cyv1, consumer) -> {
/*    */             ☃.expand(cyv1, consumer);
/*    */             czi1.expand(cyv1, consumer);
/*    */             return true;
/*    */           };
/*    */     } 
/*    */     
/* 35 */     return (cyv1, consumer) -> {
/*    */         for (czi czi1 : ☃)
/*    */           czi1.expand(cyv1, consumer); 
/*    */         return true;
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */