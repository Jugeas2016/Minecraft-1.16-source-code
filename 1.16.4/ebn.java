/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class ebn
/*     */   implements ely
/*     */ {
/*     */   private final List<ebo> a;
/*     */   
/*     */   public ebn(List<ebo> ☃) {
/*  31 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public List<ebo> a() {
/*  35 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  40 */     if (this == ☃) {
/*  41 */       return true;
/*     */     }
/*     */     
/*  44 */     if (☃ instanceof ebn) {
/*  45 */       ebn ebn1 = (ebn)☃;
/*     */       
/*  47 */       return this.a.equals(ebn1.a);
/*     */     } 
/*     */     
/*  50 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  55 */     return this.a.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> f() {
/*  60 */     return (Collection<vk>)a().stream().map(ebo::a).collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<elr> a(Function<vk, ely> ☃, Set<Pair<String, String>> set) {
/*  65 */     return (Collection<elr>)a().stream().map(ebo::a).distinct().flatMap(vk1 -> ((ely)☃.apply(vk1)).a(☃, set).stream()).collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public elo a(els ☃, Function<elr, ekc> function, elv elv1, vk vk1) {
/*  71 */     if (a().isEmpty()) {
/*  72 */       return null;
/*     */     }
/*     */     
/*  75 */     elz.a a = new elz.a();
/*  76 */     for (ebo ebo : a()) {
/*  77 */       elo elo = ☃.a(ebo.a(), ebo);
/*     */       
/*  79 */       a.a(elo, ebo.d());
/*     */     } 
/*     */     
/*  82 */     return a.a();
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<ebn> {
/*     */     public ebn a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/*  88 */       List<ebo> list = Lists.newArrayList();
/*  89 */       if (☃.isJsonArray()) {
/*  90 */         JsonArray jsonArray = ☃.getAsJsonArray();
/*  91 */         if (jsonArray.size() == 0) {
/*  92 */           throw new JsonParseException("Empty variant array");
/*     */         }
/*     */         
/*  95 */         for (JsonElement jsonElement : jsonArray) {
/*  96 */           list.add(jsonDeserializationContext.deserialize(jsonElement, ebo.class));
/*     */         }
/*     */       } else {
/*  99 */         list.add(jsonDeserializationContext.deserialize(☃, ebo.class));
/*     */       } 
/* 101 */       return new ebn(list);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */