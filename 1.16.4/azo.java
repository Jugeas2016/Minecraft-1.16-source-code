/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ByteMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import java.io.File;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
/*     */ import java.util.stream.Stream;
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
/*     */ public class azo
/*     */   extends chb<azq>
/*     */ {
/*     */   private final a a;
/*  41 */   private final LongSet b = (LongSet)new LongOpenHashSet();
/*     */   
/*     */   public azo(File ☃, DataFixer dataFixer, boolean bool) {
/*  44 */     super(☃, azq::a, azq::new, dataFixer, aga.j, bool);
/*  45 */     this.a = new a(this);
/*     */   }
/*     */   
/*     */   public void a(fx ☃, azr azr1) {
/*  49 */     e(gp.a(☃).s()).a(☃, azr1);
/*     */   }
/*     */   
/*     */   public void a(fx ☃) {
/*  53 */     e(gp.a(☃).s()).a(☃);
/*     */   }
/*     */   
/*     */   public long a(Predicate<azr> ☃, fx fx1, int i, b b1) {
/*  57 */     return c(☃, fx1, i, b1).count();
/*     */   }
/*     */   
/*     */   public boolean a(azr ☃, fx fx1) {
/*  61 */     Optional<azr> optional = e(gp.a(fx1).s()).d(fx1);
/*  62 */     return (optional.isPresent() && ((azr)optional.get()).equals(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Stream<azp> b(Predicate<azr> ☃, fx fx1, int i, b b1) {
/*  69 */     int j = Math.floorDiv(i, 16) + 1;
/*     */     
/*  71 */     return brd.a(new brd(fx1), j).<azp>flatMap(brd1 -> a(☃, brd1, b1))
/*  72 */       .filter(azp1 -> {
/*     */           fx fx1 = azp1.f();
/*  74 */           return (Math.abs(fx1.u() - ☃.u()) <= i && Math.abs(fx1.w() - ☃.w()) <= i);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<azp> c(Predicate<azr> ☃, fx fx1, int i, b b1) {
/*  80 */     int j = i * i;
/*  81 */     return b(☃, fx1, i, b1).filter(azp1 -> (azp1.f().j(☃) <= i));
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<azp> a(Predicate<azr> ☃, brd brd1, b b1) {
/*  86 */     return IntStream.range(0, 16).boxed()
/*  87 */       .map(integer -> d(gp.a(☃, integer.intValue()).s()))
/*  88 */       .filter(Optional::isPresent)
/*  89 */       .flatMap(optional -> ((azq)optional.get()).a(☃, b1));
/*     */   }
/*     */   
/*     */   public Stream<fx> a(Predicate<azr> ☃, Predicate<fx> predicate, fx fx1, int i, b b1) {
/*  93 */     return c(☃, fx1, i, b1)
/*  94 */       .<fx>map(azp::f)
/*  95 */       .filter(predicate);
/*     */   }
/*     */   
/*     */   public Stream<fx> b(Predicate<azr> ☃, Predicate<fx> predicate, fx fx1, int i, b b1) {
/*  99 */     return a(☃, predicate, fx1, i, b1)
/* 100 */       .sorted(Comparator.comparingDouble(fx1 -> fx1.j(☃)));
/*     */   }
/*     */   
/*     */   public Optional<fx> c(Predicate<azr> ☃, Predicate<fx> predicate, fx fx1, int i, b b1) {
/* 104 */     return a(☃, predicate, fx1, i, b1).findFirst();
/*     */   }
/*     */   
/*     */   public Optional<fx> d(Predicate<azr> ☃, fx fx1, int i, b b1) {
/* 108 */     return c(☃, fx1, i, b1)
/* 109 */       .<fx>map(azp::f)
/* 110 */       .min(Comparator.comparingDouble(fx1 -> fx1.j(☃)));
/*     */   }
/*     */   
/*     */   public Optional<fx> a(Predicate<azr> ☃, Predicate<fx> predicate, fx fx1, int i) {
/* 114 */     return c(☃, fx1, i, b.a)
/* 115 */       .filter(azp1 -> ☃.test(azp1.f()))
/* 116 */       .findFirst()
/* 117 */       .map(☃ -> {
/*     */           ☃.b();
/*     */           return ☃.f();
/*     */         });
/*     */   }
/*     */   
/*     */   public Optional<fx> a(Predicate<azr> ☃, Predicate<fx> predicate, b b1, fx fx1, int i, Random random) {
/* 124 */     List<azp> list = c(☃, fx1, i, b1).collect((Collector)Collectors.toList());
/* 125 */     Collections.shuffle(list, random);
/* 126 */     return list.stream().filter(azp1 -> ☃.test(azp1.f())).findFirst().map(azp::f);
/*     */   }
/*     */   
/*     */   public boolean b(fx ☃) {
/* 130 */     return e(gp.a(☃).s()).c(☃);
/*     */   }
/*     */   
/*     */   public boolean a(fx ☃, Predicate<azr> predicate) {
/* 134 */     return ((Boolean)d(gp.a(☃).s()).<Boolean>map(azq1 -> Boolean.valueOf(azq1.a(☃, predicate))).orElse(Boolean.valueOf(false))).booleanValue();
/*     */   }
/*     */   
/*     */   public Optional<azr> c(fx ☃) {
/* 138 */     azq azq = e(gp.a(☃).s());
/* 139 */     return azq.d(☃);
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
/*     */ 
/*     */   
/*     */   public int a(gp ☃) {
/* 153 */     this.a.a();
/* 154 */     return this.a.c(☃.s());
/*     */   }
/*     */   
/*     */   private boolean f(long ☃) {
/* 158 */     Optional<azq> optional = c(☃);
/* 159 */     if (optional == null) {
/* 160 */       return false;
/*     */     }
/*     */     
/* 163 */     return ((Boolean)optional.<Boolean>map(☃ -> Boolean.valueOf((☃.a(azr.b, b.b).count() > 0L))).orElse(Boolean.valueOf(false))).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(BooleanSupplier ☃) {
/* 168 */     super.a(☃);
/* 169 */     this.a.a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(long ☃) {
/* 174 */     super.a(☃);
/* 175 */     this.a.b(☃, this.a.b(☃), false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(long ☃) {
/* 180 */     this.a.b(☃, this.a.b(☃), false);
/*     */   }
/*     */   
/*     */   public void a(brd ☃, cgi cgi1) {
/* 184 */     gp gp = gp.a(☃, cgi1.g() >> 4);
/* 185 */     x.a(d(gp.s()), azq1 -> azq1.a(()), () -> {
/*     */           if (a(☃)) {
/*     */             azq azq = e(gp1.s());
/*     */             a(☃, gp1, azq::a);
/*     */           } 
/*     */         });
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
/*     */   
/*     */   private static boolean a(cgi ☃) {
/* 203 */     return ☃.a(azr.x::contains);
/*     */   }
/*     */   
/*     */   private void a(cgi ☃, gp gp1, BiConsumer<fx, azr> biConsumer) {
/* 207 */     gp1.t().forEach(fx1 -> {
/*     */           ceh ceh = ☃.a(gp.b(fx1.u()), gp.b(fx1.v()), gp.b(fx1.w()));
/*     */           azr.b(ceh).ifPresent(());
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(brz ☃, fx fx1, int i) {
/* 218 */     gp.b(new brd(fx1), Math.floorDiv(i, 16))
/* 219 */       .map(☃ -> Pair.of(☃, d(☃.s())))
/* 220 */       .filter(☃ -> !((Boolean)((Optional)☃.getSecond()).map(azq::a).orElse(Boolean.valueOf(false))).booleanValue())
/* 221 */       .map(☃ -> ((gp)☃.getFirst()).r())
/* 222 */       .filter(☃ -> this.b.add(☃.a()))
/* 223 */       .forEach(brd1 -> ☃.a(brd1.b, brd1.c, cga.a));
/*     */   }
/*     */   
/*     */   public enum b {
/* 227 */     a((String)azp::d),
/* 228 */     b((String)azp::e),
/* 229 */     c((String)(☃ -> true));
/*     */     
/*     */     private final Predicate<? super azp> d;
/*     */     
/*     */     b(Predicate<? super azp> ☃) {
/* 234 */       this.d = ☃;
/*     */     }
/*     */     
/*     */     public Predicate<? super azp> a() {
/* 238 */       return this.d;
/*     */     }
/*     */   }
/*     */   
/*     */   final class a extends aac {
/*     */     private final Long2ByteMap b;
/*     */     
/*     */     protected a(azo this$0) {
/* 246 */       super(7, 16, 256);
/* 247 */       this.b = (Long2ByteMap)new Long2ByteOpenHashMap();
/* 248 */       this.b.defaultReturnValue((byte)7);
/*     */     }
/*     */ 
/*     */     
/*     */     protected int b(long ☃) {
/* 253 */       return azo.a(this.a, ☃) ? 0 : 7;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int c(long ☃) {
/* 258 */       return this.b.get(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(long ☃, int i) {
/* 263 */       if (i > 6) {
/* 264 */         this.b.remove(☃);
/*     */       } else {
/* 266 */         this.b.put(☃, (byte)i);
/*     */       } 
/*     */     }
/*     */     
/*     */     public void a() {
/* 271 */       b(2147483647);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */