/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.io.File;
/*     */ import java.net.SocketAddress;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
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
/*     */ public abstract class acu
/*     */ {
/*  97 */   public static final File b = new File("banned-players.json");
/*  98 */   public static final File c = new File("banned-ips.json");
/*  99 */   public static final File d = new File("ops.json");
/* 100 */   public static final File e = new File("whitelist.json");
/* 101 */   private static final Logger a = LogManager.getLogger();
/*     */   
/* 103 */   private static final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
/*     */   
/*     */   private final MinecraftServer h;
/* 106 */   private final List<aah> i = Lists.newArrayList();
/* 107 */   private final Map<UUID, aah> j = Maps.newHashMap();
/* 108 */   private final acz k = new acz(b);
/* 109 */   private final acr l = new acr(c);
/* 110 */   private final acv m = new acv(d);
/* 111 */   private final adb n = new adb(e);
/* 112 */   private final Map<UUID, adw> o = Maps.newHashMap();
/* 113 */   private final Map<UUID, vt> p = Maps.newHashMap();
/*     */   private final cyk q;
/*     */   private boolean r;
/*     */   private final gn.b s;
/*     */   protected final int f;
/*     */   private int t;
/*     */   private bru u;
/*     */   private boolean v;
/*     */   private int w;
/*     */   
/*     */   public acu(MinecraftServer ☃, gn.b b1, cyk cyk1, int i) {
/* 124 */     this.h = ☃;
/* 125 */     this.s = b1;
/* 126 */     this.f = i;
/* 127 */     this.q = cyk1;
/*     */   } public void a(nd ☃, aah aah1) {
/*     */     aag aag2;
/*     */     nx nx;
/* 131 */     GameProfile gameProfile1 = aah1.eA();
/*     */     
/* 133 */     acq acq = this.h.ar();
/* 134 */     GameProfile gameProfile2 = acq.a(gameProfile1.getId());
/* 135 */     String str1 = (gameProfile2 == null) ? gameProfile1.getName() : gameProfile2.getName();
/* 136 */     acq.a(gameProfile1);
/*     */     
/* 138 */     md md = a(aah1);
/*     */     
/* 140 */     vj<brx> vj = (md != null) ? chd.a(new Dynamic(mo.a, md.c("Dimension"))).resultOrPartial(a::error).orElse(brx.g) : brx.g;
/* 141 */     aag aag1 = this.h.a(vj);
/*     */     
/* 143 */     if (aag1 == null) {
/* 144 */       a.warn("Unknown respawn dimension {}, defaulting to overworld", vj);
/* 145 */       aag2 = this.h.E();
/*     */     } else {
/* 147 */       aag2 = aag1;
/*     */     } 
/* 149 */     aah1.a_(aag2);
/* 150 */     aah1.d.a((aag)aah1.l);
/*     */     
/* 152 */     String str2 = "local";
/*     */     
/* 154 */     if (☃.c() != null) {
/* 155 */       str2 = ☃.c().toString();
/*     */     }
/*     */     
/* 158 */     a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", aah1.R().getString(), str2, Integer.valueOf(aah1.Y()), Double.valueOf(aah1.cD()), Double.valueOf(aah1.cE()), Double.valueOf(aah1.cH()));
/*     */     
/* 160 */     cyd cyd = aag2.h();
/*     */     
/* 162 */     a(aah1, (aah)null, aag2);
/*     */     
/* 164 */     aay aay = new aay(this.h, ☃, aah1);
/* 165 */     brt brt = aag2.V();
/* 166 */     boolean bool1 = brt.b(brt.z);
/* 167 */     boolean bool2 = brt.b(brt.o);
/* 168 */     aay.a(new px(aah1.Y(), aah1.d
/* 169 */           .b(), aah1.d
/* 170 */           .c(), 
/* 171 */           bsx.a(aag2.C()), cyd
/* 172 */           .n(), this.h
/* 173 */           .F(), this.s, aag2
/*     */           
/* 175 */           .k(), aag2
/* 176 */           .Y(), 
/* 177 */           n(), this.t, bool2, !bool1, aag2
/*     */ 
/*     */ 
/*     */           
/* 181 */           .ab(), aag2
/* 182 */           .B()));
/* 183 */     aay.a(new pk(pk.a, (new nf(Unpooled.buffer())).a(c().getServerModName())));
/* 184 */     aay.a(new pa(cyd.s(), cyd.t()));
/* 185 */     aay.a(new qg(aah1.bC));
/* 186 */     aay.a(new qv(aah1.bm.d));
/* 187 */     aay.a(new rw(this.h.aF().b()));
/* 188 */     aay.a(new rx(this.h.aG()));
/* 189 */     d(aah1);
/*     */     
/* 191 */     aah1.A().c();
/*     */     
/* 193 */     aah1.B().a(aah1);
/*     */     
/* 195 */     a(aag2.o_(), aah1);
/*     */     
/* 197 */     this.h.at();
/*     */     
/* 199 */     if (aah1.eA().getName().equalsIgnoreCase(str1)) {
/* 200 */       nx = new of("multiplayer.player.joined", new Object[] { aah1.d() });
/*     */     } else {
/* 202 */       nx = new of("multiplayer.player.joined.renamed", new Object[] { aah1.d(), str1 });
/*     */     } 
/* 204 */     a(nx.a(k.o), no.b, x.b);
/* 205 */     aay.a(aah1.cD(), aah1.cE(), aah1.cH(), aah1.p, aah1.q);
/*     */     
/* 207 */     this.i.add(aah1);
/* 208 */     this.j.put(aah1.bS(), aah1);
/*     */     
/* 210 */     a(new qi(qi.a.a, new aah[] { aah1 }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 220 */     for (int i = 0; i < this.i.size(); i++) {
/* 221 */       aah1.b.a(new qi(qi.a.a, new aah[] { this.i.get(i) }));
/*     */     } 
/*     */     
/* 224 */     aag2.c(aah1);
/*     */     
/* 226 */     this.h.aM().a(aah1);
/* 227 */     a(aah1, aag2);
/*     */     
/* 229 */     if (!this.h.S().isEmpty()) {
/* 230 */       aah1.a(this.h.S(), this.h.T());
/*     */     }
/*     */     
/* 233 */     for (apu apu : aah1.dh()) {
/* 234 */       aay.a(new rv(aah1.Y(), apu));
/*     */     }
/*     */     
/* 237 */     if (md != null && md.c("RootVehicle", 10)) {
/* 238 */       md md1 = md.p("RootVehicle");
/* 239 */       aqa aqa = aqe.a(md1.p("Entity"), aag2, aqa1 -> !☃.d(aqa1) ? null : aqa1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 245 */       if (aqa != null) {
/*     */         UUID uUID;
/* 247 */         if (md1.b("Attach")) {
/* 248 */           uUID = md1.a("Attach");
/*     */         } else {
/* 250 */           uUID = null;
/*     */         } 
/* 252 */         if (aqa.bS().equals(uUID)) {
/* 253 */           aah1.a(aqa, true);
/*     */         } else {
/* 255 */           for (aqa aqa1 : aqa.co()) {
/* 256 */             if (aqa1.bS().equals(uUID)) {
/* 257 */               aah1.a(aqa1, true);
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/* 262 */         if (!aah1.br()) {
/* 263 */           a.warn("Couldn't reattach entity to player");
/* 264 */           aag2.i(aqa);
/* 265 */           for (aqa aqa1 : aqa.co()) {
/* 266 */             aag2.i(aqa1);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 272 */     aah1.f();
/*     */   }
/*     */   
/*     */   protected void a(wa ☃, aah aah1) {
/* 276 */     Set<ddk> set = Sets.newHashSet();
/*     */     
/* 278 */     for (ddl ddl : ☃.g()) {
/* 279 */       aah1.b.a(new ri(ddl, 0));
/*     */     }
/*     */     
/* 282 */     for (int i = 0; i < 19; i++) {
/* 283 */       ddk ddk = ☃.a(i);
/*     */       
/* 285 */       if (ddk != null && !set.contains(ddk)) {
/* 286 */         List<oj<?>> list = ☃.d(ddk);
/*     */         
/* 288 */         for (oj<?> oj : list) {
/* 289 */           aah1.b.a(oj);
/*     */         }
/*     */         
/* 292 */         set.add(ddk);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aag ☃) {
/* 298 */     ☃.f().a(new cfs(this)
/*     */         {
/*     */           public void a(cfu ☃, double d) {
/* 301 */             this.a.a(new qt(☃, qt.a.a));
/*     */           }
/*     */ 
/*     */           
/*     */           public void a(cfu ☃, double d1, double d2, long l) {
/* 306 */             this.a.a(new qt(☃, qt.a.b));
/*     */           }
/*     */ 
/*     */           
/*     */           public void a(cfu ☃, double d1, double d2) {
/* 311 */             this.a.a(new qt(☃, qt.a.c));
/*     */           }
/*     */ 
/*     */           
/*     */           public void a(cfu ☃, int i) {
/* 316 */             this.a.a(new qt(☃, qt.a.e));
/*     */           }
/*     */ 
/*     */           
/*     */           public void b(cfu ☃, int i) {
/* 321 */             this.a.a(new qt(☃, qt.a.f));
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public void b(cfu ☃, double d) {}
/*     */ 
/*     */           
/*     */           public void c(cfu ☃, double d) {}
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public md a(aah ☃) {
/* 336 */     md md2, md1 = this.h.aX().y();
/*     */ 
/*     */     
/* 339 */     if (☃.R().getString().equals(this.h.N()) && md1 != null) {
/* 340 */       md2 = md1;
/* 341 */       ☃.f(md2);
/* 342 */       a.debug("loading single player");
/*     */     } else {
/* 344 */       md2 = this.q.b(☃);
/*     */     } 
/* 346 */     return md2;
/*     */   }
/*     */   
/*     */   protected void b(aah ☃) {
/* 350 */     this.q.a(☃);
/* 351 */     adw adw = this.o.get(☃.bS());
/* 352 */     if (adw != null) {
/* 353 */       adw.a();
/*     */     }
/* 355 */     vt vt = this.p.get(☃.bS());
/* 356 */     if (vt != null) {
/* 357 */       vt.b();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(aah ☃) {
/* 367 */     aag aag = ☃.u();
/* 368 */     ☃.a(aea.j);
/* 369 */     b(☃);
/* 370 */     if (☃.br()) {
/* 371 */       aqa aqa = ☃.cr();
/* 372 */       if (aqa.cq()) {
/* 373 */         a.debug("Removing player mount");
/* 374 */         ☃.l();
/* 375 */         aag.i(aqa);
/* 376 */         aqa.y = true;
/* 377 */         for (aqa aqa1 : aqa.co()) {
/* 378 */           aag.i(aqa1);
/* 379 */           aqa1.y = true;
/*     */         } 
/* 381 */         aag.d(☃.V, ☃.X).s();
/*     */       } 
/*     */     } 
/* 384 */     ☃.V();
/* 385 */     aag.e(☃);
/*     */     
/* 387 */     ☃.J().a();
/* 388 */     this.i.remove(☃);
/* 389 */     this.h.aM().b(☃);
/* 390 */     UUID uUID = ☃.bS();
/* 391 */     aah aah1 = this.j.get(uUID);
/* 392 */     if (aah1 == ☃) {
/* 393 */       this.j.remove(uUID);
/* 394 */       this.o.remove(uUID);
/* 395 */       this.p.remove(uUID);
/*     */     } 
/* 397 */     a(new qi(qi.a.e, new aah[] { ☃ }));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public nr a(SocketAddress ☃, GameProfile gameProfile) {
/* 402 */     if (this.k.a(gameProfile)) {
/* 403 */       ada ada = this.k.b(gameProfile);
/* 404 */       nx nx = new of("multiplayer.disconnect.banned.reason", new Object[] { ada.d() });
/*     */       
/* 406 */       if (ada.c() != null) {
/* 407 */         nx.a(new of("multiplayer.disconnect.banned.expiration", new Object[] { g.format(ada.c()) }));
/*     */       }
/*     */       
/* 410 */       return nx;
/*     */     } 
/*     */     
/* 413 */     if (!e(gameProfile)) {
/* 414 */       return new of("multiplayer.disconnect.not_whitelisted");
/*     */     }
/*     */     
/* 417 */     if (this.l.a(☃)) {
/* 418 */       acs acs = this.l.b(☃);
/* 419 */       nx nx = new of("multiplayer.disconnect.banned_ip.reason", new Object[] { acs.d() });
/*     */       
/* 421 */       if (acs.c() != null) {
/* 422 */         nx.a(new of("multiplayer.disconnect.banned_ip.expiration", new Object[] { g.format(acs.c()) }));
/*     */       }
/*     */       
/* 425 */       return nx;
/*     */     } 
/*     */     
/* 428 */     if (this.i.size() >= this.f && !f(gameProfile)) {
/* 429 */       return new of("multiplayer.disconnect.server_full");
/*     */     }
/*     */     
/* 432 */     return null;
/*     */   }
/*     */   public aah g(GameProfile ☃) {
/*     */     aai aai;
/* 436 */     UUID uUID = bfw.a(☃);
/* 437 */     List<aah> list = Lists.newArrayList();
/* 438 */     for (int i = 0; i < this.i.size(); i++) {
/* 439 */       aah aah1 = this.i.get(i);
/* 440 */       if (aah1.bS().equals(uUID)) {
/* 441 */         list.add(aah1);
/*     */       }
/*     */     } 
/* 444 */     aah aah = this.j.get(☃.getId());
/* 445 */     if (aah != null && !list.contains(aah)) {
/* 446 */       list.add(aah);
/*     */     }
/* 448 */     for (aah aah1 : list) {
/* 449 */       aah1.b.b(new of("multiplayer.disconnect.duplicate_login"));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 454 */     aag aag = this.h.E();
/* 455 */     if (this.h.R()) {
/* 456 */       aai = new zx(aag);
/*     */     } else {
/* 458 */       aai = new aai(aag);
/*     */     } 
/*     */     
/* 461 */     return new aah(this.h, aag, ☃, aai);
/*     */   } public aah a(aah ☃, boolean bool) {
/*     */     Optional<dcn> optional;
/*     */     aai aai;
/* 465 */     this.i.remove(☃);
/* 466 */     ☃.u().e(☃);
/*     */     
/* 468 */     fx fx = ☃.K();
/* 469 */     float f = ☃.L();
/* 470 */     boolean bool1 = ☃.N();
/*     */     
/* 472 */     aag aag1 = this.h.a(☃.M());
/*     */ 
/*     */     
/* 475 */     if (aag1 != null && fx != null) {
/* 476 */       optional = bfw.a(aag1, fx, f, bool1, bool);
/*     */     } else {
/* 478 */       optional = Optional.empty();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 483 */     aag aag2 = (aag1 != null && optional.isPresent()) ? aag1 : this.h.E();
/* 484 */     if (this.h.R()) {
/* 485 */       aai = new zx(aag2);
/*     */     } else {
/* 487 */       aai = new aai(aag2);
/*     */     } 
/*     */     
/* 490 */     aah aah1 = new aah(this.h, aag2, ☃.eA(), aai);
/* 491 */     aah1.b = ☃.b;
/* 492 */     aah1.a(☃, bool);
/* 493 */     aah1.e(☃.Y());
/* 494 */     aah1.a(☃.dV());
/* 495 */     for (String str : ☃.Z()) {
/* 496 */       aah1.a(str);
/*     */     }
/*     */     
/* 499 */     a(aah1, ☃, aag2);
/*     */     
/* 501 */     boolean bool2 = false;
/* 502 */     if (optional.isPresent()) {
/* 503 */       float f1; ceh ceh = aag2.d_(fx);
/* 504 */       boolean bool3 = ceh.a(bup.nj);
/*     */       
/* 506 */       dcn dcn = optional.get();
/*     */       
/* 508 */       if (ceh.a(aed.L) || bool3) {
/* 509 */         dcn dcn1 = dcn.c(fx).d(dcn).d();
/* 510 */         f1 = (float)afm.g(afm.d(dcn1.d, dcn1.b) * 57.2957763671875D - 90.0D);
/*     */       } else {
/* 512 */         f1 = f;
/*     */       } 
/* 514 */       aah1.b(dcn.b, dcn.c, dcn.d, f1, 0.0F);
/*     */       
/* 516 */       aah1.a(aag2.Y(), fx, f, bool1, false);
/* 517 */       bool2 = (!bool && bool3);
/* 518 */     } else if (fx != null) {
/* 519 */       aah1.b.a(new pq(pq.a, 0.0F));
/*     */     } 
/*     */     
/* 522 */     while (!aag2.k(aah1) && aah1.cE() < 256.0D) {
/* 523 */       aah1.d(aah1.cD(), aah1.cE() + 1.0D, aah1.cH());
/*     */     }
/*     */     
/* 526 */     cyd cyd = aah1.l.h();
/* 527 */     aah1.b.a(new qp(aah1.l.k(), aah1.l.Y(), bsx.a(aah1.u().C()), aah1.d.b(), aah1.d.c(), aah1.u().ab(), aah1.u().B(), bool));
/* 528 */     aah1.b.a(aah1.cD(), aah1.cE(), aah1.cH(), aah1.p, aah1.q);
/* 529 */     aah1.b.a(new qy(aag2.u(), aag2.v()));
/* 530 */     aah1.b.a(new pa(cyd.s(), cyd.t()));
/* 531 */     aah1.b.a(new re(aah1.bF, aah1.bE, aah1.bD));
/* 532 */     a(aah1, aag2);
/* 533 */     d(aah1);
/*     */     
/* 535 */     aag2.d(aah1);
/* 536 */     this.i.add(aah1);
/* 537 */     this.j.put(aah1.bS(), aah1);
/*     */     
/* 539 */     aah1.f();
/* 540 */     aah1.c(aah1.dk());
/*     */     
/* 542 */     if (bool2)
/*     */     {
/* 544 */       aah1.b.a(new rn(adq.mz, adr.e, fx.u(), fx.v(), fx.w(), 1.0F, 1.0F));
/*     */     }
/*     */     
/* 547 */     return aah1;
/*     */   }
/*     */   
/*     */   public void d(aah ☃) {
/* 551 */     GameProfile gameProfile = ☃.eA();
/* 552 */     int i = this.h.b(gameProfile);
/* 553 */     a(☃, i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/* 559 */     if (++this.w > 600) {
/* 560 */       a(new qi(qi.a.c, this.i));
/* 561 */       this.w = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(oj<?> ☃) {
/* 566 */     for (int i = 0; i < this.i.size(); i++) {
/* 567 */       ((aah)this.i.get(i)).b.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(oj<?> ☃, vj<brx> vj1) {
/* 572 */     for (int i = 0; i < this.i.size(); i++) {
/* 573 */       aah aah = this.i.get(i);
/* 574 */       if (aah.l.Y() == vj1) {
/* 575 */         aah.b.a(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(bfw ☃, nr nr1) {
/* 581 */     ddp ddp = ☃.bG();
/* 582 */     if (ddp == null) {
/*     */       return;
/*     */     }
/* 585 */     Collection<String> collection = ddp.g();
/* 586 */     for (String str : collection) {
/* 587 */       aah aah = a(str);
/* 588 */       if (aah == null || aah == ☃) {
/*     */         continue;
/*     */       }
/* 591 */       aah.a(nr1, ☃.bS());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(bfw ☃, nr nr1) {
/* 596 */     ddp ddp = ☃.bG();
/* 597 */     if (ddp == null) {
/* 598 */       a(nr1, no.b, ☃.bS());
/*     */       return;
/*     */     } 
/* 601 */     for (int i = 0; i < this.i.size(); i++) {
/* 602 */       aah aah = this.i.get(i);
/* 603 */       if (aah.bG() != ddp) {
/* 604 */         aah.a(nr1, ☃.bS());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public String[] e() {
/* 610 */     String[] ☃ = new String[this.i.size()];
/* 611 */     for (int i = 0; i < this.i.size(); i++) {
/* 612 */       ☃[i] = ((aah)this.i.get(i)).eA().getName();
/*     */     }
/* 614 */     return ☃;
/*     */   }
/*     */   
/*     */   public acz f() {
/* 618 */     return this.k;
/*     */   }
/*     */   
/*     */   public acr g() {
/* 622 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(GameProfile ☃) {
/* 626 */     this.m.a(new acw(☃, this.h.g(), this.m.b(☃)));
/* 627 */     aah aah = a(☃.getId());
/* 628 */     if (aah != null) {
/* 629 */       d(aah);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(GameProfile ☃) {
/* 634 */     this.m.c(☃);
/* 635 */     aah aah = a(☃.getId());
/* 636 */     if (aah != null) {
/* 637 */       d(aah);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(aah ☃, int i) {
/* 642 */     if (☃.b != null) {
/*     */       byte b1;
/* 644 */       if (i <= 0) {
/* 645 */         b1 = 24;
/* 646 */       } else if (i >= 4) {
/* 647 */         b1 = 28;
/*     */       } else {
/* 649 */         b1 = (byte)(24 + i);
/*     */       } 
/* 651 */       ☃.b.a(new pn(☃, b1));
/*     */     } 
/* 653 */     this.h.aD().a(☃);
/*     */   }
/*     */   
/*     */   public boolean e(GameProfile ☃) {
/* 657 */     return (!this.r || this.m.d(☃) || this.n.d(☃));
/*     */   }
/*     */   
/*     */   public boolean h(GameProfile ☃) {
/* 661 */     return (this.m.d(☃) || (this.h.a(☃) && this.h.aX().o()) || this.v);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aah a(String ☃) {
/* 666 */     for (aah aah : this.i) {
/* 667 */       if (aah.eA().getName().equalsIgnoreCase(☃)) {
/* 668 */         return aah;
/*     */       }
/*     */     } 
/* 671 */     return null;
/*     */   }
/*     */   
/*     */   public void a(@Nullable bfw ☃, double d1, double d2, double d3, double d4, vj<brx> vj1, oj<?> oj1) {
/* 675 */     for (int i = 0; i < this.i.size(); i++) {
/* 676 */       aah aah = this.i.get(i);
/* 677 */       if (aah != ☃)
/*     */       {
/*     */         
/* 680 */         if (aah.l.Y() == vj1) {
/*     */ 
/*     */           
/* 683 */           double d5 = d1 - aah.cD();
/* 684 */           double d6 = d2 - aah.cE();
/* 685 */           double d7 = d3 - aah.cH();
/* 686 */           if (d5 * d5 + d6 * d6 + d7 * d7 < d4 * d4)
/* 687 */             aah.b.a(oj1); 
/*     */         }  } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void h() {
/* 693 */     for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
/* 694 */       b(this.i.get(☃));
/*     */     }
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
/*     */   public adb i() {
/* 707 */     return this.n;
/*     */   }
/*     */   
/*     */   public String[] j() {
/* 711 */     return this.n.a();
/*     */   }
/*     */   
/*     */   public acv k() {
/* 715 */     return this.m;
/*     */   }
/*     */   
/*     */   public String[] l() {
/* 719 */     return this.m.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {}
/*     */ 
/*     */   
/*     */   public void a(aah ☃, aag aag1) {
/* 727 */     cfu cfu = this.h.E().f();
/* 728 */     ☃.b.a(new qt(cfu, qt.a.d));
/* 729 */     ☃.b.a(new rk(aag1.T(), aag1.U(), aag1.V().b(brt.j)));
/* 730 */     ☃.b.a(new qy(aag1.u(), aag1.v()));
/*     */     
/* 732 */     if (aag1.X()) {
/* 733 */       ☃.b.a(new pq(pq.b, 0.0F));
/* 734 */       ☃.b.a(new pq(pq.h, aag1.d(1.0F)));
/* 735 */       ☃.b.a(new pq(pq.i, aag1.b(1.0F)));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void e(aah ☃) {
/* 740 */     ☃.a(☃.bo);
/* 741 */     ☃.r();
/* 742 */     ☃.b.a(new qv(☃.bm.d));
/*     */   }
/*     */   
/*     */   public int m() {
/* 746 */     return this.i.size();
/*     */   }
/*     */   
/*     */   public int n() {
/* 750 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean o() {
/* 754 */     return this.r;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 758 */     this.r = ☃;
/*     */   }
/*     */   
/*     */   public List<aah> b(String ☃) {
/* 762 */     List<aah> list = Lists.newArrayList();
/*     */     
/* 764 */     for (aah aah : this.i) {
/* 765 */       if (aah.v().equals(☃)) {
/* 766 */         list.add(aah);
/*     */       }
/*     */     } 
/*     */     
/* 770 */     return list;
/*     */   }
/*     */   
/*     */   public int p() {
/* 774 */     return this.t;
/*     */   }
/*     */   
/*     */   public MinecraftServer c() {
/* 778 */     return this.h;
/*     */   }
/*     */   
/*     */   public md q() {
/* 782 */     return null;
/*     */   }
/*     */   
/*     */   public void a(bru ☃) {
/* 786 */     this.u = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(aah ☃, @Nullable aah aah1, aag aag1) {
/* 791 */     if (aah1 != null) {
/* 792 */       ☃.d.a(aah1.d.b(), aah1.d.c());
/* 793 */     } else if (this.u != null) {
/* 794 */       ☃.d.a(this.u, bru.a);
/*     */     } 
/* 796 */     ☃.d.b(aag1.l().aX().m());
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 800 */     this.v = ☃;
/*     */   }
/*     */   
/*     */   public void r() {
/* 804 */     for (int ☃ = 0; ☃ < this.i.size(); ☃++) {
/* 805 */       ((aah)this.i.get(☃)).b.b(new of("multiplayer.disconnect.server_shutdown"));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(nr ☃, no no1, UUID uUID) {
/* 810 */     this.h.a(☃, uUID);
/* 811 */     a(new pb(☃, no1, uUID));
/*     */   }
/*     */   
/*     */   public adw a(bfw ☃) {
/* 815 */     UUID uUID = ☃.bS();
/* 816 */     adw adw = (uUID == null) ? null : this.o.get(uUID);
/*     */     
/* 818 */     if (adw == null) {
/* 819 */       File file1 = this.h.a(cye.b).toFile();
/* 820 */       File file2 = new File(file1, uUID + ".json");
/*     */       
/* 822 */       if (!file2.exists()) {
/*     */         
/* 824 */         File file = new File(file1, ☃.R().getString() + ".json");
/* 825 */         if (file.exists() && file.isFile()) {
/* 826 */           file.renameTo(file2);
/*     */         }
/*     */       } 
/*     */       
/* 830 */       adw = new adw(this.h, file2);
/* 831 */       this.o.put(uUID, adw);
/*     */     } 
/*     */     
/* 834 */     return adw;
/*     */   }
/*     */   
/*     */   public vt f(aah ☃) {
/* 838 */     UUID uUID = ☃.bS();
/* 839 */     vt vt = this.p.get(uUID);
/* 840 */     if (vt == null) {
/* 841 */       File file1 = this.h.a(cye.a).toFile();
/* 842 */       File file2 = new File(file1, uUID + ".json");
/* 843 */       vt = new vt(this.h.az(), this, this.h.aA(), file2, ☃);
/* 844 */       this.p.put(uUID, vt);
/*     */     } 
/*     */     
/* 847 */     vt.a(☃);
/*     */     
/* 849 */     return vt;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 853 */     this.t = ☃;
/* 854 */     a(new qx(☃));
/*     */     
/* 856 */     for (aag aag : this.h.G()) {
/* 857 */       if (aag != null) {
/* 858 */         aag.i().a(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<aah> s() {
/* 864 */     return this.i;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aah a(UUID ☃) {
/* 869 */     return this.j.get(☃);
/*     */   }
/*     */   
/*     */   public boolean f(GameProfile ☃) {
/* 873 */     return false;
/*     */   }
/*     */   
/*     */   public void t() {
/* 877 */     for (vt vt : this.p.values()) {
/* 878 */       vt.a(this.h.aA());
/*     */     }
/* 880 */     a(new rx(this.h.aG()));
/* 881 */     rw ☃ = new rw(this.h.aF().b());
/* 882 */     for (aah aah : this.i) {
/* 883 */       aah.b.a(☃);
/* 884 */       aah.B().a(aah);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean u() {
/* 889 */     return this.v;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */