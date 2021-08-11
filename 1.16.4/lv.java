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
/*    */ import java.util.Optional;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class lv
/*    */   implements ArgumentType<lu>
/*    */ {
/* 22 */   private static final Collection<String> a = Arrays.asList(new String[] { "techtests.piston", "techtests" });
/*    */ 
/*    */   
/*    */   public lu a(StringReader ☃) throws CommandSyntaxException {
/* 26 */     String str = ☃.readUnquotedString();
/* 27 */     Optional<lu> optional = lh.d(str);
/* 28 */     if (optional.isPresent()) {
/* 29 */       return optional.get();
/*    */     }
/* 31 */     Message message = new oe("No such test: " + str);
/* 32 */     throw new CommandSyntaxException(new SimpleCommandExceptionType(message), message);
/*    */   }
/*    */ 
/*    */   
/*    */   public static lv a() {
/* 37 */     return new lv();
/*    */   }
/*    */   
/*    */   public static lu a(CommandContext<db> ☃, String str) {
/* 41 */     return (lu)☃.getArgument(str, lu.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 46 */     Stream<String> stream = lh.a().stream().map(lu::a);
/* 47 */     return dd.b(stream, suggestionsBuilder);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 53 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\lv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */