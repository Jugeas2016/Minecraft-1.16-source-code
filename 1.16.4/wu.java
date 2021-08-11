/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class wu
/*     */ {
/*  31 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.effect.give.failed"));
/*  32 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.effect.clear.everything.failed"));
/*  33 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.effect.clear.specific.failed"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  36 */     ☃.register(
/*  37 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("effect")
/*  38 */         .requires(☃ -> ☃.c(2)))
/*  39 */         .then((
/*  40 */           (LiteralArgumentBuilder)dc.a("clear")
/*  41 */           .executes(☃ -> a((db)☃.getSource(), (Collection<? extends aqa>)ImmutableList.of(((db)☃.getSource()).g()))))
/*  42 */           .then((
/*  43 */             (RequiredArgumentBuilder)dc.<T>a("targets", dk.b())
/*  44 */             .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"))))
/*  45 */             .then(
/*  46 */               dc.<T>a("effect", dq.a())
/*  47 */               .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), dq.a(☃, "effect")))))))
/*     */ 
/*     */ 
/*     */         
/*  51 */         .then(
/*  52 */           dc.a("give")
/*  53 */           .then(
/*  54 */             dc.<T>a("targets", dk.b())
/*  55 */             .then((
/*  56 */               (RequiredArgumentBuilder)dc.<T>a("effect", dq.a())
/*  57 */               .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), dq.a(☃, "effect"), null, 0, true)))
/*  58 */               .then((
/*  59 */                 (RequiredArgumentBuilder)dc.<T>a("seconds", (ArgumentType<T>)IntegerArgumentType.integer(1, 1000000))
/*  60 */                 .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), dq.a(☃, "effect"), Integer.valueOf(IntegerArgumentType.getInteger(☃, "seconds")), 0, true)))
/*  61 */                 .then((
/*  62 */                   (RequiredArgumentBuilder)dc.<T>a("amplifier", (ArgumentType<T>)IntegerArgumentType.integer(0, 255))
/*  63 */                   .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), dq.a(☃, "effect"), Integer.valueOf(IntegerArgumentType.getInteger(☃, "seconds")), IntegerArgumentType.getInteger(☃, "amplifier"), true)))
/*  64 */                   .then(
/*  65 */                     dc.<T>a("hideParticles", (ArgumentType<T>)BoolArgumentType.bool())
/*  66 */                     .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), dq.a(☃, "effect"), Integer.valueOf(IntegerArgumentType.getInteger(☃, "seconds")), IntegerArgumentType.getInteger(☃, "amplifier"), !BoolArgumentType.getBool(☃, "hideParticles"))))))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aqa> collection, aps aps1, @Nullable Integer integer, int i, boolean bool) throws CommandSyntaxException {
/*  77 */     int k, j = 0;
/*     */ 
/*     */     
/*  80 */     if (integer != null) {
/*  81 */       if (aps1.a()) {
/*  82 */         k = integer.intValue();
/*     */       } else {
/*  84 */         k = integer.intValue() * 20;
/*     */       }
/*     */     
/*  87 */     } else if (aps1.a()) {
/*  88 */       k = 1;
/*     */     } else {
/*  90 */       k = 600;
/*     */     } 
/*     */ 
/*     */     
/*  94 */     for (aqa aqa : collection) {
/*  95 */       if (aqa instanceof aqm) {
/*  96 */         apu apu = new apu(aps1, k, i, false, bool);
/*  97 */         if (((aqm)aqa).c(apu)) {
/*  98 */           j++;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 103 */     if (j == 0) {
/* 104 */       throw a.create();
/*     */     }
/*     */     
/* 107 */     if (collection.size() == 1) {
/* 108 */       ☃.a(new of("commands.effect.give.success.single", new Object[] { aps1.d(), ((aqa)collection.iterator().next()).d(), Integer.valueOf(k / 20) }), true);
/*     */     } else {
/* 110 */       ☃.a(new of("commands.effect.give.success.multiple", new Object[] { aps1.d(), Integer.valueOf(collection.size()), Integer.valueOf(k / 20) }), true);
/*     */     } 
/*     */     
/* 113 */     return j;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aqa> collection) throws CommandSyntaxException {
/* 117 */     int i = 0;
/*     */     
/* 119 */     for (aqa aqa : collection) {
/* 120 */       if (aqa instanceof aqm && (
/* 121 */         (aqm)aqa).dg()) {
/* 122 */         i++;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 127 */     if (i == 0) {
/* 128 */       throw b.create();
/*     */     }
/*     */     
/* 131 */     if (collection.size() == 1) {
/* 132 */       ☃.a(new of("commands.effect.clear.everything.success.single", new Object[] { ((aqa)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 134 */       ☃.a(new of("commands.effect.clear.everything.success.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 137 */     return i;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<? extends aqa> collection, aps aps1) throws CommandSyntaxException {
/* 141 */     int i = 0;
/*     */     
/* 143 */     for (aqa aqa : collection) {
/* 144 */       if (aqa instanceof aqm && (
/* 145 */         (aqm)aqa).d(aps1)) {
/* 146 */         i++;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 151 */     if (i == 0) {
/* 152 */       throw c.create();
/*     */     }
/*     */     
/* 155 */     if (collection.size() == 1) {
/* 156 */       ☃.a(new of("commands.effect.clear.specific.success.single", new Object[] { aps1.d(), ((aqa)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 158 */       ☃.a(new of("commands.effect.clear.specific.success.multiple", new Object[] { aps1.d(), Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 161 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */