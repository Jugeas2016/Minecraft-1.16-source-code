/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bgx
/*     */   extends bgs
/*     */   implements bgj
/*     */ {
/*  40 */   public static final Predicate<aqm> b = aqm::dO;
/*     */   
/*     */   public bgx(aqe<? extends bgx> ☃, brx brx1) {
/*  43 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bgx(brx ☃, aqm aqm1) {
/*  47 */     super((aqe)aqe.aJ, aqm1, ☃);
/*     */   }
/*     */   
/*     */   public bgx(brx ☃, double d1, double d2, double d3) {
/*  51 */     super((aqe)aqe.aJ, d1, d2, d3, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected blx h() {
/*  56 */     return bmd.qj;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float k() {
/*  61 */     return 0.05F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcj ☃) {
/*  66 */     super.a(☃);
/*  67 */     if (this.l.v) {
/*     */       return;
/*     */     }
/*  70 */     bmb bmb = g();
/*  71 */     bnt bnt = bnv.d(bmb);
/*  72 */     List<apu> list = bnv.a(bmb);
/*  73 */     boolean bool = (bnt == bnw.b && list.isEmpty());
/*  74 */     gc gc = ☃.b();
/*  75 */     fx fx1 = ☃.a();
/*  76 */     fx fx2 = fx1.a(gc);
/*     */     
/*  78 */     if (bool) {
/*  79 */       a(fx2, gc);
/*  80 */       a(fx2.a(gc.f()), gc);
/*  81 */       for (gc gc1 : gc.c.a) {
/*  82 */         a(fx2.a(gc1), gc1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcl ☃) {
/*  89 */     super.a(☃);
/*  90 */     if (this.l.v) {
/*     */       return;
/*     */     }
/*  93 */     bmb bmb = g();
/*     */     
/*  95 */     bnt bnt = bnv.d(bmb);
/*  96 */     List<apu> list = bnv.a(bmb);
/*  97 */     boolean bool = (bnt == bnw.b && list.isEmpty());
/*     */     
/*  99 */     if (bool) {
/* 100 */       m();
/* 101 */     } else if (!list.isEmpty()) {
/* 102 */       if (n()) {
/* 103 */         a(bmb, bnt);
/*     */       } else {
/* 105 */         a(list, (☃.c() == dcl.a.c) ? ((dck)☃).a() : null);
/*     */       } 
/*     */     } 
/* 108 */     int i = bnt.b() ? 2007 : 2002;
/* 109 */     this.l.c(i, cB(), bnv.c(bmb));
/*     */     
/* 111 */     ad();
/*     */   }
/*     */   
/*     */   private void m() {
/* 115 */     dci ☃ = cc().c(4.0D, 2.0D, 4.0D);
/* 116 */     List<aqm> list = this.l.a(aqm.class, ☃, b);
/* 117 */     if (!list.isEmpty()) {
/* 118 */       for (aqm aqm : list) {
/* 119 */         double d = h(aqm);
/* 120 */         if (d < 16.0D && aqm.dO()) {
/* 121 */           aqm.a(apk.c(aqm, v()), 1.0F);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(List<apu> ☃, @Nullable aqa aqa1) {
/* 128 */     dci dci = cc().c(4.0D, 2.0D, 4.0D);
/* 129 */     List<aqm> list = this.l.a(aqm.class, dci);
/*     */     
/* 131 */     if (!list.isEmpty()) {
/* 132 */       for (aqm aqm : list) {
/* 133 */         if (!aqm.eh()) {
/*     */           continue;
/*     */         }
/* 136 */         double d = h(aqm);
/* 137 */         if (d < 16.0D) {
/* 138 */           double d1 = 1.0D - Math.sqrt(d) / 4.0D;
/* 139 */           if (aqm == aqa1) {
/* 140 */             d1 = 1.0D;
/*     */           }
/*     */           
/* 143 */           for (apu apu : ☃) {
/* 144 */             aps aps = apu.a();
/* 145 */             if (aps.a()) {
/* 146 */               aps.a(this, v(), aqm, apu.c(), d1); continue;
/*     */             } 
/* 148 */             int i = (int)(d1 * apu.b() + 0.5D);
/* 149 */             if (i > 20) {
/* 150 */               aqm.c(new apu(aps, i, apu.c(), apu.d(), apu.e()));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(bmb ☃, bnt bnt1) {
/* 160 */     apz apz = new apz(this.l, cD(), cE(), cH());
/* 161 */     aqa aqa = v();
/* 162 */     if (aqa instanceof aqm) {
/* 163 */       apz.a((aqm)aqa);
/*     */     }
/* 165 */     apz.a(3.0F);
/* 166 */     apz.b(-0.5F);
/* 167 */     apz.d(10);
/* 168 */     apz.c(-apz.g() / apz.m());
/* 169 */     apz.a(bnt1);
/* 170 */     for (apu apu : bnv.b(☃)) {
/* 171 */       apz.a(new apu(apu));
/*     */     }
/*     */     
/* 174 */     md md = ☃.o();
/* 175 */     if (md != null && md.c("CustomPotionColor", 99)) {
/* 176 */       apz.a(md.h("CustomPotionColor"));
/*     */     }
/*     */     
/* 179 */     this.l.c(apz);
/*     */   }
/*     */   
/*     */   private boolean n() {
/* 183 */     return (g().b() == bmd.qm);
/*     */   }
/*     */   
/*     */   private void a(fx ☃, gc gc1) {
/* 187 */     ceh ceh = this.l.d_(☃);
/* 188 */     if (ceh.a(aed.an)) {
/* 189 */       this.l.a(☃, false);
/* 190 */     } else if (buy.g(ceh)) {
/* 191 */       this.l.a((bfw)null, 1009, ☃, 0);
/* 192 */       buy.c(this.l, ☃, ceh);
/* 193 */       this.l.a(☃, ceh.a(buy.b, Boolean.valueOf(false)));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */