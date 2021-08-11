/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Arrays;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
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
/*     */ public enum a
/*     */   implements afs, Predicate<gc>
/*     */ {
/* 406 */   a("x")
/*     */   {
/*     */     public int a(int ☃, int i, int j) {
/* 409 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public double a(double ☃, double d1, double d2) {
/* 414 */       return ☃;
/*     */     }
/*     */   },
/* 417 */   b("y")
/*     */   {
/*     */     public int a(int ☃, int i, int j) {
/* 420 */       return i;
/*     */     }
/*     */ 
/*     */     
/*     */     public double a(double ☃, double d1, double d2) {
/* 425 */       return d1;
/*     */     }
/*     */   },
/* 428 */   c("z")
/*     */   {
/*     */     public int a(int ☃, int i, int j) {
/* 431 */       return j;
/*     */     }
/*     */ 
/*     */     
/*     */     public double a(double ☃, double d1, double d2) {
/* 436 */       return d2;
/*     */     } };
/*     */   private static final a[] e; public static final Codec<a> d;
/*     */   
/*     */   static {
/* 441 */     e = values();
/*     */     
/* 443 */     d = afs.a(a::values, a::a);
/*     */     
/* 445 */     f = (Map<String, a>)Arrays.<a>stream(e).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*     */   }
/*     */   private static final Map<String, a> f; private final String g;
/*     */   
/*     */   a(String ☃) {
/* 450 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static a a(String ☃) {
/* 455 */     return f.get(☃.toLowerCase(Locale.ROOT));
/*     */   }
/*     */   
/*     */   public String b() {
/* 459 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 463 */     return (this == b);
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 467 */     return (this == a || this == c);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 472 */     return this.g;
/*     */   }
/*     */   
/*     */   public static a a(Random ☃) {
/* 476 */     return x.<a>a(e, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(@Nullable gc ☃) {
/* 481 */     return (☃ != null && ☃.n() == this);
/*     */   }
/*     */   
/*     */   public gc.c e() {
/* 485 */     switch (gc.null.b[ordinal()]) {
/*     */       case 1:
/*     */       case 3:
/* 488 */         return gc.c.a;
/*     */       case 2:
/* 490 */         return gc.c.b;
/*     */     } 
/* 492 */     throw new Error("Someone's been tampering with the universe!");
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 497 */     return this.g;
/*     */   }
/*     */   
/*     */   public abstract int a(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   public abstract double a(double paramDouble1, double paramDouble2, double paramDouble3);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gc$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */