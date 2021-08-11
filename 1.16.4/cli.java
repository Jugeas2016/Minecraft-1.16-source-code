/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cli
/*     */   extends cjl<cmh>
/*     */ {
/*  19 */   private static final gc[] a = gc.values();
/*     */   
/*     */   public cli(Codec<cmh> ☃) {
/*  22 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/*  27 */     if (!☃.w(fx1)) {
/*  28 */       return false;
/*     */     }
/*     */     
/*  31 */     ceh ceh = ☃.d_(fx1.b());
/*  32 */     if (!ceh.a(bup.cL) && !ceh.a(bup.iK)) {
/*  33 */       return false;
/*     */     }
/*     */     
/*  36 */     a(☃, random, fx1);
/*  37 */     b(☃, random, fx1);
/*     */     
/*  39 */     return true;
/*     */   }
/*     */   
/*     */   private void a(bry ☃, Random random, fx fx1) {
/*  43 */     ☃.a(fx1, bup.iK.n(), 2);
/*     */     
/*  45 */     fx.a a1 = new fx.a();
/*  46 */     fx.a a2 = new fx.a();
/*     */     
/*  48 */     for (int i = 0; i < 200; i++) {
/*  49 */       a1.a(fx1, random.nextInt(6) - random.nextInt(6), random.nextInt(2) - random.nextInt(5), random.nextInt(6) - random.nextInt(6));
/*  50 */       if (☃.w(a1)) {
/*     */ 
/*     */ 
/*     */         
/*  54 */         int j = 0;
/*  55 */         for (gc gc1 : a) {
/*  56 */           ceh ceh = ☃.d_(a2.a(a1, gc1));
/*  57 */           if (ceh.a(bup.cL) || ceh.a(bup.iK)) {
/*  58 */             j++;
/*     */           }
/*     */           
/*  61 */           if (j > 1) {
/*     */             break;
/*     */           }
/*     */         } 
/*     */         
/*  66 */         if (j == 1)
/*  67 */           ☃.a(a1, bup.iK.n(), 2); 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(bry ☃, Random random, fx fx1) {
/*  73 */     fx.a a = new fx.a();
/*     */     
/*  75 */     for (int i = 0; i < 100; i++) {
/*  76 */       a.a(fx1, random.nextInt(8) - random.nextInt(8), random.nextInt(2) - random.nextInt(7), random.nextInt(8) - random.nextInt(8));
/*  77 */       if (☃.w(a)) {
/*     */ 
/*     */ 
/*     */         
/*  81 */         ceh ceh = ☃.d_(a.b());
/*  82 */         if (ceh.a(bup.cL) || ceh.a(bup.iK)) {
/*     */ 
/*     */ 
/*     */           
/*  86 */           int j = afm.a(random, 1, 8);
/*  87 */           if (random.nextInt(6) == 0) {
/*  88 */             j *= 2;
/*     */           }
/*  90 */           if (random.nextInt(5) == 0) {
/*  91 */             j = 1;
/*     */           }
/*     */           
/*  94 */           int k = 17;
/*  95 */           int m = 25;
/*  96 */           a(☃, random, a, j, 17, 25);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   } public static void a(bry ☃, Random random, fx.a a1, int i, int j, int k) {
/* 101 */     for (int m = 0; m <= i; m++) {
/* 102 */       if (☃.w(a1)) {
/* 103 */         if (m == i || !☃.w(a1.c())) {
/* 104 */           ☃.a(a1, bup.mx.n().a(bxh.d, Integer.valueOf(afm.a(random, j, k))), 2);
/*     */           break;
/*     */         } 
/* 107 */         ☃.a(a1, bup.my.n(), 2);
/*     */       } 
/*     */ 
/*     */       
/* 111 */       a1.c(gc.a);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cli.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */