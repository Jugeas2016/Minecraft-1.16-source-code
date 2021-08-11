/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class elc
/*     */ {
/*  11 */   public static final eld a = new eld();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  17 */   public static final elc b = new elc(Lists.newArrayList(), -1, -1, 1, false)
/*     */     {
/*     */       public Pair<Integer, Integer> a(int ☃, int i) {
/*  20 */         return Pair.of(Integer.valueOf(☃), Integer.valueOf(i));
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   private final List<elb> c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   private final boolean g;
/*     */   
/*     */   public elc(List<elb> ☃, int i, int j, int k, boolean bool) {
/*  32 */     this.c = ☃;
/*  33 */     this.d = i;
/*  34 */     this.e = j;
/*  35 */     this.f = k;
/*  36 */     this.g = bool;
/*     */   }
/*     */   
/*     */   private static boolean b(int ☃, int i) {
/*  40 */     return (☃ / i * i == ☃);
/*     */   }
/*     */   
/*     */   public Pair<Integer, Integer> a(int ☃, int i) {
/*  44 */     Pair<Integer, Integer> pair = c(☃, i);
/*  45 */     int j = ((Integer)pair.getFirst()).intValue();
/*  46 */     int k = ((Integer)pair.getSecond()).intValue();
/*     */     
/*  48 */     if (!b(☃, j) || !b(i, k)) {
/*  49 */       throw new IllegalArgumentException(String.format("Image size %s,%s is not multiply of frame size %s,%s", new Object[] { Integer.valueOf(☃), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) }));
/*     */     }
/*     */     
/*  52 */     return pair;
/*     */   }
/*     */   
/*     */   private Pair<Integer, Integer> c(int ☃, int i) {
/*  56 */     if (this.d != -1) {
/*  57 */       if (this.e != -1) {
/*  58 */         return Pair.of(Integer.valueOf(this.d), Integer.valueOf(this.e));
/*     */       }
/*     */ 
/*     */       
/*  62 */       return Pair.of(Integer.valueOf(this.d), Integer.valueOf(i));
/*     */     } 
/*     */     
/*  65 */     if (this.e != -1)
/*     */     {
/*  67 */       return Pair.of(Integer.valueOf(☃), Integer.valueOf(this.e));
/*     */     }
/*     */ 
/*     */     
/*  71 */     int j = Math.min(☃, i);
/*  72 */     return Pair.of(Integer.valueOf(j), Integer.valueOf(j));
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/*  76 */     return (this.e == -1) ? ☃ : this.e;
/*     */   }
/*     */   
/*     */   public int b(int ☃) {
/*  80 */     return (this.d == -1) ? ☃ : this.d;
/*     */   }
/*     */   
/*     */   public int a() {
/*  84 */     return this.c.size();
/*     */   }
/*     */   
/*     */   public int b() {
/*  88 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  92 */     return this.g;
/*     */   }
/*     */   
/*     */   private elb f(int ☃) {
/*  96 */     return this.c.get(☃);
/*     */   }
/*     */   
/*     */   public int c(int ☃) {
/* 100 */     elb elb = f(☃);
/*     */     
/* 102 */     if (elb.a()) {
/* 103 */       return this.f;
/*     */     }
/* 105 */     return elb.b();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int e(int ☃) {
/* 114 */     return ((elb)this.c.get(☃)).c();
/*     */   }
/*     */   
/*     */   public Set<Integer> d() {
/* 118 */     Set<Integer> ☃ = Sets.newHashSet();
/* 119 */     for (elb elb : this.c) {
/* 120 */       ☃.add(Integer.valueOf(elb.c()));
/*     */     }
/*     */     
/* 123 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */