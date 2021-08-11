/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Queues;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Queue;
/*     */ import java.util.Set;
/*     */ import java.util.TreeSet;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class bsl<T>
/*     */   implements bso<T>
/*     */ {
/*     */   protected final Predicate<T> a;
/*     */   private final Function<T, vk> b;
/*  36 */   private final Set<bsp<T>> c = Sets.newHashSet();
/*  37 */   private final TreeSet<bsp<T>> d = Sets.newTreeSet(bsp.a());
/*     */   
/*     */   private final aag e;
/*  40 */   private final Queue<bsp<T>> f = Queues.newArrayDeque();
/*  41 */   private final List<bsp<T>> g = Lists.newArrayList();
/*     */   private final Consumer<bsp<T>> h;
/*     */   
/*     */   public bsl(aag ☃, Predicate<T> predicate, Function<T, vk> function, Consumer<bsp<T>> consumer) {
/*  45 */     this.a = predicate;
/*  46 */     this.b = function;
/*  47 */     this.e = ☃;
/*  48 */     this.h = consumer;
/*     */   }
/*     */   
/*     */   public void b() {
/*  52 */     int ☃ = this.d.size();
/*  53 */     if (☃ != this.c.size()) {
/*  54 */       throw new IllegalStateException("TickNextTick list out of synch");
/*     */     }
/*  56 */     if (☃ > 65536) {
/*  57 */       ☃ = 65536;
/*     */     }
/*     */     
/*  60 */     aae aae = this.e.i();
/*  61 */     Iterator<bsp<T>> iterator = this.d.iterator();
/*  62 */     this.e.Z().a("cleaning");
/*  63 */     while (☃ > 0 && iterator.hasNext()) {
/*  64 */       bsp<T> bsp1 = iterator.next();
/*  65 */       if (bsp1.b > this.e.T()) {
/*     */         break;
/*     */       }
/*     */       
/*  69 */       if (!aae.a(bsp1.a)) {
/*     */         continue;
/*     */       }
/*     */       
/*  73 */       iterator.remove();
/*  74 */       this.c.remove(bsp1);
/*  75 */       this.f.add(bsp1);
/*  76 */       ☃--;
/*     */     } 
/*  78 */     this.e.Z().b("ticking");
/*     */     bsp<T> bsp;
/*  80 */     while ((bsp = this.f.poll()) != null) {
/*  81 */       if (aae.a(bsp.a)) {
/*     */         try {
/*  83 */           this.g.add(bsp);
/*  84 */           this.h.accept(bsp);
/*  85 */         } catch (Throwable throwable) {
/*  86 */           l l = l.a(throwable, "Exception while ticking");
/*  87 */           m m = l.a("Block being ticked");
/*  88 */           m.a(m, bsp.a, (ceh)null);
/*  89 */           throw new u(l);
/*     */         }  continue;
/*     */       } 
/*  92 */       a(bsp.a, bsp.b(), 0);
/*     */     } 
/*     */     
/*  95 */     this.e.Z().c();
/*     */     
/*  97 */     this.g.clear();
/*  98 */     this.f.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean b(fx ☃, T t) {
/* 104 */     return this.f.contains(new bsp<>(☃, t));
/*     */   }
/*     */   
/*     */   public List<bsp<T>> a(brd ☃, boolean bool1, boolean bool2) {
/* 108 */     int i = (☃.b << 4) - 2;
/* 109 */     int j = i + 16 + 2;
/* 110 */     int k = (☃.c << 4) - 2;
/* 111 */     int m = k + 16 + 2;
/*     */     
/* 113 */     return a(new cra(i, 0, k, j, 256, m), bool1, bool2);
/*     */   }
/*     */   
/*     */   public List<bsp<T>> a(cra ☃, boolean bool1, boolean bool2) {
/* 117 */     List<bsp<T>> list = a((List<bsp<T>>)null, this.d, ☃, bool1);
/* 118 */     if (bool1 && list != null) {
/* 119 */       this.c.removeAll(list);
/*     */     }
/* 121 */     list = a(list, this.f, ☃, bool1);
/* 122 */     if (!bool2) {
/* 123 */       list = a(list, this.g, ☃, bool1);
/*     */     }
/* 125 */     return (list == null) ? Collections.<bsp<T>>emptyList() : list;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private List<bsp<T>> a(@Nullable List<bsp<T>> ☃, Collection<bsp<T>> collection, cra cra1, boolean bool) {
/* 130 */     Iterator<bsp<T>> iterator = collection.iterator();
/* 131 */     while (iterator.hasNext()) {
/* 132 */       bsp<T> bsp = iterator.next();
/* 133 */       fx fx = bsp.a;
/* 134 */       if (fx.u() >= cra1.a && fx.u() < cra1.d && fx.w() >= cra1.c && fx.w() < cra1.f) {
/* 135 */         if (bool) {
/* 136 */           iterator.remove();
/*     */         }
/* 138 */         if (☃ == null) {
/* 139 */           ☃ = Lists.newArrayList();
/*     */         }
/* 141 */         ☃.add(bsp);
/*     */       } 
/*     */     } 
/* 144 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cra ☃, fx fx1) {
/* 149 */     List<bsp<T>> list = a(☃, false, false);
/* 150 */     for (bsp<T> bsp : list) {
/* 151 */       if (☃.b(bsp.a)) {
/* 152 */         fx fx2 = bsp.a.a(fx1);
/* 153 */         T t = bsp.b();
/* 154 */         a(new bsp<>(fx2, t, bsp.b, bsp.c));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public mj a(brd ☃) {
/* 161 */     List<bsp<T>> list = a(☃, false, true);
/* 162 */     return a(this.b, list, this.e.T());
/*     */   }
/*     */   
/*     */   private static <T> mj a(Function<T, vk> ☃, Iterable<bsp<T>> iterable, long l) {
/* 166 */     mj mj = new mj();
/* 167 */     for (bsp<T> bsp : iterable) {
/* 168 */       md md = new md();
/* 169 */       md.a("i", ((vk)☃.apply(bsp.b())).toString());
/* 170 */       md.b("x", bsp.a.u());
/* 171 */       md.b("y", bsp.a.v());
/* 172 */       md.b("z", bsp.a.w());
/* 173 */       md.b("t", (int)(bsp.b - l));
/* 174 */       md.b("p", bsp.c.a());
/*     */       
/* 176 */       mj.add(md);
/*     */     } 
/*     */     
/* 179 */     return mj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃, T t) {
/* 188 */     return this.c.contains(new bsp<>(☃, t));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, T t, int i, bsq bsq1) {
/* 193 */     if (!this.a.test(t)) {
/* 194 */       a(new bsp<>(☃, t, i + this.e.T(), bsq1));
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(bsp<T> ☃) {
/* 199 */     if (!this.c.contains(☃)) {
/* 200 */       this.c.add(☃);
/* 201 */       this.d.add(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int a() {
/* 207 */     return this.c.size();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */