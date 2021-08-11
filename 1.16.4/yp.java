/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class yp
/*    */ {
/* 25 */   private static final ob a = ob.a
/* 26 */     .a(new nv((nv.a)nv.a.a, (T)new of("chat.type.team.hover")))
/* 27 */     .a(new np(np.a.d, "/teammsg "));
/*    */   
/* 29 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.teammsg.failed.noteam"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 32 */     LiteralCommandNode<db> literalCommandNode = ☃.register(
/* 33 */         (LiteralArgumentBuilder)dc.a("teammsg")
/* 34 */         .then(
/* 35 */           dc.<T>a("message", dp.a())
/* 36 */           .executes(☃ -> a((db)☃.getSource(), dp.a(☃, "message")))));
/*    */ 
/*    */     
/* 39 */     ☃.register((LiteralArgumentBuilder)dc.a("tm").redirect((CommandNode)literalCommandNode));
/*    */   }
/*    */   
/*    */   private static int a(db ☃, nr nr1) throws CommandSyntaxException {
/* 43 */     aqa aqa = ☃.g();
/* 44 */     ddl ddl = (ddl)aqa.bG();
/* 45 */     if (ddl == null) {
/* 46 */       throw b.create();
/*    */     }
/*    */     
/* 49 */     nr nr2 = ddl.d().c(a);
/*    */     
/* 51 */     List<aah> list = ☃.j().ae().s();
/* 52 */     for (aah aah : list) {
/* 53 */       if (aah == aqa) {
/* 54 */         aah.a(new of("chat.type.team.sent", new Object[] { nr2, ☃.b(), nr1 }), aqa.bS()); continue;
/* 55 */       }  if (aah.bG() == ddl) {
/* 56 */         aah.a(new of("chat.type.team.text", new Object[] { nr2, ☃.b(), nr1 }), aqa.bS());
/*    */       }
/*    */     } 
/*    */     
/* 60 */     return list.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */