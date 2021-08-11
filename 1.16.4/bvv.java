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
/*     */ 
/*     */ 
/*     */ public class bvv
/*     */   extends bud
/*     */ {
/*  25 */   public static final cfg a = cex.az;
/*  26 */   public static final cey b = cex.p;
/*     */   
/*  28 */   protected static final ddh c = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D);
/*     */   
/*     */   public bvv(ceg.c ☃) {
/*  31 */     super(☃);
/*     */     
/*  33 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  38 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/*  43 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  48 */     return ((Integer)☃.c(a)).intValue();
/*     */   }
/*     */   
/*     */   public static void d(ceh ☃, brx brx1, fx fx1) {
/*  52 */     if (!brx1.k().b()) {
/*     */       return;
/*     */     }
/*     */     
/*  56 */     int i = brx1.a(bsf.a, fx1) - brx1.c();
/*  57 */     float f = brx1.a(1.0F);
/*     */     
/*  59 */     boolean bool = ((Boolean)☃.c(b)).booleanValue();
/*  60 */     if (bool) {
/*  61 */       i = 15 - i;
/*  62 */     } else if (i > 0) {
/*     */       
/*  64 */       float f1 = (f < 3.1415927F) ? 0.0F : 6.2831855F;
/*  65 */       f += (f1 - f) * 0.2F;
/*     */       
/*  67 */       i = Math.round(i * afm.b(f));
/*     */     } 
/*  69 */     i = afm.a(i, 0, 15);
/*     */     
/*  71 */     if (((Integer)☃.c(a)).intValue() != i) {
/*  72 */       brx1.a(fx1, ☃.a(a, Integer.valueOf(i)), 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  78 */     if (bfw1.eK()) {
/*  79 */       if (brx1.v) {
/*  80 */         return aou.a;
/*     */       }
/*     */       
/*  83 */       ceh ceh1 = ☃.a(b);
/*  84 */       brx1.a(fx1, ceh1, 4);
/*  85 */       d(ceh1, brx1, fx1);
/*     */       
/*  87 */       return aou.b;
/*     */     } 
/*  89 */     return super.a(☃, brx1, fx1, bfw1, aot1, dcj1);
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  94 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/* 104 */     return new ccr();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 109 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */