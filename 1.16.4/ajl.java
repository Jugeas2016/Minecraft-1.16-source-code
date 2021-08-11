/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ajl
/*    */   extends ajv
/*    */ {
/*    */   public ajl(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "JigsawPropertiesFix", akn.k, "minecraft:jigsaw");
/*    */   }
/*    */   
/*    */   private static Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     String str1 = ☃.get("attachement_type").asString("minecraft:empty");
/* 15 */     String str2 = ☃.get("target_pool").asString("minecraft:empty");
/* 16 */     return ☃
/* 17 */       .set("name", ☃.createString(str1))
/* 18 */       .set("target", ☃.createString(str1))
/* 19 */       .remove("attachement_type")
/* 20 */       .set("pool", ☃.createString(str2))
/* 21 */       .remove("target_pool");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 26 */     return ☃.update(DSL.remainderFinder(), ajl::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */