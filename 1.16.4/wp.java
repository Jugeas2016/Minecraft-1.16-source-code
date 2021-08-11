/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.FileSystem;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.nio.file.spi.FileSystemProvider;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class wp
/*    */ {
/* 31 */   private static final Logger a = LogManager.getLogger();
/* 32 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("commands.debug.notRunning")); @Nullable
/* 33 */   private static final FileSystemProvider d; private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("commands.debug.alreadyRunning"));
/*    */   
/*    */   static {
/* 36 */     d = FileSystemProvider.installedProviders().stream().filter(☃ -> ☃.getScheme().equalsIgnoreCase("jar")).findFirst().orElse(null);
/*    */   }
/*    */   public static void a(CommandDispatcher<db> ☃) {
/* 39 */     ☃.register(
/* 40 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("debug")
/* 41 */         .requires(☃ -> ☃.c(3)))
/* 42 */         .then(dc.a("start").executes(☃ -> a((db)☃.getSource()))))
/* 43 */         .then(dc.a("stop").executes(☃ -> b((db)☃.getSource()))))
/* 44 */         .then(dc.a("report").executes(☃ -> c((db)☃.getSource()))));
/*    */   }
/*    */ 
/*    */   
/*    */   private static int a(db ☃) throws CommandSyntaxException {
/* 49 */     MinecraftServer minecraftServer = ☃.j();
/* 50 */     if (minecraftServer.aS()) {
/* 51 */       throw c.create();
/*    */     }
/* 53 */     minecraftServer.aT();
/* 54 */     ☃.a(new of("commands.debug.started", new Object[] { "Started the debug profiler. Type '/debug stop' to stop it." }), true);
/* 55 */     return 0;
/*    */   }
/*    */   
/*    */   private static int b(db ☃) throws CommandSyntaxException {
/* 59 */     MinecraftServer minecraftServer = ☃.j();
/* 60 */     if (!minecraftServer.aS()) {
/* 61 */       throw b.create();
/*    */     }
/* 63 */     anv anv = minecraftServer.aU();
/* 64 */     File file = new File(minecraftServer.c("debug"), "profile-results-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + ".txt");
/*    */     
/* 66 */     anv.a(file);
/*    */     
/* 68 */     float f1 = (float)anv.g() / 1.0E9F;
/* 69 */     float f2 = anv.f() / f1;
/* 70 */     ☃.a(new of("commands.debug.stopped", new Object[] { String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(f1) }), Integer.valueOf(anv.f()), String.format("%.2f", new Object[] { Float.valueOf(f2) }) }), true);
/*    */     
/* 72 */     return afm.d(f2);
/*    */   }
/*    */   
/*    */   private static int c(db ☃) {
/* 76 */     MinecraftServer minecraftServer = ☃.j();
/* 77 */     String str = "debug-report-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date());
/*    */ 
/*    */     
/*    */     try {
/* 81 */       Path path = minecraftServer.c("debug").toPath();
/* 82 */       Files.createDirectories(path, (FileAttribute<?>[])new FileAttribute[0]);
/* 83 */       if (w.d || d == null) {
/* 84 */         Path path1 = path.resolve(str);
/* 85 */         minecraftServer.a(path1);
/*    */       } else {
/* 87 */         Path path1 = path.resolve(str + ".zip");
/* 88 */         try (FileSystem ☃ = d.newFileSystem(path1, (Map<String, ?>)ImmutableMap.of("create", "true"))) {
/* 89 */           minecraftServer.a(fileSystem.getPath("/", new String[0]));
/*    */         } 
/*    */       } 
/*    */       
/* 93 */       ☃.a(new of("commands.debug.reportSaved", new Object[] { str }), false);
/* 94 */       return 1;
/* 95 */     } catch (IOException iOException) {
/* 96 */       a.error("Failed to save debug dump", iOException);
/* 97 */       ☃.a(new of("commands.debug.reportFailed"));
/* 98 */       return 0;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\wp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */