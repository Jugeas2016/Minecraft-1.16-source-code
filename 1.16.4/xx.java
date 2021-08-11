/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xx
/*    */ {
/* 14 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.save.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 17 */     ☃.register(
/* 18 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("save-all")
/* 19 */         .requires(☃ -> ☃.c(4)))
/* 20 */         .executes(☃ -> a((db)☃.getSource(), false)))
/* 21 */         .then(
/* 22 */           dc.a("flush")
/* 23 */           .executes(☃ -> a((db)☃.getSource(), true))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, boolean bool) throws CommandSyntaxException {
/* 29 */     ☃.a(new of("commands.save.saving"), false);
/*    */     
/* 31 */     MinecraftServer minecraftServer = ☃.j();
/* 32 */     minecraftServer.ae().h();
/*    */     
/* 34 */     boolean bool1 = minecraftServer.a(true, bool, true);
/*    */     
/* 36 */     if (!bool1) {
/* 37 */       throw a.create();
/*    */     }
/*    */     
/* 40 */     ☃.a(new of("commands.save.success"), true);
/*    */     
/* 42 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */