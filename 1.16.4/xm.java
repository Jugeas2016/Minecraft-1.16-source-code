/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import com.mojang.brigadier.tree.LiteralCommandNode;
/*    */ import java.util.Collection;
/*    */ import java.util.UUID;
/*    */ import java.util.function.Consumer;
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
/*    */ public class xm
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 26 */     LiteralCommandNode<db> literalCommandNode = ☃.register(
/* 27 */         (LiteralArgumentBuilder)dc.a("msg")
/* 28 */         .then(
/* 29 */           dc.<T>a("targets", dk.d())
/* 30 */           .then(
/* 31 */             dc.<T>a("message", dp.a())
/* 32 */             .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), dp.a(☃, "message"))))));
/*    */ 
/*    */ 
/*    */     
/* 36 */     ☃.register((LiteralArgumentBuilder)dc.a("tell").redirect((CommandNode)literalCommandNode));
/* 37 */     ☃.register((LiteralArgumentBuilder)dc.a("w").redirect((CommandNode)literalCommandNode));
/*    */   }
/*    */   private static int a(db ☃, Collection<aah> collection, nr nr1) {
/*    */     Consumer<nr> consumer;
/* 41 */     UUID uUID = (☃.f() == null) ? x.b : ☃.f().bS();
/*    */ 
/*    */     
/* 44 */     aqa aqa = ☃.f();
/* 45 */     if (aqa instanceof aah) {
/* 46 */       aah aah = (aah)aqa;
/* 47 */       consumer = (nr2 -> ☃.a((new of("commands.message.display.outgoing", new Object[] { nr2, nr1 })).a(new k[] { k.h, k.u }), ☃.bS()));
/*    */     } else {
/* 49 */       consumer = (nr2 -> ☃.a((new of("commands.message.display.outgoing", new Object[] { nr2, nr1 })).a(new k[] { k.h, k.u }), false));
/*    */     } 
/*    */     
/* 52 */     for (aah aah : collection) {
/* 53 */       consumer.accept(aah.d());
/* 54 */       aah.a((new of("commands.message.display.incoming", new Object[] { ☃.b(), nr1 })).a(new k[] { k.h, k.u }), uUID);
/*    */     } 
/*    */     
/* 57 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */