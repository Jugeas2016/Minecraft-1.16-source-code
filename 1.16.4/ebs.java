/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebs
/*     */   implements ely
/*     */ {
/*     */   private final cei<buo, ceh> a;
/*     */   private final List<ebu> b;
/*     */   
/*     */   public ebs(cei<buo, ceh> ☃, List<ebu> list) {
/*  39 */     this.a = ☃;
/*  40 */     this.b = list;
/*     */   }
/*     */   
/*     */   public List<ebu> a() {
/*  44 */     return this.b;
/*     */   }
/*     */   
/*     */   public Set<ebn> b() {
/*  48 */     Set<ebn> ☃ = Sets.newHashSet();
/*     */     
/*  50 */     for (ebu ebu : this.b) {
/*  51 */       ☃.add(ebu.a());
/*     */     }
/*     */     
/*  54 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  59 */     if (this == ☃) {
/*  60 */       return true;
/*     */     }
/*  62 */     if (☃ instanceof ebs) {
/*  63 */       ebs ebs1 = (ebs)☃;
/*  64 */       return (Objects.equals(this.a, ebs1.a) && Objects.equals(this.b, ebs1.b));
/*     */     } 
/*  66 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  71 */     return Objects.hash(new Object[] { this.a, this.b });
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> f() {
/*  76 */     return (Collection<vk>)a().stream().flatMap(☃ -> ☃.a().f().stream()).collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<elr> a(Function<vk, ely> ☃, Set<Pair<String, String>> set) {
/*  81 */     return (Collection<elr>)a().stream().flatMap(ebu1 -> ebu1.a().a(☃, set).stream()).collect(Collectors.toSet());
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public elo a(els ☃, Function<elr, ekc> function, elv elv1, vk vk1) {
/*  87 */     elw.a a = new elw.a();
/*     */     
/*  89 */     for (ebu ebu : a()) {
/*  90 */       elo elo = ebu.a().a(☃, function, elv1, vk1);
/*  91 */       if (elo != null) {
/*  92 */         a.a(ebu.a(this.a), elo);
/*     */       }
/*     */     } 
/*     */     
/*  96 */     return a.a();
/*     */   }
/*     */   
/*     */   public static class a implements JsonDeserializer<ebs> {
/*     */     private final ebg.a a;
/*     */     
/*     */     public a(ebg.a ☃) {
/* 103 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public ebs a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 108 */       return new ebs(this.a.a(), a(jsonDeserializationContext, ☃.getAsJsonArray()));
/*     */     }
/*     */     
/*     */     private List<ebu> a(JsonDeserializationContext ☃, JsonArray jsonArray) {
/* 112 */       List<ebu> list = Lists.newArrayList();
/*     */       
/* 114 */       for (JsonElement jsonElement : jsonArray) {
/* 115 */         list.add(☃.deserialize(jsonElement, ebu.class));
/*     */       }
/*     */       
/* 118 */       return list;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */