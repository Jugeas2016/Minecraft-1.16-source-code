/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bfn
/*     */ {
/*     */   public static final Map<bfm, Int2ObjectMap<f[]>> a;
/*     */   
/*     */   static {
/*  66 */     a = x.<Map<bfm, Int2ObjectMap<f[]>>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(bfm.f, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.kW, 20, 16, 2), new b(bmd.oZ, 26, 16, 2), new b(bmd.oY, 22, 16, 2), new b(bmd.qf, 15, 16, 2), new h(bmd.kX, 1, 6, 16, 1) }Integer.valueOf(2), new f[] { new b(bup.cK, 6, 12, 10), new h(bmd.pn, 1, 4, 5), new h(bmd.kb, 1, 4, 16, 5) }Integer.valueOf(3), new f[] { new h(bmd.ne, 3, 18, 10), new b(bup.dK, 4, 12, 20) }Integer.valueOf(4), new f[] { new h(bup.cW, 1, 1, 12, 15), new i(apw.p, 100, 15), new i(apw.h, 160, 15), new i(apw.r, 140, 15), new i(apw.o, 120, 15), new i(apw.s, 280, 15), new i(apw.w, 7, 15) }Integer.valueOf(5), new f[] { new h(bmd.pd, 3, 3, 30), new h(bmd.nE, 4, 3, 30) })));
/*     */           ☃.put(bfm.g, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.kS, 20, 16, 2), new b(bmd.ke, 10, 16, 2), new g(bmd.ml, 6, bmd.mp, 6, 16, 1), new h(bmd.lW, 3, 1, 16, 1) }Integer.valueOf(2), new f[] { new b(bmd.ml, 15, 16, 10), new g(bmd.mm, 6, bmd.mq, 6, 16, 5), new h(bmd.rn, 2, 1, 5) }Integer.valueOf(3), new f[] { new b(bmd.mm, 13, 16, 20), new e(bmd.mi, 3, 3, 10, 0.2F) }Integer.valueOf(4), new f[] { new b(bmd.mn, 6, 12, 30) }Integer.valueOf(5), new f[] { new b(bmd.mo, 4, 12, 30), new c(1, 12, 30, (Map<bfo, blx>)ImmutableMap.builder().put(bfo.c, bmd.lR).put(bfo.g, bmd.qp).put(bfo.e, bmd.qp).put(bfo.a, bmd.qr).put(bfo.b, bmd.qr).put(bfo.d, bmd.qs).put(bfo.f, bmd.qt).build()) })));
/*     */           ☃.put(bfm.m, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bup.aY, 18, 16, 2), new b(bup.bk, 18, 16, 2), new b(bup.bn, 18, 16, 2), new b(bup.bf, 18, 16, 2), new h(bmd.ng, 2, 1, 1) }Integer.valueOf(2), new f[] { 
/*     */                     new b(bmd.mu, 12, 16, 10), new b(bmd.mB, 12, 16, 10), new b(bmd.mJ, 12, 16, 10), new b(bmd.mx, 12, 16, 10), new b(bmd.mz, 12, 16, 10), new h(bup.aY, 1, 1, 16, 5), new h(bup.aZ, 1, 1, 16, 5), new h(bup.ba, 1, 1, 16, 5), new h(bup.bb, 1, 1, 16, 5), new h(bup.bc, 1, 1, 16, 5), 
/*     */                     new h(bup.bd, 1, 1, 16, 5), new h(bup.be, 1, 1, 16, 5), new h(bup.bf, 1, 1, 16, 5), new h(bup.bg, 1, 1, 16, 5), new h(bup.bh, 1, 1, 16, 5), new h(bup.bi, 1, 1, 16, 5), new h(bup.bj, 1, 1, 16, 5), new h(bup.bk, 1, 1, 16, 5), new h(bup.bl, 1, 1, 16, 5), new h(bup.bm, 1, 1, 16, 5), 
/*     */                     new h(bup.bn, 1, 1, 16, 5), new h(bup.gB, 1, 4, 16, 5), new h(bup.gC, 1, 4, 16, 5), new h(bup.gD, 1, 4, 16, 5), new h(bup.gE, 1, 4, 16, 5), new h(bup.gF, 1, 4, 16, 5), new h(bup.gG, 1, 4, 16, 5), new h(bup.gH, 1, 4, 16, 5), new h(bup.gI, 1, 4, 16, 5), new h(bup.gJ, 1, 4, 16, 5), 
/*     */                     new h(bup.gK, 1, 4, 16, 5), new h(bup.gL, 1, 4, 16, 5), new h(bup.gM, 1, 4, 16, 5), new h(bup.gN, 1, 4, 16, 5), new h(bup.gO, 1, 4, 16, 5), new h(bup.gP, 1, 4, 16, 5), new h(bup.gQ, 1, 4, 16, 5) }Integer.valueOf(3), new f[] { 
/*     */                     new b(bmd.my, 12, 16, 20), new b(bmd.mC, 12, 16, 20), new b(bmd.mv, 12, 16, 20), new b(bmd.mI, 12, 16, 20), new b(bmd.mA, 12, 16, 20), new h(bup.ax, 3, 1, 12, 10), new h(bup.aB, 3, 1, 12, 10), new h(bup.aL, 3, 1, 12, 10), new h(bup.aM, 3, 1, 12, 10), new h(bup.aI, 3, 1, 12, 10), 
/*     */                     new h(bup.aJ, 3, 1, 12, 10), new h(bup.aG, 3, 1, 12, 10), new h(bup.aE, 3, 1, 12, 10), new h(bup.aK, 3, 1, 12, 10), new h(bup.aA, 3, 1, 12, 10), new h(bup.aF, 3, 1, 12, 10), new h(bup.aC, 3, 1, 12, 10), new h(bup.az, 3, 1, 12, 10), new h(bup.ay, 3, 1, 12, 10), new h(bup.aD, 3, 1, 12, 10), 
/*     */                     new h(bup.aH, 3, 1, 12, 10) }Integer.valueOf(4), new f[] { 
/*     */                     new b(bmd.mG, 12, 16, 30), new b(bmd.mE, 12, 16, 30), new b(bmd.mF, 12, 16, 30), new b(bmd.mH, 12, 16, 30), new b(bmd.mw, 12, 16, 30), new b(bmd.mD, 12, 16, 30), new h(bmd.pM, 3, 1, 12, 15), new h(bmd.pX, 3, 1, 12, 15), new h(bmd.pP, 3, 1, 12, 15), new h(bmd.qa, 3, 1, 12, 15), 
/*     */                     new h(bmd.pS, 3, 1, 12, 15), new h(bmd.pZ, 3, 1, 12, 15), new h(bmd.pR, 3, 1, 12, 15), new h(bmd.pT, 3, 1, 12, 15), new h(bmd.qb, 3, 1, 12, 15), new h(bmd.pW, 3, 1, 12, 15), new h(bmd.pO, 3, 1, 12, 15), new h(bmd.pV, 3, 1, 12, 15), new h(bmd.pY, 3, 1, 12, 15), new h(bmd.pQ, 3, 1, 12, 15), 
/*     */                     new h(bmd.pN, 3, 1, 12, 15), new h(bmd.pU, 3, 1, 12, 15) }Integer.valueOf(5), new f[] { new h(bmd.lz, 2, 3, 30) })));
/*     */           ☃.put(bfm.h, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.kP, 32, 16, 2), new h(bmd.kd, 1, 16, 1), new g(bup.E, 10, bmd.lw, 10, 12, 1) }Integer.valueOf(2), new f[] { new b(bmd.lw, 26, 12, 10), new h(bmd.kc, 2, 1, 5) }Integer.valueOf(3), new f[] { new b(bmd.kS, 14, 16, 20), new h(bmd.qQ, 3, 1, 10) }Integer.valueOf(4), new f[] { new b(bmd.kT, 24, 16, 30), new e(bmd.kc, 2, 3, 15) }Integer.valueOf(5), new f[] { new b(bmd.es, 8, 12, 30), new e(bmd.qQ, 3, 3, 15), new j(bmd.kd, 5, bmd.ql, 5, 2, 12, 30) })));
/*     */           ☃.put(bfm.j, a(ImmutableMap.builder().put(Integer.valueOf(1), new f[] { new b(bmd.mb, 24, 16, 2), new d(1), new h(bup.bI, 9, 1, 12, 1) }).put(Integer.valueOf(2), new f[] { new b(bmd.mc, 4, 12, 10), new d(5), new h(bmd.rk, 1, 1, 5) }).put(Integer.valueOf(3), new f[] { new b(bmd.mr, 5, 12, 20), new d(10), new h(bmd.az, 1, 4, 10) }).put(Integer.valueOf(4), new f[] { new b(bmd.oT, 2, 12, 30), new d(15), new h(bmd.mj, 5, 1, 15), new h(bmd.mh, 4, 1, 15) }).put(Integer.valueOf(5), new f[] { new h(bmd.pI, 20, 1, 30) }).build()));
/*     */           ☃.put(bfm.d, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.mb, 24, 16, 2), new h(bmd.pc, 7, 1, 1) }Integer.valueOf(2), new f[] { new b(bmd.dP, 11, 16, 10), new k(13, cla.l, cxu.a.j, 12, 5) }Integer.valueOf(3), new f[] { new b(bmd.mh, 1, 12, 20), new k(14, cla.d, cxu.a.i, 12, 10) }Integer.valueOf(4), new f[] { 
/*     */                     new h(bmd.oW, 7, 1, 15), new h(bmd.pM, 3, 1, 15), new h(bmd.pX, 3, 1, 15), new h(bmd.pP, 3, 1, 15), new h(bmd.qa, 3, 1, 15), new h(bmd.pS, 3, 1, 15), new h(bmd.pZ, 3, 1, 15), new h(bmd.pR, 3, 1, 15), new h(bmd.pT, 3, 1, 15), new h(bmd.qb, 3, 1, 15), 
/*     */                     new h(bmd.pW, 3, 1, 15), new h(bmd.pO, 3, 1, 15), new h(bmd.pV, 3, 1, 15), new h(bmd.pY, 3, 1, 15), new h(bmd.pQ, 3, 1, 15), new h(bmd.pN, 3, 1, 15), new h(bmd.pU, 3, 1, 15) }Integer.valueOf(5), new f[] { new h(bmd.qX, 8, 1, 30) })));
/*     */           ☃.put(bfm.e, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.np, 32, 16, 2), new h(bmd.lP, 1, 2, 1) }Integer.valueOf(2), new f[] { new b(bmd.ki, 3, 12, 10), new h(bmd.mt, 1, 1, 5) }Integer.valueOf(3), new f[] { new b(bmd.pA, 2, 12, 20), new h(bup.cS, 4, 1, 12, 10) }Integer.valueOf(4), new f[] { new b(bmd.jZ, 4, 12, 30), new b(bmd.nw, 9, 12, 30), new h(bmd.nq, 5, 1, 15) }Integer.valueOf(5), new f[] { new b(bmd.nu, 22, 12, 30), new h(bmd.oR, 3, 1, 30) })));
/*     */           ☃.put(bfm.b, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.ke, 15, 16, 2), new h(new bmb(bmd.li), 7, 1, 12, 1, 0.2F), new h(new bmb(bmd.lj), 4, 1, 12, 1, 0.2F), new h(new bmb(bmd.lg), 5, 1, 12, 1, 0.2F), new h(new bmb(bmd.lh), 9, 1, 12, 1, 0.2F) }Integer.valueOf(2), new f[] { new b(bmd.kh, 4, 12, 10), new h(new bmb(bmd.rj), 36, 1, 12, 5, 0.2F), new h(new bmb(bmd.lf), 1, 1, 12, 5, 0.2F), new h(new bmb(bmd.le), 3, 1, 12, 5, 0.2F) }Integer.valueOf(3), new f[] { new b(bmd.lM, 1, 12, 20), new b(bmd.kg, 1, 12, 20), new h(new bmb(bmd.lc), 1, 1, 12, 10, 0.2F), new h(new bmb(bmd.ld), 4, 1, 12, 10, 0.2F), new h(new bmb(bmd.qn), 5, 1, 12, 10, 0.2F) }Integer.valueOf(4), new f[] { new e(bmd.lm, 14, 3, 15, 0.2F), new e(bmd.ln, 8, 3, 15, 0.2F) }Integer.valueOf(5), new f[] { new e(bmd.lk, 8, 3, 30, 0.2F), new e(bmd.ll, 16, 3, 30, 0.2F) })));
/*     */           ☃.put(bfm.o, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.ke, 15, 16, 2), new h(new bmb(bmd.kD), 3, 1, 12, 1, 0.2F), new e(bmd.kA, 2, 3, 1) }Integer.valueOf(2), new f[] { new b(bmd.kh, 4, 12, 10), new h(new bmb(bmd.rj), 36, 1, 12, 5, 0.2F) }Integer.valueOf(3), new f[] { new b(bmd.lw, 24, 12, 20) }Integer.valueOf(4), new f[] { new b(bmd.kg, 1, 12, 30), new e(bmd.kI, 12, 3, 15, 0.2F) }Integer.valueOf(5), new f[] { new e(bmd.kF, 8, 3, 30, 0.2F) })));
/*     */           ☃.put(bfm.n, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.ke, 15, 16, 2), new h(new bmb(bmd.kt), 1, 1, 12, 1, 0.2F), new h(new bmb(bmd.kr), 1, 1, 12, 1, 0.2F), new h(new bmb(bmd.ks), 1, 1, 12, 1, 0.2F), new h(new bmb(bmd.ku), 1, 1, 12, 1, 0.2F) }Integer.valueOf(2), new f[] { new b(bmd.kh, 4, 12, 10), new h(new bmb(bmd.rj), 36, 1, 12, 5, 0.2F) }Integer.valueOf(3), new f[] { new b(bmd.lw, 30, 12, 20), new e(bmd.kD, 1, 3, 10, 0.2F), new e(bmd.kB, 2, 3, 10, 0.2F), new e(bmd.kC, 3, 3, 10, 0.2F), new h(new bmb(bmd.kJ), 4, 1, 3, 10, 0.2F) }Integer.valueOf(4), new f[] { new b(bmd.kg, 1, 12, 30), new e(bmd.kI, 12, 3, 15, 0.2F), new e(bmd.kG, 5, 3, 15, 0.2F) }Integer.valueOf(5), new f[] { new e(bmd.kH, 13, 3, 30, 0.2F) })));
/*     */           ☃.put(bfm.c, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.nn, 14, 16, 2), new b(bmd.lx, 7, 16, 2), new b(bmd.px, 4, 16, 2), new h(bmd.pz, 1, 1, 1) }Integer.valueOf(2), new f[] { new b(bmd.ke, 15, 16, 2), new h(bmd.ly, 1, 5, 16, 5), new h(bmd.no, 1, 8, 16, 5) }Integer.valueOf(3), new f[] { new b(bmd.pK, 7, 16, 20), new b(bmd.nl, 10, 16, 20) }Integer.valueOf(4), new f[] { new b(bmd.ma, 10, 12, 30) }Integer.valueOf(5), new f[] { new b(bmd.rm, 10, 12, 30) })));
/*     */           ☃.put(bfm.i, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.lS, 6, 16, 2), new a(bmd.la, 3), new a(bmd.kZ, 7) }Integer.valueOf(2), new f[] { new b(bmd.lw, 26, 12, 10), new a(bmd.kY, 5, 12, 5), new a(bmd.lb, 4, 12, 5) }Integer.valueOf(3), new f[] { new b(bmd.pB, 9, 12, 20), new a(bmd.kZ, 7) }Integer.valueOf(4), new f[] { new b(bmd.jZ, 4, 12, 30), new a(bmd.pG, 6, 12, 15) }Integer.valueOf(5), new f[] { new h(new bmb(bmd.lO), 6, 1, 12, 30, 0.2F), new a(bmd.kY, 5, 12, 30) })));
/*     */           ☃.put(bfm.k, a(ImmutableMap.of(Integer.valueOf(1), new f[] { new b(bmd.lZ, 10, 16, 2), new h(bmd.lY, 1, 10, 16, 1) }Integer.valueOf(2), new f[] { new b(bup.b, 20, 16, 10), new h(bup.dx, 1, 4, 16, 5) }Integer.valueOf(3), new f[] { new b(bup.c, 16, 16, 20), new b(bup.g, 16, 16, 20), new b(bup.e, 16, 16, 20), new h(bup.h, 1, 4, 16, 10), new h(bup.f, 1, 4, 16, 10), new h(bup.d, 1, 4, 16, 10) }Integer.valueOf(4), new f[] { 
/*     */                     new b(bmd.ps, 12, 12, 30), new h(bup.fG, 1, 1, 12, 15), new h(bup.fF, 1, 1, 12, 15), new h(bup.fQ, 1, 1, 12, 15), new h(bup.fI, 1, 1, 12, 15), new h(bup.fM, 1, 1, 12, 15), new h(bup.fN, 1, 1, 12, 15), new h(bup.fU, 1, 1, 12, 15), new h(bup.fT, 1, 1, 12, 15), new h(bup.fL, 1, 1, 12, 15), 
/*     */                     new h(bup.fH, 1, 1, 12, 15), new h(bup.fK, 1, 1, 12, 15), new h(bup.fS, 1, 1, 12, 15), new h(bup.fO, 1, 1, 12, 15), new h(bup.fP, 1, 1, 12, 15), new h(bup.fJ, 1, 1, 12, 15), new h(bup.fR, 1, 1, 12, 15), new h(bup.jh, 1, 1, 12, 15), new h(bup.jg, 1, 1, 12, 15), new h(bup.jr, 1, 1, 12, 15), 
/*     */                     new h(bup.jj, 1, 1, 12, 15), new h(bup.jn, 1, 1, 12, 15), new h(bup.jo, 1, 1, 12, 15), new h(bup.jv, 1, 1, 12, 15), new h(bup.ju, 1, 1, 12, 15), new h(bup.jm, 1, 1, 12, 15), new h(bup.ji, 1, 1, 12, 15), new h(bup.jl, 1, 1, 12, 15), new h(bup.jt, 1, 1, 12, 15), new h(bup.jp, 1, 1, 12, 15), 
/*     */                     new h(bup.jq, 1, 1, 12, 15), new h(bup.jk, 1, 1, 12, 15), new h(bup.js, 1, 1, 12, 15) }Integer.valueOf(5), new f[] { new h(bup.fB, 1, 1, 12, 30), new h(bup.fz, 1, 1, 12, 30) })));
/*     */         });
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 526 */   public static final Int2ObjectMap<f[]> b = a(ImmutableMap.of(
/* 527 */         Integer.valueOf(1), new f[] { new h(bmd.aP, 2, 1, 5, 1), new h(bmd.md, 4, 1, 5, 1), new h(bmd.dq, 2, 1, 5, 1), new h(bmd.qO, 5, 1, 5, 1), new h(bmd.aM, 1, 1, 12, 1), new h(bmd.bD, 1, 1, 8, 1), new h(bmd.di, 1, 1, 4, 1), new h(bmd.bE, 3, 1, 12, 1), new h(bmd.cX, 3, 1, 8, 1), new h(bmd.bh, 1, 1, 12, 1), new h(bmd.bi, 1, 1, 12, 1), new h(bmd.bj, 1, 1, 8, 1), new h(bmd.bk, 1, 1, 12, 1), new h(bmd.bl, 1, 1, 12, 1), new h(bmd.bm, 1, 1, 12, 1), new h(bmd.bn, 1, 1, 12, 1), new h(bmd.bo, 1, 1, 12, 1), new h(bmd.bp, 1, 1, 12, 1), new h(bmd.bq, 1, 1, 12, 1), new h(bmd.br, 1, 1, 12, 1), new h(bmd.bs, 1, 1, 7, 1), new h(bmd.kV, 1, 1, 12, 1), new h(bmd.qg, 1, 1, 12, 1), new h(bmd.nj, 1, 1, 12, 1), new h(bmd.nk, 1, 1, 12, 1), new h(bmd.B, 5, 1, 8, 1), new h(bmd.z, 5, 1, 8, 1), new h(bmd.C, 5, 1, 8, 1), new h(bmd.A, 5, 1, 8, 1), new h(bmd.x, 5, 1, 8, 1), new h(bmd.y, 5, 1, 8, 1), new h(bmd.mI, 1, 3, 12, 1), new h(bmd.mu, 1, 3, 12, 1), new h(bmd.mF, 1, 3, 12, 1), new h(bmd.mA, 1, 3, 12, 1), new h(bmd.mJ, 1, 3, 12, 1), new h(bmd.mH, 1, 3, 12, 1), new h(bmd.mC, 1, 3, 12, 1), new h(bmd.mw, 1, 3, 12, 1), new h(bmd.my, 1, 3, 12, 1), new h(bmd.mB, 1, 3, 12, 1), new h(bmd.mE, 1, 3, 12, 1), new h(bmd.mx, 1, 3, 12, 1), new h(bmd.mz, 1, 3, 12, 1), new h(bmd.mv, 1, 3, 12, 1), new h(bmd.mG, 1, 3, 12, 1), new h(bmd.mD, 1, 3, 12, 1), new h(bmd.iJ, 3, 1, 8, 1), new h(bmd.iK, 3, 1, 8, 1), new h(bmd.iL, 3, 1, 8, 1), new h(bmd.iM, 3, 1, 8, 1), new h(bmd.iI, 3, 1, 8, 1), new h(bmd.dR, 1, 1, 12, 1), new h(bmd.bu, 1, 1, 12, 1), new h(bmd.bv, 1, 1, 12, 1), new h(bmd.ed, 1, 2, 5, 1), new h(bmd.E, 1, 8, 8, 1), new h(bmd.F, 1, 4, 6, 1)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 587 */         }Integer.valueOf(2), new f[] { new h(bmd.lX, 5, 1, 4, 1), new h(bmd.lU, 5, 1, 4, 1), new h(bmd.ge, 3, 1, 6, 1), new h(bmd.jh, 6, 1, 6, 1), new h(bmd.kU, 1, 1, 8, 1), new h(bmd.l, 3, 3, 6, 1) }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Int2ObjectMap<f[]> a(ImmutableMap<Integer, f[]> ☃) {
/* 598 */     return (Int2ObjectMap<f[]>)new Int2ObjectOpenHashMap((Map)☃);
/*     */   }
/*     */   
/*     */   public static interface f {
/*     */     @Nullable
/*     */     bqv a(aqa param1aqa, Random param1Random);
/*     */   }
/*     */   
/*     */   static class b implements f {
/*     */     private final blx a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private final float e;
/*     */     
/*     */     public b(brw ☃, int i, int j, int k) {
/* 614 */       this.a = ☃.h();
/* 615 */       this.b = i;
/* 616 */       this.c = j;
/* 617 */       this.d = k;
/* 618 */       this.e = 0.05F;
/*     */     }
/*     */ 
/*     */     
/*     */     public bqv a(aqa ☃, Random random) {
/* 623 */       bmb bmb = new bmb(this.a, this.b);
/* 624 */       return new bqv(bmb, new bmb(bmd.oV), this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */   
/*     */   static class c implements f {
/*     */     private final Map<bfo, blx> a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     
/*     */     public c(int ☃, int i, int j, Map<bfo, blx> map) {
/* 635 */       gm.ah.g().filter(bfo1 -> !☃.containsKey(bfo1)).findAny().ifPresent(☃ -> {
/*     */             throw new IllegalStateException("Missing trade for villager type: " + gm.ah.b(☃));
/*     */           });
/* 638 */       this.a = map;
/*     */       
/* 640 */       this.b = ☃;
/* 641 */       this.c = i;
/* 642 */       this.d = j;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public bqv a(aqa ☃, Random random) {
/* 648 */       if (☃ instanceof bfl) {
/* 649 */         bmb bmb = new bmb(this.a.get(((bfl)☃).eX().a()), this.b);
/* 650 */         return new bqv(bmb, new bmb(bmd.oV), this.c, this.d, 0.05F);
/*     */       } 
/* 652 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   static class h implements f {
/*     */     private final bmb a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private final int e;
/*     */     private final float f;
/*     */     
/*     */     public h(buo ☃, int i, int j, int k, int m) {
/* 665 */       this(new bmb(☃), i, j, k, m);
/*     */     }
/*     */     
/*     */     public h(blx ☃, int i, int j, int k) {
/* 669 */       this(new bmb(☃), i, j, 12, k);
/*     */     }
/*     */     
/*     */     public h(blx ☃, int i, int j, int k, int m) {
/* 673 */       this(new bmb(☃), i, j, k, m);
/*     */     }
/*     */     
/*     */     public h(bmb ☃, int i, int j, int k, int m) {
/* 677 */       this(☃, i, j, k, m, 0.05F);
/*     */     }
/*     */     
/*     */     public h(bmb ☃, int i, int j, int k, int m, float f1) {
/* 681 */       this.a = ☃;
/* 682 */       this.b = i;
/* 683 */       this.c = j;
/* 684 */       this.d = k;
/* 685 */       this.e = m;
/* 686 */       this.f = f1;
/*     */     }
/*     */ 
/*     */     
/*     */     public bqv a(aqa ☃, Random random) {
/* 691 */       return new bqv(new bmb(bmd.oV, this.b), new bmb(this.a.b(), this.c), this.d, this.e, this.f);
/*     */     }
/*     */   }
/*     */   
/*     */   static class i implements f {
/*     */     final aps a;
/*     */     final int b;
/*     */     final int c;
/*     */     private final float d;
/*     */     
/*     */     public i(aps ☃, int j, int k) {
/* 702 */       this.a = ☃;
/* 703 */       this.b = j;
/* 704 */       this.c = k;
/* 705 */       this.d = 0.05F;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public bqv a(aqa ☃, Random random) {
/* 711 */       bmb bmb = new bmb(bmd.qR, 1);
/* 712 */       bne.a(bmb, this.a, this.b);
/* 713 */       return new bqv(new bmb(bmd.oV, 1), bmb, 12, this.c, this.d);
/*     */     }
/*     */   }
/*     */   
/*     */   static class e implements f {
/*     */     private final bmb a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private final float e;
/*     */     
/*     */     public e(blx ☃, int i, int j, int k) {
/* 725 */       this(☃, i, j, k, 0.05F);
/*     */     }
/*     */     
/*     */     public e(blx ☃, int i, int j, int k, float f1) {
/* 729 */       this.a = new bmb(☃);
/* 730 */       this.b = i;
/* 731 */       this.c = j;
/* 732 */       this.d = k;
/* 733 */       this.e = f1;
/*     */     }
/*     */ 
/*     */     
/*     */     public bqv a(aqa ☃, Random random) {
/* 738 */       int i = 5 + random.nextInt(15);
/* 739 */       bmb bmb1 = bpu.a(random, new bmb(this.a.b()), i, false);
/* 740 */       int j = Math.min(this.b + i, 64);
/* 741 */       bmb bmb2 = new bmb(bmd.oV, j);
/*     */       
/* 743 */       return new bqv(bmb2, bmb1, this.c, this.d, this.e);
/*     */     }
/*     */   }
/*     */   
/*     */   static class j implements f {
/*     */     private final bmb a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private final int e;
/*     */     private final blx f;
/*     */     private final int g;
/*     */     private final float h;
/*     */     
/*     */     public j(blx ☃, int i, blx blx1, int k, int m, int n, int i1) {
/* 758 */       this.a = new bmb(blx1);
/* 759 */       this.c = m;
/* 760 */       this.d = n;
/* 761 */       this.e = i1;
/* 762 */       this.f = ☃;
/* 763 */       this.g = i;
/* 764 */       this.b = k;
/* 765 */       this.h = 0.05F;
/*     */     }
/*     */ 
/*     */     
/*     */     public bqv a(aqa ☃, Random random) {
/* 770 */       bmb bmb1 = new bmb(bmd.oV, this.c);
/* 771 */       List<bnt> list = (List<bnt>)gm.U.g().filter(☃ -> (!☃.a().isEmpty() && bnu.a(☃))).collect(Collectors.toList());
/* 772 */       bnt bnt = list.get(random.nextInt(list.size()));
/* 773 */       bmb bmb2 = bnv.a(new bmb(this.a.b(), this.b), bnt);
/*     */       
/* 775 */       return new bqv(bmb1, new bmb(this.f, this.g), bmb2, this.d, this.e, this.h);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a implements f {
/*     */     private final blx a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     
/*     */     public a(blx ☃, int i) {
/* 786 */       this(☃, i, 12, 1);
/*     */     }
/*     */     
/*     */     public a(blx ☃, int i, int j, int k) {
/* 790 */       this.a = ☃;
/* 791 */       this.b = i;
/* 792 */       this.c = j;
/* 793 */       this.d = k;
/*     */     }
/*     */ 
/*     */     
/*     */     public bqv a(aqa ☃, Random random) {
/* 798 */       bmb bmb1 = new bmb(bmd.oV, this.b);
/* 799 */       bmb bmb2 = new bmb(this.a);
/*     */       
/* 801 */       if (this.a instanceof bkz) {
/* 802 */         List<bky> list = Lists.newArrayList();
/* 803 */         list.add(a(random));
/*     */         
/* 805 */         if (random.nextFloat() > 0.7F) {
/* 806 */           list.add(a(random));
/*     */         }
/*     */         
/* 809 */         if (random.nextFloat() > 0.8F) {
/* 810 */           list.add(a(random));
/*     */         }
/*     */         
/* 813 */         bmb2 = blb.a(bmb2, list);
/*     */       } 
/*     */       
/* 816 */       return new bqv(bmb1, bmb2, this.c, this.d, 0.2F);
/*     */     }
/*     */     
/*     */     private static bky a(Random ☃) {
/* 820 */       return bky.a(bkx.a(☃.nextInt(16)));
/*     */     }
/*     */   }
/*     */   
/*     */   static class d implements f {
/*     */     private final int a;
/*     */     
/*     */     public d(int ☃) {
/* 828 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public bqv a(aqa ☃, Random random) {
/* 833 */       List<bps> list = (List<bps>)gm.R.g().filter(bps::h).collect(Collectors.toList());
/* 834 */       bps bps = list.get(random.nextInt(list.size()));
/* 835 */       int i = afm.a(random, bps.e(), bps.a());
/* 836 */       bmb bmb = blf.a(new bpv(bps, i));
/* 837 */       int j = 2 + random.nextInt(5 + i * 10) + 3 * i;
/* 838 */       if (bps.b()) {
/* 839 */         j *= 2;
/*     */       }
/* 841 */       if (j > 64) {
/* 842 */         j = 64;
/*     */       }
/*     */       
/* 845 */       return new bqv(new bmb(bmd.oV, j), new bmb(bmd.mc), bmb, 12, this.a, 0.2F);
/*     */     }
/*     */   }
/*     */   
/*     */   static class k implements f {
/*     */     private final int a;
/*     */     private final cla<?> b;
/*     */     private final cxu.a c;
/*     */     private final int d;
/*     */     private final int e;
/*     */     
/*     */     public k(int ☃, cla<?> cla1, cxu.a a1, int i, int j) {
/* 857 */       this.a = ☃;
/* 858 */       this.b = cla1;
/* 859 */       this.c = a1;
/* 860 */       this.d = i;
/* 861 */       this.e = j;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public bqv a(aqa ☃, Random random) {
/* 868 */       if (!(☃.l instanceof aag)) {
/* 869 */         return null;
/*     */       }
/*     */       
/* 872 */       aag aag = (aag)☃.l;
/* 873 */       fx fx = aag.a(this.b, ☃.cB(), 100, true);
/* 874 */       if (fx != null) {
/* 875 */         bmb bmb = bmh.a(aag, fx.u(), fx.w(), (byte)2, true, true);
/* 876 */         bmh.a(aag, bmb);
/* 877 */         cxx.a(bmb, fx, "+", this.c);
/* 878 */         bmb.a(new of("filled_map." + this.b.i().toLowerCase(Locale.ROOT)));
/* 879 */         return new bqv(new bmb(bmd.oV, this.a), new bmb(bmd.mh), bmb, this.d, this.e, 0.2F);
/*     */       } 
/* 881 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   static class g implements f {
/*     */     private final bmb a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final bmb d;
/*     */     private final int e;
/*     */     private final int f;
/*     */     private final int g;
/*     */     private final float h;
/*     */     
/*     */     public g(brw ☃, int i, blx blx1, int j, int k, int m) {
/* 896 */       this(☃, i, 1, blx1, j, k, m);
/*     */     }
/*     */     
/*     */     public g(brw ☃, int i, int j, blx blx1, int k, int m, int n) {
/* 900 */       this.a = new bmb(☃);
/* 901 */       this.b = i;
/* 902 */       this.c = j;
/* 903 */       this.d = new bmb(blx1);
/* 904 */       this.e = k;
/* 905 */       this.f = m;
/* 906 */       this.g = n;
/* 907 */       this.h = 0.05F;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public bqv a(aqa ☃, Random random) {
/* 913 */       return new bqv(new bmb(bmd.oV, this.c), new bmb(this.a.b(), this.b), new bmb(this.d.b(), this.e), this.f, this.g, this.h);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */