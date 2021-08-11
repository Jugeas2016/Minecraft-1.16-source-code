/*     */ package net.minecraft.client.main;
/*     */ 
/*     */ import afd;
/*     */ import bfw;
/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.mojang.authlib.properties.PropertyMap;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import def;
/*     */ import dej;
/*     */ import djz;
/*     */ import dkm;
/*     */ import dsz;
/*     */ import dta;
/*     */ import eng;
/*     */ import java.io.File;
/*     */ import java.net.Authenticator;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.PasswordAuthentication;
/*     */ import java.net.Proxy;
/*     */ import java.util.List;
/*     */ import java.util.OptionalInt;
/*     */ import javax.annotation.Nullable;
/*     */ import joptsimple.ArgumentAcceptingOptionSpec;
/*     */ import joptsimple.NonOptionArgumentSpec;
/*     */ import joptsimple.OptionParser;
/*     */ import joptsimple.OptionSet;
/*     */ import joptsimple.OptionSpec;
/*     */ import l;
/*     */ import o;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import vm;
/*     */ import x;
/*     */ 
/*     */ public class Main {
/*  37 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   static {
/*  41 */     System.setProperty("java.awt.headless", "true");
/*     */   }
/*     */   public static void main(String[] ☃) {
/*     */     djz djz;
/*     */     Thread thread2;
/*  46 */     OptionParser optionParser = new OptionParser();
/*  47 */     optionParser.allowsUnrecognizedOptions();
/*     */     
/*  49 */     optionParser.accepts("demo");
/*  50 */     optionParser.accepts("disableMultiplayer");
/*  51 */     optionParser.accepts("disableChat");
/*  52 */     optionParser.accepts("fullscreen");
/*  53 */     optionParser.accepts("checkGlErrors");
/*  54 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec1 = optionParser.accepts("server").withRequiredArg();
/*  55 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec2 = optionParser.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(25565), (Object[])new Integer[0]);
/*  56 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec3 = optionParser.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), (Object[])new File[0]);
/*  57 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec4 = optionParser.accepts("assetsDir").withRequiredArg().ofType(File.class);
/*  58 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec5 = optionParser.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
/*  59 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec6 = optionParser.accepts("dataPackDir").withRequiredArg().ofType(File.class);
/*  60 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec7 = optionParser.accepts("proxyHost").withRequiredArg();
/*  61 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec8 = optionParser.accepts("proxyPort").withRequiredArg().defaultsTo("8080", (Object[])new String[0]).ofType(Integer.class);
/*  62 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec9 = optionParser.accepts("proxyUser").withRequiredArg();
/*  63 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec10 = optionParser.accepts("proxyPass").withRequiredArg();
/*  64 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec11 = optionParser.accepts("username").withRequiredArg().defaultsTo("Player" + (x.b() % 1000L), (Object[])new String[0]);
/*  65 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec12 = optionParser.accepts("uuid").withRequiredArg();
/*  66 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec13 = optionParser.accepts("accessToken").withRequiredArg().required();
/*  67 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec14 = optionParser.accepts("version").withRequiredArg().required();
/*  68 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec15 = optionParser.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(854), (Object[])new Integer[0]);
/*  69 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec16 = optionParser.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(Integer.valueOf(480), (Object[])new Integer[0]);
/*  70 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec17 = optionParser.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
/*  71 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec18 = optionParser.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
/*  72 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec19 = optionParser.accepts("userProperties").withRequiredArg().defaultsTo("{}", (Object[])new String[0]);
/*  73 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec20 = optionParser.accepts("profileProperties").withRequiredArg().defaultsTo("{}", (Object[])new String[0]);
/*  74 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec21 = optionParser.accepts("assetIndex").withRequiredArg();
/*  75 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec22 = optionParser.accepts("userType").withRequiredArg().defaultsTo("legacy", (Object[])new String[0]);
/*  76 */     ArgumentAcceptingOptionSpec argumentAcceptingOptionSpec23 = optionParser.accepts("versionType").withRequiredArg().defaultsTo("release", (Object[])new String[0]);
/*  77 */     NonOptionArgumentSpec nonOptionArgumentSpec = optionParser.nonOptions();
/*     */     
/*  79 */     OptionSet optionSet = optionParser.parse(☃);
/*  80 */     List<String> list = optionSet.valuesOf((OptionSpec)nonOptionArgumentSpec);
/*     */     
/*  82 */     if (!list.isEmpty()) {
/*  83 */       System.out.println("Completely ignored arguments: " + list);
/*     */     }
/*     */ 
/*     */     
/*  87 */     String str1 = a(optionSet, (OptionSpec<String>)argumentAcceptingOptionSpec7);
/*  88 */     Proxy proxy = Proxy.NO_PROXY;
/*  89 */     if (str1 != null) {
/*     */       try {
/*  91 */         proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(str1, ((Integer)a(optionSet, (OptionSpec<Integer>)argumentAcceptingOptionSpec8)).intValue()));
/*  92 */       } catch (Exception exception) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  97 */     String str2 = a(optionSet, (OptionSpec<String>)argumentAcceptingOptionSpec9);
/*  98 */     String str3 = a(optionSet, (OptionSpec<String>)argumentAcceptingOptionSpec10);
/*  99 */     if (!proxy.equals(Proxy.NO_PROXY) && a(str2) && a(str3)) {
/* 100 */       Authenticator.setDefault(new Authenticator(str2, str3)
/*     */           {
/*     */             protected PasswordAuthentication getPasswordAuthentication() {
/* 103 */               return new PasswordAuthentication(this.a, this.b.toCharArray());
/*     */             }
/*     */           });
/*     */     }
/*     */ 
/*     */     
/* 109 */     int i = ((Integer)a(optionSet, (OptionSpec<Integer>)argumentAcceptingOptionSpec15)).intValue();
/* 110 */     int j = ((Integer)a(optionSet, (OptionSpec<Integer>)argumentAcceptingOptionSpec16)).intValue();
/* 111 */     OptionalInt optionalInt1 = a(a(optionSet, (OptionSpec<Integer>)argumentAcceptingOptionSpec17));
/* 112 */     OptionalInt optionalInt2 = a(a(optionSet, (OptionSpec<Integer>)argumentAcceptingOptionSpec18));
/* 113 */     boolean bool1 = optionSet.has("fullscreen");
/* 114 */     boolean bool2 = optionSet.has("demo");
/* 115 */     boolean bool3 = optionSet.has("disableMultiplayer");
/* 116 */     boolean bool4 = optionSet.has("disableChat");
/* 117 */     String str4 = a(optionSet, (OptionSpec<String>)argumentAcceptingOptionSpec14);
/* 118 */     Gson gson = (new GsonBuilder()).registerTypeAdapter(PropertyMap.class, new PropertyMap.Serializer()).create();
/* 119 */     PropertyMap propertyMap1 = (PropertyMap)afd.a(gson, a(optionSet, (OptionSpec<String>)argumentAcceptingOptionSpec19), PropertyMap.class);
/* 120 */     PropertyMap propertyMap2 = (PropertyMap)afd.a(gson, a(optionSet, (OptionSpec<String>)argumentAcceptingOptionSpec20), PropertyMap.class);
/* 121 */     String str5 = a(optionSet, (OptionSpec<String>)argumentAcceptingOptionSpec23);
/*     */ 
/*     */     
/* 124 */     File file1 = a(optionSet, (OptionSpec<File>)argumentAcceptingOptionSpec3);
/* 125 */     File file2 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec4) ? a(optionSet, (OptionSpec<File>)argumentAcceptingOptionSpec4) : new File(file1, "assets/");
/* 126 */     File file3 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec5) ? a(optionSet, (OptionSpec<File>)argumentAcceptingOptionSpec5) : new File(file1, "resourcepacks/");
/* 127 */     String str6 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec12) ? (String)argumentAcceptingOptionSpec12.value(optionSet) : bfw.c((String)argumentAcceptingOptionSpec11.value(optionSet)).toString();
/* 128 */     String str7 = optionSet.has((OptionSpec)argumentAcceptingOptionSpec21) ? (String)argumentAcceptingOptionSpec21.value(optionSet) : null;
/*     */ 
/*     */     
/* 131 */     String str8 = a(optionSet, (OptionSpec<String>)argumentAcceptingOptionSpec1);
/* 132 */     Integer integer = a(optionSet, (OptionSpec<Integer>)argumentAcceptingOptionSpec2);
/*     */ 
/*     */     
/* 135 */     l.h();
/*     */     
/* 137 */     vm.a();
/* 138 */     vm.c();
/*     */     
/* 140 */     x.l();
/*     */     
/* 142 */     dkm dkm = new dkm((String)argumentAcceptingOptionSpec11.value(optionSet), str6, (String)argumentAcceptingOptionSpec13.value(optionSet), (String)argumentAcceptingOptionSpec22.value(optionSet));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 148 */     dsz dsz = new dsz(new dsz.d(dkm, propertyMap1, propertyMap2, proxy), new dej(i, j, optionalInt1, optionalInt2, bool1), new dsz.a(file1, file3, file2, str7), new dsz.b(bool2, str4, str5, bool3, bool4), new dsz.c(str8, integer.intValue()));
/*     */ 
/*     */     
/* 151 */     Thread thread1 = new Thread("Client Shutdown Thread")
/*     */       {
/*     */         public void run() {
/* 154 */           djz ☃ = djz.C();
/* 155 */           if (☃ == null) {
/*     */             return;
/*     */           }
/*     */           
/* 159 */           eng eng = ☃.H();
/* 160 */           if (eng != null) {
/* 161 */             eng.a(true);
/*     */           }
/*     */         }
/*     */       };
/* 165 */     thread1.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new o(a));
/* 166 */     Runtime.getRuntime().addShutdownHook(thread1);
/*     */     
/* 168 */     def def = new def();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 173 */       Thread.currentThread().setName("Render thread");
/* 174 */       RenderSystem.initRenderThread();
/*     */       
/* 176 */       RenderSystem.beginInitialization();
/* 177 */       djz = new djz(dsz);
/* 178 */       RenderSystem.finishInitialization();
/* 179 */     } catch (dta dta) {
/* 180 */       a.warn("Failed to create window: ", (Throwable)dta);
/*     */       return;
/* 182 */     } catch (Throwable throwable) {
/* 183 */       l l = l.a(throwable, "Initializing game");
/* 184 */       l.a("Initialization");
/* 185 */       djz.a(null, dsz.d.b, null, l);
/* 186 */       djz.b(l);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 191 */     if (djz.aC()) {
/* 192 */       thread2 = new Thread("Game thread", djz)
/*     */         {
/*     */           public void run() {
/*     */             try {
/* 196 */               RenderSystem.initGameThread(true);
/* 197 */               this.a.e();
/* 198 */             } catch (Throwable ☃) {
/* 199 */               Main.a().error("Exception in client thread", ☃);
/*     */             } 
/*     */           }
/*     */         };
/*     */       
/* 204 */       thread2.start();
/*     */ 
/*     */ 
/*     */       
/* 208 */       while (djz.o());
/*     */     }
/*     */     else {
/*     */       
/* 212 */       thread2 = null;
/*     */       try {
/* 214 */         RenderSystem.initGameThread(false);
/* 215 */         djz.e();
/* 216 */       } catch (Throwable throwable) {
/* 217 */         a.error("Unhandled game exception", throwable);
/*     */       } 
/*     */     } 
/*     */     
/*     */     try {
/* 222 */       djz.n();
/* 223 */       if (thread2 != null) {
/* 224 */         thread2.join();
/*     */       }
/* 226 */     } catch (InterruptedException interruptedException) {
/* 227 */       a.error("Exception during client thread shutdown", interruptedException);
/*     */     } finally {
/* 229 */       djz.l();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static OptionalInt a(@Nullable Integer ☃) {
/* 234 */     return (☃ != null) ? OptionalInt.of(☃.intValue()) : OptionalInt.empty();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static <T> T a(OptionSet ☃, OptionSpec<T> optionSpec) {
/*     */     try {
/* 240 */       return (T)☃.valueOf(optionSpec);
/* 241 */     } catch (Throwable throwable) {
/* 242 */       if (optionSpec instanceof ArgumentAcceptingOptionSpec) {
/* 243 */         ArgumentAcceptingOptionSpec<T> argumentAcceptingOptionSpec = (ArgumentAcceptingOptionSpec<T>)optionSpec;
/* 244 */         List<T> list = argumentAcceptingOptionSpec.defaultValues();
/* 245 */         if (!list.isEmpty()) {
/* 246 */           return list.get(0);
/*     */         }
/*     */       } 
/* 249 */       throw throwable;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean a(@Nullable String ☃) {
/* 254 */     return (☃ != null && !☃.isEmpty());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\net\minecraft\client\main\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */