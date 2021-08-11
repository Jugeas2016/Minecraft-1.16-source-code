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
/*     */ public class bzq
/*     */   extends buu
/*     */   implements buq, bzu
/*     */ {
/*  28 */   public static final cfg a = cex.ay;
/*  29 */   public static final cey b = cex.C;
/*     */   
/*  31 */   protected static final ddh c = buo.a(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);
/*  32 */   protected static final ddh d = buo.a(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);
/*  33 */   protected static final ddh e = buo.a(2.0D, 0.0D, 2.0D, 14.0D, 6.0D, 14.0D);
/*  34 */   protected static final ddh f = buo.a(2.0D, 0.0D, 2.0D, 14.0D, 7.0D, 14.0D);
/*     */   
/*     */   protected bzq(ceg.c ☃) {
/*  37 */     super(☃);
/*  38 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(1)).a(b, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  44 */     ceh ceh = ☃.p().d_(☃.a());
/*  45 */     if (ceh.a(this)) {
/*  46 */       return ceh.a(a, Integer.valueOf(Math.min(4, ((Integer)ceh.c(a)).intValue() + 1)));
/*     */     }
/*     */     
/*  49 */     cux cux = ☃.p().b(☃.a());
/*  50 */     boolean bool = (cux.a() == cuy.c);
/*  51 */     return super.a(☃).a(b, Boolean.valueOf(bool));
/*     */   }
/*     */   
/*     */   public static boolean h(ceh ☃) {
/*  55 */     return !((Boolean)☃.c(b)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean c(ceh ☃, brc brc1, fx fx1) {
/*  60 */     return (!☃.k(brc1, fx1).a(gc.b).b() || ☃.d(brc1, fx1, gc.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  65 */     fx fx2 = fx1.c();
/*  66 */     return c(brz1.d_(fx2), brz1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  71 */     if (!☃.a(bry1, fx1)) {
/*  72 */       return bup.a.n();
/*     */     }
/*     */     
/*  75 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  76 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*     */     
/*  79 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, bny bny1) {
/*  84 */     if (bny1.m().b() == h() && ((Integer)☃.c(a)).intValue() < 4) {
/*  85 */       return true;
/*     */     }
/*  87 */     return super.a(☃, bny1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  92 */     switch (((Integer)☃.c(a)).intValue())
/*     */     
/*     */     { default:
/*  95 */         return c;
/*     */       case 2:
/*  97 */         return d;
/*     */       case 3:
/*  99 */         return e;
/*     */       case 4:
/* 101 */         break; }  return f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 107 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 108 */       return cuy.c.a(false);
/*     */     }
/*     */     
/* 111 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 116 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 121 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 126 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 131 */     if (!h(ceh1) && ☃.d_(fx1.c()).a(aed.Y)) {
/* 132 */       int i = 5;
/* 133 */       int j = 1;
/* 134 */       int k = 2;
/* 135 */       int m = 0;
/*     */       
/* 137 */       int n = fx1.u() - 2;
/* 138 */       int i1 = 0;
/*     */       
/* 140 */       for (int i2 = 0; i2 < 5; i2++) {
/* 141 */         for (int i3 = 0; i3 < j; i3++) {
/* 142 */           int i4 = 2 + fx1.v() - 1;
/* 143 */           for (int i5 = i4 - 2; i5 < i4; i5++) {
/* 144 */             fx fx2 = new fx(n + i2, i5, fx1.w() - i1 + i3);
/* 145 */             if (fx2 != fx1)
/*     */             {
/*     */ 
/*     */               
/* 149 */               if (random.nextInt(6) == 0 && ☃.d_(fx2).a(bup.A)) {
/* 150 */                 ceh ceh2 = ☃.d_(fx2.c());
/* 151 */                 if (ceh2.a(aed.Y)) {
/* 152 */                   ☃.a(fx2, bup.kU.n().a(a, Integer.valueOf(random.nextInt(4) + 1)), 3);
/*     */                 }
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/* 158 */         if (m < 2) {
/* 159 */           j += 2;
/* 160 */           i1++;
/*     */         } else {
/* 162 */           j -= 2;
/* 163 */           i1--;
/*     */         } 
/* 165 */         m++;
/*     */       } 
/*     */       
/* 168 */       ☃.a(fx1, ceh1.a(a, Integer.valueOf(4)), 2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 174 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */