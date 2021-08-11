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
/*     */ public class bcw
/*     */   extends aqa
/*     */ {
/*  23 */   private static final us<Integer> b = uv.a((Class)bcw.class, uu.b);
/*     */   
/*     */   @Nullable
/*     */   private aqm c;
/*     */   
/*  28 */   private int d = 80;
/*     */   
/*     */   public bcw(aqe<? extends bcw> ☃, brx brx1) {
/*  31 */     super(☃, brx1);
/*  32 */     this.i = true;
/*     */   }
/*     */   
/*     */   public bcw(brx ☃, double d1, double d2, double d3, @Nullable aqm aqm1) {
/*  36 */     this(aqe.am, ☃);
/*     */     
/*  38 */     d(d1, d2, d3);
/*     */     
/*  40 */     double d = ☃.t.nextDouble() * 6.2831854820251465D;
/*     */     
/*  42 */     n(
/*  43 */         -Math.sin(d) * 0.02D, 0.20000000298023224D, 
/*     */         
/*  45 */         -Math.cos(d) * 0.02D);
/*     */ 
/*     */     
/*  48 */     a(80);
/*     */     
/*  50 */     this.m = d1;
/*  51 */     this.n = d2;
/*  52 */     this.o = d3;
/*  53 */     this.c = aqm1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  58 */     this.R.a(b, Integer.valueOf(80));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  63 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/*  68 */     return !this.y;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  73 */     if (!aB()) {
/*  74 */       f(cC().b(0.0D, -0.04D, 0.0D));
/*     */     }
/*  76 */     a(aqr.a, cC());
/*  77 */     f(cC().a(0.98D));
/*     */     
/*  79 */     if (this.t)
/*     */     {
/*  81 */       f(cC().d(0.7D, -0.5D, 0.7D));
/*     */     }
/*     */     
/*  84 */     this.d--;
/*  85 */     if (this.d <= 0) {
/*  86 */       ad();
/*  87 */       if (!this.l.v) {
/*  88 */         k();
/*     */       }
/*     */     } else {
/*  91 */       aK();
/*  92 */       if (this.l.v) {
/*  93 */         this.l.a(hh.S, cD(), cE() + 0.5D, cH(), 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void k() {
/*  99 */     float ☃ = 4.0F;
/* 100 */     this.l.a(this, cD(), e(0.0625D), cH(), 4.0F, brp.a.b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 105 */     ☃.a("Fuse", (short)i());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 110 */     a(☃.g("Fuse"));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqm g() {
/* 115 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float a(aqx ☃, aqb aqb1) {
/* 120 */     return 0.15F;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 124 */     this.R.b(b, Integer.valueOf(☃));
/* 125 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 130 */     if (b.equals(☃)) {
/* 131 */       this.d = h();
/*     */     }
/*     */   }
/*     */   
/*     */   public int h() {
/* 136 */     return ((Integer)this.R.<Integer>a(b)).intValue();
/*     */   }
/*     */   
/*     */   public int i() {
/* 140 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 145 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */