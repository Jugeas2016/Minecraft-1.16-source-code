/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cn
/*    */   extends ck<cn.a>
/*    */ {
/* 10 */   private static final vk a = new vk("summoned_entity");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 14 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 19 */     bg.b b2 = bg.b.a(☃, "entity", ax1);
/* 20 */     return new a(b1, b2);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, aqa aqa1) {
/* 24 */     cyv cyv = bg.b(☃, aqa1);
/* 25 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bg.b a;
/*    */     
/*    */     public a(bg.b ☃, bg.b b1) {
/* 32 */       super(cn.b(), ☃);
/* 33 */       this.a = b1;
/*    */     }
/*    */     
/*    */     public static a a(bg.a ☃) {
/* 37 */       return new a(bg.b.a, bg.b.a(☃.b()));
/*    */     }
/*    */     
/*    */     public boolean a(cyv ☃) {
/* 41 */       return this.a.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 46 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 48 */       jsonObject.add("entity", this.a.a(☃));
/*    */       
/* 50 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */