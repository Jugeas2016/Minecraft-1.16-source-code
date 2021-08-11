/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wt
/*    */ {
/*    */   private static final DynamicCommandExceptionType a;
/*    */   
/*    */   static {
/* 16 */     a = new DynamicCommandExceptionType(☃ -> new of("commands.difficulty.failure", new Object[] { ☃ }));
/*    */   }
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 19 */     LiteralArgumentBuilder<db> literalArgumentBuilder = dc.a("difficulty");
/*    */     
/* 21 */     for (aor aor : aor.values()) {
/* 22 */       literalArgumentBuilder.then(dc.a(aor.c()).executes(commandContext -> a((db)commandContext.getSource(), ☃)));
/*    */     }
/*    */     
/* 25 */     ☃.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalArgumentBuilder
/*    */         
/* 27 */         .requires(☃ -> ☃.c(2)))
/* 28 */         .executes(☃ -> {
/*    */             aor aor = ((db)☃.getSource()).e().ad();
/*    */             ((db)☃.getSource()).a(new of("commands.difficulty.query", new Object[] { aor.b() }), false);
/*    */             return aor.a();
/*    */           }));
/*    */   }
/*    */ 
/*    */   
/*    */   public static int a(db ☃, aor aor1) throws CommandSyntaxException {
/* 37 */     MinecraftServer minecraftServer = ☃.j();
/* 38 */     if (minecraftServer.aX().s() == aor1) {
/* 39 */       throw a.create(aor1.c());
/*    */     }
/*    */     
/* 42 */     minecraftServer.a(aor1, true);
/* 43 */     ☃.a(new of("commands.difficulty.success", new Object[] { aor1.b() }), true);
/*    */     
/* 45 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */