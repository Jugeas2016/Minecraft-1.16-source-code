/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dpn
/*     */   extends dot
/*     */ {
/*     */   enum a
/*     */   {
/*  28 */     a((String)new of("gameMode.creative"), "/gamemode creative", (nr)new bmb(bup.i)),
/*  29 */     b((String)new of("gameMode.survival"), "/gamemode survival", (nr)new bmb(bmd.kA)),
/*  30 */     c((String)new of("gameMode.adventure"), "/gamemode adventure", (nr)new bmb(bmd.pc)),
/*  31 */     d((String)new of("gameMode.spectator"), "/gamemode spectator", (nr)new bmb(bmd.nD));
/*     */     
/*  33 */     protected static final a[] e = values();
/*     */ 
/*     */     
/*     */     final nr f;
/*     */     
/*     */     final String g;
/*     */ 
/*     */     
/*     */     a(nr ☃, String str1, bmb bmb1) {
/*  42 */       this.f = ☃;
/*  43 */       this.g = str1;
/*  44 */       this.h = bmb1;
/*     */     } final bmb h; static {
/*     */     
/*     */     } private void a(efo ☃, int i, int j) {
/*  48 */       ☃.b(this.h, i, j);
/*     */     }
/*     */     
/*     */     private nr a() {
/*  52 */       return this.f;
/*     */     }
/*     */     
/*     */     private String b() {
/*  56 */       return this.g;
/*     */     }
/*     */     
/*     */     private Optional<a> c() {
/*  60 */       switch (dpn.null.a[ordinal()]) { case 1:
/*  61 */           return Optional.of(b);
/*  62 */         case 2: return Optional.of(c);
/*  63 */         case 3: return Optional.of(d); }
/*  64 */        return Optional.of(a);
/*     */     }
/*     */ 
/*     */     
/*     */     private static Optional<a> b(bru ☃) {
/*  69 */       switch (dpn.null.b[☃.ordinal()]) { case 1:
/*  70 */           return Optional.of(d);
/*  71 */         case 2: return Optional.of(b);
/*  72 */         case 3: return Optional.of(a);
/*  73 */         case 4: return Optional.of(c); }
/*  74 */        return Optional.empty();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*  79 */   private static final vk a = new vk("textures/gui/container/gamemode_switcher.png");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  87 */   private static final int b = (a.values()).length * 30 - 5;
/*     */   
/*  89 */   private static final nr c = new of("debug.gamemodes.select_next", new Object[] { (new of("debug.gamemodes.press_f4")).a(k.l) });
/*     */   
/*     */   private final Optional<a> p;
/*  92 */   private Optional<a> q = Optional.empty();
/*     */   
/*     */   private int r;
/*     */   
/*     */   private int s;
/*     */   private boolean t;
/*  98 */   private final List<b> u = Lists.newArrayList();
/*     */   
/*     */   public dpn() {
/* 101 */     super(dkz.a);
/*     */     
/* 103 */     this.p = a.a(i());
/*     */   }
/*     */   
/*     */   private bru i() {
/* 107 */     bru ☃ = (djz.C()).q.l();
/* 108 */     bru bru1 = (djz.C()).q.k();
/*     */     
/* 110 */     if (bru1 == bru.a) {
/* 111 */       if (☃ == bru.c) {
/* 112 */         bru1 = bru.b;
/*     */       } else {
/* 114 */         bru1 = bru.c;
/*     */       } 
/*     */     }
/*     */     
/* 118 */     return bru1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 123 */     super.b();
/*     */     
/* 125 */     this.q = this.p.isPresent() ? this.p : a.a(this.i.q.l());
/*     */     
/* 127 */     for (int ☃ = 0; ☃ < a.e.length; ☃++) {
/* 128 */       a a = a.e[☃];
/* 129 */       this.u.add(new b(this, a, this.k / 2 - b / 2 + ☃ * 30, this.l / 2 - 30));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 135 */     if (l()) {
/*     */       return;
/*     */     }
/*     */     
/* 139 */     ☃.a();
/* 140 */     RenderSystem.enableBlend();
/* 141 */     this.i.M().a(a);
/* 142 */     int k = this.k / 2 - 62;
/* 143 */     int m = this.l / 2 - 30 - 27;
/* 144 */     a(☃, k, m, 0.0F, 0.0F, 125, 75, 128, 128);
/* 145 */     ☃.b();
/*     */     
/* 147 */     super.a(☃, i, j, f);
/*     */ 
/*     */     
/* 150 */     this.q.ifPresent(a1 -> a(☃, this.o, a.c(a1), this.k / 2, this.l / 2 - 30 - 20, -1));
/*     */ 
/*     */     
/* 153 */     a(☃, this.o, c, this.k / 2, this.l / 2 + 5, 16777215);
/*     */     
/* 155 */     if (!this.t) {
/* 156 */       this.r = i;
/* 157 */       this.s = j;
/*     */       
/* 159 */       this.t = true;
/*     */     } 
/*     */     
/* 162 */     boolean bool = (this.r == i && this.s == j);
/*     */     
/* 164 */     for (b b : this.u) {
/* 165 */       b.a(☃, i, j, f);
/*     */       
/* 167 */       this.q.ifPresent(a1 -> ☃.e((a1 == b.a(☃))));
/*     */       
/* 169 */       if (!bool && b.g()) {
/* 170 */         this.q = Optional.of(b.a(b));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void k() {
/* 176 */     a(this.i, this.q);
/*     */   }
/*     */   
/*     */   private static void a(djz ☃, Optional<a> optional) {
/* 180 */     if (☃.q == null || ☃.s == null || !optional.isPresent()) {
/*     */       return;
/*     */     }
/*     */     
/* 184 */     Optional<a> optional1 = a.a(☃.q.l());
/* 185 */     a a = optional.get();
/*     */     
/* 187 */     if (optional1.isPresent() && ☃.s.k(2) && a != optional1.get()) {
/* 188 */       ☃.s.f(a.a(a));
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean l() {
/* 193 */     if (!deo.a(this.i.aD().i(), 292)) {
/* 194 */       k();
/* 195 */       this.i.a((dot)null);
/*     */       
/* 197 */       return true;
/*     */     } 
/*     */     
/* 200 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 205 */     if (☃ == 293 && this.q.isPresent()) {
/* 206 */       this.t = false;
/* 207 */       this.q = a.b(this.q.get());
/* 208 */       return true;
/*     */     } 
/*     */     
/* 211 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/* 216 */     return false;
/*     */   }
/*     */   
/*     */   public class b extends dlh {
/*     */     private final dpn.a b;
/*     */     private boolean c;
/*     */     
/*     */     public b(dpn ☃, dpn.a a1, int i, int j) {
/* 224 */       super(i, j, 25, 25, dpn.a.c(a1));
/* 225 */       this.b = a1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(dfm ☃, int i, int j, float f) {
/* 230 */       djz djz = djz.C();
/*     */       
/* 232 */       a(☃, djz.M());
/* 233 */       dpn.a.a(this.b, dpn.a(this.a), this.l + 5, this.m + 5);
/*     */       
/* 235 */       if (this.c) {
/* 236 */         b(☃, djz.M());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean g() {
/* 242 */       return (super.g() || this.c);
/*     */     }
/*     */     
/*     */     public void e(boolean ☃) {
/* 246 */       this.c = ☃;
/* 247 */       f();
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, ekd ekd1) {
/* 251 */       ekd1.a(dpn.h());
/*     */       
/* 253 */       ☃.a();
/* 254 */       ☃.a(this.l, this.m, 0.0D);
/*     */       
/* 256 */       a(☃, 0, 0, 0.0F, 75.0F, 25, 25, 128, 128);
/*     */       
/* 258 */       ☃.b();
/*     */     }
/*     */     
/*     */     private void b(dfm ☃, ekd ekd1) {
/* 262 */       ekd1.a(dpn.h());
/*     */       
/* 264 */       ☃.a();
/* 265 */       ☃.a(this.l, this.m, 0.0D);
/*     */       
/* 267 */       a(☃, 0, 0, 25.0F, 75.0F, 25, 25, 128, 128);
/*     */       
/* 269 */       ☃.b();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */