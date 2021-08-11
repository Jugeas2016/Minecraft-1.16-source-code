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
/*    */ public class xn
/*    */ {
/* 21 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.op.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 24 */     ☃.register(
/* 25 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("op")
/* 26 */         .requires(☃ -> ☃.c(3)))
/* 27 */         .then(
/* 28 */           dc.<T>a("targets", dm.a())
/* 29 */           .suggests((☃, suggestionsBuilder) -> {
/*    */               acu acu = ((db)☃.getSource()).j().ae();
/*    */               
/*    */               return dd.b(acu.s().stream().filter(()).map(()), suggestionsBuilder);
/* 33 */             }).executes(☃ -> a((db)☃.getSource(), dm.a(☃, "targets")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/* 39 */     acu acu = ☃.j().ae();
/* 40 */     int i = 0;
/*    */     
/* 42 */     for (GameProfile gameProfile : collection) {
/* 43 */       if (!acu.h(gameProfile)) {
/* 44 */         acu.a(gameProfile);
/* 45 */         i++;
/* 46 */         ☃.a(new of("commands.op.success", new Object[] { ((GameProfile)collection.iterator().next()).getName() }), true);
/*    */       } 
/*    */     } 
/*    */     
/* 50 */     if (i == 0) {
/* 51 */       throw a.create();
/*    */     }
/*    */     
/* 54 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */