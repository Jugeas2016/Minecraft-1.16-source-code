/*    */ import java.util.Random;
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
/*    */ public class cjk
/*    */   extends cjl<cmh>
/*    */ {
/* 19 */   public static final fx a = fx.b;
/*    */   
/*    */   private final boolean ab;
/*    */   
/*    */   public cjk(boolean ☃) {
/* 24 */     super(cmh.a);
/* 25 */     this.ab = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 30 */     for (fx fx3 : fx.a(new fx(fx1.u() - 4, fx1.v() - 1, fx1.w() - 4), new fx(fx1.u() + 4, fx1.v() + 32, fx1.w() + 4))) {
/* 31 */       boolean bool = fx3.a(fx1, 2.5D);
/*    */       
/* 33 */       if (bool || fx3.a(fx1, 3.5D)) {
/* 34 */         if (fx3.v() < fx1.v()) {
/* 35 */           if (bool) {
/*    */             
/* 37 */             a(☃, fx3, bup.z.n()); continue;
/* 38 */           }  if (fx3.v() < fx1.v())
/*    */           {
/* 40 */             a(☃, fx3, bup.ee.n()); }  continue;
/*    */         } 
/* 42 */         if (fx3.v() > fx1.v()) {
/*    */           
/* 44 */           a(☃, fx3, bup.a.n()); continue;
/* 45 */         }  if (!bool) {
/*    */           
/* 47 */           a(☃, fx3, bup.z.n()); continue;
/* 48 */         }  if (this.ab) {
/*    */           
/* 50 */           a(☃, new fx(fx3), bup.ec.n()); continue;
/*    */         } 
/* 52 */         a(☃, new fx(fx3), bup.a.n());
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 58 */     for (int i = 0; i < 4; i++) {
/* 59 */       a(☃, fx1.b(i), bup.z.n());
/*    */     }
/*    */     
/* 62 */     fx fx2 = fx1.b(2);
/* 63 */     for (gc gc : gc.c.a) {
/* 64 */       a(☃, fx2.a(gc), bup.bM.n().a(cbn.a, gc));
/*    */     }
/*    */     
/* 67 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */