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
/*    */ public class dt
/*    */   implements ArgumentType<String>
/*    */ {
/*    */   private static final DynamicCommandExceptionType c;
/*    */   private static final DynamicCommandExceptionType d;
/*    */   public static final DynamicCommandExceptionType a;
/* 21 */   private static final Collection<String> b = Arrays.asList(new String[] { "foo", "*", "012" }); static {
/* 22 */     c = new DynamicCommandExceptionType(☃ -> new of("arguments.objective.notFound", new Object[] { ☃ }));
/* 23 */     d = new DynamicCommandExceptionType(☃ -> new of("arguments.objective.readonly", new Object[] { ☃ }));
/* 24 */     a = new DynamicCommandExceptionType(☃ -> new of("commands.scoreboard.objectives.add.longName", new Object[] { ☃ }));
/*    */   }
/*    */   public static dt a() {
/* 27 */     return new dt();
/*    */   }
/*    */   
/*    */   public static ddk a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 31 */     String str1 = (String)☃.getArgument(str, String.class);
/* 32 */     ddn ddn = ((db)☃.getSource()).j().aH();
/* 33 */     ddk ddk = ddn.d(str1);
/* 34 */     if (ddk == null) {
/* 35 */       throw c.create(str1);
/*    */     }
/* 37 */     return ddk;
/*    */   }
/*    */   
/*    */   public static ddk b(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 41 */     ddk ddk = a(☃, str);
/* 42 */     if (ddk.c().d()) {
/* 43 */       throw d.create(ddk.b());
/*    */     }
/* 45 */     return ddk;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a(StringReader ☃) throws CommandSyntaxException {
/* 50 */     String str = ☃.readUnquotedString();
/* 51 */     if (str.length() > 16) {
/* 52 */       throw a.create(Integer.valueOf(16));
/*    */     }
/* 54 */     return str;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 60 */     if (☃.getSource() instanceof db)
/* 61 */       return dd.b(((db)☃.getSource()).j().aH().d(), suggestionsBuilder); 
/* 62 */     if (☃.getSource() instanceof dd) {
/* 63 */       dd dd = (dd)☃.getSource();
/* 64 */       return dd.a((CommandContext)☃, suggestionsBuilder);
/*    */     } 
/* 66 */     return Suggestions.empty();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 72 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */