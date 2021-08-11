/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bi
/*    */   extends ck<bi.a>
/*    */ {
/*  9 */   private static final vk a = new vk("filled_bucket");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 13 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 18 */     bq bq = bq.a(☃.get("item"));
/* 19 */     return new a(b1, bq);
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
/* 30 */       super(bi.b(), ☃);
/* 31 */       this.a = bq1;
/*    */     }
/*    */     
/*    */     public static a a(bq ☃) {
/* 35 */       return new a(bg.b.a, ☃);
/*    */     }
/*    */     
/*    */     public boolean a(bmb ☃) {
/* 39 */       if (!this.a.a(☃)) {
/* 40 */         return false;
/*    */       }
/* 42 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 47 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 49 */       jsonObject.add("item", this.a.a());
/*    */       
/* 51 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */