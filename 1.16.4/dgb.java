/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ public class dgb
/*     */ {
/*     */   public enum b
/*     */   {
/*  38 */     a("pc.realms.minecraft.net", "https"),
/*  39 */     b("pc-stage.realms.minecraft.net", "https"),
/*  40 */     c("localhost:8080", "http");
/*     */     
/*     */     public String d;
/*     */     public String e;
/*     */     
/*     */     b(String ☃, String str1) {
/*  46 */       this.d = ☃;
/*  47 */       this.e = str1;
/*     */     }
/*     */   }
/*     */   
/*  51 */   public static b a = b.a;
/*     */   
/*     */   private static boolean b;
/*  54 */   private static final Logger c = LogManager.getLogger();
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
/*     */   private final String d;
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
/*     */   private final String e;
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
/*     */   private final djz f;
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
/* 101 */   private static final dgi g = new dgi();
/*     */   
/*     */   public static dgb a() {
/* 104 */     djz ☃ = djz.C();
/* 105 */     String str1 = ☃.J().c();
/* 106 */     String str2 = ☃.J().a();
/*     */     
/* 108 */     if (!b) {
/* 109 */       b = true;
/*     */       
/* 111 */       String str = System.getenv("realms.environment");
/*     */       
/* 113 */       if (str == null) {
/* 114 */         str = System.getProperty("realms.environment");
/*     */       }
/*     */       
/* 117 */       if (str != null) {
/* 118 */         if ("LOCAL".equals(str)) {
/* 119 */           d();
/* 120 */         } else if ("STAGE".equals(str)) {
/* 121 */           b();
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 126 */     return new dgb(str2, str1, ☃);
/*     */   }
/*     */   
/*     */   public static void b() {
/* 130 */     a = b.b;
/*     */   }
/*     */   
/*     */   public static void c() {
/* 134 */     a = b.a;
/*     */   }
/*     */   
/*     */   public static void d() {
/* 138 */     a = b.c;
/*     */   }
/*     */   
/*     */   public dgb(String ☃, String str1, djz djz1) {
/* 142 */     this.d = ☃;
/* 143 */     this.e = str1;
/* 144 */     this.f = djz1;
/*     */     
/* 146 */     dgc.a(djz1.L());
/*     */   }
/*     */   
/*     */   public dgs e() throws dhi {
/* 150 */     String ☃ = c("worlds");
/* 151 */     String str1 = a(dge.a(☃));
/* 152 */     return dgs.a(str1);
/*     */   }
/*     */   
/*     */   public dgq a(long ☃) throws dhi {
/* 156 */     String str1 = c("worlds" + "/$ID".replace("$ID", String.valueOf(☃)));
/* 157 */     String str2 = a(dge.a(str1));
/* 158 */     return dgq.c(str2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public dgv f() throws dhi {
/* 168 */     String ☃ = c("activities/liveplayerlist");
/* 169 */     String str1 = a(dge.a(☃));
/* 170 */     return dgv.a(str1);
/*     */   }
/*     */   
/*     */   public dgr b(long ☃) throws dhi {
/* 174 */     String str1 = c("worlds" + "/v1/$ID/join/pc".replace("$ID", "" + ☃));
/* 175 */     String str2 = a(dge.a(str1, 5000, 30000));
/* 176 */     return dgr.a(str2);
/*     */   }
/*     */   
/*     */   public void a(long ☃, String str1, String str2) throws dhi {
/* 180 */     dgo dgo = new dgo(str1, str2);
/* 181 */     String str3 = c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf(☃)));
/* 182 */     String str4 = g.a(dgo);
/* 183 */     a(dge.a(str3, str4, 5000, 10000));
/*     */   }
/*     */   
/*     */   public Boolean g() throws dhi {
/* 187 */     String ☃ = c("mco/available");
/* 188 */     String str1 = a(dge.a(☃));
/* 189 */     return Boolean.valueOf(str1);
/*     */   }
/*     */   
/*     */   public Boolean h() throws dhi {
/* 193 */     String ☃ = c("mco/stageAvailable");
/* 194 */     String str1 = a(dge.a(☃));
/* 195 */     return Boolean.valueOf(str1);
/*     */   }
/*     */   public a i() throws dhi {
/*     */     a a;
/* 199 */     String ☃ = c("mco/client/compatible");
/* 200 */     String str1 = a(dge.a(☃));
/*     */ 
/*     */     
/*     */     try {
/* 204 */       a = a.valueOf(str1);
/* 205 */     } catch (IllegalArgumentException illegalArgumentException) {
/* 206 */       throw new dhi(500, "Could not check compatible version, got response: " + str1, -1, "");
/*     */     } 
/*     */     
/* 209 */     return a;
/*     */   }
/*     */   
/*     */   public void a(long ☃, String str) throws dhi {
/* 213 */     String str1 = c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf(☃)).replace("$UUID", str));
/* 214 */     a(dge.b(str1));
/*     */   }
/*     */   
/*     */   public void c(long ☃) throws dhi {
/* 218 */     String str = c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(☃)));
/* 219 */     a(dge.b(str));
/*     */   }
/*     */   
/*     */   public dgq b(long ☃, String str) throws dhi {
/* 223 */     dgn dgn = new dgn();
/* 224 */     dgn.a(str);
/*     */     
/* 226 */     String str1 = c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(☃)));
/* 227 */     String str2 = a(dge.b(str1, g.a(dgn)));
/* 228 */     return dgq.c(str2);
/*     */   }
/*     */   
/*     */   public dgh d(long ☃) throws dhi {
/* 232 */     String str1 = c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(☃)));
/* 233 */     String str2 = a(dge.a(str1));
/* 234 */     return dgh.a(str2);
/*     */   }
/*     */   
/*     */   public void b(long ☃, String str1, String str2) throws dhi {
/* 238 */     dgo dgo = new dgo(str1, str2);
/* 239 */     String str = c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(☃)));
/* 240 */     a(dge.b(str, g.a(dgo)));
/*     */   }
/*     */   
/*     */   public void a(long ☃, int i, dgw dgw1) throws dhi {
/* 244 */     String str1 = c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(☃)).replace("$SLOT_ID", String.valueOf(i)));
/* 245 */     String str2 = dgw1.c();
/* 246 */     a(dge.b(str1, str2));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(long ☃, int i) throws dhi {
/* 251 */     String str1 = c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(☃)).replace("$SLOT_ID", String.valueOf(i)));
/* 252 */     String str2 = a(dge.c(str1, ""));
/* 253 */     return Boolean.valueOf(str2).booleanValue();
/*     */   }
/*     */   
/*     */   public void c(long ☃, String str) throws dhi {
/* 257 */     String str1 = a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(☃)), "backupId=" + str);
/* 258 */     a(dge.b(str1, "", 40000, 600000));
/*     */   }
/*     */   
/*     */   public dhf a(int ☃, int i, dgq.c c1) throws dhi {
/* 262 */     String str1 = a("worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", c1.toString()), String.format("page=%d&pageSize=%d", new Object[] { Integer.valueOf(☃), Integer.valueOf(i) }));
/* 263 */     String str2 = a(dge.a(str1));
/* 264 */     return dhf.a(str2);
/*     */   }
/*     */   
/*     */   public Boolean d(long ☃, String str) throws dhi {
/* 268 */     String str1 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", str).replace("$WORLD_ID", String.valueOf(☃));
/* 269 */     String str2 = c("worlds" + str1);
/* 270 */     return Boolean.valueOf(a(dge.c(str2, "")));
/*     */   }
/*     */   
/*     */   public dgj e(long ☃, String str) throws dhi {
/* 274 */     String str1 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(☃)).replace("$PROFILE_UUID", str);
/* 275 */     String str2 = c("ops" + str1);
/* 276 */     return dgj.a(a(dge.b(str2, "")));
/*     */   }
/*     */   
/*     */   public dgj f(long ☃, String str) throws dhi {
/* 280 */     String str1 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(☃)).replace("$PROFILE_UUID", str);
/* 281 */     String str2 = c("ops" + str1);
/* 282 */     return dgj.a(a(dge.b(str2)));
/*     */   }
/*     */   
/*     */   public Boolean e(long ☃) throws dhi {
/* 286 */     String str1 = c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(☃)));
/* 287 */     String str2 = a(dge.c(str1, ""));
/* 288 */     return Boolean.valueOf(str2);
/*     */   }
/*     */   
/*     */   public Boolean f(long ☃) throws dhi {
/* 292 */     String str1 = c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(☃)));
/* 293 */     String str2 = a(dge.c(str1, ""));
/* 294 */     return Boolean.valueOf(str2);
/*     */   }
/*     */   
/*     */   public Boolean a(long ☃, String str, Integer integer, boolean bool) throws dhi {
/* 298 */     dgx dgx = new dgx(str, -1L, integer.intValue(), bool);
/* 299 */     String str1 = c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(☃)));
/* 300 */     String str2 = a(dge.a(str1, g.a(dgx), 30000, 80000));
/* 301 */     return Boolean.valueOf(str2);
/*     */   }
/*     */   
/*     */   public Boolean g(long ☃, String str) throws dhi {
/* 305 */     dgx dgx = new dgx(null, Long.valueOf(str).longValue(), -1, false);
/* 306 */     String str1 = c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(☃)));
/* 307 */     String str2 = a(dge.a(str1, g.a(dgx), 30000, 80000));
/* 308 */     return Boolean.valueOf(str2);
/*     */   }
/*     */   
/*     */   public dha g(long ☃) throws dhi {
/* 312 */     String str1 = c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(☃)));
/* 313 */     String str2 = a(dge.a(str1));
/* 314 */     return dha.a(str2);
/*     */   }
/*     */ 
/*     */   
/*     */   public int j() throws dhi {
/* 319 */     return (k()).a.size();
/*     */   }
/*     */   
/*     */   public dgl k() throws dhi {
/* 323 */     String ☃ = c("invites/pending");
/* 324 */     String str1 = a(dge.a(☃));
/* 325 */     dgl dgl = dgl.a(str1);
/* 326 */     dgl.a.removeIf(this::a);
/* 327 */     return dgl;
/*     */   }
/*     */   
/*     */   private boolean a(dgk ☃) {
/*     */     try {
/* 332 */       UUID uUID = UUID.fromString(☃.d);
/* 333 */       return this.f.aB().e(uUID);
/* 334 */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       
/* 336 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(String ☃) throws dhi {
/* 341 */     String str = c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", ☃));
/* 342 */     a(dge.c(str, ""));
/*     */   }
/*     */   
/*     */   public dhd b(long ☃, int i) throws dhi {
/* 346 */     String str1 = c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf(☃)).replace("$SLOT_ID", String.valueOf(i)));
/* 347 */     String str2 = a(dge.a(str1));
/* 348 */     return dhd.a(str2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dhb h(long ☃, @Nullable String str) throws dhi {
/* 353 */     String str1 = c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf(☃)));
/* 354 */     return dhb.a(a(dge.c(str1, dhb.b(str))));
/*     */   }
/*     */   
/*     */   public void b(String ☃) throws dhi {
/* 358 */     String str = c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", ☃));
/* 359 */     a(dge.c(str, ""));
/*     */   }
/*     */   
/*     */   public void l() throws dhi {
/* 363 */     String ☃ = c("mco/tos/agreed");
/* 364 */     a(dge.b(☃, ""));
/*     */   }
/*     */   
/*     */   public dgp m() throws dhi {
/* 368 */     String ☃ = c("mco/v1/news");
/* 369 */     String str1 = a(dge.a(☃, 5000, 10000));
/* 370 */     return dgp.a(str1);
/*     */   }
/*     */   
/*     */   public void a(dgm ☃) throws dhi {
/* 374 */     String str = c("regions/ping/stat");
/* 375 */     a(dge.b(str, g.a(☃)));
/*     */   }
/*     */   
/*     */   public Boolean n() throws dhi {
/* 379 */     String ☃ = c("trial");
/* 380 */     String str1 = a(dge.a(☃));
/* 381 */     return Boolean.valueOf(str1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void h(long ☃) throws dhi {
/* 389 */     String str = c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(☃)));
/* 390 */     a(dge.b(str));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private String c(String ☃) {
/* 395 */     return a(☃, (String)null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private String a(String ☃, @Nullable String str1) {
/*     */     try {
/* 401 */       return (new URI(a.e, a.d, "/" + ☃, str1, null)).toASCIIString();
/* 402 */     } catch (URISyntaxException uRISyntaxException) {
/* 403 */       uRISyntaxException.printStackTrace();
/* 404 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private String a(dge<?> ☃) throws dhi {
/* 409 */     ☃.a("sid", this.d);
/* 410 */     ☃.a("user", this.e);
/* 411 */     ☃.a("version", w.a().getName());
/*     */     
/*     */     try {
/* 414 */       int i = ☃.b();
/*     */       
/* 416 */       if (i == 503 || i == 277) {
/* 417 */         int j = ☃.a();
/* 418 */         throw new dhj(j, i);
/*     */       } 
/*     */       
/* 421 */       String str = ☃.c();
/*     */       
/* 423 */       if (i < 200 || i >= 300) {
/* 424 */         if (i == 401) {
/* 425 */           String str1 = ☃.c("WWW-Authenticate");
/* 426 */           c.info("Could not authorize you against Realms server: " + str1);
/* 427 */           throw new dhi(i, str1, -1, str1);
/*     */         } 
/*     */         
/* 430 */         if (str == null || str.length() == 0) {
/* 431 */           c.error("Realms error code: " + i + " message: " + str);
/* 432 */           throw new dhi(i, str, i, "");
/*     */         } 
/* 434 */         dgd dgd = dgd.a(str);
/* 435 */         c.error("Realms http code: " + i + " -  error code: " + dgd.b() + " -  message: " + dgd.a() + " - raw body: " + str);
/* 436 */         throw new dhi(i, str, dgd);
/*     */       } 
/*     */ 
/*     */       
/* 440 */       return str;
/* 441 */     } catch (dhh dhh) {
/* 442 */       throw new dhi(500, "Could not connect to Realms: " + dhh.getMessage(), -1, "");
/*     */     } 
/*     */   }
/*     */   
/*     */   public enum a {
/* 447 */     a,
/* 448 */     b,
/* 449 */     c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */