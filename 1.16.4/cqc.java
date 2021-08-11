/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cqc<DC extends clw>
/*    */ {
/* 20 */   public static final cqc<cmg> a = a("nope", new cqm(cmg.a));
/*    */   
/* 22 */   public static final cqc<cpn> b = a("chance", new cpm(cpn.a));
/* 23 */   public static final cqc<clu> c = a("count", new cpp(clu.a));
/* 24 */   public static final cqc<cmf> d = a("count_noise", new cpq(cmf.a));
/* 25 */   public static final cqc<cql> e = a("count_noise_biased", new cqk(cql.a));
/* 26 */   public static final cqc<cqd> f = a("count_extra", new cpr(cqd.a));
/*    */   
/* 28 */   public static final cqc<cmg> g = a("square", new cqq(cmg.a));
/*    */   
/* 30 */   public static final cqc<cmg> h = a("heightmap", new cqf<>(cmg.a));
/* 31 */   public static final cqc<cmg> i = a("heightmap_spread_double", new cqg<>(cmg.a));
/* 32 */   public static final cqc<cmg> j = a("top_solid_heightmap", new cqr(cmg.a));
/* 33 */   public static final cqc<cmg> k = a("heightmap_world_surface", new cqe(cmg.a));
/*    */   
/* 35 */   public static final cqc<cmo> l = a("range", new cqn(cmo.a));
/* 36 */   public static final cqc<cmo> m = a("range_biased", new cpj(cmo.a));
/* 37 */   public static final cqc<cmo> n = a("range_very_biased", new cqs(cmo.a));
/* 38 */   public static final cqc<cpw> o = a("depth_average", new cpx(cpw.a));
/*    */   
/* 40 */   public static final cqc<cmg> p = a("spread_32_above", new cqp(cmg.a));
/*    */   
/* 42 */   public static final cqc<cpl> q = a("carving_mask", new cpk(cpl.a));
/* 43 */   public static final cqc<clu> r = a("fire", new cqu(clu.a));
/* 44 */   public static final cqc<cmg> s = a("magma", new cqw(cmg.a));
/* 45 */   public static final cqc<cmg> t = a("emerald_ore", new cpz(cmg.a));
/* 46 */   public static final cqc<cpn> u = a("lava_lake", new cqi(cpn.a));
/* 47 */   public static final cqc<cpn> v = a("water_lake", new cqj(cpn.a));
/* 48 */   public static final cqc<clu> w = a("glowstone", new cqv(clu.a));
/* 49 */   public static final cqc<cmg> x = a("end_gateway", new cqa(cmg.a));
/*    */   
/* 51 */   public static final cqc<cmg> y = a("dark_oak_tree", new cps(cmg.a));
/* 52 */   public static final cqc<cmg> z = a("iceberg", new cqh(cmg.a));
/* 53 */   public static final cqc<cmg> A = a("end_island", new cqb(cmg.a));
/*    */   
/* 55 */   public static final cqc<cpu> B = a("decorated", new cpt(cpu.a));
/*    */   
/* 57 */   public static final cqc<clu> C = a("count_multilayer", new cqt(clu.a));
/*    */   
/*    */   private static <T extends clw, G extends cqc<T>> G a(String ☃, G g) {
/* 60 */     return (G)gm.<cqc>a((gm)gm.aK, ☃, (cqc)g);
/*    */   }
/*    */   
/*    */   private final Codec<cpo<DC>> D;
/*    */   
/*    */   public cqc(Codec<DC> ☃) {
/* 66 */     this.D = ☃.fieldOf("config").xmap(☃ -> new cpo<>(this, (DC)☃), cpo::b).codec();
/*    */   }
/*    */   
/*    */   public cpo<DC> b(DC ☃) {
/* 70 */     return new cpo<>(this, ☃);
/*    */   }
/*    */   
/*    */   public Codec<cpo<DC>> a() {
/* 74 */     return this.D;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 81 */     return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
/*    */   }
/*    */   
/*    */   public abstract Stream<fx> a(cpv paramcpv, Random paramRandom, DC paramDC, fx paramfx);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */