/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
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
/*    */ public class xo
/*    */ {
/* 22 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.pardon.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 25 */     ☃.register(
/* 26 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("pardon")
/* 27 */         .requires(☃ -> ☃.c(3)))
/* 28 */         .then(
/* 29 */           dc.<T>a("targets", dm.a())
/* 30 */           .suggests((☃, suggestionsBuilder) -> dd.a(((db)☃.getSource()).j().ae().f().a(), suggestionsBuilder))
/* 31 */           .executes(☃ -> a((db)☃.getSource(), dm.a(☃, "targets")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/* 37 */     acz acz = ☃.j().ae().f();
/* 38 */     int i = 0;
/*    */     
/* 40 */     for (GameProfile gameProfile : collection) {
/* 41 */       if (acz.a(gameProfile)) {
/* 42 */         acz.c(gameProfile);
/* 43 */         i++;
/* 44 */         ☃.a(new of("commands.pardon.success", new Object[] { ns.a(gameProfile) }), true);
/*    */       } 
/*    */     } 
/*    */     
/* 48 */     if (i == 0) {
/* 49 */       throw a.create();
/*    */     }
/*    */     
/* 52 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */