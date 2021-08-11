/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class azg
/*     */ {
/*  10 */   public static final azg a = new azg();
/*     */ 
/*     */   
/*  13 */   private double b = -1.0D;
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   private boolean g = true;
/*     */   private Predicate<aqm> h;
/*     */   
/*     */   public azg a(double ☃) {
/*  22 */     this.b = ☃;
/*  23 */     return this;
/*     */   }
/*     */   
/*     */   public azg a() {
/*  27 */     this.c = true;
/*  28 */     return this;
/*     */   }
/*     */   
/*     */   public azg b() {
/*  32 */     this.d = true;
/*  33 */     return this;
/*     */   }
/*     */   
/*     */   public azg c() {
/*  37 */     this.e = true;
/*  38 */     return this;
/*     */   }
/*     */   
/*     */   public azg d() {
/*  42 */     this.f = true;
/*  43 */     return this;
/*     */   }
/*     */   
/*     */   public azg e() {
/*  47 */     this.g = false;
/*  48 */     return this;
/*     */   }
/*     */   
/*     */   public azg a(@Nullable Predicate<aqm> ☃) {
/*  52 */     this.h = ☃;
/*  53 */     return this;
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable aqm ☃, aqm aqm1) {
/*  57 */     if (☃ == aqm1) {
/*  58 */       return false;
/*     */     }
/*  60 */     if (aqm1.a_()) {
/*  61 */       return false;
/*     */     }
/*  63 */     if (!aqm1.aX()) {
/*  64 */       return false;
/*     */     }
/*  66 */     if (!this.c && aqm1.bM()) {
/*  67 */       return false;
/*     */     }
/*  69 */     if (this.h != null && !this.h.test(aqm1)) {
/*  70 */       return false;
/*     */     }
/*     */     
/*  73 */     if (☃ != null) {
/*  74 */       if (!this.f) {
/*  75 */         if (!☃.c(aqm1)) {
/*  76 */           return false;
/*     */         }
/*  78 */         if (!☃.a(aqm1.X())) {
/*  79 */           return false;
/*     */         }
/*     */       } 
/*  82 */       if (!this.d && ☃.r(aqm1)) {
/*  83 */         return false;
/*     */       }
/*     */       
/*  86 */       if (this.b > 0.0D) {
/*  87 */         double d1 = this.g ? aqm1.A(☃) : 1.0D;
/*  88 */         double d2 = Math.max(this.b * d1, 2.0D);
/*  89 */         double d3 = ☃.h(aqm1.cD(), aqm1.cE(), aqm1.cH());
/*  90 */         if (d3 > d2 * d2) {
/*  91 */           return false;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/*  96 */       if (!this.e && ☃ instanceof aqn && !((aqn)☃).z().a(aqm1)) {
/*  97 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 101 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */