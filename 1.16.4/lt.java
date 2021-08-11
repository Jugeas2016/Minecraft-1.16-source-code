/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.arguments.StringArgumentType;
/*     */ import com.mojang.brigadier.builder.LiteralArgumentBuilder;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lt
/*     */ {
/*     */   public static void a(CommandDispatcher<db> ☃) {
/*  71 */     ☃.register(
/*  72 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("test")
/*  73 */         .then(
/*  74 */           dc.a("runthis")
/*  75 */           .executes(☃ -> a((db)☃.getSource()))))
/*     */         
/*  77 */         .then(
/*  78 */           dc.a("runthese")
/*  79 */           .executes(☃ -> b((db)☃.getSource()))))
/*     */         
/*  81 */         .then((
/*  82 */           (LiteralArgumentBuilder)dc.a("runfailed")
/*  83 */           .executes(☃ -> a((db)☃.getSource(), false, 0, 8)))
/*  84 */           .then(((RequiredArgumentBuilder)dc.<T>a("onlyRequiredTests", (ArgumentType<T>)BoolArgumentType.bool())
/*  85 */             .executes(☃ -> a((db)☃.getSource(), BoolArgumentType.getBool(☃, "onlyRequiredTests"), 0, 8)))
/*  86 */             .then(((RequiredArgumentBuilder)dc.<T>a("rotationSteps", (ArgumentType<T>)IntegerArgumentType.integer())
/*  87 */               .executes(☃ -> a((db)☃.getSource(), BoolArgumentType.getBool(☃, "onlyRequiredTests"), IntegerArgumentType.getInteger(☃, "rotationSteps"), 8)))
/*  88 */               .then(dc.<T>a("testsPerRow", (ArgumentType<T>)IntegerArgumentType.integer())
/*  89 */                 .executes(☃ -> a((db)☃.getSource(), BoolArgumentType.getBool(☃, "onlyRequiredTests"), IntegerArgumentType.getInteger(☃, "rotationSteps"), IntegerArgumentType.getInteger(☃, "testsPerRow"))))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  94 */         .then(
/*  95 */           dc.a("run")
/*  96 */           .then((
/*  97 */             (RequiredArgumentBuilder)dc.<T>a("testName", lv.a())
/*  98 */             .executes(☃ -> a((db)☃.getSource(), lv.a(☃, "testName"), 0)))
/*  99 */             .then(dc.<T>a("rotationSteps", (ArgumentType<T>)IntegerArgumentType.integer())
/* 100 */               .executes(☃ -> a((db)☃.getSource(), lv.a(☃, "testName"), IntegerArgumentType.getInteger(☃, "rotationSteps")))))))
/*     */ 
/*     */ 
/*     */         
/* 104 */         .then((
/* 105 */           (LiteralArgumentBuilder)((LiteralArgumentBuilder)dc.a("runall")
/* 106 */           .executes(☃ -> a((db)☃.getSource(), 0, 8)))
/* 107 */           .then((
/* 108 */             (RequiredArgumentBuilder)dc.<T>a("testClassName", ls.a())
/* 109 */             .executes(☃ -> a((db)☃.getSource(), ls.a(☃, "testClassName"), 0, 8)))
/* 110 */             .then(((RequiredArgumentBuilder)dc.<T>a("rotationSteps", (ArgumentType<T>)IntegerArgumentType.integer())
/* 111 */               .executes(☃ -> a((db)☃.getSource(), ls.a(☃, "testClassName"), IntegerArgumentType.getInteger(☃, "rotationSteps"), 8)))
/* 112 */               .then(dc.<T>a("testsPerRow", (ArgumentType<T>)IntegerArgumentType.integer())
/* 113 */                 .executes(☃ -> a((db)☃.getSource(), ls.a(☃, "testClassName"), IntegerArgumentType.getInteger(☃, "rotationSteps"), IntegerArgumentType.getInteger(☃, "testsPerRow")))))))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 118 */           .then(((RequiredArgumentBuilder)dc.<T>a("rotationSteps", (ArgumentType<T>)IntegerArgumentType.integer())
/* 119 */             .executes(☃ -> a((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "rotationSteps"), 8)))
/* 120 */             .then(dc.<T>a("testsPerRow", (ArgumentType<T>)IntegerArgumentType.integer())
/* 121 */               .executes(☃ -> a((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "rotationSteps"), IntegerArgumentType.getInteger(☃, "testsPerRow")))))))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 126 */         .then(
/* 127 */           dc.a("export")
/* 128 */           .then(
/* 129 */             dc.<T>a("testName", (ArgumentType<T>)StringArgumentType.word())
/* 130 */             .executes(☃ -> c((db)☃.getSource(), StringArgumentType.getString(☃, "testName"))))))
/*     */ 
/*     */         
/* 133 */         .then(
/* 134 */           dc.a("exportthis")
/* 135 */           .executes(☃ -> c((db)☃.getSource()))))
/*     */         
/* 137 */         .then(
/* 138 */           dc.a("import")
/* 139 */           .then(
/* 140 */             dc.<T>a("testName", (ArgumentType<T>)StringArgumentType.word())
/* 141 */             .executes(☃ -> d((db)☃.getSource(), StringArgumentType.getString(☃, "testName"))))))
/*     */ 
/*     */         
/* 144 */         .then((
/* 145 */           (LiteralArgumentBuilder)dc.a("pos")
/* 146 */           .executes(☃ -> a((db)☃.getSource(), "pos")))
/* 147 */           .then(
/* 148 */             dc.<T>a("var", (ArgumentType<T>)StringArgumentType.word())
/* 149 */             .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "var"))))))
/*     */ 
/*     */         
/* 152 */         .then(
/* 153 */           dc.a("create")
/* 154 */           .then((
/* 155 */             (RequiredArgumentBuilder)dc.<T>a("testName", (ArgumentType<T>)StringArgumentType.word())
/* 156 */             .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "testName"), 5, 5, 5)))
/* 157 */             .then((
/* 158 */               (RequiredArgumentBuilder)dc.<T>a("width", (ArgumentType<T>)IntegerArgumentType.integer())
/* 159 */               .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "testName"), IntegerArgumentType.getInteger(☃, "width"), IntegerArgumentType.getInteger(☃, "width"), IntegerArgumentType.getInteger(☃, "width"))))
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 164 */               .then(
/* 165 */                 dc.<T>a("height", (ArgumentType<T>)IntegerArgumentType.integer())
/* 166 */                 .then(
/* 167 */                   dc.<T>a("depth", (ArgumentType<T>)IntegerArgumentType.integer())
/* 168 */                   .executes(☃ -> a((db)☃.getSource(), StringArgumentType.getString(☃, "testName"), IntegerArgumentType.getInteger(☃, "width"), IntegerArgumentType.getInteger(☃, "height"), IntegerArgumentType.getInteger(☃, "depth")))))))))
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
/* 179 */         .then((
/* 180 */           (LiteralArgumentBuilder)dc.a("clearall")
/* 181 */           .executes(☃ -> a((db)☃.getSource(), 200)))
/* 182 */           .then(
/* 183 */             dc.<T>a("radius", (ArgumentType<T>)IntegerArgumentType.integer())
/* 184 */             .executes(☃ -> a((db)☃.getSource(), IntegerArgumentType.getInteger(☃, "radius"))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int a(db ☃, String str, int i, int j, int k) {
/* 191 */     if (i > 48 || j > 48 || k > 48) {
/* 192 */       throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
/*     */     }
/*     */     
/* 195 */     aag aag = ☃.e();
/* 196 */     fx fx1 = new fx(☃.d());
/* 197 */     fx fx2 = new fx(fx1.u(), ☃.e().a(chn.a.b, fx1).v(), fx1.w() + 3);
/*     */     
/* 199 */     lq.a(str.toLowerCase(), fx2, new fx(i, j, k), bzm.a, aag);
/*     */     
/* 201 */     for (int m = 0; m < i; m++) {
/* 202 */       for (int n = 0; n < k; n++) {
/* 203 */         fx fx = new fx(fx2.u() + m, fx2.v() + 1, fx2.w() + n);
/* 204 */         buo buo = bup.h;
/* 205 */         ef ef = new ef(buo.n(), Collections.EMPTY_SET, null);
/* 206 */         ef.a(aag, fx, 2);
/*     */       } 
/*     */     } 
/*     */     
/* 210 */     lq.a(fx2, new fx(1, 0, -1), bzm.a, aag);
/*     */     
/* 212 */     return 0;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, String str) throws CommandSyntaxException {
/* 216 */     dcj dcj = (dcj)☃.h().a(10.0D, 1.0F, false);
/*     */     
/* 218 */     fx fx1 = dcj.a();
/* 219 */     aag aag = ☃.e();
/*     */     
/* 221 */     Optional<fx> optional = lq.a(fx1, 15, aag);
/* 222 */     if (!optional.isPresent())
/*     */     {
/* 224 */       optional = lq.a(fx1, 200, aag);
/*     */     }
/*     */     
/* 227 */     if (!optional.isPresent()) {
/* 228 */       ☃.a(new oe("Can't find a structure block that contains the targeted pos " + fx1));
/* 229 */       return 0;
/*     */     } 
/* 231 */     cdj cdj = (cdj)aag.c(optional.get());
/*     */     
/* 233 */     fx fx2 = fx1.b(optional.get());
/* 234 */     String str1 = fx2.u() + ", " + fx2.v() + ", " + fx2.w();
/* 235 */     String str2 = cdj.f();
/*     */ 
/*     */     
/* 238 */     nr nr = (new oe(str1)).a(ob.a
/* 239 */         .a(Boolean.valueOf(true))
/* 240 */         .a(k.k)
/* 241 */         .a(new nv((nv.a)nv.a.a, (T)new oe("Click to copy to clipboard")))
/* 242 */         .a(new np(np.a.f, "final BlockPos " + str + " = new BlockPos(" + str1 + ");")));
/*     */     
/* 244 */     ☃.a((new oe("Position relative to " + str2 + ": ")).a(nr), false);
/*     */     
/* 246 */     rz.a(aag, new fx(fx1), str1, -2147418368, 10000);
/*     */     
/* 248 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃) {
/* 252 */     fx fx1 = new fx(☃.d());
/* 253 */     aag aag = ☃.e();
/* 254 */     fx fx2 = lq.b(fx1, 15, aag);
/* 255 */     if (fx2 == null) {
/* 256 */       a(aag, "Couldn't find any structure block within 15 radius", k.m);
/* 257 */       return 0;
/*     */     } 
/*     */     
/* 260 */     li.a(aag);
/*     */     
/* 262 */     a(aag, fx2, (lp)null);
/*     */     
/* 264 */     return 1;
/*     */   }
/*     */   
/*     */   private static int b(db ☃) {
/* 268 */     fx fx = new fx(☃.d());
/* 269 */     aag aag = ☃.e();
/* 270 */     Collection<fx> collection = lq.c(fx, 200, aag);
/*     */     
/* 272 */     if (collection.isEmpty()) {
/* 273 */       a(aag, "Couldn't find any structure blocks within 200 block radius", k.m);
/* 274 */       return 1;
/*     */     } 
/*     */     
/* 277 */     li.a(aag);
/*     */     
/* 279 */     b(☃, "Running " + collection.size() + " tests...");
/*     */     
/* 281 */     lp lp = new lp();
/* 282 */     collection.forEach(fx1 -> a(☃, fx1, lp1));
/*     */     
/* 284 */     return 1;
/*     */   }
/*     */   
/*     */   private static void a(aag ☃, fx fx1, @Nullable lp lp1) {
/* 288 */     cdj cdj = (cdj)☃.c(fx1);
/* 289 */     String str = cdj.f();
/* 290 */     lu lu = lh.e(str);
/* 291 */     lf lf = new lf(lu, cdj.l(), ☃);
/* 292 */     if (lp1 != null) {
/* 293 */       lp1.a(lf);
/* 294 */       lf.a(new a(☃, lp1));
/*     */     } 
/* 296 */     a(lu, ☃);
/* 297 */     dci dci = lq.a(cdj);
/* 298 */     fx fx2 = new fx(dci.a, dci.b, dci.c);
/* 299 */     li.a(lf, fx2, ll.a);
/*     */   }
/*     */   
/*     */   private static void b(aag ☃, lp lp1) {
/* 303 */     if (lp1.i()) {
/* 304 */       a(☃, "GameTest done! " + lp1.h() + " tests were run", k.p);
/* 305 */       if (lp1.d()) {
/* 306 */         a(☃, "" + lp1.a() + " required tests failed :(", k.m);
/*     */       } else {
/* 308 */         a(☃, "All required tests passed :)", k.k);
/*     */       } 
/* 310 */       if (lp1.e()) {
/* 311 */         a(☃, "" + lp1.b() + " optional tests failed", k.h);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(db ☃, int i) {
/* 317 */     aag aag = ☃.e();
/* 318 */     li.a(aag);
/* 319 */     fx fx = new fx((☃.d()).b, ☃.e().a(chn.a.b, new fx(☃.d())).v(), (☃.d()).d);
/* 320 */     li.a(aag, fx, ll.a, afm.a(i, 0, 1024));
/* 321 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, lu lu1, int i) {
/* 325 */     aag aag = ☃.e();
/* 326 */     fx fx1 = new fx(☃.d());
/* 327 */     int j = ☃.e().a(chn.a.b, fx1).v();
/* 328 */     fx fx2 = new fx(fx1.u(), j, fx1.w() + 3);
/* 329 */     li.a(aag);
/* 330 */     a(lu1, aag);
/* 331 */     bzm bzm = lq.a(i);
/* 332 */     lf lf = new lf(lu1, bzm, aag);
/* 333 */     li.a(lf, fx2, ll.a);
/* 334 */     return 1;
/*     */   }
/*     */   
/*     */   private static void a(lu ☃, aag aag1) {
/* 338 */     Consumer<aag> consumer = lh.c(☃.e());
/* 339 */     if (consumer != null) {
/* 340 */       consumer.accept(aag1);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int a(db ☃, int i, int j) {
/* 345 */     li.a(☃.e());
/* 346 */     Collection<lu> collection = lh.a();
/* 347 */     b(☃, "Running all " + collection.size() + " tests...");
/* 348 */     lh.d();
/* 349 */     a(☃, collection, i, j);
/* 350 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, String str, int i, int j) {
/* 354 */     Collection<lu> collection = lh.a(str);
/* 355 */     li.a(☃.e());
/* 356 */     b(☃, "Running " + collection.size() + " tests from " + str + "...");
/* 357 */     lh.d();
/* 358 */     a(☃, collection, i, j);
/* 359 */     return 1;
/*     */   }
/*     */   
/*     */   private static int a(db ☃, boolean bool, int i, int j) {
/*     */     Collection<lu> collection;
/* 364 */     if (bool) {
/* 365 */       collection = (Collection<lu>)lh.c().stream().filter(lu::d).collect(Collectors.toList());
/*     */     } else {
/* 367 */       collection = lh.c();
/*     */     } 
/* 369 */     if (collection.isEmpty()) {
/* 370 */       b(☃, "No failed tests to rerun");
/* 371 */       return 0;
/*     */     } 
/* 373 */     li.a(☃.e());
/* 374 */     b(☃, "Rerunning " + collection.size() + " failed tests (" + (bool ? "only required tests" : "including optional tests") + ")");
/* 375 */     a(☃, collection, i, j);
/* 376 */     return 1;
/*     */   }
/*     */   
/*     */   private static void a(db ☃, Collection<lu> collection, int i, int j) {
/* 380 */     fx fx1 = new fx(☃.d());
/* 381 */     fx fx2 = new fx(fx1.u(), ☃.e().a(chn.a.b, fx1).v(), fx1.w() + 3);
/* 382 */     aag aag = ☃.e();
/* 383 */     bzm bzm = lq.a(i);
/* 384 */     Collection<lf> collection1 = li.b(collection, fx2, bzm, aag, ll.a, j);
/* 385 */     lp lp = new lp(collection1);
/* 386 */     lp.a(new a(aag, lp));
/* 387 */     lp.a(☃ -> lh.a(☃.u()));
/*     */   }
/*     */   
/*     */   private static void b(db ☃, String str) {
/* 391 */     ☃.a(new oe(str), false);
/*     */   }
/*     */   
/*     */   private static int c(db ☃) {
/* 395 */     fx fx1 = new fx(☃.d());
/* 396 */     aag aag = ☃.e();
/* 397 */     fx fx2 = lq.b(fx1, 15, aag);
/* 398 */     if (fx2 == null) {
/* 399 */       a(aag, "Couldn't find any structure block within 15 radius", k.m);
/* 400 */       return 0;
/*     */     } 
/* 402 */     cdj cdj = (cdj)aag.c(fx2);
/* 403 */     String str = cdj.f();
/* 404 */     return c(☃, str);
/*     */   }
/*     */   
/*     */   private static int c(db ☃, String str) {
/* 408 */     Path path1 = Paths.get(lq.a, new String[0]);
/*     */     
/* 410 */     vk vk = new vk("minecraft", str);
/* 411 */     Path path2 = ☃.e().n().a(vk, ".nbt");
/* 412 */     Path path3 = jo.a(path2, str, path1);
/* 413 */     if (path3 == null) {
/* 414 */       b(☃, "Failed to export " + path2);
/* 415 */       return 1;
/*     */     } 
/*     */     
/*     */     try {
/* 419 */       Files.createDirectories(path3.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 420 */     } catch (IOException iOException) {
/* 421 */       b(☃, "Could not create folder " + path3.getParent());
/* 422 */       iOException.printStackTrace();
/* 423 */       return 1;
/*     */     } 
/*     */     
/* 426 */     b(☃, "Exported " + str + " to " + path3.toAbsolutePath());
/* 427 */     return 0;
/*     */   }
/*     */   
/*     */   private static int d(db ☃, String str) {
/* 431 */     Path path1 = Paths.get(lq.a, new String[] { str + ".snbt" });
/*     */     
/* 433 */     vk vk = new vk("minecraft", str);
/* 434 */     Path path2 = ☃.e().n().a(vk, ".nbt");
/*     */     
/*     */     try {
/* 437 */       BufferedReader bufferedReader = Files.newBufferedReader(path1);
/* 438 */       String str1 = IOUtils.toString(bufferedReader);
/* 439 */       Files.createDirectories(path2.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/* 440 */       try (OutputStream ☃ = Files.newOutputStream(path2, new java.nio.file.OpenOption[0])) {
/* 441 */         mn.a(mu.a(str1), outputStream);
/*     */       } 
/* 443 */       b(☃, "Imported to " + path2.toAbsolutePath());
/* 444 */       return 0;
/* 445 */     } catch (IOException|CommandSyntaxException exception) {
/* 446 */       System.err.println("Failed to load structure " + str);
/* 447 */       exception.printStackTrace();
/* 448 */       return 1;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(aag ☃, String str, k k1) {
/* 453 */     ☃.a(☃ -> true).forEach(aah1 -> aah1.a(new oe(☃ + str), x.b));
/*     */   }
/*     */   
/*     */   static class a
/*     */     implements lg
/*     */   {
/*     */     private final aag a;
/*     */     private final lp b;
/*     */     
/*     */     public a(aag ☃, lp lp1) {
/* 463 */       this.a = ☃;
/* 464 */       this.b = lp1;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void a(lf ☃) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void c(lf ☃) {
/* 478 */       lt.a(this.a, this.b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\lt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */