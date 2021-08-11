/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class el
/*    */   implements ArgumentType<em>
/*    */ {
/* 23 */   private static final Collection<String> b = Arrays.asList(new String[] { "0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0" });
/* 24 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.pos2d.incomplete"));
/*    */   
/*    */   public static el a() {
/* 27 */     return new el();
/*    */   }
/*    */   
/*    */   public static zw a(CommandContext<db> ☃, String str) {
/* 31 */     fx fx = ((em)☃.getArgument(str, em.class)).c((db)☃.getSource());
/* 32 */     return new zw(fx.u(), fx.w());
/*    */   }
/*    */ 
/*    */   
/*    */   public em a(StringReader ☃) throws CommandSyntaxException {
/* 37 */     int i = ☃.getCursor();
/* 38 */     if (!☃.canRead()) {
/* 39 */       throw a.createWithContext(☃);
/*    */     }
/* 41 */     es es1 = es.a(☃);
/* 42 */     if (!☃.canRead() || ☃.peek() != ' ') {
/* 43 */       ☃.setCursor(i);
/* 44 */       throw a.createWithContext(☃);
/*    */     } 
/* 46 */     ☃.skip();
/* 47 */     es es2 = es.a(☃);
/* 48 */     return new et(es1, new es(true, 0.0D), es2);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 53 */     if (☃.getSource() instanceof dd) {
/* 54 */       Collection<dd.a> collection; String str = suggestionsBuilder.getRemaining();
/*    */ 
/*    */ 
/*    */       
/* 58 */       if (!str.isEmpty() && str.charAt(0) == '^') {
/* 59 */         collection = Collections.singleton(dd.a.a);
/*    */       } else {
/* 61 */         collection = ((dd)☃.getSource()).s();
/*    */       } 
/*    */       
/* 64 */       return dd.b(str, collection, suggestionsBuilder, dc.a(this::a));
/*    */     } 
/* 66 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 72 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\el.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */