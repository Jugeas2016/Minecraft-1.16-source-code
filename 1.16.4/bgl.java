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
/*     */ public class bgl
/*     */   extends bgm
/*     */ {
/*     */   public bgl(aqe<? extends bgl> ☃, brx brx1) {
/*  21 */     super((aqe)☃, brx1);
/*     */   }
/*     */   
/*     */   public bgl(brx ☃, bbe bbe1) {
/*  25 */     this(aqe.R, ☃);
/*  26 */     b(bbe1);
/*  27 */     d(bbe1.cD() - (bbe1.cy() + 1.0F) * 0.5D * afm.a(bbe1.aA * 0.017453292F), bbe1.cG() - 0.10000000149011612D, bbe1.cH() + (bbe1.cy() + 1.0F) * 0.5D * afm.b(bbe1.aA * 0.017453292F));
/*     */   }
/*     */   
/*     */   public bgl(brx ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/*  31 */     this(aqe.R, ☃);
/*  32 */     d(d1, d2, d3);
/*     */     
/*  34 */     for (int i = 0; i < 7; i++) {
/*  35 */       double d = 0.4D + 0.1D * i;
/*  36 */       ☃.a(hh.U, d1, d2, d3, d4 * d, d5, d6 * d);
/*     */     } 
/*     */     
/*  39 */     n(d4, d5, d6);
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  44 */     super.j();
/*     */     
/*  46 */     dcn ☃ = cC();
/*  47 */     dcl dcl = bgn.a(this, this::a);
/*     */     
/*  49 */     if (dcl != null) {
/*  50 */       a(dcl);
/*     */     }
/*     */     
/*  53 */     double d1 = cD() + ☃.b;
/*  54 */     double d2 = cE() + ☃.c;
/*  55 */     double d3 = cH() + ☃.d;
/*     */     
/*  57 */     x();
/*     */     
/*  59 */     float f1 = 0.99F;
/*  60 */     float f2 = 0.06F;
/*     */     
/*  62 */     if (this.l.a(cc()).noneMatch(ceg.a::g)) {
/*  63 */       ad();
/*     */       
/*     */       return;
/*     */     } 
/*  67 */     if (aH()) {
/*  68 */       ad();
/*     */       
/*     */       return;
/*     */     } 
/*  72 */     f(☃.a(0.9900000095367432D));
/*  73 */     if (!aB()) {
/*  74 */       f(cC().b(0.0D, -0.05999999865889549D, 0.0D));
/*     */     }
/*     */     
/*  77 */     d(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dck ☃) {
/*  82 */     super.a(☃);
/*  83 */     aqa aqa = v();
/*  84 */     if (aqa instanceof aqm) {
/*  85 */       ☃.a().a(apk.a(this, (aqm)aqa).c(), 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dcj ☃) {
/*  91 */     super.a(☃);
/*     */     
/*  93 */     if (!this.l.v) {
/*  94 */       ad();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void e() {}
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 104 */     return new on(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */