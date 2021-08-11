/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.UUID;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ee
/*    */   implements ArgumentType<UUID>
/*    */ {
/* 18 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.uuid.invalid"));
/*    */   
/* 20 */   private static final Collection<String> b = Arrays.asList(new String[] { "dd12be42-52a9-4a91-a8a1-11c01849e498" });
/*    */   
/* 22 */   private static final Pattern c = Pattern.compile("^([-A-Fa-f0-9]+)");
/*    */   
/*    */   public static UUID a(CommandContext<db> ☃, String str) {
/* 25 */     return (UUID)☃.getArgument(str, UUID.class);
/*    */   }
/*    */   
/*    */   public static ee a() {
/* 29 */     return new ee();
/*    */   }
/*    */ 
/*    */   
/*    */   public UUID a(StringReader ☃) throws CommandSyntaxException {
/* 34 */     String str = ☃.getRemaining();
/* 35 */     Matcher matcher = c.matcher(str);
/* 36 */     if (matcher.find()) {
/* 37 */       String str1 = matcher.group(1);
/*    */       try {
/* 39 */         UUID uUID = UUID.fromString(str1);
/* 40 */         ☃.setCursor(☃.getCursor() + str1.length());
/* 41 */         return uUID;
/* 42 */       } catch (IllegalArgumentException illegalArgumentException) {}
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 47 */     throw a.create();
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 52 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */