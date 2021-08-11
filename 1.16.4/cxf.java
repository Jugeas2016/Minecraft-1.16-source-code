/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class cxf
/*     */ {
/*  25 */   private final cxb[] a = new cxb[32];
/*     */   
/*     */   private final int b;
/*     */   
/*     */   private final cxc c;
/*  30 */   private final cwy d = new cwy();
/*     */   
/*     */   public cxf(cxc ☃, int i) {
/*  33 */     this.c = ☃;
/*  34 */     this.b = i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cxd a(bsi ☃, aqn aqn1, Set<fx> set, float f1, int i, float f2) {
/*  39 */     this.d.a();
/*  40 */     this.c.a(☃, aqn1);
/*  41 */     cxb cxb1 = this.c.b();
/*     */ 
/*     */     
/*  44 */     Map<cxh, fx> map = (Map<cxh, fx>)set.stream().collect(Collectors.toMap(☃ -> this.c.a(☃.u(), ☃.v(), ☃.w()), Function.identity()));
/*  45 */     cxd cxd = a(cxb1, map, f1, i, f2);
/*     */     
/*  47 */     this.c.a();
/*  48 */     return cxd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private cxd a(cxb ☃, Map<cxh, fx> map, float f1, int i, float f2) {
/*  57 */     Set<cxh> set1 = map.keySet();
/*     */     
/*  59 */     ☃.e = 0.0F;
/*  60 */     ☃.f = a(☃, set1);
/*  61 */     ☃.g = ☃.f;
/*     */     
/*  63 */     this.d.a();
/*  64 */     this.d.a(☃);
/*  65 */     ImmutableSet immutableSet = ImmutableSet.of();
/*     */ 
/*     */     
/*  68 */     int j = 0;
/*     */     
/*  70 */     Set<cxh> set2 = Sets.newHashSetWithExpectedSize(set1.size());
/*     */     
/*  72 */     int k = (int)(this.b * f2);
/*  73 */     while (!this.d.e() && ++j < k) {
/*  74 */       cxb cxb1 = this.d.c();
/*  75 */       cxb1.i = true;
/*     */ 
/*     */       
/*  78 */       for (cxh cxh : set1) {
/*  79 */         if (cxb1.c(cxh) <= i) {
/*  80 */           cxh.e();
/*  81 */           set2.add(cxh);
/*     */         } 
/*     */       } 
/*     */       
/*  85 */       if (!set2.isEmpty()) {
/*     */         break;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  93 */       if (cxb1.a(☃) >= f1) {
/*     */         continue;
/*     */       }
/*     */       
/*  97 */       int m = this.c.a(this.a, cxb1);
/*  98 */       for (int n = 0; n < m; n++) {
/*  99 */         cxb cxb2 = this.a[n];
/*     */         
/* 101 */         float f3 = cxb1.a(cxb2);
/* 102 */         cxb1.j += f3;
/*     */         
/* 104 */         float f4 = cxb1.e + f3 + cxb2.k;
/* 105 */         if (cxb2.j < f1 && (!cxb2.c() || f4 < cxb2.e)) {
/* 106 */           cxb2.h = cxb1;
/* 107 */           cxb2.e = f4;
/* 108 */           cxb2.f = a(cxb2, set1) * 1.5F;
/*     */           
/* 110 */           if (cxb2.c()) {
/* 111 */             this.d.a(cxb2, cxb2.e + cxb2.f);
/*     */           } else {
/* 113 */             cxb2.g = cxb2.e + cxb2.f;
/* 114 */             this.d.a(cxb2);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     Optional<cxd> optional = !set2.isEmpty() ? set2.stream().map(cxh1 -> a(cxh1.d(), (fx)☃.get(cxh1), true)).min(Comparator.comparingInt(cxd::e)) : set1.stream().map(cxh1 -> a(cxh1.d(), (fx)☃.get(cxh1), false)).min(Comparator.<cxd>comparingDouble(cxd::n).thenComparingInt(cxd::e));
/*     */     
/* 128 */     if (!optional.isPresent()) {
/* 129 */       return null;
/*     */     }
/* 131 */     cxd cxd = optional.get();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     return cxd;
/*     */   }
/*     */ 
/*     */   
/*     */   private float a(cxb ☃, Set<cxh> set) {
/* 141 */     float f = Float.MAX_VALUE;
/* 142 */     for (cxh cxh : set) {
/* 143 */       float f1 = ☃.a(cxh);
/* 144 */       cxh.a(f1, ☃);
/* 145 */       f = Math.min(f1, f);
/*     */     } 
/* 147 */     return f;
/*     */   }
/*     */   
/*     */   private cxd a(cxb ☃, fx fx1, boolean bool) {
/* 151 */     List<cxb> list = Lists.newArrayList();
/* 152 */     cxb cxb1 = ☃;
/* 153 */     list.add(0, cxb1);
/* 154 */     while (cxb1.h != null) {
/* 155 */       cxb1 = cxb1.h;
/* 156 */       list.add(0, cxb1);
/*     */     } 
/* 158 */     return new cxd(list, fx1, bool);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */