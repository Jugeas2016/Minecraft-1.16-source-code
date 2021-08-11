/*     */ import com.google.common.primitives.Doubles;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.ToDoubleFunction;
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
/*     */ public class fd
/*     */ {
/*  49 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.entity.invalid")); public static final DynamicCommandExceptionType b; static {
/*  50 */     b = new DynamicCommandExceptionType(☃ -> new of("argument.entity.selector.unknown", new Object[] { ☃ }));
/*  51 */   } public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("argument.entity.selector.not_allowed"));
/*  52 */   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("argument.entity.selector.missing"));
/*  53 */   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new of("argument.entity.options.unterminated")); public static final DynamicCommandExceptionType f;
/*  54 */   static { f = new DynamicCommandExceptionType(☃ -> new of("argument.entity.options.valueless", new Object[] { ☃ })); } public static final BiConsumer<dcn, List<? extends aqa>> g = (☃, list) -> {
/*     */     
/*     */     }; public static final BiConsumer<dcn, List<? extends aqa>> h; static {
/*  57 */     h = ((☃, list) -> list.sort(()));
/*  58 */     i = ((☃, list) -> list.sort(()));
/*  59 */     j = ((☃, list) -> Collections.shuffle(list));
/*     */     
/*  61 */     k = ((☃, consumer) -> ☃.buildFuture());
/*     */   }
/*     */   public static final BiConsumer<dcn, List<? extends aqa>> i; public static final BiConsumer<dcn, List<? extends aqa>> j; public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> k; private final StringReader l;
/*     */   private final boolean m;
/*     */   private int n;
/*     */   private boolean o;
/*     */   private boolean p;
/*  68 */   private bz.c q = bz.c.e;
/*  69 */   private bz.d r = bz.d.e;
/*     */   @Nullable
/*     */   private Double s;
/*     */   @Nullable
/*     */   private Double t;
/*     */   @Nullable
/*     */   private Double u;
/*     */   @Nullable
/*     */   private Double v;
/*     */   @Nullable
/*     */   private Double w;
/*     */   @Nullable
/*     */   private Double x;
/*  82 */   private cu y = cu.a;
/*  83 */   private cu z = cu.a;
/*     */   private Predicate<aqa> A = ☃ -> true;
/*  85 */   private BiConsumer<dcn, List<? extends aqa>> B = g;
/*     */   private boolean C;
/*     */   @Nullable
/*     */   private String D;
/*     */   private int E;
/*     */   @Nullable
/*     */   private UUID F;
/*  92 */   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> G = k;
/*     */   private boolean H;
/*     */   private boolean I;
/*     */   private boolean J;
/*     */   private boolean K;
/*     */   private boolean L;
/*     */   private boolean M;
/*     */   private boolean N;
/*     */   private boolean O;
/*     */   @Nullable
/*     */   private aqe<?> P;
/*     */   private boolean Q;
/*     */   private boolean R;
/*     */   private boolean S;
/*     */   private boolean T;
/*     */   
/*     */   public fd(StringReader ☃) {
/* 109 */     this(☃, true);
/*     */   }
/*     */   
/*     */   public fd(StringReader ☃, boolean bool) {
/* 113 */     this.l = ☃;
/* 114 */     this.m = bool;
/*     */   }
/*     */   public fc a() {
/*     */     dci ☃;
/*     */     Function<dcn, dcn> function;
/* 119 */     if (this.v != null || this.w != null || this.x != null) {
/* 120 */       ☃ = a((this.v == null) ? 0.0D : this.v.doubleValue(), (this.w == null) ? 0.0D : this.w.doubleValue(), (this.x == null) ? 0.0D : this.x.doubleValue());
/* 121 */     } else if (this.q.b() != null) {
/* 122 */       float f = this.q.b().floatValue();
/* 123 */       ☃ = new dci(-f, -f, -f, (f + 1.0F), (f + 1.0F), (f + 1.0F));
/*     */     } else {
/* 125 */       ☃ = null;
/*     */     } 
/*     */     
/* 128 */     if (this.s == null && this.t == null && this.u == null) {
/* 129 */       function = (☃ -> ☃);
/*     */     } else {
/* 131 */       function = (☃ -> new dcn((this.s == null) ? ☃.b : this.s.doubleValue(), (this.t == null) ? ☃.c : this.t.doubleValue(), (this.u == null) ? ☃.d : this.u.doubleValue()));
/*     */     } 
/* 133 */     return new fc(this.n, this.o, this.p, this.A, this.q, function, ☃, this.B, this.C, this.D, this.F, this.P, this.T);
/*     */   }
/*     */   
/*     */   private dci a(double ☃, double d1, double d2) {
/* 137 */     boolean bool1 = (☃ < 0.0D);
/* 138 */     boolean bool2 = (d1 < 0.0D);
/* 139 */     boolean bool3 = (d2 < 0.0D);
/* 140 */     double d3 = bool1 ? ☃ : 0.0D;
/* 141 */     double d4 = bool2 ? d1 : 0.0D;
/* 142 */     double d5 = bool3 ? d2 : 0.0D;
/* 143 */     double d6 = (bool1 ? 0.0D : ☃) + 1.0D;
/* 144 */     double d7 = (bool2 ? 0.0D : d1) + 1.0D;
/* 145 */     double d8 = (bool3 ? 0.0D : d2) + 1.0D;
/* 146 */     return new dci(d3, d4, d5, d6, d7, d8);
/*     */   }
/*     */   
/*     */   private void I() {
/* 150 */     if (this.y != cu.a) {
/* 151 */       this.A = this.A.and(a(this.y, ☃ -> ☃.q));
/*     */     }
/* 153 */     if (this.z != cu.a) {
/* 154 */       this.A = this.A.and(a(this.z, ☃ -> ☃.p));
/*     */     }
/* 156 */     if (!this.r.c()) {
/* 157 */       this.A = this.A.and(☃ -> !(☃ instanceof aah) ? false : this.r.d(((aah)☃).bD));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Predicate<aqa> a(cu ☃, ToDoubleFunction<aqa> toDoubleFunction) {
/* 167 */     double d1 = afm.g((☃.a() == null) ? 0.0F : ☃.a().floatValue());
/* 168 */     double d2 = afm.g((☃.b() == null) ? 359.0F : ☃.b().floatValue());
/* 169 */     return aqa1 -> {
/*     */         double d3 = afm.g(☃.applyAsDouble(aqa1));
/*     */         
/* 172 */         return (d1 > d2) ? ((d3 >= d1 || d3 <= d2)) : (
/*     */           
/* 174 */           (d3 >= d1 && d3 <= d2));
/*     */       };
/*     */   }
/*     */   
/*     */   protected void b() throws CommandSyntaxException {
/* 179 */     this.T = true;
/* 180 */     this.G = this::d;
/* 181 */     if (!this.l.canRead()) {
/* 182 */       throw d.createWithContext(this.l);
/*     */     }
/* 184 */     int ☃ = this.l.getCursor();
/* 185 */     char c1 = this.l.read();
/* 186 */     if (c1 == 'p') {
/* 187 */       this.n = 1;
/* 188 */       this.o = false;
/* 189 */       this.B = h;
/* 190 */       a(aqe.bc);
/* 191 */     } else if (c1 == 'a') {
/* 192 */       this.n = Integer.MAX_VALUE;
/* 193 */       this.o = false;
/* 194 */       this.B = g;
/* 195 */       a(aqe.bc);
/* 196 */     } else if (c1 == 'r') {
/* 197 */       this.n = 1;
/* 198 */       this.o = false;
/* 199 */       this.B = j;
/* 200 */       a(aqe.bc);
/* 201 */     } else if (c1 == 's') {
/* 202 */       this.n = 1;
/* 203 */       this.o = true;
/* 204 */       this.C = true;
/* 205 */     } else if (c1 == 'e') {
/* 206 */       this.n = Integer.MAX_VALUE;
/* 207 */       this.o = true;
/* 208 */       this.B = g;
/* 209 */       this.A = aqa::aX;
/*     */     } else {
/* 211 */       this.l.setCursor(☃);
/* 212 */       throw b.createWithContext(this.l, '@' + String.valueOf(c1));
/*     */     } 
/*     */     
/* 215 */     this.G = this::e;
/* 216 */     if (this.l.canRead() && this.l.peek() == '[') {
/* 217 */       this.l.skip();
/* 218 */       this.G = this::f;
/* 219 */       d();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void c() throws CommandSyntaxException {
/* 224 */     if (this.l.canRead()) {
/* 225 */       this.G = this::c;
/*     */     }
/* 227 */     int ☃ = this.l.getCursor();
/* 228 */     String str = this.l.readString();
/*     */     
/*     */     try {
/* 231 */       this.F = UUID.fromString(str);
/* 232 */       this.o = true;
/* 233 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 234 */       if (str.isEmpty() || str.length() > 16) {
/* 235 */         this.l.setCursor(☃);
/* 236 */         throw a.createWithContext(this.l);
/*     */       } 
/* 238 */       this.o = false;
/* 239 */       this.D = str;
/*     */     } 
/*     */     
/* 242 */     this.n = 1;
/*     */   }
/*     */   
/*     */   protected void d() throws CommandSyntaxException {
/* 246 */     this.G = this::g;
/* 247 */     this.l.skipWhitespace();
/* 248 */     while (this.l.canRead() && this.l.peek() != ']') {
/* 249 */       this.l.skipWhitespace();
/* 250 */       int ☃ = this.l.getCursor();
/* 251 */       String str = this.l.readString();
/* 252 */       fe.a a = fe.a(this, str, ☃);
/* 253 */       this.l.skipWhitespace();
/* 254 */       if (!this.l.canRead() || this.l.peek() != '=') {
/* 255 */         this.l.setCursor(☃);
/* 256 */         throw f.createWithContext(this.l, str);
/*     */       } 
/* 258 */       this.l.skip();
/* 259 */       this.l.skipWhitespace();
/*     */       
/* 261 */       this.G = k;
/* 262 */       a.handle(this);
/* 263 */       this.l.skipWhitespace();
/*     */       
/* 265 */       this.G = this::h;
/* 266 */       if (this.l.canRead()) {
/* 267 */         if (this.l.peek() == ',') {
/* 268 */           this.l.skip();
/* 269 */           this.G = this::g; continue;
/* 270 */         }  if (this.l.peek() == ']') {
/*     */           break;
/*     */         }
/* 273 */         throw e.createWithContext(this.l);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 278 */     if (this.l.canRead()) {
/* 279 */       this.l.skip();
/* 280 */       this.G = k;
/*     */     } else {
/* 282 */       throw e.createWithContext(this.l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 287 */     this.l.skipWhitespace();
/* 288 */     if (this.l.canRead() && this.l.peek() == '!') {
/* 289 */       this.l.skip();
/* 290 */       this.l.skipWhitespace();
/* 291 */       return true;
/*     */     } 
/* 293 */     return false;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 297 */     this.l.skipWhitespace();
/* 298 */     if (this.l.canRead() && this.l.peek() == '#') {
/* 299 */       this.l.skip();
/* 300 */       this.l.skipWhitespace();
/* 301 */       return true;
/*     */     } 
/* 303 */     return false;
/*     */   }
/*     */   
/*     */   public StringReader g() {
/* 307 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(Predicate<aqa> ☃) {
/* 311 */     this.A = this.A.and(☃);
/*     */   }
/*     */   
/*     */   public void h() {
/* 315 */     this.p = true;
/*     */   }
/*     */   
/*     */   public bz.c i() {
/* 319 */     return this.q;
/*     */   }
/*     */   
/*     */   public void a(bz.c ☃) {
/* 323 */     this.q = ☃;
/*     */   }
/*     */   
/*     */   public bz.d j() {
/* 327 */     return this.r;
/*     */   }
/*     */   
/*     */   public void a(bz.d ☃) {
/* 331 */     this.r = ☃;
/*     */   }
/*     */   
/*     */   public cu k() {
/* 335 */     return this.y;
/*     */   }
/*     */   
/*     */   public void a(cu ☃) {
/* 339 */     this.y = ☃;
/*     */   }
/*     */   
/*     */   public cu l() {
/* 343 */     return this.z;
/*     */   }
/*     */   
/*     */   public void b(cu ☃) {
/* 347 */     this.z = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double m() {
/* 352 */     return this.s;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double n() {
/* 357 */     return this.t;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double o() {
/* 362 */     return this.u;
/*     */   }
/*     */   
/*     */   public void a(double ☃) {
/* 366 */     this.s = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void b(double ☃) {
/* 370 */     this.t = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void c(double ☃) {
/* 374 */     this.u = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void d(double ☃) {
/* 378 */     this.v = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void e(double ☃) {
/* 382 */     this.w = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   public void f(double ☃) {
/* 386 */     this.x = Double.valueOf(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double p() {
/* 391 */     return this.v;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double q() {
/* 396 */     return this.w;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Double r() {
/* 401 */     return this.x;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 405 */     this.n = ☃;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 409 */     this.o = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(BiConsumer<dcn, List<? extends aqa>> ☃) {
/* 417 */     this.B = ☃;
/*     */   }
/*     */   
/*     */   public fc t() throws CommandSyntaxException {
/* 421 */     this.E = this.l.getCursor();
/* 422 */     this.G = this::b;
/* 423 */     if (this.l.canRead() && this.l.peek() == '@') {
/* 424 */       if (!this.m) {
/* 425 */         throw c.createWithContext(this.l);
/*     */       }
/* 427 */       this.l.skip();
/* 428 */       b();
/*     */     } else {
/* 430 */       c();
/*     */     } 
/* 432 */     I();
/* 433 */     return a();
/*     */   }
/*     */   
/*     */   private static void a(SuggestionsBuilder ☃) {
/* 437 */     ☃.suggest("@p", new of("argument.entity.selector.nearestPlayer"));
/* 438 */     ☃.suggest("@a", new of("argument.entity.selector.allPlayers"));
/* 439 */     ☃.suggest("@r", new of("argument.entity.selector.randomPlayer"));
/* 440 */     ☃.suggest("@s", new of("argument.entity.selector.self"));
/* 441 */     ☃.suggest("@e", new of("argument.entity.selector.allEntities"));
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> b(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 445 */     consumer.accept(☃);
/* 446 */     if (this.m) {
/* 447 */       a(☃);
/*     */     }
/* 449 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> c(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 453 */     SuggestionsBuilder suggestionsBuilder = ☃.createOffset(this.E);
/* 454 */     consumer.accept(suggestionsBuilder);
/* 455 */     return ☃.add(suggestionsBuilder).buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> d(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 459 */     SuggestionsBuilder suggestionsBuilder = ☃.createOffset(☃.getStart() - 1);
/* 460 */     a(suggestionsBuilder);
/* 461 */     ☃.add(suggestionsBuilder);
/* 462 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> e(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 466 */     ☃.suggest(String.valueOf('['));
/* 467 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> f(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 471 */     ☃.suggest(String.valueOf(']'));
/* 472 */     fe.a(this, ☃);
/* 473 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> g(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 477 */     fe.a(this, ☃);
/* 478 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> h(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 482 */     ☃.suggest(String.valueOf(','));
/* 483 */     ☃.suggest(String.valueOf(']'));
/* 484 */     return ☃.buildFuture();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean u() {
/* 493 */     return this.C;
/*     */   }
/*     */   
/*     */   public void a(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> ☃) {
/* 497 */     this.G = ☃;
/*     */   }
/*     */   
/*     */   public CompletableFuture<Suggestions> a(SuggestionsBuilder ☃, Consumer<SuggestionsBuilder> consumer) {
/* 501 */     return this.G.apply(☃.createOffset(this.l.getCursor()), consumer);
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 505 */     return this.H;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 509 */     this.H = ☃;
/*     */   }
/*     */   
/*     */   public boolean w() {
/* 513 */     return this.I;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 517 */     this.I = ☃;
/*     */   }
/*     */   
/*     */   public boolean x() {
/* 521 */     return this.J;
/*     */   }
/*     */   
/*     */   public void d(boolean ☃) {
/* 525 */     this.J = ☃;
/*     */   }
/*     */   
/*     */   public boolean y() {
/* 529 */     return this.K;
/*     */   }
/*     */   
/*     */   public void e(boolean ☃) {
/* 533 */     this.K = ☃;
/*     */   }
/*     */   
/*     */   public boolean z() {
/* 537 */     return this.L;
/*     */   }
/*     */   
/*     */   public void f(boolean ☃) {
/* 541 */     this.L = ☃;
/*     */   }
/*     */   
/*     */   public boolean A() {
/* 545 */     return this.M;
/*     */   }
/*     */   
/*     */   public void g(boolean ☃) {
/* 549 */     this.M = ☃;
/*     */   }
/*     */   
/*     */   public boolean B() {
/* 553 */     return this.N;
/*     */   }
/*     */   
/*     */   public void h(boolean ☃) {
/* 557 */     this.N = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void i(boolean ☃) {
/* 565 */     this.O = ☃;
/*     */   }
/*     */   
/*     */   public void a(aqe<?> ☃) {
/* 569 */     this.P = ☃;
/*     */   }
/*     */   
/*     */   public void D() {
/* 573 */     this.Q = true;
/*     */   }
/*     */   
/*     */   public boolean E() {
/* 577 */     return (this.P != null);
/*     */   }
/*     */   
/*     */   public boolean F() {
/* 581 */     return this.Q;
/*     */   }
/*     */   
/*     */   public boolean G() {
/* 585 */     return this.R;
/*     */   }
/*     */   
/*     */   public void j(boolean ☃) {
/* 589 */     this.R = ☃;
/*     */   }
/*     */   
/*     */   public boolean H() {
/* 593 */     return this.S;
/*     */   }
/*     */   
/*     */   public void k(boolean ☃) {
/* 597 */     this.S = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */