/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */   implements dx<bz.d>
/*    */ {
/* 15 */   private static final Collection<String> a = Arrays.asList(new String[] { "0..5", "0", "-5", "-100..", "..100" });
/*    */   
/*    */   public static bz.d a(CommandContext<db> ☃, String str) {
/* 18 */     return (bz.d)☃.getArgument(str, bz.d.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public bz.d a(StringReader ☃) throws CommandSyntaxException {
/* 23 */     return bz.d.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 28 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dx$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */