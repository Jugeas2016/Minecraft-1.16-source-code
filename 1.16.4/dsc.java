/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.Collection;
/*     */ import java.util.Locale;
/*     */ import java.util.UUID;
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
/*     */ public class dsc
/*     */   extends dot
/*     */ {
/*  27 */   protected static final vk a = new vk("textures/gui/social_interactions.png");
/*     */   
/*  29 */   private static final nr b = new of("gui.socialInteractions.tab_all");
/*  30 */   private static final nr c = new of("gui.socialInteractions.tab_hidden");
/*  31 */   private static final nr p = new of("gui.socialInteractions.tab_blocked");
/*  32 */   private static final nr q = b.g().a(k.t);
/*  33 */   private static final nr r = c.g().a(k.t);
/*  34 */   private static final nr s = p.g().a(k.t);
/*  35 */   private static final nr t = (new of("gui.socialInteractions.search_hint")).a(k.u).a(k.h);
/*  36 */   private static final nr u = (new of("gui.socialInteractions.search_empty")).a(k.h);
/*  37 */   private static final nr v = (new of("gui.socialInteractions.empty_hidden")).a(k.h);
/*  38 */   private static final nr w = (new of("gui.socialInteractions.empty_blocked")).a(k.h);
/*  39 */   private static final nr x = new of("gui.socialInteractions.blocking_hint");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private dsb y;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private dlq z;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  57 */   private String A = "";
/*     */   
/*  59 */   private a B = a.a;
/*     */   
/*     */   private dlj C;
/*     */   
/*     */   private dlj D;
/*     */   private dlj E;
/*     */   private dlj F;
/*     */   @Nullable
/*     */   private nr G;
/*     */   private int H;
/*     */   private boolean I;
/*     */   @Nullable
/*     */   private Runnable J;
/*     */   
/*     */   public dsc() {
/*  74 */     super(new of("gui.socialInteractions.title"));
/*  75 */     a(djz.C());
/*     */   }
/*     */   
/*     */   private int i() {
/*  79 */     return Math.max(52, this.l - 128 - 16);
/*     */   }
/*     */   
/*     */   private int k() {
/*  83 */     return i() / 16;
/*     */   }
/*     */   
/*     */   private int l() {
/*  87 */     return 80 + k() * 16 - 8;
/*     */   }
/*     */   
/*     */   private int m() {
/*  91 */     return (this.k - 238) / 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String ax_() {
/*  96 */     return super.ax_() + ". " + this.G.getString();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 101 */     super.d();
/* 102 */     this.z.a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 107 */     this.i.m.a(true);
/* 108 */     if (this.I) {
/* 109 */       this.y.a(this.k, this.l, 88, l());
/*     */     } else {
/* 111 */       this.y = new dsb(this, this.i, this.k, this.l, 88, l(), 36);
/*     */     } 
/*     */     
/* 114 */     int ☃ = this.y.d() / 3;
/* 115 */     int i = this.y.q();
/* 116 */     int j = this.y.r();
/*     */     
/* 118 */     int k = this.o.a(x) + 40;
/* 119 */     int m = 64 + 16 * k();
/* 120 */     int n = (this.k - k) / 2;
/*     */     
/* 122 */     this.C = a(new dlj(i, 45, ☃, 20, b, ☃ -> a(a.a)));
/* 123 */     this.D = a(new dlj((i + j - ☃) / 2 + 1, 45, ☃, 20, c, ☃ -> a(a.b)));
/* 124 */     this.E = a(new dlj(j - ☃ + 1, 45, ☃, 20, p, ☃ -> a(a.c)));
/* 125 */     this.F = a(new dlj(n, m, k, 20, x, ☃ -> this.i.a(new dnr((), "https://aka.ms/javablocking", true))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     String str = (this.z != null) ? this.z.b() : "";
/* 135 */     this.z = new dlq(this, this.o, m() + 28, 78, 196, 16, t)
/*     */       {
/*     */         protected nx c() {
/* 138 */           if (!dsc.a(this.a).b().isEmpty() && dsc.b(this.a).f()) {
/* 139 */             return super.c().c(", ").a(dsc.h());
/*     */           }
/* 141 */           return super.c();
/*     */         }
/*     */       };
/* 144 */     this.z.k(16);
/* 145 */     this.z.f(false);
/* 146 */     this.z.i(true);
/* 147 */     this.z.l(16777215);
/* 148 */     this.z.a(str);
/* 149 */     this.z.a(this::b);
/*     */     
/* 151 */     this.e.add(this.z);
/* 152 */     this.e.add(this.y);
/*     */     
/* 154 */     this.I = true;
/* 155 */     a(this.B); } private void a(a ☃) {
/*     */     Collection<UUID> collection;
/*     */     ImmutableList immutableList;
/*     */     dsa dsa;
/* 159 */     this.B = ☃;
/* 160 */     this.C.a(b);
/* 161 */     this.D.a(c);
/* 162 */     this.E.a(p);
/*     */     
/* 164 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/* 166 */         this.C.a(q);
/* 167 */         collection = this.i.s.e.f();
/*     */         break;
/*     */       case 2:
/* 170 */         this.D.a(r);
/* 171 */         collection = this.i.aB().a();
/*     */         break;
/*     */       case 3:
/* 174 */         this.E.a(s);
/* 175 */         dsa = this.i.aB();
/* 176 */         collection = (Collection<UUID>)this.i.s.e.f().stream().filter(dsa::e).collect(Collectors.toSet());
/*     */         break;
/*     */       default:
/* 179 */         immutableList = ImmutableList.of(); break;
/*     */     } 
/* 181 */     this.B = ☃;
/* 182 */     this.y.a((Collection<UUID>)immutableList, this.y.m());
/*     */     
/* 184 */     if (!this.z.b().isEmpty() && this.y.f() && !this.z.j()) {
/* 185 */       dkz.b.a(u.getString());
/* 186 */     } else if (immutableList.isEmpty()) {
/* 187 */       if (☃ == a.b) {
/* 188 */         dkz.b.a(v.getString());
/* 189 */       } else if (☃ == a.c) {
/* 190 */         dkz.b.a(w.getString());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 197 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃) {
/* 202 */     int i = m() + 3;
/*     */     
/* 204 */     super.a(☃);
/*     */     
/* 206 */     this.i.M().a(a);
/* 207 */     b(☃, i, 64, 1, 1, 236, 8);
/* 208 */     int j = k();
/* 209 */     for (int k = 0; k < j; k++) {
/* 210 */       b(☃, i, 72 + 16 * k, 1, 10, 236, 16);
/*     */     }
/* 212 */     b(☃, i, 72 + 16 * j, 1, 27, 236, 8);
/*     */     
/* 214 */     b(☃, i + 10, 76, 243, 1, 12, 12);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 219 */     a(this.i);
/* 220 */     a(☃);
/*     */     
/* 222 */     if (this.G != null) {
/* 223 */       b(☃, this.i.g, this.G, m() + 8, 35, -1);
/*     */     }
/*     */     
/* 226 */     if (!this.y.f()) {
/* 227 */       this.y.a(☃, i, j, f);
/* 228 */     } else if (!this.z.b().isEmpty()) {
/* 229 */       a(☃, this.i.g, u, this.k / 2, (78 + l()) / 2, -1);
/*     */     } else {
/* 231 */       switch (null.a[this.B.ordinal()]) {
/*     */         case 2:
/* 233 */           a(☃, this.i.g, v, this.k / 2, (78 + l()) / 2, -1);
/*     */           break;
/*     */         case 3:
/* 236 */           a(☃, this.i.g, w, this.k / 2, (78 + l()) / 2, -1);
/*     */           break;
/*     */       } 
/*     */     } 
/* 240 */     if (!this.z.j() && this.z.b().isEmpty()) {
/* 241 */       b(☃, this.i.g, t, this.z.l, this.z.m, -1);
/*     */     } else {
/* 243 */       this.z.a(☃, i, j, f);
/*     */     } 
/*     */     
/* 246 */     this.F.p = (this.B == a.c);
/*     */     
/* 248 */     super.a(☃, i, j, f);
/*     */     
/* 250 */     if (this.J != null) {
/* 251 */       this.J.run();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 257 */     if (this.z.j()) {
/* 258 */       this.z.a(☃, d1, i);
/*     */     }
/* 260 */     return (super.a(☃, d1, i) || this.y.a(☃, d1, i));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 265 */     if (!this.z.j() && this.i.k.av.a(☃, i)) {
/* 266 */       this.i.a((dot)null);
/* 267 */       return true;
/*     */     } 
/* 269 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/* 274 */     return false;
/*     */   }
/*     */   
/*     */   private void b(String ☃) {
/* 278 */     ☃ = ☃.toLowerCase(Locale.ROOT);
/* 279 */     if (!☃.equals(this.A)) {
/* 280 */       this.y.a(☃);
/* 281 */       this.A = ☃;
/* 282 */       a(this.B);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(djz ☃) {
/* 287 */     int i = ☃.w().e().size();
/* 288 */     if (this.H != i) {
/* 289 */       String str = "";
/* 290 */       dwz dwz = ☃.E();
/* 291 */       if (☃.F()) {
/* 292 */         str = ☃.H().ab();
/* 293 */       } else if (dwz != null) {
/* 294 */         str = dwz.a;
/*     */       } 
/* 296 */       if (i > 1) {
/* 297 */         this.G = new of("gui.socialInteractions.server_label.multiple", new Object[] { str, Integer.valueOf(i) });
/*     */       } else {
/* 299 */         this.G = new of("gui.socialInteractions.server_label.single", new Object[] { str, Integer.valueOf(i) });
/*     */       } 
/* 301 */       this.H = i;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(dwx ☃) {
/* 306 */     this.y.a(☃, this.B);
/*     */   }
/*     */   
/*     */   public void a(UUID ☃) {
/* 310 */     this.y.a(☃);
/*     */   }
/*     */   
/*     */   public void a(@Nullable Runnable ☃) {
/* 314 */     this.J = ☃;
/*     */   }
/*     */   
/*     */   public enum a {
/* 318 */     a,
/* 319 */     b,
/* 320 */     c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */