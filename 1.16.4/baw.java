/*     */ import java.util.Locale;
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
/*     */ public class baw
/*     */   extends azy
/*     */ {
/*  28 */   private static final us<Integer> c = uv.a((Class)baw.class, uu.b);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  34 */   private static final vk[] d = new vk[] { new vk("textures/entity/fish/tropical_a.png"), new vk("textures/entity/fish/tropical_b.png") };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   private static final vk[] bo = new vk[] { new vk("textures/entity/fish/tropical_a_pattern_1.png"), new vk("textures/entity/fish/tropical_a_pattern_2.png"), new vk("textures/entity/fish/tropical_a_pattern_3.png"), new vk("textures/entity/fish/tropical_a_pattern_4.png"), new vk("textures/entity/fish/tropical_a_pattern_5.png"), new vk("textures/entity/fish/tropical_a_pattern_6.png") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   private static final vk[] bp = new vk[] { new vk("textures/entity/fish/tropical_b_pattern_1.png"), new vk("textures/entity/fish/tropical_b_pattern_2.png"), new vk("textures/entity/fish/tropical_b_pattern_3.png"), new vk("textures/entity/fish/tropical_b_pattern_4.png"), new vk("textures/entity/fish/tropical_b_pattern_5.png"), new vk("textures/entity/fish/tropical_b_pattern_6.png") };
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
/*  60 */   public static final int[] b = new int[] { 
/*  61 */       a(a.h, bkx.b, bkx.h), 
/*  62 */       a(a.g, bkx.h, bkx.h), 
/*  63 */       a(a.g, bkx.h, bkx.l), 
/*  64 */       a(a.l, bkx.a, bkx.h), 
/*  65 */       a(a.b, bkx.l, bkx.h), 
/*  66 */       a(a.a, bkx.b, bkx.a), 
/*  67 */       a(a.f, bkx.g, bkx.d), 
/*  68 */       a(a.j, bkx.k, bkx.e), 
/*  69 */       a(a.l, bkx.a, bkx.o), 
/*  70 */       a(a.f, bkx.a, bkx.e), 
/*  71 */       a(a.i, bkx.a, bkx.h), 
/*  72 */       a(a.l, bkx.a, bkx.b), 
/*  73 */       a(a.d, bkx.j, bkx.g), 
/*  74 */       a(a.e, bkx.f, bkx.d), 
/*  75 */       a(a.k, bkx.o, bkx.a), 
/*  76 */       a(a.c, bkx.h, bkx.o), 
/*  77 */       a(a.j, bkx.o, bkx.a), 
/*  78 */       a(a.g, bkx.a, bkx.e), 
/*  79 */       a(a.a, bkx.o, bkx.a), 
/*  80 */       a(a.b, bkx.h, bkx.a), 
/*  81 */       a(a.d, bkx.j, bkx.e), 
/*  82 */       a(a.g, bkx.e, bkx.e) };
/*     */   
/*     */   enum a
/*     */   {
/*  86 */     a(0, 0),
/*  87 */     b(0, 1),
/*  88 */     c(0, 2),
/*  89 */     d(0, 3),
/*  90 */     e(0, 4),
/*  91 */     f(0, 5),
/*  92 */     g(1, 0),
/*  93 */     h(1, 1),
/*  94 */     i(1, 2),
/*  95 */     j(1, 3),
/*  96 */     k(1, 4),
/*  97 */     l(1, 5);
/*     */     
/*     */     private final int m;
/*     */     private final int n;
/* 101 */     private static final a[] o = values();
/*     */     
/*     */     a(int ☃, int i) {
/* 104 */       this.m = ☃;
/* 105 */       this.n = i;
/*     */     } static {
/*     */     
/*     */     } public int a() {
/* 109 */       return this.m;
/*     */     }
/*     */     
/*     */     public int b() {
/* 113 */       return this.n;
/*     */     }
/*     */     
/*     */     public static String a(int ☃, int i) {
/* 117 */       return o[i + 6 * ☃].c();
/*     */     }
/*     */     
/*     */     public String c() {
/* 121 */       return name().toLowerCase(Locale.ROOT);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int a(a ☃, bkx bkx1, bkx bkx2) {
/* 126 */     return ☃.a() & 0xFF | (☃.b() & 0xFF) << 8 | (bkx1.b() & 0xFF) << 16 | (bkx2.b() & 0xFF) << 24;
/*     */   }
/*     */   
/*     */   private boolean bq = true;
/*     */   
/*     */   public baw(aqe<? extends baw> ☃, brx brx1) {
/* 132 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public static String b(int ☃) {
/* 136 */     return "entity.minecraft.tropical_fish.predefined." + ☃;
/*     */   }
/*     */   
/*     */   public static bkx s(int ☃) {
/* 140 */     return bkx.a(x(☃));
/*     */   }
/*     */   
/*     */   public static bkx t(int ☃) {
/* 144 */     return bkx.a(y(☃));
/*     */   }
/*     */   
/*     */   public static String u(int ☃) {
/* 148 */     int i = w(☃);
/* 149 */     int j = z(☃);
/* 150 */     return "entity.minecraft.tropical_fish.type." + a.a(i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 155 */     super.e();
/*     */     
/* 157 */     this.R.a(c, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 162 */     super.b(☃);
/*     */     
/* 164 */     ☃.b("Variant", eU());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 169 */     super.a(☃);
/*     */     
/* 171 */     v(☃.h("Variant"));
/*     */   }
/*     */   
/*     */   public void v(int ☃) {
/* 175 */     this.R.b(c, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃) {
/* 180 */     return !this.bq;
/*     */   }
/*     */   
/*     */   public int eU() {
/* 184 */     return ((Integer)this.R.<Integer>a(c)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void k(bmb ☃) {
/* 189 */     super.k(☃);
/*     */     
/* 191 */     md md = ☃.p();
/* 192 */     md.b("BucketVariantTag", eU());
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb eK() {
/* 197 */     return new bmb(bmd.lX);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 202 */     return adq.pp;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 207 */     return adq.pq;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 212 */     return adq.ps;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp eM() {
/* 217 */     return adq.pr;
/*     */   }
/*     */   
/*     */   private static int x(int ☃) {
/* 221 */     return (☃ & 0xFF0000) >> 16;
/*     */   }
/*     */   
/*     */   public float[] eV() {
/* 225 */     return bkx.a(x(eU())).e();
/*     */   }
/*     */   
/*     */   private static int y(int ☃) {
/* 229 */     return (☃ & 0xFF000000) >> 24;
/*     */   }
/*     */   
/*     */   public float[] eW() {
/* 233 */     return bkx.a(y(eU())).e();
/*     */   }
/*     */   
/*     */   public static int w(int ☃) {
/* 237 */     return Math.min(☃ & 0xFF, 1);
/*     */   }
/*     */   
/*     */   public int eX() {
/* 241 */     return w(eU());
/*     */   }
/*     */   
/*     */   private static int z(int ☃) {
/* 245 */     return Math.min((☃ & 0xFF00) >> 8, 5);
/*     */   }
/*     */   
/*     */   public vk eY() {
/* 249 */     if (w(eU()) == 0) {
/* 250 */       return bo[z(eU())];
/*     */     }
/*     */     
/* 253 */     return bp[z(eU())];
/*     */   }
/*     */   
/*     */   public vk eZ() {
/* 257 */     return d[w(eU())];
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*     */     int i, j, k, m;
/* 263 */     arc1 = super.a(☃, aos1, aqp1, arc1, md1);
/*     */     
/* 265 */     if (md1 != null && md1.c("BucketVariantTag", 3)) {
/* 266 */       v(md1.h("BucketVariantTag"));
/* 267 */       return arc1;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 276 */     if (arc1 instanceof b) {
/* 277 */       b b = (b)arc1;
/* 278 */       i = b.a(b);
/* 279 */       j = b.b(b);
/* 280 */       k = b.c(b);
/* 281 */       m = b.d(b);
/* 282 */     } else if (this.J.nextFloat() < 0.9D) {
/*     */       
/* 284 */       int n = x.a(b, this.J);
/* 285 */       i = n & 0xFF;
/* 286 */       j = (n & 0xFF00) >> 8;
/* 287 */       k = (n & 0xFF0000) >> 16;
/* 288 */       m = (n & 0xFF000000) >> 24;
/* 289 */       arc1 = new b(this, i, j, k, m);
/*     */     } else {
/* 291 */       this.bq = false;
/* 292 */       i = this.J.nextInt(2);
/* 293 */       j = this.J.nextInt(6);
/* 294 */       k = this.J.nextInt(15);
/* 295 */       m = this.J.nextInt(15);
/*     */     } 
/*     */     
/* 298 */     v(i | j << 8 | k << 16 | m << 24);
/*     */     
/* 300 */     return arc1;
/*     */   }
/*     */   
/*     */   static class b extends azy.a {
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private final int e;
/*     */     
/*     */     private b(baw ☃, int i, int j, int k, int m) {
/* 310 */       super(☃);
/* 311 */       this.b = i;
/* 312 */       this.c = j;
/* 313 */       this.d = k;
/* 314 */       this.e = m;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\baw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */