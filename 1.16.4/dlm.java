/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.ParseResults;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.context.CommandContextBuilder;
/*     */ import com.mojang.brigadier.context.ParsedArgument;
/*     */ import com.mojang.brigadier.context.SuggestionContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.suggestion.Suggestion;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import java.util.stream.Stream;
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
/*     */ public class dlm
/*     */ {
/*  50 */   private static final Pattern a = Pattern.compile("(\\s+)");
/*     */   
/*  52 */   private static final ob b = ob.a.a(k.m);
/*  53 */   private static final ob c = ob.a.a(k.h);
/*  54 */   private static final List<ob> d = (List<ob>)Stream.<k>of(new k[] { k.l, k.o, k.k, k.n, k.g }).map(ob.a::a).collect(ImmutableList.toImmutableList());
/*     */   
/*     */   private final djz e;
/*     */   
/*     */   private final dot f;
/*     */   private final dlq g;
/*     */   private final dku h;
/*     */   private final boolean i;
/*     */   private final boolean j;
/*     */   private final int k;
/*     */   private final int l;
/*     */   private final boolean m;
/*     */   private final int n;
/*  67 */   private final List<afa> o = Lists.newArrayList();
/*     */   private int p;
/*     */   private int q;
/*     */   private ParseResults<dd> r;
/*     */   private CompletableFuture<Suggestions> s;
/*     */   private a t;
/*     */   private boolean u;
/*     */   private boolean v;
/*     */   
/*     */   public dlm(djz ☃, dot dot1, dlq dlq1, dku dku1, boolean bool1, boolean bool2, int i, int j, boolean bool3, int k) {
/*  77 */     this.e = ☃;
/*  78 */     this.f = dot1;
/*  79 */     this.g = dlq1;
/*  80 */     this.h = dku1;
/*  81 */     this.i = bool1;
/*  82 */     this.j = bool2;
/*  83 */     this.k = i;
/*  84 */     this.l = j;
/*  85 */     this.m = bool3;
/*  86 */     this.n = k;
/*     */     
/*  88 */     dlq1.a(this::a);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  92 */     this.u = ☃;
/*  93 */     if (!☃) {
/*  94 */       this.t = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  99 */     if (this.t != null && this.t.b(☃, i, j))
/* 100 */       return true; 
/* 101 */     if (this.f.aw_() == this.g && ☃ == 258) {
/* 102 */       b(true);
/* 103 */       return true;
/*     */     } 
/* 105 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(double ☃) {
/* 109 */     return (this.t != null && this.t.a(afm.a(☃, -1.0D, 1.0D)));
/*     */   }
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 113 */     return (this.t != null && this.t.a((int)☃, (int)d1, i));
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 117 */     if (this.s != null && this.s.isDone()) {
/* 118 */       Suggestions suggestions = this.s.join();
/* 119 */       if (!suggestions.isEmpty()) {
/* 120 */         int i = 0;
/* 121 */         for (Suggestion suggestion : suggestions.getList()) {
/* 122 */           i = Math.max(i, this.h.b(suggestion.getText()));
/*     */         }
/*     */         
/* 125 */         int j = afm.a(this.g.o(suggestions.getRange().getStart()), 0, this.g.o(0) + this.g.o() - i);
/* 126 */         int k = this.m ? (this.f.l - 12) : 72;
/* 127 */         this.t = new a(j, k, i, a(suggestions), ☃);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private List<Suggestion> a(Suggestions ☃) {
/* 134 */     String str1 = this.g.b().substring(0, this.g.n());
/* 135 */     int i = a(str1);
/* 136 */     String str2 = str1.substring(i).toLowerCase(Locale.ROOT);
/*     */     
/* 138 */     List<Suggestion> list1 = Lists.newArrayList();
/* 139 */     List<Suggestion> list2 = Lists.newArrayList();
/* 140 */     for (Suggestion suggestion : ☃.getList()) {
/* 141 */       if (suggestion.getText().startsWith(str2) || suggestion.getText().startsWith("minecraft:" + str2)) {
/* 142 */         list1.add(suggestion); continue;
/*     */       } 
/* 144 */       list2.add(suggestion);
/*     */     } 
/*     */     
/* 147 */     list1.addAll(list2);
/* 148 */     return list1;
/*     */   }
/*     */   
/*     */   public void a() {
/* 152 */     String ☃ = this.g.b();
/*     */     
/* 154 */     if (this.r != null && !this.r.getReader().getString().equals(☃)) {
/* 155 */       this.r = null;
/*     */     }
/*     */     
/* 158 */     if (!this.v) {
/* 159 */       this.g.c((String)null);
/* 160 */       this.t = null;
/*     */     } 
/*     */     
/* 163 */     this.o.clear();
/* 164 */     StringReader stringReader = new StringReader(☃);
/* 165 */     boolean bool1 = (stringReader.canRead() && stringReader.peek() == '/');
/* 166 */     if (bool1) {
/* 167 */       stringReader.skip();
/*     */     }
/* 169 */     boolean bool2 = (this.i || bool1);
/*     */     
/* 171 */     int i = this.g.n();
/* 172 */     if (bool2) {
/* 173 */       CommandDispatcher<dd> commandDispatcher = this.e.s.e.i();
/*     */       
/* 175 */       if (this.r == null) {
/* 176 */         this.r = commandDispatcher.parse(stringReader, this.e.s.e.b());
/*     */       }
/*     */       
/* 179 */       int j = this.j ? stringReader.getCursor() : 1;
/*     */       
/* 181 */       if (i >= j && (this.t == null || !this.v)) {
/* 182 */         this.s = commandDispatcher.getCompletionSuggestions(this.r, i);
/* 183 */         this.s.thenRun(() -> {
/*     */               if (!this.s.isDone()) {
/*     */                 return;
/*     */               }
/*     */               c();
/*     */             });
/*     */       } 
/*     */     } else {
/* 191 */       String str = ☃.substring(0, i);
/* 192 */       int j = a(str);
/* 193 */       Collection<String> collection = this.e.s.e.b().l();
/* 194 */       this.s = dd.b(collection, new SuggestionsBuilder(str, j));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(String ☃) {
/* 199 */     if (Strings.isNullOrEmpty(☃)) {
/* 200 */       return 0;
/*     */     }
/*     */     
/* 203 */     int i = 0;
/*     */     
/* 205 */     Matcher matcher = a.matcher(☃);
/* 206 */     while (matcher.find()) {
/* 207 */       i = matcher.end();
/*     */     }
/*     */     
/* 210 */     return i;
/*     */   }
/*     */   
/*     */   private static afa a(CommandSyntaxException ☃) {
/* 214 */     nr nr = ns.a(☃.getRawMessage());
/* 215 */     String str = ☃.getContext();
/* 216 */     if (str == null) {
/* 217 */       return nr.f();
/*     */     }
/* 219 */     return (new of("command.context.parse_error", new Object[] { nr, Integer.valueOf(☃.getCursor()), str })).f();
/*     */   }
/*     */ 
/*     */   
/*     */   private void c() {
/* 224 */     if (this.g.n() == this.g.b().length()) {
/* 225 */       if (((Suggestions)this.s.join()).isEmpty() && !this.r.getExceptions().isEmpty()) {
/* 226 */         int ☃ = 0;
/* 227 */         for (Map.Entry<CommandNode<dd>, CommandSyntaxException> entry : (Iterable<Map.Entry<CommandNode<dd>, CommandSyntaxException>>)this.r.getExceptions().entrySet()) {
/* 228 */           CommandSyntaxException commandSyntaxException = entry.getValue();
/* 229 */           if (commandSyntaxException.getType() == CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
/* 230 */             ☃++; continue;
/*     */           } 
/* 232 */           this.o.add(a(commandSyntaxException));
/*     */         } 
/*     */         
/* 235 */         if (☃ > 0) {
/* 236 */           this.o.add(a(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create()));
/*     */         }
/* 238 */       } else if (this.r.getReader().canRead()) {
/* 239 */         this.o.add(a(dc.a(this.r)));
/*     */       } 
/*     */     }
/*     */     
/* 243 */     this.p = 0;
/* 244 */     this.q = this.f.k;
/*     */     
/* 246 */     if (this.o.isEmpty()) {
/* 247 */       a(k.h);
/*     */     }
/*     */     
/* 250 */     this.t = null;
/* 251 */     if (this.u && this.e.k.K) {
/* 252 */       b(false);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(k ☃) {
/* 257 */     CommandContextBuilder<dd> commandContextBuilder = this.r.getContext();
/* 258 */     SuggestionContext<dd> suggestionContext = commandContextBuilder.findSuggestionContext(this.g.n());
/* 259 */     Map<CommandNode<dd>, String> map = this.e.s.e.i().getSmartUsage(suggestionContext.parent, this.e.s.e.b());
/* 260 */     List<afa> list = Lists.newArrayList();
/* 261 */     int i = 0;
/* 262 */     ob ob1 = ob.a.a(☃);
/*     */     
/* 264 */     for (Map.Entry<CommandNode<dd>, String> entry : map.entrySet()) {
/* 265 */       if (!(entry.getKey() instanceof com.mojang.brigadier.tree.LiteralCommandNode)) {
/* 266 */         list.add(afa.a(entry.getValue(), ob1));
/* 267 */         i = Math.max(i, this.h.b(entry.getValue()));
/*     */       } 
/*     */     } 
/*     */     
/* 271 */     if (!list.isEmpty()) {
/* 272 */       this.o.addAll(list);
/* 273 */       this.p = afm.a(this.g.o(suggestionContext.startPos), 0, this.g.o(0) + this.g.o() - i);
/* 274 */       this.q = i;
/*     */     } 
/*     */   }
/*     */   
/*     */   private afa a(String ☃, int i) {
/* 279 */     if (this.r != null) {
/* 280 */       return a(this.r, ☃, i);
/*     */     }
/* 282 */     return afa.a(☃, ob.a);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static String b(String ☃, String str1) {
/* 288 */     if (str1.startsWith(☃)) {
/* 289 */       return str1.substring(☃.length());
/*     */     }
/*     */     
/* 292 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static afa a(ParseResults<dd> ☃, String str, int i) {
/* 297 */     List<afa> list = Lists.newArrayList();
/* 298 */     int j = 0;
/* 299 */     int k = -1;
/*     */     
/* 301 */     CommandContextBuilder<dd> commandContextBuilder = ☃.getContext().getLastChild();
/* 302 */     for (ParsedArgument<dd, ?> parsedArgument : (Iterable<ParsedArgument<dd, ?>>)commandContextBuilder.getArguments().values()) {
/* 303 */       if (++k >= d.size()) {
/* 304 */         k = 0;
/*     */       }
/*     */       
/* 307 */       int m = Math.max(parsedArgument.getRange().getStart() - i, 0);
/* 308 */       if (m >= str.length()) {
/*     */         break;
/*     */       }
/* 311 */       int n = Math.min(parsedArgument.getRange().getEnd() - i, str.length());
/* 312 */       if (n <= 0) {
/*     */         continue;
/*     */       }
/* 315 */       list.add(afa.a(str.substring(j, m), c));
/* 316 */       list.add(afa.a(str.substring(m, n), d.get(k)));
/* 317 */       j = n;
/*     */     } 
/* 319 */     if (☃.getReader().canRead()) {
/* 320 */       int m = Math.max(☃.getReader().getCursor() - i, 0);
/* 321 */       if (m < str.length()) {
/* 322 */         int n = Math.min(m + ☃.getReader().getRemainingLength(), str.length());
/* 323 */         list.add(afa.a(str.substring(j, m), c));
/* 324 */         list.add(afa.a(str.substring(m, n), b));
/* 325 */         j = n;
/*     */       } 
/*     */     } 
/* 328 */     list.add(afa.a(str.substring(j), c));
/* 329 */     return afa.a(list);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j) {
/* 333 */     if (this.t != null) {
/* 334 */       this.t.a(☃, i, j);
/*     */     } else {
/* 336 */       int k = 0;
/* 337 */       for (afa afa : this.o) {
/* 338 */         int m = this.m ? (this.f.l - 14 - 13 - 12 * k) : (72 + 12 * k);
/* 339 */         dkw.a(☃, this.p - 1, m, this.p + this.q + 1, m + 12, this.n);
/* 340 */         this.h.a(☃, afa, this.p, (m + 2), -1);
/* 341 */         k++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public String b() {
/* 347 */     if (this.t != null) {
/* 348 */       return "\n" + a.a(this.t);
/*     */     }
/* 350 */     return "";
/*     */   }
/*     */   
/*     */   public class a {
/*     */     private final eal b;
/*     */     private final String c;
/*     */     private final List<Suggestion> d;
/*     */     private int e;
/*     */     private int f;
/* 359 */     private dcm g = dcm.a;
/*     */     private boolean h;
/*     */     private int i;
/*     */     
/*     */     private a(dlm ☃, int i, int j, int k, List<Suggestion> list, boolean bool) {
/* 364 */       int m = i - 1;
/* 365 */       int n = dlm.a(☃) ? (j - 3 - Math.min(list.size(), dlm.b(☃)) * 12) : j;
/* 366 */       this.b = new eal(m, n, k + 1, Math.min(list.size(), dlm.b(☃)) * 12);
/* 367 */       this.c = dlm.c(☃).b();
/* 368 */       this.i = bool ? -1 : 0;
/* 369 */       this.d = list;
/* 370 */       b(0);
/*     */     }
/*     */     
/*     */     public void a(dfm ☃, int i, int j) {
/* 374 */       int k = Math.min(this.d.size(), dlm.b(this.a));
/* 375 */       int m = -5592406;
/* 376 */       boolean bool1 = (this.e > 0);
/* 377 */       boolean bool2 = (this.d.size() > this.e + k);
/* 378 */       boolean bool3 = (bool1 || bool2);
/* 379 */       boolean bool4 = (this.g.i != i || this.g.j != j);
/*     */       
/* 381 */       if (bool4) {
/* 382 */         this.g = new dcm(i, j);
/*     */       }
/*     */       
/* 385 */       if (bool3) {
/* 386 */         dkw.a(☃, this.b.a(), this.b.b() - 1, this.b.a() + this.b.c(), this.b.b(), dlm.d(this.a));
/* 387 */         dkw.a(☃, this.b.a(), this.b.b() + this.b.d(), this.b.a() + this.b.c(), this.b.b() + this.b.d() + 1, dlm.d(this.a));
/* 388 */         if (bool1) {
/* 389 */           for (int i1 = 0; i1 < this.b.c(); i1++) {
/* 390 */             if (i1 % 2 == 0) {
/* 391 */               dkw.a(☃, this.b.a() + i1, this.b.b() - 1, this.b.a() + i1 + 1, this.b.b(), -1);
/*     */             }
/*     */           } 
/*     */         }
/* 395 */         if (bool2) {
/* 396 */           for (int i1 = 0; i1 < this.b.c(); i1++) {
/* 397 */             if (i1 % 2 == 0) {
/* 398 */               dkw.a(☃, this.b.a() + i1, this.b.b() + this.b.d(), this.b.a() + i1 + 1, this.b.b() + this.b.d() + 1, -1);
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*     */       
/* 404 */       boolean bool5 = false;
/* 405 */       for (int n = 0; n < k; n++) {
/* 406 */         Suggestion suggestion = this.d.get(n + this.e);
/* 407 */         dkw.a(☃, this.b.a(), this.b.b() + 12 * n, this.b.a() + this.b.c(), this.b.b() + 12 * n + 12, dlm.d(this.a));
/* 408 */         if (i > this.b.a() && i < this.b.a() + this.b.c() && j > this.b.b() + 12 * n && j < this.b.b() + 12 * n + 12) {
/* 409 */           if (bool4) {
/* 410 */             b(n + this.e);
/*     */           }
/* 412 */           bool5 = true;
/*     */         } 
/* 414 */         dlm.e(this.a).a(☃, suggestion.getText(), (this.b.a() + 1), (this.b.b() + 2 + 12 * n), (n + this.e == this.f) ? -256 : -5592406);
/*     */       } 
/*     */       
/* 417 */       if (bool5) {
/* 418 */         Message message = ((Suggestion)this.d.get(this.f)).getTooltip();
/* 419 */         if (message != null) {
/* 420 */           dlm.f(this.a).b(☃, ns.a(message), i, j);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/*     */     public boolean a(int ☃, int i, int j) {
/* 426 */       if (!this.b.b(☃, i)) {
/* 427 */         return false;
/*     */       }
/*     */       
/* 430 */       int k = (i - this.b.b()) / 12 + this.e;
/* 431 */       if (k >= 0 && k < this.d.size()) {
/* 432 */         b(k);
/* 433 */         a();
/*     */       } 
/*     */       
/* 436 */       return true;
/*     */     }
/*     */     
/*     */     public boolean a(double ☃) {
/* 440 */       int i = (int)((dlm.g(this.a)).l.e() * dlm.g(this.a).aD().o() / dlm.g(this.a).aD().m());
/* 441 */       int j = (int)((dlm.g(this.a)).l.f() * dlm.g(this.a).aD().p() / dlm.g(this.a).aD().n());
/*     */       
/* 443 */       if (this.b.b(i, j)) {
/* 444 */         this.e = afm.a((int)(this.e - ☃), 0, Math.max(this.d.size() - dlm.b(this.a), 0));
/* 445 */         return true;
/*     */       } 
/*     */       
/* 448 */       return false;
/*     */     }
/*     */     
/*     */     public boolean b(int ☃, int i, int j) {
/* 452 */       if (☃ == 265) {
/* 453 */         a(-1);
/* 454 */         this.h = false;
/* 455 */         return true;
/* 456 */       }  if (☃ == 264) {
/* 457 */         a(1);
/* 458 */         this.h = false;
/* 459 */         return true;
/* 460 */       }  if (☃ == 258) {
/* 461 */         if (this.h) {
/* 462 */           a(dot.y() ? -1 : 1);
/*     */         }
/* 464 */         a();
/* 465 */         return true;
/* 466 */       }  if (☃ == 256) {
/* 467 */         b();
/* 468 */         return true;
/*     */       } 
/*     */       
/* 471 */       return false;
/*     */     }
/*     */     
/*     */     public void a(int ☃) {
/* 475 */       b(this.f + ☃);
/* 476 */       int i = this.e;
/* 477 */       int j = this.e + dlm.b(this.a) - 1;
/* 478 */       if (this.f < i) {
/* 479 */         this.e = afm.a(this.f, 0, Math.max(this.d.size() - dlm.b(this.a), 0));
/* 480 */       } else if (this.f > j) {
/* 481 */         this.e = afm.a(this.f + dlm.h(this.a) - dlm.b(this.a), 0, Math.max(this.d.size() - dlm.b(this.a), 0));
/*     */       } 
/*     */     }
/*     */     
/*     */     public void b(int ☃) {
/* 486 */       this.f = ☃;
/*     */       
/* 488 */       if (this.f < 0) {
/* 489 */         this.f += this.d.size();
/*     */       }
/* 491 */       if (this.f >= this.d.size()) {
/* 492 */         this.f -= this.d.size();
/*     */       }
/*     */       
/* 495 */       Suggestion suggestion = this.d.get(this.f);
/* 496 */       dlm.c(this.a).c(dlm.a(dlm.c(this.a).b(), suggestion.apply(this.c)));
/*     */       
/* 498 */       if (dkz.b.a() && this.i != this.f) {
/* 499 */         dkz.b.a(c());
/*     */       }
/*     */     }
/*     */     
/*     */     public void a() {
/* 504 */       Suggestion ☃ = this.d.get(this.f);
/* 505 */       dlm.a(this.a, true);
/* 506 */       dlm.c(this.a).a(☃.apply(this.c));
/* 507 */       int i = ☃.getRange().getStart() + ☃.getText().length();
/* 508 */       dlm.c(this.a).j(i);
/* 509 */       dlm.c(this.a).n(i);
/* 510 */       b(this.f);
/* 511 */       dlm.a(this.a, false);
/* 512 */       this.h = true;
/*     */     }
/*     */     
/*     */     private String c() {
/* 516 */       this.i = this.f;
/* 517 */       Suggestion ☃ = this.d.get(this.f);
/* 518 */       Message message = ☃.getTooltip();
/* 519 */       if (message != null) {
/* 520 */         return ekx.a("narration.suggestion.tooltip", new Object[] { Integer.valueOf(this.f + 1), Integer.valueOf(this.d.size()), ☃.getText(), message.getString() });
/*     */       }
/* 522 */       return ekx.a("narration.suggestion", new Object[] { Integer.valueOf(this.f + 1), Integer.valueOf(this.d.size()), ☃.getText() });
/*     */     }
/*     */ 
/*     */     
/*     */     public void b() {
/* 527 */       dlm.a(this.a, (a)null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */