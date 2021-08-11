/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Collection;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends al
/*    */ {
/*    */   private final bq a;
/*    */   private final bg.b b;
/*    */   private final bq c;
/*    */   
/*    */   public a(bg.b ☃, bq bq1, bg.b b1, bq bq2) {
/* 42 */     super(bk.b(), ☃);
/* 43 */     this.a = bq1;
/* 44 */     this.b = b1;
/* 45 */     this.c = bq2;
/*    */   }
/*    */   
/*    */   public static a a(bq ☃, bg bg1, bq bq1) {
/* 49 */     return new a(bg.b.a, ☃, bg.b.a(bg1), bq1);
/*    */   }
/*    */   
/*    */   public boolean a(bmb ☃, cyv cyv1, Collection<bmb> collection) {
/* 53 */     if (!this.a.a(☃)) {
/* 54 */       return false;
/*    */     }
/* 56 */     if (!this.b.a(cyv1)) {
/* 57 */       return false;
/*    */     }
/* 59 */     if (this.c != bq.a) {
/* 60 */       boolean bool = false;
/*    */       
/* 62 */       aqa aqa = cyv1.<aqa>c(dbc.a);
/* 63 */       if (aqa instanceof bcv) {
/* 64 */         bcv bcv = (bcv)aqa;
/* 65 */         if (this.c.a(bcv.g())) {
/* 66 */           bool = true;
/*    */         }
/*    */       } 
/* 69 */       for (bmb bmb1 : collection) {
/* 70 */         if (this.c.a(bmb1)) {
/* 71 */           bool = true;
/*    */           break;
/*    */         } 
/*    */       } 
/* 75 */       if (!bool) {
/* 76 */         return false;
/*    */       }
/*    */     } 
/* 79 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public JsonObject a(ci ☃) {
/* 84 */     JsonObject jsonObject = super.a(☃);
/*    */     
/* 86 */     jsonObject.add("rod", this.a.a());
/* 87 */     jsonObject.add("entity", this.b.a(☃));
/* 88 */     jsonObject.add("item", this.c.a());
/*    */     
/* 90 */     return jsonObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */