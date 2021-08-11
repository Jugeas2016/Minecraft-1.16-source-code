/*    */ import com.google.common.collect.Lists;
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
/*    */ import java.util.List;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class du
/*    */   implements ArgumentType<ddq>
/*    */ {
/* 25 */   private static final Collection<String> b = Arrays.asList(new String[] { "foo", "foo.bar.baz", "minecraft:foo" }); static {
/* 26 */     a = new DynamicCommandExceptionType(☃ -> new of("argument.criteria.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static du a() {
/* 32 */     return new du();
/*    */   }
/*    */   
/*    */   public static ddq a(CommandContext<db> ☃, String str) {
/* 36 */     return (ddq)☃.getArgument(str, ddq.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public ddq a(StringReader ☃) throws CommandSyntaxException {
/* 41 */     int i = ☃.getCursor();
/* 42 */     while (☃.canRead() && ☃.peek() != ' ') {
/* 43 */       ☃.skip();
/*    */     }
/* 45 */     String str = ☃.getString().substring(i, ☃.getCursor());
/* 46 */     return ddq.a(str).<Throwable>orElseThrow(() -> {
/*    */           ☃.setCursor(i);
/*    */           return a.create(str);
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 54 */     List<String> list = Lists.newArrayList(ddq.a.keySet());
/* 55 */     for (adz<?> adz : gm.ag) {
/* 56 */       for (Object object : adz.a()) {
/* 57 */         String str = a(adz, object);
/* 58 */         list.add(str);
/*    */       } 
/*    */     } 
/* 61 */     return dd.b(list, suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> String a(adz<T> ☃, Object object) {
/* 66 */     return adx.a(☃, (T)object);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 71 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\du.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */