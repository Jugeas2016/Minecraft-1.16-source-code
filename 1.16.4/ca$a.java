/*     */ import com.google.gson.JsonElement;
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
/*     */ public class a
/*     */ {
/*     */   private final bz.d a;
/*     */   private final bz.d b;
/*     */   @Nullable
/*     */   private final Boolean c;
/*     */   @Nullable
/*     */   private final Boolean d;
/*     */   
/*     */   public a(bz.d ☃, bz.d d1, @Nullable Boolean bool1, @Nullable Boolean bool2) {
/* 115 */     this.a = ☃;
/* 116 */     this.b = d1;
/* 117 */     this.c = bool1;
/* 118 */     this.d = bool2;
/*     */   }
/*     */   
/*     */   public a() {
/* 122 */     this(bz.d.e, bz.d.e, null, null);
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable apu ☃) {
/* 126 */     if (☃ == null) {
/* 127 */       return false;
/*     */     }
/* 129 */     if (!this.a.d(☃.c())) {
/* 130 */       return false;
/*     */     }
/* 132 */     if (!this.b.d(☃.b())) {
/* 133 */       return false;
/*     */     }
/* 135 */     if (this.c != null && this.c.booleanValue() != ☃.d()) {
/* 136 */       return false;
/*     */     }
/* 138 */     if (this.d != null && this.d.booleanValue() != ☃.e()) {
/* 139 */       return false;
/*     */     }
/* 141 */     return true;
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 145 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 147 */     ☃.add("amplifier", this.a.d());
/* 148 */     ☃.add("duration", this.b.d());
/* 149 */     ☃.addProperty("ambient", this.c);
/* 150 */     ☃.addProperty("visible", this.d);
/*     */     
/* 152 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public static a a(JsonObject ☃) {
/* 156 */     bz.d d1 = bz.d.a(☃.get("amplifier"));
/* 157 */     bz.d d2 = bz.d.a(☃.get("duration"));
/* 158 */     Boolean bool1 = ☃.has("ambient") ? Boolean.valueOf(afd.j(☃, "ambient")) : null;
/* 159 */     Boolean bool2 = ☃.has("visible") ? Boolean.valueOf(afd.j(☃, "visible")) : null;
/* 160 */     return new a(d1, d2, bool1, bool2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ca$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */