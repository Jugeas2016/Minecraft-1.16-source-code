/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xy
/*    */ {
/* 13 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.save.alreadyOff"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 16 */     ☃.register(
/* 17 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("save-off")
/* 18 */         .requires(☃ -> ☃.c(4)))
/* 19 */         .executes(☃ -> {
/*    */             db db = (db)☃.getSource();
/*    */             boolean bool = false;
/*    */             for (aag aag : db.j().G()) {
/*    */               if (aag != null && !aag.c) {
/*    */                 aag.c = true;
/*    */                 bool = true;
/*    */               } 
/*    */             } 
/*    */             if (!bool)
/*    */               throw a.create(); 
/*    */             db.a(new of("commands.save.disabled"), true);
/*    */             return 1;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */