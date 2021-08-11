/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class aim
/*     */   extends agd
/*     */ {
/*  14 */   private static final Set<String> c = Sets.newHashSet();
/*  15 */   private static final Set<String> d = Sets.newHashSet();
/*  16 */   private static final Set<String> e = Sets.newHashSet();
/*  17 */   private static final Set<String> f = Sets.newHashSet();
/*  18 */   private static final Set<String> g = Sets.newHashSet();
/*  19 */   private static final Set<String> h = Sets.newHashSet();
/*     */   
/*     */   static {
/*  22 */     c.add("minecraft:donkey");
/*  23 */     c.add("minecraft:horse");
/*  24 */     c.add("minecraft:llama");
/*  25 */     c.add("minecraft:mule");
/*  26 */     c.add("minecraft:skeleton_horse");
/*  27 */     c.add("minecraft:trader_llama");
/*  28 */     c.add("minecraft:zombie_horse");
/*  29 */     d.add("minecraft:cat");
/*  30 */     d.add("minecraft:parrot");
/*  31 */     d.add("minecraft:wolf");
/*  32 */     e.add("minecraft:bee");
/*  33 */     e.add("minecraft:chicken");
/*  34 */     e.add("minecraft:cow");
/*  35 */     e.add("minecraft:fox");
/*  36 */     e.add("minecraft:mooshroom");
/*  37 */     e.add("minecraft:ocelot");
/*  38 */     e.add("minecraft:panda");
/*  39 */     e.add("minecraft:pig");
/*  40 */     e.add("minecraft:polar_bear");
/*  41 */     e.add("minecraft:rabbit");
/*  42 */     e.add("minecraft:sheep");
/*  43 */     e.add("minecraft:turtle");
/*  44 */     e.add("minecraft:hoglin");
/*  45 */     f.add("minecraft:bat");
/*  46 */     f.add("minecraft:blaze");
/*  47 */     f.add("minecraft:cave_spider");
/*  48 */     f.add("minecraft:cod");
/*  49 */     f.add("minecraft:creeper");
/*  50 */     f.add("minecraft:dolphin");
/*  51 */     f.add("minecraft:drowned");
/*  52 */     f.add("minecraft:elder_guardian");
/*  53 */     f.add("minecraft:ender_dragon");
/*  54 */     f.add("minecraft:enderman");
/*  55 */     f.add("minecraft:endermite");
/*  56 */     f.add("minecraft:evoker");
/*  57 */     f.add("minecraft:ghast");
/*  58 */     f.add("minecraft:giant");
/*  59 */     f.add("minecraft:guardian");
/*  60 */     f.add("minecraft:husk");
/*  61 */     f.add("minecraft:illusioner");
/*  62 */     f.add("minecraft:magma_cube");
/*  63 */     f.add("minecraft:pufferfish");
/*  64 */     f.add("minecraft:zombified_piglin");
/*  65 */     f.add("minecraft:salmon");
/*  66 */     f.add("minecraft:shulker");
/*  67 */     f.add("minecraft:silverfish");
/*  68 */     f.add("minecraft:skeleton");
/*  69 */     f.add("minecraft:slime");
/*  70 */     f.add("minecraft:snow_golem");
/*  71 */     f.add("minecraft:spider");
/*  72 */     f.add("minecraft:squid");
/*  73 */     f.add("minecraft:stray");
/*  74 */     f.add("minecraft:tropical_fish");
/*  75 */     f.add("minecraft:vex");
/*  76 */     f.add("minecraft:villager");
/*  77 */     f.add("minecraft:iron_golem");
/*  78 */     f.add("minecraft:vindicator");
/*  79 */     f.add("minecraft:pillager");
/*  80 */     f.add("minecraft:wandering_trader");
/*  81 */     f.add("minecraft:witch");
/*  82 */     f.add("minecraft:wither");
/*  83 */     f.add("minecraft:wither_skeleton");
/*  84 */     f.add("minecraft:zombie");
/*  85 */     f.add("minecraft:zombie_villager");
/*  86 */     f.add("minecraft:phantom");
/*  87 */     f.add("minecraft:ravager");
/*  88 */     f.add("minecraft:piglin");
/*  89 */     g.add("minecraft:armor_stand");
/*  90 */     h.add("minecraft:arrow");
/*  91 */     h.add("minecraft:dragon_fireball");
/*  92 */     h.add("minecraft:firework_rocket");
/*  93 */     h.add("minecraft:fireball");
/*  94 */     h.add("minecraft:llama_spit");
/*  95 */     h.add("minecraft:small_fireball");
/*  96 */     h.add("minecraft:snowball");
/*  97 */     h.add("minecraft:spectral_arrow");
/*  98 */     h.add("minecraft:egg");
/*  99 */     h.add("minecraft:ender_pearl");
/* 100 */     h.add("minecraft:experience_bottle");
/* 101 */     h.add("minecraft:potion");
/* 102 */     h.add("minecraft:trident");
/* 103 */     h.add("minecraft:wither_skull");
/*     */   }
/*     */ 
/*     */   
/*     */   public aim(Schema ☃) {
/* 108 */     super(☃, akn.p);
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/* 113 */     return fixTypeEverywhereTyped("EntityUUIDFixes", getInputSchema().getType(this.b), ☃ -> {
/*     */           ☃ = ☃.update(DSL.remainderFinder(), aim::c);
/*     */           for (String str : c) {
/*     */             ☃ = a(☃, str, aim::l);
/*     */           }
/*     */           for (String str : d) {
/*     */             ☃ = a(☃, str, aim::l);
/*     */           }
/*     */           for (String str : e) {
/*     */             ☃ = a(☃, str, aim::m);
/*     */           }
/*     */           for (String str : f) {
/*     */             ☃ = a(☃, str, aim::n);
/*     */           }
/*     */           for (String str : g) {
/*     */             ☃ = a(☃, str, aim::b);
/*     */           }
/*     */           for (String str : h) {
/*     */             ☃ = a(☃, str, aim::o);
/*     */           }
/*     */           ☃ = a(☃, "minecraft:bee", aim::k);
/*     */           ☃ = a(☃, "minecraft:zombified_piglin", aim::k);
/*     */           ☃ = a(☃, "minecraft:fox", aim::j);
/*     */           ☃ = a(☃, "minecraft:item", aim::i);
/*     */           ☃ = a(☃, "minecraft:shulker_bullet", aim::h);
/*     */           ☃ = a(☃, "minecraft:area_effect_cloud", aim::g);
/*     */           ☃ = a(☃, "minecraft:zombie_villager", aim::f);
/*     */           ☃ = a(☃, "minecraft:evoker_fangs", aim::e);
/*     */           return a(☃, "minecraft:piglin", aim::d);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private static Dynamic<?> d(Dynamic<?> ☃) {
/* 147 */     return ☃.update("Brain", ☃ -> ☃.update("memories", ()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Dynamic<?> e(Dynamic<?> ☃) {
/* 158 */     return c(☃, "OwnerUUID", "Owner").orElse(☃);
/*     */   }
/*     */   
/*     */   private static Dynamic<?> f(Dynamic<?> ☃) {
/* 162 */     return c(☃, "ConversionPlayer", "ConversionPlayer").orElse(☃);
/*     */   }
/*     */   
/*     */   private static Dynamic<?> g(Dynamic<?> ☃) {
/* 166 */     return c(☃, "OwnerUUID", "Owner").orElse(☃);
/*     */   }
/*     */   
/*     */   private static Dynamic<?> h(Dynamic<?> ☃) {
/* 170 */     ☃ = b(☃, "Owner", "Owner").orElse(☃);
/* 171 */     return b(☃, "Target", "Target").orElse(☃);
/*     */   }
/*     */   
/*     */   private static Dynamic<?> i(Dynamic<?> ☃) {
/* 175 */     ☃ = b(☃, "Owner", "Owner").orElse(☃);
/* 176 */     return b(☃, "Thrower", "Thrower").orElse(☃);
/*     */   }
/*     */   
/*     */   private static Dynamic<?> j(Dynamic<?> ☃) {
/* 180 */     Optional<Dynamic<?>> optional = ☃.get("TrustedUUIDs").result().map(dynamic1 -> ☃.createList(dynamic1.asStream().map(())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     return (Dynamic)DataFixUtils.orElse(optional.map(dynamic1 -> ☃.remove("TrustedUUIDs").set("Trusted", dynamic1)), ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Dynamic<?> k(Dynamic<?> ☃) {
/* 194 */     return a(☃, "HurtBy", "HurtBy").orElse(☃);
/*     */   }
/*     */   
/*     */   private static Dynamic<?> l(Dynamic<?> ☃) {
/* 198 */     Dynamic<?> dynamic = m(☃);
/* 199 */     return a(dynamic, "OwnerUUID", "Owner").orElse(dynamic);
/*     */   }
/*     */   
/*     */   private static Dynamic<?> m(Dynamic<?> ☃) {
/* 203 */     Dynamic<?> dynamic = n(☃);
/* 204 */     return c(dynamic, "LoveCause", "LoveCause").orElse(dynamic);
/*     */   }
/*     */   
/*     */   private static Dynamic<?> n(Dynamic<?> ☃) {
/* 208 */     return b(☃).update("Leash", ☃ -> (Dynamic)c(☃, "UUID", "UUID").orElse(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Dynamic<?> b(Dynamic<?> ☃) {
/* 214 */     return ☃.update("Attributes", dynamic1 -> ☃.createList(dynamic1.asStream().map(())));
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
/*     */   private static Dynamic<?> o(Dynamic<?> ☃) {
/* 226 */     return (Dynamic)DataFixUtils.orElse(☃.get("OwnerUUID").result().map(dynamic1 -> ☃.remove("OwnerUUID").set("Owner", dynamic1)), ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Dynamic<?> c(Dynamic<?> ☃) {
/* 232 */     return c(☃, "UUID", "UUID").orElse(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aim.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */