/*     */ import java.nio.file.Path;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class jv
/*     */   extends jw<blx>
/*     */ {
/*     */   private final Function<ael.e<buo>, ael.a> d;
/*     */   
/*     */   public jv(hl ☃, js js1) {
/*  20 */     super(☃, gm.T);
/*  21 */     this.d = js1::b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  26 */     a(aed.b, aeg.b);
/*  27 */     a(aed.c, aeg.c);
/*  28 */     a(aed.d, aeg.d);
/*  29 */     a(aed.e, aeg.e);
/*  30 */     a(aed.f, aeg.f);
/*  31 */     a(aed.g, aeg.g);
/*  32 */     a(aed.h, aeg.h);
/*  33 */     a(aed.i, aeg.i);
/*  34 */     a(aed.j, aeg.j);
/*  35 */     a(aed.k, aeg.k);
/*  36 */     a(aed.m, aeg.l);
/*  37 */     a(aed.p, aeg.n);
/*  38 */     a(aed.q, aeg.o);
/*  39 */     a(aed.u, aeg.s);
/*  40 */     a(aed.t, aeg.r);
/*  41 */     a(aed.v, aeg.t);
/*  42 */     a(aed.w, aeg.u);
/*  43 */     a(aed.y, aeg.w);
/*  44 */     a(aed.x, aeg.v);
/*  45 */     a(aed.z, aeg.x);
/*  46 */     a(aed.A, aeg.y);
/*  47 */     a(aed.r, aeg.p);
/*  48 */     a(aed.s, aeg.q);
/*  49 */     a(aed.C, aeg.A);
/*  50 */     a(aed.E, aeg.C);
/*  51 */     a(aed.F, aeg.D);
/*  52 */     a(aed.D, aeg.B);
/*  53 */     a(aed.G, aeg.E);
/*  54 */     a(aed.H, aeg.F);
/*  55 */     a(aed.I, aeg.G);
/*  56 */     a(aed.o, aeg.m);
/*  57 */     a(aed.J, aeg.H);
/*  58 */     a(aed.K, aeg.I);
/*  59 */     a(aed.L, aeg.J);
/*  60 */     a(aed.M, aeg.K);
/*  61 */     a(aed.N, aeg.L);
/*  62 */     a(aed.O, aeg.M);
/*  63 */     a(aed.Q, aeg.P);
/*  64 */     a(aed.aw, aeg.R);
/*     */     
/*  66 */     a(aeg.z).a(new blx[] { bmd.pM, bmd.pN, bmd.pO, bmd.pP, bmd.pQ, bmd.pR, bmd.pS, bmd.pT, bmd.pU, bmd.pV, bmd.pW, bmd.pX, bmd.pY, bmd.pZ, bmd.qa, bmd.qb });
/*  67 */     a(aeg.S).a(new blx[] { bmd.lR, bmd.qp, bmd.qq, bmd.qr, bmd.qs, bmd.qt });
/*  68 */     a(aeg.T).a(new blx[] { bmd.ml, bmd.mp, bmd.mm, bmd.mq, bmd.mo, bmd.mn });
/*  69 */     a(aed.ad, aeg.U);
/*  70 */     a(aeg.W).a(new blx[] { bmd.qz, bmd.qA, bmd.qB, bmd.qC, bmd.qD, bmd.qE, bmd.qF, bmd.qG, bmd.qH, bmd.qI, bmd.qJ, bmd.qK });
/*  71 */     a(aeg.V).a(aeg.W).a(bmd.qL);
/*  72 */     a(aeg.X).a(new blx[] { bmd.ke, bmd.kf });
/*  73 */     a(aeg.Y).a(new blx[] { bmd.kd, bmd.ql, bmd.qk });
/*  74 */     a(aeg.Z).a(new blx[] { bmd.oU, bmd.oT });
/*  75 */     a(aeg.aa).a(new blx[] { bmd.kj, bmd.oV, bmd.kg, bmd.ki, bmd.kh });
/*  76 */     a(aeg.N).a(bmd.dp).a(bmd.rl).a(bmd.ro);
/*  77 */     a(aeg.O).a(aeg.P).a(new blx[] { bmd.bG, bmd.rE, bmd.fg, bmd.ki, bmd.rj, bmd.mj, bmd.pd, bmd.nE, bmd.lA, bmd.lB, bmd.lo, bmd.lp, bmd.lq, bmd.lr, bmd.pE, bmd.kv, bmd.kx, bmd.kw, bmd.ky, bmd.kz });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     a(aeg.Q).a(new blx[] { bmd.S, bmd.aa, bmd.aq, bmd.ai, bmd.R, bmd.Z, bmd.ap, bmd.ah, bmd.v, bmd.w, bmd.bO, bmd.bP, bmd.cP, bmd.cQ, bmd.dg, bmd.dh, bmd.dy, bmd.dz, bmd.dY, bmd.dZ, bmd.ex, bmd.ey, bmd.eZ, bmd.fa, bmd.jS, bmd.jT, bmd.lI, bmd.lJ });
/*  84 */     a(aeg.ab).a(new blx[] { bmd.o, bmd.rB });
/*  85 */     a(aeg.ac).a(new blx[] { bmd.o, bmd.rB });
/*     */   }
/*     */   
/*     */   protected void a(ael.e<buo> ☃, ael.e<blx> e1) {
/*  89 */     ael.a a1 = b(e1);
/*  90 */     ael.a a2 = this.d.apply(☃);
/*  91 */     a2.b().forEach(a1::a);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Path a(vk ☃) {
/*  96 */     return this.b.b().resolve("data/" + ☃.b() + "/tags/items/" + ☃.a() + ".json");
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 101 */     return "Item Tags";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */