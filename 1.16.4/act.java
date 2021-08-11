/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.io.Files;
/*     */ import com.mojang.authlib.Agent;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.ProfileLookupCallback;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.text.ParseException;
/*     */ import java.util.Collection;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class act
/*     */ {
/*  31 */   private static final Logger e = LogManager.getLogger();
/*  32 */   public static final File a = new File("banned-ips.txt");
/*  33 */   public static final File b = new File("banned-players.txt");
/*  34 */   public static final File c = new File("ops.txt");
/*  35 */   public static final File d = new File("white-list.txt");
/*     */   
/*     */   static List<String> a(File ☃, Map<String, String[]> map) throws IOException {
/*  38 */     List<String> list = Files.readLines(☃, StandardCharsets.UTF_8);
/*  39 */     for (String str : list) {
/*  40 */       str = str.trim();
/*  41 */       if (str.startsWith("#") || str.length() < 1) {
/*     */         continue;
/*     */       }
/*  44 */       String[] arrayOfString = str.split("\\|");
/*  45 */       map.put(arrayOfString[0].toLowerCase(Locale.ROOT), arrayOfString);
/*     */     } 
/*  47 */     return list;
/*     */   }
/*     */   
/*     */   private static void a(MinecraftServer ☃, Collection<String> collection, ProfileLookupCallback profileLookupCallback) {
/*  51 */     String[] arrayOfString = (String[])collection.stream().filter(☃ -> !aft.b(☃)).toArray(☃ -> new String[☃]);
/*  52 */     if (☃.V()) {
/*  53 */       ☃.aq().findProfilesByNames(arrayOfString, Agent.MINECRAFT, profileLookupCallback);
/*     */     } else {
/*  55 */       for (String str : arrayOfString) {
/*  56 */         UUID uUID = bfw.a(new GameProfile(null, str));
/*  57 */         GameProfile gameProfile = new GameProfile(uUID, str);
/*  58 */         profileLookupCallback.onProfileLookupSucceeded(gameProfile);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean a(MinecraftServer ☃) {
/*  64 */     acz acz = new acz(acu.b);
/*  65 */     if (b.exists() && b.isFile()) {
/*  66 */       if (acz.b().exists()) {
/*     */         try {
/*  68 */           acz.f();
/*  69 */         } catch (IOException iOException) {
/*  70 */           e.warn("Could not load existing file {}", acz.b().getName(), iOException);
/*     */         } 
/*     */       }
/*     */       try {
/*  74 */         Map<String, String[]> map = Maps.newHashMap();
/*  75 */         a(b, map);
/*     */         
/*  77 */         ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, map, acz)
/*     */           {
/*     */             public void onProfileLookupSucceeded(GameProfile ☃) {
/*  80 */               this.a.ar().a(☃);
/*  81 */               String[] arrayOfString = (String[])this.b.get(☃.getName().toLowerCase(Locale.ROOT));
/*  82 */               if (arrayOfString == null) {
/*  83 */                 act.a().warn("Could not convert user banlist entry for {}", ☃.getName());
/*  84 */                 throw new act.a("Profile not in the conversionlist");
/*     */               } 
/*     */               
/*  87 */               Date date1 = (arrayOfString.length > 1) ? act.a(arrayOfString[1], (Date)null) : null;
/*  88 */               String str1 = (arrayOfString.length > 2) ? arrayOfString[2] : null;
/*  89 */               Date date2 = (arrayOfString.length > 3) ? act.a(arrayOfString[3], (Date)null) : null;
/*  90 */               String str2 = (arrayOfString.length > 4) ? arrayOfString[4] : null;
/*  91 */               this.c.a(new ada(☃, date1, str1, date2, str2));
/*     */             }
/*     */ 
/*     */             
/*     */             public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/*  96 */               act.a().warn("Could not lookup user banlist entry for {}", ☃.getName(), exception);
/*  97 */               if (!(exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException)) {
/*  98 */                 throw new act.a("Could not request user " + ☃.getName() + " from backend systems", exception);
/*     */               }
/*     */             }
/*     */           };
/* 102 */         a(☃, map.keySet(), profileLookupCallback);
/* 103 */         acz.e();
/* 104 */         c(b);
/* 105 */       } catch (IOException iOException) {
/* 106 */         e.warn("Could not read old user banlist to convert it!", iOException);
/* 107 */         return false;
/* 108 */       } catch (a a) {
/* 109 */         e.error("Conversion failed, please try again later", a);
/* 110 */         return false;
/*     */       } 
/* 112 */       return true;
/*     */     } 
/* 114 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean b(MinecraftServer ☃) {
/* 118 */     acr acr = new acr(acu.c);
/* 119 */     if (a.exists() && a.isFile()) {
/* 120 */       if (acr.b().exists()) {
/*     */         try {
/* 122 */           acr.f();
/* 123 */         } catch (IOException iOException) {
/* 124 */           e.warn("Could not load existing file {}", acr.b().getName(), iOException);
/*     */         } 
/*     */       }
/*     */       try {
/* 128 */         Map<String, String[]> map = Maps.newHashMap();
/* 129 */         a(a, map);
/*     */         
/* 131 */         for (String str1 : map.keySet()) {
/* 132 */           String[] arrayOfString = map.get(str1);
/* 133 */           Date date1 = (arrayOfString.length > 1) ? b(arrayOfString[1], null) : null;
/* 134 */           String str2 = (arrayOfString.length > 2) ? arrayOfString[2] : null;
/* 135 */           Date date2 = (arrayOfString.length > 3) ? b(arrayOfString[3], null) : null;
/* 136 */           String str3 = (arrayOfString.length > 4) ? arrayOfString[4] : null;
/* 137 */           acr.a(new acs(str1, date1, str2, date2, str3));
/*     */         } 
/* 139 */         acr.e();
/* 140 */         c(a);
/* 141 */       } catch (IOException iOException) {
/* 142 */         e.warn("Could not parse old ip banlist to convert it!", iOException);
/* 143 */         return false;
/*     */       } 
/* 145 */       return true;
/*     */     } 
/* 147 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean c(MinecraftServer ☃) {
/* 151 */     acv acv = new acv(acu.d);
/* 152 */     if (c.exists() && c.isFile()) {
/* 153 */       if (acv.b().exists()) {
/*     */         try {
/* 155 */           acv.f();
/* 156 */         } catch (IOException iOException) {
/* 157 */           e.warn("Could not load existing file {}", acv.b().getName(), iOException);
/*     */         } 
/*     */       }
/*     */       try {
/* 161 */         List<String> list = Files.readLines(c, StandardCharsets.UTF_8);
/* 162 */         ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, acv)
/*     */           {
/*     */             public void onProfileLookupSucceeded(GameProfile ☃) {
/* 165 */               this.a.ar().a(☃);
/* 166 */               this.b.a(new acw(☃, this.a.g(), false));
/*     */             }
/*     */ 
/*     */             
/*     */             public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 171 */               act.a().warn("Could not lookup oplist entry for {}", ☃.getName(), exception);
/* 172 */               if (!(exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException)) {
/* 173 */                 throw new act.a("Could not request user " + ☃.getName() + " from backend systems", exception);
/*     */               }
/*     */             }
/*     */           };
/* 177 */         a(☃, list, profileLookupCallback);
/* 178 */         acv.e();
/* 179 */         c(c);
/* 180 */       } catch (IOException iOException) {
/* 181 */         e.warn("Could not read old oplist to convert it!", iOException);
/* 182 */         return false;
/* 183 */       } catch (a a) {
/* 184 */         e.error("Conversion failed, please try again later", a);
/* 185 */         return false;
/*     */       } 
/* 187 */       return true;
/*     */     } 
/* 189 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean d(MinecraftServer ☃) {
/* 193 */     adb adb = new adb(acu.e);
/* 194 */     if (d.exists() && d.isFile()) {
/* 195 */       if (adb.b().exists()) {
/*     */         try {
/* 197 */           adb.f();
/* 198 */         } catch (IOException iOException) {
/* 199 */           e.warn("Could not load existing file {}", adb.b().getName(), iOException);
/*     */         } 
/*     */       }
/*     */       try {
/* 203 */         List<String> list = Files.readLines(d, StandardCharsets.UTF_8);
/* 204 */         ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, adb)
/*     */           {
/*     */             public void onProfileLookupSucceeded(GameProfile ☃) {
/* 207 */               this.a.ar().a(☃);
/* 208 */               this.b.a(new adc(☃));
/*     */             }
/*     */ 
/*     */             
/*     */             public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 213 */               act.a().warn("Could not lookup user whitelist entry for {}", ☃.getName(), exception);
/* 214 */               if (!(exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException)) {
/* 215 */                 throw new act.a("Could not request user " + ☃.getName() + " from backend systems", exception);
/*     */               }
/*     */             }
/*     */           };
/* 219 */         a(☃, list, profileLookupCallback);
/* 220 */         adb.e();
/* 221 */         c(d);
/* 222 */       } catch (IOException iOException) {
/* 223 */         e.warn("Could not read old whitelist to convert it!", iOException);
/* 224 */         return false;
/* 225 */       } catch (a a) {
/* 226 */         e.error("Conversion failed, please try again later", a);
/* 227 */         return false;
/*     */       } 
/* 229 */       return true;
/*     */     } 
/* 231 */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static UUID a(MinecraftServer ☃, String str) {
/* 236 */     if (aft.b(str) || str.length() > 16) {
/*     */       try {
/* 238 */         return UUID.fromString(str);
/* 239 */       } catch (IllegalArgumentException illegalArgumentException) {
/* 240 */         return null;
/*     */       } 
/*     */     }
/*     */     
/* 244 */     GameProfile gameProfile = ☃.ar().a(str);
/* 245 */     if (gameProfile != null && gameProfile.getId() != null) {
/* 246 */       return gameProfile.getId();
/*     */     }
/* 248 */     if (☃.O() || !☃.V()) {
/* 249 */       return bfw.a(new GameProfile(null, str));
/*     */     }
/* 251 */     List<GameProfile> list = Lists.newArrayList();
/* 252 */     ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, list)
/*     */       {
/*     */         public void onProfileLookupSucceeded(GameProfile ☃) {
/* 255 */           this.a.ar().a(☃);
/* 256 */           this.b.add(☃);
/*     */         }
/*     */ 
/*     */         
/*     */         public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 261 */           act.a().warn("Could not lookup user whitelist entry for {}", ☃.getName(), exception);
/*     */         }
/*     */       };
/* 264 */     a(☃, Lists.newArrayList((Object[])new String[] { str }, ), profileLookupCallback);
/* 265 */     if (!list.isEmpty() && ((GameProfile)list.get(0)).getId() != null) {
/* 266 */       return ((GameProfile)list.get(0)).getId();
/*     */     }
/*     */     
/* 269 */     return null;
/*     */   }
/*     */   
/*     */   static class a extends RuntimeException {
/*     */     private a(String ☃, Throwable throwable) {
/* 274 */       super(☃, throwable);
/*     */     }
/*     */     
/*     */     private a(String ☃) {
/* 278 */       super(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean a(zg ☃) {
/* 283 */     File file1 = g(☃);
/* 284 */     File file2 = new File(file1.getParentFile(), "playerdata");
/* 285 */     File file3 = new File(file1.getParentFile(), "unknownplayers");
/* 286 */     if (!file1.exists() || !file1.isDirectory()) {
/* 287 */       return true;
/*     */     }
/* 289 */     File[] arrayOfFile = file1.listFiles();
/* 290 */     List<String> list = Lists.newArrayList();
/* 291 */     for (File file : arrayOfFile) {
/* 292 */       String str = file.getName();
/* 293 */       if (str.toLowerCase(Locale.ROOT).endsWith(".dat")) {
/*     */ 
/*     */         
/* 296 */         String str1 = str.substring(0, str.length() - ".dat".length());
/* 297 */         if (!str1.isEmpty()) {
/* 298 */           list.add(str1);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     try {
/* 303 */       String[] arrayOfString = list.<String>toArray(new String[list.size()]);
/* 304 */       ProfileLookupCallback profileLookupCallback = new ProfileLookupCallback(☃, file2, file3, file1, arrayOfString)
/*     */         {
/*     */           public void onProfileLookupSucceeded(GameProfile ☃) {
/* 307 */             this.a.ar().a(☃);
/* 308 */             UUID uUID = ☃.getId();
/* 309 */             if (uUID == null) {
/* 310 */               throw new act.a("Missing UUID for user profile " + ☃.getName());
/*     */             }
/* 312 */             a(this.b, a(☃), uUID.toString());
/*     */           }
/*     */ 
/*     */           
/*     */           public void onProfileLookupFailed(GameProfile ☃, Exception exception) {
/* 317 */             act.a().warn("Could not lookup user uuid for {}", ☃.getName(), exception);
/* 318 */             if (exception instanceof com.mojang.authlib.yggdrasil.ProfileNotFoundException) {
/* 319 */               String str = a(☃);
/* 320 */               a(this.c, str, str);
/*     */             } else {
/* 322 */               throw new act.a("Could not request user " + ☃.getName() + " from backend systems", exception);
/*     */             } 
/*     */           }
/*     */           
/*     */           private void a(File ☃, String str1, String str2) {
/* 327 */             File file1 = new File(this.d, str1 + ".dat");
/* 328 */             File file2 = new File(☃, str2 + ".dat");
/* 329 */             act.a(☃);
/* 330 */             if (!file1.renameTo(file2)) {
/* 331 */               throw new act.a("Could not convert file for " + str1);
/*     */             }
/*     */           }
/*     */           
/*     */           private String a(GameProfile ☃) {
/* 336 */             String str = null;
/* 337 */             for (String str1 : this.e) {
/* 338 */               if (str1 != null && str1.equalsIgnoreCase(☃.getName())) {
/* 339 */                 str = str1;
/*     */                 break;
/*     */               } 
/*     */             } 
/* 343 */             if (str == null) {
/* 344 */               throw new act.a("Could not find the filename for " + ☃.getName() + " anymore");
/*     */             }
/* 346 */             return str;
/*     */           }
/*     */         };
/* 349 */       a(☃, Lists.newArrayList((Object[])arrayOfString), profileLookupCallback);
/* 350 */     } catch (a a) {
/* 351 */       e.error("Conversion failed, please try again later", a);
/* 352 */       return false;
/*     */     } 
/*     */     
/* 355 */     return true;
/*     */   }
/*     */   
/*     */   private static void b(File ☃) {
/* 359 */     if (☃.exists()) {
/* 360 */       if (☃.isDirectory()) {
/*     */         return;
/*     */       }
/* 363 */       throw new a("Can't create directory " + ☃.getName() + " in world save directory.");
/*     */     } 
/*     */     
/* 366 */     if (!☃.mkdirs()) {
/* 367 */       throw new a("Can't create directory " + ☃.getName() + " in world save directory.");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean e(MinecraftServer ☃) {
/* 373 */     boolean bool = b();
/* 374 */     bool = (bool && f(☃));
/* 375 */     return bool;
/*     */   }
/*     */   
/*     */   private static boolean b() {
/* 379 */     boolean ☃ = false;
/* 380 */     if (b.exists() && b.isFile()) {
/* 381 */       ☃ = true;
/*     */     }
/* 383 */     boolean bool1 = false;
/* 384 */     if (a.exists() && a.isFile()) {
/* 385 */       bool1 = true;
/*     */     }
/* 387 */     boolean bool2 = false;
/* 388 */     if (c.exists() && c.isFile()) {
/* 389 */       bool2 = true;
/*     */     }
/* 391 */     boolean bool3 = false;
/* 392 */     if (d.exists() && d.isFile()) {
/* 393 */       bool3 = true;
/*     */     }
/*     */     
/* 396 */     if (☃ || bool1 || bool2 || bool3) {
/* 397 */       e.warn("**** FAILED TO START THE SERVER AFTER ACCOUNT CONVERSION!");
/* 398 */       e.warn("** please remove the following files and restart the server:");
/* 399 */       if (☃) {
/* 400 */         e.warn("* {}", b.getName());
/*     */       }
/* 402 */       if (bool1) {
/* 403 */         e.warn("* {}", a.getName());
/*     */       }
/* 405 */       if (bool2) {
/* 406 */         e.warn("* {}", c.getName());
/*     */       }
/* 408 */       if (bool3) {
/* 409 */         e.warn("* {}", d.getName());
/*     */       }
/* 411 */       return false;
/*     */     } 
/* 413 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean f(MinecraftServer ☃) {
/* 417 */     File file = g(☃);
/* 418 */     if (file.exists() && file.isDirectory() && ((
/* 419 */       file.list()).length > 0 || !file.delete())) {
/* 420 */       e.warn("**** DETECTED OLD PLAYER DIRECTORY IN THE WORLD SAVE");
/* 421 */       e.warn("**** THIS USUALLY HAPPENS WHEN THE AUTOMATIC CONVERSION FAILED IN SOME WAY");
/* 422 */       e.warn("** please restart the server and if the problem persists, remove the directory '{}'", file.getPath());
/* 423 */       return false;
/*     */     } 
/*     */     
/* 426 */     return true;
/*     */   }
/*     */   
/*     */   private static File g(MinecraftServer ☃) {
/* 430 */     return ☃.a(cye.d).toFile();
/*     */   }
/*     */   
/*     */   private static void c(File ☃) {
/* 434 */     File file = new File(☃.getName() + ".converted");
/* 435 */     ☃.renameTo(file);
/*     */   }
/*     */   
/*     */   private static Date b(String ☃, Date date) {
/*     */     Date date1;
/*     */     try {
/* 441 */       date1 = acp.a.parse(☃);
/* 442 */     } catch (ParseException parseException) {
/* 443 */       date1 = date;
/*     */     } 
/* 445 */     return date1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\act.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */