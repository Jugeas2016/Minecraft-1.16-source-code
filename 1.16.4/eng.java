/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.authlib.GameProfileRepository;
/*     */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.UUID;
/*     */ import java.util.function.BooleanSupplier;
/*     */ import net.minecraft.client.ClientBrandRetriever;
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
/*     */ public class eng
/*     */   extends MinecraftServer
/*     */ {
/*  38 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final djz j;
/*     */   private boolean k;
/*  42 */   private int l = -1;
/*     */   private enj m;
/*     */   private UUID n;
/*     */   
/*     */   public eng(Thread ☃, djz djz1, gn.b b1, cyg.a a1, abw abw1, vz vz1, cyn cyn1, MinecraftSessionService minecraftSessionService, GameProfileRepository gameProfileRepository, acq acq1, aaq aaq1) {
/*  47 */     super(☃, b1, a1, cyn1, abw1, djz1.L(), djz1.ai(), vz1, minecraftSessionService, gameProfileRepository, acq1, aaq1);
/*     */     
/*  49 */     d(djz1.J().c());
/*  50 */     c(djz1.v());
/*  51 */     c(256);
/*  52 */     a(new enf(this, this.f, this.e));
/*     */     
/*  54 */     this.j = djz1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  59 */     a.info("Starting integrated minecraft server version " + w.a().getName());
/*     */     
/*  61 */     d(true);
/*  62 */     f(true);
/*  63 */     g(true);
/*     */     
/*  65 */     P();
/*     */     
/*  67 */     l_();
/*  68 */     e(N() + " - " + aX().g());
/*     */     
/*  70 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(BooleanSupplier ☃) {
/*  75 */     boolean bool = this.k;
/*  76 */     this.k = (djz.C().w() != null && djz.C().T());
/*     */     
/*  78 */     anw anw = aQ();
/*  79 */     if (!bool && this.k) {
/*  80 */       anw.a("autoSave");
/*  81 */       a.info("Saving and pausing game...");
/*  82 */       ae().h();
/*  83 */       a(false, false, false);
/*  84 */       anw.c();
/*     */     } 
/*     */     
/*  87 */     if (this.k) {
/*     */       return;
/*     */     }
/*     */     
/*  91 */     super.a(☃);
/*     */ 
/*     */     
/*  94 */     int i = Math.max(2, this.j.k.b + -1);
/*  95 */     if (i != ae().p()) {
/*  96 */       a.info("Changing view distance to {}, from {}", Integer.valueOf(i), Integer.valueOf(ae().p()));
/*  97 */       ae().a(i);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 103 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean R_() {
/* 108 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public File B() {
/* 113 */     return this.j.n;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean j() {
/* 118 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int k() {
/* 123 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l() {
/* 128 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(l ☃) {
/* 133 */     this.j.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public l b(l ☃) {
/* 138 */     ☃ = super.b(☃);
/*     */     
/* 140 */     ☃.g().a("Type", "Integrated Server (map_client.txt)");
/* 141 */     ☃.g().a("Is Modded", () -> (String)o().orElse("Probably not. Jar signature remains and both client + server brands are untouched."));
/*     */     
/* 143 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public Optional<String> o() {
/* 148 */     String ☃ = ClientBrandRetriever.getClientModName();
/* 149 */     if (!☃.equals("vanilla")) {
/* 150 */       return Optional.of("Definitely; Client brand changed to '" + ☃ + "'");
/*     */     }
/*     */     
/* 153 */     ☃ = getServerModName();
/* 154 */     if (!"vanilla".equals(☃)) {
/* 155 */       return Optional.of("Definitely; Server brand changed to '" + ☃ + "'");
/*     */     }
/*     */     
/* 158 */     if (djz.class.getSigners() == null) {
/* 159 */       return Optional.of("Very likely; Jar signature invalidated");
/*     */     }
/*     */     
/* 162 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apc ☃) {
/* 167 */     super.a(☃);
/*     */     
/* 169 */     ☃.a("snooper_partner", this.j.I().f());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bru ☃, boolean bool, int i) {
/*     */     try {
/* 180 */       af().a(null, i);
/* 181 */       a.info("Started serving on {}", Integer.valueOf(i));
/* 182 */       this.l = i;
/*     */       
/* 184 */       this.m = new enj(ab(), i + "");
/* 185 */       this.m.start();
/*     */       
/* 187 */       ae().a(☃);
/* 188 */       ae().b(bool);
/* 189 */       int j = b(this.j.s.eA());
/* 190 */       this.j.s.a(j);
/* 191 */       for (aah aah : ae().s()) {
/* 192 */         aD().a(aah);
/*     */       }
/*     */       
/* 195 */       return true;
/* 196 */     } catch (IOException iOException) {
/*     */       
/* 198 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void t() {
/* 203 */     super.t();
/*     */     
/* 205 */     if (this.m != null) {
/* 206 */       this.m.interrupt();
/* 207 */       this.m = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boolean ☃) {
/* 213 */     g(() -> {
/*     */           List<aah> ☃ = Lists.newArrayList(ae().s());
/*     */           
/*     */           for (aah aah : ☃) {
/*     */             if (!aah.bS().equals(this.n)) {
/*     */               ae().c(aah);
/*     */             }
/*     */           } 
/*     */         });
/*     */     
/* 223 */     super.a(☃);
/*     */     
/* 225 */     if (this.m != null) {
/* 226 */       this.m.interrupt();
/* 227 */       this.m = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n() {
/* 233 */     return (this.l > -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int M() {
/* 238 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bru ☃) {
/* 243 */     super.a(☃);
/* 244 */     ae().a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m() {
/* 249 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 254 */     return 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 259 */     return 2;
/*     */   }
/*     */   
/*     */   public void a(UUID ☃) {
/* 263 */     this.n = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(GameProfile ☃) {
/* 268 */     return ☃.getName().equalsIgnoreCase(N());
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(int ☃) {
/* 273 */     return (int)(this.j.k.c * ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aV() {
/* 278 */     return this.j.k.aW;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eng.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */