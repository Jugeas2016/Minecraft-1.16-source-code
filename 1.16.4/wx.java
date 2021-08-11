/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.Command;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.ResultConsumer;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.OptionalInt;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BiPredicate;
/*     */ import java.util.function.BinaryOperator;
/*     */ import java.util.function.IntFunction;
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
/*     */ public class wx
/*     */ {
/*     */   private static final Dynamic2CommandExceptionType a;
/*     */   
/*     */   static {
/*  97 */     a = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.execute.blocks.toobig", new Object[] { ☃, object1 }));
/*     */   }
/*  99 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.execute.conditional.fail")); private static final DynamicCommandExceptionType c; static {
/* 100 */     c = new DynamicCommandExceptionType(☃ -> new of("commands.execute.conditional.fail_count", new Object[] { ☃ }));
/*     */   }
/*     */   
/*     */   private static final BinaryOperator<ResultConsumer<db>> d = (☃, resultConsumer1) -> ();
/*     */   private static final SuggestionProvider<db> e;
/*     */   
/*     */   static {
/* 107 */     e = ((☃, suggestionsBuilder) -> {
/*     */         cza cza = ((db)☃.getSource()).j().aK();
/*     */         return dd.a(cza.a(), suggestionsBuilder);
/*     */       });
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
/*     */   public static void a(CommandDispatcher<db> ☃) {
/* 123 */     LiteralCommandNode<db> literalCommandNode = ☃.register((LiteralArgumentBuilder)dc.a("execute").requires(☃ -> ☃.c(2)));
/*     */     
/* 125 */     ☃.register(
/* 126 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("execute")
/* 127 */         .requires(☃ -> ☃.c(2)))
/* 128 */         .then(
/* 129 */           dc.a("run")
/* 130 */           .redirect((CommandNode)☃.getRoot())))
/*     */         
/* 132 */         .then(
/* 133 */           a((CommandNode<db>)literalCommandNode, dc.a("if"), true)))
/*     */         
/* 135 */         .then(
/* 136 */           a((CommandNode<db>)literalCommandNode, dc.a("unless"), false)))
/*     */         
/* 138 */         .then(
/* 139 */           dc.a("as")
/* 140 */           .then(
/* 141 */             dc.<T>a("targets", dk.b())
/* 142 */             .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                 List<db> list = Lists.newArrayList();
/*     */ 
/*     */                 
/*     */                 for (aqa aqa : dk.c(☃, "targets")) {
/*     */                   list.add(((db)☃.getSource()).a(aqa));
/*     */                 }
/*     */                 
/*     */                 return list;
/* 151 */               })))).then(
/* 152 */           dc.a("at")
/* 153 */           .then(
/* 154 */             dc.<T>a("targets", dk.b())
/* 155 */             .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                 List<db> list = Lists.newArrayList();
/*     */ 
/*     */                 
/*     */                 for (aqa aqa : dk.c(☃, "targets")) {
/*     */                   list.add(((db)☃.getSource()).a((aag)aqa.l).a(aqa.cA()).a(aqa.bi()));
/*     */                 }
/*     */                 
/*     */                 return list;
/* 164 */               })))).then((
/* 165 */           (LiteralArgumentBuilder)dc.a("store")
/* 166 */           .then(a(literalCommandNode, dc.a("result"), true)))
/* 167 */           .then(a(literalCommandNode, dc.a("success"), false))))
/*     */         
/* 169 */         .then((
/* 170 */           (LiteralArgumentBuilder)dc.a("positioned")
/* 171 */           .then(
/* 172 */             dc.<T>a("pos", er.a())
/* 173 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((db)☃.getSource()).a(er.a(☃, "pos")).a(dj.a.a))))
/*     */           
/* 175 */           .then(
/* 176 */             dc.a("as")
/* 177 */             .then(
/* 178 */               dc.<T>a("targets", dk.b())
/* 179 */               .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                   List<db> list = Lists.newArrayList();
/*     */ 
/*     */                   
/*     */                   for (aqa aqa : dk.c(☃, "targets")) {
/*     */                     list.add(((db)☃.getSource()).a(aqa.cA()));
/*     */                   }
/*     */ 
/*     */                   
/*     */                   return list;
/* 189 */                 }))))).then((
/* 190 */           (LiteralArgumentBuilder)dc.a("rotated")
/* 191 */           .then(
/* 192 */             dc.<T>a("rot", eo.a())
/* 193 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((db)☃.getSource()).a(eo.a(☃, "rot").b((db)☃.getSource())))))
/*     */           
/* 195 */           .then(
/* 196 */             dc.a("as")
/* 197 */             .then(
/* 198 */               dc.<T>a("targets", dk.b())
/* 199 */               .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                   List<db> list = Lists.newArrayList();
/*     */ 
/*     */                   
/*     */                   for (aqa aqa : dk.c(☃, "targets")) {
/*     */                     list.add(((db)☃.getSource()).a(aqa.bi()));
/*     */                   }
/*     */ 
/*     */                   
/*     */                   return list;
/* 209 */                 }))))).then((
/* 210 */           (LiteralArgumentBuilder)dc.a("facing")
/* 211 */           .then(
/* 212 */             dc.a("entity")
/* 213 */             .then(
/* 214 */               dc.<T>a("targets", dk.b())
/* 215 */               .then(
/* 216 */                 dc.<T>a("anchor", dj.a())
/* 217 */                 .fork((CommandNode)literalCommandNode, ☃ -> {
/*     */                     List<db> list = Lists.newArrayList();
/*     */ 
/*     */                     
/*     */                     dj.a a = dj.a(☃, "anchor");
/*     */                     
/*     */                     for (aqa aqa : dk.c(☃, "targets")) {
/*     */                       list.add(((db)☃.getSource()).a(aqa, a));
/*     */                     }
/*     */                     
/*     */                     return list;
/* 228 */                   }))))).then(
/* 229 */             dc.<T>a("pos", er.a())
/* 230 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((db)☃.getSource()).b(er.a(☃, "pos"))))))
/*     */ 
/*     */         
/* 233 */         .then(
/* 234 */           dc.a("align")
/* 235 */           .then(
/* 236 */             dc.<T>a("axes", ep.a())
/* 237 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((db)☃.getSource()).a(((db)☃.getSource()).d().a(ep.a(☃, "axes")))))))
/*     */ 
/*     */         
/* 240 */         .then(
/* 241 */           dc.a("anchored")
/* 242 */           .then(
/* 243 */             dc.<T>a("anchor", dj.a())
/* 244 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((db)☃.getSource()).a(dj.a(☃, "anchor"))))))
/*     */ 
/*     */         
/* 247 */         .then(
/* 248 */           dc.a("in")
/* 249 */           .then(
/* 250 */             dc.<T>a("dimension", di.a())
/* 251 */             .redirect((CommandNode)literalCommandNode, ☃ -> ((db)☃.getSource()).a(di.a(☃, "dimension"))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static ArgumentBuilder<db, ?> a(LiteralCommandNode<db> ☃, LiteralArgumentBuilder<db> literalArgumentBuilder, boolean bool) {
/* 258 */     literalArgumentBuilder.then(
/* 259 */         dc.a("score")
/* 260 */         .then(
/* 261 */           dc.<T>a("targets", dz.b())
/* 262 */           .suggests(dz.a)
/* 263 */           .then(
/* 264 */             dc.<T>a("objective", dt.a())
/* 265 */             .redirect((CommandNode)☃, commandContext -> a((db)commandContext.getSource(), dz.c(commandContext, "targets"), dt.a(commandContext, "objective"), ☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 270 */     literalArgumentBuilder.then(
/* 271 */         dc.a("bossbar")
/* 272 */         .then((
/* 273 */           (RequiredArgumentBuilder)dc.<T>a("id", dy.a())
/* 274 */           .suggests(wk.a)
/* 275 */           .then(
/* 276 */             dc.a("value")
/* 277 */             .redirect((CommandNode)☃, commandContext -> a((db)commandContext.getSource(), wk.a(commandContext), true, ☃))))
/*     */           
/* 279 */           .then(
/* 280 */             dc.a("max")
/* 281 */             .redirect((CommandNode)☃, commandContext -> a((db)commandContext.getSource(), wk.a(commandContext), false, ☃)))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 286 */     for (Iterator<za.c> iterator = za.b.iterator(); iterator.hasNext(); ) { za.c c = iterator.next();
/* 287 */       c.a((ArgumentBuilder)literalArgumentBuilder, argumentBuilder -> argumentBuilder.then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("path", dr.a()).then(dc.a("int").then(dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(dc.a("float").then(dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(dc.a("short").then(dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(dc.a("long").then(dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(dc.a("double").then(dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ())))).then(dc.a("byte").then(dc.<T>a("scale", (ArgumentType<T>)DoubleArgumentType.doubleArg()).redirect((CommandNode)☃, ()))))); }
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
/* 341 */     return (ArgumentBuilder)literalArgumentBuilder;
/*     */   }
/*     */   
/*     */   private static db a(db ☃, Collection<String> collection, ddk ddk1, boolean bool) {
/* 345 */     ddn ddn = ☃.j().aH();
/*     */     
/* 347 */     return ☃.a((commandContext, bool2, i) -> { for (String str : ☃) { ddm ddm = ddn1.c(str, ddk1); int j = bool1 ? i : (bool2 ? 1 : 0); ddm.c(j); }  }d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static db a(db ☃, wc wc1, boolean bool1, boolean bool2) {
/* 357 */     return ☃.a((commandContext, bool2, i) -> { int j = ☃ ? i : (bool2 ? 1 : 0); if (bool1) { wc1.a(j); } else { wc1.b(j); }  }d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static db a(db ☃, yz yz1, dr.h h1, IntFunction<mt> intFunction, boolean bool) {
/* 368 */     return ☃.a((commandContext, bool2, i) -> {
/*     */           try {
/*     */             md md = ☃.a();
/*     */             int j = bool1 ? i : (bool2 ? 1 : 0);
/*     */             h1.b(md, ());
/*     */             ☃.a(md);
/* 374 */           } catch (CommandSyntaxException commandSyntaxException) {}
/*     */         }d);
/*     */   }
/*     */ 
/*     */   
/*     */   private static ArgumentBuilder<db, ?> a(CommandNode<db> ☃, LiteralArgumentBuilder<db> literalArgumentBuilder, boolean bool) {
/* 380 */     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder
/* 381 */       .then(
/* 382 */         dc.a("block")
/* 383 */         .then(
/* 384 */           dc.<T>a("pos", ek.a())
/* 385 */           .then(
/* 386 */             a(☃, (ArgumentBuilder<db, ?>)dc.a("block", eg.a()), bool, ☃ -> eg.a(☃, "block").test(new cel(((db)☃.getSource()).e(), ek.a(☃, "pos"), true)))))))
/*     */ 
/*     */ 
/*     */       
/* 390 */       .then(
/* 391 */         dc.a("score")
/* 392 */         .then(
/* 393 */           dc.<T>a("target", dz.a())
/* 394 */           .suggests(dz.a)
/* 395 */           .then((
/* 396 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("targetObjective", dt.a())
/* 397 */             .then(
/* 398 */               dc.a("=")
/* 399 */               .then(
/* 400 */                 dc.<T>a("source", dz.a())
/* 401 */                 .suggests(dz.a)
/* 402 */                 .then(
/* 403 */                   a(☃, (ArgumentBuilder<db, ?>)dc.a("sourceObjective", dt.a()), bool, ☃ -> a(☃, Integer::equals))))))
/*     */ 
/*     */ 
/*     */             
/* 407 */             .then(
/* 408 */               dc.a("<")
/* 409 */               .then(
/* 410 */                 dc.<T>a("source", dz.a())
/* 411 */                 .suggests(dz.a)
/* 412 */                 .then(
/* 413 */                   a(☃, (ArgumentBuilder<db, ?>)dc.a("sourceObjective", dt.a()), bool, ☃ -> a(☃, ()))))))
/*     */ 
/*     */ 
/*     */             
/* 417 */             .then(
/* 418 */               dc.a("<=")
/* 419 */               .then(
/* 420 */                 dc.<T>a("source", dz.a())
/* 421 */                 .suggests(dz.a)
/* 422 */                 .then(
/* 423 */                   a(☃, (ArgumentBuilder<db, ?>)dc.a("sourceObjective", dt.a()), bool, ☃ -> a(☃, ()))))))
/*     */ 
/*     */ 
/*     */             
/* 427 */             .then(
/* 428 */               dc.a(">")
/* 429 */               .then(
/* 430 */                 dc.<T>a("source", dz.a())
/* 431 */                 .suggests(dz.a)
/* 432 */                 .then(
/* 433 */                   a(☃, (ArgumentBuilder<db, ?>)dc.a("sourceObjective", dt.a()), bool, ☃ -> a(☃, ()))))))
/*     */ 
/*     */ 
/*     */             
/* 437 */             .then(
/* 438 */               dc.a(">=")
/* 439 */               .then(
/* 440 */                 dc.<T>a("source", dz.a())
/* 441 */                 .suggests(dz.a)
/* 442 */                 .then(
/* 443 */                   a(☃, (ArgumentBuilder<db, ?>)dc.a("sourceObjective", dt.a()), bool, ☃ -> a(☃, ()))))))
/*     */ 
/*     */ 
/*     */             
/* 447 */             .then(
/* 448 */               dc.a("matches")
/* 449 */               .then(
/* 450 */                 a(☃, (ArgumentBuilder<db, ?>)dc.a("range", dx.a()), bool, ☃ -> a(☃, dx.b.a(☃, "range")))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 456 */       .then(
/* 457 */         dc.a("blocks")
/* 458 */         .then(
/* 459 */           dc.<T>a("start", ek.a())
/* 460 */           .then(
/* 461 */             dc.<T>a("end", ek.a())
/* 462 */             .then((
/* 463 */               (RequiredArgumentBuilder)dc.<T>a("destination", ek.a())
/* 464 */               .then(
/* 465 */                 a(☃, (ArgumentBuilder)dc.a("all"), bool, false)))
/*     */               
/* 467 */               .then(
/* 468 */                 a(☃, (ArgumentBuilder)dc.a("masked"), bool, true)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 474 */       .then(
/* 475 */         dc.a("entity")
/* 476 */         .then((
/* 477 */           (RequiredArgumentBuilder)dc.<T>a("entities", dk.b())
/* 478 */           .fork(☃, commandContext -> a(commandContext, ☃, !dk.c(commandContext, "entities").isEmpty())))
/* 479 */           .executes(a(bool, ☃ -> dk.c(☃, "entities").size())))))
/*     */ 
/*     */ 
/*     */       
/* 483 */       .then(
/* 484 */         dc.a("predicate")
/* 485 */         .then(
/* 486 */           a(☃, (ArgumentBuilder<db, ?>)dc.<T>a("predicate", dy.a()).suggests(e), bool, ☃ -> a((db)☃.getSource(), dy.c(☃, "predicate")))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 491 */     for (Iterator<za.c> iterator = za.c.iterator(); iterator.hasNext(); ) { za.c c = iterator.next();
/* 492 */       literalArgumentBuilder
/* 493 */         .then(c
/* 494 */           .a((ArgumentBuilder)dc.a("data"), argumentBuilder -> argumentBuilder.then(((RequiredArgumentBuilder)dc.<T>a("path", dr.a()).fork(☃, ())).executes(a(bool, ()))))); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 504 */     return (ArgumentBuilder)literalArgumentBuilder;
/*     */   }
/*     */   
/*     */   private static Command<db> a(boolean ☃, a a1) {
/* 508 */     if (☃) {
/* 509 */       return commandContext -> {
/*     */           int i = ☃.test(commandContext);
/*     */           
/*     */           if (i > 0) {
/*     */             ((db)commandContext.getSource()).a(new of("commands.execute.conditional.pass_count", new Object[] { Integer.valueOf(i) }), false);
/*     */             return i;
/*     */           } 
/*     */           throw b.create();
/*     */         };
/*     */     }
/* 519 */     return commandContext -> {
/*     */         int i = ☃.test(commandContext);
/*     */         if (i == 0) {
/*     */           ((db)commandContext.getSource()).a(new of("commands.execute.conditional.pass"), false);
/*     */           return 1;
/*     */         } 
/*     */         throw c.create(Integer.valueOf(i));
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(yz ☃, dr.h h1) throws CommandSyntaxException {
/* 532 */     return h1.b(☃.a());
/*     */   }
/*     */   
/*     */   private static boolean a(CommandContext<db> ☃, BiPredicate<Integer, Integer> biPredicate) throws CommandSyntaxException {
/* 536 */     String str1 = dz.a(☃, "target");
/* 537 */     ddk ddk1 = dt.a(☃, "targetObjective");
/* 538 */     String str2 = dz.a(☃, "source");
/* 539 */     ddk ddk2 = dt.a(☃, "sourceObjective");
/*     */     
/* 541 */     ddn ddn = ((db)☃.getSource()).j().aH();
/*     */     
/* 543 */     if (!ddn.b(str1, ddk1) || !ddn.b(str2, ddk2)) {
/* 544 */       return false;
/*     */     }
/*     */     
/* 547 */     ddm ddm1 = ddn.c(str1, ddk1);
/* 548 */     ddm ddm2 = ddn.c(str2, ddk2);
/* 549 */     return biPredicate.test(Integer.valueOf(ddm1.b()), Integer.valueOf(ddm2.b()));
/*     */   }
/*     */   
/*     */   private static boolean a(CommandContext<db> ☃, bz.d d1) throws CommandSyntaxException {
/* 553 */     String str = dz.a(☃, "target");
/* 554 */     ddk ddk = dt.a(☃, "targetObjective");
/*     */     
/* 556 */     ddn ddn = ((db)☃.getSource()).j().aH();
/*     */     
/* 558 */     if (!ddn.b(str, ddk)) {
/* 559 */       return false;
/*     */     }
/*     */     
/* 562 */     return d1.d(ddn.c(str, ddk).b());
/*     */   }
/*     */   
/*     */   private static boolean a(db ☃, dbo dbo1) {
/* 566 */     aag aag = ☃.e();
/*     */ 
/*     */ 
/*     */     
/* 570 */     cyv.a a = (new cyv.a(aag)).<dcn>a(dbc.f, ☃.d()).b(dbc.a, ☃.f());
/*     */     
/* 572 */     return dbo1.test(a.a(dbb.c));
/*     */   }
/*     */   
/*     */   private static Collection<db> a(CommandContext<db> ☃, boolean bool1, boolean bool2) {
/* 576 */     if (bool2 == bool1) {
/* 577 */       return Collections.singleton(☃.getSource());
/*     */     }
/* 579 */     return Collections.emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   private static ArgumentBuilder<db, ?> a(CommandNode<db> ☃, ArgumentBuilder<db, ?> argumentBuilder, boolean bool, b b1) {
/* 584 */     return argumentBuilder
/* 585 */       .fork(☃, commandContext -> a(commandContext, ☃, b1.test(commandContext)))
/* 586 */       .executes(commandContext -> {
/*     */           if (☃ == b1.test(commandContext)) {
/*     */             ((db)commandContext.getSource()).a(new of("commands.execute.conditional.pass"), false);
/*     */             return 1;
/*     */           } 
/*     */           throw b.create();
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private static ArgumentBuilder<db, ?> a(CommandNode<db> ☃, ArgumentBuilder<db, ?> argumentBuilder, boolean bool1, boolean bool2) {
/* 597 */     return argumentBuilder
/* 598 */       .fork(☃, commandContext -> a(commandContext, ☃, c(commandContext, bool1).isPresent()))
/* 599 */       .executes(bool1 ? (commandContext -> a(commandContext, ☃)) : (commandContext -> b(commandContext, ☃)));
/*     */   }
/*     */   
/*     */   private static int a(CommandContext<db> ☃, boolean bool) throws CommandSyntaxException {
/* 603 */     OptionalInt optionalInt = c(☃, bool);
/* 604 */     if (optionalInt.isPresent()) {
/* 605 */       ((db)☃.getSource()).a(new of("commands.execute.conditional.pass_count", new Object[] { Integer.valueOf(optionalInt.getAsInt()) }), false);
/* 606 */       return optionalInt.getAsInt();
/*     */     } 
/* 608 */     throw b.create();
/*     */   }
/*     */ 
/*     */   
/*     */   private static int b(CommandContext<db> ☃, boolean bool) throws CommandSyntaxException {
/* 613 */     OptionalInt optionalInt = c(☃, bool);
/* 614 */     if (optionalInt.isPresent()) {
/* 615 */       throw c.create(Integer.valueOf(optionalInt.getAsInt()));
/*     */     }
/* 617 */     ((db)☃.getSource()).a(new of("commands.execute.conditional.pass"), false);
/* 618 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   private static OptionalInt c(CommandContext<db> ☃, boolean bool) throws CommandSyntaxException {
/* 623 */     return a(((db)☃.getSource()).e(), ek.a(☃, "start"), ek.a(☃, "end"), ek.a(☃, "destination"), bool);
/*     */   }
/*     */   
/*     */   private static OptionalInt a(aag ☃, fx fx1, fx fx2, fx fx3, boolean bool) throws CommandSyntaxException {
/* 627 */     cra cra1 = new cra(fx1, fx2);
/* 628 */     cra cra2 = new cra(fx3, fx3.a(cra1.c()));
/* 629 */     fx fx4 = new fx(cra2.a - cra1.a, cra2.b - cra1.b, cra2.c - cra1.c);
/* 630 */     int i = cra1.d() * cra1.e() * cra1.f();
/*     */     
/* 632 */     if (i > 32768) {
/* 633 */       throw a.create(Integer.valueOf(32768), Integer.valueOf(i));
/*     */     }
/*     */     
/* 636 */     int j = 0;
/* 637 */     for (int k = cra1.c; k <= cra1.f; k++) {
/* 638 */       for (int m = cra1.b; m <= cra1.e; m++) {
/* 639 */         for (int n = cra1.a; n <= cra1.d; n++) {
/* 640 */           fx fx5 = new fx(n, m, k);
/* 641 */           fx fx6 = fx5.a(fx4);
/*     */           
/* 643 */           ceh ceh = ☃.d_(fx5);
/* 644 */           if (!bool || !ceh.a(bup.a)) {
/*     */ 
/*     */ 
/*     */             
/* 648 */             if (ceh != ☃.d_(fx6)) {
/* 649 */               return OptionalInt.empty();
/*     */             }
/*     */             
/* 652 */             ccj ccj1 = ☃.c(fx5);
/* 653 */             ccj ccj2 = ☃.c(fx6);
/* 654 */             if (ccj1 != null) {
/* 655 */               if (ccj2 == null) {
/* 656 */                 return OptionalInt.empty();
/*     */               }
/* 658 */               md md1 = ccj1.a(new md());
/* 659 */               md1.r("x");
/* 660 */               md1.r("y");
/* 661 */               md1.r("z");
/*     */               
/* 663 */               md md2 = ccj2.a(new md());
/* 664 */               md2.r("x");
/* 665 */               md2.r("y");
/* 666 */               md2.r("z");
/*     */               
/* 668 */               if (!md1.equals(md2)) {
/* 669 */                 return OptionalInt.empty();
/*     */               }
/*     */             } 
/*     */             
/* 673 */             j++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 678 */     return OptionalInt.of(j);
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface a {
/*     */     int test(CommandContext<db> param1CommandContext) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface b {
/*     */     boolean test(CommandContext<db> param1CommandContext) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */