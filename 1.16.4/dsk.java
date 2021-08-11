/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonParser;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalLong;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.util.tinyfd.TinyFileDialogs;
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
/*     */ public class dsk
/*     */   implements dmc, dmf
/*     */ {
/*  55 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  57 */   private static final nr c = new of("generator.custom");
/*  58 */   private static final nr d = new of("generator.amplified.info");
/*  59 */   private static final nr e = new of("selectWorld.mapFeatures.info");
/*     */   
/*  61 */   private dlu f = dlu.a;
/*     */   
/*     */   private dku g;
/*     */   
/*     */   private int h;
/*     */   
/*     */   private dlq i;
/*     */   private dlj j;
/*     */   public dlj a;
/*     */   private dlj k;
/*     */   private dlj l;
/*     */   private dlj m;
/*     */   private gn.b n;
/*     */   private chw o;
/*     */   private Optional<dsl> p;
/*     */   private OptionalLong q;
/*     */   
/*     */   public dsk(gn.b ☃, chw chw1, Optional<dsl> optional, OptionalLong optionalLong) {
/*  79 */     this.n = ☃;
/*  80 */     this.o = chw1;
/*  81 */     this.p = optional;
/*  82 */     this.q = optionalLong;
/*     */   }
/*     */   
/*     */   public void a(dsf ☃, djz djz1, dku dku1) {
/*  86 */     this.g = dku1;
/*  87 */     this.h = ☃.k;
/*     */     
/*  89 */     this.i = new dlq(this.g, this.h / 2 - 100, 60, 200, 20, new of("selectWorld.enterSeed"));
/*  90 */     this.i.a(a(this.q));
/*  91 */     this.i.a(☃ -> this.q = f());
/*  92 */     ☃.d(this.i);
/*     */     
/*  94 */     int i = this.h / 2 - 155;
/*  95 */     int j = this.h / 2 + 5;
/*  96 */     this.j = ☃.<dlj>a(new dlj(this, i, 100, 150, 20, new of("selectWorld.mapFeatures"), ☃ -> {
/*     */             this.o = this.o.k();
/*     */             ☃.c(250);
/*     */           })
/*     */         {
/*     */           public nr i() {
/* 102 */             return nq.a(super.i(), dsk.a(this.a).b());
/*     */           }
/*     */ 
/*     */           
/*     */           protected nx c() {
/* 107 */             return super.c().c(". ").a(new of("selectWorld.mapFeatures.info"));
/*     */           }
/*     */         });
/* 110 */     this.j.p = false;
/*     */     
/* 112 */     this.k = ☃.<dlj>a(new dlj(this, j, 100, 150, 20, new of("selectWorld.mapType"), dlj1 -> {
/*     */             while (this.p.isPresent()) {
/*     */               int i = dsl.c.indexOf(this.p.get()) + 1;
/*     */               
/*     */               if (i >= dsl.c.size()) {
/*     */                 i = 0;
/*     */               }
/*     */               
/*     */               dsl dsl = dsl.c.get(i);
/*     */               
/*     */               this.p = Optional.of(dsl);
/*     */               
/*     */               this.o = dsl.a(this.n, this.o.a(), this.o.b(), this.o.c());
/*     */               if (this.o.g() && !dot.y()) {
/*     */                 continue;
/*     */               }
/*     */               break;
/*     */             } 
/*     */             ☃.h();
/*     */             dlj1.c(250);
/*     */           })
/*     */         {
/*     */           public nr i()
/*     */           {
/* 136 */             return super.i().e().c(" ").a(dsk.b(this.a).map(dsl::a).orElse(dsk.c()));
/*     */           }
/*     */ 
/*     */           
/*     */           protected nx c() {
/* 141 */             if (Objects.equals(dsk.b(this.a), Optional.of(dsl.b))) {
/* 142 */               return super.c().c(". ").a(dsk.e());
/*     */             }
/* 144 */             return super.c();
/*     */           }
/*     */         });
/* 147 */     this.k.p = false;
/* 148 */     this.k.o = this.p.isPresent();
/*     */     
/* 150 */     this.l = ☃.<dlj>a(new dlj(j, 120, 150, 20, new of("selectWorld.customizeType"), dlj1 -> {
/*     */             dsl.a a = dsl.d.get(this.p);
/*     */             if (a != null) {
/*     */               ☃.a(a.createEditScreen(dsf1, this.o));
/*     */             }
/*     */           }));
/* 156 */     this.l.p = false;
/*     */     
/* 158 */     this.a = ☃.<dlj>a(new dlj(this, i, 151, 150, 20, new of("selectWorld.bonusItems"), ☃ -> { this.o = this.o.l(); ☃.c(250); }☃)
/*     */         {
/*     */ 
/*     */           
/*     */           public nr i()
/*     */           {
/* 164 */             return nq.a(super.i(), (dsk.a(this.b).c() && !this.a.a));
/*     */           }
/*     */         });
/* 167 */     this.a.p = false;
/*     */     
/* 169 */     this.m = ☃.<dlj>a(new dlj(i, 185, 150, 20, new of("selectWorld.import_worldgen_settings"), dlj1 -> {
/*     */             vz vz;
/*     */             
/*     */             DataResult<chw> dataResult;
/*     */             
/*     */             of of = new of("selectWorld.import_worldgen_settings.select_file");
/*     */             
/*     */             String str = TinyFileDialogs.tinyfd_openFileDialog(of.getString(), null, null, null, false);
/*     */             
/*     */             if (str == null) {
/*     */               return;
/*     */             }
/*     */             gn.b b1 = gn.b();
/*     */             abw abw = new abw(new aby[] { new abz(), new abt(☃.k().toFile(), abx.c) });
/*     */             try {
/*     */               MinecraftServer.a(abw, ☃.b, false);
/*     */               CompletableFuture<vz> completableFuture = vz.a(abw.f(), dc.a.c, 2, x.f(), djz1);
/*     */               djz1.c(completableFuture::isDone);
/*     */               vz = completableFuture.get();
/* 188 */             } catch (InterruptedException|java.util.concurrent.ExecutionException exception) {
/*     */               b.error("Error loading data packs when importing world settings", exception);
/*     */               
/*     */               nr nr1 = new of("selectWorld.import_worldgen_settings.failure");
/*     */               
/*     */               nr nr2 = new oe(exception.getMessage());
/*     */               djz1.an().a(dmp.a(djz1, dmp.a.d, nr1, nr2));
/*     */               abw.close();
/*     */               return;
/*     */             } 
/*     */             vh<JsonElement> vh = vh.a((DynamicOps<JsonElement>)JsonOps.INSTANCE, vz.h(), b1);
/*     */             JsonParser jsonParser = new JsonParser();
/*     */             try (BufferedReader ☃ = Files.newBufferedReader(Paths.get(str, new String[0]))) {
/*     */               JsonElement jsonElement = jsonParser.parse(bufferedReader);
/*     */               dataResult = chw.a.parse(vh, jsonElement);
/* 203 */             } catch (IOException|com.google.gson.JsonIOException|com.google.gson.JsonSyntaxException exception) {
/*     */               dataResult = DataResult.error("Failed to parse file: " + exception.getMessage());
/*     */             } 
/*     */ 
/*     */ 
/*     */             
/*     */             if (dataResult.error().isPresent()) {
/*     */               nr nr1 = new of("selectWorld.import_worldgen_settings.failure");
/*     */ 
/*     */ 
/*     */               
/*     */               String str1 = ((DataResult.PartialResult)dataResult.error().get()).message();
/*     */ 
/*     */ 
/*     */               
/*     */               b.error("Error parsing world settings: {}", str1);
/*     */ 
/*     */ 
/*     */               
/*     */               nr nr2 = new oe(str1);
/*     */ 
/*     */ 
/*     */               
/*     */               djz1.an().a(dmp.a(djz1, dmp.a.d, nr1, nr2));
/*     */             } 
/*     */ 
/*     */             
/*     */             vz.close();
/*     */ 
/*     */             
/*     */             Lifecycle lifecycle = dataResult.lifecycle();
/*     */ 
/*     */             
/*     */             dataResult.resultOrPartial(b::error).ifPresent(());
/*     */           }));
/*     */ 
/*     */     
/* 240 */     this.m.p = false;
/*     */     
/* 242 */     this.f = dlu.a(dku1, d, this.k.h());
/*     */   }
/*     */   
/*     */   private void a(gn.b ☃, chw chw1) {
/* 246 */     this.n = ☃;
/* 247 */     this.o = chw1;
/* 248 */     this.p = dsl.a(chw1);
/* 249 */     this.q = OptionalLong.of(chw1.a());
/* 250 */     this.i.a(a(this.q));
/* 251 */     this.k.o = this.p.isPresent();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 256 */     this.i.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 261 */     if (this.j.p) {
/* 262 */       this.g.a(☃, e, (this.h / 2 - 150), 122.0F, -6250336);
/*     */     }
/* 264 */     this.i.a(☃, i, j, f);
/*     */     
/* 266 */     if (this.p.equals(Optional.of(dsl.b))) {
/* 267 */       this.g.getClass(); this.f.b(☃, this.k.l + 2, this.k.m + 22, 9, 10526880);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(chw ☃) {
/* 272 */     this.o = ☃;
/*     */   }
/*     */   
/*     */   private static String a(OptionalLong ☃) {
/* 276 */     if (☃.isPresent()) {
/* 277 */       return Long.toString(☃.getAsLong());
/*     */     }
/* 279 */     return "";
/*     */   }
/*     */   
/*     */   private static OptionalLong a(String ☃) {
/*     */     try {
/* 284 */       return OptionalLong.of(Long.parseLong(☃));
/* 285 */     } catch (NumberFormatException numberFormatException) {
/*     */ 
/*     */       
/* 288 */       return OptionalLong.empty();
/*     */     } 
/*     */   }
/*     */   public chw a(boolean ☃) {
/* 292 */     OptionalLong optionalLong = f();
/*     */     
/* 294 */     return this.o.a(☃, optionalLong);
/*     */   }
/*     */   private OptionalLong f() {
/*     */     OptionalLong optionalLong;
/* 298 */     String ☃ = this.i.b();
/*     */     
/* 300 */     if (StringUtils.isEmpty(☃)) {
/* 301 */       optionalLong = OptionalLong.empty();
/*     */     } else {
/* 303 */       OptionalLong optionalLong1 = a(☃);
/* 304 */       if (optionalLong1.isPresent() && optionalLong1.getAsLong() != 0L) {
/* 305 */         optionalLong = optionalLong1;
/*     */       } else {
/* 307 */         optionalLong = OptionalLong.of(☃.hashCode());
/*     */       } 
/*     */     } 
/* 310 */     return optionalLong;
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 314 */     return this.o.g();
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 318 */     this.k.p = ☃;
/*     */     
/* 320 */     if (this.o.g()) {
/* 321 */       this.j.p = false;
/* 322 */       this.a.p = false;
/* 323 */       this.l.p = false;
/* 324 */       this.m.p = false;
/*     */     } else {
/* 326 */       this.j.p = ☃;
/* 327 */       this.a.p = ☃;
/* 328 */       this.l.p = (☃ && dsl.d.containsKey(this.p));
/* 329 */       this.m.p = ☃;
/*     */     } 
/*     */     
/* 332 */     this.i.i(☃);
/*     */   }
/*     */   
/*     */   public gn.b b() {
/* 336 */     return this.n;
/*     */   }
/*     */   
/*     */   void a(vz ☃) {
/* 340 */     gn.b b1 = gn.b();
/* 341 */     vi<JsonElement> vi = vi.a((DynamicOps<JsonElement>)JsonOps.INSTANCE, this.n);
/* 342 */     vh<JsonElement> vh = vh.a((DynamicOps<JsonElement>)JsonOps.INSTANCE, ☃.h(), b1);
/* 343 */     DataResult<chw> dataResult = chw.a.encodeStart(vi, this.o).flatMap(jsonElement -> chw.a.parse(☃, jsonElement));
/* 344 */     dataResult.resultOrPartial(x.a("Error parsing worldgen settings after loading data packs: ", b::error)).ifPresent(chw1 -> {
/*     */           this.o = chw1;
/*     */           this.n = ☃;
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */