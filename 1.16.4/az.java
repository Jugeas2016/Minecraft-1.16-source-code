/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class az
/*    */   extends ck<az.a>
/*    */ {
/*  8 */   private static final vk a = new vk("effects_changed");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 12 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 17 */     ca ca = ca.a(☃.get("effects"));
/* 18 */     return new a(b1, ca);
/*    */   }
/*    */   
/*    */   public void a(aah ☃) {
/* 22 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final ca a;
/*    */     
/*    */     public a(bg.b ☃, ca ca1) {
/* 29 */       super(az.b(), ☃);
/* 30 */       this.a = ca1;
/*    */     }
/*    */     
/*    */     public static a a(ca ☃) {
/* 34 */       return new a(bg.b.a, ☃);
/*    */     }
/*    */     
/*    */     public boolean a(aah ☃) {
/* 38 */       return this.a.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 43 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 45 */       jsonObject.add("effects", this.a.b());
/*    */       
/* 47 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */