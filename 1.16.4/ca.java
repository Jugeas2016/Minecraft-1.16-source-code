/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonNull;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.Collections;
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
/*     */ public class ca
/*     */ {
/*  21 */   public static final ca a = new ca(Collections.emptyMap());
/*     */   
/*     */   private final Map<aps, a> b;
/*     */   
/*     */   public ca(Map<aps, a> ☃) {
/*  26 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public static ca a() {
/*  30 */     return new ca(Maps.newLinkedHashMap());
/*     */   }
/*     */   
/*     */   public ca a(aps ☃) {
/*  34 */     this.b.put(☃, new a());
/*  35 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(aqa ☃) {
/*  44 */     if (this == a) {
/*  45 */       return true;
/*     */     }
/*  47 */     if (☃ instanceof aqm) {
/*  48 */       return a(((aqm)☃).di());
/*     */     }
/*  50 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(aqm ☃) {
/*  54 */     if (this == a) {
/*  55 */       return true;
/*     */     }
/*  57 */     return a(☃.di());
/*     */   }
/*     */   
/*     */   public boolean a(Map<aps, apu> ☃) {
/*  61 */     if (this == a) {
/*  62 */       return true;
/*     */     }
/*     */     
/*  65 */     for (Map.Entry<aps, a> entry : this.b.entrySet()) {
/*  66 */       apu apu = ☃.get(entry.getKey());
/*  67 */       if (!((a)entry.getValue()).a(apu)) {
/*  68 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  72 */     return true;
/*     */   }
/*     */   
/*     */   public static ca a(@Nullable JsonElement ☃) {
/*  76 */     if (☃ == null || ☃.isJsonNull()) {
/*  77 */       return a;
/*     */     }
/*  79 */     JsonObject jsonObject = afd.m(☃, "effects");
/*  80 */     Map<aps, a> map = Maps.newLinkedHashMap();
/*     */     
/*  82 */     for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject.entrySet()) {
/*  83 */       vk vk = new vk(entry.getKey());
/*  84 */       aps aps = (aps)gm.P.b(vk).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + ☃ + "'"));
/*  85 */       a a = a.a(afd.m(entry.getValue(), entry.getKey()));
/*  86 */       map.put(aps, a);
/*     */     } 
/*     */     
/*  89 */     return new ca(map);
/*     */   }
/*     */   
/*     */   public JsonElement b() {
/*  93 */     if (this == a) {
/*  94 */       return (JsonElement)JsonNull.INSTANCE;
/*     */     }
/*     */     
/*  97 */     JsonObject ☃ = new JsonObject();
/*     */     
/*  99 */     for (Map.Entry<aps, a> entry : this.b.entrySet()) {
/* 100 */       ☃.add(gm.P.b(entry.getKey()).toString(), ((a)entry.getValue()).a());
/*     */     }
/*     */     
/* 103 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final bz.d a;
/*     */     private final bz.d b;
/*     */     @Nullable
/*     */     private final Boolean c;
/*     */     @Nullable
/*     */     private final Boolean d;
/*     */     
/*     */     public a(bz.d ☃, bz.d d1, @Nullable Boolean bool1, @Nullable Boolean bool2) {
/* 115 */       this.a = ☃;
/* 116 */       this.b = d1;
/* 117 */       this.c = bool1;
/* 118 */       this.d = bool2;
/*     */     }
/*     */     
/*     */     public a() {
/* 122 */       this(bz.d.e, bz.d.e, null, null);
/*     */     }
/*     */     
/*     */     public boolean a(@Nullable apu ☃) {
/* 126 */       if (☃ == null) {
/* 127 */         return false;
/*     */       }
/* 129 */       if (!this.a.d(☃.c())) {
/* 130 */         return false;
/*     */       }
/* 132 */       if (!this.b.d(☃.b())) {
/* 133 */         return false;
/*     */       }
/* 135 */       if (this.c != null && this.c.booleanValue() != ☃.d()) {
/* 136 */         return false;
/*     */       }
/* 138 */       if (this.d != null && this.d.booleanValue() != ☃.e()) {
/* 139 */         return false;
/*     */       }
/* 141 */       return true;
/*     */     }
/*     */     
/*     */     public JsonElement a() {
/* 145 */       JsonObject ☃ = new JsonObject();
/*     */       
/* 147 */       ☃.add("amplifier", this.a.d());
/* 148 */       ☃.add("duration", this.b.d());
/* 149 */       ☃.addProperty("ambient", this.c);
/* 150 */       ☃.addProperty("visible", this.d);
/*     */       
/* 152 */       return (JsonElement)☃;
/*     */     }
/*     */     
/*     */     public static a a(JsonObject ☃) {
/* 156 */       bz.d d1 = bz.d.a(☃.get("amplifier"));
/* 157 */       bz.d d2 = bz.d.a(☃.get("duration"));
/* 158 */       Boolean bool1 = ☃.has("ambient") ? Boolean.valueOf(afd.j(☃, "ambient")) : null;
/* 159 */       Boolean bool2 = ☃.has("visible") ? Boolean.valueOf(afd.j(☃, "visible")) : null;
/* 160 */       return new a(d1, d2, bool1, bool2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */