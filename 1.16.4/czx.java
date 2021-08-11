/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class czx
/*     */   extends dai
/*     */ {
/*     */   static interface b
/*     */   {
/*     */     int a(Random param1Random, int param1Int1, int param1Int2);
/*     */     
/*     */     void a(JsonObject param1JsonObject, JsonSerializationContext param1JsonSerializationContext);
/*     */     
/*     */     vk a();
/*     */   }
/*     */   
/*     */   static interface c
/*     */   {
/*     */     czx.b deserialize(JsonObject param1JsonObject, JsonDeserializationContext param1JsonDeserializationContext);
/*     */   }
/*     */   
/*     */   static final class a
/*     */     implements b
/*     */   {
/*  38 */     public static final vk a = new vk("binomial_with_bonus_count");
/*     */     
/*     */     private final int b;
/*     */     private final float c;
/*     */     
/*     */     public a(int ☃, float f) {
/*  44 */       this.b = ☃;
/*  45 */       this.c = f;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(Random ☃, int i, int j) {
/*  50 */       for (int k = 0; k < j + this.b; k++) {
/*  51 */         if (☃.nextFloat() < this.c) {
/*  52 */           i++;
/*     */         }
/*     */       } 
/*  55 */       return i;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃, JsonSerializationContext jsonSerializationContext) {
/*  60 */       ☃.addProperty("extra", Integer.valueOf(this.b));
/*  61 */       ☃.addProperty("probability", Float.valueOf(this.c));
/*     */     }
/*     */     
/*     */     public static czx.b a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  65 */       int i = afd.n(☃, "extra");
/*  66 */       float f = afd.l(☃, "probability");
/*  67 */       return new a(i, f);
/*     */     }
/*     */ 
/*     */     
/*     */     public vk a() {
/*  72 */       return a;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class f implements b {
/*  77 */     public static final vk a = new vk("uniform_bonus_count");
/*     */     
/*     */     private final int b;
/*     */     
/*     */     public f(int ☃) {
/*  82 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(Random ☃, int i, int j) {
/*  87 */       return i + ☃.nextInt(this.b * j + 1);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃, JsonSerializationContext jsonSerializationContext) {
/*  92 */       ☃.addProperty("bonusMultiplier", Integer.valueOf(this.b));
/*     */     }
/*     */     
/*     */     public static czx.b a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  96 */       int i = afd.n(☃, "bonusMultiplier");
/*  97 */       return new f(i);
/*     */     }
/*     */ 
/*     */     
/*     */     public vk a() {
/* 102 */       return a;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class d implements b {
/* 107 */     public static final vk a = new vk("ore_drops");
/*     */     private d() {}
/*     */     
/*     */     public int a(Random ☃, int i, int j) {
/* 111 */       if (j > 0) {
/* 112 */         int k = ☃.nextInt(j + 2) - 1;
/* 113 */         if (k < 0) {
/* 114 */           k = 0;
/*     */         }
/* 116 */         return i * (k + 1);
/*     */       } 
/*     */       
/* 119 */       return i;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃, JsonSerializationContext jsonSerializationContext) {}
/*     */ 
/*     */     
/*     */     public static czx.b a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 127 */       return new d();
/*     */     }
/*     */ 
/*     */     
/*     */     public vk a() {
/* 132 */       return a;
/*     */     }
/*     */   }
/*     */   
/* 136 */   private static final Map<vk, c> a = Maps.newHashMap(); private final bps b;
/*     */   
/*     */   static {
/* 139 */     a.put(a.a, a::a);
/* 140 */     a.put(d.a, d::a);
/* 141 */     a.put(f.a, f::a);
/*     */   }
/*     */ 
/*     */   
/*     */   private final b d;
/*     */ 
/*     */   
/*     */   private czx(dbo[] ☃, bps bps1, b b1) {
/* 149 */     super(☃);
/* 150 */     this.b = bps1;
/* 151 */     this.d = b1;
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/* 156 */     return dal.p;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<daz<?>> a() {
/* 161 */     return (Set<daz<?>>)ImmutableSet.of(dbc.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, cyv cyv1) {
/* 166 */     bmb bmb1 = cyv1.<bmb>c(dbc.i);
/*     */     
/* 168 */     if (bmb1 != null) {
/* 169 */       int i = bpu.a(this.b, bmb1);
/* 170 */       int j = this.d.a(cyv1.a(), ☃.E(), i);
/* 171 */       ☃.e(j);
/*     */     } 
/* 173 */     return ☃;
/*     */   }
/*     */   
/*     */   public static dai.a<?> a(bps ☃, float f, int i) {
/* 177 */     return a(arrayOfDbo -> new czx(arrayOfDbo, ☃, new a(i, f)));
/*     */   }
/*     */   
/*     */   public static dai.a<?> a(bps ☃) {
/* 181 */     return a(arrayOfDbo -> new czx(arrayOfDbo, ☃, new d()));
/*     */   }
/*     */   
/*     */   public static dai.a<?> b(bps ☃) {
/* 185 */     return a(arrayOfDbo -> new czx(arrayOfDbo, ☃, new f(1)));
/*     */   }
/*     */   
/*     */   public static dai.a<?> a(bps ☃, int i) {
/* 189 */     return a(arrayOfDbo -> new czx(arrayOfDbo, ☃, new f(i)));
/*     */   }
/*     */   
/*     */   public static class e
/*     */     extends dai.c<czx> {
/*     */     public void a(JsonObject ☃, czx czx1, JsonSerializationContext jsonSerializationContext) {
/* 195 */       super.a(☃, czx1, jsonSerializationContext);
/*     */       
/* 197 */       ☃.addProperty("enchantment", gm.R.b(czx.a(czx1)).toString());
/* 198 */       ☃.addProperty("formula", czx.b(czx1).a().toString());
/*     */       
/* 200 */       JsonObject jsonObject = new JsonObject();
/* 201 */       czx.b(czx1).a(jsonObject, jsonSerializationContext);
/* 202 */       if (jsonObject.size() > 0) {
/* 203 */         ☃.add("parameters", (JsonElement)jsonObject);
/*     */       }
/*     */     }
/*     */     
/*     */     public czx a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/*     */       czx.b b;
/* 209 */       vk vk1 = new vk(afd.h(☃, "enchantment"));
/* 210 */       bps bps = (bps)gm.R.b(vk1).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + ☃));
/* 211 */       vk vk2 = new vk(afd.h(☃, "formula"));
/* 212 */       czx.c c1 = (czx.c)czx.c().get(vk2);
/* 213 */       if (c1 == null) {
/* 214 */         throw new JsonParseException("Invalid formula id: " + vk2);
/*     */       }
/*     */ 
/*     */       
/* 218 */       if (☃.has("parameters")) {
/* 219 */         b = c1.deserialize(afd.t(☃, "parameters"), jsonDeserializationContext);
/*     */       } else {
/* 221 */         b = c1.deserialize(new JsonObject(), jsonDeserializationContext);
/*     */       } 
/*     */       
/* 224 */       return new czx(arrayOfDbo, bps, b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */