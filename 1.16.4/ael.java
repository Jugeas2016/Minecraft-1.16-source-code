/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface ael<T>
/*     */ {
/*     */   static <T> Codec<ael<T>> a(Supplier<aem<T>> ☃) {
/*  24 */     return vk.a.flatXmap(vk1 -> (DataResult)Optional.ofNullable(((aem)☃.get()).a(vk1)).map(DataResult::success).orElseGet(()), ael1 -> (DataResult)Optional.<vk>ofNullable(((aem)☃.get()).a(ael1)).map(DataResult::success).orElseGet(()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default T a(Random ☃) {
/*  35 */     List<T> list = b();
/*  36 */     return list.get(☃.nextInt(list.size()));
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     private final ael.d a;
/*     */     private final String b;
/*     */     
/*     */     private b(ael.d ☃, String str) {
/*  44 */       this.a = ☃;
/*  45 */       this.b = str;
/*     */     }
/*     */     
/*     */     public ael.d a() {
/*  49 */       return this.a;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/*  58 */       return this.a.toString() + " (from " + this.b + ")";
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a {
/*  63 */     private final List<ael.b> a = Lists.newArrayList();
/*     */     
/*     */     public static a a() {
/*  66 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(ael.b ☃) {
/*  70 */       this.a.add(☃);
/*  71 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ael.d ☃, String str) {
/*  75 */       return a(new ael.b(☃, str));
/*     */     }
/*     */     
/*     */     public a a(vk ☃, String str) {
/*  79 */       return a(new ael.c(☃), str);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a c(vk ☃, String str) {
/*  87 */       return a(new ael.h(☃), str);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public <T> Optional<ael<T>> a(Function<vk, ael<T>> ☃, Function<vk, T> function) {
/*  95 */       ImmutableSet.Builder<T> builder = ImmutableSet.builder();
/*  96 */       for (ael.b b : this.a) {
/*  97 */         if (!b.a().a(☃, function, builder::add)) {
/*  98 */           return Optional.empty();
/*     */         }
/*     */       } 
/* 101 */       return Optional.of(ael.b((Set<T>)builder.build()));
/*     */     }
/*     */     
/*     */     public Stream<ael.b> b() {
/* 105 */       return this.a.stream();
/*     */     }
/*     */     
/*     */     public <T> Stream<ael.b> b(Function<vk, ael<T>> ☃, Function<vk, T> function) {
/* 109 */       return b().filter(b1 -> !b1.a().a(☃, function, ()));
/*     */     }
/*     */     
/*     */     public a a(JsonObject ☃, String str) {
/* 113 */       JsonArray jsonArray = afd.u(☃, "values");
/*     */ 
/*     */       
/* 116 */       List<ael.d> list = Lists.newArrayList();
/* 117 */       for (JsonElement jsonElement : jsonArray) {
/* 118 */         list.add(a(jsonElement));
/*     */       }
/*     */       
/* 121 */       if (afd.a(☃, "replace", false)) {
/* 122 */         this.a.clear();
/*     */       }
/*     */       
/* 125 */       list.forEach(d1 -> this.a.add(new ael.b(d1, ☃)));
/* 126 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     private static ael.d a(JsonElement ☃) {
/*     */       String str;
/*     */       boolean bool;
/* 133 */       if (☃.isJsonObject()) {
/* 134 */         JsonObject jsonObject = ☃.getAsJsonObject();
/* 135 */         str = afd.h(jsonObject, "id");
/* 136 */         bool = afd.a(jsonObject, "required", true);
/*     */       } else {
/* 138 */         str = afd.a(☃, "id");
/* 139 */         bool = true;
/*     */       } 
/*     */       
/* 142 */       if (str.startsWith("#")) {
/* 143 */         vk vk1 = new vk(str.substring(1));
/* 144 */         return bool ? new ael.h(vk1) : new ael.g(vk1);
/*     */       } 
/* 146 */       vk vk = new vk(str);
/* 147 */       return bool ? new ael.c(vk) : new ael.f(vk);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject c() {
/* 152 */       JsonObject ☃ = new JsonObject();
/* 153 */       JsonArray jsonArray = new JsonArray();
/*     */       
/* 155 */       for (ael.b b : this.a) {
/* 156 */         b.a().a(jsonArray);
/*     */       }
/*     */       
/* 159 */       ☃.addProperty("replace", Boolean.valueOf(false));
/* 160 */       ☃.add("values", (JsonElement)jsonArray);
/*     */       
/* 162 */       return ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface d {
/*     */     <T> boolean a(Function<vk, ael<T>> param1Function, Function<vk, T> param1Function1, Consumer<T> param1Consumer);
/*     */     
/*     */     void a(JsonArray param1JsonArray);
/*     */   }
/*     */   
/*     */   public static class c implements d {
/*     */     private final vk a;
/*     */     
/*     */     public c(vk ☃) {
/* 176 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> boolean a(Function<vk, ael<T>> ☃, Function<vk, T> function, Consumer<T> consumer) {
/* 181 */       T t = function.apply(this.a);
/* 182 */       if (t == null) {
/* 183 */         return false;
/*     */       }
/* 185 */       consumer.accept(t);
/* 186 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonArray ☃) {
/* 191 */       ☃.add(this.a.toString());
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 196 */       return this.a.toString();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class f implements d {
/*     */     private final vk a;
/*     */     
/*     */     public f(vk ☃) {
/* 204 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> boolean a(Function<vk, ael<T>> ☃, Function<vk, T> function, Consumer<T> consumer) {
/* 209 */       T t = function.apply(this.a);
/* 210 */       if (t != null) {
/* 211 */         consumer.accept(t);
/*     */       }
/* 213 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonArray ☃) {
/* 218 */       JsonObject jsonObject = new JsonObject();
/* 219 */       jsonObject.addProperty("id", this.a.toString());
/* 220 */       jsonObject.addProperty("required", Boolean.valueOf(false));
/* 221 */       ☃.add((JsonElement)jsonObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 226 */       return this.a.toString() + "?";
/*     */     }
/*     */   }
/*     */   
/*     */   public static class h implements d {
/*     */     private final vk a;
/*     */     
/*     */     public h(vk ☃) {
/* 234 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> boolean a(Function<vk, ael<T>> ☃, Function<vk, T> function, Consumer<T> consumer) {
/* 239 */       ael<T> ael = ☃.apply(this.a);
/* 240 */       if (ael == null) {
/* 241 */         return false;
/*     */       }
/* 243 */       ael.b().forEach(consumer);
/* 244 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonArray ☃) {
/* 249 */       ☃.add("#" + this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 254 */       return "#" + this.a;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class g implements d {
/*     */     private final vk a;
/*     */     
/*     */     public g(vk ☃) {
/* 262 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> boolean a(Function<vk, ael<T>> ☃, Function<vk, T> function, Consumer<T> consumer) {
/* 267 */       ael<T> ael = ☃.apply(this.a);
/* 268 */       if (ael != null) {
/* 269 */         ael.b().forEach(consumer);
/*     */       }
/* 271 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonArray ☃) {
/* 276 */       JsonObject jsonObject = new JsonObject();
/* 277 */       jsonObject.addProperty("id", "#" + this.a);
/* 278 */       jsonObject.addProperty("required", Boolean.valueOf(false));
/* 279 */       ☃.add((JsonElement)jsonObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 284 */       return "#" + this.a + "?";
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static <T> ael<T> b(Set<T> ☃) {
/* 293 */     return aei.a(☃);
/*     */   }
/*     */   
/*     */   boolean a(T paramT);
/*     */   
/*     */   List<T> b();
/*     */   
/*     */   public static interface e<T> extends ael<T> {
/*     */     vk a();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ael.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */