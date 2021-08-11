/*     */ import java.util.List;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
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
/*     */ public class cch
/*     */   extends ccj
/*     */   implements cdm
/*     */ {
/*     */   private long g;
/*     */   public int a;
/*     */   public boolean b;
/*     */   public gc c;
/*     */   private List<aqm> h;
/*     */   private boolean i;
/*     */   private int j;
/*     */   
/*     */   public cch() {
/*  44 */     super(cck.D);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, int i) {
/*  49 */     if (☃ == 1) {
/*  50 */       f();
/*  51 */       this.j = 0;
/*  52 */       this.c = gc.a(i);
/*  53 */       this.a = 0;
/*  54 */       this.b = true;
/*  55 */       return true;
/*     */     } 
/*  57 */     return super.a_(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  62 */     if (this.b) {
/*  63 */       this.a++;
/*     */     }
/*     */     
/*  66 */     if (this.a >= 50) {
/*  67 */       this.b = false;
/*  68 */       this.a = 0;
/*     */     } 
/*     */     
/*  71 */     if (this.a >= 5 && this.j == 0 && h()) {
/*  72 */       this.i = true;
/*  73 */       d();
/*     */     } 
/*     */     
/*  76 */     if (this.i) {
/*  77 */       if (this.j < 40) {
/*  78 */         this.j++;
/*     */       } else {
/*  80 */         a(this.d);
/*  81 */         b(this.d);
/*  82 */         this.i = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void d() {
/*  88 */     this.d.a((bfw)null, o(), adq.aK, adr.e, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(gc ☃) {
/*  92 */     fx fx = o();
/*     */     
/*  94 */     this.c = ☃;
/*  95 */     if (this.b) {
/*  96 */       this.a = 0;
/*     */     } else {
/*  98 */       this.b = true;
/*     */     } 
/*     */     
/* 101 */     this.d.a(fx, p().b(), 1, ☃.c());
/*     */   }
/*     */   
/*     */   private void f() {
/* 105 */     fx ☃ = o();
/*     */     
/* 107 */     if (this.d.T() > this.g + 60L || this.h == null) {
/* 108 */       this.g = this.d.T();
/* 109 */       dci dci = (new dci(☃)).g(48.0D);
/* 110 */       this.h = this.d.a(aqm.class, dci);
/*     */     } 
/*     */     
/* 113 */     if (!this.d.v) {
/* 114 */       for (aqm aqm : this.h) {
/* 115 */         if (!aqm.aX() || aqm.y) {
/*     */           continue;
/*     */         }
/* 118 */         if (☃.a(aqm.cA(), 32.0D)) {
/* 119 */           aqm.cJ().a(ayd.C, Long.valueOf(this.d.T()));
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean h() {
/* 126 */     fx ☃ = o();
/* 127 */     for (aqm aqm : this.h) {
/* 128 */       if (!aqm.aX() || aqm.y) {
/*     */         continue;
/*     */       }
/* 131 */       if (☃.a(aqm.cA(), 32.0D) && 
/* 132 */         aqm.X().a(aee.c)) {
/* 133 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 137 */     return false;
/*     */   }
/*     */   
/*     */   private void a(brx ☃) {
/* 141 */     if (☃.v) {
/*     */       return;
/*     */     }
/*     */     
/* 145 */     this.h.stream()
/* 146 */       .filter(this::a)
/* 147 */       .forEach(this::b);
/*     */   }
/*     */   
/*     */   private void b(brx ☃) {
/* 151 */     if (!☃.v) {
/*     */       return;
/*     */     }
/*     */     
/* 155 */     fx fx = o();
/* 156 */     MutableInt mutableInt = new MutableInt(16700985);
/*     */     
/* 158 */     int i = (int)this.h.stream().filter(aqm1 -> ☃.a(aqm1.cA(), 48.0D)).count();
/*     */     
/* 160 */     this.h.stream()
/* 161 */       .filter(this::a)
/* 162 */       .forEach(aqm1 -> {
/*     */           float f1 = 1.0F;
/*     */           float f2 = afm.a((aqm1.cD() - ☃.u()) * (aqm1.cD() - ☃.u()) + (aqm1.cH() - ☃.w()) * (aqm1.cH() - ☃.w()));
/*     */           double d1 = (☃.u() + 0.5F) + (1.0F / f2) * (aqm1.cD() - ☃.u());
/*     */           double d2 = (☃.w() + 0.5F) + (1.0F / f2) * (aqm1.cH() - ☃.w());
/*     */           int j = afm.a((i - 21) / -2, 3, 15);
/*     */           for (int k = 0; k < j; k++) {
/*     */             int m = mutableInt.addAndGet(5);
/*     */             double d3 = aez.a.b(m) / 255.0D;
/*     */             double d4 = aez.a.c(m) / 255.0D;
/*     */             double d5 = aez.a.d(m) / 255.0D;
/*     */             brx1.a(hh.u, d1, (☃.v() + 0.5F), d2, d3, d4, d5);
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean a(aqm ☃) {
/* 180 */     return (☃.aX() && !☃.y && 
/*     */       
/* 182 */       o().a(☃.cA(), 48.0D) && ☃
/* 183 */       .X().a(aee.c));
/*     */   }
/*     */   
/*     */   private void b(aqm ☃) {
/* 187 */     ☃.c(new apu(apw.x, 60));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */