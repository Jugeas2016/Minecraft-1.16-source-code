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
/*    */ 
/*    */ public class dn
/*    */   implements ArgumentType<bps>
/*    */ {
/*    */   public static final DynamicCommandExceptionType a;
/* 22 */   private static final Collection<String> b = Arrays.asList(new String[] { "unbreaking", "silk_touch" });
/*    */   static {
/* 24 */     a = new DynamicCommandExceptionType(☃ -> new of("enchantment.unknown", new Object[] { ☃ }));
/*    */   }
/*    */   public static dn a() {
/* 27 */     return new dn();
/*    */   }
/*    */   
/*    */   public static bps a(CommandContext<db> ☃, String str) {
/* 31 */     return (bps)☃.getArgument(str, bps.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public bps a(StringReader ☃) throws CommandSyntaxException {
/* 36 */     vk vk = vk.a(☃);
/* 37 */     return (bps)gm.R.b(vk).orElseThrow(() -> a.create(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 42 */     return dd.a(gm.R.c(), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 47 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */