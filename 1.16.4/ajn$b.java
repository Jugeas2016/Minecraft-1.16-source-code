/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class b
/*     */ {
/* 193 */   private final Type<Pair<String, Dynamic<?>>> e = DSL.named(akn.m.typeName(), DSL.remainderType());
/* 194 */   protected final OpticFinder<List<Pair<String, Dynamic<?>>>> a = DSL.fieldFinder("Palette", (Type)DSL.list(this.e));
/*     */   
/*     */   protected final List<Dynamic<?>> b;
/*     */   protected final int c;
/*     */   @Nullable
/*     */   protected agc d;
/*     */   
/*     */   public b(Typed<?> ☃, Schema schema) {
/* 202 */     if (!Objects.equals(schema.getType(akn.m), this.e)) {
/* 203 */       throw new IllegalStateException("Block state type is not what was expected.");
/*     */     }
/*     */     
/* 206 */     Optional<List<Pair<String, Dynamic<?>>>> optional = ☃.getOptional(this.a);
/*     */     
/* 208 */     this.b = (List<Dynamic<?>>)optional.map(☃ -> (List)☃.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse(ImmutableList.of());
/*     */     
/* 210 */     Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/* 211 */     this.c = dynamic.get("Y").asInt(0);
/*     */     
/* 213 */     a(dynamic);
/*     */   }
/*     */   
/*     */   protected void a(Dynamic<?> ☃) {
/* 217 */     if (a()) {
/* 218 */       this.d = null;
/*     */     } else {
/* 220 */       long[] arrayOfLong = ☃.get("BlockStates").asLongStream().toArray();
/* 221 */       int i = Math.max(4, DataFixUtils.ceillog2(this.b.size()));
/* 222 */       this.d = new agc(i, 4096, arrayOfLong);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Typed<?> a(Typed<?> ☃) {
/* 227 */     if (b()) {
/* 228 */       return ☃;
/*     */     }
/* 230 */     return ☃
/* 231 */       .update(DSL.remainderFinder(), ☃ -> ☃.set("BlockStates", ☃.createLongList(Arrays.stream(this.d.a()))))
/* 232 */       .set(this.a, this.b.stream().map(☃ -> Pair.of(akn.m.typeName(), ☃)).collect(Collectors.toList()));
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 236 */     return (this.d == null);
/*     */   }
/*     */   
/*     */   public int c(int ☃) {
/* 240 */     return this.d.a(☃);
/*     */   }
/*     */   
/*     */   protected int a(String ☃, boolean bool, int i) {
/* 244 */     return ajn.a().get(☃).intValue() << 5 | (bool ? 16 : 0) | i;
/*     */   }
/*     */   
/*     */   int c() {
/* 248 */     return this.c;
/*     */   }
/*     */   
/*     */   protected abstract boolean a();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajn$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */