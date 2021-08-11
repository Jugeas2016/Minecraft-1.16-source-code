/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.CompletableFuture;
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
/*     */ public class xl
/*     */ {
/*     */   public static final SuggestionProvider<db> a;
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final DynamicCommandExceptionType c;
/*     */   
/*     */   static {
/*  61 */     a = ((☃, suggestionsBuilder) -> {
/*     */         cyz cyz = ((db)☃.getSource()).j().aJ();
/*     */         
/*     */         return dd.a(cyz.a(), suggestionsBuilder);
/*     */       });
/*  66 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.drop.no_held_items", new Object[] { ☃ }));
/*  67 */     c = new DynamicCommandExceptionType(☃ -> new of("commands.drop.no_loot_table", new Object[] { ☃ }));
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  70 */     ☃.register(
/*  71 */         (LiteralArgumentBuilder)a(
/*  72 */           dc.a("loot")
/*  73 */           .requires(☃ -> ☃.c(2)), (☃, b1) -> ☃.then(dc.a("fish").then(dc.<T>a("loot_table", dy.a()).suggests(a).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("pos", ek.a()).executes(())).then(dc.<T>a("tool", ew.a()).executes(()))).then(dc.a("mainhand").executes(()))).then(dc.a("offhand").executes(()))))).then(dc.a("loot").then(dc.<T>a("loot_table", dy.a()).suggests(a).executes(()))).then(dc.a("kill").then(dc.<T>a("target", dk.a()).executes(()))).then(dc.a("mine").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("pos", ek.a()).executes(())).then(dc.<T>a("tool", ew.a()).executes(()))).then(dc.a("mainhand").executes(()))).then(dc.a("offhand").executes(()))))));
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
/*     */   private static <T extends ArgumentBuilder<db, T>> T a(T ☃, c c1) {
/* 151 */     return (T)☃
/* 152 */       .then((
/* 153 */         (LiteralArgumentBuilder)dc.a("replace")
/* 154 */         .then(dc.a("entity")
/* 155 */           .then(
/* 156 */             dc.<T>a("entities", dk.b())
/* 157 */             .then(c1
/* 158 */               .construct((ArgumentBuilder<db, ?>)dc.a("slot", eb.a()), (☃, list, a1) -> a(dk.b(☃, "entities"), eb.a(☃, "slot"), list.size(), list, a1))
/*     */ 
/*     */               
/* 161 */               .then(c1
/* 162 */                 .construct((ArgumentBuilder<db, ?>)dc.a("count", (ArgumentType<?>)IntegerArgumentType.integer(0)), (☃, list, a1) -> a(dk.b(☃, "entities"), eb.a(☃, "slot"), IntegerArgumentType.getInteger(☃, "count"), list, a1)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 169 */         .then(dc.a("block")
/* 170 */           .then(
/* 171 */             dc.<T>a("targetPos", ek.a())
/* 172 */             .then(c1
/* 173 */               .construct((ArgumentBuilder<db, ?>)dc.a("slot", eb.a()), (☃, list, a1) -> a((db)☃.getSource(), ek.a(☃, "targetPos"), eb.a(☃, "slot"), list.size(), list, a1))
/*     */ 
/*     */               
/* 176 */               .then(c1
/* 177 */                 .construct((ArgumentBuilder<db, ?>)dc.a("count", (ArgumentType<?>)IntegerArgumentType.integer(0)), (☃, list, a1) -> a((db)☃.getSource(), ek.a(☃, "targetPos"), IntegerArgumentType.getInteger(☃, "slot"), IntegerArgumentType.getInteger(☃, "count"), list, a1)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 185 */       .then(
/* 186 */         dc.a("insert")
/* 187 */         .then(c1
/* 188 */           .construct((ArgumentBuilder<db, ?>)dc.a("targetPos", ek.a()), (☃, list, a1) -> a((db)☃.getSource(), ek.a(☃, "targetPos"), list, a1))))
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 193 */       .then(
/* 194 */         dc.a("give")
/* 195 */         .then(c1
/* 196 */           .construct((ArgumentBuilder<db, ?>)dc.a("players", dk.d()), (☃, list, a1) -> a(dk.f(☃, "players"), list, a1))))
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 201 */       .then(
/* 202 */         dc.a("spawn")
/* 203 */         .then(c1
/* 204 */           .construct((ArgumentBuilder<db, ?>)dc.a("targetPos", er.a()), (☃, list, a1) -> a((db)☃.getSource(), er.a(☃, "targetPos"), list, a1))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static aon a(db ☃, fx fx1) throws CommandSyntaxException {
/* 212 */     ccj ccj = ☃.e().c(fx1);
/* 213 */     if (!(ccj instanceof aon)) {
/* 214 */       throw xw.a.create();
/*     */     }
/*     */     
/* 217 */     return (aon)ccj;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, fx fx1, List<bmb> list, a a1) throws CommandSyntaxException {
/* 221 */     aon aon = a(☃, fx1);
/*     */     
/* 223 */     List<bmb> list1 = Lists.newArrayListWithCapacity(list.size());
/* 224 */     for (bmb bmb : list) {
/* 225 */       if (a(aon, bmb.i())) {
/* 226 */         aon.X_();
/* 227 */         list1.add(bmb);
/*     */       } 
/*     */     } 
/*     */     
/* 231 */     a1.accept(list1);
/* 232 */     return list1.size();
/*     */   }
/*     */   
/*     */   private static boolean a(aon ☃, bmb bmb1) {
/* 236 */     boolean bool = false;
/*     */     
/* 238 */     for (int i = 0; i < ☃.Z_() && !bmb1.a(); i++) {
/* 239 */       bmb bmb2 = ☃.a(i);
/*     */       
/* 241 */       if (☃.b(i, bmb1)) {
/* 242 */         if (bmb2.a()) {
/* 243 */           ☃.a(i, bmb1);
/* 244 */           bool = true; break;
/*     */         } 
/* 246 */         if (a(bmb2, bmb1)) {
/* 247 */           int j = bmb1.c() - bmb2.E();
/* 248 */           int k = Math.min(bmb1.E(), j);
/*     */           
/* 250 */           bmb1.g(k);
/* 251 */           bmb2.f(k);
/* 252 */           bool = true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 257 */     return bool;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, fx fx1, int i, int j, List<bmb> list, a a1) throws CommandSyntaxException {
/* 261 */     aon aon = a(☃, fx1);
/*     */     
/* 263 */     int k = aon.Z_();
/* 264 */     if (i < 0 || i >= k) {
/* 265 */       throw xw.b.create(Integer.valueOf(i));
/*     */     }
/*     */     
/* 268 */     List<bmb> list1 = Lists.newArrayListWithCapacity(list.size());
/*     */     
/* 270 */     for (int m = 0; m < j; m++) {
/* 271 */       int n = i + m;
/* 272 */       bmb bmb = (m < list.size()) ? list.get(m) : bmb.b;
/*     */       
/* 274 */       if (aon.b(n, bmb)) {
/* 275 */         aon.a(n, bmb);
/* 276 */         list1.add(bmb);
/*     */       } 
/*     */     } 
/*     */     
/* 280 */     a1.accept(list1);
/* 281 */     return list1.size();
/*     */   }
/*     */   
/*     */   private static boolean a(bmb ☃, bmb bmb1) {
/* 285 */     return (☃.b() == bmb1.b() && ☃
/* 286 */       .g() == bmb1.g() && ☃
/* 287 */       .E() <= ☃.c() && 
/* 288 */       Objects.equals(☃.o(), bmb1.o()));
/*     */   }
/*     */   
/*     */   private static int a(Collection<aah> ☃, List<bmb> list, a a1) throws CommandSyntaxException {
/* 292 */     List<bmb> list1 = Lists.newArrayListWithCapacity(list.size());
/* 293 */     for (bmb bmb : list) {
/* 294 */       for (aah aah : ☃) {
/* 295 */         if (aah.bm.e(bmb.i())) {
/* 296 */           list1.add(bmb);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 301 */     a1.accept(list1);
/* 302 */     return list1.size();
/*     */   }
/*     */   
/*     */   private static void a(aqa ☃, List<bmb> list1, int i, int j, List<bmb> list2) {
/* 306 */     for (int k = 0; k < j; k++) {
/* 307 */       bmb bmb = (k < list1.size()) ? list1.get(k) : bmb.b;
/* 308 */       if (☃.a_(i + k, bmb.i())) {
/* 309 */         list2.add(bmb);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(Collection<? extends aqa> ☃, int i, int j, List<bmb> list, a a1) throws CommandSyntaxException {
/* 315 */     List<bmb> list1 = Lists.newArrayListWithCapacity(list.size());
/*     */     
/* 317 */     for (aqa aqa : ☃) {
/* 318 */       if (aqa instanceof aah) {
/* 319 */         aah aah = (aah)aqa;
/* 320 */         aah.bo.c();
/* 321 */         a(aqa, list, i, j, list1);
/* 322 */         aah.bo.c(); continue;
/*     */       } 
/* 324 */       a(aqa, list, i, j, list1);
/*     */     } 
/*     */ 
/*     */     
/* 328 */     a1.accept(list1);
/* 329 */     return list1.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, dcn dcn1, List<bmb> list, a a1) throws CommandSyntaxException {
/* 333 */     aag aag = ☃.e();
/* 334 */     list.forEach(bmb1 -> {
/*     */           bcv bcv = new bcv(☃, dcn1.b, dcn1.c, dcn1.d, bmb1.i());
/*     */           
/*     */           bcv.m();
/*     */           ☃.c(bcv);
/*     */         });
/* 340 */     a1.accept(list);
/* 341 */     return list.size();
/*     */   }
/*     */   
/*     */   private static void a(db ☃, List<bmb> list) {
/* 345 */     if (list.size() == 1) {
/* 346 */       bmb bmb = list.get(0);
/* 347 */       ☃.a(new of("commands.drop.success.single", new Object[] { Integer.valueOf(bmb.E()), bmb.C() }), false);
/*     */     } else {
/* 349 */       ☃.a(new of("commands.drop.success.multiple", new Object[] { Integer.valueOf(list.size()) }), false);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(db ☃, List<bmb> list, vk vk1) {
/* 354 */     if (list.size() == 1) {
/* 355 */       bmb bmb = list.get(0);
/* 356 */       ☃.a(new of("commands.drop.success.single_with_table", new Object[] { Integer.valueOf(bmb.E()), bmb.C(), vk1 }), false);
/*     */     } else {
/* 358 */       ☃.a(new of("commands.drop.success.multiple_with_table", new Object[] { Integer.valueOf(list.size()), vk1 }), false);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static bmb a(db ☃, aqf aqf1) throws CommandSyntaxException {
/* 363 */     aqa aqa = ☃.g();
/* 364 */     if (aqa instanceof aqm) {
/* 365 */       return ((aqm)aqa).b(aqf1);
/*     */     }
/* 367 */     throw b.create(aqa.d());
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(CommandContext<db> ☃, fx fx1, bmb bmb1, b b1) throws CommandSyntaxException {
/* 372 */     db db = (db)☃.getSource();
/* 373 */     aag aag = db.e();
/* 374 */     ceh ceh = aag.d_(fx1);
/* 375 */     ccj ccj = aag.c(fx1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 382 */     cyv.a a = (new cyv.a(aag)).<dcn>a(dbc.f, dcn.a(fx1)).<ceh>a(dbc.g, ceh).<ccj>b(dbc.h, ccj).<aqa>b(dbc.a, db.f()).a(dbc.i, bmb1);
/*     */     
/* 384 */     List<bmb> list = ceh.a(a);
/* 385 */     return b1.accept(☃, list, list -> a(☃, list, ceh1.b().r()));
/*     */   }
/*     */   
/*     */   private static int a(CommandContext<db> ☃, aqa aqa1, b b1) throws CommandSyntaxException {
/* 389 */     if (!(aqa1 instanceof aqm)) {
/* 390 */       throw c.create(aqa1.d());
/*     */     }
/*     */     
/* 393 */     vk vk = ((aqm)aqa1).dp();
/* 394 */     db db = (db)☃.getSource();
/*     */     
/* 396 */     cyv.a a = new cyv.a(db.e());
/* 397 */     aqa aqa2 = db.f();
/* 398 */     if (aqa2 instanceof bfw) {
/* 399 */       a.a(dbc.b, (bfw)aqa2);
/*     */     }
/* 401 */     a.a(dbc.c, apk.o);
/* 402 */     a.b(dbc.e, aqa2);
/* 403 */     a.b(dbc.d, aqa2);
/* 404 */     a.a(dbc.a, aqa1);
/* 405 */     a.a(dbc.f, db.d());
/*     */     
/* 407 */     cyy cyy = db.j().aJ().a(vk);
/* 408 */     List<bmb> list = cyy.a(a.a(dbb.f));
/* 409 */     return b1.accept(☃, list, list -> a(☃, list, vk1));
/*     */   }
/*     */   
/*     */   private static int a(CommandContext<db> ☃, vk vk1, b b1) throws CommandSyntaxException {
/* 413 */     db db = (db)☃.getSource();
/*     */ 
/*     */ 
/*     */     
/* 417 */     cyv.a a = (new cyv.a(db.e())).<aqa>b(dbc.a, db.f()).a(dbc.f, db.d());
/*     */     
/* 419 */     return a(☃, vk1, a.a(dbb.b), b1);
/*     */   }
/*     */   
/*     */   private static int a(CommandContext<db> ☃, vk vk1, fx fx1, bmb bmb1, b b1) throws CommandSyntaxException {
/* 423 */     db db = (db)☃.getSource();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 429 */     cyv cyv = (new cyv.a(db.e())).<dcn>a(dbc.f, dcn.a(fx1)).<bmb>a(dbc.i, bmb1).<aqa>b(dbc.a, db.f()).a(dbb.e);
/*     */     
/* 431 */     return a(☃, vk1, cyv, b1);
/*     */   }
/*     */   
/*     */   private static int a(CommandContext<db> ☃, vk vk1, cyv cyv1, b b1) throws CommandSyntaxException {
/* 435 */     db db = (db)☃.getSource();
/* 436 */     cyy cyy = db.j().aJ().a(vk1);
/* 437 */     List<bmb> list = cyy.a(cyv1);
/* 438 */     return b1.accept(☃, list, list -> a(☃, list));
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface c {
/*     */     ArgumentBuilder<db, ?> construct(ArgumentBuilder<db, ?> param1ArgumentBuilder, xl.b param1b);
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface b {
/*     */     int accept(CommandContext<db> param1CommandContext, List<bmb> param1List, xl.a param1a) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface a {
/*     */     void accept(List<bmb> param1List) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */