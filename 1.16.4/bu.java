/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bu
/*    */   extends ck<bu.a>
/*    */ {
/*  9 */   private static final vk a = new vk("levitation");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 13 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 18 */     ay ay = ay.a(☃.get("distance"));
/* 19 */     bz.d d = bz.d.a(☃.get("duration"));
/* 20 */     return new a(b1, ay, d);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, dcn dcn1, int i) {
/* 24 */     a(☃, a1 -> a1.a(☃, dcn1, i));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final ay a;
/*    */     private final bz.d b;
/*    */     
/*    */     public a(bg.b ☃, ay ay1, bz.d d1) {
/* 32 */       super(bu.b(), ☃);
/* 33 */       this.a = ay1;
/* 34 */       this.b = d1;
/*    */     }
/*    */     
/*    */     public static a a(ay ☃) {
/* 38 */       return new a(bg.b.a, ☃, bz.d.e);
/*    */     }
/*    */     
/*    */     public boolean a(aah ☃, dcn dcn1, int i) {
/* 42 */       if (!this.a.a(dcn1.b, dcn1.c, dcn1.d, ☃.cD(), ☃.cE(), ☃.cH())) {
/* 43 */         return false;
/*    */       }
/* 45 */       if (!this.b.d(i)) {
/* 46 */         return false;
/*    */       }
/* 48 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 53 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 55 */       jsonObject.add("distance", this.a.a());
/* 56 */       jsonObject.add("duration", this.b.d());
/*    */       
/* 58 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */