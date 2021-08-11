/*      */ import com.google.common.collect.Sets;
/*      */ import com.google.gson.Gson;
/*      */ import com.google.gson.GsonBuilder;
/*      */ import com.google.gson.JsonElement;
/*      */ import com.google.gson.JsonObject;
/*      */ import java.io.BufferedWriter;
/*      */ import java.io.IOException;
/*      */ import java.nio.file.Files;
/*      */ import java.nio.file.Path;
/*      */ import java.nio.file.attribute.FileAttribute;
/*      */ import java.util.Objects;
/*      */ import java.util.Set;
/*      */ import java.util.function.Consumer;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class jg
/*      */   implements hm
/*      */ {
/*   53 */   private static final Logger b = LogManager.getLogger();
/*   54 */   private static final Gson c = (new GsonBuilder()).setPrettyPrinting().create();
/*      */   
/*      */   private final hl d;
/*      */   
/*      */   public jg(hl ☃) {
/*   59 */     this.d = ☃;
/*      */   }
/*      */ 
/*      */   
/*      */   public void a(hn ☃) throws IOException {
/*   64 */     Path path = this.d.b();
/*   65 */     Set<vk> set = Sets.newHashSet();
/*   66 */     a(jf1 -> {
/*      */           if (!☃.add(jf1.b())) {
/*      */             throw new IllegalStateException("Duplicate recipe " + jf1.b());
/*      */           }
/*      */           
/*      */           a(hn1, jf1.a(), path.resolve("data/" + jf1.b().b() + "/recipes/" + jf1.b().a() + ".json"));
/*      */           JsonObject jsonObject = jf1.d();
/*      */           if (jsonObject != null) {
/*      */             b(hn1, jsonObject, path.resolve("data/" + jf1.b().b() + "/advancements/" + jf1.e().a() + ".json"));
/*      */           }
/*      */         });
/*   77 */     b(☃, y.a.a().a("impossible", new bm.a()).b(), path.resolve("data/minecraft/advancements/recipes/root.json"));
/*      */   }
/*      */   
/*      */   private static void a(hn ☃, JsonObject jsonObject, Path path) {
/*      */     try {
/*   82 */       String str1 = c.toJson((JsonElement)jsonObject);
/*   83 */       String str2 = a.hashUnencodedChars(str1).toString();
/*      */       
/*   85 */       if (!Objects.equals(☃.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/*   86 */         Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*   87 */         try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/*   88 */           bufferedWriter.write(str1);
/*      */         } 
/*      */       } 
/*   91 */       ☃.a(path, str2);
/*   92 */     } catch (IOException iOException) {
/*   93 */       b.error("Couldn't save recipe {}", path, iOException);
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void b(hn ☃, JsonObject jsonObject, Path path) {
/*      */     try {
/*   99 */       String str1 = c.toJson((JsonElement)jsonObject);
/*  100 */       String str2 = a.hashUnencodedChars(str1).toString();
/*      */       
/*  102 */       if (!Objects.equals(☃.a(path), str2) || !Files.exists(path, new java.nio.file.LinkOption[0])) {
/*  103 */         Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*  104 */         try (BufferedWriter ☃ = Files.newBufferedWriter(path, new java.nio.file.OpenOption[0])) {
/*  105 */           bufferedWriter.write(str1);
/*      */         } 
/*      */       } 
/*  108 */       ☃.a(path, str2);
/*  109 */     } catch (IOException iOException) {
/*  110 */       b.error("Couldn't save recipe advancement {}", path, iOException);
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void a(Consumer<jf> ☃) {
/*  115 */     a(☃, bup.r, aeg.u);
/*  116 */     b(☃, bup.p, aeg.t);
/*  117 */     b(☃, bup.mC, aeg.x);
/*  118 */     a(☃, bup.s, aeg.r);
/*  119 */     b(☃, bup.q, aeg.v);
/*  120 */     b(☃, bup.n, aeg.s);
/*  121 */     b(☃, bup.o, aeg.w);
/*  122 */     b(☃, bup.mD, aeg.y);
/*      */     
/*  124 */     a(☃, bup.Z, bup.N);
/*  125 */     a(☃, bup.X, bup.L);
/*  126 */     a(☃, bup.aa, bup.O);
/*  127 */     a(☃, bup.Y, bup.M);
/*  128 */     a(☃, bup.V, bup.J);
/*  129 */     a(☃, bup.W, bup.K);
/*  130 */     a(☃, bup.ms, bup.mq);
/*  131 */     a(☃, bup.mj, bup.mh);
/*      */     
/*  133 */     a(☃, bup.af, bup.S);
/*  134 */     a(☃, bup.ad, bup.Q);
/*  135 */     a(☃, bup.ag, bup.T);
/*  136 */     a(☃, bup.ae, bup.R);
/*  137 */     a(☃, bup.ab, bup.U);
/*  138 */     a(☃, bup.ac, bup.P);
/*  139 */     a(☃, bup.mt, bup.mr);
/*  140 */     a(☃, bup.mk, bup.mi);
/*      */     
/*  142 */     b(☃, bmd.qs, bup.r);
/*  143 */     b(☃, bmd.qq, bup.p);
/*  144 */     b(☃, bmd.qt, bup.s);
/*  145 */     b(☃, bmd.qr, bup.q);
/*  146 */     b(☃, bmd.lR, bup.n);
/*  147 */     b(☃, bmd.qp, bup.o);
/*      */     
/*  149 */     c(☃, bup.fa, bup.r);
/*  150 */     d(☃, bup.iu, bup.r);
/*  151 */     e(☃, bup.ip, bup.r);
/*  152 */     f(☃, bup.ik, bup.r);
/*  153 */     g(☃, bup.cw, bup.r);
/*  154 */     h(☃, bup.hO, bup.r);
/*  155 */     i(☃, bup.gl, bup.r);
/*  156 */     j(☃, bup.ds, bup.r);
/*  157 */     k(☃, bup.cc, bup.r);
/*      */     
/*  159 */     c(☃, bup.eY, bup.p);
/*  160 */     d(☃, bup.is, bup.p);
/*  161 */     e(☃, bup.in, bup.p);
/*  162 */     f(☃, bup.ii, bup.p);
/*  163 */     g(☃, bup.cu, bup.p);
/*  164 */     h(☃, bup.hM, bup.p);
/*  165 */     i(☃, bup.ep, bup.p);
/*  166 */     j(☃, bup.dq, bup.p);
/*  167 */     k(☃, bup.cb, bup.p);
/*      */     
/*  169 */     c(☃, bup.mQ, bup.mC);
/*  170 */     d(☃, bup.mS, bup.mC);
/*  171 */     e(☃, bup.mI, bup.mC);
/*  172 */     f(☃, bup.mM, bup.mC);
/*  173 */     g(☃, bup.mG, bup.mC);
/*  174 */     h(☃, bup.mE, bup.mC);
/*  175 */     i(☃, bup.mO, bup.mC);
/*  176 */     j(☃, bup.mK, bup.mC);
/*  177 */     k(☃, bup.mU, bup.mC);
/*      */     
/*  179 */     c(☃, bup.fb, bup.s);
/*  180 */     d(☃, bup.iv, bup.s);
/*  181 */     e(☃, bup.iq, bup.s);
/*  182 */     f(☃, bup.il, bup.s);
/*  183 */     g(☃, bup.cx, bup.s);
/*  184 */     h(☃, bup.hP, bup.s);
/*  185 */     i(☃, bup.gm, bup.s);
/*  186 */     j(☃, bup.dt, bup.s);
/*  187 */     k(☃, bup.ce, bup.s);
/*      */     
/*  189 */     c(☃, bup.eZ, bup.q);
/*  190 */     d(☃, bup.it, bup.q);
/*  191 */     e(☃, bup.io, bup.q);
/*  192 */     f(☃, bup.ij, bup.q);
/*  193 */     g(☃, bup.cv, bup.q);
/*  194 */     h(☃, bup.hN, bup.q);
/*  195 */     i(☃, bup.eq, bup.q);
/*  196 */     j(☃, bup.dr, bup.q);
/*  197 */     k(☃, bup.cd, bup.q);
/*      */     
/*  199 */     c(☃, bup.eW, bup.n);
/*  200 */     d(☃, bup.cf, bup.n);
/*  201 */     e(☃, bup.cJ, bup.n);
/*  202 */     f(☃, bup.dQ, bup.n);
/*  203 */     g(☃, bup.cs, bup.n);
/*  204 */     h(☃, bup.hK, bup.n);
/*  205 */     i(☃, bup.bQ, bup.n);
/*  206 */     j(☃, bup.do, bup.n);
/*  207 */     k(☃, bup.bZ, bup.n);
/*      */     
/*  209 */     c(☃, bup.eX, bup.o);
/*  210 */     d(☃, bup.ir, bup.o);
/*  211 */     e(☃, bup.im, bup.o);
/*  212 */     f(☃, bup.ih, bup.o);
/*  213 */     g(☃, bup.ct, bup.o);
/*  214 */     h(☃, bup.hL, bup.o);
/*  215 */     i(☃, bup.eo, bup.o);
/*  216 */     j(☃, bup.dp, bup.o);
/*  217 */     k(☃, bup.ca, bup.o);
/*      */     
/*  219 */     c(☃, bup.mR, bup.mD);
/*  220 */     d(☃, bup.mT, bup.mD);
/*  221 */     e(☃, bup.mJ, bup.mD);
/*  222 */     f(☃, bup.mN, bup.mD);
/*  223 */     g(☃, bup.mH, bup.mD);
/*  224 */     h(☃, bup.mF, bup.mD);
/*  225 */     i(☃, bup.mP, bup.mD);
/*  226 */     j(☃, bup.mL, bup.mD);
/*  227 */     k(☃, bup.mV, bup.mD);
/*      */ 
/*      */     
/*  230 */     l(☃, bup.bn, bmd.mJ);
/*  231 */     m(☃, bup.gQ, bup.bn);
/*  232 */     n(☃, bup.gQ, bmd.mJ);
/*  233 */     o(☃, bmd.nd, bup.bn);
/*  234 */     p(☃, bmd.nd, bmd.mJ);
/*  235 */     q(☃, bmd.qb, bup.bn);
/*      */     
/*  237 */     l(☃, bup.bj, bmd.mF);
/*  238 */     m(☃, bup.gM, bup.bj);
/*  239 */     n(☃, bup.gM, bmd.mF);
/*  240 */     o(☃, bmd.mZ, bup.bj);
/*  241 */     p(☃, bmd.mZ, bmd.mF);
/*  242 */     q(☃, bmd.pX, bup.bj);
/*      */     
/*  244 */     l(☃, bup.bk, bmd.mG);
/*  245 */     m(☃, bup.gN, bup.bk);
/*  246 */     n(☃, bup.gN, bmd.mG);
/*  247 */     o(☃, bmd.na, bup.bk);
/*  248 */     p(☃, bmd.na, bmd.mG);
/*  249 */     q(☃, bmd.pY, bup.bk);
/*      */     
/*  251 */     l(☃, bup.bh, bmd.mD);
/*  252 */     m(☃, bup.gK, bup.bh);
/*  253 */     n(☃, bup.gK, bmd.mD);
/*  254 */     o(☃, bmd.mX, bup.bh);
/*  255 */     p(☃, bmd.mX, bmd.mD);
/*  256 */     q(☃, bmd.pV, bup.bh);
/*      */     
/*  258 */     l(☃, bup.bf, bmd.mB);
/*  259 */     m(☃, bup.gI, bup.bf);
/*  260 */     n(☃, bup.gI, bmd.mB);
/*  261 */     o(☃, bmd.mV, bup.bf);
/*  262 */     p(☃, bmd.mV, bmd.mB);
/*  263 */     q(☃, bmd.pT, bup.bf);
/*      */     
/*  265 */     l(☃, bup.bl, bmd.mH);
/*  266 */     m(☃, bup.gO, bup.bl);
/*  267 */     n(☃, bup.gO, bmd.mH);
/*  268 */     o(☃, bmd.nb, bup.bl);
/*  269 */     p(☃, bmd.nb, bmd.mH);
/*  270 */     q(☃, bmd.pZ, bup.bl);
/*      */     
/*  272 */     l(☃, bup.bb, bmd.mx);
/*  273 */     m(☃, bup.gE, bup.bb);
/*  274 */     n(☃, bup.gE, bmd.mx);
/*  275 */     o(☃, bmd.mR, bup.bb);
/*  276 */     p(☃, bmd.mR, bmd.mx);
/*  277 */     q(☃, bmd.pP, bup.bb);
/*      */     
/*  279 */     l(☃, bup.bg, bmd.mC);
/*  280 */     m(☃, bup.gJ, bup.bg);
/*  281 */     n(☃, bup.gJ, bmd.mC);
/*  282 */     o(☃, bmd.mW, bup.bg);
/*  283 */     p(☃, bmd.mW, bmd.mC);
/*  284 */     q(☃, bmd.pU, bup.bg);
/*      */     
/*  286 */     l(☃, bup.bd, bmd.mz);
/*  287 */     m(☃, bup.gG, bup.bd);
/*  288 */     n(☃, bup.gG, bmd.mz);
/*  289 */     o(☃, bmd.mT, bup.bd);
/*  290 */     p(☃, bmd.mT, bmd.mz);
/*  291 */     q(☃, bmd.pR, bup.bd);
/*      */     
/*  293 */     l(☃, bup.ba, bmd.mw);
/*  294 */     m(☃, bup.gD, bup.ba);
/*  295 */     n(☃, bup.gD, bmd.mw);
/*  296 */     o(☃, bmd.mQ, bup.ba);
/*  297 */     p(☃, bmd.mQ, bmd.mw);
/*  298 */     q(☃, bmd.pO, bup.ba);
/*      */     
/*  300 */     l(☃, bup.aZ, bmd.mv);
/*  301 */     m(☃, bup.gC, bup.aZ);
/*  302 */     n(☃, bup.gC, bmd.mv);
/*  303 */     o(☃, bmd.mP, bup.aZ);
/*  304 */     p(☃, bmd.mP, bmd.mv);
/*  305 */     q(☃, bmd.pN, bup.aZ);
/*      */     
/*  307 */     l(☃, bup.be, bmd.mA);
/*  308 */     m(☃, bup.gH, bup.be);
/*  309 */     n(☃, bup.gH, bmd.mA);
/*  310 */     o(☃, bmd.mU, bup.be);
/*  311 */     p(☃, bmd.mU, bmd.mA);
/*  312 */     q(☃, bmd.pS, bup.be);
/*      */     
/*  314 */     l(☃, bup.bi, bmd.mE);
/*  315 */     m(☃, bup.gL, bup.bi);
/*  316 */     n(☃, bup.gL, bmd.mE);
/*  317 */     o(☃, bmd.mY, bup.bi);
/*  318 */     p(☃, bmd.mY, bmd.mE);
/*  319 */     q(☃, bmd.pW, bup.bi);
/*      */     
/*  321 */     l(☃, bup.bm, bmd.mI);
/*  322 */     m(☃, bup.gP, bup.bm);
/*  323 */     n(☃, bup.gP, bmd.mI);
/*  324 */     o(☃, bmd.nc, bup.bm);
/*  325 */     p(☃, bmd.nc, bmd.mI);
/*  326 */     q(☃, bmd.qa, bup.bm);
/*      */     
/*  328 */     m(☃, bup.gB, bup.aY);
/*  329 */     o(☃, bmd.mO, bup.aY);
/*  330 */     q(☃, bmd.pM, bup.aY);
/*      */     
/*  332 */     l(☃, bup.bc, bmd.my);
/*  333 */     m(☃, bup.gF, bup.bc);
/*  334 */     n(☃, bup.gF, bmd.my);
/*  335 */     o(☃, bmd.mS, bup.bc);
/*  336 */     p(☃, bmd.mS, bmd.my);
/*  337 */     q(☃, bmd.pQ, bup.bc);
/*      */ 
/*      */     
/*  340 */     r(☃, bup.dn, bmd.mJ);
/*  341 */     s(☃, bup.gk, bup.dn);
/*  342 */     t(☃, bup.gk, bmd.mJ);
/*      */     
/*  344 */     r(☃, bup.dj, bmd.mF);
/*  345 */     s(☃, bup.gg, bup.dj);
/*  346 */     t(☃, bup.gg, bmd.mF);
/*      */     
/*  348 */     r(☃, bup.dk, bmd.mG);
/*  349 */     s(☃, bup.gh, bup.dk);
/*  350 */     t(☃, bup.gh, bmd.mG);
/*      */     
/*  352 */     r(☃, bup.dh, bmd.mD);
/*  353 */     s(☃, bup.ge, bup.dh);
/*  354 */     t(☃, bup.ge, bmd.mD);
/*      */     
/*  356 */     r(☃, bup.df, bmd.mB);
/*  357 */     s(☃, bup.gc, bup.df);
/*  358 */     t(☃, bup.gc, bmd.mB);
/*      */     
/*  360 */     r(☃, bup.dl, bmd.mH);
/*  361 */     s(☃, bup.gi, bup.dl);
/*  362 */     t(☃, bup.gi, bmd.mH);
/*      */     
/*  364 */     r(☃, bup.db, bmd.mx);
/*  365 */     s(☃, bup.fY, bup.db);
/*  366 */     t(☃, bup.fY, bmd.mx);
/*      */     
/*  368 */     r(☃, bup.dg, bmd.mC);
/*  369 */     s(☃, bup.gd, bup.dg);
/*  370 */     t(☃, bup.gd, bmd.mC);
/*      */     
/*  372 */     r(☃, bup.dd, bmd.mz);
/*  373 */     s(☃, bup.ga, bup.dd);
/*  374 */     t(☃, bup.ga, bmd.mz);
/*      */     
/*  376 */     r(☃, bup.da, bmd.mw);
/*  377 */     s(☃, bup.fX, bup.da);
/*  378 */     t(☃, bup.fX, bmd.mw);
/*      */     
/*  380 */     r(☃, bup.cZ, bmd.mv);
/*  381 */     s(☃, bup.fW, bup.cZ);
/*  382 */     t(☃, bup.fW, bmd.mv);
/*      */     
/*  384 */     r(☃, bup.de, bmd.mA);
/*  385 */     s(☃, bup.gb, bup.de);
/*  386 */     t(☃, bup.gb, bmd.mA);
/*      */     
/*  388 */     r(☃, bup.di, bmd.mE);
/*  389 */     s(☃, bup.gf, bup.di);
/*  390 */     t(☃, bup.gf, bmd.mE);
/*      */     
/*  392 */     r(☃, bup.dm, bmd.mI);
/*  393 */     s(☃, bup.gj, bup.dm);
/*  394 */     t(☃, bup.gj, bmd.mI);
/*      */     
/*  396 */     r(☃, bup.cY, bmd.mu);
/*  397 */     s(☃, bup.fV, bup.cY);
/*  398 */     t(☃, bup.fV, bmd.mu);
/*      */     
/*  400 */     r(☃, bup.dc, bmd.my);
/*  401 */     s(☃, bup.fZ, bup.dc);
/*  402 */     t(☃, bup.fZ, bmd.my);
/*      */ 
/*      */     
/*  405 */     u(☃, bup.fU, bmd.mJ);
/*  406 */     u(☃, bup.fQ, bmd.mF);
/*  407 */     u(☃, bup.fR, bmd.mG);
/*  408 */     u(☃, bup.fO, bmd.mD);
/*  409 */     u(☃, bup.fM, bmd.mB);
/*  410 */     u(☃, bup.fS, bmd.mH);
/*  411 */     u(☃, bup.fI, bmd.mx);
/*  412 */     u(☃, bup.fN, bmd.mC);
/*  413 */     u(☃, bup.fK, bmd.mz);
/*  414 */     u(☃, bup.fH, bmd.mw);
/*  415 */     u(☃, bup.fG, bmd.mv);
/*  416 */     u(☃, bup.fL, bmd.mA);
/*  417 */     u(☃, bup.fP, bmd.mE);
/*  418 */     u(☃, bup.fT, bmd.mI);
/*  419 */     u(☃, bup.fF, bmd.mu);
/*  420 */     u(☃, bup.fJ, bmd.my);
/*      */     
/*  422 */     v(☃, bup.kb, bmd.mJ);
/*  423 */     v(☃, bup.jX, bmd.mF);
/*  424 */     v(☃, bup.jY, bmd.mG);
/*  425 */     v(☃, bup.jV, bmd.mD);
/*  426 */     v(☃, bup.jT, bmd.mB);
/*  427 */     v(☃, bup.jZ, bmd.mH);
/*  428 */     v(☃, bup.jP, bmd.mx);
/*  429 */     v(☃, bup.jU, bmd.mC);
/*  430 */     v(☃, bup.jR, bmd.mz);
/*  431 */     v(☃, bup.jO, bmd.mw);
/*  432 */     v(☃, bup.jN, bmd.mv);
/*  433 */     v(☃, bup.jS, bmd.mA);
/*  434 */     v(☃, bup.jW, bmd.mE);
/*  435 */     v(☃, bup.ka, bmd.mI);
/*  436 */     v(☃, bup.jM, bmd.mu);
/*  437 */     v(☃, bup.jQ, bmd.my);
/*      */ 
/*      */     
/*  440 */     jh.a(bup.fD, 6)
/*  441 */       .a(Character.valueOf('#'), bup.cz)
/*  442 */       .a(Character.valueOf('S'), bmd.kP)
/*  443 */       .a(Character.valueOf('X'), bmd.kh)
/*  444 */       .a("XSX")
/*  445 */       .a("X#X")
/*  446 */       .a("XSX")
/*  447 */       .a("has_rail", a(bup.ch))
/*  448 */       .a(☃);
/*      */     
/*  450 */     ji.a(bup.g, 2)
/*  451 */       .b(bup.e)
/*  452 */       .b(bup.m)
/*  453 */       .a("has_stone", a(bup.e))
/*  454 */       .a(☃);
/*      */     
/*  456 */     jh.a(bup.fo)
/*  457 */       .a(Character.valueOf('I'), bup.bF)
/*  458 */       .a(Character.valueOf('i'), bmd.kh)
/*  459 */       .a("III")
/*  460 */       .a(" i ")
/*  461 */       .a("iii")
/*  462 */       .a("has_iron_block", a(bup.bF))
/*  463 */       .a(☃);
/*      */     
/*  465 */     jh.a(bmd.pC)
/*  466 */       .a(Character.valueOf('/'), bmd.kP)
/*  467 */       .a(Character.valueOf('_'), bup.hR)
/*  468 */       .a("///")
/*  469 */       .a(" / ")
/*  470 */       .a("/_/")
/*  471 */       .a("has_stone_slab", a(bup.hR))
/*  472 */       .a(☃);
/*      */     
/*  474 */     jh.a(bmd.kd, 4)
/*  475 */       .a(Character.valueOf('#'), bmd.kP)
/*  476 */       .a(Character.valueOf('X'), bmd.lw)
/*  477 */       .a(Character.valueOf('Y'), bmd.kT)
/*  478 */       .a("X")
/*  479 */       .a("#")
/*  480 */       .a("Y")
/*  481 */       .a("has_feather", a(bmd.kT))
/*  482 */       .a("has_flint", a(bmd.lw))
/*  483 */       .a(☃);
/*      */     
/*  485 */     jh.a(bup.lS, 1)
/*  486 */       .a(Character.valueOf('P'), aeg.c)
/*  487 */       .a(Character.valueOf('S'), aeg.j)
/*  488 */       .a("PSP")
/*  489 */       .a("P P")
/*  490 */       .a("PSP")
/*  491 */       .a("has_planks", a(aeg.c))
/*  492 */       .a("has_wood_slab", a(aeg.j))
/*  493 */       .a(☃);
/*      */     
/*  495 */     jh.a(bup.es)
/*  496 */       .a(Character.valueOf('S'), bmd.pm)
/*  497 */       .a(Character.valueOf('G'), bup.ap)
/*  498 */       .a(Character.valueOf('O'), bup.bK)
/*  499 */       .a("GGG")
/*  500 */       .a("GSG")
/*  501 */       .a("OOO")
/*  502 */       .a("has_nether_star", a(bmd.pm))
/*  503 */       .a(☃);
/*      */     
/*  505 */     jh.a(bup.nd)
/*  506 */       .a(Character.valueOf('P'), aeg.c)
/*  507 */       .a(Character.valueOf('H'), bmd.rq)
/*  508 */       .a("PPP")
/*  509 */       .a("HHH")
/*  510 */       .a("PPP")
/*  511 */       .a("has_honeycomb", a(bmd.rq))
/*  512 */       .a(☃);
/*      */     
/*  514 */     ji.a(bmd.qh)
/*  515 */       .b(bmd.kQ)
/*  516 */       .b(bmd.qf, 6)
/*  517 */       .a("has_beetroot", a(bmd.qf))
/*  518 */       .a(☃);
/*      */     
/*  520 */     ji.a(bmd.mJ)
/*  521 */       .b(bmd.mr)
/*  522 */       .a("black_dye")
/*  523 */       .a("has_ink_sac", a(bmd.mr))
/*  524 */       .a(☃);
/*      */     
/*  526 */     ji.a(bmd.mJ)
/*  527 */       .b(bup.bA)
/*  528 */       .a("black_dye")
/*  529 */       .a("has_black_flower", a(bup.bA))
/*  530 */       .a(☃, "black_dye_from_wither_rose");
/*      */     
/*  532 */     ji.a(bmd.nz, 2)
/*  533 */       .b(bmd.nr)
/*  534 */       .a("has_blaze_rod", a(bmd.nr))
/*  535 */       .a(☃);
/*      */     
/*  537 */     ji.a(bmd.mF)
/*  538 */       .b(bmd.mt)
/*  539 */       .a("blue_dye")
/*  540 */       .a("has_lapis_lazuli", a(bmd.mt))
/*  541 */       .a(☃);
/*      */     
/*  543 */     ji.a(bmd.mF)
/*  544 */       .b(bup.bz)
/*  545 */       .a("blue_dye")
/*  546 */       .a("has_blue_flower", a(bup.bz))
/*  547 */       .a(☃, "blue_dye_from_cornflower");
/*      */     
/*  549 */     jh.a(bup.kV)
/*  550 */       .a(Character.valueOf('#'), bup.gT)
/*  551 */       .a("###")
/*  552 */       .a("###")
/*  553 */       .a("###")
/*  554 */       .a("has_packed_ice", a(bup.gT))
/*  555 */       .a(☃);
/*      */     
/*  557 */     jh.a(bup.iM)
/*  558 */       .a(Character.valueOf('X'), bmd.mK)
/*  559 */       .a("XXX")
/*  560 */       .a("XXX")
/*  561 */       .a("XXX")
/*  562 */       .a("has_bonemeal", a(bmd.mK))
/*  563 */       .a(☃);
/*      */     
/*  565 */     ji.a(bmd.mK, 3)
/*  566 */       .b(bmd.mL)
/*  567 */       .a("bonemeal")
/*  568 */       .a("has_bone", a(bmd.mL))
/*  569 */       .a(☃);
/*      */     
/*  571 */     ji.a(bmd.mK, 9)
/*  572 */       .b(bup.iM)
/*  573 */       .a("bonemeal")
/*  574 */       .a("has_bone_block", a(bup.iM))
/*  575 */       .a(☃, "bone_meal_from_bone_block");
/*      */     
/*  577 */     ji.a(bmd.mc)
/*  578 */       .b(bmd.mb, 3)
/*  579 */       .b(bmd.lS)
/*  580 */       .a("has_paper", a(bmd.mb))
/*  581 */       .a(☃);
/*      */     
/*  583 */     jh.a(bup.bI)
/*  584 */       .a(Character.valueOf('#'), aeg.c)
/*  585 */       .a(Character.valueOf('X'), bmd.mc)
/*  586 */       .a("###")
/*  587 */       .a("XXX")
/*  588 */       .a("###")
/*  589 */       .a("has_book", a(bmd.mc))
/*  590 */       .a(☃);
/*      */     
/*  592 */     jh.a(bmd.kc)
/*  593 */       .a(Character.valueOf('#'), bmd.kP)
/*  594 */       .a(Character.valueOf('X'), bmd.kS)
/*  595 */       .a(" #X")
/*  596 */       .a("# X")
/*  597 */       .a(" #X")
/*  598 */       .a("has_string", a(bmd.kS))
/*  599 */       .a(☃);
/*      */     
/*  601 */     jh.a(bmd.kQ, 4)
/*  602 */       .a(Character.valueOf('#'), aeg.c)
/*  603 */       .a("# #")
/*  604 */       .a(" # ")
/*  605 */       .a("has_brown_mushroom", a(bup.bC))
/*  606 */       .a("has_red_mushroom", a(bup.bD))
/*  607 */       .a("has_mushroom_stew", a(bmd.kR))
/*  608 */       .a(☃);
/*      */     
/*  610 */     jh.a(bmd.kX)
/*  611 */       .a(Character.valueOf('#'), bmd.kW)
/*  612 */       .a("###")
/*  613 */       .a("has_wheat", a(bmd.kW))
/*  614 */       .a(☃);
/*      */     
/*  616 */     jh.a(bup.ea)
/*  617 */       .a(Character.valueOf('B'), bmd.nr)
/*  618 */       .a(Character.valueOf('#'), aeg.ac)
/*  619 */       .a(" B ")
/*  620 */       .a("###")
/*  621 */       .a("has_blaze_rod", a(bmd.nr))
/*  622 */       .a(☃);
/*      */     
/*  624 */     jh.a(bup.bG)
/*  625 */       .a(Character.valueOf('#'), bmd.lY)
/*  626 */       .a("##")
/*  627 */       .a("##")
/*  628 */       .a("has_brick", a(bmd.lY))
/*  629 */       .a(☃);
/*      */     
/*  631 */     jh.a(bup.hW, 6)
/*  632 */       .a(Character.valueOf('#'), bup.bG)
/*  633 */       .a("###")
/*  634 */       .a("has_brick_block", a(bup.bG))
/*  635 */       .a(☃);
/*      */     
/*  637 */     jh.a(bup.dR, 4)
/*  638 */       .a(Character.valueOf('#'), bup.bG)
/*  639 */       .a("#  ")
/*  640 */       .a("## ")
/*  641 */       .a("###")
/*  642 */       .a("has_brick_block", a(bup.bG))
/*  643 */       .a(☃);
/*      */     
/*  645 */     ji.a(bmd.mG)
/*  646 */       .b(bmd.ms)
/*  647 */       .a("brown_dye")
/*  648 */       .a("has_cocoa_beans", a(bmd.ms))
/*  649 */       .a(☃);
/*      */     
/*  651 */     jh.a(bmd.lK)
/*  652 */       .a(Character.valueOf('#'), bmd.kh)
/*  653 */       .a("# #")
/*  654 */       .a(" # ")
/*  655 */       .a("has_iron_ingot", a(bmd.kh))
/*  656 */       .a(☃);
/*      */     
/*  658 */     jh.a(bup.cW)
/*  659 */       .a(Character.valueOf('A'), bmd.lT)
/*  660 */       .a(Character.valueOf('B'), bmd.mM)
/*  661 */       .a(Character.valueOf('C'), bmd.kW)
/*  662 */       .a(Character.valueOf('E'), bmd.mg)
/*  663 */       .a("AAA")
/*  664 */       .a("BEB")
/*  665 */       .a("CCC")
/*  666 */       .a("has_egg", a(bmd.mg))
/*  667 */       .a(☃);
/*      */     
/*  669 */     jh.a(bup.me)
/*  670 */       .a(Character.valueOf('L'), aeg.q)
/*  671 */       .a(Character.valueOf('S'), bmd.kP)
/*  672 */       .a(Character.valueOf('C'), aeg.X)
/*  673 */       .a(" S ")
/*  674 */       .a("SCS")
/*  675 */       .a("LLL")
/*  676 */       .a("has_stick", a(bmd.kP))
/*  677 */       .a("has_coal", a(aeg.X))
/*  678 */       .a(☃);
/*      */     
/*  680 */     jh.a(bmd.pk)
/*  681 */       .a(Character.valueOf('#'), bmd.mi)
/*  682 */       .a(Character.valueOf('X'), bmd.oY)
/*  683 */       .a("# ")
/*  684 */       .a(" X")
/*  685 */       .a("has_carrot", a(bmd.oY))
/*  686 */       .a(☃);
/*      */     
/*  688 */     jh.a(bmd.pl)
/*  689 */       .a(Character.valueOf('#'), bmd.mi)
/*  690 */       .a(Character.valueOf('X'), bmd.bx)
/*  691 */       .a("# ")
/*  692 */       .a(" X")
/*  693 */       .a("has_warped_fungus", a(bmd.bx))
/*  694 */       .a(☃);
/*      */     
/*  696 */     jh.a(bup.eb)
/*  697 */       .a(Character.valueOf('#'), bmd.kh)
/*  698 */       .a("# #")
/*  699 */       .a("# #")
/*  700 */       .a("###")
/*  701 */       .a("has_water_bucket", a(bmd.lL))
/*  702 */       .a(☃);
/*      */     
/*  704 */     jh.a(bup.na)
/*  705 */       .a(Character.valueOf('#'), aeg.j)
/*  706 */       .a("# #")
/*  707 */       .a("# #")
/*  708 */       .a("###")
/*  709 */       .a("has_wood_slab", a(aeg.j))
/*  710 */       .a(☃);
/*      */     
/*  712 */     jh.a(bup.bR)
/*  713 */       .a(Character.valueOf('#'), aeg.c)
/*  714 */       .a("###")
/*  715 */       .a("# #")
/*  716 */       .a("###")
/*  717 */       .a("has_lots_of_items", new bn.a(bg.b.a, bz.d.b(10), bz.d.e, bz.d.e, new bq[0]))
/*  718 */       .a(☃);
/*      */     
/*  720 */     jh.a(bmd.me)
/*  721 */       .a(Character.valueOf('A'), bup.bR)
/*  722 */       .a(Character.valueOf('B'), bmd.lN)
/*  723 */       .a("A")
/*  724 */       .a("B")
/*  725 */       .a("has_minecart", a(bmd.lN))
/*  726 */       .a(☃);
/*      */     
/*  728 */     jh.a(bup.nG)
/*  729 */       .a(Character.valueOf('#'), bup.hY)
/*  730 */       .a("#")
/*  731 */       .a("#")
/*  732 */       .a("has_nether_bricks", a(bup.dV))
/*  733 */       .a(☃);
/*      */     
/*  735 */     jh.a(bup.fA)
/*  736 */       .a(Character.valueOf('#'), bup.hZ)
/*  737 */       .a("#")
/*  738 */       .a("#")
/*  739 */       .a("has_chiseled_quartz_block", a(bup.fA))
/*  740 */       .a("has_quartz_block", a(bup.fz))
/*  741 */       .a("has_quartz_pillar", a(bup.fB))
/*  742 */       .a(☃);
/*      */     
/*  744 */     jh.a(bup.dx)
/*  745 */       .a(Character.valueOf('#'), bup.hX)
/*  746 */       .a("#")
/*  747 */       .a("#")
/*  748 */       .a("has_stone_bricks", a(aeg.d))
/*  749 */       .a(☃);
/*      */     
/*  751 */     jh.a(bup.cG)
/*  752 */       .a(Character.valueOf('#'), bmd.lZ)
/*  753 */       .a("##")
/*  754 */       .a("##")
/*  755 */       .a("has_clay_ball", a(bmd.lZ))
/*  756 */       .a(☃);
/*      */     
/*  758 */     jh.a(bmd.mj)
/*  759 */       .a(Character.valueOf('#'), bmd.ki)
/*  760 */       .a(Character.valueOf('X'), bmd.lP)
/*  761 */       .a(" # ")
/*  762 */       .a("#X#")
/*  763 */       .a(" # ")
/*  764 */       .a("has_redstone", a(bmd.lP))
/*  765 */       .a(☃);
/*      */     
/*  767 */     ji.a(bmd.ke, 9)
/*  768 */       .b(bup.gS)
/*  769 */       .a("has_coal_block", a(bup.gS))
/*  770 */       .a(☃);
/*      */     
/*  772 */     jh.a(bup.gS)
/*  773 */       .a(Character.valueOf('#'), bmd.ke)
/*  774 */       .a("###")
/*  775 */       .a("###")
/*  776 */       .a("###")
/*  777 */       .a("has_coal", a(bmd.ke))
/*  778 */       .a(☃);
/*      */     
/*  780 */     jh.a(bup.k, 4)
/*  781 */       .a(Character.valueOf('D'), bup.j)
/*  782 */       .a(Character.valueOf('G'), bup.E)
/*  783 */       .a("DG")
/*  784 */       .a("GD")
/*  785 */       .a("has_gravel", a(bup.E))
/*  786 */       .a(☃);
/*      */     
/*  788 */     jh.a(bup.hV, 6)
/*  789 */       .a(Character.valueOf('#'), bup.m)
/*  790 */       .a("###")
/*  791 */       .a("has_cobblestone", a(bup.m))
/*  792 */       .a(☃);
/*      */     
/*  794 */     jh.a(bup.et, 6)
/*  795 */       .a(Character.valueOf('#'), bup.m)
/*  796 */       .a("###")
/*  797 */       .a("###")
/*  798 */       .a("has_cobblestone", a(bup.m))
/*  799 */       .a(☃);
/*      */     
/*  801 */     jh.a(bup.fu)
/*  802 */       .a(Character.valueOf('#'), bup.cz)
/*  803 */       .a(Character.valueOf('X'), bmd.ps)
/*  804 */       .a(Character.valueOf('I'), bup.b)
/*  805 */       .a(" # ")
/*  806 */       .a("#X#")
/*  807 */       .a("III")
/*  808 */       .a("has_quartz", a(bmd.ps))
/*  809 */       .a(☃);
/*      */     
/*  811 */     jh.a(bmd.mh)
/*  812 */       .a(Character.valueOf('#'), bmd.kh)
/*  813 */       .a(Character.valueOf('X'), bmd.lP)
/*  814 */       .a(" # ")
/*  815 */       .a("#X#")
/*  816 */       .a(" # ")
/*  817 */       .a("has_redstone", a(bmd.lP))
/*  818 */       .a(☃);
/*      */     
/*  820 */     jh.a(bmd.ne, 8)
/*  821 */       .a(Character.valueOf('#'), bmd.kW)
/*  822 */       .a(Character.valueOf('X'), bmd.ms)
/*  823 */       .a("#X#")
/*  824 */       .a("has_cocoa", a(bmd.ms))
/*  825 */       .a(☃);
/*      */     
/*  827 */     jh.a(bup.bV)
/*  828 */       .a(Character.valueOf('#'), aeg.c)
/*  829 */       .a("##")
/*  830 */       .a("##")
/*  831 */       .a("has_planks", a(aeg.c))
/*  832 */       .a(☃);
/*      */     
/*  834 */     jh.a(bmd.qQ)
/*  835 */       .a(Character.valueOf('~'), bmd.kS)
/*  836 */       .a(Character.valueOf('#'), bmd.kP)
/*  837 */       .a(Character.valueOf('&'), bmd.kh)
/*  838 */       .a(Character.valueOf('$'), bup.el)
/*  839 */       .a("#&#")
/*  840 */       .a("~$~")
/*  841 */       .a(" # ")
/*  842 */       .a("has_string", a(bmd.kS))
/*  843 */       .a("has_stick", a(bmd.kP))
/*  844 */       .a("has_iron_ingot", a(bmd.kh))
/*  845 */       .a("has_tripwire_hook", a(bup.el))
/*  846 */       .a(☃);
/*      */     
/*  848 */     jh.a(bup.lR)
/*  849 */       .a(Character.valueOf('#'), aeg.c)
/*  850 */       .a(Character.valueOf('@'), bmd.kS)
/*  851 */       .a("@@")
/*  852 */       .a("##")
/*  853 */       .a("has_string", a(bmd.kS))
/*  854 */       .a(☃);
/*      */     
/*  856 */     jh.a(bup.hH)
/*  857 */       .a(Character.valueOf('#'), bup.ia)
/*  858 */       .a("#")
/*  859 */       .a("#")
/*  860 */       .a("has_red_sandstone", a(bup.hG))
/*  861 */       .a("has_chiseled_red_sandstone", a(bup.hH))
/*  862 */       .a("has_cut_red_sandstone", a(bup.hI))
/*  863 */       .a(☃);
/*      */     
/*  865 */     jh.a(bup.au)
/*  866 */       .a(Character.valueOf('#'), bup.hS)
/*  867 */       .a("#")
/*  868 */       .a("#")
/*  869 */       .a("has_stone_slab", a(bup.hS))
/*  870 */       .a(☃);
/*      */     
/*  872 */     ji.a(bmd.mD, 2)
/*  873 */       .b(bmd.mF)
/*  874 */       .b(bmd.mH)
/*  875 */       .a("has_green_dye", a(bmd.mH))
/*  876 */       .a("has_blue_dye", a(bmd.mF))
/*  877 */       .a(☃);
/*      */     
/*  879 */     jh.a(bup.gs)
/*  880 */       .a(Character.valueOf('S'), bmd.pv)
/*  881 */       .a(Character.valueOf('I'), bmd.mJ)
/*  882 */       .a("SSS")
/*  883 */       .a("SIS")
/*  884 */       .a("SSS")
/*  885 */       .a("has_prismarine_shard", a(bmd.pv))
/*  886 */       .a(☃);
/*      */     
/*  888 */     jh.a(bup.gt, 4)
/*  889 */       .a(Character.valueOf('#'), bup.gq)
/*  890 */       .a("#  ")
/*  891 */       .a("## ")
/*  892 */       .a("###")
/*  893 */       .a("has_prismarine", a(bup.gq))
/*  894 */       .a(☃);
/*      */     
/*  896 */     jh.a(bup.gu, 4)
/*  897 */       .a(Character.valueOf('#'), bup.gr)
/*  898 */       .a("#  ")
/*  899 */       .a("## ")
/*  900 */       .a("###")
/*  901 */       .a("has_prismarine_bricks", a(bup.gr))
/*  902 */       .a(☃);
/*      */     
/*  904 */     jh.a(bup.gv, 4)
/*  905 */       .a(Character.valueOf('#'), bup.gs)
/*  906 */       .a("#  ")
/*  907 */       .a("## ")
/*  908 */       .a("###")
/*  909 */       .a("has_dark_prismarine", a(bup.gs))
/*  910 */       .a(☃);
/*      */     
/*  912 */     jh.a(bup.fv)
/*  913 */       .a(Character.valueOf('Q'), bmd.ps)
/*  914 */       .a(Character.valueOf('G'), bup.ap)
/*  915 */       .a(Character.valueOf('W'), bon.a(aeg.j))
/*  916 */       .a("GGG")
/*  917 */       .a("QQQ")
/*  918 */       .a("WWW")
/*  919 */       .a("has_quartz", a(bmd.ps))
/*  920 */       .a(☃);
/*      */     
/*  922 */     jh.a(bup.aO, 6)
/*  923 */       .a(Character.valueOf('R'), bmd.lP)
/*  924 */       .a(Character.valueOf('#'), bup.cq)
/*  925 */       .a(Character.valueOf('X'), bmd.kh)
/*  926 */       .a("X X")
/*  927 */       .a("X#X")
/*  928 */       .a("XRX")
/*  929 */       .a("has_rail", a(bup.ch))
/*  930 */       .a(☃);
/*      */     
/*  932 */     ji.a(bmd.kg, 9)
/*  933 */       .b(bup.bU)
/*  934 */       .a("has_diamond_block", a(bup.bU))
/*  935 */       .a(☃);
/*      */     
/*  937 */     jh.a(bmd.kI)
/*  938 */       .a(Character.valueOf('#'), bmd.kP)
/*  939 */       .a(Character.valueOf('X'), bmd.kg)
/*  940 */       .a("XX")
/*  941 */       .a("X#")
/*  942 */       .a(" #")
/*  943 */       .a("has_diamond", a(bmd.kg))
/*  944 */       .a(☃);
/*      */     
/*  946 */     jh.a(bup.bU)
/*  947 */       .a(Character.valueOf('#'), bmd.kg)
/*  948 */       .a("###")
/*  949 */       .a("###")
/*  950 */       .a("###")
/*  951 */       .a("has_diamond", a(bmd.kg))
/*  952 */       .a(☃);
/*      */     
/*  954 */     jh.a(bmd.ln)
/*  955 */       .a(Character.valueOf('X'), bmd.kg)
/*  956 */       .a("X X")
/*  957 */       .a("X X")
/*  958 */       .a("has_diamond", a(bmd.kg))
/*  959 */       .a(☃);
/*      */     
/*  961 */     jh.a(bmd.ll)
/*  962 */       .a(Character.valueOf('X'), bmd.kg)
/*  963 */       .a("X X")
/*  964 */       .a("XXX")
/*  965 */       .a("XXX")
/*  966 */       .a("has_diamond", a(bmd.kg))
/*  967 */       .a(☃);
/*      */     
/*  969 */     jh.a(bmd.lk)
/*  970 */       .a(Character.valueOf('X'), bmd.kg)
/*  971 */       .a("XXX")
/*  972 */       .a("X X")
/*  973 */       .a("has_diamond", a(bmd.kg))
/*  974 */       .a(☃);
/*      */     
/*  976 */     jh.a(bmd.kJ)
/*  977 */       .a(Character.valueOf('#'), bmd.kP)
/*  978 */       .a(Character.valueOf('X'), bmd.kg)
/*  979 */       .a("XX")
/*  980 */       .a(" #")
/*  981 */       .a(" #")
/*  982 */       .a("has_diamond", a(bmd.kg))
/*  983 */       .a(☃);
/*      */     
/*  985 */     jh.a(bmd.lm)
/*  986 */       .a(Character.valueOf('X'), bmd.kg)
/*  987 */       .a("XXX")
/*  988 */       .a("X X")
/*  989 */       .a("X X")
/*  990 */       .a("has_diamond", a(bmd.kg))
/*  991 */       .a(☃);
/*      */     
/*  993 */     jh.a(bmd.kH)
/*  994 */       .a(Character.valueOf('#'), bmd.kP)
/*  995 */       .a(Character.valueOf('X'), bmd.kg)
/*  996 */       .a("XXX")
/*  997 */       .a(" # ")
/*  998 */       .a(" # ")
/*  999 */       .a("has_diamond", a(bmd.kg))
/* 1000 */       .a(☃);
/*      */     
/* 1002 */     jh.a(bmd.kG)
/* 1003 */       .a(Character.valueOf('#'), bmd.kP)
/* 1004 */       .a(Character.valueOf('X'), bmd.kg)
/* 1005 */       .a("X")
/* 1006 */       .a("#")
/* 1007 */       .a("#")
/* 1008 */       .a("has_diamond", a(bmd.kg))
/* 1009 */       .a(☃);
/*      */     
/* 1011 */     jh.a(bmd.kF)
/* 1012 */       .a(Character.valueOf('#'), bmd.kP)
/* 1013 */       .a(Character.valueOf('X'), bmd.kg)
/* 1014 */       .a("X")
/* 1015 */       .a("X")
/* 1016 */       .a("#")
/* 1017 */       .a("has_diamond", a(bmd.kg))
/* 1018 */       .a(☃);
/*      */     
/* 1020 */     jh.a(bup.e, 2)
/* 1021 */       .a(Character.valueOf('Q'), bmd.ps)
/* 1022 */       .a(Character.valueOf('C'), bup.m)
/* 1023 */       .a("CQ")
/* 1024 */       .a("QC")
/* 1025 */       .a("has_quartz", a(bmd.ps))
/* 1026 */       .a(☃);
/*      */     
/* 1028 */     jh.a(bup.as)
/* 1029 */       .a(Character.valueOf('R'), bmd.lP)
/* 1030 */       .a(Character.valueOf('#'), bup.m)
/* 1031 */       .a(Character.valueOf('X'), bmd.kc)
/* 1032 */       .a("###")
/* 1033 */       .a("#X#")
/* 1034 */       .a("#R#")
/* 1035 */       .a("has_bow", a(bmd.kc))
/* 1036 */       .a(☃);
/*      */     
/* 1038 */     jh.a(bup.fE)
/* 1039 */       .a(Character.valueOf('R'), bmd.lP)
/* 1040 */       .a(Character.valueOf('#'), bup.m)
/* 1041 */       .a("###")
/* 1042 */       .a("# #")
/* 1043 */       .a("#R#")
/* 1044 */       .a("has_redstone", a(bmd.lP))
/* 1045 */       .a(☃);
/*      */     
/* 1047 */     ji.a(bmd.oV, 9)
/* 1048 */       .b(bup.en)
/* 1049 */       .a("has_emerald_block", a(bup.en))
/* 1050 */       .a(☃);
/*      */     
/* 1052 */     jh.a(bup.en)
/* 1053 */       .a(Character.valueOf('#'), bmd.oV)
/* 1054 */       .a("###")
/* 1055 */       .a("###")
/* 1056 */       .a("###")
/* 1057 */       .a("has_emerald", a(bmd.oV))
/* 1058 */       .a(☃);
/*      */     
/* 1060 */     jh.a(bup.dZ)
/* 1061 */       .a(Character.valueOf('B'), bmd.mc)
/* 1062 */       .a(Character.valueOf('#'), bup.bK)
/* 1063 */       .a(Character.valueOf('D'), bmd.kg)
/* 1064 */       .a(" B ")
/* 1065 */       .a("D#D")
/* 1066 */       .a("###")
/* 1067 */       .a("has_obsidian", a(bup.bK))
/* 1068 */       .a(☃);
/*      */     
/* 1070 */     jh.a(bup.ek)
/* 1071 */       .a(Character.valueOf('#'), bup.bK)
/* 1072 */       .a(Character.valueOf('E'), bmd.nD)
/* 1073 */       .a("###")
/* 1074 */       .a("#E#")
/* 1075 */       .a("###")
/* 1076 */       .a("has_ender_eye", a(bmd.nD))
/* 1077 */       .a(☃);
/*      */     
/* 1079 */     ji.a(bmd.nD)
/* 1080 */       .b(bmd.nq)
/* 1081 */       .b(bmd.nz)
/* 1082 */       .a("has_blaze_powder", a(bmd.nz))
/* 1083 */       .a(☃);
/*      */     
/* 1085 */     jh.a(bup.iC, 4)
/* 1086 */       .a(Character.valueOf('#'), bup.ee)
/* 1087 */       .a("##")
/* 1088 */       .a("##")
/* 1089 */       .a("has_end_stone", a(bup.ee))
/* 1090 */       .a(☃);
/*      */     
/* 1092 */     jh.a(bmd.qc)
/* 1093 */       .a(Character.valueOf('T'), bmd.ns)
/* 1094 */       .a(Character.valueOf('E'), bmd.nD)
/* 1095 */       .a(Character.valueOf('G'), bup.ap)
/* 1096 */       .a("GGG")
/* 1097 */       .a("GEG")
/* 1098 */       .a("GTG")
/* 1099 */       .a("has_ender_eye", a(bmd.nD))
/* 1100 */       .a(☃);
/*      */     
/* 1102 */     jh.a(bup.iw, 4)
/* 1103 */       .a(Character.valueOf('#'), bmd.qe)
/* 1104 */       .a(Character.valueOf('/'), bmd.nr)
/* 1105 */       .a("/")
/* 1106 */       .a("#")
/* 1107 */       .a("has_chorus_fruit_popped", a(bmd.qe))
/* 1108 */       .a(☃);
/*      */     
/* 1110 */     ji.a(bmd.ny)
/* 1111 */       .b(bmd.nx)
/* 1112 */       .b(bup.bC)
/* 1113 */       .b(bmd.mM)
/* 1114 */       .a("has_spider_eye", a(bmd.nx))
/* 1115 */       .a(☃);
/*      */     
/* 1117 */     ji.a(bmd.oS, 3)
/* 1118 */       .b(bmd.kU)
/* 1119 */       .b(bmd.nz)
/* 1120 */       .a(bon.a(new brw[] { bmd.ke, bmd.kf
/* 1121 */           })).a("has_blaze_powder", a(bmd.nz))
/* 1122 */       .a(☃);
/*      */     
/* 1124 */     jh.a(bmd.mi)
/* 1125 */       .a(Character.valueOf('#'), bmd.kP)
/* 1126 */       .a(Character.valueOf('X'), bmd.kS)
/* 1127 */       .a("  #")
/* 1128 */       .a(" #X")
/* 1129 */       .a("# X")
/* 1130 */       .a("has_string", a(bmd.kS))
/* 1131 */       .a(☃);
/*      */     
/* 1133 */     ji.a(bmd.ka)
/* 1134 */       .b(bmd.kh)
/* 1135 */       .b(bmd.lw)
/* 1136 */       .a("has_flint", a(bmd.lw))
/* 1137 */       .a("has_obsidian", a(bup.bK))
/* 1138 */       .a(☃);
/*      */     
/* 1140 */     jh.a(bup.ev)
/* 1141 */       .a(Character.valueOf('#'), bmd.lY)
/* 1142 */       .a("# #")
/* 1143 */       .a(" # ")
/* 1144 */       .a("has_brick", a(bmd.lY))
/* 1145 */       .a(☃);
/*      */     
/* 1147 */     jh.a(bup.bY)
/* 1148 */       .a(Character.valueOf('#'), aeg.ac)
/* 1149 */       .a("###")
/* 1150 */       .a("# #")
/* 1151 */       .a("###")
/* 1152 */       .a("has_cobblestone", a(aeg.ac))
/* 1153 */       .a(☃);
/*      */     
/* 1155 */     jh.a(bmd.mf)
/* 1156 */       .a(Character.valueOf('A'), bup.bY)
/* 1157 */       .a(Character.valueOf('B'), bmd.lN)
/* 1158 */       .a("A")
/* 1159 */       .a("B")
/* 1160 */       .a("has_minecart", a(bmd.lN))
/* 1161 */       .a(☃);
/*      */     
/* 1163 */     jh.a(bmd.nw, 3)
/* 1164 */       .a(Character.valueOf('#'), bup.ap)
/* 1165 */       .a("# #")
/* 1166 */       .a(" # ")
/* 1167 */       .a("has_glass", a(bup.ap))
/* 1168 */       .a(☃);
/*      */     
/* 1170 */     jh.a(bup.dJ, 16)
/* 1171 */       .a(Character.valueOf('#'), bup.ap)
/* 1172 */       .a("###")
/* 1173 */       .a("###")
/* 1174 */       .a("has_glass", a(bup.ap))
/* 1175 */       .a(☃);
/*      */     
/* 1177 */     jh.a(bup.cS)
/* 1178 */       .a(Character.valueOf('#'), bmd.mk)
/* 1179 */       .a("##")
/* 1180 */       .a("##")
/* 1181 */       .a("has_glowstone_dust", a(bmd.mk))
/* 1182 */       .a(☃);
/*      */     
/* 1184 */     jh.a(bmd.lA)
/* 1185 */       .a(Character.valueOf('#'), bmd.ki)
/* 1186 */       .a(Character.valueOf('X'), bmd.kb)
/* 1187 */       .a("###")
/* 1188 */       .a("#X#")
/* 1189 */       .a("###")
/* 1190 */       .a("has_gold_ingot", a(bmd.ki))
/* 1191 */       .a(☃);
/*      */     
/* 1193 */     jh.a(bmd.ky)
/* 1194 */       .a(Character.valueOf('#'), bmd.kP)
/* 1195 */       .a(Character.valueOf('X'), bmd.ki)
/* 1196 */       .a("XX")
/* 1197 */       .a("X#")
/* 1198 */       .a(" #")
/* 1199 */       .a("has_gold_ingot", a(bmd.ki))
/* 1200 */       .a(☃);
/*      */     
/* 1202 */     jh.a(bmd.lr)
/* 1203 */       .a(Character.valueOf('X'), bmd.ki)
/* 1204 */       .a("X X")
/* 1205 */       .a("X X")
/* 1206 */       .a("has_gold_ingot", a(bmd.ki))
/* 1207 */       .a(☃);
/*      */     
/* 1209 */     jh.a(bmd.pd)
/* 1210 */       .a(Character.valueOf('#'), bmd.nt)
/* 1211 */       .a(Character.valueOf('X'), bmd.oY)
/* 1212 */       .a("###")
/* 1213 */       .a("#X#")
/* 1214 */       .a("###")
/* 1215 */       .a("has_gold_nugget", a(bmd.nt))
/* 1216 */       .a(☃);
/*      */     
/* 1218 */     jh.a(bmd.lp)
/* 1219 */       .a(Character.valueOf('X'), bmd.ki)
/* 1220 */       .a("X X")
/* 1221 */       .a("XXX")
/* 1222 */       .a("XXX")
/* 1223 */       .a("has_gold_ingot", a(bmd.ki))
/* 1224 */       .a(☃);
/*      */     
/* 1226 */     jh.a(bmd.lo)
/* 1227 */       .a(Character.valueOf('X'), bmd.ki)
/* 1228 */       .a("XXX")
/* 1229 */       .a("X X")
/* 1230 */       .a("has_gold_ingot", a(bmd.ki))
/* 1231 */       .a(☃);
/*      */     
/* 1233 */     jh.a(bmd.kz)
/* 1234 */       .a(Character.valueOf('#'), bmd.kP)
/* 1235 */       .a(Character.valueOf('X'), bmd.ki)
/* 1236 */       .a("XX")
/* 1237 */       .a(" #")
/* 1238 */       .a(" #")
/* 1239 */       .a("has_gold_ingot", a(bmd.ki))
/* 1240 */       .a(☃);
/*      */     
/* 1242 */     jh.a(bmd.lq)
/* 1243 */       .a(Character.valueOf('X'), bmd.ki)
/* 1244 */       .a("XXX")
/* 1245 */       .a("X X")
/* 1246 */       .a("X X")
/* 1247 */       .a("has_gold_ingot", a(bmd.ki))
/* 1248 */       .a(☃);
/*      */     
/* 1250 */     jh.a(bmd.kx)
/* 1251 */       .a(Character.valueOf('#'), bmd.kP)
/* 1252 */       .a(Character.valueOf('X'), bmd.ki)
/* 1253 */       .a("XXX")
/* 1254 */       .a(" # ")
/* 1255 */       .a(" # ")
/* 1256 */       .a("has_gold_ingot", a(bmd.ki))
/* 1257 */       .a(☃);
/*      */     
/* 1259 */     jh.a(bup.aN, 6)
/* 1260 */       .a(Character.valueOf('R'), bmd.lP)
/* 1261 */       .a(Character.valueOf('#'), bmd.kP)
/* 1262 */       .a(Character.valueOf('X'), bmd.ki)
/* 1263 */       .a("X X")
/* 1264 */       .a("X#X")
/* 1265 */       .a("XRX")
/* 1266 */       .a("has_rail", a(bup.ch))
/* 1267 */       .a(☃);
/*      */     
/* 1269 */     jh.a(bmd.kw)
/* 1270 */       .a(Character.valueOf('#'), bmd.kP)
/* 1271 */       .a(Character.valueOf('X'), bmd.ki)
/* 1272 */       .a("X")
/* 1273 */       .a("#")
/* 1274 */       .a("#")
/* 1275 */       .a("has_gold_ingot", a(bmd.ki))
/* 1276 */       .a(☃);
/*      */     
/* 1278 */     jh.a(bmd.kv)
/* 1279 */       .a(Character.valueOf('#'), bmd.kP)
/* 1280 */       .a(Character.valueOf('X'), bmd.ki)
/* 1281 */       .a("X")
/* 1282 */       .a("X")
/* 1283 */       .a("#")
/* 1284 */       .a("has_gold_ingot", a(bmd.ki))
/* 1285 */       .a(☃);
/*      */     
/* 1287 */     jh.a(bup.bE)
/* 1288 */       .a(Character.valueOf('#'), bmd.ki)
/* 1289 */       .a("###")
/* 1290 */       .a("###")
/* 1291 */       .a("###")
/* 1292 */       .a("has_gold_ingot", a(bmd.ki))
/* 1293 */       .a(☃);
/*      */     
/* 1295 */     ji.a(bmd.ki, 9)
/* 1296 */       .b(bup.bE)
/* 1297 */       .a("gold_ingot")
/* 1298 */       .a("has_gold_block", a(bup.bE))
/* 1299 */       .a(☃, "gold_ingot_from_gold_block");
/*      */     
/* 1301 */     jh.a(bmd.ki)
/* 1302 */       .a(Character.valueOf('#'), bmd.nt)
/* 1303 */       .a("###")
/* 1304 */       .a("###")
/* 1305 */       .a("###")
/* 1306 */       .b("gold_ingot")
/* 1307 */       .a("has_gold_nugget", a(bmd.nt))
/* 1308 */       .a(☃, "gold_ingot_from_nuggets");
/*      */     
/* 1310 */     ji.a(bmd.nt, 9)
/* 1311 */       .b(bmd.ki)
/* 1312 */       .a("has_gold_ingot", a(bmd.ki))
/* 1313 */       .a(☃);
/*      */     
/* 1315 */     ji.a(bup.c)
/* 1316 */       .b(bup.e)
/* 1317 */       .b(bmd.ps)
/* 1318 */       .a("has_quartz", a(bmd.ps))
/* 1319 */       .a(☃);
/*      */     
/* 1321 */     ji.a(bmd.mB, 2)
/* 1322 */       .b(bmd.mJ)
/* 1323 */       .b(bmd.mu)
/* 1324 */       .a("has_white_dye", a(bmd.mu))
/* 1325 */       .a("has_black_dye", a(bmd.mJ))
/* 1326 */       .a(☃);
/*      */     
/* 1328 */     jh.a(bup.gA)
/* 1329 */       .a(Character.valueOf('#'), bmd.kW)
/* 1330 */       .a("###")
/* 1331 */       .a("###")
/* 1332 */       .a("###")
/* 1333 */       .a("has_wheat", a(bmd.kW))
/* 1334 */       .a(☃);
/*      */     
/* 1336 */     jh.a(bup.ft)
/* 1337 */       .a(Character.valueOf('#'), bmd.kh)
/* 1338 */       .a("##")
/* 1339 */       .a("has_iron_ingot", a(bmd.kh))
/* 1340 */       .a(☃);
/*      */     
/* 1342 */     ji.a(bmd.rt, 4)
/* 1343 */       .b(bmd.ru)
/* 1344 */       .b(bmd.nw, 4)
/* 1345 */       .a("has_honey_block", a(bup.ne))
/* 1346 */       .a(☃);
/*      */     
/* 1348 */     jh.a(bup.ne, 1)
/* 1349 */       .a(Character.valueOf('S'), bmd.rt)
/* 1350 */       .a("SS")
/* 1351 */       .a("SS")
/* 1352 */       .a("has_honey_bottle", a(bmd.rt))
/* 1353 */       .a(☃);
/*      */     
/* 1355 */     jh.a(bup.nf)
/* 1356 */       .a(Character.valueOf('H'), bmd.rq)
/* 1357 */       .a("HH")
/* 1358 */       .a("HH")
/* 1359 */       .a("has_honeycomb", a(bmd.rq))
/* 1360 */       .a(☃);
/*      */     
/* 1362 */     jh.a(bup.fy)
/* 1363 */       .a(Character.valueOf('C'), bup.bR)
/* 1364 */       .a(Character.valueOf('I'), bmd.kh)
/* 1365 */       .a("I I")
/* 1366 */       .a("ICI")
/* 1367 */       .a(" I ")
/* 1368 */       .a("has_iron_ingot", a(bmd.kh))
/* 1369 */       .a(☃);
/*      */     
/* 1371 */     jh.a(bmd.pu)
/* 1372 */       .a(Character.valueOf('A'), bup.fy)
/* 1373 */       .a(Character.valueOf('B'), bmd.lN)
/* 1374 */       .a("A")
/* 1375 */       .a("B")
/* 1376 */       .a("has_minecart", a(bmd.lN))
/* 1377 */       .a(☃);
/*      */     
/* 1379 */     jh.a(bmd.kD)
/* 1380 */       .a(Character.valueOf('#'), bmd.kP)
/* 1381 */       .a(Character.valueOf('X'), bmd.kh)
/* 1382 */       .a("XX")
/* 1383 */       .a("X#")
/* 1384 */       .a(" #")
/* 1385 */       .a("has_iron_ingot", a(bmd.kh))
/* 1386 */       .a(☃);
/*      */     
/* 1388 */     jh.a(bup.dH, 16)
/* 1389 */       .a(Character.valueOf('#'), bmd.kh)
/* 1390 */       .a("###")
/* 1391 */       .a("###")
/* 1392 */       .a("has_iron_ingot", a(bmd.kh))
/* 1393 */       .a(☃);
/*      */     
/* 1395 */     jh.a(bup.bF)
/* 1396 */       .a(Character.valueOf('#'), bmd.kh)
/* 1397 */       .a("###")
/* 1398 */       .a("###")
/* 1399 */       .a("###")
/* 1400 */       .a("has_iron_ingot", a(bmd.kh))
/* 1401 */       .a(☃);
/*      */     
/* 1403 */     jh.a(bmd.lj)
/* 1404 */       .a(Character.valueOf('X'), bmd.kh)
/* 1405 */       .a("X X")
/* 1406 */       .a("X X")
/* 1407 */       .a("has_iron_ingot", a(bmd.kh))
/* 1408 */       .a(☃);
/*      */     
/* 1410 */     jh.a(bmd.lh)
/* 1411 */       .a(Character.valueOf('X'), bmd.kh)
/* 1412 */       .a("X X")
/* 1413 */       .a("XXX")
/* 1414 */       .a("XXX")
/* 1415 */       .a("has_iron_ingot", a(bmd.kh))
/* 1416 */       .a(☃);
/*      */     
/* 1418 */     jh.a(bup.cr, 3)
/* 1419 */       .a(Character.valueOf('#'), bmd.kh)
/* 1420 */       .a("##")
/* 1421 */       .a("##")
/* 1422 */       .a("##")
/* 1423 */       .a("has_iron_ingot", a(bmd.kh))
/* 1424 */       .a(☃);
/*      */     
/* 1426 */     jh.a(bmd.lg)
/* 1427 */       .a(Character.valueOf('X'), bmd.kh)
/* 1428 */       .a("XXX")
/* 1429 */       .a("X X")
/* 1430 */       .a("has_iron_ingot", a(bmd.kh))
/* 1431 */       .a(☃);
/*      */     
/* 1433 */     jh.a(bmd.kE)
/* 1434 */       .a(Character.valueOf('#'), bmd.kP)
/* 1435 */       .a(Character.valueOf('X'), bmd.kh)
/* 1436 */       .a("XX")
/* 1437 */       .a(" #")
/* 1438 */       .a(" #")
/* 1439 */       .a("has_iron_ingot", a(bmd.kh))
/* 1440 */       .a(☃);
/*      */     
/* 1442 */     ji.a(bmd.kh, 9)
/* 1443 */       .b(bup.bF)
/* 1444 */       .a("iron_ingot")
/* 1445 */       .a("has_iron_block", a(bup.bF))
/* 1446 */       .a(☃, "iron_ingot_from_iron_block");
/*      */     
/* 1448 */     jh.a(bmd.kh)
/* 1449 */       .a(Character.valueOf('#'), bmd.qw)
/* 1450 */       .a("###")
/* 1451 */       .a("###")
/* 1452 */       .a("###")
/* 1453 */       .b("iron_ingot")
/* 1454 */       .a("has_iron_nugget", a(bmd.qw))
/* 1455 */       .a(☃, "iron_ingot_from_nuggets");
/*      */     
/* 1457 */     jh.a(bmd.li)
/* 1458 */       .a(Character.valueOf('X'), bmd.kh)
/* 1459 */       .a("XXX")
/* 1460 */       .a("X X")
/* 1461 */       .a("X X")
/* 1462 */       .a("has_iron_ingot", a(bmd.kh))
/* 1463 */       .a(☃);
/*      */     
/* 1465 */     ji.a(bmd.qw, 9)
/* 1466 */       .b(bmd.kh)
/* 1467 */       .a("has_iron_ingot", a(bmd.kh))
/* 1468 */       .a(☃);
/*      */     
/* 1470 */     jh.a(bmd.kC)
/* 1471 */       .a(Character.valueOf('#'), bmd.kP)
/* 1472 */       .a(Character.valueOf('X'), bmd.kh)
/* 1473 */       .a("XXX")
/* 1474 */       .a(" # ")
/* 1475 */       .a(" # ")
/* 1476 */       .a("has_iron_ingot", a(bmd.kh))
/* 1477 */       .a(☃);
/*      */     
/* 1479 */     jh.a(bmd.kB)
/* 1480 */       .a(Character.valueOf('#'), bmd.kP)
/* 1481 */       .a(Character.valueOf('X'), bmd.kh)
/* 1482 */       .a("X")
/* 1483 */       .a("#")
/* 1484 */       .a("#")
/* 1485 */       .a("has_iron_ingot", a(bmd.kh))
/* 1486 */       .a(☃);
/*      */     
/* 1488 */     jh.a(bmd.kA)
/* 1489 */       .a(Character.valueOf('#'), bmd.kP)
/* 1490 */       .a(Character.valueOf('X'), bmd.kh)
/* 1491 */       .a("X")
/* 1492 */       .a("X")
/* 1493 */       .a("#")
/* 1494 */       .a("has_iron_ingot", a(bmd.kh))
/* 1495 */       .a(☃);
/*      */     
/* 1497 */     jh.a(bup.gp)
/* 1498 */       .a(Character.valueOf('#'), bmd.kh)
/* 1499 */       .a("##")
/* 1500 */       .a("##")
/* 1501 */       .a("has_iron_ingot", a(bmd.kh))
/* 1502 */       .a(☃);
/*      */     
/* 1504 */     jh.a(bmd.oW)
/* 1505 */       .a(Character.valueOf('#'), bmd.kP)
/* 1506 */       .a(Character.valueOf('X'), bmd.lS)
/* 1507 */       .a("###")
/* 1508 */       .a("#X#")
/* 1509 */       .a("###")
/* 1510 */       .a("has_leather", a(bmd.lS))
/* 1511 */       .a(☃);
/*      */     
/* 1513 */     jh.a(bup.cI)
/* 1514 */       .a(Character.valueOf('#'), aeg.c)
/* 1515 */       .a(Character.valueOf('X'), bmd.kg)
/* 1516 */       .a("###")
/* 1517 */       .a("#X#")
/* 1518 */       .a("###")
/* 1519 */       .a("has_diamond", a(bmd.kg))
/* 1520 */       .a(☃);
/*      */     
/* 1522 */     jh.a(bup.cg, 3)
/* 1523 */       .a(Character.valueOf('#'), bmd.kP)
/* 1524 */       .a("# #")
/* 1525 */       .a("###")
/* 1526 */       .a("# #")
/* 1527 */       .a("has_stick", a(bmd.kP))
/* 1528 */       .a(☃);
/*      */     
/* 1530 */     jh.a(bup.ar)
/* 1531 */       .a(Character.valueOf('#'), bmd.mt)
/* 1532 */       .a("###")
/* 1533 */       .a("###")
/* 1534 */       .a("###")
/* 1535 */       .a("has_lapis", a(bmd.mt))
/* 1536 */       .a(☃);
/*      */     
/* 1538 */     ji.a(bmd.mt, 9)
/* 1539 */       .b(bup.ar)
/* 1540 */       .a("has_lapis_block", a(bup.ar))
/* 1541 */       .a(☃);
/*      */     
/* 1543 */     jh.a(bmd.pH, 2)
/* 1544 */       .a(Character.valueOf('~'), bmd.kS)
/* 1545 */       .a(Character.valueOf('O'), bmd.md)
/* 1546 */       .a("~~ ")
/* 1547 */       .a("~O ")
/* 1548 */       .a("  ~")
/* 1549 */       .a("has_slime_ball", a(bmd.md))
/* 1550 */       .a(☃);
/*      */     
/* 1552 */     jh.a(bmd.lS)
/* 1553 */       .a(Character.valueOf('#'), bmd.pB)
/* 1554 */       .a("##")
/* 1555 */       .a("##")
/* 1556 */       .a("has_rabbit_hide", a(bmd.pB))
/* 1557 */       .a(☃);
/*      */     
/* 1559 */     jh.a(bmd.lb)
/* 1560 */       .a(Character.valueOf('X'), bmd.lS)
/* 1561 */       .a("X X")
/* 1562 */       .a("X X")
/* 1563 */       .a("has_leather", a(bmd.lS))
/* 1564 */       .a(☃);
/*      */     
/* 1566 */     jh.a(bmd.kZ)
/* 1567 */       .a(Character.valueOf('X'), bmd.lS)
/* 1568 */       .a("X X")
/* 1569 */       .a("XXX")
/* 1570 */       .a("XXX")
/* 1571 */       .a("has_leather", a(bmd.lS))
/* 1572 */       .a(☃);
/*      */     
/* 1574 */     jh.a(bmd.kY)
/* 1575 */       .a(Character.valueOf('X'), bmd.lS)
/* 1576 */       .a("XXX")
/* 1577 */       .a("X X")
/* 1578 */       .a("has_leather", a(bmd.lS))
/* 1579 */       .a(☃);
/*      */     
/* 1581 */     jh.a(bmd.la)
/* 1582 */       .a(Character.valueOf('X'), bmd.lS)
/* 1583 */       .a("XXX")
/* 1584 */       .a("X X")
/* 1585 */       .a("X X")
/* 1586 */       .a("has_leather", a(bmd.lS))
/* 1587 */       .a(☃);
/*      */     
/* 1589 */     jh.a(bmd.pG)
/* 1590 */       .a(Character.valueOf('X'), bmd.lS)
/* 1591 */       .a("X X")
/* 1592 */       .a("XXX")
/* 1593 */       .a("X X")
/* 1594 */       .a("has_leather", a(bmd.lS))
/* 1595 */       .a(☃);
/*      */     
/* 1597 */     jh.a(bup.lY)
/* 1598 */       .a(Character.valueOf('S'), aeg.j)
/* 1599 */       .a(Character.valueOf('B'), bup.bI)
/* 1600 */       .a("SSS")
/* 1601 */       .a(" B ")
/* 1602 */       .a(" S ")
/* 1603 */       .a("has_book", a(bmd.mc))
/* 1604 */       .a(☃);
/*      */     
/* 1606 */     jh.a(bup.cp)
/* 1607 */       .a(Character.valueOf('#'), bup.m)
/* 1608 */       .a(Character.valueOf('X'), bmd.kP)
/* 1609 */       .a("X")
/* 1610 */       .a("#")
/* 1611 */       .a("has_cobblestone", a(bup.m))
/* 1612 */       .a(☃);
/*      */     
/* 1614 */     ji.a(bmd.mx)
/* 1615 */       .b(bup.br)
/* 1616 */       .a("light_blue_dye")
/* 1617 */       .a("has_red_flower", a(bup.br))
/* 1618 */       .a(☃, "light_blue_dye_from_blue_orchid");
/*      */     
/* 1620 */     ji.a(bmd.mx, 2)
/* 1621 */       .b(bmd.mF)
/* 1622 */       .b(bmd.mu)
/* 1623 */       .a("light_blue_dye")
/* 1624 */       .a("has_blue_dye", a(bmd.mF))
/* 1625 */       .a("has_white_dye", a(bmd.mu))
/* 1626 */       .a(☃, "light_blue_dye_from_blue_white_dye");
/*      */     
/* 1628 */     ji.a(bmd.mC)
/* 1629 */       .b(bup.bt)
/* 1630 */       .a("light_gray_dye")
/* 1631 */       .a("has_red_flower", a(bup.bt))
/* 1632 */       .a(☃, "light_gray_dye_from_azure_bluet");
/*      */     
/* 1634 */     ji.a(bmd.mC, 2)
/* 1635 */       .b(bmd.mB)
/* 1636 */       .b(bmd.mu)
/* 1637 */       .a("light_gray_dye")
/* 1638 */       .a("has_gray_dye", a(bmd.mB))
/* 1639 */       .a("has_white_dye", a(bmd.mu))
/* 1640 */       .a(☃, "light_gray_dye_from_gray_white_dye");
/*      */     
/* 1642 */     ji.a(bmd.mC, 3)
/* 1643 */       .b(bmd.mJ)
/* 1644 */       .b(bmd.mu, 2)
/* 1645 */       .a("light_gray_dye")
/* 1646 */       .a("has_white_dye", a(bmd.mu))
/* 1647 */       .a("has_black_dye", a(bmd.mJ))
/* 1648 */       .a(☃, "light_gray_dye_from_black_white_dye");
/*      */     
/* 1650 */     ji.a(bmd.mC)
/* 1651 */       .b(bup.by)
/* 1652 */       .a("light_gray_dye")
/* 1653 */       .a("has_red_flower", a(bup.by))
/* 1654 */       .a(☃, "light_gray_dye_from_oxeye_daisy");
/*      */     
/* 1656 */     ji.a(bmd.mC)
/* 1657 */       .b(bup.bw)
/* 1658 */       .a("light_gray_dye")
/* 1659 */       .a("has_red_flower", a(bup.bw))
/* 1660 */       .a(☃, "light_gray_dye_from_white_tulip");
/*      */     
/* 1662 */     jh.a(bup.fs)
/* 1663 */       .a(Character.valueOf('#'), bmd.ki)
/* 1664 */       .a("##")
/* 1665 */       .a("has_gold_ingot", a(bmd.ki))
/* 1666 */       .a(☃);
/*      */     
/* 1668 */     ji.a(bmd.mz, 2)
/* 1669 */       .b(bmd.mH)
/* 1670 */       .b(bmd.mu)
/* 1671 */       .a("has_green_dye", a(bmd.mH))
/* 1672 */       .a("has_white_dye", a(bmd.mu))
/* 1673 */       .a(☃);
/*      */     
/* 1675 */     jh.a(bup.cV)
/* 1676 */       .a(Character.valueOf('A'), bup.cU)
/* 1677 */       .a(Character.valueOf('B'), bup.bL)
/* 1678 */       .a("A")
/* 1679 */       .a("B")
/* 1680 */       .a("has_carved_pumpkin", a(bup.cU))
/* 1681 */       .a(☃);
/*      */     
/* 1683 */     ji.a(bmd.mw)
/* 1684 */       .b(bup.bs)
/* 1685 */       .a("magenta_dye")
/* 1686 */       .a("has_red_flower", a(bup.bs))
/* 1687 */       .a(☃, "magenta_dye_from_allium");
/*      */     
/* 1689 */     ji.a(bmd.mw, 4)
/* 1690 */       .b(bmd.mF)
/* 1691 */       .b(bmd.mI, 2)
/* 1692 */       .b(bmd.mu)
/* 1693 */       .a("magenta_dye")
/* 1694 */       .a("has_blue_dye", a(bmd.mF))
/* 1695 */       .a("has_rose_red", a(bmd.mI))
/* 1696 */       .a("has_white_dye", a(bmd.mu))
/* 1697 */       .a(☃, "magenta_dye_from_blue_red_white_dye");
/*      */     
/* 1699 */     ji.a(bmd.mw, 3)
/* 1700 */       .b(bmd.mF)
/* 1701 */       .b(bmd.mI)
/* 1702 */       .b(bmd.mA)
/* 1703 */       .a("magenta_dye")
/* 1704 */       .a("has_pink_dye", a(bmd.mA))
/* 1705 */       .a("has_blue_dye", a(bmd.mF))
/* 1706 */       .a("has_red_dye", a(bmd.mI))
/* 1707 */       .a(☃, "magenta_dye_from_blue_red_pink");
/*      */     
/* 1709 */     ji.a(bmd.mw, 2)
/* 1710 */       .b(bup.gV)
/* 1711 */       .a("magenta_dye")
/* 1712 */       .a("has_double_plant", a(bup.gV))
/* 1713 */       .a(☃, "magenta_dye_from_lilac");
/*      */     
/* 1715 */     ji.a(bmd.mw, 2)
/* 1716 */       .b(bmd.mE)
/* 1717 */       .b(bmd.mA)
/* 1718 */       .a("magenta_dye")
/* 1719 */       .a("has_pink_dye", a(bmd.mA))
/* 1720 */       .a("has_purple_dye", a(bmd.mE))
/* 1721 */       .a(☃, "magenta_dye_from_purple_and_pink");
/*      */     
/* 1723 */     jh.a(bup.iJ)
/* 1724 */       .a(Character.valueOf('#'), bmd.nA)
/* 1725 */       .a("##")
/* 1726 */       .a("##")
/* 1727 */       .a("has_magma_cream", a(bmd.nA))
/* 1728 */       .a(☃);
/*      */     
/* 1730 */     ji.a(bmd.nA)
/* 1731 */       .b(bmd.nz)
/* 1732 */       .b(bmd.md)
/* 1733 */       .a("has_blaze_powder", a(bmd.nz))
/* 1734 */       .a(☃);
/*      */     
/* 1736 */     jh.a(bmd.pc)
/* 1737 */       .a(Character.valueOf('#'), bmd.mb)
/* 1738 */       .a(Character.valueOf('X'), bmd.mh)
/* 1739 */       .a("###")
/* 1740 */       .a("#X#")
/* 1741 */       .a("###")
/* 1742 */       .a("has_compass", a(bmd.mh))
/* 1743 */       .a(☃);
/*      */     
/* 1745 */     jh.a(bup.dK)
/* 1746 */       .a(Character.valueOf('M'), bmd.nh)
/* 1747 */       .a("MMM")
/* 1748 */       .a("MMM")
/* 1749 */       .a("MMM")
/* 1750 */       .a("has_melon", a(bmd.nh))
/* 1751 */       .a(☃);
/*      */     
/* 1753 */     ji.a(bmd.nk)
/* 1754 */       .b(bmd.nh)
/* 1755 */       .a("has_melon", a(bmd.nh))
/* 1756 */       .a(☃);
/*      */     
/* 1758 */     jh.a(bmd.lN)
/* 1759 */       .a(Character.valueOf('#'), bmd.kh)
/* 1760 */       .a("# #")
/* 1761 */       .a("###")
/* 1762 */       .a("has_iron_ingot", a(bmd.kh))
/* 1763 */       .a(☃);
/*      */     
/* 1765 */     ji.a(bup.bJ)
/* 1766 */       .b(bup.m)
/* 1767 */       .b(bup.dP)
/* 1768 */       .a("has_vine", a(bup.dP))
/* 1769 */       .a(☃);
/*      */     
/* 1771 */     jh.a(bup.eu, 6)
/* 1772 */       .a(Character.valueOf('#'), bup.bJ)
/* 1773 */       .a("###")
/* 1774 */       .a("###")
/* 1775 */       .a("has_mossy_cobblestone", a(bup.bJ))
/* 1776 */       .a(☃);
/*      */     
/* 1778 */     ji.a(bup.dv)
/* 1779 */       .b(bup.du)
/* 1780 */       .b(bup.dP)
/* 1781 */       .a("has_mossy_cobblestone", a(bup.bJ))
/* 1782 */       .a(☃);
/*      */     
/* 1784 */     ji.a(bmd.kR)
/* 1785 */       .b(bup.bC)
/* 1786 */       .b(bup.bD)
/* 1787 */       .b(bmd.kQ)
/* 1788 */       .a("has_mushroom_stew", a(bmd.kR))
/* 1789 */       .a("has_bowl", a(bmd.kQ))
/* 1790 */       .a("has_brown_mushroom", a(bup.bC))
/* 1791 */       .a("has_red_mushroom", a(bup.bD))
/* 1792 */       .a(☃);
/*      */     
/* 1794 */     jh.a(bup.dV)
/* 1795 */       .a(Character.valueOf('N'), bmd.pr)
/* 1796 */       .a("NN")
/* 1797 */       .a("NN")
/* 1798 */       .a("has_netherbrick", a(bmd.pr))
/* 1799 */       .a(☃);
/*      */     
/* 1801 */     jh.a(bup.dW, 6)
/* 1802 */       .a(Character.valueOf('#'), bup.dV)
/* 1803 */       .a(Character.valueOf('-'), bmd.pr)
/* 1804 */       .a("#-#")
/* 1805 */       .a("#-#")
/* 1806 */       .a("has_nether_brick", a(bup.dV))
/* 1807 */       .a(☃);
/*      */     
/* 1809 */     jh.a(bup.hY, 6)
/* 1810 */       .a(Character.valueOf('#'), bup.dV)
/* 1811 */       .a("###")
/* 1812 */       .a("has_nether_brick", a(bup.dV))
/* 1813 */       .a(☃);
/*      */     
/* 1815 */     jh.a(bup.dX, 4)
/* 1816 */       .a(Character.valueOf('#'), bup.dV)
/* 1817 */       .a("#  ")
/* 1818 */       .a("## ")
/* 1819 */       .a("###")
/* 1820 */       .a("has_nether_brick", a(bup.dV))
/* 1821 */       .a(☃);
/*      */     
/* 1823 */     jh.a(bup.iK)
/* 1824 */       .a(Character.valueOf('#'), bmd.nu)
/* 1825 */       .a("###")
/* 1826 */       .a("###")
/* 1827 */       .a("###")
/* 1828 */       .a("has_nether_wart", a(bmd.nu))
/* 1829 */       .a(☃);
/*      */     
/* 1831 */     jh.a(bup.aw)
/* 1832 */       .a(Character.valueOf('#'), aeg.c)
/* 1833 */       .a(Character.valueOf('X'), bmd.lP)
/* 1834 */       .a("###")
/* 1835 */       .a("#X#")
/* 1836 */       .a("###")
/* 1837 */       .a("has_redstone", a(bmd.lP))
/* 1838 */       .a(☃);
/*      */     
/* 1840 */     jh.a(bup.iO)
/* 1841 */       .a(Character.valueOf('Q'), bmd.ps)
/* 1842 */       .a(Character.valueOf('R'), bmd.lP)
/* 1843 */       .a(Character.valueOf('#'), bup.m)
/* 1844 */       .a("###")
/* 1845 */       .a("RRQ")
/* 1846 */       .a("###")
/* 1847 */       .a("has_quartz", a(bmd.ps))
/* 1848 */       .a(☃);
/*      */     
/* 1850 */     ji.a(bmd.mv)
/* 1851 */       .b(bup.bv)
/* 1852 */       .a("orange_dye")
/* 1853 */       .a("has_red_flower", a(bup.bv))
/* 1854 */       .a(☃, "orange_dye_from_orange_tulip");
/*      */     
/* 1856 */     ji.a(bmd.mv, 2)
/* 1857 */       .b(bmd.mI)
/* 1858 */       .b(bmd.my)
/* 1859 */       .a("orange_dye")
/* 1860 */       .a("has_red_dye", a(bmd.mI))
/* 1861 */       .a("has_yellow_dye", a(bmd.my))
/* 1862 */       .a(☃, "orange_dye_from_red_yellow");
/*      */     
/* 1864 */     jh.a(bmd.lz)
/* 1865 */       .a(Character.valueOf('#'), bmd.kP)
/* 1866 */       .a(Character.valueOf('X'), bon.a(aeg.b))
/* 1867 */       .a("###")
/* 1868 */       .a("#X#")
/* 1869 */       .a("###")
/* 1870 */       .a("has_wool", a(aeg.b))
/* 1871 */       .a(☃);
/*      */     
/* 1873 */     jh.a(bmd.mb, 3)
/* 1874 */       .a(Character.valueOf('#'), bup.cH)
/* 1875 */       .a("###")
/* 1876 */       .a("has_reeds", a(bup.cH))
/* 1877 */       .a(☃);
/*      */     
/* 1879 */     jh.a(bup.fB, 2)
/* 1880 */       .a(Character.valueOf('#'), bup.fz)
/* 1881 */       .a("#")
/* 1882 */       .a("#")
/* 1883 */       .a("has_chiseled_quartz_block", a(bup.fA))
/* 1884 */       .a("has_quartz_block", a(bup.fz))
/* 1885 */       .a("has_quartz_pillar", a(bup.fB))
/* 1886 */       .a(☃);
/*      */     
/* 1888 */     ji.a(bup.gT)
/* 1889 */       .b(bup.cD, 9)
/* 1890 */       .a("has_ice", a(bup.cD))
/* 1891 */       .a(☃);
/*      */     
/* 1893 */     ji.a(bmd.mA, 2)
/* 1894 */       .b(bup.gX)
/* 1895 */       .a("pink_dye")
/* 1896 */       .a("has_double_plant", a(bup.gX))
/* 1897 */       .a(☃, "pink_dye_from_peony");
/*      */     
/* 1899 */     ji.a(bmd.mA)
/* 1900 */       .b(bup.bx)
/* 1901 */       .a("pink_dye")
/* 1902 */       .a("has_red_flower", a(bup.bx))
/* 1903 */       .a(☃, "pink_dye_from_pink_tulip");
/*      */     
/* 1905 */     ji.a(bmd.mA, 2)
/* 1906 */       .b(bmd.mI)
/* 1907 */       .b(bmd.mu)
/* 1908 */       .a("pink_dye")
/* 1909 */       .a("has_white_dye", a(bmd.mu))
/* 1910 */       .a("has_red_dye", a(bmd.mI))
/* 1911 */       .a(☃, "pink_dye_from_red_white_dye");
/*      */     
/* 1913 */     jh.a(bup.aW)
/* 1914 */       .a(Character.valueOf('R'), bmd.lP)
/* 1915 */       .a(Character.valueOf('#'), bup.m)
/* 1916 */       .a(Character.valueOf('T'), aeg.c)
/* 1917 */       .a(Character.valueOf('X'), bmd.kh)
/* 1918 */       .a("TTT")
/* 1919 */       .a("#X#")
/* 1920 */       .a("#R#")
/* 1921 */       .a("has_redstone", a(bmd.lP))
/* 1922 */       .a(☃);
/*      */     
/* 1924 */     jh.a(bup.cP, 4)
/* 1925 */       .a(Character.valueOf('S'), bup.cO)
/* 1926 */       .a("SS")
/* 1927 */       .a("SS")
/* 1928 */       .a("has_basalt", a(bup.cO))
/* 1929 */       .a(☃);
/*      */ 
/*      */     
/* 1932 */     jh.a(bup.d, 4)
/* 1933 */       .a(Character.valueOf('S'), bup.c)
/* 1934 */       .a("SS")
/* 1935 */       .a("SS")
/* 1936 */       .a("has_stone", a(bup.c))
/* 1937 */       .a(☃);
/*      */     
/* 1939 */     jh.a(bup.f, 4)
/* 1940 */       .a(Character.valueOf('S'), bup.e)
/* 1941 */       .a("SS")
/* 1942 */       .a("SS")
/* 1943 */       .a("has_stone", a(bup.e))
/* 1944 */       .a(☃);
/*      */     
/* 1946 */     jh.a(bup.h, 4)
/* 1947 */       .a(Character.valueOf('S'), bup.g)
/* 1948 */       .a("SS")
/* 1949 */       .a("SS")
/* 1950 */       .a("has_stone", a(bup.g))
/* 1951 */       .a(☃);
/*      */     
/* 1953 */     jh.a(bup.gq)
/* 1954 */       .a(Character.valueOf('S'), bmd.pv)
/* 1955 */       .a("SS")
/* 1956 */       .a("SS")
/* 1957 */       .a("has_prismarine_shard", a(bmd.pv))
/* 1958 */       .a(☃);
/*      */     
/* 1960 */     jh.a(bup.gr)
/* 1961 */       .a(Character.valueOf('S'), bmd.pv)
/* 1962 */       .a("SSS")
/* 1963 */       .a("SSS")
/* 1964 */       .a("SSS")
/* 1965 */       .a("has_prismarine_shard", a(bmd.pv))
/* 1966 */       .a(☃);
/*      */     
/* 1968 */     jh.a(bup.gw, 6)
/* 1969 */       .a(Character.valueOf('#'), bup.gq)
/* 1970 */       .a("###")
/* 1971 */       .a("has_prismarine", a(bup.gq))
/* 1972 */       .a(☃);
/*      */     
/* 1974 */     jh.a(bup.gx, 6)
/* 1975 */       .a(Character.valueOf('#'), bup.gr)
/* 1976 */       .a("###")
/* 1977 */       .a("has_prismarine_bricks", a(bup.gr))
/* 1978 */       .a(☃);
/*      */     
/* 1980 */     jh.a(bup.gy, 6)
/* 1981 */       .a(Character.valueOf('#'), bup.gs)
/* 1982 */       .a("###")
/* 1983 */       .a("has_dark_prismarine", a(bup.gs))
/* 1984 */       .a(☃);
/*      */     
/* 1986 */     ji.a(bmd.pn)
/* 1987 */       .b(bup.cK)
/* 1988 */       .b(bmd.mM)
/* 1989 */       .b(bmd.mg)
/* 1990 */       .a("has_carved_pumpkin", a(bup.cU))
/* 1991 */       .a("has_pumpkin", a(bup.cK))
/* 1992 */       .a(☃);
/*      */     
/* 1994 */     ji.a(bmd.nj, 4)
/* 1995 */       .b(bup.cK)
/* 1996 */       .a("has_pumpkin", a(bup.cK))
/* 1997 */       .a(☃);
/*      */     
/* 1999 */     ji.a(bmd.mE, 2)
/* 2000 */       .b(bmd.mF)
/* 2001 */       .b(bmd.mI)
/* 2002 */       .a("has_blue_dye", a(bmd.mF))
/* 2003 */       .a("has_red_dye", a(bmd.mI))
/* 2004 */       .a(☃);
/*      */     
/* 2006 */     jh.a(bup.iP)
/* 2007 */       .a(Character.valueOf('#'), bup.bR)
/* 2008 */       .a(Character.valueOf('-'), bmd.qv)
/* 2009 */       .a("-")
/* 2010 */       .a("#")
/* 2011 */       .a("-")
/* 2012 */       .a("has_shulker_shell", a(bmd.qv))
/* 2013 */       .a(☃);
/*      */     
/* 2015 */     jh.a(bup.iz, 4)
/* 2016 */       .a(Character.valueOf('F'), bmd.qe)
/* 2017 */       .a("FF")
/* 2018 */       .a("FF")
/* 2019 */       .a("has_chorus_fruit_popped", a(bmd.qe))
/* 2020 */       .a(☃);
/*      */     
/* 2022 */     jh.a(bup.iA)
/* 2023 */       .a(Character.valueOf('#'), bup.ic)
/* 2024 */       .a("#")
/* 2025 */       .a("#")
/* 2026 */       .a("has_purpur_block", a(bup.iz))
/* 2027 */       .a(☃);
/*      */     
/* 2029 */     jh.a(bup.ic, 6)
/* 2030 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.iz, bup.iA
/* 2031 */           })).a("###")
/* 2032 */       .a("has_purpur_block", a(bup.iz))
/* 2033 */       .a(☃);
/*      */     
/* 2035 */     jh.a(bup.iB, 4)
/* 2036 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.iz, bup.iA
/* 2037 */           })).a("#  ")
/* 2038 */       .a("## ")
/* 2039 */       .a("###")
/* 2040 */       .a("has_purpur_block", a(bup.iz))
/* 2041 */       .a(☃);
/*      */     
/* 2043 */     jh.a(bup.fz)
/* 2044 */       .a(Character.valueOf('#'), bmd.ps)
/* 2045 */       .a("##")
/* 2046 */       .a("##")
/* 2047 */       .a("has_quartz", a(bmd.ps))
/* 2048 */       .a(☃);
/*      */     
/* 2050 */     jh.a(bup.nI, 4)
/* 2051 */       .a(Character.valueOf('#'), bup.fz)
/* 2052 */       .a("##")
/* 2053 */       .a("##")
/* 2054 */       .a("has_quartz_block", a(bup.fz))
/* 2055 */       .a(☃);
/*      */     
/* 2057 */     jh.a(bup.hZ, 6)
/* 2058 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.fA, bup.fz, bup.fB
/* 2059 */           })).a("###")
/* 2060 */       .a("has_chiseled_quartz_block", a(bup.fA))
/* 2061 */       .a("has_quartz_block", a(bup.fz))
/* 2062 */       .a("has_quartz_pillar", a(bup.fB))
/* 2063 */       .a(☃);
/*      */     
/* 2065 */     jh.a(bup.fC, 4)
/* 2066 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.fA, bup.fz, bup.fB
/* 2067 */           })).a("#  ")
/* 2068 */       .a("## ")
/* 2069 */       .a("###")
/* 2070 */       .a("has_chiseled_quartz_block", a(bup.fA))
/* 2071 */       .a("has_quartz_block", a(bup.fz))
/* 2072 */       .a("has_quartz_pillar", a(bup.fB))
/* 2073 */       .a(☃);
/*      */     
/* 2075 */     ji.a(bmd.pz)
/* 2076 */       .b(bmd.pa)
/* 2077 */       .b(bmd.py)
/* 2078 */       .b(bmd.kQ)
/* 2079 */       .b(bmd.oY)
/* 2080 */       .b(bup.bC)
/* 2081 */       .a("rabbit_stew")
/* 2082 */       .a("has_cooked_rabbit", a(bmd.py))
/* 2083 */       .a(☃, "rabbit_stew_from_brown_mushroom");
/*      */     
/* 2085 */     ji.a(bmd.pz)
/* 2086 */       .b(bmd.pa)
/* 2087 */       .b(bmd.py)
/* 2088 */       .b(bmd.kQ)
/* 2089 */       .b(bmd.oY)
/* 2090 */       .b(bup.bD)
/* 2091 */       .a("rabbit_stew")
/* 2092 */       .a("has_cooked_rabbit", a(bmd.py))
/* 2093 */       .a(☃, "rabbit_stew_from_red_mushroom");
/*      */     
/* 2095 */     jh.a(bup.ch, 16)
/* 2096 */       .a(Character.valueOf('#'), bmd.kP)
/* 2097 */       .a(Character.valueOf('X'), bmd.kh)
/* 2098 */       .a("X X")
/* 2099 */       .a("X#X")
/* 2100 */       .a("X X")
/* 2101 */       .a("has_minecart", a(bmd.lN))
/* 2102 */       .a(☃);
/*      */     
/* 2104 */     ji.a(bmd.lP, 9)
/* 2105 */       .b(bup.fw)
/* 2106 */       .a("has_redstone_block", a(bup.fw))
/* 2107 */       .a(☃);
/*      */     
/* 2109 */     jh.a(bup.fw)
/* 2110 */       .a(Character.valueOf('#'), bmd.lP)
/* 2111 */       .a("###")
/* 2112 */       .a("###")
/* 2113 */       .a("###")
/* 2114 */       .a("has_redstone", a(bmd.lP))
/* 2115 */       .a(☃);
/*      */     
/* 2117 */     jh.a(bup.eg)
/* 2118 */       .a(Character.valueOf('R'), bmd.lP)
/* 2119 */       .a(Character.valueOf('G'), bup.cS)
/* 2120 */       .a(" R ")
/* 2121 */       .a("RGR")
/* 2122 */       .a(" R ")
/* 2123 */       .a("has_glowstone", a(bup.cS))
/* 2124 */       .a(☃);
/*      */     
/* 2126 */     jh.a(bup.cz)
/* 2127 */       .a(Character.valueOf('#'), bmd.kP)
/* 2128 */       .a(Character.valueOf('X'), bmd.lP)
/* 2129 */       .a("X")
/* 2130 */       .a("#")
/* 2131 */       .a("has_redstone", a(bmd.lP))
/* 2132 */       .a(☃);
/*      */     
/* 2134 */     ji.a(bmd.mI)
/* 2135 */       .b(bmd.qf)
/* 2136 */       .a("red_dye")
/* 2137 */       .a("has_beetroot", a(bmd.qf))
/* 2138 */       .a(☃, "red_dye_from_beetroot");
/*      */     
/* 2140 */     ji.a(bmd.mI)
/* 2141 */       .b(bup.bq)
/* 2142 */       .a("red_dye")
/* 2143 */       .a("has_red_flower", a(bup.bq))
/* 2144 */       .a(☃, "red_dye_from_poppy");
/*      */     
/* 2146 */     ji.a(bmd.mI, 2)
/* 2147 */       .b(bup.gW)
/* 2148 */       .a("red_dye")
/* 2149 */       .a("has_double_plant", a(bup.gW))
/* 2150 */       .a(☃, "red_dye_from_rose_bush");
/*      */     
/* 2152 */     ji.a(bmd.mI)
/* 2153 */       .b(bup.bu)
/* 2154 */       .a("red_dye")
/* 2155 */       .a("has_red_flower", a(bup.bu))
/* 2156 */       .a(☃, "red_dye_from_tulip");
/*      */     
/* 2158 */     jh.a(bup.iL)
/* 2159 */       .a(Character.valueOf('W'), bmd.nu)
/* 2160 */       .a(Character.valueOf('N'), bmd.pr)
/* 2161 */       .a("NW")
/* 2162 */       .a("WN")
/* 2163 */       .a("has_nether_wart", a(bmd.nu))
/* 2164 */       .a(☃);
/*      */     
/* 2166 */     jh.a(bup.hG)
/* 2167 */       .a(Character.valueOf('#'), bup.D)
/* 2168 */       .a("##")
/* 2169 */       .a("##")
/* 2170 */       .a("has_sand", a(bup.D))
/* 2171 */       .a(☃);
/*      */     
/* 2173 */     jh.a(bup.ia, 6)
/* 2174 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.hG, bup.hH
/* 2175 */           })).a("###")
/* 2176 */       .a("has_red_sandstone", a(bup.hG))
/* 2177 */       .a("has_chiseled_red_sandstone", a(bup.hH))
/* 2178 */       .a(☃);
/*      */     
/* 2180 */     jh.a(bup.ib, 6)
/* 2181 */       .a(Character.valueOf('#'), bup.hI)
/* 2182 */       .a("###")
/* 2183 */       .a("has_cut_red_sandstone", a(bup.hI))
/* 2184 */       .a(☃);
/*      */     
/* 2186 */     jh.a(bup.hJ, 4)
/* 2187 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.hG, bup.hH, bup.hI
/* 2188 */           })).a("#  ")
/* 2189 */       .a("## ")
/* 2190 */       .a("###")
/* 2191 */       .a("has_red_sandstone", a(bup.hG))
/* 2192 */       .a("has_chiseled_red_sandstone", a(bup.hH))
/* 2193 */       .a("has_cut_red_sandstone", a(bup.hI))
/* 2194 */       .a(☃);
/*      */     
/* 2196 */     jh.a(bup.cX)
/* 2197 */       .a(Character.valueOf('#'), bup.cz)
/* 2198 */       .a(Character.valueOf('X'), bmd.lP)
/* 2199 */       .a(Character.valueOf('I'), bup.b)
/* 2200 */       .a("#X#")
/* 2201 */       .a("III")
/* 2202 */       .a("has_redstone_torch", a(bup.cz))
/* 2203 */       .a(☃);
/*      */     
/* 2205 */     jh.a(bup.at)
/* 2206 */       .a(Character.valueOf('#'), bup.C)
/* 2207 */       .a("##")
/* 2208 */       .a("##")
/* 2209 */       .a("has_sand", a(bup.C))
/* 2210 */       .a(☃);
/*      */     
/* 2212 */     jh.a(bup.hS, 6)
/* 2213 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.at, bup.au
/* 2214 */           })).a("###")
/* 2215 */       .a("has_sandstone", a(bup.at))
/* 2216 */       .a("has_chiseled_sandstone", a(bup.au))
/* 2217 */       .a(☃);
/*      */     
/* 2219 */     jh.a(bup.hT, 6)
/* 2220 */       .a(Character.valueOf('#'), bup.av)
/* 2221 */       .a("###")
/* 2222 */       .a("has_cut_sandstone", a(bup.av))
/* 2223 */       .a(☃);
/*      */     
/* 2225 */     jh.a(bup.ei, 4)
/* 2226 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.at, bup.au, bup.av
/* 2227 */           })).a("#  ")
/* 2228 */       .a("## ")
/* 2229 */       .a("###")
/* 2230 */       .a("has_sandstone", a(bup.at))
/* 2231 */       .a("has_chiseled_sandstone", a(bup.au))
/* 2232 */       .a("has_cut_sandstone", a(bup.av))
/* 2233 */       .a(☃);
/*      */     
/* 2235 */     jh.a(bup.gz)
/* 2236 */       .a(Character.valueOf('S'), bmd.pv)
/* 2237 */       .a(Character.valueOf('C'), bmd.pw)
/* 2238 */       .a("SCS")
/* 2239 */       .a("CCC")
/* 2240 */       .a("SCS")
/* 2241 */       .a("has_prismarine_crystals", a(bmd.pw))
/* 2242 */       .a(☃);
/*      */     
/* 2244 */     jh.a(bmd.ng)
/* 2245 */       .a(Character.valueOf('#'), bmd.kh)
/* 2246 */       .a(" #")
/* 2247 */       .a("# ")
/* 2248 */       .a("has_iron_ingot", a(bmd.kh))
/* 2249 */       .a(☃);
/*      */     
/* 2251 */     jh.a(bmd.qn)
/* 2252 */       .a(Character.valueOf('W'), aeg.c)
/* 2253 */       .a(Character.valueOf('o'), bmd.kh)
/* 2254 */       .a("WoW")
/* 2255 */       .a("WWW")
/* 2256 */       .a(" W ")
/* 2257 */       .a("has_iron_ingot", a(bmd.kh))
/* 2258 */       .a(☃);
/*      */     
/* 2260 */     jh.a(bup.gn)
/* 2261 */       .a(Character.valueOf('#'), bmd.md)
/* 2262 */       .a("###")
/* 2263 */       .a("###")
/* 2264 */       .a("###")
/* 2265 */       .a("has_slime_ball", a(bmd.md))
/* 2266 */       .a(☃);
/*      */     
/* 2268 */     ji.a(bmd.md, 9)
/* 2269 */       .b(bup.gn)
/* 2270 */       .a("has_slime", a(bup.gn))
/* 2271 */       .a(☃);
/*      */     
/* 2273 */     jh.a(bup.hI, 4)
/* 2274 */       .a(Character.valueOf('#'), bup.hG)
/* 2275 */       .a("##")
/* 2276 */       .a("##")
/* 2277 */       .a("has_red_sandstone", a(bup.hG))
/* 2278 */       .a(☃);
/*      */     
/* 2280 */     jh.a(bup.av, 4)
/* 2281 */       .a(Character.valueOf('#'), bup.at)
/* 2282 */       .a("##")
/* 2283 */       .a("##")
/* 2284 */       .a("has_sandstone", a(bup.at))
/* 2285 */       .a(☃);
/*      */     
/* 2287 */     jh.a(bup.cE)
/* 2288 */       .a(Character.valueOf('#'), bmd.lQ)
/* 2289 */       .a("##")
/* 2290 */       .a("##")
/* 2291 */       .a("has_snowball", a(bmd.lQ))
/* 2292 */       .a(☃);
/*      */     
/* 2294 */     jh.a(bup.cC, 6)
/* 2295 */       .a(Character.valueOf('#'), bup.cE)
/* 2296 */       .a("###")
/* 2297 */       .a("has_snowball", a(bmd.lQ))
/* 2298 */       .a(☃);
/*      */     
/* 2300 */     jh.a(bup.mf)
/* 2301 */       .a(Character.valueOf('L'), aeg.q)
/* 2302 */       .a(Character.valueOf('S'), bmd.kP)
/* 2303 */       .a(Character.valueOf('#'), aeg.R)
/* 2304 */       .a(" S ")
/* 2305 */       .a("S#S")
/* 2306 */       .a("LLL")
/* 2307 */       .a("has_stick", a(bmd.kP))
/* 2308 */       .a("has_soul_sand", a(aeg.R))
/* 2309 */       .a(☃);
/*      */     
/* 2311 */     jh.a(bmd.nE)
/* 2312 */       .a(Character.valueOf('#'), bmd.nt)
/* 2313 */       .a(Character.valueOf('X'), bmd.nh)
/* 2314 */       .a("###")
/* 2315 */       .a("#X#")
/* 2316 */       .a("###")
/* 2317 */       .a("has_melon", a(bmd.nh))
/* 2318 */       .a(☃);
/*      */     
/* 2320 */     jh.a(bmd.qk, 2)
/* 2321 */       .a(Character.valueOf('#'), bmd.mk)
/* 2322 */       .a(Character.valueOf('X'), bmd.kd)
/* 2323 */       .a(" # ")
/* 2324 */       .a("#X#")
/* 2325 */       .a(" # ")
/* 2326 */       .a("has_glowstone_dust", a(bmd.mk))
/* 2327 */       .a(☃);
/*      */     
/* 2329 */     jh.a(bmd.kP, 4)
/* 2330 */       .a(Character.valueOf('#'), aeg.c)
/* 2331 */       .a("#")
/* 2332 */       .a("#")
/* 2333 */       .b("sticks")
/* 2334 */       .a("has_planks", a(aeg.c))
/* 2335 */       .a(☃);
/*      */     
/* 2337 */     jh.a(bmd.kP, 1)
/* 2338 */       .a(Character.valueOf('#'), bup.kY)
/* 2339 */       .a("#")
/* 2340 */       .a("#")
/* 2341 */       .b("sticks")
/* 2342 */       .a("has_bamboo", a(bup.kY))
/* 2343 */       .a(☃, "stick_from_bamboo_item");
/*      */     
/* 2345 */     jh.a(bup.aP)
/* 2346 */       .a(Character.valueOf('P'), bup.aW)
/* 2347 */       .a(Character.valueOf('S'), bmd.md)
/* 2348 */       .a("S")
/* 2349 */       .a("P")
/* 2350 */       .a("has_slime_ball", a(bmd.md))
/* 2351 */       .a(☃);
/*      */     
/* 2353 */     jh.a(bup.du, 4)
/* 2354 */       .a(Character.valueOf('#'), bup.b)
/* 2355 */       .a("##")
/* 2356 */       .a("##")
/* 2357 */       .a("has_stone", a(bup.b))
/* 2358 */       .a(☃);
/*      */     
/* 2360 */     jh.a(bmd.kt)
/* 2361 */       .a(Character.valueOf('#'), bmd.kP)
/* 2362 */       .a(Character.valueOf('X'), aeg.ab)
/* 2363 */       .a("XX")
/* 2364 */       .a("X#")
/* 2365 */       .a(" #")
/* 2366 */       .a("has_cobblestone", a(aeg.ab))
/* 2367 */       .a(☃);
/*      */     
/* 2369 */     jh.a(bup.hX, 6)
/* 2370 */       .a(Character.valueOf('#'), bup.du)
/* 2371 */       .a("###")
/* 2372 */       .a("has_stone_bricks", a(aeg.d))
/* 2373 */       .a(☃);
/*      */     
/* 2375 */     jh.a(bup.dS, 4)
/* 2376 */       .a(Character.valueOf('#'), bup.du)
/* 2377 */       .a("#  ")
/* 2378 */       .a("## ")
/* 2379 */       .a("###")
/* 2380 */       .a("has_stone_bricks", a(aeg.d))
/* 2381 */       .a(☃);
/*      */     
/* 2383 */     ji.a(bup.cB)
/* 2384 */       .b(bup.b)
/* 2385 */       .a("has_stone", a(bup.b))
/* 2386 */       .a(☃);
/*      */     
/* 2388 */     jh.a(bmd.ku)
/* 2389 */       .a(Character.valueOf('#'), bmd.kP)
/* 2390 */       .a(Character.valueOf('X'), aeg.ab)
/* 2391 */       .a("XX")
/* 2392 */       .a(" #")
/* 2393 */       .a(" #")
/* 2394 */       .a("has_cobblestone", a(aeg.ab))
/* 2395 */       .a(☃);
/*      */     
/* 2397 */     jh.a(bmd.ks)
/* 2398 */       .a(Character.valueOf('#'), bmd.kP)
/* 2399 */       .a(Character.valueOf('X'), aeg.ab)
/* 2400 */       .a("XXX")
/* 2401 */       .a(" # ")
/* 2402 */       .a(" # ")
/* 2403 */       .a("has_cobblestone", a(aeg.ab))
/* 2404 */       .a(☃);
/*      */     
/* 2406 */     jh.a(bup.cq)
/* 2407 */       .a(Character.valueOf('#'), bup.b)
/* 2408 */       .a("##")
/* 2409 */       .a("has_stone", a(bup.b))
/* 2410 */       .a(☃);
/*      */     
/* 2412 */     jh.a(bmd.kr)
/* 2413 */       .a(Character.valueOf('#'), bmd.kP)
/* 2414 */       .a(Character.valueOf('X'), aeg.ab)
/* 2415 */       .a("X")
/* 2416 */       .a("#")
/* 2417 */       .a("#")
/* 2418 */       .a("has_cobblestone", a(aeg.ab))
/* 2419 */       .a(☃);
/*      */     
/* 2421 */     jh.a(bup.hQ, 6)
/* 2422 */       .a(Character.valueOf('#'), bup.b)
/* 2423 */       .a("###")
/* 2424 */       .a("has_stone", a(bup.b))
/* 2425 */       .a(☃);
/*      */     
/* 2427 */     jh.a(bup.hR, 6)
/* 2428 */       .a(Character.valueOf('#'), bup.id)
/* 2429 */       .a("###")
/* 2430 */       .a("has_smooth_stone", a(bup.id))
/* 2431 */       .a(☃);
/*      */     
/* 2433 */     jh.a(bup.ci, 4)
/* 2434 */       .a(Character.valueOf('#'), bup.m)
/* 2435 */       .a("#  ")
/* 2436 */       .a("## ")
/* 2437 */       .a("###")
/* 2438 */       .a("has_cobblestone", a(bup.m))
/* 2439 */       .a(☃);
/*      */     
/* 2441 */     jh.a(bmd.kq)
/* 2442 */       .a(Character.valueOf('#'), bmd.kP)
/* 2443 */       .a(Character.valueOf('X'), aeg.ab)
/* 2444 */       .a("X")
/* 2445 */       .a("X")
/* 2446 */       .a("#")
/* 2447 */       .a("has_cobblestone", a(aeg.ab))
/* 2448 */       .a(☃);
/*      */     
/* 2450 */     jh.a(bup.aY)
/* 2451 */       .a(Character.valueOf('#'), bmd.kS)
/* 2452 */       .a("##")
/* 2453 */       .a("##")
/* 2454 */       .a("has_string", a(bmd.kS))
/* 2455 */       .a(☃, "white_wool_from_string");
/*      */     
/* 2457 */     ji.a(bmd.mM)
/* 2458 */       .b(bup.cH)
/* 2459 */       .a("sugar")
/* 2460 */       .a("has_reeds", a(bup.cH))
/* 2461 */       .a(☃, "sugar_from_sugar_cane");
/*      */     
/* 2463 */     ji.a(bmd.mM, 3)
/* 2464 */       .b(bmd.rt)
/* 2465 */       .a("sugar")
/* 2466 */       .a("has_honey_bottle", a(bmd.rt))
/* 2467 */       .a(☃, "sugar_from_honey_bottle");
/*      */     
/* 2469 */     jh.a(bup.nb)
/* 2470 */       .a(Character.valueOf('H'), bmd.fL)
/* 2471 */       .a(Character.valueOf('R'), bmd.lP)
/* 2472 */       .a(" R ")
/* 2473 */       .a("RHR")
/* 2474 */       .a(" R ")
/* 2475 */       .a("has_redstone", a(bmd.lP))
/* 2476 */       .a("has_hay_block", a(bup.gA))
/* 2477 */       .a(☃);
/*      */     
/* 2479 */     jh.a(bup.bH)
/* 2480 */       .a(Character.valueOf('#'), bon.a(new brw[] { bup.C, bup.D
/* 2481 */           })).a(Character.valueOf('X'), bmd.kU)
/* 2482 */       .a("X#X")
/* 2483 */       .a("#X#")
/* 2484 */       .a("X#X")
/* 2485 */       .a("has_gunpowder", a(bmd.kU))
/* 2486 */       .a(☃);
/*      */     
/* 2488 */     jh.a(bmd.pt)
/* 2489 */       .a(Character.valueOf('A'), bup.bH)
/* 2490 */       .a(Character.valueOf('B'), bmd.lN)
/* 2491 */       .a("A")
/* 2492 */       .a("B")
/* 2493 */       .a("has_minecart", a(bmd.lN))
/* 2494 */       .a(☃);
/*      */     
/* 2496 */     jh.a(bup.bL, 4)
/* 2497 */       .a(Character.valueOf('#'), bmd.kP)
/* 2498 */       .a(Character.valueOf('X'), bon.a(new brw[] { bmd.ke, bmd.kf
/* 2499 */           })).a("X")
/* 2500 */       .a("#")
/* 2501 */       .a("has_stone_pickaxe", a(bmd.ks))
/* 2502 */       .a(☃);
/*      */     
/* 2504 */     jh.a(bup.cQ, 4)
/* 2505 */       .a(Character.valueOf('X'), bon.a(new brw[] { bmd.ke, bmd.kf
/* 2506 */           })).a(Character.valueOf('#'), bmd.kP)
/* 2507 */       .a(Character.valueOf('S'), aeg.R)
/* 2508 */       .a("X")
/* 2509 */       .a("#")
/* 2510 */       .a("S")
/* 2511 */       .a("has_soul_sand", a(aeg.R))
/* 2512 */       .a(☃);
/*      */     
/* 2514 */     jh.a(bup.mc)
/* 2515 */       .a(Character.valueOf('#'), bmd.cp)
/* 2516 */       .a(Character.valueOf('X'), bmd.qw)
/* 2517 */       .a("XXX")
/* 2518 */       .a("X#X")
/* 2519 */       .a("XXX")
/* 2520 */       .a("has_iron_nugget", a(bmd.qw))
/* 2521 */       .a("has_iron_ingot", a(bmd.kh))
/* 2522 */       .a(☃);
/*      */     
/* 2524 */     jh.a(bup.md)
/* 2525 */       .a(Character.valueOf('#'), bmd.dp)
/* 2526 */       .a(Character.valueOf('X'), bmd.qw)
/* 2527 */       .a("XXX")
/* 2528 */       .a("X#X")
/* 2529 */       .a("XXX")
/* 2530 */       .a("has_soul_torch", a(bmd.dp))
/* 2531 */       .a(☃);
/*      */     
/* 2533 */     ji.a(bup.fr)
/* 2534 */       .b(bup.bR)
/* 2535 */       .b(bup.el)
/* 2536 */       .a("has_tripwire_hook", a(bup.el))
/* 2537 */       .a(☃);
/*      */     
/* 2539 */     jh.a(bup.el, 2)
/* 2540 */       .a(Character.valueOf('#'), aeg.c)
/* 2541 */       .a(Character.valueOf('S'), bmd.kP)
/* 2542 */       .a(Character.valueOf('I'), bmd.kh)
/* 2543 */       .a("I")
/* 2544 */       .a("S")
/* 2545 */       .a("#")
/* 2546 */       .a("has_string", a(bmd.kS))
/* 2547 */       .a(☃);
/*      */     
/* 2549 */     jh.a(bmd.jY)
/* 2550 */       .a(Character.valueOf('X'), bmd.jZ)
/* 2551 */       .a("XXX")
/* 2552 */       .a("X X")
/* 2553 */       .a("has_scute", a(bmd.jZ))
/* 2554 */       .a(☃);
/*      */     
/* 2556 */     ji.a(bmd.kW, 9)
/* 2557 */       .b(bup.gA)
/* 2558 */       .a("has_hay_block", a(bup.gA))
/* 2559 */       .a(☃);
/*      */     
/* 2561 */     ji.a(bmd.mu)
/* 2562 */       .b(bmd.mK)
/* 2563 */       .a("white_dye")
/* 2564 */       .a("has_bone_meal", a(bmd.mK))
/* 2565 */       .a(☃);
/*      */     
/* 2567 */     ji.a(bmd.mu)
/* 2568 */       .b(bup.bB)
/* 2569 */       .a("white_dye")
/* 2570 */       .a("has_white_flower", a(bup.bB))
/* 2571 */       .a(☃, "white_dye_from_lily_of_the_valley");
/*      */     
/* 2573 */     jh.a(bmd.ko)
/* 2574 */       .a(Character.valueOf('#'), bmd.kP)
/* 2575 */       .a(Character.valueOf('X'), aeg.c)
/* 2576 */       .a("XX")
/* 2577 */       .a("X#")
/* 2578 */       .a(" #")
/* 2579 */       .a("has_stick", a(bmd.kP))
/* 2580 */       .a(☃);
/*      */     
/* 2582 */     jh.a(bmd.kp)
/* 2583 */       .a(Character.valueOf('#'), bmd.kP)
/* 2584 */       .a(Character.valueOf('X'), aeg.c)
/* 2585 */       .a("XX")
/* 2586 */       .a(" #")
/* 2587 */       .a(" #")
/* 2588 */       .a("has_stick", a(bmd.kP))
/* 2589 */       .a(☃);
/*      */     
/* 2591 */     jh.a(bmd.kn)
/* 2592 */       .a(Character.valueOf('#'), bmd.kP)
/* 2593 */       .a(Character.valueOf('X'), aeg.c)
/* 2594 */       .a("XXX")
/* 2595 */       .a(" # ")
/* 2596 */       .a(" # ")
/* 2597 */       .a("has_stick", a(bmd.kP))
/* 2598 */       .a(☃);
/*      */     
/* 2600 */     jh.a(bmd.km)
/* 2601 */       .a(Character.valueOf('#'), bmd.kP)
/* 2602 */       .a(Character.valueOf('X'), aeg.c)
/* 2603 */       .a("X")
/* 2604 */       .a("#")
/* 2605 */       .a("#")
/* 2606 */       .a("has_stick", a(bmd.kP))
/* 2607 */       .a(☃);
/*      */     
/* 2609 */     jh.a(bmd.kl)
/* 2610 */       .a(Character.valueOf('#'), bmd.kP)
/* 2611 */       .a(Character.valueOf('X'), aeg.c)
/* 2612 */       .a("X")
/* 2613 */       .a("X")
/* 2614 */       .a("#")
/* 2615 */       .a("has_stick", a(bmd.kP))
/* 2616 */       .a(☃);
/*      */     
/* 2618 */     ji.a(bmd.oT)
/* 2619 */       .b(bmd.mc)
/* 2620 */       .b(bmd.mr)
/* 2621 */       .b(bmd.kT)
/* 2622 */       .a("has_book", a(bmd.mc))
/* 2623 */       .a(☃);
/*      */     
/* 2625 */     ji.a(bmd.my)
/* 2626 */       .b(bup.bp)
/* 2627 */       .a("yellow_dye")
/* 2628 */       .a("has_yellow_flower", a(bup.bp))
/* 2629 */       .a(☃, "yellow_dye_from_dandelion");
/*      */     
/* 2631 */     ji.a(bmd.my, 2)
/* 2632 */       .b(bup.gU)
/* 2633 */       .a("yellow_dye")
/* 2634 */       .a("has_double_plant", a(bup.gU))
/* 2635 */       .a(☃, "yellow_dye_from_sunflower");
/*      */     
/* 2637 */     ji.a(bmd.ni, 9)
/* 2638 */       .b(bup.ke)
/* 2639 */       .a("has_dried_kelp_block", a(bup.ke))
/* 2640 */       .a(☃);
/*      */     
/* 2642 */     ji.a(bup.ke)
/* 2643 */       .b(bmd.ni, 9)
/* 2644 */       .a("has_dried_kelp", a(bmd.ni))
/* 2645 */       .a(☃);
/*      */     
/* 2647 */     jh.a(bup.kW)
/* 2648 */       .a(Character.valueOf('#'), bmd.qO)
/* 2649 */       .a(Character.valueOf('X'), bmd.qP)
/* 2650 */       .a("###")
/* 2651 */       .a("#X#")
/* 2652 */       .a("###")
/* 2653 */       .a("has_nautilus_core", a(bmd.qP))
/* 2654 */       .a("has_nautilus_shell", a(bmd.qO))
/* 2655 */       .a(☃);
/*      */     
/* 2657 */     jh.a(bup.ld, 4)
/* 2658 */       .a(Character.valueOf('#'), bup.d)
/* 2659 */       .a("#  ")
/* 2660 */       .a("## ")
/* 2661 */       .a("###")
/* 2662 */       .a("has_polished_granite", a(bup.d))
/* 2663 */       .a(☃);
/*      */     
/* 2665 */     jh.a(bup.le, 4)
/* 2666 */       .a(Character.valueOf('#'), bup.ig)
/* 2667 */       .a("#  ")
/* 2668 */       .a("## ")
/* 2669 */       .a("###")
/* 2670 */       .a("has_smooth_red_sandstone", a(bup.ig))
/* 2671 */       .a(☃);
/*      */     
/* 2673 */     jh.a(bup.lf, 4)
/* 2674 */       .a(Character.valueOf('#'), bup.dv)
/* 2675 */       .a("#  ")
/* 2676 */       .a("## ")
/* 2677 */       .a("###")
/* 2678 */       .a("has_mossy_stone_bricks", a(bup.dv))
/* 2679 */       .a(☃);
/*      */     
/* 2681 */     jh.a(bup.lg, 4)
/* 2682 */       .a(Character.valueOf('#'), bup.f)
/* 2683 */       .a("#  ")
/* 2684 */       .a("## ")
/* 2685 */       .a("###")
/* 2686 */       .a("has_polished_diorite", a(bup.f))
/* 2687 */       .a(☃);
/*      */     
/* 2689 */     jh.a(bup.lh, 4)
/* 2690 */       .a(Character.valueOf('#'), bup.bJ)
/* 2691 */       .a("#  ")
/* 2692 */       .a("## ")
/* 2693 */       .a("###")
/* 2694 */       .a("has_mossy_cobblestone", a(bup.bJ))
/* 2695 */       .a(☃);
/*      */     
/* 2697 */     jh.a(bup.li, 4)
/* 2698 */       .a(Character.valueOf('#'), bup.iC)
/* 2699 */       .a("#  ")
/* 2700 */       .a("## ")
/* 2701 */       .a("###")
/* 2702 */       .a("has_end_stone_bricks", a(bup.iC))
/* 2703 */       .a(☃);
/*      */     
/* 2705 */     jh.a(bup.lj, 4)
/* 2706 */       .a(Character.valueOf('#'), bup.b)
/* 2707 */       .a("#  ")
/* 2708 */       .a("## ")
/* 2709 */       .a("###")
/* 2710 */       .a("has_stone", a(bup.b))
/* 2711 */       .a(☃);
/*      */     
/* 2713 */     jh.a(bup.lk, 4)
/* 2714 */       .a(Character.valueOf('#'), bup.ie)
/* 2715 */       .a("#  ")
/* 2716 */       .a("## ")
/* 2717 */       .a("###")
/* 2718 */       .a("has_smooth_sandstone", a(bup.ie))
/* 2719 */       .a(☃);
/*      */     
/* 2721 */     jh.a(bup.ll, 4)
/* 2722 */       .a(Character.valueOf('#'), bup.if)
/* 2723 */       .a("#  ")
/* 2724 */       .a("## ")
/* 2725 */       .a("###")
/* 2726 */       .a("has_smooth_quartz", a(bup.if))
/* 2727 */       .a(☃);
/*      */     
/* 2729 */     jh.a(bup.lm, 4)
/* 2730 */       .a(Character.valueOf('#'), bup.c)
/* 2731 */       .a("#  ")
/* 2732 */       .a("## ")
/* 2733 */       .a("###")
/* 2734 */       .a("has_granite", a(bup.c))
/* 2735 */       .a(☃);
/*      */     
/* 2737 */     jh.a(bup.ln, 4)
/* 2738 */       .a(Character.valueOf('#'), bup.g)
/* 2739 */       .a("#  ")
/* 2740 */       .a("## ")
/* 2741 */       .a("###")
/* 2742 */       .a("has_andesite", a(bup.g))
/* 2743 */       .a(☃);
/*      */     
/* 2745 */     jh.a(bup.lo, 4)
/* 2746 */       .a(Character.valueOf('#'), bup.iL)
/* 2747 */       .a("#  ")
/* 2748 */       .a("## ")
/* 2749 */       .a("###")
/* 2750 */       .a("has_red_nether_bricks", a(bup.iL))
/* 2751 */       .a(☃);
/*      */     
/* 2753 */     jh.a(bup.lp, 4)
/* 2754 */       .a(Character.valueOf('#'), bup.h)
/* 2755 */       .a("#  ")
/* 2756 */       .a("## ")
/* 2757 */       .a("###")
/* 2758 */       .a("has_polished_andesite", a(bup.h))
/* 2759 */       .a(☃);
/*      */     
/* 2761 */     jh.a(bup.lq, 4)
/* 2762 */       .a(Character.valueOf('#'), bup.e)
/* 2763 */       .a("#  ")
/* 2764 */       .a("## ")
/* 2765 */       .a("###")
/* 2766 */       .a("has_diorite", a(bup.e))
/* 2767 */       .a(☃);
/*      */     
/* 2769 */     jh.a(bup.lr, 6)
/* 2770 */       .a(Character.valueOf('#'), bup.d)
/* 2771 */       .a("###")
/* 2772 */       .a("has_polished_granite", a(bup.d))
/* 2773 */       .a(☃);
/*      */     
/* 2775 */     jh.a(bup.ls, 6)
/* 2776 */       .a(Character.valueOf('#'), bup.ig)
/* 2777 */       .a("###")
/* 2778 */       .a("has_smooth_red_sandstone", a(bup.ig))
/* 2779 */       .a(☃);
/*      */     
/* 2781 */     jh.a(bup.lt, 6)
/* 2782 */       .a(Character.valueOf('#'), bup.dv)
/* 2783 */       .a("###")
/* 2784 */       .a("has_mossy_stone_bricks", a(bup.dv))
/* 2785 */       .a(☃);
/*      */     
/* 2787 */     jh.a(bup.lu, 6)
/* 2788 */       .a(Character.valueOf('#'), bup.f)
/* 2789 */       .a("###")
/* 2790 */       .a("has_polished_diorite", a(bup.f))
/* 2791 */       .a(☃);
/*      */     
/* 2793 */     jh.a(bup.lv, 6)
/* 2794 */       .a(Character.valueOf('#'), bup.bJ)
/* 2795 */       .a("###")
/* 2796 */       .a("has_mossy_cobblestone", a(bup.bJ))
/* 2797 */       .a(☃);
/*      */     
/* 2799 */     jh.a(bup.lw, 6)
/* 2800 */       .a(Character.valueOf('#'), bup.iC)
/* 2801 */       .a("###")
/* 2802 */       .a("has_end_stone_bricks", a(bup.iC))
/* 2803 */       .a(☃);
/*      */     
/* 2805 */     jh.a(bup.lx, 6)
/* 2806 */       .a(Character.valueOf('#'), bup.ie)
/* 2807 */       .a("###")
/* 2808 */       .a("has_smooth_sandstone", a(bup.ie))
/* 2809 */       .a(☃);
/*      */     
/* 2811 */     jh.a(bup.ly, 6)
/* 2812 */       .a(Character.valueOf('#'), bup.if)
/* 2813 */       .a("###")
/* 2814 */       .a("has_smooth_quartz", a(bup.if))
/* 2815 */       .a(☃);
/*      */     
/* 2817 */     jh.a(bup.lz, 6)
/* 2818 */       .a(Character.valueOf('#'), bup.c)
/* 2819 */       .a("###")
/* 2820 */       .a("has_granite", a(bup.c))
/* 2821 */       .a(☃);
/*      */     
/* 2823 */     jh.a(bup.lA, 6)
/* 2824 */       .a(Character.valueOf('#'), bup.g)
/* 2825 */       .a("###")
/* 2826 */       .a("has_andesite", a(bup.g))
/* 2827 */       .a(☃);
/*      */     
/* 2829 */     jh.a(bup.lB, 6)
/* 2830 */       .a(Character.valueOf('#'), bup.iL)
/* 2831 */       .a("###")
/* 2832 */       .a("has_red_nether_bricks", a(bup.iL))
/* 2833 */       .a(☃);
/*      */     
/* 2835 */     jh.a(bup.lC, 6)
/* 2836 */       .a(Character.valueOf('#'), bup.h)
/* 2837 */       .a("###")
/* 2838 */       .a("has_polished_andesite", a(bup.h))
/* 2839 */       .a(☃);
/*      */     
/* 2841 */     jh.a(bup.lD, 6)
/* 2842 */       .a(Character.valueOf('#'), bup.e)
/* 2843 */       .a("###")
/* 2844 */       .a("has_diorite", a(bup.e))
/* 2845 */       .a(☃);
/*      */     
/* 2847 */     jh.a(bup.lE, 6)
/* 2848 */       .a(Character.valueOf('#'), bup.bG)
/* 2849 */       .a("###")
/* 2850 */       .a("###")
/* 2851 */       .a("has_bricks", a(bup.bG))
/* 2852 */       .a(☃);
/*      */     
/* 2854 */     jh.a(bup.lF, 6)
/* 2855 */       .a(Character.valueOf('#'), bup.gq)
/* 2856 */       .a("###")
/* 2857 */       .a("###")
/* 2858 */       .a("has_prismarine", a(bup.gq))
/* 2859 */       .a(☃);
/*      */     
/* 2861 */     jh.a(bup.lG, 6)
/* 2862 */       .a(Character.valueOf('#'), bup.hG)
/* 2863 */       .a("###")
/* 2864 */       .a("###")
/* 2865 */       .a("has_red_sandstone", a(bup.hG))
/* 2866 */       .a(☃);
/*      */     
/* 2868 */     jh.a(bup.lH, 6)
/* 2869 */       .a(Character.valueOf('#'), bup.dv)
/* 2870 */       .a("###")
/* 2871 */       .a("###")
/* 2872 */       .a("has_mossy_stone_bricks", a(bup.dv))
/* 2873 */       .a(☃);
/*      */     
/* 2875 */     jh.a(bup.lI, 6)
/* 2876 */       .a(Character.valueOf('#'), bup.c)
/* 2877 */       .a("###")
/* 2878 */       .a("###")
/* 2879 */       .a("has_granite", a(bup.c))
/* 2880 */       .a(☃);
/*      */     
/* 2882 */     jh.a(bup.lJ, 6)
/* 2883 */       .a(Character.valueOf('#'), bup.du)
/* 2884 */       .a("###")
/* 2885 */       .a("###")
/* 2886 */       .a("has_stone_bricks", a(bup.du))
/* 2887 */       .a(☃);
/*      */     
/* 2889 */     jh.a(bup.lK, 6)
/* 2890 */       .a(Character.valueOf('#'), bup.dV)
/* 2891 */       .a("###")
/* 2892 */       .a("###")
/* 2893 */       .a("has_nether_bricks", a(bup.dV))
/* 2894 */       .a(☃);
/*      */     
/* 2896 */     jh.a(bup.lL, 6)
/* 2897 */       .a(Character.valueOf('#'), bup.g)
/* 2898 */       .a("###")
/* 2899 */       .a("###")
/* 2900 */       .a("has_andesite", a(bup.g))
/* 2901 */       .a(☃);
/*      */     
/* 2903 */     jh.a(bup.lM, 6)
/* 2904 */       .a(Character.valueOf('#'), bup.iL)
/* 2905 */       .a("###")
/* 2906 */       .a("###")
/* 2907 */       .a("has_red_nether_bricks", a(bup.iL))
/* 2908 */       .a(☃);
/*      */     
/* 2910 */     jh.a(bup.lN, 6)
/* 2911 */       .a(Character.valueOf('#'), bup.at)
/* 2912 */       .a("###")
/* 2913 */       .a("###")
/* 2914 */       .a("has_sandstone", a(bup.at))
/* 2915 */       .a(☃);
/*      */     
/* 2917 */     jh.a(bup.lO, 6)
/* 2918 */       .a(Character.valueOf('#'), bup.iC)
/* 2919 */       .a("###")
/* 2920 */       .a("###")
/* 2921 */       .a("has_end_stone_bricks", a(bup.iC))
/* 2922 */       .a(☃);
/*      */     
/* 2924 */     jh.a(bup.lP, 6)
/* 2925 */       .a(Character.valueOf('#'), bup.e)
/* 2926 */       .a("###")
/* 2927 */       .a("###")
/* 2928 */       .a("has_diorite", a(bup.e))
/* 2929 */       .a(☃);
/*      */     
/* 2931 */     ji.a(bmd.qU)
/* 2932 */       .b(bmd.mb)
/* 2933 */       .b(bmd.pi)
/* 2934 */       .a("has_creeper_head", a(bmd.pi))
/* 2935 */       .a(☃);
/*      */     
/* 2937 */     ji.a(bmd.qV)
/* 2938 */       .b(bmd.mb)
/* 2939 */       .b(bmd.pf)
/* 2940 */       .a("has_wither_skeleton_skull", a(bmd.pf))
/* 2941 */       .a(☃);
/*      */     
/* 2943 */     ji.a(bmd.qT)
/* 2944 */       .b(bmd.mb)
/* 2945 */       .b(bup.by)
/* 2946 */       .a("has_oxeye_daisy", a(bup.by))
/* 2947 */       .a(☃);
/*      */     
/* 2949 */     ji.a(bmd.qW)
/* 2950 */       .b(bmd.mb)
/* 2951 */       .b(bmd.lB)
/* 2952 */       .a("has_enchanted_golden_apple", a(bmd.lB))
/* 2953 */       .a(☃);
/*      */     
/* 2955 */     jh.a(bup.lQ, 6)
/* 2956 */       .a(Character.valueOf('~'), bmd.kS)
/* 2957 */       .a(Character.valueOf('I'), bup.kY)
/* 2958 */       .a("I~I")
/* 2959 */       .a("I I")
/* 2960 */       .a("I I")
/* 2961 */       .a("has_bamboo", a(bup.kY))
/* 2962 */       .a(☃);
/*      */     
/* 2964 */     jh.a(bup.lX)
/* 2965 */       .a(Character.valueOf('I'), bmd.kP)
/* 2966 */       .a(Character.valueOf('-'), bup.hQ)
/* 2967 */       .a(Character.valueOf('#'), aeg.c)
/* 2968 */       .a("I-I")
/* 2969 */       .a("# #")
/* 2970 */       .a("has_stone_slab", a(bup.hQ))
/* 2971 */       .a(☃);
/*      */     
/* 2973 */     jh.a(bup.lU)
/* 2974 */       .a(Character.valueOf('#'), bup.id)
/* 2975 */       .a(Character.valueOf('X'), bup.bY)
/* 2976 */       .a(Character.valueOf('I'), bmd.kh)
/* 2977 */       .a("III")
/* 2978 */       .a("IXI")
/* 2979 */       .a("###")
/* 2980 */       .a("has_smooth_stone", a(bup.id))
/* 2981 */       .a(☃);
/*      */     
/* 2983 */     jh.a(bup.lT)
/* 2984 */       .a(Character.valueOf('#'), aeg.q)
/* 2985 */       .a(Character.valueOf('X'), bup.bY)
/* 2986 */       .a(" # ")
/* 2987 */       .a("#X#")
/* 2988 */       .a(" # ")
/* 2989 */       .a("has_furnace", a(bup.bY))
/* 2990 */       .a(☃);
/*      */     
/* 2992 */     jh.a(bup.lV)
/* 2993 */       .a(Character.valueOf('#'), aeg.c)
/* 2994 */       .a(Character.valueOf('@'), bmd.mb)
/* 2995 */       .a("@@")
/* 2996 */       .a("##")
/* 2997 */       .a("##")
/* 2998 */       .a("has_paper", a(bmd.mb))
/* 2999 */       .a(☃);
/*      */     
/* 3001 */     jh.a(bup.lZ)
/* 3002 */       .a(Character.valueOf('#'), aeg.c)
/* 3003 */       .a(Character.valueOf('@'), bmd.kh)
/* 3004 */       .a("@@")
/* 3005 */       .a("##")
/* 3006 */       .a("##")
/* 3007 */       .a("has_iron_ingot", a(bmd.kh))
/* 3008 */       .a(☃);
/*      */     
/* 3010 */     jh.a(bup.lW)
/* 3011 */       .a(Character.valueOf('#'), aeg.c)
/* 3012 */       .a(Character.valueOf('@'), bmd.lw)
/* 3013 */       .a("@@")
/* 3014 */       .a("##")
/* 3015 */       .a("##")
/* 3016 */       .a("has_flint", a(bmd.lw))
/* 3017 */       .a(☃);
/*      */     
/* 3019 */     jh.a(bup.ma)
/* 3020 */       .a(Character.valueOf('I'), bmd.kh)
/* 3021 */       .a(Character.valueOf('#'), bup.b)
/* 3022 */       .a(" I ")
/* 3023 */       .a("###")
/* 3024 */       .a("has_stone", a(bup.b))
/* 3025 */       .a(☃);
/*      */     
/* 3027 */     jh.a(bup.no)
/* 3028 */       .a(Character.valueOf('S'), bmd.dJ)
/* 3029 */       .a(Character.valueOf('#'), bmd.kj)
/* 3030 */       .a("SSS")
/* 3031 */       .a("S#S")
/* 3032 */       .a("SSS")
/* 3033 */       .a("has_netherite_ingot", a(bmd.kj))
/* 3034 */       .a(☃);
/*      */     
/* 3036 */     jh.a(bup.ng)
/* 3037 */       .a(Character.valueOf('#'), bmd.kj)
/* 3038 */       .a("###")
/* 3039 */       .a("###")
/* 3040 */       .a("###")
/* 3041 */       .a("has_netherite_ingot", a(bmd.kj))
/* 3042 */       .a(☃);
/*      */     
/* 3044 */     ji.a(bmd.kj, 9)
/* 3045 */       .b(bup.ng)
/* 3046 */       .a("netherite_ingot")
/* 3047 */       .a("has_netherite_block", a(bup.ng))
/* 3048 */       .a(☃, "netherite_ingot_from_netherite_block");
/*      */     
/* 3050 */     ji.a(bmd.kj)
/* 3051 */       .b(bmd.kk, 4)
/* 3052 */       .b(bmd.ki, 4)
/* 3053 */       .a("netherite_ingot")
/* 3054 */       .a("has_netherite_scrap", a(bmd.kk))
/* 3055 */       .a(☃);
/*      */     
/* 3057 */     jh.a(bup.nj)
/* 3058 */       .a(Character.valueOf('O'), bup.ni)
/* 3059 */       .a(Character.valueOf('G'), bup.cS)
/* 3060 */       .a("OOO")
/* 3061 */       .a("GGG")
/* 3062 */       .a("OOO")
/* 3063 */       .a("has_obsidian", a(bup.ni))
/* 3064 */       .a(☃);
/*      */     
/* 3066 */     jh.a(bup.nq, 4)
/* 3067 */       .a(Character.valueOf('#'), bup.np)
/* 3068 */       .a("#  ")
/* 3069 */       .a("## ")
/* 3070 */       .a("###")
/* 3071 */       .a("has_blackstone", a(bup.np))
/* 3072 */       .a(☃);
/*      */     
/* 3074 */     jh.a(bup.nB, 4)
/* 3075 */       .a(Character.valueOf('#'), bup.nt)
/* 3076 */       .a("#  ")
/* 3077 */       .a("## ")
/* 3078 */       .a("###")
/* 3079 */       .a("has_polished_blackstone", a(bup.nt))
/* 3080 */       .a(☃);
/*      */     
/* 3082 */     jh.a(bup.ny, 4)
/* 3083 */       .a(Character.valueOf('#'), bup.nu)
/* 3084 */       .a("#  ")
/* 3085 */       .a("## ")
/* 3086 */       .a("###")
/* 3087 */       .a("has_polished_blackstone_bricks", a(bup.nu))
/* 3088 */       .a(☃);
/*      */     
/* 3090 */     jh.a(bup.ns, 6)
/* 3091 */       .a(Character.valueOf('#'), bup.np)
/* 3092 */       .a("###")
/* 3093 */       .a("has_blackstone", a(bup.np))
/* 3094 */       .a(☃);
/*      */     
/* 3096 */     jh.a(bup.nC, 6)
/* 3097 */       .a(Character.valueOf('#'), bup.nt)
/* 3098 */       .a("###")
/* 3099 */       .a("has_polished_blackstone", a(bup.nt))
/* 3100 */       .a(☃);
/*      */     
/* 3102 */     jh.a(bup.nx, 6)
/* 3103 */       .a(Character.valueOf('#'), bup.nu)
/* 3104 */       .a("###")
/* 3105 */       .a("has_polished_blackstone_bricks", a(bup.nu))
/* 3106 */       .a(☃);
/*      */     
/* 3108 */     jh.a(bup.nt, 4)
/* 3109 */       .a(Character.valueOf('S'), bup.np)
/* 3110 */       .a("SS")
/* 3111 */       .a("SS")
/* 3112 */       .a("has_blackstone", a(bup.np))
/* 3113 */       .a(☃);
/*      */     
/* 3115 */     jh.a(bup.nu, 4)
/* 3116 */       .a(Character.valueOf('#'), bup.nt)
/* 3117 */       .a("##")
/* 3118 */       .a("##")
/* 3119 */       .a("has_polished_blackstone", a(bup.nt))
/* 3120 */       .a(☃);
/*      */     
/* 3122 */     jh.a(bup.nw)
/* 3123 */       .a(Character.valueOf('#'), bup.nC)
/* 3124 */       .a("#")
/* 3125 */       .a("#")
/* 3126 */       .a("has_polished_blackstone", a(bup.nt))
/* 3127 */       .a(☃);
/*      */     
/* 3129 */     jh.a(bup.nr, 6)
/* 3130 */       .a(Character.valueOf('#'), bup.np)
/* 3131 */       .a("###")
/* 3132 */       .a("###")
/* 3133 */       .a("has_blackstone", a(bup.np))
/* 3134 */       .a(☃);
/*      */     
/* 3136 */     jh.a(bup.nF, 6)
/* 3137 */       .a(Character.valueOf('#'), bup.nt)
/* 3138 */       .a("###")
/* 3139 */       .a("###")
/* 3140 */       .a("has_polished_blackstone", a(bup.nt))
/* 3141 */       .a(☃);
/*      */     
/* 3143 */     jh.a(bup.nz, 6)
/* 3144 */       .a(Character.valueOf('#'), bup.nu)
/* 3145 */       .a("###")
/* 3146 */       .a("###")
/* 3147 */       .a("has_polished_blackstone_bricks", a(bup.nu))
/* 3148 */       .a(☃);
/*      */     
/* 3150 */     ji.a(bup.nE)
/* 3151 */       .b(bup.nt)
/* 3152 */       .a("has_polished_blackstone", a(bup.nt))
/* 3153 */       .a(☃);
/*      */     
/* 3155 */     jh.a(bup.nD)
/* 3156 */       .a(Character.valueOf('#'), bup.nt)
/* 3157 */       .a("##")
/* 3158 */       .a("has_polished_blackstone", a(bup.nt))
/* 3159 */       .a(☃);
/*      */     
/* 3161 */     jh.a(bup.dI)
/* 3162 */       .a(Character.valueOf('I'), bmd.kh)
/* 3163 */       .a(Character.valueOf('N'), bmd.qw)
/* 3164 */       .a("N")
/* 3165 */       .a("I")
/* 3166 */       .a("N")
/* 3167 */       .a("has_iron_nugget", a(bmd.qw))
/* 3168 */       .a("has_iron_ingot", a(bmd.kh))
/* 3169 */       .a(☃);
/*      */     
/* 3171 */     jl.a(bos.c)
/* 3172 */       .a(☃, "armor_dye");
/*      */     
/* 3174 */     jl.a(bos.k)
/* 3175 */       .a(☃, "banner_duplicate");
/*      */     
/* 3177 */     jl.a(bos.d)
/* 3178 */       .a(☃, "book_cloning");
/*      */     
/* 3180 */     jl.a(bos.g)
/* 3181 */       .a(☃, "firework_rocket");
/*      */     
/* 3183 */     jl.a(bos.h)
/* 3184 */       .a(☃, "firework_star");
/*      */     
/* 3186 */     jl.a(bos.i)
/* 3187 */       .a(☃, "firework_star_fade");
/*      */     
/* 3189 */     jl.a(bos.e)
/* 3190 */       .a(☃, "map_cloning");
/*      */     
/* 3192 */     jl.a(bos.f)
/* 3193 */       .a(☃, "map_extending");
/*      */     
/* 3195 */     jl.a(bos.o)
/* 3196 */       .a(☃, "repair_item");
/*      */     
/* 3198 */     jl.a(bos.l)
/* 3199 */       .a(☃, "shield_decoration");
/*      */     
/* 3201 */     jl.a(bos.m)
/* 3202 */       .a(☃, "shulker_box_coloring");
/*      */     
/* 3204 */     jl.a(bos.j)
/* 3205 */       .a(☃, "tipped_arrow");
/*      */     
/* 3207 */     jl.a(bos.n)
/* 3208 */       .a(☃, "suspicious_stew");
/*      */ 
/*      */     
/* 3211 */     jj.c(bon.a(new brw[] { bmd.oZ }, ), bmd.pa, 0.35F, 200)
/* 3212 */       .a("has_potato", a(bmd.oZ))
/* 3213 */       .a(☃);
/*      */     
/* 3215 */     jj.c(bon.a(new brw[] { bmd.lZ }, ), bmd.lY, 0.3F, 200)
/* 3216 */       .a("has_clay_ball", a(bmd.lZ))
/* 3217 */       .a(☃);
/*      */     
/* 3219 */     jj.c(bon.a(aeg.p), bmd.kf, 0.15F, 200)
/* 3220 */       .a("has_log", a(aeg.p))
/* 3221 */       .a(☃);
/*      */     
/* 3223 */     jj.c(bon.a(new brw[] { bmd.qd }, ), bmd.qe, 0.1F, 200)
/* 3224 */       .a("has_chorus_fruit", a(bmd.qd))
/* 3225 */       .a(☃);
/*      */     
/* 3227 */     jj.c(bon.a(new brw[] { bup.H.h() }, ), bmd.ke, 0.1F, 200)
/* 3228 */       .a("has_coal_ore", a(bup.H))
/* 3229 */       .a(☃, "coal_from_smelting");
/*      */     
/* 3231 */     jj.c(bon.a(new brw[] { bmd.nl }, ), bmd.nm, 0.35F, 200)
/* 3232 */       .a("has_beef", a(bmd.nl))
/* 3233 */       .a(☃);
/*      */     
/* 3235 */     jj.c(bon.a(new brw[] { bmd.nn }, ), bmd.no, 0.35F, 200)
/* 3236 */       .a("has_chicken", a(bmd.nn))
/* 3237 */       .a(☃);
/*      */     
/* 3239 */     jj.c(bon.a(new brw[] { bmd.ml }, ), bmd.mp, 0.35F, 200)
/* 3240 */       .a("has_cod", a(bmd.ml))
/* 3241 */       .a(☃);
/*      */     
/* 3243 */     jj.c(bon.a(new brw[] { bup.kc }, ), bmd.ni, 0.1F, 200)
/* 3244 */       .a("has_kelp", a(bup.kc))
/* 3245 */       .a(☃, "dried_kelp_from_smelting");
/*      */     
/* 3247 */     jj.c(bon.a(new brw[] { bmd.mm }, ), bmd.mq, 0.35F, 200)
/* 3248 */       .a("has_salmon", a(bmd.mm))
/* 3249 */       .a(☃);
/*      */     
/* 3251 */     jj.c(bon.a(new brw[] { bmd.pK }, ), bmd.pL, 0.35F, 200)
/* 3252 */       .a("has_mutton", a(bmd.pK))
/* 3253 */       .a(☃);
/*      */     
/* 3255 */     jj.c(bon.a(new brw[] { bmd.lx }, ), bmd.ly, 0.35F, 200)
/* 3256 */       .a("has_porkchop", a(bmd.lx))
/* 3257 */       .a(☃);
/*      */     
/* 3259 */     jj.c(bon.a(new brw[] { bmd.px }, ), bmd.py, 0.35F, 200)
/* 3260 */       .a("has_rabbit", a(bmd.px))
/* 3261 */       .a(☃);
/*      */     
/* 3263 */     jj.c(bon.a(new brw[] { bup.bT.h() }, ), bmd.kg, 1.0F, 200)
/* 3264 */       .a("has_diamond_ore", a(bup.bT))
/* 3265 */       .a(☃, "diamond_from_smelting");
/*      */     
/* 3267 */     jj.c(bon.a(new brw[] { bup.aq.h() }, ), bmd.mt, 0.2F, 200)
/* 3268 */       .a("has_lapis_ore", a(bup.aq))
/* 3269 */       .a(☃, "lapis_from_smelting");
/*      */     
/* 3271 */     jj.c(bon.a(new brw[] { bup.ej.h() }, ), bmd.oV, 1.0F, 200)
/* 3272 */       .a("has_emerald_ore", a(bup.ej))
/* 3273 */       .a(☃, "emerald_from_smelting");
/*      */     
/* 3275 */     jj.c(bon.a(aeg.A), bup.ap.h(), 0.1F, 200)
/* 3276 */       .a("has_sand", a(aeg.A))
/* 3277 */       .a(☃);
/*      */     
/* 3279 */     jj.c(bon.a(aeg.P), bmd.ki, 1.0F, 200)
/* 3280 */       .a("has_gold_ore", a(aeg.P))
/* 3281 */       .a(☃);
/*      */     
/* 3283 */     jj.c(bon.a(new brw[] { bup.kU.h() }, ), bmd.mz, 0.1F, 200)
/* 3284 */       .a("has_sea_pickle", a(bup.kU))
/* 3285 */       .a(☃, "lime_dye_from_smelting");
/*      */     
/* 3287 */     jj.c(bon.a(new brw[] { bup.cF.h() }, ), bmd.mH, 1.0F, 200)
/* 3288 */       .a("has_cactus", a(bup.cF))
/* 3289 */       .a(☃);
/*      */     
/* 3291 */     jj.c(bon.a(new brw[] { bmd.kx, bmd.kw, bmd.ky, bmd.kz, bmd.kv, bmd.lo, bmd.lp, bmd.lq, bmd.lr, bmd.pE }, ), bmd.nt, 0.1F, 200)
/* 3292 */       .a("has_golden_pickaxe", a(bmd.kx))
/* 3293 */       .a("has_golden_shovel", a(bmd.kw))
/* 3294 */       .a("has_golden_axe", a(bmd.ky))
/* 3295 */       .a("has_golden_hoe", a(bmd.kz))
/* 3296 */       .a("has_golden_sword", a(bmd.kv))
/* 3297 */       .a("has_golden_helmet", a(bmd.lo))
/* 3298 */       .a("has_golden_chestplate", a(bmd.lp))
/* 3299 */       .a("has_golden_leggings", a(bmd.lq))
/* 3300 */       .a("has_golden_boots", a(bmd.lr))
/* 3301 */       .a("has_golden_horse_armor", a(bmd.pE))
/* 3302 */       .a(☃, "gold_nugget_from_smelting");
/*      */     
/* 3304 */     jj.c(bon.a(new brw[] { bmd.kC, bmd.kB, bmd.kD, bmd.kE, bmd.kA, bmd.lg, bmd.lh, bmd.li, bmd.lj, bmd.pD, bmd.lc, bmd.ld, bmd.le, bmd.lf }, ), bmd.qw, 0.1F, 200)
/* 3305 */       .a("has_iron_pickaxe", a(bmd.kC))
/* 3306 */       .a("has_iron_shovel", a(bmd.kB))
/* 3307 */       .a("has_iron_axe", a(bmd.kD))
/* 3308 */       .a("has_iron_hoe", a(bmd.kE))
/* 3309 */       .a("has_iron_sword", a(bmd.kA))
/* 3310 */       .a("has_iron_helmet", a(bmd.lg))
/* 3311 */       .a("has_iron_chestplate", a(bmd.lh))
/* 3312 */       .a("has_iron_leggings", a(bmd.li))
/* 3313 */       .a("has_iron_boots", a(bmd.lj))
/* 3314 */       .a("has_iron_horse_armor", a(bmd.pD))
/* 3315 */       .a("has_chainmail_helmet", a(bmd.lc))
/* 3316 */       .a("has_chainmail_chestplate", a(bmd.ld))
/* 3317 */       .a("has_chainmail_leggings", a(bmd.le))
/* 3318 */       .a("has_chainmail_boots", a(bmd.lf))
/* 3319 */       .a(☃, "iron_nugget_from_smelting");
/*      */     
/* 3321 */     jj.c(bon.a(new brw[] { bup.G.h() }, ), bmd.kh, 0.7F, 200)
/* 3322 */       .a("has_iron_ore", a(bup.G.h()))
/* 3323 */       .a(☃);
/*      */     
/* 3325 */     jj.c(bon.a(new brw[] { bup.cG }, ), bup.gR.h(), 0.35F, 200)
/* 3326 */       .a("has_clay_block", a(bup.cG))
/* 3327 */       .a(☃);
/*      */     
/* 3329 */     jj.c(bon.a(new brw[] { bup.cL }, ), bmd.pr, 0.1F, 200)
/* 3330 */       .a("has_netherrack", a(bup.cL))
/* 3331 */       .a(☃);
/*      */     
/* 3333 */     jj.c(bon.a(new brw[] { bup.fx }, ), bmd.ps, 0.2F, 200)
/* 3334 */       .a("has_nether_quartz_ore", a(bup.fx))
/* 3335 */       .a(☃);
/*      */     
/* 3337 */     jj.c(bon.a(new brw[] { bup.cy }, ), bmd.lP, 0.7F, 200)
/* 3338 */       .a("has_redstone_ore", a(bup.cy))
/* 3339 */       .a(☃, "redstone_from_smelting");
/*      */     
/* 3341 */     jj.c(bon.a(new brw[] { bup.ao }, ), bup.an.h(), 0.15F, 200)
/* 3342 */       .a("has_wet_sponge", a(bup.ao))
/* 3343 */       .a(☃);
/*      */     
/* 3345 */     jj.c(bon.a(new brw[] { bup.m }, ), bup.b.h(), 0.1F, 200)
/* 3346 */       .a("has_cobblestone", a(bup.m))
/* 3347 */       .a(☃);
/*      */     
/* 3349 */     jj.c(bon.a(new brw[] { bup.b }, ), bup.id.h(), 0.1F, 200)
/* 3350 */       .a("has_stone", a(bup.b))
/* 3351 */       .a(☃);
/*      */     
/* 3353 */     jj.c(bon.a(new brw[] { bup.at }, ), bup.ie.h(), 0.1F, 200)
/* 3354 */       .a("has_sandstone", a(bup.at))
/* 3355 */       .a(☃);
/*      */     
/* 3357 */     jj.c(bon.a(new brw[] { bup.hG }, ), bup.ig.h(), 0.1F, 200)
/* 3358 */       .a("has_red_sandstone", a(bup.hG))
/* 3359 */       .a(☃);
/*      */     
/* 3361 */     jj.c(bon.a(new brw[] { bup.fz }, ), bup.if.h(), 0.1F, 200)
/* 3362 */       .a("has_quartz_block", a(bup.fz))
/* 3363 */       .a(☃);
/*      */     
/* 3365 */     jj.c(bon.a(new brw[] { bup.du }, ), bup.dw.h(), 0.1F, 200)
/* 3366 */       .a("has_stone_bricks", a(bup.du))
/* 3367 */       .a(☃);
/*      */     
/* 3369 */     jj.c(bon.a(new brw[] { bup.fU }, ), bup.jv.h(), 0.1F, 200)
/* 3370 */       .a("has_black_terracotta", a(bup.fU))
/* 3371 */       .a(☃);
/*      */     
/* 3373 */     jj.c(bon.a(new brw[] { bup.fQ }, ), bup.jr.h(), 0.1F, 200)
/* 3374 */       .a("has_blue_terracotta", a(bup.fQ))
/* 3375 */       .a(☃);
/*      */     
/* 3377 */     jj.c(bon.a(new brw[] { bup.fR }, ), bup.js.h(), 0.1F, 200)
/* 3378 */       .a("has_brown_terracotta", a(bup.fR))
/* 3379 */       .a(☃);
/*      */     
/* 3381 */     jj.c(bon.a(new brw[] { bup.fO }, ), bup.jp.h(), 0.1F, 200)
/* 3382 */       .a("has_cyan_terracotta", a(bup.fO))
/* 3383 */       .a(☃);
/*      */     
/* 3385 */     jj.c(bon.a(new brw[] { bup.fM }, ), bup.jn.h(), 0.1F, 200)
/* 3386 */       .a("has_gray_terracotta", a(bup.fM))
/* 3387 */       .a(☃);
/*      */     
/* 3389 */     jj.c(bon.a(new brw[] { bup.fS }, ), bup.jt.h(), 0.1F, 200)
/* 3390 */       .a("has_green_terracotta", a(bup.fS))
/* 3391 */       .a(☃);
/*      */     
/* 3393 */     jj.c(bon.a(new brw[] { bup.fI }, ), bup.jj.h(), 0.1F, 200)
/* 3394 */       .a("has_light_blue_terracotta", a(bup.fI))
/* 3395 */       .a(☃);
/*      */     
/* 3397 */     jj.c(bon.a(new brw[] { bup.fN }, ), bup.jo.h(), 0.1F, 200)
/* 3398 */       .a("has_light_gray_terracotta", a(bup.fN))
/* 3399 */       .a(☃);
/*      */     
/* 3401 */     jj.c(bon.a(new brw[] { bup.fK }, ), bup.jl.h(), 0.1F, 200)
/* 3402 */       .a("has_lime_terracotta", a(bup.fK))
/* 3403 */       .a(☃);
/*      */     
/* 3405 */     jj.c(bon.a(new brw[] { bup.fH }, ), bup.ji.h(), 0.1F, 200)
/* 3406 */       .a("has_magenta_terracotta", a(bup.fH))
/* 3407 */       .a(☃);
/*      */     
/* 3409 */     jj.c(bon.a(new brw[] { bup.fG }, ), bup.jh.h(), 0.1F, 200)
/* 3410 */       .a("has_orange_terracotta", a(bup.fG))
/* 3411 */       .a(☃);
/*      */     
/* 3413 */     jj.c(bon.a(new brw[] { bup.fL }, ), bup.jm.h(), 0.1F, 200)
/* 3414 */       .a("has_pink_terracotta", a(bup.fL))
/* 3415 */       .a(☃);
/*      */     
/* 3417 */     jj.c(bon.a(new brw[] { bup.fP }, ), bup.jq.h(), 0.1F, 200)
/* 3418 */       .a("has_purple_terracotta", a(bup.fP))
/* 3419 */       .a(☃);
/*      */     
/* 3421 */     jj.c(bon.a(new brw[] { bup.fT }, ), bup.ju.h(), 0.1F, 200)
/* 3422 */       .a("has_red_terracotta", a(bup.fT))
/* 3423 */       .a(☃);
/*      */     
/* 3425 */     jj.c(bon.a(new brw[] { bup.fF }, ), bup.jg.h(), 0.1F, 200)
/* 3426 */       .a("has_white_terracotta", a(bup.fF))
/* 3427 */       .a(☃);
/*      */     
/* 3429 */     jj.c(bon.a(new brw[] { bup.fJ }, ), bup.jk.h(), 0.1F, 200)
/* 3430 */       .a("has_yellow_terracotta", a(bup.fJ))
/* 3431 */       .a(☃);
/*      */     
/* 3433 */     jj.c(bon.a(new brw[] { bup.nh }, ), bmd.kk, 2.0F, 200)
/* 3434 */       .a("has_ancient_debris", a(bup.nh))
/* 3435 */       .a(☃);
/*      */     
/* 3437 */     jj.c(bon.a(new brw[] { bup.nu }, ), bup.nv.h(), 0.1F, 200)
/* 3438 */       .a("has_blackstone_bricks", a(bup.nu))
/* 3439 */       .a(☃);
/*      */     
/* 3441 */     jj.c(bon.a(new brw[] { bup.dV }, ), bup.nH.h(), 0.1F, 200)
/* 3442 */       .a("has_nether_bricks", a(bup.dV))
/* 3443 */       .a(☃);
/*      */ 
/*      */     
/* 3446 */     jj.b(bon.a(new brw[] { bup.G.h() }, ), bmd.kh, 0.7F, 100)
/* 3447 */       .a("has_iron_ore", a(bup.G.h()))
/* 3448 */       .a(☃, "iron_ingot_from_blasting");
/*      */     
/* 3450 */     jj.b(bon.a(aeg.P), bmd.ki, 1.0F, 100)
/* 3451 */       .a("has_gold_ore", a(aeg.P))
/* 3452 */       .a(☃, "gold_ingot_from_blasting");
/*      */     
/* 3454 */     jj.b(bon.a(new brw[] { bup.bT.h() }, ), bmd.kg, 1.0F, 100)
/* 3455 */       .a("has_diamond_ore", a(bup.bT))
/* 3456 */       .a(☃, "diamond_from_blasting");
/*      */     
/* 3458 */     jj.b(bon.a(new brw[] { bup.aq.h() }, ), bmd.mt, 0.2F, 100)
/* 3459 */       .a("has_lapis_ore", a(bup.aq))
/* 3460 */       .a(☃, "lapis_from_blasting");
/*      */     
/* 3462 */     jj.b(bon.a(new brw[] { bup.cy }, ), bmd.lP, 0.7F, 100)
/* 3463 */       .a("has_redstone_ore", a(bup.cy))
/* 3464 */       .a(☃, "redstone_from_blasting");
/*      */     
/* 3466 */     jj.b(bon.a(new brw[] { bup.H.h() }, ), bmd.ke, 0.1F, 100)
/* 3467 */       .a("has_coal_ore", a(bup.H))
/* 3468 */       .a(☃, "coal_from_blasting");
/*      */     
/* 3470 */     jj.b(bon.a(new brw[] { bup.ej.h() }, ), bmd.oV, 1.0F, 100)
/* 3471 */       .a("has_emerald_ore", a(bup.ej))
/* 3472 */       .a(☃, "emerald_from_blasting");
/*      */     
/* 3474 */     jj.b(bon.a(new brw[] { bup.fx }, ), bmd.ps, 0.2F, 100)
/* 3475 */       .a("has_nether_quartz_ore", a(bup.fx))
/* 3476 */       .a(☃, "quartz_from_blasting");
/*      */     
/* 3478 */     jj.b(bon.a(new brw[] { bmd.kx, bmd.kw, bmd.ky, bmd.kz, bmd.kv, bmd.lo, bmd.lp, bmd.lq, bmd.lr, bmd.pE }, ), bmd.nt, 0.1F, 100)
/* 3479 */       .a("has_golden_pickaxe", a(bmd.kx))
/* 3480 */       .a("has_golden_shovel", a(bmd.kw))
/* 3481 */       .a("has_golden_axe", a(bmd.ky))
/* 3482 */       .a("has_golden_hoe", a(bmd.kz))
/* 3483 */       .a("has_golden_sword", a(bmd.kv))
/* 3484 */       .a("has_golden_helmet", a(bmd.lo))
/* 3485 */       .a("has_golden_chestplate", a(bmd.lp))
/* 3486 */       .a("has_golden_leggings", a(bmd.lq))
/* 3487 */       .a("has_golden_boots", a(bmd.lr))
/* 3488 */       .a("has_golden_horse_armor", a(bmd.pE))
/* 3489 */       .a(☃, "gold_nugget_from_blasting");
/*      */     
/* 3491 */     jj.b(bon.a(new brw[] { bmd.kC, bmd.kB, bmd.kD, bmd.kE, bmd.kA, bmd.lg, bmd.lh, bmd.li, bmd.lj, bmd.pD, bmd.lc, bmd.ld, bmd.le, bmd.lf }, ), bmd.qw, 0.1F, 100)
/* 3492 */       .a("has_iron_pickaxe", a(bmd.kC))
/* 3493 */       .a("has_iron_shovel", a(bmd.kB))
/* 3494 */       .a("has_iron_axe", a(bmd.kD))
/* 3495 */       .a("has_iron_hoe", a(bmd.kE))
/* 3496 */       .a("has_iron_sword", a(bmd.kA))
/* 3497 */       .a("has_iron_helmet", a(bmd.lg))
/* 3498 */       .a("has_iron_chestplate", a(bmd.lh))
/* 3499 */       .a("has_iron_leggings", a(bmd.li))
/* 3500 */       .a("has_iron_boots", a(bmd.lj))
/* 3501 */       .a("has_iron_horse_armor", a(bmd.pD))
/* 3502 */       .a("has_chainmail_helmet", a(bmd.lc))
/* 3503 */       .a("has_chainmail_chestplate", a(bmd.ld))
/* 3504 */       .a("has_chainmail_leggings", a(bmd.le))
/* 3505 */       .a("has_chainmail_boots", a(bmd.lf))
/* 3506 */       .a(☃, "iron_nugget_from_blasting");
/*      */     
/* 3508 */     jj.b(bon.a(new brw[] { bup.nh }, ), bmd.kk, 2.0F, 100)
/* 3509 */       .a("has_ancient_debris", a(bup.nh))
/* 3510 */       .a(☃, "netherite_scrap_from_blasting");
/*      */     
/* 3512 */     a(☃, "smoking", bos.r, 100);
/* 3513 */     a(☃, "campfire_cooking", bos.s, 600);
/*      */ 
/*      */     
/* 3516 */     jk.a(bon.a(new brw[] { bup.b }, ), bup.hQ, 2)
/* 3517 */       .a("has_stone", a(bup.b))
/* 3518 */       .a(☃, "stone_slab_from_stone_stonecutting");
/*      */     
/* 3520 */     jk.a(bon.a(new brw[] { bup.b }, ), bup.lj)
/* 3521 */       .a("has_stone", a(bup.b))
/* 3522 */       .a(☃, "stone_stairs_from_stone_stonecutting");
/*      */     
/* 3524 */     jk.a(bon.a(new brw[] { bup.b }, ), bup.du)
/* 3525 */       .a("has_stone", a(bup.b))
/* 3526 */       .a(☃, "stone_bricks_from_stone_stonecutting");
/*      */     
/* 3528 */     jk.a(bon.a(new brw[] { bup.b }, ), bup.hX, 2)
/* 3529 */       .a("has_stone", a(bup.b))
/* 3530 */       .a(☃, "stone_brick_slab_from_stone_stonecutting");
/*      */     
/* 3532 */     jk.a(bon.a(new brw[] { bup.b }, ), bup.dS)
/* 3533 */       .a("has_stone", a(bup.b))
/* 3534 */       .a(☃, "stone_brick_stairs_from_stone_stonecutting");
/*      */     
/* 3536 */     jk.a(bon.a(new brw[] { bup.b }, ), bup.dx)
/* 3537 */       .a("has_stone", a(bup.b))
/* 3538 */       .a(☃, "chiseled_stone_bricks_stone_from_stonecutting");
/*      */     
/* 3540 */     jk.a(bon.a(new brw[] { bup.b }, ), bup.lJ)
/* 3541 */       .a("has_stone", a(bup.b))
/* 3542 */       .a(☃, "stone_brick_walls_from_stone_stonecutting");
/*      */     
/* 3544 */     jk.a(bon.a(new brw[] { bup.at }, ), bup.av)
/* 3545 */       .a("has_sandstone", a(bup.at))
/* 3546 */       .a(☃, "cut_sandstone_from_sandstone_stonecutting");
/*      */     
/* 3548 */     jk.a(bon.a(new brw[] { bup.at }, ), bup.hS, 2)
/* 3549 */       .a("has_sandstone", a(bup.at))
/* 3550 */       .a(☃, "sandstone_slab_from_sandstone_stonecutting");
/*      */     
/* 3552 */     jk.a(bon.a(new brw[] { bup.at }, ), bup.hT, 2)
/* 3553 */       .a("has_sandstone", a(bup.at))
/* 3554 */       .a(☃, "cut_sandstone_slab_from_sandstone_stonecutting");
/*      */     
/* 3556 */     jk.a(bon.a(new brw[] { bup.av }, ), bup.hT, 2)
/* 3557 */       .a("has_cut_sandstone", a(bup.at))
/* 3558 */       .a(☃, "cut_sandstone_slab_from_cut_sandstone_stonecutting");
/*      */     
/* 3560 */     jk.a(bon.a(new brw[] { bup.at }, ), bup.ei)
/* 3561 */       .a("has_sandstone", a(bup.at))
/* 3562 */       .a(☃, "sandstone_stairs_from_sandstone_stonecutting");
/*      */     
/* 3564 */     jk.a(bon.a(new brw[] { bup.at }, ), bup.lN)
/* 3565 */       .a("has_sandstone", a(bup.at))
/* 3566 */       .a(☃, "sandstone_wall_from_sandstone_stonecutting");
/*      */     
/* 3568 */     jk.a(bon.a(new brw[] { bup.at }, ), bup.au)
/* 3569 */       .a("has_sandstone", a(bup.at))
/* 3570 */       .a(☃, "chiseled_sandstone_from_sandstone_stonecutting");
/*      */     
/* 3572 */     jk.a(bon.a(new brw[] { bup.hG }, ), bup.hI)
/* 3573 */       .a("has_red_sandstone", a(bup.hG))
/* 3574 */       .a(☃, "cut_red_sandstone_from_red_sandstone_stonecutting");
/*      */     
/* 3576 */     jk.a(bon.a(new brw[] { bup.hG }, ), bup.ia, 2)
/* 3577 */       .a("has_red_sandstone", a(bup.hG))
/* 3578 */       .a(☃, "red_sandstone_slab_from_red_sandstone_stonecutting");
/*      */     
/* 3580 */     jk.a(bon.a(new brw[] { bup.hG }, ), bup.ib, 2)
/* 3581 */       .a("has_red_sandstone", a(bup.hG))
/* 3582 */       .a(☃, "cut_red_sandstone_slab_from_red_sandstone_stonecutting");
/*      */     
/* 3584 */     jk.a(bon.a(new brw[] { bup.hI }, ), bup.ib, 2)
/* 3585 */       .a("has_cut_red_sandstone", a(bup.hG))
/* 3586 */       .a(☃, "cut_red_sandstone_slab_from_cut_red_sandstone_stonecutting");
/*      */     
/* 3588 */     jk.a(bon.a(new brw[] { bup.hG }, ), bup.hJ)
/* 3589 */       .a("has_red_sandstone", a(bup.hG))
/* 3590 */       .a(☃, "red_sandstone_stairs_from_red_sandstone_stonecutting");
/*      */     
/* 3592 */     jk.a(bon.a(new brw[] { bup.hG }, ), bup.lG)
/* 3593 */       .a("has_red_sandstone", a(bup.hG))
/* 3594 */       .a(☃, "red_sandstone_wall_from_red_sandstone_stonecutting");
/*      */     
/* 3596 */     jk.a(bon.a(new brw[] { bup.hG }, ), bup.hH)
/* 3597 */       .a("has_red_sandstone", a(bup.hG))
/* 3598 */       .a(☃, "chiseled_red_sandstone_from_red_sandstone_stonecutting");
/*      */     
/* 3600 */     jk.a(bon.a(new brw[] { bup.fz }, ), bup.hZ, 2)
/* 3601 */       .a("has_quartz_block", a(bup.fz))
/* 3602 */       .a(☃, "quartz_slab_from_stonecutting");
/*      */     
/* 3604 */     jk.a(bon.a(new brw[] { bup.fz }, ), bup.fC)
/* 3605 */       .a("has_quartz_block", a(bup.fz))
/* 3606 */       .a(☃, "quartz_stairs_from_quartz_block_stonecutting");
/*      */     
/* 3608 */     jk.a(bon.a(new brw[] { bup.fz }, ), bup.fB)
/* 3609 */       .a("has_quartz_block", a(bup.fz))
/* 3610 */       .a(☃, "quartz_pillar_from_quartz_block_stonecutting");
/*      */     
/* 3612 */     jk.a(bon.a(new brw[] { bup.fz }, ), bup.fA)
/* 3613 */       .a("has_quartz_block", a(bup.fz))
/* 3614 */       .a(☃, "chiseled_quartz_block_from_quartz_block_stonecutting");
/*      */     
/* 3616 */     jk.a(bon.a(new brw[] { bup.fz }, ), bup.nI)
/* 3617 */       .a("has_quartz_block", a(bup.fz))
/* 3618 */       .a(☃, "quartz_bricks_from_quartz_block_stonecutting");
/*      */     
/* 3620 */     jk.a(bon.a(new brw[] { bup.m }, ), bup.ci)
/* 3621 */       .a("has_cobblestone", a(bup.m))
/* 3622 */       .a(☃, "cobblestone_stairs_from_cobblestone_stonecutting");
/*      */     
/* 3624 */     jk.a(bon.a(new brw[] { bup.m }, ), bup.hV, 2)
/* 3625 */       .a("has_cobblestone", a(bup.m))
/* 3626 */       .a(☃, "cobblestone_slab_from_cobblestone_stonecutting");
/*      */     
/* 3628 */     jk.a(bon.a(new brw[] { bup.m }, ), bup.et)
/* 3629 */       .a("has_cobblestone", a(bup.m))
/* 3630 */       .a(☃, "cobblestone_wall_from_cobblestone_stonecutting");
/*      */     
/* 3632 */     jk.a(bon.a(new brw[] { bup.du }, ), bup.hX, 2)
/* 3633 */       .a("has_stone_bricks", a(bup.du))
/* 3634 */       .a(☃, "stone_brick_slab_from_stone_bricks_stonecutting");
/*      */     
/* 3636 */     jk.a(bon.a(new brw[] { bup.du }, ), bup.dS)
/* 3637 */       .a("has_stone_bricks", a(bup.du))
/* 3638 */       .a(☃, "stone_brick_stairs_from_stone_bricks_stonecutting");
/*      */     
/* 3640 */     jk.a(bon.a(new brw[] { bup.du }, ), bup.lJ)
/* 3641 */       .a("has_stone_bricks", a(bup.du))
/* 3642 */       .a(☃, "stone_brick_wall_from_stone_bricks_stonecutting");
/*      */     
/* 3644 */     jk.a(bon.a(new brw[] { bup.du }, ), bup.dx)
/* 3645 */       .a("has_stone_bricks", a(bup.du))
/* 3646 */       .a(☃, "chiseled_stone_bricks_from_stone_bricks_stonecutting");
/*      */     
/* 3648 */     jk.a(bon.a(new brw[] { bup.bG }, ), bup.hW, 2)
/* 3649 */       .a("has_bricks", a(bup.bG))
/* 3650 */       .a(☃, "brick_slab_from_bricks_stonecutting");
/*      */     
/* 3652 */     jk.a(bon.a(new brw[] { bup.bG }, ), bup.dR)
/* 3653 */       .a("has_bricks", a(bup.bG))
/* 3654 */       .a(☃, "brick_stairs_from_bricks_stonecutting");
/*      */     
/* 3656 */     jk.a(bon.a(new brw[] { bup.bG }, ), bup.lE)
/* 3657 */       .a("has_bricks", a(bup.bG))
/* 3658 */       .a(☃, "brick_wall_from_bricks_stonecutting");
/*      */     
/* 3660 */     jk.a(bon.a(new brw[] { bup.dV }, ), bup.hY, 2)
/* 3661 */       .a("has_nether_bricks", a(bup.dV))
/* 3662 */       .a(☃, "nether_brick_slab_from_nether_bricks_stonecutting");
/*      */     
/* 3664 */     jk.a(bon.a(new brw[] { bup.dV }, ), bup.dX)
/* 3665 */       .a("has_nether_bricks", a(bup.dV))
/* 3666 */       .a(☃, "nether_brick_stairs_from_nether_bricks_stonecutting");
/*      */     
/* 3668 */     jk.a(bon.a(new brw[] { bup.dV }, ), bup.lK)
/* 3669 */       .a("has_nether_bricks", a(bup.dV))
/* 3670 */       .a(☃, "nether_brick_wall_from_nether_bricks_stonecutting");
/*      */     
/* 3672 */     jk.a(bon.a(new brw[] { bup.dV }, ), bup.nG)
/* 3673 */       .a("has_nether_bricks", a(bup.dV))
/* 3674 */       .a(☃, "chiseled_nether_bricks_from_nether_bricks_stonecutting");
/*      */     
/* 3676 */     jk.a(bon.a(new brw[] { bup.iL }, ), bup.lB, 2)
/* 3677 */       .a("has_nether_bricks", a(bup.iL))
/* 3678 */       .a(☃, "red_nether_brick_slab_from_red_nether_bricks_stonecutting");
/*      */     
/* 3680 */     jk.a(bon.a(new brw[] { bup.iL }, ), bup.lo)
/* 3681 */       .a("has_nether_bricks", a(bup.iL))
/* 3682 */       .a(☃, "red_nether_brick_stairs_from_red_nether_bricks_stonecutting");
/*      */     
/* 3684 */     jk.a(bon.a(new brw[] { bup.iL }, ), bup.lM)
/* 3685 */       .a("has_nether_bricks", a(bup.iL))
/* 3686 */       .a(☃, "red_nether_brick_wall_from_red_nether_bricks_stonecutting");
/*      */     
/* 3688 */     jk.a(bon.a(new brw[] { bup.iz }, ), bup.ic, 2)
/* 3689 */       .a("has_purpur_block", a(bup.iz))
/* 3690 */       .a(☃, "purpur_slab_from_purpur_block_stonecutting");
/*      */     
/* 3692 */     jk.a(bon.a(new brw[] { bup.iz }, ), bup.iB)
/* 3693 */       .a("has_purpur_block", a(bup.iz))
/* 3694 */       .a(☃, "purpur_stairs_from_purpur_block_stonecutting");
/*      */     
/* 3696 */     jk.a(bon.a(new brw[] { bup.iz }, ), bup.iA)
/* 3697 */       .a("has_purpur_block", a(bup.iz))
/* 3698 */       .a(☃, "purpur_pillar_from_purpur_block_stonecutting");
/*      */     
/* 3700 */     jk.a(bon.a(new brw[] { bup.gq }, ), bup.gw, 2)
/* 3701 */       .a("has_prismarine", a(bup.gq))
/* 3702 */       .a(☃, "prismarine_slab_from_prismarine_stonecutting");
/*      */     
/* 3704 */     jk.a(bon.a(new brw[] { bup.gq }, ), bup.gt)
/* 3705 */       .a("has_prismarine", a(bup.gq))
/* 3706 */       .a(☃, "prismarine_stairs_from_prismarine_stonecutting");
/*      */     
/* 3708 */     jk.a(bon.a(new brw[] { bup.gq }, ), bup.lF)
/* 3709 */       .a("has_prismarine", a(bup.gq))
/* 3710 */       .a(☃, "prismarine_wall_from_prismarine_stonecutting");
/*      */     
/* 3712 */     jk.a(bon.a(new brw[] { bup.gr }, ), bup.gx, 2)
/* 3713 */       .a("has_prismarine_brick", a(bup.gr))
/* 3714 */       .a(☃, "prismarine_brick_slab_from_prismarine_stonecutting");
/*      */     
/* 3716 */     jk.a(bon.a(new brw[] { bup.gr }, ), bup.gu)
/* 3717 */       .a("has_prismarine_brick", a(bup.gr))
/* 3718 */       .a(☃, "prismarine_brick_stairs_from_prismarine_stonecutting");
/*      */     
/* 3720 */     jk.a(bon.a(new brw[] { bup.gs }, ), bup.gy, 2)
/* 3721 */       .a("has_dark_prismarine", a(bup.gs))
/* 3722 */       .a(☃, "dark_prismarine_slab_from_dark_prismarine_stonecutting");
/*      */     
/* 3724 */     jk.a(bon.a(new brw[] { bup.gs }, ), bup.gv)
/* 3725 */       .a("has_dark_prismarine", a(bup.gs))
/* 3726 */       .a(☃, "dark_prismarine_stairs_from_dark_prismarine_stonecutting");
/*      */     
/* 3728 */     jk.a(bon.a(new brw[] { bup.g }, ), bup.lA, 2)
/* 3729 */       .a("has_andesite", a(bup.g))
/* 3730 */       .a(☃, "andesite_slab_from_andesite_stonecutting");
/*      */     
/* 3732 */     jk.a(bon.a(new brw[] { bup.g }, ), bup.ln)
/* 3733 */       .a("has_andesite", a(bup.g))
/* 3734 */       .a(☃, "andesite_stairs_from_andesite_stonecutting");
/*      */     
/* 3736 */     jk.a(bon.a(new brw[] { bup.g }, ), bup.lL)
/* 3737 */       .a("has_andesite", a(bup.g))
/* 3738 */       .a(☃, "andesite_wall_from_andesite_stonecutting");
/*      */     
/* 3740 */     jk.a(bon.a(new brw[] { bup.g }, ), bup.h)
/* 3741 */       .a("has_andesite", a(bup.g))
/* 3742 */       .a(☃, "polished_andesite_from_andesite_stonecutting");
/*      */     
/* 3744 */     jk.a(bon.a(new brw[] { bup.g }, ), bup.lC, 2)
/* 3745 */       .a("has_andesite", a(bup.g))
/* 3746 */       .a(☃, "polished_andesite_slab_from_andesite_stonecutting");
/*      */     
/* 3748 */     jk.a(bon.a(new brw[] { bup.g }, ), bup.lp)
/* 3749 */       .a("has_andesite", a(bup.g))
/* 3750 */       .a(☃, "polished_andesite_stairs_from_andesite_stonecutting");
/*      */     
/* 3752 */     jk.a(bon.a(new brw[] { bup.h }, ), bup.lC, 2)
/* 3753 */       .a("has_polished_andesite", a(bup.h))
/* 3754 */       .a(☃, "polished_andesite_slab_from_polished_andesite_stonecutting");
/*      */     
/* 3756 */     jk.a(bon.a(new brw[] { bup.h }, ), bup.lp)
/* 3757 */       .a("has_polished_andesite", a(bup.h))
/* 3758 */       .a(☃, "polished_andesite_stairs_from_polished_andesite_stonecutting");
/*      */     
/* 3760 */     jk.a(bon.a(new brw[] { bup.cO }, ), bup.cP)
/* 3761 */       .a("has_basalt", a(bup.cO))
/* 3762 */       .a(☃, "polished_basalt_from_basalt_stonecutting");
/*      */     
/* 3764 */     jk.a(bon.a(new brw[] { bup.c }, ), bup.lz, 2)
/* 3765 */       .a("has_granite", a(bup.c))
/* 3766 */       .a(☃, "granite_slab_from_granite_stonecutting");
/*      */     
/* 3768 */     jk.a(bon.a(new brw[] { bup.c }, ), bup.lm)
/* 3769 */       .a("has_granite", a(bup.c))
/* 3770 */       .a(☃, "granite_stairs_from_granite_stonecutting");
/*      */     
/* 3772 */     jk.a(bon.a(new brw[] { bup.c }, ), bup.lI)
/* 3773 */       .a("has_granite", a(bup.c))
/* 3774 */       .a(☃, "granite_wall_from_granite_stonecutting");
/*      */     
/* 3776 */     jk.a(bon.a(new brw[] { bup.c }, ), bup.d)
/* 3777 */       .a("has_granite", a(bup.c))
/* 3778 */       .a(☃, "polished_granite_from_granite_stonecutting");
/*      */     
/* 3780 */     jk.a(bon.a(new brw[] { bup.c }, ), bup.lr, 2)
/* 3781 */       .a("has_granite", a(bup.c))
/* 3782 */       .a(☃, "polished_granite_slab_from_granite_stonecutting");
/*      */     
/* 3784 */     jk.a(bon.a(new brw[] { bup.c }, ), bup.ld)
/* 3785 */       .a("has_granite", a(bup.c))
/* 3786 */       .a(☃, "polished_granite_stairs_from_granite_stonecutting");
/*      */     
/* 3788 */     jk.a(bon.a(new brw[] { bup.d }, ), bup.lr, 2)
/* 3789 */       .a("has_polished_granite", a(bup.d))
/* 3790 */       .a(☃, "polished_granite_slab_from_polished_granite_stonecutting");
/*      */     
/* 3792 */     jk.a(bon.a(new brw[] { bup.d }, ), bup.ld)
/* 3793 */       .a("has_polished_granite", a(bup.d))
/* 3794 */       .a(☃, "polished_granite_stairs_from_polished_granite_stonecutting");
/*      */     
/* 3796 */     jk.a(bon.a(new brw[] { bup.e }, ), bup.lD, 2)
/* 3797 */       .a("has_diorite", a(bup.e))
/* 3798 */       .a(☃, "diorite_slab_from_diorite_stonecutting");
/*      */     
/* 3800 */     jk.a(bon.a(new brw[] { bup.e }, ), bup.lq)
/* 3801 */       .a("has_diorite", a(bup.e))
/* 3802 */       .a(☃, "diorite_stairs_from_diorite_stonecutting");
/*      */     
/* 3804 */     jk.a(bon.a(new brw[] { bup.e }, ), bup.lP)
/* 3805 */       .a("has_diorite", a(bup.e))
/* 3806 */       .a(☃, "diorite_wall_from_diorite_stonecutting");
/*      */     
/* 3808 */     jk.a(bon.a(new brw[] { bup.e }, ), bup.f)
/* 3809 */       .a("has_diorite", a(bup.e))
/* 3810 */       .a(☃, "polished_diorite_from_diorite_stonecutting");
/*      */     
/* 3812 */     jk.a(bon.a(new brw[] { bup.e }, ), bup.lu, 2)
/* 3813 */       .a("has_diorite", a(bup.f))
/* 3814 */       .a(☃, "polished_diorite_slab_from_diorite_stonecutting");
/*      */     
/* 3816 */     jk.a(bon.a(new brw[] { bup.e }, ), bup.lg)
/* 3817 */       .a("has_diorite", a(bup.f))
/* 3818 */       .a(☃, "polished_diorite_stairs_from_diorite_stonecutting");
/*      */     
/* 3820 */     jk.a(bon.a(new brw[] { bup.f }, ), bup.lu, 2)
/* 3821 */       .a("has_polished_diorite", a(bup.f))
/* 3822 */       .a(☃, "polished_diorite_slab_from_polished_diorite_stonecutting");
/*      */     
/* 3824 */     jk.a(bon.a(new brw[] { bup.f }, ), bup.lg)
/* 3825 */       .a("has_polished_diorite", a(bup.f))
/* 3826 */       .a(☃, "polished_diorite_stairs_from_polished_diorite_stonecutting");
/*      */     
/* 3828 */     jk.a(bon.a(new brw[] { bup.dv }, ), bup.lt, 2)
/* 3829 */       .a("has_mossy_stone_bricks", a(bup.dv))
/* 3830 */       .a(☃, "mossy_stone_brick_slab_from_mossy_stone_brick_stonecutting");
/*      */     
/* 3832 */     jk.a(bon.a(new brw[] { bup.dv }, ), bup.lf)
/* 3833 */       .a("has_mossy_stone_bricks", a(bup.dv))
/* 3834 */       .a(☃, "mossy_stone_brick_stairs_from_mossy_stone_brick_stonecutting");
/*      */     
/* 3836 */     jk.a(bon.a(new brw[] { bup.dv }, ), bup.lH)
/* 3837 */       .a("has_mossy_stone_bricks", a(bup.dv))
/* 3838 */       .a(☃, "mossy_stone_brick_wall_from_mossy_stone_brick_stonecutting");
/*      */     
/* 3840 */     jk.a(bon.a(new brw[] { bup.bJ }, ), bup.lv, 2)
/* 3841 */       .a("has_mossy_cobblestone", a(bup.bJ))
/* 3842 */       .a(☃, "mossy_cobblestone_slab_from_mossy_cobblestone_stonecutting");
/*      */     
/* 3844 */     jk.a(bon.a(new brw[] { bup.bJ }, ), bup.lh)
/* 3845 */       .a("has_mossy_cobblestone", a(bup.bJ))
/* 3846 */       .a(☃, "mossy_cobblestone_stairs_from_mossy_cobblestone_stonecutting");
/*      */     
/* 3848 */     jk.a(bon.a(new brw[] { bup.bJ }, ), bup.eu)
/* 3849 */       .a("has_mossy_cobblestone", a(bup.bJ))
/* 3850 */       .a(☃, "mossy_cobblestone_wall_from_mossy_cobblestone_stonecutting");
/*      */     
/* 3852 */     jk.a(bon.a(new brw[] { bup.ie }, ), bup.lx, 2)
/* 3853 */       .a("has_smooth_sandstone", a(bup.ie))
/* 3854 */       .a(☃, "smooth_sandstone_slab_from_smooth_sandstone_stonecutting");
/*      */     
/* 3856 */     jk.a(bon.a(new brw[] { bup.ie }, ), bup.lk)
/* 3857 */       .a("has_mossy_cobblestone", a(bup.ie))
/* 3858 */       .a(☃, "smooth_sandstone_stairs_from_smooth_sandstone_stonecutting");
/*      */     
/* 3860 */     jk.a(bon.a(new brw[] { bup.ig }, ), bup.ls, 2)
/* 3861 */       .a("has_smooth_red_sandstone", a(bup.ig))
/* 3862 */       .a(☃, "smooth_red_sandstone_slab_from_smooth_red_sandstone_stonecutting");
/*      */     
/* 3864 */     jk.a(bon.a(new brw[] { bup.ig }, ), bup.le)
/* 3865 */       .a("has_smooth_red_sandstone", a(bup.ig))
/* 3866 */       .a(☃, "smooth_red_sandstone_stairs_from_smooth_red_sandstone_stonecutting");
/*      */     
/* 3868 */     jk.a(bon.a(new brw[] { bup.if }, ), bup.ly, 2)
/* 3869 */       .a("has_smooth_quartz", a(bup.if))
/* 3870 */       .a(☃, "smooth_quartz_slab_from_smooth_quartz_stonecutting");
/*      */     
/* 3872 */     jk.a(bon.a(new brw[] { bup.if }, ), bup.ll)
/* 3873 */       .a("has_smooth_quartz", a(bup.if))
/* 3874 */       .a(☃, "smooth_quartz_stairs_from_smooth_quartz_stonecutting");
/*      */     
/* 3876 */     jk.a(bon.a(new brw[] { bup.iC }, ), bup.lw, 2)
/* 3877 */       .a("has_end_stone_brick", a(bup.iC))
/* 3878 */       .a(☃, "end_stone_brick_slab_from_end_stone_brick_stonecutting");
/*      */     
/* 3880 */     jk.a(bon.a(new brw[] { bup.iC }, ), bup.li)
/* 3881 */       .a("has_end_stone_brick", a(bup.iC))
/* 3882 */       .a(☃, "end_stone_brick_stairs_from_end_stone_brick_stonecutting");
/*      */     
/* 3884 */     jk.a(bon.a(new brw[] { bup.iC }, ), bup.lO)
/* 3885 */       .a("has_end_stone_brick", a(bup.iC))
/* 3886 */       .a(☃, "end_stone_brick_wall_from_end_stone_brick_stonecutting");
/*      */     
/* 3888 */     jk.a(bon.a(new brw[] { bup.ee }, ), bup.iC)
/* 3889 */       .a("has_end_stone", a(bup.ee))
/* 3890 */       .a(☃, "end_stone_bricks_from_end_stone_stonecutting");
/*      */     
/* 3892 */     jk.a(bon.a(new brw[] { bup.ee }, ), bup.lw, 2)
/* 3893 */       .a("has_end_stone", a(bup.ee))
/* 3894 */       .a(☃, "end_stone_brick_slab_from_end_stone_stonecutting");
/*      */     
/* 3896 */     jk.a(bon.a(new brw[] { bup.ee }, ), bup.li)
/* 3897 */       .a("has_end_stone", a(bup.ee))
/* 3898 */       .a(☃, "end_stone_brick_stairs_from_end_stone_stonecutting");
/*      */     
/* 3900 */     jk.a(bon.a(new brw[] { bup.ee }, ), bup.lO)
/* 3901 */       .a("has_end_stone", a(bup.ee))
/* 3902 */       .a(☃, "end_stone_brick_wall_from_end_stone_stonecutting");
/*      */     
/* 3904 */     jk.a(bon.a(new brw[] { bup.id }, ), bup.hR, 2)
/* 3905 */       .a("has_smooth_stone", a(bup.id))
/* 3906 */       .a(☃, "smooth_stone_slab_from_smooth_stone_stonecutting");
/*      */     
/* 3908 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.ns, 2)
/* 3909 */       .a("has_blackstone", a(bup.np))
/* 3910 */       .a(☃, "blackstone_slab_from_blackstone_stonecutting");
/*      */     
/* 3912 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nq)
/* 3913 */       .a("has_blackstone", a(bup.np))
/* 3914 */       .a(☃, "blackstone_stairs_from_blackstone_stonecutting");
/*      */     
/* 3916 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nr)
/* 3917 */       .a("has_blackstone", a(bup.np))
/* 3918 */       .a(☃, "blackstone_wall_from_blackstone_stonecutting");
/*      */     
/* 3920 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nt)
/* 3921 */       .a("has_blackstone", a(bup.np))
/* 3922 */       .a(☃, "polished_blackstone_from_blackstone_stonecutting");
/*      */     
/* 3924 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nF)
/* 3925 */       .a("has_blackstone", a(bup.np))
/* 3926 */       .a(☃, "polished_blackstone_wall_from_blackstone_stonecutting");
/*      */     
/* 3928 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nC, 2)
/* 3929 */       .a("has_blackstone", a(bup.np))
/* 3930 */       .a(☃, "polished_blackstone_slab_from_blackstone_stonecutting");
/*      */     
/* 3932 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nB)
/* 3933 */       .a("has_blackstone", a(bup.np))
/* 3934 */       .a(☃, "polished_blackstone_stairs_from_blackstone_stonecutting");
/*      */     
/* 3936 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nw)
/* 3937 */       .a("has_blackstone", a(bup.np))
/* 3938 */       .a(☃, "chiseled_polished_blackstone_from_blackstone_stonecutting");
/*      */     
/* 3940 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nu)
/* 3941 */       .a("has_blackstone", a(bup.np))
/* 3942 */       .a(☃, "polished_blackstone_bricks_from_blackstone_stonecutting");
/*      */     
/* 3944 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nx, 2)
/* 3945 */       .a("has_blackstone", a(bup.np))
/* 3946 */       .a(☃, "polished_blackstone_brick_slab_from_blackstone_stonecutting");
/*      */     
/* 3948 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.ny)
/* 3949 */       .a("has_blackstone", a(bup.np))
/* 3950 */       .a(☃, "polished_blackstone_brick_stairs_from_blackstone_stonecutting");
/*      */     
/* 3952 */     jk.a(bon.a(new brw[] { bup.np }, ), bup.nz)
/* 3953 */       .a("has_blackstone", a(bup.np))
/* 3954 */       .a(☃, "polished_blackstone_brick_wall_from_blackstone_stonecutting");
/*      */     
/* 3956 */     jk.a(bon.a(new brw[] { bup.nt }, ), bup.nC, 2)
/* 3957 */       .a("has_polished_blackstone", a(bup.nt))
/* 3958 */       .a(☃, "polished_blackstone_slab_from_polished_blackstone_stonecutting");
/*      */     
/* 3960 */     jk.a(bon.a(new brw[] { bup.nt }, ), bup.nB)
/* 3961 */       .a("has_polished_blackstone", a(bup.nt))
/* 3962 */       .a(☃, "polished_blackstone_stairs_from_polished_blackstone_stonecutting");
/*      */     
/* 3964 */     jk.a(bon.a(new brw[] { bup.nt }, ), bup.nu)
/* 3965 */       .a("has_polished_blackstone", a(bup.nt))
/* 3966 */       .a(☃, "polished_blackstone_bricks_from_polished_blackstone_stonecutting");
/*      */     
/* 3968 */     jk.a(bon.a(new brw[] { bup.nt }, ), bup.nF)
/* 3969 */       .a("has_polished_blackstone", a(bup.nt))
/* 3970 */       .a(☃, "polished_blackstone_wall_from_polished_blackstone_stonecutting");
/*      */     
/* 3972 */     jk.a(bon.a(new brw[] { bup.nt }, ), bup.nx, 2)
/* 3973 */       .a("has_polished_blackstone", a(bup.nt))
/* 3974 */       .a(☃, "polished_blackstone_brick_slab_from_polished_blackstone_stonecutting");
/*      */     
/* 3976 */     jk.a(bon.a(new brw[] { bup.nt }, ), bup.ny)
/* 3977 */       .a("has_polished_blackstone", a(bup.nt))
/* 3978 */       .a(☃, "polished_blackstone_brick_stairs_from_polished_blackstone_stonecutting");
/*      */     
/* 3980 */     jk.a(bon.a(new brw[] { bup.nt }, ), bup.nz)
/* 3981 */       .a("has_polished_blackstone", a(bup.nt))
/* 3982 */       .a(☃, "polished_blackstone_brick_wall_from_polished_blackstone_stonecutting");
/*      */     
/* 3984 */     jk.a(bon.a(new brw[] { bup.nt }, ), bup.nw)
/* 3985 */       .a("has_polished_blackstone", a(bup.nt))
/* 3986 */       .a(☃, "chiseled_polished_blackstone_from_polished_blackstone_stonecutting");
/*      */     
/* 3988 */     jk.a(bon.a(new brw[] { bup.nu }, ), bup.nx, 2)
/* 3989 */       .a("has_polished_blackstone_bricks", a(bup.nu))
/* 3990 */       .a(☃, "polished_blackstone_brick_slab_from_polished_blackstone_bricks_stonecutting");
/*      */     
/* 3992 */     jk.a(bon.a(new brw[] { bup.nu }, ), bup.ny)
/* 3993 */       .a("has_polished_blackstone_bricks", a(bup.nu))
/* 3994 */       .a(☃, "polished_blackstone_brick_stairs_from_polished_blackstone_bricks_stonecutting");
/*      */     
/* 3996 */     jk.a(bon.a(new brw[] { bup.nu }, ), bup.nz)
/* 3997 */       .a("has_polished_blackstone_bricks", a(bup.nu))
/* 3998 */       .a(☃, "polished_blackstone_brick_wall_from_polished_blackstone_bricks_stonecutting");
/*      */ 
/*      */     
/* 4001 */     a(☃, bmd.ll, bmd.lt);
/* 4002 */     a(☃, bmd.lm, bmd.lu);
/* 4003 */     a(☃, bmd.lk, bmd.ls);
/* 4004 */     a(☃, bmd.ln, bmd.lv);
/* 4005 */     a(☃, bmd.kF, bmd.kK);
/* 4006 */     a(☃, bmd.kI, bmd.kN);
/* 4007 */     a(☃, bmd.kH, bmd.kM);
/* 4008 */     a(☃, bmd.kJ, bmd.kO);
/* 4009 */     a(☃, bmd.kG, bmd.kL);
/*      */   }
/*      */   
/*      */   private static void a(Consumer<jf> ☃, blx blx1, blx blx2) {
/* 4013 */     jm.a(bon.a(new brw[] { blx1 }, ), bon.a(new brw[] { bmd.kj }, ), blx2)
/* 4014 */       .a("has_netherite_ingot", a(bmd.kj))
/* 4015 */       .a(☃, gm.T.b(blx2.h()).a() + "_smithing");
/*      */   }
/*      */ 
/*      */   
/*      */   private static void a(Consumer<jf> ☃, brw brw1, ael<blx> ael1) {
/* 4020 */     ji.a(brw1, 4)
/* 4021 */       .a(ael1)
/* 4022 */       .a("planks")
/* 4023 */       .a("has_log", a(ael1))
/* 4024 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void b(Consumer<jf> ☃, brw brw1, ael<blx> ael1) {
/* 4028 */     ji.a(brw1, 4)
/* 4029 */       .a(ael1)
/* 4030 */       .a("planks")
/* 4031 */       .a("has_logs", a(ael1))
/* 4032 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void a(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4036 */     jh.a(brw1, 3)
/* 4037 */       .a(Character.valueOf('#'), brw2)
/* 4038 */       .a("##")
/* 4039 */       .a("##")
/* 4040 */       .b("bark")
/* 4041 */       .a("has_log", a(brw2))
/* 4042 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void b(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4046 */     jh.a(brw1)
/* 4047 */       .a(Character.valueOf('#'), brw2)
/* 4048 */       .a("# #")
/* 4049 */       .a("###")
/* 4050 */       .b("boat")
/* 4051 */       .a("in_water", a(bup.A))
/* 4052 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void c(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4056 */     ji.a(brw1)
/* 4057 */       .b(brw2)
/* 4058 */       .a("wooden_button")
/* 4059 */       .a("has_planks", a(brw2))
/* 4060 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void d(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4064 */     jh.a(brw1, 3)
/* 4065 */       .a(Character.valueOf('#'), brw2)
/* 4066 */       .a("##")
/* 4067 */       .a("##")
/* 4068 */       .a("##")
/* 4069 */       .b("wooden_door")
/* 4070 */       .a("has_planks", a(brw2))
/* 4071 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void e(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4075 */     jh.a(brw1, 3)
/* 4076 */       .a(Character.valueOf('#'), bmd.kP)
/* 4077 */       .a(Character.valueOf('W'), brw2)
/* 4078 */       .a("W#W")
/* 4079 */       .a("W#W")
/* 4080 */       .b("wooden_fence")
/* 4081 */       .a("has_planks", a(brw2))
/* 4082 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void f(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4086 */     jh.a(brw1)
/* 4087 */       .a(Character.valueOf('#'), bmd.kP)
/* 4088 */       .a(Character.valueOf('W'), brw2)
/* 4089 */       .a("#W#")
/* 4090 */       .a("#W#")
/* 4091 */       .b("wooden_fence_gate")
/* 4092 */       .a("has_planks", a(brw2))
/* 4093 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void g(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4097 */     jh.a(brw1)
/* 4098 */       .a(Character.valueOf('#'), brw2)
/* 4099 */       .a("##")
/* 4100 */       .b("wooden_pressure_plate")
/* 4101 */       .a("has_planks", a(brw2))
/* 4102 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void h(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4106 */     jh.a(brw1, 6)
/* 4107 */       .a(Character.valueOf('#'), brw2)
/* 4108 */       .a("###")
/* 4109 */       .b("wooden_slab")
/* 4110 */       .a("has_planks", a(brw2))
/* 4111 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void i(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4115 */     jh.a(brw1, 4)
/* 4116 */       .a(Character.valueOf('#'), brw2)
/* 4117 */       .a("#  ")
/* 4118 */       .a("## ")
/* 4119 */       .a("###")
/* 4120 */       .b("wooden_stairs")
/* 4121 */       .a("has_planks", a(brw2))
/* 4122 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void j(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4126 */     jh.a(brw1, 2)
/* 4127 */       .a(Character.valueOf('#'), brw2)
/* 4128 */       .a("###")
/* 4129 */       .a("###")
/* 4130 */       .b("wooden_trapdoor")
/* 4131 */       .a("has_planks", a(brw2))
/* 4132 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void k(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4136 */     String str = gm.T.b(brw2.h()).a();
/* 4137 */     jh.a(brw1, 3)
/* 4138 */       .b("sign")
/* 4139 */       .a(Character.valueOf('#'), brw2)
/* 4140 */       .a(Character.valueOf('X'), bmd.kP)
/* 4141 */       .a("###")
/* 4142 */       .a("###")
/* 4143 */       .a(" X ")
/* 4144 */       .a("has_" + str, a(brw2))
/* 4145 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void l(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4149 */     ji.a(brw1)
/* 4150 */       .b(brw2)
/* 4151 */       .b(bup.aY)
/* 4152 */       .a("wool")
/* 4153 */       .a("has_white_wool", a(bup.aY))
/* 4154 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void m(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4158 */     String str = gm.T.b(brw2.h()).a();
/* 4159 */     jh.a(brw1, 3)
/* 4160 */       .a(Character.valueOf('#'), brw2)
/* 4161 */       .a("##")
/* 4162 */       .b("carpet")
/* 4163 */       .a("has_" + str, a(brw2))
/* 4164 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void n(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4168 */     String str1 = gm.T.b(brw1.h()).a();
/* 4169 */     String str2 = gm.T.b(brw2.h()).a();
/* 4170 */     jh.a(brw1, 8)
/* 4171 */       .a(Character.valueOf('#'), bup.gB)
/* 4172 */       .a(Character.valueOf('$'), brw2)
/* 4173 */       .a("###")
/* 4174 */       .a("#$#")
/* 4175 */       .a("###")
/* 4176 */       .b("carpet")
/* 4177 */       .a("has_white_carpet", a(bup.gB))
/* 4178 */       .a("has_" + str2, a(brw2))
/* 4179 */       .a(☃, str1 + "_from_white_carpet");
/*      */   }
/*      */   
/*      */   private static void o(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4183 */     String str = gm.T.b(brw2.h()).a();
/* 4184 */     jh.a(brw1)
/* 4185 */       .a(Character.valueOf('#'), brw2)
/* 4186 */       .a(Character.valueOf('X'), aeg.c)
/* 4187 */       .a("###")
/* 4188 */       .a("XXX")
/* 4189 */       .b("bed")
/* 4190 */       .a("has_" + str, a(brw2))
/* 4191 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void p(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4195 */     String str = gm.T.b(brw1.h()).a();
/* 4196 */     ji.a(brw1)
/* 4197 */       .b(bmd.mO)
/* 4198 */       .b(brw2)
/* 4199 */       .a("dyed_bed")
/* 4200 */       .a("has_bed", a(bmd.mO))
/* 4201 */       .a(☃, str + "_from_white_bed");
/*      */   }
/*      */   
/*      */   private static void q(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4205 */     String str = gm.T.b(brw2.h()).a();
/* 4206 */     jh.a(brw1)
/* 4207 */       .a(Character.valueOf('#'), brw2)
/* 4208 */       .a(Character.valueOf('|'), bmd.kP)
/* 4209 */       .a("###")
/* 4210 */       .a("###")
/* 4211 */       .a(" | ")
/* 4212 */       .b("banner")
/* 4213 */       .a("has_" + str, a(brw2))
/* 4214 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void r(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4218 */     jh.a(brw1, 8)
/* 4219 */       .a(Character.valueOf('#'), bup.ap)
/* 4220 */       .a(Character.valueOf('X'), brw2)
/* 4221 */       .a("###")
/* 4222 */       .a("#X#")
/* 4223 */       .a("###")
/* 4224 */       .b("stained_glass")
/* 4225 */       .a("has_glass", a(bup.ap))
/* 4226 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void s(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4230 */     jh.a(brw1, 16)
/* 4231 */       .a(Character.valueOf('#'), brw2)
/* 4232 */       .a("###")
/* 4233 */       .a("###")
/* 4234 */       .b("stained_glass_pane")
/* 4235 */       .a("has_glass", a(brw2))
/* 4236 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void t(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4240 */     String str1 = gm.T.b(brw1.h()).a();
/* 4241 */     String str2 = gm.T.b(brw2.h()).a();
/* 4242 */     jh.a(brw1, 8)
/* 4243 */       .a(Character.valueOf('#'), bup.dJ)
/* 4244 */       .a(Character.valueOf('$'), brw2)
/* 4245 */       .a("###")
/* 4246 */       .a("#$#")
/* 4247 */       .a("###")
/* 4248 */       .b("stained_glass_pane")
/* 4249 */       .a("has_glass_pane", a(bup.dJ))
/* 4250 */       .a("has_" + str2, a(brw2))
/* 4251 */       .a(☃, str1 + "_from_glass_pane");
/*      */   }
/*      */   
/*      */   private static void u(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4255 */     jh.a(brw1, 8)
/* 4256 */       .a(Character.valueOf('#'), bup.gR)
/* 4257 */       .a(Character.valueOf('X'), brw2)
/* 4258 */       .a("###")
/* 4259 */       .a("#X#")
/* 4260 */       .a("###")
/* 4261 */       .b("stained_terracotta")
/* 4262 */       .a("has_terracotta", a(bup.gR))
/* 4263 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void v(Consumer<jf> ☃, brw brw1, brw brw2) {
/* 4267 */     ji.a(brw1, 8)
/* 4268 */       .b(brw2)
/* 4269 */       .b(bup.C, 4)
/* 4270 */       .b(bup.E, 4)
/* 4271 */       .a("concrete_powder")
/* 4272 */       .a("has_sand", a(bup.C))
/* 4273 */       .a("has_gravel", a(bup.E))
/* 4274 */       .a(☃);
/*      */   }
/*      */   
/*      */   private static void a(Consumer<jf> ☃, String str, boz<?> boz1, int i) {
/* 4278 */     jj.a(bon.a(new brw[] { bmd.nl }, ), bmd.nm, 0.35F, i, boz1)
/* 4279 */       .a("has_beef", a(bmd.nl))
/* 4280 */       .a(☃, "cooked_beef_from_" + str);
/*      */     
/* 4282 */     jj.a(bon.a(new brw[] { bmd.nn }, ), bmd.no, 0.35F, i, boz1)
/* 4283 */       .a("has_chicken", a(bmd.nn))
/* 4284 */       .a(☃, "cooked_chicken_from_" + str);
/*      */     
/* 4286 */     jj.a(bon.a(new brw[] { bmd.ml }, ), bmd.mp, 0.35F, i, boz1)
/* 4287 */       .a("has_cod", a(bmd.ml))
/* 4288 */       .a(☃, "cooked_cod_from_" + str);
/*      */     
/* 4290 */     jj.a(bon.a(new brw[] { bup.kc }, ), bmd.ni, 0.1F, i, boz1)
/* 4291 */       .a("has_kelp", a(bup.kc))
/* 4292 */       .a(☃, "dried_kelp_from_" + str);
/*      */     
/* 4294 */     jj.a(bon.a(new brw[] { bmd.mm }, ), bmd.mq, 0.35F, i, boz1)
/* 4295 */       .a("has_salmon", a(bmd.mm))
/* 4296 */       .a(☃, "cooked_salmon_from_" + str);
/*      */     
/* 4298 */     jj.a(bon.a(new brw[] { bmd.pK }, ), bmd.pL, 0.35F, i, boz1)
/* 4299 */       .a("has_mutton", a(bmd.pK))
/* 4300 */       .a(☃, "cooked_mutton_from_" + str);
/*      */     
/* 4302 */     jj.a(bon.a(new brw[] { bmd.lx }, ), bmd.ly, 0.35F, i, boz1)
/* 4303 */       .a("has_porkchop", a(bmd.lx))
/* 4304 */       .a(☃, "cooked_porkchop_from_" + str);
/*      */     
/* 4306 */     jj.a(bon.a(new brw[] { bmd.oZ }, ), bmd.pa, 0.35F, i, boz1)
/* 4307 */       .a("has_potato", a(bmd.oZ))
/* 4308 */       .a(☃, "baked_potato_from_" + str);
/*      */     
/* 4310 */     jj.a(bon.a(new brw[] { bmd.px }, ), bmd.py, 0.35F, i, boz1)
/* 4311 */       .a("has_rabbit", a(bmd.px))
/* 4312 */       .a(☃, "cooked_rabbit_from_" + str);
/*      */   }
/*      */ 
/*      */   
/*      */   private static bc.a a(buo ☃) {
/* 4317 */     return new bc.a(bg.b.a, ☃, cm.a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static bn.a a(brw ☃) {
/* 4325 */     return a(new bq[] { bq.a.a().a(☃).b() });
/*      */   }
/*      */   
/*      */   private static bn.a a(ael<blx> ☃) {
/* 4329 */     return a(new bq[] { bq.a.a().a(☃).b() });
/*      */   }
/*      */   
/*      */   private static bn.a a(bq... ☃) {
/* 4333 */     return new bn.a(bg.b.a, bz.d.e, bz.d.e, bz.d.e, ☃);
/*      */   }
/*      */ 
/*      */   
/*      */   public String a() {
/* 4338 */     return "Recipes";
/*      */   }
/*      */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */