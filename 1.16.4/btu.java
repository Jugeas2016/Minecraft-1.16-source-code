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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class btu
/*     */   extends buo
/*     */   implements buq
/*     */ {
/*  34 */   protected static final ddh a = buo.a(5.0D, 0.0D, 5.0D, 11.0D, 16.0D, 11.0D);
/*  35 */   protected static final ddh b = buo.a(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);
/*  36 */   protected static final ddh c = buo.a(6.5D, 0.0D, 6.5D, 9.5D, 16.0D, 9.5D);
/*     */   
/*  38 */   public static final cfg d = cex.ae;
/*  39 */   public static final cfe<ceu> e = cex.aN;
/*  40 */   public static final cfg f = cex.aA;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public btu(ceg.c ☃) {
/*  49 */     super(☃);
/*  50 */     j(((ceh)this.n.b()).a(d, Integer.valueOf(0)).a(e, ceu.a).a(f, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/*  55 */     ☃.a((cfj<?>[])new cfj[] { d, e, f });
/*     */   }
/*     */ 
/*     */   
/*     */   public ceg.b ah_() {
/*  60 */     return ceg.b.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(ceh ☃, brc brc1, fx fx1) {
/*  65 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  70 */     ddh ddh1 = (☃.c(e) == ceu.c) ? b : a;
/*  71 */     dcn dcn = ☃.n(brc1, fx1);
/*  72 */     return ddh1.a(dcn.b, dcn.c, dcn.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  82 */     dcn dcn = ☃.n(brc1, fx1);
/*  83 */     return c.a(dcn.b, dcn.c, dcn.d);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  89 */     cux cux = ☃.p().b(☃.a());
/*  90 */     if (!cux.c()) {
/*  91 */       return null;
/*     */     }
/*     */     
/*  94 */     ceh ceh = ☃.p().d_(☃.a().c());
/*  95 */     if (ceh.a(aed.ac)) {
/*  96 */       if (ceh.a(bup.kX))
/*  97 */         return n().a(d, Integer.valueOf(0)); 
/*  98 */       if (ceh.a(bup.kY)) {
/*  99 */         int i = (((Integer)ceh.c(d)).intValue() > 0) ? 1 : 0;
/* 100 */         return n().a(d, Integer.valueOf(i));
/*     */       } 
/* 102 */       ceh ceh1 = ☃.p().d_(☃.a().b());
/* 103 */       if (ceh1.a(bup.kY) || ceh1.a(bup.kX)) {
/* 104 */         return n().a(d, ceh1.c(d));
/*     */       }
/* 106 */       return bup.kX.n();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 111 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 116 */     if (!☃.a(aag1, fx1)) {
/* 117 */       aag1.b(fx1, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/* 123 */     return (((Integer)☃.c(f)).intValue() == 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/* 128 */     if (((Integer)☃.c(f)).intValue() != 0) {
/*     */       return;
/*     */     }
/*     */     
/* 132 */     if (random.nextInt(3) == 0 && aag1.w(fx1.b()) && aag1.b(fx1.b(), 0) >= 9) {
/* 133 */       int i = b(aag1, fx1) + 1;
/* 134 */       if (i < 16) {
/* 135 */         a(☃, aag1, fx1, random, i);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 142 */     return brz1.d_(fx1.c()).a(aed.ac);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 147 */     if (!☃.a(bry1, fx1)) {
/* 148 */       bry1.J().a(fx1, this, 1);
/*     */     }
/*     */     
/* 151 */     if (gc1 == gc.b && 
/* 152 */       ceh1.a(bup.kY) && ((Integer)ceh1.c(d)).intValue() > ((Integer)☃.c(d)).intValue()) {
/* 153 */       bry1.a(fx1, ☃.a(d), 2);
/*     */     }
/*     */ 
/*     */     
/* 157 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 162 */     int i = a(☃, fx1);
/* 163 */     int j = b(☃, fx1);
/* 164 */     return (i + j + 1 < 16 && ((Integer)☃.d_(fx1.b(i)).c(f)).intValue() != 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 169 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 174 */     int i = a(☃, fx1);
/* 175 */     int j = b(☃, fx1);
/* 176 */     int k = i + j + 1;
/*     */     
/* 178 */     int m = 1 + random.nextInt(2);
/* 179 */     for (int n = 0; n < m; n++) {
/* 180 */       fx fx2 = fx1.b(i);
/* 181 */       ceh ceh2 = ☃.d_(fx2);
/* 182 */       if (k >= 16 || ((Integer)ceh2.c(f)).intValue() == 1 || !☃.w(fx2.b())) {
/*     */         return;
/*     */       }
/*     */       
/* 186 */       a(ceh2, ☃, fx2, random, k);
/*     */       
/* 188 */       i++;
/* 189 */       k++;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(ceh ☃, bfw bfw1, brc brc1, fx fx1) {
/* 195 */     if (bfw1.dD().b() instanceof bnf) {
/* 196 */       return 1.0F;
/*     */     }
/*     */     
/* 199 */     return super.a(☃, bfw1, brc1, fx1);
/*     */   }
/*     */   
/*     */   protected void a(ceh ☃, brx brx1, fx fx1, Random random, int i) {
/* 203 */     ceh ceh1 = brx1.d_(fx1.c());
/* 204 */     fx fx2 = fx1.c(2);
/* 205 */     ceh ceh2 = brx1.d_(fx2);
/*     */     
/* 207 */     ceu ceu = ceu.a;
/* 208 */     if (i >= 1) {
/* 209 */       if (!ceh1.a(bup.kY) || ceh1.c(e) == ceu.a) {
/* 210 */         ceu = ceu.b;
/* 211 */       } else if (ceh1.a(bup.kY) && ceh1.c(e) != ceu.a) {
/* 212 */         ceu = ceu.c;
/*     */         
/* 214 */         if (ceh2.a(bup.kY)) {
/* 215 */           brx1.a(fx1.c(), ceh1.a(e, ceu.b), 3);
/* 216 */           brx1.a(fx2, ceh2.a(e, ceu.a), 3);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 221 */     int j = (((Integer)☃.c(d)).intValue() == 1 || ceh2.a(bup.kY)) ? 1 : 0;
/* 222 */     int k = ((i >= 11 && random.nextFloat() < 0.25F) || i == 15) ? 1 : 0;
/* 223 */     brx1.a(fx1.b(), n().a(d, Integer.valueOf(j)).a(e, ceu).a(f, Integer.valueOf(k)), 3);
/*     */   }
/*     */   
/*     */   protected int a(brc ☃, fx fx1) {
/* 227 */     int i = 0;
/* 228 */     while (i < 16 && ☃.d_(fx1.b(i + 1)).a(bup.kY)) {
/* 229 */       i++;
/*     */     }
/* 231 */     return i;
/*     */   }
/*     */   
/*     */   protected int b(brc ☃, fx fx1) {
/* 235 */     int i = 0;
/* 236 */     while (i < 16 && ☃.d_(fx1.c(i + 1)).a(bup.kY)) {
/* 237 */       i++;
/*     */     }
/* 239 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */