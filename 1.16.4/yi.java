/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class yi
/*    */ {
/*    */   private static final DynamicCommandExceptionType b;
/* 24 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.spectate.self")); static {
/* 25 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.spectate.not_spectator", new Object[] { ☃ }));
/*    */   }
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 28 */     ☃.register(
/* 29 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("spectate")
/* 30 */         .requires(☃ -> ☃.c(2)))
/* 31 */         .executes(☃ -> a((db)☃.getSource(), null, ((db)☃.getSource()).h())))
/* 32 */         .then((
/* 33 */           (RequiredArgumentBuilder)dc.<T>a("target", dk.a())
/* 34 */           .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), ((db)☃.getSource()).h())))
/* 35 */           .then(
/* 36 */             dc.<T>a("player", dk.c())
/* 37 */             .executes(☃ -> a((db)☃.getSource(), dk.a(☃, "target"), dk.e(☃, "player"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, @Nullable aqa aqa1, aah aah1) throws CommandSyntaxException {
/* 44 */     if (aah1 == aqa1)
/* 45 */       throw a.create(); 
/* 46 */     if (aah1.d.b() != bru.e) {
/* 47 */       throw b.create(aah1.d());
/*    */     }
/*    */     
/* 50 */     aah1.e(aqa1);
/* 51 */     if (aqa1 != null) {
/* 52 */       ☃.a(new of("commands.spectate.success.started", new Object[] { aqa1.d() }), false);
/*    */     } else {
/* 54 */       ☃.a(new of("commands.spectate.success.stopped"), false);
/*    */     } 
/* 56 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */