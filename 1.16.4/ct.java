/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ct
/*    */   extends ck<ct.a>
/*    */ {
/* 12 */   private static final vk a = new vk("used_totem");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 16 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 21 */     bq bq = bq.a(☃.get("item"));
/* 22 */     return new a(b1, bq);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, bmb bmb1) {
/* 26 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bq a;
/*    */     
/*    */     public a(bg.b ☃, bq bq1) {
/* 33 */       super(ct.b(), ☃);
/* 34 */       this.a = bq1;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public static a a(brw ☃) {
/* 42 */       return new a(bg.b.a, bq.a.a().a(☃).b());
/*    */     }
/*    */     
/*    */     public boolean a(bmb ☃) {
/* 46 */       return this.a.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 51 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 53 */       jsonObject.add("item", this.a.a());
/*    */       
/* 55 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */