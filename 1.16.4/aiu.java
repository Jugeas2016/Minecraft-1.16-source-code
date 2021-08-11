/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class aiu
/*    */   extends DataFix
/*    */ {
/*    */   public aiu(Schema ☃, boolean bool) {
/* 15 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 20 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/* 21 */     OpticFinder<?> opticFinder = ☃.findField("Level");
/* 22 */     return fixTypeEverywhereTyped("HeightmapRenamingFix", ☃, typed -> typed.updateTyped(☃, ()));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 28 */     Optional<? extends Dynamic<?>> optional1 = ☃.get("Heightmaps").result();
/* 29 */     if (!optional1.isPresent()) {
/* 30 */       return ☃;
/*    */     }
/*    */     
/* 33 */     Dynamic<?> dynamic = optional1.get();
/*    */     
/* 35 */     Optional<? extends Dynamic<?>> optional2 = dynamic.get("LIQUID").result();
/* 36 */     if (optional2.isPresent()) {
/* 37 */       dynamic = dynamic.remove("LIQUID");
/* 38 */       dynamic = dynamic.set("WORLD_SURFACE_WG", optional2.get());
/*    */     } 
/*    */     
/* 41 */     Optional<? extends Dynamic<?>> optional3 = dynamic.get("SOLID").result();
/* 42 */     if (optional3.isPresent()) {
/* 43 */       dynamic = dynamic.remove("SOLID");
/* 44 */       dynamic = dynamic.set("OCEAN_FLOOR_WG", optional3.get());
/* 45 */       dynamic = dynamic.set("OCEAN_FLOOR", optional3.get());
/*    */     } 
/*    */     
/* 48 */     Optional<? extends Dynamic<?>> optional4 = dynamic.get("LIGHT").result();
/* 49 */     if (optional4.isPresent()) {
/* 50 */       dynamic = dynamic.remove("LIGHT");
/* 51 */       dynamic = dynamic.set("LIGHT_BLOCKING", optional4.get());
/*    */     } 
/*    */     
/* 54 */     Optional<? extends Dynamic<?>> optional5 = dynamic.get("RAIN").result();
/* 55 */     if (optional5.isPresent()) {
/* 56 */       dynamic = dynamic.remove("RAIN");
/* 57 */       dynamic = dynamic.set("MOTION_BLOCKING", optional5.get());
/* 58 */       dynamic = dynamic.set("MOTION_BLOCKING_NO_LEAVES", optional5.get());
/*    */     } 
/*    */     
/* 61 */     return ☃.set("Heightmaps", dynamic);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aiu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */