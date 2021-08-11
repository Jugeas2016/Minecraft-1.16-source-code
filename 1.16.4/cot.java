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
/*    */ public class cot
/*    */   extends cor
/*    */ {
/*    */   protected cos<?> a() {
/* 17 */     return cos.a;
/*    */   }
/*    */   
/* 20 */   public static final Codec<cot> a = Codec.unit(() -> b);
/*    */   
/* 22 */   public static final cot b = new cot();
/*    */ 
/*    */   
/*    */   public void a(bsr ☃, Random random, List<fx> list1, List<fx> list2, Set<fx> set, cra cra1) {
/* 26 */     list1.forEach(fx1 -> {
/*    */           if (☃.nextInt(3) > 0) {
/*    */             fx fx2 = fx1.f();
/*    */             if (cjl.b(bsr1, fx2))
/*    */               a(bsr1, fx2, cbi.c, set, cra1); 
/*    */           } 
/*    */           if (☃.nextInt(3) > 0) {
/*    */             fx fx2 = fx1.g();
/*    */             if (cjl.b(bsr1, fx2))
/*    */               a(bsr1, fx2, cbi.e, set, cra1); 
/*    */           } 
/*    */           if (☃.nextInt(3) > 0) {
/*    */             fx fx2 = fx1.d();
/*    */             if (cjl.b(bsr1, fx2))
/*    */               a(bsr1, fx2, cbi.d, set, cra1); 
/*    */           } 
/*    */           if (☃.nextInt(3) > 0) {
/*    */             fx fx2 = fx1.e();
/*    */             if (cjl.b(bsr1, fx2))
/*    */               a(bsr1, fx2, cbi.b, set, cra1); 
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */