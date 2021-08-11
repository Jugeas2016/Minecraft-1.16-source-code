/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
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
/*     */ public class wk
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final DynamicCommandExceptionType c;
/*     */   
/*     */   static {
/*  39 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.bossbar.create.failed", new Object[] { ☃ }));
/*  40 */     c = new DynamicCommandExceptionType(☃ -> new of("commands.bossbar.unknown", new Object[] { ☃ }));
/*  41 */   } private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("commands.bossbar.set.players.unchanged"));
/*  42 */   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new of("commands.bossbar.set.name.unchanged"));
/*  43 */   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(new of("commands.bossbar.set.color.unchanged"));
/*  44 */   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(new of("commands.bossbar.set.style.unchanged"));
/*  45 */   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(new of("commands.bossbar.set.value.unchanged"));
/*  46 */   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(new of("commands.bossbar.set.max.unchanged"));
/*  47 */   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(new of("commands.bossbar.set.visibility.unchanged.hidden")); public static final SuggestionProvider<db> a;
/*  48 */   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(new of("commands.bossbar.set.visibility.unchanged.visible")); static {
/*  49 */     a = ((☃, suggestionsBuilder) -> dd.a(((db)☃.getSource()).j().aM().a(), suggestionsBuilder));
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  52 */     ☃.register(
/*  53 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("bossbar")
/*  54 */         .requires(☃ -> ☃.c(2)))
/*  55 */         .then(
/*  56 */           dc.a("add")
/*  57 */           .then(
/*  58 */             dc.<T>a("id", dy.a())
/*  59 */             .then(
/*  60 */               dc.<T>a("name", dg.a())
/*  61 */               .executes(☃ -> a((db)☃.getSource(), dy.e(☃, "id"), dg.a(☃, "name")))))))
/*     */ 
/*     */ 
/*     */         
/*  65 */         .then(
/*  66 */           dc.a("remove")
/*  67 */           .then(
/*  68 */             dc.<T>a("id", dy.a())
/*  69 */             .suggests(a)
/*  70 */             .executes(☃ -> e((db)☃.getSource(), a(☃))))))
/*     */ 
/*     */         
/*  73 */         .then(
/*  74 */           dc.a("list")
/*  75 */           .executes(☃ -> a((db)☃.getSource()))))
/*     */         
/*  77 */         .then(
/*  78 */           dc.a("set")
/*  79 */           .then((
/*  80 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("id", dy.a())
/*  81 */             .suggests(a)
/*  82 */             .then(
/*  83 */               dc.a("name")
/*  84 */               .then(
/*  85 */                 dc.<T>a("name", dg.a())
/*  86 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), dg.a(☃, "name"))))))
/*     */ 
/*     */             
/*  89 */             .then((
/*  90 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("color")
/*  91 */               .then(
/*  92 */                 dc.a("pink")
/*  93 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.a.a))))
/*     */               
/*  95 */               .then(
/*  96 */                 dc.a("blue")
/*  97 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.a.b))))
/*     */               
/*  99 */               .then(
/* 100 */                 dc.a("red")
/* 101 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.a.c))))
/*     */               
/* 103 */               .then(
/* 104 */                 dc.a("green")
/* 105 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.a.d))))
/*     */               
/* 107 */               .then(
/* 108 */                 dc.a("yellow")
/* 109 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.a.e))))
/*     */               
/* 111 */               .then(
/* 112 */                 dc.a("purple")
/* 113 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.a.f))))
/*     */               
/* 115 */               .then(
/* 116 */                 dc.a("white")
/* 117 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.a.g)))))
/*     */ 
/*     */             
/* 120 */             .then((
/* 121 */               (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("style")
/* 122 */               .then(
/* 123 */                 dc.a("progress")
/* 124 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.b.a))))
/*     */               
/* 126 */               .then(
/* 127 */                 dc.a("notched_6")
/* 128 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.b.b))))
/*     */               
/* 130 */               .then(
/* 131 */                 dc.a("notched_10")
/* 132 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.b.c))))
/*     */               
/* 134 */               .then(
/* 135 */                 dc.a("notched_12")
/* 136 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.b.d))))
/*     */               
/* 138 */               .then(
/* 139 */                 dc.a("notched_20")
/* 140 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), aok.b.e)))))
/*     */ 
/*     */             
/* 143 */             .then(
/* 144 */               dc.a("value")
/* 145 */               .then(
/* 146 */                 dc.<T>a("value", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 147 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), IntegerArgumentType.getInteger(☃, "value"))))))
/*     */ 
/*     */             
/* 150 */             .then(
/* 151 */               dc.a("max")
/* 152 */               .then(
/* 153 */                 dc.<T>a("max", (ArgumentType<T>)IntegerArgumentType.integer(1))
/* 154 */                 .executes(☃ -> b((db)☃.getSource(), a(☃), IntegerArgumentType.getInteger(☃, "max"))))))
/*     */ 
/*     */             
/* 157 */             .then(
/* 158 */               dc.a("visible")
/* 159 */               .then(
/* 160 */                 dc.<T>a("visible", (ArgumentType<T>)BoolArgumentType.bool())
/* 161 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), BoolArgumentType.getBool(☃, "visible"))))))
/*     */ 
/*     */             
/* 164 */             .then((
/* 165 */               (LiteralArgumentBuilder)dc.a("players")
/* 166 */               .executes(☃ -> a((db)☃.getSource(), a(☃), Collections.emptyList())))
/* 167 */               .then(
/* 168 */                 dc.<T>a("targets", dk.d())
/* 169 */                 .executes(☃ -> a((db)☃.getSource(), a(☃), dk.d(☃, "targets"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 174 */         .then(
/* 175 */           dc.a("get")
/* 176 */           .then((
/* 177 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("id", dy.a())
/* 178 */             .suggests(a)
/* 179 */             .then(
/* 180 */               dc.a("value")
/* 181 */               .executes(☃ -> a((db)☃.getSource(), a(☃)))))
/*     */             
/* 183 */             .then(
/* 184 */               dc.a("max")
/* 185 */               .executes(☃ -> b((db)☃.getSource(), a(☃)))))
/*     */             
/* 187 */             .then(
/* 188 */               dc.a("visible")
/* 189 */               .executes(☃ -> c((db)☃.getSource(), a(☃)))))
/*     */             
/* 191 */             .then(
/* 192 */               dc.a("players")
/* 193 */               .executes(☃ -> d((db)☃.getSource(), a(☃)))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, wc wc1) {
/* 201 */     ☃.a(new of("commands.bossbar.get.value", new Object[] { wc1.e(), Integer.valueOf(wc1.c()) }), true);
/* 202 */     return wc1.c();
/*     */   }
/*     */   
/*     */   private static int b(db ☃, wc wc1) {
/* 206 */     ☃.a(new of("commands.bossbar.get.max", new Object[] { wc1.e(), Integer.valueOf(wc1.d()) }), true);
/* 207 */     return wc1.d();
/*     */   }
/*     */   
/*     */   private static int c(db ☃, wc wc1) {
/* 211 */     if (wc1.g()) {
/* 212 */       ☃.a(new of("commands.bossbar.get.visible.visible", new Object[] { wc1.e() }), true);
/* 213 */       return 1;
/*     */     } 
/* 215 */     ☃.a(new of("commands.bossbar.get.visible.hidden", new Object[] { wc1.e() }), true);
/* 216 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   private static int d(db ☃, wc wc1) {
/* 221 */     if (wc1.h().isEmpty()) {
/* 222 */       ☃.a(new of("commands.bossbar.get.players.none", new Object[] { wc1.e() }), true);
/*     */     } else {
/* 224 */       ☃.a(new of("commands.bossbar.get.players.some", new Object[] { wc1.e(), Integer.valueOf(wc1.h().size()), ns.b(wc1.h(), bfw::d) }), true);
/*     */     } 
/* 226 */     return wc1.h().size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, wc wc1, boolean bool) throws CommandSyntaxException {
/* 230 */     if (wc1.g() == bool) {
/* 231 */       if (bool) {
/* 232 */         throw k.create();
/*     */       }
/* 234 */       throw j.create();
/*     */     } 
/*     */     
/* 237 */     wc1.d(bool);
/* 238 */     if (bool) {
/* 239 */       ☃.a(new of("commands.bossbar.set.visible.success.visible", new Object[] { wc1.e() }), true);
/*     */     } else {
/* 241 */       ☃.a(new of("commands.bossbar.set.visible.success.hidden", new Object[] { wc1.e() }), true);
/*     */     } 
/* 243 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, wc wc1, int i) throws CommandSyntaxException {
/* 247 */     if (wc1.c() == i) {
/* 248 */       throw h.create();
/*     */     }
/* 250 */     wc1.a(i);
/* 251 */     ☃.a(new of("commands.bossbar.set.value.success", new Object[] { wc1.e(), Integer.valueOf(i) }), true);
/* 252 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(db ☃, wc wc1, int i) throws CommandSyntaxException {
/* 256 */     if (wc1.d() == i) {
/* 257 */       throw i.create();
/*     */     }
/* 259 */     wc1.b(i);
/* 260 */     ☃.a(new of("commands.bossbar.set.max.success", new Object[] { wc1.e(), Integer.valueOf(i) }), true);
/* 261 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, wc wc1, aok.a a1) throws CommandSyntaxException {
/* 265 */     if (wc1.l().equals(a1)) {
/* 266 */       throw f.create();
/*     */     }
/* 268 */     wc1.a(a1);
/* 269 */     ☃.a(new of("commands.bossbar.set.color.success", new Object[] { wc1.e() }), true);
/* 270 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, wc wc1, aok.b b1) throws CommandSyntaxException {
/* 274 */     if (wc1.m().equals(b1)) {
/* 275 */       throw g.create();
/*     */     }
/* 277 */     wc1.a(b1);
/* 278 */     ☃.a(new of("commands.bossbar.set.style.success", new Object[] { wc1.e() }), true);
/* 279 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, wc wc1, nr nr1) throws CommandSyntaxException {
/* 283 */     nr nr2 = ns.a(☃, nr1, (aqa)null, 0);
/* 284 */     if (wc1.j().equals(nr2)) {
/* 285 */       throw e.create();
/*     */     }
/* 287 */     wc1.a(nr2);
/* 288 */     ☃.a(new of("commands.bossbar.set.name.success", new Object[] { wc1.e() }), true);
/* 289 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, wc wc1, Collection<aah> collection) throws CommandSyntaxException {
/* 293 */     boolean bool = wc1.a(collection);
/* 294 */     if (!bool) {
/* 295 */       throw d.create();
/*     */     }
/* 297 */     if (wc1.h().isEmpty()) {
/* 298 */       ☃.a(new of("commands.bossbar.set.players.success.none", new Object[] { wc1.e() }), true);
/*     */     } else {
/* 300 */       ☃.a(new of("commands.bossbar.set.players.success.some", new Object[] { wc1.e(), Integer.valueOf(collection.size()), ns.b(collection, bfw::d) }), true);
/*     */     } 
/* 302 */     return wc1.h().size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃) {
/* 306 */     Collection<wc> collection = ☃.j().aM().b();
/* 307 */     if (collection.isEmpty()) {
/* 308 */       ☃.a(new of("commands.bossbar.list.bars.none"), false);
/*     */     } else {
/* 310 */       ☃.a(new of("commands.bossbar.list.bars.some", new Object[] { Integer.valueOf(collection.size()), ns.b(collection, wc::e) }), false);
/*     */     } 
/* 312 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, vk vk1, nr nr1) throws CommandSyntaxException {
/* 316 */     wd wd = ☃.j().aM();
/* 317 */     if (wd.a(vk1) != null) {
/* 318 */       throw b.create(vk1.toString());
/*     */     }
/* 320 */     wc wc = wd.a(vk1, ns.a(☃, nr1, (aqa)null, 0));
/* 321 */     ☃.a(new of("commands.bossbar.create.success", new Object[] { wc.e() }), true);
/* 322 */     return wd.b().size();
/*     */   }
/*     */   
/*     */   private static int e(db ☃, wc wc1) {
/* 326 */     wd wd = ☃.j().aM();
/* 327 */     wc1.b();
/* 328 */     wd.a(wc1);
/* 329 */     ☃.a(new of("commands.bossbar.remove.success", new Object[] { wc1.e() }), true);
/* 330 */     return wd.b().size();
/*     */   }
/*     */   
/*     */   public static wc a(CommandContext<db> ☃) throws CommandSyntaxException {
/* 334 */     vk vk = dy.e(☃, "id");
/* 335 */     wc wc = ((db)☃.getSource()).j().aM().a(vk);
/* 336 */     if (wc == null) {
/* 337 */       throw c.create(vk.toString());
/*     */     }
/* 339 */     return wc;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */