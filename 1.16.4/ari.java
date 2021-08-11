/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Multimap;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class ari
/*     */ {
/*  22 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  24 */   private final Map<arg, arh> b = Maps.newHashMap();
/*  25 */   private final Set<arh> c = Sets.newHashSet();
/*     */   private final ark d;
/*     */   
/*     */   public ari(ark ☃) {
/*  29 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   private void a(arh ☃) {
/*  33 */     if (☃.a().b()) {
/*  34 */       this.c.add(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public Set<arh> a() {
/*  39 */     return this.c;
/*     */   }
/*     */   
/*     */   public Collection<arh> b() {
/*  43 */     return (Collection<arh>)this.b.values().stream().filter(☃ -> ☃.a().b()).collect(Collectors.toList());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public arh a(arg ☃) {
/*  48 */     return this.b.computeIfAbsent(☃, ☃ -> this.d.a(this::a, ☃));
/*     */   }
/*     */   
/*     */   public boolean b(arg ☃) {
/*  52 */     return (this.b.get(☃) != null || this.d.c(☃));
/*     */   }
/*     */   
/*     */   public boolean a(arg ☃, UUID uUID) {
/*  56 */     arh arh = this.b.get(☃);
/*  57 */     return (arh != null) ? ((arh.a(uUID) != null)) : this.d.b(☃, uUID);
/*     */   }
/*     */   
/*     */   public double c(arg ☃) {
/*  61 */     arh arh = this.b.get(☃);
/*  62 */     return (arh != null) ? arh.f() : this.d.a(☃);
/*     */   }
/*     */   
/*     */   public double d(arg ☃) {
/*  66 */     arh arh = this.b.get(☃);
/*  67 */     return (arh != null) ? arh.b() : this.d.b(☃);
/*     */   }
/*     */   
/*     */   public double b(arg ☃, UUID uUID) {
/*  71 */     arh arh = this.b.get(☃);
/*  72 */     return (arh != null) ? arh.a(uUID).d() : this.d.a(☃, uUID);
/*     */   }
/*     */   
/*     */   public void a(Multimap<arg, arj> ☃) {
/*  76 */     ☃.asMap().forEach((☃, collection) -> {
/*     */           arh arh = this.b.get(☃);
/*     */           if (arh != null) {
/*     */             collection.forEach(arh::d);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(Multimap<arg, arj> ☃) {
/*  86 */     ☃.forEach((☃, arj1) -> {
/*     */           arh arh = a(☃);
/*     */           if (arh != null) {
/*     */             arh.d(arj1);
/*     */             arh.b(arj1);
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ari ☃) {
/*  97 */     ☃.b.values().forEach(☃ -> {
/*     */           arh arh1 = a(☃.a());
/*     */           if (arh1 != null) {
/*     */             arh1.a(☃);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public mj c() {
/* 106 */     mj ☃ = new mj();
/* 107 */     for (arh arh : this.b.values()) {
/* 108 */       ☃.add(arh.g());
/*     */     }
/* 110 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(mj ☃) {
/* 114 */     for (int i = 0; i < ☃.size(); i++) {
/* 115 */       md md = ☃.a(i);
/* 116 */       String str = md.l("Name");
/* 117 */       x.a(gm.af.b(vk.a(str)), arg1 -> {
/*     */             arh arh = a(arg1);
/*     */             if (arh != null)
/*     */               arh.a(☃); 
/*     */           }() -> a.warn("Ignoring unknown attribute '{}'", ☃));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ari.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */