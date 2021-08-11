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
/*    */ public class bk
/*    */   extends ck<bk.a>
/*    */ {
/* 16 */   private static final vk a = new vk("fishing_rod_hooked");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 20 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 25 */     bq bq1 = bq.a(☃.get("rod"));
/* 26 */     bg.b b2 = bg.b.a(☃, "entity", ax1);
/* 27 */     bq bq2 = bq.a(☃.get("item"));
/* 28 */     return new a(b1, bq1, b2, bq2);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, bmb bmb1, bgi bgi1, Collection<bmb> collection) {
/* 32 */     cyv cyv = bg.b(☃, (bgi1.k() != null) ? bgi1.k() : bgi1);
/* 33 */     a(☃, a1 -> a1.a(☃, cyv1, collection));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bq a;
/*    */     private final bg.b b;
/*    */     private final bq c;
/*    */     
/*    */     public a(bg.b ☃, bq bq1, bg.b b1, bq bq2) {
/* 42 */       super(bk.b(), ☃);
/* 43 */       this.a = bq1;
/* 44 */       this.b = b1;
/* 45 */       this.c = bq2;
/*    */     }
/*    */     
/*    */     public static a a(bq ☃, bg bg1, bq bq1) {
/* 49 */       return new a(bg.b.a, ☃, bg.b.a(bg1), bq1);
/*    */     }
/*    */     
/*    */     public boolean a(bmb ☃, cyv cyv1, Collection<bmb> collection) {
/* 53 */       if (!this.a.a(☃)) {
/* 54 */         return false;
/*    */       }
/* 56 */       if (!this.b.a(cyv1)) {
/* 57 */         return false;
/*    */       }
/* 59 */       if (this.c != bq.a) {
/* 60 */         boolean bool = false;
/*    */         
/* 62 */         aqa aqa = cyv1.<aqa>c(dbc.a);
/* 63 */         if (aqa instanceof bcv) {
/* 64 */           bcv bcv = (bcv)aqa;
/* 65 */           if (this.c.a(bcv.g())) {
/* 66 */             bool = true;
/*    */           }
/*    */         } 
/* 69 */         for (bmb bmb1 : collection) {
/* 70 */           if (this.c.a(bmb1)) {
/* 71 */             bool = true;
/*    */             break;
/*    */           } 
/*    */         } 
/* 75 */         if (!bool) {
/* 76 */           return false;
/*    */         }
/*    */       } 
/* 79 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 84 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 86 */       jsonObject.add("rod", this.a.a());
/* 87 */       jsonObject.add("entity", this.b.a(☃));
/* 88 */       jsonObject.add("item", this.c.a());
/*    */       
/* 90 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */