/*     */ import com.google.common.collect.ArrayTable;
/*     */ import com.google.common.collect.HashBasedTable;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Table;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class cej<O, S>
/*     */ {
/*  22 */   private static final Function<Map.Entry<cfj<?>, Comparable<?>>, String> a = new Function<Map.Entry<cfj<?>, Comparable<?>>, String>()
/*     */     {
/*     */       public String a(@Nullable Map.Entry<cfj<?>, Comparable<?>> ☃) {
/*  25 */         if (☃ == null) {
/*  26 */           return "<NULL>";
/*     */         }
/*     */         
/*  29 */         cfj<?> cfj = ☃.getKey();
/*  30 */         return cfj.f() + "=" + a(cfj, ☃.getValue());
/*     */       }
/*     */ 
/*     */       
/*     */       private <T extends Comparable<T>> String a(cfj<T> ☃, Comparable<?> comparable) {
/*  35 */         return ☃.a((T)comparable);
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   protected final O c;
/*     */   private final ImmutableMap<cfj<?>, Comparable<?>> b;
/*     */   private Table<cfj<?>, Comparable<?>, S> e;
/*     */   protected final MapCodec<S> d;
/*     */   
/*     */   protected cej(O ☃, ImmutableMap<cfj<?>, Comparable<?>> immutableMap, MapCodec<S> mapCodec) {
/*  46 */     this.c = ☃;
/*  47 */     this.b = immutableMap;
/*  48 */     this.d = mapCodec;
/*     */   }
/*     */   
/*     */   public <T extends Comparable<T>> S a(cfj<T> ☃) {
/*  52 */     return a(☃, a(☃.a(), c(☃)));
/*     */   }
/*     */   
/*     */   protected static <T> T a(Collection<T> ☃, T t) {
/*  56 */     Iterator<T> iterator = ☃.iterator();
/*     */     
/*  58 */     while (iterator.hasNext()) {
/*  59 */       if (iterator.next().equals(t)) {
/*  60 */         if (iterator.hasNext()) {
/*  61 */           return iterator.next();
/*     */         }
/*  63 */         return ☃.iterator().next();
/*     */       } 
/*     */     } 
/*     */     
/*  67 */     return iterator.next();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  72 */     StringBuilder ☃ = new StringBuilder();
/*  73 */     ☃.append(this.c);
/*     */     
/*  75 */     if (!s().isEmpty()) {
/*  76 */       ☃.append('[');
/*  77 */       ☃.append(s().entrySet().stream().<CharSequence>map((Function)a).collect(Collectors.joining(",")));
/*  78 */       ☃.append(']');
/*     */     } 
/*     */     
/*  81 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   public Collection<cfj<?>> r() {
/*  85 */     return Collections.unmodifiableCollection((Collection<? extends cfj<?>>)this.b.keySet());
/*     */   }
/*     */   
/*     */   public <T extends Comparable<T>> boolean b(cfj<T> ☃) {
/*  89 */     return this.b.containsKey(☃);
/*     */   }
/*     */   
/*     */   public <T extends Comparable<T>> T c(cfj<T> ☃) {
/*  93 */     Comparable<?> comparable = (Comparable)this.b.get(☃);
/*  94 */     if (comparable == null) {
/*  95 */       throw new IllegalArgumentException("Cannot get property " + ☃ + " as it does not exist in " + this.c);
/*     */     }
/*     */     
/*  98 */     return (T)☃.g().cast(comparable);
/*     */   }
/*     */   
/*     */   public <T extends Comparable<T>> Optional<T> d(cfj<T> ☃) {
/* 102 */     Comparable<?> comparable = (Comparable)this.b.get(☃);
/* 103 */     if (comparable == null) {
/* 104 */       return Optional.empty();
/*     */     }
/*     */     
/* 107 */     return Optional.of(☃.g().cast(comparable));
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends Comparable<T>, V extends T> S a(cfj<T> ☃, V v) {
/* 112 */     Comparable<?> comparable = (Comparable)this.b.get(☃);
/* 113 */     if (comparable == null) {
/* 114 */       throw new IllegalArgumentException("Cannot set property " + ☃ + " as it does not exist in " + this.c);
/*     */     }
/* 116 */     if (comparable == v) {
/* 117 */       return (S)this;
/*     */     }
/*     */     
/* 120 */     S s = (S)this.e.get(☃, v);
/* 121 */     if (s == null) {
/* 122 */       throw new IllegalArgumentException("Cannot set property " + ☃ + " to " + v + " on " + this.c + ", it is not an allowed value");
/*     */     }
/*     */     
/* 125 */     return s;
/*     */   }
/*     */   
/*     */   public void a(Map<Map<cfj<?>, Comparable<?>>, S> ☃) {
/* 129 */     if (this.e != null) {
/* 130 */       throw new IllegalStateException();
/*     */     }
/*     */     
/* 133 */     HashBasedTable hashBasedTable = HashBasedTable.create();
/* 134 */     for (UnmodifiableIterator<Map.Entry<cfj<?>, Comparable<?>>> unmodifiableIterator = this.b.entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<cfj<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 135 */       cfj<?> cfj = entry.getKey();
/* 136 */       for (Comparable<?> comparable : cfj.a()) {
/* 137 */         if (comparable != entry.getValue()) {
/* 138 */           hashBasedTable.put(cfj, comparable, ☃.get(b(cfj, comparable)));
/*     */         }
/*     */       }  }
/*     */ 
/*     */     
/* 143 */     this.e = hashBasedTable.isEmpty() ? (Table<cfj<?>, Comparable<?>, S>)hashBasedTable : (Table<cfj<?>, Comparable<?>, S>)ArrayTable.create((Table)hashBasedTable);
/*     */   }
/*     */   
/*     */   private Map<cfj<?>, Comparable<?>> b(cfj<?> ☃, Comparable<?> comparable) {
/* 147 */     Map<cfj<?>, Comparable<?>> map = Maps.newHashMap((Map)this.b);
/* 148 */     map.put(☃, comparable);
/* 149 */     return map;
/*     */   }
/*     */   
/*     */   public ImmutableMap<cfj<?>, Comparable<?>> s() {
/* 153 */     return this.b;
/*     */   }
/*     */   
/*     */   protected static <O, S extends cej<O, S>> Codec<S> a(Codec<O> ☃, Function<O, S> function) {
/* 157 */     return ☃.dispatch("Name", ☃ -> ☃.c, object -> {
/*     */           cej cej1 = ☃.apply(object);
/*     */           return cej1.s().isEmpty() ? Codec.unit(cej1) : cej1.d.fieldOf("Properties").codec();
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */