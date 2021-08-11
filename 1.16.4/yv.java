/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class yv
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 18 */     ☃.register(
/* 19 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("weather")
/* 20 */         .requires(☃ -> ☃.c(2)))
/* 21 */         .then((
/* 22 */           (LiteralArgumentBuilder)dc.a("clear")
/* 23 */           .executes(☃ -> a((db)☃.getSource(), 6000)))
/* 24 */           .then(
/* 25 */             dc.<T>a("duration", (ArgumentType<T>)IntegerArgumentType.integer(0, 1000000))
/* 26 */             .executes(☃ -> a((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "duration") * 20)))))
/*    */ 
/*    */         
/* 29 */         .then((
/* 30 */           (LiteralArgumentBuilder)dc.a("rain")
/* 31 */           .executes(☃ -> b((db)☃.getSource(), 6000)))
/* 32 */           .then(
/* 33 */             dc.<T>a("duration", (ArgumentType<T>)IntegerArgumentType.integer(0, 1000000))
/* 34 */             .executes(☃ -> b((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "duration") * 20)))))
/*    */ 
/*    */         
/* 37 */         .then((
/* 38 */           (LiteralArgumentBuilder)dc.a("thunder")
/* 39 */           .executes(☃ -> c((db)☃.getSource(), 6000)))
/* 40 */           .then(
/* 41 */             dc.<T>a("duration", (ArgumentType<T>)IntegerArgumentType.integer(0, 1000000))
/* 42 */             .executes(☃ -> c((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "duration") * 20)))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, int i) {
/* 49 */     ☃.e().a(i, 0, false, false);
/* 50 */     ☃.a(new of("commands.weather.set.clear"), true);
/* 51 */     return i;
/*    */   }
/*    */   
/*    */   private static int b(db ☃, int i) {
/* 55 */     ☃.e().a(0, i, true, false);
/* 56 */     ☃.a(new of("commands.weather.set.rain"), true);
/* 57 */     return i;
/*    */   }
/*    */   
/*    */   private static int c(db ☃, int i) {
/* 61 */     ☃.e().a(0, i, true, true);
/* 62 */     ☃.a(new of("commands.weather.set.thunder"), true);
/* 63 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */