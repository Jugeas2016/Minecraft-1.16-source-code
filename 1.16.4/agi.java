/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.List;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agi
/*    */   extends DataFix
/*    */ {
/*    */   public agi(Schema ☃, boolean bool) {
/* 26 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 31 */     Type<?> ☃ = getOutputSchema().getType(akn.c);
/* 32 */     Type<?> type1 = ☃.findFieldType("Level");
/* 33 */     Type<?> type2 = type1.findFieldType("TileEntities");
/* 34 */     if (!(type2 instanceof List.ListType)) {
/* 35 */       throw new IllegalStateException("Tile entity type is not a list type.");
/*    */     }
/* 37 */     List.ListType<?> listType = (List.ListType)type2;
/*    */     
/* 39 */     return a(type1, listType);
/*    */   }
/*    */   
/*    */   private <TE> TypeRewriteRule a(Type<?> ☃, List.ListType<TE> listType) {
/* 43 */     Type<TE> type = listType.getElement();
/* 44 */     OpticFinder<?> opticFinder = DSL.fieldFinder("Level", ☃);
/* 45 */     OpticFinder<List<TE>> opticFinder1 = DSL.fieldFinder("TileEntities", (Type)listType);
/*    */ 
/*    */     
/* 48 */     int i = 416;
/*    */     
/* 50 */     return TypeRewriteRule.seq(
/* 51 */         fixTypeEverywhere("InjectBedBlockEntityType", (Type)getInputSchema().findChoiceType(akn.k), (Type)getOutputSchema().findChoiceType(akn.k), ☃ -> ()), 
/* 52 */         fixTypeEverywhereTyped("BedBlockEntityInjecter", getOutputSchema().getType(akn.c), typed -> {
/*    */             Typed<?> typed1 = typed.getTyped(☃);
/*    */             Dynamic<?> dynamic = (Dynamic)typed1.get(DSL.remainderFinder());
/*    */             int i = dynamic.get("xPos").asInt(0);
/*    */             int j = dynamic.get("zPos").asInt(0);
/*    */             List<TE> list = Lists.newArrayList((Iterable)typed1.getOrCreate(opticFinder1));
/*    */             List<? extends Dynamic<?>> list1 = dynamic.get("Sections").asList(Function.identity());
/*    */             for (int k = 0; k < list1.size(); k++) {
/*    */               Dynamic<?> dynamic1 = list1.get(k);
/*    */               int m = dynamic1.get("Y").asInt(0);
/*    */               Stream<Integer> stream = dynamic1.get("Blocks").asStream().map(());
/*    */               int n = 0;
/*    */               Iterator<?> iterator = stream::iterator.iterator();
/*    */               while (iterator.hasNext()) {
/*    */                 int i1 = ((Integer)iterator.next()).intValue();
/*    */                 if (416 == (i1 & 0xFF) << 4) {
/*    */                   int i2 = n & 0xF;
/*    */                   int i3 = n >> 8 & 0xF;
/*    */                   int i4 = n >> 4 & 0xF;
/*    */                   Map<Dynamic<?>, Dynamic<?>> map = Maps.newHashMap();
/*    */                   map.put(dynamic1.createString("id"), dynamic1.createString("minecraft:bed"));
/*    */                   map.put(dynamic1.createString("x"), dynamic1.createInt(i2 + (i << 4)));
/*    */                   map.put(dynamic1.createString("y"), dynamic1.createInt(i3 + (m << 4)));
/*    */                   map.put(dynamic1.createString("z"), dynamic1.createInt(i4 + (j << 4)));
/*    */                   map.put(dynamic1.createString("color"), dynamic1.createShort((short)14));
/*    */                   list.add((TE)((Pair)type.read(dynamic1.createMap(map)).result().orElseThrow(())).getFirst());
/*    */                 } 
/*    */                 n++;
/*    */               } 
/*    */             } 
/*    */             return !list.isEmpty() ? typed.set(☃, typed1.set(opticFinder1, list)) : typed;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */