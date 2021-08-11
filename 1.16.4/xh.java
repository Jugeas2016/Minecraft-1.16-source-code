/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */ public class xh
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 19 */     ☃.register(
/* 20 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("kill")
/* 21 */         .requires(☃ -> ☃.c(2)))
/* 22 */         .executes(☃ -> a((db)☃.getSource(), (Collection<? extends aqa>)ImmutableList.of(((db)☃.getSource()).g()))))
/* 23 */         .then(
/* 24 */           dc.<T>a("targets", dk.b())
/* 25 */           .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets")))));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<? extends aqa> collection) {
/* 31 */     for (aqa aqa : collection) {
/* 32 */       aqa.aa();
/*    */     }
/*    */     
/* 35 */     if (collection.size() == 1) {
/* 36 */       ☃.a(new of("commands.kill.success.single", new Object[] { ((aqa)collection.iterator().next()).d() }), true);
/*    */     } else {
/* 38 */       ☃.a(new of("commands.kill.success.multiple", new Object[] { Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 41 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */