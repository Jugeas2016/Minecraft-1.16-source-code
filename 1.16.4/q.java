/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.bridge.game.GameVersion;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.time.ZonedDateTime;
/*     */ import java.util.Date;
/*     */ import java.util.UUID;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class q
/*     */   implements GameVersion
/*     */ {
/*  18 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  20 */   public static final GameVersion a = new q();
/*     */   
/*     */   private final String c;
/*     */   private final String d;
/*     */   private final boolean e;
/*     */   private final int f;
/*     */   private final int g;
/*     */   private final int h;
/*     */   private final Date i;
/*     */   private final String j;
/*     */   
/*     */   private q() {
/*  32 */     this.c = UUID.randomUUID().toString().replaceAll("-", "");
/*  33 */     this.d = "1.16.4";
/*  34 */     this.e = true;
/*  35 */     this.f = 2584;
/*  36 */     this.g = w.b();
/*  37 */     this.h = 6;
/*  38 */     this.i = new Date();
/*  39 */     this.j = "1.16.4";
/*     */   }
/*     */   
/*     */   private q(JsonObject ☃) {
/*  43 */     this.c = afd.h(☃, "id");
/*  44 */     this.d = afd.h(☃, "name");
/*  45 */     this.j = afd.h(☃, "release_target");
/*  46 */     this.e = afd.j(☃, "stable");
/*  47 */     this.f = afd.n(☃, "world_version");
/*  48 */     this.g = afd.n(☃, "protocol_version");
/*  49 */     this.h = afd.n(☃, "pack_version");
/*  50 */     this.i = Date.from(ZonedDateTime.parse(afd.h(☃, "build_time")).toInstant());
/*     */   }
/*     */   
/*     */   public static GameVersion a() {
/*  54 */     try (InputStream ☃ = q.class.getResourceAsStream("/version.json")) {
/*  55 */       if (☃ == null) {
/*  56 */         b.warn("Missing version information!");
/*  57 */         return a;
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/*  63 */     catch (IOException|com.google.gson.JsonParseException ☃) {
/*  64 */       throw new IllegalStateException("Game version information is corrupt", ☃);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String getId() {
/*  70 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/*  75 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getReleaseTarget() {
/*  80 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getWorldVersion() {
/*  85 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getProtocolVersion() {
/*  90 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPackVersion() {
/*  95 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getBuildTime() {
/* 100 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isStable() {
/* 105 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */