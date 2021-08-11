/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
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
/*    */ public class cqt
/*    */   extends cqc<clu>
/*    */ {
/*    */   public cqt(Codec<clu> ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */   
/*    */   public Stream<fx> a(cpv ☃, Random random, clu clu1, fx fx1) {
/*    */     boolean bool;
/* 25 */     List<fx> list = Lists.newArrayList();
/*    */     
/* 27 */     int i = 0;
/*    */     do {
/* 29 */       bool = false;
/* 30 */       for (int j = 0; j < clu1.a().a(random); j++) {
/* 31 */         int k = random.nextInt(16) + fx1.u();
/* 32 */         int m = random.nextInt(16) + fx1.w();
/* 33 */         int n = ☃.a(chn.a.e, k, m);
/* 34 */         int i1 = a(☃, k, n, m, i);
/* 35 */         if (i1 != Integer.MAX_VALUE) {
/* 36 */           list.add(new fx(k, i1, m));
/* 37 */           bool = true;
/*    */         } 
/*    */       } 
/* 40 */       i++;
/* 41 */     } while (bool);
/*    */     
/* 43 */     return list.stream();
/*    */   }
/*    */ 
/*    */   
/*    */   private static int a(cpv ☃, int i, int j, int k, int m) {
/* 48 */     fx.a a = new fx.a(i, j, k);
/*    */     
/* 50 */     int n = 0;
/* 51 */     ceh ceh = ☃.a(a);
/* 52 */     for (int i1 = j; i1 >= 1; i1--) {
/* 53 */       a.p(i1 - 1);
/* 54 */       ceh ceh1 = ☃.a(a);
/* 55 */       if (!a(ceh1) && a(ceh) && !ceh1.a(bup.z)) {
/* 56 */         if (n == m) {
/* 57 */           return a.v() + 1;
/*    */         }
/* 59 */         n++;
/*    */       } 
/* 61 */       ceh = ceh1;
/*    */     } 
/* 63 */     return Integer.MAX_VALUE;
/*    */   }
/*    */   
/*    */   private static boolean a(ceh ☃) {
/* 67 */     return (☃.g() || ☃.a(bup.A) || ☃.a(bup.B));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */