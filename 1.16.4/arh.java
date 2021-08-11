/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArraySet;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class arh
/*     */ {
/*     */   private final arg a;
/*  23 */   private final Map<arj.a, Set<arj>> b = Maps.newEnumMap(arj.a.class);
/*  24 */   private final Map<UUID, arj> c = (Map<UUID, arj>)new Object2ObjectArrayMap();
/*  25 */   private final Set<arj> d = (Set<arj>)new ObjectArraySet();
/*     */   private double e;
/*     */   private boolean f = true;
/*     */   private double g;
/*     */   private final Consumer<arh> h;
/*     */   
/*     */   public arh(arg ☃, Consumer<arh> consumer) {
/*  32 */     this.a = ☃;
/*  33 */     this.h = consumer;
/*  34 */     this.e = ☃.a();
/*     */   }
/*     */   
/*     */   public arg a() {
/*  38 */     return this.a;
/*     */   }
/*     */   
/*     */   public double b() {
/*  42 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/*  46 */     if (☃ == this.e) {
/*     */       return;
/*     */     }
/*  49 */     this.e = ☃;
/*  50 */     d();
/*     */   }
/*     */   
/*     */   public Set<arj> a(arj.a ☃) {
/*  54 */     return this.b.computeIfAbsent(☃, ☃ -> Sets.newHashSet());
/*     */   }
/*     */   
/*     */   public Set<arj> c() {
/*  58 */     return (Set<arj>)ImmutableSet.copyOf(this.c.values());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public arj a(UUID ☃) {
/*  63 */     return this.c.get(☃);
/*     */   }
/*     */   
/*     */   public boolean a(arj ☃) {
/*  67 */     return (this.c.get(☃.a()) != null);
/*     */   }
/*     */   
/*     */   private void e(arj ☃) {
/*  71 */     arj arj1 = this.c.putIfAbsent(☃.a(), ☃);
/*  72 */     if (arj1 != null) {
/*  73 */       throw new IllegalArgumentException("Modifier is already applied on this attribute!");
/*     */     }
/*     */     
/*  76 */     a(☃.c()).add(☃);
/*  77 */     d();
/*     */   }
/*     */   
/*     */   public void b(arj ☃) {
/*  81 */     e(☃);
/*     */   }
/*     */   
/*     */   public void c(arj ☃) {
/*  85 */     e(☃);
/*  86 */     this.d.add(☃);
/*     */   }
/*     */   
/*     */   protected void d() {
/*  90 */     this.f = true;
/*  91 */     this.h.accept(this);
/*     */   }
/*     */   
/*     */   public void d(arj ☃) {
/*  95 */     a(☃.c()).remove(☃);
/*  96 */     this.c.remove(☃.a());
/*  97 */     this.d.remove(☃);
/*  98 */     d();
/*     */   }
/*     */   
/*     */   public void b(UUID ☃) {
/* 102 */     arj arj = a(☃);
/* 103 */     if (arj != null) {
/* 104 */       d(arj);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c(UUID ☃) {
/* 109 */     arj arj = a(☃);
/* 110 */     if (arj != null && this.d.contains(arj)) {
/* 111 */       d(arj);
/* 112 */       return true;
/*     */     } 
/* 114 */     return false;
/*     */   }
/*     */   
/*     */   public void e() {
/* 118 */     for (arj ☃ : c()) {
/* 119 */       d(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public double f() {
/* 124 */     if (this.f) {
/* 125 */       this.g = h();
/* 126 */       this.f = false;
/*     */     } 
/*     */     
/* 129 */     return this.g;
/*     */   }
/*     */   
/*     */   private double h() {
/* 133 */     double ☃ = b();
/*     */     
/* 135 */     for (arj arj : b(arj.a.a)) {
/* 136 */       ☃ += arj.d();
/*     */     }
/*     */     
/* 139 */     double d1 = ☃;
/*     */     
/* 141 */     for (arj arj : b(arj.a.b)) {
/* 142 */       d1 += ☃ * arj.d();
/*     */     }
/*     */     
/* 145 */     for (arj arj : b(arj.a.c)) {
/* 146 */       d1 *= 1.0D + arj.d();
/*     */     }
/*     */     
/* 149 */     return this.a.a(d1);
/*     */   }
/*     */   
/*     */   private Collection<arj> b(arj.a ☃) {
/* 153 */     return this.b.getOrDefault(☃, Collections.emptySet());
/*     */   }
/*     */   
/*     */   public void a(arh ☃) {
/* 157 */     this.e = ☃.e;
/*     */     
/* 159 */     this.c.clear();
/* 160 */     this.c.putAll(☃.c);
/*     */     
/* 162 */     this.d.clear();
/* 163 */     this.d.addAll(☃.d);
/*     */     
/* 165 */     this.b.clear();
/* 166 */     ☃.b.forEach((☃, set) -> a(☃).addAll(set));
/*     */ 
/*     */     
/* 169 */     d();
/*     */   }
/*     */   
/*     */   public md g() {
/* 173 */     md ☃ = new md();
/*     */     
/* 175 */     ☃.a("Name", gm.af.b(this.a).toString());
/* 176 */     ☃.a("Base", this.e);
/*     */     
/* 178 */     if (!this.d.isEmpty()) {
/* 179 */       mj mj = new mj();
/* 180 */       for (arj arj : this.d) {
/* 181 */         mj.add(arj.e());
/*     */       }
/* 183 */       ☃.a("Modifiers", mj);
/*     */     } 
/* 185 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(md ☃) {
/* 189 */     this.e = ☃.k("Base");
/* 190 */     if (☃.c("Modifiers", 9)) {
/* 191 */       mj mj = ☃.d("Modifiers", 10);
/*     */       
/* 193 */       for (int i = 0; i < mj.size(); i++) {
/* 194 */         arj arj = arj.a(mj.a(i));
/* 195 */         if (arj != null) {
/*     */ 
/*     */           
/* 198 */           this.c.put(arj.a(), arj);
/* 199 */           a(arj.c()).add(arj);
/* 200 */           this.d.add(arj);
/*     */         } 
/*     */       } 
/* 203 */     }  d();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */