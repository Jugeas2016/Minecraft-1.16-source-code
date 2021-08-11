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
/*     */ final class f
/*     */   implements czx.b
/*     */ {
/*  77 */   public static final vk a = new vk("uniform_bonus_count");
/*     */   
/*     */   private final int b;
/*     */   
/*     */   public f(int ☃) {
/*  82 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(Random ☃, int i, int j) {
/*  87 */     return i + ☃.nextInt(this.b * j + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(JsonObject ☃, JsonSerializationContext jsonSerializationContext) {
/*  92 */     ☃.addProperty("bonusMultiplier", Integer.valueOf(this.b));
/*     */   }
/*     */   
/*     */   public static czx.b a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/*  96 */     int i = afd.n(☃, "bonusMultiplier");
/*  97 */     return new f(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a() {
/* 102 */     return a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czx$f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */