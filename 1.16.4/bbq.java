/*     */ import java.util.Optional;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bbq
/*     */   extends aqa
/*     */ {
/*  25 */   private static final us<Optional<fx>> c = uv.a((Class)bbq.class, uu.m);
/*  26 */   private static final us<Boolean> d = uv.a((Class)bbq.class, uu.i);
/*     */   
/*     */   public int b;
/*     */   
/*     */   public bbq(aqe<? extends bbq> ☃, brx brx1) {
/*  31 */     super(☃, brx1);
/*  32 */     this.i = true;
/*     */     
/*  34 */     this.b = this.J.nextInt(100000);
/*     */   }
/*     */   
/*     */   public bbq(brx ☃, double d1, double d2, double d3) {
/*  38 */     this(aqe.s, ☃);
/*  39 */     d(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  44 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  49 */     ab().a(c, Optional.empty());
/*  50 */     ab().a(d, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  55 */     this.b++;
/*     */     
/*  57 */     if (this.l instanceof aag) {
/*  58 */       fx ☃ = cB();
/*  59 */       if (((aag)this.l).D() != null && this.l.d_(☃).g()) {
/*  60 */         this.l.a(☃, bue.a(this.l, ☃));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/*  67 */     if (g() != null) {
/*  68 */       ☃.a("BeamTarget", mp.a(g()));
/*     */     }
/*  70 */     ☃.a("ShowBottom", h());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  75 */     if (☃.c("BeamTarget", 10)) {
/*  76 */       a(mp.b(☃.p("BeamTarget")));
/*     */     }
/*  78 */     if (☃.c("ShowBottom", 1)) {
/*  79 */       a(☃.q("ShowBottom"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/*  85 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/*  90 */     if (b(☃)) {
/*  91 */       return false;
/*     */     }
/*  93 */     if (☃.k() instanceof bbr) {
/*  94 */       return false;
/*     */     }
/*  96 */     if (!this.y && !this.l.v) {
/*  97 */       ad();
/*     */       
/*  99 */       if (!☃.d()) {
/* 100 */         this.l.a((aqa)null, cD(), cE(), cH(), 6.0F, brp.a.c);
/*     */       }
/* 102 */       a(☃);
/*     */     } 
/* 104 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aa() {
/* 109 */     a(apk.n);
/* 110 */     super.aa();
/*     */   }
/*     */   
/*     */   private void a(apk ☃) {
/* 114 */     if (this.l instanceof aag) {
/* 115 */       chg chg = ((aag)this.l).D();
/* 116 */       if (chg != null) {
/* 117 */         chg.a(this, ☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(@Nullable fx ☃) {
/* 123 */     ab().b(c, Optional.ofNullable(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public fx g() {
/* 128 */     return ((Optional<fx>)ab().<Optional<fx>>a(c)).orElse(null);
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 132 */     ab().b(d, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 136 */     return ((Boolean)ab().<Boolean>a(d)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃) {
/* 141 */     return (super.a(☃) || g() != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 146 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */