/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xb
/*    */ {
/*    */   public static final SuggestionProvider<db> a;
/*    */   
/*    */   static {
/* 20 */     a = ((☃, suggestionsBuilder) -> {
/*    */         vx vx = ((db)☃.getSource()).j().aB();
/*    */         dd.a(vx.g(), suggestionsBuilder, "#");
/*    */         return dd.a(vx.f(), suggestionsBuilder);
/*    */       });
/*    */   }
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 27 */     ☃.register(
/* 28 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("function")
/* 29 */         .requires(☃ -> ☃.c(2)))
/* 30 */         .then(
/* 31 */           dc.<T>a("name", ev.a())
/* 32 */           .suggests(a)
/* 33 */           .executes(☃ -> a((db)☃.getSource(), ev.a(☃, "name")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<cy> collection) {
/* 39 */     int i = 0;
/*    */     
/* 41 */     for (cy cy : collection) {
/* 42 */       i += ☃.j().aB().a(cy, ☃.a().b(2));
/*    */     }
/*    */     
/* 45 */     if (collection.size() == 1) {
/* 46 */       ☃.a(new of("commands.function.success.single", new Object[] { Integer.valueOf(i), ((cy)collection.iterator().next()).a() }), true);
/*    */     } else {
/* 48 */       ☃.a(new of("commands.function.success.multiple", new Object[] { Integer.valueOf(i), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 51 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */