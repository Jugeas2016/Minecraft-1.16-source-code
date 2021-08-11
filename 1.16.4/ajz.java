/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ public class ajz
/*    */   extends ajv
/*    */ {
/*    */   public ajz(Schema ☃, boolean bool) {
/* 12 */     super(☃, bool, "OminousBannerBlockEntityRenameFix", akn.k, "minecraft:banner");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 17 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 21 */     Optional<String> optional = ☃.get("CustomName").asString().result();
/* 22 */     if (optional.isPresent()) {
/* 23 */       String str = optional.get();
/* 24 */       str = str.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
/* 25 */       return ☃.set("CustomName", ☃.createString(str));
/*    */     } 
/* 27 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */