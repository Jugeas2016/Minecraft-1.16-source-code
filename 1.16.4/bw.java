/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import java.util.Optional;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class bw
/*     */ {
/*  24 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  26 */   public static final bw a = new bw(bz.c.e, bz.c.e, bz.c.e, null, null, null, null, bv.a, an.a, bl.a);
/*     */   
/*     */   private final bz.c c;
/*     */   private final bz.c d;
/*     */   private final bz.c e;
/*     */   @Nullable
/*     */   private final vj<bsv> f;
/*     */   @Nullable
/*     */   private final cla<?> g;
/*     */   @Nullable
/*     */   private final vj<brx> h;
/*     */   @Nullable
/*     */   private final Boolean i;
/*     */   private final bv j;
/*     */   private final an k;
/*     */   private final bl l;
/*     */   
/*     */   public bw(bz.c ☃, bz.c c1, bz.c c2, @Nullable vj<bsv> vj1, @Nullable cla<?> cla1, @Nullable vj<brx> vj2, @Nullable Boolean bool, bv bv1, an an1, bl bl1) {
/*  44 */     this.c = ☃;
/*  45 */     this.d = c1;
/*  46 */     this.e = c2;
/*  47 */     this.f = vj1;
/*  48 */     this.g = cla1;
/*  49 */     this.h = vj2;
/*  50 */     this.i = bool;
/*  51 */     this.j = bv1;
/*  52 */     this.k = an1;
/*  53 */     this.l = bl1;
/*     */   }
/*     */   
/*     */   public static bw a(vj<bsv> ☃) {
/*  57 */     return new bw(bz.c.e, bz.c.e, bz.c.e, ☃, null, null, null, bv.a, an.a, bl.a);
/*     */   }
/*     */   
/*     */   public static bw b(vj<brx> ☃) {
/*  61 */     return new bw(bz.c.e, bz.c.e, bz.c.e, null, null, ☃, null, bv.a, an.a, bl.a);
/*     */   }
/*     */   
/*     */   public static bw a(cla<?> ☃) {
/*  65 */     return new bw(bz.c.e, bz.c.e, bz.c.e, null, ☃, null, null, bv.a, an.a, bl.a);
/*     */   }
/*     */   
/*     */   public boolean a(aag ☃, double d1, double d2, double d3) {
/*  69 */     return a(☃, (float)d1, (float)d2, (float)d3);
/*     */   }
/*     */   
/*     */   public boolean a(aag ☃, float f1, float f2, float f3) {
/*  73 */     if (!this.c.d(f1)) {
/*  74 */       return false;
/*     */     }
/*  76 */     if (!this.d.d(f2)) {
/*  77 */       return false;
/*     */     }
/*  79 */     if (!this.e.d(f3)) {
/*  80 */       return false;
/*     */     }
/*  82 */     if (this.h != null && this.h != ☃.Y()) {
/*  83 */       return false;
/*     */     }
/*     */     
/*  86 */     fx fx = new fx(f1, f2, f3);
/*  87 */     boolean bool = ☃.p(fx);
/*     */     
/*  89 */     Optional<vj<bsv>> optional = ☃.r().<bsv>b(gm.ay).c(☃.v(fx));
/*  90 */     if (!optional.isPresent()) {
/*  91 */       return false;
/*     */     }
/*  93 */     if (this.f != null && (!bool || this.f != optional.get())) {
/*  94 */       return false;
/*     */     }
/*  96 */     if (this.g != null && (!bool || !☃.a().a(fx, true, this.g).e())) {
/*  97 */       return false;
/*     */     }
/*  99 */     if (this.i != null && (!bool || this.i.booleanValue() != buy.a(☃, fx))) {
/* 100 */       return false;
/*     */     }
/* 102 */     if (!this.j.a(☃, fx)) {
/* 103 */       return false;
/*     */     }
/* 105 */     if (!this.k.a(☃, fx)) {
/* 106 */       return false;
/*     */     }
/* 108 */     if (!this.l.a(☃, fx)) {
/* 109 */       return false;
/*     */     }
/*     */     
/* 112 */     return true;
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 116 */     if (this == a) {
/* 117 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 120 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 122 */     if (!this.c.c() || !this.d.c() || !this.e.c()) {
/* 123 */       JsonObject jsonObject = new JsonObject();
/* 124 */       jsonObject.add("x", this.c.d());
/* 125 */       jsonObject.add("y", this.d.d());
/* 126 */       jsonObject.add("z", this.e.d());
/* 127 */       ☃.add("position", (JsonElement)jsonObject);
/*     */     } 
/* 129 */     if (this.h != null) {
/* 130 */       brx.f.encodeStart((DynamicOps)JsonOps.INSTANCE, this.h).resultOrPartial(b::error).ifPresent(jsonElement -> ☃.add("dimension", jsonElement));
/*     */     }
/* 132 */     if (this.g != null) {
/* 133 */       ☃.addProperty("feature", this.g.i());
/*     */     }
/* 135 */     if (this.f != null) {
/* 136 */       ☃.addProperty("biome", this.f.a().toString());
/*     */     }
/* 138 */     if (this.i != null) {
/* 139 */       ☃.addProperty("smokey", this.i);
/*     */     }
/* 141 */     ☃.add("light", this.j.a());
/* 142 */     ☃.add("block", this.k.a());
/* 143 */     ☃.add("fluid", this.l.a());
/*     */     
/* 145 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static bw a(@Nullable JsonElement ☃) {
/* 149 */     if (☃ == null || ☃.isJsonNull()) {
/* 150 */       return a;
/*     */     }
/* 152 */     JsonObject jsonObject1 = afd.m(☃, "location");
/* 153 */     JsonObject jsonObject2 = afd.a(jsonObject1, "position", new JsonObject());
/* 154 */     bz.c c1 = bz.c.a(jsonObject2.get("x"));
/* 155 */     bz.c c2 = bz.c.a(jsonObject2.get("y"));
/* 156 */     bz.c c3 = bz.c.a(jsonObject2.get("z"));
/* 157 */     vj<brx> vj1 = jsonObject1.has("dimension") ? vk.a.parse((DynamicOps)JsonOps.INSTANCE, jsonObject1.get("dimension")).resultOrPartial(b::error).map(☃ -> vj.a(gm.L, ☃)).orElse(null) : null;
/* 158 */     cla<?> cla1 = jsonObject1.has("feature") ? (cla)cla.a.get(afd.h(jsonObject1, "feature")) : null;
/* 159 */     vj<bsv> vj2 = null;
/* 160 */     if (jsonObject1.has("biome")) {
/* 161 */       vk vk = new vk(afd.h(jsonObject1, "biome"));
/* 162 */       vj2 = vj.a(gm.ay, vk);
/*     */     } 
/* 164 */     Boolean bool = jsonObject1.has("smokey") ? Boolean.valueOf(jsonObject1.get("smokey").getAsBoolean()) : null;
/* 165 */     bv bv1 = bv.a(jsonObject1.get("light"));
/* 166 */     an an1 = an.a(jsonObject1.get("block"));
/* 167 */     bl bl1 = bl.a(jsonObject1.get("fluid"));
/* 168 */     return new bw(c1, c2, c3, vj2, cla1, vj1, bool, bv1, an1, bl1);
/*     */   }
/*     */   
/*     */   public static class a {
/* 172 */     private bz.c a = bz.c.e;
/* 173 */     private bz.c b = bz.c.e;
/* 174 */     private bz.c c = bz.c.e;
/*     */     
/*     */     @Nullable
/*     */     private vj<bsv> d;
/*     */     
/*     */     @Nullable
/*     */     private cla<?> e;
/*     */     @Nullable
/*     */     private vj<brx> f;
/*     */     @Nullable
/*     */     private Boolean g;
/* 185 */     private bv h = bv.a;
/* 186 */     private an i = an.a;
/* 187 */     private bl j = bl.a;
/*     */     
/*     */     public static a a() {
/* 190 */       return new a();
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
/*     */     public a a(@Nullable vj<bsv> ☃) {
/* 209 */       this.d = ☃;
/* 210 */       return this;
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
/*     */     public a a(an ☃) {
/* 229 */       this.i = ☃;
/* 230 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(Boolean ☃) {
/* 239 */       this.g = ☃;
/* 240 */       return this;
/*     */     }
/*     */     
/*     */     public bw b() {
/* 244 */       return new bw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */