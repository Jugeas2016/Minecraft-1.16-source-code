/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
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
/*    */ 
/*    */ 
/*    */ public class xg
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 21 */     ☃.register(
/* 22 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("kick")
/* 23 */         .requires(☃ -> ☃.c(3)))
/* 24 */         .then((
/* 25 */           (RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/* 26 */           .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), new of("multiplayer.disconnect.kicked"))))
/* 27 */           .then(
/* 28 */             dc.<T>a("reason", dp.a())
/* 29 */             .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), dp.a(☃, "reason"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<aah> collection, nr nr1) {
/* 36 */     for (aah aah : collection) {
/* 37 */       aah.b.b(nr1);
/* 38 */       ☃.a(new of("commands.kick.success", new Object[] { aah.d(), nr1 }), true);
/*    */     } 
/*    */     
/* 41 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */