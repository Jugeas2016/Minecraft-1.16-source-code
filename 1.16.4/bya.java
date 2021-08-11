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
/*     */ public class bya
/*     */   extends bwn
/*     */ {
/*  27 */   public static final cey a = cex.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  33 */   protected static final ddh b = buo.a(5.0D, 4.0D, 10.0D, 11.0D, 12.0D, 16.0D);
/*  34 */   protected static final ddh c = buo.a(5.0D, 4.0D, 0.0D, 11.0D, 12.0D, 6.0D);
/*  35 */   protected static final ddh d = buo.a(10.0D, 4.0D, 5.0D, 16.0D, 12.0D, 11.0D);
/*  36 */   protected static final ddh e = buo.a(0.0D, 4.0D, 5.0D, 6.0D, 12.0D, 11.0D);
/*     */   
/*  38 */   protected static final ddh f = buo.a(5.0D, 0.0D, 4.0D, 11.0D, 6.0D, 12.0D);
/*  39 */   protected static final ddh g = buo.a(4.0D, 0.0D, 5.0D, 12.0D, 6.0D, 11.0D);
/*     */   
/*  41 */   protected static final ddh h = buo.a(5.0D, 10.0D, 4.0D, 11.0D, 16.0D, 12.0D);
/*  42 */   protected static final ddh i = buo.a(4.0D, 10.0D, 5.0D, 12.0D, 16.0D, 11.0D);
/*     */   
/*     */   protected bya(ceg.c ☃) {
/*  45 */     super(☃);
/*  46 */     j(((ceh)this.n.b()).a(aq, gc.c).a(a, Boolean.valueOf(false)).a(u, cet.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  51 */     switch (null.c[((cet)☃.c(u)).ordinal()]) {
/*     */       case 1:
/*  53 */         switch (null.a[((gc)☃.c(aq)).n().ordinal()]) {
/*     */           case 1:
/*  55 */             return g;
/*     */         } 
/*     */         
/*  58 */         return f;
/*     */       
/*     */       case 2:
/*  61 */         switch (null.b[((gc)☃.c(aq)).ordinal()]) {
/*     */           case 1:
/*  63 */             return e;
/*     */           case 2:
/*  65 */             return d;
/*     */           case 3:
/*  67 */             return c;
/*     */         } 
/*     */         
/*  70 */         return b;
/*     */     } 
/*     */ 
/*     */     
/*  74 */     switch (null.a[((gc)☃.c(aq)).n().ordinal()]) {
/*     */       case 1:
/*  76 */         return i;
/*     */     } 
/*     */     
/*  79 */     return h;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  87 */     if (brx1.v) {
/*  88 */       ceh ceh2 = ☃.a(a);
/*  89 */       if (((Boolean)ceh2.c(a)).booleanValue()) {
/*  90 */         a(ceh2, brx1, fx1, 1.0F);
/*     */       }
/*  92 */       return aou.a;
/*     */     } 
/*     */     
/*  95 */     ceh ceh1 = d(☃, brx1, fx1);
/*     */     
/*  97 */     float f = ((Boolean)ceh1.c(a)).booleanValue() ? 0.6F : 0.5F;
/*  98 */     brx1.a((bfw)null, fx1, adq.hb, adr.e, 0.3F, f);
/*     */     
/* 100 */     return aou.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh d(ceh ☃, brx brx1, fx fx1) {
/* 107 */     ☃ = ☃.a(a);
/* 108 */     brx1.a(fx1, ☃, 3);
/* 109 */     e(☃, brx1, fx1);
/* 110 */     return ☃;
/*     */   }
/*     */   
/*     */   private static void a(ceh ☃, bry bry1, fx fx1, float f) {
/* 114 */     gc gc1 = ((gc)☃.c(aq)).f();
/* 115 */     gc gc2 = h(☃).f();
/* 116 */     double d1 = fx1.u() + 0.5D + 0.1D * gc1.i() + 0.2D * gc2.i();
/* 117 */     double d2 = fx1.v() + 0.5D + 0.1D * gc1.j() + 0.2D * gc2.j();
/* 118 */     double d3 = fx1.w() + 0.5D + 0.1D * gc1.k() + 0.2D * gc2.k();
/*     */     
/* 120 */     bry1.a(new hd(1.0F, 0.0F, 0.0F, f), d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 125 */     if (((Boolean)☃.c(a)).booleanValue() && random.nextFloat() < 0.25F) {
/* 126 */       a(☃, brx1, fx1, 0.5F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 132 */     if (bool || ☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 135 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 136 */       e(☃, brx1, fx1);
/*     */     }
/* 138 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 143 */     return ((Boolean)☃.c(a)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 148 */     if (((Boolean)☃.c(a)).booleanValue() && h(☃) == gc1) {
/* 149 */       return 15;
/*     */     }
/* 151 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void e(ceh ☃, brx brx1, fx fx1) {
/* 161 */     brx1.b(fx1, this);
/* 162 */     brx1.b(fx1.a(h(☃).f()), this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 167 */     ☃.a((cfj<?>[])new cfj[] { u, aq, a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bya.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */