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
/*     */ 
/*     */ public class cle
/*     */   extends cjl<cmh>
/*     */ {
/*     */   public cle(Codec<cmh> ☃) {
/*  21 */     super(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/*  27 */     return a(☃, random, fx1, 8, 4, 8);
/*     */   }
/*     */   
/*     */   public static boolean a(bry ☃, Random random, fx fx1, int i, int j, int k) {
/*  31 */     if (a(☃, fx1)) {
/*  32 */       return false;
/*     */     }
/*     */     
/*  35 */     b(☃, random, fx1, i, j, k);
/*  36 */     return true;
/*     */   }
/*     */   
/*     */   private static void b(bry ☃, Random random, fx fx1, int i, int j, int k) {
/*  40 */     fx.a a = new fx.a();
/*     */     
/*  42 */     for (int m = 0; m < i * i; m++) {
/*  43 */       a.g(fx1).e(
/*  44 */           afm.a(random, -i, i), 
/*  45 */           afm.a(random, -j, j), 
/*  46 */           afm.a(random, -i, i));
/*     */ 
/*     */       
/*  49 */       if (a(☃, a))
/*     */       {
/*     */ 
/*     */         
/*  53 */         if (!a(☃, a)) {
/*     */ 
/*     */ 
/*     */           
/*  57 */           int n = afm.a(random, 1, k);
/*  58 */           if (random.nextInt(6) == 0) {
/*  59 */             n *= 2;
/*     */           }
/*  61 */           if (random.nextInt(5) == 0) {
/*  62 */             n = 1;
/*     */           }
/*     */           
/*  65 */           int i1 = 17;
/*  66 */           int i2 = 25;
/*  67 */           a(☃, random, a, n, 17, 25);
/*     */         }  } 
/*     */     } 
/*     */   }
/*     */   private static boolean a(bry ☃, fx.a a1) {
/*     */     while (true) {
/*  73 */       a1.e(0, -1, 0);
/*  74 */       if (brx.m(a1)) {
/*  75 */         return false;
/*     */       }
/*  77 */       if (!☃.d_(a1).g()) {
/*  78 */         a1.e(0, 1, 0);
/*  79 */         return true;
/*     */       } 
/*     */     } 
/*     */   } public static void a(bry ☃, Random random, fx.a a1, int i, int j, int k) {
/*  83 */     for (int m = 1; m <= i; m++) {
/*  84 */       if (☃.w(a1)) {
/*  85 */         if (m == i || !☃.w(a1.b())) {
/*  86 */           ☃.a(a1, bup.mz.n().a(bxh.d, Integer.valueOf(afm.a(random, j, k))), 2);
/*     */           break;
/*     */         } 
/*  89 */         ☃.a(a1, bup.mA.n(), 2);
/*     */       } 
/*     */ 
/*     */       
/*  93 */       a1.c(gc.b);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean a(bry ☃, fx fx1) {
/*  98 */     if (!☃.w(fx1)) {
/*  99 */       return true;
/*     */     }
/*     */     
/* 102 */     ceh ceh = ☃.d_(fx1.c());
/* 103 */     return (!ceh.a(bup.cL) && !ceh.a(bup.ml) && !ceh.a(bup.mn));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */