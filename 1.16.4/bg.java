/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bg
/*     */ {
/*  29 */   public static final bg a = new bg(bh.a, ay.a, bw.a, ca.a, cb.a, be.a, bd.a, cg.a, bj.a, null, null);
/*     */   
/*     */   private final bh b;
/*     */   
/*     */   private final ay c;
/*     */   
/*     */   private final bw d;
/*     */   
/*     */   private final ca e;
/*     */   private final cb f;
/*     */   private final be g;
/*     */   private final bd h;
/*     */   private final cg i;
/*     */   private final bj j;
/*     */   private final bg k;
/*     */   private final bg l;
/*     */   @Nullable
/*     */   private final String m;
/*     */   @Nullable
/*     */   private final vk n;
/*     */   
/*     */   private bg(bh ☃, ay ay1, bw bw1, ca ca1, cb cb1, be be1, bd bd1, cg cg1, bj bj1, @Nullable String str, @Nullable vk vk1) {
/*  51 */     this.b = ☃;
/*  52 */     this.c = ay1;
/*  53 */     this.d = bw1;
/*  54 */     this.e = ca1;
/*  55 */     this.f = cb1;
/*  56 */     this.g = be1;
/*  57 */     this.h = bd1;
/*  58 */     this.i = cg1;
/*  59 */     this.j = bj1;
/*  60 */     this.k = this;
/*  61 */     this.l = this;
/*  62 */     this.m = str;
/*  63 */     this.n = vk1;
/*     */   }
/*     */   
/*     */   private bg(bh ☃, ay ay1, bw bw1, ca ca1, cb cb1, be be1, bd bd1, cg cg1, bj bj1, bg bg1, bg bg2, @Nullable String str, @Nullable vk vk1) {
/*  67 */     this.b = ☃;
/*  68 */     this.c = ay1;
/*  69 */     this.d = bw1;
/*  70 */     this.e = ca1;
/*  71 */     this.f = cb1;
/*  72 */     this.g = be1;
/*  73 */     this.h = bd1;
/*  74 */     this.i = cg1;
/*  75 */     this.j = bj1;
/*  76 */     this.k = bg1;
/*  77 */     this.l = bg2;
/*  78 */     this.m = str;
/*  79 */     this.n = vk1;
/*     */   }
/*     */   
/*     */   public boolean a(aah ☃, @Nullable aqa aqa1) {
/*  83 */     return a(☃.u(), ☃.cA(), aqa1);
/*     */   }
/*     */   
/*     */   public boolean a(aag ☃, @Nullable dcn dcn1, @Nullable aqa aqa1) {
/*  87 */     if (this == a) {
/*  88 */       return true;
/*     */     }
/*  90 */     if (aqa1 == null) {
/*  91 */       return false;
/*     */     }
/*  93 */     if (!this.b.a(aqa1.X())) {
/*  94 */       return false;
/*     */     }
/*  96 */     if (dcn1 == null) {
/*  97 */       if (this.c != ay.a) {
/*  98 */         return false;
/*     */       }
/*     */     }
/* 101 */     else if (!this.c.a(dcn1.b, dcn1.c, dcn1.d, aqa1.cD(), aqa1.cE(), aqa1.cH())) {
/* 102 */       return false;
/*     */     } 
/*     */     
/* 105 */     if (!this.d.a(☃, aqa1.cD(), aqa1.cE(), aqa1.cH())) {
/* 106 */       return false;
/*     */     }
/* 108 */     if (!this.e.a(aqa1)) {
/* 109 */       return false;
/*     */     }
/* 111 */     if (!this.f.a(aqa1)) {
/* 112 */       return false;
/*     */     }
/* 114 */     if (!this.g.a(aqa1)) {
/* 115 */       return false;
/*     */     }
/*     */     
/* 118 */     if (!this.h.a(aqa1)) {
/* 119 */       return false;
/*     */     }
/*     */     
/* 122 */     if (!this.i.a(aqa1)) {
/* 123 */       return false;
/*     */     }
/*     */     
/* 126 */     if (!this.j.a(aqa1)) {
/* 127 */       return false;
/*     */     }
/*     */     
/* 130 */     if (!this.k.a(☃, dcn1, aqa1.ct())) {
/* 131 */       return false;
/*     */     }
/*     */     
/* 134 */     if (!this.l.a(☃, dcn1, (aqa1 instanceof aqn) ? ((aqn)aqa1).A() : null)) {
/* 135 */       return false;
/*     */     }
/*     */     
/* 138 */     if (this.m != null) {
/* 139 */       ddp ddp = aqa1.bG();
/* 140 */       if (ddp == null || !this.m.equals(ddp.b())) {
/* 141 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 145 */     if (this.n != null && (
/* 146 */       !(aqa1 instanceof bab) || !((bab)aqa1).eU().equals(this.n))) {
/* 147 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 151 */     return true;
/*     */   }
/*     */   
/*     */   public static bg a(@Nullable JsonElement ☃) {
/* 155 */     if (☃ == null || ☃.isJsonNull()) {
/* 156 */       return a;
/*     */     }
/*     */     
/* 159 */     JsonObject jsonObject = afd.m(☃, "entity");
/*     */     
/* 161 */     bh bh1 = bh.a(jsonObject.get("type"));
/* 162 */     ay ay1 = ay.a(jsonObject.get("distance"));
/* 163 */     bw bw1 = bw.a(jsonObject.get("location"));
/* 164 */     ca ca1 = ca.a(jsonObject.get("effects"));
/* 165 */     cb cb1 = cb.a(jsonObject.get("nbt"));
/* 166 */     be be1 = be.a(jsonObject.get("flags"));
/* 167 */     bd bd1 = bd.a(jsonObject.get("equipment"));
/* 168 */     cg cg1 = cg.a(jsonObject.get("player"));
/* 169 */     bj bj1 = bj.a(jsonObject.get("fishing_hook"));
/* 170 */     bg bg1 = a(jsonObject.get("vehicle"));
/* 171 */     bg bg2 = a(jsonObject.get("targeted_entity"));
/* 172 */     String str = afd.a(jsonObject, "team", (String)null);
/* 173 */     vk vk1 = jsonObject.has("catType") ? new vk(afd.h(jsonObject, "catType")) : null;
/*     */     
/* 175 */     return (new a())
/* 176 */       .a(bh1)
/* 177 */       .a(ay1)
/* 178 */       .a(bw1)
/* 179 */       .a(ca1)
/* 180 */       .a(cb1)
/* 181 */       .a(be1)
/* 182 */       .a(bd1)
/* 183 */       .a(cg1)
/* 184 */       .a(bj1)
/* 185 */       .a(str)
/* 186 */       .a(bg1)
/* 187 */       .b(bg2)
/* 188 */       .b(vk1)
/* 189 */       .b();
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 193 */     if (this == a) {
/* 194 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 197 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 199 */     ☃.add("type", this.b.a());
/* 200 */     ☃.add("distance", this.c.a());
/* 201 */     ☃.add("location", this.d.a());
/* 202 */     ☃.add("effects", this.e.b());
/* 203 */     ☃.add("nbt", this.f.a());
/* 204 */     ☃.add("flags", this.g.a());
/* 205 */     ☃.add("equipment", this.h.a());
/* 206 */     ☃.add("player", this.i.a());
/* 207 */     ☃.add("fishing_hook", this.j.a());
/* 208 */     ☃.add("vehicle", this.k.a());
/* 209 */     ☃.add("targeted_entity", this.l.a());
/* 210 */     ☃.addProperty("team", this.m);
/* 211 */     if (this.n != null) {
/* 212 */       ☃.addProperty("catType", this.n.toString());
/*     */     }
/*     */     
/* 215 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static cyv b(aah ☃, aqa aqa1) {
/* 219 */     return (new cyv.a(☃.u()))
/* 220 */       .<aqa>a(dbc.a, aqa1)
/* 221 */       .<dcn>a(dbc.f, ☃.cA())
/* 222 */       .a(☃.cY())
/* 223 */       .a(dbb.j);
/*     */   }
/*     */   
/*     */   public static class a {
/* 227 */     private bh a = bh.a;
/* 228 */     private ay b = ay.a;
/* 229 */     private bw c = bw.a;
/* 230 */     private ca d = ca.a;
/* 231 */     private cb e = cb.a;
/* 232 */     private be f = be.a;
/* 233 */     private bd g = bd.a;
/* 234 */     private cg h = cg.a;
/* 235 */     private bj i = bj.a;
/* 236 */     private bg j = bg.a;
/* 237 */     private bg k = bg.a;
/*     */     private String l;
/*     */     private vk m;
/*     */     
/*     */     public static a a() {
/* 242 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(aqe<?> ☃) {
/* 246 */       this.a = bh.b(☃);
/* 247 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ael<aqe<?>> ☃) {
/* 251 */       this.a = bh.a(☃);
/* 252 */       return this;
/*     */     }
/*     */     
/*     */     public a a(vk ☃) {
/* 256 */       this.m = ☃;
/* 257 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bh ☃) {
/* 261 */       this.a = ☃;
/* 262 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ay ☃) {
/* 266 */       this.b = ☃;
/* 267 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bw ☃) {
/* 271 */       this.c = ☃;
/* 272 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ca ☃) {
/* 276 */       this.d = ☃;
/* 277 */       return this;
/*     */     }
/*     */     
/*     */     public a a(cb ☃) {
/* 281 */       this.e = ☃;
/* 282 */       return this;
/*     */     }
/*     */     
/*     */     public a a(be ☃) {
/* 286 */       this.f = ☃;
/* 287 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bd ☃) {
/* 291 */       this.g = ☃;
/* 292 */       return this;
/*     */     }
/*     */     
/*     */     public a a(cg ☃) {
/* 296 */       this.h = ☃;
/* 297 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bj ☃) {
/* 301 */       this.i = ☃;
/* 302 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bg ☃) {
/* 306 */       this.j = ☃;
/* 307 */       return this;
/*     */     }
/*     */     
/*     */     public a b(bg ☃) {
/* 311 */       this.k = ☃;
/* 312 */       return this;
/*     */     }
/*     */     
/*     */     public a a(@Nullable String ☃) {
/* 316 */       this.l = ☃;
/* 317 */       return this;
/*     */     }
/*     */     
/*     */     public a b(@Nullable vk ☃) {
/* 321 */       this.m = ☃;
/* 322 */       return this;
/*     */     }
/*     */     
/*     */     public bg b() {
/* 326 */       return new bg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b {
/* 331 */     public static final b a = new b(new dbo[0]);
/*     */     
/*     */     private final dbo[] b;
/*     */     private final Predicate<cyv> c;
/*     */     
/*     */     private b(dbo[] ☃) {
/* 337 */       this.b = ☃;
/* 338 */       this.c = dbq.a((Predicate<cyv>[])☃);
/*     */     }
/*     */     
/*     */     public static b a(dbo... ☃) {
/* 342 */       return new b(☃);
/*     */     }
/*     */     
/*     */     public static b a(JsonObject ☃, String str, ax ax1) {
/* 346 */       JsonElement jsonElement = ☃.get(str);
/* 347 */       return a(str, ax1, jsonElement);
/*     */     }
/*     */     
/*     */     public static b[] b(JsonObject ☃, String str, ax ax1) {
/* 351 */       JsonElement jsonElement = ☃.get(str);
/* 352 */       if (jsonElement == null || jsonElement.isJsonNull()) {
/* 353 */         return new b[0];
/*     */       }
/* 355 */       JsonArray jsonArray = afd.n(jsonElement, str);
/* 356 */       b[] arrayOfB = new b[jsonArray.size()];
/*     */       
/* 358 */       for (int i = 0; i < jsonArray.size(); i++) {
/* 359 */         arrayOfB[i] = a(str + "[" + i + "]", ax1, jsonArray.get(i));
/*     */       }
/*     */       
/* 362 */       return arrayOfB;
/*     */     }
/*     */     
/*     */     private static b a(String ☃, ax ax1, @Nullable JsonElement jsonElement) {
/* 366 */       if (jsonElement != null && jsonElement.isJsonArray()) {
/* 367 */         dbo[] arrayOfDbo = ax1.a(jsonElement.getAsJsonArray(), ax1.a().toString() + "/" + ☃, dbb.j);
/* 368 */         return new b(arrayOfDbo);
/*     */       } 
/*     */ 
/*     */       
/* 372 */       bg bg = bg.a(jsonElement);
/* 373 */       return a(bg);
/*     */     }
/*     */     
/*     */     public static b a(bg ☃) {
/* 377 */       if (☃ == bg.a) {
/* 378 */         return a;
/*     */       }
/* 380 */       dbo dbo1 = dbr.a(cyv.c.a, ☃).build();
/* 381 */       return new b(new dbo[] { dbo1 });
/*     */     }
/*     */     
/*     */     public boolean a(cyv ☃) {
/* 385 */       return this.c.test(☃);
/*     */     }
/*     */     
/*     */     public JsonElement a(ci ☃) {
/* 389 */       if (this.b.length == 0) {
/* 390 */         return (JsonElement)JsonNull.INSTANCE;
/*     */       }
/*     */       
/* 393 */       return ☃.a(this.b);
/*     */     }
/*     */     
/*     */     public static JsonElement a(b[] ☃, ci ci1) {
/* 397 */       if (☃.length == 0) {
/* 398 */         return (JsonElement)JsonNull.INSTANCE;
/*     */       }
/*     */       
/* 401 */       JsonArray jsonArray = new JsonArray();
/* 402 */       for (b b1 : ☃) {
/* 403 */         jsonArray.add(b1.a(ci1));
/*     */       }
/* 405 */       return (JsonElement)jsonArray;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */