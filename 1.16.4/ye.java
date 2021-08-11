/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.function.Predicate;
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
/*    */ 
/*    */ public class ye
/*    */ {
/* 29 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.setblock.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 32 */     ☃.register(
/* 33 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("setblock")
/* 34 */         .requires(☃ -> ☃.c(2)))
/* 35 */         .then(
/* 36 */           dc.<T>a("pos", ek.a())
/* 37 */           .then((
/* 38 */             (RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dc.<T>a("block", eh.a())
/* 39 */             .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "pos"), eh.a(☃, "block"), b.a, null)))
/* 40 */             .then(
/* 41 */               dc.a("destroy")
/* 42 */               .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "pos"), eh.a(☃, "block"), b.b, null))))
/*    */             
/* 44 */             .then(
/* 45 */               dc.a("keep")
/* 46 */               .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "pos"), eh.a(☃, "block"), b.a, ()))))
/*    */             
/* 48 */             .then(
/* 49 */               dc.a("replace")
/* 50 */               .executes(☃ -> a((db)☃.getSource(), ek.a(☃, "pos"), eh.a(☃, "block"), b.a, null))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, fx fx1, ef ef1, b b1, @Nullable Predicate<cel> predicate) throws CommandSyntaxException {
/*    */     boolean bool;
/* 58 */     aag aag = ☃.e();
/* 59 */     if (predicate != null && !predicate.test(new cel(aag, fx1, true))) {
/* 60 */       throw a.create();
/*    */     }
/*    */ 
/*    */     
/* 64 */     if (b1 == b.b) {
/* 65 */       aag.b(fx1, true);
/* 66 */       bool = (!ef1.a().g() || !aag.d_(fx1).g());
/*    */     } else {
/* 68 */       ccj ccj = aag.c(fx1);
/* 69 */       aol.a(ccj);
/* 70 */       bool = true;
/*    */     } 
/* 72 */     if (bool && !ef1.a(aag, fx1, 2)) {
/* 73 */       throw a.create();
/*    */     }
/*    */     
/* 76 */     aag.a(fx1, ef1.a().b());
/* 77 */     ☃.a(new of("commands.setblock.success", new Object[] { Integer.valueOf(fx1.u()), Integer.valueOf(fx1.v()), Integer.valueOf(fx1.w()) }), true);
/* 78 */     return 1;
/*    */   } public static interface a {
/*    */     @Nullable
/*    */     ef filter(cra param1cra, fx param1fx, ef param1ef, aag param1aag); }
/* 82 */   public enum b { a,
/* 83 */     b; }
/*    */ 
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ye.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */