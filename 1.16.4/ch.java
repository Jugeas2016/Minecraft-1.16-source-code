/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ch
/*    */   extends ck<ch.a>
/*    */ {
/* 10 */   private static final vk a = new vk("recipe_unlocked");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 14 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 19 */     vk vk1 = new vk(afd.h(☃, "recipe"));
/* 20 */     return new a(b1, vk1);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, boq<?> boq1) {
/* 24 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static a a(vk ☃) {
/* 28 */     return new a(bg.b.a, ☃);
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final vk a;
/*    */     
/*    */     public a(bg.b ☃, vk vk1) {
/* 35 */       super(ch.b(), ☃);
/* 36 */       this.a = vk1;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 41 */       JsonObject jsonObject = super.a(☃);
/* 42 */       jsonObject.addProperty("recipe", this.a.toString());
/* 43 */       return jsonObject;
/*    */     }
/*    */     
/*    */     public boolean a(boq<?> ☃) {
/* 47 */       return this.a.equals(☃.f());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */