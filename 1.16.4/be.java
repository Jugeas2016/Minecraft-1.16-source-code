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
/*     */ public class be
/*     */ {
/*  13 */   public static final be a = (new a()).b();
/*     */   
/*     */   @Nullable
/*     */   private final Boolean b;
/*     */   
/*     */   @Nullable
/*     */   private final Boolean c;
/*     */   
/*     */   @Nullable
/*     */   private final Boolean d;
/*     */   
/*     */   @Nullable
/*     */   private final Boolean e;
/*     */   
/*     */   @Nullable
/*     */   private final Boolean f;
/*     */   
/*     */   public be(@Nullable Boolean ☃, @Nullable Boolean bool1, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4) {
/*  31 */     this.b = ☃;
/*  32 */     this.c = bool1;
/*  33 */     this.d = bool2;
/*  34 */     this.e = bool3;
/*  35 */     this.f = bool4;
/*     */   }
/*     */   
/*     */   public boolean a(aqa ☃) {
/*  39 */     if (this.b != null && ☃.bq() != this.b.booleanValue()) {
/*  40 */       return false;
/*     */     }
/*     */     
/*  43 */     if (this.c != null && ☃.bz() != this.c.booleanValue()) {
/*  44 */       return false;
/*     */     }
/*     */     
/*  47 */     if (this.d != null && ☃.bA() != this.d.booleanValue()) {
/*  48 */       return false;
/*     */     }
/*     */     
/*  51 */     if (this.e != null && ☃.bB() != this.e.booleanValue()) {
/*  52 */       return false;
/*     */     }
/*     */     
/*  55 */     if (this.f != null && ☃ instanceof aqm && ((aqm)☃).w_() != this.f.booleanValue()) {
/*  56 */       return false;
/*     */     }
/*     */     
/*  59 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static Boolean a(JsonObject ☃, String str) {
/*  64 */     return ☃.has(str) ? Boolean.valueOf(afd.j(☃, str)) : null;
/*     */   }
/*     */   
/*     */   public static be a(@Nullable JsonElement ☃) {
/*  68 */     if (☃ == null || ☃.isJsonNull()) {
/*  69 */       return a;
/*     */     }
/*     */     
/*  72 */     JsonObject jsonObject = afd.m(☃, "entity flags");
/*  73 */     Boolean bool1 = a(jsonObject, "is_on_fire");
/*     */     
/*  75 */     Boolean bool2 = a(jsonObject, "is_sneaking");
/*  76 */     Boolean bool3 = a(jsonObject, "is_sprinting");
/*  77 */     Boolean bool4 = a(jsonObject, "is_swimming");
/*  78 */     Boolean bool5 = a(jsonObject, "is_baby");
/*     */     
/*  80 */     return new be(bool1, bool2, bool3, bool4, bool5);
/*     */   }
/*     */   
/*     */   private void a(JsonObject ☃, String str, @Nullable Boolean bool) {
/*  84 */     if (bool != null) {
/*  85 */       ☃.addProperty(str, bool);
/*     */     }
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  90 */     if (this == a) {
/*  91 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  94 */     JsonObject ☃ = new JsonObject();
/*  95 */     a(☃, "is_on_fire", this.b);
/*     */     
/*  97 */     a(☃, "is_sneaking", this.c);
/*  98 */     a(☃, "is_sprinting", this.d);
/*  99 */     a(☃, "is_swimming", this.e);
/* 100 */     a(☃, "is_baby", this.f);
/* 101 */     return (JsonElement)☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class a
/*     */   {
/*     */     @Nullable
/*     */     private Boolean a;
/*     */     
/*     */     @Nullable
/*     */     private Boolean b;
/*     */     
/*     */     @Nullable
/*     */     private Boolean c;
/*     */     @Nullable
/*     */     private Boolean d;
/*     */     @Nullable
/*     */     private Boolean e;
/*     */     
/*     */     public static a a() {
/* 121 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(@Nullable Boolean ☃) {
/* 125 */       this.a = ☃;
/* 126 */       return this;
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
/*     */     public a e(@Nullable Boolean ☃) {
/* 145 */       this.e = ☃;
/* 146 */       return this;
/*     */     }
/*     */     
/*     */     public be b() {
/* 150 */       return new be(this.a, this.b, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\be.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */