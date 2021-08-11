/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Collection;
/*    */ import java.util.stream.Stream;
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
/*    */ 
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   private final bg.b[] a;
/*    */   
/*    */   public a(bg.b ☃, bg.b[] arrayOfB) {
/* 37 */     super(ar.b(), ☃);
/* 38 */     this.a = arrayOfB;
/*    */   }
/*    */   
/*    */   public static a a(bg... ☃) {
/* 42 */     return new a(bg.b.a, (bg.b[])Stream.<bg>of(☃).map(bg.b::a).toArray(☃ -> new bg.b[☃]));
/*    */   }
/*    */   
/*    */   public boolean a(Collection<? extends cyv> ☃) {
/* 46 */     for (bg.b b1 : this.a) {
/* 47 */       boolean bool = false;
/* 48 */       for (cyv cyv : ☃) {
/* 49 */         if (b1.a(cyv)) {
/* 50 */           bool = true;
/*    */           break;
/*    */         } 
/*    */       } 
/* 54 */       if (!bool) {
/* 55 */         return false;
/*    */       }
/*    */     } 
/* 58 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 63 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 65 */     jsonObject.add("victims", bg.b.a(this.a, ☃));
/*    */     
/* 67 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ar$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */