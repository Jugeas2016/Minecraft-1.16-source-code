/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eo
/*    */   implements ArgumentType<em>
/*    */ {
/* 15 */   private static final Collection<String> b = Arrays.asList(new String[] { "0 0", "~ ~", "~-5 ~5" });
/* 16 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.rotation.incomplete"));
/*    */   
/*    */   public static eo a() {
/* 19 */     return new eo();
/*    */   }
/*    */   
/*    */   public static em a(CommandContext<db> ☃, String str) {
/* 23 */     return (em)☃.getArgument(str, em.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public em a(StringReader ☃) throws CommandSyntaxException {
/* 28 */     int i = ☃.getCursor();
/* 29 */     if (!☃.canRead()) {
/* 30 */       throw a.createWithContext(☃);
/*    */     }
/* 32 */     es es1 = es.a(☃, false);
/* 33 */     if (!☃.canRead() || ☃.peek() != ' ') {
/* 34 */       ☃.setCursor(i);
/* 35 */       throw a.createWithContext(☃);
/*    */     } 
/* 37 */     ☃.skip();
/* 38 */     es es2 = es.a(☃, false);
/* 39 */     return new et(es2, es1, new es(true, 0.0D));
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 44 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */