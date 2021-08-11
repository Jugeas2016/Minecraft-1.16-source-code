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
/*    */ public class aq
/*    */   extends ck<aq.a>
/*    */ {
/* 14 */   private static final vk a = new vk("changed_dimension");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 18 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 23 */     vj<brx> vj1 = ☃.has("from") ? vj.<brx>a(gm.L, new vk(afd.h(☃, "from"))) : null;
/* 24 */     vj<brx> vj2 = ☃.has("to") ? vj.<brx>a(gm.L, new vk(afd.h(☃, "to"))) : null;
/* 25 */     return new a(b1, vj1, vj2);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, vj<brx> vj1, vj<brx> vj2) {
/* 29 */     a(☃, a1 -> a1.b(☃, vj1));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     @Nullable
/*    */     private final vj<brx> a;
/*    */     @Nullable
/*    */     private final vj<brx> b;
/*    */     
/*    */     public a(bg.b ☃, @Nullable vj<brx> vj1, @Nullable vj<brx> vj2) {
/* 39 */       super(aq.b(), ☃);
/* 40 */       this.a = vj1;
/* 41 */       this.b = vj2;
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
/*    */     public static a a(vj<brx> ☃) {
/* 53 */       return new a(bg.b.a, null, ☃);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public boolean b(vj<brx> ☃, vj<brx> vj1) {
/* 61 */       if (this.a != null && this.a != ☃) {
/* 62 */         return false;
/*    */       }
/* 64 */       if (this.b != null && this.b != vj1) {
/* 65 */         return false;
/*    */       }
/* 67 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 72 */       JsonObject jsonObject = super.a(☃);
/* 73 */       if (this.a != null) {
/* 74 */         jsonObject.addProperty("from", this.a.a().toString());
/*    */       }
/* 76 */       if (this.b != null) {
/* 77 */         jsonObject.addProperty("to", this.b.a().toString());
/*    */       }
/* 79 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */