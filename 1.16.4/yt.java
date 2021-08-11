/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Collection;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class yt
/*     */ {
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  27 */     ☃.register(
/*  28 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("title")
/*  29 */         .requires(☃ -> ☃.c(2)))
/*  30 */         .then((
/*  31 */           (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/*  32 */           .then(
/*  33 */             dc.a("clear")
/*  34 */             .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets")))))
/*     */           
/*  36 */           .then(
/*  37 */             dc.a("reset")
/*  38 */             .executes(☃ -> b((db)☃.getSource(), dk.f(☃, "targets")))))
/*     */           
/*  40 */           .then(
/*  41 */             dc.a("title")
/*  42 */             .then(
/*  43 */               dc.<T>a("title", dg.a())
/*  44 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), dg.a(☃, "title"), rl.a.a)))))
/*     */ 
/*     */           
/*  47 */           .then(
/*  48 */             dc.a("subtitle")
/*  49 */             .then(
/*  50 */               dc.<T>a("title", dg.a())
/*  51 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), dg.a(☃, "title"), rl.a.b)))))
/*     */ 
/*     */           
/*  54 */           .then(
/*  55 */             dc.a("actionbar")
/*  56 */             .then(
/*  57 */               dc.<T>a("title", dg.a())
/*  58 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), dg.a(☃, "title"), rl.a.c)))))
/*     */ 
/*     */           
/*  61 */           .then(
/*  62 */             dc.a("times")
/*  63 */             .then(
/*  64 */               dc.<T>a("fadeIn", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  65 */               .then(
/*  66 */                 dc.<T>a("stay", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  67 */                 .then(
/*  68 */                   dc.<T>a("fadeOut", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  69 */                   .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "fadeIn"), IntegerArgumentType.getInteger(☃, "stay"), IntegerArgumentType.getInteger(☃, "fadeOut")))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, Collection<aah> collection) {
/*  79 */     rl rl = new rl(rl.a.e, null);
/*  80 */     for (aah aah : collection) {
/*  81 */       aah.b.a(rl);
/*     */     }
/*     */     
/*  84 */     if (collection.size() == 1) {
/*  85 */       ☃.a(new of("commands.title.cleared.single", new Object[] { ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/*  87 */       ☃.a(new of("commands.title.cleared.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/*  90 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(db ☃, Collection<aah> collection) {
/*  94 */     rl rl = new rl(rl.a.f, null);
/*  95 */     for (aah aah : collection) {
/*  96 */       aah.b.a(rl);
/*     */     }
/*     */     
/*  99 */     if (collection.size() == 1) {
/* 100 */       ☃.a(new of("commands.title.reset.single", new Object[] { ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 102 */       ☃.a(new of("commands.title.reset.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 105 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<aah> collection, nr nr1, rl.a a1) throws CommandSyntaxException {
/* 109 */     for (aah aah : collection) {
/* 110 */       aah.b.a(new rl(a1, ns.a(☃, nr1, aah, 0)));
/*     */     }
/*     */     
/* 113 */     if (collection.size() == 1) {
/* 114 */       ☃.a(new of("commands.title.show." + a1.name().toLowerCase(Locale.ROOT) + ".single", new Object[] { ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 116 */       ☃.a(new of("commands.title.show." + a1.name().toLowerCase(Locale.ROOT) + ".multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 119 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<aah> collection, int i, int j, int k) {
/* 123 */     rl rl = new rl(i, j, k);
/* 124 */     for (aah aah : collection) {
/* 125 */       aah.b.a(rl);
/*     */     }
/*     */     
/* 128 */     if (collection.size() == 1) {
/* 129 */       ☃.a(new of("commands.title.times.single", new Object[] { ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 131 */       ☃.a(new of("commands.title.times.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 134 */     return collection.size();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */