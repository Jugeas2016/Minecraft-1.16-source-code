/*     */ import java.util.function.Predicate;
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
/*     */ public class bkm
/*     */   extends bmo
/*     */   implements bno
/*     */ {
/*     */   public bkm(blx.a ☃) {
/*  23 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, brx brx1, aqm aqm1, int i) {
/*  28 */     if (!(aqm1 instanceof bfw)) {
/*     */       return;
/*     */     }
/*     */     
/*  32 */     bfw bfw = (bfw)aqm1;
/*  33 */     boolean bool1 = (bfw.bC.d || bpu.a(bpw.A, ☃) > 0);
/*  34 */     bmb bmb1 = bfw.f(☃);
/*     */     
/*  36 */     if (bmb1.a() && !bool1) {
/*     */       return;
/*     */     }
/*     */     
/*  40 */     if (bmb1.a()) {
/*  41 */       bmb1 = new bmb(bmd.kd);
/*     */     }
/*     */     
/*  44 */     int j = e_(☃) - i;
/*  45 */     float f = a(j);
/*  46 */     if (f < 0.1D) {
/*     */       return;
/*     */     }
/*     */     
/*  50 */     boolean bool2 = (bool1 && bmb1.b() == bmd.kd);
/*  51 */     if (!brx1.v) {
/*  52 */       bkc bkc = (bmb1.b() instanceof bkc) ? (bkc)bmb1.b() : (bkc)bmd.kd;
/*     */       
/*  54 */       bga bga = bkc.a(brx1, bmb1, bfw);
/*  55 */       bga.a(bfw, bfw.q, bfw.p, 0.0F, f * 3.0F, 1.0F);
/*  56 */       if (f == 1.0F) {
/*  57 */         bga.a(true);
/*     */       }
/*  59 */       int k = bpu.a(bpw.x, ☃);
/*  60 */       if (k > 0) {
/*  61 */         bga.h(bga.n() + k * 0.5D + 0.5D);
/*     */       }
/*  63 */       int m = bpu.a(bpw.y, ☃);
/*  64 */       if (m > 0) {
/*  65 */         bga.a(m);
/*     */       }
/*  67 */       if (bpu.a(bpw.z, ☃) > 0) {
/*  68 */         bga.f(100);
/*     */       }
/*  70 */       ☃.a(1, bfw, bfw1 -> bfw1.d(☃.dX()));
/*     */       
/*  72 */       if (bool2 || (bfw.bC.d && (bmb1.b() == bmd.qk || bmb1.b() == bmd.ql))) {
/*  73 */         bga.d = bga.a.c;
/*     */       }
/*     */       
/*  76 */       brx1.c(bga);
/*     */     } 
/*     */     
/*  79 */     brx1.a((bfw)null, bfw.cD(), bfw.cE(), bfw.cH(), adq.Y, adr.h, 1.0F, 1.0F / (h.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
/*  80 */     if (!bool2 && !bfw.bC.d) {
/*  81 */       bmb1.g(1);
/*  82 */       if (bmb1.a())
/*     */       {
/*  84 */         bfw.bm.f(bmb1);
/*     */       }
/*     */     } 
/*  87 */     bfw.b(aea.c.b(this));
/*     */   }
/*     */   
/*     */   public static float a(int ☃) {
/*  91 */     float f = ☃ / 20.0F;
/*  92 */     f = (f * f + f * 2.0F) / 3.0F;
/*  93 */     if (f > 1.0F) {
/*  94 */       f = 1.0F;
/*     */     }
/*  96 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e_(bmb ☃) {
/* 101 */     return 72000;
/*     */   }
/*     */ 
/*     */   
/*     */   public bnn d_(bmb ☃) {
/* 106 */     return bnn.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 111 */     bmb bmb = bfw1.b(aot1);
/* 112 */     boolean bool = !bfw1.f(bmb).a();
/* 113 */     if (bfw1.bC.d || bool) {
/* 114 */       bfw1.c(aot1);
/* 115 */       return aov.b(bmb);
/*     */     } 
/* 117 */     return aov.d(bmb);
/*     */   }
/*     */ 
/*     */   
/*     */   public Predicate<bmb> b() {
/* 122 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 127 */     return 15;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */