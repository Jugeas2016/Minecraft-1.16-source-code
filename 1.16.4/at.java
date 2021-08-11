/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class at
/*    */   extends ck<at.a>
/*    */ {
/* 10 */   private static final vk a = new vk("consume_item");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 14 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 19 */     return new a(b1, bq.a(☃.get("item")));
/*    */   }
/*    */   
/*    */   public void a(aah ☃, bmb bmb1) {
/* 23 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bq a;
/*    */     
/*    */     public a(bg.b ☃, bq bq1) {
/* 30 */       super(at.b(), ☃);
/* 31 */       this.a = bq1;
/*    */     }
/*    */     
/*    */     public static a c() {
/* 35 */       return new a(bg.b.a, bq.a);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public static a a(brw ☃) {
/* 43 */       return new a(bg.b.a, new bq(null, ☃.h(), bz.d.e, bz.d.e, bb.b, bb.b, null, cb.a));
/*    */     }
/*    */     
/*    */     public boolean a(bmb ☃) {
/* 47 */       return this.a.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 52 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 54 */       jsonObject.add("item", this.a.a());
/*    */       
/* 56 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\at.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */