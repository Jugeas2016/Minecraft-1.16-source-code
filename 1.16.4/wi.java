/*    */ import com.google.common.collect.Iterables;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wi
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 18 */     ☃.register(
/* 19 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("banlist")
/* 20 */         .requires(☃ -> ☃.c(3)))
/* 21 */         .executes(☃ -> {
/*    */             acu acu = ((db)☃.getSource()).j().ae();
/*    */             
/*    */             return a((db)☃.getSource(), Lists.newArrayList(Iterables.concat(acu.f().d(), acu.g().d())));
/* 25 */           })).then(
/* 26 */           dc.a("ips")
/* 27 */           .executes(☃ -> a((db)☃.getSource(), (Collection)((db)☃.getSource()).j().ae().g().d()))))
/*    */         
/* 29 */         .then(
/* 30 */           dc.a("players")
/* 31 */           .executes(☃ -> a((db)☃.getSource(), (Collection)((db)☃.getSource()).j().ae().f().d()))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<? extends acp<?>> collection) {
/* 37 */     if (collection.isEmpty()) {
/* 38 */       ☃.a(new of("commands.banlist.none"), false);
/*    */     } else {
/* 40 */       ☃.a(new of("commands.banlist.list", new Object[] { Integer.valueOf(collection.size()) }), false);
/* 41 */       for (acp<?> acp : collection) {
/* 42 */         ☃.a(new of("commands.banlist.entry", new Object[] { acp.e(), acp.b(), acp.d() }), false);
/*    */       } 
/*    */     } 
/* 45 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */