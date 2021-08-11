/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avs
/*     */   extends avv
/*     */ {
/*     */   private final aqn a;
/*     */   private final Predicate<aqn> b;
/*     */   private aqn c;
/*     */   private final double d;
/*     */   private final ayj e;
/*     */   private int f;
/*     */   private final float g;
/*     */   private float h;
/*     */   private final float i;
/*     */   
/*     */   public avs(aqn ☃, double d, float f1, float f2) {
/*  26 */     this.a = ☃;
/*  27 */     this.b = (aqn1 -> (aqn1 != null && ☃.getClass() != aqn1.getClass()));
/*  28 */     this.d = d;
/*  29 */     this.e = ☃.x();
/*  30 */     this.g = f1;
/*  31 */     this.i = f2;
/*     */     
/*  33 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     
/*  35 */     if (!(☃.x() instanceof ayi) && !(☃.x() instanceof ayh)) {
/*  36 */       throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  42 */     List<aqn> ☃ = this.a.l.a(aqn.class, this.a.cc().g(this.i), this.b);
/*  43 */     if (!☃.isEmpty()) {
/*  44 */       for (aqn aqn1 : ☃) {
/*  45 */         if (aqn1.bF()) {
/*     */           continue;
/*     */         }
/*     */         
/*  49 */         this.c = aqn1;
/*  50 */         return true;
/*     */       } 
/*     */     }
/*  53 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  58 */     return (this.c != null && !this.e.m() && this.a.h(this.c) > (this.g * this.g));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  63 */     this.f = 0;
/*  64 */     this.h = this.a.a(cwz.h);
/*  65 */     this.a.a(cwz.h, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  70 */     this.c = null;
/*  71 */     this.e.o();
/*  72 */     this.a.a(cwz.h, this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  77 */     if (this.c == null || this.a.eB()) {
/*     */       return;
/*     */     }
/*     */     
/*  81 */     this.a.t().a(this.c, 10.0F, this.a.O());
/*     */     
/*  83 */     if (--this.f > 0) {
/*     */       return;
/*     */     }
/*  86 */     this.f = 10;
/*     */     
/*  88 */     double ☃ = this.a.cD() - this.c.cD();
/*  89 */     double d1 = this.a.cE() - this.c.cE();
/*  90 */     double d2 = this.a.cH() - this.c.cH();
/*     */     
/*  92 */     double d3 = ☃ * ☃ + d1 * d1 + d2 * d2;
/*  93 */     if (d3 <= (this.g * this.g)) {
/*  94 */       this.e.o();
/*     */       
/*  96 */       ava ava = this.c.t();
/*  97 */       if (d3 <= this.g || (ava.d() == this.a.cD() && ava.e() == this.a.cE() && ava.f() == this.a.cH())) {
/*  98 */         double d4 = this.c.cD() - this.a.cD();
/*  99 */         double d5 = this.c.cH() - this.a.cH();
/* 100 */         this.e.a(this.a.cD() - d4, this.a.cE(), this.a.cH() - d5, this.d);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 105 */     this.e.a(this.c, this.d);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */