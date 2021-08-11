/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ public class aks
/*    */   extends DataFix
/*    */ {
/*    */   public aks(Schema ☃, boolean bool) {
/* 21 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TypeRewriteRule makeRule() {
/* 26 */     Type<Pair<String, Dynamic<?>>> ☃ = DSL.named(akn.j.typeName(), DSL.remainderType());
/*    */     
/* 28 */     if (!Objects.equals(☃, getInputSchema().getType(akn.j))) {
/* 29 */       throw new IllegalStateException("Poi type is not what was expected.");
/*    */     }
/* 31 */     return fixTypeEverywhere("POI reorganization", ☃, ☃ -> ());
/*    */   }
/*    */   
/*    */   private static <T> Dynamic<T> a(Dynamic<T> ☃) {
/* 35 */     Map<Dynamic<T>, Dynamic<T>> map = Maps.newHashMap();
/* 36 */     for (int i = 0; i < 16; i++) {
/* 37 */       String str = String.valueOf(i);
/* 38 */       Optional<Dynamic<T>> optional = ☃.get(str).result();
/* 39 */       if (optional.isPresent()) {
/* 40 */         Dynamic<T> dynamic1 = optional.get();
/* 41 */         Dynamic<T> dynamic2 = ☃.createMap((Map)ImmutableMap.of(☃.createString("Records"), dynamic1));
/* 42 */         map.put(☃.createInt(i), dynamic2);
/* 43 */         ☃ = ☃.remove(str);
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     return ☃.set("Sections", ☃.createMap(map));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */