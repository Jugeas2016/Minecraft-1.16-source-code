/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import java.util.Collection;
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
/*     */ 
/*     */ 
/*     */ public class xr
/*     */ {
/*  32 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.playsound.failed"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  35 */     RequiredArgumentBuilder<db, vk> requiredArgumentBuilder = dc.<T>a("sound", dy.a()).suggests(fm.c);
/*     */     
/*  37 */     for (adr adr : adr.values()) {
/*  38 */       requiredArgumentBuilder.then((ArgumentBuilder)a(adr));
/*     */     }
/*     */     
/*  41 */     ☃.register(
/*  42 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("playsound")
/*  43 */         .requires(☃ -> ☃.c(2)))
/*  44 */         .then((ArgumentBuilder)requiredArgumentBuilder));
/*     */   }
/*     */ 
/*     */   
/*     */   private static LiteralArgumentBuilder<db> a(adr ☃) {
/*  49 */     return (LiteralArgumentBuilder<db>)dc.a(☃.a())
/*  50 */       .then((
/*  51 */         (RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/*  52 */         .executes(commandContext -> a((db)commandContext.getSource(), dk.f(commandContext, "targets"), dy.e(commandContext, "sound"), ☃, ((db)commandContext.getSource()).d(), 1.0F, 1.0F, 0.0F)))
/*  53 */         .then((
/*  54 */           (RequiredArgumentBuilder)dc.<T>a("pos", er.a())
/*  55 */           .executes(commandContext -> a((db)commandContext.getSource(), dk.f(commandContext, "targets"), dy.e(commandContext, "sound"), ☃, er.a(commandContext, "pos"), 1.0F, 1.0F, 0.0F)))
/*  56 */           .then((
/*  57 */             (RequiredArgumentBuilder)dc.<T>a("volume", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/*  58 */             .executes(commandContext -> a((db)commandContext.getSource(), dk.f(commandContext, "targets"), dy.e(commandContext, "sound"), ☃, er.a(commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), 1.0F, 0.0F)))
/*  59 */             .then((
/*  60 */               (RequiredArgumentBuilder)dc.<T>a("pitch", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F, 2.0F))
/*  61 */               .executes(commandContext -> a((db)commandContext.getSource(), dk.f(commandContext, "targets"), dy.e(commandContext, "sound"), ☃, er.a(commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), ((Float)commandContext.getArgument("pitch", Float.class)).floatValue(), 0.0F)))
/*  62 */               .then(
/*  63 */                 dc.<T>a("minVolume", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F, 1.0F))
/*  64 */                 .executes(commandContext -> a((db)commandContext.getSource(), dk.f(commandContext, "targets"), dy.e(commandContext, "sound"), ☃, er.a(commandContext, "pos"), ((Float)commandContext.getArgument("volume", Float.class)).floatValue(), ((Float)commandContext.getArgument("pitch", Float.class)).floatValue(), ((Float)commandContext.getArgument("minVolume", Float.class)).floatValue())))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, Collection<aah> collection, vk vk1, adr adr1, dcn dcn1, float f1, float f2, float f3) throws CommandSyntaxException {
/*  73 */     double d = Math.pow((f1 > 1.0F) ? (f1 * 16.0F) : 16.0D, 2.0D);
/*  74 */     int i = 0;
/*     */     
/*  76 */     for (aah aah : collection) {
/*  77 */       double d1 = dcn1.b - aah.cD();
/*  78 */       double d2 = dcn1.c - aah.cE();
/*  79 */       double d3 = dcn1.d - aah.cH();
/*  80 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*  81 */       dcn dcn2 = dcn1;
/*  82 */       float f = f1;
/*     */       
/*  84 */       if (d4 > d) {
/*  85 */         if (f3 <= 0.0F) {
/*     */           continue;
/*     */         }
/*     */         
/*  89 */         double d5 = afm.a(d4);
/*  90 */         dcn2 = new dcn(aah.cD() + d1 / d5 * 2.0D, aah.cE() + d2 / d5 * 2.0D, aah.cH() + d3 / d5 * 2.0D);
/*  91 */         f = f3;
/*     */       } 
/*     */       
/*  94 */       aah.b.a(new pl(vk1, adr1, dcn2, f, f2));
/*  95 */       i++;
/*     */     } 
/*     */     
/*  98 */     if (i == 0) {
/*  99 */       throw a.create();
/*     */     }
/*     */     
/* 102 */     if (collection.size() == 1) {
/* 103 */       ☃.a(new of("commands.playsound.success.single", new Object[] { vk1, ((aah)collection.iterator().next()).d() }), true);
/*     */     } else {
/* 105 */       ☃.a(new of("commands.playsound.success.multiple", new Object[] { vk1, Integer.valueOf(collection.size()) }), true);
/*     */     } 
/*     */     
/* 108 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */