/*    */ import com.google.gson.JsonDeserializationContext;
/*    */ import com.google.gson.JsonObject;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSerializationContext;
/*    */ import java.util.function.Consumer;
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
/*    */ public class czv
/*    */   extends czs
/*    */ {
/*    */   private final ael<blx> g;
/*    */   private final boolean h;
/*    */   
/*    */   private czv(ael<blx> ☃, boolean bool, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 24 */     super(i, j, arrayOfDbo, arrayOfDaj);
/* 25 */     this.g = ☃;
/* 26 */     this.h = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public czr a() {
/* 31 */     return czo.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Consumer<bmb> ☃, cyv cyv1) {
/* 36 */     this.g.b().forEach(blx1 -> ☃.accept(new bmb(blx1)));
/*    */   }
/*    */   
/*    */   private boolean a(cyv ☃, Consumer<czp> consumer) {
/* 40 */     if (a(☃)) {
/* 41 */       for (blx blx : this.g.b()) {
/* 42 */         consumer.accept(new czs.c(this, blx)
/*    */             {
/*    */               public void a(Consumer<bmb> ☃, cyv cyv1) {
/* 45 */                 ☃.accept(new bmb(this.a));
/*    */               }
/*    */             });
/*    */       } 
/* 49 */       return true;
/*    */     } 
/* 51 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean expand(cyv ☃, Consumer<czp> consumer) {
/* 56 */     if (this.h) {
/* 57 */       return a(☃, consumer);
/*    */     }
/* 59 */     return super.expand(☃, consumer);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static czs.a<?> b(ael<blx> ☃) {
/* 68 */     return a((i, j, arrayOfDbo, arrayOfDaj) -> new czv(☃, true, i, j, arrayOfDbo, arrayOfDaj));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     extends czs.e<czv> {
/*    */     public void a(JsonObject ☃, czv czv1, JsonSerializationContext jsonSerializationContext) {
/* 74 */       super.a(☃, czv1, jsonSerializationContext);
/*    */       
/* 76 */       ☃.addProperty("name", aeh.a().b().b(czv.a(czv1)).toString());
/* 77 */       ☃.addProperty("expand", Boolean.valueOf(czv.b(czv1)));
/*    */     }
/*    */ 
/*    */     
/*    */     protected czv a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, int i, int j, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/* 82 */       vk vk = new vk(afd.h(☃, "name"));
/*    */       
/* 84 */       ael<blx> ael = aeh.a().b().a(vk);
/* 85 */       if (ael == null) {
/* 86 */         throw new JsonParseException("Can't find tag: " + vk);
/*    */       }
/*    */       
/* 89 */       boolean bool = afd.j(☃, "expand");
/*    */       
/* 91 */       return new czv(ael, bool, i, j, arrayOfDbo, arrayOfDaj);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */