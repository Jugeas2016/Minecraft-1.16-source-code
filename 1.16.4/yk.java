/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class yk
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 12 */     ☃.register(
/* 13 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("stop")
/* 14 */         .requires(☃ -> ☃.c(4)))
/* 15 */         .executes(☃ -> {
/*    */             ((db)☃.getSource()).a(new of("commands.stop.stopping"), true);
/*    */             ((db)☃.getSource()).j().a(false);
/*    */             return 1;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */