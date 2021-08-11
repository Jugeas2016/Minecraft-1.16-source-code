/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bx
/*    */   extends ck<bx.a>
/*    */ {
/*    */   private final vk a;
/*    */   
/*    */   public bx(vk ☃) {
/* 14 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a() {
/* 19 */     return this.a;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 25 */     JsonObject jsonObject = afd.a(☃, "location", ☃);
/* 26 */     bw bw = bw.a((JsonElement)jsonObject);
/* 27 */     return new a(this.a, b1, bw);
/*    */   }
/*    */   
/*    */   public void a(aah ☃) {
/* 31 */     a(☃, a1 -> a1.a(☃.u(), ☃.cD(), ☃.cE(), ☃.cH()));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bw a;
/*    */     
/*    */     public a(vk ☃, bg.b b1, bw bw1) {
/* 38 */       super(☃, b1);
/* 39 */       this.a = bw1;
/*    */     }
/*    */     
/*    */     public static a a(bw ☃) {
/* 43 */       return new a(bx.a(ac.p), bg.b.a, ☃);
/*    */     }
/*    */     
/*    */     public static a c() {
/* 47 */       return new a(bx.a(ac.q), bg.b.a, bw.a);
/*    */     }
/*    */     
/*    */     public static a d() {
/* 51 */       return new a(bx.a(ac.H), bg.b.a, bw.a);
/*    */     }
/*    */     
/*    */     public boolean a(aag ☃, double d1, double d2, double d3) {
/* 55 */       return this.a.a(☃, d1, d2, d3);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 60 */       JsonObject jsonObject = super.a(☃);
/* 61 */       jsonObject.add("location", this.a.a());
/* 62 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */