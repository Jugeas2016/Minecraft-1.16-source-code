/*     */ import com.google.common.base.MoreObjects;
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
/*     */ public class cbe
/*     */   extends buo
/*     */ {
/*  29 */   public static final cfb a = bxm.aq;
/*  30 */   public static final cey b = cex.w;
/*  31 */   public static final cey c = cex.a;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  38 */   protected static final ddh d = buo.a(5.0D, 0.0D, 10.0D, 11.0D, 10.0D, 16.0D);
/*  39 */   protected static final ddh e = buo.a(5.0D, 0.0D, 0.0D, 11.0D, 10.0D, 6.0D);
/*  40 */   protected static final ddh f = buo.a(10.0D, 0.0D, 5.0D, 16.0D, 10.0D, 11.0D);
/*  41 */   protected static final ddh g = buo.a(0.0D, 0.0D, 5.0D, 6.0D, 10.0D, 11.0D);
/*     */   
/*     */   public cbe(ceg.c ☃) {
/*  44 */     super(☃);
/*  45 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  50 */     switch (null.a[((gc)☃.c(a)).ordinal()])
/*     */     
/*     */     { default:
/*  53 */         return g;
/*     */       case 2:
/*  55 */         return f;
/*     */       case 3:
/*  57 */         return e;
/*     */       case 4:
/*  59 */         break; }  return d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  65 */     gc gc = (gc)☃.c(a);
/*  66 */     fx fx2 = fx1.a(gc.f());
/*  67 */     ceh ceh1 = brz1.d_(fx2);
/*  68 */     return (gc.n().d() && ceh1.d(brz1, fx2, gc));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  73 */     if (gc1.f() == ☃.c(a) && !☃.a(bry1, fx1)) {
/*  74 */       return bup.a.n();
/*     */     }
/*  76 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  82 */     ceh ceh = n().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
/*     */     
/*  84 */     brz brz = ☃.p();
/*  85 */     fx fx = ☃.a();
/*     */     
/*  87 */     gc[] arrayOfGc = ☃.e();
/*  88 */     for (gc gc : arrayOfGc) {
/*  89 */       if (gc.n().d()) {
/*     */ 
/*     */ 
/*     */         
/*  93 */         gc gc1 = gc.f();
/*     */         
/*  95 */         ceh = ceh.a(a, gc1);
/*  96 */         if (ceh.a(brz, fx)) {
/*  97 */           return ceh;
/*     */         }
/*     */       } 
/*     */     } 
/* 101 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 106 */     a(☃, fx1, ceh1, false, false, -1, (ceh)null);
/*     */   }
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, boolean bool1, boolean bool2, int i, @Nullable ceh ceh2) {
/*     */     int m;
/* 110 */     gc gc = (gc)ceh1.c(a);
/* 111 */     int j = ((Boolean)ceh1.c(c)).booleanValue();
/* 112 */     boolean bool3 = ((Boolean)ceh1.c(b)).booleanValue();
/*     */     
/* 114 */     boolean bool4 = !bool1;
/* 115 */     boolean bool5 = false;
/* 116 */     int n = 0;
/*     */     
/* 118 */     ceh[] arrayOfCeh = new ceh[42];
/* 119 */     for (int i1 = 1; i1 < 42; i1++) {
/* 120 */       fx fx2 = fx1.a(gc, i1);
/* 121 */       ceh ceh4 = ☃.d_(fx2);
/*     */       
/* 123 */       if (ceh4.a(bup.el)) {
/* 124 */         if (ceh4.c(a) == gc.f()) {
/* 125 */           n = i1;
/*     */         }
/*     */         break;
/*     */       } 
/* 129 */       if (ceh4.a(bup.em) || i1 == i) {
/* 130 */         if (i1 == i) {
/* 131 */           ceh4 = (ceh)MoreObjects.firstNonNull(ceh2, ceh4);
/*     */         }
/* 133 */         boolean bool6 = !((Boolean)ceh4.c(cbd.c)).booleanValue();
/* 134 */         boolean bool7 = ((Boolean)ceh4.c(cbd.a)).booleanValue();
/* 135 */         m = bool5 | ((bool6 && bool7) ? 1 : 0);
/*     */         
/* 137 */         arrayOfCeh[i1] = ceh4;
/*     */         
/* 139 */         if (i1 == i) {
/* 140 */           ☃.J().a(fx1, this, 10);
/* 141 */           bool4 &= bool6;
/*     */         } 
/*     */       } else {
/* 144 */         arrayOfCeh[i1] = null;
/* 145 */         bool4 = false;
/*     */       } 
/*     */     } 
/*     */     
/* 149 */     int k = bool4 & ((n > 1) ? 1 : 0);
/* 150 */     m &= k;
/* 151 */     ceh ceh3 = n().a(c, Boolean.valueOf(k)).a(b, Boolean.valueOf(m));
/*     */     
/* 153 */     if (n > 0) {
/* 154 */       fx fx2 = fx1.a(gc, n);
/* 155 */       gc gc1 = gc.f();
/* 156 */       ☃.a(fx2, ceh3.a(a, gc1), 3);
/* 157 */       a(☃, fx2, gc1);
/*     */       
/* 159 */       a(☃, fx2, k, m, j, bool3);
/*     */     } 
/*     */     
/* 162 */     a(☃, fx1, k, m, j, bool3);
/*     */     
/* 164 */     if (!bool1) {
/* 165 */       ☃.a(fx1, ceh3.a(a, gc), 3);
/* 166 */       if (bool2) {
/* 167 */         a(☃, fx1, gc);
/*     */       }
/*     */     } 
/*     */     
/* 171 */     if (j != k) {
/* 172 */       for (int i2 = 1; i2 < n; i2++) {
/* 173 */         fx fx2 = fx1.a(gc, i2);
/* 174 */         ceh ceh4 = arrayOfCeh[i2];
/* 175 */         if (ceh4 != null) {
/*     */ 
/*     */ 
/*     */           
/* 179 */           ☃.a(fx2, ceh4.a(c, Boolean.valueOf(k)), 3);
/* 180 */           if (!☃.d_(fx2).g());
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 188 */     a(aag1, fx1, ☃, false, true, -1, (ceh)null);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/* 192 */     if (bool2 && !bool4) {
/* 193 */       ☃.a((bfw)null, fx1, adq.pn, adr.e, 0.4F, 0.6F);
/* 194 */     } else if (!bool2 && bool4) {
/* 195 */       ☃.a((bfw)null, fx1, adq.pm, adr.e, 0.4F, 0.5F);
/* 196 */     } else if (bool1 && !bool3) {
/* 197 */       ☃.a((bfw)null, fx1, adq.pl, adr.e, 0.4F, 0.7F);
/* 198 */     } else if (!bool1 && bool3) {
/* 199 */       ☃.a((bfw)null, fx1, adq.po, adr.e, 0.4F, 1.2F / (☃.t.nextFloat() * 0.2F + 0.9F));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, gc gc1) {
/* 204 */     ☃.b(fx1, this);
/* 205 */     ☃.b(fx1.a(gc1.f()), this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 210 */     if (bool || ☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 213 */     boolean bool1 = ((Boolean)☃.c(c)).booleanValue();
/* 214 */     boolean bool2 = ((Boolean)☃.c(b)).booleanValue();
/*     */     
/* 216 */     if (bool1 || bool2) {
/* 217 */       a(brx1, fx1, ☃, true, false, -1, (ceh)null);
/*     */     }
/*     */     
/* 220 */     if (bool2) {
/* 221 */       brx1.b(fx1, this);
/* 222 */       brx1.b(fx1.a(((gc)☃.c(a)).f()), this);
/*     */     } 
/*     */     
/* 225 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 230 */     return ((Boolean)☃.c(b)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 235 */     if (!((Boolean)☃.c(b)).booleanValue()) {
/* 236 */       return 0;
/*     */     }
/*     */     
/* 239 */     if (☃.c(a) == gc1) {
/* 240 */       return 15;
/*     */     }
/*     */     
/* 243 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/* 248 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 253 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 258 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 263 */     ☃.a((cfj<?>[])new cfj[] { a, b, c });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */