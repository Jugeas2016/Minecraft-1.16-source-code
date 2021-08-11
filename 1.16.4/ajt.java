/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.FieldFinder;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.CompoundList;
/*     */ import com.mojang.datafixers.types.templates.TaggedChoice;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.datafixers.util.Unit;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ public class ajt
/*     */   extends DataFix
/*     */ {
/*     */   public ajt(Schema ☃, boolean bool) {
/*  36 */     super(☃, bool);
/*     */   }
/*     */   
/*     */   private static <A> Type<Pair<A, Dynamic<?>>> a(String ☃, Type<A> type) {
/*  40 */     return DSL.and((Type)DSL.field(☃, type), DSL.remainderType());
/*     */   }
/*     */   
/*     */   private static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> b(String ☃, Type<A> type) {
/*  44 */     return DSL.and(DSL.optional((Type)DSL.field(☃, type)), DSL.remainderType());
/*     */   }
/*     */   
/*     */   private static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> a(String ☃, Type<A1> type, String str1, Type<A2> type1) {
/*  48 */     return DSL.and(
/*  49 */         DSL.optional((Type)DSL.field(☃, type)), 
/*  50 */         DSL.optional((Type)DSL.field(str1, type1)), 
/*  51 */         DSL.remainderType());
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/*  56 */     Schema ☃ = getInputSchema();
/*  57 */     TaggedChoice.TaggedChoiceType<String> taggedChoiceType = new TaggedChoice.TaggedChoiceType("type", DSL.string(), (Map)ImmutableMap.of("minecraft:debug", 
/*  58 */           DSL.remainderType(), "minecraft:flat", 
/*  59 */           b("settings", a("biome", ☃
/*  60 */               .getType(akn.x), "layers", 
/*  61 */               (Type<?>)DSL.list(
/*  62 */                 b("block", ☃
/*  63 */                   .getType(akn.q))))), "minecraft:noise", 
/*     */ 
/*     */ 
/*     */           
/*  67 */           a("biome_source", 
/*  68 */             DSL.taggedChoiceType("type", DSL.string(), (Map)ImmutableMap.of("minecraft:fixed", 
/*  69 */                 a("biome", ☃.getType(akn.x)), "minecraft:multi_noise", 
/*  70 */                 DSL.list(a("biome", ☃.getType(akn.x))), "minecraft:checkerboard", 
/*  71 */                 a("biomes", (Type<?>)DSL.list(☃.getType(akn.x))), "minecraft:vanilla_layered", 
/*  72 */                 DSL.remainderType(), "minecraft:the_end", 
/*  73 */                 DSL.remainderType())), "settings", 
/*     */             
/*  75 */             DSL.or(DSL.string(), a("default_block", ☃
/*  76 */                 .getType(akn.q), "default_fluid", ☃
/*  77 */                 .getType(akn.q))))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     CompoundList.CompoundListType<String, ?> compoundListType = DSL.compoundList(aln.a(), a("generator", (Type<String>)taggedChoiceType));
/*  83 */     Type<?> type1 = DSL.and((Type)compoundListType, DSL.remainderType());
/*     */     
/*  85 */     Type<?> type2 = ☃.getType(akn.y);
/*     */     
/*  87 */     FieldFinder<?> fieldFinder = new FieldFinder("dimensions", type1);
/*  88 */     if (!type2.findFieldType("dimensions").equals(type1)) {
/*  89 */       throw new IllegalStateException();
/*     */     }
/*  91 */     OpticFinder<? extends List<? extends Pair<String, ?>>> opticFinder = compoundListType.finder();
/*  92 */     return fixTypeEverywhereTyped("MissingDimensionFix", type2, typed -> typed.updateTyped((OpticFinder)☃, ()));
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
/*     */   private <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 107 */     long l = ☃.get("seed").asLong(0L);
/* 108 */     return new Dynamic(☃.getOps(), ali.a(☃, l, ali.a(☃, l), false));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */