/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.CacheLoader;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cem
/*     */ {
/*     */   private final Predicate<cel>[][][] a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   
/*     */   public cem(Predicate<cel>[][][] ☃) {
/*  22 */     this.a = ☃;
/*     */     
/*  24 */     this.b = ☃.length;
/*     */     
/*  26 */     if (this.b > 0) {
/*  27 */       this.c = (☃[0]).length;
/*     */       
/*  29 */       if (this.c > 0) {
/*  30 */         this.d = (☃[0][0]).length;
/*     */       } else {
/*  32 */         this.d = 0;
/*     */       } 
/*     */     } else {
/*  35 */       this.c = 0;
/*  36 */       this.d = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public int a() {
/*  41 */     return this.b;
/*     */   }
/*     */   
/*     */   public int b() {
/*  45 */     return this.c;
/*     */   }
/*     */   
/*     */   public int c() {
/*  49 */     return this.d;
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
/*     */   
/*     */   @Nullable
/*     */   private b a(fx ☃, gc gc1, gc gc2, LoadingCache<fx, cel> loadingCache) {
/*  64 */     for (int i = 0; i < this.d; i++) {
/*  65 */       for (int j = 0; j < this.c; j++) {
/*  66 */         for (int k = 0; k < this.b; k++) {
/*  67 */           if (!this.a[k][j][i].test(loadingCache.getUnchecked(a(☃, gc1, gc2, i, j, k)))) {
/*  68 */             return null;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  74 */     return new b(☃, gc1, gc2, loadingCache, this.d, this.c, this.b);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public b a(brz ☃, fx fx1) {
/*  79 */     LoadingCache<fx, cel> loadingCache = a(☃, false);
/*     */     
/*  81 */     int i = Math.max(Math.max(this.d, this.c), this.b);
/*     */     
/*  83 */     for (fx fx2 : fx.a(fx1, fx1.b(i - 1, i - 1, i - 1))) {
/*  84 */       for (gc gc : gc.values()) {
/*  85 */         for (gc gc1 : gc.values()) {
/*  86 */           if (gc1 != gc && gc1 != gc.f()) {
/*     */ 
/*     */ 
/*     */             
/*  90 */             b b = a(fx2, gc, gc1, loadingCache);
/*  91 */             if (b != null) {
/*  92 */               return b;
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*  98 */     return null;
/*     */   }
/*     */   
/*     */   public static LoadingCache<fx, cel> a(brz ☃, boolean bool) {
/* 102 */     return CacheBuilder.newBuilder().build(new a(☃, bool));
/*     */   }
/*     */   
/*     */   protected static fx a(fx ☃, gc gc1, gc gc2, int i, int j, int k) {
/* 106 */     if (gc1 == gc2 || gc1 == gc2.f()) {
/* 107 */       throw new IllegalArgumentException("Invalid forwards & up combination");
/*     */     }
/*     */     
/* 110 */     gr gr1 = new gr(gc1.i(), gc1.j(), gc1.k());
/* 111 */     gr gr2 = new gr(gc2.i(), gc2.j(), gc2.k());
/* 112 */     gr gr3 = gr1.d(gr2);
/*     */     
/* 114 */     return ☃.b(gr2
/* 115 */         .u() * -j + gr3.u() * i + gr1.u() * k, gr2
/* 116 */         .v() * -j + gr3.v() * i + gr1.v() * k, gr2
/* 117 */         .w() * -j + gr3.w() * i + gr1.w() * k);
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends CacheLoader<fx, cel> {
/*     */     private final brz a;
/*     */     private final boolean b;
/*     */     
/*     */     public a(brz ☃, boolean bool) {
/* 126 */       this.a = ☃;
/* 127 */       this.b = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public cel a(fx ☃) throws Exception {
/* 132 */       return new cel(this.a, ☃, this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     private final fx a;
/*     */     private final gc b;
/*     */     private final gc c;
/*     */     private final LoadingCache<fx, cel> d;
/*     */     private final int e;
/*     */     private final int f;
/*     */     private final int g;
/*     */     
/*     */     public b(fx ☃, gc gc1, gc gc2, LoadingCache<fx, cel> loadingCache, int i, int j, int k) {
/* 146 */       this.a = ☃;
/* 147 */       this.b = gc1;
/* 148 */       this.c = gc2;
/* 149 */       this.d = loadingCache;
/* 150 */       this.e = i;
/* 151 */       this.f = j;
/* 152 */       this.g = k;
/*     */     }
/*     */     
/*     */     public fx a() {
/* 156 */       return this.a;
/*     */     }
/*     */     
/*     */     public gc b() {
/* 160 */       return this.b;
/*     */     }
/*     */     
/*     */     public gc c() {
/* 164 */       return this.c;
/*     */     }
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
/*     */     public cel a(int ☃, int i, int j) {
/* 180 */       return (cel)this.d.getUnchecked(cem.a(this.a, b(), c(), ☃, i, j));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 185 */       return MoreObjects.toStringHelper(this)
/* 186 */         .add("up", this.c)
/* 187 */         .add("forwards", this.b)
/* 188 */         .add("frontTopLeft", this.a)
/* 189 */         .toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */