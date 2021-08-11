/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.List;
/*     */ import java.util.OptionalInt;
/*     */ import java.util.Set;
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
/*     */ public class kh
/*     */ {
/*  92 */   public static final civ<?, ?> a = a("end_spike", cjl.B.b(new cmv(false, (List<ckx.a>)ImmutableList.of(), null)));
/*  93 */   public static final civ<?, ?> b = a("end_gateway", cjl.D.b(clz.a(aag.a, true)).b(cqc.x.b(clw.b)));
/*  94 */   public static final civ<?, ?> c = a("end_gateway_delayed", cjl.D.b(clz.b()));
/*  95 */   public static final civ<?, ?> d = a("chorus_plant", cjl.i.b(cma.k).b(b.l).c(4));
/*  96 */   public static final civ<?, ?> e = a("end_island", cjl.C.b(cma.k));
/*  97 */   public static final civ<?, ?> f = a("end_island_decorated", e.b(cqc.A.b(clw.b)));
/*     */ 
/*     */   
/* 100 */   public static final civ<?, ?> g = a("delta", cjl.R.b(new clx(c.ac, c.av, afw.a(3, 4), afw.a(0, 2))).b(cqc.C.b(new clu(40))));
/* 101 */   public static final civ<?, ?> h = a("small_basalt_columns", cjl.Q.b(new clt(afw.a(1), afw.a(1, 3))).b(cqc.C.b(new clu(4))));
/* 102 */   public static final civ<?, ?> i = a("large_basalt_columns", cjl.Q.b(new clt(afw.a(2, 1), afw.a(5, 5))).b(cqc.C.b(new clu(2))));
/* 103 */   public static final civ<?, ?> j = a("basalt_blobs", cjl.S.b(new cmq(c.N, c.aB, afw.a(3, 4))).d(128).a().b(75));
/* 104 */   public static final civ<?, ?> k = a("blackstone_blobs", cjl.S.b(new cmq(c.N, c.az, afw.a(3, 4))).d(128).a().b(25));
/* 105 */   public static final civ<?, ?> l = a("glowstone_extra", cjl.q.b(cma.k).b(cqc.w.b(new clu(10))));
/* 106 */   public static final civ<?, ?> m = a("glowstone", cjl.q.b(cma.k).d(128).a().b(10));
/*     */   
/* 108 */   public static final civ<?, ?> n = a("crimson_forest_vegetation", cjl.N.b(a.k).b(cqc.C.b(new clu(6))));
/* 109 */   public static final civ<?, ?> o = a("warped_forest_vegetation", cjl.N.b(a.l).b(cqc.C.b(new clu(5))));
/* 110 */   public static final civ<?, ?> p = a("nether_sprouts", cjl.N.b(a.m).b(cqc.C.b(new clu(4))));
/*     */   
/* 112 */   public static final civ<?, ?> q = a("twisting_vines", cjl.P.b(cma.k).d(128).a().b(10));
/* 113 */   public static final civ<?, ?> r = a("weeping_vines", cjl.O.b(cma.k).d(128).a().b(10));
/* 114 */   public static final civ<?, ?> s = a("basalt_pillar", cjl.V.b(cma.k).d(128).a().b(10));
/*     */ 
/*     */   
/* 117 */   public static final civ<?, ?> t = a("seagrass_cold", cjl.E.b(new cmk(0.3F)).b(32).b(b.n));
/* 118 */   public static final civ<?, ?> u = a("seagrass_deep_cold", cjl.E.b(new cmk(0.8F)).b(40).b(b.n));
/* 119 */   public static final civ<?, ?> v = a("seagrass_normal", cjl.E.b(new cmk(0.3F)).b(48).b(b.n));
/* 120 */   public static final civ<?, ?> w = a("seagrass_river", cjl.E.b(new cmk(0.4F)).b(48).b(b.n));
/* 121 */   public static final civ<?, ?> x = a("seagrass_deep", cjl.E.b(new cmk(0.8F)).b(48).b(b.n));
/* 122 */   public static final civ<?, ?> y = a("seagrass_swamp", cjl.E.b(new cmk(0.6F)).b(64).b(b.n));
/* 123 */   public static final civ<?, ?> z = a("seagrass_warm", cjl.E.b(new cmk(0.3F)).b(80).b(b.n));
/* 124 */   public static final civ<?, ?> A = a("seagrass_deep_warm", cjl.E.b(new cmk(0.8F)).b(80).b(b.n));
/*     */   
/* 126 */   public static final civ<?, ?> B = a("sea_pickle", cjl.J.b(new clu(20)).b(b.n).a(16));
/* 127 */   public static final civ<?, ?> C = a("ice_spike", cjl.p.b(cma.k).b(b.l).b(3));
/* 128 */   public static final civ<?, ?> D = a("ice_patch", cjl.y.b(new cly(c.B, afw.a(2, 1), 1, (List<ceh>)ImmutableList.of(c.ad, c.t, c.c, c.d, c.e, c.f, c.g))).b(b.l).b(2));
/* 129 */   public static final civ<?, ?> E = a("forest_rock", cjl.w.b(new cls(c.at)).b(b.l).c(2));
/* 130 */   public static final civ<?, ?> F = a("seagrass_simple", cjl.K.b(new cmt(c.au, (List<ceh>)ImmutableList.of(c.ao), (List<ceh>)ImmutableList.of(c.ab), (List<ceh>)ImmutableList.of(c.ab))).b(cqc.q.b(new cpl(chm.a.b, 0.1F))));
/* 131 */   public static final civ<?, ?> G = a("iceberg_packed", cjl.v.b(new cls(c.B)).b(cqc.z.b(cmg.c)).a(16));
/* 132 */   public static final civ<?, ?> H = a("iceberg_blue", cjl.v.b(new cls(c.C)).b(cqc.z.b(cmg.c)).a(200));
/*     */   
/* 134 */   public static final civ<?, ?> I = a("kelp_cold", cjl.F.b(cma.k).b(b.f).a().b(cqc.e.b(new cql(120, 80.0D, 0.0D))));
/* 135 */   public static final civ<?, ?> J = a("kelp_warm", cjl.F.b(cma.k).b(b.f).a().b(cqc.e.b(new cql(80, 80.0D, 0.0D))));
/* 136 */   public static final civ<?, ?> K = a("blue_ice", cjl.u.b(cma.k).b(cqc.l.b(new cmo(30, 32, 64))).a().c(19));
/*     */ 
/*     */   
/* 139 */   public static final civ<?, ?> L = a("bamboo_light", cjl.L.b(new cmk(0.0F)).b(b.m).b(16));
/* 140 */   public static final civ<?, ?> M = a("bamboo", cjl.L.b(new cmk(0.2F)).b(b.g).a().b(cqc.e.b(new cql(160, 80.0D, 0.3D))));
/* 141 */   public static final civ<?, ?> N = a("vines", cjl.s.b(cma.k).a().b(50));
/*     */ 
/*     */ 
/*     */   
/* 145 */   public static final civ<?, ?> O = a("lake_water", cjl.z.b(new cls(c.ab)).b(cqc.v.b(new cpn(4))));
/* 146 */   public static final civ<?, ?> P = a("lake_lava", cjl.z.b(new cls(c.ac)).b(cqc.u.b(new cpn(80))));
/*     */   
/* 148 */   public static final civ<?, ?> Q = a("disk_clay", cjl.x.b(new cly(c.as, afw.a(2, 1), 1, (List<ceh>)ImmutableList.of(c.ad, c.as))).b(b.n));
/* 149 */   public static final civ<?, ?> R = a("disk_gravel", cjl.x.b(new cly(c.ae, afw.a(2, 3), 2, (List<ceh>)ImmutableList.of(c.ad, c.t))).b(b.n));
/* 150 */   public static final civ<?, ?> S = a("disk_sand", cjl.x.b(new cly(c.ar, afw.a(2, 4), 2, (List<ceh>)ImmutableList.of(c.ad, c.t))).b(b.n).b(3));
/*     */   
/* 152 */   public static final civ<?, ?> T = a("freeze_top_layer", cjl.r.b(cma.k));
/*     */ 
/*     */ 
/*     */   
/* 156 */   public static final civ<?, ?> U = a("bonus_chest", cjl.U.b(cma.k));
/* 157 */   public static final civ<?, ?> V = a("void_start_platform", cjl.k.b(cma.k));
/* 158 */   public static final civ<?, ?> W = a("monster_room", cjl.t.b(cma.k).d(256).a().b(8));
/* 159 */   public static final civ<?, ?> X = a("desert_well", cjl.l.b(cma.k).b(b.l).a(1000));
/* 160 */   public static final civ<?, ?> Y = a("fossil", cjl.m.b(cma.k).a(64));
/*     */ 
/*     */ 
/*     */   
/* 164 */   public static final civ<?, ?> Z = a("spring_lava_double", cjl.h.b(a.i).b(cqc.n.b(new cmo(8, 16, 256))).a().b(40));
/* 165 */   public static final civ<?, ?> aa = a("spring_lava", cjl.h.b(a.i).b(cqc.n.b(new cmo(8, 16, 256))).a().b(20));
/* 166 */   public static final civ<?, ?> ab = a("spring_delta", cjl.h.b(new cmw(c.aa, true, 4, 1, (Set<buo>)ImmutableSet.of(bup.cL, bup.cM, bup.E, bup.iJ, bup.np))).b(b.j).a().b(16));
/* 167 */   public static final civ<?, ?> ac = a("spring_closed", cjl.h.b(a.j).b(b.i).a().b(16));
/* 168 */   public static final civ<?, ?> ad = a("spring_closed_double", cjl.h.b(a.j).b(b.i).a().b(32));
/* 169 */   public static final civ<?, ?> ae = a("spring_open", cjl.h.b(new cmw(c.aa, false, 4, 1, (Set<buo>)ImmutableSet.of(bup.cL))).b(b.j).a().b(8));
/* 170 */   public static final civ<?, ?> af = a("spring_water", cjl.h.b(new cmw(c.Z, true, 4, 1, (Set<buo>)ImmutableSet.of(bup.b, bup.c, bup.e, bup.g))).b(cqc.m.b(new cmo(8, 8, 256))).a().b(50));
/*     */ 
/*     */ 
/*     */   
/* 174 */   public static final civ<?, ?> ag = a("pile_hay", cjl.g.b(new clr(new cnx(bup.gA))));
/* 175 */   public static final civ<?, ?> ah = a("pile_melon", cjl.g.b(new clr(new cny(c.I))));
/* 176 */   public static final civ<?, ?> ai = a("pile_snow", cjl.g.b(new clr(new cny(c.R))));
/* 177 */   public static final civ<?, ?> aj = a("pile_ice", cjl.g.b(new clr((new cnz()).a(c.C, 1).a(c.B, 5))));
/* 178 */   public static final civ<?, ?> ak = a("pile_pumpkin", cjl.g.b(new clr((new cnz()).a(c.J, 19).a(c.S, 1))));
/*     */ 
/*     */ 
/*     */   
/* 182 */   public static final civ<?, ?> al = a("patch_fire", cjl.f.b((new cmn.a(new cny(c.L), clp.c))
/*     */ 
/*     */ 
/*     */         
/* 186 */         .a(64)
/* 187 */         .a((Set<buo>)ImmutableSet.of(c.N.b()))
/* 188 */         .b()
/* 189 */         .d()).b(b.d));
/* 190 */   public static final civ<?, ?> am = a("patch_soul_fire", cjl.f.b((new cmn.a(new cny(c.M), new clp()))
/*     */ 
/*     */ 
/*     */         
/* 194 */         .a(64)
/* 195 */         .a((Set<buo>)ImmutableSet.of(c.O.b()))
/* 196 */         .b()
/* 197 */         .d()).b(b.d));
/* 198 */   public static final civ<?, ?> an = a("patch_brown_mushroom", cjl.f.b((new cmn.a(new cny(c.z), clp.c))
/*     */ 
/*     */ 
/*     */         
/* 202 */         .a(64)
/* 203 */         .b()
/* 204 */         .d()));
/* 205 */   public static final civ<?, ?> ao = a("patch_red_mushroom", cjl.f.b((new cmn.a(new cny(c.A), clp.c))
/*     */ 
/*     */ 
/*     */         
/* 209 */         .a(64)
/* 210 */         .b()
/* 211 */         .d()));
/* 212 */   public static final civ<?, ?> ap = a("patch_crimson_roots", cjl.f.b((new cmn.a(new cny(c.P), new clp()))
/*     */ 
/*     */ 
/*     */         
/* 216 */         .a(64)
/* 217 */         .b()
/* 218 */         .d()).d(128));
/* 219 */   public static final civ<?, ?> aq = a("patch_sunflower", cjl.f.b((new cmn.a(new cny(c.T), new clo()))
/*     */ 
/*     */ 
/*     */         
/* 223 */         .a(64)
/* 224 */         .b()
/* 225 */         .d()).b(b.k).b(b.l).b(10));
/* 226 */   public static final civ<?, ?> ar = a("patch_pumpkin", cjl.f.b((new cmn.a(new cny(c.J), clp.c))
/*     */ 
/*     */ 
/*     */         
/* 230 */         .a(64)
/* 231 */         .a((Set<buo>)ImmutableSet.of(c.t.b()))
/* 232 */         .b()
/* 233 */         .d()).b(b.m).a(32));
/* 234 */   public static final civ<?, ?> as = a("patch_taiga_grass", cjl.f.b(a.b));
/* 235 */   public static final civ<?, ?> at = a("patch_berry_bush", cjl.f.b(a.f));
/* 236 */   public static final civ<?, ?> au = a("patch_grass_plain", cjl.f.b(a.a).b(b.m).b(cqc.d.b(new cmf(-0.8D, 5, 10))));
/* 237 */   public static final civ<?, ?> av = a("patch_grass_forest", cjl.f.b(a.a).b(b.m).b(2));
/* 238 */   public static final civ<?, ?> aw = a("patch_grass_badlands", cjl.f.b(a.a).b(b.m));
/* 239 */   public static final civ<?, ?> ax = a("patch_grass_savanna", cjl.f.b(a.a).b(b.m).b(20));
/* 240 */   public static final civ<?, ?> ay = a("patch_grass_normal", cjl.f.b(a.a).b(b.m).b(5));
/* 241 */   public static final civ<?, ?> az = a("patch_grass_taiga_2", cjl.f.b(a.b).b(b.m));
/* 242 */   public static final civ<?, ?> aA = a("patch_grass_taiga", cjl.f.b(a.b).b(b.m).b(7));
/* 243 */   public static final civ<?, ?> aB = a("patch_grass_jungle", cjl.f.b(a.c).b(b.m).b(25));
/* 244 */   public static final civ<?, ?> aC = a("patch_dead_bush_2", cjl.f.b(a.e).b(b.m).b(2));
/* 245 */   public static final civ<?, ?> aD = a("patch_dead_bush", cjl.f.b(a.e).b(b.m));
/* 246 */   public static final civ<?, ?> aE = a("patch_dead_bush_badlands", cjl.f.b(a.e).b(b.m).b(20));
/* 247 */   public static final civ<?, ?> aF = a("patch_melon", cjl.f.b((new cmn.a(new cny(c.I), clp.c))
/*     */ 
/*     */ 
/*     */         
/* 251 */         .a(64)
/* 252 */         .a((Set<buo>)ImmutableSet.of(c.t.b()))
/* 253 */         .a()
/* 254 */         .b()
/* 255 */         .d()).b(b.m));
/* 256 */   public static final civ<?, ?> aG = a("patch_berry_sparse", at.b(b.m));
/* 257 */   public static final civ<?, ?> aH = a("patch_berry_decorated", at.b(b.m).a(12));
/* 258 */   public static final civ<?, ?> aI = a("patch_waterlilly", cjl.f.b((new cmn.a(new cny(c.Q), clp.c))
/*     */ 
/*     */ 
/*     */         
/* 262 */         .a(10)
/* 263 */         .d()).b(b.m).b(4));
/* 264 */   public static final civ<?, ?> aJ = a("patch_tall_grass_2", cjl.f.b(a.g).b(b.k).b(b.e).a().b(cqc.d.b(new cmf(-0.8D, 0, 7))));
/* 265 */   public static final civ<?, ?> aK = a("patch_tall_grass", cjl.f.b(a.g).b(b.k).b(b.l).b(7));
/* 266 */   public static final civ<?, ?> aL = a("patch_large_fern", cjl.f.b((new cmn.a(new cny(c.u), new clo()))
/*     */ 
/*     */ 
/*     */         
/* 270 */         .a(64)
/* 271 */         .b()
/* 272 */         .d()).b(b.k).b(b.l).b(7));
/* 273 */   public static final civ<?, ?> aM = a("patch_cactus", cjl.f.b((new cmn.a(new cny(c.U), new cln(1, 2)))
/*     */ 
/*     */ 
/*     */         
/* 277 */         .a(10)
/* 278 */         .b()
/* 279 */         .d()));
/* 280 */   public static final civ<?, ?> aN = a("patch_cactus_desert", aM.b(b.m).b(10));
/* 281 */   public static final civ<?, ?> aO = a("patch_cactus_decorated", aM.b(b.m).b(5));
/* 282 */   public static final civ<?, ?> aP = a("patch_sugar_cane_swamp", cjl.f.b(a.h).b(b.m).b(20));
/* 283 */   public static final civ<?, ?> aQ = a("patch_sugar_cane_desert", cjl.f.b(a.h).b(b.m).b(60));
/* 284 */   public static final civ<?, ?> aR = a("patch_sugar_cane_badlands", cjl.f.b(a.h).b(b.m).b(13));
/* 285 */   public static final civ<?, ?> aS = a("patch_sugar_cane", cjl.f.b(a.h).b(b.m).b(10));
/*     */ 
/*     */ 
/*     */   
/* 289 */   public static final civ<?, ?> aT = a("brown_mushroom_nether", an.d(128).a(2));
/* 290 */   public static final civ<?, ?> aU = a("red_mushroom_nether", ao.d(128).a(2));
/* 291 */   public static final civ<?, ?> aV = a("brown_mushroom_normal", an.b(b.m).a(4));
/* 292 */   public static final civ<?, ?> aW = a("red_mushroom_normal", ao.b(b.m).a(8));
/* 293 */   public static final civ<?, ?> aX = a("brown_mushroom_taiga", an.a(4).b(b.l));
/* 294 */   public static final civ<?, ?> aY = a("red_mushroom_taiga", ao.a(8).b(b.m));
/* 295 */   public static final civ<?, ?> aZ = a("brown_mushroom_giant", aX.b(3));
/* 296 */   public static final civ<?, ?> ba = a("red_mushroom_giant", aY.b(3));
/* 297 */   public static final civ<?, ?> bb = a("brown_mushroom_swamp", aX.b(8));
/* 298 */   public static final civ<?, ?> bc = a("red_mushroom_swamp", aY.b(8));
/*     */ 
/*     */ 
/*     */   
/* 302 */   public static final civ<?, ?> bd = a("ore_magma", cjl.A.b(new cmj(cmj.a.b, c.av, 33)).b(cqc.s.b(cmg.c)).a().b(4));
/* 303 */   public static final civ<?, ?> be = a("ore_soul_sand", cjl.A.b(new cmj(cmj.a.b, c.aw, 12)).d(32).a().b(12));
/* 304 */   public static final civ<?, ?> bf = a("ore_gold_deltas", cjl.A.b(new cmj(cmj.a.b, c.ax, 10)).b(b.i).a().b(20));
/* 305 */   public static final civ<?, ?> bg = a("ore_quartz_deltas", cjl.A.b(new cmj(cmj.a.b, c.ay, 14)).b(b.i).a().b(32));
/* 306 */   public static final civ<?, ?> bh = a("ore_gold_nether", cjl.A.b(new cmj(cmj.a.b, c.ax, 10)).b(b.i).a().b(10));
/* 307 */   public static final civ<?, ?> bi = a("ore_quartz_nether", cjl.A.b(new cmj(cmj.a.b, c.ay, 14)).b(b.i).a().b(16));
/* 308 */   public static final civ<?, ?> bj = a("ore_gravel_nether", cjl.A.b(new cmj(cmj.a.b, c.ae, 33)).b(cqc.l.b(new cmo(5, 0, 37))).a().b(2));
/* 309 */   public static final civ<?, ?> bk = a("ore_blackstone", cjl.A.b(new cmj(cmj.a.b, c.az, 33)).b(cqc.l.b(new cmo(5, 10, 37))).a().b(2));
/* 310 */   public static final civ<?, ?> bl = a("ore_dirt", cjl.A.b(new cmj(cmj.a.a, c.ad, 33)).d(256).a().b(10));
/* 311 */   public static final civ<?, ?> bm = a("ore_gravel", cjl.A.b(new cmj(cmj.a.a, c.ae, 33)).d(256).a().b(8));
/* 312 */   public static final civ<?, ?> bn = a("ore_granite", cjl.A.b(new cmj(cmj.a.a, c.af, 33)).d(80).a().b(10));
/*     */   
/* 314 */   public static final civ<?, ?> bo = a("ore_diorite", cjl.A.b(new cmj(cmj.a.a, c.ag, 33)).d(80).a().b(10));
/* 315 */   public static final civ<?, ?> bp = a("ore_andesite", cjl.A.b(new cmj(cmj.a.a, c.ah, 33)).d(80).a().b(10));
/* 316 */   public static final civ<?, ?> bq = a("ore_coal", cjl.A.b(new cmj(cmj.a.a, c.ai, 17)).d(128).a().b(20));
/* 317 */   public static final civ<?, ?> br = a("ore_iron", cjl.A.b(new cmj(cmj.a.a, c.aj, 9)).d(64).a().b(20));
/* 318 */   public static final civ<?, ?> bs = a("ore_gold_extra", cjl.A.b(new cmj(cmj.a.a, c.ak, 9)).b(cqc.l.b(new cmo(32, 32, 80))).a().b(20));
/* 319 */   public static final civ<?, ?> bt = a("ore_gold", cjl.A.b(new cmj(cmj.a.a, c.ak, 9)).d(32).a().b(2));
/* 320 */   public static final civ<?, ?> bu = a("ore_redstone", cjl.A.b(new cmj(cmj.a.a, c.al, 8)).d(16).a().b(8));
/* 321 */   public static final civ<?, ?> bv = a("ore_diamond", cjl.A.b(new cmj(cmj.a.a, c.am, 8)).d(16).a());
/* 322 */   public static final civ<?, ?> bw = a("ore_lapis", cjl.A.b(new cmj(cmj.a.a, c.an, 7)).b(cqc.o.b(new cpw(16, 16))).a());
/* 323 */   public static final civ<?, ?> bx = a("ore_infested", cjl.A.b(new cmj(cmj.a.a, c.aq, 9)).d(64).a().b(7));
/* 324 */   public static final civ<?, ?> by = a("ore_emerald", cjl.j.b(new cmp(c.ao, c.ap)).b(cqc.t.b(clw.b)));
/* 325 */   public static final civ<?, ?> bz = a("ore_debris_large", cjl.W.b(new cmj(cmj.a.c, c.aA, 3)).b(cqc.o.b(new cpw(16, 8))).a());
/* 326 */   public static final civ<?, ?> bA = a("ore_debris_small", cjl.W.b(new cmj(cmj.a.c, c.aA, 2)).b(cqc.l.b(new cmo(8, 16, 128))).a());
/*     */ 
/*     */ 
/*     */   
/* 330 */   public static final civ<?, ?> bB = a("crimson_fungi", cjl.M.b(cjq.c).b(cqc.C.b(new clu(8))));
/* 331 */   public static final civ<cjq, ?> bC = a("crimson_fungi_planted", cjl.M.b(cjq.b));
/* 332 */   public static final civ<?, ?> bD = a("warped_fungi", cjl.M.b(cjq.e).b(cqc.C.b(new clu(8))));
/* 333 */   public static final civ<cjq, ?> bE = a("warped_fungi_planted", cjl.M.b(cjq.d));
/*     */ 
/*     */ 
/*     */   
/* 337 */   public static final civ<?, ?> bF = a("huge_brown_mushroom", cjl.o.b(new cmb(new cny(c.X), new cny(c.Y), 3)));
/* 338 */   public static final civ<?, ?> bG = a("huge_red_mushroom", cjl.n.b(new cmb(new cny(c.W), new cny(c.Y), 2)));
/*     */   
/* 340 */   public static final civ<cmz, ?> bH = a("oak", cjl.c.b((new cmz.a(new cny(c.h), new cny(c.i), new cnh(
/*     */ 
/*     */             
/* 343 */             afw.a(2), afw.a(0), 3), new cpa(4, 2, 0), new cne(1, 0, 1)))
/*     */ 
/*     */ 
/*     */         
/* 347 */         .a()
/* 348 */         .b()));
/* 349 */   public static final civ<cmz, ?> bI = a("dark_oak", cjl.c.b((new cmz.a(new cny(c.r), new cny(c.s), new cnj(
/*     */ 
/*     */             
/* 352 */             afw.a(0), afw.a(0)), new cov(6, 2, 1), new cnd(1, 1, 0, 1, 2, 
/*     */             
/* 354 */             OptionalInt.empty())))
/*     */         
/* 356 */         .a(2147483647)
/*     */         
/* 358 */         .a(chn.a.e)
/* 359 */         .a()
/* 360 */         .b()));
/* 361 */   public static final civ<cmz, ?> bJ = a("birch", cjl.c.b((new cmz.a(new cny(c.p), new cny(c.q), new cnh(
/*     */ 
/*     */             
/* 364 */             afw.a(2), afw.a(0), 3), new cpa(5, 2, 0), new cne(1, 0, 1)))
/*     */ 
/*     */ 
/*     */         
/* 368 */         .a()
/* 369 */         .b()));
/* 370 */   public static final civ<cmz, ?> bK = a("acacia", cjl.c.b((new cmz.a(new cny(c.n), new cny(c.o), new cng(
/*     */ 
/*     */             
/* 373 */             afw.a(2), afw.a(0)), new cox(5, 2, 2), new cne(1, 0, 2)))
/*     */ 
/*     */ 
/*     */         
/* 377 */         .a()
/* 378 */         .b()));
/* 379 */   public static final civ<cmz, ?> bL = a("spruce", cjl.c.b((new cmz.a(new cny(c.l), new cny(c.m), new cnq(
/*     */ 
/*     */             
/* 382 */             afw.a(2, 1), afw.a(0, 2), afw.a(1, 1)), new cpa(5, 2, 1), new cne(2, 0, 2)))
/*     */ 
/*     */ 
/*     */         
/* 386 */         .a()
/* 387 */         .b()));
/* 388 */   public static final civ<cmz, ?> bM = a("pine", cjl.c.b((new cmz.a(new cny(c.l), new cny(c.m), new cnp(
/*     */ 
/*     */             
/* 391 */             afw.a(1), afw.a(1), afw.a(3, 1)), new cpa(6, 4, 0), new cne(2, 0, 2)))
/*     */ 
/*     */ 
/*     */         
/* 395 */         .a()
/* 396 */         .b()));
/* 397 */   public static final civ<cmz, ?> bN = a("jungle_tree", cjl.c.b((new cmz.a(new cny(c.j), new cny(c.k), new cnh(
/*     */ 
/*     */             
/* 400 */             afw.a(2), afw.a(0), 3), new cpa(4, 8, 0), new cne(1, 0, 1)))
/*     */ 
/*     */ 
/*     */         
/* 404 */         .a((List<cor>)ImmutableList.of(new cop(0.2F), cot.b, coq.b))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 409 */         .a()
/* 410 */         .b()));
/* 411 */   public static final civ<cmz, ?> bO = a("fancy_oak", cjl.c.b((new cmz.a(new cny(c.h), new cny(c.i), new cnk(
/*     */ 
/*     */             
/* 414 */             afw.a(2), afw.a(4), 4), new cow(3, 11, 0), new cne(0, 0, 0, 
/*     */             
/* 416 */             OptionalInt.of(4))))
/*     */         
/* 418 */         .a()
/* 419 */         .a(chn.a.e)
/* 420 */         .b()));
/* 421 */   public static final civ<cmz, ?> bP = a("jungle_tree_no_vine", cjl.c.b((new cmz.a(new cny(c.j), new cny(c.k), new cnh(
/*     */ 
/*     */             
/* 424 */             afw.a(2), afw.a(0), 3), new cpa(4, 8, 0), new cne(1, 0, 1)))
/*     */ 
/*     */ 
/*     */         
/* 428 */         .a()
/* 429 */         .b()));
/* 430 */   public static final civ<cmz, ?> bQ = a("mega_jungle_tree", cjl.c.b((new cmz.a(new cny(c.j), new cny(c.k), new cnn(
/*     */ 
/*     */             
/* 433 */             afw.a(2), afw.a(0), 2), new coz(10, 2, 19), new cne(1, 1, 2)))
/*     */ 
/*     */ 
/*     */         
/* 437 */         .a((List<cor>)ImmutableList.of(cot.b, coq.b))
/*     */ 
/*     */ 
/*     */         
/* 441 */         .b()));
/* 442 */   public static final civ<cmz, ?> bR = a("mega_spruce", cjl.c.b((new cmz.a(new cny(c.l), new cny(c.m), new cno(
/*     */ 
/*     */             
/* 445 */             afw.a(0), afw.a(0), afw.a(13, 4)), new coy(13, 2, 14), new cne(1, 1, 2)))
/*     */ 
/*     */ 
/*     */         
/* 449 */         .a((List<cor>)ImmutableList.of(new com(new cny(c.c))))
/*     */ 
/*     */         
/* 452 */         .b()));
/* 453 */   public static final civ<cmz, ?> bS = a("mega_pine", cjl.c.b((new cmz.a(new cny(c.l), new cny(c.m), new cno(
/*     */ 
/*     */             
/* 456 */             afw.a(0), afw.a(0), afw.a(3, 4)), new coy(13, 2, 14), new cne(1, 1, 2)))
/*     */ 
/*     */ 
/*     */         
/* 460 */         .a((List<cor>)ImmutableList.of(new com(new cny(c.c))))
/*     */ 
/*     */         
/* 463 */         .b()));
/* 464 */   public static final civ<cmz, ?> bT = a("super_birch_bees_0002", cjl.c.b((new cmz.a(new cny(c.p), new cny(c.q), new cnh(
/*     */ 
/*     */             
/* 467 */             afw.a(2), afw.a(0), 3), new cpa(5, 2, 6), new cne(1, 0, 1)))
/*     */ 
/*     */ 
/*     */         
/* 471 */         .a()
/* 472 */         .a((List<cor>)ImmutableList.of(b.a))
/* 473 */         .b()));
/* 474 */   public static final civ<?, ?> bU = a("swamp_tree", cjl.c.b((new cmz.a(new cny(c.h), new cny(c.i), new cnh(
/*     */ 
/*     */             
/* 477 */             afw.a(3), afw.a(0), 3), new cpa(5, 3, 0), new cne(1, 0, 1)))
/*     */ 
/*     */ 
/*     */         
/* 481 */         .a(1)
/* 482 */         .a((List<cor>)ImmutableList.of(coq.b))
/* 483 */         .b()).b(b.l).b(cqc.f.b(new cqd(2, 0.1F, 1))));
/* 484 */   public static final civ<?, ?> bV = a("jungle_bush", cjl.c.b((new cmz.a(new cny(c.j), new cny(c.i), new cni(
/*     */ 
/*     */             
/* 487 */             afw.a(2), afw.a(1), 2), new cpa(1, 0, 0), new cne(0, 0, 0)))
/*     */ 
/*     */ 
/*     */         
/* 491 */         .a(chn.a.f)
/* 492 */         .b()));
/*     */   
/* 494 */   public static final civ<cmz, ?> bW = a("oak_bees_0002", cjl.c.b(((cmz)bH.c()).a((List<cor>)ImmutableList.of(b.a))));
/* 495 */   public static final civ<cmz, ?> bX = a("oak_bees_002", cjl.c.b(((cmz)bH.c()).a((List<cor>)ImmutableList.of(b.b))));
/* 496 */   public static final civ<cmz, ?> bY = a("oak_bees_005", cjl.c.b(((cmz)bH.c()).a((List<cor>)ImmutableList.of(b.c))));
/* 497 */   public static final civ<cmz, ?> bZ = a("birch_bees_0002", cjl.c.b(((cmz)bJ.c()).a((List<cor>)ImmutableList.of(b.a))));
/* 498 */   public static final civ<cmz, ?> ca = a("birch_bees_002", cjl.c.b(((cmz)bJ.c()).a((List<cor>)ImmutableList.of(b.b))));
/* 499 */   public static final civ<cmz, ?> cb = a("birch_bees_005", cjl.c.b(((cmz)bJ.c()).a((List<cor>)ImmutableList.of(b.c))));
/* 500 */   public static final civ<cmz, ?> cc = a("fancy_oak_bees_0002", cjl.c.b(((cmz)bO.c()).a((List<cor>)ImmutableList.of(b.a))));
/* 501 */   public static final civ<cmz, ?> cd = a("fancy_oak_bees_002", cjl.c.b(((cmz)bO.c()).a((List<cor>)ImmutableList.of(b.b))));
/* 502 */   public static final civ<cmz, ?> ce = a("fancy_oak_bees_005", cjl.c.b(((cmz)bO.c()).a((List<cor>)ImmutableList.of(b.c))));
/* 503 */   public static final civ<?, ?> cf = a("oak_badlands", bH.b(b.l).b(cqc.f.b(new cqd(5, 0.1F, 1))));
/* 504 */   public static final civ<?, ?> cg = a("spruce_snowy", bL.b(b.l).b(cqc.f.b(new cqd(0, 0.1F, 1))));
/*     */ 
/*     */ 
/*     */   
/* 508 */   public static final civ<?, ?> ch = a("flower_warm", cjl.d.b(a.d).b(b.k).b(b.l).b(4));
/* 509 */   public static final civ<?, ?> ci = a("flower_default", cjl.d.b(a.d).b(b.k).b(b.l).b(2));
/* 510 */   public static final civ<?, ?> cj = a("flower_forest", cjl.d.b((new cmn.a(cnv.c, clp.c))
/*     */ 
/*     */ 
/*     */         
/* 514 */         .a(64)
/* 515 */         .d()).b(b.k).b(b.l).b(100));
/* 516 */   public static final civ<?, ?> ck = a("flower_swamp", cjl.d.b((new cmn.a(new cny(c.E), clp.c))
/*     */ 
/*     */ 
/*     */         
/* 520 */         .a(64)
/* 521 */         .d()).b(b.k).b(b.l));
/* 522 */   public static final civ<?, ?> cl = a("flower_plain", cjl.d.b((new cmn.a(cnw.c, clp.c))
/*     */ 
/*     */ 
/*     */         
/* 526 */         .a(64)
/* 527 */         .d()));
/* 528 */   public static final civ<?, ?> cm = a("flower_plain_decorated", cl.b(b.k).b(b.e).a().b(cqc.d.b(new cmf(-0.8D, 15, 4))));
/*     */ 
/*     */ 
/*     */   
/* 532 */   private static final ImmutableList<Supplier<civ<?, ?>>> cJ = ImmutableList.of(() -> cjl.f.b((new cmn.a(new cny(c.w), new clo())).a(64).b().d()), () -> cjl.f.b((new cmn.a(new cny(c.x), new clo())).a(64).b().d()), () -> cjl.f.b((new cmn.a(new cny(c.y), new clo())).a(64).b().d()), () -> cjl.e.b((new cmn.a(new cny(c.D), clp.c)).a(64).d()));
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
/* 561 */   public static final civ<?, ?> cn = a("forest_flower_vegetation_common", cjl.Y.b(new cmu((List<Supplier<civ<?, ?>>>)cJ)).a(afw.a(-1, 4)).b(b.k).b(b.l).b(5));
/* 562 */   public static final civ<?, ?> co = a("forest_flower_vegetation", cjl.Y.b(new cmu((List<Supplier<civ<?, ?>>>)cJ)).a(afw.a(-3, 4)).b(b.k).b(b.l).b(5));
/*     */   
/* 564 */   public static final civ<?, ?> cp = a("dark_forest_vegetation_brown", cjl.X.b(new cmm(
/* 565 */           (List<clj>)ImmutableList.of(bF
/* 566 */             .a(0.025F), bG
/* 567 */             .a(0.05F), bI
/* 568 */             .a(0.6666667F), bJ
/* 569 */             .a(0.2F), bO
/* 570 */             .a(0.1F)), bH))
/*     */ 
/*     */       
/* 573 */       .b(cqc.y.b(clw.b)));
/*     */   
/* 575 */   public static final civ<?, ?> cq = a("dark_forest_vegetation_red", cjl.X.b(new cmm(
/* 576 */           (List<clj>)ImmutableList.of(bG
/* 577 */             .a(0.025F), bF
/* 578 */             .a(0.05F), bI
/* 579 */             .a(0.6666667F), bJ
/* 580 */             .a(0.2F), bO
/* 581 */             .a(0.1F)), bH))
/*     */ 
/*     */       
/* 584 */       .b(cqc.y.b(clw.b)));
/*     */   
/* 586 */   public static final civ<?, ?> cr = a("warm_ocean_vegetation", cjl.Y.b(new cmu((List<Supplier<civ<?, ?>>>)ImmutableList.of(() -> cjl.G.b(cma.k), () -> cjl.I.b(cma.k), () -> cjl.H.b(cma.k))))
/*     */ 
/*     */ 
/*     */       
/* 590 */       .b(b.f).a().b(cqc.e.b(new cql(20, 400.0D, 0.0D))));
/*     */   
/* 592 */   public static final civ<?, ?> cs = a("forest_flower_trees", cjl.X.b(new cmm(
/* 593 */           (List<clj>)ImmutableList.of(ca
/* 594 */             .a(0.2F), cd
/* 595 */             .a(0.1F)), bX))
/*     */       
/* 597 */       .b(b.l).b(cqc.f.b(new cqd(6, 0.1F, 1))));
/*     */   
/* 599 */   public static final civ<?, ?> ct = a("taiga_vegetation", cjl.X.b(new cmm(
/* 600 */           (List<clj>)ImmutableList.of(bM.a(0.33333334F)), bL))
/*     */       
/* 602 */       .b(b.l).b(cqc.f.b(new cqd(10, 0.1F, 1))));
/*     */   
/* 604 */   public static final civ<?, ?> cu = a("trees_shattered_savanna", cjl.X.b(new cmm(
/* 605 */           (List<clj>)ImmutableList.of(bK.a(0.8F)), bH))
/*     */       
/* 607 */       .b(b.l).b(cqc.f.b(new cqd(2, 0.1F, 1))));
/*     */   
/* 609 */   public static final civ<?, ?> cv = a("trees_savanna", cjl.X.b(new cmm(
/* 610 */           (List<clj>)ImmutableList.of(bK.a(0.8F)), bH))
/*     */       
/* 612 */       .b(b.l).b(cqc.f.b(new cqd(1, 0.1F, 1))));
/*     */   
/* 614 */   public static final civ<?, ?> cw = a("birch_tall", cjl.X.b(new cmm(
/* 615 */           (List<clj>)ImmutableList.of(bT.a(0.5F)), bZ))
/*     */       
/* 617 */       .b(b.l).b(cqc.f.b(new cqd(10, 0.1F, 1))));
/*     */   
/* 619 */   public static final civ<?, ?> cx = a("trees_birch", bZ
/* 620 */       .b(b.l).b(cqc.f.b(new cqd(10, 0.1F, 1))));
/*     */   
/* 622 */   public static final civ<?, ?> cy = a("trees_mountain_edge", cjl.X.b(new cmm(
/* 623 */           (List<clj>)ImmutableList.of(bL
/* 624 */             .a(0.666F), bO
/* 625 */             .a(0.1F)), bH))
/*     */ 
/*     */       
/* 628 */       .b(b.l).b(cqc.f.b(new cqd(3, 0.1F, 1))));
/*     */   
/* 630 */   public static final civ<?, ?> cz = a("trees_mountain", cjl.X.b(new cmm(
/* 631 */           (List<clj>)ImmutableList.of(bL
/* 632 */             .a(0.666F), bO
/* 633 */             .a(0.1F)), bH))
/*     */ 
/*     */       
/* 636 */       .b(b.l).b(cqc.f.b(new cqd(0, 0.1F, 1))));
/*     */   
/* 638 */   public static final civ<?, ?> cA = a("trees_water", cjl.X.b(new cmm(
/* 639 */           (List<clj>)ImmutableList.of(bO.a(0.1F)), bH))
/*     */       
/* 641 */       .b(b.l).b(cqc.f.b(new cqd(0, 0.1F, 1))));
/*     */   
/* 643 */   public static final civ<?, ?> cB = a("birch_other", cjl.X.b(new cmm(
/* 644 */           (List<clj>)ImmutableList.of(bZ
/* 645 */             .a(0.2F), cc
/* 646 */             .a(0.1F)), bW))
/*     */ 
/*     */       
/* 649 */       .b(b.l).b(cqc.f.b(new cqd(10, 0.1F, 1))));
/*     */   
/* 651 */   public static final civ<?, ?> cC = a("plain_vegetation", cjl.X.b(new cmm(
/* 652 */           (List<clj>)ImmutableList.of(ce.a(0.33333334F)), bY))
/*     */       
/* 654 */       .b(b.l).b(cqc.f.b(new cqd(0, 0.05F, 1))));
/*     */   
/* 656 */   public static final civ<?, ?> cD = a("trees_jungle_edge", cjl.X.b(new cmm(
/* 657 */           (List<clj>)ImmutableList.of(bO
/* 658 */             .a(0.1F), bV
/* 659 */             .a(0.5F)), bN))
/*     */ 
/*     */       
/* 662 */       .b(b.l).b(cqc.f.b(new cqd(2, 0.1F, 1))));
/*     */   
/* 664 */   public static final civ<?, ?> cE = a("trees_giant_spruce", cjl.X.b(new cmm(
/* 665 */           (List<clj>)ImmutableList.of(bR
/* 666 */             .a(0.33333334F), bM
/* 667 */             .a(0.33333334F)), bL))
/*     */ 
/*     */       
/* 670 */       .b(b.l).b(cqc.f.b(new cqd(10, 0.1F, 1))));
/*     */   
/* 672 */   public static final civ<?, ?> cF = a("trees_giant", cjl.X.b(new cmm(
/* 673 */           (List<clj>)ImmutableList.of(bR
/* 674 */             .a(0.025641026F), bS
/* 675 */             .a(0.30769232F), bM
/* 676 */             .a(0.33333334F)), bL))
/*     */ 
/*     */       
/* 679 */       .b(b.l).b(cqc.f.b(new cqd(10, 0.1F, 1))));
/*     */   
/* 681 */   public static final civ<?, ?> cG = a("trees_jungle", cjl.X.b(new cmm(
/* 682 */           (List<clj>)ImmutableList.of(bO
/* 683 */             .a(0.1F), bV
/* 684 */             .a(0.5F), bQ
/* 685 */             .a(0.33333334F)), bN))
/*     */ 
/*     */       
/* 688 */       .b(b.l).b(cqc.f.b(new cqd(50, 0.1F, 1))));
/*     */   
/* 690 */   public static final civ<?, ?> cH = a("bamboo_vegetation", cjl.X.b(new cmm(
/* 691 */           (List<clj>)ImmutableList.of(bO
/* 692 */             .a(0.05F), bV
/* 693 */             .a(0.15F), bQ
/* 694 */             .a(0.7F)), cjl.f
/*     */           
/* 696 */           .b(a.c)))
/* 697 */       .b(b.l).b(cqc.f.b(new cqd(30, 0.1F, 1))));
/*     */   
/* 699 */   public static final civ<?, ?> cI = a("mushroom_field_vegetation", cjl.Z.b(new cml(() -> bG, () -> bF))
/*     */ 
/*     */       
/* 702 */       .b(b.l));
/*     */   
/*     */   private static <FC extends cma> civ<FC, ?> a(String ☃, civ<FC, ?> civ1) {
/* 705 */     return (civ<FC, ?>)gm.<civ<?, ?>>a(hk.e, ☃, civ1);
/*     */   }
/*     */   
/*     */   public static final class b {
/* 709 */     public static final coo a = new coo(0.002F);
/* 710 */     public static final coo b = new coo(0.02F);
/* 711 */     public static final coo c = new coo(0.05F);
/* 712 */     public static final cpo<clu> d = cqc.r.b(new clu(10));
/*     */     
/* 714 */     public static final cpo<cmg> e = cqc.h.b(clw.b);
/* 715 */     public static final cpo<cmg> f = cqc.j.b(clw.b);
/* 716 */     public static final cpo<cmg> g = cqc.k.b(clw.b);
/* 717 */     public static final cpo<cmg> h = cqc.i.b(clw.b);
/*     */     
/* 719 */     public static final cpo<cmo> i = cqc.l.b(new cmo(10, 20, 128));
/* 720 */     public static final cpo<cmo> j = cqc.l.b(new cmo(4, 8, 128));
/* 721 */     public static final cpo<?> k = cqc.p.b(cmg.c);
/*     */     
/* 723 */     public static final cpo<?> l = e.a();
/* 724 */     public static final cpo<?> m = h.a();
/* 725 */     public static final cpo<?> n = f.a();
/*     */   }
/*     */   
/*     */   public static final class c {
/* 729 */     protected static final ceh a = bup.aR.n();
/* 730 */     protected static final ceh b = bup.aS.n();
/* 731 */     protected static final ceh c = bup.l.n();
/* 732 */     protected static final ceh d = bup.k.n();
/* 733 */     protected static final ceh e = bup.dT.n();
/* 734 */     protected static final ceh f = bup.cE.n();
/* 735 */     protected static final ceh g = bup.cD.n();
/* 736 */     protected static final ceh h = bup.J.n();
/* 737 */     protected static final ceh i = bup.ah.n();
/* 738 */     protected static final ceh j = bup.M.n();
/* 739 */     protected static final ceh k = bup.ak.n();
/* 740 */     protected static final ceh l = bup.K.n();
/* 741 */     protected static final ceh m = bup.ai.n();
/* 742 */     protected static final ceh n = bup.N.n();
/* 743 */     protected static final ceh o = bup.al.n();
/* 744 */     protected static final ceh p = bup.L.n();
/* 745 */     protected static final ceh q = bup.aj.n();
/* 746 */     protected static final ceh r = bup.O.n();
/* 747 */     protected static final ceh s = bup.am.n();
/* 748 */     protected static final ceh t = bup.i.n();
/* 749 */     protected static final ceh u = bup.gZ.n();
/* 750 */     protected static final ceh v = bup.gY.n();
/* 751 */     protected static final ceh w = bup.gV.n();
/* 752 */     protected static final ceh x = bup.gW.n();
/* 753 */     protected static final ceh y = bup.gX.n();
/* 754 */     protected static final ceh z = bup.bC.n();
/* 755 */     protected static final ceh A = bup.bD.n();
/* 756 */     protected static final ceh B = bup.gT.n();
/* 757 */     protected static final ceh C = bup.kV.n();
/* 758 */     protected static final ceh D = bup.bB.n();
/* 759 */     protected static final ceh E = bup.br.n();
/* 760 */     protected static final ceh F = bup.bq.n();
/* 761 */     protected static final ceh G = bup.bp.n();
/* 762 */     protected static final ceh H = bup.aT.n();
/* 763 */     protected static final ceh I = bup.dK.n();
/* 764 */     protected static final ceh J = bup.cK.n();
/* 765 */     protected static final ceh K = bup.mg.n().a(cau.a, Integer.valueOf(3));
/* 766 */     protected static final ceh L = bup.bN.n();
/* 767 */     protected static final ceh M = bup.bO.n();
/* 768 */     protected static final ceh N = bup.cL.n();
/* 769 */     protected static final ceh O = bup.cN.n();
/* 770 */     protected static final ceh P = bup.mB.n();
/* 771 */     protected static final ceh Q = bup.dU.n();
/* 772 */     protected static final ceh R = bup.cC.n();
/* 773 */     protected static final ceh S = bup.cV.n();
/* 774 */     protected static final ceh T = bup.gU.n();
/* 775 */     protected static final ceh U = bup.cF.n();
/* 776 */     protected static final ceh V = bup.cH.n();
/* 777 */     protected static final ceh W = bup.dF.n().a(bxn.f, Boolean.valueOf(false));
/* 778 */     protected static final ceh X = bup.dE.n().a(bxn.e, Boolean.valueOf(true)).a(bxn.f, Boolean.valueOf(false));
/* 779 */     protected static final ceh Y = bup.dG.n().a(bxn.e, Boolean.valueOf(false)).a(bxn.f, Boolean.valueOf(false));
/*     */     
/* 781 */     protected static final cux Z = cuy.c.h();
/* 782 */     protected static final cux aa = cuy.e.h();
/* 783 */     protected static final ceh ab = bup.A.n();
/* 784 */     protected static final ceh ac = bup.B.n();
/* 785 */     protected static final ceh ad = bup.j.n();
/* 786 */     protected static final ceh ae = bup.E.n();
/* 787 */     protected static final ceh af = bup.c.n();
/* 788 */     protected static final ceh ag = bup.e.n();
/* 789 */     protected static final ceh ah = bup.g.n();
/* 790 */     protected static final ceh ai = bup.H.n();
/* 791 */     protected static final ceh aj = bup.G.n();
/* 792 */     protected static final ceh ak = bup.F.n();
/* 793 */     protected static final ceh al = bup.cy.n();
/* 794 */     protected static final ceh am = bup.bT.n();
/* 795 */     protected static final ceh an = bup.aq.n();
/* 796 */     protected static final ceh ao = bup.b.n();
/* 797 */     protected static final ceh ap = bup.ej.n();
/* 798 */     protected static final ceh aq = bup.dy.n();
/* 799 */     protected static final ceh ar = bup.C.n();
/* 800 */     protected static final ceh as = bup.cG.n();
/* 801 */     protected static final ceh at = bup.bJ.n();
/* 802 */     protected static final ceh au = bup.aU.n();
/* 803 */     protected static final ceh av = bup.iJ.n();
/* 804 */     protected static final ceh aw = bup.cM.n();
/* 805 */     protected static final ceh ax = bup.I.n();
/* 806 */     protected static final ceh ay = bup.fx.n();
/* 807 */     protected static final ceh az = bup.np.n();
/* 808 */     protected static final ceh aA = bup.nh.n();
/* 809 */     protected static final ceh aB = bup.cO.n();
/* 810 */     protected static final ceh aC = bup.mv.n();
/* 811 */     protected static final ceh aD = bup.mm.n();
/* 812 */     protected static final ceh aE = bup.mo.n();
/* 813 */     protected static final ceh aF = bup.mp.n();
/*     */   }
/*     */   
/*     */   public static final class a {
/* 817 */     public static final cmn a = (new cmn.a(new cny(kh.c.a), clp.c))
/*     */ 
/*     */ 
/*     */       
/* 821 */       .a(32)
/* 822 */       .d();
/* 823 */     public static final cmn b = (new cmn.a((new cnz())
/* 824 */         .a(kh.c.a, 1).a(kh.c.b, 4), clp.c))
/*     */ 
/*     */       
/* 827 */       .a(32)
/* 828 */       .d();
/* 829 */     public static final cmn c = (new cmn.a((new cnz())
/* 830 */         .a(kh.c.a, 3).a(kh.c.b, 1), clp.c))
/*     */ 
/*     */       
/* 833 */       .b((Set<ceh>)ImmutableSet.of(kh.c.c))
/* 834 */       .a(32)
/* 835 */       .d();
/* 836 */     public static final cmn d = (new cmn.a((new cnz())
/* 837 */         .a(kh.c.F, 2).a(kh.c.G, 1), clp.c))
/*     */ 
/*     */       
/* 840 */       .a(64)
/* 841 */       .d();
/* 842 */     public static final cmn e = (new cmn.a(new cny(kh.c.H), clp.c))
/*     */ 
/*     */ 
/*     */       
/* 846 */       .a(4)
/* 847 */       .d();
/* 848 */     public static final cmn f = (new cmn.a(new cny(kh.c.K), clp.c))
/*     */ 
/*     */ 
/*     */       
/* 852 */       .a(64)
/* 853 */       .a((Set<buo>)ImmutableSet.of(kh.c.t.b()))
/* 854 */       .b()
/* 855 */       .d();
/* 856 */     public static final cmn g = (new cmn.a(new cny(kh.c.v), new clo()))
/*     */ 
/*     */ 
/*     */       
/* 860 */       .a(64)
/* 861 */       .b()
/* 862 */       .d();
/* 863 */     public static final cmn h = (new cmn.a(new cny(kh.c.V), new cln(2, 2)))
/*     */ 
/*     */ 
/*     */       
/* 867 */       .a(20)
/* 868 */       .b(4)
/* 869 */       .c(0)
/* 870 */       .d(4)
/* 871 */       .b()
/* 872 */       .c()
/* 873 */       .d();
/* 874 */     public static final cmw i = new cmw(kh.c.aa, true, 4, 1, (Set<buo>)ImmutableSet.of(bup.b, bup.c, bup.e, bup.g));
/* 875 */     public static final cmw j = new cmw(kh.c.aa, false, 5, 0, (Set<buo>)ImmutableSet.of(bup.cL));
/* 876 */     public static final clr k = new clr((new cnz())
/* 877 */         .a(kh.c.P, 87)
/* 878 */         .a(kh.c.aC, 11)
/* 879 */         .a(kh.c.aD, 1));
/*     */     
/* 881 */     public static final clr l = new clr((new cnz())
/* 882 */         .a(kh.c.aE, 85)
/* 883 */         .a(kh.c.P, 1)
/* 884 */         .a(kh.c.aD, 13)
/* 885 */         .a(kh.c.aC, 1));
/*     */     
/* 887 */     public static final clr m = new clr(new cny(kh.c.aF));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\kh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */