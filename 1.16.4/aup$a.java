/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
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
/*     */ public class a<T>
/*     */ {
/*     */   private final T a;
/*     */   private final int b;
/*     */   private double c;
/*     */   
/*     */   private a(T ☃, int i) {
/*  69 */     this.b = i;
/*  70 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   private double c() {
/*  74 */     return this.c;
/*     */   }
/*     */   
/*     */   private void a(float ☃) {
/*  78 */     this.c = -Math.pow(☃, (1.0F / this.b));
/*     */   }
/*     */   
/*     */   public T a() {
/*  82 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  91 */     return "" + this.b + ":" + this.a;
/*     */   }
/*     */   
/*     */   public static <E> Codec<a<E>> a(Codec<E> ☃) {
/*  95 */     return new Codec<a<E>>(☃)
/*     */       {
/*     */         public <T> DataResult<Pair<aup.a<E>, T>> decode(DynamicOps<T> ☃, T t) {
/*  98 */           Dynamic<T> dynamic = new Dynamic(☃, t);
/*  99 */           return dynamic.get("data")
/* 100 */             .flatMap(this.a::parse)
/* 101 */             .map(object -> new aup.a(object, ☃.get("weight").asInt(1)))
/* 102 */             .map(a1 -> Pair.of(a1, ☃.empty()));
/*     */         }
/*     */ 
/*     */         
/*     */         public <T> DataResult<T> a(aup.a<E> ☃, DynamicOps<T> dynamicOps, T t) {
/* 107 */           return dynamicOps.mapBuilder()
/* 108 */             .add("weight", dynamicOps.createInt(aup.a.b(☃)))
/* 109 */             .add("data", this.a.encodeStart(dynamicOps, aup.a.a(☃)))
/* 110 */             .build(t);
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aup$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */