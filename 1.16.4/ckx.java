/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import com.google.common.cache.CacheLoader;
/*     */ import com.google.common.cache.LoadingCache;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function5;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.IntStream;
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
/*     */ 
/*     */ 
/*     */ public class ckx
/*     */   extends cjl<cmv>
/*     */ {
/*  34 */   private static final LoadingCache<Long, List<a>> a = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new b());
/*     */   
/*     */   public ckx(Codec<cmv> ☃) {
/*  37 */     super(☃);
/*     */   }
/*     */   
/*     */   public static List<a> a(bsr ☃) {
/*  41 */     Random random = new Random(☃.C());
/*  42 */     long l = random.nextLong() & 0xFFFFL;
/*  43 */     return (List<a>)a.getUnchecked(Long.valueOf(l));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmv cmv1) {
/*  48 */     List<a> list = cmv1.c();
/*  49 */     if (list.isEmpty()) {
/*  50 */       list = a(☃);
/*     */     }
/*     */     
/*  53 */     for (a a : list) {
/*  54 */       if (a.a(fx1)) {
/*  55 */         a(☃, random, cmv1, a);
/*     */       }
/*     */     } 
/*     */     
/*  59 */     return true;
/*     */   }
/*     */   
/*     */   private void a(bsk ☃, Random random, cmv cmv1, a a1) {
/*  63 */     int i = a1.c();
/*  64 */     for (fx fx : fx.a(new fx(a1.a() - i, 0, a1.b() - i), new fx(a1.a() + i, a1.d() + 10, a1.b() + i))) {
/*  65 */       if (fx.a(a1.a(), fx.v(), a1.b(), false) <= (i * i + 1) && fx.v() < a1.d()) {
/*  66 */         a(☃, fx, bup.bK.n()); continue;
/*  67 */       }  if (fx.v() > 65) {
/*  68 */         a(☃, fx, bup.a.n());
/*     */       }
/*     */     } 
/*     */     
/*  72 */     if (a1.e()) {
/*  73 */       int j = -2;
/*  74 */       int k = 2;
/*  75 */       int m = 3;
/*     */       
/*  77 */       fx.a a2 = new fx.a();
/*  78 */       for (int n = -2; n <= 2; n++) {
/*  79 */         for (int i1 = -2; i1 <= 2; i1++) {
/*  80 */           for (int i2 = 0; i2 <= 3; i2++) {
/*  81 */             boolean bool1 = (afm.a(n) == 2);
/*  82 */             boolean bool2 = (afm.a(i1) == 2);
/*  83 */             boolean bool3 = (i2 == 3);
/*     */             
/*  85 */             if (bool1 || bool2 || bool3) {
/*  86 */               boolean bool4 = (n == -2 || n == 2 || bool3);
/*  87 */               boolean bool5 = (i1 == -2 || i1 == 2 || bool3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  93 */               ceh ceh = bup.dH.n().a(bxq.a, Boolean.valueOf((bool4 && i1 != -2))).a(bxq.c, Boolean.valueOf((bool4 && i1 != 2))).a(bxq.d, Boolean.valueOf((bool5 && n != -2))).a(bxq.b, Boolean.valueOf((bool5 && n != 2)));
/*     */               
/*  95 */               a(☃, a2.d(a1.a() + n, a1.d() + i2, a1.b() + i1), ceh);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 102 */     bbq bbq = aqe.s.a(☃.E());
/* 103 */     bbq.a(cmv1.d());
/* 104 */     bbq.m(cmv1.b());
/* 105 */     bbq.b(a1.a() + 0.5D, (a1.d() + 1), a1.b() + 0.5D, random.nextFloat() * 360.0F, 0.0F);
/* 106 */     ☃.c(bbq);
/* 107 */     a(☃, new fx(a1.a(), a1.d(), a1.b()), bup.z.n());
/*     */   }
/*     */   
/*     */   public static class a { static {
/* 111 */       a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("centerX").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("centerZ").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("radius").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("height").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.BOOL.fieldOf("guarded").orElse(Boolean.valueOf(false)).forGetter(())).apply((Applicative)☃, a::new));
/*     */     }
/*     */ 
/*     */     
/*     */     public static final Codec<a> a;
/*     */     
/*     */     private final int b;
/*     */     
/*     */     private final int c;
/*     */     
/*     */     private final int d;
/*     */     private final int e;
/*     */     private final boolean f;
/*     */     private final dci g;
/*     */     
/*     */     public a(int ☃, int i, int j, int k, boolean bool) {
/* 127 */       this.b = ☃;
/* 128 */       this.c = i;
/* 129 */       this.d = j;
/* 130 */       this.e = k;
/* 131 */       this.f = bool;
/*     */       
/* 133 */       this.g = new dci((☃ - j), 0.0D, (i - j), (☃ + j), 256.0D, (i + j));
/*     */     }
/*     */     
/*     */     public boolean a(fx ☃) {
/* 137 */       return (☃.u() >> 4 == this.b >> 4 && ☃
/* 138 */         .w() >> 4 == this.c >> 4);
/*     */     }
/*     */     
/*     */     public int a() {
/* 142 */       return this.b;
/*     */     }
/*     */     
/*     */     public int b() {
/* 146 */       return this.c;
/*     */     }
/*     */     
/*     */     public int c() {
/* 150 */       return this.d;
/*     */     }
/*     */     
/*     */     public int d() {
/* 154 */       return this.e;
/*     */     }
/*     */     
/*     */     public boolean e() {
/* 158 */       return this.f;
/*     */     }
/*     */     
/*     */     public dci f() {
/* 162 */       return this.g;
/*     */     } }
/*     */   
/*     */   static class b extends CacheLoader<Long, List<a>> {
/*     */     private b() {}
/*     */     
/*     */     public List<ckx.a> a(Long ☃) {
/* 169 */       List<Integer> list = IntStream.range(0, 10).boxed().collect((Collector)Collectors.toList());
/* 170 */       Collections.shuffle(list, new Random(☃.longValue()));
/*     */       
/* 172 */       List<ckx.a> list1 = Lists.newArrayList();
/* 173 */       for (int i = 0; i < 10; i++) {
/* 174 */         int j = afm.c(42.0D * Math.cos(2.0D * (-3.141592653589793D + 0.3141592653589793D * i)));
/* 175 */         int k = afm.c(42.0D * Math.sin(2.0D * (-3.141592653589793D + 0.3141592653589793D * i)));
/* 176 */         int m = ((Integer)list.get(i)).intValue();
/* 177 */         int n = 2 + m / 3;
/* 178 */         int i1 = 76 + m * 3;
/* 179 */         boolean bool = (m == 1 || m == 2);
/* 180 */         list1.add(new ckx.a(j, k, n, i1, bool));
/*     */       } 
/* 182 */       return list1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */