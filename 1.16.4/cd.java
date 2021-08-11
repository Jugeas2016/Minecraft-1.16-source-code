/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class cd
/*    */   extends ck<cd.a>
/*    */ {
/* 18 */   private static final vk a = new vk("placed_block");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 22 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 27 */     buo buo = a(☃);
/* 28 */     cm cm = cm.a(☃.get("state"));
/* 29 */     if (buo != null) {
/* 30 */       cm.a(buo.m(), str -> {
/*    */             throw new JsonSyntaxException("Block " + ☃ + " has no property " + str + ":");
/*    */           });
/*    */     }
/* 34 */     bw bw = bw.a(☃.get("location"));
/* 35 */     bq bq = bq.a(☃.get("item"));
/*    */     
/* 37 */     return new a(b1, buo, cm, bw, bq);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private static buo a(JsonObject ☃) {
/* 42 */     if (☃.has("block")) {
/* 43 */       vk vk1 = new vk(afd.h(☃, "block"));
/* 44 */       return (buo)gm.Q.b(vk1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + ☃ + "'"));
/*    */     } 
/* 46 */     return null;
/*    */   }
/*    */   
/*    */   public void a(aah ☃, fx fx1, bmb bmb1) {
/* 50 */     ceh ceh = ☃.u().d_(fx1);
/* 51 */     a(☃, a1 -> a1.a(☃, fx1, aah1.u(), bmb1));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final buo a;
/*    */     private final cm b;
/*    */     private final bw c;
/*    */     private final bq d;
/*    */     
/*    */     public a(bg.b ☃, @Nullable buo buo1, cm cm1, bw bw1, bq bq1) {
/* 61 */       super(cd.b(), ☃);
/* 62 */       this.a = buo1;
/* 63 */       this.b = cm1;
/* 64 */       this.c = bw1;
/* 65 */       this.d = bq1;
/*    */     }
/*    */     
/*    */     public static a a(buo ☃) {
/* 69 */       return new a(bg.b.a, ☃, cm.a, bw.a, bq.a);
/*    */     }
/*    */     
/*    */     public boolean a(ceh ☃, fx fx1, aag aag1, bmb bmb1) {
/* 73 */       if (this.a != null && !☃.a(this.a)) {
/* 74 */         return false;
/*    */       }
/* 76 */       if (!this.b.a(☃)) {
/* 77 */         return false;
/*    */       }
/* 79 */       if (!this.c.a(aag1, fx1.u(), fx1.v(), fx1.w())) {
/* 80 */         return false;
/*    */       }
/* 82 */       if (!this.d.a(bmb1)) {
/* 83 */         return false;
/*    */       }
/* 85 */       return true;
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 90 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 92 */       if (this.a != null) {
/* 93 */         jsonObject.addProperty("block", gm.Q.b(this.a).toString());
/*    */       }
/* 95 */       jsonObject.add("state", this.b.a());
/* 96 */       jsonObject.add("location", this.c.a());
/* 97 */       jsonObject.add("item", this.d.a());
/*    */       
/* 99 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */