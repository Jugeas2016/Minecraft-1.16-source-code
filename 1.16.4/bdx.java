/*     */ import java.util.EnumSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdx
/*     */   extends bdq
/*     */ {
/*     */   private b b;
/*     */   
/*     */   public bdx(aqe<? extends bdx> ☃, brx brx1) {
/*  39 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  44 */     this.b = new b(this);
/*     */     
/*  46 */     this.bk.a(1, new avp(this));
/*     */     
/*  48 */     this.bk.a(3, this.b);
/*     */     
/*  50 */     this.bk.a(4, new awf(this, 1.0D, false));
/*  51 */     this.bk.a(5, new a(this));
/*     */     
/*  53 */     this.bl.a(1, (new axp(this, new Class[0])).a(new Class[0]));
/*  54 */     this.bl.a(2, new axq<>(this, bfw.class, true));
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/*  59 */     return 0.1D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/*  64 */     return 0.13F;
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  68 */     return bdq.eR()
/*  69 */       .a(arl.a, 8.0D)
/*  70 */       .a(arl.d, 0.25D)
/*  71 */       .a(arl.f, 1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  76 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/*  81 */     return adq.no;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/*  86 */     return adq.nq;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/*  91 */     return adq.np;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/*  96 */     a(adq.nr, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 101 */     if (b(☃)) {
/* 102 */       return false;
/*     */     }
/* 104 */     if ((☃ instanceof apl || ☃ == apk.o) && this.b != null) {
/* 105 */       this.b.g();
/*     */     }
/* 107 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void j() {
/* 113 */     this.aA = this.p;
/*     */     
/* 115 */     super.j();
/*     */   }
/*     */ 
/*     */   
/*     */   public void n(float ☃) {
/* 120 */     this.p = ☃;
/* 121 */     super.n(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/* 127 */     if (bxp.h(brz1.d_(☃.c()))) {
/* 128 */       return 10.0F;
/*     */     }
/* 130 */     return super.a(☃, brz1);
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<bdx> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 134 */     if (c((aqe)☃, bry1, aqp1, fx1, random)) {
/* 135 */       bfw bfw = bry1.a(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, 5.0D, true);
/* 136 */       return (bfw == null);
/*     */     } 
/*     */     
/* 139 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 144 */     return aqq.c;
/*     */   }
/*     */   
/*     */   static class b extends avv {
/*     */     private final bdx a;
/*     */     private int b;
/*     */     
/*     */     public b(bdx ☃) {
/* 152 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public void g() {
/* 156 */       if (this.b == 0) {
/* 157 */         this.b = 20;
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 163 */       return (this.b > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 168 */       this.b--;
/* 169 */       if (this.b <= 0) {
/* 170 */         brx ☃ = this.a.l;
/* 171 */         Random random = this.a.cY();
/*     */ 
/*     */         
/* 174 */         fx fx = this.a.cB();
/*     */         
/*     */         int i;
/* 177 */         for (i = 0; i <= 5 && i >= -5; i = ((i <= 0) ? 1 : 0) - i) {
/* 178 */           int j; for (j = 0; j <= 10 && j >= -10; j = ((j <= 0) ? 1 : 0) - j) {
/* 179 */             int k; for (k = 0; k <= 10 && k >= -10; k = ((k <= 0) ? 1 : 0) - k) {
/* 180 */               fx fx1 = fx.b(j, i, k);
/* 181 */               ceh ceh = ☃.d_(fx1);
/*     */               
/* 183 */               buo buo = ceh.b();
/* 184 */               if (buo instanceof bxp) {
/* 185 */                 if (☃.V().b(brt.b)) {
/* 186 */                   ☃.a(fx1, true, this.a);
/*     */                 } else {
/* 188 */                   ☃.a(fx1, ((bxp)buo).c().n(), 3);
/*     */                 } 
/* 190 */                 if (random.nextBoolean())
/*     */                   // Byte code: goto -> 237 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends awt {
/*     */     private gc h;
/*     */     private boolean i;
/*     */     
/*     */     public a(bdx ☃) {
/* 206 */       super(☃, 1.0D, 10);
/*     */       
/* 208 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 213 */       if (this.a.A() != null) {
/* 214 */         return false;
/*     */       }
/* 216 */       if (!this.a.x().m()) {
/* 217 */         return false;
/*     */       }
/*     */       
/* 220 */       Random ☃ = this.a.cY();
/* 221 */       if (this.a.l.V().b(brt.b) && ☃.nextInt(10) == 0) {
/* 222 */         this.h = gc.a(☃);
/*     */         
/* 224 */         fx fx = (new fx(this.a.cD(), this.a.cE() + 0.5D, this.a.cH())).a(this.h);
/* 225 */         ceh ceh = this.a.l.d_(fx);
/* 226 */         if (bxp.h(ceh)) {
/* 227 */           this.i = true;
/* 228 */           return true;
/*     */         } 
/*     */       } 
/*     */       
/* 232 */       this.i = false;
/* 233 */       return super.a();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 238 */       if (this.i) {
/* 239 */         return false;
/*     */       }
/* 241 */       return super.b();
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 246 */       if (!this.i) {
/* 247 */         super.c();
/*     */         
/*     */         return;
/*     */       } 
/* 251 */       bry ☃ = this.a.l;
/* 252 */       fx fx = (new fx(this.a.cD(), this.a.cE() + 0.5D, this.a.cH())).a(this.h);
/* 253 */       ceh ceh = ☃.d_(fx);
/*     */       
/* 255 */       if (bxp.h(ceh)) {
/* 256 */         ☃.a(fx, bxp.c(ceh.b()), 3);
/* 257 */         this.a.G();
/* 258 */         this.a.ad();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */