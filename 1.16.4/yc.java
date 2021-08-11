/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class yc
/*     */ {
/*  54 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.scoreboard.objectives.add.duplicate"));
/*  55 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.scoreboard.objectives.display.alreadyEmpty"));
/*  56 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.scoreboard.objectives.display.alreadySet"));
/*  57 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("commands.scoreboard.players.enable.failed")); private static final Dynamic2CommandExceptionType f;
/*  58 */   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new of("commands.scoreboard.players.enable.invalid")); static {
/*  59 */     f = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.scoreboard.players.get.null", new Object[] { ☃, object1 }));
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  62 */     ☃.register(
/*  63 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("scoreboard")
/*  64 */         .requires(☃ -> ☃.c(2)))
/*  65 */         .then((
/*  66 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("objectives")
/*  67 */           .then(
/*  68 */             dc.a("list")
/*  69 */             .executes(☃ -> b((db)☃.getSource()))))
/*     */           
/*  71 */           .then(
/*  72 */             dc.a("add")
/*  73 */             .then(
/*  74 */               dc.<T>a("objective", (ArgumentType<T>)StringArgumentType.word())
/*  75 */               .then((
/*  76 */                 (RequiredArgumentBuilder)dc.<T>a("criteria", du.a())
/*  77 */                 .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "objective"), du.a(☃, "criteria"), new oe(StringArgumentType.getString(☃, "objective")))))
/*  78 */                 .then(
/*  79 */                   dc.<T>a("displayName", dg.a())
/*  80 */                   .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "objective"), du.a(☃, "criteria"), dg.a(☃, "displayName"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  85 */           .then(
/*  86 */             dc.a("modify")
/*  87 */             .then((
/*  88 */               (RequiredArgumentBuilder)dc.<T>a("objective", dt.a())
/*  89 */               .then(
/*  90 */                 dc.a("displayname")
/*  91 */                 .then(
/*  92 */                   dc.<T>a("displayName", dg.a())
/*  93 */                   .executes(☃ -> a((db)☃.getSource(), dt.a(☃, "objective"), dg.a(☃, "displayName"))))))
/*     */               
/*  95 */               .then((ArgumentBuilder)a()))))
/*     */ 
/*     */           
/*  98 */           .then(
/*  99 */             dc.a("remove")
/* 100 */             .then(
/* 101 */               dc.<T>a("objective", dt.a())
/* 102 */               .executes(☃ -> a((db)☃.getSource(), dt.a(☃, "objective"))))))
/*     */ 
/*     */           
/* 105 */           .then(
/* 106 */             dc.a("setdisplay")
/* 107 */             .then((
/* 108 */               (RequiredArgumentBuilder)dc.<T>a("slot", ea.a())
/* 109 */               .executes(☃ -> a((db)☃.getSource(), ea.a(☃, "slot"))))
/* 110 */               .then(
/* 111 */                 dc.<T>a("objective", dt.a())
/* 112 */                 .executes(☃ -> a((db)☃.getSource(), ea.a(☃, "slot"), dt.a(☃, "objective"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 117 */         .then((
/* 118 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("players")
/* 119 */           .then((
/* 120 */             (LiteralArgumentBuilder)dc.a("list")
/* 121 */             .executes(☃ -> a((db)☃.getSource())))
/* 122 */             .then(
/* 123 */               dc.<T>a("target", dz.a())
/* 124 */               .suggests(dz.a)
/* 125 */               .executes(☃ -> a((db)☃.getSource(), dz.a(☃, "target"))))))
/*     */ 
/*     */           
/* 128 */           .then(
/* 129 */             dc.a("set")
/* 130 */             .then(
/* 131 */               dc.<T>a("targets", dz.b())
/* 132 */               .suggests(dz.a)
/* 133 */               .then(
/* 134 */                 dc.<T>a("objective", dt.a())
/* 135 */                 .then(
/* 136 */                   dc.<T>a("score", (ArgumentType<T>)IntegerArgumentType.integer())
/* 137 */                   .executes(☃ -> a((db)☃.getSource(), dz.c(☃, "targets"), dt.b(☃, "objective"), IntegerArgumentType.getInteger(☃, "score"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 142 */           .then(
/* 143 */             dc.a("get")
/* 144 */             .then(
/* 145 */               dc.<T>a("target", dz.a())
/* 146 */               .suggests(dz.a)
/* 147 */               .then(
/* 148 */                 dc.<T>a("objective", dt.a())
/* 149 */                 .executes(☃ -> a((db)☃.getSource(), dz.a(☃, "target"), dt.a(☃, "objective")))))))
/*     */ 
/*     */ 
/*     */           
/* 153 */           .then(
/* 154 */             dc.a("add")
/* 155 */             .then(
/* 156 */               dc.<T>a("targets", dz.b())
/* 157 */               .suggests(dz.a)
/* 158 */               .then(
/* 159 */                 dc.<T>a("objective", dt.a())
/* 160 */                 .then(
/* 161 */                   dc.<T>a("score", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 162 */                   .executes(☃ -> b((db)☃.getSource(), dz.c(☃, "targets"), dt.b(☃, "objective"), IntegerArgumentType.getInteger(☃, "score"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 167 */           .then(
/* 168 */             dc.a("remove")
/* 169 */             .then(
/* 170 */               dc.<T>a("targets", dz.b())
/* 171 */               .suggests(dz.a)
/* 172 */               .then(
/* 173 */                 dc.<T>a("objective", dt.a())
/* 174 */                 .then(
/* 175 */                   dc.<T>a("score", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 176 */                   .executes(☃ -> c((db)☃.getSource(), dz.c(☃, "targets"), dt.b(☃, "objective"), IntegerArgumentType.getInteger(☃, "score"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 181 */           .then(
/* 182 */             dc.a("reset")
/* 183 */             .then((
/* 184 */               (RequiredArgumentBuilder)dc.<T>a("targets", dz.b())
/* 185 */               .suggests(dz.a)
/* 186 */               .executes(☃ -> a((db)☃.getSource(), dz.c(☃, "targets"))))
/* 187 */               .then(
/* 188 */                 dc.<T>a("objective", dt.a())
/* 189 */                 .executes(☃ -> b((db)☃.getSource(), dz.c(☃, "targets"), dt.a(☃, "objective")))))))
/*     */ 
/*     */ 
/*     */           
/* 193 */           .then(
/* 194 */             dc.a("enable")
/* 195 */             .then(
/* 196 */               dc.<T>a("targets", dz.b())
/* 197 */               .suggests(dz.a)
/* 198 */               .then(
/* 199 */                 dc.<T>a("objective", dt.a())
/* 200 */                 .suggests((☃, suggestionsBuilder) -> a((db)☃.getSource(), dz.c(☃, "targets"), suggestionsBuilder))
/* 201 */                 .executes(☃ -> a((db)☃.getSource(), dz.c(☃, "targets"), dt.a(☃, "objective")))))))
/*     */ 
/*     */ 
/*     */           
/* 205 */           .then(
/* 206 */             dc.a("operation")
/* 207 */             .then(
/* 208 */               dc.<T>a("targets", dz.b())
/* 209 */               .suggests(dz.a)
/* 210 */               .then(
/* 211 */                 dc.<T>a("targetObjective", dt.a())
/* 212 */                 .then(
/* 213 */                   dc.<T>a("operation", dv.a())
/* 214 */                   .then(
/* 215 */                     dc.<T>a("source", dz.b())
/* 216 */                     .suggests(dz.a)
/* 217 */                     .then(
/* 218 */                       dc.<T>a("sourceObjective", dt.a())
/* 219 */                       .executes(☃ -> a((db)☃.getSource(), dz.c(☃, "targets"), dt.b(☃, "targetObjective"), dv.a(☃, "operation"), dz.c(☃, "source"), dt.a(☃, "sourceObjective")))))))))));
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
/*     */   private static LiteralArgumentBuilder<db> a() {
/* 231 */     LiteralArgumentBuilder<db> ☃ = dc.a("rendertype");
/*     */     
/* 233 */     for (ddq.a a : ddq.a.values()) {
/* 234 */       ☃.then(dc.a(a.a())
/* 235 */           .executes(commandContext -> a((db)commandContext.getSource(), dt.a(commandContext, "objective"), ☃)));
/*     */     }
/*     */     
/* 238 */     return ☃;
/*     */   }
/*     */   
/*     */   private static CompletableFuture<Suggestions> a(db ☃, Collection<String> collection, SuggestionsBuilder suggestionsBuilder) {
/* 242 */     List<String> list = Lists.newArrayList();
/* 243 */     ddn ddn = ☃.j().aH();
/*     */     
/* 245 */     for (ddk ddk : ddn.c()) {
/* 246 */       if (ddk.c() == ddq.c) {
/* 247 */         boolean bool = false;
/* 248 */         for (String str : collection) {
/* 249 */           if (!ddn.b(str, ddk) || ddn.c(str, ddk).g()) {
/* 250 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 254 */         if (bool) {
/* 255 */           list.add(ddk.b());
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 260 */     return dd.b(list, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   private static int a(db ☃, String str, ddk ddk1) throws CommandSyntaxException {
/* 264 */     ddn ddn = ☃.j().aH();
/* 265 */     if (!ddn.b(str, ddk1)) {
/* 266 */       throw f.create(ddk1.b(), str);
/*     */     }
/*     */     
/* 269 */     ddm ddm = ddn.c(str, ddk1);
/* 270 */     ☃.a(new of("commands.scoreboard.players.get.success", new Object[] { str, Integer.valueOf(ddm.b()), ddk1.e() }), false);
/*     */     
/* 272 */     return ddm.b();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<String> collection1, ddk ddk1, dv.a a1, Collection<String> collection2, ddk ddk2) throws CommandSyntaxException {
/* 276 */     ddn ddn = ☃.j().aH();
/* 277 */     int i = 0;
/*     */     
/* 279 */     for (String str : collection1) {
/* 280 */       ddm ddm = ddn.c(str, ddk1);
/* 281 */       for (String str1 : collection2) {
/* 282 */         ddm ddm1 = ddn.c(str1, ddk2);
/* 283 */         a1.apply(ddm, ddm1);
/*     */       } 
/* 285 */       i += ddm.b();
/*     */     } 
/*     */     
/* 288 */     if (collection1.size() == 1) {
/* 289 */       ☃.a(new of("commands.scoreboard.players.operation.success.single", new Object[] { ddk1.e(), collection1.iterator().next(), Integer.valueOf(i) }), true);
/*     */     } else {
/* 291 */       ☃.a(new of("commands.scoreboard.players.operation.success.multiple", new Object[] { ddk1.e(), Integer.valueOf(collection1.size()) }), true);
/*     */     } 
/*     */     
/* 294 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<String> collection, ddk ddk1) throws CommandSyntaxException {
/* 298 */     if (ddk1.c() != ddq.c) {
/* 299 */       throw e.create();
/*     */     }
/* 301 */     ddn ddn = ☃.j().aH();
/*     */     
/* 303 */     int i = 0;
/*     */     
/* 305 */     for (String str : collection) {
/* 306 */       ddm ddm = ddn.c(str, ddk1);
/* 307 */       if (ddm.g()) {
/* 308 */         ddm.a(false);
/* 309 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 313 */     if (i == 0) {
/* 314 */       throw d.create();
/*     */     }
/*     */     
/* 317 */     if (collection.size() == 1) {
/* 318 */       ☃.a(new of("commands.scoreboard.players.enable.success.single", new Object[] { ddk1.e(), collection.iterator().next() }), true);
/*     */     } else {
/* 320 */       ☃.a(new of("commands.scoreboard.players.enable.success.multiple", new Object[] { ddk1.e(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 323 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<String> collection) {
/* 327 */     ddn ddn = ☃.j().aH();
/*     */     
/* 329 */     for (String str : collection) {
/* 330 */       ddn.d(str, null);
/*     */     }
/*     */     
/* 333 */     if (collection.size() == 1) {
/* 334 */       ☃.a(new of("commands.scoreboard.players.reset.all.single", new Object[] { collection.iterator().next() }), true);
/*     */     } else {
/* 336 */       ☃.a(new of("commands.scoreboard.players.reset.all.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 339 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(db ☃, Collection<String> collection, ddk ddk1) {
/* 343 */     ddn ddn = ☃.j().aH();
/*     */     
/* 345 */     for (String str : collection) {
/* 346 */       ddn.d(str, ddk1);
/*     */     }
/*     */     
/* 349 */     if (collection.size() == 1) {
/* 350 */       ☃.a(new of("commands.scoreboard.players.reset.specific.single", new Object[] { ddk1.e(), collection.iterator().next() }), true);
/*     */     } else {
/* 352 */       ☃.a(new of("commands.scoreboard.players.reset.specific.multiple", new Object[] { ddk1.e(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 355 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<String> collection, ddk ddk1, int i) {
/* 359 */     ddn ddn = ☃.j().aH();
/*     */     
/* 361 */     for (String str : collection) {
/* 362 */       ddm ddm = ddn.c(str, ddk1);
/* 363 */       ddm.c(i);
/*     */     } 
/*     */     
/* 366 */     if (collection.size() == 1) {
/* 367 */       ☃.a(new of("commands.scoreboard.players.set.success.single", new Object[] { ddk1.e(), collection.iterator().next(), Integer.valueOf(i) }), true);
/*     */     } else {
/* 369 */       ☃.a(new of("commands.scoreboard.players.set.success.multiple", new Object[] { ddk1.e(), Integer.valueOf(collection.size()), Integer.valueOf(i) }), true);
/*     */     } 
/*     */     
/* 372 */     return i * collection.size();
/*     */   }
/*     */   
/*     */   private static int b(db ☃, Collection<String> collection, ddk ddk1, int i) {
/* 376 */     ddn ddn = ☃.j().aH();
/* 377 */     int j = 0;
/*     */     
/* 379 */     for (String str : collection) {
/* 380 */       ddm ddm = ddn.c(str, ddk1);
/* 381 */       ddm.c(ddm.b() + i);
/* 382 */       j += ddm.b();
/*     */     } 
/*     */     
/* 385 */     if (collection.size() == 1) {
/* 386 */       ☃.a(new of("commands.scoreboard.players.add.success.single", new Object[] { Integer.valueOf(i), ddk1.e(), collection.iterator().next(), Integer.valueOf(j) }), true);
/*     */     } else {
/* 388 */       ☃.a(new of("commands.scoreboard.players.add.success.multiple", new Object[] { Integer.valueOf(i), ddk1.e(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 391 */     return j;
/*     */   }
/*     */   
/*     */   private static int c(db ☃, Collection<String> collection, ddk ddk1, int i) {
/* 395 */     ddn ddn = ☃.j().aH();
/* 396 */     int j = 0;
/*     */     
/* 398 */     for (String str : collection) {
/* 399 */       ddm ddm = ddn.c(str, ddk1);
/* 400 */       ddm.c(ddm.b() - i);
/* 401 */       j += ddm.b();
/*     */     } 
/*     */     
/* 404 */     if (collection.size() == 1) {
/* 405 */       ☃.a(new of("commands.scoreboard.players.remove.success.single", new Object[] { Integer.valueOf(i), ddk1.e(), collection.iterator().next(), Integer.valueOf(j) }), true);
/*     */     } else {
/* 407 */       ☃.a(new of("commands.scoreboard.players.remove.success.multiple", new Object[] { Integer.valueOf(i), ddk1.e(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 410 */     return j;
/*     */   }
/*     */   
/*     */   private static int a(db ☃) {
/* 414 */     Collection<String> collection = ☃.j().aH().e();
/*     */     
/* 416 */     if (collection.isEmpty()) {
/* 417 */       ☃.a(new of("commands.scoreboard.players.list.empty"), false);
/*     */     } else {
/* 419 */       ☃.a(new of("commands.scoreboard.players.list.success", new Object[] { Integer.valueOf(collection.size()), ns.a(collection) }), false);
/*     */     } 
/*     */     
/* 422 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, String str) {
/* 426 */     Map<ddk, ddm> map = ☃.j().aH().e(str);
/*     */     
/* 428 */     if (map.isEmpty()) {
/* 429 */       ☃.a(new of("commands.scoreboard.players.list.entity.empty", new Object[] { str }), false);
/*     */     } else {
/* 431 */       ☃.a(new of("commands.scoreboard.players.list.entity.success", new Object[] { str, Integer.valueOf(map.size()) }), false);
/* 432 */       for (Map.Entry<ddk, ddm> entry : map.entrySet()) {
/* 433 */         ☃.a(new of("commands.scoreboard.players.list.entity.entry", new Object[] { ((ddk)entry.getKey()).e(), Integer.valueOf(((ddm)entry.getValue()).b()) }), false);
/*     */       } 
/*     */     } 
/*     */     
/* 437 */     return map.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, int i) throws CommandSyntaxException {
/* 441 */     ddn ddn = ☃.j().aH();
/*     */     
/* 443 */     if (ddn.a(i) == null) {
/* 444 */       throw b.create();
/*     */     }
/*     */     
/* 447 */     ddn.a(i, (ddk)null);
/* 448 */     ☃.a(new of("commands.scoreboard.objectives.display.cleared", new Object[] { ddn.h()[i] }), true);
/*     */     
/* 450 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, int i, ddk ddk1) throws CommandSyntaxException {
/* 454 */     ddn ddn = ☃.j().aH();
/*     */     
/* 456 */     if (ddn.a(i) == ddk1) {
/* 457 */       throw c.create();
/*     */     }
/*     */     
/* 460 */     ddn.a(i, ddk1);
/* 461 */     ☃.a(new of("commands.scoreboard.objectives.display.set", new Object[] { ddn.h()[i], ddk1.d() }), true);
/*     */     
/* 463 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddk ddk1, nr nr1) {
/* 467 */     if (!ddk1.d().equals(nr1)) {
/* 468 */       ddk1.a(nr1);
/* 469 */       ☃.a(new of("commands.scoreboard.objectives.modify.displayname", new Object[] { ddk1.b(), ddk1.e() }), true);
/*     */     } 
/*     */     
/* 472 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddk ddk1, ddq.a a1) {
/* 476 */     if (ddk1.f() != a1) {
/* 477 */       ddk1.a(a1);
/* 478 */       ☃.a(new of("commands.scoreboard.objectives.modify.rendertype", new Object[] { ddk1.e() }), true);
/*     */     } 
/*     */     
/* 481 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddk ddk1) {
/* 485 */     ddn ddn = ☃.j().aH();
/* 486 */     ddn.j(ddk1);
/* 487 */     ☃.a(new of("commands.scoreboard.objectives.remove.success", new Object[] { ddk1.e() }), true);
/* 488 */     return ddn.c().size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, String str, ddq ddq1, nr nr1) throws CommandSyntaxException {
/* 492 */     ddn ddn = ☃.j().aH();
/*     */     
/* 494 */     if (ddn.d(str) != null) {
/* 495 */       throw a.create();
/*     */     }
/* 497 */     if (str.length() > 16) {
/* 498 */       throw dt.a.create(Integer.valueOf(16));
/*     */     }
/*     */     
/* 501 */     ddn.a(str, ddq1, nr1, ddq1.e());
/* 502 */     ddk ddk = ddn.d(str);
/*     */     
/* 504 */     ☃.a(new of("commands.scoreboard.objectives.add.success", new Object[] { ddk.e() }), true);
/*     */     
/* 506 */     return ddn.c().size();
/*     */   }
/*     */   
/*     */   private static int b(db ☃) {
/* 510 */     Collection<ddk> collection = ☃.j().aH().c();
/*     */     
/* 512 */     if (collection.isEmpty()) {
/* 513 */       ☃.a(new of("commands.scoreboard.objectives.list.empty"), false);
/*     */     } else {
/* 515 */       ☃.a(new of("commands.scoreboard.objectives.list.success", new Object[] { Integer.valueOf(collection.size()), ns.b(collection, ddk::e) }), false);
/*     */     } 
/*     */     
/* 518 */     return collection.size();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */