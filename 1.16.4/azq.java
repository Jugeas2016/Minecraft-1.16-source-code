/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.util.Supplier;
/*     */ 
/*     */ 
/*     */ public class azq
/*     */ {
/*  27 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Codec<azq> a(Runnable ☃) {
/*  34 */     return RecordCodecBuilder.create(instance -> instance.group((App)RecordCodecBuilder.point(☃), (App)Codec.BOOL.optionalFieldOf("Valid", Boolean.valueOf(false)).forGetter(()), (App)azp.a(☃).listOf().fieldOf("Records").forGetter(())).apply((Applicative)instance, azq::new))
/*     */ 
/*     */ 
/*     */       
/*  38 */       .orElseGet(x.a("Failed to read POI section: ", a::error), () -> new azq(☃, false, (List<azp>)ImmutableList.of()));
/*     */   }
/*     */   
/*  41 */   private final Short2ObjectMap<azp> b = (Short2ObjectMap<azp>)new Short2ObjectOpenHashMap();
/*  42 */   private final Map<azr, Set<azp>> c = Maps.newHashMap();
/*     */   private final Runnable d;
/*     */   private boolean e;
/*     */   
/*     */   public azq(Runnable ☃) {
/*  47 */     this(☃, true, (List<azp>)ImmutableList.of());
/*     */   }
/*     */   
/*     */   private azq(Runnable ☃, boolean bool, List<azp> list) {
/*  51 */     this.d = ☃;
/*  52 */     this.e = bool;
/*  53 */     list.forEach(this::a);
/*     */   }
/*     */   
/*     */   public Stream<azp> a(Predicate<azr> ☃, azo.b b1) {
/*  57 */     return this.c.entrySet()
/*  58 */       .stream()
/*  59 */       .filter(entry -> ☃.test(entry.getKey()))
/*  60 */       .flatMap(☃ -> ((Set)☃.getValue()).stream())
/*  61 */       .filter(b1.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, azr azr1) {
/*  66 */     if (a(new azp(☃, azr1, this.d))) {
/*  67 */       a.debug("Added POI of type {} @ {}", new Supplier[] { () -> ☃, () -> ☃ });
/*  68 */       this.d.run();
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(azp ☃) {
/*  73 */     fx fx = ☃.f();
/*  74 */     azr azr = ☃.g();
/*  75 */     short s = gp.b(fx);
/*  76 */     azp azp1 = (azp)this.b.get(s);
/*     */     
/*  78 */     if (azp1 != null) {
/*  79 */       if (azr.equals(azp1.g())) {
/*  80 */         return false;
/*     */       }
/*  82 */       throw (IllegalStateException)x.c(new IllegalStateException("POI data mismatch: already registered at " + fx));
/*     */     } 
/*     */ 
/*     */     
/*  86 */     this.b.put(s, ☃);
/*  87 */     ((Set<azp>)this.c.computeIfAbsent(azr, ☃ -> Sets.newHashSet())).add(☃);
/*  88 */     return true;
/*     */   }
/*     */   
/*     */   public void a(fx ☃) {
/*  92 */     azp azp = (azp)this.b.remove(gp.b(☃));
/*  93 */     if (azp == null) {
/*  94 */       a.error("POI data mismatch: never registered at " + ☃);
/*     */       return;
/*     */     } 
/*  97 */     ((Set)this.c.get(azp.g())).remove(azp);
/*     */     
/*  99 */     a.debug("Removed POI of type {} @ {}", new Supplier[] { azp::g, azp::f });
/* 100 */     this.d.run();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c(fx ☃) {
/* 112 */     azp azp = (azp)this.b.get(gp.b(☃));
/* 113 */     if (azp == null) {
/* 114 */       throw (IllegalStateException)x.c(new IllegalStateException("POI never registered at " + ☃));
/*     */     }
/* 116 */     boolean bool = azp.c();
/* 117 */     this.d.run();
/* 118 */     return bool;
/*     */   }
/*     */   
/*     */   public boolean a(fx ☃, Predicate<azr> predicate) {
/* 122 */     short s = gp.b(☃);
/* 123 */     azp azp = (azp)this.b.get(s);
/* 124 */     return (azp != null && predicate.test(azp.g()));
/*     */   }
/*     */   
/*     */   public Optional<azr> d(fx ☃) {
/* 128 */     short s = gp.b(☃);
/* 129 */     azp azp = (azp)this.b.get(s);
/* 130 */     return (azp != null) ? Optional.<azr>of(azp.g()) : Optional.<azr>empty();
/*     */   }
/*     */   
/*     */   public void a(Consumer<BiConsumer<fx, azr>> ☃) {
/* 134 */     if (!this.e) {
/* 135 */       Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap(this.b);
/* 136 */       b();
/* 137 */       ☃.accept((fx1, azr1) -> {
/*     */             short s = gp.b(fx1);
/*     */             azp azp = (azp)☃.computeIfAbsent(s, ());
/*     */             a(azp);
/*     */           });
/* 142 */       this.e = true;
/* 143 */       this.d.run();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b() {
/* 148 */     this.b.clear();
/* 149 */     this.c.clear();
/*     */   }
/*     */   
/*     */   boolean a() {
/* 153 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */