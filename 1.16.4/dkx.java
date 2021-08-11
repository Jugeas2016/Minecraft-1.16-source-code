/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public class dkx
/*     */   implements AutoCloseable
/*     */ {
/*  25 */   private static final vk a = new vk("textures/map/map_icons.png");
/*  26 */   private static final eao b = eao.p(a);
/*     */ 
/*     */   
/*     */   private final ekd c;
/*     */   
/*  31 */   private final Map<String, a> d = Maps.newHashMap();
/*     */   
/*     */   public dkx(ekd ☃) {
/*  34 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public void a(cxx ☃) {
/*  38 */     a.a(b(☃));
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, eag eag1, cxx cxx1, boolean bool, int i) {
/*  42 */     a.a(b(cxx1), ☃, eag1, bool, i);
/*     */   }
/*     */   
/*     */   private a b(cxx ☃) {
/*  46 */     a a = this.d.get(☃.d());
/*     */     
/*  48 */     if (a == null) {
/*  49 */       a = new a(☃);
/*  50 */       this.d.put(☃.d(), a);
/*     */     } 
/*  52 */     return a;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public a a(String ☃) {
/*  57 */     return this.d.get(☃);
/*     */   }
/*     */   
/*     */   public void a() {
/*  61 */     for (a ☃ : this.d.values()) {
/*  62 */       ☃.close();
/*     */     }
/*     */     
/*  65 */     this.d.clear();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cxx a(@Nullable a ☃) {
/*  70 */     if (☃ != null) {
/*  71 */       return a.b(☃);
/*     */     }
/*  73 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*  78 */     a();
/*     */   }
/*     */   
/*     */   class a implements AutoCloseable {
/*     */     private final cxx b;
/*     */     private final ejs c;
/*     */     private final eao d;
/*     */     
/*     */     private a(dkx this$0, cxx ☃) {
/*  87 */       this.b = ☃;
/*  88 */       this.c = new ejs(128, 128, true);
/*  89 */       vk vk = dkx.a(dkx.this).a("map/" + ☃.d(), this.c);
/*  90 */       this.d = eao.p(vk);
/*     */     }
/*     */     
/*     */     private void a() {
/*  94 */       for (int ☃ = 0; ☃ < 128; ☃++) {
/*  95 */         for (int i = 0; i < 128; i++) {
/*  96 */           int j = i + ☃ * 128;
/*  97 */           int k = this.b.g[j] & 0xFF;
/*  98 */           if (k / 4 == 0) {
/*  99 */             this.c.e().a(i, ☃, 0);
/*     */           } else {
/* 101 */             this.c.e().a(i, ☃, cvb.a[k / 4].a(k & 0x3));
/*     */           } 
/*     */         } 
/*     */       } 
/* 105 */       this.c.a();
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, eag eag1, boolean bool, int i) {
/* 109 */       int j = 0;
/* 110 */       int k = 0;
/*     */       
/* 112 */       float f = 0.0F;
/*     */       
/* 114 */       b b = ☃.c().a();
/* 115 */       dfq dfq = eag1.getBuffer(this.d);
/* 116 */       dfq.a(b, 0.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 1.0F).a(i).d();
/* 117 */       dfq.a(b, 128.0F, 128.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 1.0F).a(i).d();
/* 118 */       dfq.a(b, 128.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(1.0F, 0.0F).a(i).d();
/* 119 */       dfq.a(b, 0.0F, 0.0F, -0.01F).a(255, 255, 255, 255).a(0.0F, 0.0F).a(i).d();
/*     */       
/* 121 */       int m = 0;
/* 122 */       for (cxu cxu : this.b.j.values()) {
/* 123 */         if (bool && !cxu.f()) {
/*     */           continue;
/*     */         }
/* 126 */         ☃.a();
/* 127 */         ☃.a((0.0F + cxu.c() / 2.0F + 64.0F), (0.0F + cxu.d() / 2.0F + 64.0F), -0.019999999552965164D);
/* 128 */         ☃.a(g.f.a((cxu.e() * 360) / 16.0F));
/* 129 */         ☃.a(4.0F, 4.0F, 3.0F);
/* 130 */         ☃.a(-0.125D, 0.125D, 0.0D);
/*     */         
/* 132 */         byte b1 = cxu.a();
/* 133 */         float f1 = (b1 % 16 + 0) / 16.0F;
/* 134 */         float f2 = (b1 / 16 + 0) / 16.0F;
/* 135 */         float f3 = (b1 % 16 + 1) / 16.0F;
/* 136 */         float f4 = (b1 / 16 + 1) / 16.0F;
/*     */         
/* 138 */         b b2 = ☃.c().a();
/*     */         
/* 140 */         float f5 = -0.001F;
/*     */         
/* 142 */         dfq dfq1 = eag1.getBuffer(dkx.b());
/* 143 */         dfq1.a(b2, -1.0F, 1.0F, m * -0.001F).a(255, 255, 255, 255).a(f1, f2).a(i).d();
/* 144 */         dfq1.a(b2, 1.0F, 1.0F, m * -0.001F).a(255, 255, 255, 255).a(f3, f2).a(i).d();
/* 145 */         dfq1.a(b2, 1.0F, -1.0F, m * -0.001F).a(255, 255, 255, 255).a(f3, f4).a(i).d();
/* 146 */         dfq1.a(b2, -1.0F, -1.0F, m * -0.001F).a(255, 255, 255, 255).a(f1, f4).a(i).d();
/* 147 */         ☃.b();
/*     */         
/* 149 */         if (cxu.g() != null) {
/* 150 */           dku dku = (djz.C()).g;
/* 151 */           nr nr = cxu.g();
/* 152 */           float f6 = dku.a(nr);
/* 153 */           dku.getClass(); float f7 = afm.a(25.0F / f6, 0.0F, 6.0F / 9.0F);
/*     */           
/* 155 */           ☃.a();
/* 156 */           ☃.a((0.0F + cxu.c() / 2.0F + 64.0F - f6 * f7 / 2.0F), (0.0F + cxu.d() / 2.0F + 64.0F + 4.0F), -0.02500000037252903D);
/* 157 */           ☃.a(f7, f7, 1.0F);
/* 158 */           ☃.a(0.0D, 0.0D, -0.10000000149011612D);
/*     */           
/* 160 */           dku.a(nr, 0.0F, 0.0F, -1, false, ☃.c().a(), eag1, false, -2147483648, i);
/* 161 */           ☃.b();
/*     */         } 
/*     */         
/* 164 */         m++;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() {
/* 170 */       this.c.close();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */