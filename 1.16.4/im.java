/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface im
/*     */   extends Supplier<JsonElement>
/*     */ {
/*     */   void a(cei<?, ?> paramcei);
/*     */   
/*     */   public enum b
/*     */   {
/*  21 */     a("AND"),
/*  22 */     b("OR");
/*     */     
/*     */     private final String c;
/*     */ 
/*     */     
/*     */     b(String ☃) {
/*  28 */       this.c = ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a implements im {
/*     */     private final im.b a;
/*     */     private final List<im> b;
/*     */     
/*     */     private a(im.b ☃, List<im> list) {
/*  37 */       this.a = ☃;
/*  38 */       this.b = list;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cei<?, ?> ☃) {
/*  43 */       this.b.forEach(im1 -> im1.a(☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/*  48 */       JsonArray ☃ = new JsonArray();
/*  49 */       this.b.stream().map(Supplier::get).forEach(☃::add);
/*     */       
/*  51 */       JsonObject jsonObject = new JsonObject();
/*  52 */       jsonObject.add(im.b.a(this.a), (JsonElement)☃);
/*  53 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c implements im {
/*  58 */     private final Map<cfj<?>, String> a = Maps.newHashMap();
/*     */     
/*     */     private static <T extends Comparable<T>> String a(cfj<T> ☃, Stream<T> stream) {
/*  61 */       return stream.<CharSequence>map(☃::a).collect(Collectors.joining("|"));
/*     */     }
/*     */     
/*     */     private static <T extends Comparable<T>> String c(cfj<T> ☃, T t, T[] arrayOfT) {
/*  65 */       return a(☃, Stream.concat(Stream.of(t), Stream.of(arrayOfT)));
/*     */     }
/*     */     
/*     */     private <T extends Comparable<T>> void a(cfj<T> ☃, String str) {
/*  69 */       String str1 = this.a.put(☃, str);
/*  70 */       if (str1 != null) {
/*  71 */         throw new IllegalStateException("Tried to replace " + ☃ + " value from " + str1 + " to " + str);
/*     */       }
/*     */     }
/*     */     
/*     */     public final <T extends Comparable<T>> c a(cfj<T> ☃, T t) {
/*  76 */       a(☃, ☃.a(t));
/*  77 */       return this;
/*     */     }
/*     */     
/*     */     @SafeVarargs
/*     */     public final <T extends Comparable<T>> c a(cfj<T> ☃, T t, T... arrayOfT) {
/*  82 */       a(☃, c(☃, t, arrayOfT));
/*  83 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public JsonElement b() {
/* 100 */       JsonObject ☃ = new JsonObject();
/* 101 */       this.a.forEach((cfj1, str) -> ☃.addProperty(cfj1.f(), str));
/* 102 */       return (JsonElement)☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(cei<?, ?> ☃) {
/* 107 */       List<cfj<?>> list = (List<cfj<?>>)this.a.keySet().stream().filter(cfj1 -> (☃.a(cfj1.f()) != cfj1)).collect(Collectors.toList());
/* 108 */       if (!list.isEmpty()) {
/* 109 */         throw new IllegalStateException("Properties " + list + " are missing from " + ☃);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   static c a() {
/* 115 */     return new c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static im b(im... ☃) {
/* 123 */     return new a(b.b, Arrays.asList(☃));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\im.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */