/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.UUID;
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
/*     */ 
/*     */ 
/*     */ public class b
/*     */ {
/*     */   public final aqe<?> a;
/*     */   public final UUID b;
/*     */   @Nullable
/*     */   public final nr c;
/*     */   @Nullable
/*     */   private List<nr> d;
/*     */   
/*     */   public b(aqe<?> ☃, UUID uUID, @Nullable nr nr1) {
/* 122 */     this.a = ☃;
/* 123 */     this.b = uUID;
/* 124 */     this.c = nr1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static b a(JsonElement ☃) {
/* 129 */     if (!☃.isJsonObject()) {
/* 130 */       return null;
/*     */     }
/* 132 */     JsonObject jsonObject = ☃.getAsJsonObject();
/* 133 */     aqe<?> aqe1 = gm.S.a(new vk(afd.h(jsonObject, "type")));
/* 134 */     UUID uUID = UUID.fromString(afd.h(jsonObject, "id"));
/* 135 */     nr nr1 = nr.a.a(jsonObject.get("name"));
/* 136 */     return new b(aqe1, uUID, nr1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static b a(nr ☃) {
/*     */     try {
/* 142 */       md md = mu.a(☃.getString());
/* 143 */       nr nr1 = nr.a.a(md.l("name"));
/* 144 */       aqe<?> aqe1 = gm.S.a(new vk(md.l("type")));
/* 145 */       UUID uUID = UUID.fromString(md.l("id"));
/* 146 */       return new b(aqe1, uUID, nr1);
/* 147 */     } catch (JsonSyntaxException|com.mojang.brigadier.exceptions.CommandSyntaxException exception) {
/* 148 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public JsonElement a() {
/* 153 */     JsonObject ☃ = new JsonObject();
/* 154 */     ☃.addProperty("type", gm.S.b(this.a).toString());
/* 155 */     ☃.addProperty("id", this.b.toString());
/* 156 */     if (this.c != null) {
/* 157 */       ☃.add("name", nr.a.b(this.c));
/*     */     }
/* 159 */     return (JsonElement)☃;
/*     */   }
/*     */   
/*     */   public List<nr> b() {
/* 163 */     if (this.d == null) {
/* 164 */       this.d = Lists.newArrayList();
/* 165 */       if (this.c != null) {
/* 166 */         this.d.add(this.c);
/*     */       }
/* 168 */       this.d.add(new of("gui.entity_tooltip.type", new Object[] { this.a.g() }));
/* 169 */       this.d.add(new oe(this.b.toString()));
/*     */     } 
/* 171 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 176 */     if (this == ☃) return true; 
/* 177 */     if (☃ == null || getClass() != ☃.getClass()) return false;
/*     */     
/* 179 */     b b1 = (b)☃;
/* 180 */     return (this.a.equals(b1.a) && this.b.equals(b1.b) && Objects.equals(this.c, b1.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 185 */     int ☃ = this.a.hashCode();
/* 186 */     ☃ = 31 * ☃ + this.b.hashCode();
/* 187 */     ☃ = 31 * ☃ + ((this.c != null) ? this.c.hashCode() : 0);
/* 188 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nv$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */