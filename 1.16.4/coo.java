/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class coo
/*    */   extends cor
/*    */ {
/*    */   public static final Codec<coo> a;
/*    */   private final float b;
/*    */   
/*    */   static {
/* 23 */     a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(coo::new, ☃ -> Float.valueOf(☃.b)).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public coo(float ☃) {
/* 28 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cos<?> a() {
/* 33 */     return cos.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bsr ☃, Random random, List<fx> list1, List<fx> list2, Set<fx> set, cra cra1) {
/* 38 */     if (random.nextFloat() >= this.b) {
/*    */       return;
/*    */     }
/*    */     
/* 42 */     gc gc = buk.a(random);
/*    */ 
/*    */ 
/*    */     
/* 46 */     int i = !list2.isEmpty() ? Math.max(((fx)list2.get(0)).v() - 1, ((fx)list1.get(0)).v()) : Math.min(((fx)list1.get(0)).v() + 1 + random.nextInt(3), ((fx)list1.get(list1.size() - 1)).v());
/*    */     
/* 48 */     List<fx> list = (List<fx>)list1.stream().filter(fx1 -> (fx1.v() == ☃)).collect(Collectors.toList());
/* 49 */     if (list.isEmpty()) {
/*    */       return;
/*    */     }
/* 52 */     fx fx1 = list.get(random.nextInt(list.size()));
/* 53 */     fx fx2 = fx1.a(gc);
/* 54 */     if (!cjl.b(☃, fx2) || !cjl.b(☃, fx2.a(gc.d))) {
/*    */       return;
/*    */     }
/*    */     
/* 58 */     ceh ceh = bup.nc.n().a(buk.a, gc.d);
/* 59 */     a(☃, fx2, ceh, set, cra1);
/* 60 */     ccj ccj = ☃.c(fx2);
/* 61 */     if (ccj instanceof ccg) {
/* 62 */       ccg ccg = (ccg)ccj;
/* 63 */       int j = 2 + random.nextInt(2);
/* 64 */       for (int k = 0; k < j; k++) {
/* 65 */         baa baa = new baa(aqe.e, ☃.E());
/* 66 */         ccg.a(baa, false, random.nextInt(599));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */