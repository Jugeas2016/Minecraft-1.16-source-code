/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.List;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xi
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 19 */     ☃.register(
/* 20 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("list")
/* 21 */         .executes(☃ -> a((db)☃.getSource())))
/* 22 */         .then(
/* 23 */           dc.a("uuids")
/* 24 */           .executes(☃ -> b((db)☃.getSource()))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃) {
/* 30 */     return a(☃, bfw::d);
/*    */   }
/*    */   
/*    */   private static int b(db ☃) {
/* 34 */     return a(☃, ☃ -> new of("commands.list.nameAndId", new Object[] { ☃.R(), ☃.eA().getId() }));
/*    */   }
/*    */   
/*    */   private static int a(db ☃, Function<aah, nr> function) {
/* 38 */     acu acu = ☃.j().ae();
/* 39 */     List<aah> list = acu.s();
/* 40 */     nr nr = ns.b(list, function);
/* 41 */     ☃.a(new of("commands.list.players", new Object[] { Integer.valueOf(list.size()), Integer.valueOf(acu.n()), nr }), false);
/* 42 */     return list.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */