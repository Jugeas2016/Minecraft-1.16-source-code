/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class ahx extends DataFix {
/*    */   public ahx(Schema ☃, boolean bool) {
/* 18 */     super(☃, bool);
/*    */   }
/*    */   
/* 21 */   private static final List<String> a = Lists.newArrayList((Object[])new String[] { "MinecartRideable", "MinecartChest", "MinecartFurnace" });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 30 */     TaggedChoice.TaggedChoiceType<String> ☃ = getInputSchema().findChoiceType(akn.p);
/* 31 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType1 = getOutputSchema().findChoiceType(akn.p);
/*    */     
/* 33 */     return fixTypeEverywhere("EntityMinecartIdentifiersFix", (Type)☃, (Type)taggedChoiceType1, dynamicOps -> ());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */