/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class yw
/*     */ {
/*  24 */   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("commands.whitelist.alreadyOn"));
/*  25 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.whitelist.alreadyOff"));
/*  26 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.whitelist.add.failed"));
/*  27 */   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("commands.whitelist.remove.failed"));
/*     */   
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  30 */     ☃.register(
/*  31 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("whitelist")
/*  32 */         .requires(☃ -> ☃.c(3)))
/*  33 */         .then(
/*  34 */           dc.a("on")
/*  35 */           .executes(☃ -> b((db)☃.getSource()))))
/*     */         
/*  37 */         .then(
/*  38 */           dc.a("off")
/*  39 */           .executes(☃ -> c((db)☃.getSource()))))
/*     */         
/*  41 */         .then(
/*  42 */           dc.a("list")
/*  43 */           .executes(☃ -> d((db)☃.getSource()))))
/*     */         
/*  45 */         .then(
/*  46 */           dc.a("add")
/*  47 */           .then(
/*  48 */             dc.<T>a("targets", dm.a())
/*  49 */             .suggests((☃, suggestionsBuilder) -> {
/*     */                 acu acu = ((db)☃.getSource()).j().ae();
/*     */                 
/*     */                 return dd.b(acu.s().stream().filter(()).map(()), suggestionsBuilder);
/*  53 */               }).executes(☃ -> a((db)☃.getSource(), dm.a(☃, "targets"))))))
/*     */ 
/*     */         
/*  56 */         .then(
/*  57 */           dc.a("remove")
/*  58 */           .then(
/*  59 */             dc.<T>a("targets", dm.a())
/*  60 */             .suggests((☃, suggestionsBuilder) -> dd.a(((db)☃.getSource()).j().ae().j(), suggestionsBuilder))
/*  61 */             .executes(☃ -> b((db)☃.getSource(), dm.a(☃, "targets"))))))
/*     */ 
/*     */         
/*  64 */         .then(
/*  65 */           dc.a("reload")
/*  66 */           .executes(☃ -> a((db)☃.getSource()))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃) {
/*  72 */     ☃.j().ae().a();
/*  73 */     ☃.a(new of("commands.whitelist.reloaded"), true);
/*  74 */     ☃.j().a(☃);
/*  75 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/*  79 */     adb adb = ☃.j().ae().i();
/*  80 */     int i = 0;
/*     */     
/*  82 */     for (GameProfile gameProfile : collection) {
/*  83 */       if (!adb.a(gameProfile)) {
/*  84 */         adc adc = new adc(gameProfile);
/*  85 */         adb.a(adc);
/*  86 */         ☃.a(new of("commands.whitelist.add.success", new Object[] { ns.a(gameProfile) }), true);
/*  87 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/*  91 */     if (i == 0) {
/*  92 */       throw c.create();
/*     */     }
/*     */     
/*  95 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(db ☃, Collection<GameProfile> collection) throws CommandSyntaxException {
/*  99 */     adb adb = ☃.j().ae().i();
/* 100 */     int i = 0;
/*     */     
/* 102 */     for (GameProfile gameProfile : collection) {
/* 103 */       if (adb.a(gameProfile)) {
/* 104 */         adc adc = new adc(gameProfile);
/* 105 */         adb.b(adc);
/* 106 */         ☃.a(new of("commands.whitelist.remove.success", new Object[] { ns.a(gameProfile) }), true);
/* 107 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 111 */     if (i == 0) {
/* 112 */       throw d.create();
/*     */     }
/*     */     
/* 115 */     ☃.j().a(☃);
/* 116 */     return i;
/*     */   }
/*     */   
/*     */   private static int b(db ☃) throws CommandSyntaxException {
/* 120 */     acu acu = ☃.j().ae();
/* 121 */     if (acu.o()) {
/* 122 */       throw a.create();
/*     */     }
/* 124 */     acu.a(true);
/* 125 */     ☃.a(new of("commands.whitelist.enabled"), true);
/* 126 */     ☃.j().a(☃);
/* 127 */     return 1;
/*     */   }
/*     */   
/*     */   private static int c(db ☃) throws CommandSyntaxException {
/* 131 */     acu acu = ☃.j().ae();
/* 132 */     if (!acu.o()) {
/* 133 */       throw b.create();
/*     */     }
/* 135 */     acu.a(false);
/* 136 */     ☃.a(new of("commands.whitelist.disabled"), true);
/* 137 */     return 1;
/*     */   }
/*     */   
/*     */   private static int d(db ☃) {
/* 141 */     String[] arrayOfString = ☃.j().ae().j();
/* 142 */     if (arrayOfString.length == 0) {
/* 143 */       ☃.a(new of("commands.whitelist.none"), false);
/*     */     } else {
/* 145 */       ☃.a(new of("commands.whitelist.list", new Object[] { Integer.valueOf(arrayOfString.length), String.join(", ", (CharSequence[])arrayOfString) }), false);
/*     */     } 
/* 147 */     return arrayOfString.length;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\yw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */