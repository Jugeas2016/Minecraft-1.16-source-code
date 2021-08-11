/*     */ import javax.annotation.Nullable;
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
/*     */ public class apk
/*     */ {
/*  19 */   public static final apk a = (new apk("inFire")).l().o();
/*  20 */   public static final apk b = new apk("lightningBolt");
/*  21 */   public static final apk c = (new apk("onFire")).l().o();
/*  22 */   public static final apk d = (new apk("lava")).o();
/*  23 */   public static final apk e = (new apk("hotFloor")).o();
/*  24 */   public static final apk f = (new apk("inWall")).l();
/*  25 */   public static final apk g = (new apk("cramming")).l();
/*  26 */   public static final apk h = (new apk("drown")).l();
/*  27 */   public static final apk i = (new apk("starve")).l().n();
/*  28 */   public static final apk j = new apk("cactus");
/*  29 */   public static final apk k = (new apk("fall")).l();
/*  30 */   public static final apk l = (new apk("flyIntoWall")).l();
/*  31 */   public static final apk m = (new apk("outOfWorld")).l().m();
/*  32 */   public static final apk n = (new apk("generic")).l();
/*  33 */   public static final apk o = (new apk("magic")).l().u();
/*  34 */   public static final apk p = (new apk("wither")).l();
/*  35 */   public static final apk q = new apk("anvil");
/*  36 */   public static final apk r = new apk("fallingBlock");
/*  37 */   public static final apk s = (new apk("dragonBreath")).l();
/*  38 */   public static final apk t = new apk("dryout");
/*  39 */   public static final apk u = new apk("sweetBerryBush"); private boolean w;
/*     */   
/*     */   public static apk b(aqm ☃) {
/*  42 */     return new apl("sting", ☃);
/*     */   }
/*     */   private boolean x; private boolean y;
/*     */   public static apk c(aqm ☃) {
/*  46 */     return new apl("mob", ☃);
/*     */   }
/*     */   
/*     */   public static apk a(aqa ☃, aqm aqm1) {
/*  50 */     return new apm("mob", ☃, aqm1);
/*     */   }
/*     */   
/*     */   public static apk a(bfw ☃) {
/*  54 */     return new apl("player", ☃);
/*     */   }
/*     */   
/*     */   public static apk a(bga ☃, @Nullable aqa aqa1) {
/*  58 */     return (new apm("arrow", ☃, aqa1)).c();
/*     */   }
/*     */   
/*     */   public static apk a(aqa ☃, @Nullable aqa aqa1) {
/*  62 */     return (new apm("trident", ☃, aqa1)).c();
/*     */   }
/*     */   
/*     */   public static apk a(bgh ☃, @Nullable aqa aqa1) {
/*  66 */     return (new apm("fireworks", ☃, aqa1)).e();
/*     */   }
/*     */   
/*     */   public static apk a(bgg ☃, @Nullable aqa aqa1) {
/*  70 */     if (aqa1 == null) {
/*  71 */       return (new apm("onFire", ☃, ☃)).o().c();
/*     */     }
/*  73 */     return (new apm("fireball", ☃, aqa1)).o().c();
/*     */   }
/*     */   
/*     */   public static apk a(bgz ☃, aqa aqa1) {
/*  77 */     return (new apm("witherSkull", ☃, aqa1)).c();
/*     */   }
/*     */   
/*     */   public static apk b(aqa ☃, @Nullable aqa aqa1) {
/*  81 */     return (new apm("thrown", ☃, aqa1)).c();
/*     */   }
/*     */   
/*     */   public static apk c(aqa ☃, @Nullable aqa aqa1) {
/*  85 */     return (new apm("indirectMagic", ☃, aqa1)).l().u();
/*     */   }
/*     */   
/*     */   public static apk a(aqa ☃) {
/*  89 */     return (new apl("thorns", ☃)).x().u();
/*     */   }
/*     */   
/*     */   public static apk a(@Nullable brp ☃) {
/*  93 */     return d((☃ != null) ? ☃.d() : null);
/*     */   }
/*     */   
/*     */   public static apk d(@Nullable aqm ☃) {
/*  97 */     if (☃ != null) {
/*  98 */       return (new apl("explosion.player", ☃)).r().e();
/*     */     }
/* 100 */     return (new apk("explosion")).r().e();
/*     */   }
/*     */ 
/*     */   
/*     */   public static apk a() {
/* 105 */     return new apg();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 112 */   private float z = 0.1F;
/*     */   private boolean A;
/*     */   private boolean B;
/*     */   private boolean C;
/*     */   private boolean D;
/*     */   private boolean E;
/*     */   public final String v;
/*     */   
/*     */   public String toString() {
/* 121 */     return "DamageSource (" + this.v + ")";
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 125 */     return this.B;
/*     */   }
/*     */   
/*     */   public apk c() {
/* 129 */     this.B = true;
/* 130 */     return this;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 134 */     return this.E;
/*     */   }
/*     */   
/*     */   public apk e() {
/* 138 */     this.E = true;
/* 139 */     return this;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 143 */     return this.w;
/*     */   }
/*     */   
/*     */   public float g() {
/* 147 */     return this.z;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 151 */     return this.x;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 155 */     return this.y;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected apk(String ☃) {
/* 161 */     this.v = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa j() {
/* 170 */     return k();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa k() {
/* 179 */     return null;
/*     */   }
/*     */   
/*     */   protected apk l() {
/* 183 */     this.w = true;
/*     */     
/* 185 */     this.z = 0.0F;
/* 186 */     return this;
/*     */   }
/*     */   
/*     */   protected apk m() {
/* 190 */     this.x = true;
/* 191 */     return this;
/*     */   }
/*     */   
/*     */   protected apk n() {
/* 195 */     this.y = true;
/*     */     
/* 197 */     this.z = 0.0F;
/* 198 */     return this;
/*     */   }
/*     */   
/*     */   protected apk o() {
/* 202 */     this.A = true;
/* 203 */     return this;
/*     */   }
/*     */   
/*     */   public nr a(aqm ☃) {
/* 207 */     aqm aqm1 = ☃.dw();
/* 208 */     String str1 = "death.attack." + this.v;
/* 209 */     String str2 = str1 + ".player";
/*     */     
/* 211 */     if (aqm1 != null) {
/* 212 */       return new of(str2, new Object[] { ☃.d(), aqm1.d() });
/*     */     }
/* 214 */     return new of(str1, new Object[] { ☃.d() });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean p() {
/* 219 */     return this.A;
/*     */   }
/*     */   
/*     */   public String q() {
/* 223 */     return this.v;
/*     */   }
/*     */   
/*     */   public apk r() {
/* 227 */     this.C = true;
/* 228 */     return this;
/*     */   }
/*     */   
/*     */   public boolean s() {
/* 232 */     return this.C;
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 236 */     return this.D;
/*     */   }
/*     */   
/*     */   public apk u() {
/* 240 */     this.D = true;
/* 241 */     return this;
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 245 */     aqa ☃ = k();
/* 246 */     return (☃ instanceof bfw && ((bfw)☃).bC.d);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dcn w() {
/* 251 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */