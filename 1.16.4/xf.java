/*    */ import com.google.common.collect.Iterables;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.ParseResults;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.context.ParsedCommandNode;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xf
/*    */ {
/* 20 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.help.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 23 */     ☃.register(
/* 24 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("help")
/* 25 */         .executes(commandContext -> {
/*    */             Map<CommandNode<db>, String> map = ☃.getSmartUsage((CommandNode)☃.getRoot(), commandContext.getSource());
/*    */             
/*    */             for (String str : map.values()) {
/*    */               ((db)commandContext.getSource()).a(new oe("/" + str), false);
/*    */             }
/*    */             return map.size();
/* 32 */           })).then(
/* 33 */           dc.<T>a("command", (ArgumentType<T>)StringArgumentType.greedyString())
/* 34 */           .executes(commandContext -> {
/*    */               ParseResults<db> parseResults = ☃.parse(StringArgumentType.getString(commandContext, "command"), commandContext.getSource());
/*    */               if (parseResults.getContext().getNodes().isEmpty())
/*    */                 throw a.create(); 
/*    */               Map<CommandNode<db>, String> map = ☃.getSmartUsage(((ParsedCommandNode)Iterables.getLast(parseResults.getContext().getNodes())).getNode(), commandContext.getSource());
/*    */               for (String str : map.values())
/*    */                 ((db)commandContext.getSource()).a(new oe("/" + parseResults.getReader().getString() + " " + str), false); 
/*    */               return map.size();
/*    */             })));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */