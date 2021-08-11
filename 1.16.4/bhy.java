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
/*     */ public class bhy
/*     */ {
/*  21 */   private int a = 20;
/*  22 */   private int e = 20;
/*  23 */   private float b = 5.0F;
/*     */   private float c;
/*     */   
/*     */   public void a(int ☃, float f) {
/*  27 */     this.a = Math.min(☃ + this.a, 20);
/*  28 */     this.b = Math.min(this.b + ☃ * f * 2.0F, this.a);
/*     */   }
/*     */   private int d;
/*     */   public void a(blx ☃, bmb bmb1) {
/*  32 */     if (☃.s()) {
/*  33 */       bhz bhz = ☃.t();
/*  34 */       a(bhz.a(), bhz.b());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(bfw ☃) {
/*  39 */     aor aor = ☃.l.ad();
/*     */     
/*  41 */     this.e = this.a;
/*     */     
/*  43 */     if (this.c > 4.0F) {
/*  44 */       this.c -= 4.0F;
/*     */       
/*  46 */       if (this.b > 0.0F) {
/*  47 */         this.b = Math.max(this.b - 1.0F, 0.0F);
/*  48 */       } else if (aor != aor.a) {
/*  49 */         this.a = Math.max(this.a - 1, 0);
/*     */       } 
/*     */     } 
/*     */     
/*  53 */     boolean bool = ☃.l.V().b(brt.i);
/*  54 */     if (bool && this.b > 0.0F && ☃.eJ() && this.a >= 20) {
/*  55 */       this.d++;
/*  56 */       if (this.d >= 10) {
/*  57 */         float f = Math.min(this.b, 6.0F);
/*  58 */         ☃.b(f / 6.0F);
/*  59 */         a(f);
/*  60 */         this.d = 0;
/*     */       } 
/*  62 */     } else if (bool && this.a >= 18 && ☃.eJ()) {
/*  63 */       this.d++;
/*  64 */       if (this.d >= 80) {
/*  65 */         ☃.b(1.0F);
/*  66 */         a(6.0F);
/*  67 */         this.d = 0;
/*     */       } 
/*  69 */     } else if (this.a <= 0) {
/*  70 */       this.d++;
/*  71 */       if (this.d >= 80) {
/*  72 */         if (☃.dk() > 10.0F || aor == aor.d || (☃.dk() > 1.0F && aor == aor.c)) {
/*  73 */           ☃.a(apk.i, 1.0F);
/*     */         }
/*  75 */         this.d = 0;
/*     */       } 
/*     */     } else {
/*  78 */       this.d = 0;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(md ☃) {
/*  83 */     if (☃.c("foodLevel", 99)) {
/*  84 */       this.a = ☃.h("foodLevel");
/*  85 */       this.d = ☃.h("foodTickTimer");
/*  86 */       this.b = ☃.j("foodSaturationLevel");
/*  87 */       this.c = ☃.j("foodExhaustionLevel");
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(md ☃) {
/*  92 */     ☃.b("foodLevel", this.a);
/*  93 */     ☃.b("foodTickTimer", this.d);
/*  94 */     ☃.a("foodSaturationLevel", this.b);
/*  95 */     ☃.a("foodExhaustionLevel", this.c);
/*     */   }
/*     */   
/*     */   public int a() {
/*  99 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 107 */     return (this.a < 20);
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/* 111 */     this.c = Math.min(this.c + ☃, 40.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float e() {
/* 119 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 123 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void b(float ☃) {
/* 127 */     this.b = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */