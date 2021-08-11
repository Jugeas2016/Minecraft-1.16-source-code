/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class as
/*    */   extends ck<as.a>
/*    */ {
/*  9 */   private static final vk a = new vk("construct_beacon");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 13 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 18 */     bz.d d = bz.d.a(☃.get("level"));
/* 19 */     return new a(b1, d);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, cce cce1) {
/* 23 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bz.d a;
/*    */     
/*    */     public a(bg.b ☃, bz.d d1) {
/* 30 */       super(as.b(), ☃);
/* 31 */       this.a = d1;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public static a a(bz.d ☃) {
/* 39 */       return new a(bg.b.a, ☃);
/*    */     }
/*    */     
/*    */     public boolean a(cce ☃) {
/* 43 */       return this.a.d(☃.h());
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 48 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 50 */       jsonObject.add("level", this.a.d());
/*    */       
/* 52 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\as.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */