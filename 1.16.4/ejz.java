/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.function.Consumer;
/*     */ 
/*     */ public class ejz {
/*     */   private static final Comparator<a> a;
/*     */   private final int b;
/*     */   
/*     */   static {
/*  14 */     a = Comparator.comparing(☃ -> Integer.valueOf(-☃.c)).thenComparing(☃ -> Integer.valueOf(-☃.b)).thenComparing(☃ -> ☃.a.a());
/*     */   }
/*     */   
/*  17 */   private final Set<a> c = Sets.newHashSetWithExpectedSize(256);
/*  18 */   private final List<b> d = Lists.newArrayListWithCapacity(256);
/*     */   
/*     */   private int e;
/*     */   private int f;
/*     */   private final int g;
/*     */   private final int h;
/*     */   
/*     */   public ejz(int ☃, int i, int j) {
/*  26 */     this.b = j;
/*  27 */     this.g = ☃;
/*  28 */     this.h = i;
/*     */   }
/*     */   
/*     */   public int a() {
/*  32 */     return this.e;
/*     */   }
/*     */   
/*     */   public int b() {
/*  36 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(ekc.a ☃) {
/*  40 */     a a1 = new a(☃, this.b);
/*  41 */     this.c.add(a1);
/*     */   }
/*     */   
/*     */   public void c() {
/*  45 */     List<a> ☃ = Lists.newArrayList(this.c);
/*  46 */     ☃.sort(a);
/*     */     
/*  48 */     for (a a : ☃) {
/*  49 */       if (!a(a)) {
/*  50 */         throw new eka(a.a, (Collection)☃.stream().map(☃ -> ☃.a).collect(ImmutableList.toImmutableList()));
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  55 */     this.e = afm.c(this.e);
/*  56 */     this.f = afm.c(this.f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(c ☃) {
/*  64 */     for (Iterator<b> iterator = this.d.iterator(); iterator.hasNext(); ) { b b = iterator.next();
/*  65 */       b.a(b1 -> {
/*     */             a a = b1.a();
/*     */             ekc.a a1 = a.a;
/*     */             ☃.load(a1, this.e, this.f, b1.b(), b1.c());
/*     */           }); }
/*     */   
/*     */   }
/*     */   
/*     */   private static int b(int ☃, int i) {
/*  74 */     return (☃ >> i) + (((☃ & (1 << i) - 1) == 0) ? 0 : 1) << i;
/*     */   }
/*     */   
/*     */   private boolean a(a ☃) {
/*  78 */     for (b b : this.d) {
/*  79 */       if (b.a(☃)) {
/*  80 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  84 */     return b(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean b(a ☃) {
/*     */     boolean bool1;
/*     */     b b;
/*  97 */     int i = afm.c(this.e);
/*  98 */     int j = afm.c(this.f);
/*  99 */     int k = afm.c(this.e + ☃.b);
/* 100 */     int m = afm.c(this.f + ☃.c);
/*     */     
/* 102 */     boolean bool2 = (k <= this.g);
/* 103 */     boolean bool3 = (m <= this.h);
/*     */     
/* 105 */     if (!bool2 && !bool3) {
/* 106 */       return false;
/*     */     }
/*     */     
/* 109 */     boolean bool4 = (bool2 && i != k);
/* 110 */     boolean bool5 = (bool3 && j != m);
/*     */     
/* 112 */     if (bool4 ^ bool5) {
/* 113 */       bool1 = bool4;
/*     */     } else {
/*     */       
/* 116 */       bool1 = (bool2 && i <= j);
/*     */     } 
/*     */ 
/*     */     
/* 120 */     if (bool1) {
/*     */       
/* 122 */       if (this.f == 0) {
/* 123 */         this.f = ☃.c;
/*     */       }
/*     */       
/* 126 */       b = new b(this.e, 0, ☃.b, this.f);
/* 127 */       this.e += ☃.b;
/*     */     } else {
/*     */       
/* 130 */       b = new b(0, this.f, this.e, ☃.c);
/* 131 */       this.f += ☃.c;
/*     */     } 
/*     */     
/* 134 */     b.a(☃);
/* 135 */     this.d.add(b);
/*     */     
/* 137 */     return true;
/*     */   }
/*     */   
/*     */   public static interface c {
/*     */     void load(ekc.a param1a, int param1Int1, int param1Int2, int param1Int3, int param1Int4); }
/*     */   
/*     */   static class a { public final ekc.a a;
/*     */     
/*     */     public a(ekc.a ☃, int i) {
/* 146 */       this.a = ☃;
/* 147 */       this.b = ejz.a(☃.b(), i);
/* 148 */       this.c = ejz.a(☃.c(), i);
/*     */     }
/*     */     public final int b; public final int c;
/*     */     
/*     */     public String toString() {
/* 153 */       return "Holder{width=" + this.b + ", height=" + this.c + '}';
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class b
/*     */   {
/*     */     private final int a;
/*     */     
/*     */     private final int b;
/*     */     
/*     */     private final int c;
/*     */     private final int d;
/*     */     private List<b> e;
/*     */     private ejz.a f;
/*     */     
/*     */     public b(int ☃, int i, int j, int k) {
/* 170 */       this.a = ☃;
/* 171 */       this.b = i;
/* 172 */       this.c = j;
/* 173 */       this.d = k;
/*     */     }
/*     */     
/*     */     public ejz.a a() {
/* 177 */       return this.f;
/*     */     }
/*     */     
/*     */     public int b() {
/* 181 */       return this.a;
/*     */     }
/*     */     
/*     */     public int c() {
/* 185 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(ejz.a ☃) {
/* 190 */       if (this.f != null) {
/* 191 */         return false;
/*     */       }
/*     */       
/* 194 */       int i = ☃.b;
/* 195 */       int j = ☃.c;
/*     */ 
/*     */       
/* 198 */       if (i > this.c || j > this.d) {
/* 199 */         return false;
/*     */       }
/*     */ 
/*     */       
/* 203 */       if (i == this.c && j == this.d) {
/*     */         
/* 205 */         this.f = ☃;
/* 206 */         return true;
/*     */       } 
/*     */ 
/*     */       
/* 210 */       if (this.e == null) {
/* 211 */         this.e = Lists.newArrayListWithCapacity(1);
/*     */ 
/*     */         
/* 214 */         this.e.add(new b(this.a, this.b, i, j));
/*     */         
/* 216 */         int k = this.c - i;
/* 217 */         int m = this.d - j;
/*     */         
/* 219 */         if (m > 0 && k > 0) {
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
/* 234 */           int n = Math.max(this.d, k);
/* 235 */           int i1 = Math.max(this.c, m);
/* 236 */           if (n >= i1) {
/* 237 */             this.e.add(new b(this.a, this.b + j, i, m));
/* 238 */             this.e.add(new b(this.a + i, this.b, k, this.d));
/*     */           } else {
/* 240 */             this.e.add(new b(this.a + i, this.b, k, j));
/* 241 */             this.e.add(new b(this.a, this.b + j, this.c, m));
/*     */           } 
/* 243 */         } else if (k == 0) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 253 */           this.e.add(new b(this.a, this.b + j, i, m));
/* 254 */         } else if (m == 0) {
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
/* 265 */           this.e.add(new b(this.a + i, this.b, k, j));
/*     */         } 
/*     */       } 
/*     */       
/* 269 */       for (b b1 : this.e) {
/* 270 */         if (b1.a(☃)) {
/* 271 */           return true;
/*     */         }
/*     */       } 
/*     */       
/* 275 */       return false;
/*     */     }
/*     */     
/*     */     public void a(Consumer<b> ☃) {
/* 279 */       if (this.f != null) {
/* 280 */         ☃.accept(this);
/* 281 */       } else if (this.e != null) {
/* 282 */         for (b b1 : this.e) {
/* 283 */           b1.a(☃);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 290 */       return "Slot{originX=" + this.a + ", originY=" + this.b + ", width=" + this.c + ", height=" + this.d + ", texture=" + this.f + ", subSlots=" + this.e + '}';
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */