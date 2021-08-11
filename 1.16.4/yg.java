/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
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
/*    */ public class yg
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 26 */     ☃.register(
/* 27 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("spawnpoint")
/* 28 */         .requires(☃ -> ☃.c(2)))
/* 29 */         .executes(☃ -> a((db)☃.getSource(), Collections.singleton(((db)☃.getSource()).h()), new fx(((db)☃.getSource()).d()), 0.0F)))
/* 30 */         .then((
/* 31 */           (RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/* 32 */           .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), new fx(((db)☃.getSource()).d()), 0.0F)))
/* 33 */           .then((
/* 34 */             (RequiredArgumentBuilder)dc.<T>a("pos", ek.a())
/* 35 */             .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), ek.b(☃, "pos"), 0.0F)))
/* 36 */             .then(
/* 37 */               dc.<T>a("angle", de.a())
/* 38 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), ek.b(☃, "pos"), de.a(☃, "angle")))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<aah> collection, fx fx1, float f) {
/* 46 */     vj<brx> vj = ☃.e().Y();
/* 47 */     for (aah aah : collection) {
/* 48 */       aah.a(vj, fx1, f, true, false);
/*    */     }
/*    */     
/* 51 */     String str = vj.a().toString();
/* 52 */     if (collection.size() == 1) {
/* 53 */       ☃.a(new of("commands.spawnpoint.success.single", new Object[] { Integer.valueOf(fx1.u()), Integer.valueOf(fx1.v()), Integer.valueOf(fx1.w()), Float.valueOf(f), str, ((aah)collection.iterator().next()).d() }), true);
/*    */     } else {
/* 55 */       ☃.a(new of("commands.spawnpoint.success.multiple", new Object[] { Integer.valueOf(fx1.u()), Integer.valueOf(fx1.v()), Integer.valueOf(fx1.w()), Float.valueOf(f), str, Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 58 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */