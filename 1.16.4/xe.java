/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.Collection;
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
/*    */ public class xe
/*    */ {
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 28 */     ☃.register(
/* 29 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("give")
/* 30 */         .requires(☃ -> ☃.c(2)))
/* 31 */         .then(
/* 32 */           dc.<T>a("targets", dk.d())
/* 33 */           .then((
/* 34 */             (RequiredArgumentBuilder)dc.<T>a("item", ew.a())
/* 35 */             .executes(☃ -> a((db)☃.getSource(), ew.a(☃, "item"), dk.f((CommandContext)☃, "targets"), 1)))
/* 36 */             .then(
/* 37 */               dc.<T>a("count", (ArgumentType<T>)IntegerArgumentType.integer(1))
/* 38 */               .executes(☃ -> a((db)☃.getSource(), ew.a(☃, "item"), dk.f((CommandContext)☃, "targets"), IntegerArgumentType.getInteger(☃, "count")))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, ex ex1, Collection<aah> collection, int i) throws CommandSyntaxException {
/* 46 */     for (aah aah : collection) {
/* 47 */       int j = i;
/* 48 */       while (j > 0) {
/* 49 */         int k = Math.min(ex1.a().i(), j);
/* 50 */         j -= k;
/*    */         
/* 52 */         bmb bmb = ex1.a(k, false);
/* 53 */         boolean bool = aah.bm.e(bmb);
/*    */         
/* 55 */         if (!bool || !bmb.a()) {
/* 56 */           bcv bcv1 = aah.a(bmb, false);
/* 57 */           if (bcv1 != null) {
/* 58 */             bcv1.n();
/* 59 */             bcv1.b(aah.bS());
/*    */           } 
/*    */           continue;
/*    */         } 
/* 63 */         bmb.e(1);
/* 64 */         bcv bcv = aah.a(bmb, false);
/* 65 */         if (bcv != null) {
/* 66 */           bcv.s();
/*    */         }
/* 68 */         aah.l.a((bfw)null, aah.cD(), aah.cE(), aah.cH(), adq.gL, adr.h, 0.2F, ((aah.cY().nextFloat() - aah.cY().nextFloat()) * 0.7F + 1.0F) * 2.0F);
/* 69 */         aah.bo.c();
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 74 */     if (collection.size() == 1) {
/* 75 */       ☃.a(new of("commands.give.success.single", new Object[] { Integer.valueOf(i), ex1.a(i, false).C(), ((aah)collection.iterator().next()).d() }), true);
/*    */     } else {
/* 77 */       ☃.a(new of("commands.give.success.single", new Object[] { Integer.valueOf(i), ex1.a(i, false).C(), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 80 */     return collection.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */