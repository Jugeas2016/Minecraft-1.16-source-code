/*    */ import com.mojang.authlib.GameProfile;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Collection;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wj
/*    */ {
/* 27 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.ban.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 30 */     ☃.register(
/* 31 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("ban")
/* 32 */         .requires(☃ -> ☃.c(3)))
/* 33 */         .then((
/* 34 */           (RequiredArgumentBuilder)dc.<T>a("targets", dm.a())
/* 35 */           .executes(☃ -> a((db)☃.getSource(), dm.a(☃, "targets"), null)))
/* 36 */           .then(
/* 37 */             dc.<T>a("reason", dp.a())
/* 38 */             .executes(☃ -> a((db)☃.getSource(), dm.a(☃, "targets"), dp.a(☃, "reason"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<GameProfile> collection, @Nullable nr nr1) throws CommandSyntaxException {
/* 45 */     acz acz = ☃.j().ae().f();
/* 46 */     int i = 0;
/*    */     
/* 48 */     for (GameProfile gameProfile : collection) {
/* 49 */       if (!acz.a(gameProfile)) {
/* 50 */         ada ada = new ada(gameProfile, null, ☃.c(), null, (nr1 == null) ? null : nr1.getString());
/* 51 */         acz.a(ada);
/* 52 */         i++;
/* 53 */         ☃.a(new of("commands.ban.success", new Object[] { ns.a(gameProfile), ada.d() }), true);
/*    */         
/* 55 */         aah aah = ☃.j().ae().a(gameProfile.getId());
/* 56 */         if (aah != null) {
/* 57 */           aah.b.b(new of("multiplayer.disconnect.banned"));
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 62 */     if (i == 0) {
/* 63 */       throw a.create();
/*    */     }
/*    */     
/* 66 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */