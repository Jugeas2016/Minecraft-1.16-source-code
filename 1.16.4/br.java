/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class br
/*    */   extends ck<br.a>
/*    */ {
/* 12 */   private static final vk a = new vk("item_used_on_block");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 16 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 21 */     bw bw = bw.a(☃.get("location"));
/* 22 */     bq bq = bq.a(☃.get("item"));
/*    */     
/* 24 */     return new a(b1, bw, bq);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, fx fx1, bmb bmb1) {
/* 28 */     ceh ceh = ☃.u().d_(fx1);
/*    */     
/* 30 */     a(☃, a1 -> a1.a(☃, aah1.u(), fx1, bmb1));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bw a;
/*    */     private final bq b;
/*    */     
/*    */     public a(bg.b ☃, bw bw1, bq bq1) {
/* 38 */       super(br.b(), ☃);
/* 39 */       this.a = bw1;
/* 40 */       this.b = bq1;
/*    */     }
/*    */     
/*    */     public static a a(bw.a ☃, bq.a a1) {
/* 44 */       return new a(bg.b.a, ☃.b(), a1.b());
/*    */     }
/*    */     
/*    */     public boolean a(ceh ☃, aag aag1, fx fx1, bmb bmb1) {
/* 48 */       if (!this.a.a(aag1, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D)) {
/* 49 */         return false;
/*    */       }
/* 51 */       return this.b.a(bmb1);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 56 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 58 */       jsonObject.add("location", this.a.a());
/* 59 */       jsonObject.add("item", this.b.a());
/*    */       
/* 61 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\br.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */