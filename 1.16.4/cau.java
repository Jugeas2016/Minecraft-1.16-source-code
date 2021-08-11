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
/*     */ public class cau
/*     */   extends buu
/*     */   implements buq
/*     */ {
/*  32 */   public static final cfg a = cex.ag;
/*     */   
/*  34 */   private static final ddh b = buo.a(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);
/*  35 */   private static final ddh c = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
/*     */   
/*     */   public cau(ceg.c ☃) {
/*  38 */     super(☃);
/*  39 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/*  44 */     return new bmb(bmd.rm);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  49 */     if (((Integer)☃.c(a)).intValue() == 0)
/*  50 */       return b; 
/*  51 */     if (((Integer)☃.c(a)).intValue() < 3) {
/*  52 */       return c;
/*     */     }
/*     */     
/*  55 */     return super.b(☃, brc1, fx1, dcs1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/*  60 */     return (((Integer)☃.c(a)).intValue() < 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  65 */     int i = ((Integer)☃.c(a)).intValue();
/*  66 */     if (i < 3 && random.nextInt(5) == 0 && aag1.b(fx1.b(), 0) >= 9) {
/*  67 */       aag1.a(fx1, ☃.a(a, Integer.valueOf(i + 1)), 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/*  73 */     if (!(aqa1 instanceof aqm) || aqa1.X() == aqe.C || aqa1.X() == aqe.e) {
/*     */       return;
/*     */     }
/*  76 */     aqa1.a(☃, new dcn(0.800000011920929D, 0.75D, 0.800000011920929D));
/*     */ 
/*     */     
/*  79 */     if (!brx1.v && ((Integer)☃.c(a)).intValue() > 0 && (aqa1.D != aqa1.cD() || aqa1.F != aqa1.cH())) {
/*  80 */       double d1 = Math.abs(aqa1.cD() - aqa1.D);
/*  81 */       double d2 = Math.abs(aqa1.cH() - aqa1.F);
/*     */       
/*  83 */       if (d1 >= 0.003000000026077032D || d2 >= 0.003000000026077032D) {
/*  84 */         aqa1.a(apk.u, 1.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  91 */     int i = ((Integer)☃.c(a)).intValue();
/*  92 */     boolean bool = (i == 3);
/*     */     
/*  94 */     if (!bool && bfw1.b(aot1).b() == bmd.mK) {
/*  95 */       return aou.c;
/*     */     }
/*     */     
/*  98 */     if (i > 1) {
/*  99 */       int j = 1 + brx1.t.nextInt(2);
/* 100 */       a(brx1, fx1, new bmb(bmd.rm, j + (bool ? 1 : 0)));
/* 101 */       brx1.a((bfw)null, fx1, adq.oZ, adr.e, 1.0F, 0.8F + brx1.t.nextFloat() * 0.4F);
/* 102 */       brx1.a(fx1, ☃.a(a, Integer.valueOf(1)), 2);
/* 103 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/* 106 */     return super.a(☃, brx1, fx1, bfw1, aot1, dcj1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 111 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 116 */     return (((Integer)ceh1.c(a)).intValue() < 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 121 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 126 */     int i = Math.min(3, ((Integer)ceh1.c(a)).intValue() + 1);
/* 127 */     ☃.a(fx1, ceh1.a(a, Integer.valueOf(i)), 2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cau.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */