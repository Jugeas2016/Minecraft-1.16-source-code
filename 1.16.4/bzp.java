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
/*     */ public class bzp
/*     */   extends buo
/*     */   implements bzu
/*     */ {
/*     */   private static final ddh d;
/*     */   private static final ddh e;
/*  30 */   private static final ddh f = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
/*  31 */   private static final ddh g = dde.b().a(0.0D, -1.0D, 0.0D);
/*     */ 
/*     */   
/*  34 */   public static final cfg a = cex.aB;
/*  35 */   public static final cey b = cex.C;
/*  36 */   public static final cey c = cex.b;
/*     */   
/*     */   static {
/*  39 */     ddh ☃ = buo.a(0.0D, 14.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*  40 */     ddh ddh1 = buo.a(0.0D, 0.0D, 0.0D, 2.0D, 16.0D, 2.0D);
/*  41 */     ddh ddh2 = buo.a(14.0D, 0.0D, 0.0D, 16.0D, 16.0D, 2.0D);
/*  42 */     ddh ddh3 = buo.a(0.0D, 0.0D, 14.0D, 2.0D, 16.0D, 16.0D);
/*  43 */     ddh ddh4 = buo.a(14.0D, 0.0D, 14.0D, 16.0D, 16.0D, 16.0D);
/*  44 */     d = dde.a(☃, new ddh[] { ddh1, ddh2, ddh3, ddh4 });
/*     */     
/*  46 */     ddh ddh5 = buo.a(0.0D, 0.0D, 0.0D, 2.0D, 2.0D, 16.0D);
/*  47 */     ddh ddh6 = buo.a(14.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
/*  48 */     ddh ddh7 = buo.a(0.0D, 0.0D, 14.0D, 16.0D, 2.0D, 16.0D);
/*  49 */     ddh ddh8 = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 2.0D);
/*  50 */     e = dde.a(f, new ddh[] { d, ddh6, ddh5, ddh8, ddh7 });
/*     */   }
/*     */   
/*     */   protected bzp(ceg.c ☃) {
/*  54 */     super(☃);
/*  55 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(7)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/*  60 */     ☃.a((cfj<?>[])new cfj[] { a, b, c });
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  65 */     if (!dcs1.a(☃.b().h())) {
/*  66 */       return ((Boolean)☃.c(c)).booleanValue() ? e : d;
/*     */     }
/*  68 */     return dde.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh a_(ceh ☃, brc brc1, fx fx1) {
/*  73 */     return dde.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, bny bny1) {
/*  78 */     return (bny1.m().b() == h());
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  83 */     fx fx = ☃.a();
/*  84 */     brx brx = ☃.p();
/*     */     
/*  86 */     int i = a(brx, fx);
/*  87 */     return n()
/*  88 */       .a(b, Boolean.valueOf((brx.b(fx).a() == cuy.c)))
/*  89 */       .a(a, Integer.valueOf(i))
/*  90 */       .a(c, Boolean.valueOf(a(brx, fx, i)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  95 */     if (!brx1.v) {
/*  96 */       brx1.J().a(fx1, this, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 102 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 103 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*     */     
/* 106 */     if (!bry1.s_()) {
/* 107 */       bry1.J().a(fx1, this, 1);
/*     */     }
/*     */     
/* 110 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 115 */     int i = a(aag1, fx1);
/*     */ 
/*     */     
/* 118 */     ceh ceh1 = ☃.a(a, Integer.valueOf(i)).a(c, Boolean.valueOf(a(aag1, fx1, i)));
/*     */     
/* 120 */     if (((Integer)ceh1.c(a)).intValue() == 7) {
/* 121 */       if (((Integer)☃.c(a)).intValue() == 7) {
/*     */         
/* 123 */         aag1.c(new bcu(aag1, fx1.u() + 0.5D, fx1.v(), fx1.w() + 0.5D, ceh1.a(b, Boolean.valueOf(false))));
/*     */       } else {
/*     */         
/* 126 */         aag1.b(fx1, true);
/*     */       } 
/* 128 */     } else if (☃ != ceh1) {
/* 129 */       aag1.a(fx1, ceh1, 3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/* 135 */     return (a(brz1, fx1) < 7);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 140 */     if (!dcs1.a(dde.b(), fx1, true) || dcs1.b()) {
/* 141 */       if (((Integer)☃.c(a)).intValue() != 0 && ((Boolean)☃.c(c)).booleanValue() && dcs1.a(g, fx1, true)) {
/* 142 */         return f;
/*     */       }
/* 144 */       return dde.a();
/*     */     } 
/* 146 */     return d;
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 151 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 152 */       return cuy.c.a(false);
/*     */     }
/* 154 */     return super.d(☃);
/*     */   }
/*     */   
/*     */   private boolean a(brc ☃, fx fx1, int i) {
/* 158 */     return (i > 0 && !☃.d_(fx1.c()).a(this));
/*     */   }
/*     */   
/*     */   public static int a(brc ☃, fx fx1) {
/* 162 */     fx.a a = fx1.i().c(gc.a);
/* 163 */     ceh ceh = ☃.d_(a);
/*     */     
/* 165 */     int i = 7;
/* 166 */     if (ceh.a(bup.lQ)) {
/* 167 */       i = ((Integer)ceh.c(a)).intValue();
/*     */     }
/* 169 */     else if (ceh.d(☃, a, gc.b)) {
/* 170 */       return 0;
/*     */     } 
/*     */     
/* 173 */     for (gc gc : gc.c.a) {
/* 174 */       ceh ceh1 = ☃.d_(a.a(fx1, gc));
/* 175 */       if (!ceh1.a(bup.lQ)) {
/*     */         continue;
/*     */       }
/*     */       
/* 179 */       i = Math.min(i, ((Integer)ceh1.c(a)).intValue() + 1);
/*     */       
/* 181 */       if (i == 1) {
/*     */         break;
/*     */       }
/*     */     } 
/* 185 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */