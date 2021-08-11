/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class bsy
/*     */   implements bsx.a
/*     */ {
/*     */   static {
/*  24 */     gm.a(gm.bb, "fixed", btd.e);
/*  25 */     gm.a(gm.bb, "multi_noise", bth.f);
/*  26 */     gm.a(gm.bb, "checkerboard", btc.e);
/*  27 */     gm.a(gm.bb, "vanilla_layered", btj.e);
/*  28 */     gm.a(gm.bb, "the_end", btk.e);
/*     */   }
/*     */   
/*  31 */   public static final Codec<bsy> a = gm.bb.dispatchStable(bsy::a, Function.identity());
/*     */   
/*  33 */   protected final Map<cla<?>, Boolean> b = Maps.newHashMap();
/*  34 */   protected final Set<ceh> c = Sets.newHashSet();
/*     */   protected final List<bsv> d;
/*     */   
/*     */   protected bsy(Stream<Supplier<bsv>> ☃) {
/*  38 */     this((List<bsv>)☃.map(Supplier::get).collect(ImmutableList.toImmutableList()));
/*     */   }
/*     */   
/*     */   protected bsy(List<bsv> ☃) {
/*  42 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<bsv> b() {
/*  50 */     return this.d;
/*     */   }
/*     */   
/*     */   public Set<bsv> a(int ☃, int i, int j, int k) {
/*  54 */     int m = ☃ - k >> 2;
/*  55 */     int n = i - k >> 2;
/*  56 */     int i1 = j - k >> 2;
/*  57 */     int i2 = ☃ + k >> 2;
/*  58 */     int i3 = i + k >> 2;
/*  59 */     int i4 = j + k >> 2;
/*     */     
/*  61 */     int i5 = i2 - m + 1;
/*  62 */     int i6 = i3 - n + 1;
/*  63 */     int i7 = i4 - i1 + 1;
/*     */     
/*  65 */     Set<bsv> set = Sets.newHashSet();
/*     */     
/*  67 */     for (int i8 = 0; i8 < i7; i8++) {
/*  68 */       for (int i9 = 0; i9 < i5; i9++) {
/*  69 */         for (int i10 = 0; i10 < i6; i10++) {
/*  70 */           int i11 = m + i9;
/*  71 */           int i12 = n + i10;
/*  72 */           int i13 = i1 + i8;
/*  73 */           set.add(b(i11, i12, i13));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  78 */     return set;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public fx a(int ☃, int i, int j, int k, Predicate<bsv> predicate, Random random) {
/*  83 */     return a(☃, i, j, k, 1, predicate, random, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public fx a(int ☃, int i, int j, int k, int m, Predicate<bsv> predicate, Random random, boolean bool) {
/*  95 */     int n = ☃ >> 2;
/*  96 */     int i1 = j >> 2;
/*  97 */     int i2 = k >> 2;
/*     */     
/*  99 */     int i3 = i >> 2;
/*     */     
/* 101 */     fx fx = null;
/* 102 */     int i4 = 0;
/*     */     
/* 104 */     int i5 = bool ? 0 : i2; int i6;
/* 105 */     for (i6 = i5; i6 <= i2; i6 += m) {
/* 106 */       int i7; for (i7 = -i6; i7 <= i6; i7 += m) {
/* 107 */         boolean bool1 = (Math.abs(i7) == i6); int i8;
/* 108 */         for (i8 = -i6; i8 <= i6; i8 += m) {
/* 109 */           if (bool) {
/*     */             
/* 111 */             boolean bool2 = (Math.abs(i8) == i6);
/* 112 */             if (!bool2 && !bool1) {
/*     */               continue;
/*     */             }
/*     */           } 
/*     */           
/* 117 */           int i9 = n + i8;
/* 118 */           int i10 = i1 + i7;
/* 119 */           if (predicate.test(b(i9, i3, i10))) {
/* 120 */             if (fx == null || random.nextInt(i4 + 1) == 0) {
/* 121 */               fx = new fx(i9 << 2, i, i10 << 2);
/* 122 */               if (bool) {
/* 123 */                 return fx;
/*     */               }
/*     */             } 
/* 126 */             i4++;
/*     */           } 
/*     */           continue;
/*     */         } 
/*     */       } 
/*     */     } 
/* 132 */     return fx;
/*     */   }
/*     */   
/*     */   public boolean a(cla<?> ☃) {
/* 136 */     return ((Boolean)this.b.computeIfAbsent(☃, ☃ -> Boolean.valueOf(this.d.stream().anyMatch(())))).booleanValue();
/*     */   }
/*     */   
/*     */   public Set<ceh> c() {
/* 140 */     if (this.c.isEmpty()) {
/* 141 */       for (bsv ☃ : this.d) {
/* 142 */         this.c.add(☃.e().e().a());
/*     */       }
/*     */     }
/* 145 */     return this.c;
/*     */   }
/*     */   
/*     */   protected abstract Codec<? extends bsy> a();
/*     */   
/*     */   public abstract bsy a(long paramLong);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */