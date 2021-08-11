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
/*    */ public class er
/*    */   implements ArgumentType<em>
/*    */ {
/* 22 */   private static final Collection<String> c = Arrays.asList(new String[] { "0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5" });
/*    */   
/* 24 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.pos3d.incomplete"));
/* 25 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("argument.pos.mixed"));
/*    */   
/*    */   private final boolean d;
/*    */   
/*    */   public er(boolean ☃) {
/* 30 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public static er a() {
/* 34 */     return new er(true);
/*    */   }
/*    */   
/*    */   public static er a(boolean ☃) {
/* 38 */     return new er(☃);
/*    */   }
/*    */   
/*    */   public static dcn a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 42 */     return ((em)☃.getArgument(str, em.class)).a((db)☃.getSource());
/*    */   }
/*    */   
/*    */   public static em b(CommandContext<db> ☃, String str) {
/* 46 */     return (em)☃.getArgument(str, em.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public em a(StringReader ☃) throws CommandSyntaxException {
/* 51 */     if (☃.canRead() && ☃.peek() == '^') {
/* 52 */       return en.a(☃);
/*    */     }
/* 54 */     return et.a(☃, this.d);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 60 */     if (☃.getSource() instanceof dd) {
/* 61 */       Collection<dd.a> collection; String str = suggestionsBuilder.getRemaining();
/*    */ 
/*    */ 
/*    */       
/* 65 */       if (!str.isEmpty() && str.charAt(0) == '^') {
/* 66 */         collection = Collections.singleton(dd.a.a);
/*    */       } else {
/* 68 */         collection = ((dd)☃.getSource()).t();
/*    */       } 
/*    */       
/* 71 */       return dd.a(str, collection, suggestionsBuilder, dc.a(this::a));
/*    */     } 
/* 73 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 79 */     return c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\er.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */