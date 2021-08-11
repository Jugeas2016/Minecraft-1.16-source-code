/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class czz
/*     */   extends dai
/*     */ {
/*     */   private final buo a;
/*     */   private final Set<cfj<?>> b;
/*     */   
/*     */   private czz(dbo[] ☃, buo buo1, Set<cfj<?>> set) {
/*  32 */     super(☃);
/*  33 */     this.a = buo1;
/*  34 */     this.b = set;
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/*  39 */     return dal.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<daz<?>> a() {
/*  44 */     return (Set<daz<?>>)ImmutableSet.of(dbc.g);
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb a(bmb ☃, cyv cyv1) {
/*  49 */     ceh ceh = cyv1.<ceh>c(dbc.g);
/*  50 */     if (ceh != null) {
/*  51 */       md md2, md1 = ☃.p();
/*     */       
/*  53 */       if (md1.c("BlockStateTag", 10)) {
/*  54 */         md2 = md1.p("BlockStateTag");
/*     */       } else {
/*  56 */         md2 = new md();
/*  57 */         md1.a("BlockStateTag", md2);
/*     */       } 
/*     */       
/*  60 */       this.b.stream().filter(ceh::b).forEach(cfj1 -> ☃.a(cfj1.f(), a(ceh1, cfj1)));
/*     */     } 
/*     */     
/*  63 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a extends dai.a<a> {
/*     */     private final buo a;
/*  68 */     private final Set<cfj<?>> b = Sets.newHashSet();
/*     */     
/*     */     private a(buo ☃) {
/*  71 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public a a(cfj<?> ☃) {
/*  75 */       if (!this.a.m().d().contains(☃)) {
/*  76 */         throw new IllegalStateException("Property " + ☃ + " is not present on block " + this.a);
/*     */       }
/*  78 */       this.b.add(☃);
/*  79 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected a a() {
/*  84 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public daj b() {
/*  89 */       return new czz(g(), this.a, this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public static a a(buo ☃) {
/*  94 */     return new a(☃);
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> String a(ceh ☃, cfj<T> cfj1) {
/*  98 */     T t = (T)☃.c(cfj1);
/*  99 */     return cfj1.a(t);
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends dai.c<czz> {
/*     */     public void a(JsonObject ☃, czz czz1, JsonSerializationContext jsonSerializationContext) {
/* 105 */       super.a(☃, czz1, jsonSerializationContext);
/* 106 */       ☃.addProperty("block", gm.Q.b(czz.a(czz1)).toString());
/* 107 */       JsonArray jsonArray = new JsonArray();
/* 108 */       czz.b(czz1).forEach(cfj1 -> ☃.add(cfj1.f()));
/* 109 */       ☃.add("properties", (JsonElement)jsonArray);
/*     */     }
/*     */ 
/*     */     
/*     */     public czz a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 114 */       vk vk = new vk(afd.h(☃, "block"));
/*     */       
/* 116 */       buo buo = (buo)gm.Q.b(vk).orElseThrow(() -> new IllegalArgumentException("Can't find block " + ☃));
/* 117 */       cei<buo, ceh> cei = buo.m();
/* 118 */       Set<cfj<?>> set = Sets.newHashSet();
/*     */       
/* 120 */       JsonArray jsonArray = afd.a(☃, "properties", (JsonArray)null);
/* 121 */       if (jsonArray != null) {
/* 122 */         jsonArray.forEach(jsonElement -> ☃.add(cei1.a(afd.a(jsonElement, "property"))));
/*     */       }
/* 124 */       return new czz(arrayOfDbo, buo, set);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */