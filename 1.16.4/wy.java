/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*     */ import java.util.Collection;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.BiPredicate;
/*     */ import java.util.function.ToIntFunction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wy
/*     */ {
/*  30 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.experience.set.points.invalid"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  33 */     LiteralCommandNode<db> literalCommandNode = ☃.register(
/*  34 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("experience")
/*  35 */         .requires(☃ -> ☃.c(2)))
/*  36 */         .then(
/*  37 */           dc.a("add")
/*  38 */           .then(
/*  39 */             dc.<T>a("targets", dk.d())
/*  40 */             .then((
/*  41 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("amount", (ArgumentType<T>)IntegerArgumentType.integer())
/*  42 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.a)))
/*  43 */               .then(
/*  44 */                 dc.a("points")
/*  45 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.a))))
/*     */               
/*  47 */               .then(
/*  48 */                 dc.a("levels")
/*  49 */                 .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.b)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  54 */         .then(
/*  55 */           dc.a("set")
/*  56 */           .then(
/*  57 */             dc.<T>a("targets", dk.d())
/*  58 */             .then((
/*  59 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("amount", (ArgumentType<T>)IntegerArgumentType.integer(0))
/*  60 */               .executes(☃ -> b((db)☃.getSource(), dk.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.a)))
/*  61 */               .then(
/*  62 */                 dc.a("points")
/*  63 */                 .executes(☃ -> b((db)☃.getSource(), dk.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.a))))
/*     */               
/*  65 */               .then(
/*  66 */                 dc.a("levels")
/*  67 */                 .executes(☃ -> b((db)☃.getSource(), dk.f(☃, "targets"), IntegerArgumentType.getInteger(☃, "amount"), a.b)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  72 */         .then(
/*  73 */           dc.a("query")
/*  74 */           .then((
/*  75 */             (RequiredArgumentBuilder)dc.<T>a("targets", dk.c())
/*  76 */             .then(
/*  77 */               dc.a("points")
/*  78 */               .executes(☃ -> a((db)☃.getSource(), dk.e(☃, "targets"), a.a))))
/*     */             
/*  80 */             .then(
/*  81 */               dc.a("levels")
/*  82 */               .executes(☃ -> a((db)☃.getSource(), dk.e(☃, "targets"), a.b))))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     ☃.register(
/*  89 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("xp")
/*  90 */         .requires(☃ -> ☃.c(2)))
/*  91 */         .redirect((CommandNode)literalCommandNode));
/*     */   }
/*     */ 
/*     */   
/*     */   private static int a(db ☃, aah aah1, a a1) {
/*  96 */     int i = a.a(a1).applyAsInt(aah1);
/*  97 */     ☃.a(new of("commands.experience.query." + a1.e, new Object[] { aah1.d(), Integer.valueOf(i) }), false);
/*  98 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aah> collection, int i, a a1) {
/* 102 */     for (aah aah : collection) {
/* 103 */       a1.c.accept(aah, Integer.valueOf(i));
/*     */     }
/*     */     
/* 106 */     if (collection.size() == 1) {
/* 107 */       ☃.a(new of("commands.experience.add." + a1.e + ".success.single", new Object[] { Integer.valueOf(i), ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 109 */       ☃.a(new of("commands.experience.add." + a1.e + ".success.multiple", new Object[] { Integer.valueOf(i), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 112 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static int b(db ☃, Collection<? extends aah> collection, int i, a a1) throws CommandSyntaxException {
/* 116 */     int j = 0;
/*     */     
/* 118 */     for (aah aah : collection) {
/* 119 */       if (a1.d.test(aah, Integer.valueOf(i))) {
/* 120 */         j++;
/*     */       }
/*     */     } 
/*     */     
/* 124 */     if (j == 0) {
/* 125 */       throw a.create();
/*     */     }
/*     */     
/* 128 */     if (collection.size() == 1) {
/* 129 */       ☃.a(new of("commands.experience.set." + a1.e + ".success.single", new Object[] { Integer.valueOf(i), ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 131 */       ☃.a(new of("commands.experience.set." + a1.e + ".success.multiple", new Object[] { Integer.valueOf(i), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 134 */     return collection.size();
/*     */   }
/*     */   enum a { a, b;
/*     */     static {
/* 138 */       a = new a("POINTS", 0, "points", bfw::d, (☃, integer) -> {
/*     */             if (integer.intValue() >= ☃.eH()) {
/*     */               return false;
/*     */             }
/*     */             ☃.a(integer.intValue());
/*     */             return true;
/*     */           }☃ -> afm.d(☃.bF * ☃.eH()));
/* 145 */       b = new a("LEVELS", 1, "levels", aah::c, (☃, integer) -> {
/*     */             ☃.b(integer.intValue());
/*     */             return true;
/*     */           }☃ -> ☃.bD);
/*     */     }
/*     */     public final BiConsumer<aah, Integer> c;
/*     */     public final BiPredicate<aah, Integer> d;
/*     */     public final String e;
/*     */     private final ToIntFunction<aah> f;
/*     */     
/*     */     a(String ☃, BiConsumer<aah, Integer> biConsumer, BiPredicate<aah, Integer> biPredicate, ToIntFunction<aah> toIntFunction) {
/* 156 */       this.c = biConsumer;
/* 157 */       this.e = ☃;
/* 158 */       this.d = biPredicate;
/* 159 */       this.f = toIntFunction;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */