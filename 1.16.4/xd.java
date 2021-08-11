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
/*    */ public class xd
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 15 */     LiteralArgumentBuilder<db> literalArgumentBuilder = (LiteralArgumentBuilder<db>)dc.a("gamerule").requires(☃ -> ☃.c(2));
/*    */     
/* 17 */     brt.a(new brt.c(literalArgumentBuilder)
/*    */         {
/*    */           public <T extends brt.g<T>> void a(brt.e<T> ☃, brt.f<T> f1) {
/* 20 */             this.a.then((
/* 21 */                 (LiteralArgumentBuilder)dc.a(☃.a())
/* 22 */                 .executes(commandContext -> xd.a((db)commandContext.getSource(), ☃)))
/* 23 */                 .then(f1
/* 24 */                   .a("value")
/* 25 */                   .executes(commandContext -> xd.a(commandContext, ☃))));
/*    */           }
/*    */         });
/*    */ 
/*    */ 
/*    */     
/* 31 */     ☃.register(literalArgumentBuilder);
/*    */   }
/*    */   
/*    */   private static <T extends brt.g<T>> int b(CommandContext<db> ☃, brt.e<T> e1) {
/* 35 */     db db = (db)☃.getSource();
/* 36 */     T t = db.j().aL().a(e1);
/* 37 */     t.b(☃, "value");
/* 38 */     db.a(new of("commands.gamerule.set", new Object[] { e1.a(), t.toString() }), true);
/* 39 */     return t.c();
/*    */   }
/*    */   
/*    */   private static <T extends brt.g<T>> int b(db ☃, brt.e<T> e1) {
/* 43 */     T t = ☃.j().aL().a(e1);
/* 44 */     ☃.a(new of("commands.gamerule.query", new Object[] { e1.a(), t.toString() }), false);
/* 45 */     return t.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */