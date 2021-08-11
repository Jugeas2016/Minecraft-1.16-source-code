/*     */ import java.util.Random;
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
/*     */ public abstract class bxh
/*     */   extends bxf
/*     */   implements buq
/*     */ {
/*  19 */   public static final cfg d = cex.ak;
/*     */   
/*     */   private final double e;
/*     */ 
/*     */   
/*     */   protected bxh(ceg.c ☃, gc gc1, ddh ddh1, boolean bool, double d) {
/*  25 */     super(☃, gc1, ddh1, bool);
/*  26 */     this.e = d;
/*  27 */     j(((ceh)this.n.b()).a(d, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bry ☃) {
/*  32 */     return n().a(d, Integer.valueOf(☃.u_().nextInt(25)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/*  37 */     return (((Integer)☃.c(d)).intValue() < 25);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  42 */     if (((Integer)☃.c(d)).intValue() < 25 && random.nextDouble() < this.e) {
/*  43 */       fx fx2 = fx1.a(this.a);
/*  44 */       if (h(aag1.d_(fx2))) {
/*  45 */         aag1.a(fx2, ☃.a(d));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  52 */     if (gc1 == this.a.f() && !☃.a(bry1, fx1)) {
/*  53 */       bry1.J().a(fx1, this, 1);
/*     */     }
/*  55 */     if (gc1 == this.a && (ceh1.a(this) || ceh1.a(d()))) {
/*  56 */       return d().n();
/*     */     }
/*  58 */     if (this.b) {
/*  59 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*     */     
/*  62 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/*  67 */     ☃.a((cfj<?>[])new cfj[] { d });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/*  72 */     return h(☃.d_(fx1.a(this.a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/*  77 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/*  82 */     fx fx2 = fx1.a(this.a);
/*  83 */     int i = Math.min(((Integer)ceh1.c(d)).intValue() + 1, 25);
/*     */     
/*  85 */     int j = a(random);
/*  86 */     for (int k = 0; k < j && 
/*  87 */       h(☃.d_(fx2)); k++) {
/*     */ 
/*     */       
/*  90 */       ☃.a(fx2, ceh1.a(d, Integer.valueOf(i)));
/*     */       
/*  92 */       fx2 = fx2.a(this.a);
/*  93 */       i = Math.min(i + 1, 25);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract int a(Random paramRandom);
/*     */   
/*     */   protected abstract boolean h(ceh paramceh);
/*     */   
/*     */   protected bxh c() {
/* 103 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */