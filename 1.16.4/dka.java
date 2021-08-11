/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import org.lwjgl.glfw.GLFWDropCallback;
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
/*     */ public class dka
/*     */ {
/*     */   private final djz a;
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private double e;
/*     */   private double f;
/*     */   private int g;
/*  28 */   private int h = -1;
/*     */   
/*     */   private boolean i = true;
/*     */   
/*     */   private int j;
/*     */   
/*     */   private double k;
/*  35 */   private final afp l = new afp();
/*  36 */   private final afp m = new afp();
/*     */   
/*     */   private double n;
/*     */   private double o;
/*     */   private double p;
/*  41 */   private double q = Double.MIN_VALUE;
/*     */   
/*     */   public dka(djz ☃) {
/*  44 */     this.a = ☃;
/*     */   }
/*     */   private boolean r;
/*     */   private void a(long ☃, int i, int j, int k) {
/*  48 */     if (☃ != this.a.aD().i()) {
/*     */       return;
/*     */     }
/*     */     
/*  52 */     boolean bool = (j == 1);
/*     */ 
/*     */     
/*  55 */     if (djz.a && i == 0) {
/*  56 */       if (bool) {
/*  57 */         if ((k & 0x2) == 2) {
/*  58 */           i = 1;
/*  59 */           this.g++;
/*     */         } 
/*  61 */       } else if (this.g > 0) {
/*  62 */         i = 1;
/*  63 */         this.g--;
/*     */       } 
/*     */     }
/*     */     
/*  67 */     int m = i;
/*  68 */     if (bool) {
/*  69 */       if (this.a.k.Y && this.j++ > 0) {
/*     */         return;
/*     */       }
/*  72 */       this.h = m;
/*  73 */       this.k = ddt.b();
/*  74 */     } else if (this.h != -1) {
/*  75 */       if (this.a.k.Y && --this.j > 0) {
/*     */         return;
/*     */       }
/*  78 */       this.h = -1;
/*     */     } 
/*  80 */     boolean[] arrayOfBoolean = { false };
/*     */     
/*  82 */     if (this.a.z == null)
/*     */     {
/*  84 */       if (this.a.y == null) {
/*  85 */         if (!this.r && bool) {
/*  86 */           i();
/*     */         }
/*     */       } else {
/*  89 */         double d1 = this.e * this.a.aD().o() / this.a.aD().m();
/*  90 */         double d2 = this.f * this.a.aD().p() / this.a.aD().n();
/*  91 */         if (bool) {
/*  92 */           dot.a(() -> ☃[0] = this.a.y.a(d1, d2, i), "mouseClicked event handler", this.a.y.getClass().getCanonicalName());
/*     */         } else {
/*  94 */           dot.a(() -> ☃[0] = this.a.y.c(d1, d2, i), "mouseReleased event handler", this.a.y.getClass().getCanonicalName());
/*     */         } 
/*     */       }  } 
/*  97 */     if (!arrayOfBoolean[0] && (this.a.y == null || this.a.y.n) && this.a.z == null) {
/*  98 */       if (m == 0) {
/*  99 */         this.b = bool;
/* 100 */       } else if (m == 2) {
/* 101 */         this.c = bool;
/* 102 */       } else if (m == 1) {
/* 103 */         this.d = bool;
/*     */       } 
/*     */       
/* 106 */       djw.a(deo.b.c.a(m), bool);
/* 107 */       if (bool) {
/* 108 */         if (this.a.s.a_() && m == 2) {
/* 109 */           this.a.j.f().b();
/*     */         } else {
/* 111 */           djw.a(deo.b.c.a(m));
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(long ☃, double d1, double d2) {
/* 118 */     if (☃ == djz.C().aD().i()) {
/*     */       
/* 120 */       double d = (this.a.k.S ? Math.signum(d2) : d2) * this.a.k.G;
/* 121 */       if (this.a.z == null)
/*     */       {
/* 123 */         if (this.a.y != null) {
/* 124 */           double d3 = this.e * this.a.aD().o() / this.a.aD().m();
/* 125 */           double d4 = this.f * this.a.aD().p() / this.a.aD().n();
/* 126 */           this.a.y.a(d3, d4, d);
/* 127 */         } else if (this.a.s != null) {
/* 128 */           if (this.p != 0.0D && Math.signum(d) != Math.signum(this.p)) {
/* 129 */             this.p = 0.0D;
/*     */           }
/* 131 */           this.p += d;
/* 132 */           float f = (int)this.p;
/* 133 */           if (f == 0.0F) {
/*     */             return;
/*     */           }
/*     */           
/* 137 */           this.p -= f;
/*     */           
/* 139 */           if (this.a.s.a_()) {
/* 140 */             if (this.a.j.f().a()) {
/* 141 */               this.a.j.f().a(-f);
/*     */             } else {
/* 143 */               float f1 = afm.a(this.a.s.bC.a() + f * 0.005F, 0.0F, 0.2F);
/* 144 */               this.a.s.bC.a(f1);
/*     */             } 
/*     */           } else {
/* 147 */             this.a.s.bm.a(f);
/*     */           } 
/*     */         }  } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(long ☃, List<Path> list) {
/* 154 */     if (this.a.y != null) {
/* 155 */       this.a.y.a(list);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 160 */     deo.a(☃, (☃, d1, d2) -> this.a.execute(()), (☃, i, j, k) -> this.a.execute(()), (☃, d1, d2) -> this.a.execute(()), (☃, i, l1) -> {
/*     */           Path[] arrayOfPath = new Path[i];
/*     */           for (int j = 0; j < i; j++) {
/*     */             arrayOfPath[j] = Paths.get(GLFWDropCallback.getName(l1, j), new String[0]);
/*     */           }
/*     */           this.a.execute(());
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(long ☃, double d1, double d2) {
/* 175 */     if (☃ != djz.C().aD().i()) {
/*     */       return;
/*     */     }
/* 178 */     if (this.i) {
/* 179 */       this.e = d1;
/* 180 */       this.f = d2;
/* 181 */       this.i = false;
/*     */     } 
/*     */     
/* 184 */     dmi dmi = this.a.y;
/* 185 */     if (dmi != null && this.a.z == null) {
/* 186 */       double d3 = d1 * this.a.aD().o() / this.a.aD().m();
/* 187 */       double d4 = d2 * this.a.aD().p() / this.a.aD().n();
/*     */       
/* 189 */       dot.a(() -> ☃.e(d1, d2), "mouseMoved event handler", dmi.getClass().getCanonicalName());
/*     */       
/* 191 */       if (this.h != -1 && this.k > 0.0D) {
/* 192 */         double d5 = (d1 - this.e) * this.a.aD().o() / this.a.aD().m();
/* 193 */         double d6 = (d2 - this.f) * this.a.aD().p() / this.a.aD().n();
/* 194 */         dot.a(() -> ☃.a(d1, d2, this.h, d3, d4), "mouseDragged event handler", dmi.getClass().getCanonicalName());
/*     */       } 
/*     */     } 
/*     */     
/* 198 */     this.a.au().a("mouse");
/*     */     
/* 200 */     if (h() && this.a.ap()) {
/* 201 */       this.n += d1 - this.e;
/* 202 */       this.o += d2 - this.f;
/*     */     } 
/*     */     
/* 205 */     a();
/*     */     
/* 207 */     this.e = d1;
/* 208 */     this.f = d2;
/*     */     
/* 210 */     this.a.au().c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 215 */     double d2, d3, ☃ = ddt.b();
/* 216 */     double d1 = ☃ - this.q;
/* 217 */     this.q = ☃;
/*     */     
/* 219 */     if (!h() || !this.a.ap()) {
/* 220 */       this.n = 0.0D;
/* 221 */       this.o = 0.0D;
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 229 */     double d4 = this.a.k.a * 0.6000000238418579D + 0.20000000298023224D;
/* 230 */     double d5 = d4 * d4 * d4 * 8.0D;
/*     */     
/* 232 */     if (this.a.k.aN) {
/* 233 */       double d6 = this.l.a(this.n * d5, d1 * d5);
/* 234 */       double d7 = this.m.a(this.o * d5, d1 * d5);
/* 235 */       d2 = d6;
/* 236 */       d3 = d7;
/*     */     } else {
/* 238 */       this.l.a();
/* 239 */       this.m.a();
/*     */       
/* 241 */       d2 = this.n * d5;
/* 242 */       d3 = this.o * d5;
/*     */     } 
/*     */     
/* 245 */     this.n = 0.0D;
/* 246 */     this.o = 0.0D;
/*     */     
/* 248 */     int i = 1;
/* 249 */     if (this.a.k.R) {
/* 250 */       i = -1;
/*     */     }
/*     */     
/* 253 */     this.a.ao().a(d2, d3);
/* 254 */     if (this.a.s != null) {
/* 255 */       this.a.s.a(d2, d3 * i);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 260 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 268 */     return this.d;
/*     */   }
/*     */   
/*     */   public double e() {
/* 272 */     return this.e;
/*     */   }
/*     */   
/*     */   public double f() {
/* 276 */     return this.f;
/*     */   }
/*     */   
/*     */   public void g() {
/* 280 */     this.i = true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 286 */     return this.r;
/*     */   }
/*     */   
/*     */   public void i() {
/* 290 */     if (!this.a.ap()) {
/*     */       return;
/*     */     }
/* 293 */     if (this.r) {
/*     */       return;
/*     */     }
/* 296 */     if (!djz.a) {
/* 297 */       djw.a();
/*     */     }
/* 299 */     this.r = true;
/* 300 */     this.e = (this.a.aD().m() / 2);
/* 301 */     this.f = (this.a.aD().n() / 2);
/* 302 */     deo.a(this.a.aD().i(), 212995, this.e, this.f);
/* 303 */     this.a.a((dot)null);
/* 304 */     this.a.w = 10000;
/* 305 */     this.i = true;
/*     */   }
/*     */   
/*     */   public void j() {
/* 309 */     if (!this.r) {
/*     */       return;
/*     */     }
/* 312 */     this.r = false;
/* 313 */     this.e = (this.a.aD().m() / 2);
/* 314 */     this.f = (this.a.aD().n() / 2);
/* 315 */     deo.a(this.a.aD().i(), 212993, this.e, this.f);
/*     */   }
/*     */   
/*     */   public void k() {
/* 319 */     this.i = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */