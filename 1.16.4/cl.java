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
/*    */ public class cl
/*    */   extends ck<cl.a>
/*    */ {
/* 15 */   private static final vk a = new vk("slide_down_block");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 19 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 24 */     buo buo = a(☃);
/* 25 */     cm cm = cm.a(☃.get("state"));
/* 26 */     if (buo != null) {
/* 27 */       cm.a(buo.m(), str -> {
/*    */             throw new JsonSyntaxException("Block " + ☃ + " has no property " + str);
/*    */           });
/*    */     }
/* 31 */     return new a(b1, buo, cm);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private static buo a(JsonObject ☃) {
/* 36 */     if (☃.has("block")) {
/* 37 */       vk vk1 = new vk(afd.h(☃, "block"));
/* 38 */       return (buo)gm.Q.b(vk1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + ☃ + "'"));
/*    */     } 
/* 40 */     return null;
/*    */   }
/*    */   
/*    */   public void a(aah ☃, ceh ceh1) {
/* 44 */     a(☃, a1 -> a1.a(☃));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final buo a;
/*    */     private final cm b;
/*    */     
/*    */     public a(bg.b ☃, @Nullable buo buo1, cm cm1) {
/* 52 */       super(cl.b(), ☃);
/* 53 */       this.a = buo1;
/* 54 */       this.b = cm1;
/*    */     }
/*    */     
/*    */     public static a a(buo ☃) {
/* 58 */       return new a(bg.b.a, ☃, cm.a);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 63 */       JsonObject jsonObject = super.a(☃);
/* 64 */       if (this.a != null) {
/* 65 */         jsonObject.addProperty("block", gm.Q.b(this.a).toString());
/*    */       }
/* 67 */       jsonObject.add("state", this.b.a());
/* 68 */       return jsonObject;
/*    */     }
/*    */     
/*    */     public boolean a(ceh ☃) {
/* 72 */       if (this.a != null && !☃.a(this.a)) {
/* 73 */         return false;
/*    */       }
/* 75 */       if (!this.b.a(☃)) {
/* 76 */         return false;
/*    */       }
/* 78 */       return true;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */