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
/*    */ public class bnr
/*    */   extends blx
/*    */ {
/*    */   public bnr(blx.a ☃) {
/* 22 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(boa ☃) {
/* 27 */     brx brx = ☃.p();
/* 28 */     fx fx = ☃.a();
/* 29 */     ceh ceh = brx.d_(fx);
/*    */     
/* 31 */     if (ceh.a(bup.lY)) {
/* 32 */       return bxy.a(brx, fx, ceh, ☃.m()) ? aou.a(brx.v) : aou.c;
/*    */     }
/*    */     
/* 35 */     return aou.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 40 */     bmb bmb = bfw1.b(aot1);
/* 41 */     bfw1.a(bmb, aot1);
/* 42 */     bfw1.b(aea.c.b(this));
/* 43 */     return aov.a(bmb, ☃.s_());
/*    */   }
/*    */   
/*    */   public static boolean a(@Nullable md ☃) {
/* 47 */     if (☃ == null) {
/* 48 */       return false;
/*    */     }
/* 50 */     if (!☃.c("pages", 9)) {
/* 51 */       return false;
/*    */     }
/*    */     
/* 54 */     mj mj = ☃.d("pages", 8);
/* 55 */     for (int i = 0; i < mj.size(); i++) {
/* 56 */       String str = mj.j(i);
/*    */       
/* 58 */       if (str.length() > 32767) {
/* 59 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 63 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */