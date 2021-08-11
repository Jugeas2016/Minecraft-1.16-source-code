/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
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
/*     */ public class awc
/*     */   extends avv
/*     */ {
/*     */   public final bbe a;
/*     */   private double b;
/*     */   private int c;
/*     */   
/*     */   public awc(bbe ☃, double d) {
/*  23 */     this.a = ☃;
/*  24 */     this.b = d;
/*  25 */     a(EnumSet.of(avv.a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  30 */     if (this.a.eB() || this.a.fC()) {
/*  31 */       return false;
/*     */     }
/*     */     
/*  34 */     List<aqa> ☃ = this.a.l.a(this.a, this.a.cc().c(9.0D, 4.0D, 9.0D), ☃ -> {
/*     */           aqe<?> aqe = ☃.X();
/*  36 */           return (aqe == aqe.Q || aqe == aqe.aL);
/*     */         });
/*     */     
/*  39 */     bbe bbe1 = null;
/*  40 */     double d = Double.MAX_VALUE;
/*  41 */     for (aqa aqa : ☃) {
/*  42 */       bbe bbe2 = (bbe)aqa;
/*     */       
/*  44 */       if (!bbe2.fC() || bbe2.fB()) {
/*     */         continue;
/*     */       }
/*     */       
/*  48 */       double d1 = this.a.h(bbe2);
/*  49 */       if (d1 > d) {
/*     */         continue;
/*     */       }
/*     */       
/*  53 */       d = d1;
/*  54 */       bbe1 = bbe2;
/*     */     } 
/*     */     
/*  57 */     if (bbe1 == null)
/*     */     {
/*  59 */       for (aqa aqa : ☃) {
/*  60 */         bbe bbe2 = (bbe)aqa;
/*     */         
/*  62 */         if (!bbe2.eB()) {
/*     */           continue;
/*     */         }
/*     */         
/*  66 */         if (bbe2.fB()) {
/*     */           continue;
/*     */         }
/*     */         
/*  70 */         double d1 = this.a.h(bbe2);
/*  71 */         if (d1 > d) {
/*     */           continue;
/*     */         }
/*     */         
/*  75 */         d = d1;
/*  76 */         bbe1 = bbe2;
/*     */       } 
/*     */     }
/*     */     
/*  80 */     if (bbe1 == null) {
/*  81 */       return false;
/*     */     }
/*  83 */     if (d < 4.0D) {
/*  84 */       return false;
/*     */     }
/*     */     
/*  87 */     if (!bbe1.eB() && !a(bbe1, 1)) {
/*  88 */       return false;
/*     */     }
/*     */     
/*  91 */     this.a.a(bbe1);
/*     */     
/*  93 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  98 */     if (!this.a.fC() || !this.a.fD().aX() || !a(this.a, 0)) {
/*  99 */       return false;
/*     */     }
/*     */     
/* 102 */     double ☃ = this.a.h(this.a.fD());
/* 103 */     if (☃ > 676.0D) {
/* 104 */       if (this.b <= 3.0D) {
/* 105 */         this.b *= 1.2D;
/* 106 */         this.c = 40;
/* 107 */         return true;
/*     */       } 
/*     */       
/* 110 */       if (this.c == 0) {
/* 111 */         return false;
/*     */       }
/*     */     } 
/* 114 */     if (this.c > 0) {
/* 115 */       this.c--;
/*     */     }
/* 117 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 122 */     this.a.fA();
/* 123 */     this.b = 2.1D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 128 */     if (!this.a.fC()) {
/*     */       return;
/*     */     }
/*     */     
/* 132 */     if (this.a.eC() instanceof bcq) {
/*     */       return;
/*     */     }
/*     */     
/* 136 */     bbe ☃ = this.a.fD();
/* 137 */     double d = this.a.g(☃);
/*     */     
/* 139 */     float f = 2.0F;
/* 140 */     dcn dcn = (new dcn(☃.cD() - this.a.cD(), ☃.cE() - this.a.cE(), ☃.cH() - this.a.cH())).d().a(Math.max(d - 2.0D, 0.0D));
/* 141 */     this.a.x().a(this.a.cD() + dcn.b, this.a.cE() + dcn.c, this.a.cH() + dcn.d, this.b);
/*     */   }
/*     */   
/*     */   private boolean a(bbe ☃, int i) {
/* 145 */     if (i > 8) {
/* 146 */       return false;
/*     */     }
/*     */     
/* 149 */     if (☃.fC()) {
/* 150 */       if (☃.fD().eB()) {
/* 151 */         return true;
/*     */       }
/* 153 */       return a(☃.fD(), ++i);
/*     */     } 
/* 155 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */