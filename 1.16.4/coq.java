/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
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
/*    */ public class coq
/*    */   extends cor
/*    */ {
/*    */   protected cos<?> a() {
/* 19 */     return cos.b;
/*    */   }
/*    */   
/* 22 */   public static final Codec<coq> a = Codec.unit(() -> b);
/*    */   
/* 24 */   public static final coq b = new coq();
/*    */ 
/*    */   
/*    */   public void a(bsr ☃, Random random, List<fx> list1, List<fx> list2, Set<fx> set, cra cra1) {
/* 28 */     list2.forEach(fx1 -> {
/*    */           if (☃.nextInt(4) == 0) {
/*    */             fx fx2 = fx1.f();
/*    */             if (cjl.b(bsr1, fx2)) {
/*    */               a(bsr1, fx2, cbi.c, set, cra1);
/*    */             }
/*    */           } 
/*    */           if (☃.nextInt(4) == 0) {
/*    */             fx fx2 = fx1.g();
/*    */             if (cjl.b(bsr1, fx2)) {
/*    */               a(bsr1, fx2, cbi.e, set, cra1);
/*    */             }
/*    */           } 
/*    */           if (☃.nextInt(4) == 0) {
/*    */             fx fx2 = fx1.d();
/*    */             if (cjl.b(bsr1, fx2)) {
/*    */               a(bsr1, fx2, cbi.d, set, cra1);
/*    */             }
/*    */           } 
/*    */           if (☃.nextInt(4) == 0) {
/*    */             fx fx2 = fx1.e();
/*    */             if (cjl.b(bsr1, fx2)) {
/*    */               a(bsr1, fx2, cbi.b, set, cra1);
/*    */             }
/*    */           } 
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void a(bsb ☃, fx fx1, cey cey1, Set<fx> set, cra cra1) {
/* 60 */     a(☃, fx1, cey1, set, cra1);
/* 61 */     int i = 4;
/*    */     
/* 63 */     fx1 = fx1.c();
/* 64 */     while (cjl.b(☃, fx1) && i > 0) {
/* 65 */       a(☃, fx1, cey1, set, cra1);
/* 66 */       fx1 = fx1.c();
/* 67 */       i--;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */