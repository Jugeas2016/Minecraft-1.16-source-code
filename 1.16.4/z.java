/*     */ import com.google.common.base.Function;
/*     */ import com.google.common.base.Functions;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class z
/*     */ {
/*  18 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  20 */   private final Map<vk, y> b = Maps.newHashMap();
/*  21 */   private final Set<y> c = Sets.newLinkedHashSet();
/*  22 */   private final Set<y> d = Sets.newLinkedHashSet();
/*     */   private a e;
/*     */   
/*     */   private void a(y ☃) {
/*  26 */     for (y y1 : ☃.e()) {
/*  27 */       a(y1);
/*     */     }
/*     */     
/*  30 */     a.info("Forgot about advancement {}", ☃.h());
/*  31 */     this.b.remove(☃.h());
/*  32 */     if (☃.b() == null) {
/*  33 */       this.c.remove(☃);
/*  34 */       if (this.e != null) {
/*  35 */         this.e.b(☃);
/*     */       }
/*     */     } else {
/*  38 */       this.d.remove(☃);
/*  39 */       if (this.e != null) {
/*  40 */         this.e.d(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Set<vk> ☃) {
/*  46 */     for (vk vk : ☃) {
/*  47 */       y y = this.b.get(vk);
/*  48 */       if (y == null) {
/*  49 */         a.warn("Told to remove advancement {} but I don't know what that is", vk); continue;
/*     */       } 
/*  51 */       a(y);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(Map<vk, y.a> ☃) {
/*  57 */     Function function = Functions.forMap(this.b, null);
/*     */     
/*  59 */     while (!☃.isEmpty()) {
/*  60 */       boolean bool = false; Iterator<Map.Entry<vk, y.a>> iterator;
/*  61 */       for (iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) {
/*  62 */         Map.Entry<vk, y.a> entry = iterator.next();
/*  63 */         vk vk = entry.getKey();
/*  64 */         y.a a1 = entry.getValue();
/*  65 */         if (a1.a((Function<vk, y>)function)) {
/*  66 */           y y = a1.b(vk);
/*  67 */           this.b.put(vk, y);
/*  68 */           bool = true;
/*  69 */           iterator.remove();
/*     */           
/*  71 */           if (y.b() == null) {
/*  72 */             this.c.add(y);
/*  73 */             if (this.e != null)
/*  74 */               this.e.a(y); 
/*     */             continue;
/*     */           } 
/*  77 */           this.d.add(y);
/*  78 */           if (this.e != null) {
/*  79 */             this.e.c(y);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/*  84 */       if (!bool) {
/*  85 */         for (iterator = ☃.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<vk, y.a> entry = iterator.next();
/*  86 */           a.error("Couldn't load advancement {}: {}", entry.getKey(), entry.getValue()); }
/*     */ 
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  92 */     a.info("Loaded {} advancements", Integer.valueOf(this.b.size()));
/*     */   }
/*     */   
/*     */   public void a() {
/*  96 */     this.b.clear();
/*  97 */     this.c.clear();
/*  98 */     this.d.clear();
/*  99 */     if (this.e != null) {
/* 100 */       this.e.a();
/*     */     }
/*     */   }
/*     */   
/*     */   public Iterable<y> b() {
/* 105 */     return this.c;
/*     */   }
/*     */   
/*     */   public Collection<y> c() {
/* 109 */     return this.b.values();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public y a(vk ☃) {
/* 114 */     return this.b.get(☃);
/*     */   }
/*     */   
/*     */   public void a(@Nullable a ☃) {
/* 118 */     this.e = ☃;
/* 119 */     if (☃ != null) {
/* 120 */       for (y y : this.c) {
/* 121 */         ☃.a(y);
/*     */       }
/* 123 */       for (y y : this.d)
/* 124 */         ☃.c(y); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static interface a {
/*     */     void a(y param1y);
/*     */     
/*     */     void b(y param1y);
/*     */     
/*     */     void c(y param1y);
/*     */     
/*     */     void d(y param1y);
/*     */     
/*     */     void a();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\z.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */