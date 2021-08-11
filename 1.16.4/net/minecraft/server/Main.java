/*     */ package net.minecraft.server;
/*     */ import aaq;
/*     */ import abt;
/*     */ import abw;
/*     */ import aby;
/*     */ import acq;
/*     */ import afm;
/*     */ import agb;
/*     */ import aoi;
/*     */ import brk;
/*     */ import brt;
/*     */ import brx;
/*     */ import bsa;
/*     */ import chw;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.authlib.GameProfileRepository;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import cye;
/*     */ import cyg;
/*     */ import cyl;
/*     */ import cyn;
/*     */ import gn;
/*     */ import java.awt.GraphicsEnvironment;
/*     */ import java.io.File;
/*     */ import java.net.Proxy;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import joptsimple.AbstractOptionSpec;
/*     */ import joptsimple.ArgumentAcceptingOptionSpec;
/*     */ import joptsimple.OptionParser;
/*     */ import joptsimple.OptionSet;
/*     */ import joptsimple.OptionSpec;
/*     */ import joptsimple.OptionSpecBuilder;
/*     */ import l;
/*     */ import mo;
/*     */ import mt;
/*     */ import nr;
/*     */ import o;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import vh;
/*     */ import vj;
/*     */ import vm;
/*     */ import vr;
/*     */ import vz;
/*     */ import x;
/*     */ import zg;
/*     */ import zh;
/*     */ import zi;
/*     */ 
/*     */ public class Main {
/*  57 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   public static void main(String[] ☃) {
/*  61 */     OptionParser optionParser = new OptionParser();
/*  62 */     OptionSpecBuilder optionSpecBuilder1 = optionParser.accepts("nogui");
/*  63 */     OptionSpecBuilder optionSpecBuilder2 = optionParser.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
/*  64 */     OptionSpecBuilder optionSpecBuilder3 = optionParser.accepts("demo");
/*  65 */     OptionSpecBuilder optionSpecBuilder4 = optionParser.accepts("bonusChest");
/*  66 */     OptionSpecBuilder optionSpecBuilder5 = optionParser.accepts("forceUpgrade");
/*  67 */     OptionSpecBuilder optionSpecBuilder6 = optionParser.accepts("eraseCache");
/*  68 */     OptionSpecBuilder optionSpecBuilder7 = optionParser.accepts("safeMode", "Loads level with vanilla datapack only");
/*  69 */     AbstractOptionSpec abstractOptionSpec = optionParser.accepts("help").forHelp();
/*  70 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec1 = optionParser.accepts("singleplayer").withRequiredArg();
/*  71 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec2 = optionParser.accepts("universe").withRequiredArg().defaultsTo(".", (Object[])new String[0]);
/*  72 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec3 = optionParser.accepts("world").withRequiredArg();
/*  73 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec4 = optionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(-1), (Object[])new Integer[0]);
/*  74 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec5 = optionParser.accepts("serverId").withRequiredArg();
/*  75 */     NonOptionArgumentSpec nonOptionArgumentSpec = optionParser.nonOptions(); try {
/*     */       vz vz;
/*     */       cyl cyl1;
/*  78 */       OptionSet optionSet = optionParser.parse(☃);
/*     */       
/*  80 */       if (optionSet.has((OptionSpec)abstractOptionSpec)) {
/*  81 */         optionParser.printHelpOn(System.err);
/*     */         
/*     */         return;
/*     */       } 
/*  85 */       l.h();
/*     */       
/*  87 */       vm.a();
/*  88 */       vm.c();
/*     */       
/*  90 */       x.l();
/*     */       
/*  92 */       gn.b b = gn.b();
/*     */       
/*  94 */       Path path1 = Paths.get("server.properties", new String[0]);
/*  95 */       zi zi = new zi((gn)b, path1);
/*  96 */       zi.b();
/*     */       
/*  98 */       Path path2 = Paths.get("eula.txt", new String[0]);
/*  99 */       vr vr = new vr(path2);
/*     */       
/* 101 */       if (optionSet.has((OptionSpec)optionSpecBuilder2)) {
/* 102 */         a.info("Initialized '{}' and '{}'", path1.toAbsolutePath(), path2.toAbsolutePath());
/*     */         
/*     */         return;
/*     */       } 
/* 106 */       if (!vr.a()) {
/* 107 */         a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
/*     */         
/*     */         return;
/*     */       } 
/* 111 */       File file = new File((String)optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec2));
/* 112 */       YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY);
/* 113 */       MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
/* 114 */       GameProfileRepository gameProfileRepository = yggdrasilAuthenticationService.createProfileRepository();
/* 115 */       acq acq = new acq(gameProfileRepository, new File(file, MinecraftServer.b.getName()));
/* 116 */       String str = Optional.<Object>ofNullable(optionSet.valueOf((OptionSpec)argumentAcceptingOptionSpec3)).orElse((zi.a()).n);
/* 117 */       cyg cyg = cyg.a(file.toPath());
/* 118 */       cyg.a a = cyg.c(str);
/*     */       
/* 120 */       MinecraftServer.a(a);
/*     */       
/* 122 */       brk brk1 = a.e();
/*     */       
/* 124 */       boolean bool = optionSet.has((OptionSpec)optionSpecBuilder7);
/* 125 */       if (bool) {
/* 126 */         a.warn("Safe mode active, only vanilla datapack will be loaded");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 131 */       abw abw = new abw(new aby[] { (aby)new abz(), (aby)new abt(a.a(cye.g).toFile(), abx.c) });
/*     */       
/* 133 */       brk brk2 = MinecraftServer.a(abw, (brk1 == null) ? brk.a : brk1, bool);
/* 134 */       CompletableFuture<vz> completableFuture = vz.a(abw.f(), dc.a.b, (zi.a()).G, x.f(), Runnable::run);
/*     */ 
/*     */       
/*     */       try {
/* 138 */         vz = completableFuture.get();
/* 139 */       } catch (Exception exception) {
/* 140 */         a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", exception);
/* 141 */         abw.close();
/*     */         return;
/*     */       } 
/* 144 */       vz.i();
/*     */       
/* 146 */       vh<mt> vh = vh.a((DynamicOps)mo.a, vz.h(), b);
/*     */       
/* 148 */       cyn cyn = a.a((DynamicOps)vh, brk2);
/*     */       
/* 150 */       if (cyn == null) {
/*     */         bsa bsa;
/*     */         chw chw;
/* 153 */         if (optionSet.has((OptionSpec)optionSpecBuilder3)) {
/* 154 */           bsa = MinecraftServer.c;
/* 155 */           chw = chw.a((gn)b);
/*     */         } else {
/* 157 */           zh zh = zi.a();
/* 158 */           bsa = new bsa(zh.n, zh.m, zh.y, zh.l, false, new brt(), brk2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 167 */           chw = optionSet.has((OptionSpec)optionSpecBuilder4) ? zh.W.j() : zh.W;
/*     */         } 
/* 169 */         cyl1 = new cyl(bsa, chw, Lifecycle.stable());
/*     */       } 
/*     */       
/* 172 */       if (optionSet.has((OptionSpec)optionSpecBuilder5)) {
/* 173 */         a(a, agb.a(), optionSet.has((OptionSpec)optionSpecBuilder6), () -> true, cyl1.A().f());
/*     */       }
/*     */       
/* 176 */       a.a((gn)b, (cyn)cyl1);
/*     */       
/* 178 */       cyl cyl2 = cyl1;
/* 179 */       zg zg = MinecraftServer.<zg>a(thread -> {
/*     */             zg zg = new zg(thread, ☃, a1, abw1, vz1, cyn1, zi1, agb.a(), minecraftSessionService, gameProfileRepository, acq1, aar::new);
/*     */             
/*     */             zg.d((String)optionSet.valueOf(optionSpec1));
/*     */             
/*     */             zg.a(((Integer)optionSet.valueOf(optionSpec2)).intValue());
/*     */             zg.c(optionSet.has(optionSpec3));
/*     */             zg.b((String)optionSet.valueOf(optionSpec4));
/* 187 */             boolean bool = (!optionSet.has(optionSpec5) && !optionSet.valuesOf(optionSpec6).contains("nogui"));
/*     */             
/*     */             if (bool && !GraphicsEnvironment.isHeadless()) {
/*     */               zg.bd();
/*     */             }
/*     */             return zg;
/*     */           });
/* 194 */       Thread thread = new Thread("Server Shutdown Thread", zg)
/*     */         {
/*     */           public void run() {
/* 197 */             this.a.a(true);
/*     */           }
/*     */         };
/* 200 */       thread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new o(a));
/* 201 */       Runtime.getRuntime().addShutdownHook(thread);
/* 202 */     } catch (Exception exception) {
/* 203 */       a.fatal("Failed to start the minecraft server", exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(cyg.a ☃, DataFixer dataFixer, boolean bool, BooleanSupplier booleanSupplier, ImmutableSet<vj<brx>> immutableSet) {
/* 208 */     a.info("Forcing world upgrade!");
/*     */     
/* 210 */     aoi aoi = new aoi(☃, dataFixer, immutableSet, bool);
/* 211 */     nr nr = null;
/* 212 */     while (!aoi.b()) {
/* 213 */       nr nr1 = aoi.h();
/* 214 */       if (nr != nr1) {
/* 215 */         nr = nr1;
/* 216 */         a.info(aoi.h().getString());
/*     */       } 
/* 218 */       int i = aoi.e();
/* 219 */       if (i > 0) {
/* 220 */         int j = aoi.f() + aoi.g();
/* 221 */         a.info("{}% completed ({} / {} chunks)...", Integer.valueOf(afm.d(j / i * 100.0F)), Integer.valueOf(j), Integer.valueOf(i));
/*     */       } 
/*     */       
/* 224 */       if (!booleanSupplier.getAsBoolean()) {
/* 225 */         aoi.a(); continue;
/*     */       } 
/*     */       try {
/* 228 */         Thread.sleep(1000L);
/* 229 */       } catch (InterruptedException interruptedException) {}
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\net\minecraft\server\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */