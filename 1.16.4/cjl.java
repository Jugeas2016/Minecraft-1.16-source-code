/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Random;
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
/*     */ public abstract class cjl<FC extends cma>
/*     */ {
/*  41 */   public static final cjl<cmh> b = a("no_op", new ckf(cmh.a));
/*  42 */   public static final cjl<cmz> c = a("tree", new cld(cmz.a));
/*     */   
/*  44 */   public static final cii<cmn> d = a("flower", new cjc(cmn.a));
/*  45 */   public static final cii<cmn> e = a("no_bonemeal_flower", new cjc(cmn.a));
/*  46 */   public static final cjl<cmn> f = a("random_patch", new ckl(cmn.a));
/*  47 */   public static final cjl<clr> g = a("block_pile", new ciq(clr.a));
/*  48 */   public static final cjl<cmw> h = a("spring_feature", new cky(cmw.a));
/*     */   
/*  50 */   public static final cjl<cmh> i = a("chorus_plant", new ciu(cmh.a));
/*  51 */   public static final cjl<cmp> j = a("emerald_ore", new cko(cmp.a));
/*     */   
/*  53 */   public static final cjl<cmh> k = a("void_start_platform", new clh(cmh.a));
/*  54 */   public static final cjl<cmh> l = a("desert_well", new cjf(cmh.a));
/*  55 */   public static final cjl<cmh> m = a("fossil", new cjn(cmh.a));
/*  56 */   public static final cjl<cmb> n = a("huge_red_mushroom", new cjs(cmb.a));
/*  57 */   public static final cjl<cmb> o = a("huge_brown_mushroom", new cjp(cmb.a));
/*  58 */   public static final cjl<cmh> p = a("ice_spike", new cju(cmh.a));
/*  59 */   public static final cjl<cmh> q = a("glowstone_blob", new cjo(cmh.a));
/*  60 */   public static final cjl<cmh> r = a("freeze_top_layer", new ckw(cmh.a));
/*  61 */   public static final cjl<cmh> s = a("vines", new clg(cmh.a));
/*  62 */   public static final cjl<cmh> t = a("monster_room", new ckc(cmh.a));
/*  63 */   public static final cjl<cmh> u = a("blue_ice", new cir(cmh.a));
/*  64 */   public static final cjl<cls> v = a("iceberg", new cjv(cls.a));
/*  65 */   public static final cjl<cls> w = a("forest_rock", new cip(cls.a));
/*  66 */   public static final cjl<cly> x = a("disk", new cjg(cly.a));
/*  67 */   public static final cjl<cly> y = a("ice_patch", new cjt(cly.a));
/*  68 */   public static final cjl<cls> z = a("lake", new cka(cls.a));
/*  69 */   public static final cjl<cmj> A = a("ore", new cki(cmj.a));
/*  70 */   public static final cjl<cmv> B = a("end_spike", new ckx(cmv.a));
/*  71 */   public static final cjl<cmh> C = a("end_island", new cjj(cmh.a));
/*  72 */   public static final cjl<clz> D = a("end_gateway", new cji(clz.a));
/*  73 */   public static final ckr E = a("seagrass", new ckr(cmk.b));
/*  74 */   public static final cjl<cmh> F = a("kelp", new cjz(cmh.a));
/*  75 */   public static final cjl<cmh> G = a("coral_tree", new cja(cmh.a));
/*  76 */   public static final cjl<cmh> H = a("coral_mushroom", new ciz(cmh.a));
/*  77 */   public static final cjl<cmh> I = a("coral_claw", new cix(cmh.a));
/*  78 */   public static final cjl<clu> J = a("sea_pickle", new ckq(clu.a));
/*  79 */   public static final cjl<cmt> K = a("simple_block", new ckt(cmt.a));
/*  80 */   public static final cjl<cmk> L = a("bamboo", new cik(cmk.b));
/*     */   
/*  82 */   public static final cjl<cjq> M = a("huge_fungus", new cjr(cjq.a));
/*  83 */   public static final cjl<clr> N = a("nether_forest_vegetation", new ckd(clr.a));
/*  84 */   public static final cjl<cmh> O = a("weeping_vines", new cli(cmh.a));
/*  85 */   public static final cjl<cmh> P = a("twisting_vines", new cle(cmh.a));
/*     */   
/*  87 */   public static final cjl<clt> Q = a("basalt_columns", new cil(clt.a));
/*  88 */   public static final cjl<clx> R = a("delta_feature", new cjd(clx.a));
/*  89 */   public static final cjl<cmq> S = a("netherrack_replace_blobs", new ckn(cmq.a));
/*     */   
/*  91 */   public static final cjl<cmd> T = a("fill_layer", new cjm(cmd.a));
/*  92 */   public static final cis U = a("bonus_chest", new cis(cmh.a));
/*  93 */   public static final cjl<cmh> V = a("basalt_pillar", new cim(cmh.a));
/*  94 */   public static final cjl<cmj> W = a("no_surface_ore", new ckg(cmj.a));
/*     */   
/*  96 */   public static final cjl<cmm> X = a("random_selector", new ckm(cmm.a));
/*  97 */   public static final cjl<cmu> Y = a("simple_random_selector", new cku(cmu.a));
/*  98 */   public static final cjl<cml> Z = a("random_boolean_selector", new ckk(cml.a));
/*  99 */   public static final cjl<clv> aa = a("decorated", new cjb(clv.a));
/*     */   
/*     */   private static <C extends cma, F extends cjl<C>> F a(String ☃, F f) {
/* 102 */     return (F)gm.<cjl>a((gm)gm.aE, ☃, (cjl)f);
/*     */   }
/*     */   
/*     */   private final Codec<civ<FC, cjl<FC>>> a;
/*     */   
/*     */   public cjl(Codec<FC> ☃) {
/* 108 */     this.a = ☃.fieldOf("config").xmap(☃ -> new civ<>(this, ☃), ☃ -> ☃.f).codec();
/*     */   }
/*     */   
/*     */   public Codec<civ<FC, cjl<FC>>> a() {
/* 112 */     return this.a;
/*     */   }
/*     */   
/*     */   public civ<FC, ?> b(FC ☃) {
/* 116 */     return new civ<>(this, ☃);
/*     */   }
/*     */   
/*     */   protected void a(bse ☃, fx fx1, ceh ceh1) {
/* 120 */     ☃.a(fx1, ceh1, 3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected static boolean a(buo ☃) {
/* 126 */     return (☃ == bup.b || ☃ == bup.c || ☃ == bup.e || ☃ == bup.g);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean b(buo ☃) {
/* 133 */     return (☃ == bup.j || ☃ == bup.i || ☃ == bup.l || ☃ == bup.k || ☃ == bup.dT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean a(bsc ☃, fx fx1) {
/* 141 */     return ☃.a(fx1, ☃ -> b(☃.b()));
/*     */   }
/*     */   
/*     */   public static boolean b(bsc ☃, fx fx1) {
/* 145 */     return ☃.a(fx1, ceg.a::g);
/*     */   }
/*     */   
/*     */   public abstract boolean a(bsr parambsr, cfy paramcfy, Random paramRandom, fx paramfx, FC paramFC);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */