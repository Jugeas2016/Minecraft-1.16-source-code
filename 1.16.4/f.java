/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Objects;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.tuple.Triple;
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
/*     */ public final class f
/*     */ {
/*     */   private final b a;
/*     */   private boolean b;
/*     */   @Nullable
/*     */   private g c;
/*     */   @Nullable
/*     */   private d d;
/*     */   @Nullable
/*     */   private g e;
/*     */   @Nullable
/*     */   private d f;
/*     */   private static final f g;
/*     */   
/*     */   public f(@Nullable b ☃) {
/*  37 */     if (☃ == null) {
/*  38 */       this.a = g.a;
/*     */     } else {
/*  40 */       this.a = ☃;
/*     */     } 
/*     */   }
/*     */   
/*     */   public f(@Nullable g ☃, @Nullable d d1, @Nullable g g1, @Nullable d d2) {
/*  45 */     this.a = a(☃, d1, g1, d2);
/*  46 */     this.c = (☃ != null) ? ☃ : new g();
/*  47 */     this.d = (d1 != null) ? d1 : d.a.g();
/*  48 */     this.e = (g1 != null) ? g1 : new g(1.0F, 1.0F, 1.0F);
/*  49 */     this.f = (d2 != null) ? d2 : d.a.g();
/*  50 */     this.b = true;
/*     */   }
/*     */   static {
/*  53 */     g = x.<f>a(() -> {
/*     */           b ☃ = new b();
/*     */           ☃.a();
/*     */           f f1 = new f(☃);
/*     */           f1.d();
/*     */           return f1;
/*     */         });
/*     */   }
/*     */   public static f a() {
/*  62 */     return g;
/*     */   }
/*     */   
/*     */   public f a(f ☃) {
/*  66 */     b b1 = c();
/*  67 */     b1.a(☃.c());
/*  68 */     return new f(b1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public f b() {
/*  73 */     if (this == g) {
/*  74 */       return this;
/*     */     }
/*  76 */     b ☃ = c();
/*  77 */     if (☃.c()) {
/*  78 */       return new f(☃);
/*     */     }
/*  80 */     return null;
/*     */   }
/*     */   
/*     */   private void e() {
/*  84 */     if (!this.b) {
/*  85 */       Pair<a, g> ☃ = a(this.a);
/*  86 */       Triple<d, g, d> triple = ((a)☃.getFirst()).b();
/*  87 */       this.c = (g)☃.getSecond();
/*  88 */       this.d = (d)triple.getLeft();
/*  89 */       this.e = (g)triple.getMiddle();
/*  90 */       this.f = (d)triple.getRight();
/*  91 */       this.b = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static b a(@Nullable g ☃, @Nullable d d1, @Nullable g g1, @Nullable d d2) {
/*  96 */     b b1 = new b();
/*  97 */     b1.a();
/*  98 */     if (d1 != null) {
/*  99 */       b1.a(new b(d1));
/*     */     }
/* 101 */     if (g1 != null) {
/* 102 */       b1.a(b.a(g1.a(), g1.b(), g1.c()));
/*     */     }
/* 104 */     if (d2 != null) {
/* 105 */       b1.a(new b(d2));
/*     */     }
/* 107 */     if (☃ != null) {
/* 108 */       b1.d = ☃.a();
/* 109 */       b1.h = ☃.b();
/* 110 */       b1.l = ☃.c();
/*     */     } 
/* 112 */     return b1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Pair<a, g> a(b ☃) {
/* 119 */     ☃.a(1.0F / ☃.p);
/* 120 */     g g1 = new g(☃.d, ☃.h, ☃.l);
/* 121 */     a a = new a(☃);
/* 122 */     return Pair.of(a, g1);
/*     */   }
/*     */   
/*     */   public b c() {
/* 126 */     return this.a.d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public d d() {
/* 137 */     e();
/* 138 */     return this.d.g();
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
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 155 */     if (this == ☃) {
/* 156 */       return true;
/*     */     }
/* 158 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 159 */       return false;
/*     */     }
/* 161 */     f f1 = (f)☃;
/* 162 */     return Objects.equals(this.a, f1.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 167 */     return Objects.hash(new Object[] { this.a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */