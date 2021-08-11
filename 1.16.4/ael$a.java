/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*  63 */   private final List<ael.b> a = Lists.newArrayList();
/*     */   
/*     */   public static a a() {
/*  66 */     return new a();
/*     */   }
/*     */   
/*     */   public a a(ael.b ☃) {
/*  70 */     this.a.add(☃);
/*  71 */     return this;
/*     */   }
/*     */   
/*     */   public a a(ael.d ☃, String str) {
/*  75 */     return a(new ael.b(☃, str, null));
/*     */   }
/*     */   
/*     */   public a a(vk ☃, String str) {
/*  79 */     return a(new ael.c(☃), str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a c(vk ☃, String str) {
/*  87 */     return a(new ael.h(☃), str);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> Optional<ael<T>> a(Function<vk, ael<T>> ☃, Function<vk, T> function) {
/*  95 */     ImmutableSet.Builder<T> builder = ImmutableSet.builder();
/*  96 */     for (ael.b b : this.a) {
/*  97 */       if (!b.a().a(☃, function, builder::add)) {
/*  98 */         return Optional.empty();
/*     */       }
/*     */     } 
/* 101 */     return Optional.of(ael.b((Set<T>)builder.build()));
/*     */   }
/*     */   
/*     */   public Stream<ael.b> b() {
/* 105 */     return this.a.stream();
/*     */   }
/*     */   
/*     */   public <T> Stream<ael.b> b(Function<vk, ael<T>> ☃, Function<vk, T> function) {
/* 109 */     return b().filter(b1 -> !b1.a().a(☃, function, ()));
/*     */   }
/*     */   
/*     */   public a a(JsonObject ☃, String str) {
/* 113 */     JsonArray jsonArray = afd.u(☃, "values");
/*     */ 
/*     */     
/* 116 */     List<ael.d> list = Lists.newArrayList();
/* 117 */     for (JsonElement jsonElement : jsonArray) {
/* 118 */       list.add(a(jsonElement));
/*     */     }
/*     */     
/* 121 */     if (afd.a(☃, "replace", false)) {
/* 122 */       this.a.clear();
/*     */     }
/*     */     
/* 125 */     list.forEach(d1 -> this.a.add(new ael.b(d1, ☃, null)));
/* 126 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   private static ael.d a(JsonElement ☃) {
/*     */     String str;
/*     */     boolean bool;
/* 133 */     if (☃.isJsonObject()) {
/* 134 */       JsonObject jsonObject = ☃.getAsJsonObject();
/* 135 */       str = afd.h(jsonObject, "id");
/* 136 */       bool = afd.a(jsonObject, "required", true);
/*     */     } else {
/* 138 */       str = afd.a(☃, "id");
/* 139 */       bool = true;
/*     */     } 
/*     */     
/* 142 */     if (str.startsWith("#")) {
/* 143 */       vk vk1 = new vk(str.substring(1));
/* 144 */       return bool ? new ael.h(vk1) : new ael.g(vk1);
/*     */     } 
/* 146 */     vk vk = new vk(str);
/* 147 */     return bool ? new ael.c(vk) : new ael.f(vk);
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonObject c() {
/* 152 */     JsonObject ☃ = new JsonObject();
/* 153 */     JsonArray jsonArray = new JsonArray();
/*     */     
/* 155 */     for (ael.b b : this.a) {
/* 156 */       b.a().a(jsonArray);
/*     */     }
/*     */     
/* 159 */     ☃.addProperty("replace", Boolean.valueOf(false));
/* 160 */     ☃.add("values", (JsonElement)jsonArray);
/*     */     
/* 162 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ael$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */