/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.common.io.Files;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.reflect.TypeToken;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */ public class dkd
/*     */ {
/*  46 */   private static final Logger aX = LogManager.getLogger();
/*  47 */   private static final Gson aY = new Gson();
/*  48 */   private static final TypeToken<List<String>> aZ = new TypeToken<List<String>>()
/*     */     {
/*     */     
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  57 */   private static final Splitter ba = Splitter.on(':').limit(2);
/*     */   
/*  59 */   public double a = 0.5D;
/*  60 */   public int b = -1;
/*  61 */   public float c = 1.0F;
/*  62 */   public int d = 120;
/*  63 */   public djn e = djn.c;
/*  64 */   public djt f = djt.b;
/*  65 */   public djh g = djh.c;
/*  66 */   public List<String> h = Lists.newArrayList();
/*  67 */   public List<String> i = Lists.newArrayList();
/*  68 */   public bfu j = bfu.a;
/*  69 */   public double k = 1.0D;
/*  70 */   public double l = 0.0D;
/*  71 */   public double m = 0.5D;
/*     */   @Nullable
/*     */   public String n;
/*     */   public boolean o;
/*     */   public boolean p;
/*     */   public boolean q = true;
/*  77 */   private final Set<bfx> bb = Sets.newHashSet((Object[])bfx.values());
/*  78 */   public aqi r = aqi.b;
/*     */   public int s;
/*     */   public int t;
/*     */   public boolean u = true;
/*  82 */   public double v = 1.0D;
/*  83 */   public double w = 1.0D;
/*  84 */   public double x = 0.44366195797920227D;
/*  85 */   public double y = 1.0D;
/*  86 */   public double z = 0.0D;
/*  87 */   public int A = 4;
/*  88 */   private final Map<adr, Float> bc = Maps.newEnumMap(adr.class);
/*     */   public boolean B = true;
/*  90 */   public dji C = dji.b;
/*  91 */   public eog D = eog.a;
/*     */   public boolean E = false;
/*  93 */   public int F = 2;
/*  94 */   public double G = 1.0D;
/*     */   public boolean H = true;
/*  96 */   public int I = 1;
/*     */   
/*     */   public boolean J = true;
/*     */   
/*     */   public boolean K = true;
/*     */   public boolean L = true;
/*     */   public boolean M = true;
/*     */   public boolean N = true;
/*     */   public boolean O = true;
/*     */   public boolean P = true;
/*     */   public boolean Q;
/*     */   public boolean R;
/*     */   public boolean S;
/*     */   public boolean T = true;
/*     */   public boolean U;
/*     */   public boolean V = true;
/*     */   public boolean W;
/*     */   public boolean X = true;
/*     */   public boolean Y;
/*     */   public boolean Z;
/*     */   public boolean aa = true;
/*     */   public boolean ab;
/*     */   public boolean ac;
/*     */   public boolean ad;
/*     */   public boolean ae = true;
/* 121 */   public final djw af = new djw("key.forward", 87, "key.categories.movement");
/* 122 */   public final djw ag = new djw("key.left", 65, "key.categories.movement");
/* 123 */   public final djw ah = new djw("key.back", 83, "key.categories.movement");
/* 124 */   public final djw ai = new djw("key.right", 68, "key.categories.movement");
/* 125 */   public final djw aj = new djw("key.jump", 32, "key.categories.movement");
/*     */ 
/*     */   
/* 128 */   public final djw ak = new dkl("key.sneak", 340, "key.categories.movement", () -> this.ab);
/* 129 */   public final djw al = new dkl("key.sprint", 341, "key.categories.movement", () -> this.ac);
/*     */   
/* 131 */   public final djw am = new djw("key.inventory", 69, "key.categories.inventory");
/* 132 */   public final djw an = new djw("key.swapOffhand", 70, "key.categories.inventory");
/* 133 */   public final djw ao = new djw("key.drop", 81, "key.categories.inventory");
/*     */   
/* 135 */   public final djw ap = new djw("key.use", deo.b.c, 1, "key.categories.gameplay");
/* 136 */   public final djw aq = new djw("key.attack", deo.b.c, 0, "key.categories.gameplay");
/* 137 */   public final djw ar = new djw("key.pickItem", deo.b.c, 2, "key.categories.gameplay");
/*     */   
/* 139 */   public final djw as = new djw("key.chat", 84, "key.categories.multiplayer");
/* 140 */   public final djw at = new djw("key.playerlist", 258, "key.categories.multiplayer");
/* 141 */   public final djw au = new djw("key.command", 47, "key.categories.multiplayer");
/* 142 */   public final djw av = new djw("key.socialInteractions", 80, "key.categories.multiplayer");
/*     */   
/* 144 */   public final djw aw = new djw("key.screenshot", 291, "key.categories.misc");
/* 145 */   public final djw ax = new djw("key.togglePerspective", 294, "key.categories.misc");
/* 146 */   public final djw ay = new djw("key.smoothCamera", deo.a.b(), "key.categories.misc");
/* 147 */   public final djw az = new djw("key.fullscreen", 300, "key.categories.misc");
/* 148 */   public final djw aA = new djw("key.spectatorOutlines", deo.a.b(), "key.categories.misc");
/* 149 */   public final djw aB = new djw("key.advancements", 76, "key.categories.misc");
/*     */   
/* 151 */   public final djw[] aC = new djw[] { new djw("key.hotbar.1", 49, "key.categories.inventory"), new djw("key.hotbar.2", 50, "key.categories.inventory"), new djw("key.hotbar.3", 51, "key.categories.inventory"), new djw("key.hotbar.4", 52, "key.categories.inventory"), new djw("key.hotbar.5", 53, "key.categories.inventory"), new djw("key.hotbar.6", 54, "key.categories.inventory"), new djw("key.hotbar.7", 55, "key.categories.inventory"), new djw("key.hotbar.8", 56, "key.categories.inventory"), new djw("key.hotbar.9", 57, "key.categories.inventory") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 162 */   public final djw aD = new djw("key.saveToolbarActivator", 67, "key.categories.creative");
/* 163 */   public final djw aE = new djw("key.loadToolbarActivator", 88, "key.categories.creative");
/*     */   
/* 165 */   public final djw[] aF = (djw[])ArrayUtils.addAll((Object[])new djw[] { this.aq, this.ap, this.af, this.ag, this.ah, this.ai, this.aj, this.ak, this.al, this.ao, this.am, this.as, this.at, this.ar, this.au, this.av, this.aw, this.ax, this.ay, this.az, this.aA, this.an, this.aD, this.aE, this.aB }, (Object[])this.aC);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected djz aG;
/*     */ 
/*     */ 
/*     */   
/*     */   private final File bd;
/*     */ 
/*     */ 
/*     */   
/* 178 */   public aor aH = aor.c;
/*     */   public boolean aI;
/* 180 */   private djl be = djl.a;
/*     */   public boolean aJ;
/*     */   public boolean aK;
/*     */   public boolean aL;
/* 184 */   public String aM = "";
/*     */   
/*     */   public boolean aN;
/* 187 */   public double aO = 70.0D;
/* 188 */   public float aP = 1.0F;
/* 189 */   public float aQ = 1.0F;
/*     */   public double aR;
/*     */   public int aS;
/* 192 */   public dke aT = dke.a;
/* 193 */   public dkb aU = dkb.a;
/* 194 */   public String aV = "en_us";
/*     */   
/*     */   public boolean aW;
/*     */   
/*     */   public dkd(djz ☃, File file) {
/* 199 */     this.aG = ☃;
/* 200 */     this.bd = new File(file, "options.txt");
/*     */     
/* 202 */     if (☃.S() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
/* 203 */       dkc.q.a(32.0F);
/*     */     } else {
/* 205 */       dkc.q.a(16.0F);
/*     */     } 
/* 207 */     this.b = ☃.S() ? 12 : 8;
/*     */ 
/*     */     
/* 210 */     this.aW = (x.i() == x.b.c);
/*     */     
/* 212 */     a();
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 216 */     return this.X ? ☃ : (float)this.m;
/*     */   }
/*     */   
/*     */   public int b(float ☃) {
/* 220 */     return (int)(a(☃) * 255.0F) << 24 & 0xFF000000;
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/* 224 */     return this.X ? ☃ : ((int)(this.m * 255.0D) << 24 & 0xFF000000);
/*     */   }
/*     */   
/*     */   public void a(djw ☃, deo.a a1) {
/* 228 */     ☃.b(a1);
/* 229 */     b();
/*     */   }
/*     */   
/*     */   public void a() {
/*     */     try {
/* 234 */       if (!this.bd.exists()) {
/*     */         return;
/*     */       }
/* 237 */       this.bc.clear();
/*     */       
/* 239 */       md ☃ = new md();
/* 240 */       try (BufferedReader ☃ = Files.newReader(this.bd, Charsets.UTF_8)) {
/* 241 */         bufferedReader.lines().forEach(str -> {
/*     */               try {
/*     */                 Iterator<String> iterator = ba.split(str).iterator();
/*     */                 ☃.a(iterator.next(), iterator.next());
/* 245 */               } catch (Exception exception) {
/*     */                 aX.warn("Skipping bad option: {}", str);
/*     */               } 
/*     */             });
/*     */       } 
/*     */       
/* 251 */       md md1 = a(☃);
/*     */       
/* 253 */       if (!md1.e("graphicsMode") && md1.e("fancyGraphics"))
/*     */       {
/* 255 */         if ("true".equals(md1.l("fancyGraphics"))) {
/* 256 */           this.f = djt.b;
/*     */         } else {
/* 258 */           this.f = djt.a;
/*     */         } 
/*     */       }
/*     */       
/* 262 */       for (String str1 : md1.d()) {
/* 263 */         String str2 = md1.l(str1);
/*     */         
/*     */         try {
/* 266 */           if ("autoJump".equals(str1)) {
/* 267 */             dkc.E.a(this, str2);
/*     */           }
/* 269 */           if ("autoSuggestions".equals(str1)) {
/* 270 */             dkc.F.a(this, str2);
/*     */           }
/* 272 */           if ("chatColors".equals(str1)) {
/* 273 */             dkc.H.a(this, str2);
/*     */           }
/* 275 */           if ("chatLinks".equals(str1)) {
/* 276 */             dkc.I.a(this, str2);
/*     */           }
/* 278 */           if ("chatLinksPrompt".equals(str1)) {
/* 279 */             dkc.J.a(this, str2);
/*     */           }
/* 281 */           if ("enableVsync".equals(str1)) {
/* 282 */             dkc.L.a(this, str2);
/*     */           }
/* 284 */           if ("entityShadows".equals(str1)) {
/* 285 */             dkc.M.a(this, str2);
/*     */           }
/* 287 */           if ("forceUnicodeFont".equals(str1)) {
/* 288 */             dkc.N.a(this, str2);
/*     */           }
/* 290 */           if ("discrete_mouse_scroll".equals(str1)) {
/* 291 */             dkc.K.a(this, str2);
/*     */           }
/* 293 */           if ("invertYMouse".equals(str1)) {
/* 294 */             dkc.O.a(this, str2);
/*     */           }
/* 296 */           if ("realmsNotifications".equals(str1)) {
/* 297 */             dkc.P.a(this, str2);
/*     */           }
/* 299 */           if ("reducedDebugInfo".equals(str1)) {
/* 300 */             dkc.Q.a(this, str2);
/*     */           }
/* 302 */           if ("showSubtitles".equals(str1)) {
/* 303 */             dkc.R.a(this, str2);
/*     */           }
/* 305 */           if ("snooperEnabled".equals(str1)) {
/* 306 */             dkc.S.a(this, str2);
/*     */           }
/* 308 */           if ("touchscreen".equals(str1)) {
/* 309 */             dkc.V.a(this, str2);
/*     */           }
/* 311 */           if ("fullscreen".equals(str1)) {
/* 312 */             dkc.W.a(this, str2);
/*     */           }
/* 314 */           if ("bobView".equals(str1)) {
/* 315 */             dkc.X.a(this, str2);
/*     */           }
/* 317 */           if ("toggleCrouch".equals(str1)) {
/* 318 */             this.ab = "true".equals(str2);
/*     */           }
/* 320 */           if ("toggleSprint".equals(str1)) {
/* 321 */             this.ac = "true".equals(str2);
/*     */           }
/*     */           
/* 324 */           if ("mouseSensitivity".equals(str1)) {
/* 325 */             this.a = a(str2);
/*     */           }
/* 327 */           if ("fov".equals(str1)) {
/* 328 */             this.aO = (a(str2) * 40.0F + 70.0F);
/*     */           }
/* 330 */           if ("screenEffectScale".equals(str1)) {
/* 331 */             this.aP = a(str2);
/*     */           }
/* 333 */           if ("fovEffectScale".equals(str1)) {
/* 334 */             this.aQ = a(str2);
/*     */           }
/* 336 */           if ("gamma".equals(str1)) {
/* 337 */             this.aR = a(str2);
/*     */           }
/* 339 */           if ("renderDistance".equals(str1)) {
/* 340 */             this.b = Integer.parseInt(str2);
/*     */           }
/* 342 */           if ("entityDistanceScaling".equals(str1)) {
/* 343 */             this.c = Float.parseFloat(str2);
/*     */           }
/* 345 */           if ("guiScale".equals(str1)) {
/* 346 */             this.aS = Integer.parseInt(str2);
/*     */           }
/* 348 */           if ("particles".equals(str1)) {
/* 349 */             this.aT = dke.a(Integer.parseInt(str2));
/*     */           }
/* 351 */           if ("maxFps".equals(str1)) {
/* 352 */             this.d = Integer.parseInt(str2);
/* 353 */             if (this.aG.aD() != null) {
/* 354 */               this.aG.aD().a(this.d);
/*     */             }
/*     */           } 
/* 357 */           if ("difficulty".equals(str1)) {
/* 358 */             this.aH = aor.a(Integer.parseInt(str2));
/*     */           }
/* 360 */           if ("graphicsMode".equals(str1)) {
/* 361 */             this.f = djt.a(Integer.parseInt(str2));
/*     */           }
/* 363 */           if ("tutorialStep".equals(str1)) {
/* 364 */             this.D = eog.a(str2);
/*     */           }
/* 366 */           if ("ao".equals(str1))
/*     */           {
/* 368 */             if ("true".equals(str2)) {
/* 369 */               this.g = djh.c;
/* 370 */             } else if ("false".equals(str2)) {
/* 371 */               this.g = djh.a;
/*     */             } else {
/* 373 */               this.g = djh.a(Integer.parseInt(str2));
/*     */             } 
/*     */           }
/* 376 */           if ("renderClouds".equals(str1)) {
/* 377 */             if ("true".equals(str2)) {
/* 378 */               this.e = djn.c;
/* 379 */             } else if ("false".equals(str2)) {
/* 380 */               this.e = djn.a;
/* 381 */             } else if ("fast".equals(str2)) {
/* 382 */               this.e = djn.b;
/*     */             } 
/*     */           }
/* 385 */           if ("attackIndicator".equals(str1)) {
/* 386 */             this.C = dji.a(Integer.parseInt(str2));
/*     */           }
/* 388 */           if ("resourcePacks".equals(str1)) {
/* 389 */             this.h = afd.<List<String>>a(aY, str2, aZ);
/* 390 */             if (this.h == null) {
/* 391 */               this.h = Lists.newArrayList();
/*     */             }
/*     */           } 
/* 394 */           if ("incompatibleResourcePacks".equals(str1)) {
/* 395 */             this.i = afd.<List<String>>a(aY, str2, aZ);
/* 396 */             if (this.i == null) {
/* 397 */               this.i = Lists.newArrayList();
/*     */             }
/*     */           } 
/* 400 */           if ("lastServer".equals(str1)) {
/* 401 */             this.aM = str2;
/*     */           }
/* 403 */           if ("lang".equals(str1)) {
/* 404 */             this.aV = str2;
/*     */           }
/* 406 */           if ("chatVisibility".equals(str1)) {
/* 407 */             this.j = bfu.a(Integer.parseInt(str2));
/*     */           }
/* 409 */           if ("chatOpacity".equals(str1)) {
/* 410 */             this.k = a(str2);
/*     */           }
/* 412 */           if ("chatLineSpacing".equals(str1)) {
/* 413 */             this.l = a(str2);
/*     */           }
/* 415 */           if ("textBackgroundOpacity".equals(str1)) {
/* 416 */             this.m = a(str2);
/*     */           }
/* 418 */           if ("backgroundForChatOnly".equals(str1)) {
/* 419 */             this.X = "true".equals(str2);
/*     */           }
/* 421 */           if ("fullscreenResolution".equals(str1)) {
/* 422 */             this.n = str2;
/*     */           }
/* 424 */           if ("hideServerAddress".equals(str1)) {
/* 425 */             this.o = "true".equals(str2);
/*     */           }
/* 427 */           if ("advancedItemTooltips".equals(str1)) {
/* 428 */             this.p = "true".equals(str2);
/*     */           }
/* 430 */           if ("pauseOnLostFocus".equals(str1)) {
/* 431 */             this.q = "true".equals(str2);
/*     */           }
/* 433 */           if ("overrideHeight".equals(str1)) {
/* 434 */             this.t = Integer.parseInt(str2);
/*     */           }
/* 436 */           if ("overrideWidth".equals(str1)) {
/* 437 */             this.s = Integer.parseInt(str2);
/*     */           }
/* 439 */           if ("heldItemTooltips".equals(str1)) {
/* 440 */             this.u = "true".equals(str2);
/*     */           }
/* 442 */           if ("chatHeightFocused".equals(str1)) {
/* 443 */             this.y = a(str2);
/*     */           }
/* 445 */           if ("chatDelay".equals(str1)) {
/* 446 */             this.z = a(str2);
/*     */           }
/* 448 */           if ("chatHeightUnfocused".equals(str1)) {
/* 449 */             this.x = a(str2);
/*     */           }
/* 451 */           if ("chatScale".equals(str1)) {
/* 452 */             this.v = a(str2);
/*     */           }
/* 454 */           if ("chatWidth".equals(str1)) {
/* 455 */             this.w = a(str2);
/*     */           }
/* 457 */           if ("mipmapLevels".equals(str1)) {
/* 458 */             this.A = Integer.parseInt(str2);
/*     */           }
/* 460 */           if ("useNativeTransport".equals(str1)) {
/* 461 */             this.B = "true".equals(str2);
/*     */           }
/* 463 */           if ("mainHand".equals(str1)) {
/* 464 */             this.r = "left".equals(str2) ? aqi.a : aqi.b;
/*     */           }
/* 466 */           if ("narrator".equals(str1)) {
/* 467 */             this.aU = dkb.a(Integer.parseInt(str2));
/*     */           }
/* 469 */           if ("biomeBlendRadius".equals(str1)) {
/* 470 */             this.F = Integer.parseInt(str2);
/*     */           }
/* 472 */           if ("mouseWheelSensitivity".equals(str1)) {
/* 473 */             this.G = a(str2);
/*     */           }
/* 475 */           if ("rawMouseInput".equals(str1)) {
/* 476 */             this.H = "true".equals(str2);
/*     */           }
/* 478 */           if ("glDebugVerbosity".equals(str1)) {
/* 479 */             this.I = Integer.parseInt(str2);
/*     */           }
/* 481 */           if ("skipMultiplayerWarning".equals(str1)) {
/* 482 */             this.ad = "true".equals(str2);
/*     */           }
/* 484 */           if ("hideMatchedNames".equals(str1)) {
/* 485 */             this.ae = "true".equals(str2);
/*     */           }
/* 487 */           if ("joinedFirstServer".equals(str1)) {
/* 488 */             this.E = "true".equals(str2);
/*     */           }
/* 490 */           if ("syncChunkWrites".equals(str1)) {
/* 491 */             this.aW = "true".equals(str2);
/*     */           }
/*     */           
/* 494 */           for (djw djw1 : this.aF) {
/* 495 */             if (str1.equals("key_" + djw1.g())) {
/* 496 */               djw1.b(deo.a(str2));
/*     */             }
/*     */           } 
/*     */ 
/*     */           
/* 501 */           for (adr adr : adr.values()) {
/* 502 */             if (str1.equals("soundCategory_" + adr.a())) {
/* 503 */               this.bc.put(adr, Float.valueOf(a(str2)));
/*     */             }
/*     */           } 
/*     */           
/* 507 */           for (bfx bfx : bfx.values()) {
/* 508 */             if (str1.equals("modelPart_" + bfx.c())) {
/* 509 */               a(bfx, "true".equals(str2));
/*     */             }
/*     */           } 
/* 512 */         } catch (Exception exception) {
/* 513 */           aX.warn("Skipping bad option: {}:{}", str1, str2);
/*     */         } 
/*     */       } 
/* 516 */       djw.c();
/* 517 */     } catch (Exception ☃) {
/* 518 */       aX.error("Failed to load options", ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private md a(md ☃) {
/* 523 */     int i = 0;
/*     */     try {
/* 525 */       i = Integer.parseInt(☃.l("version"));
/* 526 */     } catch (RuntimeException runtimeException) {}
/*     */ 
/*     */     
/* 529 */     return mp.a(this.aG.ai(), aga.e, ☃, i);
/*     */   }
/*     */   
/*     */   private static float a(String ☃) {
/* 533 */     if ("true".equals(☃)) {
/* 534 */       return 1.0F;
/*     */     }
/* 536 */     if ("false".equals(☃)) {
/* 537 */       return 0.0F;
/*     */     }
/* 539 */     return Float.parseFloat(☃);
/*     */   }
/*     */   
/*     */   public void b() {
/* 543 */     try (PrintWriter ☃ = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.bd), StandardCharsets.UTF_8))) {
/* 544 */       ☃.println("version:" + w.a().getWorldVersion());
/*     */       
/* 546 */       ☃.println("autoJump:" + dkc.E.b(this));
/* 547 */       ☃.println("autoSuggestions:" + dkc.F.b(this));
/* 548 */       ☃.println("chatColors:" + dkc.H.b(this));
/* 549 */       ☃.println("chatLinks:" + dkc.I.b(this));
/* 550 */       ☃.println("chatLinksPrompt:" + dkc.J.b(this));
/* 551 */       ☃.println("enableVsync:" + dkc.L.b(this));
/* 552 */       ☃.println("entityShadows:" + dkc.M.b(this));
/* 553 */       ☃.println("forceUnicodeFont:" + dkc.N.b(this));
/* 554 */       ☃.println("discrete_mouse_scroll:" + dkc.K.b(this));
/* 555 */       ☃.println("invertYMouse:" + dkc.O.b(this));
/* 556 */       ☃.println("realmsNotifications:" + dkc.P.b(this));
/* 557 */       ☃.println("reducedDebugInfo:" + dkc.Q.b(this));
/* 558 */       ☃.println("snooperEnabled:" + dkc.S.b(this));
/* 559 */       ☃.println("showSubtitles:" + dkc.R.b(this));
/* 560 */       ☃.println("touchscreen:" + dkc.V.b(this));
/* 561 */       ☃.println("fullscreen:" + dkc.W.b(this));
/* 562 */       ☃.println("bobView:" + dkc.X.b(this));
/* 563 */       ☃.println("toggleCrouch:" + this.ab);
/* 564 */       ☃.println("toggleSprint:" + this.ac);
/*     */       
/* 566 */       ☃.println("mouseSensitivity:" + this.a);
/* 567 */       ☃.println("fov:" + ((this.aO - 70.0D) / 40.0D));
/* 568 */       ☃.println("screenEffectScale:" + this.aP);
/* 569 */       ☃.println("fovEffectScale:" + this.aQ);
/* 570 */       ☃.println("gamma:" + this.aR);
/* 571 */       ☃.println("renderDistance:" + this.b);
/* 572 */       ☃.println("entityDistanceScaling:" + this.c);
/* 573 */       ☃.println("guiScale:" + this.aS);
/* 574 */       ☃.println("particles:" + this.aT.b());
/* 575 */       ☃.println("maxFps:" + this.d);
/* 576 */       ☃.println("difficulty:" + this.aH.a());
/* 577 */       ☃.println("graphicsMode:" + this.f.a());
/* 578 */       ☃.println("ao:" + this.g.a());
/* 579 */       ☃.println("biomeBlendRadius:" + this.F);
/*     */       
/* 581 */       switch (null.a[this.e.ordinal()]) {
/*     */         case 1:
/* 583 */           ☃.println("renderClouds:true");
/*     */           break;
/*     */         case 2:
/* 586 */           ☃.println("renderClouds:fast");
/*     */           break;
/*     */         case 3:
/* 589 */           ☃.println("renderClouds:false");
/*     */           break;
/*     */       } 
/*     */       
/* 593 */       ☃.println("resourcePacks:" + aY.toJson(this.h));
/* 594 */       ☃.println("incompatibleResourcePacks:" + aY.toJson(this.i));
/* 595 */       ☃.println("lastServer:" + this.aM);
/* 596 */       ☃.println("lang:" + this.aV);
/* 597 */       ☃.println("chatVisibility:" + this.j.a());
/* 598 */       ☃.println("chatOpacity:" + this.k);
/* 599 */       ☃.println("chatLineSpacing:" + this.l);
/* 600 */       ☃.println("textBackgroundOpacity:" + this.m);
/* 601 */       ☃.println("backgroundForChatOnly:" + this.X);
/* 602 */       if (this.aG.aD().f().isPresent()) {
/* 603 */         ☃.println("fullscreenResolution:" + ((dey)this.aG.aD().f().get()).g());
/*     */       }
/* 605 */       ☃.println("hideServerAddress:" + this.o);
/* 606 */       ☃.println("advancedItemTooltips:" + this.p);
/* 607 */       ☃.println("pauseOnLostFocus:" + this.q);
/* 608 */       ☃.println("overrideWidth:" + this.s);
/* 609 */       ☃.println("overrideHeight:" + this.t);
/* 610 */       ☃.println("heldItemTooltips:" + this.u);
/* 611 */       ☃.println("chatHeightFocused:" + this.y);
/* 612 */       ☃.println("chatDelay: " + this.z);
/* 613 */       ☃.println("chatHeightUnfocused:" + this.x);
/* 614 */       ☃.println("chatScale:" + this.v);
/* 615 */       ☃.println("chatWidth:" + this.w);
/* 616 */       ☃.println("mipmapLevels:" + this.A);
/* 617 */       ☃.println("useNativeTransport:" + this.B);
/* 618 */       ☃.println("mainHand:" + ((this.r == aqi.a) ? "left" : "right"));
/* 619 */       ☃.println("attackIndicator:" + this.C.a());
/* 620 */       ☃.println("narrator:" + this.aU.a());
/* 621 */       ☃.println("tutorialStep:" + this.D.a());
/* 622 */       ☃.println("mouseWheelSensitivity:" + this.G);
/* 623 */       ☃.println("rawMouseInput:" + dkc.p.b(this));
/* 624 */       ☃.println("glDebugVerbosity:" + this.I);
/* 625 */       ☃.println("skipMultiplayerWarning:" + this.ad);
/* 626 */       ☃.println("hideMatchedNames:" + this.ae);
/* 627 */       ☃.println("joinedFirstServer:" + this.E);
/* 628 */       ☃.println("syncChunkWrites:" + this.aW);
/*     */       
/* 630 */       for (djw djw1 : this.aF) {
/* 631 */         ☃.println("key_" + djw1.g() + ":" + djw1.l());
/*     */       }
/*     */       
/* 634 */       for (adr adr : adr.values()) {
/* 635 */         ☃.println("soundCategory_" + adr.a() + ":" + a(adr));
/*     */       }
/*     */       
/* 638 */       for (bfx bfx : bfx.values()) {
/* 639 */         ☃.println("modelPart_" + bfx.c() + ":" + this.bb.contains(bfx));
/*     */       }
/* 641 */     } catch (Exception ☃) {
/* 642 */       aX.error("Failed to save options", ☃);
/*     */     } 
/*     */     
/* 645 */     c();
/*     */   }
/*     */   
/*     */   public float a(adr ☃) {
/* 649 */     if (this.bc.containsKey(☃)) {
/* 650 */       return ((Float)this.bc.get(☃)).floatValue();
/*     */     }
/*     */     
/* 653 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public void a(adr ☃, float f) {
/* 657 */     this.bc.put(☃, Float.valueOf(f));
/* 658 */     this.aG.W().a(☃, f);
/*     */   }
/*     */   
/*     */   public void c() {
/* 662 */     if (this.aG.s != null) {
/* 663 */       int ☃ = 0;
/* 664 */       for (bfx bfx : this.bb) {
/* 665 */         ☃ |= bfx.a();
/*     */       }
/* 667 */       this.aG.s.e.a(new sg(this.aV, this.b, this.j, this.L, ☃, this.r));
/*     */     } 
/*     */   }
/*     */   
/*     */   public Set<bfx> d() {
/* 672 */     return (Set<bfx>)ImmutableSet.copyOf(this.bb);
/*     */   }
/*     */   
/*     */   public void a(bfx ☃, boolean bool) {
/* 676 */     if (bool) {
/* 677 */       this.bb.add(☃);
/*     */     } else {
/* 679 */       this.bb.remove(☃);
/*     */     } 
/* 681 */     c();
/*     */   }
/*     */   
/*     */   public void a(bfx ☃) {
/* 685 */     if (d().contains(☃)) {
/* 686 */       this.bb.remove(☃);
/*     */     } else {
/* 688 */       this.bb.add(☃);
/*     */     } 
/* 690 */     c();
/*     */   }
/*     */   
/*     */   public djn e() {
/* 694 */     if (this.b >= 4) {
/* 695 */       return this.e;
/*     */     }
/* 697 */     return djn.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f() {
/* 702 */     return this.B;
/*     */   }
/*     */   
/*     */   public void a(abw ☃) {
/* 706 */     Set<String> set = Sets.newLinkedHashSet();
/* 707 */     for (Iterator<String> iterator = this.h.iterator(); iterator.hasNext(); ) {
/* 708 */       String str = iterator.next();
/* 709 */       abu abu = ☃.a(str);
/*     */       
/* 711 */       if (abu == null && !str.startsWith("file/"))
/*     */       {
/* 713 */         abu = ☃.a("file/" + str);
/*     */       }
/*     */       
/* 716 */       if (abu == null) {
/* 717 */         aX.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", str);
/* 718 */         iterator.remove(); continue;
/* 719 */       }  if (!abu.c().a() && !this.i.contains(str)) {
/* 720 */         aX.warn("Removed resource pack {} from options because it is no longer compatible", str);
/* 721 */         iterator.remove(); continue;
/* 722 */       }  if (abu.c().a() && this.i.contains(str)) {
/* 723 */         aX.info("Removed resource pack {} from incompatibility list because it's now compatible", str);
/* 724 */         this.i.remove(str); continue;
/*     */       } 
/* 726 */       set.add(abu.e());
/*     */     } 
/*     */     
/* 729 */     ☃.a(set);
/*     */   }
/*     */   
/*     */   public djl g() {
/* 733 */     return this.be;
/*     */   }
/*     */   
/*     */   public void a(djl ☃) {
/* 737 */     this.be = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */