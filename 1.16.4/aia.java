/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.OptionalDynamic;
/*     */ import java.util.Arrays;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aia
/*     */   extends DataFix
/*     */ {
/*     */   public aia(Schema ☃) {
/*  19 */     super(☃, false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/*  24 */     Schema ☃ = getInputSchema();
/*  25 */     return fixTypeEverywhereTyped("EntityProjectileOwner", ☃.getType(akn.p), this::a);
/*     */   }
/*     */   
/*     */   private Typed<?> a(Typed<?> ☃) {
/*  29 */     ☃ = a(☃, "minecraft:egg", this::d);
/*  30 */     ☃ = a(☃, "minecraft:ender_pearl", this::d);
/*  31 */     ☃ = a(☃, "minecraft:experience_bottle", this::d);
/*  32 */     ☃ = a(☃, "minecraft:snowball", this::d);
/*  33 */     ☃ = a(☃, "minecraft:potion", this::d);
/*  34 */     ☃ = a(☃, "minecraft:potion", this::c);
/*  35 */     ☃ = a(☃, "minecraft:llama_spit", this::b);
/*  36 */     ☃ = a(☃, "minecraft:arrow", this::a);
/*  37 */     ☃ = a(☃, "minecraft:spectral_arrow", this::a);
/*  38 */     ☃ = a(☃, "minecraft:trident", this::a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     return ☃;
/*     */   }
/*     */   
/*     */   private Dynamic<?> a(Dynamic<?> ☃) {
/*  52 */     long l1 = ☃.get("OwnerUUIDMost").asLong(0L);
/*  53 */     long l2 = ☃.get("OwnerUUIDLeast").asLong(0L);
/*     */     
/*  55 */     return a(☃, l1, l2).remove("OwnerUUIDMost").remove("OwnerUUIDLeast");
/*     */   }
/*     */   
/*     */   private Dynamic<?> b(Dynamic<?> ☃) {
/*  59 */     OptionalDynamic<?> optionalDynamic = ☃.get("Owner");
/*  60 */     long l1 = optionalDynamic.get("OwnerUUIDMost").asLong(0L);
/*  61 */     long l2 = optionalDynamic.get("OwnerUUIDLeast").asLong(0L);
/*     */     
/*  63 */     return a(☃, l1, l2).remove("Owner");
/*     */   }
/*     */   
/*     */   private Dynamic<?> c(Dynamic<?> ☃) {
/*  67 */     OptionalDynamic<?> optionalDynamic = ☃.get("Potion");
/*  68 */     return ☃.set("Item", optionalDynamic.orElseEmptyMap()).remove("Potion");
/*     */   }
/*     */   
/*     */   private Dynamic<?> d(Dynamic<?> ☃) {
/*  72 */     String str = "owner";
/*  73 */     OptionalDynamic<?> optionalDynamic = ☃.get("owner");
/*  74 */     long l1 = optionalDynamic.get("M").asLong(0L);
/*  75 */     long l2 = optionalDynamic.get("L").asLong(0L);
/*     */     
/*  77 */     return a(☃, l1, l2).remove("owner");
/*     */   }
/*     */   
/*     */   private Dynamic<?> a(Dynamic<?> ☃, long l1, long l2) {
/*  81 */     String str = "OwnerUUID";
/*  82 */     if (l1 != 0L && l2 != 0L) {
/*  83 */       return ☃.set("OwnerUUID", ☃.createIntList(Arrays.stream(a(l1, l2))));
/*     */     }
/*  85 */     return ☃;
/*     */   }
/*     */   
/*     */   private static int[] a(long ☃, long l1) {
/*  89 */     return new int[] { (int)(☃ >> 32L), (int)☃, (int)(l1 >> 32L), (int)l1 };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Typed<?> a(Typed<?> ☃, String str, Function<Dynamic<?>, Dynamic<?>> function) {
/*  98 */     Type<?> type1 = getInputSchema().getChoiceType(akn.p, str);
/*  99 */     Type<?> type2 = getOutputSchema().getChoiceType(akn.p, str);
/* 100 */     return ☃.updateTyped(DSL.namedChoice(str, type1), type2, typed -> typed.update(DSL.remainderFinder(), ☃));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */