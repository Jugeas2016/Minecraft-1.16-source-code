/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class dkc
/*     */ {
/*     */   public static final dkf a;
/*     */   public static final dkf b;
/*     */   public static final dkf c;
/*     */   public static final dkf d;
/*     */   public static final dkf e;
/*     */   public static final dkf f;
/*     */   public static final dkf g;
/*     */   public static final dkf h;
/*     */   public static final dkf i;
/*     */   
/*     */   static {
/*  27 */     a = new dkf("options.biomeBlendRadius", 0.0D, 7.0D, 1.0F, ☃ -> Double.valueOf(☃.F), (☃, double_) -> {
/*     */           ☃.F = afm.a((int)double_.doubleValue(), 0, 7);
/*     */           (djz.C()).e.e();
/*     */         }(☃, dkf1) -> {
/*     */           double d = dkf1.a(☃);
/*     */           int i = (int)d * 2 + 1;
/*     */           return dkf1.a(new of("options.biomeBlendRadius." + i));
/*     */         });
/*  35 */     b = new dkf("options.chat.height.focused", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.y), (☃, double_) -> {
/*     */           ☃.y = double_.doubleValue();
/*     */           (djz.C()).j.c().a();
/*     */         }(☃, dkf1) -> {
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */           return dkf1.a(dlk.c(d));
/*     */         });
/*  42 */     c = new dkf("options.chat.height.unfocused", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.x), (☃, double_) -> {
/*     */           ☃.x = double_.doubleValue();
/*     */           (djz.C()).j.c().a();
/*     */         }(☃, dkf1) -> {
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */           return dkf1.a(dlk.c(d));
/*     */         });
/*  49 */     d = new dkf("options.chat.opacity", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.k), (☃, double_) -> {
/*     */           ☃.k = double_.doubleValue();
/*     */           (djz.C()).j.c().a();
/*     */         }(☃, dkf1) -> {
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */           return dkf1.c(d * 0.9D + 0.1D);
/*     */         });
/*  56 */     e = new dkf("options.chat.scale", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.v), (☃, double_) -> {
/*     */           ☃.v = double_.doubleValue();
/*     */           
/*     */           (djz.C()).j.c().a();
/*     */         }(☃, dkf1) -> {
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */           
/*     */           return (d == 0.0D) ? nq.a(dkf1.a(), false) : dkf1.c(d);
/*     */         });
/*     */     
/*  66 */     f = new dkf("options.chat.width", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.w), (☃, double_) -> {
/*     */           ☃.w = double_.doubleValue();
/*     */           
/*     */           (djz.C()).j.c().a();
/*     */         }(☃, dkf1) -> {
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */           return dkf1.a(dlk.b(d));
/*     */         });
/*  74 */     g = new dkf("options.chat.line_spacing", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.l), (☃, double_) -> ☃.l = double_.doubleValue(), (☃, dkf1) -> dkf1.c(dkf1.a(dkf1.a(☃))));
/*     */ 
/*     */ 
/*     */     
/*  78 */     h = new dkf("options.chat.delay_instant", 0.0D, 6.0D, 0.1F, ☃ -> Double.valueOf(☃.z), (☃, double_) -> ☃.z = double_.doubleValue(), (☃, dkf1) -> {
/*     */           double d = dkf1.a(☃);
/*     */ 
/*     */           
/*     */           return (d <= 0.0D) ? new of("options.chat.delay_none") : new of("options.chat.delay", new Object[] { String.format("%.1f", new Object[] { Double.valueOf(d) }) });
/*     */         });
/*     */ 
/*     */     
/*  86 */     i = new dkf("options.fov", 30.0D, 110.0D, 1.0F, ☃ -> Double.valueOf(☃.aO), (☃, double_) -> ☃.aO = double_.doubleValue(), (☃, dkf1) -> {
/*     */           double d = dkf1.a(☃);
/*     */           return (d == 70.0D) ? dkf1.a(new of("options.fov.min")) : ((d == dkf1.d()) ? dkf1.a(new of("options.fov.max")) : dkf1.c((int)d));
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  98 */   private static final nr Y = new of("options.fovEffectScale.tooltip"); public static final dkf j;
/*     */   static {
/* 100 */     j = new dkf("options.fovEffectScale", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(Math.pow(☃.aQ, 2.0D)), (☃, double_) -> ☃.aQ = afm.a(double_.doubleValue()), (☃, dkf1) -> {
/*     */           dkf1.a((djz.C()).g.b(Y, 200));
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */           return (d == 0.0D) ? dkf1.a(new of("options.fovEffectScale.off")) : dkf1.c(d);
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 110 */   private static final nr Z = new of("options.screenEffectScale.tooltip"); public static final dkf k; public static final dkf l; public static final dkf m; public static final dkf n; public static final dkf o; public static final djj p; public static final dkf q; public static final dkf r; public static final dkf s; public static final dkf t; public static final djp u; public static final djp v; public static final djp w;
/*     */   static {
/* 112 */     k = new dkf("options.screenEffectScale", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.aP), (☃, double_) -> ☃.aP = double_.floatValue(), (☃, dkf1) -> {
/*     */           dkf1.a((djz.C()).g.b(Z, 200));
/*     */ 
/*     */           
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */ 
/*     */           
/*     */           return (d == 0.0D) ? dkf1.a(new of("options.screenEffectScale.off")) : dkf1.c(d);
/*     */         });
/*     */     
/* 122 */     l = new dkf("options.framerateLimit", 10.0D, 260.0D, 10.0F, ☃ -> Double.valueOf(☃.d), (☃, double_) -> {
/*     */           ☃.d = (int)double_.doubleValue();
/*     */ 
/*     */           
/*     */           djz.C().aD().a(☃.d);
/*     */         }(☃, dkf1) -> {
/*     */           double d = dkf1.a(☃);
/*     */ 
/*     */           
/*     */           return (d == dkf1.d()) ? dkf1.a(new of("options.framerateLimit.max")) : dkf1.a(new of("options.framerate", new Object[] { Integer.valueOf((int)d) }));
/*     */         });
/*     */     
/* 134 */     m = new dkf("options.gamma", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.aR), (☃, double_) -> ☃.aR = double_.doubleValue(), (☃, dkf1) -> {
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           return (d == 0.0D) ? dkf1.a(new of("options.gamma.min")) : ((d == 1.0D) ? dkf1.a(new of("options.gamma.max")) : dkf1.b((int)(d * 100.0D)));
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 145 */     n = new dkf("options.mipmapLevels", 0.0D, 4.0D, 1.0F, ☃ -> Double.valueOf(☃.A), (☃, double_) -> ☃.A = (int)double_.doubleValue(), (☃, dkf1) -> {
/*     */           double d = dkf1.a(☃);
/*     */ 
/*     */ 
/*     */           
/*     */           return (d == 0.0D) ? nq.a(dkf1.a(), false) : dkf1.c((int)d);
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 155 */     o = new djy("options.mouseWheelSensitivity", 0.01D, 10.0D, 0.01F, ☃ -> Double.valueOf(☃.G), (☃, double_) -> ☃.G = double_.doubleValue(), (☃, dkf1) -> {
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */           
/*     */           return dkf1.a(new oe(String.format("%.2f", new Object[] { Double.valueOf(dkf1.b(d)) })));
/*     */         });
/* 160 */     p = new djj("options.rawMouseInput", ☃ -> ☃.H, (☃, bool) -> {
/*     */           ☃.H = bool.booleanValue();
/*     */           dez dez = djz.C().aD();
/*     */           if (dez != null) {
/*     */             dez.b(bool.booleanValue());
/*     */           }
/*     */         });
/* 167 */     q = new dkf("options.renderDistance", 2.0D, 16.0D, 1.0F, ☃ -> Double.valueOf(☃.b), (☃, double_) -> {
/*     */           ☃.b = (int)double_.doubleValue();
/*     */           (djz.C()).e.o();
/*     */         }(☃, dkf1) -> {
/*     */           double d = dkf1.a(☃);
/*     */           return dkf1.a(new of("options.chunks", new Object[] { Integer.valueOf((int)d) }));
/*     */         });
/* 174 */     r = new dkf("options.entityDistanceScaling", 0.5D, 5.0D, 0.25F, ☃ -> Double.valueOf(☃.c), (☃, double_) -> ☃.c = (float)double_.doubleValue(), (☃, dkf1) -> {
/*     */           double d = dkf1.a(☃);
/*     */           return dkf1.c(d);
/*     */         });
/* 178 */     s = new dkf("options.sensitivity", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.a), (☃, double_) -> ☃.a = double_.doubleValue(), (☃, dkf1) -> {
/*     */           double d = dkf1.a(dkf1.a(☃));
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           return (d == 0.0D) ? dkf1.a(new of("options.sensitivity.min")) : ((d == 1.0D) ? dkf1.a(new of("options.sensitivity.max")) : dkf1.c(2.0D * d));
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 189 */     t = new dkf("options.accessibility.text_background_opacity", 0.0D, 1.0D, 0.0F, ☃ -> Double.valueOf(☃.m), (☃, double_) -> {
/*     */           ☃.m = double_.doubleValue();
/*     */           
/*     */           (djz.C()).j.c().a();
/*     */         }(☃, dkf1) -> dkf1.c(dkf1.a(dkf1.a(☃))));
/* 194 */     u = new djp("options.ao", (☃, integer) -> {
/*     */           ☃.g = djh.a(☃.g.a() + integer.intValue());
/*     */           
/*     */           (djz.C()).e.e();
/*     */         }(☃, djp1) -> djp1.a(new of(☃.g.b())));
/* 199 */     v = new djp("options.attackIndicator", (☃, integer) -> ☃.C = dji.a(☃.C.a() + integer.intValue()), (☃, djp1) -> djp1.a(new of(☃.C.b())));
/*     */ 
/*     */     
/* 202 */     w = new djp("options.chat.visibility", (☃, integer) -> ☃.j = bfu.a((☃.j.a() + integer.intValue()) % 3), (☃, djp1) -> djp1.a(new of(☃.j.b())));
/*     */   }
/*     */   
/* 205 */   private static final nr aa = new of("options.graphics.fast.tooltip");
/* 206 */   private static final nr ab = new of("options.graphics.fabulous.tooltip", new Object[] { (new of("options.graphics.fabulous")).a(k.u) });
/* 207 */   private static final nr ac = new of("options.graphics.fancy.tooltip"); public static final djp x; public static final djp y; public static final djp z; public static final djp A; public static final djp B; public static final djp C; public static final djp D;
/*     */   static {
/* 209 */     x = new djp("options.graphics", (☃, integer) -> {
/*     */           djz djz = djz.C();
/*     */           eaa eaa = djz.V();
/*     */           if (☃.f == djt.b && eaa.b()) {
/*     */             eaa.d();
/*     */             return;
/*     */           } 
/*     */           ☃.f = ☃.f.c();
/*     */           if (☃.f == djt.c && (!dem.U() || eaa.h())) {
/*     */             ☃.f = djt.a;
/*     */           }
/*     */           djz.e.e();
/*     */         }(☃, djp1) -> {
/*     */           switch (null.a[☃.f.ordinal()]) {
/*     */             case 1:
/*     */               djp1.a((djz.C()).g.b(aa, 200));
/*     */               break;
/*     */ 
/*     */ 
/*     */             
/*     */             case 2:
/*     */               djp1.a((djz.C()).g.b(ac, 200));
/*     */               break;
/*     */ 
/*     */ 
/*     */             
/*     */             case 3:
/*     */               djp1.a((djz.C()).g.b(ab, 200));
/*     */               break;
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/*     */           nx nx = new of(☃.f.b());
/*     */           return (☃.f == djt.c) ? djp1.a(nx.a(k.u)) : djp1.a(nx);
/*     */         });
/* 245 */     y = new djp("options.guiScale", (☃, integer) -> ☃.aS = Integer.remainderUnsigned(☃.aS + integer.intValue(), djz.C().aD().a(0, djz.C().i()) + 1), (☃, djp1) -> (☃.aS == 0) ? djp1.a(new of("options.guiScale.auto")) : djp1.c(☃.aS));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 251 */     z = new djp("options.mainHand", (☃, integer) -> ☃.r = ☃.r.a(), (☃, djp1) -> djp1.a(☃.r.b()));
/*     */ 
/*     */     
/* 254 */     A = new djp("options.narrator", (☃, integer) -> {
/*     */           if (dkz.b.a()) {
/*     */             ☃.aU = dkb.a(☃.aU.a() + integer.intValue());
/*     */           } else {
/*     */             ☃.aU = dkb.a;
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/*     */           dkz.b.a(☃.aU);
/*     */         }(☃, djp1) -> dkz.b.a() ? djp1.a(☃.aU.b()) : djp1.a(new of("options.narrator.notavailable")));
/*     */ 
/*     */ 
/*     */     
/* 268 */     B = new djp("options.particles", (☃, integer) -> ☃.aT = dke.a(☃.aT.b() + integer.intValue()), (☃, djp1) -> djp1.a(new of(☃.aT.a())));
/*     */ 
/*     */     
/* 271 */     C = new djp("options.renderClouds", (☃, integer) -> {
/*     */           ☃.e = djn.a(☃.e.a() + integer.intValue());
/*     */           
/*     */           if (djz.A()) {
/*     */             deg deg = (djz.C()).e.u();
/*     */             if (deg != null) {
/*     */               deg.b(djz.a);
/*     */             }
/*     */           } 
/*     */         }(☃, djp1) -> djp1.a(new of(☃.e.b())));
/* 281 */     D = new djp("options.accessibility.text_background", (☃, integer) -> ☃.X = !☃.X, (☃, djp1) -> djp1.a(new of(☃.X ? "options.accessibility.text_background.chat" : "options.accessibility.text_background.everywhere")));
/*     */   }
/*     */   
/* 284 */   private static final nr ad = new of("options.hideMatchedNames.tooltip"); public static final djj E; public static final djj F; public static final djj G; public static final djj H; public static final djj I; public static final djj J; public static final djj K; public static final djj L; public static final djj M; public static final djj N;
/*     */   static {
/* 286 */     E = new djj("options.autoJump", ☃ -> ☃.J, (☃, bool) -> ☃.J = bool.booleanValue());
/* 287 */     F = new djj("options.autoSuggestCommands", ☃ -> ☃.K, (☃, bool) -> ☃.K = bool.booleanValue());
/* 288 */     G = new djj("options.hideMatchedNames", ad, ☃ -> ☃.ae, (☃, bool) -> ☃.ae = bool.booleanValue());
/* 289 */     H = new djj("options.chat.color", ☃ -> ☃.L, (☃, bool) -> ☃.L = bool.booleanValue());
/* 290 */     I = new djj("options.chat.links", ☃ -> ☃.M, (☃, bool) -> ☃.M = bool.booleanValue());
/* 291 */     J = new djj("options.chat.links.prompt", ☃ -> ☃.N, (☃, bool) -> ☃.N = bool.booleanValue());
/* 292 */     K = new djj("options.discrete_mouse_scroll", ☃ -> ☃.S, (☃, bool) -> ☃.S = bool.booleanValue());
/* 293 */     L = new djj("options.vsync", ☃ -> ☃.O, (☃, bool) -> {
/*     */           ☃.O = bool.booleanValue();
/*     */           if (djz.C().aD() != null) {
/*     */             djz.C().aD().a(☃.O);
/*     */           }
/*     */         });
/* 299 */     M = new djj("options.entityShadows", ☃ -> ☃.P, (☃, bool) -> ☃.P = bool.booleanValue());
/* 300 */     N = new djj("options.forceUnicodeFont", ☃ -> ☃.Q, (☃, bool) -> {
/*     */           ☃.Q = bool.booleanValue();
/*     */           djz djz = djz.C();
/*     */           if (djz.aD() != null) {
/*     */             djz.b(bool.booleanValue());
/*     */           }
/*     */         });
/* 307 */     O = new djj("options.invertMouse", ☃ -> ☃.R, (☃, bool) -> ☃.R = bool.booleanValue());
/* 308 */     P = new djj("options.realmsNotifications", ☃ -> ☃.T, (☃, bool) -> ☃.T = bool.booleanValue());
/* 309 */     Q = new djj("options.reducedDebugInfo", ☃ -> ☃.U, (☃, bool) -> ☃.U = bool.booleanValue());
/* 310 */     R = new djj("options.showSubtitles", ☃ -> ☃.W, (☃, bool) -> ☃.W = bool.booleanValue());
/* 311 */     S = new djj("options.snooper", ☃ -> {
/*     */           if (☃.V); return false;
/*     */         }(☃, bool) -> ☃.V = bool.booleanValue());
/* 314 */     T = new djp("key.sneak", (☃, integer) -> ☃.ab = !☃.ab, (☃, djp1) -> djp1.a(new of(☃.ab ? "options.key.toggle" : "options.key.hold")));
/*     */ 
/*     */     
/* 317 */     U = new djp("key.sprint", (☃, integer) -> ☃.ac = !☃.ac, (☃, djp1) -> djp1.a(new of(☃.ac ? "options.key.toggle" : "options.key.hold")));
/*     */ 
/*     */     
/* 320 */     V = new djj("options.touchscreen", ☃ -> ☃.Y, (☃, bool) -> ☃.Y = bool.booleanValue());
/* 321 */     W = new djj("options.fullscreen", ☃ -> ☃.Z, (☃, bool) -> {
/*     */           ☃.Z = bool.booleanValue();
/*     */           djz djz = djz.C();
/*     */           if (djz.aD() != null && djz.aD().j() != ☃.Z) {
/*     */             djz.aD().h();
/*     */             ☃.Z = djz.aD().j();
/*     */           } 
/*     */         });
/* 329 */     X = new djj("options.viewBobbing", ☃ -> ☃.aa, (☃, bool) -> ☃.aa = bool.booleanValue());
/*     */   }
/*     */   public static final djj O; public static final djj P; public static final djj Q; public static final djj R; public static final djj S; public static final djp T; public static final djp U; public static final djj V; public static final djj W; public static final djj X; private final nr ae;
/* 332 */   private Optional<List<afa>> af = Optional.empty();
/*     */   
/*     */   public dkc(String ☃) {
/* 335 */     this.ae = new of(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected nr a() {
/* 341 */     return this.ae;
/*     */   }
/*     */   
/*     */   public void a(List<afa> ☃) {
/* 345 */     this.af = Optional.of(☃);
/*     */   }
/*     */   
/*     */   public Optional<List<afa>> b() {
/* 349 */     return this.af;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected nr a(int ☃) {
/* 355 */     return new of("options.pixel_value", new Object[] { a(), Integer.valueOf(☃) });
/*     */   }
/*     */   
/*     */   protected nr c(double ☃) {
/* 359 */     return new of("options.percent_value", new Object[] { a(), Integer.valueOf((int)(☃ * 100.0D)) });
/*     */   }
/*     */   
/*     */   protected nr b(int ☃) {
/* 363 */     return new of("options.percent_add_value", new Object[] { a(), Integer.valueOf(☃) });
/*     */   }
/*     */   
/*     */   protected nr a(nr ☃) {
/* 367 */     return new of("options.generic_value", new Object[] { a(), ☃ });
/*     */   }
/*     */   
/*     */   protected nr c(int ☃) {
/* 371 */     return a(new oe(Integer.toString(☃)));
/*     */   }
/*     */   
/*     */   public abstract dlh a(dkd paramdkd, int paramInt1, int paramInt2, int paramInt3);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */