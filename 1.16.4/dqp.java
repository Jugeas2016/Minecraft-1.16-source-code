/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.List;
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
/*     */ public class dqp
/*     */   extends dpp<bjc>
/*     */ {
/*  36 */   private static final vk A = new vk("textures/gui/container/loom.png");
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  41 */   private static final int B = (ccb.P - ccb.Q - 1 + 4 - 1) / 4;
/*     */ 
/*     */ 
/*     */   
/*     */   private final dwn C;
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private List<Pair<ccb, bkx>> D;
/*     */ 
/*     */   
/*  53 */   private bmb E = bmb.b;
/*  54 */   private bmb F = bmb.b;
/*  55 */   private bmb G = bmb.b;
/*     */   
/*     */   private boolean H;
/*     */   private boolean I;
/*     */   private boolean J;
/*     */   private float K;
/*     */   private boolean L;
/*  62 */   private int M = 1;
/*     */   
/*     */   public dqp(bjc ☃, bfv bfv1, nr nr1) {
/*  65 */     super(☃, bfv1, nr1);
/*  66 */     this.C = ebz.a();
/*  67 */     ☃.a(this::i);
/*  68 */     this.q -= 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  73 */     super.a(☃, i, j, f);
/*  74 */     a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, float f, int i, int j) {
/*  79 */     a(☃);
/*     */     
/*  81 */     this.i.M().a(A);
/*  82 */     int k = this.w;
/*  83 */     int m = this.x;
/*  84 */     b(☃, k, m, 0, 0, this.b, this.c);
/*     */     
/*  86 */     bjr bjr1 = this.t.f();
/*  87 */     bjr bjr2 = this.t.g();
/*  88 */     bjr bjr3 = this.t.h();
/*  89 */     bjr bjr4 = this.t.i();
/*  90 */     if (!bjr1.f()) {
/*  91 */       b(☃, k + bjr1.e, m + bjr1.f, this.b, 0, 16, 16);
/*     */     }
/*  93 */     if (!bjr2.f()) {
/*  94 */       b(☃, k + bjr2.e, m + bjr2.f, this.b + 16, 0, 16, 16);
/*     */     }
/*  96 */     if (!bjr3.f()) {
/*  97 */       b(☃, k + bjr3.e, m + bjr3.f, this.b + 32, 0, 16, 16);
/*     */     }
/*     */     
/* 100 */     int n = (int)(41.0F * this.K);
/* 101 */     b(☃, k + 119, m + 13 + n, 232 + (this.H ? 0 : 12), 0, 12, 15);
/*     */     
/* 103 */     dep.c();
/* 104 */     if (this.D != null && !this.J) {
/* 105 */       eag.a a = this.i.aE().b();
/* 106 */       ☃.a();
/* 107 */       ☃.a((k + 139), (m + 52), 0.0D);
/* 108 */       ☃.a(24.0F, -24.0F, 1.0F);
/* 109 */       ☃.a(0.5D, 0.5D, 0.5D);
/* 110 */       float f1 = 0.6666667F;
/* 111 */       ☃.a(0.6666667F, -0.6666667F, -0.6666667F);
/* 112 */       this.C.d = 0.0F;
/* 113 */       this.C.b = -32.0F;
/* 114 */       ebz.a(☃, a, 15728880, ejw.a, this.C, els.f, true, this.D);
/* 115 */       ☃.b();
/* 116 */       a.a();
/* 117 */     } else if (this.J) {
/* 118 */       b(☃, k + bjr4.e - 2, m + bjr4.f - 2, this.b, 17, 17, 16);
/*     */     } 
/* 120 */     if (this.H) {
/* 121 */       int i1 = k + 60;
/* 122 */       int i2 = m + 13;
/*     */       
/* 124 */       int i3 = this.M + 16;
/* 125 */       for (int i4 = this.M; i4 < i3 && i4 < ccb.P - ccb.Q; i4++) {
/* 126 */         int i5 = i4 - this.M;
/* 127 */         int i6 = i1 + i5 % 4 * 14;
/* 128 */         int i7 = i2 + i5 / 4 * 14;
/* 129 */         this.i.M().a(A);
/*     */         
/* 131 */         int i8 = this.c;
/* 132 */         if (i4 == this.t.e()) {
/* 133 */           i8 += 14;
/* 134 */         } else if (i >= i6 && j >= i7 && i < i6 + 14 && j < i7 + 14) {
/* 135 */           i8 += 28;
/*     */         } 
/* 137 */         b(☃, i6, i7, 0, i8, 14, 14);
/*     */         
/* 139 */         c(i4, i6, i7);
/*     */       } 
/* 141 */     } else if (this.I) {
/* 142 */       int i1 = k + 60;
/* 143 */       int i2 = m + 13;
/*     */       
/* 145 */       this.i.M().a(A);
/* 146 */       b(☃, i1, i2, 0, this.c, 14, 14);
/*     */       
/* 148 */       int i3 = this.t.e();
/*     */       
/* 150 */       c(i3, i1, i2);
/*     */     } 
/* 152 */     dep.d();
/*     */   }
/*     */   
/*     */   private void c(int ☃, int i, int j) {
/* 156 */     bmb bmb1 = new bmb(bmd.pT);
/* 157 */     md md = bmb1.a("BlockEntityTag");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     mj mj = (new ccb.a()).a(ccb.a, bkx.h).a(ccb.values()[☃], bkx.a).a();
/*     */     
/* 164 */     md.a("Patterns", mj);
/* 165 */     dfm dfm = new dfm();
/* 166 */     dfm.a();
/* 167 */     dfm.a((i + 0.5F), (j + 16), 0.0D);
/* 168 */     dfm.a(6.0F, -6.0F, 1.0F);
/* 169 */     dfm.a(0.5D, 0.5D, 0.0D);
/* 170 */     dfm.a(0.5D, 0.5D, 0.5D);
/* 171 */     float f = 0.6666667F;
/* 172 */     dfm.a(0.6666667F, -0.6666667F, -0.6666667F);
/*     */     
/* 174 */     eag.a a = this.i.aE().b();
/* 175 */     this.C.d = 0.0F;
/* 176 */     this.C.b = -32.0F;
/* 177 */     List<Pair<ccb, bkx>> list = cca.a(bkx.h, cca.a(bmb1));
/* 178 */     ebz.a(dfm, a, 15728880, ejw.a, this.C, els.f, true, list);
/*     */     
/* 180 */     dfm.b();
/* 181 */     a.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 186 */     this.L = false;
/* 187 */     if (this.H) {
/* 188 */       int j = this.w + 60;
/* 189 */       int k = this.x + 13;
/*     */       
/* 191 */       int m = this.M + 16;
/* 192 */       for (int n = this.M; n < m; n++) {
/* 193 */         int i1 = n - this.M;
/* 194 */         double d2 = ☃ - (j + i1 % 4 * 14);
/* 195 */         double d3 = d1 - (k + i1 / 4 * 14);
/* 196 */         if (d2 >= 0.0D && d3 >= 0.0D && d2 < 14.0D && d3 < 14.0D && this.t.a(this.i.s, n)) {
/* 197 */           djz.C().W().a(emp.a(adq.pG, 1.0F));
/* 198 */           this.i.q.a(this.t.b, n);
/* 199 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/* 203 */       j = this.w + 119;
/* 204 */       k = this.x + 9;
/* 205 */       if (☃ >= j && ☃ < (j + 12) && d1 >= k && d1 < (k + 56)) {
/* 206 */         this.L = true;
/*     */       }
/*     */     } 
/*     */     
/* 210 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 215 */     if (this.L && this.H) {
/* 216 */       int j = this.x + 13;
/* 217 */       int k = j + 56;
/*     */       
/* 219 */       this.K = ((float)d1 - j - 7.5F) / ((k - j) - 15.0F);
/* 220 */       this.K = afm.a(this.K, 0.0F, 1.0F);
/* 221 */       int m = B - 4;
/*     */       
/* 223 */       int n = (int)((this.K * m) + 0.5D);
/* 224 */       if (n < 0) {
/* 225 */         n = 0;
/*     */       }
/* 227 */       this.M = 1 + n * 4;
/*     */       
/* 229 */       return true;
/*     */     } 
/* 231 */     return super.a(☃, d1, i, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2) {
/* 236 */     if (this.H) {
/* 237 */       int i = B - 4;
/* 238 */       this.K = (float)(this.K - d2 / i);
/* 239 */       this.K = afm.a(this.K, 0.0F, 1.0F);
/* 240 */       this.M = 1 + (int)((this.K * i) + 0.5D) * 4;
/*     */     } 
/* 242 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(double ☃, double d1, int i, int j, int k) {
/* 247 */     return (☃ < i || d1 < j || ☃ >= (i + this.b) || d1 >= (j + this.c));
/*     */   }
/*     */   
/*     */   private void i() {
/* 251 */     bmb ☃ = this.t.i().e();
/* 252 */     if (☃.a()) {
/* 253 */       this.D = null;
/*     */     } else {
/* 255 */       this.D = cca.a(((bke)☃.b()).b(), cca.a(☃));
/*     */     } 
/*     */     
/* 258 */     bmb bmb1 = this.t.f().e();
/* 259 */     bmb bmb2 = this.t.g().e();
/* 260 */     bmb bmb3 = this.t.h().e();
/*     */     
/* 262 */     md md = bmb1.a("BlockEntityTag");
/* 263 */     this.J = (md.c("Patterns", 9) && !bmb1.a() && md.d("Patterns", 10).size() >= 6);
/*     */     
/* 265 */     if (this.J) {
/* 266 */       this.D = null;
/*     */     }
/*     */     
/* 269 */     if (!bmb.b(bmb1, this.E) || !bmb.b(bmb2, this.F) || !bmb.b(bmb3, this.G)) {
/* 270 */       this.H = (!bmb1.a() && !bmb2.a() && bmb3.a() && !this.J);
/* 271 */       this.I = (!this.J && !bmb3.a() && !bmb1.a() && !bmb2.a());
/*     */     } 
/* 273 */     this.E = bmb1.i();
/* 274 */     this.F = bmb2.i();
/* 275 */     this.G = bmb3.i();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */