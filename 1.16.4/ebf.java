/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.base.Joiner;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.io.Reader;
/*     */ import java.io.StringReader;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebf
/*     */   implements ely
/*     */ {
/*  48 */   private static final Logger f = LogManager.getLogger();
/*     */   
/*  50 */   private static final ebh g = new ebh();
/*     */   
/*     */   @VisibleForTesting
/*  53 */   static final Gson a = (new GsonBuilder())
/*  54 */     .registerTypeAdapter(ebf.class, new a())
/*  55 */     .registerTypeAdapter(ebb.class, new ebb.a())
/*  56 */     .registerTypeAdapter(ebc.class, new ebc.a())
/*  57 */     .registerTypeAdapter(ebe.class, new ebe.a())
/*  58 */     .registerTypeAdapter(ebl.class, new ebl.a())
/*  59 */     .registerTypeAdapter(ebm.class, new ebm.a())
/*  60 */     .registerTypeAdapter(ebj.class, new ebj.a())
/*  61 */     .create();
/*     */   
/*     */   private final List<ebb> h;
/*     */   
/*     */   @Nullable
/*     */   private final b i;
/*     */   
/*     */   private final boolean j;
/*     */   
/*     */   private final ebm k;
/*     */   private final List<ebj> l;
/*  72 */   public String b = "";
/*     */   
/*     */   @VisibleForTesting
/*     */   protected final Map<String, Either<elr, String>> c;
/*     */   
/*     */   @Nullable
/*     */   protected ebf d;
/*     */   @Nullable
/*     */   protected vk e;
/*     */   
/*     */   public static ebf a(Reader ☃) {
/*  83 */     return afd.<ebf>a(a, ☃, ebf.class);
/*     */   }
/*     */   
/*     */   public static ebf a(String ☃) {
/*  87 */     return a(new StringReader(☃));
/*     */   }
/*     */   
/*     */   public ebf(@Nullable vk ☃, List<ebb> list, Map<String, Either<elr, String>> map, boolean bool, @Nullable b b1, ebm ebm1, List<ebj> list1) {
/*  91 */     this.h = list;
/*  92 */     this.j = bool;
/*  93 */     this.i = b1;
/*  94 */     this.c = map;
/*  95 */     this.e = ☃;
/*  96 */     this.k = ebm1;
/*  97 */     this.l = list1;
/*     */   }
/*     */   
/*     */   public List<ebb> a() {
/* 101 */     if (this.h.isEmpty() && this.d != null) {
/* 102 */       return this.d.a();
/*     */     }
/*     */     
/* 105 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 109 */     if (this.d != null) {
/* 110 */       return this.d.b();
/*     */     }
/* 112 */     return this.j;
/*     */   }
/*     */   
/*     */   public b c() {
/* 116 */     if (this.i != null) {
/* 117 */       return this.i;
/*     */     }
/* 119 */     if (this.d != null) {
/* 120 */       return this.d.c();
/*     */     }
/* 122 */     return b.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<ebj> e() {
/* 130 */     return this.l;
/*     */   }
/*     */   
/*     */   private ebk a(els ☃, ebf ebf1) {
/* 134 */     if (this.l.isEmpty()) {
/* 135 */       return ebk.a;
/*     */     }
/* 137 */     return new ebk(☃, ebf1, ☃::a, this.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> f() {
/* 142 */     Set<vk> ☃ = Sets.newHashSet();
/* 143 */     for (ebj ebj : this.l) {
/* 144 */       ☃.add(ebj.a());
/*     */     }
/*     */     
/* 147 */     if (this.e != null) {
/* 148 */       ☃.add(this.e);
/*     */     }
/* 150 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<elr> a(Function<vk, ely> ☃, Set<Pair<String, String>> set) {
/* 155 */     Set<ely> set1 = Sets.newLinkedHashSet();
/*     */     
/* 157 */     ebf ebf1 = this;
/*     */     
/* 159 */     while (ebf1.e != null && ebf1.d == null) {
/* 160 */       set1.add(ebf1);
/* 161 */       ely ely1 = ☃.apply(ebf1.e);
/*     */       
/* 163 */       if (ely1 == null) {
/* 164 */         f.warn("No parent '{}' while loading model '{}'", this.e, ebf1);
/*     */       }
/*     */       
/* 167 */       if (set1.contains(ely1)) {
/* 168 */         f.warn("Found 'parent' loop while loading model '{}' in chain: {} -> {}", ebf1, set1.stream().map(Object::toString).collect(Collectors.joining(" -> ")), this.e);
/* 169 */         ely1 = null;
/*     */       } 
/*     */       
/* 172 */       if (ely1 == null) {
/* 173 */         ebf1.e = els.l;
/* 174 */         ely1 = ☃.apply(ebf1.e);
/*     */       } 
/*     */       
/* 177 */       if (ely1 instanceof ebf) {
/* 178 */         ebf1.d = (ebf)ely1;
/*     */       } else {
/* 180 */         throw new IllegalStateException("BlockModel parent has to be a block model.");
/*     */       } 
/*     */       
/* 183 */       ebf1 = ebf1.d;
/*     */     } 
/*     */     
/* 186 */     Set<elr> set2 = Sets.newHashSet((Object[])new elr[] { c("particle") });
/*     */     
/* 188 */     for (ebb ebb : a()) {
/* 189 */       for (ebc ebc : ebb.c.values()) {
/* 190 */         elr elr = c(ebc.c);
/* 191 */         if (Objects.equals(elr.b(), ejv.a())) {
/* 192 */           set.add(Pair.of(ebc.c, this.b));
/*     */         }
/* 194 */         set2.add(elr);
/*     */       } 
/*     */     } 
/*     */     
/* 198 */     this.l.forEach(ebj1 -> {
/*     */           ely ely1 = ☃.apply(ebj1.a());
/*     */           
/*     */           if (Objects.equals(ely1, this)) {
/*     */             return;
/*     */           }
/*     */           set.addAll(ely1.a(☃, set1));
/*     */         });
/* 206 */     if (g() == els.n) {
/* 207 */       ebi.a.forEach(str -> ☃.add(c(str)));
/*     */     }
/*     */     
/* 210 */     return set2;
/*     */   }
/*     */ 
/*     */   
/*     */   public elo a(els ☃, Function<elr, ekc> function, elv elv1, vk vk1) {
/* 215 */     return a(☃, this, function, elv1, vk1, true);
/*     */   }
/*     */   
/*     */   public elo a(els ☃, ebf ebf1, Function<elr, ekc> function, elv elv1, vk vk1, boolean bool) {
/* 219 */     ekc ekc = function.apply(c("particle"));
/*     */     
/* 221 */     if (g() == els.o) {
/* 222 */       return new elq(h(), a(☃, ebf1), ekc, c().a());
/*     */     }
/*     */     
/* 225 */     elx.a a = (new elx.a(this, a(☃, ebf1), bool)).a(ekc);
/*     */     
/* 227 */     for (ebb ebb : a()) {
/* 228 */       for (gc gc : ebb.c.keySet()) {
/* 229 */         ebc ebc = ebb.c.get(gc);
/* 230 */         ekc ekc1 = function.apply(c(ebc.c));
/*     */         
/* 232 */         if (ebc.a == null) {
/* 233 */           a.a(a(ebb, ebc, ekc1, gc, elv1, vk1)); continue;
/*     */         } 
/* 235 */         a.a(gc.a(elv1.b().c(), ebc.a), a(ebb, ebc, ekc1, gc, elv1, vk1));
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 240 */     return a.b();
/*     */   }
/*     */   
/*     */   private static eba a(ebb ☃, ebc ebc1, ekc ekc1, gc gc1, elv elv1, vk vk1) {
/* 244 */     return g.a(☃.a, ☃.b, ebc1, ekc1, gc1, elv1, ☃.d, ☃.e, vk1);
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/* 248 */     return !ejv.a().equals(c(☃).b());
/*     */   }
/*     */   
/*     */   public elr c(String ☃) {
/* 252 */     if (f(☃)) {
/* 253 */       ☃ = ☃.substring(1);
/*     */     }
/*     */     
/* 256 */     List<String> list = Lists.newArrayList();
/*     */     while (true) {
/* 258 */       Either<elr, String> either = e(☃);
/* 259 */       Optional<elr> optional = either.left();
/* 260 */       if (optional.isPresent()) {
/* 261 */         return optional.get();
/*     */       }
/*     */       
/* 264 */       ☃ = either.right().get();
/* 265 */       if (list.contains(☃)) {
/* 266 */         f.warn("Unable to resolve texture due to reference chain {}->{} in {}", Joiner.on("->").join(list), ☃, this.b);
/* 267 */         return new elr(ekb.d, ejv.a());
/*     */       } 
/* 269 */       list.add(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private Either<elr, String> e(String ☃) {
/* 274 */     ebf ebf1 = this;
/* 275 */     while (ebf1 != null) {
/* 276 */       Either<elr, String> either = ebf1.c.get(☃);
/* 277 */       if (either != null) {
/* 278 */         return either;
/*     */       }
/* 280 */       ebf1 = ebf1.d;
/*     */     } 
/* 282 */     return Either.left(new elr(ekb.d, ejv.a()));
/*     */   }
/*     */   
/*     */   private static boolean f(String ☃) {
/* 286 */     return (☃.charAt(0) == '#');
/*     */   }
/*     */   
/*     */   public ebf g() {
/* 290 */     return (this.d == null) ? this : this.d.g();
/*     */   }
/*     */   
/*     */   public ebm h() {
/* 294 */     ebl ☃ = a(ebm.b.b);
/* 295 */     ebl ebl1 = a(ebm.b.c);
/* 296 */     ebl ebl2 = a(ebm.b.d);
/* 297 */     ebl ebl3 = a(ebm.b.e);
/* 298 */     ebl ebl4 = a(ebm.b.f);
/* 299 */     ebl ebl5 = a(ebm.b.g);
/* 300 */     ebl ebl6 = a(ebm.b.h);
/* 301 */     ebl ebl7 = a(ebm.b.i);
/* 302 */     return new ebm(☃, ebl1, ebl2, ebl3, ebl4, ebl5, ebl6, ebl7);
/*     */   }
/*     */   
/*     */   private ebl a(ebm.b ☃) {
/* 306 */     if (this.d != null && !this.k.b(☃)) {
/* 307 */       return this.d.a(☃);
/*     */     }
/* 309 */     return this.k.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<ebf>
/*     */   {
/*     */     public ebf a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 318 */       JsonObject jsonObject = ☃.getAsJsonObject();
/*     */       
/* 320 */       List<ebb> list = b(jsonDeserializationContext, jsonObject);
/* 321 */       String str = c(jsonObject);
/*     */       
/* 323 */       Map<String, Either<elr, String>> map = b(jsonObject);
/* 324 */       boolean bool = a(jsonObject);
/*     */       
/* 326 */       ebm ebm = ebm.a;
/* 327 */       if (jsonObject.has("display")) {
/* 328 */         JsonObject jsonObject1 = afd.t(jsonObject, "display");
/* 329 */         ebm = (ebm)jsonDeserializationContext.deserialize((JsonElement)jsonObject1, ebm.class);
/*     */       } 
/*     */       
/* 332 */       List<ebj> list1 = a(jsonDeserializationContext, jsonObject);
/*     */       
/* 334 */       ebf.b b = null;
/* 335 */       if (jsonObject.has("gui_light")) {
/* 336 */         b = ebf.b.a(afd.h(jsonObject, "gui_light"));
/*     */       }
/*     */       
/* 339 */       vk vk = str.isEmpty() ? null : new vk(str);
/* 340 */       return new ebf(vk, list, map, bool, b, ebm, list1);
/*     */     }
/*     */     
/*     */     protected List<ebj> a(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 344 */       List<ebj> list = Lists.newArrayList();
/* 345 */       if (jsonObject.has("overrides")) {
/* 346 */         JsonArray jsonArray = afd.u(jsonObject, "overrides");
/* 347 */         for (JsonElement jsonElement : jsonArray) {
/* 348 */           list.add(☃.deserialize(jsonElement, ebj.class));
/*     */         }
/*     */       } 
/* 351 */       return list;
/*     */     }
/*     */     
/*     */     private Map<String, Either<elr, String>> b(JsonObject ☃) {
/* 355 */       vk vk = ekb.d;
/*     */       
/* 357 */       Map<String, Either<elr, String>> map = Maps.newHashMap();
/*     */       
/* 359 */       if (☃.has("textures")) {
/* 360 */         JsonObject jsonObject = afd.t(☃, "textures");
/* 361 */         for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/* 362 */           map.put(entry.getKey(), a(vk, ((JsonElement)entry.getValue()).getAsString()));
/*     */         }
/*     */       } 
/*     */       
/* 366 */       return map;
/*     */     }
/*     */     
/*     */     private static Either<elr, String> a(vk ☃, String str) {
/* 370 */       if (ebf.d(str)) {
/* 371 */         return Either.right(str.substring(1));
/*     */       }
/* 373 */       vk vk1 = vk.a(str);
/* 374 */       if (vk1 == null) {
/* 375 */         throw new JsonParseException(str + " is not valid resource location");
/*     */       }
/* 377 */       return Either.left(new elr(☃, vk1));
/*     */     }
/*     */ 
/*     */     
/*     */     private String c(JsonObject ☃) {
/* 382 */       return afd.a(☃, "parent", "");
/*     */     }
/*     */     
/*     */     protected boolean a(JsonObject ☃) {
/* 386 */       return afd.a(☃, "ambientocclusion", true);
/*     */     }
/*     */     
/*     */     protected List<ebb> b(JsonDeserializationContext ☃, JsonObject jsonObject) {
/* 390 */       List<ebb> list = Lists.newArrayList();
/*     */       
/* 392 */       if (jsonObject.has("elements")) {
/* 393 */         for (JsonElement jsonElement : afd.u(jsonObject, "elements")) {
/* 394 */           list.add(☃.deserialize(jsonElement, ebb.class));
/*     */         }
/*     */       }
/* 397 */       return list;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 409 */     return this.b;
/*     */   }
/*     */   
/*     */   public enum b {
/* 413 */     a("front"),
/* 414 */     b("side");
/*     */     
/*     */     private final String c;
/*     */     
/*     */     b(String ☃) {
/* 419 */       this.c = ☃;
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 423 */       for (b b1 : values()) {
/* 424 */         if (b1.c.equals(☃)) {
/* 425 */           return b1;
/*     */         }
/*     */       } 
/* 428 */       throw new IllegalArgumentException("Invalid gui light: " + ☃);
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 432 */       return (this == b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */