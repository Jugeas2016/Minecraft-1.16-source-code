/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
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
/*     */ public class an
/*     */ {
/*  22 */   public static final an a = new an(null, null, cm.a, cb.a);
/*     */   
/*     */   @Nullable
/*     */   private final ael<buo> b;
/*     */   @Nullable
/*     */   private final buo c;
/*     */   private final cm d;
/*     */   private final cb e;
/*     */   
/*     */   public an(@Nullable ael<buo> ☃, @Nullable buo buo1, cm cm1, cb cb1) {
/*  32 */     this.b = ☃;
/*  33 */     this.c = buo1;
/*  34 */     this.d = cm1;
/*  35 */     this.e = cb1;
/*     */   }
/*     */   
/*     */   public boolean a(aag ☃, fx fx1) {
/*  39 */     if (this == a) {
/*  40 */       return true;
/*     */     }
/*  42 */     if (!☃.p(fx1)) {
/*  43 */       return false;
/*     */     }
/*  45 */     ceh ceh = ☃.d_(fx1);
/*     */     
/*  47 */     buo buo1 = ceh.b();
/*  48 */     if (this.b != null && !this.b.a(buo1)) {
/*  49 */       return false;
/*     */     }
/*  51 */     if (this.c != null && buo1 != this.c) {
/*  52 */       return false;
/*     */     }
/*  54 */     if (!this.d.a(ceh)) {
/*  55 */       return false;
/*     */     }
/*  57 */     if (this.e != cb.a) {
/*  58 */       ccj ccj = ☃.c(fx1);
/*  59 */       if (ccj == null || !this.e.a(ccj.a(new md()))) {
/*  60 */         return false;
/*     */       }
/*     */     } 
/*  63 */     return true;
/*     */   }
/*     */   
/*     */   public static an a(@Nullable JsonElement ☃) {
/*  67 */     if (☃ == null || ☃.isJsonNull()) {
/*  68 */       return a;
/*     */     }
/*  70 */     JsonObject jsonObject = afd.m(☃, "block");
/*     */     
/*  72 */     cb cb1 = cb.a(jsonObject.get("nbt"));
/*  73 */     buo buo1 = null;
/*  74 */     if (jsonObject.has("block")) {
/*  75 */       vk vk = new vk(afd.h(jsonObject, "block"));
/*  76 */       buo1 = gm.Q.a(vk);
/*     */     } 
/*     */     
/*  79 */     ael<buo> ael1 = null;
/*  80 */     if (jsonObject.has("tag")) {
/*  81 */       vk vk = new vk(afd.h(jsonObject, "tag"));
/*  82 */       ael1 = aeh.a().a().a(vk);
/*  83 */       if (ael1 == null) {
/*  84 */         throw new JsonSyntaxException("Unknown block tag '" + vk + "'");
/*     */       }
/*     */     } 
/*  87 */     cm cm1 = cm.a(jsonObject.get("state"));
/*  88 */     return new an(ael1, buo1, cm1, cb1);
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/*  92 */     if (this == a) {
/*  93 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  96 */     JsonObject ☃ = new JsonObject();
/*  97 */     if (this.c != null) {
/*  98 */       ☃.addProperty("block", gm.Q.b(this.c).toString());
/*     */     }
/* 100 */     if (this.b != null) {
/* 101 */       ☃.addProperty("tag", aeh.a().a().b(this.b).toString());
/*     */     }
/* 103 */     ☃.add("nbt", this.e.a());
/* 104 */     ☃.add("state", this.d.a());
/*     */     
/* 106 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     @Nullable
/*     */     private buo a;
/*     */     @Nullable
/*     */     private ael<buo> b;
/* 114 */     private cm c = cm.a;
/* 115 */     private cb d = cb.a;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static a a() {
/* 121 */       return new a();
/*     */     }
/*     */     
/*     */     public a a(buo ☃) {
/* 125 */       this.a = ☃;
/* 126 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ael<buo> ☃) {
/* 130 */       this.b = ☃;
/* 131 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(cm ☃) {
/* 140 */       this.c = ☃;
/* 141 */       return this;
/*     */     }
/*     */     
/*     */     public an b() {
/* 145 */       return new an(this.b, this.a, this.c, this.d);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */