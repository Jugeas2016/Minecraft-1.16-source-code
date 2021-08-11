/*     */ import com.google.common.collect.Iterators;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.PeekingIterator;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.MapLike;
/*     */ import com.mojang.serialization.RecordBuilder;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.LongStream;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public class mo
/*     */   implements DynamicOps<mt>
/*     */ {
/*  27 */   public static final mo a = new mo();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public mt a() {
/*  34 */     return mf.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public <U> U a(DynamicOps<U> ☃, mt mt1) {
/*  39 */     switch (mt1.a()) {
/*     */       case 0:
/*  41 */         return (U)☃.empty();
/*     */       case 1:
/*  43 */         return (U)☃.createByte(((mq)mt1).h());
/*     */       case 2:
/*  45 */         return (U)☃.createShort(((mq)mt1).g());
/*     */       case 3:
/*  47 */         return (U)☃.createInt(((mq)mt1).f());
/*     */       case 4:
/*  49 */         return (U)☃.createLong(((mq)mt1).e());
/*     */       case 5:
/*  51 */         return (U)☃.createFloat(((mq)mt1).j());
/*     */       case 6:
/*  53 */         return (U)☃.createDouble(((mq)mt1).i());
/*     */       case 7:
/*  55 */         return (U)☃.createByteList(ByteBuffer.wrap(((ma)mt1).d()));
/*     */       case 8:
/*  57 */         return (U)☃.createString(mt1.f_());
/*     */       case 9:
/*  59 */         return (U)convertList(☃, mt1);
/*     */       case 10:
/*  61 */         return (U)convertMap(☃, mt1);
/*     */       case 11:
/*  63 */         return (U)☃.createIntList(Arrays.stream(((mh)mt1).g()));
/*     */       case 12:
/*  65 */         return (U)☃.createLongList(Arrays.stream(((mk)mt1).g()));
/*     */     } 
/*  67 */     throw new IllegalStateException("Unknown tag type: " + mt1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public DataResult<Number> a(mt ☃) {
/*  73 */     if (☃ instanceof mq) {
/*  74 */       return DataResult.success(((mq)☃).k());
/*     */     }
/*  76 */     return DataResult.error("Not a number");
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(Number ☃) {
/*  81 */     return me.a(☃.doubleValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(byte ☃) {
/*  86 */     return mb.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(short ☃) {
/*  91 */     return mr.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(int ☃) {
/*  96 */     return mi.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(long ☃) {
/* 101 */     return ml.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(float ☃) {
/* 106 */     return mg.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(double ☃) {
/* 111 */     return me.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(boolean ☃) {
/* 116 */     return mb.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<String> b(mt ☃) {
/* 121 */     if (☃ instanceof ms) {
/* 122 */       return DataResult.success(☃.f_());
/*     */     }
/* 124 */     return DataResult.error("Not a string");
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(String ☃) {
/* 129 */     return ms.a(☃);
/*     */   }
/*     */   
/*     */   private static mc<?> a(byte ☃, byte b1) {
/* 133 */     if (a(☃, b1, (byte)4)) {
/* 134 */       return new mk(new long[0]);
/*     */     }
/* 136 */     if (a(☃, b1, (byte)1)) {
/* 137 */       return new ma(new byte[0]);
/*     */     }
/* 139 */     if (a(☃, b1, (byte)3)) {
/* 140 */       return new mh(new int[0]);
/*     */     }
/* 142 */     return new mj();
/*     */   }
/*     */   
/*     */   private static boolean a(byte ☃, byte b1, byte b2) {
/* 146 */     return (☃ == b2 && (b1 == b2 || b1 == 0));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T extends mt> void a(mc<T> ☃, mt mt1, mt mt2) {
/* 153 */     if (mt1 instanceof mc) {
/* 154 */       mc<?> mc1 = (mc)mt1;
/* 155 */       mc1.forEach(mt1 -> ☃.add(mt1));
/*     */     } 
/*     */     
/* 158 */     ☃.add((T)mt2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static <T extends mt> void a(mc<T> ☃, mt mt1, List<mt> list) {
/* 164 */     if (mt1 instanceof mc) {
/* 165 */       mc<?> mc1 = (mc)mt1;
/* 166 */       mc1.forEach(mt1 -> ☃.add(mt1));
/*     */     } 
/*     */     
/* 169 */     list.forEach(mt1 -> ☃.add(mt1));
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<mt> a(mt ☃, mt mt1) {
/* 174 */     if (!(☃ instanceof mc) && !(☃ instanceof mf)) {
/* 175 */       return DataResult.error("mergeToList called with not a list: " + ☃, ☃);
/*     */     }
/*     */     
/* 178 */     mc<?> mc = a((☃ instanceof mc) ? ((mc)☃)
/* 179 */         .d_() : 0, mt1
/* 180 */         .a());
/*     */     
/* 182 */     a(mc, ☃, mt1);
/* 183 */     return DataResult.success(mc);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<mt> a(mt ☃, List<mt> list) {
/* 188 */     if (!(☃ instanceof mc) && !(☃ instanceof mf)) {
/* 189 */       return DataResult.error("mergeToList called with not a list: " + ☃, ☃);
/*     */     }
/*     */     
/* 192 */     mc<?> mc = a((☃ instanceof mc) ? ((mc)☃)
/* 193 */         .d_() : 0, ((Byte)list
/* 194 */         .stream().findFirst().map(mt::a).orElse(Byte.valueOf((byte)0))).byteValue());
/*     */     
/* 196 */     a(mc, ☃, list);
/* 197 */     return DataResult.success(mc);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<mt> a(mt ☃, mt mt1, mt mt2) {
/* 202 */     if (!(☃ instanceof md) && !(☃ instanceof mf)) {
/* 203 */       return DataResult.error("mergeToMap called with not a map: " + ☃, ☃);
/*     */     }
/* 205 */     if (!(mt1 instanceof ms)) {
/* 206 */       return DataResult.error("key is not a string: " + mt1, ☃);
/*     */     }
/*     */     
/* 209 */     md md = new md();
/* 210 */     if (☃ instanceof md) {
/* 211 */       md md1 = (md)☃;
/* 212 */       md1.d().forEach(str -> ☃.a(str, md1.c(str)));
/*     */     } 
/* 214 */     md.a(mt1.f_(), mt2);
/* 215 */     return DataResult.success(md);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<mt> a(mt ☃, MapLike<mt> mapLike) {
/* 220 */     if (!(☃ instanceof md) && !(☃ instanceof mf)) {
/* 221 */       return DataResult.error("mergeToMap called with not a map: " + ☃, ☃);
/*     */     }
/*     */     
/* 224 */     md md = new md();
/* 225 */     if (☃ instanceof md) {
/* 226 */       md md1 = (md)☃;
/* 227 */       md1.d().forEach(str -> ☃.a(str, md1.c(str)));
/*     */     } 
/*     */     
/* 230 */     List<mt> list = Lists.newArrayList();
/*     */     
/* 232 */     mapLike.entries().forEach(pair -> {
/*     */           mt mt = (mt)pair.getFirst();
/*     */           
/*     */           if (!(mt instanceof ms)) {
/*     */             ☃.add(mt);
/*     */             
/*     */             return;
/*     */           } 
/*     */           md1.a(mt.f_(), (mt)pair.getSecond());
/*     */         });
/* 242 */     if (!list.isEmpty()) {
/* 243 */       return DataResult.error("some keys are not strings: " + list, md);
/*     */     }
/*     */     
/* 246 */     return DataResult.success(md);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Stream<Pair<mt, mt>>> c(mt ☃) {
/* 251 */     if (!(☃ instanceof md)) {
/* 252 */       return DataResult.error("Not a map: " + ☃);
/*     */     }
/* 254 */     md md = (md)☃;
/* 255 */     return DataResult.success(md.d().stream().map(str -> Pair.of(a(str), ☃.c(str))));
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Consumer<BiConsumer<mt, mt>>> d(mt ☃) {
/* 260 */     if (!(☃ instanceof md)) {
/* 261 */       return DataResult.error("Not a map: " + ☃);
/*     */     }
/* 263 */     md md = (md)☃;
/* 264 */     return DataResult.success(biConsumer -> ☃.d().forEach(()));
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<MapLike<mt>> e(mt ☃) {
/* 269 */     if (!(☃ instanceof md)) {
/* 270 */       return DataResult.error("Not a map: " + ☃);
/*     */     }
/* 272 */     md md = (md)☃;
/* 273 */     return DataResult.success(new MapLike<mt>(this, md)
/*     */         {
/*     */           @Nullable
/*     */           public mt a(mt ☃) {
/* 277 */             return this.a.c(☃.f_());
/*     */           }
/*     */ 
/*     */           
/*     */           @Nullable
/*     */           public mt a(String ☃) {
/* 283 */             return this.a.c(☃);
/*     */           }
/*     */ 
/*     */           
/*     */           public Stream<Pair<mt, mt>> entries() {
/* 288 */             return this.a.d().stream().map(str -> Pair.of(this.b.a(str), ☃.c(str)));
/*     */           }
/*     */ 
/*     */           
/*     */           public String toString() {
/* 293 */             return "MapLike[" + this.a + "]";
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(Stream<Pair<mt, mt>> ☃) {
/* 300 */     md md = new md();
/* 301 */     ☃.forEach(pair -> ☃.a(((mt)pair.getFirst()).f_(), (mt)pair.getSecond()));
/*     */ 
/*     */     
/* 304 */     return md;
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Stream<mt>> f(mt ☃) {
/* 309 */     if (☃ instanceof mc) {
/* 310 */       return DataResult.success(((mc)☃).stream().map(☃ -> ☃));
/*     */     }
/* 312 */     return DataResult.error("Not a list");
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Consumer<Consumer<mt>>> g(mt ☃) {
/* 317 */     if (☃ instanceof mc) {
/* 318 */       mc<?> mc = (mc)☃;
/* 319 */       return DataResult.success(mc::forEach);
/*     */     } 
/* 321 */     return DataResult.error("Not a list: " + ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<ByteBuffer> h(mt ☃) {
/* 326 */     if (☃ instanceof ma) {
/* 327 */       return DataResult.success(ByteBuffer.wrap(((ma)☃).d()));
/*     */     }
/* 329 */     return super.getByteBuffer(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(ByteBuffer ☃) {
/* 334 */     return new ma(DataFixUtils.toArray(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<IntStream> i(mt ☃) {
/* 339 */     if (☃ instanceof mh) {
/* 340 */       return DataResult.success(Arrays.stream(((mh)☃).g()));
/*     */     }
/* 342 */     return super.getIntStream(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(IntStream ☃) {
/* 347 */     return new mh(☃.toArray());
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<LongStream> j(mt ☃) {
/* 352 */     if (☃ instanceof mk) {
/* 353 */       return DataResult.success(Arrays.stream(((mk)☃).g()));
/*     */     }
/* 355 */     return super.getLongStream(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(LongStream ☃) {
/* 360 */     return new mk(☃.toArray());
/*     */   }
/*     */ 
/*     */   
/*     */   public mt b(Stream<mt> ☃) {
/* 365 */     PeekingIterator<mt> peekingIterator = Iterators.peekingIterator(☃.iterator());
/* 366 */     if (!peekingIterator.hasNext()) {
/* 367 */       return new mj();
/*     */     }
/* 369 */     mt mt = (mt)peekingIterator.peek();
/* 370 */     if (mt instanceof mb) {
/* 371 */       List<Byte> list = Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, ☃ -> Byte.valueOf(((mb)☃).h())));
/* 372 */       return new ma(list);
/*     */     } 
/* 374 */     if (mt instanceof mi) {
/* 375 */       List<Integer> list = Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, ☃ -> Integer.valueOf(((mi)☃).f())));
/* 376 */       return new mh(list);
/*     */     } 
/* 378 */     if (mt instanceof ml) {
/* 379 */       List<Long> list = Lists.newArrayList(Iterators.transform((Iterator)peekingIterator, ☃ -> Long.valueOf(((ml)☃).e())));
/* 380 */       return new mk(list);
/*     */     } 
/* 382 */     mj mj = new mj();
/* 383 */     while (peekingIterator.hasNext()) {
/* 384 */       mt mt1 = (mt)peekingIterator.next();
/* 385 */       if (mt1 instanceof mf) {
/*     */         continue;
/*     */       }
/* 388 */       mj.add(mt1);
/*     */     } 
/* 390 */     return mj;
/*     */   }
/*     */ 
/*     */   
/*     */   public mt a(mt ☃, String str) {
/* 395 */     if (☃ instanceof md) {
/* 396 */       md md1 = (md)☃;
/* 397 */       md md2 = new md();
/* 398 */       md1.d().stream().filter(str1 -> !Objects.equals(str1, ☃)).forEach(str -> ☃.a(str, md1.c(str)));
/* 399 */       return md2;
/*     */     } 
/* 401 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 406 */     return "NBT";
/*     */   }
/*     */ 
/*     */   
/*     */   public RecordBuilder<mt> mapBuilder() {
/* 411 */     return (RecordBuilder<mt>)new a(this);
/*     */   }
/*     */   
/*     */   class a extends RecordBuilder.AbstractStringBuilder<mt, md> {
/*     */     protected a(mo this$0) {
/* 416 */       super(this$0);
/*     */     }
/*     */ 
/*     */     
/*     */     protected md a() {
/* 421 */       return new md();
/*     */     }
/*     */ 
/*     */     
/*     */     protected md a(String ☃, mt mt1, md md1) {
/* 426 */       md1.a(☃, mt1);
/* 427 */       return md1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected DataResult<mt> a(md ☃, mt mt1) {
/* 432 */       if (mt1 == null || mt1 == mf.b) {
/* 433 */         return DataResult.success(☃);
/*     */       }
/* 435 */       if (mt1 instanceof md) {
/* 436 */         md md1 = new md(Maps.newHashMap(((md)mt1).h()));
/* 437 */         for (Map.Entry<String, mt> entry : ☃.h().entrySet()) {
/* 438 */           md1.a(entry.getKey(), entry.getValue());
/*     */         }
/* 440 */         return DataResult.success(md1);
/*     */       } 
/* 442 */       return DataResult.error("mergeToMap called with not a map: " + mt1, mt1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */