/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cop
/*    */   extends cor
/*    */ {
/*    */   public static final Codec<cop> a;
/*    */   private final float b;
/*    */   
/*    */   static {
/* 18 */     a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(cop::new, ☃ -> Float.valueOf(☃.b)).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public cop(float ☃) {
/* 23 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cos<?> a() {
/* 28 */     return cos.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bsr ☃, Random random, List<fx> list1, List<fx> list2, Set<fx> set, cra cra1) {
/* 33 */     if (random.nextFloat() >= this.b) {
/*    */       return;
/*    */     }
/*    */     
/* 37 */     int i = ((fx)list1.get(0)).v();
/* 38 */     list1.stream()
/* 39 */       .filter(fx1 -> (fx1.v() - ☃ <= 2))
/* 40 */       .forEach(fx1 -> {
/*    */           for (gc gc : gc.c.a) {
/*    */             if (☃.nextFloat() <= 0.25F) {
/*    */               gc gc1 = gc.f();
/*    */               fx fx2 = fx1.b(gc1.i(), 0, gc1.k());
/*    */               if (cjl.b(bsr1, fx2)) {
/*    */                 ceh ceh = bup.eh.n().a(bvh.a, Integer.valueOf(☃.nextInt(3))).a(bvh.aq, gc);
/*    */                 a(bsr1, fx2, ceh, set, cra1);
/*    */               } 
/*    */             } 
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */