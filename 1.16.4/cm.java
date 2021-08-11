/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Consumer;
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
/*     */ public class cm
/*     */ {
/*  24 */   public static final cm a = new cm((List<c>)ImmutableList.of());
/*     */   private final List<c> b;
/*     */   
/*     */   static abstract class c
/*     */   {
/*     */     public c(String ☃) {
/*  30 */       this.a = ☃;
/*     */     }
/*     */     private final String a;
/*     */     public <S extends cej<?, S>> boolean a(cei<?, S> ☃, S s) {
/*  34 */       cfj<?> cfj = ☃.a(this.a);
/*  35 */       if (cfj == null) {
/*  36 */         return false;
/*     */       }
/*     */       
/*  39 */       return a((cej<?, ?>)s, cfj);
/*     */     }
/*     */     
/*     */     protected abstract <T extends Comparable<T>> boolean a(cej<?, ?> param1cej, cfj<T> param1cfj);
/*     */     
/*     */     public abstract JsonElement a();
/*     */     
/*     */     public String b() {
/*  47 */       return this.a;
/*     */     }
/*     */     
/*     */     public void a(cei<?, ?> ☃, Consumer<String> consumer) {
/*  51 */       cfj<?> cfj = ☃.a(this.a);
/*  52 */       if (cfj == null)
/*  53 */         consumer.accept(this.a); 
/*     */     }
/*     */   }
/*     */   
/*     */   static class b
/*     */     extends c {
/*     */     private final String a;
/*     */     
/*     */     public b(String ☃, String str1) {
/*  62 */       super(☃);
/*  63 */       this.a = str1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected <T extends Comparable<T>> boolean a(cej<?, ?> ☃, cfj<T> cfj1) {
/*  68 */       T t = ☃.c(cfj1);
/*  69 */       Optional<T> optional = cfj1.b(this.a);
/*  70 */       return (optional.isPresent() && t.compareTo(optional.get()) == 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a() {
/*  75 */       return (JsonElement)new JsonPrimitive(this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   static class d
/*     */     extends c {
/*     */     @Nullable
/*     */     private final String a;
/*     */     @Nullable
/*     */     private final String b;
/*     */     
/*     */     public d(String ☃, @Nullable String str1, @Nullable String str2) {
/*  87 */       super(☃);
/*  88 */       this.a = str1;
/*  89 */       this.b = str2;
/*     */     }
/*     */ 
/*     */     
/*     */     protected <T extends Comparable<T>> boolean a(cej<?, ?> ☃, cfj<T> cfj1) {
/*  94 */       T t = ☃.c(cfj1);
/*     */       
/*  96 */       if (this.a != null) {
/*  97 */         Optional<T> optional = cfj1.b(this.a);
/*  98 */         if (!optional.isPresent() || t.compareTo(optional.get()) < 0) {
/*  99 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 103 */       if (this.b != null) {
/* 104 */         Optional<T> optional = cfj1.b(this.b);
/* 105 */         if (!optional.isPresent() || t.compareTo(optional.get()) > 0) {
/* 106 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 110 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a() {
/* 115 */       JsonObject ☃ = new JsonObject();
/* 116 */       if (this.a != null) {
/* 117 */         ☃.addProperty("min", this.a);
/*     */       }
/* 119 */       if (this.b != null) {
/* 120 */         ☃.addProperty("max", this.b);
/*     */       }
/* 122 */       return (JsonElement)☃;
/*     */     }
/*     */   }
/*     */   
/*     */   private static c a(String ☃, JsonElement jsonElement) {
/* 127 */     if (jsonElement.isJsonPrimitive()) {
/* 128 */       String str = jsonElement.getAsString();
/* 129 */       return new b(☃, str);
/*     */     } 
/*     */     
/* 132 */     JsonObject jsonObject = afd.m(jsonElement, "value");
/* 133 */     String str1 = jsonObject.has("min") ? b(jsonObject.get("min")) : null;
/* 134 */     String str2 = jsonObject.has("max") ? b(jsonObject.get("max")) : null;
/* 135 */     return (str1 != null && str1.equals(str2)) ? new b(☃, str1) : new d(☃, str1, str2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static String b(JsonElement ☃) {
/* 140 */     if (☃.isJsonNull()) {
/* 141 */       return null;
/*     */     }
/* 143 */     return ☃.getAsString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private cm(List<c> ☃) {
/* 149 */     this.b = (List<c>)ImmutableList.copyOf(☃);
/*     */   }
/*     */   
/*     */   public <S extends cej<?, S>> boolean a(cei<?, S> ☃, S s) {
/* 153 */     for (c c : this.b) {
/* 154 */       if (!c.a(☃, s)) {
/* 155 */         return false;
/*     */       }
/*     */     } 
/* 158 */     return true;
/*     */   }
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 162 */     return a(☃.b().m(), ☃);
/*     */   }
/*     */   
/*     */   public boolean a(cux ☃) {
/* 166 */     return a(☃.a().g(), ☃);
/*     */   }
/*     */   
/*     */   public void a(cei<?, ?> ☃, Consumer<String> consumer) {
/* 170 */     this.b.forEach(c1 -> c1.a(☃, consumer));
/*     */   }
/*     */   
/*     */   public static cm a(@Nullable JsonElement ☃) {
/* 174 */     if (☃ == null || ☃.isJsonNull()) {
/* 175 */       return a;
/*     */     }
/* 177 */     JsonObject jsonObject = afd.m(☃, "properties");
/*     */     
/* 179 */     List<c> list = Lists.newArrayList();
/* 180 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/* 181 */       list.add(a(entry.getKey(), entry.getValue()));
/*     */     }
/*     */     
/* 184 */     return new cm(list);
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 188 */     if (this == a) {
/* 189 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 192 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 194 */     if (!this.b.isEmpty()) {
/* 195 */       this.b.forEach(c1 -> ☃.add(c1.b(), c1.a()));
/*     */     }
/*     */     
/* 198 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class a {
/* 202 */     private final List<cm.c> a = Lists.newArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a a() {
/* 208 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(cfj<?> ☃, String str) {
/* 212 */       this.a.add(new cm.b(☃.f(), str));
/* 213 */       return this;
/*     */     }
/*     */     
/*     */     public a a(cfj<Integer> ☃, int i) {
/* 217 */       return a(☃, Integer.toString(i));
/*     */     }
/*     */     
/*     */     public a a(cfj<Boolean> ☃, boolean bool) {
/* 221 */       return a(☃, Boolean.toString(bool));
/*     */     }
/*     */     
/*     */     public <T extends Comparable<T> & afs> a a(cfj<T> ☃, T t) {
/* 225 */       return a(☃, ((afs)t).a());
/*     */     }
/*     */     
/*     */     public cm b() {
/* 229 */       return new cm(this.a);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */