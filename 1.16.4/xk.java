/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Map;
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
/*    */ public class xk
/*    */ {
/* 24 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.locate.failed"));
/*    */ 
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 28 */     LiteralArgumentBuilder<db> literalArgumentBuilder = (LiteralArgumentBuilder<db>)dc.a("locate").requires(☃ -> ☃.c(2));
/*    */     
/* 30 */     for (Map.Entry<String, cla<?>> entry : (Iterable<Map.Entry<String, cla<?>>>)cla.a.entrySet()) {
/* 31 */       literalArgumentBuilder = (LiteralArgumentBuilder<db>)literalArgumentBuilder.then(dc.a(entry.getKey()).executes(commandContext -> a((db)commandContext.getSource(), (cla)☃.getValue())));
/*    */     }
/*    */     
/* 34 */     ☃.register(literalArgumentBuilder);
/*    */   }
/*    */   
/*    */   private static int a(db ☃, cla<?> cla1) throws CommandSyntaxException {
/* 38 */     fx fx1 = new fx(☃.d());
/* 39 */     fx fx2 = ☃.e().a(cla1, fx1, 100, false);
/* 40 */     if (fx2 == null) {
/* 41 */       throw a.create();
/*    */     }
/*    */     
/* 44 */     return a(☃, cla1.i(), fx1, fx2, "commands.locate.success");
/*    */   }
/*    */   
/*    */   public static int a(db ☃, String str1, fx fx1, fx fx2, String str2) {
/* 48 */     int i = afm.d(a(fx1.u(), fx1.w(), fx2.u(), fx2.w()));
/* 49 */     nr nr = ns.a(new of("chat.coordinates", new Object[] { Integer.valueOf(fx2.u()), "~", Integer.valueOf(fx2.w()) })).a(ob1 -> ob1.a(k.k).a(new np(np.a.d, "/tp @s " + ☃.u() + " ~ " + ☃.w())).a(new nv((nv.a)nv.a.a, (T)new of("chat.coordinates.tooltip"))));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 54 */     ☃.a(new of(str2, new Object[] { str1, nr, Integer.valueOf(i) }), false);
/*    */     
/* 56 */     return i;
/*    */   }
/*    */   
/*    */   private static float a(int ☃, int i, int j, int k) {
/* 60 */     int m = j - ☃;
/* 61 */     int n = k - i;
/* 62 */     return afm.c((m * m + n * n));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\xk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */