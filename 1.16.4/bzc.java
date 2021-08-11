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
/*     */ public class bzc
/*     */   extends buo
/*     */ {
/*  25 */   public static final cey a = bzf.a;
/*     */   
/*     */   public bzc(ceg.c ☃) {
/*  28 */     super(☃);
/*  29 */     j(n().a(a, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {
/*  34 */     d(☃, brx1, fx1);
/*  35 */     super.a(☃, brx1, fx1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, aqa aqa1) {
/*  40 */     d(☃.d_(fx1), ☃, fx1);
/*  41 */     super.a(☃, fx1, aqa1);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  46 */     if (brx1.v) {
/*  47 */       a(brx1, fx1);
/*     */     } else {
/*  49 */       d(☃, brx1, fx1);
/*     */     } 
/*     */ 
/*     */     
/*  53 */     bmb bmb = bfw1.b(aot1);
/*  54 */     if (bmb.b() instanceof bkh && (new bny(bfw1, aot1, bmb, dcj1)).b()) {
/*  55 */       return aou.c;
/*     */     }
/*  57 */     return aou.a;
/*     */   }
/*     */   
/*     */   private static void d(ceh ☃, brx brx1, fx fx1) {
/*  61 */     a(brx1, fx1);
/*  62 */     if (!((Boolean)☃.c(a)).booleanValue()) {
/*  63 */       brx1.a(fx1, ☃.a(a, Boolean.valueOf(true)), 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/*  69 */     return ((Boolean)☃.c(a)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  74 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  75 */       aag1.a(fx1, ☃.a(a, Boolean.valueOf(false)), 3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, bmb bmb1) {
/*  81 */     super.a(☃, aag1, fx1, bmb1);
/*     */     
/*  83 */     if (bpu.a(bpw.u, bmb1) == 0) {
/*     */       
/*  85 */       int i = 1 + aag1.t.nextInt(5);
/*  86 */       a(aag1, fx1, i);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  92 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*  93 */       a(brx1, fx1);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(brx ☃, fx fx1) {
/*  98 */     double d = 0.5625D;
/*  99 */     Random random = ☃.t;
/* 100 */     for (gc gc : gc.values()) {
/* 101 */       fx fx2 = fx1.a(gc);
/* 102 */       if (!☃.d_(fx2).i(☃, fx2)) {
/*     */ 
/*     */ 
/*     */         
/* 106 */         gc.a a = gc.n();
/* 107 */         double d1 = (a == gc.a.a) ? (0.5D + 0.5625D * gc.i()) : random.nextFloat();
/* 108 */         double d2 = (a == gc.a.b) ? (0.5D + 0.5625D * gc.j()) : random.nextFloat();
/* 109 */         double d3 = (a == gc.a.c) ? (0.5D + 0.5625D * gc.k()) : random.nextFloat();
/*     */         
/* 111 */         ☃.a(hd.a, fx1.u() + d1, fx1.v() + d2, fx1.w() + d3, 0.0D, 0.0D, 0.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 117 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */