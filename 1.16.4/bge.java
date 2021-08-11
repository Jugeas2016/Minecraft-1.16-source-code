/*     */ import java.util.List;
/*     */ import java.util.UUID;
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
/*     */ public class bge
/*     */   extends aqa
/*     */ {
/*     */   private int b;
/*     */   private boolean c;
/*  29 */   private int d = 22;
/*     */   
/*     */   private boolean e;
/*     */   private aqm f;
/*     */   private UUID g;
/*     */   
/*     */   public bge(aqe<? extends bge> ☃, brx brx1) {
/*  36 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   public bge(brx ☃, double d1, double d2, double d3, float f, int i, aqm aqm1) {
/*  40 */     this(aqe.x, ☃);
/*  41 */     this.b = i;
/*  42 */     a(aqm1);
/*  43 */     this.p = f * 57.295776F;
/*  44 */     d(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {}
/*     */ 
/*     */   
/*     */   public void a(@Nullable aqm ☃) {
/*  52 */     this.f = ☃;
/*  53 */     this.g = (☃ == null) ? null : ☃.bS();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqm g() {
/*  58 */     if (this.f == null && this.g != null && this.l instanceof aag) {
/*  59 */       aqa ☃ = ((aag)this.l).a(this.g);
/*  60 */       if (☃ instanceof aqm) {
/*  61 */         this.f = (aqm)☃;
/*     */       }
/*     */     } 
/*     */     
/*  65 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  70 */     this.b = ☃.h("Warmup");
/*  71 */     if (☃.b("Owner")) {
/*  72 */       this.g = ☃.a("Owner");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/*  78 */     ☃.b("Warmup", this.b);
/*     */     
/*  80 */     if (this.g != null) {
/*  81 */       ☃.a("Owner", this.g);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  87 */     super.j();
/*     */     
/*  89 */     if (this.l.v) {
/*  90 */       if (this.e) {
/*  91 */         this.d--;
/*  92 */         if (this.d == 14) {
/*  93 */           for (int ☃ = 0; ☃ < 12; ☃++) {
/*  94 */             double d1 = cD() + (this.J.nextDouble() * 2.0D - 1.0D) * cy() * 0.5D;
/*  95 */             double d2 = cE() + 0.05D + this.J.nextDouble();
/*  96 */             double d3 = cH() + (this.J.nextDouble() * 2.0D - 1.0D) * cy() * 0.5D;
/*  97 */             double d4 = (this.J.nextDouble() * 2.0D - 1.0D) * 0.3D;
/*  98 */             double d5 = 0.3D + this.J.nextDouble() * 0.3D;
/*  99 */             double d6 = (this.J.nextDouble() * 2.0D - 1.0D) * 0.3D;
/* 100 */             this.l.a(hh.g, d1, d2 + 1.0D, d3, d4, d5, d6);
/*     */           }
/*     */         
/*     */         }
/*     */       } 
/* 105 */     } else if (--this.b < 0) {
/* 106 */       if (this.b == -8) {
/*     */         
/* 108 */         List<aqm> ☃ = this.l.a(aqm.class, cc().c(0.2D, 0.0D, 0.2D));
/* 109 */         for (aqm aqm1 : ☃) {
/* 110 */           c(aqm1);
/*     */         }
/*     */       } 
/* 113 */       if (!this.c) {
/* 114 */         this.l.a(this, (byte)4);
/* 115 */         this.c = true;
/*     */       } 
/* 117 */       if (--this.d < 0) {
/* 118 */         ad();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(aqm ☃) {
/* 125 */     aqm aqm1 = g();
/* 126 */     if (!☃.aX() || ☃.bM() || ☃ == aqm1) {
/*     */       return;
/*     */     }
/* 129 */     if (aqm1 == null) {
/* 130 */       ☃.a(apk.o, 6.0F);
/*     */     } else {
/* 132 */       if (aqm1.r(☃)) {
/*     */         return;
/*     */       }
/* 135 */       ☃.a(apk.c(this, aqm1), 6.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 141 */     super.a(☃);
/*     */     
/* 143 */     if (☃ == 4) {
/* 144 */       this.e = true;
/* 145 */       if (!aA()) {
/* 146 */         this.l.a(cD(), cE(), cH(), adq.dQ, cu(), 1.0F, this.J.nextFloat() * 0.2F + 0.85F, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 152 */     if (!this.e) {
/* 153 */       return 0.0F;
/*     */     }
/* 155 */     int i = this.d - 2;
/* 156 */     if (i <= 0) {
/* 157 */       return 1.0F;
/*     */     }
/* 159 */     return 1.0F - (i - ☃) / 20.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 164 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */