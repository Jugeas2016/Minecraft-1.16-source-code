/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class com
/*    */   extends cor
/*    */ {
/*    */   public static final Codec<com> a;
/*    */   private final cnt b;
/*    */   
/*    */   static {
/* 17 */     a = cnt.a.fieldOf("provider").xmap(com::new, ☃ -> ☃.b).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public com(cnt ☃) {
/* 22 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cos<?> a() {
/* 27 */     return cos.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bsr ☃, Random random, List<fx> list1, List<fx> list2, Set<fx> set, cra cra1) {
/* 32 */     int i = ((fx)list1.get(0)).v();
/* 33 */     list1.stream().filter(fx1 -> (fx1.v() == ☃)).forEach(fx1 -> {
/*    */           a(☃, random, fx1.f().d());
/*    */           a(☃, random, fx1.g(2).d());
/*    */           a(☃, random, fx1.f().e(2));
/*    */           a(☃, random, fx1.g(2).e(2));
/*    */           for (int i = 0; i < 5; i++) {
/*    */             int j = random.nextInt(64);
/*    */             int k = j % 8;
/*    */             int m = j / 8;
/*    */             if (k == 0 || k == 7 || m == 0 || m == 7) {
/*    */               a(☃, random, fx1.b(-3 + k, 0, -3 + m));
/*    */             }
/*    */           } 
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   private void a(bsb ☃, Random random, fx fx1) {
/* 51 */     for (int i = -2; i <= 2; i++) {
/* 52 */       for (int j = -2; j <= 2; j++) {
/* 53 */         if (Math.abs(i) != 2 || Math.abs(j) != 2) {
/* 54 */           b(☃, random, fx1.b(i, 0, j));
/*    */         }
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void b(bsb ☃, Random random, fx fx1) {
/* 61 */     for (int i = 2; i >= -3; i--) {
/* 62 */       fx fx2 = fx1.b(i);
/* 63 */       if (cjl.a(☃, fx2)) {
/* 64 */         ☃.a(fx2, this.b.a(random, fx1), 19); break;
/*    */       } 
/* 66 */       if (!cjl.b(☃, fx2) && i < 0)
/*    */         break; 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\com.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */