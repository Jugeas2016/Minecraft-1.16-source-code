/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends dai.c<dae>
/*     */ {
/*     */   public void a(JsonObject ☃, dae dae1, JsonSerializationContext jsonSerializationContext) {
/* 135 */     super.a(☃, dae1, jsonSerializationContext);
/*     */     
/* 137 */     if (!dae.a(dae1).equals(dae.a)) {
/* 138 */       ☃.add("destination", jsonSerializationContext.serialize(dae.a(dae1).i()));
/*     */     }
/*     */     
/* 141 */     if (dae.b(dae1) != dae.b) {
/* 142 */       ☃.add("decoration", jsonSerializationContext.serialize(dae.b(dae1).toString().toLowerCase(Locale.ROOT)));
/*     */     }
/*     */     
/* 145 */     if (dae.c(dae1) != 2) {
/* 146 */       ☃.addProperty("zoom", Byte.valueOf(dae.c(dae1)));
/*     */     }
/*     */     
/* 149 */     if (dae.d(dae1) != 50) {
/* 150 */       ☃.addProperty("search_radius", Integer.valueOf(dae.d(dae1)));
/*     */     }
/*     */     
/* 153 */     if (dae.e(dae1) != true) {
/* 154 */       ☃.addProperty("skip_existing_chunks", Boolean.valueOf(dae.e(dae1)));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public dae a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 160 */     cla<?> cla = a(☃);
/*     */     
/* 162 */     String str = ☃.has("decoration") ? afd.h(☃, "decoration") : "mansion";
/* 163 */     cxu.a a = dae.b;
/*     */     try {
/* 165 */       a = cxu.a.valueOf(str.toUpperCase(Locale.ROOT));
/* 166 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 167 */       dae.d().error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + dae.b, str);
/*     */     } 
/*     */     
/* 170 */     byte b1 = afd.a(☃, "zoom", (byte)2);
/*     */     
/* 172 */     int i = afd.a(☃, "search_radius", 50);
/*     */     
/* 174 */     boolean bool = afd.a(☃, "skip_existing_chunks", true);
/*     */     
/* 176 */     return new dae(arrayOfDbo, cla, a, b1, i, bool, null);
/*     */   }
/*     */   
/*     */   private static cla<?> a(JsonObject ☃) {
/* 180 */     if (☃.has("destination")) {
/* 181 */       String str = afd.h(☃, "destination");
/* 182 */       cla<?> cla = (cla)cla.a.get(str.toLowerCase(Locale.ROOT));
/* 183 */       if (cla != null) {
/* 184 */         return cla;
/*     */       }
/*     */     } 
/* 187 */     return dae.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dae$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */