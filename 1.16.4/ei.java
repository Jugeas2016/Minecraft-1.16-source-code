/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.mojang.brigadier.ImmutableStringReader;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BiFunction;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ei
/*     */ {
/*     */   public static final DynamicCommandExceptionType b;
/*     */   public static final Dynamic2CommandExceptionType c;
/*     */   public static final Dynamic2CommandExceptionType d;
/*     */   public static final Dynamic3CommandExceptionType e;
/*     */   public static final Dynamic2CommandExceptionType f;
/*  33 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.block.tag.disallowed")); static {
/*  34 */     b = new DynamicCommandExceptionType(☃ -> new of("argument.block.id.invalid", new Object[] { ☃ }));
/*  35 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.block.property.unknown", new Object[] { ☃, object1 }));
/*  36 */     d = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.block.property.duplicate", new Object[] { object1, ☃ }));
/*  37 */     e = new Dynamic3CommandExceptionType((☃, object1, object2) -> new of("argument.block.property.invalid", new Object[] { ☃, object2, object1 }));
/*  38 */     f = new Dynamic2CommandExceptionType((☃, object1) -> new of("argument.block.property.novalue", new Object[] { ☃, object1 }));
/*  39 */   } public static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new of("argument.block.property.unclosed"));
/*     */   
/*     */   private static final BiFunction<SuggestionsBuilder, aem<buo>, CompletableFuture<Suggestions>> h;
/*     */   
/*     */   private final StringReader i;
/*     */   
/*     */   private final boolean j;
/*     */   
/*     */   static {
/*  48 */     h = ((☃, aem1) -> ☃.buildFuture());
/*     */   }
/*     */ 
/*     */   
/*  52 */   private final Map<cfj<?>, Comparable<?>> k = Maps.newHashMap();
/*  53 */   private final Map<String, String> l = Maps.newHashMap();
/*  54 */   private vk m = new vk("");
/*     */   private cei<buo, ceh> n;
/*     */   private ceh o;
/*     */   @Nullable
/*     */   private md p;
/*  59 */   private vk q = new vk("");
/*     */   private int r;
/*  61 */   private BiFunction<SuggestionsBuilder, aem<buo>, CompletableFuture<Suggestions>> s = h;
/*     */   
/*     */   public ei(StringReader ☃, boolean bool) {
/*  64 */     this.i = ☃;
/*  65 */     this.j = bool;
/*     */   }
/*     */   
/*     */   public Map<cfj<?>, Comparable<?>> a() {
/*  69 */     return this.k;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ceh b() {
/*  74 */     return this.o;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public md c() {
/*  79 */     return this.p;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public vk d() {
/*  84 */     return this.q;
/*     */   }
/*     */   
/*     */   public ei a(boolean ☃) throws CommandSyntaxException {
/*  88 */     this.s = this::l;
/*  89 */     if (this.i.canRead() && this.i.peek() == '#') {
/*  90 */       f();
/*  91 */       this.s = this::i;
/*  92 */       if (this.i.canRead() && this.i.peek() == '[') {
/*  93 */         h();
/*  94 */         this.s = this::f;
/*     */       } 
/*     */     } else {
/*  97 */       e();
/*  98 */       this.s = this::j;
/*  99 */       if (this.i.canRead() && this.i.peek() == '[') {
/* 100 */         g();
/* 101 */         this.s = this::f;
/*     */       } 
/*     */     } 
/* 104 */     if (☃ && this.i.canRead() && this.i.peek() == '{') {
/* 105 */       this.s = h;
/* 106 */       i();
/*     */     } 
/* 108 */     return this;
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> b(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 112 */     if (☃.getRemaining().isEmpty()) {
/* 113 */       ☃.suggest(String.valueOf(']'));
/*     */     }
/*     */     
/* 116 */     return d(☃, aem1);
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> c(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 120 */     if (☃.getRemaining().isEmpty()) {
/* 121 */       ☃.suggest(String.valueOf(']'));
/*     */     }
/* 123 */     return e(☃, aem1);
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> d(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 127 */     String str = ☃.getRemaining().toLowerCase(Locale.ROOT);
/* 128 */     for (cfj<?> cfj : this.o.r()) {
/* 129 */       if (!this.k.containsKey(cfj) && cfj.f().startsWith(str)) {
/* 130 */         ☃.suggest(cfj.f() + '=');
/*     */       }
/*     */     } 
/* 133 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> e(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 137 */     String str = ☃.getRemaining().toLowerCase(Locale.ROOT);
/* 138 */     if (this.q != null && !this.q.a().isEmpty()) {
/* 139 */       ael<buo> ael = aem1.a(this.q);
/* 140 */       if (ael != null) {
/* 141 */         for (buo buo : ael.b()) {
/* 142 */           for (cfj<?> cfj : buo.m().d()) {
/* 143 */             if (!this.l.containsKey(cfj.f()) && cfj.f().startsWith(str)) {
/* 144 */               ☃.suggest(cfj.f() + '=');
/*     */             }
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/* 150 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> f(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 154 */     if (☃.getRemaining().isEmpty() && a(aem1)) {
/* 155 */       ☃.suggest(String.valueOf('{'));
/*     */     }
/* 157 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private boolean a(aem<buo> ☃) {
/* 161 */     if (this.o != null) {
/* 162 */       return this.o.b().q();
/*     */     }
/*     */     
/* 165 */     if (this.q != null) {
/* 166 */       ael<buo> ael = ☃.a(this.q);
/*     */       
/* 168 */       if (ael != null) {
/* 169 */         for (buo buo : ael.b()) {
/* 170 */           if (buo.q()) {
/* 171 */             return true;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 177 */     return false;
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> g(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 181 */     if (☃.getRemaining().isEmpty()) {
/* 182 */       ☃.suggest(String.valueOf('='));
/*     */     }
/* 184 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> h(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 188 */     if (☃.getRemaining().isEmpty()) {
/* 189 */       ☃.suggest(String.valueOf(']'));
/*     */     }
/* 191 */     if (☃.getRemaining().isEmpty() && this.k.size() < this.o.r().size()) {
/* 192 */       ☃.suggest(String.valueOf(','));
/*     */     }
/* 194 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private static <T extends Comparable<T>> SuggestionsBuilder a(SuggestionsBuilder ☃, cfj<T> cfj1) {
/* 198 */     for (Comparable comparable : cfj1.a()) {
/* 199 */       if (comparable instanceof Integer) {
/* 200 */         ☃.suggest(((Integer)comparable).intValue()); continue;
/*     */       } 
/* 202 */       ☃.suggest(cfj1.a((T)comparable));
/*     */     } 
/*     */     
/* 205 */     return ☃;
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> a(SuggestionsBuilder ☃, aem<buo> aem1, String str) {
/* 209 */     boolean bool = false;
/* 210 */     if (this.q != null && !this.q.a().isEmpty()) {
/* 211 */       ael<buo> ael = aem1.a(this.q);
/* 212 */       if (ael != null) {
/* 213 */         for (buo buo : ael.b()) {
/* 214 */           cfj<?> cfj = buo.m().a(str);
/* 215 */           if (cfj != null) {
/* 216 */             a(☃, cfj);
/*     */           }
/* 218 */           if (!bool) {
/* 219 */             for (cfj<?> cfj1 : buo.m().d()) {
/* 220 */               if (!this.l.containsKey(cfj1.f())) {
/* 221 */                 bool = true;
/*     */               }
/*     */             } 
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 229 */     if (bool) {
/* 230 */       ☃.suggest(String.valueOf(','));
/*     */     }
/* 232 */     ☃.suggest(String.valueOf(']'));
/* 233 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> i(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 237 */     if (☃.getRemaining().isEmpty()) {
/* 238 */       ael<buo> ael = aem1.a(this.q);
/* 239 */       if (ael != null) {
/* 240 */         int i; boolean bool1 = false;
/* 241 */         boolean bool2 = false;
/*     */         
/* 243 */         for (buo buo : ael.b()) {
/* 244 */           i = bool1 | (!buo.m().d().isEmpty() ? 1 : 0);
/* 245 */           bool2 |= buo.q();
/*     */           
/* 247 */           if (i != 0 && bool2) {
/*     */             break;
/*     */           }
/*     */         } 
/*     */         
/* 252 */         if (i != 0) {
/* 253 */           ☃.suggest(String.valueOf('['));
/*     */         }
/*     */         
/* 256 */         if (bool2) {
/* 257 */           ☃.suggest(String.valueOf('{'));
/*     */         }
/*     */       } 
/*     */     } 
/* 261 */     return k(☃, aem1);
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> j(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 265 */     if (☃.getRemaining().isEmpty()) {
/* 266 */       if (!this.o.b().m().d().isEmpty()) {
/* 267 */         ☃.suggest(String.valueOf('['));
/*     */       }
/* 269 */       if (this.o.b().q()) {
/* 270 */         ☃.suggest(String.valueOf('{'));
/*     */       }
/*     */     } 
/* 273 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> k(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 277 */     return dd.a(aem1.b(), ☃.createOffset(this.r).add(☃));
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> l(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 281 */     if (this.j) {
/* 282 */       dd.a(aem1.b(), ☃, String.valueOf('#'));
/*     */     }
/* 284 */     dd.a(gm.Q.c(), ☃);
/* 285 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   public void e() throws CommandSyntaxException {
/* 289 */     int ☃ = this.i.getCursor();
/* 290 */     this.m = vk.a(this.i);
/*     */     
/* 292 */     buo buo = (buo)gm.Q.b(this.m).orElseThrow(() -> {
/*     */           this.i.setCursor(☃);
/*     */           
/*     */           return b.createWithContext((ImmutableStringReader)this.i, this.m.toString());
/*     */         });
/* 297 */     this.n = buo.m();
/* 298 */     this.o = buo.n();
/*     */   }
/*     */   
/*     */   public void f() throws CommandSyntaxException {
/* 302 */     if (!this.j) {
/* 303 */       throw a.create();
/*     */     }
/*     */     
/* 306 */     this.s = this::k;
/* 307 */     this.i.expect('#');
/* 308 */     this.r = this.i.getCursor();
/* 309 */     this.q = vk.a(this.i);
/*     */   }
/*     */   
/*     */   public void g() throws CommandSyntaxException {
/* 313 */     this.i.skip();
/* 314 */     this.s = this::b;
/*     */     
/* 316 */     this.i.skipWhitespace();
/* 317 */     while (this.i.canRead() && this.i.peek() != ']') {
/* 318 */       this.i.skipWhitespace();
/* 319 */       int ☃ = this.i.getCursor();
/* 320 */       String str = this.i.readString();
/* 321 */       cfj<?> cfj = this.n.a(str);
/* 322 */       if (cfj == null) {
/* 323 */         this.i.setCursor(☃);
/* 324 */         throw c.createWithContext(this.i, this.m.toString(), str);
/*     */       } 
/* 326 */       if (this.k.containsKey(cfj)) {
/* 327 */         this.i.setCursor(☃);
/* 328 */         throw d.createWithContext(this.i, this.m.toString(), str);
/*     */       } 
/*     */       
/* 331 */       this.i.skipWhitespace();
/* 332 */       this.s = this::g;
/* 333 */       if (!this.i.canRead() || this.i.peek() != '=') {
/* 334 */         throw f.createWithContext(this.i, this.m.toString(), str);
/*     */       }
/* 336 */       this.i.skip();
/* 337 */       this.i.skipWhitespace();
/*     */       
/* 339 */       this.s = ((suggestionsBuilder, aem1) -> a(suggestionsBuilder, ☃).buildFuture());
/* 340 */       int i = this.i.getCursor();
/* 341 */       a(cfj, this.i.readString(), i);
/*     */       
/* 343 */       this.s = this::h;
/* 344 */       this.i.skipWhitespace();
/* 345 */       if (this.i.canRead()) {
/* 346 */         if (this.i.peek() == ',') {
/* 347 */           this.i.skip();
/* 348 */           this.s = this::d; continue;
/* 349 */         }  if (this.i.peek() == ']') {
/*     */           break;
/*     */         }
/* 352 */         throw g.createWithContext(this.i);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 357 */     if (this.i.canRead()) {
/* 358 */       this.i.skip();
/*     */     } else {
/* 360 */       throw g.createWithContext(this.i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void h() throws CommandSyntaxException {
/* 365 */     this.i.skip();
/* 366 */     this.s = this::c;
/* 367 */     int ☃ = -1;
/*     */     
/* 369 */     this.i.skipWhitespace();
/* 370 */     while (this.i.canRead() && this.i.peek() != ']') {
/* 371 */       this.i.skipWhitespace();
/* 372 */       int i = this.i.getCursor();
/* 373 */       String str1 = this.i.readString();
/* 374 */       if (this.l.containsKey(str1)) {
/* 375 */         this.i.setCursor(i);
/* 376 */         throw d.createWithContext(this.i, this.m.toString(), str1);
/*     */       } 
/*     */       
/* 379 */       this.i.skipWhitespace();
/* 380 */       if (!this.i.canRead() || this.i.peek() != '=') {
/* 381 */         this.i.setCursor(i);
/* 382 */         throw f.createWithContext(this.i, this.m.toString(), str1);
/*     */       } 
/* 384 */       this.i.skip();
/*     */       
/* 386 */       this.i.skipWhitespace();
/* 387 */       this.s = ((suggestionsBuilder, aem1) -> a(suggestionsBuilder, aem1, ☃));
/* 388 */       ☃ = this.i.getCursor();
/* 389 */       String str2 = this.i.readString();
/* 390 */       this.l.put(str1, str2);
/*     */       
/* 392 */       this.i.skipWhitespace();
/* 393 */       if (this.i.canRead()) {
/* 394 */         ☃ = -1;
/* 395 */         if (this.i.peek() == ',') {
/* 396 */           this.i.skip();
/* 397 */           this.s = this::e; continue;
/* 398 */         }  if (this.i.peek() == ']') {
/*     */           break;
/*     */         }
/* 401 */         throw g.createWithContext(this.i);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 406 */     if (this.i.canRead()) {
/* 407 */       this.i.skip();
/*     */     } else {
/* 409 */       if (☃ >= 0) {
/* 410 */         this.i.setCursor(☃);
/*     */       }
/* 412 */       throw g.createWithContext(this.i);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void i() throws CommandSyntaxException {
/* 417 */     this.p = (new mu(this.i)).f();
/*     */   }
/*     */   
/*     */   private <T extends Comparable<T>> void a(cfj<T> ☃, String str, int i) throws CommandSyntaxException {
/* 421 */     Optional<T> optional = ☃.b(str);
/* 422 */     if (optional.isPresent()) {
/* 423 */       this.o = this.o.a(☃, (Comparable)optional.get());
/* 424 */       this.k.put(☃, (Comparable<?>)optional.get());
/*     */     } else {
/* 426 */       this.i.setCursor(i);
/* 427 */       throw e.createWithContext(this.i, this.m.toString(), ☃.f(), str);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String a(ceh ☃) {
/* 432 */     StringBuilder stringBuilder = new StringBuilder(gm.Q.b(☃.b()).toString());
/* 433 */     if (!☃.r().isEmpty()) {
/* 434 */       stringBuilder.append('[');
/* 435 */       boolean bool = false;
/* 436 */       for (UnmodifiableIterator<Map.Entry<cfj<?>, Comparable<?>>> unmodifiableIterator = ☃.s().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<cfj<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 437 */         if (bool) {
/* 438 */           stringBuilder.append(',');
/*     */         }
/*     */         
/* 441 */         a(stringBuilder, (cfj<Comparable>)entry.getKey(), entry.getValue());
/* 442 */         bool = true; }
/*     */       
/* 444 */       stringBuilder.append(']');
/*     */     } 
/* 446 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T extends Comparable<T>> void a(StringBuilder ☃, cfj<T> cfj1, Comparable<?> comparable) {
/* 451 */     ☃.append(cfj1.f());
/* 452 */     ☃.append('=');
/* 453 */     ☃.append(cfj1.a((T)comparable));
/*     */   }
/*     */   
/*     */   public CompletableFuture<Suggestions> a(SuggestionsBuilder ☃, aem<buo> aem1) {
/* 457 */     return this.s.apply(☃.createOffset(this.i.getCursor()), aem1);
/*     */   }
/*     */   
/*     */   public Map<String, String> j() {
/* 461 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ei.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */