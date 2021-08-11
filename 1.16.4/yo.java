/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class yo
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*  39 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.team.add.duplicate")); static {
/*  40 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.team.add.longName", new Object[] { ☃ }));
/*  41 */   } private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.team.empty.unchanged"));
/*  42 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("commands.team.option.name.unchanged"));
/*  43 */   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new of("commands.team.option.color.unchanged"));
/*  44 */   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(new of("commands.team.option.friendlyfire.alreadyEnabled"));
/*  45 */   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new of("commands.team.option.friendlyfire.alreadyDisabled"));
/*  46 */   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(new of("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
/*  47 */   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(new of("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
/*  48 */   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(new of("commands.team.option.nametagVisibility.unchanged"));
/*  49 */   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(new of("commands.team.option.deathMessageVisibility.unchanged"));
/*  50 */   private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType(new of("commands.team.option.collisionRule.unchanged"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  53 */     ☃.register(
/*  54 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("team")
/*  55 */         .requires(☃ -> ☃.c(2)))
/*  56 */         .then((
/*  57 */           (LiteralArgumentBuilder)dc.a("list")
/*  58 */           .executes(☃ -> a((db)☃.getSource())))
/*  59 */           .then(
/*  60 */             dc.<T>a("team", ec.a())
/*  61 */             .executes(☃ -> c((db)☃.getSource(), ec.a(☃, "team"))))))
/*     */ 
/*     */         
/*  64 */         .then(
/*  65 */           dc.a("add")
/*  66 */           .then((
/*  67 */             (RequiredArgumentBuilder)dc.<T>a("team", (ArgumentType<T>)StringArgumentType.word())
/*  68 */             .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "team"))))
/*  69 */             .then(
/*  70 */               dc.<T>a("displayName", dg.a())
/*  71 */               .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "team"), dg.a(☃, "displayName")))))))
/*     */ 
/*     */ 
/*     */         
/*  75 */         .then(
/*  76 */           dc.a("remove")
/*  77 */           .then(
/*  78 */             dc.<T>a("team", ec.a())
/*  79 */             .executes(☃ -> b((db)☃.getSource(), ec.a(☃, "team"))))))
/*     */ 
/*     */         
/*  82 */         .then(
/*  83 */           dc.a("empty")
/*  84 */           .then(
/*  85 */             dc.<T>a("team", ec.a())
/*  86 */             .executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"))))))
/*     */ 
/*     */         
/*  89 */         .then(
/*  90 */           dc.a("join")
/*  91 */           .then((
/*  92 */             (RequiredArgumentBuilder)dc.<T>a("team", ec.a())
/*  93 */             .executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), Collections.singleton(((db)☃.getSource()).g().bU()))))
/*  94 */             .then(
/*  95 */               dc.<T>a("members", dz.b())
/*  96 */               .suggests(dz.a)
/*  97 */               .executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), dz.c(☃, "members")))))))
/*     */ 
/*     */ 
/*     */         
/* 101 */         .then(
/* 102 */           dc.a("leave")
/* 103 */           .then(
/* 104 */             dc.<T>a("members", dz.b())
/* 105 */             .suggests(dz.a)
/* 106 */             .executes(☃ -> a((db)☃.getSource(), dz.c(☃, "members"))))))
/*     */ 
/*     */         
/* 109 */         .then(
/* 110 */           dc.a("modify")
/* 111 */           .then((
/* 112 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("team", ec.a())
/* 113 */             .then(
/* 114 */               dc.a("displayName")
/* 115 */               .then(
/* 116 */                 dc.<T>a("displayName", dg.a())
/* 117 */                 .executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), dg.a(☃, "displayName"))))))
/*     */ 
/*     */             
/* 120 */             .then(
/* 121 */               dc.a("color")
/* 122 */               .then(
/* 123 */                 dc.<T>a("value", df.a())
/* 124 */                 .executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), df.a(☃, "value"))))))
/*     */ 
/*     */             
/* 127 */             .then(
/* 128 */               dc.a("friendlyFire")
/* 129 */               .then(
/* 130 */                 dc.<T>a("allowed", (ArgumentType<T>)BoolArgumentType.bool())
/* 131 */                 .executes(☃ -> b((db)☃.getSource(), ec.a(☃, "team"), BoolArgumentType.getBool(☃, "allowed"))))))
/*     */ 
/*     */             
/* 134 */             .then(
/* 135 */               dc.a("seeFriendlyInvisibles")
/* 136 */               .then(
/* 137 */                 dc.<T>a("allowed", (ArgumentType<T>)BoolArgumentType.bool())
/* 138 */                 .executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), BoolArgumentType.getBool(☃, "allowed"))))))
/*     */ 
/*     */             
/* 141 */             .then((
/* 142 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("nametagVisibility")
/* 143 */               .then(dc.a("never").executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), ddp.b.b))))
/* 144 */               .then(dc.a("hideForOtherTeams").executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), ddp.b.c))))
/* 145 */               .then(dc.a("hideForOwnTeam").executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), ddp.b.d))))
/* 146 */               .then(dc.a("always").executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), ddp.b.a)))))
/*     */             
/* 148 */             .then((
/* 149 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("deathMessageVisibility")
/* 150 */               .then(dc.a("never").executes(☃ -> b((db)☃.getSource(), ec.a(☃, "team"), ddp.b.b))))
/* 151 */               .then(dc.a("hideForOtherTeams").executes(☃ -> b((db)☃.getSource(), ec.a(☃, "team"), ddp.b.c))))
/* 152 */               .then(dc.a("hideForOwnTeam").executes(☃ -> b((db)☃.getSource(), ec.a(☃, "team"), ddp.b.d))))
/* 153 */               .then(dc.a("always").executes(☃ -> b((db)☃.getSource(), ec.a(☃, "team"), ddp.b.a)))))
/*     */             
/* 155 */             .then((
/* 156 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("collisionRule")
/* 157 */               .then(dc.a("never").executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), ddp.a.b))))
/* 158 */               .then(dc.a("pushOwnTeam").executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), ddp.a.d))))
/* 159 */               .then(dc.a("pushOtherTeams").executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), ddp.a.c))))
/* 160 */               .then(dc.a("always").executes(☃ -> a((db)☃.getSource(), ec.a(☃, "team"), ddp.a.a)))))
/*     */             
/* 162 */             .then(
/* 163 */               dc.a("prefix")
/* 164 */               .then(
/* 165 */                 dc.<T>a("prefix", dg.a())
/* 166 */                 .executes(☃ -> b((db)☃.getSource(), ec.a(☃, "team"), dg.a(☃, "prefix"))))))
/*     */ 
/*     */             
/* 169 */             .then(
/* 170 */               dc.a("suffix")
/* 171 */               .then(
/* 172 */                 dc.<T>a("suffix", dg.a())
/* 173 */                 .executes(☃ -> c((db)☃.getSource(), ec.a(☃, "team"), dg.a(☃, "suffix"))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, Collection<String> collection) {
/* 182 */     ddn ddn = ☃.j().aH();
/*     */     
/* 184 */     for (String str : collection) {
/* 185 */       ddn.h(str);
/*     */     }
/*     */     
/* 188 */     if (collection.size() == 1) {
/* 189 */       ☃.a(new of("commands.team.leave.success.single", new Object[] { collection.iterator().next() }), true);
/*     */     } else {
/* 191 */       ☃.a(new of("commands.team.leave.success.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 194 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddl ddl1, Collection<String> collection) {
/* 198 */     ddn ddn = ☃.j().aH();
/*     */     
/* 200 */     for (String str : collection) {
/* 201 */       ddn.a(str, ddl1);
/*     */     }
/*     */     
/* 204 */     if (collection.size() == 1) {
/* 205 */       ☃.a(new of("commands.team.join.success.single", new Object[] { collection.iterator().next(), ddl1.d() }), true);
/*     */     } else {
/* 207 */       ☃.a(new of("commands.team.join.success.multiple", new Object[] { Integer.valueOf(collection.size()), ddl1.d() }), true);
/*     */     } 
/*     */     
/* 210 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddl ddl1, ddp.b b1) throws CommandSyntaxException {
/* 214 */     if (ddl1.j() == b1) {
/* 215 */       throw j.create();
/*     */     }
/* 217 */     ddl1.a(b1);
/* 218 */     ☃.a(new of("commands.team.option.nametagVisibility.success", new Object[] { ddl1.d(), b1.b() }), true);
/* 219 */     return 0;
/*     */   }
/*     */   
/*     */   private static int b(db ☃, ddl ddl1, ddp.b b1) throws CommandSyntaxException {
/* 223 */     if (ddl1.k() == b1) {
/* 224 */       throw k.create();
/*     */     }
/* 226 */     ddl1.b(b1);
/* 227 */     ☃.a(new of("commands.team.option.deathMessageVisibility.success", new Object[] { ddl1.d(), b1.b() }), true);
/* 228 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddl ddl1, ddp.a a1) throws CommandSyntaxException {
/* 232 */     if (ddl1.l() == a1) {
/* 233 */       throw l.create();
/*     */     }
/* 235 */     ddl1.a(a1);
/* 236 */     ☃.a(new of("commands.team.option.collisionRule.success", new Object[] { ddl1.d(), a1.b() }), true);
/* 237 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddl ddl1, boolean bool) throws CommandSyntaxException {
/* 241 */     if (ddl1.i() == bool) {
/* 242 */       if (bool) {
/* 243 */         throw h.create();
/*     */       }
/* 245 */       throw i.create();
/*     */     } 
/*     */ 
/*     */     
/* 249 */     ddl1.b(bool);
/* 250 */     ☃.a(new of("commands.team.option.seeFriendlyInvisibles." + (bool ? "enabled" : "disabled"), new Object[] { ddl1.d() }), true);
/*     */     
/* 252 */     return 0;
/*     */   }
/*     */   
/*     */   private static int b(db ☃, ddl ddl1, boolean bool) throws CommandSyntaxException {
/* 256 */     if (ddl1.h() == bool) {
/* 257 */       if (bool) {
/* 258 */         throw f.create();
/*     */       }
/* 260 */       throw g.create();
/*     */     } 
/*     */ 
/*     */     
/* 264 */     ddl1.a(bool);
/* 265 */     ☃.a(new of("commands.team.option.friendlyfire." + (bool ? "enabled" : "disabled"), new Object[] { ddl1.d() }), true);
/*     */     
/* 267 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddl ddl1, nr nr1) throws CommandSyntaxException {
/* 271 */     if (ddl1.c().equals(nr1)) {
/* 272 */       throw d.create();
/*     */     }
/*     */     
/* 275 */     ddl1.a(nr1);
/* 276 */     ☃.a(new of("commands.team.option.name.success", new Object[] { ddl1.d() }), true);
/* 277 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddl ddl1, k k1) throws CommandSyntaxException {
/* 281 */     if (ddl1.n() == k1) {
/* 282 */       throw e.create();
/*     */     }
/* 284 */     ddl1.a(k1);
/* 285 */     ☃.a(new of("commands.team.option.color.success", new Object[] { ddl1.d(), k1.f() }), true);
/* 286 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddl ddl1) throws CommandSyntaxException {
/* 290 */     ddn ddn = ☃.j().aH();
/* 291 */     Collection<String> collection = Lists.newArrayList(ddl1.g());
/*     */     
/* 293 */     if (collection.isEmpty()) {
/* 294 */       throw c.create();
/*     */     }
/*     */     
/* 297 */     for (String str : collection) {
/* 298 */       ddn.b(str, ddl1);
/*     */     }
/*     */     
/* 301 */     ☃.a(new of("commands.team.empty.success", new Object[] { Integer.valueOf(collection.size()), ddl1.d() }), true);
/*     */     
/* 303 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(db ☃, ddl ddl1) {
/* 307 */     ddn ddn = ☃.j().aH();
/* 308 */     ddn.d(ddl1);
/* 309 */     ☃.a(new of("commands.team.remove.success", new Object[] { ddl1.d() }), true);
/* 310 */     return ddn.g().size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, String str) throws CommandSyntaxException {
/* 314 */     return a(☃, str, new oe(str));
/*     */   }
/*     */   
/*     */   private static int a(db ☃, String str, nr nr1) throws CommandSyntaxException {
/* 318 */     ddn ddn = ☃.j().aH();
/* 319 */     if (ddn.f(str) != null) {
/* 320 */       throw a.create();
/*     */     }
/* 322 */     if (str.length() > 16) {
/* 323 */       throw b.create(Integer.valueOf(16));
/*     */     }
/*     */     
/* 326 */     ddl ddl = ddn.g(str);
/* 327 */     ddl.a(nr1);
/*     */     
/* 329 */     ☃.a(new of("commands.team.add.success", new Object[] { ddl.d() }), true);
/*     */     
/* 331 */     return ddn.g().size();
/*     */   }
/*     */   
/*     */   private static int c(db ☃, ddl ddl1) {
/* 335 */     Collection<String> collection = ddl1.g();
/* 336 */     if (collection.isEmpty()) {
/* 337 */       ☃.a(new of("commands.team.list.members.empty", new Object[] { ddl1.d() }), false);
/*     */     } else {
/* 339 */       ☃.a(new of("commands.team.list.members.success", new Object[] { ddl1.d(), Integer.valueOf(collection.size()), ns.a(collection) }), false);
/*     */     } 
/* 341 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃) {
/* 345 */     Collection<ddl> collection = ☃.j().aH().g();
/* 346 */     if (collection.isEmpty()) {
/* 347 */       ☃.a(new of("commands.team.list.teams.empty"), false);
/*     */     } else {
/* 349 */       ☃.a(new of("commands.team.list.teams.success", new Object[] { Integer.valueOf(collection.size()), ns.b(collection, ddl::d) }), false);
/*     */     } 
/* 351 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(db ☃, ddl ddl1, nr nr1) {
/* 355 */     ddl1.b(nr1);
/* 356 */     ☃.a(new of("commands.team.option.prefix.success", new Object[] { nr1 }), false);
/* 357 */     return 1;
/*     */   }
/*     */   
/*     */   private static int c(db ☃, ddl ddl1, nr nr1) {
/* 361 */     ddl1.c(nr1);
/* 362 */     ☃.a(new of("commands.team.option.suffix.success", new Object[] { nr1 }), false);
/* 363 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */