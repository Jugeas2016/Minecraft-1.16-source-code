/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class arp
/*     */   extends arv<aqu>
/*     */ {
/*     */   private final azr b;
/*     */   private final ayd<gf> c;
/*     */   private final boolean d;
/*     */   private final Optional<Byte> e;
/*     */   private long f;
/*  42 */   private final Long2ObjectMap<a> g = (Long2ObjectMap<a>)new Long2ObjectOpenHashMap();
/*     */   
/*     */   public arp(azr ☃, ayd<gf> ayd1, ayd<gf> ayd2, boolean bool, Optional<Byte> optional) {
/*  45 */     super((Map<ayd<?>, aye>)a(ayd1, ayd2));
/*  46 */     this.b = ☃;
/*  47 */     this.c = ayd2;
/*  48 */     this.d = bool;
/*  49 */     this.e = optional;
/*     */   }
/*     */   
/*     */   public arp(azr ☃, ayd<gf> ayd1, boolean bool, Optional<Byte> optional) {
/*  53 */     this(☃, ayd1, ayd1, bool, optional);
/*     */   }
/*     */   
/*     */   private static ImmutableMap<ayd<?>, aye> a(ayd<gf> ☃, ayd<gf> ayd1) {
/*  57 */     ImmutableMap.Builder<ayd<?>, aye> builder = ImmutableMap.builder();
/*  58 */     builder.put(☃, aye.b);
/*  59 */     if (ayd1 != ☃) {
/*  60 */       builder.put(ayd1, aye.b);
/*     */     }
/*  62 */     return builder.build();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, aqu aqu1) {
/*  67 */     if (this.d && aqu1.w_()) {
/*  68 */       return false;
/*     */     }
/*     */     
/*  71 */     if (this.f == 0L) {
/*  72 */       this.f = aqu1.l.T() + ☃.t.nextInt(20);
/*  73 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     return (☃.T() >= this.f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, aqu aqu1, long l) {
/*  84 */     this.f = l + 20L + ☃.u_().nextInt(20);
/*     */     
/*  86 */     azo azo = ☃.y();
/*     */     
/*  88 */     this.g.long2ObjectEntrySet().removeIf(entry -> !((a)entry.getValue()).b(☃));
/*     */     
/*  90 */     Predicate<fx> predicate = fx1 -> {
/*     */         a a = (a)this.g.get(fx1.a());
/*     */         
/*     */         if (a == null) {
/*     */           return true;
/*     */         }
/*     */         
/*     */         if (!a.c(☃)) {
/*     */           return false;
/*     */         }
/*     */         
/*     */         a.a(☃);
/*     */         
/*     */         return true;
/*     */       };
/*     */     
/* 106 */     Set<fx> set = (Set<fx>)azo.b(this.b.c(), predicate, aqu1.cB(), 48, azo.b.a).limit(5L).collect(Collectors.toSet());
/*     */     
/* 108 */     cxd cxd = aqu1.x().a(set, this.b.d());
/*     */     
/* 110 */     if (cxd != null && cxd.j()) {
/* 111 */       fx fx = cxd.m();
/* 112 */       azo.c(fx).ifPresent(azr1 -> {
/*     */             ☃.a(this.b.c(), (), fx1, 1);
/*     */             aqu1.cJ().a(this.c, gf.a(aag1.Y(), fx1));
/*     */             this.e.ifPresent(());
/*     */             this.g.clear();
/*     */             rz.c(aag1, fx1);
/*     */           });
/*     */     } else {
/* 120 */       for (fx fx : set) {
/* 121 */         this.g.computeIfAbsent(fx.a(), l2 -> new a(☃.l.t, l1));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/*     */     private final Random a;
/*     */     
/*     */     private long b;
/*     */     
/*     */     private long c;
/*     */     
/*     */     private int d;
/*     */     
/*     */     a(Random ☃, long l) {
/* 138 */       this.a = ☃;
/* 139 */       a(l);
/*     */     }
/*     */     
/*     */     public void a(long ☃) {
/* 143 */       this.b = ☃;
/* 144 */       int i = this.d + this.a.nextInt(40) + 40;
/* 145 */       this.d = Math.min(i, 400);
/* 146 */       this.c = ☃ + this.d;
/*     */     }
/*     */     
/*     */     public boolean b(long ☃) {
/* 150 */       return (☃ - this.b < 400L);
/*     */     }
/*     */     
/*     */     public boolean c(long ☃) {
/* 154 */       return (☃ >= this.c);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 159 */       return "RetryMarker{, previousAttemptAt=" + this.b + ", nextScheduledAttemptAt=" + this.c + ", currentDelay=" + this.d + '}';
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */