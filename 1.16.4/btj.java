/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function4;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.List;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ public class btj extends bsy {
/*     */   public static final Codec<btj> e;
/*     */   private final cvv f;
/*     */   
/*     */   static {
/*  16 */     e = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.LONG.fieldOf("seed").stable().forGetter(()), (App)Codec.BOOL.optionalFieldOf("legacy_biome_init_layer", Boolean.valueOf(false), Lifecycle.stable()).forGetter(()), (App)Codec.BOOL.fieldOf("large_biomes").orElse(Boolean.valueOf(false)).stable().forGetter(()), (App)vg.<bsv>a(gm.ay).forGetter(())).apply((Applicative)☃, ☃.stable(btj::new)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  25 */   private static final List<vj<bsv>> g = (List<vj<bsv>>)ImmutableList.of(btb.a, btb.b, btb.c, btb.d, btb.e, btb.f, btb.g, btb.h, btb.k, btb.l, btb.m, btb.n, (Object[])new vj[] { btb.o, btb.p, btb.q, btb.r, btb.s, btb.t, btb.u, btb.v, btb.w, btb.x, btb.y, btb.z, btb.A, btb.B, btb.C, btb.D, btb.E, btb.F, btb.G, btb.H, btb.I, btb.J, btb.K, btb.L, btb.M, btb.N, btb.S, btb.T, btb.U, btb.V, btb.W, btb.X, btb.Y, btb.aa, btb.ab, btb.ac, btb.ad, btb.ae, btb.af, btb.ag, btb.ah, btb.ai, btb.aj, btb.ak, btb.al, btb.am, btb.an, btb.ao, btb.ap, btb.aq, btb.ar, btb.as, btb.at, btb.au });
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
/*     */   private final long h;
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
/*     */   private final boolean i;
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
/*     */   private final boolean j;
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
/*     */   private final gm<bsv> k;
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
/*     */   public btj(long ☃, boolean bool1, boolean bool2, gm<bsv> gm1) {
/* 100 */     super(g.stream().map(vj1 -> ()));
/* 101 */     this.h = ☃;
/* 102 */     this.i = bool1;
/* 103 */     this.j = bool2;
/* 104 */     this.k = gm1;
/* 105 */     this.f = cvx.a(☃, bool1, bool2 ? 6 : 4, 4);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Codec<? extends bsy> a() {
/* 110 */     return (Codec)e;
/*     */   }
/*     */ 
/*     */   
/*     */   public bsy a(long ☃) {
/* 115 */     return new btj(☃, this.i, this.j, this.k);
/*     */   }
/*     */ 
/*     */   
/*     */   public bsv b(int ☃, int i, int j) {
/* 120 */     return this.f.a(this.k, ☃, j);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */