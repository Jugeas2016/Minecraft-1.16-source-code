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
/*     */ 
/*     */ public class bd
/*     */ {
/*  16 */   public static final bd a = new bd(bq.a, bq.a, bq.a, bq.a, bq.a, bq.a);
/*  17 */   public static final bd b = new bd(bq.a.a().a(bmd.pM).a(bhb.s().o()).b(), bq.a, bq.a, bq.a, bq.a, bq.a);
/*     */   
/*     */   private final bq c;
/*     */   private final bq d;
/*     */   private final bq e;
/*     */   private final bq f;
/*     */   private final bq g;
/*     */   private final bq h;
/*     */   
/*     */   public bd(bq ☃, bq bq1, bq bq2, bq bq3, bq bq4, bq bq5) {
/*  27 */     this.c = ☃;
/*  28 */     this.d = bq1;
/*  29 */     this.e = bq2;
/*  30 */     this.f = bq3;
/*  31 */     this.g = bq4;
/*  32 */     this.h = bq5;
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable aqa ☃) {
/*  36 */     if (this == a) {
/*  37 */       return true;
/*     */     }
/*  39 */     if (!(☃ instanceof aqm)) {
/*  40 */       return false;
/*     */     }
/*     */     
/*  43 */     aqm aqm = (aqm)☃;
/*  44 */     if (!this.c.a(aqm.b(aqf.f))) {
/*  45 */       return false;
/*     */     }
/*  47 */     if (!this.d.a(aqm.b(aqf.e))) {
/*  48 */       return false;
/*     */     }
/*  50 */     if (!this.e.a(aqm.b(aqf.d))) {
/*  51 */       return false;
/*     */     }
/*  53 */     if (!this.f.a(aqm.b(aqf.c))) {
/*  54 */       return false;
/*     */     }
/*  56 */     if (!this.g.a(aqm.b(aqf.a))) {
/*  57 */       return false;
/*     */     }
/*  59 */     if (!this.h.a(aqm.b(aqf.b))) {
/*  60 */       return false;
/*     */     }
/*     */     
/*  63 */     return true;
/*     */   }
/*     */   
/*     */   public static bd a(@Nullable JsonElement ☃) {
/*  67 */     if (☃ == null || ☃.isJsonNull()) {
/*  68 */       return a;
/*     */     }
/*     */     
/*  71 */     JsonObject jsonObject = afd.m(☃, "equipment");
/*  72 */     bq bq1 = bq.a(jsonObject.get("head"));
/*  73 */     bq bq2 = bq.a(jsonObject.get("chest"));
/*  74 */     bq bq3 = bq.a(jsonObject.get("legs"));
/*  75 */     bq bq4 = bq.a(jsonObject.get("feet"));
/*  76 */     bq bq5 = bq.a(jsonObject.get("mainhand"));
/*  77 */     bq bq6 = bq.a(jsonObject.get("offhand"));
/*  78 */     return new bd(bq1, bq2, bq3, bq4, bq5, bq6);
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  82 */     if (this == a) {
/*  83 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  86 */     JsonObject ☃ = new JsonObject();
/*  87 */     ☃.add("head", this.c.a());
/*  88 */     ☃.add("chest", this.d.a());
/*  89 */     ☃.add("legs", this.e.a());
/*  90 */     ☃.add("feet", this.f.a());
/*  91 */     ☃.add("mainhand", this.g.a());
/*  92 */     ☃.add("offhand", this.h.a());
/*  93 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class a {
/*  97 */     private bq a = bq.a;
/*  98 */     private bq b = bq.a;
/*  99 */     private bq c = bq.a;
/* 100 */     private bq d = bq.a;
/* 101 */     private bq e = bq.a;
/* 102 */     private bq f = bq.a;
/*     */     
/*     */     public static a a() {
/* 105 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(bq ☃) {
/* 109 */       this.a = ☃;
/* 110 */       return this;
/*     */     }
/*     */     
/*     */     public a b(bq ☃) {
/* 114 */       this.b = ☃;
/* 115 */       return this;
/*     */     }
/*     */     
/*     */     public a c(bq ☃) {
/* 119 */       this.c = ☃;
/* 120 */       return this;
/*     */     }
/*     */     
/*     */     public a d(bq ☃) {
/* 124 */       this.d = ☃;
/* 125 */       return this;
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
/*     */     public bd b() {
/* 139 */       return new bd(this.a, this.b, this.c, this.d, this.e, this.f);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */