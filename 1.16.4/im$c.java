/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class c
/*     */   implements im
/*     */ {
/*  58 */   private final Map<cfj<?>, String> a = Maps.newHashMap();
/*     */   
/*     */   private static <T extends Comparable<T>> String a(cfj<T> ☃, Stream<T> stream) {
/*  61 */     return stream.<CharSequence>map(☃::a).collect(Collectors.joining("|"));
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> String c(cfj<T> ☃, T t, T[] arrayOfT) {
/*  65 */     return a(☃, Stream.concat(Stream.of(t), Stream.of(arrayOfT)));
/*     */   }
/*     */   
/*     */   private <T extends Comparable<T>> void a(cfj<T> ☃, String str) {
/*  69 */     String str1 = this.a.put(☃, str);
/*  70 */     if (str1 != null) {
/*  71 */       throw new IllegalStateException("Tried to replace " + ☃ + " value from " + str1 + " to " + str);
/*     */     }
/*     */   }
/*     */   
/*     */   public final <T extends Comparable<T>> c a(cfj<T> ☃, T t) {
/*  76 */     a(☃, ☃.a(t));
/*  77 */     return this;
/*     */   }
/*     */   
/*     */   @SafeVarargs
/*     */   public final <T extends Comparable<T>> c a(cfj<T> ☃, T t, T... arrayOfT) {
/*  82 */     a(☃, c(☃, t, arrayOfT));
/*  83 */     return this;
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
/*     */   
/*     */   public JsonElement b() {
/* 100 */     JsonObject ☃ = new JsonObject();
/* 101 */     this.a.forEach((cfj1, str) -> ☃.addProperty(cfj1.f(), str));
/* 102 */     return (JsonElement)☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cei<?, ?> ☃) {
/* 107 */     List<cfj<?>> list = (List<cfj<?>>)this.a.keySet().stream().filter(cfj1 -> (☃.a(cfj1.f()) != cfj1)).collect(Collectors.toList());
/* 108 */     if (!list.isEmpty())
/* 109 */       throw new IllegalStateException("Properties " + list + " are missing from " + ☃); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\im$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */