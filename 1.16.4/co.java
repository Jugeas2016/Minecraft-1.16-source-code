/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class co
/*    */   extends ck<co.a>
/*    */ {
/* 10 */   private static final vk a = new vk("tame_animal");
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
/*    */   public void a(aah ☃, azz azz1) {
/* 24 */     cyv cyv = bg.b(☃, azz1);
/* 25 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bg.b a;
/*    */     
/*    */     public a(bg.b ☃, bg.b b1) {
/* 32 */       super(co.b(), ☃);
/* 33 */       this.a = b1;
/*    */     }
/*    */     
/*    */     public static a c() {
/* 37 */       return new a(bg.b.a, bg.b.a);
/*    */     }
/*    */     
/*    */     public static a a(bg ☃) {
/* 41 */       return new a(bg.b.a, bg.b.a(☃));
/*    */     }
/*    */     
/*    */     public boolean a(cyv ☃) {
/* 45 */       return this.a.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 50 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 52 */       jsonObject.add("entity", this.a.a(☃));
/*    */       
/* 54 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\co.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */