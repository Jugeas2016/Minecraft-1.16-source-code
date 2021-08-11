/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.Executor;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.util.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class acm
/*     */   implements acf
/*     */ {
/*  28 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  30 */   private final Map<String, acb> b = Maps.newHashMap();
/*  31 */   private final List<acc> c = Lists.newArrayList();
/*  32 */   private final List<acc> d = Lists.newArrayList();
/*  33 */   private final Set<String> e = Sets.newLinkedHashSet();
/*  34 */   private final List<abj> f = Lists.newArrayList();
/*     */   private final abk g;
/*     */   
/*     */   public acm(abk ☃) {
/*  38 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public void a(abj ☃) {
/*  42 */     this.f.add(☃);
/*  43 */     for (String str : ☃.a(this.g)) {
/*  44 */       this.e.add(str);
/*  45 */       acb acb = this.b.get(str);
/*  46 */       if (acb == null) {
/*  47 */         acb = new acb(this.g, str);
/*  48 */         this.b.put(str, acb);
/*     */       } 
/*  50 */       acb.a(☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> a() {
/*  56 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public acg a(vk ☃) throws IOException {
/*  61 */     ach ach = this.b.get(☃.b());
/*     */     
/*  63 */     if (ach != null) {
/*  64 */       return ach.a(☃);
/*     */     }
/*     */     
/*  67 */     throw new FileNotFoundException(☃.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(vk ☃) {
/*  72 */     ach ach = this.b.get(☃.b());
/*     */     
/*  74 */     if (ach != null) {
/*  75 */       return ach.b(☃);
/*     */     }
/*     */     
/*  78 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<acg> c(vk ☃) throws IOException {
/*  83 */     ach ach = this.b.get(☃.b());
/*     */     
/*  85 */     if (ach != null) {
/*  86 */       return ach.c(☃);
/*     */     }
/*     */     
/*  89 */     throw new FileNotFoundException(☃.toString());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> a(String ☃, Predicate<String> predicate) {
/*  94 */     Set<vk> set = Sets.newHashSet();
/*     */     
/*  96 */     for (acb acb : this.b.values()) {
/*  97 */       set.addAll(acb.a(☃, predicate));
/*     */     }
/*     */     
/* 100 */     List<vk> list = Lists.newArrayList(set);
/* 101 */     Collections.sort(list);
/* 102 */     return list;
/*     */   }
/*     */   
/*     */   private void c() {
/* 106 */     this.b.clear();
/* 107 */     this.e.clear();
/* 108 */     this.f.forEach(abj::close);
/* 109 */     this.f.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/* 114 */     c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(acc ☃) {
/* 119 */     this.c.add(☃);
/* 120 */     this.d.add(☃);
/*     */   }
/*     */   
/*     */   protected ace b(Executor ☃, Executor executor1, List<acc> list, CompletableFuture<afx> completableFuture) {
/*     */     ace<Void> ace;
/* 125 */     if (a.isDebugEnabled()) {
/* 126 */       ace = new acd(this, Lists.newArrayList(list), ☃, executor1, completableFuture);
/*     */     } else {
/* 128 */       ace = acl.a(this, Lists.newArrayList(list), ☃, executor1, completableFuture);
/*     */     } 
/* 130 */     this.d.clear();
/* 131 */     return ace;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ace a(Executor ☃, Executor executor1, CompletableFuture<afx> completableFuture, List<abj> list) {
/* 141 */     c();
/*     */     
/* 143 */     a.info("Reloading ResourceManager: {}", new Supplier[] { () -> (String)☃.stream().map(abj::a).collect(Collectors.joining(", ")) });
/*     */     
/* 145 */     for (abj abj : list) {
/*     */       try {
/* 147 */         a(abj);
/* 148 */       } catch (Exception exception) {
/* 149 */         a.error("Failed to add resource pack {}", abj.a(), exception);
/* 150 */         return new a(new b(abj, exception));
/*     */       } 
/*     */     } 
/*     */     
/* 154 */     return b(☃, executor1, this.c, completableFuture);
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<abj> b() {
/* 159 */     return this.f.stream();
/*     */   }
/*     */   
/*     */   public static class b extends RuntimeException {
/*     */     private final abj a;
/*     */     
/*     */     public b(abj ☃, Throwable throwable) {
/* 166 */       super(☃.a(), throwable);
/* 167 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public abj a() {
/* 171 */       return this.a;
/*     */     }
/*     */   }
/*     */   
/*     */   static class a implements ace {
/*     */     private final acm.b a;
/*     */     private final CompletableFuture<afx> b;
/*     */     
/*     */     public a(acm.b ☃) {
/* 180 */       this.a = ☃;
/* 181 */       this.b = new CompletableFuture<>();
/* 182 */       this.b.completeExceptionally(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public CompletableFuture<afx> a() {
/* 187 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public float b() {
/* 192 */       return 0.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c() {
/* 197 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean d() {
/* 202 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 207 */       throw this.a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */