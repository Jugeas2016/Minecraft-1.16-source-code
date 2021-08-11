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
/*     */ public class bwr
/*     */   extends bxm
/*     */ {
/*  24 */   public static final cey a = cex.u;
/*  25 */   public static final cey b = cex.w;
/*  26 */   public static final cey c = cex.q;
/*     */   
/*  28 */   protected static final ddh d = buo.a(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
/*  29 */   protected static final ddh e = buo.a(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D);
/*     */   
/*  31 */   protected static final ddh f = buo.a(0.0D, 0.0D, 6.0D, 16.0D, 13.0D, 10.0D);
/*  32 */   protected static final ddh g = buo.a(6.0D, 0.0D, 0.0D, 10.0D, 13.0D, 16.0D);
/*     */   
/*  34 */   protected static final ddh h = buo.a(0.0D, 0.0D, 6.0D, 16.0D, 24.0D, 10.0D);
/*  35 */   protected static final ddh i = buo.a(6.0D, 0.0D, 0.0D, 10.0D, 24.0D, 16.0D);
/*     */   
/*  37 */   protected static final ddh j = dde.a(
/*  38 */       buo.a(0.0D, 5.0D, 7.0D, 2.0D, 16.0D, 9.0D), 
/*  39 */       buo.a(14.0D, 5.0D, 7.0D, 16.0D, 16.0D, 9.0D));
/*     */   
/*  41 */   protected static final ddh k = dde.a(
/*  42 */       buo.a(7.0D, 5.0D, 0.0D, 9.0D, 16.0D, 2.0D), 
/*  43 */       buo.a(7.0D, 5.0D, 14.0D, 9.0D, 16.0D, 16.0D));
/*     */ 
/*     */   
/*  46 */   protected static final ddh o = dde.a(
/*  47 */       buo.a(0.0D, 2.0D, 7.0D, 2.0D, 13.0D, 9.0D), 
/*  48 */       buo.a(14.0D, 2.0D, 7.0D, 16.0D, 13.0D, 9.0D));
/*     */   
/*  50 */   protected static final ddh p = dde.a(
/*  51 */       buo.a(7.0D, 2.0D, 0.0D, 9.0D, 13.0D, 2.0D), 
/*  52 */       buo.a(7.0D, 2.0D, 14.0D, 9.0D, 13.0D, 16.0D));
/*     */ 
/*     */   
/*     */   public bwr(ceg.c ☃) {
/*  56 */     super(☃);
/*     */     
/*  58 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  63 */     if (((Boolean)☃.c(c)).booleanValue()) {
/*  64 */       return (((gc)☃.c(aq)).n() == gc.a.a) ? g : f;
/*     */     }
/*  66 */     return (((gc)☃.c(aq)).n() == gc.a.a) ? e : d;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  71 */     gc.a a = gc1.n();
/*  72 */     if (((gc)☃.c(aq)).g().n() == a) {
/*  73 */       boolean bool = (h(ceh1) || h(bry1.d_(fx1.a(gc1.f()))));
/*  74 */       return ☃.a(c, Boolean.valueOf(bool));
/*     */     } 
/*     */     
/*  77 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  82 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  83 */       return dde.a();
/*     */     }
/*  85 */     return (((gc)☃.c(aq)).n() == gc.a.c) ? h : i;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh d(ceh ☃, brc brc1, fx fx1) {
/*  90 */     if (((Boolean)☃.c(c)).booleanValue()) {
/*  91 */       return (((gc)☃.c(aq)).n() == gc.a.a) ? p : o;
/*     */     }
/*  93 */     return (((gc)☃.c(aq)).n() == gc.a.a) ? k : j;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/*  98 */     switch (null.a[cxe1.ordinal()]) {
/*     */       case 1:
/* 100 */         return ((Boolean)☃.c(a)).booleanValue();
/*     */       case 2:
/* 102 */         return false;
/*     */       case 3:
/* 104 */         return ((Boolean)☃.c(a)).booleanValue();
/*     */     } 
/* 106 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 112 */     brx brx = ☃.p();
/* 113 */     fx fx = ☃.a();
/*     */     
/* 115 */     boolean bool1 = brx.r(fx);
/* 116 */     gc gc = ☃.f();
/*     */     
/* 118 */     gc.a a = gc.n();
/*     */     
/* 120 */     boolean bool2 = ((a == gc.a.c && (h(brx.d_(fx.f())) || h(brx.d_(fx.g())))) || (a == gc.a.a && (h(brx.d_(fx.d())) || h(brx.d_(fx.e())))));
/* 121 */     return n().a(aq, gc).a(a, Boolean.valueOf(bool1)).a(b, Boolean.valueOf(bool1)).a(c, Boolean.valueOf(bool2));
/*     */   }
/*     */   
/*     */   private boolean h(ceh ☃) {
/* 125 */     return ☃.b().a(aed.F);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 130 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 131 */       ☃ = ☃.a(a, Boolean.valueOf(false));
/* 132 */       brx1.a(fx1, ☃, 10);
/*     */     } else {
/*     */       
/* 135 */       gc gc = bfw1.bZ();
/* 136 */       if (☃.c(aq) == gc.f()) {
/* 137 */         ☃ = ☃.a(aq, gc);
/*     */       }
/* 139 */       ☃ = ☃.a(a, Boolean.valueOf(true));
/* 140 */       brx1.a(fx1, ☃, 10);
/*     */     } 
/*     */     
/* 143 */     brx1.a(bfw1, ((Boolean)☃.c(a)).booleanValue() ? 1008 : 1014, fx1, 0);
/* 144 */     return aou.a(brx1.v);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 149 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/* 153 */     boolean bool1 = brx1.r(fx1);
/* 154 */     if (((Boolean)☃.c(b)).booleanValue() != bool1) {
/* 155 */       brx1.a(fx1, ☃.a(b, Boolean.valueOf(bool1)).a(a, Boolean.valueOf(bool1)), 2);
/* 156 */       if (((Boolean)☃.c(a)).booleanValue() != bool1) {
/* 157 */         brx1.a((bfw)null, bool1 ? 1008 : 1014, fx1, 0);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 164 */     ☃.a((cfj<?>[])new cfj[] { aq, a, b, c });
/*     */   }
/*     */   
/*     */   public static boolean a(ceh ☃, gc gc1) {
/* 168 */     return (((gc)☃.c(aq)).n() == gc1.g().n());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */