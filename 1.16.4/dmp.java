/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class dmp
/*     */   implements dmq
/*     */ {
/*     */   private final a c;
/*     */   private nr d;
/*     */   private List<afa> e;
/*     */   private long f;
/*     */   private boolean g;
/*     */   private final int h;
/*     */   
/*     */   public dmp(a ☃, nr nr1, @Nullable nr nr2) {
/*  28 */     this(☃, nr1, (List<afa>)a(nr2), 160);
/*     */   }
/*     */   
/*     */   public static dmp a(djz ☃, a a1, nr nr1, nr nr2) {
/*  32 */     dku dku = ☃.g;
/*  33 */     List<afa> list = dku.b(nr2, 200);
/*  34 */     int i = Math.max(200, list.stream().mapToInt(dku::a).max().orElse(200));
/*  35 */     return new dmp(a1, nr1, list, i + 30);
/*     */   }
/*     */   
/*     */   private dmp(a ☃, nr nr1, List<afa> list, int i) {
/*  39 */     this.c = ☃;
/*  40 */     this.d = nr1;
/*  41 */     this.e = list;
/*  42 */     this.h = i;
/*     */   }
/*     */   
/*     */   private static ImmutableList<afa> a(@Nullable nr ☃) {
/*  46 */     return (☃ == null) ? ImmutableList.of() : ImmutableList.of(☃.f());
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/*  51 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public dmq.a a(dfm ☃, dmr dmr1, long l) {
/*  56 */     if (this.g) {
/*  57 */       this.f = l;
/*  58 */       this.g = false;
/*     */     } 
/*     */     
/*  61 */     dmr1.b().M().a(a);
/*  62 */     RenderSystem.color3f(1.0F, 1.0F, 1.0F);
/*  63 */     int i = a();
/*  64 */     int j = 12;
/*  65 */     if (i == 160 && this.e.size() <= 1) {
/*  66 */       dmr1.b(☃, 0, 0, 0, 64, i, d());
/*     */     } else {
/*  68 */       int k = d() + Math.max(0, this.e.size() - 1) * 12;
/*     */       
/*  70 */       int m = 28;
/*  71 */       int n = Math.min(4, k - 28);
/*  72 */       a(☃, dmr1, i, 0, 0, 28);
/*     */       
/*  74 */       for (int i1 = 28; i1 < k - n; i1 += 10) {
/*  75 */         a(☃, dmr1, i, 16, i1, Math.min(16, k - i1 - n));
/*     */       }
/*     */       
/*  78 */       a(☃, dmr1, i, 32 - n, k - n, n);
/*     */     } 
/*     */     
/*  81 */     if (this.e == null) {
/*  82 */       (dmr1.b()).g.b(☃, this.d, 18.0F, 12.0F, -256);
/*     */     } else {
/*  84 */       (dmr1.b()).g.b(☃, this.d, 18.0F, 7.0F, -256);
/*  85 */       for (int k = 0; k < this.e.size(); k++) {
/*  86 */         (dmr1.b()).g.b(☃, this.e.get(k), 18.0F, (18 + k * 12), -1);
/*     */       }
/*     */     } 
/*     */     
/*  90 */     return (l - this.f < 5000L) ? dmq.a.a : dmq.a.b;
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, dmr dmr1, int i, int j, int k, int m) {
/*  94 */     int n = (j == 0) ? 20 : 5;
/*  95 */     int i1 = Math.min(60, i - n);
/*     */     
/*  97 */     dmr1.b(☃, 0, k, 0, 64 + j, n, m);
/*  98 */     for (int i2 = n; i2 < i - i1; i2 += 64) {
/*  99 */       dmr1.b(☃, i2, k, 32, 64 + j, Math.min(64, i - i2 - i1), m);
/*     */     }
/* 101 */     dmr1.b(☃, i - i1, k, 160 - i1, 64 + j, i1, m);
/*     */   }
/*     */   
/*     */   public void a(nr ☃, @Nullable nr nr1) {
/* 105 */     this.d = ☃;
/* 106 */     this.e = (List<afa>)a(nr1);
/* 107 */     this.g = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public a b() {
/* 112 */     return this.c;
/*     */   }
/*     */   
/*     */   public enum a {
/* 116 */     a,
/* 117 */     b,
/* 118 */     c,
/* 119 */     d,
/* 120 */     e,
/* 121 */     f,
/* 122 */     g;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(dmr ☃, a a1, nr nr1, @Nullable nr nr2) {
/* 127 */     ☃.a(new dmp(a1, nr1, nr2));
/*     */   }
/*     */   
/*     */   public static void b(dmr ☃, a a1, nr nr1, @Nullable nr nr2) {
/* 131 */     dmp dmp1 = ☃.<dmp>a(dmp.class, a1);
/* 132 */     if (dmp1 == null) {
/* 133 */       a(☃, a1, nr1, nr2);
/*     */     } else {
/* 135 */       dmp1.a(nr1, nr2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(djz ☃, String str) {
/* 140 */     a(☃.an(), a.f, new of("selectWorld.access_failure"), new oe(str));
/*     */   }
/*     */   
/*     */   public static void b(djz ☃, String str) {
/* 144 */     a(☃.an(), a.f, new of("selectWorld.delete_failure"), new oe(str));
/*     */   }
/*     */   
/*     */   public static void c(djz ☃, String str) {
/* 148 */     a(☃.an(), a.g, new of("pack.copyFailure"), new oe(str));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */