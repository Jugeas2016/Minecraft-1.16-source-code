/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bf
/*    */   extends ck<bf.a>
/*    */ {
/*  9 */   private static final vk a = new vk("entity_hurt_player");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 13 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 18 */     av av = av.a(☃.get("damage"));
/* 19 */     return new a(b1, av);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, apk apk1, float f1, float f2, boolean bool) {
/* 23 */     a(☃, a1 -> a1.a(☃, apk1, f1, f2, bool));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final av a;
/*    */     
/*    */     public a(bg.b ☃, av av1) {
/* 30 */       super(bf.b(), ☃);
/* 31 */       this.a = av1;
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
/* 43 */       return new a(bg.b.a, ☃.b());
/*    */     }
/*    */     
/*    */     public boolean a(aah ☃, apk apk1, float f1, float f2, boolean bool) {
/* 47 */       if (!this.a.a(☃, apk1, f1, f2, bool)) {
/* 48 */         return false;
/*    */       }
/* 50 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 55 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 57 */       jsonObject.add("damage", this.a.a());
/*    */       
/* 59 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */