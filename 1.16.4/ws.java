/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ws
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 16 */     LiteralArgumentBuilder<db> literalArgumentBuilder = (LiteralArgumentBuilder<db>)dc.a("defaultgamemode").requires(☃ -> ☃.c(2));
/*    */     
/* 18 */     for (bru bru : bru.values()) {
/* 19 */       if (bru != bru.a) {
/* 20 */         literalArgumentBuilder.then(dc.a(bru.b()).executes(commandContext -> a((db)commandContext.getSource(), ☃)));
/*    */       }
/*    */     } 
/*    */     
/* 24 */     ☃.register(literalArgumentBuilder);
/*    */   }
/*    */   
/*    */   private static int a(db ☃, bru bru1) {
/* 28 */     int i = 0;
/* 29 */     MinecraftServer minecraftServer = ☃.j();
/* 30 */     minecraftServer.a(bru1);
/*    */     
/* 32 */     if (minecraftServer.al()) {
/* 33 */       for (aah aah : minecraftServer.ae().s()) {
/* 34 */         if (aah.d.b() != bru1) {
/* 35 */           aah.a(bru1);
/* 36 */           i++;
/*    */         } 
/*    */       } 
/*    */     }
/*    */     
/* 41 */     ☃.a(new of("commands.defaultgamemode.success", new Object[] { bru1.c() }), true);
/*    */     
/* 43 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */