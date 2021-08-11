/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class yh
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 18 */     ☃.register(
/* 19 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("setworldspawn")
/* 20 */         .requires(☃ -> ☃.c(2)))
/* 21 */         .executes(☃ -> a((db)☃.getSource(), new fx(((db)☃.getSource()).d()), 0.0F)))
/* 22 */         .then((
/* 23 */           (RequiredArgumentBuilder)dc.<T>a("pos", ek.a())
/* 24 */           .executes(☃ -> a((db)☃.getSource(), ek.b(☃, "pos"), 0.0F)))
/* 25 */           .then(
/* 26 */             dc.<T>a("angle", de.a())
/* 27 */             .executes(☃ -> a((db)☃.getSource(), ek.b(☃, "pos"), de.a(☃, "angle"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, fx fx1, float f) {
/* 34 */     ☃.e().a(fx1, f);
/* 35 */     ☃.a(new of("commands.setworldspawn.success", new Object[] { Integer.valueOf(fx1.u()), Integer.valueOf(fx1.v()), Integer.valueOf(fx1.w()), Float.valueOf(f) }), true);
/* 36 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */