/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Pattern;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public enum k {
/*     */   private static final Map<String, k> w;
/*     */   private static final Pattern x;
/*     */   private final String y;
/*     */   private final char z;
/*  15 */   a("BLACK", '0', 0, Integer.valueOf(0)),
/*  16 */   b("DARK_BLUE", '1', 1, Integer.valueOf(170)),
/*  17 */   c("DARK_GREEN", '2', 2, Integer.valueOf(43520)),
/*  18 */   d("DARK_AQUA", '3', 3, Integer.valueOf(43690)),
/*  19 */   e("DARK_RED", '4', 4, Integer.valueOf(11141120)),
/*  20 */   f("DARK_PURPLE", '5', 5, Integer.valueOf(11141290)),
/*  21 */   g("GOLD", '6', 6, Integer.valueOf(16755200)),
/*  22 */   h("GRAY", '7', 7, Integer.valueOf(11184810)),
/*  23 */   i("DARK_GRAY", '8', 8, Integer.valueOf(5592405)),
/*  24 */   j("BLUE", '9', 9, Integer.valueOf(5592575)),
/*  25 */   k("GREEN", 'a', 10, Integer.valueOf(5635925)),
/*  26 */   l("AQUA", 'b', 11, Integer.valueOf(5636095)),
/*  27 */   m("RED", 'c', 12, Integer.valueOf(16733525)),
/*  28 */   n("LIGHT_PURPLE", 'd', 13, Integer.valueOf(16733695)),
/*  29 */   o("YELLOW", 'e', 14, Integer.valueOf(16777045)),
/*  30 */   p("WHITE", 'f', 15, Integer.valueOf(16777215)),
/*  31 */   q("OBFUSCATED", 'k', true),
/*  32 */   r("BOLD", 'l', true),
/*  33 */   s("STRIKETHROUGH", 'm', true),
/*  34 */   t("UNDERLINE", 'n', true),
/*  35 */   u("ITALIC", 'o', true),
/*  36 */   v("RESET", 'r', -1, null); private final boolean A; private final String B;
/*     */   
/*     */   static {
/*  39 */     w = (Map<String, k>)Arrays.<k>stream(values()).collect(Collectors.toMap(☃ -> c(☃.y), ☃ -> ☃));
/*  40 */     x = Pattern.compile("(?i)§[0-9A-FK-OR]");
/*     */   } private final int C; @Nullable
/*     */   private final Integer D; private static String c(String ☃) {
/*  43 */     return ☃.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
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
/*     */ 
/*     */ 
/*     */   
/*     */   k(String ☃, char c, boolean bool, int i, @Nullable Integer integer) {
/*  63 */     this.y = ☃;
/*  64 */     this.z = c;
/*  65 */     this.A = bool;
/*  66 */     this.C = i;
/*  67 */     this.D = integer;
/*     */     
/*  69 */     this.B = "§" + c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int b() {
/*  77 */     return this.C;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  81 */     return this.A;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  85 */     return (!this.A && this != v);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Integer e() {
/*  90 */     return this.D;
/*     */   }
/*     */   
/*     */   public String f() {
/*  94 */     return name().toLowerCase(Locale.ROOT);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  99 */     return this.B;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static String a(@Nullable String ☃) {
/* 104 */     return (☃ == null) ? null : x.matcher(☃).replaceAll("");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static k b(@Nullable String ☃) {
/* 109 */     if (☃ == null) {
/* 110 */       return null;
/*     */     }
/* 112 */     return w.get(c(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static k a(int ☃) {
/* 117 */     if (☃ < 0) {
/* 118 */       return v;
/*     */     }
/* 120 */     for (k k1 : values()) {
/* 121 */       if (k1.b() == ☃) {
/* 122 */         return k1;
/*     */       }
/*     */     } 
/* 125 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static k a(char ☃) {
/* 130 */     char c = Character.toString(☃).toLowerCase(Locale.ROOT).charAt(0);
/* 131 */     for (k k1 : values()) {
/* 132 */       if (k1.z == c) {
/* 133 */         return k1;
/*     */       }
/*     */     } 
/* 136 */     return null;
/*     */   }
/*     */   
/*     */   public static Collection<String> a(boolean ☃, boolean bool1) {
/* 140 */     List<String> list = Lists.newArrayList();
/*     */     
/* 142 */     for (k k1 : values()) {
/* 143 */       if (!k1.d() || ☃)
/*     */       {
/*     */         
/* 146 */         if (!k1.c() || bool1)
/*     */         {
/*     */           
/* 149 */           list.add(k1.f()); } 
/*     */       }
/*     */     } 
/* 152 */     return list;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */