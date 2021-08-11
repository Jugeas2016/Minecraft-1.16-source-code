/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dav
/*     */   extends dai
/*     */ {
/*     */   private final Map<aps, czd> a;
/*     */   
/*     */   private dav(dbo[] ☃, Map<aps, czd> map) {
/*  32 */     super(☃);
/*  33 */     this.a = (Map<aps, czd>)ImmutableMap.copyOf(map);
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/*  38 */     return dal.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, cyv cyv1) {
/*  43 */     if (☃.b() != bmd.qR || this.a.isEmpty()) {
/*  44 */       return ☃;
/*     */     }
/*     */     
/*  47 */     Random random = cyv1.a();
/*  48 */     int i = random.nextInt(this.a.size());
/*  49 */     Map.Entry<aps, czd> entry = (Map.Entry<aps, czd>)Iterables.get(this.a.entrySet(), i);
/*     */     
/*  51 */     aps aps = entry.getKey();
/*  52 */     int j = ((czd)entry.getValue()).a(random);
/*  53 */     if (!aps.a()) {
/*  54 */       j *= 20;
/*     */     }
/*     */     
/*  57 */     bne.a(☃, aps, j);
/*  58 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a extends dai.a<a> {
/*  62 */     private final Map<aps, czd> a = Maps.newHashMap();
/*     */ 
/*     */     
/*     */     protected a a() {
/*  66 */       return this;
/*     */     }
/*     */     
/*     */     public a a(aps ☃, czd czd1) {
/*  70 */       this.a.put(☃, czd1);
/*  71 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public daj b() {
/*  76 */       return new dav(g(), this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   public static a c() {
/*  81 */     return new a();
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends dai.c<dav> {
/*     */     public void a(JsonObject ☃, dav dav1, JsonSerializationContext jsonSerializationContext) {
/*  87 */       super.a(☃, dav1, jsonSerializationContext);
/*     */       
/*  89 */       if (!dav.a(dav1).isEmpty()) {
/*  90 */         JsonArray jsonArray = new JsonArray();
/*  91 */         for (aps aps : dav.a(dav1).keySet()) {
/*  92 */           JsonObject jsonObject = new JsonObject();
/*  93 */           vk vk = gm.P.b(aps);
/*  94 */           if (vk == null) {
/*  95 */             throw new IllegalArgumentException("Don't know how to serialize mob effect " + aps);
/*     */           }
/*  97 */           jsonObject.add("type", (JsonElement)new JsonPrimitive(vk.toString()));
/*  98 */           jsonObject.add("duration", jsonSerializationContext.serialize(dav.a(dav1).get(aps)));
/*  99 */           jsonArray.add((JsonElement)jsonObject);
/*     */         } 
/* 101 */         ☃.add("effects", (JsonElement)jsonArray);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public dav a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 107 */       Map<aps, czd> map = Maps.newHashMap();
/* 108 */       if (☃.has("effects")) {
/* 109 */         JsonArray jsonArray = afd.u(☃, "effects");
/* 110 */         for (JsonElement jsonElement : jsonArray) {
/* 111 */           String str = afd.h(jsonElement.getAsJsonObject(), "type");
/*     */           
/* 113 */           aps aps = (aps)gm.P.b(new vk(str)).orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + ☃ + "'"));
/* 114 */           czd czd = afd.<czd>a(jsonElement.getAsJsonObject(), "duration", jsonDeserializationContext, czd.class);
/* 115 */           map.put(aps, czd);
/*     */         } 
/*     */       } 
/*     */       
/* 119 */       return new dav(arrayOfDbo, map);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dav.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */