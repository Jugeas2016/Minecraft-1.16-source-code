/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class a
/*    */   implements czx.b
/*    */ {
/* 38 */   public static final vk a = new vk("binomial_with_bonus_count");
/*    */   
/*    */   private final int b;
/*    */   private final float c;
/*    */   
/*    */   public a(int ☃, float f) {
/* 44 */     this.b = ☃;
/* 45 */     this.c = f;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i, int j) {
/* 50 */     for (int k = 0; k < j + this.b; k++) {
/* 51 */       if (☃.nextFloat() < this.c) {
/* 52 */         i++;
/*    */       }
/*    */     } 
/* 55 */     return i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(JsonObject ☃, JsonSerializationContext jsonSerializationContext) {
/* 60 */     ☃.addProperty("extra", Integer.valueOf(this.b));
/* 61 */     ☃.addProperty("probability", Float.valueOf(this.c));
/*    */   }
/*    */   
/*    */   public static czx.b a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext) {
/* 65 */     int i = afd.n(☃, "extra");
/* 66 */     float f = afd.l(☃, "probability");
/* 67 */     return new a(i, f);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a() {
/* 72 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */