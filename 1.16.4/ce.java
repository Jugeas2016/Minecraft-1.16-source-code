/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ce
/*    */   extends ck<ce.a>
/*    */ {
/* 11 */   private static final vk a = new vk("player_hurt_entity");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 15 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 20 */     av av = av.a(☃.get("damage"));
/* 21 */     bg.b b2 = bg.b.a(☃, "entity", ax1);
/* 22 */     return new a(b1, av, b2);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, aqa aqa1, apk apk1, float f1, float f2, boolean bool) {
/* 26 */     cyv cyv = bg.b(☃, aqa1);
/* 27 */     a(☃, a1 -> a1.a(☃, cyv1, apk1, f1, f2, bool));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final av a;
/*    */     private final bg.b b;
/*    */     
/*    */     public a(bg.b ☃, av av1, bg.b b1) {
/* 35 */       super(ce.b(), ☃);
/* 36 */       this.a = av1;
/* 37 */       this.b = b1;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public static a a(av.a ☃) {
/* 49 */       return new a(bg.b.a, ☃.b(), bg.b.a);
/*    */     }
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
/*    */     public boolean a(aah ☃, cyv cyv1, apk apk1, float f1, float f2, boolean bool) {
/* 65 */       if (!this.a.a(☃, apk1, f1, f2, bool)) {
/* 66 */         return false;
/*    */       }
/* 68 */       if (!this.b.a(cyv1)) {
/* 69 */         return false;
/*    */       }
/* 71 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 76 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 78 */       jsonObject.add("damage", this.a.a());
/* 79 */       jsonObject.add("entity", this.b.a(☃));
/*    */       
/* 81 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */