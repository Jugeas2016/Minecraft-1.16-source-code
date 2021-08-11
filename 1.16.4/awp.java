/*     */ import java.util.EnumSet;
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
/*     */ public class awp
/*     */   extends avv
/*     */ {
/*     */   protected final aqu a;
/*     */   protected final double b;
/*     */   protected double c;
/*     */   protected double d;
/*     */   protected double e;
/*     */   protected boolean f;
/*     */   
/*     */   public awp(aqu ☃, double d) {
/*  23 */     this.a = ☃;
/*  24 */     this.b = d;
/*  25 */     a(EnumSet.of(avv.a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  30 */     if (this.a.cZ() == null && !this.a.bq()) {
/*  31 */       return false;
/*     */     }
/*     */     
/*  34 */     if (this.a.bq()) {
/*  35 */       fx ☃ = a(this.a.l, this.a, 5, 4);
/*  36 */       if (☃ != null) {
/*  37 */         this.c = ☃.u();
/*  38 */         this.d = ☃.v();
/*  39 */         this.e = ☃.w();
/*     */         
/*  41 */         return true;
/*     */       } 
/*     */     } 
/*  44 */     return g();
/*     */   }
/*     */   
/*     */   protected boolean g() {
/*  48 */     dcn ☃ = azj.a(this.a, 5, 4);
/*  49 */     if (☃ == null) {
/*  50 */       return false;
/*     */     }
/*  52 */     this.c = ☃.b;
/*  53 */     this.d = ☃.c;
/*  54 */     this.e = ☃.d;
/*     */     
/*  56 */     return true;
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  60 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  65 */     this.a.x().a(this.c, this.d, this.e, this.b);
/*  66 */     this.f = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  71 */     this.f = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  76 */     return !this.a.x().m();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected fx a(brc ☃, aqa aqa1, int i, int j) {
/*  81 */     fx fx1 = aqa1.cB();
/*  82 */     int k = fx1.u();
/*  83 */     int m = fx1.v();
/*  84 */     int n = fx1.w();
/*     */     
/*  86 */     float f = (i * i * j * 2);
/*  87 */     fx fx2 = null;
/*     */     
/*  89 */     fx.a a = new fx.a();
/*  90 */     for (int i1 = k - i; i1 <= k + i; i1++) {
/*  91 */       for (int i2 = m - j; i2 <= m + j; i2++) {
/*  92 */         for (int i3 = n - i; i3 <= n + i; i3++) {
/*  93 */           a.d(i1, i2, i3);
/*  94 */           if (☃.b(a).a(aef.b)) {
/*  95 */             float f1 = ((i1 - k) * (i1 - k) + (i2 - m) * (i2 - m) + (i3 - n) * (i3 - n));
/*  96 */             if (f1 < f) {
/*  97 */               f = f1;
/*  98 */               fx2 = new fx(a);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 104 */     return fx2;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */