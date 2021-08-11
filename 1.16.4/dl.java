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
/*    */ 
/*    */ 
/*    */ public class dl
/*    */   implements ArgumentType<vk>
/*    */ {
/* 18 */   private static final Collection<String> b = Arrays.asList(new String[] { "minecraft:pig", "cow" }); static {
/* 19 */     a = new DynamicCommandExceptionType(☃ -> new of("entity.notFound", new Object[] { ☃ }));
/*    */   }
/*    */   
/*    */   public static final DynamicCommandExceptionType a;
/*    */   
/*    */   public static dl a() {
/* 25 */     return new dl();
/*    */   }
/*    */   
/*    */   public static vk a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 29 */     return a((vk)☃.getArgument(str, vk.class));
/*    */   }
/*    */   
/*    */   private static vk a(vk ☃) throws CommandSyntaxException {
/* 33 */     gm.S.b(☃).filter(aqe::b).orElseThrow(() -> a.create(☃));
/* 34 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(StringReader ☃) throws CommandSyntaxException {
/* 39 */     return a(vk.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 44 */     return b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */