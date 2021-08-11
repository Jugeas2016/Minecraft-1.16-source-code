/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.GameProfileRepository;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.InetAddress;
/*     */ import java.net.Proxy;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import java.util.regex.Pattern;
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
/*     */ public class zg
/*     */   extends MinecraftServer
/*     */   implements vy
/*     */ {
/*  64 */   private static final Logger j = LogManager.getLogger();
/*     */ 
/*     */   
/*  67 */   private static final Pattern k = Pattern.compile("^[a-fA-F0-9]{40}$");
/*     */   
/*  69 */   private final List<vo> l = Collections.synchronizedList(Lists.newArrayList());
/*     */   private adj m;
/*     */   private final adg n;
/*     */   private adl o;
/*     */   private final zi p;
/*     */   @Nullable
/*     */   private zm q;
/*     */   @Nullable
/*     */   private final abd r;
/*     */   
/*     */   public zg(Thread ☃, gn.b b1, cyg.a a1, abw abw1, vz vz1, cyn cyn1, zi zi1, DataFixer dataFixer, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, acq acq1, aaq aaq1) {
/*  80 */     super(☃, b1, a1, cyn1, abw1, Proxy.NO_PROXY, dataFixer, vz1, minecraftSessionService, gameProfileRepository, acq1, aaq1);
/*  81 */     this.p = zi1;
/*  82 */     this.n = new adg(this);
/*     */     
/*  84 */     this.r = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() throws IOException {
/*  89 */     Thread ☃ = new Thread(this, "Server console handler")
/*     */       {
/*     */         public void run() {
/*  92 */           BufferedReader ☃ = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
/*     */           try {
/*     */             String str;
/*  95 */             while (!this.a.ad() && this.a.v() && (str = ☃.readLine()) != null) {
/*  96 */               this.a.a(str, this.a.aE());
/*     */             }
/*  98 */           } catch (IOException iOException) {
/*  99 */             zg.bg().error("Exception handling console input", iOException);
/*     */           } 
/*     */         }
/*     */       };
/* 103 */     ☃.setDaemon(true);
/* 104 */     ☃.setUncaughtExceptionHandler(new o(j));
/* 105 */     ☃.start();
/*     */     
/* 107 */     j.info("Starting minecraft server version " + w.a().getName());
/*     */     
/* 109 */     if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
/* 110 */       j.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
/*     */     }
/*     */     
/* 113 */     j.info("Loading properties");
/* 114 */     zh zh = this.p.a();
/*     */     
/* 116 */     if (O()) {
/* 117 */       a_("127.0.0.1");
/*     */     } else {
/* 119 */       d(zh.a);
/* 120 */       e(zh.b);
/* 121 */       a_(zh.c);
/*     */     } 
/*     */     
/* 124 */     f(zh.f);
/* 125 */     g(zh.g);
/* 126 */     a(zh.h, ba());
/* 127 */     e(zh.i);
/* 128 */     h(zh.j);
/* 129 */     super.d(((Integer)zh.U.get()).intValue());
/* 130 */     i(zh.k);
/*     */     
/* 132 */     this.i.a(zh.m);
/* 133 */     j.info("Default game type: {}", zh.m);
/*     */     
/* 135 */     InetAddress inetAddress = null;
/* 136 */     if (!u().isEmpty()) {
/* 137 */       inetAddress = InetAddress.getByName(u());
/*     */     }
/* 139 */     if (M() < 0) {
/* 140 */       a(zh.o);
/*     */     }
/*     */     
/* 143 */     P();
/*     */     
/* 145 */     j.info("Starting Minecraft server on {}:{}", u().isEmpty() ? "*" : u(), Integer.valueOf(M()));
/*     */     try {
/* 147 */       af().a(inetAddress, M());
/* 148 */     } catch (IOException iOException) {
/* 149 */       j.warn("**** FAILED TO BIND TO PORT!");
/* 150 */       j.warn("The exception was: {}", iOException.toString());
/* 151 */       j.warn("Perhaps a server is already running on that port?");
/* 152 */       return false;
/*     */     } 
/*     */     
/* 155 */     if (!V()) {
/* 156 */       j.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
/* 157 */       j.warn("The server will make no attempt to authenticate usernames. Beware.");
/* 158 */       j.warn("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
/* 159 */       j.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
/*     */     } 
/*     */     
/* 162 */     if (be()) {
/* 163 */       ar().b();
/*     */     }
/* 165 */     if (!act.e(this)) {
/* 166 */       return false;
/*     */     }
/*     */     
/* 169 */     a(new zf(this, this.f, this.e));
/*     */     
/* 171 */     long l1 = x.c();
/* 172 */     c(zh.p);
/*     */     
/* 174 */     cdg.a(ar());
/* 175 */     cdg.a(ap());
/* 176 */     acq.a(V());
/*     */     
/* 178 */     j.info("Preparing level \"{}\"", k_());
/* 179 */     l_();
/* 180 */     long l2 = x.c() - l1;
/* 181 */     String str = String.format(Locale.ROOT, "%.3fs", new Object[] { Double.valueOf(l2 / 1.0E9D) });
/* 182 */     j.info("Done ({})! For help, type \"help\"", str);
/*     */ 
/*     */     
/* 185 */     if (zh.q != null) {
/* 186 */       ((brt.a)aL().<brt.a>a(brt.w)).a(zh.q.booleanValue(), this);
/*     */     }
/*     */     
/* 189 */     if (zh.r) {
/* 190 */       j.info("Starting GS4 status listener");
/* 191 */       this.m = adj.a(this);
/*     */     } 
/* 193 */     if (zh.t) {
/* 194 */       j.info("Starting remote control listener");
/* 195 */       this.o = adl.a(this);
/*     */     } 
/*     */     
/* 198 */     if (bf() > 0L) {
/* 199 */       Thread thread = new Thread(new zj(this));
/* 200 */       thread.setUncaughtExceptionHandler(new p(j));
/* 201 */       thread.setName("Server Watchdog");
/* 202 */       thread.setDaemon(true);
/* 203 */       thread.start();
/*     */     } 
/*     */ 
/*     */     
/* 207 */     bmd.a.a(bks.g, gj.a());
/*     */     
/* 209 */     if (zh.Q) {
/* 210 */       ann.a(this);
/*     */     }
/*     */     
/* 213 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean X() {
/* 218 */     return ((g_()).d && super.X());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean Q() {
/* 223 */     return ((this.p.a()).A && super.Q());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean Y() {
/* 228 */     return ((this.p.a()).e && super.Y());
/*     */   }
/*     */   public String ba() {
/*     */     String str;
/* 232 */     zh ☃ = this.p.a();
/*     */     
/* 234 */     if (!☃.x.isEmpty()) {
/* 235 */       str = ☃.x;
/* 236 */       if (!Strings.isNullOrEmpty(☃.w)) {
/* 237 */         j.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
/*     */       }
/* 239 */     } else if (!Strings.isNullOrEmpty(☃.w)) {
/* 240 */       j.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
/* 241 */       str = ☃.w;
/*     */     } else {
/* 243 */       str = "";
/*     */     } 
/*     */     
/* 246 */     if (!str.isEmpty() && !k.matcher(str).matches()) {
/* 247 */       j.warn("Invalid sha1 for ressource-pack-sha1");
/*     */     }
/* 249 */     if (!☃.h.isEmpty() && str.isEmpty()) {
/* 250 */       j.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
/*     */     }
/*     */     
/* 253 */     return str;
/*     */   }
/*     */ 
/*     */   
/*     */   public zh g_() {
/* 258 */     return this.p.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void q() {
/* 263 */     a((g_()).l, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f() {
/* 268 */     return (g_()).y;
/*     */   }
/*     */ 
/*     */   
/*     */   public l b(l ☃) {
/* 273 */     ☃ = super.b(☃);
/*     */     
/* 275 */     ☃.g().a("Is Modded", () -> (String)o().orElse("Unknown (can't tell)"));
/* 276 */     ☃.g().a("Type", () -> "Dedicated Server (map_server.txt)");
/*     */     
/* 278 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<String> o() {
/* 283 */     String ☃ = getServerModName();
/* 284 */     if (!"vanilla".equals(☃)) {
/* 285 */       return Optional.of("Definitely; Server brand changed to '" + ☃ + "'");
/*     */     }
/*     */     
/* 288 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 293 */     if (this.r != null) {
/* 294 */       this.r.close();
/*     */     }
/*     */     
/* 297 */     if (this.q != null) {
/* 298 */       this.q.b();
/*     */     }
/*     */     
/* 301 */     if (this.o != null) {
/* 302 */       this.o.b();
/*     */     }
/*     */     
/* 305 */     if (this.m != null) {
/* 306 */       this.m.b();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(BooleanSupplier ☃) {
/* 312 */     super.b(☃);
/* 313 */     bb();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean C() {
/* 318 */     return (g_()).z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apc ☃) {
/* 323 */     ☃.a("whitelist_enabled", Boolean.valueOf(bc().o()));
/* 324 */     ☃.a("whitelist_count", Integer.valueOf((bc().j()).length));
/* 325 */     super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String ☃, db db1) {
/* 334 */     this.l.add(new vo(☃, db1));
/*     */   }
/*     */   
/*     */   public void bb() {
/* 338 */     while (!this.l.isEmpty()) {
/* 339 */       vo ☃ = this.l.remove(0);
/* 340 */       aD().a(☃.b, ☃.a);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 346 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 351 */     return (g_()).I;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l() {
/* 356 */     return (g_()).C;
/*     */   }
/*     */ 
/*     */   
/*     */   public zf bc() {
/* 361 */     return (zf)super.ae();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n() {
/* 366 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String h_() {
/* 371 */     return u();
/*     */   }
/*     */ 
/*     */   
/*     */   public int p() {
/* 376 */     return M();
/*     */   }
/*     */ 
/*     */   
/*     */   public String i_() {
/* 381 */     return ab();
/*     */   }
/*     */   
/*     */   public void bd() {
/* 385 */     if (this.q == null) {
/* 386 */       this.q = zm.a(this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ah() {
/* 392 */     return (this.q != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bru ☃, boolean bool, int i) {
/* 397 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m() {
/* 402 */     return (g_()).D;
/*     */   }
/*     */ 
/*     */   
/*     */   public int ak() {
/* 407 */     return (g_()).E;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aag ☃, fx fx1, bfw bfw1) {
/* 412 */     if (☃.Y() != brx.g) {
/* 413 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 417 */     if (bc().k().c()) {
/* 418 */       return false;
/*     */     }
/* 420 */     if (bc().h(bfw1.eA())) {
/* 421 */       return false;
/*     */     }
/* 423 */     if (ak() <= 0) {
/* 424 */       return false;
/*     */     }
/*     */     
/* 427 */     fx fx2 = ☃.u();
/* 428 */     int i = afm.a(fx1.u() - fx2.u());
/* 429 */     int j = afm.a(fx1.w() - fx2.w());
/* 430 */     int k = Math.max(i, j);
/*     */     
/* 432 */     return (k <= ak());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean am() {
/* 437 */     return (g_()).R;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 442 */     return (g_()).F;
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 447 */     return (g_()).G;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d(int ☃) {
/* 452 */     super.d(☃);
/* 453 */     this.p.a(zh1 -> (zh)zh1.U.a(aY(), Integer.valueOf(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 458 */     return (g_()).M;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean R_() {
/* 463 */     return (g_()).N;
/*     */   }
/*     */ 
/*     */   
/*     */   public int au() {
/* 468 */     return (g_()).O;
/*     */   }
/*     */ 
/*     */   
/*     */   public int ax() {
/* 473 */     return (g_()).L;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean be() {
/* 479 */     boolean bool1 = false;
/* 480 */     int ☃ = 0;
/* 481 */     while (!bool1 && ☃ <= 2) {
/* 482 */       if (☃ > 0) {
/* 483 */         j.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
/* 484 */         bo();
/*     */       } 
/* 486 */       bool1 = act.a(this);
/* 487 */       ☃++;
/*     */     } 
/*     */     
/* 490 */     boolean bool2 = false;
/* 491 */     ☃ = 0;
/* 492 */     while (!bool2 && ☃ <= 2) {
/* 493 */       if (☃ > 0) {
/* 494 */         j.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
/* 495 */         bo();
/*     */       } 
/* 497 */       bool2 = act.b(this);
/* 498 */       ☃++;
/*     */     } 
/*     */     
/* 501 */     boolean bool3 = false;
/* 502 */     ☃ = 0;
/* 503 */     while (!bool3 && ☃ <= 2) {
/* 504 */       if (☃ > 0) {
/* 505 */         j.warn("Encountered a problem while converting the op list, retrying in a few seconds");
/* 506 */         bo();
/*     */       } 
/* 508 */       bool3 = act.c(this);
/* 509 */       ☃++;
/*     */     } 
/*     */     
/* 512 */     boolean bool4 = false;
/* 513 */     ☃ = 0;
/* 514 */     while (!bool4 && ☃ <= 2) {
/* 515 */       if (☃ > 0) {
/* 516 */         j.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
/* 517 */         bo();
/*     */       } 
/* 519 */       bool4 = act.d(this);
/* 520 */       ☃++;
/*     */     } 
/*     */     
/* 523 */     boolean bool5 = false;
/* 524 */     ☃ = 0;
/* 525 */     while (!bool5 && ☃ <= 2) {
/* 526 */       if (☃ > 0) {
/* 527 */         j.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
/* 528 */         bo();
/*     */       } 
/* 530 */       bool5 = act.a(this);
/* 531 */       ☃++;
/*     */     } 
/*     */     
/* 534 */     return (bool1 || bool2 || bool3 || bool4 || bool5);
/*     */   }
/*     */   
/*     */   private void bo() {
/*     */     try {
/* 539 */       Thread.sleep(5000L);
/* 540 */     } catch (InterruptedException ☃) {
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   public long bf() {
/* 546 */     return (g_()).H;
/*     */   }
/*     */ 
/*     */   
/*     */   public String j_() {
/* 551 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(String ☃) {
/* 556 */     this.n.d();
/* 557 */     g(() -> aD().a(this.n.f(), ☃));
/* 558 */     return this.n.e();
/*     */   }
/*     */   
/*     */   public void j(boolean ☃) {
/* 562 */     this.p.a(zh1 -> (zh)zh1.V.a(aY(), Boolean.valueOf(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void t() {
/* 567 */     super.t();
/* 568 */     x.h();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(GameProfile ☃) {
/* 573 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(int ☃) {
/* 578 */     return (g_()).S * ☃ / 100;
/*     */   }
/*     */ 
/*     */   
/*     */   public String k_() {
/* 583 */     return this.d.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aV() {
/* 588 */     return (this.p.a()).P;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public abc a(aah ☃) {
/* 594 */     if (this.r != null) {
/* 595 */       return this.r.a(☃.eA());
/*     */     }
/* 597 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */