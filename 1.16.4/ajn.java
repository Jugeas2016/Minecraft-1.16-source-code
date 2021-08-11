/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.OpticFinder;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.datafixers.types.templates.List;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntIterator;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntSet;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
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
/*     */ public class ajn
/*     */   extends DataFix
/*     */ {
/*  45 */   private static final int[][] a = new int[][] { { -1, 0, 0 }, { 1, 0, 0 }, { 0, -1, 0 }, { 0, 1, 0 }, { 0, 0, -1 }, { 0, 0, 1 } };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Object2IntMap<String> b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  58 */     b = (Object2IntMap<String>)DataFixUtils.make(new Object2IntOpenHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:acacia_leaves", 0);
/*     */           ☃.put("minecraft:birch_leaves", 1);
/*     */           ☃.put("minecraft:dark_oak_leaves", 2);
/*     */           ☃.put("minecraft:jungle_leaves", 3);
/*     */           ☃.put("minecraft:oak_leaves", 4);
/*     */           ☃.put("minecraft:spruce_leaves", 5);
/*     */         });
/*     */   }
/*  67 */   private static final Set<String> c = (Set<String>)ImmutableSet.of("minecraft:acacia_bark", "minecraft:birch_bark", "minecraft:dark_oak_bark", "minecraft:jungle_bark", "minecraft:oak_bark", "minecraft:spruce_bark", (Object[])new String[] { "minecraft:acacia_log", "minecraft:birch_log", "minecraft:dark_oak_log", "minecraft:jungle_log", "minecraft:oak_log", "minecraft:spruce_log", "minecraft:stripped_acacia_log", "minecraft:stripped_birch_log", "minecraft:stripped_dark_oak_log", "minecraft:stripped_jungle_log", "minecraft:stripped_oak_log", "minecraft:stripped_spruce_log" });
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
/*     */   public ajn(Schema ☃, boolean bool) {
/*  89 */     super(☃, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   protected TypeRewriteRule makeRule() {
/*  94 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/*     */     
/*  96 */     OpticFinder<?> opticFinder1 = ☃.findField("Level");
/*  97 */     OpticFinder<?> opticFinder2 = opticFinder1.type().findField("Sections");
/*  98 */     Type<?> type1 = opticFinder2.type();
/*  99 */     if (!(type1 instanceof List.ListType)) {
/* 100 */       throw new IllegalStateException("Expecting sections to be a list.");
/*     */     }
/* 102 */     Type<?> type2 = ((List.ListType)type1).getElement();
/* 103 */     OpticFinder<?> opticFinder3 = DSL.typeFinder(type2);
/*     */     
/* 105 */     return fixTypeEverywhereTyped("Leaves fix", ☃, typed -> typed.updateTyped(☃, ()));
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
/*     */   public static abstract class b
/*     */   {
/* 193 */     private final Type<Pair<String, Dynamic<?>>> e = DSL.named(akn.m.typeName(), DSL.remainderType());
/* 194 */     protected final OpticFinder<List<Pair<String, Dynamic<?>>>> a = DSL.fieldFinder("Palette", (Type)DSL.list(this.e));
/*     */     
/*     */     protected final List<Dynamic<?>> b;
/*     */     protected final int c;
/*     */     @Nullable
/*     */     protected agc d;
/*     */     
/*     */     public b(Typed<?> ☃, Schema schema) {
/* 202 */       if (!Objects.equals(schema.getType(akn.m), this.e)) {
/* 203 */         throw new IllegalStateException("Block state type is not what was expected.");
/*     */       }
/*     */       
/* 206 */       Optional<List<Pair<String, Dynamic<?>>>> optional = ☃.getOptional(this.a);
/*     */       
/* 208 */       this.b = (List<Dynamic<?>>)optional.map(☃ -> (List)☃.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse(ImmutableList.of());
/*     */       
/* 210 */       Dynamic<?> dynamic = (Dynamic)☃.get(DSL.remainderFinder());
/* 211 */       this.c = dynamic.get("Y").asInt(0);
/*     */       
/* 213 */       a(dynamic);
/*     */     }
/*     */     
/*     */     protected void a(Dynamic<?> ☃) {
/* 217 */       if (a()) {
/* 218 */         this.d = null;
/*     */       } else {
/* 220 */         long[] arrayOfLong = ☃.get("BlockStates").asLongStream().toArray();
/* 221 */         int i = Math.max(4, DataFixUtils.ceillog2(this.b.size()));
/* 222 */         this.d = new agc(i, 4096, arrayOfLong);
/*     */       } 
/*     */     }
/*     */     
/*     */     public Typed<?> a(Typed<?> ☃) {
/* 227 */       if (b()) {
/* 228 */         return ☃;
/*     */       }
/* 230 */       return ☃
/* 231 */         .update(DSL.remainderFinder(), ☃ -> ☃.set("BlockStates", ☃.createLongList(Arrays.stream(this.d.a()))))
/* 232 */         .set(this.a, this.b.stream().map(☃ -> Pair.of(akn.m.typeName(), ☃)).collect(Collectors.toList()));
/*     */     }
/*     */     
/*     */     public boolean b() {
/* 236 */       return (this.d == null);
/*     */     }
/*     */     
/*     */     public int c(int ☃) {
/* 240 */       return this.d.a(☃);
/*     */     }
/*     */     
/*     */     protected int a(String ☃, boolean bool, int i) {
/* 244 */       return ajn.a().get(☃).intValue() << 5 | (bool ? 16 : 0) | i;
/*     */     }
/*     */     
/*     */     int c() {
/* 248 */       return this.c;
/*     */     }
/*     */ 
/*     */     
/*     */     protected abstract boolean a();
/*     */   }
/*     */ 
/*     */   
/*     */   public static final class a
/*     */     extends b
/*     */   {
/*     */     @Nullable
/*     */     private IntSet e;
/*     */     
/*     */     @Nullable
/*     */     private IntSet f;
/*     */     @Nullable
/*     */     private Int2IntMap g;
/*     */     
/*     */     public a(Typed<?> ☃, Schema schema) {
/* 268 */       super(☃, schema);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean a() {
/* 273 */       this.e = (IntSet)new IntOpenHashSet();
/* 274 */       this.f = (IntSet)new IntOpenHashSet();
/* 275 */       this.g = (Int2IntMap)new Int2IntOpenHashMap();
/*     */       
/* 277 */       for (int ☃ = 0; ☃ < this.b.size(); ☃++) {
/* 278 */         Dynamic<?> dynamic = this.b.get(☃);
/* 279 */         String str = dynamic.get("Name").asString("");
/* 280 */         if (ajn.a().containsKey(str)) {
/* 281 */           boolean bool = Objects.equals(dynamic.get("Properties").get("decayable").asString(""), "false");
/* 282 */           this.e.add(☃);
/* 283 */           this.g.put(a(str, bool, 7), ☃);
/* 284 */           this.b.set(☃, a(dynamic, str, bool, 7));
/*     */         } 
/* 286 */         if (ajn.b().contains(str)) {
/* 287 */           this.f.add(☃);
/*     */         }
/*     */       } 
/*     */       
/* 291 */       return (this.e.isEmpty() && this.f.isEmpty());
/*     */     }
/*     */     
/*     */     private Dynamic<?> a(Dynamic<?> ☃, String str, boolean bool, int i) {
/* 295 */       Dynamic<?> dynamic1 = ☃.emptyMap();
/* 296 */       dynamic1 = dynamic1.set("persistent", dynamic1.createString(bool ? "true" : "false"));
/* 297 */       dynamic1 = dynamic1.set("distance", dynamic1.createString(Integer.toString(i)));
/*     */       
/* 299 */       Dynamic<?> dynamic2 = ☃.emptyMap();
/* 300 */       dynamic2 = dynamic2.set("Properties", dynamic1);
/* 301 */       dynamic2 = dynamic2.set("Name", dynamic2.createString(str));
/* 302 */       return dynamic2;
/*     */     }
/*     */     
/*     */     public boolean a(int ☃) {
/* 306 */       return this.f.contains(☃);
/*     */     }
/*     */     
/*     */     public boolean b(int ☃) {
/* 310 */       return this.e.contains(☃);
/*     */     }
/*     */     
/*     */     private int d(int ☃) {
/* 314 */       if (a(☃)) {
/* 315 */         return 0;
/*     */       }
/* 317 */       return Integer.parseInt(((Dynamic)this.b.get(☃)).get("Properties").get("distance").asString(""));
/*     */     }
/*     */     
/*     */     private void a(int ☃, int i, int j) {
/* 321 */       Dynamic<?> dynamic = this.b.get(i);
/* 322 */       String str = dynamic.get("Name").asString("");
/* 323 */       boolean bool = Objects.equals(dynamic.get("Properties").get("persistent").asString(""), "true");
/* 324 */       int k = a(str, bool, j);
/*     */       
/* 326 */       if (!this.g.containsKey(k)) {
/* 327 */         int n = this.b.size();
/* 328 */         this.e.add(n);
/* 329 */         this.g.put(k, n);
/* 330 */         this.b.add(a(dynamic, str, bool, j));
/*     */       } 
/*     */       
/* 333 */       int m = this.g.get(k);
/* 334 */       if (1 << this.d.b() <= m) {
/* 335 */         agc agc = new agc(this.d.b() + 1, 4096);
/* 336 */         for (int n = 0; n < 4096; n++) {
/* 337 */           agc.a(n, this.d.a(n));
/*     */         }
/* 339 */         this.d = agc;
/*     */       } 
/* 341 */       this.d.a(☃, m);
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(int ☃, int i, int j) {
/* 346 */     return i << 8 | j << 4 | ☃;
/*     */   }
/*     */   
/*     */   private int a(int ☃) {
/* 350 */     return ☃ & 0xF;
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/* 354 */     return ☃ >> 8 & 0xFF;
/*     */   }
/*     */   
/*     */   private int c(int ☃) {
/* 358 */     return ☃ >> 4 & 0xF;
/*     */   }
/*     */   
/*     */   public static int a(boolean ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 362 */     int i = 0;
/* 363 */     if (bool2) {
/* 364 */       if (bool1) {
/* 365 */         i |= 0x2;
/* 366 */       } else if (☃) {
/* 367 */         i |= 0x80;
/*     */       } else {
/* 369 */         i |= 0x1;
/*     */       } 
/* 371 */     } else if (bool3) {
/* 372 */       if (☃) {
/* 373 */         i |= 0x20;
/* 374 */       } else if (bool1) {
/* 375 */         i |= 0x8;
/*     */       } else {
/* 377 */         i |= 0x10;
/*     */       } 
/* 379 */     } else if (bool1) {
/* 380 */       i |= 0x4;
/* 381 */     } else if (☃) {
/* 382 */       i |= 0x40;
/*     */     } 
/* 384 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */