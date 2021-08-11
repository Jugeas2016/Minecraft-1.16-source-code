/*     */ import com.google.common.base.Functions;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public class abw
/*     */   implements AutoCloseable
/*     */ {
/*     */   private final Set<aby> a;
/*  21 */   private Map<String, abu> b = (Map<String, abu>)ImmutableMap.of();
/*  22 */   private List<abu> c = (List<abu>)ImmutableList.of();
/*     */   private final abu.a d;
/*     */   
/*     */   public abw(abu.a ☃, aby... arrayOfAby) {
/*  26 */     this.d = ☃;
/*  27 */     this.a = (Set<aby>)ImmutableSet.copyOf((Object[])arrayOfAby);
/*     */   }
/*     */   
/*     */   public abw(aby... ☃) {
/*  31 */     this(abu::new, ☃);
/*     */   }
/*     */   
/*     */   public void a() {
/*  35 */     List<String> ☃ = (List<String>)this.c.stream().map(abu::e).collect(ImmutableList.toImmutableList());
/*  36 */     close();
/*  37 */     this.b = g();
/*  38 */     this.c = b(☃);
/*     */   }
/*     */   
/*     */   private Map<String, abu> g() {
/*  42 */     Map<String, abu> ☃ = Maps.newTreeMap();
/*  43 */     for (aby aby : this.a) {
/*  44 */       aby.a(abu1 -> (abu)☃.put(abu1.e(), abu1), this.d);
/*     */     }
/*  46 */     return (Map<String, abu>)ImmutableMap.copyOf(☃);
/*     */   }
/*     */   
/*     */   public void a(Collection<String> ☃) {
/*  50 */     this.c = b(☃);
/*     */   }
/*     */   
/*     */   private List<abu> b(Collection<String> ☃) {
/*  54 */     List<abu> list = c(☃).collect((Collector)Collectors.toList());
/*     */     
/*  56 */     for (abu abu : this.b.values()) {
/*     */       
/*  58 */       if (abu.f() && !list.contains(abu)) {
/*  59 */         abu.h().a(list, abu, (Function<abu, abu>)Functions.identity(), false);
/*     */       }
/*     */     } 
/*  62 */     return (List<abu>)ImmutableList.copyOf(list);
/*     */   }
/*     */   
/*     */   private Stream<abu> c(Collection<String> ☃) {
/*  66 */     return ☃.stream().map(this.b::get).filter(Objects::nonNull);
/*     */   }
/*     */   
/*     */   public Collection<String> b() {
/*  70 */     return this.b.keySet();
/*     */   }
/*     */   
/*     */   public Collection<abu> c() {
/*  74 */     return this.b.values();
/*     */   }
/*     */   
/*     */   public Collection<String> d() {
/*  78 */     return (Collection<String>)this.c.stream().map(abu::e).collect(ImmutableSet.toImmutableSet());
/*     */   }
/*     */   
/*     */   public Collection<abu> e() {
/*  82 */     return this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public abu a(String ☃) {
/*  87 */     return this.b.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*  92 */     this.b.values().forEach(abu::close);
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/*  96 */     return this.b.containsKey(☃);
/*     */   }
/*     */   
/*     */   public List<abj> f() {
/* 100 */     return (List<abj>)this.c.stream().map(abu::d).collect(ImmutableList.toImmutableList());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */