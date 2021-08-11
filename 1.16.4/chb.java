/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.OptionalDynamic;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class chb<R>
/*     */   implements AutoCloseable
/*     */ {
/*  36 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*     */   private final cgv b;
/*     */ 
/*     */   
/*  43 */   private final Long2ObjectMap<Optional<R>> c = (Long2ObjectMap<Optional<R>>)new Long2ObjectOpenHashMap();
/*  44 */   private final LongLinkedOpenHashSet d = new LongLinkedOpenHashSet();
/*     */   private final Function<Runnable, Codec<R>> e;
/*     */   private final Function<Runnable, R> f;
/*     */   private final DataFixer g;
/*     */   private final aga h;
/*     */   
/*     */   public chb(File ☃, Function<Runnable, Codec<R>> function, Function<Runnable, R> function1, DataFixer dataFixer, aga aga1, boolean bool) {
/*  51 */     this.e = function;
/*  52 */     this.f = function1;
/*  53 */     this.g = dataFixer;
/*  54 */     this.h = aga1;
/*  55 */     this.b = new cgv(☃, bool, ☃.getName());
/*     */   }
/*     */   
/*     */   protected void a(BooleanSupplier ☃) {
/*  59 */     while (!this.d.isEmpty() && ☃.getAsBoolean()) {
/*  60 */       brd brd = gp.a(this.d.firstLong()).r();
/*  61 */       d(brd);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected Optional<R> c(long ☃) {
/*  67 */     return (Optional<R>)this.c.get(☃);
/*     */   }
/*     */   
/*     */   protected Optional<R> d(long ☃) {
/*  71 */     gp gp = gp.a(☃);
/*  72 */     if (b(gp)) {
/*  73 */       return Optional.empty();
/*     */     }
/*  75 */     Optional<R> optional = c(☃);
/*  76 */     if (optional != null) {
/*  77 */       return optional;
/*     */     }
/*  79 */     b(gp.r());
/*     */     
/*  81 */     optional = c(☃);
/*  82 */     if (optional == null) {
/*  83 */       throw (IllegalStateException)x.c(new IllegalStateException());
/*     */     }
/*  85 */     return optional;
/*     */   }
/*     */   
/*     */   protected boolean b(gp ☃) {
/*  89 */     return brx.b(gp.c(☃.b()));
/*     */   }
/*     */   
/*     */   protected R e(long ☃) {
/*  93 */     Optional<R> optional = d(☃);
/*  94 */     if (optional.isPresent()) {
/*  95 */       return optional.get();
/*     */     }
/*  97 */     R r = this.f.apply(() -> a(☃));
/*  98 */     this.c.put(☃, Optional.of(r));
/*  99 */     return r;
/*     */   }
/*     */   
/*     */   private void b(brd ☃) {
/* 103 */     a(☃, mo.a, c(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private md c(brd ☃) {
/*     */     try {
/* 109 */       return this.b.a(☃);
/* 110 */     } catch (IOException iOException) {
/* 111 */       a.error("Error reading chunk {} data from disk", ☃, iOException);
/* 112 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private <T> void a(brd ☃, DynamicOps<T> dynamicOps, @Nullable T t) {
/* 117 */     if (t == null) {
/* 118 */       for (int i = 0; i < 16; i++) {
/* 119 */         this.c.put(gp.a(☃, i).s(), Optional.empty());
/*     */       }
/*     */     } else {
/* 122 */       Dynamic<T> dynamic1 = new Dynamic(dynamicOps, t);
/* 123 */       int i = a(dynamic1);
/* 124 */       int j = w.a().getWorldVersion();
/* 125 */       boolean bool = (i != j);
/* 126 */       Dynamic<T> dynamic2 = this.g.update(this.h.a(), dynamic1, i, j);
/* 127 */       OptionalDynamic<T> optionalDynamic = dynamic2.get("Sections");
/* 128 */       for (int k = 0; k < 16; k++) {
/* 129 */         long l = gp.a(☃, k).s();
/* 130 */         Optional<R> optional = optionalDynamic.get(Integer.toString(k)).result().flatMap(dynamic -> ((Codec)this.e.apply(())).parse(dynamic).resultOrPartial(a::error));
/*     */ 
/*     */         
/* 133 */         this.c.put(l, optional);
/* 134 */         optional.ifPresent(object -> {
/*     */               b(☃);
/*     */               if (bool) {
/*     */                 a(☃);
/*     */               }
/*     */             });
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d(brd ☃) {
/* 145 */     Dynamic<mt> dynamic = a(☃, mo.a);
/* 146 */     mt mt = (mt)dynamic.getValue();
/* 147 */     if (mt instanceof md) {
/* 148 */       this.b.a(☃, (md)mt);
/*     */     } else {
/* 150 */       a.error("Expected compound tag, got {}", mt);
/*     */     } 
/*     */   }
/*     */   
/*     */   private <T> Dynamic<T> a(brd ☃, DynamicOps<T> dynamicOps) {
/* 155 */     Map<T, T> map = Maps.newHashMap();
/* 156 */     for (int i = 0; i < 16; i++) {
/* 157 */       long l = gp.a(☃, i).s();
/* 158 */       this.d.remove(l);
/* 159 */       Optional<R> optional = (Optional<R>)this.c.get(l);
/* 160 */       if (optional != null && optional.isPresent()) {
/*     */ 
/*     */         
/* 163 */         DataResult<T> dataResult = ((Codec)this.e.apply(() -> a(☃))).encodeStart(dynamicOps, optional.get());
/* 164 */         String str = Integer.toString(i);
/* 165 */         dataResult.resultOrPartial(a::error).ifPresent(object -> ☃.put(dynamicOps.createString(str), object));
/*     */       } 
/*     */     } 
/* 168 */     return new Dynamic(dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps
/* 169 */             .createString("Sections"), dynamicOps.createMap(map), dynamicOps
/* 170 */             .createString("DataVersion"), dynamicOps.createInt(w.a().getWorldVersion()))));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(long ☃) {}
/*     */   
/*     */   protected void a(long ☃) {
/* 177 */     Optional<R> optional = (Optional<R>)this.c.get(☃);
/* 178 */     if (optional == null || !optional.isPresent()) {
/* 179 */       a.warn("No data for position: {}", gp.a(☃));
/*     */       return;
/*     */     } 
/* 182 */     this.d.add(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(Dynamic<?> ☃) {
/* 187 */     return ☃.get("DataVersion").asInt(1945);
/*     */   }
/*     */   
/*     */   public void a(brd ☃) {
/* 191 */     if (!this.d.isEmpty()) {
/* 192 */       for (int i = 0; i < 16; i++) {
/* 193 */         long l = gp.a(☃, i).s();
/* 194 */         if (this.d.contains(l)) {
/* 195 */           d(☃);
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 204 */     this.b.close();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */