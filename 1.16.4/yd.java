/*    */ import com.mojang.brigadier.CommandDispatcher;
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
/*    */ 
/*    */ 
/*    */ public class yd
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃, boolean bool) {
/* 18 */     ☃.register(
/* 19 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("seed")
/* 20 */         .requires(db1 -> (!☃ || db1.c(2))))
/* 21 */         .executes(☃ -> {
/*    */             long l = ((db)☃.getSource()).e().C();
/*    */             nr nr = ns.a((new oe(String.valueOf(l))).a(()));
/*    */             ((db)☃.getSource()).a(new of("commands.seed.success", new Object[] { nr }), false);
/*    */             return (int)l;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */