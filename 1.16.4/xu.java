/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*     */ public class xu
/*     */ {
/*  24 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.recipe.give.failed"));
/*  25 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.recipe.take.failed"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  28 */     ☃.register(
/*  29 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("recipe")
/*  30 */         .requires(☃ -> ☃.c(2)))
/*  31 */         .then(
/*  32 */           dc.a("give")
/*  33 */           .then((
/*  34 */             (RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/*  35 */             .then(
/*  36 */               dc.<T>a("recipe", dy.a())
/*  37 */               .suggests(fm.b)
/*  38 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), Collections.singleton(dy.b(☃, "recipe"))))))
/*     */             
/*  40 */             .then(
/*  41 */               dc.a("*")
/*  42 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), ((db)☃.getSource()).j().aF().b()))))))
/*     */ 
/*     */ 
/*     */         
/*  46 */         .then(
/*  47 */           dc.a("take")
/*  48 */           .then((
/*  49 */             (RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/*  50 */             .then(
/*  51 */               dc.<T>a("recipe", dy.a())
/*  52 */               .suggests(fm.b)
/*  53 */               .executes(☃ -> b((db)☃.getSource(), dk.f(☃, "targets"), Collections.singleton(dy.b(☃, "recipe"))))))
/*     */             
/*  55 */             .then(
/*  56 */               dc.a("*")
/*  57 */               .executes(☃ -> b((db)☃.getSource(), dk.f(☃, "targets"), ((db)☃.getSource()).j().aF().b()))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, Collection<aah> collection, Collection<boq<?>> collection1) throws CommandSyntaxException {
/*  65 */     int i = 0;
/*     */     
/*  67 */     for (aah aah : collection) {
/*  68 */       i += aah.a(collection1);
/*     */     }
/*     */     
/*  71 */     if (i == 0) {
/*  72 */       throw a.create();
/*     */     }
/*     */     
/*  75 */     if (collection.size() == 1) {
/*  76 */       ☃.a(new of("commands.recipe.give.success.single", new Object[] { Integer.valueOf(collection1.size()), ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/*  78 */       ☃.a(new of("commands.recipe.give.success.multiple", new Object[] { Integer.valueOf(collection1.size()), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/*  81 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(db ☃, Collection<aah> collection, Collection<boq<?>> collection1) throws CommandSyntaxException {
/*  85 */     int i = 0;
/*     */     
/*  87 */     for (aah aah : collection) {
/*  88 */       i += aah.b(collection1);
/*     */     }
/*     */     
/*  91 */     if (i == 0) {
/*  92 */       throw b.create();
/*     */     }
/*     */     
/*  95 */     if (collection.size() == 1) {
/*  96 */       ☃.a(new of("commands.recipe.take.success.single", new Object[] { Integer.valueOf(collection1.size()), ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/*  98 */       ☃.a(new of("commands.recipe.take.success.multiple", new Object[] { Integer.valueOf(collection1.size()), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 101 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */