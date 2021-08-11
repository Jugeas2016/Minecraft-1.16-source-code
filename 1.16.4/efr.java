/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public abstract class efr<T extends aqm, M extends duc<T>>
/*     */   extends eeu<T>
/*     */   implements egk<T, M>
/*     */ {
/*  30 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   protected M e;
/*     */   
/*  35 */   protected final List<eit<T, M>> f = Lists.newArrayList();
/*     */   
/*     */   public efr(eet ☃, M m, float f) {
/*  38 */     super(☃);
/*  39 */     this.e = m;
/*  40 */     this.c = f;
/*     */   }
/*     */   
/*     */   protected final boolean a(eit<T, M> ☃) {
/*  44 */     return this.f.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public M c() {
/*  49 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  54 */     dfm1.a();
/*     */ 
/*     */     
/*  57 */     ((duc)this.e).c = d(☃, f2);
/*  58 */     ((duc)this.e).d = ☃.br();
/*  59 */     ((duc)this.e).e = ☃.w_();
/*     */     
/*  61 */     float f3 = afm.h(f2, ((aqm)☃).aB, ((aqm)☃).aA);
/*  62 */     float f4 = afm.h(f2, ((aqm)☃).aD, ((aqm)☃).aC);
/*  63 */     float f5 = f4 - f3;
/*     */ 
/*     */     
/*  66 */     if (☃.br() && ☃.ct() instanceof aqm) {
/*  67 */       aqm aqm = (aqm)☃.ct();
/*  68 */       f3 = afm.h(f2, aqm.aB, aqm.aA);
/*     */       
/*  70 */       f5 = f4 - f3;
/*  71 */       float f = afm.g(f5);
/*  72 */       if (f < -85.0F) {
/*  73 */         f = -85.0F;
/*     */       }
/*  75 */       if (f >= 85.0F) {
/*  76 */         f = 85.0F;
/*     */       }
/*  78 */       f3 = f4 - f;
/*  79 */       if (f * f > 2500.0F) {
/*  80 */         f3 += f * 0.2F;
/*     */       }
/*     */       
/*  83 */       f5 = f4 - f3;
/*     */     } 
/*     */     
/*  86 */     float f6 = afm.g(f2, ((aqm)☃).s, ((aqm)☃).q);
/*  87 */     if (☃.ae() == aqx.c) {
/*  88 */       gc gc = ☃.eo();
/*  89 */       if (gc != null) {
/*  90 */         float f = ☃.e(aqx.a) - 0.1F;
/*  91 */         dfm1.a((-gc.i() * f), 0.0D, (-gc.k() * f));
/*     */       } 
/*     */     } 
/*     */     
/*  95 */     float f7 = a(☃, f2);
/*  96 */     a(☃, dfm1, f7, f3, f2);
/*     */ 
/*     */ 
/*     */     
/* 100 */     dfm1.a(-1.0F, -1.0F, 1.0F);
/* 101 */     a(☃, dfm1, f2);
/*     */ 
/*     */     
/* 104 */     dfm1.a(0.0D, -1.5010000467300415D, 0.0D);
/*     */ 
/*     */     
/* 107 */     float f8 = 0.0F;
/* 108 */     float f9 = 0.0F;
/* 109 */     if (!☃.br() && ☃.aX()) {
/* 110 */       f8 = afm.g(f2, ((aqm)☃).au, ((aqm)☃).av);
/* 111 */       f9 = ((aqm)☃).aw - ((aqm)☃).av * (1.0F - f2);
/* 112 */       if (☃.w_()) {
/* 113 */         f9 *= 3.0F;
/*     */       }
/*     */       
/* 116 */       if (f8 > 1.0F) {
/* 117 */         f8 = 1.0F;
/*     */       }
/*     */     } 
/*     */     
/* 121 */     this.e.a(☃, f9, f8, f2);
/*     */     
/* 123 */     this.e.a(☃, f9, f8, f7, f5, f6);
/*     */     
/* 125 */     djz djz = djz.C();
/* 126 */     boolean bool1 = d(☃);
/* 127 */     boolean bool2 = (!bool1 && !☃.c(djz.s));
/* 128 */     boolean bool3 = djz.b((aqa)☃);
/*     */     
/* 130 */     eao eao = a(☃, bool1, bool2, bool3);
/* 131 */     if (eao != null) {
/* 132 */       dfq dfq = eag1.getBuffer(eao);
/* 133 */       int j = c((aqm)☃, b(☃, f2));
/* 134 */       this.e.a(dfm1, dfq, i, j, 1.0F, 1.0F, 1.0F, bool2 ? 0.15F : 1.0F);
/*     */     } 
/*     */     
/* 137 */     if (!☃.a_()) {
/* 138 */       for (eit<T, M> eit : this.f) {
/* 139 */         eit.a(dfm1, eag1, i, ☃, f9, f8, f2, f7, f5, f6);
/*     */       }
/*     */     }
/*     */     
/* 143 */     dfm1.b();
/* 144 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected eao a(T ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 149 */     vk vk = a(☃);
/* 150 */     if (bool2) {
/* 151 */       return eao.f(vk);
/*     */     }
/* 153 */     if (bool1) {
/* 154 */       return this.e.a(vk);
/*     */     }
/* 156 */     if (bool3) {
/* 157 */       return eao.n(vk);
/*     */     }
/* 159 */     return null;
/*     */   }
/*     */   
/*     */   public static int c(aqm ☃, float f) {
/* 163 */     return ejw.a(ejw.a(f), ejw.a((☃.an > 0 || ☃.aq > 0)));
/*     */   }
/*     */   
/*     */   protected boolean d(T ☃) {
/* 167 */     return !☃.bF();
/*     */   }
/*     */   
/*     */   private static float a(gc ☃) {
/* 171 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 173 */         return 90.0F;
/*     */       case 2:
/* 175 */         return 0.0F;
/*     */       case 3:
/* 177 */         return 270.0F;
/*     */       case 4:
/* 179 */         return 180.0F;
/*     */     } 
/* 181 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(T ☃) {
/* 186 */     return false;
/*     */   }
/*     */   
/*     */   protected void a(T ☃, dfm dfm1, float f1, float f2, float f3) {
/* 190 */     if (a(☃)) {
/* 191 */       f2 += (float)(Math.cos(((aqm)☃).K * 3.25D) * Math.PI * 0.4000000059604645D);
/*     */     }
/*     */     
/* 194 */     aqx aqx = ☃.ae();
/* 195 */     if (aqx != aqx.c) {
/* 196 */       dfm1.a(g.d.a(180.0F - f2));
/*     */     }
/* 198 */     if (((aqm)☃).aq > 0) {
/* 199 */       float f = (((aqm)☃).aq + f3 - 1.0F) / 20.0F * 1.6F;
/* 200 */       f = afm.c(f);
/* 201 */       if (f > 1.0F) {
/* 202 */         f = 1.0F;
/*     */       }
/* 204 */       dfm1.a(g.f.a(f * c(☃)));
/* 205 */     } else if (☃.dR()) {
/* 206 */       dfm1.a(g.b.a(-90.0F - ((aqm)☃).q));
/* 207 */       dfm1.a(g.d.a((((aqm)☃).K + f3) * -75.0F));
/* 208 */     } else if (aqx == aqx.c) {
/* 209 */       gc gc = ☃.eo();
/* 210 */       float f = (gc != null) ? a(gc) : f2;
/* 211 */       dfm1.a(g.d.a(f));
/* 212 */       dfm1.a(g.f.a(c(☃)));
/* 213 */       dfm1.a(g.d.a(270.0F));
/*     */     }
/* 215 */     else if (☃.S() || ☃ instanceof bfw) {
/* 216 */       String str = k.a(☃.R().getString());
/* 217 */       if (("Dinnerbone".equals(str) || "Grumm".equals(str)) && (
/* 218 */         !(☃ instanceof bfw) || ((bfw)☃).a(bfx.a))) {
/* 219 */         dfm1.a(0.0D, (☃.cz() + 0.1F), 0.0D);
/* 220 */         dfm1.a(g.f.a(180.0F));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected float d(T ☃, float f) {
/* 228 */     return ☃.r(f);
/*     */   }
/*     */   
/*     */   protected float a(T ☃, float f) {
/* 232 */     return ((aqm)☃).K + f;
/*     */   }
/*     */   
/*     */   protected float c(T ☃) {
/* 236 */     return 90.0F;
/*     */   }
/*     */   
/*     */   protected float b(T ☃, float f) {
/* 240 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(T ☃, dfm dfm1, float f) {}
/*     */ 
/*     */   
/*     */   protected boolean b(T ☃) {
/* 248 */     double d = this.b.b((aqa)☃);
/* 249 */     float f = ☃.bx() ? 32.0F : 64.0F;
/* 250 */     if (d >= (f * f)) {
/* 251 */       return false;
/*     */     }
/*     */     
/* 254 */     djz djz = djz.C();
/* 255 */     dzm dzm = djz.s;
/* 256 */     boolean bool = !☃.c(dzm);
/* 257 */     if (☃ != dzm) {
/* 258 */       ddp ddp1 = ☃.bG();
/* 259 */       ddp ddp2 = dzm.bG();
/* 260 */       if (ddp1 != null) {
/* 261 */         ddp.b b = ddp1.j();
/* 262 */         switch (null.b[b.ordinal()]) {
/*     */           case 1:
/* 264 */             return bool;
/*     */           case 2:
/* 266 */             return false;
/*     */           case 3:
/* 268 */             return (ddp2 == null) ? bool : ((ddp1.a(ddp2) && (ddp1.i() || bool)));
/*     */           case 4:
/* 270 */             return (ddp2 == null) ? bool : ((!ddp1.a(ddp2) && bool));
/*     */         } 
/* 272 */         return true;
/*     */       } 
/*     */     } 
/* 275 */     return (djz.x() && ☃ != djz.aa() && bool && !☃.bs());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */