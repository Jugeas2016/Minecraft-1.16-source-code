/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xs
/*    */ {
/*    */   private static final DynamicCommandExceptionType b;
/* 18 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.publish.failed")); static {
/* 19 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.publish.alreadyPublished", new Object[] { ☃ }));
/*    */   }
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 22 */     ☃.register(
/* 23 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("publish")
/* 24 */         .requires(☃ -> ☃.c(4)))
/* 25 */         .executes(☃ -> a((db)☃.getSource(), aff.a())))
/* 26 */         .then(
/* 27 */           dc.<T>a("port", (ArgumentType<T>)IntegerArgumentType.integer(0, 65535))
/* 28 */           .executes(☃ -> a((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "port")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, int i) throws CommandSyntaxException {
/* 34 */     if (☃.j().n()) {
/* 35 */       throw b.create(Integer.valueOf(☃.j().M()));
/*    */     }
/* 37 */     if (!☃.j().a(☃.j().s(), false, i)) {
/* 38 */       throw a.create();
/*    */     }
/* 40 */     ☃.a(new of("commands.publish.success", new Object[] { Integer.valueOf(i) }), true);
/* 41 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */