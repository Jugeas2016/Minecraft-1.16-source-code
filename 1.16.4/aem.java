/*     */ import com.google.common.collect.BiMap;
/*     */ import com.google.common.collect.ImmutableBiMap;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface aem<T>
/*     */ {
/*     */   Map<vk, ael<T>> a();
/*     */   
/*     */   @Nullable
/*     */   default ael<T> a(vk ☃) {
/*  23 */     return a().get(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   ael<T> b(vk paramvk);
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   vk a(ael<T> paramael);
/*     */ 
/*     */   
/*     */   default vk b(ael<T> ☃) {
/*  37 */     vk vk = a(☃);
/*  38 */     if (vk == null) {
/*  39 */       throw new IllegalStateException("Unrecognized tag");
/*     */     }
/*  41 */     return vk;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default Collection<vk> b() {
/*  49 */     return a().keySet();
/*     */   }
/*     */   
/*     */   default Collection<vk> a(T ☃) {
/*  53 */     List<vk> list = Lists.newArrayList();
/*  54 */     for (Map.Entry<vk, ael<T>> entry : a().entrySet()) {
/*  55 */       if (((ael<T>)entry.getValue()).a(☃)) {
/*  56 */         list.add(entry.getKey());
/*     */       }
/*     */     } 
/*  59 */     return list;
/*     */   }
/*     */   
/*     */   default void a(nf ☃, gb<T> gb1) {
/*  63 */     Map<vk, ael<T>> map = a();
/*  64 */     ☃.d(map.size());
/*  65 */     for (Map.Entry<vk, ael<T>> entry : map.entrySet()) {
/*  66 */       ☃.a(entry.getKey());
/*  67 */       ☃.d(((ael)entry.getValue()).b().size());
/*  68 */       for (T t : ((ael)entry.getValue()).b()) {
/*  69 */         ☃.d(gb1.a(t));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   static <T> aem<T> a(nf ☃, gm<T> gm1) {
/*  75 */     Map<vk, ael<T>> map = Maps.newHashMap();
/*  76 */     int i = ☃.i();
/*  77 */     for (int j = 0; j < i; j++) {
/*  78 */       vk vk = ☃.p();
/*  79 */       int k = ☃.i();
/*  80 */       ImmutableSet.Builder<T> builder = ImmutableSet.builder();
/*  81 */       for (int m = 0; m < k; m++) {
/*  82 */         builder.add(gm1.a(☃.i()));
/*     */       }
/*  84 */       map.put(vk, ael.b((Set<T>)builder.build()));
/*     */     } 
/*     */     
/*  87 */     return a(map);
/*     */   }
/*     */   
/*     */   static <T> aem<T> c() {
/*  91 */     return a((Map<vk, ael<T>>)ImmutableBiMap.of());
/*     */   }
/*     */   
/*     */   static <T> aem<T> a(Map<vk, ael<T>> ☃) {
/*  95 */     ImmutableBiMap immutableBiMap = ImmutableBiMap.copyOf(☃);
/*  96 */     return new aem<T>((BiMap)immutableBiMap) {
/*  97 */         private final ael<T> b = aei.a();
/*     */ 
/*     */         
/*     */         public ael<T> b(vk ☃) {
/* 101 */           return (ael<T>)this.a.getOrDefault(☃, this.b);
/*     */         }
/*     */ 
/*     */         
/*     */         @Nullable
/*     */         public vk a(ael<T> ☃) {
/* 107 */           if (☃ instanceof ael.e) {
/* 108 */             return ((ael.e)☃).a();
/*     */           }
/* 110 */           return (vk)this.a.inverse().get(☃);
/*     */         }
/*     */ 
/*     */         
/*     */         public Map<vk, ael<T>> a() {
/* 115 */           return (Map<vk, ael<T>>)this.a;
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */