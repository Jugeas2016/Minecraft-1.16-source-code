/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonPrimitive;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class dac
/*     */   extends dai
/*     */ {
/*  34 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final List<bps> b;
/*     */   
/*     */   private dac(dbo[] ☃, Collection<bps> collection) {
/*  39 */     super(☃);
/*  40 */     this.b = (List<bps>)ImmutableList.copyOf(collection);
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/*  45 */     return dal.d;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, cyv cyv1) {
/*     */     bps bps;
/*  52 */     Random random = cyv1.a();
/*  53 */     if (this.b.isEmpty()) {
/*  54 */       boolean bool = (☃.b() == bmd.mc);
/*     */ 
/*     */ 
/*     */       
/*  58 */       List<bps> list = (List<bps>)gm.R.g().filter(bps::i).filter(bps1 -> (☃ || bps1.a(bmb1))).collect(Collectors.toList());
/*     */       
/*  60 */       if (list.isEmpty()) {
/*  61 */         a.warn("Couldn't find a compatible enchantment for {}", ☃);
/*  62 */         return ☃;
/*     */       } 
/*  64 */       bps = list.get(random.nextInt(list.size()));
/*     */     } else {
/*  66 */       bps = this.b.get(random.nextInt(this.b.size()));
/*     */     } 
/*     */     
/*  69 */     return a(☃, bps, random);
/*     */   }
/*     */   
/*     */   private static bmb a(bmb ☃, bps bps1, Random random) {
/*  73 */     int i = afm.a(random, bps1.e(), bps1.a());
/*     */     
/*  75 */     if (☃.b() == bmd.mc) {
/*  76 */       ☃ = new bmb(bmd.pq);
/*  77 */       blf.a(☃, new bpv(bps1, i));
/*     */     } else {
/*  79 */       ☃.a(bps1, i);
/*     */     } 
/*  81 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a extends dai.a<a> {
/*  85 */     private final Set<bps> a = Sets.newHashSet();
/*     */ 
/*     */     
/*     */     protected a a() {
/*  89 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bps ☃) {
/*  93 */       this.a.add(☃);
/*  94 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public daj b() {
/*  99 */       return new dac(g(), this.a);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static dai.a<?> d() {
/* 108 */     return a(☃ -> new dac(☃, (Collection<bps>)ImmutableList.of()));
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends dai.c<dac> {
/*     */     public void a(JsonObject ☃, dac dac1, JsonSerializationContext jsonSerializationContext) {
/* 114 */       super.a(☃, dac1, jsonSerializationContext);
/*     */       
/* 116 */       if (!dac.a(dac1).isEmpty()) {
/* 117 */         JsonArray jsonArray = new JsonArray();
/* 118 */         for (bps bps : dac.a(dac1)) {
/* 119 */           vk vk = gm.R.b(bps);
/* 120 */           if (vk == null) {
/* 121 */             throw new IllegalArgumentException("Don't know how to serialize enchantment " + bps);
/*     */           }
/* 123 */           jsonArray.add((JsonElement)new JsonPrimitive(vk.toString()));
/*     */         } 
/* 125 */         ☃.add("enchantments", (JsonElement)jsonArray);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public dac a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 131 */       List<bps> list = Lists.newArrayList();
/* 132 */       if (☃.has("enchantments")) {
/* 133 */         JsonArray jsonArray = afd.u(☃, "enchantments");
/* 134 */         for (JsonElement jsonElement : jsonArray) {
/* 135 */           String str = afd.a(jsonElement, "enchantment");
/*     */           
/* 137 */           bps bps = (bps)gm.R.b(new vk(str)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + ☃ + "'"));
/* 138 */           list.add(bps);
/*     */         } 
/*     */       } 
/* 141 */       return new dac(arrayOfDbo, list);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */