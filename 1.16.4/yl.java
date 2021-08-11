/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
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
/*    */ 
/*    */ 
/*    */ public class yl
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 29 */     RequiredArgumentBuilder<db, fc> requiredArgumentBuilder = (RequiredArgumentBuilder<db, fc>)((RequiredArgumentBuilder)dc.<T>a("targets", dk.d()).executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), null, null))).then(
/* 30 */         dc.a("*")
/* 31 */         .then(
/* 32 */           dc.<T>a("sound", dy.a())
/* 33 */           .suggests(fm.c)
/* 34 */           .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), null, dy.e(☃, "sound")))));
/*    */ 
/*    */ 
/*    */     
/* 38 */     for (adr adr : adr.values()) {
/* 39 */       requiredArgumentBuilder.then((
/* 40 */           (LiteralArgumentBuilder)dc.a(adr.a())
/* 41 */           .executes(commandContext -> a((db)commandContext.getSource(), dk.f(commandContext, "targets"), ☃, null)))
/* 42 */           .then(
/* 43 */             dc.<T>a("sound", dy.a())
/* 44 */             .suggests(fm.c)
/* 45 */             .executes(commandContext -> a((db)commandContext.getSource(), dk.f(commandContext, "targets"), ☃, dy.e(commandContext, "sound")))));
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 50 */     ☃.register(
/* 51 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("stopsound")
/* 52 */         .requires(☃ -> ☃.c(2)))
/* 53 */         .then((ArgumentBuilder)requiredArgumentBuilder));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<aah> collection, @Nullable adr adr1, @Nullable vk vk1) {
/* 60 */     ro ro = new ro(vk1, adr1);
/* 61 */     for (aah aah : collection) {
/* 62 */       aah.b.a(ro);
/*    */     }
/*    */     
/* 65 */     if (adr1 != null) {
/* 66 */       if (vk1 != null) {
/* 67 */         ☃.a(new of("commands.stopsound.success.source.sound", new Object[] { vk1, adr1.a() }), true);
/*    */       } else {
/* 69 */         ☃.a(new of("commands.stopsound.success.source.any", new Object[] { adr1.a() }), true);
/*    */       }
/*    */     
/* 72 */     } else if (vk1 != null) {
/* 73 */       ☃.a(new of("commands.stopsound.success.sourceless.sound", new Object[] { vk1 }), true);
/*    */     } else {
/* 75 */       ☃.a(new of("commands.stopsound.success.sourceless.any"), true);
/*    */     } 
/*    */ 
/*    */     
/* 79 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */