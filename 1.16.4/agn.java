/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class agn
/*    */   extends ajv {
/*    */   public agn(Schema ☃, boolean bool) {
/* 11 */     super(☃, bool, "BlockEntityBannerColorFix", akn.k, "minecraft:banner");
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 15 */     ☃ = ☃.update("Base", ☃ -> ☃.createInt(15 - ☃.asInt(0)));
/*    */     
/* 17 */     ☃ = ☃.update("Patterns", ☃ -> (Dynamic)DataFixUtils.orElse(☃.asStreamOpt().map(()).map(☃::createList).result(), ☃));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 28 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */