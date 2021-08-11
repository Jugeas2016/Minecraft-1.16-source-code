/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ctt<C extends ctv>
/*    */ {
/* 13 */   private static final ceh a = bup.j.n();
/* 14 */   private static final ceh b = bup.i.n();
/* 15 */   private static final ceh c = bup.l.n();
/* 16 */   private static final ceh d = bup.E.n();
/* 17 */   private static final ceh e = bup.b.n();
/* 18 */   private static final ceh K = bup.k.n();
/* 19 */   private static final ceh L = bup.C.n();
/* 20 */   private static final ceh M = bup.D.n();
/* 21 */   private static final ceh N = bup.fF.n();
/* 22 */   private static final ceh O = bup.dT.n();
/* 23 */   private static final ceh P = bup.cM.n();
/* 24 */   private static final ceh Q = bup.cL.n();
/* 25 */   private static final ceh R = bup.ee.n();
/* 26 */   private static final ceh S = bup.mu.n();
/* 27 */   private static final ceh T = bup.ml.n();
/* 28 */   private static final ceh U = bup.iK.n();
/* 29 */   private static final ceh V = bup.mn.n();
/* 30 */   private static final ceh W = bup.np.n();
/* 31 */   private static final ceh X = bup.cO.n();
/* 32 */   private static final ceh Y = bup.iJ.n();
/*    */   
/* 34 */   public static final ctu f = new ctu(c, a, d);
/* 35 */   public static final ctu g = new ctu(d, d, d);
/* 36 */   public static final ctu h = new ctu(b, a, d);
/* 37 */   public static final ctu i = new ctu(e, e, d);
/* 38 */   public static final ctu j = new ctu(K, a, d);
/* 39 */   public static final ctu k = new ctu(L, L, d);
/* 40 */   public static final ctu l = new ctu(b, a, L);
/* 41 */   public static final ctu m = new ctu(L, L, L);
/* 42 */   public static final ctu n = new ctu(M, N, d);
/* 43 */   public static final ctu o = new ctu(O, a, d);
/* 44 */   public static final ctu p = new ctu(Q, Q, Q);
/* 45 */   public static final ctu q = new ctu(P, P, P);
/* 46 */   public static final ctu r = new ctu(R, R, R);
/* 47 */   public static final ctu s = new ctu(S, Q, U);
/* 48 */   public static final ctu t = new ctu(T, Q, V);
/* 49 */   public static final ctu u = new ctu(W, X, Y);
/*    */   
/* 51 */   public static final ctt<ctu> v = a("default", new cth(ctu.a));
/* 52 */   public static final ctt<ctu> w = a("mountain", new ctm(ctu.a));
/* 53 */   public static final ctt<ctu> x = a("shattered_savanna", new ctr(ctu.a));
/* 54 */   public static final ctt<ctu> y = a("gravelly_mountain", new ctl(ctu.a));
/* 55 */   public static final ctt<ctu> z = a("giant_tree_taiga", new ctk(ctu.a));
/* 56 */   public static final ctt<ctu> A = a("swamp", new ctw(ctu.a));
/* 57 */   public static final ctt<ctu> B = a("badlands", new cte(ctu.a));
/* 58 */   public static final ctt<ctu> C = a("wooded_badlands", new ctx(ctu.a));
/* 59 */   public static final ctt<ctu> D = a("eroded_badlands", new cti(ctu.a));
/* 60 */   public static final ctt<ctu> E = a("frozen_ocean", new ctj(ctu.a));
/* 61 */   public static final ctt<ctu> F = a("nether", new ctp(ctu.a));
/* 62 */   public static final ctt<ctu> G = a("nether_forest", new cto(ctu.a));
/* 63 */   public static final ctt<ctu> H = a("soul_sand_valley", new cts(ctu.a));
/* 64 */   public static final ctt<ctu> I = a("basalt_deltas", new ctf(ctu.a));
/* 65 */   public static final ctt<ctu> J = a("nope", new ctq(ctu.a));
/*    */   
/*    */   private static <C extends ctv, F extends ctt<C>> F a(String ☃, F f) {
/* 68 */     return (F)gm.<ctt>a((gm)gm.aA, ☃, (ctt)f);
/*    */   }
/*    */   
/*    */   private final Codec<ctg<C>> Z;
/*    */   
/*    */   public ctt(Codec<C> ☃) {
/* 74 */     this.Z = ☃.fieldOf("config").xmap(this::a, ctg::a).codec();
/*    */   }
/*    */   
/*    */   public Codec<ctg<C>> d() {
/* 78 */     return this.Z;
/*    */   }
/*    */   
/*    */   public ctg<C> a(C ☃) {
/* 82 */     return new ctg<>(this, ☃);
/*    */   }
/*    */   
/*    */   public abstract void a(Random paramRandom, cfw paramcfw, bsv parambsv, int paramInt1, int paramInt2, int paramInt3, double paramDouble, ceh paramceh1, ceh paramceh2, int paramInt4, long paramLong, C paramC);
/*    */   
/*    */   public void a(long ☃) {}
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */