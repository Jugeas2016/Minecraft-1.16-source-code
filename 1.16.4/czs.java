/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import java.util.List;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class czs
/*     */   extends czq
/*     */ {
/*     */   protected final int c;
/*     */   protected final int e;
/*     */   protected final daj[] f;
/*     */   private final BiFunction<bmb, cyv, bmb> g;
/*     */   private final czp h;
/*     */   
/*     */   protected czs(int ☃, int i, dbo[] arrayOfDbo, daj[] arrayOfDaj) {
/*  33 */     super(arrayOfDbo);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  56 */     this.h = new c(this)
/*     */       {
/*     */         public void a(Consumer<bmb> ☃, cyv cyv1) {
/*  59 */           this.a.a(daj.a(czs.a(this.a), ☃, cyv1), cyv1); }
/*     */       };
/*     */     this.c = ☃;
/*     */     this.e = i;
/*     */     this.f = arrayOfDaj;
/*     */     this.g = dal.a((BiFunction<bmb, cyv, bmb>[])arrayOfDaj);
/*     */   } public void a(czg ☃) { super.a(☃);
/*     */     for (int i = 0; i < this.f.length; i++)
/*  67 */       this.f[i].a(☃.b(".functions[" + i + "]"));  } public boolean expand(cyv ☃, Consumer<czp> consumer) { if (a(☃)) {
/*  68 */       consumer.accept(this.h);
/*  69 */       return true;
/*     */     } 
/*     */     
/*  72 */     return false; }
/*     */    public abstract class c implements czp {
/*     */     protected c(czs ☃) {} public int a(float ☃) {
/*     */       return Math.max(afm.d(this.b.c + this.b.e * ☃), 0);
/*  76 */     } } public static abstract class a<T extends a<T>> extends czq.a<T> implements dag<T> { protected int a = 1;
/*  77 */     protected int b = 0;
/*     */     
/*  79 */     private final List<daj> c = Lists.newArrayList();
/*     */ 
/*     */     
/*     */     public T a(daj.a ☃) {
/*  83 */       this.c.add(☃.b());
/*  84 */       return d();
/*     */     }
/*     */     
/*     */     protected daj[] a() {
/*  88 */       return this.c.<daj>toArray(new daj[0]);
/*     */     }
/*     */     
/*     */     public T a(int ☃) {
/*  92 */       this.a = ☃;
/*  93 */       return d();
/*     */     }
/*     */     
/*     */     public T b(int ☃) {
/*  97 */       this.b = ☃;
/*  98 */       return d();
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class b
/*     */     extends a<b>
/*     */   {
/*     */     private final czs.d c;
/*     */ 
/*     */     
/*     */     public b(czs.d ☃) {
/* 111 */       this.c = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     protected b g() {
/* 116 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public czq b() {
/* 121 */       return this.c.build(this.a, this.b, f(), a());
/*     */     }
/*     */   }
/*     */   
/*     */   public static a<?> a(d ☃) {
/* 126 */     return new b(☃);
/*     */   }
/*     */   
/*     */   protected abstract void a(Consumer<bmb> paramConsumer, cyv paramcyv);
/*     */   
/*     */   public static abstract class e<T extends czs> extends czq.b<T> { public void a(JsonObject ☃, T t, JsonSerializationContext jsonSerializationContext) {
/* 132 */       if (((czs)t).c != 1) {
/* 133 */         ☃.addProperty("weight", Integer.valueOf(((czs)t).c));
/*     */       }
/*     */       
/* 136 */       if (((czs)t).e != 0) {
/* 137 */         ☃.addProperty("quality", Integer.valueOf(((czs)t).e));
/*     */       }
/*     */       
/* 140 */       if (!ArrayUtils.isEmpty((Object[])((czs)t).f)) {
/* 141 */         ☃.add("functions", jsonSerializationContext.serialize(((czs)t).f));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public final T a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 147 */       int i = afd.a(☃, "weight", 1);
/* 148 */       int j = afd.a(☃, "quality", 0);
/* 149 */       daj[] arrayOfDaj = afd.<daj[]>a(☃, "functions", new daj[0], jsonDeserializationContext, (Class)daj[].class);
/*     */       
/* 151 */       return b(☃, jsonDeserializationContext, i, j, arrayOfDbo, arrayOfDaj);
/*     */     }
/*     */     
/*     */     protected abstract T b(JsonObject param1JsonObject, JsonDeserializationContext param1JsonDeserializationContext, int param1Int1, int param1Int2, dbo[] param1ArrayOfdbo, daj[] param1ArrayOfdaj); }
/*     */ 
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface d {
/*     */     czs build(int param1Int1, int param1Int2, dbo[] param1ArrayOfdbo, daj[] param1ArrayOfdaj);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */