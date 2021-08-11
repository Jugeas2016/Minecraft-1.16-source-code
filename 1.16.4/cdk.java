/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class cdk
/*     */   extends cdl
/*     */   implements cdm
/*     */ {
/*  39 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private long b;
/*     */   
/*     */   private int c;
/*     */   
/*     */   @Nullable
/*     */   private fx g;
/*     */   
/*     */   private boolean h;
/*     */ 
/*     */   
/*     */   public cdk() {
/*  53 */     super(cck.u);
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  58 */     super.a(☃);
/*  59 */     ☃.a("Age", this.b);
/*  60 */     if (this.g != null) {
/*  61 */       ☃.a("ExitPortal", mp.a(this.g));
/*     */     }
/*  63 */     if (this.h) {
/*  64 */       ☃.a("ExactTeleport", this.h);
/*     */     }
/*     */     
/*  67 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  72 */     super.a(☃, md1);
/*  73 */     this.b = md1.i("Age");
/*  74 */     if (md1.c("ExitPortal", 10)) {
/*  75 */       this.g = mp.b(md1.p("ExitPortal"));
/*     */     }
/*  77 */     this.h = md1.q("ExactTeleport");
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/*  82 */     return 256.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  87 */     boolean ☃ = d();
/*  88 */     boolean bool1 = f();
/*  89 */     this.b++;
/*     */     
/*  91 */     if (bool1) {
/*  92 */       this.c--;
/*  93 */     } else if (!this.d.v) {
/*  94 */       List<aqa> list = this.d.a(aqa.class, new dci(o()), cdk::a);
/*  95 */       if (!list.isEmpty()) {
/*  96 */         b(list.get(this.d.t.nextInt(list.size())));
/*     */       }
/*  98 */       if (this.b % 2400L == 0L) {
/*  99 */         h();
/*     */       }
/*     */     } 
/*     */     
/* 103 */     if (☃ != d() || bool1 != f()) {
/* 104 */       X_();
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean a(aqa ☃) {
/* 109 */     return (aqd.g.test(☃) && !☃.cr().ai());
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 113 */     return (this.b < 200L);
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 117 */     return (this.c > 0);
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 121 */     return afm.a(((float)this.b + ☃) / 200.0F, 0.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public float b(float ☃) {
/* 125 */     return 1.0F - afm.a((this.c - ☃) / 40.0F, 0.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/* 131 */     return new ow(this.e, 8, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/* 136 */     return a(new md());
/*     */   }
/*     */   
/*     */   public void h() {
/* 140 */     if (!this.d.v) {
/* 141 */       this.c = 40;
/* 142 */       this.d.a(o(), p().b(), 1, 0);
/* 143 */       X_();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, int i) {
/* 149 */     if (☃ == 1) {
/* 150 */       this.c = 40;
/* 151 */       return true;
/*     */     } 
/*     */     
/* 154 */     return super.a_(☃, i);
/*     */   }
/*     */   
/*     */   public void b(aqa ☃) {
/* 158 */     if (!(this.d instanceof aag) || f()) {
/*     */       return;
/*     */     }
/* 161 */     this.c = 100;
/*     */ 
/*     */     
/* 164 */     if (this.g == null && this.d.Y() == brx.i) {
/* 165 */       a((aag)this.d);
/*     */     }
/*     */     
/* 168 */     if (this.g != null) {
/* 169 */       aqa aqa1; fx fx1 = this.h ? this.g : k();
/*     */       
/* 171 */       if (☃ instanceof bgv) {
/* 172 */         aqa aqa2 = ((bgv)☃).v();
/* 173 */         if (aqa2 instanceof aah) {
/* 174 */           ac.d.a((aah)aqa2, this.d.d_(o()));
/*     */         }
/* 176 */         if (aqa2 != null) {
/* 177 */           aqa1 = aqa2;
/* 178 */           ☃.ad();
/*     */         } else {
/* 180 */           aqa1 = ☃;
/*     */         } 
/*     */       } else {
/* 183 */         aqa1 = ☃.cr();
/*     */       } 
/* 185 */       aqa1.ah();
/* 186 */       aqa1.m(fx1.u() + 0.5D, fx1.v(), fx1.w() + 0.5D);
/*     */     } 
/*     */     
/* 189 */     h();
/*     */   }
/*     */   
/*     */   private fx k() {
/* 193 */     fx ☃ = a(this.d, this.g.b(0, 2, 0), 5, false);
/* 194 */     a.debug("Best exit position for portal at {} is {}", this.g, ☃);
/* 195 */     return ☃.b();
/*     */   }
/*     */   
/*     */   private void a(aag ☃) {
/* 199 */     dcn dcn1 = (new dcn(o().u(), 0.0D, o().w())).d();
/* 200 */     dcn dcn2 = dcn1.a(1024.0D);
/*     */     
/* 202 */     int i = 16;
/* 203 */     while (a(☃, dcn2).b() > 0 && i-- > 0) {
/* 204 */       a.debug("Skipping backwards past nonempty chunk at {}", dcn2);
/* 205 */       dcn2 = dcn2.e(dcn1.a(-16.0D));
/*     */     } 
/*     */     
/* 208 */     i = 16;
/* 209 */     while (a(☃, dcn2).b() == 0 && i-- > 0) {
/* 210 */       a.debug("Skipping forward past empty chunk at {}", dcn2);
/* 211 */       dcn2 = dcn2.e(dcn1.a(16.0D));
/*     */     } 
/* 213 */     a.debug("Found chunk at {}", dcn2);
/*     */     
/* 215 */     cgh cgh = a(☃, dcn2);
/*     */     
/* 217 */     this.g = a(cgh);
/*     */     
/* 219 */     if (this.g == null) {
/* 220 */       this.g = new fx(dcn2.b + 0.5D, 75.0D, dcn2.d + 0.5D);
/* 221 */       a.debug("Failed to find suitable block, settling on {}", this.g);
/* 222 */       kh.e.a(☃, ☃.i().g(), new Random(this.g.a()), this.g);
/*     */     } else {
/* 224 */       a.debug("Found block at {}", this.g);
/*     */     } 
/*     */     
/* 227 */     this.g = a(☃, this.g, 16, true);
/* 228 */     a.debug("Creating portal at {}", this.g);
/*     */     
/* 230 */     this.g = this.g.b(10);
/* 231 */     a(☃, this.g);
/* 232 */     X_();
/*     */   }
/*     */   
/*     */   private static fx a(brc ☃, fx fx1, int i, boolean bool) {
/* 236 */     fx fx2 = null;
/*     */     
/* 238 */     for (int j = -i; j <= i; j++) {
/* 239 */       for (int k = -i; k <= i; k++) {
/* 240 */         if (j != 0 || k != 0 || bool)
/*     */         {
/*     */ 
/*     */           
/* 244 */           for (int m = 255; m > ((fx2 == null) ? 0 : fx2.v()); m--) {
/* 245 */             fx fx3 = new fx(fx1.u() + j, m, fx1.w() + k);
/* 246 */             ceh ceh = ☃.d_(fx3);
/* 247 */             if (ceh.r(☃, fx3) && (bool || !ceh.a(bup.z))) {
/* 248 */               fx2 = fx3;
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } 
/* 255 */     return (fx2 == null) ? fx1 : fx2;
/*     */   }
/*     */   
/*     */   private static cgh a(brx ☃, dcn dcn1) {
/* 259 */     return ☃.d(afm.c(dcn1.b / 16.0D), afm.c(dcn1.d / 16.0D));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static fx a(cgh ☃) {
/* 264 */     brd brd = ☃.g();
/* 265 */     fx fx1 = new fx(brd.d(), 30, brd.e());
/* 266 */     int i = ☃.b() + 16 - 1;
/* 267 */     fx fx2 = new fx(brd.f(), i, brd.g());
/* 268 */     fx fx3 = null;
/* 269 */     double d = 0.0D;
/*     */ 
/*     */     
/* 272 */     for (fx fx4 : fx.a(fx1, fx2)) {
/* 273 */       ceh ceh = ☃.d_(fx4);
/*     */       
/* 275 */       fx fx5 = fx4.b();
/* 276 */       fx fx6 = fx4.b(2);
/* 277 */       if (ceh.a(bup.ee) && !☃.d_(fx5).r(☃, fx5) && !☃.d_(fx6).r(☃, fx6)) {
/* 278 */         double d1 = fx4.a(0.0D, 0.0D, 0.0D, true);
/* 279 */         if (fx3 == null || d1 < d) {
/* 280 */           fx3 = fx4;
/* 281 */           d = d1;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 286 */     return fx3;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(aag ☃, fx fx1) {
/* 291 */     cjl.D.b(clz.a(o(), false)).a(☃, ☃.i().g(), new Random(), fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(gc ☃) {
/* 296 */     return buo.c(p(), this.d, o(), ☃);
/*     */   }
/*     */   
/*     */   public int j() {
/* 300 */     int ☃ = 0;
/* 301 */     for (gc gc : gc.values()) {
/* 302 */       ☃ += a(gc) ? 1 : 0;
/*     */     }
/* 304 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(fx ☃, boolean bool) {
/* 308 */     this.h = bool;
/* 309 */     this.g = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */