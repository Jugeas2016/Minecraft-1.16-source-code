/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ public interface dx<T extends bz<?>>
/*    */   extends ArgumentType<T>
/*    */ {
/*    */   public static class b
/*    */     implements dx<bz.d>
/*    */   {
/* 15 */     private static final Collection<String> a = Arrays.asList(new String[] { "0..5", "0", "-5", "-100..", "..100" });
/*    */     
/*    */     public static bz.d a(CommandContext<db> ☃, String str) {
/* 18 */       return (bz.d)☃.getArgument(str, bz.d.class);
/*    */     }
/*    */ 
/*    */     
/*    */     public bz.d a(StringReader ☃) throws CommandSyntaxException {
/* 23 */       return bz.d.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public Collection<String> getExamples() {
/* 28 */       return a;
/*    */     }
/*    */   }
/*    */   
/*    */   public static class a implements dx<bz.c> {
/* 33 */     private static final Collection<String> a = Arrays.asList(new String[] { "0..5.2", "0", "-5.4", "-100.76..", "..100" });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public bz.c a(StringReader ☃) throws CommandSyntaxException {
/* 41 */       return bz.c.a(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public Collection<String> getExamples() {
/* 46 */       return a;
/*    */     }
/*    */   }
/*    */   
/*    */   static b a() {
/* 51 */     return new b();
/*    */   }
/*    */   
/*    */   static a b() {
/* 55 */     return new a();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */