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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dy
/*    */   implements ArgumentType<vk>
/*    */ {
/*    */   private static final DynamicCommandExceptionType b;
/*    */   private static final DynamicCommandExceptionType c;
/* 23 */   private static final Collection<String> a = Arrays.asList(new String[] { "foo", "foo:bar", "012" }); static {
/* 24 */     b = new DynamicCommandExceptionType(☃ -> new of("advancement.advancementNotFound", new Object[] { ☃ }));
/* 25 */     c = new DynamicCommandExceptionType(☃ -> new of("recipe.notFound", new Object[] { ☃ }));
/* 26 */     d = new DynamicCommandExceptionType(☃ -> new of("predicate.unknown", new Object[] { ☃ }));
/* 27 */     e = new DynamicCommandExceptionType(☃ -> new of("attribute.unknown", new Object[] { ☃ }));
/*    */   }
/*    */   private static final DynamicCommandExceptionType d;
/*    */   private static final DynamicCommandExceptionType e;
/*    */   
/*    */   public static dy a() {
/* 33 */     return new dy();
/*    */   }
/*    */   
/*    */   public static y a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 37 */     vk vk = (vk)☃.getArgument(str, vk.class);
/* 38 */     y y = ((db)☃.getSource()).j().aA().a(vk);
/* 39 */     if (y == null) {
/* 40 */       throw b.create(vk);
/*    */     }
/* 42 */     return y;
/*    */   }
/*    */   
/*    */   public static boq<?> b(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 46 */     bor bor = ((db)☃.getSource()).j().aF();
/* 47 */     vk vk = (vk)☃.getArgument(str, vk.class);
/*    */     
/* 49 */     return bor.a(vk).<Throwable>orElseThrow(() -> c.create(☃));
/*    */   }
/*    */   
/*    */   public static dbo c(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 53 */     vk vk = (vk)☃.getArgument(str, vk.class);
/*    */     
/* 55 */     cza cza = ((db)☃.getSource()).j().aK();
/* 56 */     dbo dbo = cza.a(vk);
/* 57 */     if (dbo == null) {
/* 58 */       throw d.create(vk);
/*    */     }
/* 60 */     return dbo;
/*    */   }
/*    */   
/*    */   public static arg d(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 64 */     vk vk = (vk)☃.getArgument(str, vk.class);
/* 65 */     return (arg)gm.af.b(vk).orElseThrow(() -> e.create(☃));
/*    */   }
/*    */   
/*    */   public static vk e(CommandContext<db> ☃, String str) {
/* 69 */     return (vk)☃.getArgument(str, vk.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(StringReader ☃) throws CommandSyntaxException {
/* 74 */     return vk.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 79 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */