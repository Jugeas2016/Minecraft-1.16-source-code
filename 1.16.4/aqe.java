/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Stream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class aqe<T extends aqa>
/*     */ {
/* 144 */   private static final Logger be = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private static <T extends aqa> aqe<T> a(String ☃, a<T> a1) {
/* 148 */     return (aqe<T>)gm.<aqe<?>>a(gm.S, ☃, a1.a(☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 154 */   public static final aqe<apz> a = a("area_effect_cloud", a.<apz>a(apz::new, aqo.f).c().a(6.0F, 0.5F).a(10).b(2147483647));
/* 155 */   public static final aqe<bcn> b = a("armor_stand", a.<bcn>a(bcn::new, aqo.f).a(0.5F, 1.975F).a(10));
/* 156 */   public static final aqe<bgc> c = a("arrow", a.<bgc>a(bgc::new, aqo.f).a(0.5F, 0.5F).a(4).b(20));
/* 157 */   public static final aqe<azu> d = a("bat", a.<azu>a(azu::new, aqo.c).a(0.5F, 0.9F).a(5));
/* 158 */   public static final aqe<baa> e = a("bee", a.<baa>a(baa::new, aqo.b).a(0.7F, 0.6F).a(8));
/* 159 */   public static final aqe<bda> f = a("blaze", a.<bda>a(bda::new, aqo.a).c().a(0.6F, 1.8F).a(8));
/* 160 */   public static final aqe<bhn> g = a("boat", a.<bhn>a(bhn::new, aqo.f).a(1.375F, 0.5625F).a(10));
/* 161 */   public static final aqe<bab> h = a("cat", a.<bab>a(bab::new, aqo.b).a(0.6F, 0.7F).a(8));
/* 162 */   public static final aqe<bdb> i = a("cave_spider", a.<bdb>a(bdb::new, aqo.a).a(0.7F, 0.5F).a(8));
/* 163 */   public static final aqe<bac> j = a("chicken", a.<bac>a(bac::new, aqo.b).a(0.4F, 0.7F).a(10));
/* 164 */   public static final aqe<bad> k = a("cod", a.<bad>a(bad::new, aqo.e).a(0.5F, 0.3F).a(4));
/* 165 */   public static final aqe<bae> l = a("cow", a.<bae>a(bae::new, aqo.b).a(0.9F, 1.4F).a(10));
/* 166 */   public static final aqe<bdc> m = a("creeper", a.<bdc>a(bdc::new, aqo.a).a(0.6F, 1.7F).a(8));
/* 167 */   public static final aqe<baf> n = a("dolphin", a.<baf>a(baf::new, aqo.d).a(0.9F, 0.6F));
/* 168 */   public static final aqe<bbc> o = a("donkey", a.<bbc>a(bbc::new, aqo.b).a(1.3964844F, 1.5F).a(10));
/* 169 */   public static final aqe<bgd> p = a("dragon_fireball", a.<bgd>a(bgd::new, aqo.f).a(1.0F, 1.0F).a(4).b(10));
/* 170 */   public static final aqe<bde> q = a("drowned", a.<bde>a(bde::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 171 */   public static final aqe<bdf> r = a("elder_guardian", a.<bdf>a(bdf::new, aqo.a).a(1.9975F, 1.9975F).a(10));
/* 172 */   public static final aqe<bbq> s = a("end_crystal", a.<bbq>a(bbq::new, aqo.f).a(2.0F, 2.0F).a(16).b(2147483647));
/* 173 */   public static final aqe<bbr> t = a("ender_dragon", a.<bbr>a(bbr::new, aqo.a).c().a(16.0F, 8.0F).a(10));
/* 174 */   public static final aqe<bdg> u = a("enderman", a.<bdg>a(bdg::new, aqo.a).a(0.6F, 2.9F).a(8));
/* 175 */   public static final aqe<bdh> v = a("endermite", a.<bdh>a(bdh::new, aqo.a).a(0.4F, 0.3F).a(8));
/* 176 */   public static final aqe<bdj> w = a("evoker", a.<bdj>a(bdj::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 177 */   public static final aqe<bge> x = a("evoker_fangs", a.<bge>a(bge::new, aqo.f).a(0.5F, 0.8F).a(6).b(2));
/* 178 */   public static final aqe<aqg> y = a("experience_orb", a.<aqg>a(aqg::new, aqo.f).a(0.5F, 0.5F).a(6).b(20));
/* 179 */   public static final aqe<bgf> z = a("eye_of_ender", a.<bgf>a(bgf::new, aqo.f).a(0.25F, 0.25F).a(4).b(4));
/* 180 */   public static final aqe<bcu> A = a("falling_block", a.<bcu>a(bcu::new, aqo.f).a(0.98F, 0.98F).a(10).b(20));
/* 181 */   public static final aqe<bgh> B = a("firework_rocket", a.<bgh>a(bgh::new, aqo.f).a(0.25F, 0.25F).a(4).b(10));
/* 182 */   public static final aqe<bah> C = a("fox", a.<bah>a(bah::new, aqo.b).a(0.6F, 0.7F).a(8).a(new buo[] { bup.mg }));
/* 183 */   public static final aqe<bdk> D = a("ghast", a.<bdk>a(bdk::new, aqo.a).c().a(4.0F, 4.0F).a(10));
/* 184 */   public static final aqe<bdl> E = a("giant", a.<bdl>a(bdl::new, aqo.a).a(3.6F, 12.0F).a(10));
/* 185 */   public static final aqe<bdm> F = a("guardian", a.<bdm>a(bdm::new, aqo.a).a(0.85F, 0.85F).a(8));
/* 186 */   public static final aqe<bem> G = a("hoglin", a.<bem>a(bem::new, aqo.a).a(1.3964844F, 1.4F).a(8));
/* 187 */   public static final aqe<bbd> H = a("horse", a.<bbd>a(bbd::new, aqo.b).a(1.3964844F, 1.6F).a(10));
/* 188 */   public static final aqe<bdn> I = a("husk", a.<bdn>a(bdn::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 189 */   public static final aqe<bdo> J = a("illusioner", a.<bdo>a(bdo::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 190 */   public static final aqe<bai> K = a("iron_golem", a.<bai>a(bai::new, aqo.f).a(1.4F, 2.7F).a(10));
/* 191 */   public static final aqe<bcv> L = a("item", a.<bcv>a(bcv::new, aqo.f).a(0.25F, 0.25F).a(6).b(20));
/* 192 */   public static final aqe<bcp> M = a("item_frame", a.<bcp>a(bcp::new, aqo.f).a(0.5F, 0.5F).a(10).b(2147483647));
/* 193 */   public static final aqe<bgk> N = a("fireball", a.<bgk>a(bgk::new, aqo.f).a(1.0F, 1.0F).a(4).b(10));
/* 194 */   public static final aqe<bcq> O = a("leash_knot", a.<bcq>a(bcq::new, aqo.f).b().a(0.5F, 0.5F).a(10).b(2147483647));
/* 195 */   public static final aqe<aql> P = a("lightning_bolt", a.<aql>a(aql::new, aqo.f).b().a(0.0F, 0.0F).a(16).b(2147483647));
/* 196 */   public static final aqe<bbe> Q = a("llama", a.<bbe>a(bbe::new, aqo.b).a(0.9F, 1.87F).a(10));
/* 197 */   public static final aqe<bgl> R = a("llama_spit", a.<bgl>a(bgl::new, aqo.f).a(0.25F, 0.25F).a(4).b(10));
/* 198 */   public static final aqe<bdp> S = a("magma_cube", a.<bdp>a(bdp::new, aqo.a).c().a(2.04F, 2.04F).a(8));
/* 199 */   public static final aqe<bhp> T = a("minecart", a.<bhp>a(bhp::new, aqo.f).a(0.98F, 0.7F).a(8));
/* 200 */   public static final aqe<bhq> U = a("chest_minecart", a.<bhq>a(bhq::new, aqo.f).a(0.98F, 0.7F).a(8));
/* 201 */   public static final aqe<bhr> V = a("command_block_minecart", a.<bhr>a(bhr::new, aqo.f).a(0.98F, 0.7F).a(8));
/* 202 */   public static final aqe<bhs> W = a("furnace_minecart", a.<bhs>a(bhs::new, aqo.f).a(0.98F, 0.7F).a(8));
/* 203 */   public static final aqe<bht> X = a("hopper_minecart", a.<bht>a(bht::new, aqo.f).a(0.98F, 0.7F).a(8));
/* 204 */   public static final aqe<bhu> Y = a("spawner_minecart", a.<bhu>a(bhu::new, aqo.f).a(0.98F, 0.7F).a(8));
/* 205 */   public static final aqe<bhv> Z = a("tnt_minecart", a.<bhv>a(bhv::new, aqo.f).a(0.98F, 0.7F).a(8));
/* 206 */   public static final aqe<bbg> aa = a("mule", a.<bbg>a(bbg::new, aqo.b).a(1.3964844F, 1.6F).a(8));
/* 207 */   public static final aqe<baj> ab = a("mooshroom", a.<baj>a(baj::new, aqo.b).a(0.9F, 1.4F).a(10));
/* 208 */   public static final aqe<bak> ac = a("ocelot", a.<bak>a(bak::new, aqo.b).a(0.6F, 0.7F).a(10));
/* 209 */   public static final aqe<bcs> ad = a("painting", a.<bcs>a(bcs::new, aqo.f).a(0.5F, 0.5F).a(10).b(2147483647));
/* 210 */   public static final aqe<bal> ae = a("panda", a.<bal>a(bal::new, aqo.b).a(1.3F, 1.25F).a(10));
/* 211 */   public static final aqe<bam> af = a("parrot", a.<bam>a(bam::new, aqo.b).a(0.5F, 0.9F).a(8));
/* 212 */   public static final aqe<bds> ag = a("phantom", a.<bds>a(bds::new, aqo.a).a(0.9F, 0.5F).a(8));
/* 213 */   public static final aqe<ban> ah = a("pig", a.<ban>a(ban::new, aqo.b).a(0.9F, 0.9F).a(10));
/* 214 */   public static final aqe<bes> ai = a("piglin", a.<bes>a(bes::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 215 */   public static final aqe<bev> aj = a("piglin_brute", a.<bev>a(bev::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 216 */   public static final aqe<bdt> ak = a("pillager", a.<bdt>a(bdt::new, aqo.a).d().a(0.6F, 1.95F).a(8));
/* 217 */   public static final aqe<bao> al = a("polar_bear", a.<bao>a(bao::new, aqo.b).a(1.4F, 1.4F).a(10));
/* 218 */   public static final aqe<bcw> am = a("tnt", a.<bcw>a(bcw::new, aqo.f).c().a(0.98F, 0.98F).a(10).b(10));
/* 219 */   public static final aqe<bap> an = a("pufferfish", a.<bap>a(bap::new, aqo.e).a(0.7F, 0.7F).a(4));
/* 220 */   public static final aqe<baq> ao = a("rabbit", a.<baq>a(baq::new, aqo.b).a(0.4F, 0.5F).a(8));
/* 221 */   public static final aqe<bdv> ap = a("ravager", a.<bdv>a(bdv::new, aqo.a).a(1.95F, 2.2F).a(10));
/* 222 */   public static final aqe<bar> aq = a("salmon", a.<bar>a(bar::new, aqo.e).a(0.7F, 0.4F).a(4));
/* 223 */   public static final aqe<bas> ar = a("sheep", a.<bas>a(bas::new, aqo.b).a(0.9F, 1.3F).a(10));
/* 224 */   public static final aqe<bdw> as = a("shulker", a.<bdw>a(bdw::new, aqo.a).c().d().a(1.0F, 1.0F).a(10));
/* 225 */   public static final aqe<bgo> at = a("shulker_bullet", a.<bgo>a(bgo::new, aqo.f).a(0.3125F, 0.3125F).a(8));
/* 226 */   public static final aqe<bdx> au = a("silverfish", a.<bdx>a(bdx::new, aqo.a).a(0.4F, 0.3F).a(8));
/* 227 */   public static final aqe<bdy> av = a("skeleton", a.<bdy>a(bdy::new, aqo.a).a(0.6F, 1.99F).a(8));
/* 228 */   public static final aqe<bbh> aw = a("skeleton_horse", a.<bbh>a(bbh::new, aqo.b).a(1.3964844F, 1.6F).a(10));
/* 229 */   public static final aqe<bdz> ax = a("slime", a.<bdz>a(bdz::new, aqo.a).a(2.04F, 2.04F).a(10));
/* 230 */   public static final aqe<bgp> ay = a("small_fireball", a.<bgp>a(bgp::new, aqo.f).a(0.3125F, 0.3125F).a(4).b(10));
/* 231 */   public static final aqe<bau> az = a("snow_golem", a.<bau>a(bau::new, aqo.f).a(0.7F, 1.9F).a(8));
/* 232 */   public static final aqe<bgq> aA = a("snowball", a.<bgq>a(bgq::new, aqo.f).a(0.25F, 0.25F).a(4).b(10));
/* 233 */   public static final aqe<bgr> aB = a("spectral_arrow", a.<bgr>a(bgr::new, aqo.f).a(0.5F, 0.5F).a(4).b(20));
/* 234 */   public static final aqe<beb> aC = a("spider", a.<beb>a(beb::new, aqo.a).a(1.4F, 0.9F).a(8));
/* 235 */   public static final aqe<bav> aD = a("squid", a.<bav>a(bav::new, aqo.d).a(0.8F, 0.8F).a(8));
/* 236 */   public static final aqe<bec> aE = a("stray", a.<bec>a(bec::new, aqo.a).a(0.6F, 1.99F).a(8));
/* 237 */   public static final aqe<bed> aF = a("strider", a.<bed>a(bed::new, aqo.b).c().a(0.9F, 1.7F).a(10));
/* 238 */   public static final aqe<bgu> aG = a("egg", a.<bgu>a(bgu::new, aqo.f).a(0.25F, 0.25F).a(4).b(10));
/* 239 */   public static final aqe<bgv> aH = a("ender_pearl", a.<bgv>a(bgv::new, aqo.f).a(0.25F, 0.25F).a(4).b(10));
/* 240 */   public static final aqe<bgw> aI = a("experience_bottle", a.<bgw>a(bgw::new, aqo.f).a(0.25F, 0.25F).a(4).b(10));
/* 241 */   public static final aqe<bgx> aJ = a("potion", a.<bgx>a(bgx::new, aqo.f).a(0.25F, 0.25F).a(4).b(10));
/* 242 */   public static final aqe<bgy> aK = a("trident", a.<bgy>a(bgy::new, aqo.f).a(0.5F, 0.5F).a(4).b(20));
/* 243 */   public static final aqe<bbj> aL = a("trader_llama", a.<bbj>a(bbj::new, aqo.b).a(0.9F, 1.87F).a(10));
/* 244 */   public static final aqe<baw> aM = a("tropical_fish", a.<baw>a(baw::new, aqo.e).a(0.5F, 0.4F).a(4));
/* 245 */   public static final aqe<bax> aN = a("turtle", a.<bax>a(bax::new, aqo.b).a(1.2F, 0.4F).a(10));
/* 246 */   public static final aqe<bee> aO = a("vex", a.<bee>a(bee::new, aqo.a).c().a(0.4F, 0.8F).a(8));
/* 247 */   public static final aqe<bfj> aP = a("villager", a.<bfj>a(bfj::new, aqo.f).a(0.6F, 1.95F).a(10));
/* 248 */   public static final aqe<bef> aQ = a("vindicator", a.<bef>a(bef::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 249 */   public static final aqe<bfp> aR = a("wandering_trader", a.<bfp>a(bfp::new, aqo.b).a(0.6F, 1.95F).a(10));
/* 250 */   public static final aqe<beg> aS = a("witch", a.<beg>a(beg::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 251 */   public static final aqe<bcl> aT = a("wither", a.<bcl>a(bcl::new, aqo.a).c().a(new buo[] { bup.bA }).a(0.9F, 3.5F).a(10));
/* 252 */   public static final aqe<beh> aU = a("wither_skeleton", a.<beh>a(beh::new, aqo.a).c().a(new buo[] { bup.bA }).a(0.7F, 2.4F).a(8));
/* 253 */   public static final aqe<bgz> aV = a("wither_skull", a.<bgz>a(bgz::new, aqo.f).a(0.3125F, 0.3125F).a(4).b(10));
/* 254 */   public static final aqe<baz> aW = a("wolf", a.<baz>a(baz::new, aqo.b).a(0.6F, 0.85F).a(10));
/* 255 */   public static final aqe<bei> aX = a("zoglin", a.<bei>a(bei::new, aqo.a).c().a(1.3964844F, 1.4F).a(8));
/* 256 */   public static final aqe<bej> aY = a("zombie", a.<bej>a(bej::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 257 */   public static final aqe<bbl> aZ = a("zombie_horse", a.<bbl>a(bbl::new, aqo.b).a(1.3964844F, 1.6F).a(10));
/* 258 */   public static final aqe<bek> ba = a("zombie_villager", a.<bek>a(bek::new, aqo.a).a(0.6F, 1.95F).a(8));
/* 259 */   public static final aqe<bel> bb = a("zombified_piglin", a.<bel>a(bel::new, aqo.a).c().a(0.6F, 1.95F).a(8));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 268 */   public static final aqe<bfw> bc = a("player", a.<bfw>a(aqo.f).b().a().a(0.6F, 1.8F).a(32).b(2));
/* 269 */   public static final aqe<bgi> bd = a("fishing_bobber", a.<bgi>a(aqo.f).b().a().a(0.25F, 0.25F).a(4).b(5));
/*     */   private final b<T> bf; private final aqo bg; private final ImmutableSet<buo> bh; private final boolean bi; private final boolean bj; private final boolean bk;
/*     */   
/* 272 */   public static vk a(aqe<?> ☃) { return gm.S.b(☃); } private final boolean bl; private final int bm; private final int bn; @Nullable
/*     */   private String bo; @Nullable
/*     */   private nr bp; @Nullable
/*     */   private vk bq; private final aqb br; public static Optional<aqe<?>> a(String ☃) {
/* 276 */     return gm.S.b(vk.a(☃));
/*     */   }
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
/*     */   public aqe(b<T> ☃, aqo aqo1, boolean bool1, boolean bool2, boolean bool3, boolean bool4, ImmutableSet<buo> immutableSet, aqb aqb1, int i, int j) {
/* 297 */     this.bf = ☃;
/* 298 */     this.bg = aqo1;
/* 299 */     this.bl = bool4;
/* 300 */     this.bi = bool1;
/* 301 */     this.bj = bool2;
/* 302 */     this.bk = bool3;
/* 303 */     this.bh = immutableSet;
/* 304 */     this.br = aqb1;
/* 305 */     this.bm = i;
/* 306 */     this.bn = j;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqa a(aag ☃, @Nullable bmb bmb1, @Nullable bfw bfw1, fx fx1, aqp aqp1, boolean bool1, boolean bool2) {
/* 311 */     return (aqa)a(☃, (bmb1 == null) ? null : bmb1
/*     */         
/* 313 */         .o(), (bmb1 != null && bmb1
/* 314 */         .t()) ? bmb1.r() : null, bfw1, fx1, aqp1, bool1, bool2);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(aag ☃, @Nullable md md1, @Nullable nr nr1, @Nullable bfw bfw1, fx fx1, aqp aqp1, boolean bool1, boolean bool2) {
/* 320 */     T t = b(☃, md1, nr1, bfw1, fx1, aqp1, bool1, bool2);
/* 321 */     if (t != null) {
/* 322 */       ☃.l((aqa)t);
/*     */     }
/* 324 */     return t;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T b(aag ☃, @Nullable md md1, @Nullable nr nr1, @Nullable bfw bfw1, fx fx1, aqp aqp1, boolean bool1, boolean bool2) {
/*     */     double d;
/* 332 */     T t = a(☃);
/*     */     
/* 334 */     if (t == null) {
/* 335 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 339 */     if (bool1) {
/* 340 */       t.d(fx1.u() + 0.5D, (fx1.v() + 1), fx1.w() + 0.5D);
/*     */       
/* 342 */       d = a(☃, fx1, bool2, t.cc());
/*     */     } else {
/* 344 */       d = 0.0D;
/*     */     } 
/*     */     
/* 347 */     t.b(fx1.u() + 0.5D, fx1.v() + d, fx1.w() + 0.5D, afm.g(☃.t.nextFloat() * 360.0F), 0.0F);
/*     */ 
/*     */     
/* 350 */     if (t instanceof aqn) {
/* 351 */       aqn aqn = (aqn)t;
/*     */       
/* 353 */       aqn.aC = aqn.p;
/* 354 */       aqn.aA = aqn.p;
/*     */       
/* 356 */       aqn.a(☃, ☃.d(aqn.cB()), aqp1, (arc)null, md1);
/* 357 */       aqn.F();
/*     */     } 
/*     */     
/* 360 */     if (nr1 != null && t instanceof aqm) {
/* 361 */       t.a(nr1);
/*     */     }
/*     */     
/* 364 */     a(☃, bfw1, (aqa)t, md1);
/*     */     
/* 366 */     return t;
/*     */   }
/*     */   
/*     */   protected static double a(brz ☃, fx fx1, boolean bool, dci dci1) {
/* 370 */     dci dci2 = new dci(fx1);
/* 371 */     if (bool) {
/* 372 */       dci2 = dci2.b(0.0D, -1.0D, 0.0D);
/*     */     }
/* 374 */     Stream<ddh> stream = ☃.d((aqa)null, dci2, ☃ -> true);
/*     */     
/* 376 */     return 1.0D + dde.a(gc.a.b, dci1, stream, bool ? -2.0D : -1.0D);
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, @Nullable bfw bfw1, @Nullable aqa aqa1, @Nullable md md1) {
/* 380 */     if (md1 == null || !md1.c("EntityTag", 10)) {
/*     */       return;
/*     */     }
/*     */     
/* 384 */     MinecraftServer minecraftServer = ☃.l();
/* 385 */     if (minecraftServer == null || aqa1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 389 */     if (!☃.v && aqa1.cj() && (bfw1 == null || !minecraftServer.ae().h(bfw1.eA()))) {
/*     */       return;
/*     */     }
/*     */     
/* 393 */     md md2 = aqa1.e(new md());
/* 394 */     UUID uUID = aqa1.bS();
/* 395 */     md2.a(md1.p("EntityTag"));
/* 396 */     aqa1.a_(uUID);
/* 397 */     aqa1.f(md2);
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 401 */     return this.bi;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 405 */     return this.bj;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 409 */     return this.bk;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 413 */     return this.bl;
/*     */   }
/*     */   
/*     */   public aqo e() {
/* 417 */     return this.bg;
/*     */   }
/*     */   
/*     */   public String f() {
/* 421 */     if (this.bo == null) {
/* 422 */       this.bo = x.a("entity", gm.S.b(this));
/*     */     }
/* 424 */     return this.bo;
/*     */   }
/*     */   
/*     */   public nr g() {
/* 428 */     if (this.bp == null) {
/* 429 */       this.bp = new of(f());
/*     */     }
/* 431 */     return this.bp;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 436 */     return f();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public vk i() {
/* 445 */     if (this.bq == null) {
/* 446 */       vk ☃ = gm.S.b(this);
/*     */       
/* 448 */       this.bq = new vk(☃.b(), "entities/" + ☃.a());
/*     */     } 
/* 450 */     return this.bq;
/*     */   }
/*     */   
/*     */   public float j() {
/* 454 */     return this.br.a;
/*     */   }
/*     */   
/*     */   public float k() {
/* 458 */     return this.br.b;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public T a(brx ☃) {
/* 463 */     return this.bf.create(this, ☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static aqa a(int ☃, brx brx1) {
/* 468 */     return a(brx1, gm.S.a(☃));
/*     */   }
/*     */   
/*     */   public static Optional<aqa> a(md ☃, brx brx1) {
/* 472 */     return x.a(a(☃).map(aqe1 -> aqe1.a(☃)), aqa1 -> aqa1.f(☃), () -> be.warn("Skipping Entity with id {}", ☃.l("id")));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static aqa a(brx ☃, @Nullable aqe<?> aqe1) {
/* 481 */     return (aqe1 == null) ? null : (aqa)aqe1.a(☃);
/*     */   }
/*     */   
/*     */   public dci a(double ☃, double d1, double d2) {
/* 485 */     float f = j() / 2.0F;
/* 486 */     return new dci(☃ - f, d1, d2 - f, ☃ + f, d1 + 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 491 */         k(), d2 + f);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 497 */     if (this.bh.contains(☃.b())) {
/* 498 */       return false;
/*     */     }
/* 500 */     if (!this.bk && (☃.a(aed.an) || ☃.a(bup.iJ) || buy.g(☃) || ☃.a(bup.B))) {
/* 501 */       return true;
/*     */     }
/* 503 */     return (☃.a(bup.bA) || ☃.a(bup.mg) || ☃.a(bup.cF));
/*     */   }
/*     */   
/*     */   public aqb l() {
/* 507 */     return this.br;
/*     */   }
/*     */   
/*     */   public static Optional<aqe<?>> a(md ☃) {
/* 511 */     return gm.S.b(new vk(☃.l("id")));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static aqa a(md ☃, brx brx1, Function<aqa, aqa> function) {
/* 516 */     return b(☃, brx1)
/* 517 */       .<aqa>map(function)
/* 518 */       .map(aqa1 -> {
/*     */           if (☃.c("Passengers", 9)) {
/*     */             mj mj = ☃.d("Passengers", 10);
/*     */             
/*     */             for (int i = 0; i < mj.size(); i++) {
/*     */               aqa aqa2 = a(mj.a(i), brx1, function);
/*     */               if (aqa2 != null) {
/*     */                 aqa2.a(aqa1, true);
/*     */               }
/*     */             } 
/*     */           } 
/*     */           return aqa1;
/* 530 */         }).orElse(null);
/*     */   }
/*     */   
/*     */   private static Optional<aqa> b(md ☃, brx brx1) {
/*     */     try {
/* 535 */       return a(☃, brx1);
/* 536 */     } catch (RuntimeException runtimeException) {
/* 537 */       be.warn("Exception loading entity: ", runtimeException);
/* 538 */       return Optional.empty();
/*     */     } 
/*     */   }
/*     */   
/*     */   public int m() {
/* 543 */     return this.bm;
/*     */   }
/*     */   
/*     */   public int n() {
/* 547 */     return this.bn;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 552 */     return (this != bc && this != R && this != aT && this != d && this != M && this != O && this != ad && this != s && this != x);
/*     */   }
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
/*     */   public boolean a(ael<aqe<?>> ☃) {
/* 565 */     return ☃.a(this);
/*     */   }
/*     */   public static interface b<T extends aqa> {
/*     */     T create(aqe<T> param1aqe, brx param1brx); }
/*     */   public static class a<T extends aqa> { private final aqe.b<T> a;
/*     */     private final aqo b;
/* 571 */     private ImmutableSet<buo> c = ImmutableSet.of();
/*     */     private boolean d = true;
/*     */     private boolean e = true;
/*     */     private boolean f;
/*     */     private boolean g;
/* 576 */     private int h = 5;
/* 577 */     private int i = 3;
/* 578 */     private aqb j = aqb.b(0.6F, 1.8F);
/*     */     
/*     */     private a(aqe.b<T> ☃, aqo aqo1) {
/* 581 */       this.a = ☃;
/* 582 */       this.b = aqo1;
/* 583 */       this.g = (aqo1 == aqo.b || aqo1 == aqo.f);
/*     */     }
/*     */     
/*     */     public static <T extends aqa> a<T> a(aqe.b<T> ☃, aqo aqo1) {
/* 587 */       return new a<>(☃, aqo1);
/*     */     }
/*     */     
/*     */     public static <T extends aqa> a<T> a(aqo ☃) {
/* 591 */       return new a<>((☃, brx1) -> null, ☃);
/*     */     }
/*     */     
/*     */     public a<T> a(float ☃, float f1) {
/* 595 */       this.j = aqb.b(☃, f1);
/* 596 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> a() {
/* 600 */       this.e = false;
/* 601 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> b() {
/* 605 */       this.d = false;
/* 606 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> c() {
/* 610 */       this.f = true;
/* 611 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> a(buo... ☃) {
/* 615 */       this.c = ImmutableSet.copyOf((Object[])☃);
/* 616 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> d() {
/* 620 */       this.g = true;
/* 621 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> a(int ☃) {
/* 625 */       this.h = ☃;
/* 626 */       return this;
/*     */     }
/*     */     
/*     */     public a<T> b(int ☃) {
/* 630 */       this.i = ☃;
/* 631 */       return this;
/*     */     }
/*     */     
/*     */     public aqe<T> a(String ☃) {
/* 635 */       if (this.d) {
/* 636 */         x.a(akn.o, ☃);
/*     */       }
/* 638 */       return new aqe<>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j, this.h, this.i);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */