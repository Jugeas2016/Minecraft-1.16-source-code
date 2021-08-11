/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Streams;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.UnaryOperator;
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
/*     */ public class das
/*     */   extends dai
/*     */ {
/*     */   private final boolean a;
/*     */   private final List<nr> b;
/*     */   @Nullable
/*     */   private final cyv.c d;
/*     */   
/*     */   public das(dbo[] ☃, boolean bool, List<nr> list, @Nullable cyv.c c1) {
/*  36 */     super(☃);
/*  37 */     this.a = bool;
/*  38 */     this.b = (List<nr>)ImmutableList.copyOf(list);
/*  39 */     this.d = c1;
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/*  44 */     return dal.s;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<daz<?>> a() {
/*  49 */     return (this.d != null) ? (Set<daz<?>>)ImmutableSet.of(this.d.a()) : (Set<daz<?>>)ImmutableSet.of();
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, cyv cyv1) {
/*  54 */     mj mj = a(☃, !this.b.isEmpty());
/*     */     
/*  56 */     if (mj != null) {
/*  57 */       if (this.a) {
/*  58 */         mj.clear();
/*     */       }
/*     */       
/*  61 */       UnaryOperator<nr> unaryOperator = dat.a(cyv1, this.d);
/*  62 */       this.b.stream().map(unaryOperator).map(nr.a::a).map(ms::a).forEach(mj::add);
/*     */     } 
/*     */     
/*  65 */     return ☃;
/*     */   }
/*     */   @Nullable
/*     */   private mj a(bmb ☃, boolean bool) {
/*     */     md md1;
/*     */     md md2;
/*  71 */     if (☃.n()) {
/*  72 */       md1 = ☃.o();
/*  73 */     } else if (bool) {
/*  74 */       md1 = new md();
/*  75 */       ☃.c(md1);
/*     */     } else {
/*  77 */       return null;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  82 */     if (md1.c("display", 10)) {
/*  83 */       md2 = md1.p("display");
/*  84 */     } else if (bool) {
/*  85 */       md2 = new md();
/*  86 */       md1.a("display", md2);
/*     */     } else {
/*  88 */       return null;
/*     */     } 
/*     */     
/*  91 */     if (md2.c("Lore", 9))
/*  92 */       return md2.d("Lore", 8); 
/*  93 */     if (bool) {
/*  94 */       mj mj = new mj();
/*  95 */       md2.a("Lore", mj);
/*  96 */       return mj;
/*     */     } 
/*  98 */     return null;
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
/*     */     extends dai.c<das>
/*     */   {
/*     */     public void a(JsonObject ☃, das das1, JsonSerializationContext jsonSerializationContext) {
/* 140 */       super.a(☃, das1, jsonSerializationContext);
/*     */       
/* 142 */       ☃.addProperty("replace", Boolean.valueOf(das.a(das1)));
/*     */       
/* 144 */       JsonArray jsonArray = new JsonArray();
/* 145 */       for (nr nr : das.b(das1)) {
/* 146 */         jsonArray.add(nr.a.b(nr));
/*     */       }
/* 148 */       ☃.add("lore", (JsonElement)jsonArray);
/*     */       
/* 150 */       if (das.c(das1) != null) {
/* 151 */         ☃.add("entity", jsonSerializationContext.serialize(das.c(das1)));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public das a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 157 */       boolean bool = afd.a(☃, "replace", false);
/* 158 */       List<nr> list = (List<nr>)Streams.stream((Iterable)afd.u(☃, "lore")).map(nr.a::a).collect(ImmutableList.toImmutableList());
/* 159 */       cyv.c c1 = afd.<cyv.c>a(☃, "entity", null, jsonDeserializationContext, cyv.c.class);
/* 160 */       return new das(arrayOfDbo, bool, list, c1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\das.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */