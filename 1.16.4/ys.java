/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
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
/*    */ public class ys
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 17 */     ☃.register(
/* 18 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("time")
/* 19 */         .requires(☃ -> ☃.c(2)))
/* 20 */         .then((
/* 21 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("set")
/* 22 */           .then(
/* 23 */             dc.a("day")
/* 24 */             .executes(☃ -> a((db)☃.getSource(), 1000))))
/* 25 */           .then(
/* 26 */             dc.a("noon")
/* 27 */             .executes(☃ -> a((db)☃.getSource(), 6000))))
/* 28 */           .then(
/* 29 */             dc.a("night")
/* 30 */             .executes(☃ -> a((db)☃.getSource(), 13000))))
/* 31 */           .then(
/* 32 */             dc.a("midnight")
/* 33 */             .executes(☃ -> a((db)☃.getSource(), 18000))))
/* 34 */           .then(
/* 35 */             dc.<T>a("time", ed.a())
/* 36 */             .executes(☃ -> a((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "time"))))))
/*    */ 
/*    */         
/* 39 */         .then(
/* 40 */           dc.a("add")
/* 41 */           .then(
/* 42 */             dc.<T>a("time", ed.a())
/* 43 */             .executes(☃ -> b((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "time"))))))
/*    */ 
/*    */         
/* 46 */         .then((
/* 47 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("query")
/* 48 */           .then(
/* 49 */             dc.a("daytime")
/* 50 */             .executes(☃ -> c((db)☃.getSource(), a(((db)☃.getSource()).e())))))
/*    */           
/* 52 */           .then(
/* 53 */             dc.a("gametime")
/* 54 */             .executes(☃ -> c((db)☃.getSource(), (int)(((db)☃.getSource()).e().T() % 2147483647L)))))
/*    */           
/* 56 */           .then(
/* 57 */             dc.a("day")
/* 58 */             .executes(☃ -> c((db)☃.getSource(), (int)(((db)☃.getSource()).e().U() / 24000L % 2147483647L))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(aag ☃) {
/* 65 */     return (int)(☃.U() % 24000L);
/*    */   }
/*    */   
/*    */   private static int c(db ☃, int i) {
/* 69 */     ☃.a(new of("commands.time.query", new Object[] { Integer.valueOf(i) }), false);
/* 70 */     return i;
/*    */   }
/*    */   
/*    */   public static int a(db ☃, int i) {
/* 74 */     for (aag aag : ☃.j().G()) {
/* 75 */       aag.a(i);
/*    */     }
/* 77 */     ☃.a(new of("commands.time.set", new Object[] { Integer.valueOf(i) }), true);
/* 78 */     return a(☃.e());
/*    */   }
/*    */   
/*    */   public static int b(db ☃, int i) {
/* 82 */     for (aag aag : ☃.j().G()) {
/* 83 */       aag.a(aag.U() + i);
/*    */     }
/* 85 */     int j = a(☃.e());
/* 86 */     ☃.a(new of("commands.time.set", new Object[] { Integer.valueOf(j) }), true);
/* 87 */     return j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */