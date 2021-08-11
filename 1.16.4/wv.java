/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Optional;
/*    */ import java.util.concurrent.Executor;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wv
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 22 */     ☃.register(
/* 23 */         (LiteralArgumentBuilder)dc.a("me")
/* 24 */         .then(
/* 25 */           dc.<T>a("action", (ArgumentType<T>)StringArgumentType.greedyString()).executes(☃ -> {
/*    */               String str = StringArgumentType.getString(☃, "action");
/*    */               aqa aqa = ((db)☃.getSource()).f();
/*    */               MinecraftServer minecraftServer = ((db)☃.getSource()).j();
/*    */               if (aqa != null) {
/*    */                 if (aqa instanceof aah) {
/*    */                   abc abc = ((aah)aqa).Q();
/*    */                   if (abc != null) {
/*    */                     abc.a(str).thenAcceptAsync((), (Executor)minecraftServer);
/*    */                     return 1;
/*    */                   } 
/*    */                 } 
/*    */                 minecraftServer.ae().a(a(☃, str), no.a, aqa.bS());
/*    */               } else {
/*    */                 minecraftServer.ae().a(a(☃, str), no.b, x.b);
/*    */               } 
/*    */               return 1;
/*    */             })));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static nr a(CommandContext<db> ☃, String str) {
/* 50 */     return new of("chat.type.emote", new Object[] { ((db)☃.getSource()).b(), str });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */