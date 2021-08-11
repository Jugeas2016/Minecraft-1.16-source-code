/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bov
/*     */   implements boi
/*     */ {
/*     */   private final int a;
/*     */   private final int b;
/*     */   private final gj<bon> c;
/*     */   private final bmb d;
/*     */   private final vk e;
/*     */   private final String f;
/*     */   
/*     */   public bov(vk ☃, String str, int i, int j, gj<bon> gj1, bmb bmb1) {
/*  33 */     this.e = ☃;
/*  34 */     this.f = str;
/*  35 */     this.a = i;
/*  36 */     this.b = j;
/*  37 */     this.c = gj1;
/*  38 */     this.d = bmb1;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk f() {
/*  43 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> ag_() {
/*  48 */     return bos.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String d() {
/*  53 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb c() {
/*  58 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public gj<bon> a() {
/*  63 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/*  68 */     return (☃ >= this.a && i >= this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bio ☃, brx brx1) {
/*  73 */     for (int i = 0; i <= ☃.g() - this.a; i++) {
/*  74 */       for (int j = 0; j <= ☃.f() - this.b; j++) {
/*  75 */         if (a(☃, i, j, true)) {
/*  76 */           return true;
/*     */         }
/*  78 */         if (a(☃, i, j, false)) {
/*  79 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*  83 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(bio ☃, int i, int j, boolean bool) {
/*  87 */     for (int k = 0; k < ☃.g(); k++) {
/*  88 */       for (int m = 0; m < ☃.f(); m++) {
/*  89 */         int n = k - i;
/*  90 */         int i1 = m - j;
/*  91 */         bon bon = bon.a;
/*  92 */         if (n >= 0 && i1 >= 0 && n < this.a && i1 < this.b) {
/*  93 */           if (bool) {
/*  94 */             bon = this.c.get(this.a - n - 1 + i1 * this.a);
/*     */           } else {
/*  96 */             bon = this.c.get(n + i1 * this.a);
/*     */           } 
/*     */         }
/*  99 */         if (!bon.a(☃.a(k + m * ☃.g()))) {
/* 100 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 104 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bio ☃) {
/* 109 */     return c().i();
/*     */   }
/*     */   
/*     */   public int i() {
/* 113 */     return this.a;
/*     */   }
/*     */   
/*     */   public int j() {
/* 117 */     return this.b;
/*     */   }
/*     */   
/*     */   private static gj<bon> b(String[] ☃, Map<String, bon> map, int i, int j) {
/* 121 */     gj<bon> gj1 = gj.a(i * j, bon.a);
/* 122 */     Set<String> set = Sets.newHashSet(map.keySet());
/* 123 */     set.remove(" ");
/*     */     
/* 125 */     for (int k = 0; k < ☃.length; k++) {
/* 126 */       for (int m = 0; m < ☃[k].length(); m++) {
/* 127 */         String str = ☃[k].substring(m, m + 1);
/* 128 */         bon bon = map.get(str);
/* 129 */         if (bon == null) {
/* 130 */           throw new JsonSyntaxException("Pattern references symbol '" + str + "' but it's not defined in the key");
/*     */         }
/* 132 */         set.remove(str);
/* 133 */         gj1.set(m + i * k, bon);
/*     */       } 
/*     */     } 
/*     */     
/* 137 */     if (!set.isEmpty()) {
/* 138 */       throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + set);
/*     */     }
/*     */     
/* 141 */     return gj1;
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   static String[] a(String... ☃) {
/* 146 */     int i = Integer.MAX_VALUE;
/* 147 */     int j = 0;
/* 148 */     int k = 0;
/* 149 */     int m = 0;
/*     */     
/* 151 */     for (int n = 0; n < ☃.length; n++) {
/* 152 */       String str = ☃[n];
/*     */       
/* 154 */       i = Math.min(i, a(str));
/* 155 */       int i2 = b(str);
/* 156 */       j = Math.max(j, i2);
/*     */ 
/*     */       
/* 159 */       if (i2 < 0) {
/* 160 */         if (k == n) {
/* 161 */           k++;
/*     */         }
/* 163 */         m++;
/*     */       } else {
/* 165 */         m = 0;
/*     */       } 
/*     */     } 
/*     */     
/* 169 */     if (☃.length == m) {
/* 170 */       return new String[0];
/*     */     }
/* 172 */     String[] arrayOfString = new String[☃.length - m - k];
/* 173 */     for (int i1 = 0; i1 < arrayOfString.length; i1++) {
/* 174 */       arrayOfString[i1] = ☃[i1 + k].substring(i, j + 1);
/*     */     }
/*     */     
/* 177 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   private static int a(String ☃) {
/* 181 */     int i = 0;
/* 182 */     while (i < ☃.length() && ☃.charAt(i) == ' ') {
/* 183 */       i++;
/*     */     }
/*     */     
/* 186 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(String ☃) {
/* 190 */     int i = ☃.length() - 1;
/* 191 */     while (i >= 0 && ☃.charAt(i) == ' ') {
/* 192 */       i--;
/*     */     }
/*     */     
/* 195 */     return i;
/*     */   }
/*     */   
/*     */   private static String[] b(JsonArray ☃) {
/* 199 */     String[] arrayOfString = new String[☃.size()];
/* 200 */     if (arrayOfString.length > 3)
/* 201 */       throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum"); 
/* 202 */     if (arrayOfString.length == 0) {
/* 203 */       throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
/*     */     }
/* 205 */     for (int i = 0; i < arrayOfString.length; i++) {
/* 206 */       String str = afd.a(☃.get(i), "pattern[" + i + "]");
/* 207 */       if (str.length() > 3)
/* 208 */         throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum"); 
/* 209 */       if (i > 0 && arrayOfString[0].length() != str.length()) {
/* 210 */         throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
/*     */       }
/* 212 */       arrayOfString[i] = str;
/*     */     } 
/* 214 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   private static Map<String, bon> c(JsonObject ☃) {
/* 218 */     Map<String, bon> map = Maps.newHashMap();
/* 219 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)☃.entrySet()) {
/* 220 */       if (((String)entry.getKey()).length() != 1)
/* 221 */         throw new JsonSyntaxException("Invalid key entry: '" + (String)entry.getKey() + "' is an invalid symbol (must be 1 character only)."); 
/* 222 */       if (" ".equals(entry.getKey())) {
/* 223 */         throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
/*     */       }
/* 225 */       map.put(entry.getKey(), bon.a(entry.getValue()));
/*     */     } 
/* 227 */     map.put(" ", bon.a);
/* 228 */     return map;
/*     */   }
/*     */   
/*     */   public static bmb a(JsonObject ☃) {
/* 232 */     String str = afd.h(☃, "item");
/* 233 */     blx blx = (blx)gm.T.b(new vk(str)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + ☃ + "'"));
/* 234 */     if (☃.has("data")) {
/* 235 */       throw new JsonParseException("Disallowed data tag found");
/*     */     }
/* 237 */     int i = afd.a(☃, "count", 1);
/* 238 */     return new bmb(blx, i);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements bos<bov> {
/*     */     public bov b(vk ☃, JsonObject jsonObject) {
/* 244 */       String str = afd.a(jsonObject, "group", "");
/*     */       
/* 246 */       Map<String, bon> map = bov.b(afd.t(jsonObject, "key"));
/* 247 */       String[] arrayOfString = bov.a(bov.a(afd.u(jsonObject, "pattern")));
/*     */       
/* 249 */       int i = arrayOfString[0].length();
/* 250 */       int j = arrayOfString.length;
/*     */       
/* 252 */       gj<bon> gj = bov.a(arrayOfString, map, i, j);
/*     */       
/* 254 */       bmb bmb = bov.a(afd.t(jsonObject, "result"));
/*     */       
/* 256 */       return new bov(☃, str, i, j, gj, bmb);
/*     */     }
/*     */ 
/*     */     
/*     */     public bov b(vk ☃, nf nf1) {
/* 261 */       int i = nf1.i();
/* 262 */       int j = nf1.i();
/* 263 */       String str = nf1.e(32767);
/* 264 */       gj<bon> gj = gj.a(i * j, bon.a);
/* 265 */       for (int k = 0; k < gj.size(); k++) {
/* 266 */         gj.set(k, bon.b(nf1));
/*     */       }
/* 268 */       bmb bmb = nf1.n();
/* 269 */       return new bov(☃, str, i, j, gj, bmb);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(nf ☃, bov bov1) {
/* 274 */       ☃.d(bov.a(bov1));
/* 275 */       ☃.d(bov.b(bov1));
/* 276 */       ☃.a(bov.c(bov1));
/* 277 */       for (bon bon : bov.d(bov1)) {
/* 278 */         bon.a(☃);
/*     */       }
/* 280 */       ☃.a(bov.e(bov1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bov.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */