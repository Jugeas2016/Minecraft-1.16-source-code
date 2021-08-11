/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class y
/*     */ {
/*     */   private final y a;
/*     */   private final ah b;
/*     */   private final ab c;
/*     */   private final vk d;
/*     */   private final Map<String, ad> e;
/*     */   private final String[][] f;
/*  37 */   private final Set<y> g = Sets.newLinkedHashSet();
/*     */   private final nr h;
/*     */   
/*     */   public y(vk ☃, @Nullable y y1, @Nullable ah ah1, ab ab1, Map<String, ad> map, String[][] arrayOfString) {
/*  41 */     this.d = ☃;
/*  42 */     this.b = ah1;
/*  43 */     this.e = (Map<String, ad>)ImmutableMap.copyOf(map);
/*  44 */     this.a = y1;
/*  45 */     this.c = ab1;
/*  46 */     this.f = arrayOfString;
/*  47 */     if (y1 != null) {
/*  48 */       y1.a(this);
/*     */     }
/*     */     
/*  51 */     if (ah1 == null) {
/*  52 */       this.h = new oe(☃.toString());
/*     */     } else {
/*  54 */       nr nr1 = ah1.a();
/*  55 */       k k = ah1.e().c();
/*     */       
/*  57 */       nr nr2 = ns.a(nr1.e(), ob.a.a(k)).c("\n").a(ah1.b());
/*  58 */       nr nr3 = nr1.e().a(ob1 -> ob1.a(new nv((nv.a)nv.a.a, (T)☃)));
/*     */       
/*  60 */       this.h = ns.a(nr3).a(k);
/*     */     } 
/*     */   }
/*     */   
/*     */   public a a() {
/*  65 */     return new a((this.a == null) ? null : this.a.h(), this.b, this.c, this.e, this.f);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public y b() {
/*  70 */     return this.a;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ah c() {
/*  75 */     return this.b;
/*     */   }
/*     */   
/*     */   public ab d() {
/*  79 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  84 */     return "SimpleAdvancement{id=" + 
/*  85 */       h() + ", parent=" + ((this.a == null) ? "null" : (String)this.a
/*  86 */       .h()) + ", display=" + this.b + ", rewards=" + this.c + ", criteria=" + this.e + ", requirements=" + 
/*     */ 
/*     */ 
/*     */       
/*  90 */       Arrays.deepToString((Object[])this.f) + '}';
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<y> e() {
/*  95 */     return this.g;
/*     */   }
/*     */   
/*     */   public Map<String, ad> f() {
/*  99 */     return this.e;
/*     */   }
/*     */   
/*     */   public int g() {
/* 103 */     return this.f.length;
/*     */   }
/*     */   
/*     */   public void a(y ☃) {
/* 107 */     this.g.add(☃);
/*     */   }
/*     */   
/*     */   public vk h() {
/* 111 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 116 */     if (this == ☃) {
/* 117 */       return true;
/*     */     }
/* 119 */     if (!(☃ instanceof y)) {
/* 120 */       return false;
/*     */     }
/* 122 */     y y1 = (y)☃;
/* 123 */     return this.d.equals(y1.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 128 */     return this.d.hashCode();
/*     */   }
/*     */   
/*     */   public String[][] i() {
/* 132 */     return this.f;
/*     */   }
/*     */   
/*     */   public nr j() {
/* 136 */     return this.h;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private vk a;
/*     */     private y b;
/*     */     private ah c;
/* 143 */     private ab d = ab.a;
/* 144 */     private Map<String, ad> e = Maps.newLinkedHashMap();
/*     */     private String[][] f;
/* 146 */     private aj g = aj.a;
/*     */     
/*     */     private a(@Nullable vk ☃, @Nullable ah ah1, ab ab1, Map<String, ad> map, String[][] arrayOfString) {
/* 149 */       this.a = ☃;
/* 150 */       this.c = ah1;
/* 151 */       this.d = ab1;
/* 152 */       this.e = map;
/* 153 */       this.f = arrayOfString;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a a() {
/* 160 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(y ☃) {
/* 164 */       this.b = ☃;
/* 165 */       return this;
/*     */     }
/*     */     
/*     */     public a a(vk ☃) {
/* 169 */       this.a = ☃;
/* 170 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bmb ☃, nr nr1, nr nr2, @Nullable vk vk1, ai ai1, boolean bool1, boolean bool2, boolean bool3) {
/* 174 */       return a(new ah(☃, nr1, nr2, vk1, ai1, bool1, bool2, bool3));
/*     */     }
/*     */     
/*     */     public a a(brw ☃, nr nr1, nr nr2, @Nullable vk vk1, ai ai1, boolean bool1, boolean bool2, boolean bool3) {
/* 178 */       return a(new ah(new bmb(☃.h()), nr1, nr2, vk1, ai1, bool1, bool2, bool3));
/*     */     }
/*     */     
/*     */     public a a(ah ☃) {
/* 182 */       this.c = ☃;
/* 183 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ab.a ☃) {
/* 187 */       return a(☃.a());
/*     */     }
/*     */     
/*     */     public a a(ab ☃) {
/* 191 */       this.d = ☃;
/* 192 */       return this;
/*     */     }
/*     */     
/*     */     public a a(String ☃, ag ag1) {
/* 196 */       return a(☃, new ad(ag1));
/*     */     }
/*     */     
/*     */     public a a(String ☃, ad ad1) {
/* 200 */       if (this.e.containsKey(☃)) {
/* 201 */         throw new IllegalArgumentException("Duplicate criterion " + ☃);
/*     */       }
/* 203 */       this.e.put(☃, ad1);
/* 204 */       return this;
/*     */     }
/*     */     
/*     */     public a a(aj ☃) {
/* 208 */       this.g = ☃;
/* 209 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(Function<vk, y> ☃) {
/* 218 */       if (this.a == null)
/* 219 */         return true; 
/* 220 */       if (this.b == null) {
/* 221 */         this.b = ☃.apply(this.a);
/*     */       }
/* 223 */       return (this.b != null);
/*     */     }
/*     */     
/*     */     public y b(vk ☃) {
/* 227 */       if (!a(☃ -> null)) {
/* 228 */         throw new IllegalStateException("Tried to build incomplete advancement!");
/*     */       }
/* 230 */       if (this.f == null) {
/* 231 */         this.f = this.g.createRequirements(this.e.keySet());
/*     */       }
/* 233 */       return new y(☃, this.b, this.c, this.d, this.e, this.f);
/*     */     }
/*     */     
/*     */     public y a(Consumer<y> ☃, String str) {
/* 237 */       y y1 = b(new vk(str));
/* 238 */       ☃.accept(y1);
/* 239 */       return y1;
/*     */     }
/*     */     
/*     */     public JsonObject b() {
/* 243 */       if (this.f == null) {
/* 244 */         this.f = this.g.createRequirements(this.e.keySet());
/*     */       }
/*     */       
/* 247 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 249 */       if (this.b != null) {
/* 250 */         ☃.addProperty("parent", this.b.h().toString());
/* 251 */       } else if (this.a != null) {
/* 252 */         ☃.addProperty("parent", this.a.toString());
/*     */       } 
/*     */       
/* 255 */       if (this.c != null) {
/* 256 */         ☃.add("display", this.c.k());
/*     */       }
/*     */       
/* 259 */       ☃.add("rewards", this.d.b());
/*     */       
/* 261 */       JsonObject jsonObject1 = new JsonObject();
/* 262 */       for (Map.Entry<String, ad> entry : this.e.entrySet()) {
/* 263 */         jsonObject1.add(entry.getKey(), ((ad)entry.getValue()).b());
/*     */       }
/* 265 */       ☃.add("criteria", (JsonElement)jsonObject1);
/*     */       
/* 267 */       JsonArray jsonArray = new JsonArray();
/* 268 */       for (String[] arrayOfString : this.f) {
/* 269 */         JsonArray jsonArray1 = new JsonArray();
/* 270 */         for (String str : arrayOfString) {
/* 271 */           jsonArray1.add(str);
/*     */         }
/* 273 */         jsonArray.add((JsonElement)jsonArray1);
/*     */       } 
/* 275 */       ☃.add("requirements", (JsonElement)jsonArray);
/*     */       
/* 277 */       return ☃;
/*     */     }
/*     */     
/*     */     public void a(nf ☃) {
/* 281 */       if (this.a == null) {
/* 282 */         ☃.writeBoolean(false);
/*     */       } else {
/* 284 */         ☃.writeBoolean(true);
/* 285 */         ☃.a(this.a);
/*     */       } 
/* 287 */       if (this.c == null) {
/* 288 */         ☃.writeBoolean(false);
/*     */       } else {
/* 290 */         ☃.writeBoolean(true);
/* 291 */         this.c.a(☃);
/*     */       } 
/* 293 */       ad.a(this.e, ☃);
/* 294 */       ☃.d(this.f.length);
/* 295 */       for (String[] arrayOfString : this.f) {
/* 296 */         ☃.d(arrayOfString.length);
/* 297 */         for (String str : arrayOfString) {
/* 298 */           ☃.a(str);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 305 */       return "Task Advancement{parentId=" + this.a + ", display=" + this.c + ", rewards=" + this.d + ", criteria=" + this.e + ", requirements=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 310 */         Arrays.deepToString((Object[])this.f) + '}';
/*     */     }
/*     */ 
/*     */     
/*     */     public static a a(JsonObject ☃, ax ax1) {
/* 315 */       vk vk1 = ☃.has("parent") ? new vk(afd.h(☃, "parent")) : null;
/* 316 */       ah ah1 = ☃.has("display") ? ah.a(afd.t(☃, "display")) : null;
/* 317 */       ab ab1 = ☃.has("rewards") ? ab.a(afd.t(☃, "rewards")) : ab.a;
/* 318 */       Map<String, ad> map = ad.b(afd.t(☃, "criteria"), ax1);
/* 319 */       if (map.isEmpty()) {
/* 320 */         throw new JsonSyntaxException("Advancement criteria cannot be empty");
/*     */       }
/* 322 */       JsonArray jsonArray = afd.a(☃, "requirements", new JsonArray());
/* 323 */       String[][] arrayOfString = new String[jsonArray.size()][]; int i;
/* 324 */       for (i = 0; i < jsonArray.size(); i++) {
/* 325 */         JsonArray jsonArray1 = afd.n(jsonArray.get(i), "requirements[" + i + "]");
/* 326 */         arrayOfString[i] = new String[jsonArray1.size()];
/* 327 */         for (int j = 0; j < jsonArray1.size(); j++) {
/* 328 */           arrayOfString[i][j] = afd.a(jsonArray1.get(j), "requirements[" + i + "][" + j + "]");
/*     */         }
/*     */       } 
/* 331 */       if (arrayOfString.length == 0) {
/* 332 */         arrayOfString = new String[map.size()][];
/* 333 */         i = 0;
/* 334 */         for (String str : map.keySet()) {
/* 335 */           (new String[1])[0] = str; arrayOfString[i++] = new String[1];
/*     */         } 
/*     */       } 
/* 338 */       for (String[] arrayOfString1 : arrayOfString) {
/* 339 */         if (arrayOfString1.length == 0 && map.isEmpty()) {
/* 340 */           throw new JsonSyntaxException("Requirement entry cannot be empty");
/*     */         }
/* 342 */         for (String str : arrayOfString1) {
/* 343 */           if (!map.containsKey(str)) {
/* 344 */             throw new JsonSyntaxException("Unknown required criterion '" + str + "'");
/*     */           }
/*     */         } 
/*     */       } 
/* 348 */       for (String str : map.keySet()) {
/* 349 */         boolean bool = false;
/* 350 */         for (String[] arrayOfString1 : arrayOfString) {
/* 351 */           if (ArrayUtils.contains((Object[])arrayOfString1, str)) {
/* 352 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 356 */         if (!bool) {
/* 357 */           throw new JsonSyntaxException("Criterion '" + str + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required.");
/*     */         }
/*     */       } 
/* 360 */       return new a(vk1, ah1, ab1, map, arrayOfString);
/*     */     }
/*     */     
/*     */     public static a b(nf ☃) {
/* 364 */       vk vk1 = ☃.readBoolean() ? ☃.p() : null;
/* 365 */       ah ah1 = ☃.readBoolean() ? ah.b(☃) : null;
/* 366 */       Map<String, ad> map = ad.c(☃);
/* 367 */       String[][] arrayOfString = new String[☃.i()][];
/* 368 */       for (int i = 0; i < arrayOfString.length; i++) {
/* 369 */         arrayOfString[i] = new String[☃.i()];
/* 370 */         for (int j = 0; j < (arrayOfString[i]).length; j++) {
/* 371 */           arrayOfString[i][j] = ☃.e(32767);
/*     */         }
/*     */       } 
/* 374 */       return new a(vk1, ah1, ab.a, map, arrayOfString);
/*     */     }
/*     */     
/*     */     public Map<String, ad> c() {
/* 378 */       return this.e;
/*     */     }
/*     */     
/*     */     private a() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */