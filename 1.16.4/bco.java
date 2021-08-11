/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.Validate;
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
/*     */ public abstract class bco
/*     */   extends aqa
/*     */ {
/*     */   protected static final Predicate<aqa> b;
/*     */   private int e;
/*     */   protected fx c;
/*     */   
/*     */   static {
/*  29 */     b = (☃ -> ☃ instanceof bco);
/*     */   }
/*     */ 
/*     */   
/*  33 */   protected gc d = gc.d;
/*     */   
/*     */   protected bco(aqe<? extends bco> ☃, brx brx1) {
/*  36 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   protected bco(aqe<? extends bco> ☃, brx brx1, fx fx1) {
/*  40 */     this(☃, brx1);
/*  41 */     this.c = fx1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {}
/*     */ 
/*     */   
/*     */   protected void a(gc ☃) {
/*  49 */     Validate.notNull(☃);
/*  50 */     Validate.isTrue(☃.n().d());
/*     */     
/*  52 */     this.d = ☃;
/*  53 */     this.p = (this.d.d() * 90);
/*  54 */     this.r = this.p;
/*     */     
/*  56 */     g();
/*     */   }
/*     */   
/*     */   protected void g() {
/*  60 */     if (this.d == null) {
/*     */       return;
/*     */     }
/*     */     
/*  64 */     double ☃ = this.c.u() + 0.5D;
/*  65 */     double d1 = this.c.v() + 0.5D;
/*  66 */     double d2 = this.c.w() + 0.5D;
/*     */     
/*  68 */     double d3 = 0.46875D;
/*  69 */     double d4 = a(i());
/*  70 */     double d5 = a(k());
/*     */     
/*  72 */     ☃ -= this.d.i() * 0.46875D;
/*  73 */     d2 -= this.d.k() * 0.46875D;
/*  74 */     d1 += d5;
/*     */     
/*  76 */     gc gc1 = this.d.h();
/*  77 */     ☃ += d4 * gc1.i();
/*  78 */     d2 += d4 * gc1.k();
/*     */     
/*  80 */     o(☃, d1, d2);
/*     */     
/*  82 */     double d6 = i();
/*  83 */     double d7 = k();
/*  84 */     double d8 = i();
/*     */     
/*  86 */     if (this.d.n() == gc.a.c) {
/*  87 */       d8 = 1.0D;
/*     */     } else {
/*  89 */       d6 = 1.0D;
/*     */     } 
/*     */     
/*  92 */     d6 /= 32.0D;
/*  93 */     d7 /= 32.0D;
/*  94 */     d8 /= 32.0D;
/*  95 */     a(new dci(☃ - d6, d1 - d7, d2 - d8, ☃ + d6, d1 + d7, d2 + d8));
/*     */   }
/*     */   
/*     */   private double a(int ☃) {
/*  99 */     return (☃ % 32 == 0) ? 0.5D : 0.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 104 */     if (!this.l.v) {
/* 105 */       if (cE() < -64.0D) {
/* 106 */         an();
/*     */       }
/* 108 */       if (this.e++ == 100) {
/* 109 */         this.e = 0;
/* 110 */         if (!this.y && !h()) {
/* 111 */           ad();
/* 112 */           a((aqa)null);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 119 */     if (!this.l.k(this)) {
/* 120 */       return false;
/*     */     }
/*     */     
/* 123 */     int ☃ = Math.max(1, i() / 16);
/* 124 */     int i = Math.max(1, k() / 16);
/*     */     
/* 126 */     fx fx1 = this.c.a(this.d.f());
/* 127 */     gc gc1 = this.d.h();
/*     */     
/* 129 */     fx.a a = new fx.a();
/* 130 */     for (int j = 0; j < ☃; j++) {
/* 131 */       for (int k = 0; k < i; k++) {
/* 132 */         int m = (☃ - 1) / -2;
/* 133 */         int n = (i - 1) / -2;
/*     */         
/* 135 */         a.g(fx1).c(gc1, j + m).c(gc.b, k + n);
/*     */         
/* 137 */         ceh ceh = this.l.d_(a);
/* 138 */         if (!ceh.c().b() && !bvy.l(ceh)) {
/* 139 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 144 */     return this.l.a(this, cc(), b).isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 149 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t(aqa ☃) {
/* 154 */     if (☃ instanceof bfw) {
/* 155 */       bfw bfw = (bfw)☃;
/* 156 */       if (!this.l.a(bfw, this.c)) {
/* 157 */         return true;
/*     */       }
/* 159 */       return a(apk.a(bfw), 0.0F);
/*     */     } 
/* 161 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public gc bZ() {
/* 166 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 171 */     if (b(☃)) {
/* 172 */       return false;
/*     */     }
/* 174 */     if (!this.y && !this.l.v) {
/* 175 */       ad();
/* 176 */       aS();
/* 177 */       a(☃.k());
/*     */     } 
/* 179 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqr ☃, dcn dcn1) {
/* 184 */     if (!this.l.v && !this.y && dcn1.g() > 0.0D) {
/* 185 */       ad();
/* 186 */       a((aqa)null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void i(double ☃, double d1, double d2) {
/* 192 */     if (!this.l.v && !this.y && ☃ * ☃ + d1 * d1 + d2 * d2 > 0.0D) {
/* 193 */       ad();
/* 194 */       a((aqa)null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 200 */     fx fx1 = n();
/* 201 */     ☃.b("TileX", fx1.u());
/* 202 */     ☃.b("TileY", fx1.v());
/* 203 */     ☃.b("TileZ", fx1.w());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 208 */     this.c = new fx(☃.h("TileX"), ☃.h("TileY"), ☃.h("TileZ"));
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
/*     */   
/*     */   public bcv a(bmb ☃, float f) {
/* 221 */     bcv bcv = new bcv(this.l, cD() + (this.d.i() * 0.15F), cE() + f, cH() + (this.d.k() * 0.15F), ☃);
/* 222 */     bcv.m();
/* 223 */     this.l.c(bcv);
/* 224 */     return bcv;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aV() {
/* 229 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(double ☃, double d1, double d2) {
/* 234 */     this.c = new fx(☃, d1, d2);
/* 235 */     g();
/* 236 */     this.Z = true;
/*     */   }
/*     */   
/*     */   public fx n() {
/* 240 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(bzm ☃) {
/* 245 */     if (this.d.n() != gc.a.b) {
/* 246 */       switch (null.a[☃.ordinal()]) {
/*     */         case 1:
/* 248 */           this.d = this.d.f();
/*     */           break;
/*     */         case 2:
/* 251 */           this.d = this.d.h();
/*     */           break;
/*     */         case 3:
/* 254 */           this.d = this.d.g();
/*     */           break;
/*     */       } 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 261 */     float f = afm.g(this.p);
/* 262 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 264 */         return f + 180.0F;
/*     */       case 2:
/* 266 */         return f + 90.0F;
/*     */       case 3:
/* 268 */         return f + 270.0F;
/*     */     } 
/* 270 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(byg ☃) {
/* 276 */     return a(☃.a(this.d));
/*     */   }
/*     */   
/*     */   public void a(aag ☃, aql aql1) {}
/*     */   
/*     */   public void x_() {}
/*     */   
/*     */   public abstract int i();
/*     */   
/*     */   public abstract int k();
/*     */   
/*     */   public abstract void a(@Nullable aqa paramaqa);
/*     */   
/*     */   public abstract void m();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bco.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */