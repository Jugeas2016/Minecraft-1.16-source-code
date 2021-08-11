/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function4;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.MapCodec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class btg
/*     */ {
/*  25 */   public static final Logger a = LogManager.getLogger(); public static final btg b; public static final MapCodec<btg> c; private final float d;
/*     */   static {
/*  27 */     b = new btg(0.1F, (Map<aqo, List<c>>)Stream.<aqo>of(aqo.values()).collect(ImmutableMap.toImmutableMap(☃ -> ☃, ☃ -> ImmutableList.of())), (Map<aqe<?>, b>)ImmutableMap.of(), false);
/*     */     
/*  29 */     c = RecordCodecBuilder.mapCodec(☃ -> ☃.group((App)Codec.FLOAT.optionalFieldOf("creature_spawn_probability", Float.valueOf(0.1F)).forGetter(()), (App)Codec.simpleMap(aqo.g, c.b.listOf().promotePartial(x.a("Spawn data: ", a::error)), afs.a((afs[])aqo.values())).fieldOf("spawners").forGetter(()), (App)Codec.simpleMap(gm.S, b.a, gm.S).fieldOf("spawn_costs").forGetter(()), (App)Codec.BOOL.fieldOf("player_spawn_friendly").orElse(Boolean.valueOf(false)).forGetter(btg::b)).apply((Applicative)☃, btg::new));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Map<aqo, List<c>> e;
/*     */ 
/*     */ 
/*     */   
/*     */   private final Map<aqe<?>, b> f;
/*     */ 
/*     */ 
/*     */   
/*     */   private final boolean g;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private btg(float ☃, Map<aqo, List<c>> map, Map<aqe<?>, b> map1, boolean bool) {
/*  50 */     this.d = ☃;
/*  51 */     this.e = map;
/*  52 */     this.f = map1;
/*  53 */     this.g = bool;
/*     */   }
/*     */   
/*     */   public List<c> a(aqo ☃) {
/*  57 */     return (List<c>)this.e.getOrDefault(☃, ImmutableList.of());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public b a(aqe<?> ☃) {
/*  62 */     return this.f.get(☃);
/*     */   }
/*     */   
/*     */   public float a() {
/*  66 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  70 */     return this.g;
/*     */   }
/*     */   public static class c extends afz.a { public static final Codec<c> b; public final aqe<?> c;
/*     */     static {
/*  74 */       b = RecordCodecBuilder.create(☃ -> ☃.group((App)gm.S.fieldOf("type").forGetter(()), (App)Codec.INT.fieldOf("weight").forGetter(()), (App)Codec.INT.fieldOf("minCount").forGetter(()), (App)Codec.INT.fieldOf("maxCount").forGetter(())).apply((Applicative)☃, c::new));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final int d;
/*     */ 
/*     */     
/*     */     public final int e;
/*     */ 
/*     */     
/*     */     public c(aqe<?> ☃, int i, int j, int k) {
/*  86 */       super(i);
/*  87 */       this.c = (☃.e() == aqo.f) ? aqe.ah : ☃;
/*  88 */       this.d = j;
/*  89 */       this.e = k;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  94 */       return aqe.a(this.c) + "*(" + this.d + "-" + this.e + "):" + this.a;
/*     */     } }
/*     */   public static class b { public static final Codec<b> a; private final double b; private final double c;
/*     */     
/*     */     static {
/*  99 */       a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.DOUBLE.fieldOf("energy_budget").forGetter(()), (App)Codec.DOUBLE.fieldOf("charge").forGetter(())).apply((Applicative)☃, b::new));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private b(double ☃, double d1) {
/* 108 */       this.b = ☃;
/* 109 */       this.c = d1;
/*     */     }
/*     */     
/*     */     public double a() {
/* 113 */       return this.b;
/*     */     }
/*     */     
/*     */     public double b() {
/* 117 */       return this.c;
/*     */     } }
/*     */   public static class a { private final Map<aqo, List<btg.c>> a; private final Map<aqe<?>, btg.b> b;
/*     */     
/*     */     public a() {
/* 122 */       this.a = (Map<aqo, List<btg.c>>)Stream.<aqo>of(aqo.values()).collect(ImmutableMap.toImmutableMap(☃ -> ☃, ☃ -> Lists.newArrayList()));
/* 123 */       this.b = Maps.newLinkedHashMap();
/* 124 */       this.c = 0.1F;
/*     */     }
/*     */     private float c; private boolean d;
/*     */     public a a(aqo ☃, btg.c c1) {
/* 128 */       ((List<btg.c>)this.a.get(☃)).add(c1);
/* 129 */       return this;
/*     */     }
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
/*     */     public a a(aqe<?> ☃, double d1, double d2) {
/* 155 */       this.b.put(☃, new btg.b(d2, d1));
/* 156 */       return this;
/*     */     }
/*     */     
/*     */     public a a(float ☃) {
/* 160 */       this.c = ☃;
/* 161 */       return this;
/*     */     }
/*     */     
/*     */     public a a() {
/* 165 */       this.d = true;
/* 166 */       return this;
/*     */     }
/*     */     
/*     */     public btg b() {
/* 170 */       return new btg(this.c, (Map)this.a
/*     */           
/* 172 */           .entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, ☃ -> ImmutableList.copyOf((Collection)☃.getValue()))), 
/* 173 */           (Map)ImmutableMap.copyOf(this.b), this.d);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */