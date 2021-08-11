/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class cck<T extends ccj>
/*     */ {
/*  22 */   private static final Logger H = LogManager.getLogger();
/*     */   
/*     */   @Nullable
/*     */   public static vk a(cck<?> ☃) {
/*  26 */     return gm.W.b(☃);
/*     */   }
/*     */   
/*  29 */   public static final cck<ccw> a = a("furnace", a.a(ccw::new, new buo[] { bup.bY }));
/*  30 */   public static final cck<ccn> b = a("chest", a.a(ccn::new, new buo[] { bup.bR }));
/*  31 */   public static final cck<cdn> c = a("trapped_chest", a.a(cdn::new, new buo[] { bup.fr }));
/*  32 */   public static final cck<ccv> d = a("ender_chest", a.a(ccv::new, new buo[] { bup.ek }));
/*  33 */   public static final cck<cda> e = a("jukebox", a.a(cda::new, new buo[] { bup.cI }));
/*  34 */   public static final cck<ccs> f = a("dispenser", a.a(ccs::new, new buo[] { bup.as }));
/*  35 */   public static final cck<cct> g = a("dropper", a.a(cct::new, new buo[] { bup.fE }));
/*  36 */   public static final cck<cdf> h = a("sign", a.a(cdf::new, new buo[] { bup.bZ, bup.ca, bup.cb, bup.cc, bup.cd, bup.ce, bup.cj, bup.ck, bup.cl, bup.cm, bup.cn, bup.co, bup.mU, bup.mW, bup.mV, bup.mX }));
/*  37 */   public static final cck<cdi> i = a("mob_spawner", a.a(cdi::new, new buo[] { bup.bP }));
/*  38 */   public static final cck<ced> j = a("piston", a.a(ced::new, new buo[] { bup.bo }));
/*  39 */   public static final cck<ccl> k = a("brewing_stand", a.a(ccl::new, new buo[] { bup.ea }));
/*  40 */   public static final cck<ccu> l = a("enchanting_table", a.a(ccu::new, new buo[] { bup.dZ }));
/*  41 */   public static final cck<cdl> m = a("end_portal", a.a(cdl::new, new buo[] { bup.ec }));
/*  42 */   public static final cck<cce> n = a("beacon", a.a(cce::new, new buo[] { bup.es }));
/*  43 */   public static final cck<cdg> o = a("skull", a.a(cdg::new, new buo[] { bup.fc, bup.fd, bup.fk, bup.fl, bup.fm, bup.fn, bup.fg, bup.fh, bup.fe, bup.ff, bup.fi, bup.fj }));
/*  44 */   public static final cck<ccr> p = a("daylight_detector", a.a(ccr::new, new buo[] { bup.fv }));
/*  45 */   public static final cck<ccy> q = a("hopper", a.a(ccy::new, new buo[] { bup.fy }));
/*  46 */   public static final cck<ccp> r = a("comparator", a.a(ccp::new, new buo[] { bup.fu }));
/*  47 */   public static final cck<cca> s = a("banner", a.a(cca::new, new buo[] { bup.ha, bup.hb, bup.hc, bup.hd, bup.he, bup.hf, bup.hg, bup.hh, bup.hi, bup.hj, bup.hk, bup.hl, bup.hm, bup.hn, bup.ho, bup.hp, bup.hq, bup.hr, bup.hs, bup.ht, bup.hu, bup.hv, bup.hw, bup.hx, bup.hy, bup.hz, bup.hA, bup.hB, bup.hC, bup.hD, bup.hE, bup.hF }));
/*  48 */   public static final cck<cdj> t = a("structure_block", a.a(cdj::new, new buo[] { bup.mY }));
/*  49 */   public static final cck<cdk> u = a("end_gateway", a.a(cdk::new, new buo[] { bup.iF }));
/*  50 */   public static final cck<cco> v = a("command_block", a.a(cco::new, new buo[] { bup.er, bup.iH, bup.iG }));
/*  51 */   public static final cck<cde> w = a("shulker_box", a.a(cde::new, new buo[] { bup.iP, bup.jf, bup.jb, bup.jc, bup.iZ, bup.iX, bup.jd, bup.iT, bup.iY, bup.iV, bup.iS, bup.iR, bup.iW, bup.ja, bup.je, bup.iQ, bup.iU }));
/*  52 */   public static final cck<ccf> x = a("bed", a.a(ccf::new, new buo[] { bup.aL, bup.aM, bup.aI, bup.aJ, bup.aG, bup.aE, bup.aK, bup.aA, bup.aF, bup.aC, bup.az, bup.ay, bup.aD, bup.aH, bup.ax, bup.aB }));
/*  53 */   public static final cck<ccq> y = a("conduit", a.a(ccq::new, new buo[] { bup.kW }));
/*  54 */   public static final cck<ccc> z = a("barrel", a.a(ccc::new, new buo[] { bup.lS }));
/*  55 */   public static final cck<cdh> A = a("smoker", a.a(cdh::new, new buo[] { bup.lT }));
/*  56 */   public static final cck<cci> B = a("blast_furnace", a.a(cci::new, new buo[] { bup.lU }));
/*  57 */   public static final cck<cdb> C = a("lectern", a.a(cdb::new, new buo[] { bup.lY }));
/*  58 */   public static final cck<cch> D = a("bell", a.a(cch::new, new buo[] { bup.mb }));
/*  59 */   public static final cck<ccz> E = a("jigsaw", a.a(ccz::new, new buo[] { bup.mZ }));
/*  60 */   public static final cck<ccm> F = a("campfire", a.a(ccm::new, new buo[] { bup.me, bup.mf }));
/*  61 */   public static final cck<ccg> G = a("beehive", a.a(ccg::new, new buo[] { bup.nc, bup.nd })); private final Supplier<? extends T> I;
/*     */   
/*     */   private static <T extends ccj> cck<T> a(String ☃, a<T> a1) {
/*  64 */     if (a.a(a1).isEmpty()) {
/*  65 */       H.warn("Block entity type {} requires at least one valid block to be defined!", ☃);
/*     */     }
/*  67 */     Type<?> type = x.a(akn.k, ☃);
/*  68 */     return (cck<T>)gm.<cck<?>>a(gm.W, ☃, a1.a(type));
/*     */   }
/*     */ 
/*     */   
/*     */   private final Set<buo> J;
/*     */   private final Type<?> K;
/*     */   
/*     */   public cck(Supplier<? extends T> ☃, Set<buo> set, Type<?> type) {
/*  76 */     this.I = ☃;
/*  77 */     this.J = set;
/*  78 */     this.K = type;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public T a() {
/*  83 */     return this.I.get();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(buo ☃) {
/*  90 */     return this.J.contains(☃);
/*     */   }
/*     */   
/*     */   public static final class a<T extends ccj> {
/*     */     private final Supplier<? extends T> a;
/*     */     private final Set<buo> b;
/*     */     
/*     */     private a(Supplier<? extends T> ☃, Set<buo> set) {
/*  98 */       this.a = ☃;
/*  99 */       this.b = set;
/*     */     }
/*     */     
/*     */     public static <T extends ccj> a<T> a(Supplier<? extends T> ☃, buo... arrayOfBuo) {
/* 103 */       return new a<>(☃, (Set<buo>)ImmutableSet.copyOf((Object[])arrayOfBuo));
/*     */     }
/*     */     
/*     */     public cck<T> a(Type<?> ☃) {
/* 107 */       return new cck<>(this.a, this.b, ☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public T a(brc ☃, fx fx1) {
/* 114 */     ccj ccj = ☃.c(fx1);
/* 115 */     if (ccj == null || ccj.u() != this) {
/* 116 */       return null;
/*     */     }
/* 118 */     return (T)ccj;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */