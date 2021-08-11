/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class abu
/*     */   implements AutoCloseable
/*     */ {
/*  23 */   private static final Logger a = LogManager.getLogger();
/*  24 */   private static final abo b = new abo((new of("resourcePack.broken_assets")).a(new k[] { k.m, k.u }, ), w.a().getPackVersion());
/*     */   
/*     */   private final String c;
/*     */   private final Supplier<abj> d;
/*     */   private final nr e;
/*     */   private final nr f;
/*     */   private final abv g;
/*     */   private final b h;
/*     */   private final boolean i;
/*     */   private final boolean j;
/*     */   private final abx k;
/*     */   
/*     */   @Nullable
/*     */   public static abu a(String ☃, boolean bool, Supplier<abj> supplier, a a1, b b1, abx abx1) {
/*  38 */     try (abj ☃ = (abj)supplier.get()) {
/*  39 */       abo abo1 = abj.<abo>a(abo.a);
/*  40 */       if (bool && abo1 == null) {
/*  41 */         a.error("Broken/missing pack.mcmeta detected, fudging it into existance. Please check that your launcher has downloaded all assets for the game correctly!");
/*  42 */         abo1 = b;
/*     */       } 
/*     */       
/*  45 */       if (abo1 != null) {
/*  46 */         return a1.create(☃, bool, supplier, abj, abo1, b1, abx1);
/*     */       }
/*  48 */       a.warn("Couldn't find pack meta for pack {}", ☃);
/*     */     }
/*  50 */     catch (IOException iOException) {
/*  51 */       a.warn("Couldn't get pack info for: {}", iOException.toString());
/*     */     } 
/*  53 */     return null;
/*     */   }
/*     */   
/*     */   public abu(String ☃, boolean bool1, Supplier<abj> supplier, nr nr1, nr nr2, abv abv1, b b1, boolean bool2, abx abx1) {
/*  57 */     this.c = ☃;
/*  58 */     this.d = supplier;
/*  59 */     this.e = nr1;
/*  60 */     this.f = nr2;
/*  61 */     this.g = abv1;
/*  62 */     this.i = bool1;
/*  63 */     this.h = b1;
/*  64 */     this.j = bool2;
/*  65 */     this.k = abx1;
/*     */   }
/*     */   
/*     */   public abu(String ☃, boolean bool, Supplier<abj> supplier, abj abj1, abo abo1, b b1, abx abx1) {
/*  69 */     this(☃, bool, supplier, new oe(abj1.a()), abo1.a(), abv.a(abo1.b()), b1, false, abx1);
/*     */   }
/*     */   
/*     */   public nr a() {
/*  73 */     return this.e;
/*     */   }
/*     */   
/*     */   public nr b() {
/*  77 */     return this.f;
/*     */   }
/*     */   
/*     */   public nr a(boolean ☃) {
/*  81 */     return ns.a(this.k.decorate(new oe(this.c))).a(ob1 -> ob1.a(☃ ? k.k : k.m).a(StringArgumentType.escapeIfRequired(this.c)).a(new nv((nv.a)nv.a.a, (T)(new oe("")).a(this.e).c("\n").a(this.f))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abv c() {
/*  89 */     return this.g;
/*     */   }
/*     */   
/*     */   public abj d() {
/*  93 */     return this.d.get();
/*     */   }
/*     */   
/*     */   public String e() {
/*  97 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 101 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 105 */     return this.j;
/*     */   }
/*     */   
/*     */   public b h() {
/* 109 */     return this.h;
/*     */   }
/*     */   
/*     */   public abx i() {
/* 113 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 124 */     if (this == ☃) {
/* 125 */       return true;
/*     */     }
/* 127 */     if (!(☃ instanceof abu)) {
/* 128 */       return false;
/*     */     }
/*     */     
/* 131 */     abu abu1 = (abu)☃;
/*     */     
/* 133 */     return this.c.equals(abu1.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 138 */     return this.c.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {}
/*     */   
/*     */   public enum b
/*     */   {
/* 146 */     a,
/* 147 */     b;
/*     */ 
/*     */     
/*     */     public <T> int a(List<T> ☃, T t, Function<T, abu> function, boolean bool) {
/* 151 */       b b1 = bool ? a() : this;
/* 152 */       if (b1 == b) {
/* 153 */         int j = 0;
/* 154 */         while (j < ☃.size()) {
/* 155 */           abu abu = function.apply(☃.get(j));
/* 156 */           if (abu.g() && abu.h() == this) {
/* 157 */             j++;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 162 */         ☃.add(j, t);
/* 163 */         return j;
/*     */       } 
/* 165 */       int i = ☃.size() - 1;
/* 166 */       while (i >= 0) {
/* 167 */         abu abu = function.apply(☃.get(i));
/* 168 */         if (abu.g() && abu.h() == this) {
/* 169 */           i--;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 174 */       ☃.add(i + 1, t);
/* 175 */       return i + 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public b a() {
/* 180 */       return (this == a) ? b : a;
/*     */     }
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a {
/*     */     @Nullable
/*     */     abu create(String param1String, boolean param1Boolean, Supplier<abj> param1Supplier, abj param1abj, abo param1abo, abu.b param1b, abx param1abx);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */