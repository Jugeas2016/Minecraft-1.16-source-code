/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.regex.Matcher;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xp
/*    */ {
/* 20 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.pardonip.invalid"));
/* 21 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.pardonip.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 24 */     ☃.register(
/* 25 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("pardon-ip")
/* 26 */         .requires(☃ -> ☃.c(3)))
/* 27 */         .then(
/* 28 */           dc.<T>a("target", (ArgumentType<T>)StringArgumentType.word())
/* 29 */           .suggests((☃, suggestionsBuilder) -> dd.a(((db)☃.getSource()).j().ae().g().a(), suggestionsBuilder))
/* 30 */           .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "target")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, String str) throws CommandSyntaxException {
/* 36 */     Matcher matcher = wh.a.matcher(str);
/* 37 */     if (!matcher.matches()) {
/* 38 */       throw a.create();
/*    */     }
/*    */     
/* 41 */     acr acr = ☃.j().ae().g();
/* 42 */     if (!acr.a(str)) {
/* 43 */       throw b.create();
/*    */     }
/*    */     
/* 46 */     acr.c(str);
/* 47 */     ☃.a(new of("commands.pardonip.success", new Object[] { str }), true);
/* 48 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */