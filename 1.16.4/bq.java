/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bq
/*     */ {
/*  30 */   public static final bq a = new bq();
/*     */   
/*     */   @Nullable
/*     */   private final ael<blx> b;
/*     */   @Nullable
/*     */   private final blx c;
/*     */   private final bz.d d;
/*     */   private final bz.d e;
/*     */   private final bb[] f;
/*     */   private final bb[] g;
/*     */   @Nullable
/*     */   private final bnt h;
/*     */   private final cb i;
/*     */   
/*     */   public bq() {
/*  45 */     this.b = null;
/*  46 */     this.c = null;
/*  47 */     this.h = null;
/*  48 */     this.d = bz.d.e;
/*  49 */     this.e = bz.d.e;
/*  50 */     this.f = bb.b;
/*  51 */     this.g = bb.b;
/*  52 */     this.i = cb.a;
/*     */   }
/*     */   
/*     */   public bq(@Nullable ael<blx> ☃, @Nullable blx blx1, bz.d d1, bz.d d2, bb[] arrayOfBb1, bb[] arrayOfBb2, @Nullable bnt bnt1, cb cb1) {
/*  56 */     this.b = ☃;
/*  57 */     this.c = blx1;
/*  58 */     this.d = d1;
/*  59 */     this.e = d2;
/*  60 */     this.f = arrayOfBb1;
/*  61 */     this.g = arrayOfBb2;
/*  62 */     this.h = bnt1;
/*  63 */     this.i = cb1;
/*     */   }
/*     */   
/*     */   public boolean a(bmb ☃) {
/*  67 */     if (this == a) {
/*  68 */       return true;
/*     */     }
/*     */     
/*  71 */     if (this.b != null && !this.b.a(☃.b())) {
/*  72 */       return false;
/*     */     }
/*  74 */     if (this.c != null && ☃.b() != this.c) {
/*  75 */       return false;
/*     */     }
/*  77 */     if (!this.d.d(☃.E())) {
/*  78 */       return false;
/*     */     }
/*  80 */     if (!this.e.c() && !☃.e()) {
/*  81 */       return false;
/*     */     }
/*  83 */     if (!this.e.d(☃.h() - ☃.g())) {
/*  84 */       return false;
/*     */     }
/*  86 */     if (!this.i.a(☃)) {
/*  87 */       return false;
/*     */     }
/*  89 */     if (this.f.length > 0) {
/*  90 */       Map<bps, Integer> map = bpu.a(☃.q());
/*  91 */       for (bb bb1 : this.f) {
/*  92 */         if (!bb1.a(map)) {
/*  93 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*  97 */     if (this.g.length > 0) {
/*  98 */       Map<bps, Integer> map = bpu.a(blf.d(☃));
/*  99 */       for (bb bb1 : this.g) {
/* 100 */         if (!bb1.a(map)) {
/* 101 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 106 */     bnt bnt1 = bnv.d(☃);
/* 107 */     if (this.h != null && this.h != bnt1) {
/* 108 */       return false;
/*     */     }
/* 110 */     return true;
/*     */   }
/*     */   
/*     */   public static bq a(@Nullable JsonElement ☃) {
/* 114 */     if (☃ == null || ☃.isJsonNull()) {
/* 115 */       return a;
/*     */     }
/* 117 */     JsonObject jsonObject = afd.m(☃, "item");
/* 118 */     bz.d d1 = bz.d.a(jsonObject.get("count"));
/* 119 */     bz.d d2 = bz.d.a(jsonObject.get("durability"));
/* 120 */     if (jsonObject.has("data")) {
/* 121 */       throw new JsonParseException("Disallowed data tag found");
/*     */     }
/* 123 */     cb cb1 = cb.a(jsonObject.get("nbt"));
/* 124 */     blx blx1 = null;
/* 125 */     if (jsonObject.has("item")) {
/* 126 */       vk vk = new vk(afd.h(jsonObject, "item"));
/* 127 */       blx1 = (blx)gm.T.b(vk).orElseThrow(() -> new JsonSyntaxException("Unknown item id '" + ☃ + "'"));
/*     */     } 
/* 129 */     ael<blx> ael1 = null;
/* 130 */     if (jsonObject.has("tag")) {
/* 131 */       vk vk = new vk(afd.h(jsonObject, "tag"));
/* 132 */       ael1 = aeh.a().b().a(vk);
/* 133 */       if (ael1 == null) {
/* 134 */         throw new JsonSyntaxException("Unknown item tag '" + vk + "'");
/*     */       }
/*     */     } 
/* 137 */     bnt bnt1 = null;
/* 138 */     if (jsonObject.has("potion")) {
/* 139 */       vk vk = new vk(afd.h(jsonObject, "potion"));
/* 140 */       bnt1 = (bnt)gm.U.b(vk).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + ☃ + "'"));
/*     */     } 
/*     */     
/* 143 */     bb[] arrayOfBb1 = bb.b(jsonObject.get("enchantments"));
/* 144 */     bb[] arrayOfBb2 = bb.b(jsonObject.get("stored_enchantments"));
/* 145 */     return new bq(ael1, blx1, d1, d2, arrayOfBb1, arrayOfBb2, bnt1, cb1);
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 149 */     if (this == a) {
/* 150 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 153 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 155 */     if (this.c != null) {
/* 156 */       ☃.addProperty("item", gm.T.b(this.c).toString());
/*     */     }
/*     */     
/* 159 */     if (this.b != null) {
/* 160 */       ☃.addProperty("tag", aeh.a().b().b(this.b).toString());
/*     */     }
/*     */     
/* 163 */     ☃.add("count", this.d.d());
/* 164 */     ☃.add("durability", this.e.d());
/* 165 */     ☃.add("nbt", this.i.a());
/*     */     
/* 167 */     if (this.f.length > 0) {
/* 168 */       JsonArray jsonArray = new JsonArray();
/* 169 */       for (bb bb1 : this.f) {
/* 170 */         jsonArray.add(bb1.a());
/*     */       }
/* 172 */       ☃.add("enchantments", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 175 */     if (this.g.length > 0) {
/* 176 */       JsonArray jsonArray = new JsonArray();
/* 177 */       for (bb bb1 : this.g) {
/* 178 */         jsonArray.add(bb1.a());
/*     */       }
/* 180 */       ☃.add("stored_enchantments", (JsonElement)jsonArray);
/*     */     } 
/*     */     
/* 183 */     if (this.h != null) {
/* 184 */       ☃.addProperty("potion", gm.U.b(this.h).toString());
/*     */     }
/*     */     
/* 187 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static bq[] b(@Nullable JsonElement ☃) {
/* 191 */     if (☃ == null || ☃.isJsonNull()) {
/* 192 */       return new bq[0];
/*     */     }
/*     */     
/* 195 */     JsonArray jsonArray = afd.n(☃, "items");
/* 196 */     bq[] arrayOfBq = new bq[jsonArray.size()];
/*     */     
/* 198 */     for (int i = 0; i < arrayOfBq.length; i++) {
/* 199 */       arrayOfBq[i] = a(jsonArray.get(i));
/*     */     }
/*     */     
/* 202 */     return arrayOfBq;
/*     */   }
/*     */   
/*     */   public static class a {
/* 206 */     private final List<bb> a = Lists.newArrayList();
/* 207 */     private final List<bb> b = Lists.newArrayList();
/*     */     @Nullable
/*     */     private blx c;
/*     */     @Nullable
/*     */     private ael<blx> d;
/* 212 */     private bz.d e = bz.d.e;
/* 213 */     private bz.d f = bz.d.e;
/*     */     @Nullable
/*     */     private bnt g;
/* 216 */     private cb h = cb.a;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a a() {
/* 222 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(brw ☃) {
/* 226 */       this.c = ☃.h();
/* 227 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ael<blx> ☃) {
/* 231 */       this.d = ☃;
/* 232 */       return this;
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
/*     */ 
/*     */     
/*     */     public a a(md ☃) {
/* 251 */       this.h = new cb(☃);
/* 252 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bb ☃) {
/* 256 */       this.a.add(☃);
/* 257 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public bq b() {
/* 266 */       return new bq(this.d, this.c, this.e, this.f, this.a.<bb>toArray(bb.b), this.b.<bb>toArray(bb.b), this.g, this.h);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */