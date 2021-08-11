/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.Hook;
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
/*    */ public class alp
/*    */   extends Schema
/*    */ {
/*    */   public alp(int ☃, Schema schema) {
/* 21 */     super(☃, schema);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 26 */     super.registerTypes(☃, map1, map2);
/*    */     
/* 28 */     ☃.registerType(true, akn.l, () -> DSL.hook(DSL.optionalFields("id", akn.r.in(☃), "tag", DSL.optionalFields("EntityTag", akn.o.in(☃), "BlockEntityTag", akn.k.in(☃), "CanDestroy", DSL.list(akn.q.in(☃)), "CanPlaceOn", DSL.list(akn.q.in(☃)))), anl.a, Hook.HookFunction.IDENTITY));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */