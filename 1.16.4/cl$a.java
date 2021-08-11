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
/*    */   private final buo a;
/*    */   private final cm b;
/*    */   
/*    */   public a(bg.b ☃, @Nullable buo buo1, cm cm1) {
/* 52 */     super(cl.b(), ☃);
/* 53 */     this.a = buo1;
/* 54 */     this.b = cm1;
/*    */   }
/*    */   
/*    */   public static a a(buo ☃) {
/* 58 */     return new a(bg.b.a, ☃, cm.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 63 */     JsonObject jsonObject = super.a(☃);
/* 64 */     if (this.a != null) {
/* 65 */       jsonObject.addProperty("block", gm.Q.b(this.a).toString());
/*    */     }
/* 67 */     jsonObject.add("state", this.b.a());
/* 68 */     return jsonObject;
/*    */   }
/*    */   
/*    */   public boolean a(ceh ☃) {
/* 72 */     if (this.a != null && !☃.a(this.a)) {
/* 73 */       return false;
/*    */     }
/* 75 */     if (!this.b.a(☃)) {
/* 76 */       return false;
/*    */     }
/* 78 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cl$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */