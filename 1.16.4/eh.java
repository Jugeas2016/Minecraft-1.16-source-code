/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eh
/*    */   implements ArgumentType<ef>
/*    */ {
/* 17 */   private static final Collection<String> a = Arrays.asList(new String[] { "stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}" });
/*    */   
/*    */   public static eh a() {
/* 20 */     return new eh();
/*    */   }
/*    */ 
/*    */   
/*    */   public ef a(StringReader ☃) throws CommandSyntaxException {
/* 25 */     ei ei = (new ei(☃, false)).a(true);
/* 26 */     return new ef(ei.b(), ei.a().keySet(), ei.c());
/*    */   }
/*    */   
/*    */   public static ef a(CommandContext<db> ☃, String str) {
/* 30 */     return (ef)☃.getArgument(str, ef.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 35 */     StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/* 36 */     stringReader.setCursor(suggestionsBuilder.getStart());
/* 37 */     ei ei = new ei(stringReader, false);
/*    */     try {
/* 39 */       ei.a(true);
/* 40 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*    */     
/* 42 */     return ei.a(suggestionsBuilder, aed.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 47 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */