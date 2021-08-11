/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ed
/*    */   implements ArgumentType<Integer>
/*    */ {
/* 23 */   private static final Collection<String> a = Arrays.asList(new String[] { "0d", "0s", "0t", "0" }); private static final DynamicCommandExceptionType c;
/* 24 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("argument.time.invalid_unit")); static {
/* 25 */     c = new DynamicCommandExceptionType(☃ -> new of("argument.time.invalid_tick_count", new Object[] { ☃ }));
/*    */   }
/* 27 */   private static final Object2IntMap<String> d = (Object2IntMap<String>)new Object2IntOpenHashMap();
/*    */   
/*    */   static {
/* 30 */     d.put("d", 24000);
/* 31 */     d.put("s", 20);
/* 32 */     d.put("t", 1);
/* 33 */     d.put("", 1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ed a() {
/* 40 */     return new ed();
/*    */   }
/*    */ 
/*    */   
/*    */   public Integer a(StringReader ☃) throws CommandSyntaxException {
/* 45 */     float f = ☃.readFloat();
/* 46 */     String str = ☃.readUnquotedString();
/* 47 */     int i = d.getOrDefault(str, 0);
/* 48 */     if (i == 0) {
/* 49 */       throw b.create();
/*    */     }
/*    */     
/* 52 */     int j = Math.round(f * i);
/* 53 */     if (j < 0) {
/* 54 */       throw c.create(Integer.valueOf(j));
/*    */     }
/*    */     
/* 57 */     return Integer.valueOf(j);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 62 */     StringReader stringReader = new StringReader(suggestionsBuilder.getRemaining());
/*    */     try {
/* 64 */       stringReader.readFloat();
/* 65 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 66 */       return suggestionsBuilder.buildFuture();
/*    */     } 
/*    */     
/* 69 */     return dd.b((Iterable<String>)d.keySet(), suggestionsBuilder.createOffset(suggestionsBuilder.getStart() + stringReader.getCursor()));
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 74 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */