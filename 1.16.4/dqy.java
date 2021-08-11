/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class dqy
/*     */   extends dpp<bjv>
/*     */ {
/*  18 */   private static final vk A = new vk("textures/gui/container/stonecutter.png");
/*     */ 
/*     */ 
/*     */   
/*     */   private float B;
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean C;
/*     */ 
/*     */   
/*     */   private int D;
/*     */ 
/*     */   
/*     */   private boolean E;
/*     */ 
/*     */ 
/*     */   
/*     */   public dqy(bjv ☃, bfv bfv1, nr nr1) {
/*  37 */     super(☃, bfv1, nr1);
/*  38 */     ☃.a(this::l);
/*  39 */     this.q--;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  44 */     super.a(☃, i, j, f);
/*  45 */     a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/*  50 */     a(☃);
/*     */     
/*  52 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  53 */     this.i.M().a(A);
/*  54 */     int k = this.w;
/*  55 */     int m = this.x;
/*  56 */     b(☃, k, m, 0, 0, this.b, this.c);
/*     */     
/*  58 */     int n = (int)(41.0F * this.B);
/*  59 */     b(☃, k + 119, m + 15 + n, 176 + (k() ? 0 : 12), 0, 12, 15);
/*     */     
/*  61 */     int i1 = this.w + 52;
/*  62 */     int i2 = this.x + 14;
/*     */     
/*  64 */     int i3 = this.D + 12;
/*     */     
/*  66 */     b(☃, i, j, i1, i2, i3);
/*  67 */     c(i1, i2, i3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, int i, int j) {
/*  72 */     super.a(☃, i, j);
/*     */     
/*  74 */     if (this.E) {
/*  75 */       int k = this.w + 52;
/*  76 */       int m = this.x + 14;
/*     */       
/*  78 */       int n = this.D + 12;
/*  79 */       List<bpe> list = this.t.f();
/*  80 */       for (int i1 = this.D; i1 < n && i1 < this.t.g(); i1++) {
/*  81 */         int i2 = i1 - this.D;
/*     */         
/*  83 */         int i3 = k + i2 % 4 * 16;
/*  84 */         int i4 = m + i2 / 4 * 18 + 2;
/*  85 */         if (i >= i3 && i < i3 + 16 && j >= i4 && j < i4 + 18) {
/*  86 */           a(☃, ((bpe)list.get(i1)).c(), i, j);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(dfm ☃, int i, int j, int k, int m, int n) {
/*  93 */     for (int i1 = this.D; i1 < n && i1 < this.t.g(); i1++) {
/*  94 */       int i2 = i1 - this.D;
/*  95 */       int i3 = k + i2 % 4 * 16;
/*  96 */       int i4 = i2 / 4;
/*  97 */       int i5 = m + i4 * 18 + 2;
/*     */       
/*  99 */       int i6 = this.c;
/* 100 */       if (i1 == this.t.e()) {
/* 101 */         i6 += 18;
/* 102 */       } else if (i >= i3 && j >= i5 && i < i3 + 16 && j < i5 + 18) {
/* 103 */         i6 += 36;
/*     */       } 
/*     */       
/* 106 */       b(☃, i3, i5 - 1, 0, i6, 16, 18);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void c(int ☃, int i, int j) {
/* 112 */     List<bpe> list = this.t.f();
/* 113 */     for (int k = this.D; k < j && k < this.t.g(); k++) {
/* 114 */       int m = k - this.D;
/* 115 */       int n = ☃ + m % 4 * 16;
/* 116 */       int i1 = m / 4;
/* 117 */       int i2 = i + i1 * 18 + 2;
/*     */       
/* 119 */       this.i.ad().b(((bpe)list.get(k)).c(), n, i2);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 125 */     this.C = false;
/* 126 */     if (this.E) {
/* 127 */       int j = this.w + 52;
/* 128 */       int k = this.x + 14;
/*     */       
/* 130 */       int m = this.D + 12;
/* 131 */       for (int n = this.D; n < m; n++) {
/* 132 */         int i1 = n - this.D;
/* 133 */         double d2 = ☃ - (j + i1 % 4 * 16);
/* 134 */         double d3 = d1 - (k + i1 / 4 * 18);
/* 135 */         if (d2 >= 0.0D && d3 >= 0.0D && d2 < 16.0D && d3 < 18.0D && this.t.a(this.i.s, n)) {
/* 136 */           djz.C().W().a(emp.a(adq.pK, 1.0F));
/* 137 */           this.i.q.a(this.t.b, n);
/* 138 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/* 142 */       j = this.w + 119;
/* 143 */       k = this.x + 9;
/* 144 */       if (☃ >= j && ☃ < (j + 12) && d1 >= k && d1 < (k + 54)) {
/* 145 */         this.C = true;
/*     */       }
/*     */     } 
/*     */     
/* 149 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 154 */     if (this.C && k()) {
/* 155 */       int j = this.x + 14;
/* 156 */       int k = j + 54;
/*     */       
/* 158 */       this.B = ((float)d1 - j - 7.5F) / ((k - j) - 15.0F);
/* 159 */       this.B = afm.a(this.B, 0.0F, 1.0F);
/*     */       
/* 161 */       this.D = (int)((this.B * i()) + 0.5D) * 4;
/*     */       
/* 163 */       return true;
/*     */     } 
/* 165 */     return super.a(☃, d1, i, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2) {
/* 170 */     if (k()) {
/* 171 */       int i = i();
/* 172 */       this.B = (float)(this.B - d2 / i);
/* 173 */       this.B = afm.a(this.B, 0.0F, 1.0F);
/* 174 */       this.D = (int)((this.B * i) + 0.5D) * 4;
/*     */     } 
/* 176 */     return true;
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 180 */     return (this.E && this.t.g() > 12);
/*     */   }
/*     */   
/*     */   protected int i() {
/* 184 */     return (this.t.g() + 4 - 1) / 4 - 3;
/*     */   }
/*     */   
/*     */   private void l() {
/* 188 */     this.E = this.t.h();
/* 189 */     if (!this.E) {
/* 190 */       this.B = 0.0F;
/* 191 */       this.D = 0;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */