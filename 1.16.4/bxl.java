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
/*     */ 
/*     */ 
/*     */ public class bxl
/*     */   extends bud
/*     */ {
/*  33 */   public static final cfb a = cex.N;
/*  34 */   public static final cey b = cex.f;
/*     */   
/*  36 */   private static final ddh c = buo.a(0.0D, 10.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  37 */   private static final ddh d = buo.a(4.0D, 4.0D, 4.0D, 12.0D, 10.0D, 12.0D);
/*     */   
/*  39 */   private static final ddh e = dde.a(d, c);
/*  40 */   private static final ddh f = dde.a(e, ccx.a, dcr.e);
/*     */   
/*  42 */   private static final ddh g = dde.a(f, buo.a(6.0D, 0.0D, 6.0D, 10.0D, 4.0D, 10.0D));
/*  43 */   private static final ddh h = dde.a(f, buo.a(12.0D, 4.0D, 6.0D, 16.0D, 8.0D, 10.0D));
/*  44 */   private static final ddh i = dde.a(f, buo.a(6.0D, 4.0D, 0.0D, 10.0D, 8.0D, 4.0D));
/*  45 */   private static final ddh j = dde.a(f, buo.a(6.0D, 4.0D, 12.0D, 10.0D, 8.0D, 16.0D));
/*  46 */   private static final ddh k = dde.a(f, buo.a(0.0D, 4.0D, 6.0D, 4.0D, 8.0D, 10.0D));
/*     */   
/*  48 */   private static final ddh o = ccx.a;
/*  49 */   private static final ddh p = dde.a(ccx.a, buo.a(12.0D, 8.0D, 6.0D, 16.0D, 10.0D, 10.0D));
/*  50 */   private static final ddh q = dde.a(ccx.a, buo.a(6.0D, 8.0D, 0.0D, 10.0D, 10.0D, 4.0D));
/*  51 */   private static final ddh r = dde.a(ccx.a, buo.a(6.0D, 8.0D, 12.0D, 10.0D, 10.0D, 16.0D));
/*  52 */   private static final ddh s = dde.a(ccx.a, buo.a(0.0D, 8.0D, 6.0D, 4.0D, 10.0D, 10.0D));
/*     */   
/*     */   public bxl(ceg.c ☃) {
/*  55 */     super(☃);
/*  56 */     j(((ceh)this.n.b()).a(a, gc.a).a(b, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  61 */     switch (null.a[((gc)☃.c(a)).ordinal()]) {
/*     */       case 1:
/*  63 */         return g;
/*     */       case 2:
/*  65 */         return i;
/*     */       case 3:
/*  67 */         return j;
/*     */       case 4:
/*  69 */         return k;
/*     */       case 5:
/*  71 */         return h;
/*     */     } 
/*  73 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh a_(ceh ☃, brc brc1, fx fx1) {
/*  78 */     switch (null.a[((gc)☃.c(a)).ordinal()]) {
/*     */       case 1:
/*  80 */         return o;
/*     */       case 2:
/*  82 */         return q;
/*     */       case 3:
/*  84 */         return r;
/*     */       case 4:
/*  86 */         return s;
/*     */       case 5:
/*  88 */         return p;
/*     */     } 
/*  90 */     return ccx.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  95 */     gc gc = ☃.j().f();
/*  96 */     return n().a(a, (gc.n() == gc.a.b) ? gc.a : gc).a(b, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 101 */     return new ccy();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 106 */     if (bmb1.t()) {
/* 107 */       ccj ccj = ☃.c(fx1);
/* 108 */       if (ccj instanceof ccy) {
/* 109 */         ((ccy)ccj).a(bmb1.r());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 116 */     if (ceh1.a(☃.b())) {
/*     */       return;
/*     */     }
/* 119 */     a(brx1, fx1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 124 */     if (brx1.v) {
/* 125 */       return aou.a;
/*     */     }
/*     */     
/* 128 */     ccj ccj = brx1.c(fx1);
/* 129 */     if (ccj instanceof ccy) {
/* 130 */       bfw1.a((ccy)ccj);
/* 131 */       bfw1.a(aea.ac);
/*     */     } 
/*     */     
/* 134 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 139 */     a(brx1, fx1, ☃);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1) {
/* 143 */     boolean bool = !☃.r(fx1);
/* 144 */     if (bool != ((Boolean)ceh1.c(b)).booleanValue()) {
/* 145 */       ☃.a(fx1, ceh1.a(b, Boolean.valueOf(bool)), 4);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 151 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 154 */     ccj ccj = brx1.c(fx1);
/* 155 */     if (ccj instanceof ccy) {
/* 156 */       aoq.a(brx1, fx1, (ccy)ccj);
/*     */       
/* 158 */       brx1.c(fx1, this);
/*     */     } 
/*     */     
/* 161 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 166 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 171 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 176 */     return bic.a(brx1.c(fx1));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 181 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 186 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 191 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/* 196 */     ccj ccj = brx1.c(fx1);
/* 197 */     if (ccj instanceof ccy) {
/* 198 */       ((ccy)ccj).a(aqa1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 204 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */