/*    */ import com.mojang.serialization.Codec;
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
/*    */ public class cik
/*    */   extends cjl<cmk>
/*    */ {
/* 19 */   private static final ceh a = bup.kY.n().a(btu.d, Integer.valueOf(1)).a(btu.e, ceu.a).a(btu.f, Integer.valueOf(0));
/* 20 */   private static final ceh ab = a.a(btu.e, ceu.c).a(btu.f, Integer.valueOf(1));
/* 21 */   private static final ceh ac = a.a(btu.e, ceu.c);
/* 22 */   private static final ceh ad = a.a(btu.e, ceu.b);
/*    */   
/*    */   public cik(Codec<cmk> ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmk cmk1) {
/* 30 */     int i = 0;
/*    */     
/* 32 */     fx.a a1 = fx1.i();
/* 33 */     fx.a a2 = fx1.i();
/* 34 */     if (☃.w(a1)) {
/* 35 */       if (bup.kY.n().a(☃, a1)) {
/* 36 */         int j = random.nextInt(12) + 5;
/*    */ 
/*    */         
/* 39 */         if (random.nextFloat() < cmk1.c) {
/* 40 */           int m = random.nextInt(4) + 1;
/* 41 */           for (int n = fx1.u() - m; n <= fx1.u() + m; n++) {
/* 42 */             for (int i1 = fx1.w() - m; i1 <= fx1.w() + m; i1++) {
/* 43 */               int i2 = n - fx1.u();
/* 44 */               int i3 = i1 - fx1.w();
/* 45 */               if (i2 * i2 + i3 * i3 <= m * m) {
/*    */ 
/*    */ 
/*    */                 
/* 49 */                 a2.d(n, ☃.a(chn.a.b, n, i1) - 1, i1);
/* 50 */                 if (b(☃.d_(a2).b())) {
/* 51 */                   ☃.a(a2, bup.l.n(), 2);
/*    */                 }
/*    */               } 
/*    */             } 
/*    */           } 
/*    */         } 
/* 57 */         for (int k = 0; k < j && 
/* 58 */           ☃.w(a1); k++) {
/* 59 */           ☃.a(a1, a, 2);
/*    */ 
/*    */ 
/*    */           
/* 63 */           a1.c(gc.b, 1);
/*    */         } 
/*    */         
/* 66 */         if (a1.v() - fx1.v() >= 3) {
/* 67 */           ☃.a(a1, ab, 2);
/* 68 */           ☃.a(a1.c(gc.a, 1), ac, 2);
/* 69 */           ☃.a(a1.c(gc.a, 1), ad, 2);
/*    */         } 
/*    */       } 
/* 72 */       i++;
/*    */     } 
/*    */     
/* 75 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */