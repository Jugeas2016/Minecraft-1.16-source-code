/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntCollection;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public class dmw
/*     */   implements AutoCloseable
/*     */ {
/*  27 */   private static final dna a = new dna();
/*     */   
/*     */   private static final dea b = () -> 4.0F;
/*  30 */   private static final Random c = new Random();
/*     */   
/*     */   private final ekd d;
/*     */   
/*     */   private final vk e;
/*     */   private dmz f;
/*     */   private dmz g;
/*  37 */   private final List<deb> h = Lists.newArrayList();
/*  38 */   private final Int2ObjectMap<dmz> i = (Int2ObjectMap<dmz>)new Int2ObjectOpenHashMap();
/*  39 */   private final Int2ObjectMap<dea> j = (Int2ObjectMap<dea>)new Int2ObjectOpenHashMap();
/*  40 */   private final Int2ObjectMap<IntList> k = (Int2ObjectMap<IntList>)new Int2ObjectOpenHashMap();
/*  41 */   private final List<dmx> l = Lists.newArrayList();
/*     */   
/*     */   public dmw(ekd ☃, vk vk1) {
/*  44 */     this.d = ☃;
/*  45 */     this.e = vk1;
/*     */   }
/*     */   
/*     */   public void a(List<deb> ☃) {
/*  49 */     b();
/*  50 */     c();
/*     */     
/*  52 */     this.i.clear();
/*  53 */     this.j.clear();
/*  54 */     this.k.clear();
/*     */     
/*  56 */     this.f = a(dnb.a);
/*  57 */     this.g = a(dnc.a);
/*     */     
/*  59 */     IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
/*  60 */     for (deb deb : ☃) {
/*  61 */       intOpenHashSet.addAll((IntCollection)deb.a());
/*     */     }
/*     */     
/*  64 */     Set<deb> set = Sets.newHashSet();
/*  65 */     intOpenHashSet.forEach(i -> {
/*     */           for (deb deb : ☃) {
/*     */             dea dea1 = (i == 32) ? b : deb.a(i);
/*     */             
/*     */             if (dea1 != null) {
/*     */               set.add(deb);
/*     */               if (dea1 != dnb.a) {
/*     */                 ((IntList)this.k.computeIfAbsent(afm.f(dea1.a(false)), ())).add(i);
/*     */               }
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         });
/*  78 */     ☃.stream().filter(set::contains).forEach(this.h::add);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*  83 */     b();
/*  84 */     c();
/*     */   }
/*     */   
/*     */   private void b() {
/*  88 */     for (deb ☃ : this.h) {
/*  89 */       ☃.close();
/*     */     }
/*  91 */     this.h.clear();
/*     */   }
/*     */   
/*     */   private void c() {
/*  95 */     for (dmx ☃ : this.l) {
/*  96 */       ☃.close();
/*     */     }
/*  98 */     this.l.clear();
/*     */   }
/*     */   
/*     */   public dea a(int ☃) {
/* 102 */     return (dea)this.j.computeIfAbsent(☃, ☃ -> (☃ == 32) ? b : c(☃));
/*     */   }
/*     */   
/*     */   private dec c(int ☃) {
/* 106 */     for (deb deb : this.h) {
/* 107 */       dec dec = deb.a(☃);
/* 108 */       if (dec != null) {
/* 109 */         return dec;
/*     */       }
/*     */     } 
/*     */     
/* 113 */     return dnb.a;
/*     */   }
/*     */   
/*     */   public dmz b(int ☃) {
/* 117 */     return (dmz)this.i.computeIfAbsent(☃, ☃ -> (☃ == 32) ? a : a(c(☃)));
/*     */   }
/*     */   
/*     */   private dmz a(dec ☃) {
/* 121 */     for (dmx dmx1 : this.l) {
/* 122 */       dmz dmz2 = dmx1.a(☃);
/* 123 */       if (dmz2 != null) {
/* 124 */         return dmz2;
/*     */       }
/*     */     } 
/*     */     
/* 128 */     dmx dmx = new dmx(new vk(this.e.b(), this.e.a() + "/" + this.l.size()), ☃.f());
/* 129 */     this.l.add(dmx);
/* 130 */     this.d.a(dmx.a(), dmx);
/* 131 */     dmz dmz1 = dmx.a(☃);
/*     */     
/* 133 */     return (dmz1 == null) ? this.f : dmz1;
/*     */   }
/*     */   
/*     */   public dmz a(dea ☃) {
/* 137 */     IntList intList = (IntList)this.k.get(afm.f(☃.a(false)));
/* 138 */     if (intList != null && !intList.isEmpty()) {
/* 139 */       return b(intList.getInt(c.nextInt(intList.size())));
/*     */     }
/* 141 */     return this.f;
/*     */   }
/*     */   
/*     */   public dmz a() {
/* 145 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */