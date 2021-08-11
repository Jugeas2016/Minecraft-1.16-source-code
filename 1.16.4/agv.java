/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class agv
/*    */   extends agd {
/*    */   public agv(Schema ☃) {
/*  9 */     super(☃, akn.k);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 14 */     return fixTypeEverywhereTyped("BlockEntityUUIDFix", getInputSchema().getType(this.b), ☃ -> {
/*    */           ☃ = a(☃, "minecraft:conduit", this::c);
/*    */           return a(☃, "minecraft:skull", this::b);
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   private Dynamic<?> b(Dynamic<?> ☃) {
/* 22 */     return ☃.get("Owner").get().map(☃ -> (Dynamic)a(☃, "Id", "Id").orElse(☃))
/*    */       
/* 24 */       .map(dynamic1 -> ☃.remove("Owner").set("SkullOwner", dynamic1))
/*    */       
/* 26 */       .result().orElse(☃);
/*    */   }
/*    */   
/*    */   private Dynamic<?> c(Dynamic<?> ☃) {
/* 30 */     return b(☃, "target_uuid", "Target").orElse(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */