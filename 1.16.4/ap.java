/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ap
/*    */   extends ck<ap.a>
/*    */ {
/* 14 */   private static final vk a = new vk("brewed_potion");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 18 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 23 */     bnt bnt = null;
/* 24 */     if (☃.has("potion")) {
/* 25 */       vk vk1 = new vk(afd.h(☃, "potion"));
/* 26 */       bnt = (bnt)gm.U.b(vk1).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + ☃ + "'"));
/*    */     } 
/* 28 */     return new a(b1, bnt);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, bnt bnt1) {
/* 32 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bnt a;
/*    */     
/*    */     public a(bg.b ☃, @Nullable bnt bnt1) {
/* 39 */       super(ap.b(), ☃);
/* 40 */       this.a = bnt1;
/*    */     }
/*    */     
/*    */     public static a c() {
/* 44 */       return new a(bg.b.a, null);
/*    */     }
/*    */     
/*    */     public boolean a(bnt ☃) {
/* 48 */       if (this.a != null && this.a != ☃) {
/* 49 */         return false;
/*    */       }
/* 51 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 56 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 58 */       if (this.a != null) {
/* 59 */         jsonObject.addProperty("potion", gm.U.b(this.a).toString());
/*    */       }
/*    */       
/* 62 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */