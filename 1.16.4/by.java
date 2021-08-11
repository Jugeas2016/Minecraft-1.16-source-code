/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class by
/*    */   extends ck<by.a>
/*    */ {
/*  9 */   private static final vk a = new vk("player_generates_container_loot");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 13 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 18 */     vk vk1 = new vk(afd.h(☃, "loot_table"));
/*    */     
/* 20 */     return new a(b1, vk1);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, vk vk1) {
/* 24 */     a(☃, a1 -> a1.b(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final vk a;
/*    */     
/*    */     public a(bg.b ☃, vk vk1) {
/* 31 */       super(by.b(), ☃);
/* 32 */       this.a = vk1;
/*    */     }
/*    */     
/*    */     public static a a(vk ☃) {
/* 36 */       return new a(bg.b.a, ☃);
/*    */     }
/*    */     
/*    */     public boolean b(vk ☃) {
/* 40 */       return this.a.equals(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 45 */       JsonObject jsonObject = super.a(☃);
/* 46 */       jsonObject.addProperty("loot_table", this.a.toString());
/* 47 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\by.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */