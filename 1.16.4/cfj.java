/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import java.util.Collection;
/*     */ import java.util.Optional;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ public abstract class cfj<T extends Comparable<T>>
/*     */ {
/*     */   private final Class<T> a;
/*     */   private final String b;
/*     */   private Integer c;
/*     */   private final Codec<T> d;
/*     */   private final Codec<a<T>> e;
/*     */   
/*     */   protected cfj(String ☃, Class<T> clazz) {
/*  17 */     this.d = Codec.STRING.comapFlatMap(☃ -> (DataResult)b(☃).<DataResult>map(DataResult::success).orElseGet(()), this::a);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  22 */     this.e = this.d.xmap(this::b, a::b);
/*     */ 
/*     */     
/*  25 */     this.a = clazz;
/*  26 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public a<T> b(T ☃) {
/*  30 */     return new a<>(this, (Comparable)☃);
/*     */   }
/*     */   
/*     */   public a<T> a(cej<?, ?> ☃) {
/*  34 */     return new a<>(this, ☃.c(this));
/*     */   }
/*     */   
/*     */   public Stream<a<T>> c() {
/*  38 */     return a().stream().map(this::b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Codec<a<T>> e() {
/*  46 */     return this.e;
/*     */   }
/*     */   
/*     */   public String f() {
/*  50 */     return this.b;
/*     */   }
/*     */   
/*     */   public Class<T> g() {
/*  54 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  65 */     return MoreObjects.toStringHelper(this)
/*  66 */       .add("name", this.b)
/*  67 */       .add("clazz", this.a)
/*  68 */       .add("values", a())
/*  69 */       .toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  74 */     if (this == ☃) {
/*  75 */       return true;
/*     */     }
/*     */     
/*  78 */     if (☃ instanceof cfj) {
/*  79 */       cfj<?> cfj1 = (cfj)☃;
/*     */       
/*  81 */       return (this.a.equals(cfj1.a) && this.b.equals(cfj1.b));
/*     */     } 
/*     */     
/*  84 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int hashCode() {
/*  89 */     if (this.c == null) {
/*  90 */       this.c = Integer.valueOf(b());
/*     */     }
/*  92 */     return this.c.intValue();
/*     */   }
/*     */   
/*     */   public int b() {
/*  96 */     return 31 * this.a.hashCode() + this.b.hashCode();
/*     */   }
/*     */   
/*     */   public abstract Collection<T> a();
/*     */   
/*     */   public abstract String a(T paramT);
/*     */   
/*     */   public abstract Optional<T> b(String paramString);
/*     */   
/*     */   public static final class a<T extends Comparable<T>> {
/*     */     private final cfj<T> a;
/*     */     
/*     */     private a(cfj<T> ☃, T t) {
/* 109 */       if (!☃.a().contains(t)) {
/* 110 */         throw new IllegalArgumentException("Value " + t + " does not belong to property " + ☃);
/*     */       }
/* 112 */       this.a = ☃;
/* 113 */       this.b = t;
/*     */     }
/*     */     private final T b;
/*     */     public cfj<T> a() {
/* 117 */       return this.a;
/*     */     }
/*     */     
/*     */     public T b() {
/* 121 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 126 */       return this.a.f() + "=" + this.a.a(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 131 */       if (this == ☃) {
/* 132 */         return true;
/*     */       }
/* 134 */       if (!(☃ instanceof a)) {
/* 135 */         return false;
/*     */       }
/*     */       
/* 138 */       a<?> a1 = (a)☃;
/* 139 */       return (this.a == a1.a && this.b.equals(a1.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 144 */       int ☃ = this.a.hashCode();
/* 145 */       ☃ = 31 * ☃ + this.b.hashCode();
/* 146 */       return ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */