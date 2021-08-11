/*     */ 
/*     */ 
/*     */ 
/*     */ public class aom
/*     */   implements aon
/*     */ {
/*     */   private final aon a;
/*     */   private final aon b;
/*     */   
/*     */   public aom(aon ☃, aon aon1) {
/*  11 */     if (☃ == null) {
/*  12 */       ☃ = aon1;
/*     */     }
/*  14 */     if (aon1 == null) {
/*  15 */       aon1 = ☃;
/*     */     }
/*  17 */     this.a = ☃;
/*  18 */     this.b = aon1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/*  23 */     return this.a.Z_() + this.b.Z_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  28 */     return (this.a.c() && this.b.c());
/*     */   }
/*     */   
/*     */   public boolean a(aon ☃) {
/*  32 */     return (this.a == ☃ || this.b == ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃) {
/*  37 */     if (☃ >= this.a.Z_()) {
/*  38 */       return this.b.a(☃ - this.a.Z_());
/*     */     }
/*  40 */     return this.a.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/*  46 */     if (☃ >= this.a.Z_()) {
/*  47 */       return this.b.a(☃ - this.a.Z_(), i);
/*     */     }
/*  49 */     return this.a.a(☃, i);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public bmb b(int ☃) {
/*  55 */     if (☃ >= this.a.Z_()) {
/*  56 */       return this.b.b(☃ - this.a.Z_());
/*     */     }
/*  58 */     return this.a.b(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/*  64 */     if (☃ >= this.a.Z_()) {
/*  65 */       this.b.a(☃ - this.a.Z_(), bmb1);
/*     */     } else {
/*  67 */       this.a.a(☃, bmb1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int V_() {
/*  73 */     return this.a.V_();
/*     */   }
/*     */ 
/*     */   
/*     */   public void X_() {
/*  78 */     this.a.X_();
/*  79 */     this.b.X_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  84 */     return (this.a.a(☃) && this.b.a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c_(bfw ☃) {
/*  89 */     this.a.c_(☃);
/*  90 */     this.b.c_(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b_(bfw ☃) {
/*  95 */     this.a.b_(☃);
/*  96 */     this.b.b_(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, bmb bmb1) {
/* 101 */     if (☃ >= this.a.Z_()) {
/* 102 */       return this.b.b(☃ - this.a.Z_(), bmb1);
/*     */     }
/* 104 */     return this.a.b(☃, bmb1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 110 */     this.a.Y_();
/* 111 */     this.b.Y_();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */