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
/*     */ public class bxw
/*     */   extends buo
/*     */   implements bzu
/*     */ {
/*  24 */   public static final cey a = cex.j;
/*  25 */   public static final cey b = cex.C;
/*     */   
/*  27 */   protected static final ddh c = dde.a(buo.a(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D), buo.a(6.0D, 7.0D, 6.0D, 10.0D, 9.0D, 10.0D));
/*  28 */   protected static final ddh d = dde.a(buo.a(5.0D, 1.0D, 5.0D, 11.0D, 8.0D, 11.0D), buo.a(6.0D, 8.0D, 6.0D, 10.0D, 10.0D, 10.0D));
/*     */   
/*     */   public bxw(ceg.c ☃) {
/*  31 */     super(☃);
/*  32 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  38 */     cux cux = ☃.p().b(☃.a());
/*     */     
/*  40 */     for (gc gc : ☃.e()) {
/*     */       
/*  42 */       if (gc.n() == gc.a.b) {
/*  43 */         ceh ceh = n().a(a, Boolean.valueOf((gc == gc.b)));
/*     */         
/*  45 */         if (ceh.a(☃.p(), ☃.a())) {
/*  46 */           return ceh.a(b, Boolean.valueOf((cux.a() == cuy.c)));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  51 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  56 */     return ((Boolean)☃.c(a)).booleanValue() ? d : c;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/*  61 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  66 */     gc gc = h(☃).f();
/*  67 */     return buo.a(brz1, fx1.a(gc), gc.f());
/*     */   }
/*     */   
/*     */   protected static gc h(ceh ☃) {
/*  71 */     return ((Boolean)☃.c(a)).booleanValue() ? gc.a : gc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public cvc f(ceh ☃) {
/*  76 */     return cvc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  81 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  82 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/*  84 */     if (h(☃).f() == gc1 && !☃.a(bry1, fx1)) {
/*  85 */       return bup.a.n();
/*     */     }
/*  87 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/*  92 */     if (((Boolean)☃.c(b)).booleanValue()) {
/*  93 */       return cuy.c.a(false);
/*     */     }
/*  95 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 100 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bxw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */