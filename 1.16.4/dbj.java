/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dbj
/*     */   implements dbo
/*     */ {
/*     */   private final Map<String, czd> a;
/*     */   private final cyv.c b;
/*     */   
/*     */   private dbj(Map<String, czd> ☃, cyv.c c1) {
/*  26 */     this.a = (Map<String, czd>)ImmutableMap.copyOf(☃);
/*  27 */     this.b = c1;
/*     */   }
/*     */ 
/*     */   
/*     */   public dbp b() {
/*  32 */     return dbq.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<daz<?>> a() {
/*  37 */     return (Set<daz<?>>)ImmutableSet.of(this.b.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cyv ☃) {
/*  42 */     aqa aqa = ☃.<aqa>c((daz)this.b.a());
/*     */     
/*  44 */     if (aqa == null) {
/*  45 */       return false;
/*     */     }
/*     */     
/*  48 */     ddn ddn = aqa.l.G();
/*  49 */     for (Map.Entry<String, czd> entry : this.a.entrySet()) {
/*  50 */       if (!a(aqa, ddn, entry.getKey(), entry.getValue())) {
/*  51 */         return false;
/*     */       }
/*     */     } 
/*  54 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean a(aqa ☃, ddn ddn1, String str, czd czd1) {
/*  58 */     ddk ddk = ddn1.d(str);
/*  59 */     if (ddk == null) {
/*  60 */       return false;
/*     */     }
/*  62 */     String str1 = ☃.bU();
/*  63 */     if (!ddn1.b(str1, ddk)) {
/*  64 */       return false;
/*     */     }
/*  66 */     return czd1.a(ddn1.c(str1, ddk).b());
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class b
/*     */     implements cze<dbj>
/*     */   {
/*     */     public void a(JsonObject ☃, dbj dbj1, JsonSerializationContext jsonSerializationContext) {
/*  95 */       JsonObject jsonObject = new JsonObject();
/*  96 */       for (Map.Entry<String, czd> entry : (Iterable<Map.Entry<String, czd>>)dbj.a(dbj1).entrySet()) {
/*  97 */         jsonObject.add(entry.getKey(), jsonSerializationContext.serialize(entry.getValue()));
/*     */       }
/*  99 */       ☃.add("scores", (JsonElement)jsonObject);
/* 100 */       ☃.add("entity", jsonSerializationContext.serialize(dbj.b(dbj1)));
/*     */     }
/*     */ 
/*     */     
/*     */     public dbj b(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 105 */       Set<Map.Entry<String, JsonElement>> set = afd.t(☃, "scores").entrySet();
/* 106 */       Map<String, czd> map = Maps.newLinkedHashMap();
/* 107 */       for (Map.Entry<String, JsonElement> entry : set) {
/* 108 */         map.put(entry.getKey(), afd.a(entry.getValue(), "score", jsonDeserializationContext, czd.class));
/*     */       }
/* 110 */       return new dbj(map, afd.<cyv.c>a(☃, "entity", jsonDeserializationContext, cyv.c.class));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dbj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */