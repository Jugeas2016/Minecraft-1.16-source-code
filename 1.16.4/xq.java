/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xq
/*    */ {
/* 30 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.particle.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 33 */     ☃.register(
/* 34 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("particle")
/* 35 */         .requires(☃ -> ☃.c(2)))
/* 36 */         .then((
/* 37 */           (RequiredArgumentBuilder)dc.<T>a("name", dw.a())
/* 38 */           .executes(☃ -> a((db)☃.getSource(), dw.a(☃, "name"), ((db)☃.getSource()).d(), dcn.a, 0.0F, 0, false, ((db)☃.getSource()).j().ae().s())))
/* 39 */           .then((
/* 40 */             (RequiredArgumentBuilder)dc.<T>a("pos", er.a())
/* 41 */             .executes(☃ -> a((db)☃.getSource(), dw.a(☃, "name"), er.a(☃, "pos"), dcn.a, 0.0F, 0, false, ((db)☃.getSource()).j().ae().s())))
/* 42 */             .then(
/* 43 */               dc.<T>a("delta", er.a(false))
/* 44 */               .then(
/* 45 */                 dc.<T>a("speed", (ArgumentType<T>)FloatArgumentType.floatArg(0.0F))
/* 46 */                 .then((
/* 47 */                   (RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("count", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 48 */                   .executes(☃ -> a((db)☃.getSource(), dw.a(☃, "name"), er.a(☃, "pos"), er.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), false, ((db)☃.getSource()).j().ae().s())))
/* 49 */                   .then((
/* 50 */                     (LiteralArgumentBuilder)dc.a("force")
/* 51 */                     .executes(☃ -> a((db)☃.getSource(), dw.a(☃, "name"), er.a(☃, "pos"), er.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), true, ((db)☃.getSource()).j().ae().s())))
/* 52 */                     .then(
/* 53 */                       dc.<T>a("viewers", dk.d())
/* 54 */                       .executes(☃ -> a((db)☃.getSource(), dw.a(☃, "name"), er.a(☃, "pos"), er.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), true, dk.f(☃, "viewers"))))))
/*    */ 
/*    */                   
/* 57 */                   .then((
/* 58 */                     (LiteralArgumentBuilder)dc.a("normal")
/* 59 */                     .executes(☃ -> a((db)☃.getSource(), dw.a(☃, "name"), er.a(☃, "pos"), er.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), false, ((db)☃.getSource()).j().ae().s())))
/* 60 */                     .then(
/* 61 */                       dc.<T>a("viewers", dk.d())
/* 62 */                       .executes(☃ -> a((db)☃.getSource(), dw.a(☃, "name"), er.a(☃, "pos"), er.a(☃, "delta"), FloatArgumentType.getFloat(☃, "speed"), IntegerArgumentType.getInteger(☃, "count"), false, dk.f(☃, "viewers")))))))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, hf hf1, dcn dcn1, dcn dcn2, float f, int i, boolean bool, Collection<aah> collection) throws CommandSyntaxException {
/* 74 */     int j = 0;
/*    */     
/* 76 */     for (aah aah : collection) {
/* 77 */       if (☃.e().a(aah, hf1, bool, dcn1.b, dcn1.c, dcn1.d, i, dcn2.b, dcn2.c, dcn2.d, f)) {
/* 78 */         j++;
/*    */       }
/*    */     } 
/*    */     
/* 82 */     if (j == 0) {
/* 83 */       throw a.create();
/*    */     }
/*    */     
/* 86 */     ☃.a(new of("commands.particle.success", new Object[] { gm.V.b(hf1.b()).toString() }), true);
/*    */     
/* 88 */     return j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */