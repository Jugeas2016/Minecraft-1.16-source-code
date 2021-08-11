/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.gson.JsonElement;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Stream;
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
/*     */ public class a<T>
/*     */ {
/* 285 */   public static final a<nr> a = new a("show_text", true, nr.a::a, nr.a::b, 
/*     */ 
/*     */       
/* 288 */       (Function)Function.identity());
/*     */   static {
/* 290 */     b = new a("show_item", true, ☃ -> nv.c.a(☃), ☃ -> nv.c.a((nv.c)☃), ☃ -> nv.c.a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public static final a<nv.c> b;
/* 295 */   public static final a<nv.b> c = new a("show_entity", true, nv.b::a, nv.b::a, nv.b::a);
/*     */   private static final Map<String, a> d;
/*     */   private final String e;
/*     */   private final boolean f;
/*     */   
/*     */   static {
/* 301 */     d = (Map<String, a>)Stream.<a>of(new a[] { a, b, c }).collect(ImmutableMap.toImmutableMap(a::b, ☃ -> ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   private final Function<JsonElement, T> g;
/*     */   private final Function<T, JsonElement> h;
/*     */   private final Function<nr, T> i;
/*     */   
/*     */   public a(String ☃, boolean bool, Function<JsonElement, T> function, Function<T, JsonElement> function1, Function<nr, T> function2) {
/* 310 */     this.e = ☃;
/* 311 */     this.f = bool;
/* 312 */     this.g = function;
/* 313 */     this.h = function1;
/* 314 */     this.i = function2;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 318 */     return this.f;
/*     */   }
/*     */   
/*     */   public String b() {
/* 322 */     return this.e;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static a a(String ☃) {
/* 327 */     return d.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private T b(Object ☃) {
/* 332 */     return (T)☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public nv a(JsonElement ☃) {
/* 337 */     T t = this.g.apply(☃);
/* 338 */     if (t == null) {
/* 339 */       return null;
/*     */     }
/* 341 */     return new nv(this, t);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public nv a(nr ☃) {
/* 346 */     T t = this.i.apply(☃);
/* 347 */     if (t == null) {
/* 348 */       return null;
/*     */     }
/* 350 */     return new nv(this, t);
/*     */   }
/*     */   
/*     */   public JsonElement a(Object ☃) {
/* 354 */     return this.h.apply(b(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 359 */     return "<action " + this.e + ">";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nv$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */