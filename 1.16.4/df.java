/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
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
/*    */ public class df
/*    */   implements ArgumentType<k>
/*    */ {
/* 20 */   private static final Collection<String> b = Arrays.asList(new String[] { "red", "green" }); static {
/* 21 */     a = new DynamicCommandExceptionType(☃ -> new of("argument.color.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static df a() {
/* 27 */     return new df();
/*    */   }
/*    */   
/*    */   public static k a(CommandContext<db> ☃, String str) {
/* 31 */     return (k)☃.getArgument(str, k.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public k a(StringReader ☃) throws CommandSyntaxException {
/* 36 */     String str = ☃.readUnquotedString();
/* 37 */     k k = k.b(str);
/* 38 */     if (k == null || k.c()) {
/* 39 */       throw a.create(str);
/*    */     }
/* 41 */     return k;
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 46 */     return dd.b(k.a(true, false), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 51 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\df.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */