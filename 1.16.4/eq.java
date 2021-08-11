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
/*    */ public class eq
/*    */   implements ArgumentType<em>
/*    */ {
/* 23 */   private static final Collection<String> b = Arrays.asList(new String[] { "0 0", "~ ~", "0.1 -0.5", "~1 ~-2" });
/* 24 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.pos2d.incomplete"));
/*    */   
/*    */   private final boolean c;
/*    */   
/*    */   public eq(boolean ☃) {
/* 29 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public static eq a() {
/* 33 */     return new eq(true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static dcm a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 42 */     dcn dcn = ((em)☃.getArgument(str, em.class)).a((db)☃.getSource());
/* 43 */     return new dcm((float)dcn.b, (float)dcn.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public em a(StringReader ☃) throws CommandSyntaxException {
/* 48 */     int i = ☃.getCursor();
/* 49 */     if (!☃.canRead()) {
/* 50 */       throw a.createWithContext(☃);
/*    */     }
/* 52 */     es es1 = es.a(☃, this.c);
/* 53 */     if (!☃.canRead() || ☃.peek() != ' ') {
/* 54 */       ☃.setCursor(i);
/* 55 */       throw a.createWithContext(☃);
/*    */     } 
/* 57 */     ☃.skip();
/* 58 */     es es2 = es.a(☃, this.c);
/* 59 */     return new et(es1, new es(true, 0.0D), es2);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 64 */     if (☃.getSource() instanceof dd) {
/* 65 */       Collection<dd.a> collection; String str = suggestionsBuilder.getRemaining();
/*    */ 
/*    */ 
/*    */       
/* 69 */       if (!str.isEmpty() && str.charAt(0) == '^') {
/* 70 */         collection = Collections.singleton(dd.a.a);
/*    */       } else {
/* 72 */         collection = ((dd)☃.getSource()).t();
/*    */       } 
/*    */       
/* 75 */       return dd.b(str, collection, suggestionsBuilder, dc.a(this::a));
/*    */     } 
/* 77 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 83 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */