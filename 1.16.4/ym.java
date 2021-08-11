/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ym
/*    */ {
/* 31 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.summon.failed"));
/* 32 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.summon.failed.uuid"));
/* 33 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.summon.invalidPosition"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 36 */     ☃.register(
/* 37 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("summon")
/* 38 */         .requires(☃ -> ☃.c(2)))
/* 39 */         .then((
/* 40 */           (RequiredArgumentBuilder)dc.<T>a("entity", dl.a())
/* 41 */           .suggests(fm.e)
/* 42 */           .executes(☃ -> a((db)☃.getSource(), dl.a(☃, "entity"), ((db)☃.getSource()).d(), new md(), true)))
/* 43 */           .then((
/* 44 */             (RequiredArgumentBuilder)dc.<T>a("pos", er.a())
/* 45 */             .executes(☃ -> a((db)☃.getSource(), dl.a(☃, "entity"), er.a(☃, "pos"), new md(), true)))
/* 46 */             .then(
/* 47 */               dc.<T>a("nbt", dh.a())
/* 48 */               .executes(☃ -> a((db)☃.getSource(), dl.a(☃, "entity"), er.a(☃, "pos"), dh.a(☃, "nbt"), false))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, vk vk1, dcn dcn1, md md1, boolean bool) throws CommandSyntaxException {
/* 56 */     fx fx = new fx(dcn1);
/* 57 */     if (!brx.l(fx)) {
/* 58 */       throw c.create();
/*    */     }
/*    */     
/* 61 */     md md2 = md1.g();
/* 62 */     md2.a("id", vk1.toString());
/*    */     
/* 64 */     aag aag = ☃.e();
/* 65 */     aqa aqa = aqe.a(md2, aag, aqa1 -> {
/*    */           aqa1.b(☃.b, ☃.c, ☃.d, aqa1.p, aqa1.q);
/*    */           return aqa1;
/*    */         });
/* 69 */     if (aqa == null) {
/* 70 */       throw a.create();
/*    */     }
/*    */     
/* 73 */     if (bool && aqa instanceof aqn) {
/* 74 */       ((aqn)aqa).a(☃.e(), ☃.e().d(aqa.cB()), aqp.n, (arc)null, (md)null);
/*    */     }
/*    */     
/* 77 */     if (!aag.g(aqa)) {
/* 78 */       throw b.create();
/*    */     }
/*    */     
/* 81 */     ☃.a(new of("commands.summon.success", new Object[] { aqa.d() }), true);
/* 82 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ym.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */