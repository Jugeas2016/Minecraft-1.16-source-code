/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xj
/*    */ {
/*    */   public static final DynamicCommandExceptionType a;
/*    */   private static final DynamicCommandExceptionType b;
/*    */   
/*    */   static {
/* 21 */     a = new DynamicCommandExceptionType(☃ -> new of("commands.locatebiome.invalid", new Object[] { ☃ }));
/* 22 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.locatebiome.notFound", new Object[] { ☃ }));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 28 */     ☃.register(
/* 29 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("locatebiome")
/* 30 */         .requires(☃ -> ☃.c(2)))
/* 31 */         .then(
/* 32 */           dc.<T>a("biome", dy.a())
/* 33 */           .suggests(fm.d)
/* 34 */           .executes(☃ -> a((db)☃.getSource(), (vk)☃.getArgument("biome", vk.class)))));
/*    */   }
/*    */ 
/*    */   
/*    */   private static int a(db ☃, vk vk1) throws CommandSyntaxException {
/* 39 */     bsv bsv = (bsv)☃.j().aY().<bsv>b(gm.ay).b(vk1).orElseThrow(() -> a.create(☃));
/*    */     
/* 41 */     fx fx1 = new fx(☃.d());
/* 42 */     fx fx2 = ☃.e().a(bsv, fx1, 6400, 8);
/* 43 */     String str = vk1.toString();
/* 44 */     if (fx2 == null) {
/* 45 */       throw b.create(str);
/*    */     }
/* 47 */     return xk.a(☃, str, fx1, fx2, "commands.locatebiome.success");
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */