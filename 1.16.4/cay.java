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
/*     */ public class cay
/*     */   extends buo
/*     */ {
/*  28 */   private static final cfg a = cex.az;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cay(ceg.c ☃) {
/*  34 */     super(☃);
/*  35 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, ceh ceh1, dcj dcj1, bgm bgm1) {
/*  40 */     int i = a(☃, ceh1, dcj1, bgm1);
/*     */     
/*  42 */     aqa aqa = bgm1.v();
/*  43 */     if (aqa instanceof aah) {
/*  44 */       aah aah = (aah)aqa;
/*  45 */       aah.a(aea.aD);
/*  46 */       ac.L.a(aah, bgm1, dcj1.e(), i);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(bry ☃, ceh ceh1, dcj dcj1, aqa aqa1) {
/*  51 */     int i = a(dcj1, dcj1.e());
/*  52 */     int j = (aqa1 instanceof bga) ? 20 : 8;
/*     */     
/*  54 */     if (!☃.J().a(dcj1.a(), ceh1.b())) {
/*  55 */       a(☃, ceh1, i, dcj1.a(), j);
/*     */     }
/*     */     
/*  58 */     return i;
/*     */   }
/*     */   private static int a(dcj ☃, dcn dcn1) {
/*     */     double d4;
/*  62 */     gc gc = ☃.b();
/*  63 */     double d1 = Math.abs(afm.h(dcn1.b) - 0.5D);
/*  64 */     double d2 = Math.abs(afm.h(dcn1.c) - 0.5D);
/*  65 */     double d3 = Math.abs(afm.h(dcn1.d) - 0.5D);
/*     */ 
/*     */     
/*  68 */     gc.a a = gc.n();
/*  69 */     if (a == gc.a.b) {
/*  70 */       d4 = Math.max(d1, d3);
/*  71 */     } else if (a == gc.a.c) {
/*  72 */       d4 = Math.max(d1, d2);
/*     */     } else {
/*  74 */       d4 = Math.max(d2, d3);
/*     */     } 
/*     */     
/*  77 */     return Math.max(1, afm.f(15.0D * afm.a((0.5D - d4) / 0.5D, 0.0D, 1.0D)));
/*     */   }
/*     */   
/*     */   private static void a(bry ☃, ceh ceh1, int i, fx fx1, int j) {
/*  81 */     ☃.a(fx1, ceh1.a(a, Integer.valueOf(i)), 3);
/*  82 */     ☃.J().a(fx1, ceh1.b(), j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  87 */     if (((Integer)☃.c(a)).intValue() != 0) {
/*  88 */       aag1.a(fx1, ☃.a(a, Integer.valueOf(0)), 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  94 */     return ((Integer)☃.c(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 104 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 109 */     if (brx1.s_() || ☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*     */     
/* 113 */     if (((Integer)☃.c(a)).intValue() > 0 && !brx1.J().a(fx1, this))
/* 114 */       brx1.a(fx1, ☃.a(a, Integer.valueOf(0)), 18); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */