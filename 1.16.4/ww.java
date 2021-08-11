/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ww
/*    */ {
/*    */   private static final DynamicCommandExceptionType a;
/*    */   private static final DynamicCommandExceptionType b;
/*    */   private static final DynamicCommandExceptionType c;
/*    */   private static final Dynamic2CommandExceptionType d;
/*    */   
/*    */   static {
/* 29 */     a = new DynamicCommandExceptionType(☃ -> new of("commands.enchant.failed.entity", new Object[] { ☃ }));
/* 30 */     b = new DynamicCommandExceptionType(☃ -> new of("commands.enchant.failed.itemless", new Object[] { ☃ }));
/* 31 */     c = new DynamicCommandExceptionType(☃ -> new of("commands.enchant.failed.incompatible", new Object[] { ☃ }));
/* 32 */     d = new Dynamic2CommandExceptionType((☃, object1) -> new of("commands.enchant.failed.level", new Object[] { ☃, object1 }));
/* 33 */   } private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new of("commands.enchant.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 36 */     ☃.register(
/* 37 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("enchant")
/* 38 */         .requires(☃ -> ☃.c(2)))
/* 39 */         .then(
/* 40 */           dc.<T>a("targets", dk.b())
/* 41 */           .then((
/* 42 */             (RequiredArgumentBuilder)dc.<T>a("enchantment", dn.a())
/* 43 */             .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), dn.a(☃, "enchantment"), 1)))
/* 44 */             .then(
/* 45 */               dc.<T>a("level", (ArgumentType<T>)IntegerArgumentType.integer(0))
/* 46 */               .executes(☃ -> a((db)☃.getSource(), dk.b(☃, "targets"), dn.a(☃, "enchantment"), IntegerArgumentType.getInteger(☃, "level")))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, Collection<? extends aqa> collection, bps bps1, int i) throws CommandSyntaxException {
/* 54 */     if (i > bps1.a()) {
/* 55 */       throw d.create(Integer.valueOf(i), Integer.valueOf(bps1.a()));
/*    */     }
/*    */     
/* 58 */     int j = 0;
/*    */     
/* 60 */     for (aqa aqa : collection) {
/* 61 */       if (aqa instanceof aqm) {
/* 62 */         aqm aqm = (aqm)aqa;
/*    */         
/* 64 */         bmb bmb = aqm.dD();
/* 65 */         if (!bmb.a()) {
/* 66 */           if (bps1.a(bmb) && bpu.a(bpu.a(bmb).keySet(), bps1)) {
/* 67 */             bmb.a(bps1, i);
/* 68 */             j++; continue;
/* 69 */           }  if (collection.size() == 1)
/* 70 */             throw c.create(bmb.b().h(bmb).getString());  continue;
/*    */         } 
/* 72 */         if (collection.size() == 1)
/* 73 */           throw b.create(aqm.R().getString());  continue;
/*    */       } 
/* 75 */       if (collection.size() == 1) {
/* 76 */         throw a.create(aqa.R().getString());
/*    */       }
/*    */     } 
/*    */     
/* 80 */     if (j == 0)
/* 81 */       throw e.create(); 
/* 82 */     if (collection.size() == 1) {
/* 83 */       ☃.a(new of("commands.enchant.success.single", new Object[] { bps1.d(i), ((aqa)collection.iterator().next()).d() }), true);
/*    */     } else {
/* 85 */       ☃.a(new of("commands.enchant.success.multiple", new Object[] { bps1.d(i), Integer.valueOf(collection.size()) }), true);
/*    */     } 
/*    */     
/* 88 */     return j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ww.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */