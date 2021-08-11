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
/*     */ public abstract class buf
/*     */   extends buo
/*     */ {
/*  22 */   protected static final ddh a = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 0.5D, 15.0D);
/*  23 */   protected static final ddh b = buo.a(1.0D, 0.0D, 1.0D, 15.0D, 1.0D, 15.0D);
/*  24 */   protected static final dci c = new dci(0.125D, 0.0D, 0.125D, 0.875D, 0.25D, 0.875D);
/*     */   
/*     */   protected buf(ceg.c ☃) {
/*  27 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  32 */     return (g(☃) > 0) ? a : b;
/*     */   }
/*     */   
/*     */   protected int c() {
/*  36 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ai_() {
/*  41 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  46 */     if (gc1 == gc.a && !☃.a(bry1, fx1)) {
/*  47 */       return bup.a.n();
/*     */     }
/*  49 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  54 */     fx fx2 = fx1.c();
/*  55 */     return (c(brz1, fx2) || a(brz1, fx2, gc.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  60 */     int i = g(☃);
/*  61 */     if (i > 0) {
/*  62 */       a(aag1, fx1, ☃, i);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/*  68 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/*  72 */     int i = g(☃);
/*  73 */     if (i == 0) {
/*  74 */       a(brx1, fx1, ☃, i);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(brx ☃, fx fx1, ceh ceh1, int i) {
/*  79 */     int j = b(☃, fx1);
/*  80 */     boolean bool1 = (i > 0);
/*  81 */     boolean bool2 = (j > 0);
/*     */     
/*  83 */     if (i != j) {
/*  84 */       ceh ceh2 = a(ceh1, j);
/*  85 */       ☃.a(fx1, ceh2, 2);
/*  86 */       a(☃, fx1);
/*  87 */       ☃.b(fx1, ceh1, ceh2);
/*     */     } 
/*     */     
/*  90 */     if (!bool2 && bool1) {
/*  91 */       b(☃, fx1);
/*  92 */     } else if (bool2 && !bool1) {
/*  93 */       a(☃, fx1);
/*     */     } 
/*     */     
/*  96 */     if (bool2) {
/*  97 */       ☃.J().a(new fx(fx1), this, c());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void a(bry parambry, fx paramfx);
/*     */   
/*     */   protected abstract void b(bry parambry, fx paramfx);
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 107 */     if (bool || ☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 110 */     if (g(☃) > 0) {
/* 111 */       a(brx1, fx1);
/*     */     }
/*     */     
/* 114 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */   
/*     */   protected void a(brx ☃, fx fx1) {
/* 118 */     ☃.b(fx1, this);
/* 119 */     ☃.b(fx1.c(), this);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 124 */     return g(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 129 */     if (gc1 == gc.b) {
/* 130 */       return g(☃);
/*     */     }
/*     */     
/* 133 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/* 138 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public cvc f(ceh ☃) {
/* 143 */     return cvc.b;
/*     */   }
/*     */   
/*     */   protected abstract int b(brx parambrx, fx paramfx);
/*     */   
/*     */   protected abstract int g(ceh paramceh);
/*     */   
/*     */   protected abstract ceh a(ceh paramceh, int paramInt);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\buf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */