/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dmy
/*     */ {
/*     */   private final Supplier<String> a;
/*     */   private final Consumer<String> b;
/*     */   private final Supplier<String> c;
/*     */   private final Consumer<String> d;
/*     */   private final Predicate<String> e;
/*     */   private int f;
/*     */   private int g;
/*     */   
/*     */   public dmy(Supplier<String> ☃, Consumer<String> consumer1, Supplier<String> supplier1, Consumer<String> consumer2, Predicate<String> predicate) {
/*  29 */     this.a = ☃;
/*  30 */     this.b = consumer1;
/*  31 */     this.c = supplier1;
/*  32 */     this.d = consumer2;
/*  33 */     this.e = predicate;
/*     */     
/*  35 */     f();
/*     */   }
/*     */   
/*     */   public static Supplier<String> a(djz ☃) {
/*  39 */     return () -> b(☃);
/*     */   }
/*     */   
/*     */   public static String b(djz ☃) {
/*  43 */     return k.a(☃.m.a().replaceAll("\\r", ""));
/*     */   }
/*     */   
/*     */   public static Consumer<String> c(djz ☃) {
/*  47 */     return str -> a(☃, str);
/*     */   }
/*     */   
/*     */   public static void a(djz ☃, String str) {
/*  51 */     ☃.m.a(str);
/*     */   }
/*     */   
/*     */   public boolean a(char ☃) {
/*  55 */     if (w.a(☃)) {
/*  56 */       a(this.a.get(), Character.toString(☃));
/*     */     }
/*  58 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(int ☃) {
/*  62 */     if (dot.i(☃)) {
/*  63 */       d();
/*  64 */       return true;
/*  65 */     }  if (dot.h(☃)) {
/*  66 */       c();
/*  67 */       return true;
/*  68 */     }  if (dot.g(☃)) {
/*  69 */       b();
/*  70 */       return true;
/*  71 */     }  if (dot.f(☃)) {
/*  72 */       a();
/*  73 */       return true;
/*     */     } 
/*     */     
/*  76 */     if (☃ == 259) {
/*  77 */       d(-1);
/*  78 */       return true;
/*  79 */     }  if (☃ == 261)
/*  80 */     { d(1); }
/*  81 */     else { if (☃ == 263) {
/*  82 */         if (dot.x()) {
/*  83 */           b(-1, dot.y());
/*     */         } else {
/*  85 */           a(-1, dot.y());
/*     */         } 
/*  87 */         return true;
/*  88 */       }  if (☃ == 262) {
/*  89 */         if (dot.x()) {
/*  90 */           b(1, dot.y());
/*     */         } else {
/*  92 */           a(1, dot.y());
/*     */         } 
/*  94 */         return true;
/*  95 */       }  if (☃ == 268) {
/*  96 */         b(dot.y());
/*  97 */         return true;
/*  98 */       }  if (☃ == 269) {
/*  99 */         c(dot.y());
/* 100 */         return true;
/*     */       }  }
/* 102 */      return false;
/*     */   }
/*     */   
/*     */   private int g(int ☃) {
/* 106 */     return afm.a(☃, 0, ((String)this.a.get()).length());
/*     */   }
/*     */   
/*     */   private void a(String ☃, String str1) {
/* 110 */     if (this.g != this.f) {
/* 111 */       ☃ = c(☃);
/*     */     }
/*     */     
/* 114 */     this.f = afm.a(this.f, 0, ☃.length());
/* 115 */     String str = (new StringBuilder(☃)).insert(this.f, str1).toString();
/* 116 */     if (this.e.test(str)) {
/* 117 */       this.b.accept(str);
/* 118 */       this.g = this.f = Math.min(str.length(), this.f + str1.length());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 123 */     a(this.a.get(), ☃);
/*     */   }
/*     */   
/*     */   private void a(boolean ☃) {
/* 127 */     if (!☃) {
/* 128 */       this.g = this.f;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, boolean bool) {
/* 137 */     this.f = x.a(this.a.get(), this.f, ☃);
/* 138 */     a(bool);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(int ☃, boolean bool) {
/* 146 */     this.f = dkj.a(this.a.get(), ☃, this.f, true);
/* 147 */     a(bool);
/*     */   }
/*     */   
/*     */   public void d(int ☃) {
/* 151 */     String str = this.a.get();
/* 152 */     if (!str.isEmpty()) {
/*     */       String str1;
/* 154 */       if (this.g != this.f) {
/* 155 */         str1 = c(str);
/*     */       } else {
/* 157 */         int i = x.a(str, this.f, ☃);
/* 158 */         int j = Math.min(i, this.f);
/* 159 */         int k = Math.max(i, this.f);
/* 160 */         str1 = (new StringBuilder(str)).delete(j, k).toString();
/* 161 */         if (☃ < 0) {
/* 162 */           this.g = this.f = j;
/*     */         }
/*     */       } 
/* 165 */       this.b.accept(str1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a() {
/* 170 */     String ☃ = this.a.get();
/* 171 */     this.d.accept(b(☃));
/* 172 */     this.b.accept(c(☃));
/*     */   }
/*     */   
/*     */   public void b() {
/* 176 */     a(this.a.get(), this.c.get());
/* 177 */     this.g = this.f;
/*     */   }
/*     */   
/*     */   public void c() {
/* 181 */     this.d.accept(b(this.a.get()));
/*     */   }
/*     */   
/*     */   public void d() {
/* 185 */     this.g = 0;
/* 186 */     this.f = ((String)this.a.get()).length();
/*     */   }
/*     */   
/*     */   private String b(String ☃) {
/* 190 */     int i = Math.min(this.f, this.g);
/* 191 */     int j = Math.max(this.f, this.g);
/* 192 */     return ☃.substring(i, j);
/*     */   }
/*     */   
/*     */   private String c(String ☃) {
/* 196 */     if (this.g == this.f) {
/* 197 */       return ☃;
/*     */     }
/* 199 */     int i = Math.min(this.f, this.g);
/* 200 */     int j = Math.max(this.f, this.g);
/* 201 */     String str = ☃.substring(0, i) + ☃.substring(j);
/* 202 */     this.g = this.f = i;
/* 203 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void b(boolean ☃) {
/* 211 */     this.f = 0;
/* 212 */     a(☃);
/*     */   }
/*     */   
/*     */   public void f() {
/* 216 */     c(false);
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 220 */     this.f = ((String)this.a.get()).length();
/* 221 */     a(☃);
/*     */   }
/*     */   
/*     */   public int g() {
/* 225 */     return this.f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(int ☃, boolean bool) {
/* 233 */     this.f = g(☃);
/* 234 */     a(bool);
/*     */   }
/*     */   
/*     */   public int h() {
/* 238 */     return this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i) {
/* 246 */     int j = ((String)this.a.get()).length();
/* 247 */     this.f = afm.a(☃, 0, j);
/* 248 */     this.g = afm.a(i, 0, j);
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 252 */     return (this.f != this.g);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */