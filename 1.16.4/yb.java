/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class yb
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final SuggestionProvider<db> c;
/*  32 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.schedule.same_tick")); static {
/*  33 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.schedule.cleared.failure", new Object[] { ☃ }));
/*     */     
/*  35 */     c = ((☃, suggestionsBuilder) -> dd.b(((db)☃.getSource()).j().aX().H().u().a(), suggestionsBuilder));
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  38 */     ☃.register(
/*  39 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("schedule")
/*  40 */         .requires(☃ -> ☃.c(2)))
/*  41 */         .then(
/*  42 */           dc.a("function")
/*  43 */           .then(
/*  44 */             dc.<T>a("function", ev.a())
/*  45 */             .suggests(xb.a)
/*  46 */             .then((
/*  47 */               (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("time", ed.a())
/*  48 */               .executes(☃ -> a((db)☃.getSource(), ev.b(☃, "function"), IntegerArgumentType.getInteger(☃, "time"), true)))
/*  49 */               .then(
/*  50 */                 dc.a("append")
/*  51 */                 .executes(☃ -> a((db)☃.getSource(), ev.b(☃, "function"), IntegerArgumentType.getInteger(☃, "time"), false))))
/*     */               
/*  53 */               .then(
/*  54 */                 dc.a("replace")
/*  55 */                 .executes(☃ -> a((db)☃.getSource(), ev.b(☃, "function"), IntegerArgumentType.getInteger(☃, "time"), true)))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  60 */         .then(
/*  61 */           dc.a("clear")
/*  62 */           .then(
/*  63 */             dc.<T>a("function", (ArgumentType<T>)StringArgumentType.greedyString())
/*  64 */             .suggests(c)
/*  65 */             .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "function"))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, Pair<vk, Either<cy, ael<cy>>> pair, int i, boolean bool) throws CommandSyntaxException {
/*  72 */     if (i == 0) {
/*  73 */       throw a.create();
/*     */     }
/*     */     
/*  76 */     long l = ☃.e().T() + i;
/*     */     
/*  78 */     vk vk = (vk)pair.getFirst();
/*  79 */     dcf<MinecraftServer> dcf = ☃.j().aX().H().u();
/*  80 */     ((Either)pair.getSecond())
/*  81 */       .ifLeft(cy1 -> {
/*     */           String str = ☃.toString();
/*     */           
/*     */           if (bool) {
/*     */             dcf1.a(str);
/*     */           }
/*     */           dcf1.a(str, l, new dcb(☃));
/*     */           db1.a(new of("commands.schedule.created.function", new Object[] { ☃, Integer.valueOf(i), Long.valueOf(l) }), true);
/*  89 */         }).ifRight(ael1 -> {
/*     */           String str = "#" + ☃.toString();
/*     */           
/*     */           if (bool) {
/*     */             dcf1.a(str);
/*     */           }
/*     */           dcf1.a(str, l, new dcc(☃));
/*     */           db1.a(new of("commands.schedule.created.tag", new Object[] { ☃, Integer.valueOf(i), Long.valueOf(l) }), true);
/*     */         });
/*  98 */     return (int)Math.floorMod(l, 2147483647L);
/*     */   }
/*     */   
/*     */   private static int a(db ☃, String str) throws CommandSyntaxException {
/* 102 */     int i = ☃.j().aX().H().u().a(str);
/* 103 */     if (i == 0) {
/* 104 */       throw b.create(str);
/*     */     }
/* 106 */     ☃.a(new of("commands.schedule.cleared.success", new Object[] { Integer.valueOf(i), str }), true);
/* 107 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */