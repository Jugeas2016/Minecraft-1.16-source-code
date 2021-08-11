/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ehb
/*    */   extends efv<bhv>
/*    */ {
/*    */   public ehb(eet ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bhv ☃, float f, ceh ceh1, dfm dfm1, eag eag1, int i) {
/* 18 */     int j = ☃.v();
/*    */     
/* 20 */     if (j > -1 && 
/* 21 */       j - f + 1.0F < 10.0F) {
/* 22 */       float f1 = 1.0F - (j - f + 1.0F) / 10.0F;
/* 23 */       f1 = afm.a(f1, 0.0F, 1.0F);
/* 24 */       f1 *= f1;
/* 25 */       f1 *= f1;
/* 26 */       float f2 = 1.0F + f1 * 0.3F;
/* 27 */       dfm1.a(f2, f2, f2);
/*    */     } 
/*    */ 
/*    */     
/* 31 */     a(ceh1, dfm1, eag1, i, (j > -1 && j / 5 % 2 == 0));
/*    */   }
/*    */ 
/*    */   
/*    */   public static void a(ceh ☃, dfm dfm1, eag eag1, int i, boolean bool) {
/*    */     int j;
/* 37 */     if (bool) {
/* 38 */       j = ejw.a(ejw.a(1.0F), 10);
/*    */     } else {
/* 40 */       j = ejw.a;
/*    */     } 
/*    */     
/* 43 */     djz.C().ab().a(☃, dfm1, eag1, i, j);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ehb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */