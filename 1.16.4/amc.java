/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
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
/*    */ public class amc
/*    */   extends aln
/*    */ {
/*    */   public amc(int ☃, Schema schema) {
/* 20 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 25 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 27 */     Supplier<TypeTemplate> supplier = () -> DSL.compoundList(akn.r.in(☃), DSL.constType(DSL.intType()));
/*    */     
/* 29 */     ☃.registerType(false, akn.g, () -> DSL.optionalFields("stats", DSL.optionalFields("minecraft:mined", DSL.compoundList(akn.q.in(☃), DSL.constType(DSL.intType())), "minecraft:crafted", supplier.get(), "minecraft:used", supplier.get(), "minecraft:broken", supplier.get(), "minecraft:picked_up", supplier.get(), DSL.optionalFields("minecraft:dropped", supplier.get(), "minecraft:killed", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.intType())), "minecraft:killed_by", DSL.compoundList(akn.n.in(☃), DSL.constType(DSL.intType())), "minecraft:custom", DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType()))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\amc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */