/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements SuggestionProvider<dd>
/*    */ {
/*    */   private final SuggestionProvider<dd> a;
/*    */   private final vk b;
/*    */   
/*    */   public a(vk ☃, SuggestionProvider<dd> suggestionProvider) {
/* 64 */     this.a = suggestionProvider;
/* 65 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public CompletableFuture<Suggestions> getSuggestions(CommandContext<dd> ☃, SuggestionsBuilder suggestionsBuilder) throws CommandSyntaxException {
/* 70 */     return this.a.getSuggestions(☃, suggestionsBuilder);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */