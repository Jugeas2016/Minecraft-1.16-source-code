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
/*    */ public class yf
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 15 */     ☃.register(
/* 16 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("setidletimeout")
/* 17 */         .requires(☃ -> ☃.c(3)))
/* 18 */         .then(
/* 19 */           dc.<T>a("minutes", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 20 */           .executes(☃ -> a((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "minutes")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, int i) {
/* 26 */     ☃.j().d(i);
/* 27 */     ☃.a(new of("commands.setidletimeout.success", new Object[] { Integer.valueOf(i) }), true);
/* 28 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */