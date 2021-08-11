/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ls
/*    */   implements ArgumentType<String>
/*    */ {
/* 20 */   private static final Collection<String> a = Arrays.asList(new String[] { "techtests", "mobtests" });
/*    */ 
/*    */   
/*    */   public String a(StringReader ☃) throws CommandSyntaxException {
/* 24 */     String str = ☃.readUnquotedString();
/* 25 */     if (lh.b(str)) {
/* 26 */       return str;
/*    */     }
/* 28 */     Message message = new oe("No such test class: " + str);
/* 29 */     throw new CommandSyntaxException(new SimpleCommandExceptionType(message), message);
/*    */   }
/*    */ 
/*    */   
/*    */   public static ls a() {
/* 34 */     return new ls();
/*    */   }
/*    */   
/*    */   public static String a(CommandContext<db> ☃, String str) {
/* 38 */     return (String)☃.getArgument(str, String.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 43 */     return dd.b(lh.b().stream(), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 49 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ls.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */