/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function4;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Supplier;
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
/*     */ public class bsw
/*     */ {
/*  33 */   public static final Logger a = LogManager.getLogger();
/*     */   
/*  35 */   public static final bsw b = new bsw(() -> kp.p, 
/*     */       
/*  37 */       (Map<chm.a, List<Supplier<cib<?>>>>)ImmutableMap.of(), 
/*  38 */       (List<List<Supplier<civ<?, ?>>>>)ImmutableList.of(), 
/*  39 */       (List<Supplier<ciw<?, ?>>>)ImmutableList.of());
/*     */   
/*     */   static {
/*  42 */     c = RecordCodecBuilder.mapCodec(☃ -> ☃.group((App)ctg.b.fieldOf("surface_builder").forGetter(()), (App)Codec.simpleMap(chm.a.c, cib.c.promotePartial(x.a("Carver: ", a::error)), afs.a((afs[])chm.a.values())).fieldOf("carvers").forGetter(()), (App)civ.c.promotePartial(x.a("Feature: ", a::error)).listOf().fieldOf("features").forGetter(()), (App)ciw.c.promotePartial(x.a("Structure start: ", a::error)).fieldOf("starts").forGetter(())).apply((Applicative)☃, bsw::new));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final MapCodec<bsw> c;
/*     */   
/*     */   private final Supplier<ctg<?>> d;
/*     */   
/*     */   private final Map<chm.a, List<Supplier<cib<?>>>> e;
/*     */   
/*     */   private final List<List<Supplier<civ<?, ?>>>> f;
/*     */   
/*     */   private final List<Supplier<ciw<?, ?>>> g;
/*     */   
/*     */   private final List<civ<?, ?>> h;
/*     */ 
/*     */   
/*     */   private bsw(Supplier<ctg<?>> ☃, Map<chm.a, List<Supplier<cib<?>>>> map, List<List<Supplier<civ<?, ?>>>> list, List<Supplier<ciw<?, ?>>> list1) {
/*  61 */     this.d = ☃;
/*  62 */     this.e = map;
/*  63 */     this.f = list;
/*  64 */     this.g = list1;
/*     */     
/*  66 */     this.h = (List<civ<?, ?>>)list.stream().flatMap(Collection::stream).map(Supplier::get).flatMap(civ::d).filter(☃ -> (☃.e == cjl.d)).collect(ImmutableList.toImmutableList());
/*     */   }
/*     */   
/*     */   public List<Supplier<cib<?>>> a(chm.a ☃) {
/*  70 */     return (List<Supplier<cib<?>>>)this.e.getOrDefault(☃, ImmutableList.of());
/*     */   }
/*     */   
/*     */   public boolean a(cla<?> ☃) {
/*  74 */     return this.g.stream().anyMatch(supplier -> (((ciw)supplier.get()).d == ☃));
/*     */   }
/*     */   
/*     */   public Collection<Supplier<ciw<?, ?>>> a() {
/*  78 */     return this.g;
/*     */   }
/*     */   
/*     */   public ciw<?, ?> a(ciw<?, ?> ☃) {
/*  82 */     return (ciw<?, ?>)DataFixUtils.orElse(this.g.stream().map(Supplier::get).filter(ciw1 -> (ciw1.d == ☃.d)).findAny(), ☃);
/*     */   }
/*     */   
/*     */   public List<civ<?, ?>> b() {
/*  86 */     return this.h;
/*     */   }
/*     */   
/*     */   public List<List<Supplier<civ<?, ?>>>> c() {
/*  90 */     return this.f;
/*     */   }
/*     */   
/*     */   public Supplier<ctg<?>> d() {
/*  94 */     return this.d;
/*     */   }
/*     */   
/*     */   public ctv e() {
/*  98 */     return ((ctg<ctv>)this.d.get()).a();
/*     */   }
/*     */   
/*     */   public static class a {
/* 102 */     private Optional<Supplier<ctg<?>>> a = Optional.empty();
/* 103 */     private final Map<chm.a, List<Supplier<cib<?>>>> b = Maps.newLinkedHashMap();
/* 104 */     private final List<List<Supplier<civ<?, ?>>>> c = Lists.newArrayList();
/* 105 */     private final List<Supplier<ciw<?, ?>>> d = Lists.newArrayList();
/*     */     
/*     */     public a a(ctg<?> ☃) {
/* 108 */       return a(() -> ☃);
/*     */     }
/*     */     
/*     */     public a a(Supplier<ctg<?>> ☃) {
/* 112 */       this.a = Optional.of(☃);
/* 113 */       return this;
/*     */     }
/*     */     
/*     */     public a a(chm.b ☃, civ<?, ?> civ1) {
/* 117 */       return a(☃.ordinal(), () -> ☃);
/*     */     }
/*     */     
/*     */     public a a(int ☃, Supplier<civ<?, ?>> supplier) {
/* 121 */       a(☃);
/* 122 */       ((List<Supplier<civ<?, ?>>>)this.c.get(☃)).add(supplier);
/* 123 */       return this;
/*     */     }
/*     */     
/*     */     public <C extends chz> a a(chm.a ☃, cib<C> cib1) {
/* 127 */       ((List<Supplier>)this.b.computeIfAbsent(☃, ☃ -> Lists.newArrayList())).add(() -> ☃);
/* 128 */       return this;
/*     */     }
/*     */     
/*     */     public a a(ciw<?, ?> ☃) {
/* 132 */       this.d.add(() -> ☃);
/* 133 */       return this;
/*     */     }
/*     */     
/*     */     private void a(int ☃) {
/* 137 */       while (this.c.size() <= ☃) {
/* 138 */         this.c.add(Lists.newArrayList());
/*     */       }
/*     */     }
/*     */     
/*     */     public bsw a() {
/* 143 */       return new bsw(this.a
/* 144 */           .<Throwable>orElseThrow(() -> new IllegalStateException("Missing surface builder")), (Map)this.b
/* 145 */           .entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, ☃ -> ImmutableList.copyOf((Collection)☃.getValue()))), (List)this.c
/* 146 */           .stream().map(ImmutableList::copyOf).collect(ImmutableList.toImmutableList()), 
/* 147 */           (List)ImmutableList.copyOf(this.d));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */