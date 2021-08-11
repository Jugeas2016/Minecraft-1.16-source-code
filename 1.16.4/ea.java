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
/*    */ public class ea
/*    */   implements ArgumentType<Integer>
/*    */ {
/* 20 */   private static final Collection<String> b = Arrays.asList(new String[] { "sidebar", "foo.bar" }); static {
/* 21 */     a = new DynamicCommandExceptionType(☃ -> new of("argument.scoreboardDisplaySlot.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static ea a() {
/* 27 */     return new ea();
/*    */   }
/*    */   
/*    */   public static int a(CommandContext<db> ☃, String str) {
/* 31 */     return ((Integer)☃.getArgument(str, Integer.class)).intValue();
/*    */   }
/*    */ 
/*    */   
/*    */   public Integer a(StringReader ☃) throws CommandSyntaxException {
/* 36 */     String str = ☃.readUnquotedString();
/* 37 */     int i = ddn.j(str);
/* 38 */     if (i == -1) {
/* 39 */       throw a.create(str);
/*    */     }
/* 41 */     return Integer.valueOf(i);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 46 */     return dd.a(ddn.h(), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 51 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */