/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dik
/*     */   extends eoo
/*     */ {
/*  19 */   public static final nr[] a = new nr[] { new of("options.difficulty.peaceful"), new of("options.difficulty.easy"), new of("options.difficulty.normal"), new of("options.difficulty.hard") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  25 */   public static final nr[] b = new nr[] { new of("selectWorld.gameMode.survival"), new of("selectWorld.gameMode.creative"), new of("selectWorld.gameMode.adventure") };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  30 */   private static final nr p = new of("mco.configure.world.on");
/*  31 */   private static final nr q = new of("mco.configure.world.off");
/*  32 */   private static final nr r = new of("selectWorld.gameMode");
/*  33 */   private static final nr s = new of("mco.configure.world.edit.slot.name");
/*     */   
/*     */   private dlq t;
/*     */   
/*     */   protected final dhs c;
/*     */   
/*     */   private int u;
/*     */   
/*     */   private int v;
/*     */   
/*     */   private int w;
/*     */   
/*     */   private final dgw x;
/*     */   
/*     */   private final dgq.c y;
/*     */   private final int z;
/*     */   private int A;
/*     */   private int B;
/*     */   private Boolean C;
/*     */   private Boolean D;
/*     */   private Boolean E;
/*     */   private Boolean F;
/*     */   private Integer G;
/*     */   private Boolean H;
/*     */   private Boolean I;
/*     */   private dlj J;
/*     */   private dlj K;
/*     */   private dlj L;
/*     */   private dlj M;
/*     */   private a N;
/*     */   private dlj O;
/*     */   private dlj P;
/*     */   private eom Q;
/*     */   private eom R;
/*     */   
/*     */   public dik(dhs ☃, dgw dgw1, dgq.c c1, int i) {
/*  69 */     this.c = ☃;
/*  70 */     this.x = dgw1;
/*  71 */     this.y = c1;
/*  72 */     this.z = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  77 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  82 */     this.t.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  87 */     if (☃ == 256) {
/*  88 */       this.i.a(this.c);
/*  89 */       return true;
/*     */     } 
/*  91 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  96 */     this.v = 170;
/*  97 */     this.u = this.k / 2 - this.v;
/*  98 */     this.w = this.k / 2 + 10;
/*     */     
/* 100 */     this.A = this.x.h.intValue();
/* 101 */     this.B = this.x.i.intValue();
/*     */     
/* 103 */     if (this.y == dgq.c.a) {
/* 104 */       this.C = this.x.a;
/* 105 */       this.G = this.x.e;
/* 106 */       this.I = this.x.g;
/*     */       
/* 108 */       this.E = this.x.b;
/* 109 */       this.F = this.x.c;
/* 110 */       this.D = this.x.d;
/* 111 */       this.H = this.x.f;
/*     */     } else {
/*     */       nr ☃;
/* 114 */       if (this.y == dgq.c.c) {
/* 115 */         ☃ = new of("mco.configure.world.edit.subscreen.adventuremap");
/* 116 */       } else if (this.y == dgq.c.e) {
/* 117 */         ☃ = new of("mco.configure.world.edit.subscreen.inspiration");
/*     */       } else {
/* 119 */         ☃ = new of("mco.configure.world.edit.subscreen.experience");
/*     */       } 
/* 121 */       this.R = new eom(☃, this.k / 2, 26, 16711680);
/*     */       
/* 123 */       this.C = Boolean.valueOf(true);
/* 124 */       this.G = Integer.valueOf(0);
/* 125 */       this.I = Boolean.valueOf(false);
/*     */       
/* 127 */       this.E = Boolean.valueOf(true);
/* 128 */       this.F = Boolean.valueOf(true);
/* 129 */       this.D = Boolean.valueOf(true);
/* 130 */       this.H = Boolean.valueOf(true);
/*     */     } 
/*     */     
/* 133 */     this.t = new dlq(this.i.g, this.u + 2, j(1), this.v - 4, 20, null, new of("mco.configure.world.edit.slot.name"));
/* 134 */     this.t.k(10);
/* 135 */     this.t.a(this.x.a(this.z));
/* 136 */     c(this.t);
/*     */     
/* 138 */     this.J = a(new dlj(this.w, j(1), this.v, 20, k(), ☃ -> {
/*     */             this.C = Boolean.valueOf(!this.C.booleanValue());
/*     */             
/*     */             ☃.a(k());
/*     */           }));
/* 143 */     a(new dlj(this.u, j(3), this.v, 20, i(), ☃ -> {
/*     */             this.B = (this.B + 1) % b.length;
/*     */             ☃.a(i());
/*     */           }));
/* 147 */     this.K = a(new dlj(this.w, j(3), this.v, 20, l(), ☃ -> {
/*     */             this.E = Boolean.valueOf(!this.E.booleanValue());
/*     */             
/*     */             ☃.a(l());
/*     */           }));
/* 152 */     a(new dlj(this.u, j(5), this.v, 20, h(), ☃ -> {
/*     */             this.A = (this.A + 1) % a.length;
/*     */             
/*     */             ☃.a(h());
/*     */             if (this.y == dgq.c.a) {
/*     */               this.L.o = (this.A != 0);
/*     */               this.L.a(m());
/*     */             } 
/*     */           }));
/* 161 */     this.L = a(new dlj(this.w, j(5), this.v, 20, m(), ☃ -> {
/*     */             this.F = Boolean.valueOf(!this.F.booleanValue());
/*     */             
/*     */             ☃.a(m());
/*     */           }));
/* 166 */     this.N = a(new a(this, this.u, j(7), this.v, this.G.intValue(), 0.0F, 16.0F));
/* 167 */     this.M = a(new dlj(this.w, j(7), this.v, 20, n(), ☃ -> {
/*     */             this.D = Boolean.valueOf(!this.D.booleanValue());
/*     */             
/*     */             ☃.a(n());
/*     */           }));
/* 172 */     this.P = a(new dlj(this.u, j(9), this.v, 20, p(), ☃ -> {
/*     */             this.I = Boolean.valueOf(!this.I.booleanValue());
/*     */             ☃.a(p());
/*     */           }));
/* 176 */     this.O = a(new dlj(this.w, j(9), this.v, 20, o(), ☃ -> {
/*     */             this.H = Boolean.valueOf(!this.H.booleanValue());
/*     */             
/*     */             ☃.a(o());
/*     */           }));
/* 181 */     if (this.y != dgq.c.a) {
/* 182 */       this.J.o = false;
/* 183 */       this.K.o = false;
/* 184 */       this.M.o = false;
/* 185 */       this.L.o = false;
/* 186 */       this.N.o = false;
/* 187 */       this.O.o = false;
/* 188 */       this.P.o = false;
/*     */     } 
/*     */     
/* 191 */     if (this.A == 0) {
/* 192 */       this.L.o = false;
/*     */     }
/*     */     
/* 195 */     a(new dlj(this.u, j(13), this.v, 20, new of("mco.configure.world.buttons.done"), ☃ -> r()));
/* 196 */     a(new dlj(this.w, j(13), this.v, 20, nq.d, ☃ -> this.i.a(this.c)));
/* 197 */     d(this.t);
/* 198 */     this.Q = d(new eom(new of("mco.configure.world.buttons.options"), this.k / 2, 17, 16777215));
/* 199 */     if (this.R != null) {
/* 200 */       d(this.R);
/*     */     }
/* 202 */     A();
/*     */   }
/*     */   
/*     */   private nr h() {
/* 206 */     return (new of("options.difficulty")).c(": ").a(a[this.A]);
/*     */   }
/*     */   
/*     */   private nr i() {
/* 210 */     return new of("options.generic_value", new Object[] { r, b[this.B] });
/*     */   }
/*     */   
/*     */   private nr k() {
/* 214 */     return (new of("mco.configure.world.pvp")).c(": ").a(c(this.C.booleanValue()));
/*     */   }
/*     */   
/*     */   private nr l() {
/* 218 */     return (new of("mco.configure.world.spawnAnimals")).c(": ").a(c(this.E.booleanValue()));
/*     */   }
/*     */   
/*     */   private nr m() {
/* 222 */     if (this.A == 0) {
/* 223 */       return (new of("mco.configure.world.spawnMonsters")).c(": ").a(new of("mco.configure.world.off"));
/*     */     }
/* 225 */     return (new of("mco.configure.world.spawnMonsters")).c(": ").a(c(this.F.booleanValue()));
/*     */   }
/*     */ 
/*     */   
/*     */   private nr n() {
/* 230 */     return (new of("mco.configure.world.spawnNPCs")).c(": ").a(c(this.D.booleanValue()));
/*     */   }
/*     */   
/*     */   private nr o() {
/* 234 */     return (new of("mco.configure.world.commandBlocks")).c(": ").a(c(this.H.booleanValue()));
/*     */   }
/*     */   
/*     */   private nr p() {
/* 238 */     return (new of("mco.configure.world.forceGameMode")).c(": ").a(c(this.I.booleanValue()));
/*     */   }
/*     */   
/*     */   private static nr c(boolean ☃) {
/* 242 */     return ☃ ? p : q;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 247 */     a(☃);
/*     */     
/* 249 */     this.o.b(☃, s, (this.u + this.v / 2 - this.o.a(s) / 2), (j(0) - 5), 16777215);
/* 250 */     this.Q.a(this, ☃);
/*     */     
/* 252 */     if (this.R != null) {
/* 253 */       this.R.a(this, ☃);
/*     */     }
/*     */     
/* 256 */     this.t.a(☃, i, j, f);
/*     */     
/* 258 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   class a extends dlg {
/*     */     private final double c;
/*     */     private final double d;
/*     */     
/*     */     public a(dik this$0, int ☃, int i, int j, int k, float f1, float f2) {
/* 266 */       super(☃, i, j, 20, oe.d, 0.0D);
/*     */       
/* 268 */       this.c = f1;
/* 269 */       this.d = f2;
/*     */       
/* 271 */       this.b = ((afm.a(k, f1, f2) - f1) / (f2 - f1));
/*     */       
/* 273 */       b();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a() {
/* 278 */       if (!(dik.a(this.a)).o) {
/*     */         return;
/*     */       }
/*     */       
/* 282 */       dik.a(this.a, Integer.valueOf((int)afm.d(afm.a(this.b, 0.0D, 1.0D), this.c, this.d)));
/*     */     }
/*     */ 
/*     */     
/*     */     protected void b() {
/* 287 */       a((new of("mco.configure.world.spawnProtection")).c(": ").a((dik.b(this.a).intValue() == 0) ? new of("mco.configure.world.off") : new oe(String.valueOf(dik.b(this.a)))));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void a(double ☃, double d1) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void a_(double ☃, double d1) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private String q() {
/* 302 */     if (this.t.b().equals(this.x.b(this.z))) {
/* 303 */       return "";
/*     */     }
/* 305 */     return this.t.b();
/*     */   }
/*     */ 
/*     */   
/*     */   private void r() {
/* 310 */     if (this.y == dgq.c.c || this.y == dgq.c.d || this.y == dgq.c.e) {
/* 311 */       this.c.a(new dgw(this.x.a, this.x.b, this.x.c, this.x.d, this.x.e, this.x.f, Integer.valueOf(this.A), Integer.valueOf(this.B), this.x.g, q()));
/*     */     } else {
/* 313 */       this.c.a(new dgw(this.C, this.E, this.F, this.D, this.G, this.H, Integer.valueOf(this.A), Integer.valueOf(this.B), this.I, q()));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */