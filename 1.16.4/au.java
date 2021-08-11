/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class au
/*    */   extends ck<au.a>
/*    */ {
/* 11 */   private static final vk a = new vk("cured_zombie_villager");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 15 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 20 */     bg.b b2 = bg.b.a(☃, "zombie", ax1);
/* 21 */     bg.b b3 = bg.b.a(☃, "villager", ax1);
/* 22 */     return new a(b1, b2, b3);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, bej bej1, bfj bfj1) {
/* 26 */     cyv cyv1 = bg.b(☃, bej1);
/* 27 */     cyv cyv2 = bg.b(☃, bfj1);
/*    */     
/* 29 */     a(☃, a1 -> a1.a(☃, cyv1));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bg.b a;
/*    */     private final bg.b b;
/*    */     
/*    */     public a(bg.b ☃, bg.b b1, bg.b b2) {
/* 37 */       super(au.b(), ☃);
/* 38 */       this.a = b1;
/* 39 */       this.b = b2;
/*    */     }
/*    */     
/*    */     public static a c() {
/* 43 */       return new a(bg.b.a, bg.b.a, bg.b.a);
/*    */     }
/*    */     
/*    */     public boolean a(cyv ☃, cyv cyv1) {
/* 47 */       if (!this.a.a(☃)) {
/* 48 */         return false;
/*    */       }
/* 50 */       if (!this.b.a(cyv1)) {
/* 51 */         return false;
/*    */       }
/* 53 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 58 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 60 */       jsonObject.add("zombie", this.a.a(☃));
/* 61 */       jsonObject.add("villager", this.b.a(☃));
/*    */       
/* 63 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */