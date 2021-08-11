/*     */ import java.util.Map;
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
/*     */ public class aqg
/*     */   extends aqa
/*     */ {
/*     */   public int b;
/*     */   public int c;
/*     */   public int d;
/*  27 */   private int e = 5;
/*     */   private int f;
/*     */   private bfw g;
/*     */   private int ag;
/*     */   
/*     */   public aqg(brx ☃, double d1, double d2, double d3, int i) {
/*  33 */     this(aqe.y, ☃);
/*  34 */     d(d1, d2, d3);
/*     */     
/*  36 */     this.p = (float)(this.J.nextDouble() * 360.0D);
/*     */     
/*  38 */     n((this.J
/*  39 */         .nextDouble() * 0.20000000298023224D - 0.10000000149011612D) * 2.0D, this.J
/*  40 */         .nextDouble() * 0.2D * 2.0D, (this.J
/*  41 */         .nextDouble() * 0.20000000298023224D - 0.10000000149011612D) * 2.0D);
/*     */ 
/*     */     
/*  44 */     this.f = i;
/*     */   }
/*     */   
/*     */   public aqg(aqe<? extends aqg> ☃, brx brx1) {
/*  48 */     super(☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void e() {}
/*     */ 
/*     */   
/*     */   public void j() {
/*  62 */     super.j();
/*  63 */     if (this.d > 0) {
/*  64 */       this.d--;
/*     */     }
/*  66 */     this.m = cD();
/*  67 */     this.n = cE();
/*  68 */     this.o = cH();
/*     */     
/*  70 */     if (a(aef.b)) {
/*  71 */       i();
/*  72 */     } else if (!aB()) {
/*  73 */       f(cC().b(0.0D, -0.03D, 0.0D));
/*     */     } 
/*     */     
/*  76 */     if (this.l.b(cB()).a(aef.c)) {
/*  77 */       n(((this.J
/*  78 */           .nextFloat() - this.J.nextFloat()) * 0.2F), 0.20000000298023224D, ((this.J
/*     */           
/*  80 */           .nextFloat() - this.J.nextFloat()) * 0.2F));
/*     */       
/*  82 */       a(adq.eH, 0.4F, 2.0F + this.J.nextFloat() * 0.4F);
/*     */     } 
/*  84 */     if (!this.l.b(cc())) {
/*  85 */       l(cD(), ((cc()).b + (cc()).e) / 2.0D, cH());
/*     */     }
/*     */     
/*  88 */     double ☃ = 8.0D;
/*     */ 
/*     */     
/*  91 */     if (this.ag < this.b - 20 + Y() % 100) {
/*  92 */       if (this.g == null || this.g.h(this) > 64.0D) {
/*  93 */         this.g = this.l.a(this, 8.0D);
/*     */       }
/*  95 */       this.ag = this.b;
/*     */     } 
/*     */     
/*  98 */     if (this.g != null && this.g.a_()) {
/*  99 */       this.g = null;
/*     */     }
/*     */     
/* 102 */     if (this.g != null) {
/*     */ 
/*     */ 
/*     */       
/* 106 */       dcn dcn = new dcn(this.g.cD() - cD(), this.g.cE() + this.g.ce() / 2.0D - cE(), this.g.cH() - cH());
/*     */       
/* 108 */       double d = dcn.g();
/* 109 */       if (d < 64.0D) {
/* 110 */         double d1 = 1.0D - Math.sqrt(d) / 8.0D;
/*     */         
/* 112 */         f(cC().e(dcn.d().a(d1 * d1 * 0.1D)));
/*     */       } 
/*     */     } 
/*     */     
/* 116 */     a(aqr.a, cC());
/*     */     
/* 118 */     float f = 0.98F;
/* 119 */     if (this.t) {
/* 120 */       f = this.l.d_(new fx(cD(), cE() - 1.0D, cH())).b().j() * 0.98F;
/*     */     }
/*     */     
/* 123 */     f(cC().d(f, 0.98D, f));
/*     */     
/* 125 */     if (this.t) {
/* 126 */       f(cC().d(1.0D, -0.9D, 1.0D));
/*     */     }
/*     */     
/* 129 */     this.b++;
/*     */     
/* 131 */     this.c++;
/* 132 */     if (this.c >= 6000) {
/* 133 */       ad();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void i() {
/* 139 */     dcn ☃ = cC();
/*     */     
/* 141 */     n(☃.b * 0.9900000095367432D, 
/*     */         
/* 143 */         Math.min(☃.c + 5.000000237487257E-4D, 0.05999999865889549D), ☃.d * 0.9900000095367432D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void aM() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 159 */     if (b(☃)) {
/* 160 */       return false;
/*     */     }
/* 162 */     aS();
/* 163 */     this.e = (int)(this.e - f);
/* 164 */     if (this.e <= 0) {
/* 165 */       ad();
/*     */     }
/* 167 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 172 */     ☃.a("Health", (short)this.e);
/* 173 */     ☃.a("Age", (short)this.c);
/* 174 */     ☃.a("Value", (short)this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 179 */     this.e = ☃.g("Health");
/* 180 */     this.c = ☃.g("Age");
/* 181 */     this.f = ☃.g("Value");
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(bfw ☃) {
/* 186 */     if (this.l.v) {
/*     */       return;
/*     */     }
/*     */     
/* 190 */     if (this.d == 0 && ☃.bu == 0) {
/* 191 */       ☃.bu = 2;
/* 192 */       ☃.a(this, 1);
/* 193 */       Map.Entry<aqf, bmb> entry = bpu.a(bpw.K, ☃, bmb::f);
/* 194 */       if (entry != null) {
/* 195 */         bmb bmb = entry.getValue();
/* 196 */         if (!bmb.a() && bmb.f()) {
/* 197 */           int i = Math.min(c(this.f), bmb.g());
/* 198 */           this.f -= b(i);
/* 199 */           bmb.b(bmb.g() - i);
/*     */         } 
/*     */       } 
/* 202 */       if (this.f > 0) {
/* 203 */         ☃.d(this.f);
/*     */       }
/* 205 */       ad();
/*     */     } 
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 210 */     return ☃ / 2;
/*     */   }
/*     */   
/*     */   private int c(int ☃) {
/* 214 */     return ☃ * 2;
/*     */   }
/*     */   
/*     */   public int g() {
/* 218 */     return this.f;
/*     */   }
/*     */   
/*     */   public int h() {
/* 222 */     if (this.f >= 2477)
/* 223 */       return 10; 
/* 224 */     if (this.f >= 1237)
/* 225 */       return 9; 
/* 226 */     if (this.f >= 617)
/* 227 */       return 8; 
/* 228 */     if (this.f >= 307)
/* 229 */       return 7; 
/* 230 */     if (this.f >= 149)
/* 231 */       return 6; 
/* 232 */     if (this.f >= 73)
/* 233 */       return 5; 
/* 234 */     if (this.f >= 37)
/* 235 */       return 4; 
/* 236 */     if (this.f >= 17)
/* 237 */       return 3; 
/* 238 */     if (this.f >= 7)
/* 239 */       return 2; 
/* 240 */     if (this.f >= 3) {
/* 241 */       return 1;
/*     */     }
/*     */     
/* 244 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a(int ☃) {
/* 256 */     if (☃ >= 2477)
/* 257 */       return 2477; 
/* 258 */     if (☃ >= 1237)
/* 259 */       return 1237; 
/* 260 */     if (☃ >= 617)
/* 261 */       return 617; 
/* 262 */     if (☃ >= 307)
/* 263 */       return 307; 
/* 264 */     if (☃ >= 149)
/* 265 */       return 149; 
/* 266 */     if (☃ >= 73)
/* 267 */       return 73; 
/* 268 */     if (☃ >= 37)
/* 269 */       return 37; 
/* 270 */     if (☃ >= 17)
/* 271 */       return 17; 
/* 272 */     if (☃ >= 7)
/* 273 */       return 7; 
/* 274 */     if (☃ >= 3) {
/* 275 */       return 3;
/*     */     }
/*     */     
/* 278 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bL() {
/* 283 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 288 */     return new oo(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */