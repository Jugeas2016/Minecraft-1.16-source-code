/*    */ import com.google.gson.JsonObject;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   private final bnt a;
/*    */   
/*    */   public a(bg.b ☃, @Nullable bnt bnt1) {
/* 39 */     super(ap.b(), ☃);
/* 40 */     this.a = bnt1;
/*    */   }
/*    */   
/*    */   public static a c() {
/* 44 */     return new a(bg.b.a, null);
/*    */   }
/*    */   
/*    */   public boolean a(bnt ☃) {
/* 48 */     if (this.a != null && this.a != ☃) {
/* 49 */       return false;
/*    */     }
/* 51 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 56 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 58 */     if (this.a != null) {
/* 59 */       jsonObject.addProperty("potion", gm.U.b(this.a).toString());
/*    */     }
/*    */     
/* 62 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ap$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */