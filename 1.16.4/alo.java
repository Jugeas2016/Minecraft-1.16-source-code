/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
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
/*     */ public class alo
/*     */   extends Schema
/*     */ {
/*     */   public alo(int ☃, Schema schema) {
/*  21 */     super(☃, schema);
/*     */   }
/*     */   
/*     */   protected static TypeTemplate a(Schema ☃) {
/*  25 */     return DSL.optionalFields("ArmorItems", 
/*  26 */         DSL.list(akn.l.in(☃)), "HandItems", 
/*  27 */         DSL.list(akn.l.in(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected static void a(Schema ☃, Map<String, Supplier<TypeTemplate>> map, String str) {
/*  32 */     ☃.register(map, str, () -> a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema ☃) {
/*  37 */     Map<String, Supplier<TypeTemplate>> map = super.registerEntities(☃);
/*     */ 
/*     */     
/*  40 */     a(☃, map, "ArmorStand");
/*  41 */     a(☃, map, "Creeper");
/*  42 */     a(☃, map, "Skeleton");
/*  43 */     a(☃, map, "Spider");
/*  44 */     a(☃, map, "Giant");
/*  45 */     a(☃, map, "Zombie");
/*  46 */     a(☃, map, "Slime");
/*  47 */     a(☃, map, "Ghast");
/*  48 */     a(☃, map, "PigZombie");
/*  49 */     ☃.register(map, "Enderman", str -> DSL.optionalFields("carried", akn.q.in(☃), a(☃)));
/*     */ 
/*     */ 
/*     */     
/*  53 */     a(☃, map, "CaveSpider");
/*  54 */     a(☃, map, "Silverfish");
/*  55 */     a(☃, map, "Blaze");
/*  56 */     a(☃, map, "LavaSlime");
/*  57 */     a(☃, map, "EnderDragon");
/*  58 */     a(☃, map, "WitherBoss");
/*  59 */     a(☃, map, "Bat");
/*  60 */     a(☃, map, "Witch");
/*  61 */     a(☃, map, "Endermite");
/*  62 */     a(☃, map, "Guardian");
/*  63 */     a(☃, map, "Pig");
/*  64 */     a(☃, map, "Sheep");
/*  65 */     a(☃, map, "Cow");
/*  66 */     a(☃, map, "Chicken");
/*  67 */     a(☃, map, "Squid");
/*  68 */     a(☃, map, "Wolf");
/*  69 */     a(☃, map, "MushroomCow");
/*  70 */     a(☃, map, "SnowMan");
/*  71 */     a(☃, map, "Ozelot");
/*  72 */     a(☃, map, "VillagerGolem");
/*  73 */     ☃.register(map, "EntityHorse", str -> DSL.optionalFields("Items", DSL.list(akn.l.in(☃)), "ArmorItem", akn.l.in(☃), "SaddleItem", akn.l.in(☃), a(☃)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     a(☃, map, "Rabbit");
/*  80 */     ☃.register(map, "Villager", str -> DSL.optionalFields("Inventory", DSL.list(akn.l.in(☃)), "Offers", DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", akn.l.in(☃), "buyB", akn.l.in(☃), "sell", akn.l.in(☃)))), a(☃)));
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
/*  93 */     a(☃, map, "Shulker");
/*     */ 
/*     */     
/*  96 */     ☃.registerSimple(map, "AreaEffectCloud");
/*  97 */     ☃.registerSimple(map, "ShulkerBullet");
/*     */     
/*  99 */     return map;
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerTypes(Schema ☃, Map<String, Supplier<TypeTemplate>> map1, Map<String, Supplier<TypeTemplate>> map2) {
/* 104 */     super.registerTypes(☃, map1, map2);
/*     */     
/* 106 */     ☃.registerType(false, akn.f, () -> DSL.optionalFields("entities", DSL.list(DSL.optionalFields("nbt", akn.o.in(☃))), "blocks", DSL.list(DSL.optionalFields("nbt", akn.k.in(☃))), "palette", DSL.list(akn.m.in(☃))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     ☃.registerType(false, akn.m, DSL::remainder);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */