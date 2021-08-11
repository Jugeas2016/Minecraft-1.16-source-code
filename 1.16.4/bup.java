/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.function.ToIntFunction;
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
/*     */ public class bup
/*     */ {
/*     */   private static ToIntFunction<ceh> a(int ☃) {
/*  39 */     return ceh1 -> ((Boolean)ceh1.c(cex.r)).booleanValue() ? ☃ : 0;
/*     */   }
/*     */   
/*     */   private static Boolean a(ceh ☃, brc brc1, fx fx1, aqe<?> aqe1) {
/*  43 */     return Boolean.valueOf(false);
/*     */   }
/*     */   
/*     */   private static Boolean b(ceh ☃, brc brc1, fx fx1, aqe<?> aqe1) {
/*  47 */     return Boolean.valueOf(true);
/*     */   }
/*     */   
/*     */   private static Boolean c(ceh ☃, brc brc1, fx fx1, aqe<?> aqe1) {
/*  51 */     return Boolean.valueOf((aqe1 == aqe.ac || aqe1 == aqe.af));
/*     */   }
/*     */   
/*     */   private static buj a(bkx ☃) {
/*  55 */     return new buj(☃, ceg.c.a(cva.C, ceh1 -> (ceh1.c(buj.a) == cev.b) ? ☃.f() : cvb.e).a(cae.a).d(0.2F).b());
/*     */   }
/*     */   
/*     */   private static bzl a(cvb ☃, cvb cvb1) {
/*  59 */     return new bzl(ceg.c.a(cva.y, ceh1 -> (ceh1.c(bzl.e) == gc.a.b) ? ☃ : cvb1).d(2.0F).a(cae.a));
/*     */   }
/*     */   
/*     */   private static buo a(cvb ☃) {
/*  63 */     return new bzl(ceg.c.a(cva.z, ceh1 -> ☃).d(2.0F).a(cae.z));
/*     */   }
/*     */   
/*     */   private static boolean a(ceh ☃, brc brc1, fx fx1) {
/*  67 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean b(ceh ☃, brc brc1, fx fx1) {
/*  71 */     return false;
/*     */   }
/*     */   
/*     */   private static cai b(bkx ☃) {
/*  75 */     return new cai(☃, ceg.c.a(cva.F, ☃).d(0.3F).a(cae.g).b().a(bup::a).a(bup::b).b(bup::b).c(bup::b));
/*     */   }
/*     */   
/*     */   private static bxx b() {
/*  79 */     return new bxx(ceg.c.a(cva.E).d(0.2F).d().a(cae.c).b().a(bup::c).b(bup::b).c(bup::b));
/*     */   }
/*     */   
/*     */   private static bzs a(bkx ☃, ceg.c c1) {
/*  83 */     ceg.e e = (☃, brc1, fx1) -> {
/*     */         ccj ccj = brc1.c(fx1);
/*     */         if (!(ccj instanceof cde)) {
/*     */           return true;
/*     */         }
/*     */         cde cde = (cde)ccj;
/*     */         return cde.l();
/*     */       };
/*  91 */     return new bzs(☃, c1.d(2.0F).e().b().b(e).c(e));
/*     */   }
/*     */   
/*     */   private static cea a(boolean ☃) {
/*  95 */     ceg.e e = (☃, brc1, fx1) -> !((Boolean)☃.c(cea.b)).booleanValue();
/*  96 */     return new cea(☃, ceg.c.a(cva.N).d(1.5F).a(bup::b).b(e).c(e));
/*     */   }
/*     */   
/*  99 */   public static final buo a = a("air", new btr(ceg.c.a(cva.a).a().f().g()));
/* 100 */   public static final buo b = a("stone", new buo(ceg.c.a(cva.I, cvb.m).h().a(1.5F, 6.0F)));
/* 101 */   public static final buo c = a("granite", new buo(ceg.c.a(cva.I, cvb.l).h().a(1.5F, 6.0F)));
/* 102 */   public static final buo d = a("polished_granite", new buo(ceg.c.a(cva.I, cvb.l).h().a(1.5F, 6.0F)));
/* 103 */   public static final buo e = a("diorite", new buo(ceg.c.a(cva.I, cvb.p).h().a(1.5F, 6.0F)));
/* 104 */   public static final buo f = a("polished_diorite", new buo(ceg.c.a(cva.I, cvb.p).h().a(1.5F, 6.0F)));
/* 105 */   public static final buo g = a("andesite", new buo(ceg.c.a(cva.I, cvb.m).h().a(1.5F, 6.0F)));
/* 106 */   public static final buo h = a("polished_andesite", new buo(ceg.c.a(cva.I, cvb.m).h().a(1.5F, 6.0F)));
/* 107 */   public static final buo i = a("grass_block", new bxb(ceg.c.a(cva.t).d().d(0.6F).a(cae.c)));
/* 108 */   public static final buo j = a("dirt", new buo(ceg.c.a(cva.s, cvb.l).d(0.5F).a(cae.b)));
/* 109 */   public static final buo k = a("coarse_dirt", new buo(ceg.c.a(cva.s, cvb.l).d(0.5F).a(cae.b)));
/* 110 */   public static final buo l = a("podzol", new cab(ceg.c.a(cva.s, cvb.J).d(0.5F).a(cae.b)));
/* 111 */   public static final buo m = a("cobblestone", new buo(ceg.c.a(cva.I).h().a(2.0F, 6.0F)));
/* 112 */   public static final buo n = a("oak_planks", new buo(ceg.c.a(cva.y, cvb.o).a(2.0F, 3.0F).a(cae.a)));
/* 113 */   public static final buo o = a("spruce_planks", new buo(ceg.c.a(cva.y, cvb.J).a(2.0F, 3.0F).a(cae.a)));
/* 114 */   public static final buo p = a("birch_planks", new buo(ceg.c.a(cva.y, cvb.d).a(2.0F, 3.0F).a(cae.a)));
/* 115 */   public static final buo q = a("jungle_planks", new buo(ceg.c.a(cva.y, cvb.l).a(2.0F, 3.0F).a(cae.a)));
/* 116 */   public static final buo r = a("acacia_planks", new buo(ceg.c.a(cva.y, cvb.q).a(2.0F, 3.0F).a(cae.a)));
/* 117 */   public static final buo s = a("dark_oak_planks", new buo(ceg.c.a(cva.y, cvb.B).a(2.0F, 3.0F).a(cae.a)));
/* 118 */   public static final buo t = a("oak_sapling", new bzo(new cdv(), ceg.c.a(cva.e).a().d().c().a(cae.c)));
/* 119 */   public static final buo u = a("spruce_sapling", new bzo(new cdw(), ceg.c.a(cva.e).a().d().c().a(cae.c)));
/* 120 */   public static final buo v = a("birch_sapling", new bzo(new cds(), ceg.c.a(cva.e).a().d().c().a(cae.c)));
/* 121 */   public static final buo w = a("jungle_sapling", new bzo(new cdu(), ceg.c.a(cva.e).a().d().c().a(cae.c)));
/* 122 */   public static final buo x = a("acacia_sapling", new bzo(new cdr(), ceg.c.a(cva.e).a().d().c().a(cae.c)));
/* 123 */   public static final buo y = a("dark_oak_sapling", new bzo(new cdt(), ceg.c.a(cva.e).a().d().c().a(cae.c)));
/* 124 */   public static final buo z = a("bedrock", new buo(ceg.c.a(cva.I).a(-1.0F, 3600000.0F).f().a(bup::a)));
/* 125 */   public static final buo A = a("water", new byb(cuy.c, ceg.c.a(cva.j).a().d(100.0F).f()));
/* 126 */   public static final buo B = a("lava", new byb(cuy.e, ceg.c.a(cva.l).a().d().d(100.0F).a(☃ -> 15).f()));
/* 127 */   public static final buo C = a("sand", new bzn(14406560, ceg.c.a(cva.v, cvb.d).d(0.5F).a(cae.i)));
/* 128 */   public static final buo D = a("red_sand", new bzn(11098145, ceg.c.a(cva.v, cvb.q).d(0.5F).a(cae.i)));
/* 129 */   public static final buo E = a("gravel", new bxd(ceg.c.a(cva.v, cvb.m).d(0.6F).a(cae.b)));
/* 130 */   public static final buo F = a("gold_ore", new byr(ceg.c.a(cva.I).h().a(3.0F, 3.0F)));
/* 131 */   public static final buo G = a("iron_ore", new byr(ceg.c.a(cva.I).h().a(3.0F, 3.0F)));
/* 132 */   public static final buo H = a("coal_ore", new byr(ceg.c.a(cva.I).h().a(3.0F, 3.0F)));
/* 133 */   public static final buo I = a("nether_gold_ore", new byr(ceg.c.a(cva.I, cvb.K).h().a(3.0F, 3.0F).a(cae.T)));
/* 134 */   public static final buo J = a("oak_log", a(cvb.o, cvb.J));
/* 135 */   public static final buo K = a("spruce_log", a(cvb.J, cvb.B));
/* 136 */   public static final buo L = a("birch_log", a(cvb.d, cvb.p));
/* 137 */   public static final buo M = a("jungle_log", a(cvb.l, cvb.J));
/* 138 */   public static final buo N = a("acacia_log", a(cvb.q, cvb.m));
/* 139 */   public static final buo O = a("dark_oak_log", a(cvb.B, cvb.B));
/* 140 */   public static final buo P = a("stripped_spruce_log", a(cvb.J, cvb.J));
/* 141 */   public static final buo Q = a("stripped_birch_log", a(cvb.d, cvb.d));
/* 142 */   public static final buo R = a("stripped_jungle_log", a(cvb.l, cvb.l));
/* 143 */   public static final buo S = a("stripped_acacia_log", a(cvb.q, cvb.q));
/* 144 */   public static final buo T = a("stripped_dark_oak_log", a(cvb.B, cvb.B));
/* 145 */   public static final buo U = a("stripped_oak_log", a(cvb.o, cvb.o));
/* 146 */   public static final buo V = a("oak_wood", new bzl(ceg.c.a(cva.y, cvb.o).d(2.0F).a(cae.a)));
/* 147 */   public static final buo W = a("spruce_wood", new bzl(ceg.c.a(cva.y, cvb.J).d(2.0F).a(cae.a)));
/* 148 */   public static final buo X = a("birch_wood", new bzl(ceg.c.a(cva.y, cvb.d).d(2.0F).a(cae.a)));
/* 149 */   public static final buo Y = a("jungle_wood", new bzl(ceg.c.a(cva.y, cvb.l).d(2.0F).a(cae.a)));
/* 150 */   public static final buo Z = a("acacia_wood", new bzl(ceg.c.a(cva.y, cvb.w).d(2.0F).a(cae.a)));
/* 151 */   public static final buo aa = a("dark_oak_wood", new bzl(ceg.c.a(cva.y, cvb.B).d(2.0F).a(cae.a)));
/* 152 */   public static final buo ab = a("stripped_oak_wood", new bzl(ceg.c.a(cva.y, cvb.o).d(2.0F).a(cae.a)));
/* 153 */   public static final buo ac = a("stripped_spruce_wood", new bzl(ceg.c.a(cva.y, cvb.J).d(2.0F).a(cae.a)));
/* 154 */   public static final buo ad = a("stripped_birch_wood", new bzl(ceg.c.a(cva.y, cvb.d).d(2.0F).a(cae.a)));
/* 155 */   public static final buo ae = a("stripped_jungle_wood", new bzl(ceg.c.a(cva.y, cvb.l).d(2.0F).a(cae.a)));
/* 156 */   public static final buo af = a("stripped_acacia_wood", new bzl(ceg.c.a(cva.y, cvb.q).d(2.0F).a(cae.a)));
/* 157 */   public static final buo ag = a("stripped_dark_oak_wood", new bzl(ceg.c.a(cva.y, cvb.B).d(2.0F).a(cae.a)));
/* 158 */   public static final buo ah = a("oak_leaves", b());
/* 159 */   public static final buo ai = a("spruce_leaves", b());
/* 160 */   public static final buo aj = a("birch_leaves", b());
/* 161 */   public static final buo ak = a("jungle_leaves", b());
/* 162 */   public static final buo al = a("acacia_leaves", b());
/* 163 */   public static final buo am = a("dark_oak_leaves", b());
/* 164 */   public static final buo an = a("sponge", new cag(ceg.c.a(cva.w).d(0.6F).a(cae.c)));
/* 165 */   public static final buo ao = a("wet_sponge", new cbt(ceg.c.a(cva.w).d(0.6F).a(cae.c)));
/* 166 */   public static final buo ap = a("glass", new bwz(ceg.c.a(cva.F).d(0.3F).a(cae.g).b().a(bup::a).a(bup::b).b(bup::b).c(bup::b)));
/* 167 */   public static final buo aq = a("lapis_ore", new byr(ceg.c.a(cva.I).h().a(3.0F, 3.0F)));
/* 168 */   public static final buo ar = a("lapis_block", new buo(ceg.c.a(cva.J, cvb.H).h().a(3.0F, 3.0F)));
/* 169 */   public static final buo as = a("dispenser", new bwa(ceg.c.a(cva.I).h().d(3.5F)));
/* 170 */   public static final buo at = a("sandstone", new buo(ceg.c.a(cva.I, cvb.d).h().d(0.8F)));
/* 171 */   public static final buo au = a("chiseled_sandstone", new buo(ceg.c.a(cva.I, cvb.d).h().d(0.8F)));
/* 172 */   public static final buo av = a("cut_sandstone", new buo(ceg.c.a(cva.I, cvb.d).h().d(0.8F)));
/* 173 */   public static final buo aw = a("note_block", new byo(ceg.c.a(cva.y).a(cae.a).d(0.8F)));
/* 174 */   public static final buo ax = a("white_bed", a(bkx.a));
/* 175 */   public static final buo ay = a("orange_bed", a(bkx.b));
/* 176 */   public static final buo az = a("magenta_bed", a(bkx.c));
/* 177 */   public static final buo aA = a("light_blue_bed", a(bkx.d));
/* 178 */   public static final buo aB = a("yellow_bed", a(bkx.e));
/* 179 */   public static final buo aC = a("lime_bed", a(bkx.f));
/* 180 */   public static final buo aD = a("pink_bed", a(bkx.g));
/* 181 */   public static final buo aE = a("gray_bed", a(bkx.h));
/* 182 */   public static final buo aF = a("light_gray_bed", a(bkx.i));
/* 183 */   public static final buo aG = a("cyan_bed", a(bkx.j));
/* 184 */   public static final buo aH = a("purple_bed", a(bkx.k));
/* 185 */   public static final buo aI = a("blue_bed", a(bkx.l));
/* 186 */   public static final buo aJ = a("brown_bed", a(bkx.m));
/* 187 */   public static final buo aK = a("green_bed", a(bkx.n));
/* 188 */   public static final buo aL = a("red_bed", a(bkx.o));
/* 189 */   public static final buo aM = a("black_bed", a(bkx.p));
/* 190 */   public static final buo aN = a("powered_rail", new byx(ceg.c.a(cva.o).a().d(0.7F).a(cae.f)));
/* 191 */   public static final buo aO = a("detector_rail", new bvx(ceg.c.a(cva.o).a().d(0.7F).a(cae.f)));
/* 192 */   public static final buo aP = a("sticky_piston", a(true));
/* 193 */   public static final buo aQ = a("cobweb", new cbp(ceg.c.a(cva.p).a().h().d(4.0F)));
/* 194 */   public static final buo aR = a("grass", new caw(ceg.c.a(cva.g).a().c().a(cae.c)));
/* 195 */   public static final buo aS = a("fern", new caw(ceg.c.a(cva.g).a().c().a(cae.c)));
/* 196 */   public static final buo aT = a("dead_bush", new bvw(ceg.c.a(cva.g, cvb.o).a().c().a(cae.c)));
/* 197 */   public static final buo aU = a("seagrass", new bzr(ceg.c.a(cva.i).a().c().a(cae.o)));
/* 198 */   public static final buo aV = a("tall_seagrass", new cax(ceg.c.a(cva.i).a().c().a(cae.o)));
/* 199 */   public static final buo aW = a("piston", a(false));
/* 200 */   public static final buo aX = a("piston_head", new ceb(ceg.c.a(cva.N).d(1.5F).f()));
/* 201 */   public static final buo aY = a("white_wool", new buo(ceg.c.a(cva.C, cvb.j).d(0.8F).a(cae.h)));
/* 202 */   public static final buo aZ = a("orange_wool", new buo(ceg.c.a(cva.C, cvb.q).d(0.8F).a(cae.h)));
/* 203 */   public static final buo ba = a("magenta_wool", new buo(ceg.c.a(cva.C, cvb.r).d(0.8F).a(cae.h)));
/* 204 */   public static final buo bb = a("light_blue_wool", new buo(ceg.c.a(cva.C, cvb.s).d(0.8F).a(cae.h)));
/* 205 */   public static final buo bc = a("yellow_wool", new buo(ceg.c.a(cva.C, cvb.t).d(0.8F).a(cae.h)));
/* 206 */   public static final buo bd = a("lime_wool", new buo(ceg.c.a(cva.C, cvb.u).d(0.8F).a(cae.h)));
/* 207 */   public static final buo be = a("pink_wool", new buo(ceg.c.a(cva.C, cvb.v).d(0.8F).a(cae.h)));
/* 208 */   public static final buo bf = a("gray_wool", new buo(ceg.c.a(cva.C, cvb.w).d(0.8F).a(cae.h)));
/* 209 */   public static final buo bg = a("light_gray_wool", new buo(ceg.c.a(cva.C, cvb.x).d(0.8F).a(cae.h)));
/* 210 */   public static final buo bh = a("cyan_wool", new buo(ceg.c.a(cva.C, cvb.y).d(0.8F).a(cae.h)));
/* 211 */   public static final buo bi = a("purple_wool", new buo(ceg.c.a(cva.C, cvb.z).d(0.8F).a(cae.h)));
/* 212 */   public static final buo bj = a("blue_wool", new buo(ceg.c.a(cva.C, cvb.A).d(0.8F).a(cae.h)));
/* 213 */   public static final buo bk = a("brown_wool", new buo(ceg.c.a(cva.C, cvb.B).d(0.8F).a(cae.h)));
/* 214 */   public static final buo bl = a("green_wool", new buo(ceg.c.a(cva.C, cvb.C).d(0.8F).a(cae.h)));
/* 215 */   public static final buo bm = a("red_wool", new buo(ceg.c.a(cva.C, cvb.D).d(0.8F).a(cae.h)));
/* 216 */   public static final buo bn = a("black_wool", new buo(ceg.c.a(cva.C, cvb.E).d(0.8F).a(cae.h)));
/* 217 */   public static final buo bo = a("moving_piston", new cdz(ceg.c.a(cva.N).d(-1.0F).e().f().b().a(bup::b).b(bup::b).c(bup::b)));
/* 218 */   public static final buo bp = a("dandelion", new bwu(apw.w, 7, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 219 */   public static final buo bq = a("poppy", new bwu(apw.p, 5, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 220 */   public static final buo br = a("blue_orchid", new bwu(apw.w, 7, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 221 */   public static final buo bs = a("allium", new bwu(apw.l, 4, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 222 */   public static final buo bt = a("azure_bluet", new bwu(apw.o, 8, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 223 */   public static final buo bu = a("red_tulip", new bwu(apw.r, 9, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 224 */   public static final buo bv = a("orange_tulip", new bwu(apw.r, 9, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 225 */   public static final buo bw = a("white_tulip", new bwu(apw.r, 9, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 226 */   public static final buo bx = a("pink_tulip", new bwu(apw.r, 9, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 227 */   public static final buo by = a("oxeye_daisy", new bwu(apw.j, 8, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 228 */   public static final buo bz = a("cornflower", new bwu(apw.h, 6, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 229 */   public static final buo bA = a("wither_rose", new cbu(apw.t, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 230 */   public static final buo bB = a("lily_of_the_valley", new bwu(apw.s, 12, ceg.c.a(cva.e).a().c().a(cae.c)));
/* 231 */   public static final buo bC = a("brown_mushroom", new byh(ceg.c.a(cva.e, cvb.B).a().d().c().a(cae.c).a(☃ -> 1).d(bup::a)));
/* 232 */   public static final buo bD = a("red_mushroom", new byh(ceg.c.a(cva.e, cvb.D).a().d().c().a(cae.c).d(bup::a)));
/* 233 */   public static final buo bE = a("gold_block", new buo(ceg.c.a(cva.J, cvb.F).h().a(3.0F, 6.0F).a(cae.f)));
/* 234 */   public static final buo bF = a("iron_block", new buo(ceg.c.a(cva.J, cvb.h).h().a(5.0F, 6.0F).a(cae.f)));
/* 235 */   public static final buo bG = a("bricks", new buo(ceg.c.a(cva.I, cvb.D).h().a(2.0F, 6.0F)));
/* 236 */   public static final buo bH = a("tnt", new caz(ceg.c.a(cva.D).c().a(cae.c)));
/* 237 */   public static final buo bI = a("bookshelf", new buo(ceg.c.a(cva.y).d(1.5F).a(cae.a)));
/* 238 */   public static final buo bJ = a("mossy_cobblestone", new buo(ceg.c.a(cva.I).h().a(2.0F, 6.0F)));
/* 239 */   public static final buo bK = a("obsidian", new buo(ceg.c.a(cva.I, cvb.E).h().a(50.0F, 1200.0F)));
/* 240 */   public static final buo bL = a("torch", new cba(ceg.c.a(cva.o).a().c().a(☃ -> 14).a(cae.a), hh.A));
/* 241 */   public static final buo bM = a("wall_torch", new cbn(ceg.c.a(cva.o).a().c().a(☃ -> 14).a(cae.a).a(bL), hh.A));
/* 242 */   public static final buo bN = a("fire", new bws(ceg.c.a(cva.n, cvb.f).a().c().a(☃ -> 15).a(cae.h)));
/* 243 */   public static final buo bO = a("soul_fire", new cac(ceg.c.a(cva.n, cvb.s).a().c().a(☃ -> 10).a(cae.h)));
/* 244 */   public static final buo bP = a("spawner", new caf(ceg.c.a(cva.I).h().d(5.0F).a(cae.f).b()));
/* 245 */   public static final buo bQ = a("oak_stairs", new cak(n.n(), ceg.c.a(n)));
/* 246 */   public static final buo bR = a("chest", new bve(ceg.c.a(cva.y).d(2.5F).a(cae.a), () -> cck.b));
/* 247 */   public static final buo bS = a("redstone_wire", new bzd(ceg.c.a(cva.o).a().c()));
/* 248 */   public static final buo bT = a("diamond_ore", new byr(ceg.c.a(cva.I).h().a(3.0F, 3.0F)));
/* 249 */   public static final buo bU = a("diamond_block", new buo(ceg.c.a(cva.J, cvb.G).h().a(5.0F, 6.0F).a(cae.f)));
/* 250 */   public static final buo bV = a("crafting_table", new bvr(ceg.c.a(cva.y).d(2.5F).a(cae.a)));
/* 251 */   public static final buo bW = a("wheat", new bvs(ceg.c.a(cva.e).a().d().c().a(cae.u)));
/* 252 */   public static final buo bX = a("farmland", new bwp(ceg.c.a(cva.s).d().d(0.6F).a(cae.b).c(bup::a).b(bup::a)));
/* 253 */   public static final buo bY = a("furnace", new bwy(ceg.c.a(cva.I).h().d(3.5F).a(a(13))));
/*     */   
/* 255 */   public static final buo bZ = a("oak_sign", new cal(ceg.c.a(cva.y).a().d(1.0F).a(cae.a), cfq.a));
/* 256 */   public static final buo ca = a("spruce_sign", new cal(ceg.c.a(cva.y, K.s()).a().d(1.0F).a(cae.a), cfq.b));
/* 257 */   public static final buo cb = a("birch_sign", new cal(ceg.c.a(cva.y, cvb.d).a().d(1.0F).a(cae.a), cfq.c));
/* 258 */   public static final buo cc = a("acacia_sign", new cal(ceg.c.a(cva.y, cvb.q).a().d(1.0F).a(cae.a), cfq.d));
/* 259 */   public static final buo cd = a("jungle_sign", new cal(ceg.c.a(cva.y, M.s()).a().d(1.0F).a(cae.a), cfq.e));
/* 260 */   public static final buo ce = a("dark_oak_sign", new cal(ceg.c.a(cva.y, O.s()).a().d(1.0F).a(cae.a), cfq.f));
/* 261 */   public static final buo cf = a("oak_door", new bwb(ceg.c.a(cva.y, n.s()).d(3.0F).a(cae.a).b()));
/* 262 */   public static final buo cg = a("ladder", new bxv(ceg.c.a(cva.o).d(0.4F).a(cae.k).b()));
/* 263 */   public static final buo ch = a("rail", new bza(ceg.c.a(cva.o).a().d(0.7F).a(cae.f)));
/* 264 */   public static final buo ci = a("cobblestone_stairs", new cak(m.n(), ceg.c.a(m)));
/* 265 */   public static final buo cj = a("oak_wall_sign", new cbl(ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(bZ), cfq.a));
/* 266 */   public static final buo ck = a("spruce_wall_sign", new cbl(ceg.c.a(cva.y, K.s()).a().d(1.0F).a(cae.a).a(ca), cfq.b));
/* 267 */   public static final buo cl = a("birch_wall_sign", new cbl(ceg.c.a(cva.y, cvb.d).a().d(1.0F).a(cae.a).a(cb), cfq.c));
/* 268 */   public static final buo cm = a("acacia_wall_sign", new cbl(ceg.c.a(cva.y, cvb.q).a().d(1.0F).a(cae.a).a(cc), cfq.d));
/* 269 */   public static final buo cn = a("jungle_wall_sign", new cbl(ceg.c.a(cva.y, M.s()).a().d(1.0F).a(cae.a).a(cd), cfq.e));
/* 270 */   public static final buo co = a("dark_oak_wall_sign", new cbl(ceg.c.a(cva.y, O.s()).a().d(1.0F).a(cae.a).a(ce), cfq.f));
/* 271 */   public static final buo cp = a("lever", new bya(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 272 */   public static final buo cq = a("stone_pressure_plate", new byy(byy.a.b, ceg.c.a(cva.I).h().a().d(0.5F)));
/* 273 */   public static final buo cr = a("iron_door", new bwb(ceg.c.a(cva.J, cvb.h).h().d(5.0F).a(cae.f).b()));
/* 274 */   public static final buo cs = a("oak_pressure_plate", new byy(byy.a.a, ceg.c.a(cva.y, n.s()).a().d(0.5F).a(cae.a)));
/* 275 */   public static final buo ct = a("spruce_pressure_plate", new byy(byy.a.a, ceg.c.a(cva.y, o.s()).a().d(0.5F).a(cae.a)));
/* 276 */   public static final buo cu = a("birch_pressure_plate", new byy(byy.a.a, ceg.c.a(cva.y, p.s()).a().d(0.5F).a(cae.a)));
/* 277 */   public static final buo cv = a("jungle_pressure_plate", new byy(byy.a.a, ceg.c.a(cva.y, q.s()).a().d(0.5F).a(cae.a)));
/* 278 */   public static final buo cw = a("acacia_pressure_plate", new byy(byy.a.a, ceg.c.a(cva.y, r.s()).a().d(0.5F).a(cae.a)));
/* 279 */   public static final buo cx = a("dark_oak_pressure_plate", new byy(byy.a.a, ceg.c.a(cva.y, s.s()).a().d(0.5F).a(cae.a)));
/* 280 */   public static final buo cy = a("redstone_ore", new bzc(ceg.c.a(cva.I).h().d().a(a(9)).a(3.0F, 3.0F)));
/* 281 */   public static final buo cz = a("redstone_torch", new bzf(ceg.c.a(cva.o).a().c().a(a(7)).a(cae.a)));
/* 282 */   public static final buo cA = a("redstone_wall_torch", new bzg(ceg.c.a(cva.o).a().c().a(a(7)).a(cae.a).a(cz)));
/* 283 */   public static final buo cB = a("stone_button", new cao(ceg.c.a(cva.o).a().d(0.5F)));
/* 284 */   public static final buo cC = a("snow", new caa(ceg.c.a(cva.m).d().d(0.1F).h().a(cae.j))); public static final buo cD; static {
/* 285 */     cD = a("ice", new bxo(ceg.c.a(cva.G).a(0.98F).d().d(0.5F).a(cae.g).b().a((☃, brc1, fx1, aqe1) -> (aqe1 == aqe.al))));
/* 286 */   } public static final buo cE = a("snow_block", new buo(ceg.c.a(cva.K).h().d(0.2F).a(cae.j)));
/* 287 */   public static final buo cF = a("cactus", new buw(ceg.c.a(cva.H).d().d(0.4F).a(cae.h)));
/* 288 */   public static final buo cG = a("clay", new buo(ceg.c.a(cva.r).d(0.6F).a(cae.b)));
/* 289 */   public static final buo cH = a("sugar_cane", new cas(ceg.c.a(cva.e).a().d().c().a(cae.c)));
/* 290 */   public static final buo cI = a("jukebox", new bxs(ceg.c.a(cva.y, cvb.l).a(2.0F, 6.0F)));
/* 291 */   public static final buo cJ = a("oak_fence", new bwq(ceg.c.a(cva.y, n.s()).a(2.0F, 3.0F).a(cae.a)));
/* 292 */   public static final buo cK = a("pumpkin", new byz(ceg.c.a(cva.P, cvb.q).d(1.0F).a(cae.a)));
/* 293 */   public static final buo cL = a("netherrack", new byn(ceg.c.a(cva.I, cvb.K).h().d(0.4F).a(cae.K)));
/* 294 */   public static final buo cM = a("soul_sand", new cad(ceg.c.a(cva.v, cvb.B).d(0.5F).b(0.4F).a(cae.G).a(bup::b).a(bup::a).c(bup::a).b(bup::a)));
/* 295 */   public static final buo cN = a("soul_soil", new buo(ceg.c.a(cva.s, cvb.B).d(0.5F).a(cae.H)));
/* 296 */   public static final buo cO = a("basalt", new bzl(ceg.c.a(cva.I, cvb.E).h().a(1.25F, 4.2F).a(cae.I)));
/* 297 */   public static final buo cP = a("polished_basalt", new bzl(ceg.c.a(cva.I, cvb.E).h().a(1.25F, 4.2F).a(cae.I)));
/* 298 */   public static final buo cQ = a("soul_torch", new cba(ceg.c.a(cva.o).a().c().a(☃ -> 10).a(cae.a), hh.B));
/* 299 */   public static final buo cR = a("soul_wall_torch", new cbn(ceg.c.a(cva.o).a().c().a(☃ -> 10).a(cae.a).a(cQ), hh.B));
/* 300 */   public static final buo cS = a("glowstone", new buo(ceg.c.a(cva.F, cvb.d).d(0.3F).a(cae.g).a(☃ -> 15)));
/* 301 */   public static final buo cT = a("nether_portal", new byj(ceg.c.a(cva.c).a().d().d(-1.0F).a(cae.g).a(☃ -> 11)));
/* 302 */   public static final buo cU = a("carved_pumpkin", new bvb(ceg.c.a(cva.P, cvb.q).d(1.0F).a(cae.a).a(bup::b)));
/* 303 */   public static final buo cV = a("jack_o_lantern", new bvb(ceg.c.a(cva.P, cvb.q).d(1.0F).a(cae.a).a(☃ -> 15).a(bup::b)));
/* 304 */   public static final buo cW = a("cake", new bux(ceg.c.a(cva.R).d(0.5F).a(cae.h)));
/* 305 */   public static final buo cX = a("repeater", new bzi(ceg.c.a(cva.o).c().a(cae.a)));
/* 306 */   public static final buo cY = a("white_stained_glass", b(bkx.a));
/* 307 */   public static final buo cZ = a("orange_stained_glass", b(bkx.b));
/* 308 */   public static final buo da = a("magenta_stained_glass", b(bkx.c));
/* 309 */   public static final buo db = a("light_blue_stained_glass", b(bkx.d));
/* 310 */   public static final buo dc = a("yellow_stained_glass", b(bkx.e));
/* 311 */   public static final buo dd = a("lime_stained_glass", b(bkx.f));
/* 312 */   public static final buo de = a("pink_stained_glass", b(bkx.g));
/* 313 */   public static final buo df = a("gray_stained_glass", b(bkx.h));
/* 314 */   public static final buo dg = a("light_gray_stained_glass", b(bkx.i));
/* 315 */   public static final buo dh = a("cyan_stained_glass", b(bkx.j));
/* 316 */   public static final buo di = a("purple_stained_glass", b(bkx.k));
/* 317 */   public static final buo dj = a("blue_stained_glass", b(bkx.l));
/* 318 */   public static final buo dk = a("brown_stained_glass", b(bkx.m));
/* 319 */   public static final buo dl = a("green_stained_glass", b(bkx.n));
/* 320 */   public static final buo dm = a("red_stained_glass", b(bkx.o));
/* 321 */   public static final buo dn = a("black_stained_glass", b(bkx.p));
/* 322 */   public static final buo do = a("oak_trapdoor", new cbb(ceg.c.a(cva.y, cvb.o).d(3.0F).a(cae.a).b().a(bup::a)));
/* 323 */   public static final buo dp = a("spruce_trapdoor", new cbb(ceg.c.a(cva.y, cvb.J).d(3.0F).a(cae.a).b().a(bup::a)));
/* 324 */   public static final buo dq = a("birch_trapdoor", new cbb(ceg.c.a(cva.y, cvb.d).d(3.0F).a(cae.a).b().a(bup::a)));
/* 325 */   public static final buo dr = a("jungle_trapdoor", new cbb(ceg.c.a(cva.y, cvb.l).d(3.0F).a(cae.a).b().a(bup::a)));
/* 326 */   public static final buo ds = a("acacia_trapdoor", new cbb(ceg.c.a(cva.y, cvb.q).d(3.0F).a(cae.a).b().a(bup::a)));
/* 327 */   public static final buo dt = a("dark_oak_trapdoor", new cbb(ceg.c.a(cva.y, cvb.B).d(3.0F).a(cae.a).b().a(bup::a)));
/* 328 */   public static final buo du = a("stone_bricks", new buo(ceg.c.a(cva.I).h().a(1.5F, 6.0F)));
/* 329 */   public static final buo dv = a("mossy_stone_bricks", new buo(ceg.c.a(cva.I).h().a(1.5F, 6.0F)));
/* 330 */   public static final buo dw = a("cracked_stone_bricks", new buo(ceg.c.a(cva.I).h().a(1.5F, 6.0F)));
/* 331 */   public static final buo dx = a("chiseled_stone_bricks", new buo(ceg.c.a(cva.I).h().a(1.5F, 6.0F)));
/* 332 */   public static final buo dy = a("infested_stone", new bxp(b, ceg.c.a(cva.r).a(0.0F, 0.75F)));
/* 333 */   public static final buo dz = a("infested_cobblestone", new bxp(m, ceg.c.a(cva.r).a(0.0F, 0.75F)));
/* 334 */   public static final buo dA = a("infested_stone_bricks", new bxp(du, ceg.c.a(cva.r).a(0.0F, 0.75F)));
/* 335 */   public static final buo dB = a("infested_mossy_stone_bricks", new bxp(dv, ceg.c.a(cva.r).a(0.0F, 0.75F)));
/* 336 */   public static final buo dC = a("infested_cracked_stone_bricks", new bxp(dw, ceg.c.a(cva.r).a(0.0F, 0.75F)));
/* 337 */   public static final buo dD = a("infested_chiseled_stone_bricks", new bxp(dx, ceg.c.a(cva.r).a(0.0F, 0.75F)));
/* 338 */   public static final buo dE = a("brown_mushroom_block", new bxn(ceg.c.a(cva.y, cvb.l).d(0.2F).a(cae.a)));
/* 339 */   public static final buo dF = a("red_mushroom_block", new bxn(ceg.c.a(cva.y, cvb.D).d(0.2F).a(cae.a)));
/* 340 */   public static final buo dG = a("mushroom_stem", new bxn(ceg.c.a(cva.y, cvb.e).d(0.2F).a(cae.a)));
/* 341 */   public static final buo dH = a("iron_bars", new bxq(ceg.c.a(cva.J, cvb.b).h().a(5.0F, 6.0F).a(cae.f).b()));
/* 342 */   public static final buo dI = a("chain", new bvd(ceg.c.a(cva.J, cvb.b).h().a(5.0F, 6.0F).a(cae.S).b()));
/* 343 */   public static final buo dJ = a("glass_pane", new bxq(ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 344 */   public static final buo dK = a("melon", new byf(ceg.c.a(cva.P, cvb.u).d(1.0F).a(cae.a)));
/* 345 */   public static final buo dL = a("attached_pumpkin_stem", new btt((can)cK, ceg.c.a(cva.e).a().c().a(cae.a)));
/* 346 */   public static final buo dM = a("attached_melon_stem", new btt((can)dK, ceg.c.a(cva.e).a().c().a(cae.a)));
/* 347 */   public static final buo dN = a("pumpkin_stem", new cam((can)cK, ceg.c.a(cva.e).a().d().c().a(cae.v)));
/* 348 */   public static final buo dO = a("melon_stem", new cam((can)dK, ceg.c.a(cva.e).a().d().c().a(cae.v)));
/* 349 */   public static final buo dP = a("vine", new cbi(ceg.c.a(cva.g).a().d().d(0.2F).a(cae.w)));
/* 350 */   public static final buo dQ = a("oak_fence_gate", new bwr(ceg.c.a(cva.y, n.s()).a(2.0F, 3.0F).a(cae.a)));
/* 351 */   public static final buo dR = a("brick_stairs", new cak(bG.n(), ceg.c.a(bG)));
/* 352 */   public static final buo dS = a("stone_brick_stairs", new cak(du.n(), ceg.c.a(du)));
/* 353 */   public static final buo dT = a("mycelium", new byi(ceg.c.a(cva.t, cvb.z).d().d(0.6F).a(cae.c)));
/* 354 */   public static final buo dU = a("lily_pad", new cbo(ceg.c.a(cva.e).c().a(cae.d).b()));
/* 355 */   public static final buo dV = a("nether_bricks", new buo(ceg.c.a(cva.I, cvb.K).h().a(2.0F, 6.0F).a(cae.L)));
/* 356 */   public static final buo dW = a("nether_brick_fence", new bwq(ceg.c.a(cva.I, cvb.K).h().a(2.0F, 6.0F).a(cae.L)));
/* 357 */   public static final buo dX = a("nether_brick_stairs", new cak(dV.n(), ceg.c.a(dV)));
/* 358 */   public static final buo dY = a("nether_wart", new bym(ceg.c.a(cva.e, cvb.D).a().d().a(cae.x)));
/* 359 */   public static final buo dZ = a("enchanting_table", new bwg(ceg.c.a(cva.I, cvb.D).h().a(5.0F, 1200.0F)));
/* 360 */   public static final buo ea = a("brewing_stand", new bur(ceg.c.a(cva.J).h().d(0.5F).a(☃ -> 1).b()));
/* 361 */   public static final buo eb = a("cauldron", new bvc(ceg.c.a(cva.J, cvb.m).h().d(2.0F).b()));
/* 362 */   public static final buo ec = a("end_portal", new bwi(ceg.c.a(cva.c, cvb.E).a().a(☃ -> 15).a(-1.0F, 3600000.0F).f()));
/* 363 */   public static final buo ed = a("end_portal_frame", new bwj(ceg.c.a(cva.I, cvb.C).a(cae.g).a(☃ -> 1).a(-1.0F, 3600000.0F).f()));
/* 364 */   public static final buo ee = a("end_stone", new buo(ceg.c.a(cva.I, cvb.d).h().a(3.0F, 9.0F)));
/* 365 */   public static final buo ef = a("dragon_egg", new bwe(ceg.c.a(cva.Q, cvb.E).a(3.0F, 9.0F).a(☃ -> 1).b()));
/* 366 */   public static final buo eg = a("redstone_lamp", new bze(ceg.c.a(cva.q).a(a(15)).d(0.3F).a(cae.g).a(bup::b)));
/* 367 */   public static final buo eh = a("cocoa", new bvh(ceg.c.a(cva.e).d().a(0.2F, 3.0F).a(cae.a).b()));
/* 368 */   public static final buo ei = a("sandstone_stairs", new cak(at.n(), ceg.c.a(at)));
/* 369 */   public static final buo ej = a("emerald_ore", new byr(ceg.c.a(cva.I).h().a(3.0F, 3.0F)));
/* 370 */   public static final buo ek = a("ender_chest", new bwl(ceg.c.a(cva.I).h().a(22.5F, 600.0F).a(☃ -> 7)));
/* 371 */   public static final buo el = a("tripwire_hook", new cbe(ceg.c.a(cva.o).a()));
/* 372 */   public static final buo em = a("tripwire", new cbd((cbe)el, ceg.c.a(cva.o).a()));
/* 373 */   public static final buo en = a("emerald_block", new buo(ceg.c.a(cva.J, cvb.I).h().a(5.0F, 6.0F).a(cae.f)));
/* 374 */   public static final buo eo = a("spruce_stairs", new cak(o.n(), ceg.c.a(o)));
/* 375 */   public static final buo ep = a("birch_stairs", new cak(p.n(), ceg.c.a(p)));
/* 376 */   public static final buo eq = a("jungle_stairs", new cak(q.n(), ceg.c.a(q)));
/* 377 */   public static final buo er = a("command_block", new bvi(ceg.c.a(cva.J, cvb.B).h().a(-1.0F, 3600000.0F).f()));
/* 378 */   public static final buo es = a("beacon", new bui(ceg.c.a(cva.F, cvb.G).d(3.0F).a(☃ -> 15).b().a(bup::b)));
/* 379 */   public static final buo et = a("cobblestone_wall", new cbk(ceg.c.a(m)));
/* 380 */   public static final buo eu = a("mossy_cobblestone_wall", new cbk(ceg.c.a(m)));
/* 381 */   public static final buo ev = a("flower_pot", new bwv(a, ceg.c.a(cva.o).c().b()));
/* 382 */   public static final buo ew = a("potted_oak_sapling", new bwv(t, ceg.c.a(cva.o).c().b()));
/* 383 */   public static final buo ex = a("potted_spruce_sapling", new bwv(u, ceg.c.a(cva.o).c().b()));
/* 384 */   public static final buo ey = a("potted_birch_sapling", new bwv(v, ceg.c.a(cva.o).c().b()));
/* 385 */   public static final buo ez = a("potted_jungle_sapling", new bwv(w, ceg.c.a(cva.o).c().b()));
/* 386 */   public static final buo eA = a("potted_acacia_sapling", new bwv(x, ceg.c.a(cva.o).c().b()));
/* 387 */   public static final buo eB = a("potted_dark_oak_sapling", new bwv(y, ceg.c.a(cva.o).c().b()));
/* 388 */   public static final buo eC = a("potted_fern", new bwv(aS, ceg.c.a(cva.o).c().b()));
/* 389 */   public static final buo eD = a("potted_dandelion", new bwv(bp, ceg.c.a(cva.o).c().b()));
/* 390 */   public static final buo eE = a("potted_poppy", new bwv(bq, ceg.c.a(cva.o).c().b()));
/* 391 */   public static final buo eF = a("potted_blue_orchid", new bwv(br, ceg.c.a(cva.o).c().b()));
/* 392 */   public static final buo eG = a("potted_allium", new bwv(bs, ceg.c.a(cva.o).c().b()));
/* 393 */   public static final buo eH = a("potted_azure_bluet", new bwv(bt, ceg.c.a(cva.o).c().b()));
/* 394 */   public static final buo eI = a("potted_red_tulip", new bwv(bu, ceg.c.a(cva.o).c().b()));
/* 395 */   public static final buo eJ = a("potted_orange_tulip", new bwv(bv, ceg.c.a(cva.o).c().b()));
/* 396 */   public static final buo eK = a("potted_white_tulip", new bwv(bw, ceg.c.a(cva.o).c().b()));
/* 397 */   public static final buo eL = a("potted_pink_tulip", new bwv(bx, ceg.c.a(cva.o).c().b()));
/* 398 */   public static final buo eM = a("potted_oxeye_daisy", new bwv(by, ceg.c.a(cva.o).c().b()));
/* 399 */   public static final buo eN = a("potted_cornflower", new bwv(bz, ceg.c.a(cva.o).c().b()));
/* 400 */   public static final buo eO = a("potted_lily_of_the_valley", new bwv(bB, ceg.c.a(cva.o).c().b()));
/* 401 */   public static final buo eP = a("potted_wither_rose", new bwv(bA, ceg.c.a(cva.o).c().b()));
/* 402 */   public static final buo eQ = a("potted_red_mushroom", new bwv(bD, ceg.c.a(cva.o).c().b()));
/* 403 */   public static final buo eR = a("potted_brown_mushroom", new bwv(bC, ceg.c.a(cva.o).c().b()));
/* 404 */   public static final buo eS = a("potted_dead_bush", new bwv(aT, ceg.c.a(cva.o).c().b()));
/* 405 */   public static final buo eT = a("potted_cactus", new bwv(cF, ceg.c.a(cva.o).c().b()));
/* 406 */   public static final buo eU = a("carrots", new buz(ceg.c.a(cva.e).a().d().c().a(cae.u)));
/* 407 */   public static final buo eV = a("potatoes", new byv(ceg.c.a(cva.e).a().d().c().a(cae.u)));
/* 408 */   public static final buo eW = a("oak_button", new cbx(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 409 */   public static final buo eX = a("spruce_button", new cbx(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 410 */   public static final buo eY = a("birch_button", new cbx(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 411 */   public static final buo eZ = a("jungle_button", new cbx(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 412 */   public static final buo fa = a("acacia_button", new cbx(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 413 */   public static final buo fb = a("dark_oak_button", new cbx(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 414 */   public static final buo fc = a("skeleton_skull", new bzv(bzv.b.a, ceg.c.a(cva.o).d(1.0F)));
/* 415 */   public static final buo fd = a("skeleton_wall_skull", new cbm(bzv.b.a, ceg.c.a(cva.o).d(1.0F).a(fc)));
/* 416 */   public static final buo fe = a("wither_skeleton_skull", new cbv(ceg.c.a(cva.o).d(1.0F)));
/* 417 */   public static final buo ff = a("wither_skeleton_wall_skull", new cbw(ceg.c.a(cva.o).d(1.0F).a(fe)));
/* 418 */   public static final buo fg = a("zombie_head", new bzv(bzv.b.d, ceg.c.a(cva.o).d(1.0F)));
/* 419 */   public static final buo fh = a("zombie_wall_head", new cbm(bzv.b.d, ceg.c.a(cva.o).d(1.0F).a(fg)));
/* 420 */   public static final buo fi = a("player_head", new byt(ceg.c.a(cva.o).d(1.0F)));
/* 421 */   public static final buo fj = a("player_wall_head", new byu(ceg.c.a(cva.o).d(1.0F).a(fi)));
/* 422 */   public static final buo fk = a("creeper_head", new bzv(bzv.b.e, ceg.c.a(cva.o).d(1.0F)));
/* 423 */   public static final buo fl = a("creeper_wall_head", new cbm(bzv.b.e, ceg.c.a(cva.o).d(1.0F).a(fk)));
/* 424 */   public static final buo fm = a("dragon_head", new bzv(bzv.b.f, ceg.c.a(cva.o).d(1.0F)));
/* 425 */   public static final buo fn = a("dragon_wall_head", new cbm(bzv.b.f, ceg.c.a(cva.o).d(1.0F).a(fm)));
/* 426 */   public static final buo fo = a("anvil", new bts(ceg.c.a(cva.L, cvb.h).h().a(5.0F, 1200.0F).a(cae.l)));
/* 427 */   public static final buo fp = a("chipped_anvil", new bts(ceg.c.a(cva.L, cvb.h).h().a(5.0F, 1200.0F).a(cae.l)));
/* 428 */   public static final buo fq = a("damaged_anvil", new bts(ceg.c.a(cva.L, cvb.h).h().a(5.0F, 1200.0F).a(cae.l)));
/* 429 */   public static final buo fr = a("trapped_chest", new cbc(ceg.c.a(cva.y).d(2.5F).a(cae.a)));
/* 430 */   public static final buo fs = a("light_weighted_pressure_plate", new cbs(15, ceg.c.a(cva.J, cvb.F).h().a().d(0.5F).a(cae.a)));
/* 431 */   public static final buo ft = a("heavy_weighted_pressure_plate", new cbs(150, ceg.c.a(cva.J).h().a().d(0.5F).a(cae.a)));
/* 432 */   public static final buo fu = a("comparator", new bvj(ceg.c.a(cva.o).c().a(cae.a)));
/* 433 */   public static final buo fv = a("daylight_detector", new bvv(ceg.c.a(cva.y).d(0.2F).a(cae.a)));
/* 434 */   public static final buo fw = a("redstone_block", new byw(ceg.c.a(cva.J, cvb.f).h().a(5.0F, 6.0F).a(cae.f).a(bup::b)));
/* 435 */   public static final buo fx = a("nether_quartz_ore", new byr(ceg.c.a(cva.I, cvb.K).h().a(3.0F, 3.0F).a(cae.N)));
/* 436 */   public static final buo fy = a("hopper", new bxl(ceg.c.a(cva.J, cvb.m).h().a(3.0F, 4.8F).a(cae.f).b()));
/* 437 */   public static final buo fz = a("quartz_block", new buo(ceg.c.a(cva.I, cvb.p).h().d(0.8F)));
/* 438 */   public static final buo fA = a("chiseled_quartz_block", new buo(ceg.c.a(cva.I, cvb.p).h().d(0.8F)));
/* 439 */   public static final buo fB = a("quartz_pillar", new bzl(ceg.c.a(cva.I, cvb.p).h().d(0.8F)));
/* 440 */   public static final buo fC = a("quartz_stairs", new cak(fz.n(), ceg.c.a(fz)));
/* 441 */   public static final buo fD = a("activator_rail", new byx(ceg.c.a(cva.o).a().d(0.7F).a(cae.f)));
/* 442 */   public static final buo fE = a("dropper", new bwf(ceg.c.a(cva.I).h().d(3.5F)));
/* 443 */   public static final buo fF = a("white_terracotta", new buo(ceg.c.a(cva.I, cvb.L).h().a(1.25F, 4.2F)));
/* 444 */   public static final buo fG = a("orange_terracotta", new buo(ceg.c.a(cva.I, cvb.M).h().a(1.25F, 4.2F)));
/* 445 */   public static final buo fH = a("magenta_terracotta", new buo(ceg.c.a(cva.I, cvb.N).h().a(1.25F, 4.2F)));
/* 446 */   public static final buo fI = a("light_blue_terracotta", new buo(ceg.c.a(cva.I, cvb.O).h().a(1.25F, 4.2F)));
/* 447 */   public static final buo fJ = a("yellow_terracotta", new buo(ceg.c.a(cva.I, cvb.P).h().a(1.25F, 4.2F)));
/* 448 */   public static final buo fK = a("lime_terracotta", new buo(ceg.c.a(cva.I, cvb.Q).h().a(1.25F, 4.2F)));
/* 449 */   public static final buo fL = a("pink_terracotta", new buo(ceg.c.a(cva.I, cvb.R).h().a(1.25F, 4.2F)));
/* 450 */   public static final buo fM = a("gray_terracotta", new buo(ceg.c.a(cva.I, cvb.S).h().a(1.25F, 4.2F)));
/* 451 */   public static final buo fN = a("light_gray_terracotta", new buo(ceg.c.a(cva.I, cvb.T).h().a(1.25F, 4.2F)));
/* 452 */   public static final buo fO = a("cyan_terracotta", new buo(ceg.c.a(cva.I, cvb.U).h().a(1.25F, 4.2F)));
/* 453 */   public static final buo fP = a("purple_terracotta", new buo(ceg.c.a(cva.I, cvb.V).h().a(1.25F, 4.2F)));
/* 454 */   public static final buo fQ = a("blue_terracotta", new buo(ceg.c.a(cva.I, cvb.W).h().a(1.25F, 4.2F)));
/* 455 */   public static final buo fR = a("brown_terracotta", new buo(ceg.c.a(cva.I, cvb.X).h().a(1.25F, 4.2F)));
/* 456 */   public static final buo fS = a("green_terracotta", new buo(ceg.c.a(cva.I, cvb.Y).h().a(1.25F, 4.2F)));
/* 457 */   public static final buo fT = a("red_terracotta", new buo(ceg.c.a(cva.I, cvb.Z).h().a(1.25F, 4.2F)));
/* 458 */   public static final buo fU = a("black_terracotta", new buo(ceg.c.a(cva.I, cvb.aa).h().a(1.25F, 4.2F)));
/* 459 */   public static final buo fV = a("white_stained_glass_pane", new caj(bkx.a, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 460 */   public static final buo fW = a("orange_stained_glass_pane", new caj(bkx.b, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 461 */   public static final buo fX = a("magenta_stained_glass_pane", new caj(bkx.c, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 462 */   public static final buo fY = a("light_blue_stained_glass_pane", new caj(bkx.d, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 463 */   public static final buo fZ = a("yellow_stained_glass_pane", new caj(bkx.e, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 464 */   public static final buo ga = a("lime_stained_glass_pane", new caj(bkx.f, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 465 */   public static final buo gb = a("pink_stained_glass_pane", new caj(bkx.g, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 466 */   public static final buo gc = a("gray_stained_glass_pane", new caj(bkx.h, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 467 */   public static final buo gd = a("light_gray_stained_glass_pane", new caj(bkx.i, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 468 */   public static final buo ge = a("cyan_stained_glass_pane", new caj(bkx.j, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 469 */   public static final buo gf = a("purple_stained_glass_pane", new caj(bkx.k, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 470 */   public static final buo gg = a("blue_stained_glass_pane", new caj(bkx.l, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 471 */   public static final buo gh = a("brown_stained_glass_pane", new caj(bkx.m, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 472 */   public static final buo gi = a("green_stained_glass_pane", new caj(bkx.n, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 473 */   public static final buo gj = a("red_stained_glass_pane", new caj(bkx.o, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 474 */   public static final buo gk = a("black_stained_glass_pane", new caj(bkx.p, ceg.c.a(cva.F).d(0.3F).a(cae.g).b()));
/* 475 */   public static final buo gl = a("acacia_stairs", new cak(r.n(), ceg.c.a(r)));
/* 476 */   public static final buo gm = a("dark_oak_stairs", new cak(s.n(), ceg.c.a(s)));
/* 477 */   public static final buo gn = a("slime_block", new bzx(ceg.c.a(cva.r, cvb.c).a(0.8F).a(cae.m).b()));
/* 478 */   public static final buo go = a("barrier", new bty(ceg.c.a(cva.M).a(-1.0F, 3600000.8F).f().b().a(bup::a)));
/* 479 */   public static final buo gp = a("iron_trapdoor", new cbb(ceg.c.a(cva.J).h().d(5.0F).a(cae.f).b().a(bup::a)));
/* 480 */   public static final buo gq = a("prismarine", new buo(ceg.c.a(cva.I, cvb.y).h().a(1.5F, 6.0F)));
/* 481 */   public static final buo gr = a("prismarine_bricks", new buo(ceg.c.a(cva.I, cvb.G).h().a(1.5F, 6.0F)));
/* 482 */   public static final buo gs = a("dark_prismarine", new buo(ceg.c.a(cva.I, cvb.G).h().a(1.5F, 6.0F)));
/* 483 */   public static final buo gt = a("prismarine_stairs", new cak(gq.n(), ceg.c.a(gq)));
/* 484 */   public static final buo gu = a("prismarine_brick_stairs", new cak(gr.n(), ceg.c.a(gr)));
/* 485 */   public static final buo gv = a("dark_prismarine_stairs", new cak(gs.n(), ceg.c.a(gs)));
/* 486 */   public static final buo gw = a("prismarine_slab", new bzw(ceg.c.a(cva.I, cvb.y).h().a(1.5F, 6.0F)));
/* 487 */   public static final buo gx = a("prismarine_brick_slab", new bzw(ceg.c.a(cva.I, cvb.G).h().a(1.5F, 6.0F)));
/* 488 */   public static final buo gy = a("dark_prismarine_slab", new bzw(ceg.c.a(cva.I, cvb.G).h().a(1.5F, 6.0F)));
/* 489 */   public static final buo gz = a("sea_lantern", new buo(ceg.c.a(cva.F, cvb.p).d(0.3F).a(cae.g).a(☃ -> 15)));
/* 490 */   public static final buo gA = a("hay_block", new bxj(ceg.c.a(cva.t, cvb.t).d(0.5F).a(cae.c)));
/* 491 */   public static final buo gB = a("white_carpet", new cby(bkx.a, ceg.c.a(cva.d, cvb.j).d(0.1F).a(cae.h)));
/* 492 */   public static final buo gC = a("orange_carpet", new cby(bkx.b, ceg.c.a(cva.d, cvb.q).d(0.1F).a(cae.h)));
/* 493 */   public static final buo gD = a("magenta_carpet", new cby(bkx.c, ceg.c.a(cva.d, cvb.r).d(0.1F).a(cae.h)));
/* 494 */   public static final buo gE = a("light_blue_carpet", new cby(bkx.d, ceg.c.a(cva.d, cvb.s).d(0.1F).a(cae.h)));
/* 495 */   public static final buo gF = a("yellow_carpet", new cby(bkx.e, ceg.c.a(cva.d, cvb.t).d(0.1F).a(cae.h)));
/* 496 */   public static final buo gG = a("lime_carpet", new cby(bkx.f, ceg.c.a(cva.d, cvb.u).d(0.1F).a(cae.h)));
/* 497 */   public static final buo gH = a("pink_carpet", new cby(bkx.g, ceg.c.a(cva.d, cvb.v).d(0.1F).a(cae.h)));
/* 498 */   public static final buo gI = a("gray_carpet", new cby(bkx.h, ceg.c.a(cva.d, cvb.w).d(0.1F).a(cae.h)));
/* 499 */   public static final buo gJ = a("light_gray_carpet", new cby(bkx.i, ceg.c.a(cva.d, cvb.x).d(0.1F).a(cae.h)));
/* 500 */   public static final buo gK = a("cyan_carpet", new cby(bkx.j, ceg.c.a(cva.d, cvb.y).d(0.1F).a(cae.h)));
/* 501 */   public static final buo gL = a("purple_carpet", new cby(bkx.k, ceg.c.a(cva.d, cvb.z).d(0.1F).a(cae.h)));
/* 502 */   public static final buo gM = a("blue_carpet", new cby(bkx.l, ceg.c.a(cva.d, cvb.A).d(0.1F).a(cae.h)));
/* 503 */   public static final buo gN = a("brown_carpet", new cby(bkx.m, ceg.c.a(cva.d, cvb.B).d(0.1F).a(cae.h)));
/* 504 */   public static final buo gO = a("green_carpet", new cby(bkx.n, ceg.c.a(cva.d, cvb.C).d(0.1F).a(cae.h)));
/* 505 */   public static final buo gP = a("red_carpet", new cby(bkx.o, ceg.c.a(cva.d, cvb.D).d(0.1F).a(cae.h)));
/* 506 */   public static final buo gQ = a("black_carpet", new cby(bkx.p, ceg.c.a(cva.d, cvb.E).d(0.1F).a(cae.h)));
/* 507 */   public static final buo gR = a("terracotta", new buo(ceg.c.a(cva.I, cvb.q).h().a(1.25F, 4.2F)));
/* 508 */   public static final buo gS = a("coal_block", new buo(ceg.c.a(cva.I, cvb.E).h().a(5.0F, 6.0F)));
/* 509 */   public static final buo gT = a("packed_ice", new buo(ceg.c.a(cva.u).a(0.98F).d(0.5F).a(cae.g)));
/* 510 */   public static final buo gU = a("sunflower", new cav(ceg.c.a(cva.g).a().c().a(cae.c)));
/* 511 */   public static final buo gV = a("lilac", new cav(ceg.c.a(cva.g).a().c().a(cae.c)));
/* 512 */   public static final buo gW = a("rose_bush", new cav(ceg.c.a(cva.g).a().c().a(cae.c)));
/* 513 */   public static final buo gX = a("peony", new cav(ceg.c.a(cva.g).a().c().a(cae.c)));
/* 514 */   public static final buo gY = a("tall_grass", new bwd(ceg.c.a(cva.g).a().c().a(cae.c)));
/* 515 */   public static final buo gZ = a("large_fern", new bwd(ceg.c.a(cva.g).a().c().a(cae.c)));
/* 516 */   public static final buo ha = a("white_banner", new btw(bkx.a, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 517 */   public static final buo hb = a("orange_banner", new btw(bkx.b, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 518 */   public static final buo hc = a("magenta_banner", new btw(bkx.c, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 519 */   public static final buo hd = a("light_blue_banner", new btw(bkx.d, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 520 */   public static final buo he = a("yellow_banner", new btw(bkx.e, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 521 */   public static final buo hf = a("lime_banner", new btw(bkx.f, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 522 */   public static final buo hg = a("pink_banner", new btw(bkx.g, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 523 */   public static final buo hh = a("gray_banner", new btw(bkx.h, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 524 */   public static final buo hi = a("light_gray_banner", new btw(bkx.i, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 525 */   public static final buo hj = a("cyan_banner", new btw(bkx.j, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 526 */   public static final buo hk = a("purple_banner", new btw(bkx.k, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 527 */   public static final buo hl = a("blue_banner", new btw(bkx.l, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 528 */   public static final buo hm = a("brown_banner", new btw(bkx.m, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 529 */   public static final buo hn = a("green_banner", new btw(bkx.n, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 530 */   public static final buo ho = a("red_banner", new btw(bkx.o, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 531 */   public static final buo hp = a("black_banner", new btw(bkx.p, ceg.c.a(cva.y).a().d(1.0F).a(cae.a)));
/* 532 */   public static final buo hq = a("white_wall_banner", new cbj(bkx.a, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(ha)));
/* 533 */   public static final buo hr = a("orange_wall_banner", new cbj(bkx.b, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hb)));
/* 534 */   public static final buo hs = a("magenta_wall_banner", new cbj(bkx.c, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hc)));
/* 535 */   public static final buo ht = a("light_blue_wall_banner", new cbj(bkx.d, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hd)));
/* 536 */   public static final buo hu = a("yellow_wall_banner", new cbj(bkx.e, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(he)));
/* 537 */   public static final buo hv = a("lime_wall_banner", new cbj(bkx.f, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hf)));
/* 538 */   public static final buo hw = a("pink_wall_banner", new cbj(bkx.g, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hg)));
/* 539 */   public static final buo hx = a("gray_wall_banner", new cbj(bkx.h, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hh)));
/* 540 */   public static final buo hy = a("light_gray_wall_banner", new cbj(bkx.i, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hi)));
/* 541 */   public static final buo hz = a("cyan_wall_banner", new cbj(bkx.j, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hj)));
/* 542 */   public static final buo hA = a("purple_wall_banner", new cbj(bkx.k, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hk)));
/* 543 */   public static final buo hB = a("blue_wall_banner", new cbj(bkx.l, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hl)));
/* 544 */   public static final buo hC = a("brown_wall_banner", new cbj(bkx.m, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hm)));
/* 545 */   public static final buo hD = a("green_wall_banner", new cbj(bkx.n, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hn)));
/* 546 */   public static final buo hE = a("red_wall_banner", new cbj(bkx.o, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(ho)));
/* 547 */   public static final buo hF = a("black_wall_banner", new cbj(bkx.p, ceg.c.a(cva.y).a().d(1.0F).a(cae.a).a(hp)));
/* 548 */   public static final buo hG = a("red_sandstone", new buo(ceg.c.a(cva.I, cvb.q).h().d(0.8F)));
/* 549 */   public static final buo hH = a("chiseled_red_sandstone", new buo(ceg.c.a(cva.I, cvb.q).h().d(0.8F)));
/* 550 */   public static final buo hI = a("cut_red_sandstone", new buo(ceg.c.a(cva.I, cvb.q).h().d(0.8F)));
/* 551 */   public static final buo hJ = a("red_sandstone_stairs", new cak(hG.n(), ceg.c.a(hG)));
/* 552 */   public static final buo hK = a("oak_slab", new bzw(ceg.c.a(cva.y, cvb.o).a(2.0F, 3.0F).a(cae.a)));
/* 553 */   public static final buo hL = a("spruce_slab", new bzw(ceg.c.a(cva.y, cvb.J).a(2.0F, 3.0F).a(cae.a)));
/* 554 */   public static final buo hM = a("birch_slab", new bzw(ceg.c.a(cva.y, cvb.d).a(2.0F, 3.0F).a(cae.a)));
/* 555 */   public static final buo hN = a("jungle_slab", new bzw(ceg.c.a(cva.y, cvb.l).a(2.0F, 3.0F).a(cae.a)));
/* 556 */   public static final buo hO = a("acacia_slab", new bzw(ceg.c.a(cva.y, cvb.q).a(2.0F, 3.0F).a(cae.a)));
/* 557 */   public static final buo hP = a("dark_oak_slab", new bzw(ceg.c.a(cva.y, cvb.B).a(2.0F, 3.0F).a(cae.a)));
/* 558 */   public static final buo hQ = a("stone_slab", new bzw(ceg.c.a(cva.I, cvb.m).h().a(2.0F, 6.0F)));
/* 559 */   public static final buo hR = a("smooth_stone_slab", new bzw(ceg.c.a(cva.I, cvb.m).h().a(2.0F, 6.0F)));
/* 560 */   public static final buo hS = a("sandstone_slab", new bzw(ceg.c.a(cva.I, cvb.d).h().a(2.0F, 6.0F)));
/* 561 */   public static final buo hT = a("cut_sandstone_slab", new bzw(ceg.c.a(cva.I, cvb.d).h().a(2.0F, 6.0F)));
/* 562 */   public static final buo hU = a("petrified_oak_slab", new bzw(ceg.c.a(cva.I, cvb.o).h().a(2.0F, 6.0F)));
/* 563 */   public static final buo hV = a("cobblestone_slab", new bzw(ceg.c.a(cva.I, cvb.m).h().a(2.0F, 6.0F)));
/* 564 */   public static final buo hW = a("brick_slab", new bzw(ceg.c.a(cva.I, cvb.D).h().a(2.0F, 6.0F)));
/* 565 */   public static final buo hX = a("stone_brick_slab", new bzw(ceg.c.a(cva.I, cvb.m).h().a(2.0F, 6.0F)));
/* 566 */   public static final buo hY = a("nether_brick_slab", new bzw(ceg.c.a(cva.I, cvb.K).h().a(2.0F, 6.0F).a(cae.L)));
/* 567 */   public static final buo hZ = a("quartz_slab", new bzw(ceg.c.a(cva.I, cvb.p).h().a(2.0F, 6.0F)));
/* 568 */   public static final buo ia = a("red_sandstone_slab", new bzw(ceg.c.a(cva.I, cvb.q).h().a(2.0F, 6.0F)));
/* 569 */   public static final buo ib = a("cut_red_sandstone_slab", new bzw(ceg.c.a(cva.I, cvb.q).h().a(2.0F, 6.0F)));
/* 570 */   public static final buo ic = a("purpur_slab", new bzw(ceg.c.a(cva.I, cvb.r).h().a(2.0F, 6.0F)));
/* 571 */   public static final buo id = a("smooth_stone", new buo(ceg.c.a(cva.I, cvb.m).h().a(2.0F, 6.0F)));
/* 572 */   public static final buo ie = a("smooth_sandstone", new buo(ceg.c.a(cva.I, cvb.d).h().a(2.0F, 6.0F)));
/* 573 */   public static final buo if = a("smooth_quartz", new buo(ceg.c.a(cva.I, cvb.p).h().a(2.0F, 6.0F)));
/* 574 */   public static final buo ig = a("smooth_red_sandstone", new buo(ceg.c.a(cva.I, cvb.q).h().a(2.0F, 6.0F)));
/* 575 */   public static final buo ih = a("spruce_fence_gate", new bwr(ceg.c.a(cva.y, o.s()).a(2.0F, 3.0F).a(cae.a)));
/* 576 */   public static final buo ii = a("birch_fence_gate", new bwr(ceg.c.a(cva.y, p.s()).a(2.0F, 3.0F).a(cae.a)));
/* 577 */   public static final buo ij = a("jungle_fence_gate", new bwr(ceg.c.a(cva.y, q.s()).a(2.0F, 3.0F).a(cae.a)));
/* 578 */   public static final buo ik = a("acacia_fence_gate", new bwr(ceg.c.a(cva.y, r.s()).a(2.0F, 3.0F).a(cae.a)));
/* 579 */   public static final buo il = a("dark_oak_fence_gate", new bwr(ceg.c.a(cva.y, s.s()).a(2.0F, 3.0F).a(cae.a)));
/* 580 */   public static final buo im = a("spruce_fence", new bwq(ceg.c.a(cva.y, o.s()).a(2.0F, 3.0F).a(cae.a)));
/* 581 */   public static final buo in = a("birch_fence", new bwq(ceg.c.a(cva.y, p.s()).a(2.0F, 3.0F).a(cae.a)));
/* 582 */   public static final buo io = a("jungle_fence", new bwq(ceg.c.a(cva.y, q.s()).a(2.0F, 3.0F).a(cae.a)));
/* 583 */   public static final buo ip = a("acacia_fence", new bwq(ceg.c.a(cva.y, r.s()).a(2.0F, 3.0F).a(cae.a)));
/* 584 */   public static final buo iq = a("dark_oak_fence", new bwq(ceg.c.a(cva.y, s.s()).a(2.0F, 3.0F).a(cae.a)));
/* 585 */   public static final buo ir = a("spruce_door", new bwb(ceg.c.a(cva.y, o.s()).d(3.0F).a(cae.a).b()));
/* 586 */   public static final buo is = a("birch_door", new bwb(ceg.c.a(cva.y, p.s()).d(3.0F).a(cae.a).b()));
/* 587 */   public static final buo it = a("jungle_door", new bwb(ceg.c.a(cva.y, q.s()).d(3.0F).a(cae.a).b()));
/* 588 */   public static final buo iu = a("acacia_door", new bwb(ceg.c.a(cva.y, r.s()).d(3.0F).a(cae.a).b()));
/* 589 */   public static final buo iv = a("dark_oak_door", new bwb(ceg.c.a(cva.y, s.s()).d(3.0F).a(cae.a).b()));
/* 590 */   public static final buo iw = a("end_rod", new bwk(ceg.c.a(cva.o).c().a(☃ -> 14).a(cae.a).b()));
/* 591 */   public static final buo ix = a("chorus_plant", new bvg(ceg.c.a(cva.e, cvb.z).d(0.4F).a(cae.a).b()));
/* 592 */   public static final buo iy = a("chorus_flower", new bvf((bvg)ix, ceg.c.a(cva.e, cvb.z).d().d(0.4F).a(cae.a).b()));
/* 593 */   public static final buo iz = a("purpur_block", new buo(ceg.c.a(cva.I, cvb.r).h().a(1.5F, 6.0F)));
/* 594 */   public static final buo iA = a("purpur_pillar", new bzl(ceg.c.a(cva.I, cvb.r).h().a(1.5F, 6.0F)));
/* 595 */   public static final buo iB = a("purpur_stairs", new cak(iz.n(), ceg.c.a(iz)));
/* 596 */   public static final buo iC = a("end_stone_bricks", new buo(ceg.c.a(cva.I, cvb.d).h().a(3.0F, 9.0F)));
/* 597 */   public static final buo iD = a("beetroots", new bul(ceg.c.a(cva.e).a().d().c().a(cae.u)));
/* 598 */   public static final buo iE = a("grass_path", new bxc(ceg.c.a(cva.s).d(0.65F).a(cae.c).c(bup::a).b(bup::a)));
/* 599 */   public static final buo iF = a("end_gateway", new bwh(ceg.c.a(cva.c, cvb.E).a().a(☃ -> 15).a(-1.0F, 3600000.0F).f()));
/* 600 */   public static final buo iG = a("repeating_command_block", new bvi(ceg.c.a(cva.J, cvb.z).h().a(-1.0F, 3600000.0F).f())); public static final buo iI;
/* 601 */   public static final buo iH = a("chain_command_block", new bvi(ceg.c.a(cva.J, cvb.C).h().a(-1.0F, 3600000.0F).f())); public static final buo iJ; static {
/* 602 */     iI = a("frosted_ice", new bww(ceg.c.a(cva.G).a(0.98F).d().d(0.5F).a(cae.g).b().a((☃, brc1, fx1, aqe1) -> (aqe1 == aqe.al))));
/* 603 */     iJ = a("magma_block", new bye(ceg.c.a(cva.I, cvb.K).h().a(☃ -> 3).d().d(0.5F).a((☃, brc1, fx1, aqe1) -> aqe1.c()).d(bup::a).e(bup::a)));
/* 604 */   } public static final buo iK = a("nether_wart_block", new buo(ceg.c.a(cva.t, cvb.D).d(1.0F).a(cae.J)));
/* 605 */   public static final buo iL = a("red_nether_bricks", new buo(ceg.c.a(cva.I, cvb.K).h().a(2.0F, 6.0F).a(cae.L)));
/* 606 */   public static final buo iM = a("bone_block", new bzl(ceg.c.a(cva.I, cvb.d).h().d(2.0F).a(cae.O)));
/* 607 */   public static final buo iN = a("structure_void", new car(ceg.c.a(cva.b).a().f()));
/* 608 */   public static final buo iO = a("observer", new byq(ceg.c.a(cva.I).d(3.0F).h().a(bup::b)));
/* 609 */   public static final buo iP = a("shulker_box", a((bkx)null, ceg.c.a(cva.x)));
/* 610 */   public static final buo iQ = a("white_shulker_box", a(bkx.a, ceg.c.a(cva.x, cvb.j)));
/* 611 */   public static final buo iR = a("orange_shulker_box", a(bkx.b, ceg.c.a(cva.x, cvb.q)));
/* 612 */   public static final buo iS = a("magenta_shulker_box", a(bkx.c, ceg.c.a(cva.x, cvb.r)));
/* 613 */   public static final buo iT = a("light_blue_shulker_box", a(bkx.d, ceg.c.a(cva.x, cvb.s)));
/* 614 */   public static final buo iU = a("yellow_shulker_box", a(bkx.e, ceg.c.a(cva.x, cvb.t)));
/* 615 */   public static final buo iV = a("lime_shulker_box", a(bkx.f, ceg.c.a(cva.x, cvb.u)));
/* 616 */   public static final buo iW = a("pink_shulker_box", a(bkx.g, ceg.c.a(cva.x, cvb.v)));
/* 617 */   public static final buo iX = a("gray_shulker_box", a(bkx.h, ceg.c.a(cva.x, cvb.w)));
/* 618 */   public static final buo iY = a("light_gray_shulker_box", a(bkx.i, ceg.c.a(cva.x, cvb.x)));
/* 619 */   public static final buo iZ = a("cyan_shulker_box", a(bkx.j, ceg.c.a(cva.x, cvb.y)));
/* 620 */   public static final buo ja = a("purple_shulker_box", a(bkx.k, ceg.c.a(cva.x, cvb.V)));
/* 621 */   public static final buo jb = a("blue_shulker_box", a(bkx.l, ceg.c.a(cva.x, cvb.A)));
/* 622 */   public static final buo jc = a("brown_shulker_box", a(bkx.m, ceg.c.a(cva.x, cvb.B)));
/* 623 */   public static final buo jd = a("green_shulker_box", a(bkx.n, ceg.c.a(cva.x, cvb.C)));
/* 624 */   public static final buo je = a("red_shulker_box", a(bkx.o, ceg.c.a(cva.x, cvb.D)));
/* 625 */   public static final buo jf = a("black_shulker_box", a(bkx.p, ceg.c.a(cva.x, cvb.E)));
/* 626 */   public static final buo jg = a("white_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.a).h().d(1.4F)));
/* 627 */   public static final buo jh = a("orange_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.b).h().d(1.4F)));
/* 628 */   public static final buo ji = a("magenta_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.c).h().d(1.4F)));
/* 629 */   public static final buo jj = a("light_blue_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.d).h().d(1.4F)));
/* 630 */   public static final buo jk = a("yellow_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.e).h().d(1.4F)));
/* 631 */   public static final buo jl = a("lime_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.f).h().d(1.4F)));
/* 632 */   public static final buo jm = a("pink_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.g).h().d(1.4F)));
/* 633 */   public static final buo jn = a("gray_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.h).h().d(1.4F)));
/* 634 */   public static final buo jo = a("light_gray_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.i).h().d(1.4F)));
/* 635 */   public static final buo jp = a("cyan_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.j).h().d(1.4F)));
/* 636 */   public static final buo jq = a("purple_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.k).h().d(1.4F)));
/* 637 */   public static final buo jr = a("blue_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.l).h().d(1.4F)));
/* 638 */   public static final buo js = a("brown_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.m).h().d(1.4F)));
/* 639 */   public static final buo jt = a("green_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.n).h().d(1.4F)));
/* 640 */   public static final buo ju = a("red_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.o).h().d(1.4F)));
/* 641 */   public static final buo jv = a("black_glazed_terracotta", new bxa(ceg.c.a(cva.I, bkx.p).h().d(1.4F)));
/* 642 */   public static final buo jw = a("white_concrete", new buo(ceg.c.a(cva.I, bkx.a).h().d(1.8F)));
/* 643 */   public static final buo jx = a("orange_concrete", new buo(ceg.c.a(cva.I, bkx.b).h().d(1.8F)));
/* 644 */   public static final buo jy = a("magenta_concrete", new buo(ceg.c.a(cva.I, bkx.c).h().d(1.8F)));
/* 645 */   public static final buo jz = a("light_blue_concrete", new buo(ceg.c.a(cva.I, bkx.d).h().d(1.8F)));
/* 646 */   public static final buo jA = a("yellow_concrete", new buo(ceg.c.a(cva.I, bkx.e).h().d(1.8F)));
/* 647 */   public static final buo jB = a("lime_concrete", new buo(ceg.c.a(cva.I, bkx.f).h().d(1.8F)));
/* 648 */   public static final buo jC = a("pink_concrete", new buo(ceg.c.a(cva.I, bkx.g).h().d(1.8F)));
/* 649 */   public static final buo jD = a("gray_concrete", new buo(ceg.c.a(cva.I, bkx.h).h().d(1.8F)));
/* 650 */   public static final buo jE = a("light_gray_concrete", new buo(ceg.c.a(cva.I, bkx.i).h().d(1.8F)));
/* 651 */   public static final buo jF = a("cyan_concrete", new buo(ceg.c.a(cva.I, bkx.j).h().d(1.8F)));
/* 652 */   public static final buo jG = a("purple_concrete", new buo(ceg.c.a(cva.I, bkx.k).h().d(1.8F)));
/* 653 */   public static final buo jH = a("blue_concrete", new buo(ceg.c.a(cva.I, bkx.l).h().d(1.8F)));
/* 654 */   public static final buo jI = a("brown_concrete", new buo(ceg.c.a(cva.I, bkx.m).h().d(1.8F)));
/* 655 */   public static final buo jJ = a("green_concrete", new buo(ceg.c.a(cva.I, bkx.n).h().d(1.8F)));
/* 656 */   public static final buo jK = a("red_concrete", new buo(ceg.c.a(cva.I, bkx.o).h().d(1.8F)));
/* 657 */   public static final buo jL = a("black_concrete", new buo(ceg.c.a(cva.I, bkx.p).h().d(1.8F)));
/* 658 */   public static final buo jM = a("white_concrete_powder", new bvl(jw, ceg.c.a(cva.v, bkx.a).d(0.5F).a(cae.i)));
/* 659 */   public static final buo jN = a("orange_concrete_powder", new bvl(jx, ceg.c.a(cva.v, bkx.b).d(0.5F).a(cae.i)));
/* 660 */   public static final buo jO = a("magenta_concrete_powder", new bvl(jy, ceg.c.a(cva.v, bkx.c).d(0.5F).a(cae.i)));
/* 661 */   public static final buo jP = a("light_blue_concrete_powder", new bvl(jz, ceg.c.a(cva.v, bkx.d).d(0.5F).a(cae.i)));
/* 662 */   public static final buo jQ = a("yellow_concrete_powder", new bvl(jA, ceg.c.a(cva.v, bkx.e).d(0.5F).a(cae.i)));
/* 663 */   public static final buo jR = a("lime_concrete_powder", new bvl(jB, ceg.c.a(cva.v, bkx.f).d(0.5F).a(cae.i)));
/* 664 */   public static final buo jS = a("pink_concrete_powder", new bvl(jC, ceg.c.a(cva.v, bkx.g).d(0.5F).a(cae.i)));
/* 665 */   public static final buo jT = a("gray_concrete_powder", new bvl(jD, ceg.c.a(cva.v, bkx.h).d(0.5F).a(cae.i)));
/* 666 */   public static final buo jU = a("light_gray_concrete_powder", new bvl(jE, ceg.c.a(cva.v, bkx.i).d(0.5F).a(cae.i)));
/* 667 */   public static final buo jV = a("cyan_concrete_powder", new bvl(jF, ceg.c.a(cva.v, bkx.j).d(0.5F).a(cae.i)));
/* 668 */   public static final buo jW = a("purple_concrete_powder", new bvl(jG, ceg.c.a(cva.v, bkx.k).d(0.5F).a(cae.i)));
/* 669 */   public static final buo jX = a("blue_concrete_powder", new bvl(jH, ceg.c.a(cva.v, bkx.l).d(0.5F).a(cae.i)));
/* 670 */   public static final buo jY = a("brown_concrete_powder", new bvl(jI, ceg.c.a(cva.v, bkx.m).d(0.5F).a(cae.i)));
/* 671 */   public static final buo jZ = a("green_concrete_powder", new bvl(jJ, ceg.c.a(cva.v, bkx.n).d(0.5F).a(cae.i)));
/* 672 */   public static final buo ka = a("red_concrete_powder", new bvl(jK, ceg.c.a(cva.v, bkx.o).d(0.5F).a(cae.i)));
/* 673 */   public static final buo kb = a("black_concrete_powder", new bvl(jL, ceg.c.a(cva.v, bkx.p).d(0.5F).a(cae.i)));
/* 674 */   public static final buo kc = a("kelp", new bxt(ceg.c.a(cva.f).a().d().c().a(cae.o)));
/* 675 */   public static final buo kd = a("kelp_plant", new bxu(ceg.c.a(cva.f).a().c().a(cae.o)));
/* 676 */   public static final buo ke = a("dried_kelp_block", new buo(ceg.c.a(cva.t, cvb.C).a(0.5F, 2.5F).a(cae.c)));
/* 677 */   public static final buo kf = a("turtle_egg", new cbf(ceg.c.a(cva.Q, cvb.d).d(0.5F).a(cae.f).d().b()));
/* 678 */   public static final buo kg = a("dead_tube_coral_block", new buo(ceg.c.a(cva.I, cvb.w).h().a(1.5F, 6.0F)));
/* 679 */   public static final buo kh = a("dead_brain_coral_block", new buo(ceg.c.a(cva.I, cvb.w).h().a(1.5F, 6.0F)));
/* 680 */   public static final buo ki = a("dead_bubble_coral_block", new buo(ceg.c.a(cva.I, cvb.w).h().a(1.5F, 6.0F)));
/* 681 */   public static final buo kj = a("dead_fire_coral_block", new buo(ceg.c.a(cva.I, cvb.w).h().a(1.5F, 6.0F)));
/* 682 */   public static final buo kk = a("dead_horn_coral_block", new buo(ceg.c.a(cva.I, cvb.w).h().a(1.5F, 6.0F)));
/* 683 */   public static final buo kl = a("tube_coral_block", new bvn(kg, ceg.c.a(cva.I, cvb.A).h().a(1.5F, 6.0F).a(cae.p)));
/* 684 */   public static final buo km = a("brain_coral_block", new bvn(kh, ceg.c.a(cva.I, cvb.v).h().a(1.5F, 6.0F).a(cae.p)));
/* 685 */   public static final buo kn = a("bubble_coral_block", new bvn(ki, ceg.c.a(cva.I, cvb.z).h().a(1.5F, 6.0F).a(cae.p)));
/* 686 */   public static final buo ko = a("fire_coral_block", new bvn(kj, ceg.c.a(cva.I, cvb.D).h().a(1.5F, 6.0F).a(cae.p)));
/* 687 */   public static final buo kp = a("horn_coral_block", new bvn(kk, ceg.c.a(cva.I, cvb.t).h().a(1.5F, 6.0F).a(cae.p)));
/* 688 */   public static final buo kq = a("dead_tube_coral", new bua(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 689 */   public static final buo kr = a("dead_brain_coral", new bua(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 690 */   public static final buo ks = a("dead_bubble_coral", new bua(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 691 */   public static final buo kt = a("dead_fire_coral", new bua(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 692 */   public static final buo ku = a("dead_horn_coral", new bua(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 693 */   public static final buo kv = a("tube_coral", new bvp(kq, ceg.c.a(cva.f, cvb.A).a().c().a(cae.o)));
/* 694 */   public static final buo kw = a("brain_coral", new bvp(kr, ceg.c.a(cva.f, cvb.v).a().c().a(cae.o)));
/* 695 */   public static final buo kx = a("bubble_coral", new bvp(ks, ceg.c.a(cva.f, cvb.z).a().c().a(cae.o)));
/* 696 */   public static final buo ky = a("fire_coral", new bvp(kt, ceg.c.a(cva.f, cvb.D).a().c().a(cae.o)));
/* 697 */   public static final buo kz = a("horn_coral", new bvp(ku, ceg.c.a(cva.f, cvb.t).a().c().a(cae.o)));
/* 698 */   public static final buo kA = a("dead_tube_coral_fan", new btz(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 699 */   public static final buo kB = a("dead_brain_coral_fan", new btz(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 700 */   public static final buo kC = a("dead_bubble_coral_fan", new btz(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 701 */   public static final buo kD = a("dead_fire_coral_fan", new btz(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 702 */   public static final buo kE = a("dead_horn_coral_fan", new btz(ceg.c.a(cva.I, cvb.w).h().a().c()));
/* 703 */   public static final buo kF = a("tube_coral_fan", new bvo(kA, ceg.c.a(cva.f, cvb.A).a().c().a(cae.o)));
/* 704 */   public static final buo kG = a("brain_coral_fan", new bvo(kB, ceg.c.a(cva.f, cvb.v).a().c().a(cae.o)));
/* 705 */   public static final buo kH = a("bubble_coral_fan", new bvo(kC, ceg.c.a(cva.f, cvb.z).a().c().a(cae.o)));
/* 706 */   public static final buo kI = a("fire_coral_fan", new bvo(kD, ceg.c.a(cva.f, cvb.D).a().c().a(cae.o)));
/* 707 */   public static final buo kJ = a("horn_coral_fan", new bvo(kE, ceg.c.a(cva.f, cvb.t).a().c().a(cae.o)));
/* 708 */   public static final buo kK = a("dead_tube_coral_wall_fan", new buc(ceg.c.a(cva.I, cvb.w).h().a().c().a(kA)));
/* 709 */   public static final buo kL = a("dead_brain_coral_wall_fan", new buc(ceg.c.a(cva.I, cvb.w).h().a().c().a(kB)));
/* 710 */   public static final buo kM = a("dead_bubble_coral_wall_fan", new buc(ceg.c.a(cva.I, cvb.w).h().a().c().a(kC)));
/* 711 */   public static final buo kN = a("dead_fire_coral_wall_fan", new buc(ceg.c.a(cva.I, cvb.w).h().a().c().a(kD)));
/* 712 */   public static final buo kO = a("dead_horn_coral_wall_fan", new buc(ceg.c.a(cva.I, cvb.w).h().a().c().a(kE)));
/* 713 */   public static final buo kP = a("tube_coral_wall_fan", new bvq(kK, ceg.c.a(cva.f, cvb.A).a().c().a(cae.o).a(kF)));
/* 714 */   public static final buo kQ = a("brain_coral_wall_fan", new bvq(kL, ceg.c.a(cva.f, cvb.v).a().c().a(cae.o).a(kG)));
/* 715 */   public static final buo kR = a("bubble_coral_wall_fan", new bvq(kM, ceg.c.a(cva.f, cvb.z).a().c().a(cae.o).a(kH)));
/* 716 */   public static final buo kS = a("fire_coral_wall_fan", new bvq(kN, ceg.c.a(cva.f, cvb.D).a().c().a(cae.o).a(kI)));
/* 717 */   public static final buo kT = a("horn_coral_wall_fan", new bvq(kO, ceg.c.a(cva.f, cvb.t).a().c().a(cae.o).a(kJ))); public static final buo kU; static {
/* 718 */     kU = a("sea_pickle", new bzq(ceg.c.a(cva.f, cvb.C).a(☃ -> bzq.h(☃) ? 0 : (3 + 3 * ((Integer)☃.c(bzq.a)).intValue())).a(cae.m).b()));
/* 719 */   } public static final buo kV = a("blue_ice", new bxi(ceg.c.a(cva.u).d(2.8F).a(0.989F).a(cae.g)));
/* 720 */   public static final buo kW = a("conduit", new bvm(ceg.c.a(cva.F, cvb.G).d(3.0F).a(☃ -> 15).b()));
/* 721 */   public static final buo kX = a("bamboo_sapling", new btv(ceg.c.a(cva.A).d().c().a().d(1.0F).a(cae.r)));
/* 722 */   public static final buo kY = a("bamboo", new btu(ceg.c.a(cva.B, cvb.i).d().c().d(1.0F).a(cae.q).b()));
/* 723 */   public static final buo kZ = a("potted_bamboo", new bwv(kY, ceg.c.a(cva.o).c().b()));
/*     */   
/* 725 */   public static final buo la = a("void_air", new btr(ceg.c.a(cva.a).a().f().g()));
/* 726 */   public static final buo lb = a("cave_air", new btr(ceg.c.a(cva.a).a().f().g()));
/*     */   
/* 728 */   public static final buo lc = a("bubble_column", new bus(ceg.c.a(cva.k).a().f()));
/*     */   
/* 730 */   public static final buo ld = a("polished_granite_stairs", new cak(d.n(), ceg.c.a(d)));
/* 731 */   public static final buo le = a("smooth_red_sandstone_stairs", new cak(ig.n(), ceg.c.a(ig)));
/* 732 */   public static final buo lf = a("mossy_stone_brick_stairs", new cak(dv.n(), ceg.c.a(dv)));
/* 733 */   public static final buo lg = a("polished_diorite_stairs", new cak(f.n(), ceg.c.a(f)));
/* 734 */   public static final buo lh = a("mossy_cobblestone_stairs", new cak(bJ.n(), ceg.c.a(bJ)));
/* 735 */   public static final buo li = a("end_stone_brick_stairs", new cak(iC.n(), ceg.c.a(iC)));
/* 736 */   public static final buo lj = a("stone_stairs", new cak(b.n(), ceg.c.a(b)));
/* 737 */   public static final buo lk = a("smooth_sandstone_stairs", new cak(ie.n(), ceg.c.a(ie)));
/* 738 */   public static final buo ll = a("smooth_quartz_stairs", new cak(if.n(), ceg.c.a(if)));
/* 739 */   public static final buo lm = a("granite_stairs", new cak(c.n(), ceg.c.a(c)));
/* 740 */   public static final buo ln = a("andesite_stairs", new cak(g.n(), ceg.c.a(g)));
/* 741 */   public static final buo lo = a("red_nether_brick_stairs", new cak(iL.n(), ceg.c.a(iL)));
/* 742 */   public static final buo lp = a("polished_andesite_stairs", new cak(h.n(), ceg.c.a(h)));
/* 743 */   public static final buo lq = a("diorite_stairs", new cak(e.n(), ceg.c.a(e)));
/*     */   
/* 745 */   public static final buo lr = a("polished_granite_slab", new bzw(ceg.c.a(d)));
/* 746 */   public static final buo ls = a("smooth_red_sandstone_slab", new bzw(ceg.c.a(ig)));
/* 747 */   public static final buo lt = a("mossy_stone_brick_slab", new bzw(ceg.c.a(dv)));
/* 748 */   public static final buo lu = a("polished_diorite_slab", new bzw(ceg.c.a(f)));
/* 749 */   public static final buo lv = a("mossy_cobblestone_slab", new bzw(ceg.c.a(bJ)));
/* 750 */   public static final buo lw = a("end_stone_brick_slab", new bzw(ceg.c.a(iC)));
/* 751 */   public static final buo lx = a("smooth_sandstone_slab", new bzw(ceg.c.a(ie)));
/* 752 */   public static final buo ly = a("smooth_quartz_slab", new bzw(ceg.c.a(if)));
/* 753 */   public static final buo lz = a("granite_slab", new bzw(ceg.c.a(c)));
/* 754 */   public static final buo lA = a("andesite_slab", new bzw(ceg.c.a(g)));
/* 755 */   public static final buo lB = a("red_nether_brick_slab", new bzw(ceg.c.a(iL)));
/* 756 */   public static final buo lC = a("polished_andesite_slab", new bzw(ceg.c.a(h)));
/* 757 */   public static final buo lD = a("diorite_slab", new bzw(ceg.c.a(e)));
/*     */   
/* 759 */   public static final buo lE = a("brick_wall", new cbk(ceg.c.a(bG)));
/* 760 */   public static final buo lF = a("prismarine_wall", new cbk(ceg.c.a(gq)));
/* 761 */   public static final buo lG = a("red_sandstone_wall", new cbk(ceg.c.a(hG)));
/* 762 */   public static final buo lH = a("mossy_stone_brick_wall", new cbk(ceg.c.a(dv)));
/* 763 */   public static final buo lI = a("granite_wall", new cbk(ceg.c.a(c)));
/* 764 */   public static final buo lJ = a("stone_brick_wall", new cbk(ceg.c.a(du)));
/* 765 */   public static final buo lK = a("nether_brick_wall", new cbk(ceg.c.a(dV)));
/* 766 */   public static final buo lL = a("andesite_wall", new cbk(ceg.c.a(g)));
/* 767 */   public static final buo lM = a("red_nether_brick_wall", new cbk(ceg.c.a(iL)));
/* 768 */   public static final buo lN = a("sandstone_wall", new cbk(ceg.c.a(at)));
/* 769 */   public static final buo lO = a("end_stone_brick_wall", new cbk(ceg.c.a(iC)));
/* 770 */   public static final buo lP = a("diorite_wall", new cbk(ceg.c.a(e)));
/* 771 */   public static final buo lQ = a("scaffolding", new bzp(ceg.c.a(cva.o, cvb.d).a().a(cae.s).e()));
/*     */   
/* 773 */   public static final buo lR = a("loom", new byd(ceg.c.a(cva.y).d(2.5F).a(cae.a)));
/* 774 */   public static final buo lS = a("barrel", new btx(ceg.c.a(cva.y).d(2.5F).a(cae.a)));
/* 775 */   public static final buo lT = a("smoker", new bzz(ceg.c.a(cva.I).h().d(3.5F).a(a(13))));
/* 776 */   public static final buo lU = a("blast_furnace", new bun(ceg.c.a(cva.I).h().d(3.5F).a(a(13))));
/* 777 */   public static final buo lV = a("cartography_table", new bva(ceg.c.a(cva.y).d(2.5F).a(cae.a)));
/* 778 */   public static final buo lW = a("fletching_table", new bwt(ceg.c.a(cva.y).d(2.5F).a(cae.a)));
/* 779 */   public static final buo lX = a("grindstone", new bxe(ceg.c.a(cva.L, cvb.h).h().a(2.0F, 6.0F).a(cae.e)));
/* 780 */   public static final buo lY = a("lectern", new bxy(ceg.c.a(cva.y).d(2.5F).a(cae.a)));
/* 781 */   public static final buo lZ = a("smithing_table", new bzy(ceg.c.a(cva.y).d(2.5F).a(cae.a)));
/* 782 */   public static final buo ma = a("stonecutter", new cap(ceg.c.a(cva.I).h().d(3.5F)));
/* 783 */   public static final buo mb = a("bell", new bum(ceg.c.a(cva.J, cvb.F).h().d(5.0F).a(cae.l)));
/* 784 */   public static final buo mc = a("lantern", new bxw(ceg.c.a(cva.J).h().d(3.5F).a(cae.y).a(☃ -> 15).b()));
/* 785 */   public static final buo md = a("soul_lantern", new bxw(ceg.c.a(cva.J).h().d(3.5F).a(cae.y).a(☃ -> 10).b()));
/* 786 */   public static final buo me = a("campfire", new buy(true, 1, ceg.c.a(cva.y, cvb.J).d(2.0F).a(cae.a).a(a(15)).b()));
/* 787 */   public static final buo mf = a("soul_campfire", new buy(false, 2, ceg.c.a(cva.y, cvb.J).d(2.0F).a(cae.a).a(a(10)).b()));
/* 788 */   public static final buo mg = a("sweet_berry_bush", new cau(ceg.c.a(cva.e).d().a().a(cae.t)));
/*     */   
/* 790 */   public static final buo mh = a("warped_stem", a(cvb.af));
/* 791 */   public static final buo mi = a("stripped_warped_stem", a(cvb.af));
/* 792 */   public static final buo mj = a("warped_hyphae", new bzl(ceg.c.a(cva.z, cvb.ag).d(2.0F).a(cae.z)));
/* 793 */   public static final buo mk = a("stripped_warped_hyphae", new bzl(ceg.c.a(cva.z, cvb.ag).d(2.0F).a(cae.z)));
/* 794 */   public static final buo ml = a("warped_nylium", new byp(ceg.c.a(cva.I, cvb.ae).h().d(0.4F).a(cae.A).d()));
/* 795 */   public static final buo mm = a("warped_fungus", new bwx(ceg.c.a(cva.e, cvb.y).c().a().a(cae.B), () -> kh.bE));
/* 796 */   public static final buo mn = a("warped_wart_block", new buo(ceg.c.a(cva.t, cvb.ah).d(1.0F).a(cae.J)));
/* 797 */   public static final buo mo = a("warped_roots", new bzk(ceg.c.a(cva.h, cvb.y).a().c().a(cae.C)));
/* 798 */   public static final buo mp = a("nether_sprouts", new byk(ceg.c.a(cva.h, cvb.y).a().c().a(cae.M)));
/* 799 */   public static final buo mq = a("crimson_stem", a(cvb.ac));
/* 800 */   public static final buo mr = a("stripped_crimson_stem", a(cvb.ac));
/* 801 */   public static final buo ms = a("crimson_hyphae", new bzl(ceg.c.a(cva.z, cvb.ad).d(2.0F).a(cae.z)));
/* 802 */   public static final buo mt = a("stripped_crimson_hyphae", new bzl(ceg.c.a(cva.z, cvb.ad).d(2.0F).a(cae.z)));
/* 803 */   public static final buo mu = a("crimson_nylium", new byp(ceg.c.a(cva.I, cvb.ab).h().d(0.4F).a(cae.A).d()));
/* 804 */   public static final buo mv = a("crimson_fungus", new bwx(ceg.c.a(cva.e, cvb.K).c().a().a(cae.B), () -> kh.bC));
/* 805 */   public static final buo mw = a("shroomlight", new buo(ceg.c.a(cva.t, cvb.D).d(1.0F).a(cae.D).a(☃ -> 15)));
/* 806 */   public static final buo mx = a("weeping_vines", new cbq(ceg.c.a(cva.e, cvb.K).d().a().c().a(cae.E)));
/* 807 */   public static final buo my = a("weeping_vines_plant", new cbr(ceg.c.a(cva.e, cvb.K).a().c().a(cae.E)));
/* 808 */   public static final buo mz = a("twisting_vines", new cbg(ceg.c.a(cva.e, cvb.y).d().a().c().a(cae.E)));
/* 809 */   public static final buo mA = a("twisting_vines_plant", new cbh(ceg.c.a(cva.e, cvb.y).a().c().a(cae.E)));
/* 810 */   public static final buo mB = a("crimson_roots", new bzk(ceg.c.a(cva.h, cvb.K).a().c().a(cae.C)));
/* 811 */   public static final buo mC = a("crimson_planks", new buo(ceg.c.a(cva.z, cvb.ac).a(2.0F, 3.0F).a(cae.a)));
/* 812 */   public static final buo mD = a("warped_planks", new buo(ceg.c.a(cva.z, cvb.af).a(2.0F, 3.0F).a(cae.a)));
/*     */   
/* 814 */   public static final buo mE = a("crimson_slab", new bzw(ceg.c.a(cva.z, mC.s()).a(2.0F, 3.0F).a(cae.a)));
/* 815 */   public static final buo mF = a("warped_slab", new bzw(ceg.c.a(cva.z, mD.s()).a(2.0F, 3.0F).a(cae.a)));
/* 816 */   public static final buo mG = a("crimson_pressure_plate", new byy(byy.a.a, ceg.c.a(cva.z, mC.s()).a().d(0.5F).a(cae.a)));
/* 817 */   public static final buo mH = a("warped_pressure_plate", new byy(byy.a.a, ceg.c.a(cva.z, mD.s()).a().d(0.5F).a(cae.a)));
/* 818 */   public static final buo mI = a("crimson_fence", new bwq(ceg.c.a(cva.z, mC.s()).a(2.0F, 3.0F).a(cae.a)));
/* 819 */   public static final buo mJ = a("warped_fence", new bwq(ceg.c.a(cva.z, mD.s()).a(2.0F, 3.0F).a(cae.a)));
/* 820 */   public static final buo mK = a("crimson_trapdoor", new cbb(ceg.c.a(cva.z, mC.s()).d(3.0F).a(cae.a).b().a(bup::a)));
/* 821 */   public static final buo mL = a("warped_trapdoor", new cbb(ceg.c.a(cva.z, mD.s()).d(3.0F).a(cae.a).b().a(bup::a)));
/* 822 */   public static final buo mM = a("crimson_fence_gate", new bwr(ceg.c.a(cva.z, mC.s()).a(2.0F, 3.0F).a(cae.a)));
/* 823 */   public static final buo mN = a("warped_fence_gate", new bwr(ceg.c.a(cva.z, mD.s()).a(2.0F, 3.0F).a(cae.a)));
/* 824 */   public static final buo mO = a("crimson_stairs", new cak(mC.n(), ceg.c.a(mC)));
/* 825 */   public static final buo mP = a("warped_stairs", new cak(mD.n(), ceg.c.a(mD)));
/* 826 */   public static final buo mQ = a("crimson_button", new cbx(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 827 */   public static final buo mR = a("warped_button", new cbx(ceg.c.a(cva.o).a().d(0.5F).a(cae.a)));
/* 828 */   public static final buo mS = a("crimson_door", new bwb(ceg.c.a(cva.z, mC.s()).d(3.0F).a(cae.a).b()));
/* 829 */   public static final buo mT = a("warped_door", new bwb(ceg.c.a(cva.z, mD.s()).d(3.0F).a(cae.a).b()));
/* 830 */   public static final buo mU = a("crimson_sign", new cal(ceg.c.a(cva.z, mC.s()).a().d(1.0F).a(cae.a), cfq.g));
/* 831 */   public static final buo mV = a("warped_sign", new cal(ceg.c.a(cva.z, mD.s()).a().d(1.0F).a(cae.a), cfq.h));
/* 832 */   public static final buo mW = a("crimson_wall_sign", new cbl(ceg.c.a(cva.z, mC.s()).a().d(1.0F).a(cae.a).a(mU), cfq.g));
/* 833 */   public static final buo mX = a("warped_wall_sign", new cbl(ceg.c.a(cva.z, mD.s()).a().d(1.0F).a(cae.a).a(mV), cfq.h));
/*     */   
/* 835 */   public static final buo mY = a("structure_block", new caq(ceg.c.a(cva.J, cvb.x).h().a(-1.0F, 3600000.0F).f()));
/* 836 */   public static final buo mZ = a("jigsaw", new bxr(ceg.c.a(cva.J, cvb.x).h().a(-1.0F, 3600000.0F).f()));
/* 837 */   public static final buo na = a("composter", new bvk(ceg.c.a(cva.y).d(0.6F).a(cae.a)));
/* 838 */   public static final buo nb = a("target", new cay(ceg.c.a(cva.t, cvb.p).d(0.5F).a(cae.c)));
/*     */   
/* 840 */   public static final buo nc = a("bee_nest", new buk(ceg.c.a(cva.y, cvb.t).d(0.3F).a(cae.a)));
/* 841 */   public static final buo nd = a("beehive", new buk(ceg.c.a(cva.y).d(0.6F).a(cae.a)));
/* 842 */   public static final buo ne = a("honey_block", new bxk(ceg.c.a(cva.r, cvb.q).b(0.4F).c(0.5F).b().a(cae.n)));
/* 843 */   public static final buo nf = a("honeycomb_block", new buo(ceg.c.a(cva.r, cvb.q).d(0.6F).a(cae.p)));
/*     */   
/* 845 */   public static final buo ng = a("netherite_block", new buo(ceg.c.a(cva.J, cvb.E).h().a(50.0F, 1200.0F).a(cae.P)));
/* 846 */   public static final buo nh = a("ancient_debris", new buo(ceg.c.a(cva.J, cvb.E).h().a(30.0F, 1200.0F).a(cae.Q)));
/* 847 */   public static final buo ni = a("crying_obsidian", new bvu(ceg.c.a(cva.I, cvb.E).h().a(50.0F, 1200.0F).a(☃ -> 10))); public static final buo nj; static {
/* 848 */     nj = a("respawn_anchor", new bzj(ceg.c.a(cva.I, cvb.E).h().a(50.0F, 1200.0F).a(☃ -> bzj.a(☃, 15))));
/*     */   }
/* 850 */   public static final buo nk = a("potted_crimson_fungus", new bwv(mv, ceg.c.a(cva.o).c().b()));
/* 851 */   public static final buo nl = a("potted_warped_fungus", new bwv(mm, ceg.c.a(cva.o).c().b()));
/* 852 */   public static final buo nm = a("potted_crimson_roots", new bwv(mB, ceg.c.a(cva.o).c().b()));
/* 853 */   public static final buo nn = a("potted_warped_roots", new bwv(mo, ceg.c.a(cva.o).c().b()));
/*     */   
/* 855 */   public static final buo no = a("lodestone", new buo(ceg.c.a(cva.L).h().d(3.5F).a(cae.R)));
/* 856 */   public static final buo np = a("blackstone", new buo(ceg.c.a(cva.I, cvb.E).h().a(1.5F, 6.0F)));
/* 857 */   public static final buo nq = a("blackstone_stairs", new cak(np.n(), ceg.c.a(np)));
/* 858 */   public static final buo nr = a("blackstone_wall", new cbk(ceg.c.a(np)));
/* 859 */   public static final buo ns = a("blackstone_slab", new bzw(ceg.c.a(np).a(2.0F, 6.0F)));
/* 860 */   public static final buo nt = a("polished_blackstone", new buo(ceg.c.a(np).a(2.0F, 6.0F)));
/* 861 */   public static final buo nu = a("polished_blackstone_bricks", new buo(ceg.c.a(nt).a(1.5F, 6.0F)));
/* 862 */   public static final buo nv = a("cracked_polished_blackstone_bricks", new buo(ceg.c.a(nu)));
/* 863 */   public static final buo nw = a("chiseled_polished_blackstone", new buo(ceg.c.a(nt).a(1.5F, 6.0F)));
/* 864 */   public static final buo nx = a("polished_blackstone_brick_slab", new bzw(ceg.c.a(nu).a(2.0F, 6.0F)));
/* 865 */   public static final buo ny = a("polished_blackstone_brick_stairs", new cak(nu.n(), ceg.c.a(nu)));
/* 866 */   public static final buo nz = a("polished_blackstone_brick_wall", new cbk(ceg.c.a(nu)));
/* 867 */   public static final buo nA = a("gilded_blackstone", new buo(ceg.c.a(np).a(cae.U)));
/* 868 */   public static final buo nB = a("polished_blackstone_stairs", new cak(nt.n(), ceg.c.a(nt)));
/* 869 */   public static final buo nC = a("polished_blackstone_slab", new bzw(ceg.c.a(nt)));
/* 870 */   public static final buo nD = a("polished_blackstone_pressure_plate", new byy(byy.a.b, ceg.c.a(cva.I, cvb.E).h().a().d(0.5F)));
/* 871 */   public static final buo nE = a("polished_blackstone_button", new cao(ceg.c.a(cva.o).a().d(0.5F)));
/* 872 */   public static final buo nF = a("polished_blackstone_wall", new cbk(ceg.c.a(nt)));
/*     */   
/* 874 */   public static final buo nG = a("chiseled_nether_bricks", new buo(ceg.c.a(cva.I, cvb.K).h().a(2.0F, 6.0F).a(cae.L)));
/* 875 */   public static final buo nH = a("cracked_nether_bricks", new buo(ceg.c.a(cva.I, cvb.K).h().a(2.0F, 6.0F).a(cae.L)));
/* 876 */   public static final buo nI = a("quartz_bricks", new buo(ceg.c.a(fz)));
/*     */   
/*     */   private static buo a(String ☃, buo buo1) {
/* 879 */     return gm.<buo>a(gm.Q, ☃, buo1);
/*     */   }
/*     */   
/*     */   static {
/* 883 */     for (buo ☃ : gm.Q) {
/* 884 */       for (UnmodifiableIterator<ceh> unmodifiableIterator = ☃.m().a().iterator(); unmodifiableIterator.hasNext(); ) { ceh ceh = unmodifiableIterator.next();
/* 885 */         buo.m.b(ceh); }
/*     */       
/* 887 */       ☃.r();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a() {
/* 892 */     buo.m.forEach(ceg.a::a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */