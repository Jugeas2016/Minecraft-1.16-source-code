/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.Objects;
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
/*     */ public class dgw
/*     */   extends dhc
/*     */ {
/*     */   public Boolean a;
/*     */   public Boolean b;
/*     */   public Boolean c;
/*     */   public Boolean d;
/*     */   public Integer e;
/*     */   public Boolean f;
/*     */   public Boolean g;
/*     */   public Integer h;
/*     */   public Integer i;
/*     */   public String j;
/*     */   public long k;
/*     */   public String l;
/*     */   public boolean m;
/*     */   public boolean n;
/*  41 */   private static final String o = null;
/*     */ 
/*     */   
/*     */   public dgw(Boolean ☃, Boolean bool1, Boolean bool2, Boolean bool3, Integer integer1, Boolean bool4, Integer integer2, Integer integer3, Boolean bool5, String str) {
/*  45 */     this.a = ☃;
/*  46 */     this.b = bool1;
/*  47 */     this.c = bool2;
/*  48 */     this.d = bool3;
/*  49 */     this.e = integer1;
/*  50 */     this.f = bool4;
/*  51 */     this.h = integer2;
/*  52 */     this.i = integer3;
/*  53 */     this.g = bool5;
/*  54 */     this.j = str;
/*     */   }
/*     */   
/*     */   public static dgw a() {
/*  58 */     return new dgw(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(2), Integer.valueOf(0), Boolean.valueOf(false), "");
/*     */   }
/*     */   
/*     */   public static dgw b() {
/*  62 */     dgw ☃ = a();
/*  63 */     ☃.a(true);
/*  64 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*  68 */     this.n = ☃;
/*     */   }
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
/*     */   public static dgw a(JsonObject ☃) {
/*  82 */     dgw dgw1 = new dgw(Boolean.valueOf(dip.a("pvp", ☃, true)), Boolean.valueOf(dip.a("spawnAnimals", ☃, true)), Boolean.valueOf(dip.a("spawnMonsters", ☃, true)), Boolean.valueOf(dip.a("spawnNPCs", ☃, true)), Integer.valueOf(dip.a("spawnProtection", ☃, 0)), Boolean.valueOf(dip.a("commandBlocks", ☃, false)), Integer.valueOf(dip.a("difficulty", ☃, 2)), Integer.valueOf(dip.a("gameMode", ☃, 0)), Boolean.valueOf(dip.a("forceGameMode", ☃, false)), dip.a("slotName", ☃, ""));
/*     */ 
/*     */     
/*  85 */     dgw1.k = dip.a("worldTemplateId", ☃, -1L);
/*  86 */     dgw1.l = dip.a("worldTemplateImage", ☃, o);
/*  87 */     dgw1.m = dip.a("adventureMap", ☃, false);
/*     */     
/*  89 */     return dgw1;
/*     */   }
/*     */   
/*     */   public String a(int ☃) {
/*  93 */     if (this.j == null || this.j.isEmpty()) {
/*  94 */       if (this.n) {
/*  95 */         return ekx.a("mco.configure.world.slot.empty", new Object[0]);
/*     */       }
/*     */       
/*  98 */       return b(☃);
/*     */     } 
/* 100 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public String b(int ☃) {
/* 105 */     return ekx.a("mco.configure.world.slot", new Object[] { Integer.valueOf(☃) });
/*     */   }
/*     */   
/*     */   public String c() {
/* 109 */     JsonObject ☃ = new JsonObject();
/*     */     
/* 111 */     if (this.a.booleanValue() != true) {
/* 112 */       ☃.addProperty("pvp", this.a);
/*     */     }
/*     */     
/* 115 */     if (this.b.booleanValue() != true) {
/* 116 */       ☃.addProperty("spawnAnimals", this.b);
/*     */     }
/*     */     
/* 119 */     if (this.c.booleanValue() != true) {
/* 120 */       ☃.addProperty("spawnMonsters", this.c);
/*     */     }
/*     */     
/* 123 */     if (this.d.booleanValue() != true) {
/* 124 */       ☃.addProperty("spawnNPCs", this.d);
/*     */     }
/*     */     
/* 127 */     if (this.e.intValue() != 0) {
/* 128 */       ☃.addProperty("spawnProtection", this.e);
/*     */     }
/*     */     
/* 131 */     if (this.f.booleanValue()) {
/* 132 */       ☃.addProperty("commandBlocks", this.f);
/*     */     }
/*     */     
/* 135 */     if (this.h.intValue() != 2) {
/* 136 */       ☃.addProperty("difficulty", this.h);
/*     */     }
/*     */     
/* 139 */     if (this.i.intValue() != 0) {
/* 140 */       ☃.addProperty("gameMode", this.i);
/*     */     }
/*     */     
/* 143 */     if (this.g.booleanValue()) {
/* 144 */       ☃.addProperty("forceGameMode", this.g);
/*     */     }
/*     */     
/* 147 */     if (!Objects.equals(this.j, "")) {
/* 148 */       ☃.addProperty("slotName", this.j);
/*     */     }
/*     */     
/* 151 */     return ☃.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public dgw d() {
/* 156 */     return new dgw(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.g, this.j);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */