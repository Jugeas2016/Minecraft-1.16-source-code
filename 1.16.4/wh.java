/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.List;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
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
/*    */ public class wh
/*    */ {
/* 28 */   public static final Pattern a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
/* 29 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.banip.invalid"));
/* 30 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.banip.failed"));
/*    */   
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 33 */     ☃.register(
/* 34 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("ban-ip")
/* 35 */         .requires(☃ -> ☃.c(3)))
/* 36 */         .then((
/* 37 */           (RequiredArgumentBuilder)dc.<T>a("target", (ArgumentType<T>)StringArgumentType.word())
/* 38 */           .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "target"), null)))
/* 39 */           .then(
/* 40 */             dc.<T>a("reason", dp.a())
/* 41 */             .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "target"), dp.a(☃, "reason"))))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static int a(db ☃, String str, @Nullable nr nr1) throws CommandSyntaxException {
/* 48 */     Matcher matcher = a.matcher(str);
/* 49 */     if (matcher.matches()) {
/* 50 */       return b(☃, str, nr1);
/*    */     }
/* 52 */     aah aah = ☃.j().ae().a(str);
/* 53 */     if (aah != null) {
/* 54 */       return b(☃, aah.v(), nr1);
/*    */     }
/*    */     
/* 57 */     throw b.create();
/*    */   }
/*    */   
/*    */   private static int b(db ☃, String str, @Nullable nr nr1) throws CommandSyntaxException {
/* 61 */     acr acr = ☃.j().ae().g();
/* 62 */     if (acr.a(str)) {
/* 63 */       throw c.create();
/*    */     }
/* 65 */     List<aah> list = ☃.j().ae().b(str);
/* 66 */     acs acs = new acs(str, null, ☃.c(), null, (nr1 == null) ? null : nr1.getString());
/* 67 */     acr.a(acs);
/*    */     
/* 69 */     ☃.a(new of("commands.banip.success", new Object[] { str, acs.d() }), true);
/* 70 */     if (!list.isEmpty()) {
/* 71 */       ☃.a(new of("commands.banip.info", new Object[] { Integer.valueOf(list.size()), fc.a((List)list) }), true);
/*    */     }
/*    */     
/* 74 */     for (aah aah : list) {
/* 75 */       aah.b.b(new of("multiplayer.disconnect.ip_banned"));
/*    */     }
/*    */     
/* 78 */     return list.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */