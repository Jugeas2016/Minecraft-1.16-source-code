/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xc
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 27 */     LiteralArgumentBuilder<db> literalArgumentBuilder = (LiteralArgumentBuilder<db>)dc.a("gamemode").requires(☃ -> ☃.c(2));
/*    */     
/* 29 */     for (bru bru : bru.values()) {
/* 30 */       if (bru != bru.a) {
/* 31 */         literalArgumentBuilder.then((
/* 32 */             (LiteralArgumentBuilder)dc.a(bru.b())
/* 33 */             .executes(commandContext -> a(commandContext, Collections.singleton(((db)commandContext.getSource()).h()), ☃)))
/* 34 */             .then(
/* 35 */               dc.<T>a("target", dk.d())
/* 36 */               .executes(commandContext -> a(commandContext, dk.f(commandContext, "target"), ☃))));
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 42 */     ☃.register(literalArgumentBuilder);
/*    */   }
/*    */   
/*    */   private static void a(db ☃, aah aah1, bru bru1) {
/* 46 */     nr nr = new of("gameMode." + bru1.b());
/* 47 */     if (☃.f() == aah1) {
/* 48 */       ☃.a(new of("commands.gamemode.success.self", new Object[] { nr }), true);
/*    */     } else {
/* 50 */       if (☃.e().V().b(brt.n)) {
/* 51 */         aah1.a(new of("gameMode.changed", new Object[] { nr }), x.b);
/*    */       }
/*    */       
/* 54 */       ☃.a(new of("commands.gamemode.success.other", new Object[] { aah1.d(), nr }), true);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static int a(CommandContext<db> ☃, Collection<aah> collection, bru bru1) {
/* 59 */     int i = 0;
/* 60 */     for (aah aah : collection) {
/* 61 */       if (aah.d.b() != bru1) {
/* 62 */         aah.a(bru1);
/* 63 */         a((db)☃.getSource(), aah, bru1);
/* 64 */         i++;
/*    */       } 
/*    */     } 
/* 67 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */