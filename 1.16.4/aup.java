/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ public class aup<U>
/*     */ {
/*     */   protected final List<a<U>> a;
/*     */   private final Random b;
/*     */   
/*     */   public aup() {
/*  20 */     this(Lists.newArrayList());
/*     */   }
/*     */   
/*     */   private aup(List<a<U>> ☃) {
/*  24 */     this.b = new Random();
/*  25 */     this.a = Lists.newArrayList(☃);
/*     */   }
/*     */   
/*     */   public static <U> Codec<aup<U>> a(Codec<U> ☃) {
/*  29 */     return a.<E>a(☃).listOf().xmap(aup::new, ☃ -> ☃.a);
/*     */   }
/*     */   
/*     */   public aup<U> a(U ☃, int i) {
/*  33 */     this.a.add(new a<>(☃, i));
/*  34 */     return this;
/*     */   }
/*     */   
/*     */   public aup<U> a() {
/*  38 */     return a(this.b);
/*     */   }
/*     */   
/*     */   public aup<U> a(Random ☃) {
/*  42 */     this.a.forEach(a1 -> a.a(a1, ☃.nextFloat()));
/*  43 */     this.a.sort(Comparator.comparingDouble(☃ -> a.c((a)☃)));
/*  44 */     return this;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  48 */     return this.a.isEmpty();
/*     */   }
/*     */   
/*     */   public Stream<U> c() {
/*  52 */     return this.a.stream().map(a::a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public U b(Random ☃) {
/*  60 */     return (U)a(☃).c().findFirst().orElseThrow(RuntimeException::new);
/*     */   }
/*     */   
/*     */   public static class a<T> {
/*     */     private final T a;
/*     */     private final int b;
/*     */     private double c;
/*     */     
/*     */     private a(T ☃, int i) {
/*  69 */       this.b = i;
/*  70 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     private double c() {
/*  74 */       return this.c;
/*     */     }
/*     */     
/*     */     private void a(float ☃) {
/*  78 */       this.c = -Math.pow(☃, (1.0F / this.b));
/*     */     }
/*     */     
/*     */     public T a() {
/*  82 */       return this.a;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String toString() {
/*  91 */       return "" + this.b + ":" + this.a;
/*     */     }
/*     */     
/*     */     public static <E> Codec<a<E>> a(Codec<E> ☃) {
/*  95 */       return new Codec<a<E>>(☃)
/*     */         {
/*     */           public <T> DataResult<Pair<aup.a<E>, T>> decode(DynamicOps<T> ☃, T t) {
/*  98 */             Dynamic<T> dynamic = new Dynamic(☃, t);
/*  99 */             return dynamic.get("data")
/* 100 */               .flatMap(this.a::parse)
/* 101 */               .map(object -> new aup.a(object, ☃.get("weight").asInt(1)))
/* 102 */               .map(a1 -> Pair.of(a1, ☃.empty()));
/*     */           }
/*     */ 
/*     */           
/*     */           public <T> DataResult<T> a(aup.a<E> ☃, DynamicOps<T> dynamicOps, T t) {
/* 107 */             return dynamicOps.mapBuilder()
/* 108 */               .add("weight", dynamicOps.createInt(aup.a.b(☃)))
/* 109 */               .add("data", this.a.encodeStart(dynamicOps, aup.a.a(☃)))
/* 110 */               .build(t);
/*     */           }
/*     */         };
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 118 */     return "WeightedList[" + this.a + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */