/*     */ import com.google.common.collect.ComparisonChain;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class apu
/*     */   implements Comparable<apu>
/*     */ {
/*  14 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final aps b;
/*     */   private int c;
/*     */   private int d;
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private boolean i;
/*     */   @Nullable
/*     */   private apu j;
/*     */   
/*     */   public apu(aps ☃) {
/*  28 */     this(☃, 0, 0);
/*     */   }
/*     */   
/*     */   public apu(aps ☃, int i) {
/*  32 */     this(☃, i, 0);
/*     */   }
/*     */   
/*     */   public apu(aps ☃, int i, int j) {
/*  36 */     this(☃, i, j, false, true);
/*     */   }
/*     */   
/*     */   public apu(aps ☃, int i, int j, boolean bool1, boolean bool2) {
/*  40 */     this(☃, i, j, bool1, bool2, bool2);
/*     */   }
/*     */   
/*     */   public apu(aps ☃, int i, int j, boolean bool1, boolean bool2, boolean bool3) {
/*  44 */     this(☃, i, j, bool1, bool2, bool3, null);
/*     */   }
/*     */   
/*     */   public apu(aps ☃, int i, int j, boolean bool1, boolean bool2, boolean bool3, @Nullable apu apu1) {
/*  48 */     this.b = ☃;
/*  49 */     this.c = i;
/*  50 */     this.d = j;
/*  51 */     this.f = bool1;
/*  52 */     this.h = bool2;
/*  53 */     this.i = bool3;
/*  54 */     this.j = apu1;
/*     */   }
/*     */   
/*     */   public apu(apu ☃) {
/*  58 */     this.b = ☃.b;
/*  59 */     a(☃);
/*     */   }
/*     */   
/*     */   void a(apu ☃) {
/*  63 */     this.c = ☃.c;
/*  64 */     this.d = ☃.d;
/*  65 */     this.f = ☃.f;
/*  66 */     this.h = ☃.h;
/*  67 */     this.i = ☃.i;
/*     */   }
/*     */   
/*     */   public boolean b(apu ☃) {
/*  71 */     if (this.b != ☃.b) {
/*  72 */       a.warn("This method should only be called for matching effects!");
/*     */     }
/*  74 */     boolean bool = false;
/*  75 */     if (☃.d > this.d) {
/*  76 */       if (☃.c < this.c) {
/*  77 */         apu apu1 = this.j;
/*  78 */         this.j = new apu(this);
/*  79 */         this.j.j = apu1;
/*     */       } 
/*  81 */       this.d = ☃.d;
/*  82 */       this.c = ☃.c;
/*  83 */       bool = true;
/*  84 */     } else if (☃.c > this.c) {
/*  85 */       if (☃.d == this.d) {
/*  86 */         this.c = ☃.c;
/*  87 */         bool = true;
/*     */       }
/*  89 */       else if (this.j == null) {
/*  90 */         this.j = new apu(☃);
/*     */       } else {
/*  92 */         this.j.b(☃);
/*     */       } 
/*     */     } 
/*     */     
/*  96 */     if ((!☃.f && this.f) || bool) {
/*  97 */       this.f = ☃.f;
/*  98 */       bool = true;
/*     */     } 
/* 100 */     if (☃.h != this.h) {
/* 101 */       this.h = ☃.h;
/* 102 */       bool = true;
/*     */     } 
/* 104 */     if (☃.i != this.i) {
/* 105 */       this.i = ☃.i;
/* 106 */       bool = true;
/*     */     } 
/* 108 */     return bool;
/*     */   }
/*     */   
/*     */   public aps a() {
/* 112 */     return this.b;
/*     */   }
/*     */   
/*     */   public int b() {
/* 116 */     return this.c;
/*     */   }
/*     */   
/*     */   public int c() {
/* 120 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 128 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 132 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 136 */     return this.i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aqm ☃, Runnable runnable) {
/* 146 */     if (this.c > 0) {
/* 147 */       if (this.b.a(this.c, this.d)) {
/* 148 */         a(☃);
/*     */       }
/* 150 */       i();
/* 151 */       if (this.c == 0 && this.j != null) {
/* 152 */         a(this.j);
/* 153 */         this.j = this.j.j;
/* 154 */         runnable.run();
/*     */       } 
/*     */     } 
/* 157 */     return (this.c > 0);
/*     */   }
/*     */   
/*     */   private int i() {
/* 161 */     if (this.j != null) {
/* 162 */       this.j.i();
/*     */     }
/* 164 */     return --this.c;
/*     */   }
/*     */   
/*     */   public void a(aqm ☃) {
/* 168 */     if (this.c > 0) {
/* 169 */       this.b.a(☃, this.d);
/*     */     }
/*     */   }
/*     */   
/*     */   public String g() {
/* 174 */     return this.b.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*     */     String ☃;
/* 180 */     if (this.d > 0) {
/* 181 */       ☃ = g() + " x " + (this.d + 1) + ", Duration: " + this.c;
/*     */     } else {
/* 183 */       ☃ = g() + ", Duration: " + this.c;
/*     */     } 
/* 185 */     if (this.e) {
/* 186 */       ☃ = ☃ + ", Splash: true";
/*     */     }
/* 188 */     if (!this.h) {
/* 189 */       ☃ = ☃ + ", Particles: false";
/*     */     }
/* 191 */     if (!this.i) {
/* 192 */       ☃ = ☃ + ", Show Icon: false";
/*     */     }
/*     */     
/* 195 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 200 */     if (this == ☃) {
/* 201 */       return true;
/*     */     }
/*     */     
/* 204 */     if (☃ instanceof apu) {
/* 205 */       apu apu1 = (apu)☃;
/*     */       
/* 207 */       return (this.c == apu1.c && this.d == apu1.d && this.e == apu1.e && this.f == apu1.f && this.b.equals(apu1.b));
/*     */     } 
/* 209 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 214 */     int ☃ = this.b.hashCode();
/* 215 */     ☃ = 31 * ☃ + this.c;
/* 216 */     ☃ = 31 * ☃ + this.d;
/* 217 */     ☃ = 31 * ☃ + (this.e ? 1 : 0);
/* 218 */     ☃ = 31 * ☃ + (this.f ? 1 : 0);
/* 219 */     return ☃;
/*     */   }
/*     */   
/*     */   public md a(md ☃) {
/* 223 */     ☃.a("Id", (byte)aps.a(a()));
/* 224 */     c(☃);
/* 225 */     return ☃;
/*     */   }
/*     */   
/*     */   private void c(md ☃) {
/* 229 */     ☃.a("Amplifier", (byte)c());
/* 230 */     ☃.b("Duration", b());
/* 231 */     ☃.a("Ambient", d());
/* 232 */     ☃.a("ShowParticles", e());
/* 233 */     ☃.a("ShowIcon", f());
/* 234 */     if (this.j != null) {
/* 235 */       md md1 = new md();
/* 236 */       this.j.a(md1);
/* 237 */       ☃.a("HiddenEffect", md1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static apu b(md ☃) {
/* 242 */     int i = ☃.f("Id");
/* 243 */     aps aps1 = aps.a(i);
/* 244 */     if (aps1 == null) {
/* 245 */       return null;
/*     */     }
/* 247 */     return a(aps1, ☃);
/*     */   }
/*     */   
/*     */   private static apu a(aps ☃, md md1) {
/* 251 */     int i = md1.f("Amplifier");
/* 252 */     int j = md1.h("Duration");
/* 253 */     boolean bool1 = md1.q("Ambient");
/* 254 */     boolean bool2 = true;
/* 255 */     if (md1.c("ShowParticles", 1)) {
/* 256 */       bool2 = md1.q("ShowParticles");
/*     */     }
/* 258 */     boolean bool3 = bool2;
/* 259 */     if (md1.c("ShowIcon", 1)) {
/* 260 */       bool3 = md1.q("ShowIcon");
/*     */     }
/* 262 */     apu apu1 = null;
/* 263 */     if (md1.c("HiddenEffect", 10)) {
/* 264 */       apu1 = a(☃, md1.p("HiddenEffect"));
/*     */     }
/* 266 */     return new apu(☃, j, (i < 0) ? 0 : i, bool1, bool2, bool3, apu1);
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 270 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 274 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(apu ☃) {
/* 279 */     int i = 32147;
/* 280 */     if ((b() > 32147 && ☃.b() > 32147) || (d() && ☃.d()))
/*     */     {
/* 282 */       return ComparisonChain.start()
/* 283 */         .compare(Boolean.valueOf(d()), Boolean.valueOf(☃.d()))
/* 284 */         .compare(a().f(), ☃.a().f())
/* 285 */         .result();
/*     */     }
/* 287 */     return ComparisonChain.start()
/* 288 */       .compare(Boolean.valueOf(d()), Boolean.valueOf(☃.d()))
/* 289 */       .compare(b(), ☃.b())
/* 290 */       .compare(a().f(), ☃.a().f())
/* 291 */       .result();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */