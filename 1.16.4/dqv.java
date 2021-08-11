/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.stream.IntStream;
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
/*     */ public class dqv
/*     */   extends dot
/*     */ {
/*  36 */   private final ecn.a a = new ecn.a();
/*     */   
/*     */   private final cdf b;
/*     */   
/*     */   private int c;
/*     */   private int p;
/*     */   private dmy q;
/*     */   private final String[] r;
/*     */   
/*     */   public dqv(cdf ☃) {
/*  46 */     super(new of("sign.edit"));
/*     */     
/*  48 */     this.r = (String[])IntStream.range(0, 4).mapToObj(☃::a).map(nr::getString).toArray(☃ -> new String[☃]);
/*  49 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  54 */     this.i.m.a(true);
/*  55 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 120, 200, 20, nq.c, ☃ -> h()));
/*  56 */     this.b.a(false);
/*     */     
/*  58 */     this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  65 */       .q = new dmy(() -> this.r[this.p], ☃ -> { this.r[this.p] = ☃; this.b.a(this.p, new oe(☃)); }dmy.a(this.i), dmy.c(this.i), ☃ -> (this.i.g.b(☃) <= 90));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void e() {
/*  72 */     this.i.m.a(false);
/*  73 */     dwu ☃ = this.i.w();
/*  74 */     if (☃ != null) {
/*  75 */       ☃.a(new tp(this.b.o(), this.r[0], this.r[1], this.r[2], this.r[3]));
/*     */     }
/*  77 */     this.b.a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  82 */     this.c++;
/*     */     
/*  84 */     if (!this.b.u().a(this.b.p().b())) {
/*  85 */       h();
/*     */     }
/*     */   }
/*     */   
/*     */   private void h() {
/*  90 */     this.b.X_();
/*  91 */     this.i.a((dot)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(char ☃, int i) {
/*  96 */     this.q.a(☃);
/*  97 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/* 102 */     h();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 107 */     if (☃ == 265) {
/* 108 */       this.p = this.p - 1 & 0x3;
/* 109 */       this.q.f();
/* 110 */       return true;
/*     */     } 
/* 112 */     if (☃ == 264 || ☃ == 257 || ☃ == 335) {
/* 113 */       this.p = this.p + 1 & 0x3;
/* 114 */       this.q.f();
/* 115 */       return true;
/*     */     } 
/* 117 */     if (this.q.a(☃)) {
/* 118 */       return true;
/*     */     }
/*     */     
/* 121 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 126 */     dep.c();
/*     */     
/* 128 */     a(☃);
/*     */     
/* 130 */     a(☃, this.o, this.d, this.k / 2, 40, 16777215);
/*     */     
/* 132 */     ☃.a();
/* 133 */     ☃.a((this.k / 2), 0.0D, 50.0D);
/* 134 */     float f1 = 93.75F;
/* 135 */     ☃.a(93.75F, -93.75F, 93.75F);
/* 136 */     ☃.a(0.0D, -1.3125D, 0.0D);
/*     */     
/* 138 */     ceh ceh = this.b.p();
/*     */     
/* 140 */     boolean bool1 = ceh.b() instanceof cal;
/* 141 */     if (!bool1) {
/* 142 */       ☃.a(0.0D, -0.3125D, 0.0D);
/*     */     }
/*     */     
/* 145 */     boolean bool2 = (this.c / 6 % 2 == 0);
/*     */     
/* 147 */     float f2 = 0.6666667F;
/* 148 */     ☃.a();
/* 149 */     ☃.a(0.6666667F, -0.6666667F, -0.6666667F);
/* 150 */     eag.a a1 = this.i.aE().b();
/* 151 */     elr elr = ecn.a(ceh.b());
/* 152 */     dfq dfq = elr.a(a1, this.a::a);
/*     */     
/* 154 */     this.a.a.a(☃, dfq, 15728880, ejw.a);
/* 155 */     if (bool1) {
/* 156 */       this.a.b.a(☃, dfq, 15728880, ejw.a);
/*     */     }
/* 158 */     ☃.b();
/*     */     
/* 160 */     float f3 = 0.010416667F;
/* 161 */     ☃.a(0.0D, 0.3333333432674408D, 0.046666666865348816D);
/* 162 */     ☃.a(0.010416667F, -0.010416667F, 0.010416667F);
/* 163 */     int k = this.b.g().h();
/*     */     
/* 165 */     int m = this.q.g();
/* 166 */     int n = this.q.h();
/*     */     
/* 168 */     int i1 = this.p * 10 - this.r.length * 5;
/*     */     
/* 170 */     b b = ☃.c().a(); int i2;
/* 171 */     for (i2 = 0; i2 < this.r.length; i2++) {
/* 172 */       String str = this.r[i2];
/* 173 */       if (str != null) {
/*     */ 
/*     */         
/* 176 */         if (this.o.a()) {
/* 177 */           str = this.o.a(str);
/*     */         }
/*     */         
/* 180 */         float f4 = (-this.i.g.b(str) / 2);
/* 181 */         this.i.g.a(str, f4, (i2 * 10 - this.r.length * 5), k, false, b, a1, false, 0, 15728880, false);
/*     */ 
/*     */         
/* 184 */         if (i2 == this.p && m >= 0 && bool2) {
/*     */ 
/*     */ 
/*     */           
/* 188 */           int i3 = this.i.g.b(str.substring(0, Math.max(Math.min(m, str.length()), 0)));
/* 189 */           int i4 = i3 - this.i.g.b(str) / 2;
/*     */           
/* 191 */           if (m >= str.length())
/* 192 */             this.i.g.a("_", i4, i1, k, false, b, a1, false, 0, 15728880, false); 
/*     */         } 
/*     */       } 
/*     */     } 
/* 196 */     a1.a();
/*     */     
/* 198 */     for (i2 = 0; i2 < this.r.length; i2++) {
/* 199 */       String str = this.r[i2];
/* 200 */       if (str != null && i2 == this.p && m >= 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 205 */         int i3 = this.i.g.b(str.substring(0, Math.max(Math.min(m, str.length()), 0)));
/* 206 */         int i4 = i3 - this.i.g.b(str) / 2;
/*     */         
/* 208 */         if (bool2 && m < str.length()) {
/* 209 */           this.i.g.getClass(); a(☃, i4, i1 - 1, i4 + 1, i1 + 9, 0xFF000000 | k);
/*     */         } 
/*     */         
/* 212 */         if (n != m) {
/* 213 */           int i5 = Math.min(m, n);
/* 214 */           int i6 = Math.max(m, n);
/* 215 */           int i7 = this.i.g.b(str.substring(0, i5)) - this.i.g.b(str) / 2;
/* 216 */           int i8 = this.i.g.b(str.substring(0, i6)) - this.i.g.b(str) / 2;
/*     */           
/* 218 */           int i9 = Math.min(i7, i8);
/* 219 */           int i10 = Math.max(i7, i8);
/* 220 */           dfo dfo = dfo.a();
/* 221 */           dfh dfh = dfo.c();
/*     */           
/* 223 */           RenderSystem.disableTexture();
/* 224 */           RenderSystem.enableColorLogicOp();
/* 225 */           RenderSystem.logicOp(dem.o.n);
/*     */           
/* 227 */           dfh.a(7, dfk.l);
/* 228 */           this.i.g.getClass(); dfh.a(b, i9, (i1 + 9), 0.0F).a(0, 0, 255, 255).d();
/* 229 */           this.i.g.getClass(); dfh.a(b, i10, (i1 + 9), 0.0F).a(0, 0, 255, 255).d();
/* 230 */           dfh.a(b, i10, i1, 0.0F).a(0, 0, 255, 255).d();
/* 231 */           dfh.a(b, i9, i1, 0.0F).a(0, 0, 255, 255).d();
/* 232 */           dfh.c();
/* 233 */           dfi.a(dfh);
/*     */           
/* 235 */           RenderSystem.disableColorLogicOp();
/* 236 */           RenderSystem.enableTexture();
/*     */         } 
/*     */       } 
/*     */     } 
/* 240 */     ☃.b();
/* 241 */     dep.d();
/*     */     
/* 243 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */