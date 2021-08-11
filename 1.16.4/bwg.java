/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class bwg
/*     */   extends bud
/*     */ {
/*  30 */   protected static final ddh a = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
/*     */   
/*     */   protected bwg(ceg.c ☃) {
/*  33 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/*  38 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  43 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  48 */     super.a(☃, brx1, fx1, random);
/*     */     
/*  50 */     for (int i = -2; i <= 2; i++) {
/*  51 */       for (int j = -2; j <= 2; j++) {
/*  52 */         if (i > -2 && i < 2 && j == -1) {
/*  53 */           j = 2;
/*     */         }
/*  55 */         if (random.nextInt(16) == 0)
/*     */         {
/*     */           
/*  58 */           for (int k = 0; k <= 1; k++) {
/*  59 */             fx fx2 = fx1.b(i, k, j);
/*  60 */             if (brx1.d_(fx2).a(bup.bI)) {
/*  61 */               if (!brx1.w(fx1.b(i / 2, 0, j / 2))) {
/*     */                 break;
/*     */               }
/*     */               
/*  65 */               brx1.a(hh.s, fx1.u() + 0.5D, fx1.v() + 2.0D, fx1.w() + 0.5D, (i + random.nextFloat()) - 0.5D, (k - random.nextFloat() - 1.0F), (j + random.nextFloat()) - 0.5D);
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  74 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/*  79 */     return new ccu();
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  84 */     if (brx1.v) {
/*  85 */       return aou.a;
/*     */     }
/*     */     
/*  88 */     bfw1.a(☃.b(brx1, fx1));
/*  89 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aox b(ceh ☃, brx brx1, fx fx1) {
/*  95 */     ccj ccj = brx1.c(fx1);
/*  96 */     if (ccj instanceof ccu) {
/*  97 */       nr nr = ((aoy)ccj).d();
/*     */       
/*  99 */       return new apb((i, bfv1, bfw1) -> new bis(i, bfv1, bim.a(☃, fx1)), nr);
/*     */     } 
/* 101 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 106 */     if (bmb1.t()) {
/* 107 */       ccj ccj = ☃.c(fx1);
/* 108 */       if (ccj instanceof ccu) {
/* 109 */         ((ccu)ccj).a(bmb1.r());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 116 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */