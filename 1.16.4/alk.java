/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ 
/*    */ public class alk
/*    */   extends ajv
/*    */ {
/*    */   public alk(Schema ☃, boolean bool) {
/* 11 */     super(☃, bool, "Zombie Villager XP rebuild", akn.p, "minecraft:zombie_villager");
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 16 */     return ☃.update(DSL.remainderFinder(), ☃ -> {
/*    */           Optional<Number> optional = ☃.get("Xp").asNumber().result();
/*    */           if (!optional.isPresent()) {
/*    */             int i = ☃.get("VillagerData").get("level").asInt(1);
/*    */             return ☃.set("Xp", ☃.createInt(alf.a(i)));
/*    */           } 
/*    */           return ☃;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */