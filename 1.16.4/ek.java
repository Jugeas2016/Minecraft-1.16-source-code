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
/*    */ public class ek
/*    */   implements ArgumentType<em>
/*    */ {
/* 22 */   private static final Collection<String> c = Arrays.asList(new String[] { "0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5" });
/*    */   
/* 24 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.pos.unloaded"));
/* 25 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("argument.pos.outofworld"));
/*    */   
/*    */   public static ek a() {
/* 28 */     return new ek();
/*    */   }
/*    */   
/*    */   public static fx a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 32 */     fx fx = ((em)☃.getArgument(str, em.class)).c((db)☃.getSource());
/* 33 */     if (!((db)☃.getSource()).e().C(fx)) {
/* 34 */       throw a.create();
/*    */     }
/* 36 */     ((db)☃.getSource()).e(); if (!aag.k(fx)) {
/* 37 */       throw b.create();
/*    */     }
/* 39 */     return fx;
/*    */   }
/*    */   
/*    */   public static fx b(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 43 */     return ((em)☃.getArgument(str, em.class)).c((db)☃.getSource());
/*    */   }
/*    */ 
/*    */   
/*    */   public em a(StringReader ☃) throws CommandSyntaxException {
/* 48 */     if (☃.canRead() && ☃.peek() == '^') {
/* 49 */       return en.a(☃);
/*    */     }
/* 51 */     return et.a(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 57 */     if (☃.getSource() instanceof dd) {
/* 58 */       Collection<dd.a> collection; String str = suggestionsBuilder.getRemaining();
/*    */ 
/*    */ 
/*    */       
/* 62 */       if (!str.isEmpty() && str.charAt(0) == '^') {
/* 63 */         collection = Collections.singleton(dd.a.a);
/*    */       } else {
/* 65 */         collection = ((dd)☃.getSource()).s();
/*    */       } 
/*    */       
/* 68 */       return dd.a(str, collection, suggestionsBuilder, dc.a(this::a));
/*    */     } 
/* 70 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 76 */     return c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */