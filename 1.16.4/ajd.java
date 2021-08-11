/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ 
/*     */ public class ajd
/*     */   extends DataFix
/*     */ {
/*     */   private static final String[] a;
/*     */   
/*     */   public ajd(Schema ☃, boolean bool) {
/*  21 */     super(☃, bool);
/*     */   }
/*     */   static {
/*  24 */     a = (String[])DataFixUtils.make(new String[256], ☃ -> {
/*     */           ☃[1] = "Item";
/*     */           ☃[2] = "XPOrb";
/*     */           ☃[7] = "ThrownEgg";
/*     */           ☃[8] = "LeashKnot";
/*     */           ☃[9] = "Painting";
/*     */           ☃[10] = "Arrow";
/*     */           ☃[11] = "Snowball";
/*     */           ☃[12] = "Fireball";
/*     */           ☃[13] = "SmallFireball";
/*     */           ☃[14] = "ThrownEnderpearl";
/*     */           ☃[15] = "EyeOfEnderSignal";
/*     */           ☃[16] = "ThrownPotion";
/*     */           ☃[17] = "ThrownExpBottle";
/*     */           ☃[18] = "ItemFrame";
/*     */           ☃[19] = "WitherSkull";
/*     */           ☃[20] = "PrimedTnt";
/*     */           ☃[21] = "FallingSand";
/*     */           ☃[22] = "FireworksRocketEntity";
/*     */           ☃[23] = "TippedArrow";
/*     */           ☃[24] = "SpectralArrow";
/*     */           ☃[25] = "ShulkerBullet";
/*     */           ☃[26] = "DragonFireball";
/*     */           ☃[30] = "ArmorStand";
/*     */           ☃[41] = "Boat";
/*     */           ☃[42] = "MinecartRideable";
/*     */           ☃[43] = "MinecartChest";
/*     */           ☃[44] = "MinecartFurnace";
/*     */           ☃[45] = "MinecartTNT";
/*     */           ☃[46] = "MinecartHopper";
/*     */           ☃[47] = "MinecartSpawner";
/*     */           ☃[40] = "MinecartCommandBlock";
/*     */           ☃[48] = "Mob";
/*     */           ☃[49] = "Monster";
/*     */           ☃[50] = "Creeper";
/*     */           ☃[51] = "Skeleton";
/*     */           ☃[52] = "Spider";
/*     */           ☃[53] = "Giant";
/*     */           ☃[54] = "Zombie";
/*     */           ☃[55] = "Slime";
/*     */           ☃[56] = "Ghast";
/*     */           ☃[57] = "PigZombie";
/*     */           ☃[58] = "Enderman";
/*     */           ☃[59] = "CaveSpider";
/*     */           ☃[60] = "Silverfish";
/*     */           ☃[61] = "Blaze";
/*     */           ☃[62] = "LavaSlime";
/*     */           ☃[63] = "EnderDragon";
/*     */           ☃[64] = "WitherBoss";
/*     */           ☃[65] = "Bat";
/*     */           ☃[66] = "Witch";
/*     */           ☃[67] = "Endermite";
/*     */           ☃[68] = "Guardian";
/*     */           ☃[69] = "Shulker";
/*     */           ☃[90] = "Pig";
/*     */           ☃[91] = "Sheep";
/*     */           ☃[92] = "Cow";
/*     */           ☃[93] = "Chicken";
/*     */           ☃[94] = "Squid";
/*     */           ☃[95] = "Wolf";
/*     */           ☃[96] = "MushroomCow";
/*     */           ☃[97] = "SnowMan";
/*     */           ☃[98] = "Ozelot";
/*     */           ☃[99] = "VillagerGolem";
/*     */           ☃[100] = "EntityHorse";
/*     */           ☃[101] = "Rabbit";
/*     */           ☃[120] = "Villager";
/*     */           ☃[200] = "EnderCrystal";
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/* 107 */     Schema ☃ = getInputSchema();
/* 108 */     Type<?> type1 = ☃.getType(akn.l);
/*     */     
/* 110 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 111 */     OpticFinder<String> opticFinder1 = DSL.fieldFinder("id", DSL.string());
/* 112 */     OpticFinder<?> opticFinder2 = type1.findField("tag");
/* 113 */     OpticFinder<?> opticFinder3 = opticFinder2.type().findField("EntityTag");
/* 114 */     OpticFinder<?> opticFinder4 = DSL.typeFinder(☃.getTypeRaw(akn.p));
/*     */     
/* 116 */     Type<?> type2 = getOutputSchema().getTypeRaw(akn.p);
/*     */     
/* 118 */     return fixTypeEverywhereTyped("ItemSpawnEggFix", type1, typed -> {
/*     */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*     */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:spawn_egg")) {
/*     */             Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*     */             short s = dynamic.get("Damage").asShort((short)0);
/*     */             Optional<? extends Typed<?>> optional1 = typed.getOptionalTyped(opticFinder1);
/*     */             Optional<? extends Typed<?>> optional2 = optional1.flatMap(());
/*     */             Optional<? extends Typed<?>> optional3 = optional2.flatMap(());
/*     */             Optional<String> optional4 = optional3.flatMap(());
/*     */             Typed<?> typed1 = typed;
/*     */             String str = a[s & 0xFF];
/*     */             if (str != null && (!optional4.isPresent() || !Objects.equals(optional4.get(), str))) {
/*     */               Typed<?> typed2 = typed.getOrCreateTyped(opticFinder1);
/*     */               Typed<?> typed3 = typed2.getOrCreateTyped(opticFinder2);
/*     */               Typed<?> typed4 = typed3.getOrCreateTyped(opticFinder3);
/*     */               Dynamic<?> dynamic1 = dynamic;
/*     */               Typed<?> typed5 = (Typed)((Pair)typed4.write().flatMap(()).result().orElseThrow(())).getFirst();
/*     */               typed1 = typed1.set(opticFinder1, typed2.set(opticFinder2, typed3.set(opticFinder3, typed5)));
/*     */             } 
/*     */             if (s != 0) {
/*     */               dynamic = dynamic.set("Damage", dynamic.createShort((short)0));
/*     */               typed1 = typed1.set(DSL.remainderFinder(), dynamic);
/*     */             } 
/*     */             return typed1;
/*     */           } 
/*     */           return typed;
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */