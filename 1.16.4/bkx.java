/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public enum bkx
/*     */   implements afs
/*     */ {
/*     */   private static final bkx[] q;
/*     */   private static final Int2ObjectOpenHashMap<bkx> r;
/*  13 */   a(0, "white", 16383998, cvb.j, 15790320, 16777215),
/*  14 */   b(1, "orange", 16351261, cvb.q, 15435844, 16738335),
/*  15 */   c(2, "magenta", 13061821, cvb.r, 12801229, 16711935),
/*  16 */   d(3, "light_blue", 3847130, cvb.s, 6719955, 10141901),
/*  17 */   e(4, "yellow", 16701501, cvb.t, 14602026, 16776960),
/*  18 */   f(5, "lime", 8439583, cvb.u, 4312372, 12582656),
/*  19 */   g(6, "pink", 15961002, cvb.v, 14188952, 16738740),
/*  20 */   h(7, "gray", 4673362, cvb.w, 4408131, 8421504),
/*  21 */   i(8, "light_gray", 10329495, cvb.x, 11250603, 13882323),
/*  22 */   j(9, "cyan", 1481884, cvb.y, 2651799, 65535),
/*  23 */   k(10, "purple", 8991416, cvb.z, 8073150, 10494192),
/*  24 */   l(11, "blue", 3949738, cvb.A, 2437522, 255),
/*  25 */   m(12, "brown", 8606770, cvb.B, 5320730, 9127187),
/*  26 */   n(13, "green", 6192150, cvb.C, 3887386, 65280),
/*  27 */   o(14, "red", 11546150, cvb.D, 11743532, 16711680),
/*  28 */   p(15, "black", 1908001, cvb.E, 1973019, 0);
/*     */   
/*     */   static {
/*  31 */     q = (bkx[])Arrays.<bkx>stream(values()).sorted(Comparator.comparingInt(bkx::b)).toArray(☃ -> new bkx[☃]);
/*  32 */     r = new Int2ObjectOpenHashMap((Map)Arrays.<bkx>stream(values()).collect(Collectors.toMap(☃ -> Integer.valueOf(☃.y), ☃ -> ☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   private final int s;
/*     */   
/*     */   private final String t;
/*     */   
/*     */   private final cvb u;
/*     */   private final int v;
/*     */   
/*     */   bkx(int ☃, String str1, int i, cvb cvb1, int j, int k) {
/*  44 */     this.s = ☃;
/*  45 */     this.t = str1;
/*  46 */     this.v = i;
/*  47 */     this.u = cvb1;
/*  48 */     this.z = k;
/*     */     
/*  50 */     int m = (i & 0xFF0000) >> 16;
/*  51 */     int n = (i & 0xFF00) >> 8;
/*  52 */     int i1 = (i & 0xFF) >> 0;
/*  53 */     this.w = i1 << 16 | n << 8 | m << 0;
/*  54 */     this.x = new float[] { m / 255.0F, n / 255.0F, i1 / 255.0F };
/*  55 */     this.y = j;
/*     */   }
/*     */   private final int w; private final float[] x; private final int y; private final int z;
/*     */   public int b() {
/*  59 */     return this.s;
/*     */   }
/*     */   
/*     */   public String c() {
/*  63 */     return this.t;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float[] e() {
/*  71 */     return this.x;
/*     */   }
/*     */   
/*     */   public cvb f() {
/*  75 */     return this.u;
/*     */   }
/*     */   
/*     */   public int g() {
/*  79 */     return this.y;
/*     */   }
/*     */   
/*     */   public int h() {
/*  83 */     return this.z;
/*     */   }
/*     */   
/*     */   public static bkx a(int ☃) {
/*  87 */     if (☃ < 0 || ☃ >= q.length) {
/*  88 */       ☃ = 0;
/*     */     }
/*  90 */     return q[☃];
/*     */   }
/*     */   
/*     */   public static bkx a(String ☃, bkx bkx1) {
/*  94 */     for (bkx bkx2 : values()) {
/*  95 */       if (bkx2.t.equals(☃)) {
/*  96 */         return bkx2;
/*     */       }
/*     */     } 
/*     */     
/* 100 */     return bkx1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static bkx b(int ☃) {
/* 105 */     return (bkx)r.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 110 */     return this.t;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 115 */     return this.t;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */