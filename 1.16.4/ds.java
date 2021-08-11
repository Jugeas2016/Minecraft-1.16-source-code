/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ds
/*    */   implements ArgumentType<mt>
/*    */ {
/* 14 */   private static final Collection<String> a = Arrays.asList(new String[] { "0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]" });
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ds a() {
/* 20 */     return new ds();
/*    */   }
/*    */   
/*    */   public static <S> mt a(CommandContext<S> ☃, String str) {
/* 24 */     return (mt)☃.getArgument(str, mt.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public mt a(StringReader ☃) throws CommandSyntaxException {
/* 29 */     return (new mu(☃)).d();
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 34 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ds.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */