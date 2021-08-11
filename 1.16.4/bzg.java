/*     */ import java.util.Random;
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
/*     */ public class bzg
/*     */   extends bzf
/*     */ {
/*  22 */   public static final cfb b = bxm.aq;
/*  23 */   public static final cey c = bzf.a;
/*     */   
/*     */   protected bzg(ceg.c ☃) {
/*  26 */     super(☃);
/*  27 */     j(((ceh)this.n.b()).a(b, gc.c).a(c, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public String i() {
/*  32 */     return h().a();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  37 */     return cbn.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  42 */     return bup.bM.a(☃, brz1, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  47 */     return bup.bM.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  53 */     ceh ceh = bup.bM.a(☃);
/*  54 */     return (ceh == null) ? null : n().a(b, ceh.c(b));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  59 */     if (!((Boolean)☃.c(c)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/*  63 */     gc gc = ((gc)☃.c(b)).f();
/*  64 */     double d1 = 0.27D;
/*  65 */     double d2 = fx1.u() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D + 0.27D * gc.i();
/*  66 */     double d3 = fx1.v() + 0.7D + (random.nextDouble() - 0.5D) * 0.2D + 0.22D;
/*  67 */     double d4 = fx1.w() + 0.5D + (random.nextDouble() - 0.5D) * 0.2D + 0.27D * gc.k();
/*     */     
/*  69 */     brx1.a(this.e, d2, d3, d4, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(brx ☃, fx fx1, ceh ceh1) {
/*  74 */     gc gc = ((gc)ceh1.c(b)).f();
/*     */     
/*  76 */     return ☃.a(fx1.a(gc), gc);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  81 */     if (((Boolean)☃.c(c)).booleanValue() && ☃.c(b) != gc1) {
/*  82 */       return 15;
/*     */     }
/*     */     
/*  85 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/*  90 */     return bup.bM.a(☃, bzm1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/*  95 */     return bup.bM.a(☃, byg1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 100 */     ☃.a((cfj<?>[])new cfj[] { b, c });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */