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
/*    */ 
/*    */ public class ya
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 19 */     ☃.register(
/* 20 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("say")
/* 21 */         .requires(☃ -> ☃.c(2)))
/* 22 */         .then(
/* 23 */           dc.<T>a("message", dp.a())
/* 24 */           .executes(☃ -> {
/*    */               nr nr = dp.a(☃, "message");
/*    */               of of = new of("chat.type.announcement", new Object[] { ((db)☃.getSource()).b(), nr });
/*    */               aqa aqa = ((db)☃.getSource()).f();
/*    */               if (aqa != null) {
/*    */                 ((db)☃.getSource()).j().ae().a(of, no.a, aqa.bS());
/*    */               } else {
/*    */                 ((db)☃.getSource()).j().ae().a(of, no.b, x.b);
/*    */               } 
/*    */               return 1;
/*    */             })));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ya.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */