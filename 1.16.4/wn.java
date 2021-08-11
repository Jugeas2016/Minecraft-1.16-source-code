/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ 
/*     */ public class wn
/*     */ {
/*     */   private static final DynamicCommandExceptionType a;
/*     */   private static final DynamicCommandExceptionType b;
/*     */   private static final DynamicCommandExceptionType c;
/*     */   private static final SuggestionProvider<db> d;
/*     */   private static final SuggestionProvider<db> e;
/*     */   
/*     */   static {
/*  28 */     a = new DynamicCommandExceptionType(☃ -> new of("commands.datapack.unknown", new Object[] { ☃ }));
/*  29 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.datapack.enable.failed", new Object[] { ☃ }));
/*  30 */     c = new DynamicCommandExceptionType(☃ -> new of("commands.datapack.disable.failed", new Object[] { ☃ }));
/*     */     
/*  32 */     d = ((☃, suggestionsBuilder) -> dd.b(((db)☃.getSource()).j().aC().d().stream().map(StringArgumentType::escapeIfRequired), suggestionsBuilder));
/*  33 */     e = ((☃, suggestionsBuilder) -> {
/*     */         abw abw = ((db)☃.getSource()).j().aC();
/*     */         Collection<String> collection = abw.d();
/*     */         return dd.b(abw.b().stream().filter(()).map(StringArgumentType::escapeIfRequired), suggestionsBuilder);
/*     */       });
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  40 */     ☃.register(
/*  41 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("datapack")
/*  42 */         .requires(☃ -> ☃.c(2)))
/*  43 */         .then(
/*  44 */           dc.a("enable")
/*  45 */           .then((
/*  46 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("name", (ArgumentType<T>)StringArgumentType.string())
/*  47 */             .suggests(e)
/*  48 */             .executes(☃ -> a((db)☃.getSource(), a(☃, "name", true), ())))
/*  49 */             .then(
/*  50 */               dc.a("after")
/*  51 */               .then(
/*  52 */                 dc.<T>a("existing", (ArgumentType<T>)StringArgumentType.string())
/*  53 */                 .suggests(d)
/*  54 */                 .executes(☃ -> a((db)☃.getSource(), a(☃, "name", true), ())))))
/*     */ 
/*     */             
/*  57 */             .then(
/*  58 */               dc.a("before")
/*  59 */               .then(
/*  60 */                 dc.<T>a("existing", (ArgumentType<T>)StringArgumentType.string())
/*  61 */                 .suggests(d)
/*  62 */                 .executes(☃ -> a((db)☃.getSource(), a(☃, "name", true), ())))))
/*     */ 
/*     */             
/*  65 */             .then(
/*  66 */               dc.a("last")
/*  67 */               .executes(☃ -> a((db)☃.getSource(), a(☃, "name", true), List::add))))
/*     */             
/*  69 */             .then(
/*  70 */               dc.a("first")
/*  71 */               .executes(☃ -> a((db)☃.getSource(), a(☃, "name", true), ()))))))
/*     */ 
/*     */ 
/*     */         
/*  75 */         .then(
/*  76 */           dc.a("disable")
/*  77 */           .then(
/*  78 */             dc.<T>a("name", (ArgumentType<T>)StringArgumentType.string())
/*  79 */             .suggests(d)
/*  80 */             .executes(☃ -> a((db)☃.getSource(), a(☃, "name", false))))))
/*     */ 
/*     */         
/*  83 */         .then((
/*  84 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("list")
/*  85 */           .executes(☃ -> a((db)☃.getSource())))
/*  86 */           .then(
/*  87 */             dc.a("available")
/*  88 */             .executes(☃ -> b((db)☃.getSource()))))
/*     */           
/*  90 */           .then(
/*  91 */             dc.a("enabled")
/*  92 */             .executes(☃ -> c((db)☃.getSource())))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, abu abu1, a a1) throws CommandSyntaxException {
/*  99 */     abw abw = ☃.j().aC();
/*     */     
/* 101 */     List<abu> list = Lists.newArrayList(abw.e());
/* 102 */     a1.apply(list, abu1);
/*     */     
/* 104 */     ☃.a(new of("commands.datapack.modify.enable", new Object[] { abu1.a(true) }), true);
/* 105 */     xv.a((Collection<String>)list.stream().map(abu::e).collect(Collectors.toList()), ☃);
/* 106 */     return list.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃, abu abu1) {
/* 110 */     abw abw = ☃.j().aC();
/*     */     
/* 112 */     List<abu> list = Lists.newArrayList(abw.e());
/* 113 */     list.remove(abu1);
/*     */     
/* 115 */     ☃.a(new of("commands.datapack.modify.disable", new Object[] { abu1.a(true) }), true);
/* 116 */     xv.a((Collection<String>)list.stream().map(abu::e).collect(Collectors.toList()), ☃);
/* 117 */     return list.size();
/*     */   }
/*     */   
/*     */   private static int a(db ☃) {
/* 121 */     return c(☃) + b(☃);
/*     */   }
/*     */   
/*     */   private static int b(db ☃) {
/* 125 */     abw abw = ☃.j().aC();
/* 126 */     abw.a();
/*     */     
/* 128 */     Collection<? extends abu> collection1 = abw.e();
/* 129 */     Collection<? extends abu> collection2 = abw.c();
/* 130 */     List<abu> list = (List<abu>)collection2.stream().filter(abu1 -> !☃.contains(abu1)).collect(Collectors.toList());
/* 131 */     if (list.isEmpty()) {
/* 132 */       ☃.a(new of("commands.datapack.list.available.none"), false);
/*     */     } else {
/* 134 */       ☃.a(new of("commands.datapack.list.available.success", new Object[] { Integer.valueOf(list.size()), ns.b(list, ☃ -> ☃.a(false)) }), false);
/*     */     } 
/*     */     
/* 137 */     return list.size();
/*     */   }
/*     */   
/*     */   private static int c(db ☃) {
/* 141 */     abw abw = ☃.j().aC();
/* 142 */     abw.a();
/*     */     
/* 144 */     Collection<? extends abu> collection = abw.e();
/* 145 */     if (collection.isEmpty()) {
/* 146 */       ☃.a(new of("commands.datapack.list.enabled.none"), false);
/*     */     } else {
/* 148 */       ☃.a(new of("commands.datapack.list.enabled.success", new Object[] { Integer.valueOf(collection.size()), ns.b(collection, ☃ -> ☃.a(true)) }), false);
/*     */     } 
/*     */     
/* 151 */     return collection.size();
/*     */   }
/*     */   
/*     */   private static abu a(CommandContext<db> ☃, String str, boolean bool) throws CommandSyntaxException {
/* 155 */     String str1 = StringArgumentType.getString(☃, str);
/* 156 */     abw abw = ((db)☃.getSource()).j().aC();
/* 157 */     abu abu = abw.a(str1);
/* 158 */     if (abu == null) {
/* 159 */       throw a.create(str1);
/*     */     }
/* 161 */     boolean bool1 = abw.e().contains(abu);
/* 162 */     if (bool && bool1) {
/* 163 */       throw b.create(str1);
/*     */     }
/* 165 */     if (!bool && !bool1) {
/* 166 */       throw c.create(str1);
/*     */     }
/* 168 */     return abu;
/*     */   }
/*     */   
/*     */   static interface a {
/*     */     void apply(List<abu> param1List, abu param1abu) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */