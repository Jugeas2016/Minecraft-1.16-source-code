/*     */ import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntFunction;
/*     */ import java.util.Calendar;
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
/*     */ public class ech<T extends ccj & cdc>
/*     */   extends ece<T>
/*     */ {
/*     */   private final dwn a;
/*     */   private final dwn c;
/*     */   private final dwn d;
/*     */   private final dwn e;
/*     */   private final dwn f;
/*     */   private final dwn g;
/*     */   private final dwn h;
/*     */   private final dwn i;
/*     */   private final dwn j;
/*     */   private boolean k;
/*     */   
/*     */   public ech(ecd ☃) {
/*  43 */     super(☃);
/*  44 */     Calendar calendar = Calendar.getInstance();
/*  45 */     if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
/*  46 */       this.k = true;
/*     */     }
/*     */     
/*  49 */     this.c = new dwn(64, 64, 0, 19);
/*  50 */     this.c.a(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F, 0.0F);
/*     */     
/*  52 */     this.a = new dwn(64, 64, 0, 0);
/*  53 */     this.a.a(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F, 0.0F);
/*  54 */     this.a.b = 9.0F;
/*  55 */     this.a.c = 1.0F;
/*     */     
/*  57 */     this.d = new dwn(64, 64, 0, 0);
/*  58 */     this.d.a(7.0F, -1.0F, 15.0F, 2.0F, 4.0F, 1.0F, 0.0F);
/*  59 */     this.d.b = 8.0F;
/*     */     
/*  61 */     this.f = new dwn(64, 64, 0, 19);
/*  62 */     this.f.a(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
/*     */     
/*  64 */     this.e = new dwn(64, 64, 0, 0);
/*  65 */     this.e.a(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
/*  66 */     this.e.b = 9.0F;
/*  67 */     this.e.c = 1.0F;
/*     */     
/*  69 */     this.g = new dwn(64, 64, 0, 0);
/*  70 */     this.g.a(15.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
/*  71 */     this.g.b = 8.0F;
/*     */     
/*  73 */     this.i = new dwn(64, 64, 0, 19);
/*  74 */     this.i.a(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
/*     */     
/*  76 */     this.h = new dwn(64, 64, 0, 0);
/*  77 */     this.h.a(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
/*  78 */     this.h.b = 9.0F;
/*  79 */     this.h.c = 1.0F;
/*     */     
/*  81 */     this.j = new dwn(64, 64, 0, 0);
/*  82 */     this.j.a(0.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
/*  83 */     this.j.b = 8.0F;
/*     */   }
/*     */   
/*     */   public void a(T ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/*     */     bwc.c<? extends ccn> c;
/*  88 */     brx brx = ☃.v();
/*  89 */     boolean bool1 = (brx != null);
/*     */     
/*  91 */     ceh ceh = bool1 ? ☃.p() : bup.bR.n().a(bve.b, gc.d);
/*  92 */     cez cez = ceh.b(bve.c) ? (cez)ceh.c(bve.c) : cez.a;
/*  93 */     buo buo = ceh.b();
/*  94 */     if (!(buo instanceof btn)) {
/*     */       return;
/*     */     }
/*  97 */     btn<?> btn = (btn)buo;
/*  98 */     boolean bool2 = (cez != cez.a);
/*     */     
/* 100 */     dfm1.a();
/*     */     
/* 102 */     float f1 = ((gc)ceh.c(bve.b)).o();
/* 103 */     dfm1.a(0.5D, 0.5D, 0.5D);
/* 104 */     dfm1.a(g.d.a(-f1));
/* 105 */     dfm1.a(-0.5D, -0.5D, -0.5D);
/*     */ 
/*     */     
/* 108 */     if (bool1) {
/* 109 */       c = btn.a(ceh, brx, ☃.o(), true);
/*     */     } else {
/* 111 */       c = bwc.b::b;
/*     */     } 
/*     */     
/* 114 */     float f2 = ((Float2FloatFunction)c.<Float2FloatFunction>apply(bve.a((cdc)☃))).get(f);
/*     */     
/* 116 */     f2 = 1.0F - f2;
/* 117 */     f2 = 1.0F - f2 * f2 * f2;
/*     */     
/* 119 */     int k = ((Int2IntFunction)c.<Int2IntFunction>apply(new ecf<>())).applyAsInt(i);
/* 120 */     elr elr = ear.a((ccj)☃, cez, this.k);
/*     */     
/* 122 */     dfq dfq = elr.a(eag1, eao::c);
/* 123 */     if (bool2) {
/* 124 */       if (cez == cez.b) {
/* 125 */         a(dfm1, dfq, this.h, this.j, this.i, f2, k, j);
/*     */       } else {
/* 127 */         a(dfm1, dfq, this.e, this.g, this.f, f2, k, j);
/*     */       } 
/*     */     } else {
/* 130 */       a(dfm1, dfq, this.a, this.d, this.c, f2, k, j);
/*     */     } 
/*     */     
/* 133 */     dfm1.b();
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, dfq dfq1, dwn dwn1, dwn dwn2, dwn dwn3, float f, int i, int j) {
/* 137 */     dwn1.d = -(f * 1.5707964F);
/* 138 */     dwn2.d = dwn1.d;
/*     */     
/* 140 */     dwn1.a(☃, dfq1, i, j);
/* 141 */     dwn2.a(☃, dfq1, i, j);
/* 142 */     dwn3.a(☃, dfq1, i, j);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ech.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */