/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Objects;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ob
/*     */ {
/*  21 */   public static final ob a = new ob(null, null, null, null, null, null, null, null, null, null);
/*     */   
/*  23 */   public static final vk b = new vk("minecraft", "default");
/*     */   
/*     */   @Nullable
/*     */   private final od c;
/*     */   @Nullable
/*     */   private final Boolean d;
/*     */   @Nullable
/*     */   private final Boolean e;
/*     */   @Nullable
/*     */   private final Boolean f;
/*     */   @Nullable
/*     */   private final Boolean g;
/*     */   @Nullable
/*     */   private final Boolean h;
/*     */   @Nullable
/*     */   private final np i;
/*     */   @Nullable
/*     */   private final nv j;
/*     */   @Nullable
/*     */   private final String k;
/*     */   @Nullable
/*     */   private final vk l;
/*     */   
/*     */   private ob(@Nullable od ☃, @Nullable Boolean bool1, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable np np1, @Nullable nv nv1, @Nullable String str, @Nullable vk vk1) {
/*  47 */     this.c = ☃;
/*  48 */     this.d = bool1;
/*  49 */     this.e = bool2;
/*  50 */     this.f = bool3;
/*  51 */     this.g = bool4;
/*  52 */     this.h = bool5;
/*  53 */     this.i = np1;
/*  54 */     this.j = nv1;
/*  55 */     this.k = str;
/*  56 */     this.l = vk1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public od a() {
/*  61 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  65 */     return (this.d == Boolean.TRUE);
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  69 */     return (this.e == Boolean.TRUE);
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  73 */     return (this.g == Boolean.TRUE);
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  77 */     return (this.f == Boolean.TRUE);
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  81 */     return (this.h == Boolean.TRUE);
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  85 */     return (this == a);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public np h() {
/*  90 */     return this.i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public nv i() {
/*  95 */     return this.j;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String j() {
/* 100 */     return this.k;
/*     */   }
/*     */   
/*     */   public vk k() {
/* 104 */     return (this.l != null) ? this.l : b;
/*     */   }
/*     */   
/*     */   public ob a(@Nullable od ☃) {
/* 108 */     return new ob(☃, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
/*     */   }
/*     */   
/*     */   public ob a(@Nullable k ☃) {
/* 112 */     return a((☃ != null) ? od.a(☃) : null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ob a(@Nullable Boolean ☃) {
/* 120 */     return new ob(this.c, ☃, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
/*     */   }
/*     */   
/*     */   public ob b(@Nullable Boolean ☃) {
/* 124 */     return new ob(this.c, this.d, ☃, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
/*     */   }
/*     */   
/*     */   public ob c(@Nullable Boolean ☃) {
/* 128 */     return new ob(this.c, this.d, this.e, ☃, this.g, this.h, this.i, this.j, this.k, this.l);
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
/*     */   public ob a(@Nullable np ☃) {
/* 140 */     return new ob(this.c, this.d, this.e, this.f, this.g, this.h, ☃, this.j, this.k, this.l);
/*     */   }
/*     */   
/*     */   public ob a(@Nullable nv ☃) {
/* 144 */     return new ob(this.c, this.d, this.e, this.f, this.g, this.h, this.i, ☃, this.k, this.l);
/*     */   }
/*     */   
/*     */   public ob a(@Nullable String ☃) {
/* 148 */     return new ob(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ☃, this.l);
/*     */   }
/*     */   
/*     */   public ob a(@Nullable vk ☃) {
/* 152 */     return new ob(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, ☃);
/*     */   }
/*     */   
/*     */   public ob b(k ☃) {
/* 156 */     od od1 = this.c;
/* 157 */     Boolean bool1 = this.d;
/* 158 */     Boolean bool2 = this.e;
/* 159 */     Boolean bool3 = this.g;
/* 160 */     Boolean bool4 = this.f;
/* 161 */     Boolean bool5 = this.h;
/*     */     
/* 163 */     switch (null.a[☃.ordinal()])
/*     */     { case 1:
/* 165 */         bool5 = Boolean.valueOf(true);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 185 */         return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 2: bool1 = Boolean.valueOf(true); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 3: bool3 = Boolean.valueOf(true); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 4: bool4 = Boolean.valueOf(true); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 5: bool2 = Boolean.valueOf(true); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 6: return a; }  od1 = od.a(☃); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);
/*     */   }
/*     */   
/*     */   public ob c(k ☃) {
/* 189 */     od od1 = this.c;
/* 190 */     Boolean bool1 = this.d;
/* 191 */     Boolean bool2 = this.e;
/* 192 */     Boolean bool3 = this.g;
/* 193 */     Boolean bool4 = this.f;
/* 194 */     Boolean bool5 = this.h;
/*     */     
/* 196 */     switch (null.a[☃.ordinal()])
/*     */     { case 1:
/* 198 */         bool5 = Boolean.valueOf(true);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 224 */         return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 2: bool1 = Boolean.valueOf(true); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 3: bool3 = Boolean.valueOf(true); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 4: bool4 = Boolean.valueOf(true); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 5: bool2 = Boolean.valueOf(true); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);case 6: return a; }  bool5 = Boolean.valueOf(false); bool1 = Boolean.valueOf(false); bool3 = Boolean.valueOf(false); bool4 = Boolean.valueOf(false); bool2 = Boolean.valueOf(false); od1 = od.a(☃); return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);
/*     */   }
/*     */   
/*     */   public ob a(k... ☃) {
/* 228 */     od od1 = this.c;
/* 229 */     Boolean bool1 = this.d;
/* 230 */     Boolean bool2 = this.e;
/* 231 */     Boolean bool3 = this.g;
/* 232 */     Boolean bool4 = this.f;
/* 233 */     Boolean bool5 = this.h;
/*     */     
/* 235 */     for (k k1 : ☃) {
/* 236 */       switch (null.a[k1.ordinal()]) {
/*     */         case 1:
/* 238 */           bool5 = Boolean.valueOf(true);
/*     */           break;
/*     */         case 2:
/* 241 */           bool1 = Boolean.valueOf(true);
/*     */           break;
/*     */         case 3:
/* 244 */           bool3 = Boolean.valueOf(true);
/*     */           break;
/*     */         case 4:
/* 247 */           bool4 = Boolean.valueOf(true);
/*     */           break;
/*     */         case 5:
/* 250 */           bool2 = Boolean.valueOf(true);
/*     */           break;
/*     */         case 6:
/* 253 */           return a;
/*     */         default:
/* 255 */           od1 = od.a(k1);
/*     */           break;
/*     */       } 
/*     */     } 
/* 259 */     return new ob(od1, bool1, bool2, bool4, bool3, bool5, this.i, this.j, this.k, this.l);
/*     */   }
/*     */   
/*     */   public ob a(ob ☃) {
/* 263 */     if (this == a) {
/* 264 */       return ☃;
/*     */     }
/*     */     
/* 267 */     if (☃ == a) {
/* 268 */       return this;
/*     */     }
/*     */     
/* 271 */     return new ob((this.c != null) ? this.c : ☃.c, (this.d != null) ? this.d : ☃.d, (this.e != null) ? this.e : ☃.e, (this.f != null) ? this.f : ☃.f, (this.g != null) ? this.g : ☃.g, (this.h != null) ? this.h : ☃.h, (this.i != null) ? this.i : ☃.i, (this.j != null) ? this.j : ☃.j, (this.k != null) ? this.k : ☃.k, (this.l != null) ? this.l : ☃.l);
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
/*     */   public String toString() {
/* 287 */     return "Style{ color=" + this.c + ", bold=" + this.d + ", italic=" + this.e + ", underlined=" + this.f + ", strikethrough=" + this.g + ", obfuscated=" + this.h + ", clickEvent=" + 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 294 */       h() + ", hoverEvent=" + 
/* 295 */       i() + ", insertion=" + 
/* 296 */       j() + ", font=" + 
/* 297 */       k() + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 303 */     if (this == ☃) {
/* 304 */       return true;
/*     */     }
/* 306 */     if (☃ instanceof ob) {
/* 307 */       ob ob1 = (ob)☃;
/*     */       
/* 309 */       return (b() == ob1.b() && 
/* 310 */         Objects.equals(a(), ob1.a()) && 
/* 311 */         c() == ob1.c() && 
/* 312 */         f() == ob1.f() && 
/* 313 */         d() == ob1.d() && 
/* 314 */         e() == ob1.e() && 
/* 315 */         Objects.equals(h(), ob1.h()) && 
/* 316 */         Objects.equals(i(), ob1.i()) && 
/* 317 */         Objects.equals(j(), ob1.j()) && 
/* 318 */         Objects.equals(k(), ob1.k()));
/*     */     } 
/*     */ 
/*     */     
/* 322 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 327 */     return Objects.hash(new Object[] { this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k });
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<ob>, JsonSerializer<ob> {
/*     */     @Nullable
/*     */     public ob a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 334 */       if (☃.isJsonObject()) {
/* 335 */         JsonObject jsonObject = ☃.getAsJsonObject();
/* 336 */         if (jsonObject == null) {
/* 337 */           return null;
/*     */         }
/*     */         
/* 340 */         Boolean bool1 = a(jsonObject, "bold");
/* 341 */         Boolean bool2 = a(jsonObject, "italic");
/* 342 */         Boolean bool3 = a(jsonObject, "underlined");
/* 343 */         Boolean bool4 = a(jsonObject, "strikethrough");
/* 344 */         Boolean bool5 = a(jsonObject, "obfuscated");
/* 345 */         od od = e(jsonObject);
/* 346 */         String str = d(jsonObject);
/* 347 */         np np = c(jsonObject);
/* 348 */         nv nv = b(jsonObject);
/* 349 */         vk vk = a(jsonObject);
/*     */         
/* 351 */         return new ob(od, bool1, bool2, bool3, bool4, bool5, np, nv, str, vk);
/*     */       } 
/*     */       
/* 354 */       return null;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static vk a(JsonObject ☃) {
/* 359 */       if (☃.has("font")) {
/* 360 */         String str = afd.h(☃, "font");
/*     */         try {
/* 362 */           return new vk(str);
/* 363 */         } catch (v v) {
/* 364 */           throw new JsonSyntaxException("Invalid font name: " + str);
/*     */         } 
/*     */       } 
/* 367 */       return null;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static nv b(JsonObject ☃) {
/* 372 */       if (☃.has("hoverEvent")) {
/* 373 */         JsonObject jsonObject = afd.t(☃, "hoverEvent");
/* 374 */         nv nv = nv.a(jsonObject);
/* 375 */         if (nv != null && nv.a().a()) {
/* 376 */           return nv;
/*     */         }
/*     */       } 
/* 379 */       return null;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static np c(JsonObject ☃) {
/* 384 */       if (☃.has("clickEvent")) {
/* 385 */         JsonObject jsonObject = afd.t(☃, "clickEvent");
/* 386 */         String str1 = afd.a(jsonObject, "action", (String)null);
/* 387 */         np.a a1 = (str1 == null) ? null : np.a.a(str1);
/*     */         
/* 389 */         String str2 = afd.a(jsonObject, "value", (String)null);
/*     */         
/* 391 */         if (a1 != null && str2 != null && a1.a()) {
/* 392 */           return new np(a1, str2);
/*     */         }
/*     */       } 
/* 395 */       return null;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static String d(JsonObject ☃) {
/* 400 */       return afd.a(☃, "insertion", (String)null);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static od e(JsonObject ☃) {
/* 405 */       if (☃.has("color")) {
/* 406 */         String str = afd.h(☃, "color");
/* 407 */         return od.a(str);
/*     */       } 
/* 409 */       return null;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static Boolean a(JsonObject ☃, String str) {
/* 414 */       if (☃.has(str)) {
/* 415 */         return Boolean.valueOf(☃.get(str).getAsBoolean());
/*     */       }
/*     */       
/* 418 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonElement a(ob ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 424 */       if (☃.g()) {
/* 425 */         return null;
/*     */       }
/* 427 */       JsonObject jsonObject = new JsonObject();
/*     */       
/* 429 */       if (ob.b(☃) != null) {
/* 430 */         jsonObject.addProperty("bold", ob.b(☃));
/*     */       }
/* 432 */       if (ob.c(☃) != null) {
/* 433 */         jsonObject.addProperty("italic", ob.c(☃));
/*     */       }
/* 435 */       if (ob.d(☃) != null) {
/* 436 */         jsonObject.addProperty("underlined", ob.d(☃));
/*     */       }
/* 438 */       if (ob.e(☃) != null)
/*     */       {
/* 440 */         jsonObject.addProperty("strikethrough", ob.e(☃));
/*     */       }
/* 442 */       if (ob.f(☃) != null) {
/* 443 */         jsonObject.addProperty("obfuscated", ob.f(☃));
/*     */       }
/* 445 */       if (ob.g(☃) != null) {
/* 446 */         jsonObject.addProperty("color", ob.g(☃).b());
/*     */       }
/* 448 */       if (ob.h(☃) != null) {
/* 449 */         jsonObject.add("insertion", jsonSerializationContext.serialize(ob.h(☃)));
/*     */       }
/*     */       
/* 452 */       if (ob.i(☃) != null) {
/* 453 */         JsonObject jsonObject1 = new JsonObject();
/* 454 */         jsonObject1.addProperty("action", ob.i(☃).a().b());
/* 455 */         jsonObject1.addProperty("value", ob.i(☃).b());
/* 456 */         jsonObject.add("clickEvent", (JsonElement)jsonObject1);
/*     */       } 
/*     */       
/* 459 */       if (ob.j(☃) != null) {
/* 460 */         jsonObject.add("hoverEvent", (JsonElement)ob.j(☃).b());
/*     */       }
/*     */       
/* 463 */       if (ob.k(☃) != null) {
/* 464 */         jsonObject.addProperty("font", ob.k(☃).toString());
/*     */       }
/*     */       
/* 467 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */