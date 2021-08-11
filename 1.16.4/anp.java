/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.longs.LongArrayList;
/*     */ import it.unimi.dsi.fastutil.longs.LongList;
/*     */ import it.unimi.dsi.fastutil.objects.Object2LongMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2LongMaps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
/*     */ import java.time.Duration;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.IntSupplier;
/*     */ import java.util.function.LongSupplier;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.util.Supplier;
/*     */ 
/*     */ 
/*     */ public class anp
/*     */   implements anu
/*     */ {
/*  23 */   private static final long a = Duration.ofMillis(100L).toNanos();
/*  24 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  26 */   private final List<String> c = Lists.newArrayList();
/*  27 */   private final LongList d = (LongList)new LongArrayList();
/*  28 */   private final Map<String, a> e = Maps.newHashMap();
/*     */   private final IntSupplier f;
/*     */   private final LongSupplier g;
/*     */   private final long h;
/*     */   private final int i;
/*  33 */   private String j = "";
/*     */   
/*     */   private boolean k;
/*     */   
/*     */   @Nullable
/*     */   private a l;
/*     */   private final boolean m;
/*     */   
/*     */   public anp(LongSupplier ☃, IntSupplier intSupplier, boolean bool) {
/*  42 */     this.h = ☃.getAsLong();
/*  43 */     this.g = ☃;
/*  44 */     this.i = intSupplier.getAsInt();
/*  45 */     this.f = intSupplier;
/*  46 */     this.m = bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  51 */     if (this.k) {
/*  52 */       b.error("Profiler tick already started - missing endTick()?");
/*     */       
/*     */       return;
/*     */     } 
/*  56 */     this.k = true;
/*  57 */     this.j = "";
/*  58 */     this.c.clear();
/*  59 */     a("root");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  64 */     if (!this.k) {
/*  65 */       b.error("Profiler tick already ended - missing startTick()?");
/*     */       
/*     */       return;
/*     */     } 
/*  69 */     c();
/*  70 */     this.k = false;
/*     */     
/*  72 */     if (!this.j.isEmpty()) {
/*  73 */       b.error("Profiler tick ended before path was fully popped (remainder: '{}'). Mismatched push/pop?", new Supplier[] { () -> anv.b(this.j) });
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(String ☃) {
/*  79 */     if (!this.k) {
/*  80 */       b.error("Cannot push '{}' to profiler if profiler tick hasn't started - missing startTick()?", ☃);
/*     */       
/*     */       return;
/*     */     } 
/*  84 */     if (!this.j.isEmpty()) {
/*  85 */       this.j += '\036';
/*     */     }
/*  87 */     this.j += ☃;
/*  88 */     this.c.add(this.j);
/*  89 */     this.d.add(x.c());
/*  90 */     this.l = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Supplier<String> ☃) {
/*  95 */     a(☃.get());
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 100 */     if (!this.k) {
/* 101 */       b.error("Cannot pop from profiler if profiler tick hasn't started - missing startTick()?");
/*     */       return;
/*     */     } 
/* 104 */     if (this.d.isEmpty()) {
/* 105 */       b.error("Tried to pop one too many times! Mismatched push() and pop()?");
/*     */       return;
/*     */     } 
/* 108 */     long ☃ = x.c();
/* 109 */     long l1 = this.d.removeLong(this.d.size() - 1);
/* 110 */     this.c.remove(this.c.size() - 1);
/* 111 */     long l2 = ☃ - l1;
/*     */     
/* 113 */     a a1 = e();
/* 114 */     a.a(a1, a.a(a1) + l2);
/* 115 */     a.b(a1, a.b(a1) + 1L);
/*     */     
/* 117 */     if (this.m && l2 > a) {
/* 118 */       b.warn("Something's taking too long! '{}' took aprox {} ms", new Supplier[] { () -> anv.b(this.j), () -> Double.valueOf(☃ / 1000000.0D) });
/*     */     }
/*     */     
/* 121 */     this.j = this.c.isEmpty() ? "" : this.c.get(this.c.size() - 1);
/* 122 */     this.l = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(String ☃) {
/* 127 */     c();
/* 128 */     a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(Supplier<String> ☃) {
/* 133 */     c();
/* 134 */     a(☃);
/*     */   }
/*     */   
/*     */   private a e() {
/* 138 */     if (this.l == null) {
/* 139 */       this.l = this.e.computeIfAbsent(this.j, ☃ -> new a());
/*     */     }
/*     */     
/* 142 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(String ☃) {
/* 147 */     a.c(e()).addTo(☃, 1L);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(Supplier<String> ☃) {
/* 152 */     a.c(e()).addTo(☃.get(), 1L);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public anv d() {
/* 158 */     return new ans((Map)this.e, this.h, this.i, this.g.getAsLong(), this.f.getAsInt());
/*     */   }
/*     */   
/*     */   static class a implements anx {
/*     */     private long a;
/*     */     private long b;
/* 164 */     private Object2LongOpenHashMap<String> c = new Object2LongOpenHashMap();
/*     */ 
/*     */     
/*     */     public long a() {
/* 168 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public long b() {
/* 173 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public Object2LongMap<String> c() {
/* 178 */       return Object2LongMaps.unmodifiable((Object2LongMap)this.c);
/*     */     }
/*     */     
/*     */     private a() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */