/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class wl
/*    */ {
/*    */   private static final DynamicCommandExceptionType a;
/*    */   private static final DynamicCommandExceptionType b;
/*    */   
/*    */   static {
/* 26 */     a = new DynamicCommandExceptionType(☃ -> new of("clear.failed.single", new Object[] { ☃ }));
/* 27 */     b = new DynamicCommandExceptionType(☃ -> new of("clear.failed.multiple", new Object[] { ☃ }));
/*    */   }
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 30 */     ☃.register(
/* 31 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("clear")
/* 32 */         .requires(☃ -> ☃.c(2)))
/* 33 */         .executes(☃ -> a((db)☃.getSource(), Collections.singleton(((db)☃.getSource()).h()), (), -1)))
/* 34 */         .then((
/* 35 */           (RequiredArgumentBuilder)dc.<T>a("targets", dk.d())
/* 36 */           .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), (), -1)))
/* 37 */           .then((
/* 38 */             (RequiredArgumentBuilder)dc.<T>a("item", ez.a())
/* 39 */             .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), ez.a(☃, "item"), -1)))
/* 40 */             .then(
/* 41 */               dc.<T>a("maxCount", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 42 */               .executes(☃ -> a((db)☃.getSource(), dk.f(☃, "targets"), ez.a(☃, "item"), IntegerArgumentType.getInteger(☃, "maxCount")))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<aah> collection, Predicate<bmb> predicate, int i) throws CommandSyntaxException {
/* 50 */     int j = 0;
/*    */     
/* 52 */     for (aah aah : collection) {
/* 53 */       j += aah.bm.a(predicate, i, aah.bo.j());
/* 54 */       aah.bp.c();
/*    */ 
/*    */       
/* 57 */       aah.bo.a(aah.bm);
/*    */       
/* 59 */       aah.n();
/*    */     } 
/*    */     
/* 62 */     if (j == 0) {
/* 63 */       if (collection.size() == 1) {
/* 64 */         throw a.create(((aah)collection.iterator().next()).R());
/*    */       }
/* 66 */       throw b.create(Integer.valueOf(collection.size()));
/*    */     } 
/*    */ 
/*    */     
/* 70 */     if (i == 0) {
/* 71 */       if (collection.size() == 1) {
/* 72 */         ☃.a(new of("commands.clear.test.single", new Object[] { Integer.valueOf(j), ((aah)collection.iterator().next()).d() }), true);
/*    */       } else {
/* 74 */         ☃.a(new of("commands.clear.test.multiple", new Object[] { Integer.valueOf(j), Integer.valueOf(collection.size()) }), true);
/*    */       }
/*    */     
/* 77 */     } else if (collection.size() == 1) {
/* 78 */       ☃.a(new of("commands.clear.success.single", new Object[] { Integer.valueOf(j), ((aah)collection.iterator().next()).d() }), true);
/*    */     } else {
/* 80 */       ☃.a(new of("commands.clear.success.multiple", new Object[] { Integer.valueOf(j), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */ 
/*    */     
/* 84 */     return j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */