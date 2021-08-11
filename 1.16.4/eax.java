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
/*     */ public class eax
/*     */   implements aci
/*     */ {
/*     */   private final eaw a;
/*     */   private final eaz b;
/*     */   private final eay c;
/*  31 */   private final Random d = new Random();
/*     */   private final dko e;
/*     */   
/*     */   public eax(eaw ☃, dko dko1) {
/*  35 */     this.a = ☃;
/*  36 */     this.e = dko1;
/*  37 */     this.b = new eaz(this.e);
/*  38 */     this.c = new eay();
/*     */   }
/*     */   
/*     */   public eaw a() {
/*  42 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(ceh ☃, fx fx1, bra bra1, dfm dfm1, dfq dfq1) {
/*  46 */     if (☃.h() != bzh.c) {
/*     */       return;
/*     */     }
/*     */     
/*  50 */     elo elo = this.a.b(☃);
/*  51 */     long l = ☃.a(fx1);
/*  52 */     this.b.a(bra1, elo, ☃, fx1, dfm1, dfq1, true, this.d, l, ejw.a);
/*     */   }
/*     */   
/*     */   public boolean a(ceh ☃, fx fx1, bra bra1, dfm dfm1, dfq dfq1, boolean bool, Random random) {
/*     */     try {
/*  57 */       bzh bzh = ☃.h();
/*  58 */       if (bzh != bzh.c) {
/*  59 */         return false;
/*     */       }
/*  61 */       return this.b.a(bra1, a(☃), ☃, fx1, dfm1, dfq1, bool, random, ☃.a(fx1), ejw.a);
/*  62 */     } catch (Throwable throwable) {
/*  63 */       l l = l.a(throwable, "Tesselating block in world");
/*  64 */       m m = l.a("Block being tesselated");
/*     */       
/*  66 */       m.a(m, fx1, ☃);
/*     */       
/*  68 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a(fx ☃, bra bra1, dfq dfq1, cux cux1) {
/*     */     try {
/*  74 */       return this.c.a(bra1, ☃, dfq1, cux1);
/*  75 */     } catch (Throwable throwable) {
/*  76 */       l l = l.a(throwable, "Tesselating liquid in world");
/*  77 */       m m = l.a("Block being tesselated");
/*     */       
/*  79 */       m.a(m, ☃, (ceh)null);
/*     */       
/*  81 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public eaz b() {
/*  86 */     return this.b;
/*     */   }
/*     */   
/*     */   public elo a(ceh ☃) {
/*  90 */     return this.a.b(☃);
/*     */   } public void a(ceh ☃, dfm dfm1, eag eag1, int i, int j) {
/*     */     elo elo;
/*     */     int k;
/*     */     float f1, f2, f3;
/*  95 */     bzh bzh = ☃.h();
/*  96 */     if (bzh == bzh.a) {
/*     */       return;
/*     */     }
/*     */     
/* 100 */     switch (null.a[bzh.ordinal()]) {
/*     */       case 1:
/* 102 */         elo = a(☃);
/*     */         
/* 104 */         k = this.e.a(☃, null, null, 0);
/* 105 */         f1 = (k >> 16 & 0xFF) / 255.0F;
/* 106 */         f2 = (k >> 8 & 0xFF) / 255.0F;
/* 107 */         f3 = (k & 0xFF) / 255.0F;
/*     */         
/* 109 */         this.b.a(dfm1.c(), eag1.getBuffer(eab.a(☃, false)), ☃, elo, f1, f2, f3, i, j);
/*     */         break;
/*     */       case 2:
/* 112 */         dzs.a.a(new bmb(☃.b()), ebm.b.a, dfm1, eag1, i, j);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ach ☃) {
/* 119 */     this.c.a();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */