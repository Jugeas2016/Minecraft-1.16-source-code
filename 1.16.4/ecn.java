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
/*     */ public class ecn
/*     */   extends ece<cdf>
/*     */ {
/*  29 */   private final a a = new a();
/*     */   
/*     */   public ecn(ecd ☃) {
/*  32 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(cdf ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/*  37 */     ceh ceh = ☃.p();
/*     */     
/*  39 */     dfm1.a();
/*  40 */     float f1 = 0.6666667F;
/*  41 */     if (ceh.b() instanceof cal) {
/*  42 */       dfm1.a(0.5D, 0.5D, 0.5D);
/*  43 */       float f3 = -((((Integer)ceh.c(cal.c)).intValue() * 360) / 16.0F);
/*  44 */       dfm1.a(g.d.a(f3));
/*     */       
/*  46 */       this.a.b.h = true;
/*     */     } else {
/*  48 */       dfm1.a(0.5D, 0.5D, 0.5D);
/*  49 */       float f3 = -((gc)ceh.c(cbl.c)).o();
/*  50 */       dfm1.a(g.d.a(f3));
/*  51 */       dfm1.a(0.0D, -0.3125D, -0.4375D);
/*     */       
/*  53 */       this.a.b.h = false;
/*     */     } 
/*     */     
/*  56 */     dfm1.a();
/*  57 */     dfm1.a(0.6666667F, -0.6666667F, -0.6666667F);
/*  58 */     elr elr = a(ceh.b());
/*  59 */     dfq dfq = elr.a(eag1, this.a::a);
/*  60 */     this.a.a.a(dfm1, dfq, i, j);
/*  61 */     this.a.b.a(dfm1, dfq, i, j);
/*  62 */     dfm1.b();
/*  63 */     dku dku = this.b.a();
/*     */     
/*  65 */     float f2 = 0.010416667F;
/*  66 */     dfm1.a(0.0D, 0.3333333432674408D, 0.046666666865348816D);
/*  67 */     dfm1.a(0.010416667F, -0.010416667F, 0.010416667F);
/*  68 */     int k = ☃.g().h();
/*     */     
/*  70 */     double d = 0.4D;
/*  71 */     int m = (int)(det.b(k) * 0.4D);
/*  72 */     int n = (int)(det.c(k) * 0.4D);
/*  73 */     int i1 = (int)(det.d(k) * 0.4D);
/*     */     
/*  75 */     int i2 = det.a(0, i1, n, m);
/*     */     
/*  77 */     int i3 = 20;
/*  78 */     for (int i4 = 0; i4 < 4; i4++) {
/*  79 */       afa afa = ☃.a(i4, nr1 -> {
/*     */             List<afa> list = ☃.b(nr1, 90);
/*     */             return list.isEmpty() ? afa.a : list.get(0);
/*     */           });
/*  83 */       if (afa != null) {
/*     */ 
/*     */ 
/*     */         
/*  87 */         float f3 = (-dku.a(afa) / 2);
/*  88 */         dku.a(afa, f3, (i4 * 10 - 20), i2, false, dfm1.c().a(), eag1, false, 0, i);
/*     */       } 
/*  90 */     }  dfm1.b();
/*     */   }
/*     */   
/*     */   public static elr a(buo ☃) {
/*     */     cfq cfq;
/*  95 */     if (☃ instanceof bzt) {
/*  96 */       cfq = ((bzt)☃).c();
/*     */     } else {
/*  98 */       cfq = cfq.a;
/*     */     } 
/* 100 */     return ear.a(cfq);
/*     */   }
/*     */   
/*     */   public static final class a extends duv {
/*     */     public final dwn a;
/*     */     public final dwn b;
/*     */     
/*     */     public a() {
/* 108 */       super(eao::d);
/* 109 */       this.a = new dwn(64, 32, 0, 0);
/* 110 */       this.a.a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F, 0.0F);
/*     */       
/* 112 */       this.b = new dwn(64, 32, 0, 14);
/* 113 */       this.b.a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 118 */       this.a.a(☃, dfq1, i, j, f1, f2, f3, f4);
/* 119 */       this.b.a(☃, dfq1, i, j, f1, f2, f3, f4);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */