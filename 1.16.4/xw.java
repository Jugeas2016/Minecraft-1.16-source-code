/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
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
/*     */ public class xw
/*     */ {
/*     */   public static final DynamicCommandExceptionType b;
/*     */   public static final Dynamic2CommandExceptionType c;
/*  36 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.replaceitem.block.failed")); static {
/*  37 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.replaceitem.slot.inapplicable", new Object[] { ☃ }));
/*  38 */     c = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.replaceitem.entity.failed", new Object[] { ☃, object1 }));
/*     */   }
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  41 */     ☃.register(
/*  42 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("replaceitem")
/*  43 */         .requires(☃ -> ☃.c(2)))
/*  44 */         .then(
/*  45 */           dc.a("block")
/*  46 */           .then(
/*  47 */             dc.<T>a("pos", ek.a())
/*  48 */             .then(
/*  49 */               dc.<T>a("slot", eb.a())
/*  50 */               .then((
/*  51 */                 (RequiredArgumentBuilder)dc.<T>a("item", ew.a())
/*  52 */                 .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "pos"), eb.a(☃, "slot"), ew.<db>a(☃, "item").a(1, false))))
/*  53 */                 .then(
/*  54 */                   dc.<T>a("count", (ArgumentType<T>)IntegerArgumentType.integer(1, 64))
/*  55 */                   .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "pos"), eb.a(☃, "slot"), ew.<db>a(☃, "item").a(IntegerArgumentType.getInteger(☃, "count"), true)))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  61 */         .then(
/*  62 */           dc.a("entity")
/*  63 */           .then(
/*  64 */             dc.<T>a("targets", dk.b())
/*  65 */             .then(
/*  66 */               dc.<T>a("slot", eb.a())
/*  67 */               .then((
/*  68 */                 (RequiredArgumentBuilder)dc.<T>a("item", ew.a())
/*  69 */                 .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), eb.a(☃, "slot"), ew.<db>a(☃, "item").a(1, false))))
/*  70 */                 .then(
/*  71 */                   dc.<T>a("count", (ArgumentType<T>)IntegerArgumentType.integer(1, 64))
/*  72 */                   .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), eb.a(☃, "slot"), ew.<db>a(☃, "item").a(IntegerArgumentType.getInteger(☃, "count"), true)))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, fx fx1, int i, bmb bmb1) throws CommandSyntaxException {
/*  82 */     ccj ccj = ☃.e().c(fx1);
/*  83 */     if (!(ccj instanceof aon)) {
/*  84 */       throw a.create();
/*     */     }
/*  86 */     aon aon = (aon)ccj;
/*  87 */     if (i < 0 || i >= aon.Z_()) {
/*  88 */       throw b.create(Integer.valueOf(i));
/*     */     }
/*     */     
/*  91 */     aon.a(i, bmb1);
/*  92 */     ☃.a(new of("commands.replaceitem.block.success", new Object[] { Integer.valueOf(fx1.u()), Integer.valueOf(fx1.v()), Integer.valueOf(fx1.w()), bmb1.C() }), true);
/*  93 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aqa> collection, int i, bmb bmb1) throws CommandSyntaxException {
/*  97 */     List<aqa> list = Lists.newArrayListWithCapacity(collection.size());
/*     */     
/*  99 */     for (aqa aqa : collection) {
/* 100 */       if (aqa instanceof aah) {
/* 101 */         ((aah)aqa).bo.c();
/*     */       }
/* 103 */       if (aqa.a_(i, bmb1.i())) {
/* 104 */         list.add(aqa);
/* 105 */         if (aqa instanceof aah) {
/* 106 */           ((aah)aqa).bo.c();
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 111 */     if (list.isEmpty()) {
/* 112 */       throw c.create(bmb1.C(), Integer.valueOf(i));
/*     */     }
/*     */     
/* 115 */     if (list.size() == 1) {
/* 116 */       ☃.a(new of("commands.replaceitem.entity.success.single", new Object[] { ((aqa)list.iterator().next()).d(), bmb1.C() }), true);
/*     */     } else {
/* 118 */       ☃.a(new of("commands.replaceitem.entity.success.multiple", new Object[] { Integer.valueOf(list.size()), bmb1.C() }), true);
/*     */     } 
/*     */     
/* 121 */     return list.size();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */