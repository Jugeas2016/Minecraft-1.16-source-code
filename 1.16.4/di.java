/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Collection;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.stream.Collectors;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class di
/*    */   implements ArgumentType<vk>
/*    */ {
/*    */   private static final Collection<String> a;
/*    */   private static final DynamicCommandExceptionType b;
/*    */   
/*    */   static {
/* 25 */     a = (Collection<String>)Stream.<vj>of(new vj[] { brx.g, brx.h }).map(☃ -> ☃.a().toString()).collect(Collectors.toList());
/*    */     
/* 27 */     b = new DynamicCommandExceptionType(☃ -> new of("argument.dimension.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public vk a(StringReader ☃) throws CommandSyntaxException {
/* 31 */     return vk.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 36 */     if (☃.getSource() instanceof dd) {
/* 37 */       return dd.a(((dd)☃.getSource()).p().stream().map(vj::a), suggestionsBuilder);
/*    */     }
/* 39 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 44 */     return a;
/*    */   }
/*    */   
/*    */   public static di a() {
/* 48 */     return new di();
/*    */   }
/*    */   
/*    */   public static aag a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 52 */     vk vk = (vk)☃.getArgument(str, vk.class);
/* 53 */     vj<brx> vj = vj.a(gm.L, vk);
/* 54 */     aag aag = ((db)☃.getSource()).j().a(vj);
/* 55 */     if (aag == null) {
/* 56 */       throw b.create(vk);
/*    */     }
/* 58 */     return aag;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */