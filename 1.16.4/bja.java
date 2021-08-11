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
/*     */ public abstract class bja
/*     */   extends bic
/*     */ {
/*  21 */   protected final bjm c = new bjm();
/*  22 */   protected final aon d = new apa(this, 2)
/*     */     {
/*     */       public void X_() {
/*  25 */         super.X_();
/*  26 */         this.a.a(this);
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   protected final bim e;
/*     */ 
/*     */   
/*     */   protected final bfw f;
/*     */ 
/*     */ 
/*     */   
/*     */   public bja(@Nullable bje<?> ☃, int i, bfv bfv1, bim bim1) {
/*  40 */     super(☃, i);
/*  41 */     this.e = bim1;
/*  42 */     this.f = bfv1.e;
/*     */     
/*  44 */     a(new bjr(this.d, 0, 27, 47));
/*  45 */     a(new bjr(this.d, 1, 76, 47));
/*  46 */     a(new bjr(this, this.c, 2, 134, 47)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  49 */             return false;
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean a(bfw ☃) {
/*  54 */             return this.a.b(☃, f());
/*     */           }
/*     */ 
/*     */           
/*     */           public bmb a(bfw ☃, bmb bmb1) {
/*  59 */             return this.a.a(☃, bmb1);
/*     */           }
/*     */         });
/*     */     int j;
/*  63 */     for (j = 0; j < 3; j++) {
/*  64 */       for (int k = 0; k < 9; k++) {
/*  65 */         a(new bjr(bfv1, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
/*     */       }
/*     */     } 
/*  68 */     for (j = 0; j < 9; j++) {
/*  69 */       a(new bjr(bfv1, j, 8 + j * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/*  77 */     super.a(☃);
/*     */     
/*  79 */     if (☃ == this.d) {
/*  80 */       e();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/*  86 */     super.b(☃);
/*  87 */     this.e.a((brx1, fx1) -> a(☃, brx1, this.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  92 */     return ((Boolean)this.e.<Boolean>a((brx1, fx1) -> !a(brx1.d_(fx1)) ? Boolean.valueOf(false) : Boolean.valueOf((☃.h(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D) <= 64.0D)), 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  97 */         Boolean.valueOf(true))).booleanValue();
/*     */   }
/*     */   
/*     */   protected boolean a(bmb ☃) {
/* 101 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 106 */     bmb bmb = bmb.b;
/* 107 */     bjr bjr = this.a.get(i);
/* 108 */     if (bjr != null && bjr.f()) {
/* 109 */       bmb bmb1 = bjr.e();
/* 110 */       bmb = bmb1.i();
/*     */       
/* 112 */       if (i == 2) {
/* 113 */         if (!a(bmb1, 3, 39, true)) {
/* 114 */           return bmb.b;
/*     */         }
/* 116 */         bjr.a(bmb1, bmb);
/* 117 */       } else if (i == 0 || i == 1) {
/* 118 */         if (!a(bmb1, 3, 39, false)) {
/* 119 */           return bmb.b;
/*     */         }
/* 121 */       } else if (i >= 3 && i < 39) {
/* 122 */         int j = a(bmb) ? 1 : 0;
/* 123 */         if (!a(bmb1, j, 2, false)) {
/* 124 */           return bmb.b;
/*     */         }
/*     */       } 
/*     */       
/* 128 */       if (bmb1.a()) {
/* 129 */         bjr.d(bmb.b);
/*     */       } else {
/* 131 */         bjr.d();
/*     */       } 
/* 133 */       if (bmb1.E() == bmb.E()) {
/* 134 */         return bmb.b;
/*     */       }
/* 136 */       bjr.a(☃, bmb1);
/*     */     } 
/*     */     
/* 139 */     return bmb;
/*     */   }
/*     */   
/*     */   protected abstract boolean b(bfw parambfw, boolean paramBoolean);
/*     */   
/*     */   protected abstract bmb a(bfw parambfw, bmb parambmb);
/*     */   
/*     */   protected abstract boolean a(ceh paramceh);
/*     */   
/*     */   public abstract void e();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */