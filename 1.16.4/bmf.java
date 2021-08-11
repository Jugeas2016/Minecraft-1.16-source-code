/*    */ import java.util.List;
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
/*    */ public class bmf
/*    */   extends blx
/*    */ {
/*    */   public bmf(blx.a ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(boa ☃) {
/* 23 */     brx brx = ☃.p();
/* 24 */     fx fx = ☃.a();
/*    */     
/* 26 */     buo buo = brx.d_(fx).b();
/* 27 */     if (buo.a(aed.M)) {
/* 28 */       bfw bfw = ☃.n();
/* 29 */       if (!brx.v && bfw != null) {
/* 30 */         a(bfw, brx, fx);
/*    */       }
/* 32 */       return aou.a(brx.v);
/*    */     } 
/*    */     
/* 35 */     return aou.c;
/*    */   }
/*    */   
/*    */   public static aou a(bfw ☃, brx brx1, fx fx1) {
/* 39 */     bcq bcq = null;
/*    */ 
/*    */     
/* 42 */     boolean bool = false;
/* 43 */     double d = 7.0D;
/* 44 */     int i = fx1.u();
/* 45 */     int j = fx1.v();
/* 46 */     int k = fx1.w();
/*    */     
/* 48 */     List<aqn> list = brx1.a(aqn.class, new dci(i - 7.0D, j - 7.0D, k - 7.0D, i + 7.0D, j + 7.0D, k + 7.0D));
/* 49 */     for (aqn aqn : list) {
/* 50 */       if (aqn.eC() == ☃) {
/* 51 */         if (bcq == null) {
/* 52 */           bcq = bcq.a(brx1, fx1);
/*    */         }
/* 54 */         aqn.b(bcq, true);
/* 55 */         bool = true;
/*    */       } 
/*    */     } 
/* 58 */     return bool ? aou.a : aou.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */