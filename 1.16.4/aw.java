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
/*     */ 
/*     */ 
/*     */ public class aw
/*     */ {
/*  15 */   public static final aw a = a.a().b();
/*     */   
/*     */   private final Boolean b;
/*     */   private final Boolean c;
/*     */   private final Boolean d;
/*     */   private final Boolean e;
/*     */   private final Boolean f;
/*     */   private final Boolean g;
/*     */   private final Boolean h;
/*     */   private final Boolean i;
/*     */   private final bg j;
/*     */   private final bg k;
/*     */   
/*     */   public aw(@Nullable Boolean ☃, @Nullable Boolean bool1, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7, bg bg1, bg bg2) {
/*  29 */     this.b = ☃;
/*  30 */     this.c = bool1;
/*  31 */     this.d = bool2;
/*  32 */     this.e = bool3;
/*  33 */     this.f = bool4;
/*  34 */     this.g = bool5;
/*  35 */     this.h = bool6;
/*  36 */     this.i = bool7;
/*  37 */     this.j = bg1;
/*  38 */     this.k = bg2;
/*     */   }
/*     */   
/*     */   public boolean a(aah ☃, apk apk1) {
/*  42 */     return a(☃.u(), ☃.cA(), apk1);
/*     */   }
/*     */   
/*     */   public boolean a(aag ☃, dcn dcn1, apk apk1) {
/*  46 */     if (this == a) {
/*  47 */       return true;
/*     */     }
/*  49 */     if (this.b != null && this.b.booleanValue() != apk1.b()) {
/*  50 */       return false;
/*     */     }
/*  52 */     if (this.c != null && this.c.booleanValue() != apk1.d()) {
/*  53 */       return false;
/*     */     }
/*  55 */     if (this.d != null && this.d.booleanValue() != apk1.f()) {
/*  56 */       return false;
/*     */     }
/*  58 */     if (this.e != null && this.e.booleanValue() != apk1.h()) {
/*  59 */       return false;
/*     */     }
/*  61 */     if (this.f != null && this.f.booleanValue() != apk1.i()) {
/*  62 */       return false;
/*     */     }
/*  64 */     if (this.g != null && this.g.booleanValue() != apk1.p()) {
/*  65 */       return false;
/*     */     }
/*  67 */     if (this.h != null && this.h.booleanValue() != apk1.t()) {
/*  68 */       return false;
/*     */     }
/*  70 */     if (this.i != null && this.i.booleanValue() != ((apk1 == apk.b))) {
/*  71 */       return false;
/*     */     }
/*  73 */     if (!this.j.a(☃, dcn1, apk1.j())) {
/*  74 */       return false;
/*     */     }
/*  76 */     if (!this.k.a(☃, dcn1, apk1.k())) {
/*  77 */       return false;
/*     */     }
/*  79 */     return true;
/*     */   }
/*     */   
/*     */   public static aw a(@Nullable JsonElement ☃) {
/*  83 */     if (☃ == null || ☃.isJsonNull()) {
/*  84 */       return a;
/*     */     }
/*  86 */     JsonObject jsonObject = afd.m(☃, "damage type");
/*  87 */     Boolean bool1 = a(jsonObject, "is_projectile");
/*  88 */     Boolean bool2 = a(jsonObject, "is_explosion");
/*  89 */     Boolean bool3 = a(jsonObject, "bypasses_armor");
/*  90 */     Boolean bool4 = a(jsonObject, "bypasses_invulnerability");
/*  91 */     Boolean bool5 = a(jsonObject, "bypasses_magic");
/*  92 */     Boolean bool6 = a(jsonObject, "is_fire");
/*  93 */     Boolean bool7 = a(jsonObject, "is_magic");
/*  94 */     Boolean bool8 = a(jsonObject, "is_lightning");
/*  95 */     bg bg1 = bg.a(jsonObject.get("direct_entity"));
/*  96 */     bg bg2 = bg.a(jsonObject.get("source_entity"));
/*  97 */     return new aw(bool1, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bg1, bg2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Boolean a(JsonObject ☃, String str) {
/* 102 */     return ☃.has(str) ? Boolean.valueOf(afd.j(☃, str)) : null;
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 106 */     if (this == a) {
/* 107 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/* 110 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 112 */     a(☃, "is_projectile", this.b);
/* 113 */     a(☃, "is_explosion", this.c);
/* 114 */     a(☃, "bypasses_armor", this.d);
/* 115 */     a(☃, "bypasses_invulnerability", this.e);
/* 116 */     a(☃, "bypasses_magic", this.f);
/* 117 */     a(☃, "is_fire", this.g);
/* 118 */     a(☃, "is_magic", this.h);
/* 119 */     a(☃, "is_lightning", this.i);
/* 120 */     ☃.add("direct_entity", this.j.a());
/* 121 */     ☃.add("source_entity", this.k.a());
/*     */     
/* 123 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   private void a(JsonObject ☃, String str, @Nullable Boolean bool) {
/* 127 */     if (bool != null)
/* 128 */       ☃.addProperty(str, bool); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */   {
/*     */     private Boolean a;
/*     */     private Boolean b;
/*     */     private Boolean c;
/*     */     private Boolean d;
/*     */     private Boolean e;
/*     */     private Boolean f;
/*     */     private Boolean g;
/*     */     private Boolean h;
/* 141 */     private bg i = bg.a;
/* 142 */     private bg j = bg.a;
/*     */     
/*     */     public static a a() {
/* 145 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(Boolean ☃) {
/* 149 */       this.a = ☃;
/* 150 */       return this;
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
/*     */     public a h(Boolean ☃) {
/* 184 */       this.h = ☃;
/* 185 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(bg.a ☃) {
/* 194 */       this.i = ☃.b();
/* 195 */       return this;
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
/*     */     public aw b() {
/* 209 */       return new aw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */