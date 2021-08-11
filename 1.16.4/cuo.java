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
/*     */ public class cuo
/*     */   implements cup
/*     */ {
/*     */   @Nullable
/*     */   private final cul<?, ?> a;
/*     */   @Nullable
/*     */   private final cul<?, ?> b;
/*     */   
/*     */   public cuo(cgj ☃, boolean bool1, boolean bool2) {
/*  22 */     this.a = bool1 ? new cug(☃) : null;
/*  23 */     this.b = bool2 ? new cuq(☃) : null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fx ☃) {
/*  29 */     if (this.a != null) {
/*  30 */       this.a.a(☃);
/*     */     }
/*  32 */     if (this.b != null) {
/*  33 */       this.b.a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fx ☃, int i) {
/*  40 */     if (this.a != null) {
/*  41 */       this.a.a(☃, i);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  48 */     if (this.b != null && this.b.a()) {
/*  49 */       return true;
/*     */     }
/*  51 */     return (this.a != null && this.a.a());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(int ☃, boolean bool1, boolean bool2) {
/*  57 */     if (this.a != null && this.b != null) {
/*  58 */       int i = ☃ / 2;
/*  59 */       int j = this.a.a(i, bool1, bool2);
/*  60 */       int k = ☃ - i + j;
/*  61 */       int m = this.b.a(k, bool1, bool2);
/*  62 */       if (j == 0 && m > 0) {
/*  63 */         return this.a.a(m, bool1, bool2);
/*     */       }
/*  65 */       return m;
/*     */     } 
/*  67 */     if (this.a != null) {
/*  68 */       return this.a.a(☃, bool1, bool2);
/*     */     }
/*  70 */     if (this.b != null) {
/*  71 */       return this.b.a(☃, bool1, bool2);
/*     */     }
/*  73 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(gp ☃, boolean bool) {
/*  83 */     if (this.a != null) {
/*  84 */       this.a.a(☃, bool);
/*     */     }
/*  86 */     if (this.b != null) {
/*  87 */       this.b.a(☃, bool);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(brd ☃, boolean bool) {
/*  94 */     if (this.a != null) {
/*  95 */       this.a.a(☃, bool);
/*     */     }
/*  97 */     if (this.b != null) {
/*  98 */       this.b.a(☃, bool);
/*     */     }
/*     */   }
/*     */   
/*     */   public cum a(bsf ☃) {
/* 103 */     if (☃ == bsf.b) {
/* 104 */       if (this.a == null) {
/* 105 */         return cum.a.a;
/*     */       }
/* 107 */       return this.a;
/*     */     } 
/* 109 */     if (this.b == null) {
/* 110 */       return cum.a.a;
/*     */     }
/* 112 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(bsf ☃, gp gp1) {
/* 117 */     if (☃ == bsf.b) {
/* 118 */       if (this.a != null) {
/* 119 */         return this.a.b(gp1.s());
/*     */       }
/*     */     }
/* 122 */     else if (this.b != null) {
/* 123 */       return this.b.b(gp1.s());
/*     */     } 
/*     */     
/* 126 */     return "n/a";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bsf ☃, gp gp1, @Nullable cgb cgb1, boolean bool) {
/* 134 */     if (☃ == bsf.b) {
/* 135 */       if (this.a != null) {
/* 136 */         this.a.a(gp1.s(), cgb1, bool);
/*     */       }
/*     */     }
/* 139 */     else if (this.b != null) {
/* 140 */       this.b.a(gp1.s(), cgb1, bool);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(brd ☃, boolean bool) {
/* 146 */     if (this.a != null) {
/* 147 */       this.a.b(☃, bool);
/*     */     }
/* 149 */     if (this.b != null) {
/* 150 */       this.b.b(☃, bool);
/*     */     }
/*     */   }
/*     */   
/*     */   public int b(fx ☃, int i) {
/* 155 */     int j = (this.b == null) ? 0 : (this.b.b(☃) - i);
/* 156 */     int k = (this.a == null) ? 0 : this.a.b(☃);
/*     */     
/* 158 */     return Math.max(k, j);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cuo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */