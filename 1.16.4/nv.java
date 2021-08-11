/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Stream;
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
/*     */ public class nv
/*     */ {
/*  29 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final a<?> b;
/*     */   private final Object c;
/*     */   
/*     */   public <T> nv(a<T> ☃, T t) {
/*  35 */     this.b = ☃;
/*  36 */     this.c = t;
/*     */   }
/*     */   
/*     */   public a<?> a() {
/*  40 */     return this.b;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public <T> T a(a<T> ☃) {
/*  45 */     if (this.b == ☃) {
/*  46 */       return (T)a.a(☃, this.c);
/*     */     }
/*  48 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  53 */     if (this == ☃) {
/*  54 */       return true;
/*     */     }
/*  56 */     if (☃ == null || getClass() != ☃.getClass()) {
/*  57 */       return false;
/*     */     }
/*     */     
/*  60 */     nv nv1 = (nv)☃;
/*     */     
/*  62 */     return (this.b == nv1.b && Objects.equals(this.c, nv1.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  67 */     return "HoverEvent{action=" + this.b + ", value='" + this.c + '\'' + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  75 */     int ☃ = this.b.hashCode();
/*  76 */     ☃ = 31 * ☃ + ((this.c != null) ? this.c.hashCode() : 0);
/*  77 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static nv a(JsonObject ☃) {
/*  82 */     String str = afd.a(☃, "action", (String)null);
/*  83 */     if (str == null) {
/*  84 */       return null;
/*     */     }
/*     */     
/*  87 */     a<?> a1 = a.a(str);
/*  88 */     if (a1 == null) {
/*  89 */       return null;
/*     */     }
/*     */     
/*  92 */     JsonElement jsonElement = ☃.get("contents");
/*  93 */     if (jsonElement != null) {
/*  94 */       return a1.a(jsonElement);
/*     */     }
/*     */     
/*  97 */     nr nr = nr.a.a(☃.get("value"));
/*  98 */     if (nr != null) {
/*  99 */       return a1.a(nr);
/*     */     }
/*     */     
/* 102 */     return null;
/*     */   }
/*     */   
/*     */   public JsonObject b() {
/* 106 */     JsonObject ☃ = new JsonObject();
/* 107 */     ☃.addProperty("action", this.b.b());
/* 108 */     ☃.add("contents", this.b.a(this.c));
/* 109 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class b
/*     */   {
/*     */     public final aqe<?> a;
/*     */     public final UUID b;
/*     */     @Nullable
/*     */     public final nr c;
/*     */     @Nullable
/*     */     private List<nr> d;
/*     */     
/*     */     public b(aqe<?> ☃, UUID uUID, @Nullable nr nr1) {
/* 122 */       this.a = ☃;
/* 123 */       this.b = uUID;
/* 124 */       this.c = nr1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static b a(JsonElement ☃) {
/* 129 */       if (!☃.isJsonObject()) {
/* 130 */         return null;
/*     */       }
/* 132 */       JsonObject jsonObject = ☃.getAsJsonObject();
/* 133 */       aqe<?> aqe1 = gm.S.a(new vk(afd.h(jsonObject, "type")));
/* 134 */       UUID uUID = UUID.fromString(afd.h(jsonObject, "id"));
/* 135 */       nr nr1 = nr.a.a(jsonObject.get("name"));
/* 136 */       return new b(aqe1, uUID, nr1);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static b a(nr ☃) {
/*     */       try {
/* 142 */         md md = mu.a(☃.getString());
/* 143 */         nr nr1 = nr.a.a(md.l("name"));
/* 144 */         aqe<?> aqe1 = gm.S.a(new vk(md.l("type")));
/* 145 */         UUID uUID = UUID.fromString(md.l("id"));
/* 146 */         return new b(aqe1, uUID, nr1);
/* 147 */       } catch (JsonSyntaxException|CommandSyntaxException exception) {
/* 148 */         return null;
/*     */       } 
/*     */     }
/*     */     
/*     */     public JsonElement a() {
/* 153 */       JsonObject ☃ = new JsonObject();
/* 154 */       ☃.addProperty("type", gm.S.b(this.a).toString());
/* 155 */       ☃.addProperty("id", this.b.toString());
/* 156 */       if (this.c != null) {
/* 157 */         ☃.add("name", nr.a.b(this.c));
/*     */       }
/* 159 */       return (JsonElement)☃;
/*     */     }
/*     */     
/*     */     public List<nr> b() {
/* 163 */       if (this.d == null) {
/* 164 */         this.d = Lists.newArrayList();
/* 165 */         if (this.c != null) {
/* 166 */           this.d.add(this.c);
/*     */         }
/* 168 */         this.d.add(new of("gui.entity_tooltip.type", new Object[] { this.a.g() }));
/* 169 */         this.d.add(new oe(this.b.toString()));
/*     */       } 
/* 171 */       return this.d;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 176 */       if (this == ☃) return true; 
/* 177 */       if (☃ == null || getClass() != ☃.getClass()) return false;
/*     */       
/* 179 */       b b1 = (b)☃;
/* 180 */       return (this.a.equals(b1.a) && this.b.equals(b1.b) && Objects.equals(this.c, b1.c));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 185 */       int ☃ = this.a.hashCode();
/* 186 */       ☃ = 31 * ☃ + this.b.hashCode();
/* 187 */       ☃ = 31 * ☃ + ((this.c != null) ? this.c.hashCode() : 0);
/* 188 */       return ☃;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class c
/*     */   {
/*     */     private final blx a;
/*     */     private final int b;
/*     */     @Nullable
/*     */     private final md c;
/*     */     @Nullable
/*     */     private bmb d;
/*     */     
/*     */     c(blx ☃, int i, @Nullable md md1) {
/* 203 */       this.a = ☃;
/* 204 */       this.b = i;
/* 205 */       this.c = md1;
/*     */     }
/*     */     
/*     */     public c(bmb ☃) {
/* 209 */       this(☃.b(), ☃.E(), (☃.o() != null) ? ☃.o().g() : null);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 214 */       if (this == ☃) return true; 
/* 215 */       if (☃ == null || getClass() != ☃.getClass()) return false;
/*     */       
/* 217 */       c c1 = (c)☃;
/* 218 */       return (this.b == c1.b && this.a.equals(c1.a) && Objects.equals(this.c, c1.c));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 223 */       int ☃ = this.a.hashCode();
/* 224 */       ☃ = 31 * ☃ + this.b;
/* 225 */       ☃ = 31 * ☃ + ((this.c != null) ? this.c.hashCode() : 0);
/* 226 */       return ☃;
/*     */     }
/*     */     
/*     */     public bmb a() {
/* 230 */       if (this.d == null) {
/* 231 */         this.d = new bmb(this.a, this.b);
/* 232 */         if (this.c != null) {
/* 233 */           this.d.c(this.c);
/*     */         }
/*     */       } 
/* 236 */       return this.d;
/*     */     }
/*     */     
/*     */     private static c b(JsonElement ☃) {
/* 240 */       if (☃.isJsonPrimitive()) {
/* 241 */         return new c(gm.T.a(new vk(☃.getAsString())), 1, null);
/*     */       }
/*     */       
/* 244 */       JsonObject jsonObject = afd.m(☃, "item");
/* 245 */       blx blx1 = gm.T.a(new vk(afd.h(jsonObject, "id")));
/* 246 */       int i = afd.a(jsonObject, "count", 1);
/* 247 */       if (jsonObject.has("tag")) {
/* 248 */         String str = afd.h(jsonObject, "tag");
/*     */         try {
/* 250 */           md md1 = mu.a(str);
/* 251 */           return new c(blx1, i, md1);
/* 252 */         } catch (CommandSyntaxException commandSyntaxException) {
/* 253 */           nv.c().warn("Failed to parse tag: {}", str, commandSyntaxException);
/*     */         } 
/*     */       } 
/*     */       
/* 257 */       return new c(blx1, i, null);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private static c b(nr ☃) {
/*     */       try {
/* 263 */         md md1 = mu.a(☃.getString());
/* 264 */         return new c(bmb.a(md1));
/* 265 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 266 */         nv.c().warn("Failed to parse item tag: {}", ☃, commandSyntaxException);
/* 267 */         return null;
/*     */       } 
/*     */     }
/*     */     
/*     */     private JsonElement b() {
/* 272 */       JsonObject ☃ = new JsonObject();
/* 273 */       ☃.addProperty("id", gm.T.b(this.a).toString());
/* 274 */       if (this.b != 1) {
/* 275 */         ☃.addProperty("count", Integer.valueOf(this.b));
/*     */       }
/* 277 */       if (this.c != null) {
/* 278 */         ☃.addProperty("tag", this.c.toString());
/*     */       }
/* 280 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a<T> {
/* 285 */     public static final a<nr> a = new a("show_text", true, nr.a::a, nr.a::b, 
/*     */ 
/*     */         
/* 288 */         (Function)Function.identity());
/*     */     static {
/* 290 */       b = new a("show_item", true, ☃ -> nv.c.a(☃), ☃ -> nv.c.a((nv.c)☃), ☃ -> nv.c.a(☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public static final a<nv.c> b;
/* 295 */     public static final a<nv.b> c = new a("show_entity", true, nv.b::a, nv.b::a, nv.b::a);
/*     */     private static final Map<String, a> d;
/*     */     private final String e;
/*     */     private final boolean f;
/*     */     
/*     */     static {
/* 301 */       d = (Map<String, a>)Stream.<a>of(new a[] { a, b, c }).collect(ImmutableMap.toImmutableMap(a::b, ☃ -> ☃));
/*     */     }
/*     */ 
/*     */     
/*     */     private final Function<JsonElement, T> g;
/*     */     private final Function<T, JsonElement> h;
/*     */     private final Function<nr, T> i;
/*     */     
/*     */     public a(String ☃, boolean bool, Function<JsonElement, T> function, Function<T, JsonElement> function1, Function<nr, T> function2) {
/* 310 */       this.e = ☃;
/* 311 */       this.f = bool;
/* 312 */       this.g = function;
/* 313 */       this.h = function1;
/* 314 */       this.i = function2;
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 318 */       return this.f;
/*     */     }
/*     */     
/*     */     public String b() {
/* 322 */       return this.e;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static a a(String ☃) {
/* 327 */       return d.get(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     private T b(Object ☃) {
/* 332 */       return (T)☃;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public nv a(JsonElement ☃) {
/* 337 */       T t = this.g.apply(☃);
/* 338 */       if (t == null) {
/* 339 */         return null;
/*     */       }
/* 341 */       return new nv(this, t);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public nv a(nr ☃) {
/* 346 */       T t = this.i.apply(☃);
/* 347 */       if (t == null) {
/* 348 */         return null;
/*     */       }
/* 350 */       return new nv(this, t);
/*     */     }
/*     */     
/*     */     public JsonElement a(Object ☃) {
/* 354 */       return this.h.apply(b(☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 359 */       return "<action " + this.e + ">";
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */