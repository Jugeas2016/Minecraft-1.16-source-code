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
/*    */ public class wo
/*    */ {
/* 21 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.deop.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 24 */     ☃.register(
/* 25 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("deop")
/* 26 */         .requires(☃ -> ☃.c(3)))
/* 27 */         .then(
/* 28 */           dc.<T>a("targets", dm.a())
/* 29 */           .suggests((☃, suggestionsBuilder) -> dd.a(((db)☃.getSource()).j().ae().l(), suggestionsBuilder))
/* 30 */           .executes(☃ -> a((db)☃.getSource(), dm.a(☃, "targets")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/* 36 */     acu acu = ☃.j().ae();
/* 37 */     int i = 0;
/*    */     
/* 39 */     for (GameProfile gameProfile : collection) {
/* 40 */       if (acu.h(gameProfile)) {
/* 41 */         acu.b(gameProfile);
/* 42 */         i++;
/* 43 */         ☃.a(new of("commands.deop.success", new Object[] { ((GameProfile)collection.iterator().next()).getName() }), true);
/*    */       } 
/*    */     } 
/*    */     
/* 47 */     if (i == 0) {
/* 48 */       throw a.create();
/*    */     }
/*    */     
/* 51 */     ☃.j().a(☃);
/* 52 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */