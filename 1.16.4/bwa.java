/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bwa
/*     */   extends bud
/*     */ {
/*  41 */   public static final cfb a = bvz.a;
/*  42 */   public static final cey b = cex.A;
/*     */   static {
/*  44 */     c = (Map<blx, gw>)x.a(new Object2ObjectOpenHashMap(), ☃ -> ☃.defaultReturnValue(new gv()));
/*     */   }
/*     */   private static final Map<blx, gw> c;
/*     */   public static void a(brw ☃, gw gw1) {
/*  48 */     c.put(☃.h(), gw1);
/*     */   }
/*     */   
/*     */   protected bwa(ceg.c ☃) {
/*  52 */     super(☃);
/*  53 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  58 */     if (brx1.v) {
/*  59 */       return aou.a;
/*     */     }
/*     */     
/*  62 */     ccj ccj = brx1.c(fx1);
/*  63 */     if (ccj instanceof ccs) {
/*  64 */       bfw1.a((ccs)ccj);
/*  65 */       if (ccj instanceof cct) {
/*  66 */         bfw1.a(aea.ab);
/*     */       } else {
/*  68 */         bfw1.a(aea.ad);
/*     */       } 
/*     */     } 
/*     */     
/*  72 */     return aou.b;
/*     */   }
/*     */   
/*     */   protected void a(aag ☃, fx fx1) {
/*  76 */     fz fz = new fz(☃, fx1);
/*  77 */     ccs ccs = fz.<ccs>g();
/*     */     
/*  79 */     int i = ccs.h();
/*  80 */     if (i < 0) {
/*  81 */       ☃.c(1001, fx1, 0);
/*     */       
/*     */       return;
/*     */     } 
/*  85 */     bmb bmb = ccs.a(i);
/*  86 */     gw gw = a(bmb);
/*     */     
/*  88 */     if (gw != gw.a) {
/*  89 */       ccs.a(i, gw.dispense(fz, bmb));
/*     */     }
/*     */   }
/*     */   
/*     */   protected gw a(bmb ☃) {
/*  94 */     return c.get(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  99 */     boolean bool1 = (brx1.r(fx1) || brx1.r(fx1.b()));
/* 100 */     boolean bool2 = ((Boolean)☃.c(b)).booleanValue();
/*     */     
/* 102 */     if (bool1 && !bool2) {
/* 103 */       brx1.J().a(fx1, this, 4);
/* 104 */       brx1.a(fx1, ☃.a(b, Boolean.valueOf(true)), 4);
/* 105 */     } else if (!bool1 && bool2) {
/* 106 */       brx1.a(fx1, ☃.a(b, Boolean.valueOf(false)), 4);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 112 */     a(aag1, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 117 */     return new ccs();
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 122 */     return n().a(a, ☃.d().f());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 127 */     if (bmb1.t()) {
/* 128 */       ccj ccj = ☃.c(fx1);
/* 129 */       if (ccj instanceof ccs) {
/* 130 */         ((ccs)ccj).a(bmb1.r());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 137 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 140 */     ccj ccj = brx1.c(fx1);
/* 141 */     if (ccj instanceof ccs) {
/* 142 */       aoq.a(brx1, fx1, (ccs)ccj);
/*     */       
/* 144 */       brx1.c(fx1, this);
/*     */     } 
/* 146 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */   
/*     */   public static gk a(fy ☃) {
/* 150 */     gc gc = (gc)☃.e().c(a);
/*     */     
/* 152 */     double d1 = ☃.a() + 0.7D * gc.i();
/* 153 */     double d2 = ☃.b() + 0.7D * gc.j();
/* 154 */     double d3 = ☃.c() + 0.7D * gc.k();
/*     */     
/* 156 */     return new gl(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 161 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 166 */     return bic.a(brx1.c(fx1));
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 171 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 176 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 181 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 186 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */