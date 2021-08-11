/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
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
/*     */ public class yn
/*     */ {
/*  25 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.tag.add.failed"));
/*  26 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.tag.remove.failed"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  29 */     ☃.register(
/*  30 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("tag")
/*  31 */         .requires(☃ -> ☃.c(2)))
/*  32 */         .then((
/*  33 */           (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("targets", dk.b())
/*  34 */           .then(
/*  35 */             dc.a("add")
/*  36 */             .then(
/*  37 */               dc.<T>a("name", (ArgumentType<T>)StringArgumentType.word())
/*  38 */               .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), StringArgumentType.getString(☃, "name"))))))
/*     */ 
/*     */           
/*  41 */           .then(
/*  42 */             dc.a("remove")
/*  43 */             .then(
/*  44 */               dc.<T>a("name", (ArgumentType<T>)StringArgumentType.word())
/*  45 */               .suggests((☃, suggestionsBuilder) -> dd.b(a(dk.b(☃, "targets")), suggestionsBuilder))
/*  46 */               .executes(☃ -> b((db)☃.getSource(), dk.b(☃, "targets"), StringArgumentType.getString(☃, "name"))))))
/*     */ 
/*     */           
/*  49 */           .then(
/*  50 */             dc.a("list")
/*  51 */             .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Collection<String> a(Collection<? extends aqa> ☃) {
/*  58 */     Set<String> set = Sets.newHashSet();
/*  59 */     for (aqa aqa : ☃) {
/*  60 */       set.addAll(aqa.Z());
/*     */     }
/*  62 */     return set;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aqa> collection, String str) throws CommandSyntaxException {
/*  66 */     int i = 0;
/*     */     
/*  68 */     for (aqa aqa : collection) {
/*  69 */       if (aqa.a(str)) {
/*  70 */         i++;
/*     */       }
/*     */     } 
/*     */     
/*  74 */     if (i == 0) {
/*  75 */       throw a.create();
/*     */     }
/*     */     
/*  78 */     if (collection.size() == 1) {
/*  79 */       ☃.a(new of("commands.tag.add.success.single", new Object[] { str, ((aqa)collection.iterator().next()).d() }), true);
/*     */     } else {
/*  81 */       ☃.a(new of("commands.tag.add.success.multiple", new Object[] { str, Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/*  84 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(db ☃, Collection<? extends aqa> collection, String str) throws CommandSyntaxException {
/*  88 */     int i = 0;
/*     */     
/*  90 */     for (aqa aqa : collection) {
/*  91 */       if (aqa.b(str)) {
/*  92 */         i++;
/*     */       }
/*     */     } 
/*     */     
/*  96 */     if (i == 0) {
/*  97 */       throw b.create();
/*     */     }
/*     */     
/* 100 */     if (collection.size() == 1) {
/* 101 */       ☃.a(new of("commands.tag.remove.success.single", new Object[] { str, ((aqa)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 103 */       ☃.a(new of("commands.tag.remove.success.multiple", new Object[] { str, Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 106 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aqa> collection) {
/* 110 */     Set<String> set = Sets.newHashSet();
/*     */     
/* 112 */     for (aqa aqa : collection) {
/* 113 */       set.addAll(aqa.Z());
/*     */     }
/*     */     
/* 116 */     if (collection.size() == 1) {
/* 117 */       aqa aqa = collection.iterator().next();
/*     */       
/* 119 */       if (set.isEmpty()) {
/* 120 */         ☃.a(new of("commands.tag.list.single.empty", new Object[] { aqa.d() }), false);
/*     */       } else {
/* 122 */         ☃.a(new of("commands.tag.list.single.success", new Object[] { aqa.d(), Integer.valueOf(set.size()), ns.a(set) }), false);
/*     */       }
/*     */     
/* 125 */     } else if (set.isEmpty()) {
/* 126 */       ☃.a(new of("commands.tag.list.multiple.empty", new Object[] { Integer.valueOf(collection.size()) }), false);
/*     */     } else {
/* 128 */       ☃.a(new of("commands.tag.list.multiple.success", new Object[] { Integer.valueOf(collection.size()), Integer.valueOf(set.size()), ns.a(set) }), false);
/*     */     } 
/*     */ 
/*     */     
/* 132 */     return set.size();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */