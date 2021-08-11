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
/*    */ public class dh
/*    */   implements ArgumentType<md>
/*    */ {
/* 14 */   private static final Collection<String> a = Arrays.asList(new String[] { "{}", "{foo=bar}" });
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static dh a() {
/* 20 */     return new dh();
/*    */   }
/*    */   
/*    */   public static <S> md a(CommandContext<S> ☃, String str) {
/* 24 */     return (md)☃.getArgument(str, md.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public md a(StringReader ☃) throws CommandSyntaxException {
/* 29 */     return (new mu(☃)).f();
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 34 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */