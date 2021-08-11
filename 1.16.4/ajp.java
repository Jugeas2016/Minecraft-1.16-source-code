/*    */ import com.google.common.annotations.VisibleForTesting;
/*    */ import com.google.common.base.Splitter;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.StreamSupport;
/*    */ import org.apache.commons.lang3.math.NumberUtils;
/*    */ 
/*    */ public class ajp
/*    */   extends DataFix
/*    */ {
/*    */   public ajp(Schema ☃, boolean bool) {
/* 20 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 27 */   private static final Splitter a = Splitter.on(';').limit(5);
/* 28 */   private static final Splitter b = Splitter.on(',');
/* 29 */   private static final Splitter c = Splitter.on('x').limit(2);
/* 30 */   private static final Splitter d = Splitter.on('*').limit(2);
/* 31 */   private static final Splitter e = Splitter.on(':').limit(3);
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 35 */     return fixTypeEverywhereTyped("LevelFlatGeneratorInfoFix", getInputSchema().getType(akn.a), ☃ -> ☃.update(DSL.remainderFinder(), this::a));
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃) {
/* 39 */     if (☃.get("generatorName").asString("").equalsIgnoreCase("flat")) {
/* 40 */       return ☃.update("generatorOptions", ☃ -> (Dynamic)DataFixUtils.orElse(☃.asString().map(this::a).map(☃::createString).result(), ☃));
/*    */     }
/* 42 */     return ☃;
/*    */   } @VisibleForTesting
/*    */   String a(String ☃) {
/*    */     int i;
/*    */     String str2;
/* 47 */     if (☃.isEmpty()) {
/* 48 */       return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
/*    */     }
/*    */     
/* 51 */     Iterator<String> iterator = a.split(☃).iterator();
/*    */     
/* 53 */     String str1 = iterator.next();
/*    */ 
/*    */     
/* 56 */     if (iterator.hasNext()) {
/* 57 */       i = NumberUtils.toInt(str1, 0);
/* 58 */       str2 = iterator.next();
/*    */     } else {
/* 60 */       i = 0;
/* 61 */       str2 = str1;
/*    */     } 
/*    */     
/* 64 */     if (i < 0 || i > 3) {
/* 65 */       return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
/*    */     }
/*    */     
/* 68 */     StringBuilder stringBuilder = new StringBuilder();
/*    */     
/* 70 */     Splitter splitter = (i < 3) ? c : d;
/*    */     
/* 72 */     stringBuilder.append(StreamSupport.stream(b.split(str2).spliterator(), false).map(str -> {
/*    */             int j;
/*    */             
/*    */             String str1;
/*    */             
/*    */             List<String> list1 = ☃.splitToList(str);
/*    */             
/*    */             if (list1.size() == 2) {
/*    */               j = NumberUtils.toInt(list1.get(0));
/*    */               str1 = list1.get(1);
/*    */             } else {
/*    */               j = 1;
/*    */               str1 = list1.get(0);
/*    */             } 
/*    */             List<String> list2 = e.splitToList(str1);
/*    */             int k = ((String)list2.get(0)).equals("minecraft") ? 1 : 0;
/*    */             String str2 = list2.get(k);
/*    */             int m = (i == 3) ? ahm.a("minecraft:" + str2) : NumberUtils.toInt(str2, 0);
/*    */             int n = k + 1;
/*    */             int i1 = (list2.size() > n) ? NumberUtils.toInt(list2.get(n), 0) : 0;
/*    */             return ((j == 1) ? "" : (j + "*")) + agz.b(m << 4 | i1).get("Name").asString("");
/* 93 */           }).collect(Collectors.joining(",")));
/*    */     
/* 95 */     while (iterator.hasNext()) {
/* 96 */       stringBuilder.append(';').append(iterator.next());
/*    */     }
/*    */     
/* 99 */     return stringBuilder.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */