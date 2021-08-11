/*     */ import java.util.Spliterators;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class gp
/*     */   extends gr
/*     */ {
/*     */   private gp(int ☃, int i, int j) {
/*  45 */     super(☃, i, j);
/*     */   }
/*     */   
/*     */   public static gp a(int ☃, int i, int j) {
/*  49 */     return new gp(☃, i, j);
/*     */   }
/*     */   
/*     */   public static gp a(fx ☃) {
/*  53 */     return new gp(a(☃.u()), a(☃.v()), a(☃.w()));
/*     */   }
/*     */   
/*     */   public static gp a(brd ☃, int i) {
/*  57 */     return new gp(☃.b, i, ☃.c);
/*     */   }
/*     */   
/*     */   public static gp a(aqa ☃) {
/*  61 */     return new gp(
/*  62 */         a(afm.c(☃.cD())), 
/*  63 */         a(afm.c(☃.cE())), 
/*  64 */         a(afm.c(☃.cH())));
/*     */   }
/*     */ 
/*     */   
/*     */   public static gp a(long ☃) {
/*  69 */     return new gp(b(☃), c(☃), d(☃));
/*     */   }
/*     */   
/*     */   public static long a(long ☃, gc gc1) {
/*  73 */     return a(☃, gc1.i(), gc1.j(), gc1.k());
/*     */   }
/*     */   
/*     */   public static long a(long ☃, int i, int j, int k) {
/*  77 */     return b(b(☃) + i, c(☃) + j, d(☃) + k);
/*     */   }
/*     */   
/*     */   public static int a(int ☃) {
/*  81 */     return ☃ >> 4;
/*     */   }
/*     */   
/*     */   public static int b(int ☃) {
/*  85 */     return ☃ & 0xF;
/*     */   }
/*     */   
/*     */   public static short b(fx ☃) {
/*  89 */     int i = b(☃.u());
/*  90 */     int j = b(☃.v());
/*  91 */     int k = b(☃.w());
/*  92 */     return (short)(i << 8 | k << 4 | j << 0);
/*     */   }
/*     */   
/*     */   public static int a(short ☃) {
/*  96 */     return ☃ >>> 8 & 0xF;
/*     */   }
/*     */   
/*     */   public static int b(short ☃) {
/* 100 */     return ☃ >>> 0 & 0xF;
/*     */   }
/*     */   
/*     */   public static int c(short ☃) {
/* 104 */     return ☃ >>> 4 & 0xF;
/*     */   }
/*     */   
/*     */   public int d(short ☃) {
/* 108 */     return d() + a(☃);
/*     */   }
/*     */   
/*     */   public int e(short ☃) {
/* 112 */     return e() + b(☃);
/*     */   }
/*     */   
/*     */   public int f(short ☃) {
/* 116 */     return f() + c(☃);
/*     */   }
/*     */   
/*     */   public fx g(short ☃) {
/* 120 */     return new fx(d(☃), e(☃), f(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int c(int ☃) {
/* 128 */     return ☃ << 4;
/*     */   }
/*     */   
/*     */   public static int b(long ☃) {
/* 132 */     return (int)(☃ << 0L >> 42L);
/*     */   }
/*     */   
/*     */   public static int c(long ☃) {
/* 136 */     return (int)(☃ << 44L >> 44L);
/*     */   }
/*     */   
/*     */   public static int d(long ☃) {
/* 140 */     return (int)(☃ << 22L >> 42L);
/*     */   }
/*     */   
/*     */   public int a() {
/* 144 */     return u();
/*     */   }
/*     */   
/*     */   public int b() {
/* 148 */     return v();
/*     */   }
/*     */   
/*     */   public int c() {
/* 152 */     return w();
/*     */   }
/*     */   
/*     */   public int d() {
/* 156 */     return a() << 4;
/*     */   }
/*     */   
/*     */   public int e() {
/* 160 */     return b() << 4;
/*     */   }
/*     */   
/*     */   public int f() {
/* 164 */     return c() << 4;
/*     */   }
/*     */   
/*     */   public int g() {
/* 168 */     return (a() << 4) + 15;
/*     */   }
/*     */   
/*     */   public int h() {
/* 172 */     return (b() << 4) + 15;
/*     */   }
/*     */   
/*     */   public int i() {
/* 176 */     return (c() << 4) + 15;
/*     */   }
/*     */   
/*     */   public static long e(long ☃) {
/* 180 */     return b(
/* 181 */         a(fx.b(☃)), 
/* 182 */         a(fx.c(☃)), 
/* 183 */         a(fx.d(☃)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long f(long ☃) {
/* 189 */     return ☃ & 0xFFFFFFFFFFF00000L;
/*     */   }
/*     */   
/*     */   public fx p() {
/* 193 */     return new fx(c(a()), c(b()), c(c()));
/*     */   }
/*     */   
/*     */   public fx q() {
/* 197 */     int ☃ = 8;
/* 198 */     return p().b(8, 8, 8);
/*     */   }
/*     */   
/*     */   public brd r() {
/* 202 */     return new brd(a(), c());
/*     */   }
/*     */   
/*     */   public static long b(int ☃, int i, int j) {
/* 206 */     long l = 0L;
/* 207 */     l |= (☃ & 0x3FFFFFL) << 42L;
/* 208 */     l |= (i & 0xFFFFFL) << 0L;
/* 209 */     l |= (j & 0x3FFFFFL) << 20L;
/* 210 */     return l;
/*     */   }
/*     */   
/*     */   public long s() {
/* 214 */     return b(a(), b(), c());
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
/*     */   public Stream<fx> t() {
/* 226 */     return fx.a(d(), e(), f(), g(), h(), i());
/*     */   }
/*     */   
/*     */   public static Stream<gp> a(gp ☃, int i) {
/* 230 */     int j = ☃.a();
/* 231 */     int k = ☃.b();
/* 232 */     int m = ☃.c();
/* 233 */     return a(j - i, k - i, m - i, j + i, k + i, m + i);
/*     */   }
/*     */   
/*     */   public static Stream<gp> b(brd ☃, int i) {
/* 237 */     int j = ☃.b;
/* 238 */     int k = ☃.c;
/* 239 */     return a(j - i, 0, k - i, j + i, 15, k + i);
/*     */   }
/*     */   
/*     */   public static Stream<gp> a(int ☃, int i, int j, int k, int m, int n) {
/* 243 */     return StreamSupport.stream(new Spliterators.AbstractSpliterator<gp>(((k - ☃ + 1) * (m - i + 1) * (n - j + 1)), 64, ☃, i, j, k, m, n) {
/* 244 */           final ga a = new ga(this.b, this.c, this.d, this.e, this.f, this.g);
/*     */ 
/*     */           
/*     */           public boolean tryAdvance(Consumer<? super gp> ☃) {
/* 248 */             if (this.a.a()) {
/* 249 */               ☃.accept(new gp(this.a.b(), this.a.c(), this.a.d()));
/* 250 */               return true;
/*     */             } 
/* 252 */             return false;
/*     */           }
/*     */         }false);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */