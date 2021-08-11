/*    */ import com.google.gson.JsonParseException;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dg
/*    */   implements ArgumentType<nr>
/*    */ {
/* 17 */   private static final Collection<String> b = Arrays.asList(new String[] { "\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]" }); static {
/* 18 */     a = new DynamicCommandExceptionType(☃ -> new of("argument.component.invalid", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static nr a(CommandContext<db> ☃, String str) {
/* 24 */     return (nr)☃.getArgument(str, nr.class);
/*    */   }
/*    */   
/*    */   public static dg a() {
/* 28 */     return new dg();
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(StringReader ☃) throws CommandSyntaxException {
/*    */     try {
/* 34 */       nr nr = nr.a.a(☃);
/* 35 */       if (nr == null) {
/* 36 */         throw a.createWithContext(☃, "empty");
/*    */       }
/* 38 */       return nr;
/* 39 */     } catch (JsonParseException jsonParseException) {
/* 40 */       String str = (jsonParseException.getCause() != null) ? jsonParseException.getCause().getMessage() : jsonParseException.getMessage();
/* 41 */       throw a.createWithContext(☃, str);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 47 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */