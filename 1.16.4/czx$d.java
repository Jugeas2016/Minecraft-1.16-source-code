/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class d
/*     */   implements czx.b
/*     */ {
/*     */   private d() {}
/*     */   
/* 107 */   public static final vk a = new vk("ore_drops");
/*     */ 
/*     */   
/*     */   public int a(Random ☃, int i, int j) {
/* 111 */     if (j > 0) {
/* 112 */       int k = ☃.nextInt(j + 2) - 1;
/* 113 */       if (k < 0) {
/* 114 */         k = 0;
/*     */       }
/* 116 */       return i * (k + 1);
/*     */     } 
/*     */     
/* 119 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(JsonObject ☃, JsonSerializationContext jsonSerializationContext) {}
/*     */ 
/*     */   
/*     */   public static czx.b a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 127 */     return new d();
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a() {
/* 132 */     return a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czx$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */