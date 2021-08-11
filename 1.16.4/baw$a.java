/*     */ import java.util.Locale;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ enum a
/*     */ {
/*     */   private final int m;
/*     */   private final int n;
/*  86 */   a(0, 0),
/*  87 */   b(0, 1),
/*  88 */   c(0, 2),
/*  89 */   d(0, 3),
/*  90 */   e(0, 4),
/*  91 */   f(0, 5),
/*  92 */   g(1, 0),
/*  93 */   h(1, 1),
/*  94 */   i(1, 2),
/*  95 */   j(1, 3),
/*  96 */   k(1, 4),
/*  97 */   l(1, 5);
/*     */   private static final a[] o;
/*     */   
/*     */   static {
/* 101 */     o = values();
/*     */   }
/*     */   a(int ☃, int i) {
/* 104 */     this.m = ☃;
/* 105 */     this.n = i;
/*     */   }
/*     */   
/*     */   public int a() {
/* 109 */     return this.m;
/*     */   }
/*     */   
/*     */   public int b() {
/* 113 */     return this.n;
/*     */   }
/*     */   
/*     */   public static String a(int ☃, int i) {
/* 117 */     return o[i + 6 * ☃].c();
/*     */   }
/*     */   
/*     */   public String c() {
/* 121 */     return name().toLowerCase(Locale.ROOT);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\baw$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */