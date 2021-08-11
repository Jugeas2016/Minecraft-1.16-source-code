/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import it.unimi.dsi.fastutil.shorts.ShortArrayList;
/*    */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ public class ahi
/*    */   extends DataFix
/*    */ {
/*    */   public ahi(Schema ☃, boolean bool) {
/* 26 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 31 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/* 32 */     Type<?> type1 = getOutputSchema().getType(akn.c);
/* 33 */     Type<?> type2 = ☃.findFieldType("Level");
/* 34 */     Type<?> type3 = type1.findFieldType("Level");
/* 35 */     Type<?> type4 = type2.findFieldType("TileTicks");
/*    */     
/* 37 */     OpticFinder<?> opticFinder1 = DSL.fieldFinder("Level", type2);
/* 38 */     OpticFinder<?> opticFinder2 = DSL.fieldFinder("TileTicks", type4);
/*    */     
/* 40 */     return TypeRewriteRule.seq(
/* 41 */         fixTypeEverywhereTyped("ChunkToProtoChunkFix", ☃, getOutputSchema().getType(akn.c), typed -> typed.updateTyped(☃, type, ())), 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 84 */         writeAndRead("Structure biome inject", getInputSchema().getType(akn.t), getOutputSchema().getType(akn.t)));
/*    */   }
/*    */ 
/*    */   
/*    */   private static short a(int ☃, int i, int j) {
/* 89 */     return (short)(☃ & 0xF | (i & 0xF) << 4 | (j & 0xF) << 8);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */