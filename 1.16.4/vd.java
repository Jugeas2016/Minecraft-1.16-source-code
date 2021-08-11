/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.ListBuilder;
/*     */ import com.mojang.serialization.MapLike;
/*     */ import com.mojang.serialization.RecordBuilder;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.List;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.LongStream;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ public abstract class vd<T>
/*     */   implements DynamicOps<T>
/*     */ {
/*     */   protected final DynamicOps<T> a;
/*     */   
/*     */   protected vd(DynamicOps<T> ☃) {
/*  22 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public T empty() {
/*  27 */     return (T)this.a.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public <U> U convertTo(DynamicOps<U> ☃, T t) {
/*  32 */     return (U)this.a.convertTo(☃, t);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Number> getNumberValue(T ☃) {
/*  37 */     return this.a.getNumberValue(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createNumeric(Number ☃) {
/*  42 */     return (T)this.a.createNumeric(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createByte(byte ☃) {
/*  47 */     return (T)this.a.createByte(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createShort(short ☃) {
/*  52 */     return (T)this.a.createShort(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createInt(int ☃) {
/*  57 */     return (T)this.a.createInt(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createLong(long ☃) {
/*  62 */     return (T)this.a.createLong(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createFloat(float ☃) {
/*  67 */     return (T)this.a.createFloat(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createDouble(double ☃) {
/*  72 */     return (T)this.a.createDouble(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Boolean> getBooleanValue(T ☃) {
/*  77 */     return this.a.getBooleanValue(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createBoolean(boolean ☃) {
/*  82 */     return (T)this.a.createBoolean(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<String> getStringValue(T ☃) {
/*  87 */     return this.a.getStringValue(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createString(String ☃) {
/*  92 */     return (T)this.a.createString(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<T> mergeToList(T ☃, T t1) {
/*  97 */     return this.a.mergeToList(☃, t1);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<T> mergeToList(T ☃, List<T> list) {
/* 102 */     return this.a.mergeToList(☃, list);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<T> mergeToMap(T ☃, T t1, T t2) {
/* 107 */     return this.a.mergeToMap(☃, t1, t2);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<T> mergeToMap(T ☃, MapLike<T> mapLike) {
/* 112 */     return this.a.mergeToMap(☃, mapLike);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Stream<Pair<T, T>>> getMapValues(T ☃) {
/* 117 */     return this.a.getMapValues(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Consumer<BiConsumer<T, T>>> getMapEntries(T ☃) {
/* 122 */     return this.a.getMapEntries(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createMap(Stream<Pair<T, T>> ☃) {
/* 127 */     return (T)this.a.createMap(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<MapLike<T>> getMap(T ☃) {
/* 132 */     return this.a.getMap(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Stream<T>> getStream(T ☃) {
/* 137 */     return this.a.getStream(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<Consumer<Consumer<T>>> getList(T ☃) {
/* 142 */     return this.a.getList(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createList(Stream<T> ☃) {
/* 147 */     return (T)this.a.createList(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<ByteBuffer> getByteBuffer(T ☃) {
/* 152 */     return this.a.getByteBuffer(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createByteList(ByteBuffer ☃) {
/* 157 */     return (T)this.a.createByteList(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<IntStream> getIntStream(T ☃) {
/* 162 */     return this.a.getIntStream(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createIntList(IntStream ☃) {
/* 167 */     return (T)this.a.createIntList(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public DataResult<LongStream> getLongStream(T ☃) {
/* 172 */     return this.a.getLongStream(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T createLongList(LongStream ☃) {
/* 177 */     return (T)this.a.createLongList(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public T remove(T ☃, String str) {
/* 182 */     return (T)this.a.remove(☃, str);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean compressMaps() {
/* 187 */     return this.a.compressMaps();
/*     */   }
/*     */ 
/*     */   
/*     */   public ListBuilder<T> listBuilder() {
/* 192 */     return this.a.listBuilder();
/*     */   }
/*     */ 
/*     */   
/*     */   public RecordBuilder<T> mapBuilder() {
/* 197 */     return this.a.mapBuilder();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */