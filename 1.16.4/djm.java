/*     */ import com.google.common.collect.HashBasedTable;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
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
/*     */ 
/*     */ 
/*     */ public class djm
/*     */   extends adt
/*     */ {
/*  25 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*  27 */   private Map<dkg, List<drt>> d = (Map<dkg, List<drt>>)ImmutableMap.of();
/*  28 */   private List<drt> e = (List<drt>)ImmutableList.of();
/*     */   
/*     */   public void a(Iterable<boq<?>> ☃) {
/*  31 */     Map<dkg, List<List<boq<?>>>> map = b(☃);
/*     */     
/*  33 */     Map<dkg, List<drt>> map1 = Maps.newHashMap();
/*  34 */     ImmutableList.Builder<drt> builder = ImmutableList.builder();
/*     */     
/*  36 */     map.forEach((dkg1, list) -> (List)☃.put(dkg1, (List)list.stream().map(drt::new).peek(builder::add).collect(ImmutableList.toImmutableList())));
/*     */ 
/*     */ 
/*     */     
/*  40 */     dkg.w.forEach((dkg1, list) -> (List)☃.put(dkg1, (List)list.stream().flatMap(()).collect(ImmutableList.toImmutableList())));
/*     */ 
/*     */ 
/*     */     
/*  44 */     this.d = (Map<dkg, List<drt>>)ImmutableMap.copyOf(map1);
/*  45 */     this.e = (List<drt>)builder.build();
/*     */   }
/*     */   
/*     */   private static Map<dkg, List<List<boq<?>>>> b(Iterable<boq<?>> ☃) {
/*  49 */     Map<dkg, List<List<boq<?>>>> map = Maps.newHashMap();
/*  50 */     HashBasedTable hashBasedTable = HashBasedTable.create();
/*     */     
/*  52 */     for (boq<?> boq : ☃) {
/*  53 */       if (boq.af_()) {
/*     */         continue;
/*     */       }
/*     */       
/*  57 */       dkg dkg = g(boq);
/*  58 */       String str = boq.d();
/*     */       
/*  60 */       if (str.isEmpty()) {
/*     */         
/*  62 */         ((List<ImmutableList>)map.computeIfAbsent(dkg, ☃ -> Lists.newArrayList())).add(ImmutableList.of(boq)); continue;
/*     */       } 
/*  64 */       List<boq<?>> list = (List<boq<?>>)hashBasedTable.get(dkg, str);
/*  65 */       if (list == null) {
/*  66 */         list = Lists.newArrayList();
/*  67 */         hashBasedTable.put(dkg, str, list);
/*  68 */         ((List<List<boq<?>>>)map.computeIfAbsent(dkg, ☃ -> Lists.newArrayList())).add(list);
/*     */       } 
/*  70 */       list.add(boq);
/*     */     } 
/*     */     
/*  73 */     return map;
/*     */   }
/*     */   
/*     */   private static dkg g(boq<?> ☃) {
/*  77 */     bot<?> bot = ☃.g();
/*  78 */     if (bot == bot.a) {
/*  79 */       bmb bmb = ☃.c();
/*  80 */       bks bks = bmb.b().q();
/*  81 */       if (bks == bks.b) {
/*  82 */         return dkg.b;
/*     */       }
/*  84 */       if (bks == bks.i || bks == bks.j) {
/*  85 */         return dkg.d;
/*     */       }
/*  87 */       if (bks == bks.d) {
/*  88 */         return dkg.c;
/*     */       }
/*  90 */       return dkg.e;
/*     */     } 
/*     */     
/*  93 */     if (bot == bot.b) {
/*  94 */       if (☃.c().b().s()) {
/*  95 */         return dkg.g;
/*     */       }
/*  97 */       if (☃.c().b() instanceof bkh) {
/*  98 */         return dkg.h;
/*     */       }
/* 100 */       return dkg.i;
/*     */     } 
/*     */     
/* 103 */     if (bot == bot.c) {
/* 104 */       if (☃.c().b() instanceof bkh) {
/* 105 */         return dkg.k;
/*     */       }
/* 107 */       return dkg.l;
/*     */     } 
/*     */     
/* 110 */     if (bot == bot.d) {
/* 111 */       return dkg.n;
/*     */     }
/*     */     
/* 114 */     if (bot == bot.f) {
/* 115 */       return dkg.o;
/*     */     }
/* 117 */     if (bot == bot.e) {
/* 118 */       return dkg.q;
/*     */     }
/* 120 */     if (bot == bot.g) {
/* 121 */       return dkg.p;
/*     */     }
/*     */     
/* 124 */     c.warn("Unknown recipe category: {}/{}", new Supplier[] { () -> gm.ad.b(☃.g()), ☃::f });
/* 125 */     return dkg.r;
/*     */   }
/*     */   
/*     */   public List<drt> b() {
/* 129 */     return this.e;
/*     */   }
/*     */   
/*     */   public List<drt> a(dkg ☃) {
/* 133 */     return this.d.getOrDefault(☃, Collections.emptyList());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */