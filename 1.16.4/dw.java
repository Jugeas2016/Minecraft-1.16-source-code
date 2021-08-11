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
/*    */ 
/*    */ public class dw
/*    */   implements ArgumentType<hf>
/*    */ {
/*    */   public static final DynamicCommandExceptionType a;
/* 23 */   private static final Collection<String> b = Arrays.asList(new String[] { "foo", "foo:bar", "particle with options" }); static {
/* 24 */     a = new DynamicCommandExceptionType(☃ -> new of("particle.notFound", new Object[] { ☃ }));
/*    */   }
/*    */   public static dw a() {
/* 27 */     return new dw();
/*    */   }
/*    */   
/*    */   public static hf a(CommandContext<db> ☃, String str) {
/* 31 */     return (hf)☃.getArgument(str, hf.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public hf a(StringReader ☃) throws CommandSyntaxException {
/* 36 */     return b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 41 */     return b;
/*    */   }
/*    */   
/*    */   public static hf b(StringReader ☃) throws CommandSyntaxException {
/* 45 */     vk vk = vk.a(☃);
/* 46 */     hg<?> hg = (hg)gm.V.b(vk).orElseThrow(() -> a.create(☃));
/* 47 */     return (hf)a(☃, hg);
/*    */   }
/*    */   
/*    */   private static <T extends hf> T a(StringReader ☃, hg<T> hg1) throws CommandSyntaxException {
/* 51 */     return hg1.d().b(hg1, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 56 */     return dd.a(gm.V.c(), suggestionsBuilder);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */