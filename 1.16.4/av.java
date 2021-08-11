/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class av
/*     */ {
/*  13 */   public static final av a = a.a().b();
/*     */   
/*     */   private final bz.c b;
/*     */   private final bz.c c;
/*     */   private final bg d;
/*     */   private final Boolean e;
/*     */   private final aw f;
/*     */   
/*     */   public av() {
/*  22 */     this.b = bz.c.e;
/*  23 */     this.c = bz.c.e;
/*  24 */     this.d = bg.a;
/*  25 */     this.e = null;
/*  26 */     this.f = aw.a;
/*     */   }
/*     */   
/*     */   public av(bz.c ☃, bz.c c1, bg bg1, @Nullable Boolean bool, aw aw1) {
/*  30 */     this.b = ☃;
/*  31 */     this.c = c1;
/*  32 */     this.d = bg1;
/*  33 */     this.e = bool;
/*  34 */     this.f = aw1;
/*     */   }
/*     */   
/*     */   public boolean a(aah ☃, apk apk1, float f1, float f2, boolean bool) {
/*  38 */     if (this == a) {
/*  39 */       return true;
/*     */     }
/*  41 */     if (!this.b.d(f1)) {
/*  42 */       return false;
/*     */     }
/*  44 */     if (!this.c.d(f2)) {
/*  45 */       return false;
/*     */     }
/*  47 */     if (!this.d.a(☃, apk1.k())) {
/*  48 */       return false;
/*     */     }
/*  50 */     if (this.e != null && this.e.booleanValue() != bool) {
/*  51 */       return false;
/*     */     }
/*  53 */     if (!this.f.a(☃, apk1)) {
/*  54 */       return false;
/*     */     }
/*  56 */     return true;
/*     */   }
/*     */   
/*     */   public static av a(@Nullable JsonElement ☃) {
/*  60 */     if (☃ == null || ☃.isJsonNull()) {
/*  61 */       return a;
/*     */     }
/*  63 */     JsonObject jsonObject = afd.m(☃, "damage");
/*  64 */     bz.c c1 = bz.c.a(jsonObject.get("dealt"));
/*  65 */     bz.c c2 = bz.c.a(jsonObject.get("taken"));
/*  66 */     Boolean bool = jsonObject.has("blocked") ? Boolean.valueOf(afd.j(jsonObject, "blocked")) : null;
/*  67 */     bg bg1 = bg.a(jsonObject.get("source_entity"));
/*  68 */     aw aw1 = aw.a(jsonObject.get("type"));
/*  69 */     return new av(c1, c2, bg1, bool, aw1);
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  73 */     if (this == a) {
/*  74 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  77 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  79 */     ☃.add("dealt", this.b.d());
/*  80 */     ☃.add("taken", this.c.d());
/*  81 */     ☃.add("source_entity", this.d.a());
/*  82 */     ☃.add("type", this.f.a());
/*     */     
/*  84 */     if (this.e != null) {
/*  85 */       ☃.addProperty("blocked", this.e);
/*     */     }
/*     */     
/*  88 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class a {
/*  92 */     private bz.c a = bz.c.e;
/*  93 */     private bz.c b = bz.c.e;
/*  94 */     private bg c = bg.a;
/*     */     private Boolean d;
/*  96 */     private aw e = aw.a;
/*     */     
/*     */     public static a a() {
/*  99 */       return new a();
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
/*     */     public a a(Boolean ☃) {
/* 118 */       this.d = ☃;
/* 119 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(aw.a ☃) {
/* 128 */       this.e = ☃.b();
/* 129 */       return this;
/*     */     }
/*     */     
/*     */     public av b() {
/* 133 */       return new av(this.a, this.b, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */