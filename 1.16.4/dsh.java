/*     */ import com.google.gson.Gson;
/*     */ import com.google.gson.GsonBuilder;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.stream.JsonWriter;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.FileAttribute;
/*     */ import java.util.function.Function;
/*     */ import org.apache.commons.io.FileUtils;
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
/*     */ public class dsh
/*     */   extends dot
/*     */ {
/*  46 */   private static final Logger a = LogManager.getLogger();
/*  47 */   private static final Gson b = (new GsonBuilder()).setPrettyPrinting().serializeNulls().disableHtmlEscaping().create();
/*  48 */   private static final nr c = new of("selectWorld.enterName");
/*     */   
/*     */   private dlj p;
/*     */   
/*     */   private final BooleanConsumer q;
/*     */   private dlq r;
/*     */   private final cyg.a s;
/*     */   
/*     */   public dsh(BooleanConsumer ☃, cyg.a a1) {
/*  57 */     super(new of("selectWorld.edit.title"));
/*  58 */     this.q = ☃;
/*  59 */     this.s = a1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  64 */     this.r.a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  69 */     this.i.m.a(true);
/*  70 */     dlj ☃ = a(new dlj(this.k / 2 - 100, this.l / 4 + 0 + 5, 200, 20, new of("selectWorld.edit.resetIcon"), ☃ -> {
/*     */             FileUtils.deleteQuietly(this.s.f());
/*     */             ☃.o = false;
/*     */           }));
/*  74 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 24 + 5, 200, 20, new of("selectWorld.edit.openFolder"), ☃ -> x.i().a(this.s.a(cye.i).toFile())));
/*     */ 
/*     */     
/*  77 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 48 + 5, 200, 20, new of("selectWorld.edit.backup"), ☃ -> {
/*     */             boolean bool = a(this.s);
/*     */             
/*     */             this.q.accept(!bool);
/*     */           }));
/*  82 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 72 + 5, 200, 20, new of("selectWorld.edit.backupFolder"), ☃ -> {
/*     */             cyg cyg = this.i.k();
/*     */             Path path = cyg.d();
/*     */             try {
/*     */               Files.createDirectories(Files.exists(path, new java.nio.file.LinkOption[0]) ? path.toRealPath(new java.nio.file.LinkOption[0]) : path, (FileAttribute<?>[])new FileAttribute[0]);
/*  87 */             } catch (IOException iOException) {
/*     */               throw new RuntimeException(iOException);
/*     */             } 
/*     */             x.i().a(path.toFile());
/*     */           }));
/*  92 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 96 + 5, 200, 20, new of("selectWorld.edit.optimize"), ☃ -> this.i.a(new dno(this, (), new of("optimizeWorld.confirm.title"), new of("optimizeWorld.confirm.description"), true))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 120 + 5, 200, 20, new of("selectWorld.edit.export_worldgen_settings"), ☃ -> {
/*     */             DataResult<String> dataResult;
/*     */ 
/*     */ 
/*     */             
/*     */             gn.b b = gn.b();
/*     */ 
/*     */ 
/*     */             
/*     */             try (djz.b ☃ = this.i.a(b, djz::a, djz::a, false, this.s)) {
/*     */               DynamicOps<JsonElement> dynamicOps = vi.a((DynamicOps<JsonElement>)JsonOps.INSTANCE, b);
/*     */ 
/*     */ 
/*     */               
/*     */               DataResult<JsonElement> dataResult1 = chw.a.encodeStart(dynamicOps, b1.c().A());
/*     */ 
/*     */               
/*     */               dataResult = dataResult1.flatMap(());
/* 119 */             } catch (InterruptedException|java.util.concurrent.ExecutionException exception) {
/*     */               dataResult = DataResult.error("Could not parse level data!");
/*     */             } 
/*     */             
/*     */             nr nr1 = new oe((String)dataResult.get().map(Function.identity(), DataResult.PartialResult::message));
/*     */             nr nr2 = new of(dataResult.result().isPresent() ? "selectWorld.edit.export_worldgen_settings.success" : "selectWorld.edit.export_worldgen_settings.failure");
/*     */             dataResult.error().ifPresent(());
/*     */             this.i.an().a(dmp.a(this.i, dmp.a.d, nr2, nr1));
/*     */           }));
/* 128 */     this.p = a(new dlj(this.k / 2 - 100, this.l / 4 + 144 + 5, 98, 20, new of("selectWorld.edit.save"), ☃ -> h()));
/* 129 */     a(new dlj(this.k / 2 + 2, this.l / 4 + 144 + 5, 98, 20, nq.d, ☃ -> this.q.accept(false)));
/*     */     
/* 131 */     ☃.o = this.s.f().isFile();
/*     */     
/* 133 */     cyh cyh = this.s.d();
/* 134 */     String str = (cyh == null) ? "" : cyh.b();
/*     */     
/* 136 */     this.r = new dlq(this.o, this.k / 2 - 100, 38, 200, 20, new of("selectWorld.enterName"));
/* 137 */     this.r.a(str);
/* 138 */     this.r.a(☃ -> this.p.o = !☃.trim().isEmpty());
/* 139 */     this.e.add(this.r);
/*     */     
/* 141 */     b(this.r);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/* 146 */     String str = this.r.b();
/* 147 */     b(☃, i, j);
/* 148 */     this.r.a(str);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/* 153 */     this.q.accept(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 158 */     this.i.m.a(false);
/*     */   }
/*     */   
/*     */   private void h() {
/*     */     try {
/* 163 */       this.s.a(this.r.b().trim());
/* 164 */       this.q.accept(true);
/* 165 */     } catch (IOException ☃) {
/* 166 */       a.error("Failed to access world '{}'", this.s.a(), ☃);
/* 167 */       dmp.a(this.i, this.s.a());
/* 168 */       this.q.accept(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(cyg ☃, String str) {
/* 173 */     boolean bool = false;
/* 174 */     try (cyg.a ☃ = ☃.c(str)) {
/* 175 */       bool = true;
/* 176 */       a(a1);
/* 177 */     } catch (IOException iOException) {
/* 178 */       if (!bool) {
/* 179 */         dmp.a(djz.C(), str);
/*     */       }
/* 181 */       a.warn("Failed to create backup of level {}", str, iOException);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(cyg.a ☃) {
/* 187 */     long l = 0L;
/* 188 */     IOException iOException = null;
/*     */     try {
/* 190 */       l = ☃.h();
/* 191 */     } catch (IOException iOException1) {
/* 192 */       iOException = iOException1;
/*     */     } 
/*     */     
/* 195 */     if (iOException != null) {
/* 196 */       nr nr3 = new of("selectWorld.edit.backupFailed");
/* 197 */       nr nr4 = new oe(iOException.getMessage());
/* 198 */       djz.C().an().a(new dmp(dmp.a.c, nr3, nr4));
/* 199 */       return false;
/*     */     } 
/* 201 */     nr nr1 = new of("selectWorld.edit.backupCreated", new Object[] { ☃.a() });
/* 202 */     nr nr2 = new of("selectWorld.edit.backupSize", new Object[] { Integer.valueOf(afm.f(l / 1048576.0D)) });
/* 203 */     djz.C().an().a(new dmp(dmp.a.c, nr1, nr2));
/* 204 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 209 */     a(☃);
/*     */     
/* 211 */     a(☃, this.o, this.d, this.k / 2, 15, 16777215);
/* 212 */     b(☃, this.o, c, this.k / 2 - 100, 24, 10526880);
/*     */     
/* 214 */     this.r.a(☃, i, j, f);
/*     */     
/* 216 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */