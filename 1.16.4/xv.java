/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Collection;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class xv
/*    */ {
/* 19 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   public static void a(Collection<String> ☃, db db1) {
/* 22 */     db1.j().a(☃).exceptionally(throwable -> {
/*    */           a.warn("Failed to execute reload", throwable);
/*    */           ☃.a(new of("commands.reload.failure"));
/*    */           return null;
/*    */         });
/*    */   }
/*    */   
/*    */   private static Collection<String> a(abw ☃, cyn cyn1, Collection<String> collection) {
/* 30 */     ☃.a();
/* 31 */     Collection<String> collection1 = Lists.newArrayList(collection);
/* 32 */     Collection<String> collection2 = cyn1.D().b();
/*    */     
/* 34 */     for (String str : ☃.b()) {
/* 35 */       if (!collection2.contains(str) && !collection1.contains(str)) {
/* 36 */         collection1.add(str);
/*    */       }
/*    */     } 
/* 39 */     return collection1;
/*    */   }
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 43 */     ☃.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("reload")
/* 44 */         .requires(☃ -> ☃.c(2)))
/* 45 */         .executes(☃ -> {
/*    */             db db = (db)☃.getSource();
/*    */             MinecraftServer minecraftServer = db.j();
/*    */             abw abw = minecraftServer.aC();
/*    */             cyn cyn = minecraftServer.aX();
/*    */             Collection<String> collection1 = abw.d();
/*    */             Collection<String> collection2 = a(abw, cyn, collection1);
/*    */             db.a(new of("commands.reload.success"), true);
/*    */             a(collection2, db);
/*    */             return 0;
/*    */           }));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */