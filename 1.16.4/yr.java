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
/*    */ public class yr
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 19 */     ☃.register(
/* 20 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("tellraw")
/* 21 */         .requires(☃ -> ☃.c(2)))
/* 22 */         .then(
/* 23 */           dc.<T>a("targets", dk.d())
/* 24 */           .then(
/* 25 */             dc.<T>a("message", dg.a())
/* 26 */             .executes(☃ -> {
/*    */                 int i = 0;
/*    */                 for (aah aah : dk.f(☃, "targets")) {
/*    */                   aah.a(ns.a((db)☃.getSource(), dg.a(☃, "message"), aah, 0), x.b);
/*    */                   i++;
/*    */                 } 
/*    */                 return i;
/*    */               }))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */