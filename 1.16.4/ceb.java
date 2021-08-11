/*     */ import java.util.Arrays;
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
/*     */ public class ceb
/*     */   extends bvz
/*     */ {
/*  30 */   public static final cfe<cfi> b = cex.aJ;
/*  31 */   public static final cey c = cex.x;
/*     */ 
/*     */ 
/*     */   
/*  35 */   protected static final ddh d = buo.a(12.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  36 */   protected static final ddh e = buo.a(0.0D, 0.0D, 0.0D, 4.0D, 16.0D, 16.0D);
/*  37 */   protected static final ddh f = buo.a(0.0D, 0.0D, 12.0D, 16.0D, 16.0D, 16.0D);
/*  38 */   protected static final ddh g = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 4.0D);
/*  39 */   protected static final ddh h = buo.a(0.0D, 12.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  40 */   protected static final ddh i = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   protected static final ddh j = buo.a(6.0D, -4.0D, 6.0D, 10.0D, 12.0D, 10.0D);
/*  47 */   protected static final ddh k = buo.a(6.0D, 4.0D, 6.0D, 10.0D, 20.0D, 10.0D);
/*  48 */   protected static final ddh o = buo.a(6.0D, 6.0D, -4.0D, 10.0D, 10.0D, 12.0D);
/*  49 */   protected static final ddh p = buo.a(6.0D, 6.0D, 4.0D, 10.0D, 10.0D, 20.0D);
/*  50 */   protected static final ddh q = buo.a(-4.0D, 6.0D, 6.0D, 12.0D, 10.0D, 10.0D);
/*  51 */   protected static final ddh r = buo.a(4.0D, 6.0D, 6.0D, 20.0D, 10.0D, 10.0D);
/*     */   
/*  53 */   protected static final ddh s = buo.a(6.0D, 0.0D, 6.0D, 10.0D, 12.0D, 10.0D);
/*  54 */   protected static final ddh t = buo.a(6.0D, 4.0D, 6.0D, 10.0D, 16.0D, 10.0D);
/*  55 */   protected static final ddh u = buo.a(6.0D, 6.0D, 0.0D, 10.0D, 10.0D, 12.0D);
/*  56 */   protected static final ddh v = buo.a(6.0D, 6.0D, 4.0D, 10.0D, 10.0D, 16.0D);
/*  57 */   protected static final ddh w = buo.a(0.0D, 6.0D, 6.0D, 12.0D, 10.0D, 10.0D);
/*  58 */   protected static final ddh x = buo.a(4.0D, 6.0D, 6.0D, 16.0D, 10.0D, 10.0D);
/*     */   
/*  60 */   private static final ddh[] y = a(true);
/*  61 */   private static final ddh[] z = a(false);
/*     */   
/*     */   private static ddh[] a(boolean ☃) {
/*  64 */     return (ddh[])Arrays.<gc>stream(gc.values()).map(gc1 -> a(gc1, ☃)).toArray(☃ -> new ddh[☃]);
/*     */   }
/*     */   
/*     */   private static ddh a(gc ☃, boolean bool) {
/*  68 */     switch (null.a[☃.ordinal()])
/*     */     
/*     */     { default:
/*  71 */         return dde.a(i, bool ? t : k);
/*     */       case 2:
/*  73 */         return dde.a(h, bool ? s : j);
/*     */       case 3:
/*  75 */         return dde.a(g, bool ? v : p);
/*     */       case 4:
/*  77 */         return dde.a(f, bool ? u : o);
/*     */       case 5:
/*  79 */         return dde.a(e, bool ? x : r);
/*     */       case 6:
/*  81 */         break; }  return dde.a(d, bool ? w : q);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceb(ceg.c ☃) {
/*  86 */     super(☃);
/*  87 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, cfi.a).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/*  92 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  97 */     return (((Boolean)☃.c(c)).booleanValue() ? y : z)[((gc)☃.c(a)).ordinal()];
/*     */   }
/*     */   
/*     */   private boolean a(ceh ☃, ceh ceh1) {
/* 101 */     buo buo = (☃.c(b) == cfi.a) ? bup.aW : bup.aP;
/* 102 */     return (ceh1.a(buo) && ((Boolean)ceh1.c(cea.b)).booleanValue() && ceh1.c(a) == ☃.c(a));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/* 107 */     if (!☃.v && bfw1.bC.d) {
/* 108 */       fx fx2 = fx1.a(((gc)ceh1.c(a)).f());
/* 109 */       if (a(ceh1, ☃.d_(fx2))) {
/* 110 */         ☃.b(fx2, false);
/*     */       }
/*     */     } 
/* 113 */     super.a(☃, fx1, ceh1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 118 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 121 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */ 
/*     */     
/* 124 */     fx fx2 = fx1.a(((gc)☃.c(a)).f());
/* 125 */     if (a(☃, brx1.d_(fx2))) {
/* 126 */       brx1.b(fx2, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 132 */     if (gc1.f() == ☃.c(a) && 
/* 133 */       !☃.a(bry1, fx1)) {
/* 134 */       return bup.a.n();
/*     */     }
/*     */     
/* 137 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 142 */     ceh ceh1 = brz1.d_(fx1.a(((gc)☃.c(a)).f()));
/*     */     
/* 144 */     return (a(☃, ceh1) || (ceh1.a(bup.bo) && ceh1.c(a) == ☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 149 */     if (☃.a(brx1, fx1)) {
/* 150 */       fx fx3 = fx1.a(((gc)☃.c(a)).f());
/* 151 */       brx1.d_(fx3).a(brx1, fx3, buo1, fx2, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 157 */     return new bmb((ceh1.c(b) == cfi.b) ? bup.aP : bup.aW);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 162 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 167 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 172 */     ☃.a((cfj<?>[])new cfj[] { a, b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 177 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ceb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */