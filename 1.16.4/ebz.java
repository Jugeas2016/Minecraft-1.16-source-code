/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.List;
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
/*     */ 
/*     */ public class ebz
/*     */   extends ece<cca>
/*     */ {
/*     */   private final dwn a;
/*     */   private final dwn c;
/*     */   private final dwn d;
/*     */   
/*     */   public ebz(ecd ☃) {
/*  35 */     super(☃);
/*  36 */     this.a = a();
/*     */     
/*  38 */     this.c = new dwn(64, 64, 44, 0);
/*  39 */     this.c.a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F, 0.0F);
/*     */     
/*  41 */     this.d = new dwn(64, 64, 0, 42);
/*  42 */     this.d.a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F);
/*     */   }
/*     */   
/*     */   public static dwn a() {
/*  46 */     dwn ☃ = new dwn(64, 64, 0, 0);
/*  47 */     ☃.a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F, 0.0F);
/*  48 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(cca ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/*     */     long l;
/*  53 */     List<Pair<ccb, bkx>> list = ☃.c();
/*  54 */     if (list == null) {
/*     */       return;
/*     */     }
/*     */     
/*  58 */     float f1 = 0.6666667F;
/*  59 */     boolean bool = (☃.v() == null);
/*     */     
/*  61 */     dfm1.a();
/*     */ 
/*     */     
/*  64 */     if (bool) {
/*  65 */       l = 0L;
/*  66 */       dfm1.a(0.5D, 0.5D, 0.5D);
/*  67 */       this.c.h = true;
/*     */     } else {
/*  69 */       l = ☃.v().T();
/*     */       
/*  71 */       ceh ceh = ☃.p();
/*  72 */       if (ceh.b() instanceof btw) {
/*  73 */         dfm1.a(0.5D, 0.5D, 0.5D);
/*     */         
/*  75 */         float f3 = (-((Integer)ceh.c(btw.a)).intValue() * 360) / 16.0F;
/*  76 */         dfm1.a(g.d.a(f3));
/*     */         
/*  78 */         this.c.h = true;
/*     */       } else {
/*  80 */         dfm1.a(0.5D, -0.1666666716337204D, 0.5D);
/*  81 */         float f3 = -((gc)ceh.c(cbj.a)).o();
/*  82 */         dfm1.a(g.d.a(f3));
/*  83 */         dfm1.a(0.0D, -0.3125D, -0.4375D);
/*     */         
/*  85 */         this.c.h = false;
/*     */       } 
/*     */     } 
/*  88 */     dfm1.a();
/*  89 */     dfm1.a(0.6666667F, -0.6666667F, -0.6666667F);
/*  90 */     dfq dfq = els.f.a(eag1, eao::b);
/*  91 */     this.c.a(dfm1, dfq, i, j);
/*  92 */     this.d.a(dfm1, dfq, i, j);
/*     */     
/*  94 */     fx fx = ☃.o();
/*     */     
/*  96 */     float f2 = ((float)Math.floorMod((fx.u() * 7 + fx.v() * 9 + fx.w() * 13) + l, 100L) + f) / 100.0F;
/*  97 */     this.a.d = (-0.0125F + 0.01F * afm.b(6.2831855F * f2)) * 3.1415927F;
/*     */     
/*  99 */     this.a.b = -32.0F;
/*     */     
/* 101 */     a(dfm1, eag1, i, j, this.a, els.f, true, list);
/*     */     
/* 103 */     dfm1.b();
/* 104 */     dfm1.b();
/*     */   }
/*     */   
/*     */   public static void a(dfm ☃, eag eag1, int i, int j, dwn dwn1, elr elr1, boolean bool, List<Pair<ccb, bkx>> list) {
/* 108 */     a(☃, eag1, i, j, dwn1, elr1, bool, list, false);
/*     */   }
/*     */   
/*     */   public static void a(dfm ☃, eag eag1, int i, int j, dwn dwn1, elr elr1, boolean bool1, List<Pair<ccb, bkx>> list, boolean bool2) {
/* 112 */     dwn1.a(☃, elr1.a(eag1, eao::b, bool2), i, j);
/*     */     
/* 114 */     for (int k = 0; k < 17 && k < list.size(); k++) {
/* 115 */       Pair<ccb, bkx> pair = list.get(k);
/* 116 */       float[] arrayOfFloat = ((bkx)pair.getSecond()).e();
/* 117 */       elr elr2 = new elr(bool1 ? ear.c : ear.d, ((ccb)pair.getFirst()).a(bool1));
/* 118 */       dwn1.a(☃, elr2.a(eag1, eao::k), i, j, arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], 1.0F);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ebz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */