/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.List;
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
/*     */ public class yu
/*     */ {
/*  30 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.trigger.failed.unprimed"));
/*  31 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.trigger.failed.invalid"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  34 */     ☃.register(
/*  35 */         (LiteralArgumentBuilder)dc.a("trigger")
/*  36 */         .then((
/*  37 */           (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("objective", dt.a())
/*  38 */           .suggests((☃, suggestionsBuilder) -> a((db)☃.getSource(), suggestionsBuilder))
/*  39 */           .executes(☃ -> a((db)☃.getSource(), a(((db)☃.getSource()).h(), dt.a(☃, "objective")))))
/*  40 */           .then(
/*  41 */             dc.a("add")
/*  42 */             .then(
/*  43 */               dc.<T>a("value", (ArgumentType<T>)IntegerArgumentType.integer())
/*  44 */               .executes(☃ -> a((db)☃.getSource(), a(((db)☃.getSource()).h(), dt.a(☃, "objective")), IntegerArgumentType.getInteger(☃, "value"))))))
/*     */ 
/*     */           
/*  47 */           .then(
/*  48 */             dc.a("set")
/*  49 */             .then(
/*  50 */               dc.<T>a("value", (ArgumentType<T>)IntegerArgumentType.integer())
/*  51 */               .executes(☃ -> b((db)☃.getSource(), a(((db)☃.getSource()).h(), dt.a(☃, "objective")), IntegerArgumentType.getInteger(☃, "value")))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static CompletableFuture<Suggestions> a(db ☃, SuggestionsBuilder suggestionsBuilder) {
/*  59 */     aqa aqa = ☃.f();
/*  60 */     List<String> list = Lists.newArrayList();
/*     */     
/*  62 */     if (aqa != null) {
/*  63 */       ddn ddn = ☃.j().aH();
/*  64 */       String str = aqa.bU();
/*     */       
/*  66 */       for (ddk ddk : ddn.c()) {
/*  67 */         if (ddk.c() == ddq.c && ddn.b(str, ddk)) {
/*  68 */           ddm ddm = ddn.c(str, ddk);
/*  69 */           if (!ddm.g()) {
/*  70 */             list.add(ddk.b());
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  76 */     return dd.b(list, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddm ddm1, int i) {
/*  80 */     ddm1.a(i);
/*  81 */     ☃.a(new of("commands.trigger.add.success", new Object[] { ddm1.d().e(), Integer.valueOf(i) }), true);
/*  82 */     return ddm1.b();
/*     */   }
/*     */   
/*     */   private static int b(db ☃, ddm ddm1, int i) {
/*  86 */     ddm1.c(i);
/*  87 */     ☃.a(new of("commands.trigger.set.success", new Object[] { ddm1.d().e(), Integer.valueOf(i) }), true);
/*  88 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, ddm ddm1) {
/*  92 */     ddm1.a(1);
/*  93 */     ☃.a(new of("commands.trigger.simple.success", new Object[] { ddm1.d().e() }), true);
/*  94 */     return ddm1.b();
/*     */   }
/*     */   
/*     */   private static ddm a(aah ☃, ddk ddk1) throws CommandSyntaxException {
/*  98 */     if (ddk1.c() != ddq.c) {
/*  99 */       throw b.create();
/*     */     }
/* 101 */     ddn ddn = ☃.eN();
/* 102 */     String str = ☃.bU();
/* 103 */     if (!ddn.b(str, ddk1)) {
/* 104 */       throw a.create();
/*     */     }
/* 106 */     ddm ddm = ddn.c(str, ddk1);
/* 107 */     if (ddm.g()) {
/* 108 */       throw a.create();
/*     */     }
/* 110 */     ddm.a(true);
/* 111 */     return ddm;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */