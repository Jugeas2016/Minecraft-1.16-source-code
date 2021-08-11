/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aja
/*     */   extends DataFix
/*     */ {
/*     */   private static final String[] a;
/*     */   
/*     */   public aja(Schema ☃, boolean bool) {
/*  23 */     super(☃, bool);
/*     */   }
/*     */   
/*     */   static {
/*  27 */     a = (String[])DataFixUtils.make(new String[128], ☃ -> {
/*     */           ☃[0] = "minecraft:water";
/*     */           ☃[1] = "minecraft:regeneration";
/*     */           ☃[2] = "minecraft:swiftness";
/*     */           ☃[3] = "minecraft:fire_resistance";
/*     */           ☃[4] = "minecraft:poison";
/*     */           ☃[5] = "minecraft:healing";
/*     */           ☃[6] = "minecraft:night_vision";
/*     */           ☃[7] = null;
/*     */           ☃[8] = "minecraft:weakness";
/*     */           ☃[9] = "minecraft:strength";
/*     */           ☃[10] = "minecraft:slowness";
/*     */           ☃[11] = "minecraft:leaping";
/*     */           ☃[12] = "minecraft:harming";
/*     */           ☃[13] = "minecraft:water_breathing";
/*     */           ☃[14] = "minecraft:invisibility";
/*     */           ☃[15] = null;
/*     */           ☃[16] = "minecraft:awkward";
/*     */           ☃[17] = "minecraft:regeneration";
/*     */           ☃[18] = "minecraft:swiftness";
/*     */           ☃[19] = "minecraft:fire_resistance";
/*     */           ☃[20] = "minecraft:poison";
/*     */           ☃[21] = "minecraft:healing";
/*     */           ☃[22] = "minecraft:night_vision";
/*     */           ☃[23] = null;
/*     */           ☃[24] = "minecraft:weakness";
/*     */           ☃[25] = "minecraft:strength";
/*     */           ☃[26] = "minecraft:slowness";
/*     */           ☃[27] = "minecraft:leaping";
/*     */           ☃[28] = "minecraft:harming";
/*     */           ☃[29] = "minecraft:water_breathing";
/*     */           ☃[30] = "minecraft:invisibility";
/*     */           ☃[31] = null;
/*     */           ☃[32] = "minecraft:thick";
/*     */           ☃[33] = "minecraft:strong_regeneration";
/*     */           ☃[34] = "minecraft:strong_swiftness";
/*     */           ☃[35] = "minecraft:fire_resistance";
/*     */           ☃[36] = "minecraft:strong_poison";
/*     */           ☃[37] = "minecraft:strong_healing";
/*     */           ☃[38] = "minecraft:night_vision";
/*     */           ☃[39] = null;
/*     */           ☃[40] = "minecraft:weakness";
/*     */           ☃[41] = "minecraft:strong_strength";
/*     */           ☃[42] = "minecraft:slowness";
/*     */           ☃[43] = "minecraft:strong_leaping";
/*     */           ☃[44] = "minecraft:strong_harming";
/*     */           ☃[45] = "minecraft:water_breathing";
/*     */           ☃[46] = "minecraft:invisibility";
/*     */           ☃[47] = null;
/*     */           ☃[48] = null;
/*     */           ☃[49] = "minecraft:strong_regeneration";
/*     */           ☃[50] = "minecraft:strong_swiftness";
/*     */           ☃[51] = "minecraft:fire_resistance";
/*     */           ☃[52] = "minecraft:strong_poison";
/*     */           ☃[53] = "minecraft:strong_healing";
/*     */           ☃[54] = "minecraft:night_vision";
/*     */           ☃[55] = null;
/*     */           ☃[56] = "minecraft:weakness";
/*     */           ☃[57] = "minecraft:strong_strength";
/*     */           ☃[58] = "minecraft:slowness";
/*     */           ☃[59] = "minecraft:strong_leaping";
/*     */           ☃[60] = "minecraft:strong_harming";
/*     */           ☃[61] = "minecraft:water_breathing";
/*     */           ☃[62] = "minecraft:invisibility";
/*     */           ☃[63] = null;
/*     */           ☃[64] = "minecraft:mundane";
/*     */           ☃[65] = "minecraft:long_regeneration";
/*     */           ☃[66] = "minecraft:long_swiftness";
/*     */           ☃[67] = "minecraft:long_fire_resistance";
/*     */           ☃[68] = "minecraft:long_poison";
/*     */           ☃[69] = "minecraft:healing";
/*     */           ☃[70] = "minecraft:long_night_vision";
/*     */           ☃[71] = null;
/*     */           ☃[72] = "minecraft:long_weakness";
/*     */           ☃[73] = "minecraft:long_strength";
/*     */           ☃[74] = "minecraft:long_slowness";
/*     */           ☃[75] = "minecraft:long_leaping";
/*     */           ☃[76] = "minecraft:harming";
/*     */           ☃[77] = "minecraft:long_water_breathing";
/*     */           ☃[78] = "minecraft:long_invisibility";
/*     */           ☃[79] = null;
/*     */           ☃[80] = "minecraft:awkward";
/*     */           ☃[81] = "minecraft:long_regeneration";
/*     */           ☃[82] = "minecraft:long_swiftness";
/*     */           ☃[83] = "minecraft:long_fire_resistance";
/*     */           ☃[84] = "minecraft:long_poison";
/*     */           ☃[85] = "minecraft:healing";
/*     */           ☃[86] = "minecraft:long_night_vision";
/*     */           ☃[87] = null;
/*     */           ☃[88] = "minecraft:long_weakness";
/*     */           ☃[89] = "minecraft:long_strength";
/*     */           ☃[90] = "minecraft:long_slowness";
/*     */           ☃[91] = "minecraft:long_leaping";
/*     */           ☃[92] = "minecraft:harming";
/*     */           ☃[93] = "minecraft:long_water_breathing";
/*     */           ☃[94] = "minecraft:long_invisibility";
/*     */           ☃[95] = null;
/*     */           ☃[96] = "minecraft:thick";
/*     */           ☃[97] = "minecraft:regeneration";
/*     */           ☃[98] = "minecraft:swiftness";
/*     */           ☃[99] = "minecraft:long_fire_resistance";
/*     */           ☃[100] = "minecraft:poison";
/*     */           ☃[101] = "minecraft:strong_healing";
/*     */           ☃[102] = "minecraft:long_night_vision";
/*     */           ☃[103] = null;
/*     */           ☃[104] = "minecraft:long_weakness";
/*     */           ☃[105] = "minecraft:strength";
/*     */           ☃[106] = "minecraft:long_slowness";
/*     */           ☃[107] = "minecraft:leaping";
/*     */           ☃[108] = "minecraft:strong_harming";
/*     */           ☃[109] = "minecraft:long_water_breathing";
/*     */           ☃[110] = "minecraft:long_invisibility";
/*     */           ☃[111] = null;
/*     */           ☃[112] = null;
/*     */           ☃[113] = "minecraft:regeneration";
/*     */           ☃[114] = "minecraft:swiftness";
/*     */           ☃[115] = "minecraft:long_fire_resistance";
/*     */           ☃[116] = "minecraft:poison";
/*     */           ☃[117] = "minecraft:strong_healing";
/*     */           ☃[118] = "minecraft:long_night_vision";
/*     */           ☃[119] = null;
/*     */           ☃[120] = "minecraft:long_weakness";
/*     */           ☃[121] = "minecraft:strength";
/*     */           ☃[122] = "minecraft:long_slowness";
/*     */           ☃[123] = "minecraft:leaping";
/*     */           ☃[124] = "minecraft:strong_harming";
/*     */           ☃[125] = "minecraft:long_water_breathing";
/*     */           ☃[126] = "minecraft:long_invisibility";
/*     */           ☃[127] = null;
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/* 162 */     Type<?> ☃ = getInputSchema().getType(akn.l);
/* 163 */     OpticFinder<Pair<String, String>> opticFinder = DSL.fieldFinder("id", DSL.named(akn.r.typeName(), aln.a()));
/* 164 */     OpticFinder<?> opticFinder1 = ☃.findField("tag");
/*     */     
/* 166 */     return fixTypeEverywhereTyped("ItemPotionFix", ☃, typed -> {
/*     */           Optional<Pair<String, String>> optional = typed.getOptional(☃);
/*     */           if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:potion")) {
/*     */             Dynamic<?> dynamic = (Dynamic)typed.get(DSL.remainderFinder());
/*     */             Optional<? extends Typed<?>> optional1 = typed.getOptionalTyped(opticFinder1);
/*     */             short s = dynamic.get("Damage").asShort((short)0);
/*     */             if (optional1.isPresent()) {
/*     */               Typed<?> typed1 = typed;
/*     */               Dynamic<?> dynamic1 = (Dynamic)((Typed)optional1.get()).get(DSL.remainderFinder());
/*     */               Optional<String> optional2 = dynamic1.get("Potion").asString().result();
/*     */               if (!optional2.isPresent()) {
/*     */                 String str = a[s & 0x7F];
/*     */                 Typed<?> typed2 = ((Typed)optional1.get()).set(DSL.remainderFinder(), dynamic1.set("Potion", dynamic1.createString((str == null) ? "minecraft:water" : str)));
/*     */                 typed1 = typed1.set(opticFinder1, typed2);
/*     */                 if ((s & 0x4000) == 16384)
/*     */                   typed1 = typed1.set(☃, Pair.of(akn.r.typeName(), "minecraft:splash_potion")); 
/*     */               } 
/*     */               if (s != 0)
/*     */                 dynamic = dynamic.set("Damage", dynamic.createShort((short)0)); 
/*     */               return typed1.set(DSL.remainderFinder(), dynamic);
/*     */             } 
/*     */           } 
/*     */           return typed;
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aja.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */