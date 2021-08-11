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
/*     */ public class avl
/*     */   extends avz
/*     */ {
/*  14 */   private static final int[] a = new int[] { 0, 1, 4, 5, 6, 7 };
/*     */   
/*     */   private final baf b;
/*     */   
/*     */   private final int c;
/*     */   
/*     */   private boolean d;
/*     */   
/*     */   public avl(baf ☃, int i) {
/*  23 */     this.b = ☃;
/*  24 */     this.c = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  29 */     if (this.b.cY().nextInt(this.c) != 0) {
/*  30 */       return false;
/*     */     }
/*     */     
/*  33 */     gc ☃ = this.b.ca();
/*  34 */     int i = ☃.i();
/*  35 */     int j = ☃.k();
/*  36 */     fx fx = this.b.cB();
/*     */     
/*  38 */     for (int k : a) {
/*  39 */       if (!a(fx, i, j, k) || !b(fx, i, j, k)) {
/*  40 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  44 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃, int i, int j, int k) {
/*  48 */     fx fx1 = ☃.b(i * k, 0, j * k);
/*  49 */     return (this.b.l.b(fx1).a(aef.b) && !this.b.l.d_(fx1).c().c());
/*     */   }
/*     */   
/*     */   private boolean b(fx ☃, int i, int j, int k) {
/*  53 */     return (this.b.l.d_(☃.b(i * k, 1, j * k)).g() && this.b.l
/*  54 */       .d_(☃.b(i * k, 2, j * k)).g());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  59 */     double ☃ = (this.b.cC()).c;
/*  60 */     return ((☃ * ☃ >= 0.029999999329447746D || this.b.q == 0.0F || Math.abs(this.b.q) >= 10.0F || !this.b.aE()) && !this.b.ao());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean C_() {
/*  65 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {
/*  71 */     gc ☃ = this.b.ca();
/*  72 */     this.b.f(this.b.cC().b(☃
/*  73 */           .i() * 0.6D, 0.7D, ☃
/*     */           
/*  75 */           .k() * 0.6D));
/*     */ 
/*     */     
/*  78 */     this.b.x().o();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  83 */     this.b.q = 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  88 */     boolean ☃ = this.d;
/*  89 */     if (!☃) {
/*  90 */       cux cux = this.b.l.b(this.b.cB());
/*  91 */       this.d = cux.a(aef.b);
/*     */     } 
/*     */     
/*  94 */     if (this.d && !☃) {
/*  95 */       this.b.a(adq.cJ, 1.0F, 1.0F);
/*     */     }
/*     */     
/*  98 */     dcn dcn = this.b.cC();
/*  99 */     if (dcn.c * dcn.c < 0.029999999329447746D && this.b.q != 0.0F) {
/* 100 */       this.b.q = afm.j(this.b.q, 0.0F, 0.2F);
/*     */     } else {
/* 102 */       double d1 = Math.sqrt(aqa.c(dcn));
/* 103 */       double d2 = Math.signum(-dcn.c) * Math.acos(d1 / dcn.f()) * 57.2957763671875D;
/* 104 */       this.b.q = (float)d2;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */