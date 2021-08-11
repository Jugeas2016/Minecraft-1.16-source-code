/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Supplier;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class dsl
/*     */ {
/*  32 */   public static final dsl a = new dsl("default")
/*     */     {
/*     */       protected cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/*  35 */         return new cho(new btj(l, false, false, ☃), l, () -> (chp)☃.d(chp.c));
/*     */       }
/*     */     };
/*  38 */   private static final dsl e = new dsl("flat")
/*     */     {
/*     */       protected cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/*  41 */         return new chl(cpf.a(☃));
/*     */       }
/*     */     };
/*  44 */   private static final dsl f = new dsl("large_biomes")
/*     */     {
/*     */       protected cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/*  47 */         return new cho(new btj(l, false, true, ☃), l, () -> (chp)☃.d(chp.c));
/*     */       }
/*     */     };
/*  50 */   public static final dsl b = new dsl("amplified")
/*     */     {
/*     */       protected cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/*  53 */         return new cho(new btj(l, false, false, ☃), l, () -> (chp)☃.d(chp.d));
/*     */       }
/*     */     };
/*  56 */   private static final dsl g = new dsl("single_biome_surface")
/*     */     {
/*     */       protected cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/*  59 */         return new cho(new btd(☃.d(btb.b)), l, () -> (chp)☃.d(chp.c));
/*     */       }
/*     */     };
/*  62 */   private static final dsl h = new dsl("single_biome_caves")
/*     */     {
/*     */       public chw a(gn.b ☃, long l, boolean bool1, boolean bool2) {
/*  65 */         gm<bsv> gm = ☃.b(gm.ay);
/*  66 */         gm<chd> gm1 = ☃.b(gm.K);
/*  67 */         gm<chp> gm2 = ☃.b(gm.ar);
/*  68 */         return new chw(l, bool1, bool2, chw.a(chd.a(gm1, gm, gm2, l), () -> (chd)☃.d(chd.l), a(gm, gm2, l)));
/*     */       }
/*     */ 
/*     */       
/*     */       protected cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/*  73 */         return new cho(new btd(☃.d(btb.b)), l, () -> (chp)☃.d(chp.g));
/*     */       }
/*     */     };
/*  76 */   private static final dsl i = new dsl("single_biome_floating_islands")
/*     */     {
/*     */       protected cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/*  79 */         return new cho(new btd(☃.d(btb.b)), l, () -> (chp)☃.d(chp.h));
/*     */       }
/*     */     };
/*  82 */   private static final dsl j = new dsl("debug_all_block_states")
/*     */     {
/*     */       protected cfy a(gm<bsv> ☃, gm<chp> gm1, long l) {
/*  85 */         return new chj(☃);
/*     */       }
/*     */     };
/*     */   
/*  89 */   protected static final List<dsl> c = Lists.newArrayList((Object[])new dsl[] { a, e, f, b, g, h, i, j });
/*     */ 
/*     */   
/*     */   protected static final Map<Optional<dsl>, a> d;
/*     */ 
/*     */   
/*     */   private final nr k;
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/* 100 */     d = (Map<Optional<dsl>, a>)ImmutableMap.of(
/* 101 */         Optional.of(e), (☃, chw1) -> {
/*     */           cfy cfy = chw1.e();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           return new dnv(☃, (), (cfy instanceof chl) ? ((chl)cfy).g() : cpf.a(☃.c.b().b(gm.ay)));
/* 109 */         }Optional.of(g), (☃, chw1) -> new dnu(☃, ☃.c.b(), (), a(☃.c.b(), chw1)), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 115 */         Optional.of(h), (☃, chw1) -> new dnu(☃, ☃.c.b(), (), a(☃.c.b(), chw1)), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 121 */         Optional.of(i), (☃, chw1) -> new dnu(☃, ☃.c.b(), (), a(☃.c.b(), chw1)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private dsl(String ☃) {
/* 132 */     this.k = new of("generator." + ☃);
/*     */   }
/*     */   private static chw a(gn ☃, chw chw1, dsl dsl1, bsv bsv1) {
/*     */     Supplier<chp> supplier;
/* 136 */     bsy bsy = new btd(bsv1);
/*     */     
/* 138 */     gm<chd> gm = ☃.b(gm.K);
/* 139 */     gm<chp> gm1 = ☃.b(gm.ar);
/*     */     
/* 141 */     if (dsl1 == h) {
/* 142 */       supplier = (() -> (chp)☃.d(chp.g));
/* 143 */     } else if (dsl1 == i) {
/* 144 */       supplier = (() -> (chp)☃.d(chp.h));
/*     */     } else {
/* 146 */       supplier = (() -> (chp)☃.d(chp.c));
/*     */     } 
/* 148 */     return new chw(chw1.a(), chw1.b(), chw1.c(), chw.a(gm, chw1.d(), new cho(bsy, chw1.a(), supplier)));
/*     */   }
/*     */   
/*     */   private static bsv a(gn ☃, chw chw1) {
/* 152 */     return chw1.e().d().b().stream().findFirst().orElse(☃.<bsv>b(gm.ay).d(btb.b));
/*     */   }
/*     */   
/*     */   public static Optional<dsl> a(chw ☃) {
/* 156 */     cfy cfy = ☃.e();
/* 157 */     if (cfy instanceof chl)
/* 158 */       return Optional.of(e); 
/* 159 */     if (cfy instanceof chj) {
/* 160 */       return Optional.of(j);
/*     */     }
/* 162 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a() {
/* 167 */     return this.k;
/*     */   }
/*     */   
/*     */   public chw a(gn.b ☃, long l, boolean bool1, boolean bool2) {
/* 171 */     gm<bsv> gm = ☃.b(gm.ay);
/* 172 */     gm<chd> gm1 = ☃.b(gm.K);
/* 173 */     gm<chp> gm2 = ☃.b(gm.ar);
/* 174 */     return new chw(l, bool1, bool2, chw.a(gm1, chd.a(gm1, gm, gm2, l), a(gm, gm2, l)));
/*     */   }
/*     */   
/*     */   protected abstract cfy a(gm<bsv> paramgm, gm<chp> paramgm1, long paramLong);
/*     */   
/*     */   public static interface a {
/*     */     dot createEditScreen(dsf param1dsf, chw param1chw);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */