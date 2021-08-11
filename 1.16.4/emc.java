/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class emc
/*     */   implements emt
/*     */ {
/*     */   protected emq a;
/*     */   protected final adr b;
/*     */   protected final vk c;
/*  13 */   protected float d = 1.0F;
/*  14 */   protected float e = 1.0F;
/*     */   protected double f;
/*     */   protected double g;
/*     */   protected double h;
/*     */   protected boolean i;
/*     */   protected int j;
/*  20 */   protected emt.a k = emt.a.b;
/*     */   protected boolean l;
/*     */   protected boolean m;
/*     */   
/*     */   protected emc(adp ☃, adr adr1) {
/*  25 */     this(☃.a(), adr1);
/*     */   }
/*     */   
/*     */   protected emc(vk ☃, adr adr1) {
/*  29 */     this.c = ☃;
/*  30 */     this.b = adr1;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a() {
/*  35 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public env a(enu ☃) {
/*  40 */     env env = ☃.a(this.c);
/*  41 */     if (env == null) {
/*  42 */       this.a = enu.a;
/*     */     } else {
/*  44 */       this.a = env.a();
/*     */     } 
/*     */     
/*  47 */     return env;
/*     */   }
/*     */ 
/*     */   
/*     */   public emq b() {
/*  52 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public adr c() {
/*  57 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/*  62 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e() {
/*  67 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public float f() {
/*  72 */     return this.d * this.a.c();
/*     */   }
/*     */ 
/*     */   
/*     */   public float g() {
/*  77 */     return this.e * this.a.d();
/*     */   }
/*     */ 
/*     */   
/*     */   public double h() {
/*  82 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/*  87 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public double j() {
/*  92 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public emt.a k() {
/*  97 */     return this.k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m() {
/* 107 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 112 */     return "SoundInstance[" + this.c + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */