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
/*    */ public class ew
/*    */   implements ArgumentType<ex>
/*    */ {
/* 16 */   private static final Collection<String> a = Arrays.asList(new String[] { "stick", "minecraft:stick", "stick{foo=bar}" });
/*    */   
/*    */   public static ew a() {
/* 19 */     return new ew();
/*    */   }
/*    */ 
/*    */   
/*    */   public ex a(StringReader ☃) throws CommandSyntaxException {
/* 24 */     ey ey = (new ey(☃, false)).h();
/*    */     
/* 26 */     return new ex(ey.b(), ey.c());
/*    */   }
/*    */   
/*    */   public static <S> ex a(CommandContext<S> ☃, String str) {
/* 30 */     return (ex)☃.getArgument(str, ex.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 35 */     StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/* 36 */     stringReader.setCursor(suggestionsBuilder.getStart());
/* 37 */     ey ey = new ey(stringReader, false);
/*    */     try {
/* 39 */       ey.h();
/* 40 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*    */     
/* 42 */     return ey.a(suggestionsBuilder, aeg.a());
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 47 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */