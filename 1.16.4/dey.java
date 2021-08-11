/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.annotation.Nullable;
/*     */ import org.lwjgl.glfw.GLFWVidMode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class dey
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   
/*     */   public dey(int ☃, int i, int j, int k, int m, int n) {
/*  21 */     this.a = ☃;
/*  22 */     this.b = i;
/*  23 */     this.c = j;
/*  24 */     this.d = k;
/*  25 */     this.e = m;
/*  26 */     this.f = n;
/*     */   }
/*     */   
/*     */   public dey(GLFWVidMode.Buffer ☃) {
/*  30 */     this.a = ☃.width();
/*  31 */     this.b = ☃.height();
/*  32 */     this.c = ☃.redBits();
/*  33 */     this.d = ☃.greenBits();
/*  34 */     this.e = ☃.blueBits();
/*  35 */     this.f = ☃.refreshRate();
/*     */   }
/*     */   
/*     */   public dey(GLFWVidMode ☃) {
/*  39 */     this.a = ☃.width();
/*  40 */     this.b = ☃.height();
/*  41 */     this.c = ☃.redBits();
/*  42 */     this.d = ☃.greenBits();
/*  43 */     this.e = ☃.blueBits();
/*  44 */     this.f = ☃.refreshRate();
/*     */   }
/*     */   
/*     */   public int a() {
/*  48 */     return this.a;
/*     */   }
/*     */   
/*     */   public int b() {
/*  52 */     return this.b;
/*     */   }
/*     */   
/*     */   public int c() {
/*  56 */     return this.c;
/*     */   }
/*     */   
/*     */   public int d() {
/*  60 */     return this.d;
/*     */   }
/*     */   
/*     */   public int e() {
/*  64 */     return this.e;
/*     */   }
/*     */   
/*     */   public int f() {
/*  68 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  73 */     if (this == ☃) {
/*  74 */       return true;
/*     */     }
/*  76 */     if (☃ == null || getClass() != ☃.getClass()) {
/*  77 */       return false;
/*     */     }
/*  79 */     dey dey1 = (dey)☃;
/*  80 */     return (this.a == dey1.a && this.b == dey1.b && this.c == dey1.c && this.d == dey1.d && this.e == dey1.e && this.f == dey1.f);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  91 */     return Objects.hash(new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f) });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  96 */     return String.format("%sx%s@%s (%sbit)", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.f), Integer.valueOf(this.c + this.d + this.e) });
/*     */   }
/*     */   
/*  99 */   private static final Pattern g = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");
/*     */   
/*     */   public static Optional<dey> a(@Nullable String ☃) {
/* 102 */     if (☃ == null) {
/* 103 */       return Optional.empty();
/*     */     }
/*     */     
/*     */     try {
/* 107 */       Matcher matcher = g.matcher(☃);
/* 108 */       if (matcher.matches()) {
/* 109 */         int k, m, i = Integer.parseInt(matcher.group(1));
/* 110 */         int j = Integer.parseInt(matcher.group(2));
/* 111 */         String str1 = matcher.group(3);
/*     */         
/* 113 */         if (str1 == null) {
/* 114 */           k = 60;
/*     */         } else {
/* 116 */           k = Integer.parseInt(str1);
/*     */         } 
/* 118 */         String str2 = matcher.group(4);
/*     */         
/* 120 */         if (str2 == null) {
/* 121 */           m = 24;
/*     */         } else {
/* 123 */           m = Integer.parseInt(str2);
/*     */         } 
/* 125 */         int n = m / 3;
/* 126 */         return Optional.of(new dey(i, j, n, n, n, k));
/*     */       } 
/* 128 */     } catch (Exception exception) {}
/*     */     
/* 130 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   public String g() {
/* 134 */     return String.format("%sx%s@%s:%s", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.f), Integer.valueOf(this.c + this.d + this.e) });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */