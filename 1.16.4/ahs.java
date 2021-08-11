/*    */ import com.google.common.collect.Sets;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class ahs
/*    */   extends DataFix
/*    */ {
/*    */   public ahs(Schema ☃, boolean bool) {
/* 15 */     super(☃, bool);
/*    */   }
/*    */   
/* 18 */   private static final Set<String> a = Sets.newHashSet((Object[])new String[] { "ArmorStand", "Bat", "Blaze", "CaveSpider", "Chicken", "Cow", "Creeper", "EnderDragon", "Enderman", "Endermite", "EntityHorse", "Ghast", "Giant", "Guardian", "LavaSlime", "MushroomCow", "Ozelot", "Pig", "PigZombie", "Rabbit", "Sheep", "Shulker", "Silverfish", "Skeleton", "Slime", "SnowMan", "Spider", "Squid", "Villager", "VillagerGolem", "Witch", "WitherBoss", "Wolf", "Zombie" });
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/*    */     float f;
/* 58 */     Optional<Number> optional1 = ☃.get("HealF").asNumber().result();
/* 59 */     Optional<Number> optional2 = ☃.get("Health").asNumber().result();
/* 60 */     if (optional1.isPresent()) {
/* 61 */       f = ((Number)optional1.get()).floatValue();
/* 62 */       ☃ = ☃.remove("HealF");
/* 63 */     } else if (optional2.isPresent()) {
/* 64 */       f = ((Number)optional2.get()).floatValue();
/*    */     } else {
/* 66 */       return ☃;
/*    */     } 
/* 68 */     return ☃.set("Health", ☃.createFloat(f));
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 73 */     return fixTypeEverywhereTyped("EntityHealthFix", getInputSchema().getType(akn.p), ☃ -> ☃.update(DSL.remainderFinder(), this::a));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */