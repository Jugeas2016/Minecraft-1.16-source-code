/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class ccg
/*     */   extends ccj
/*     */   implements cdm
/*     */ {
/*  50 */   private final List<a> a = Lists.newArrayList();
/*     */   @Nullable
/*  52 */   private fx b = null;
/*     */   
/*     */   public enum b
/*     */   {
/*  56 */     a,
/*  57 */     b,
/*  58 */     c;
/*     */   }
/*     */   
/*     */   public ccg() {
/*  62 */     super(cck.G);
/*     */   }
/*     */ 
/*     */   
/*     */   public void X_() {
/*  67 */     if (d())
/*     */     {
/*  69 */       a((bfw)null, this.d.d_(o()), b.c);
/*     */     }
/*  71 */     super.X_();
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  75 */     if (this.d == null) {
/*  76 */       return false;
/*     */     }
/*     */     
/*  79 */     for (fx ☃ : fx.a(this.e.b(-1, -1, -1), this.e.b(1, 1, 1))) {
/*  80 */       if (this.d.d_(☃).b() instanceof bws) {
/*  81 */         return true;
/*     */       }
/*     */     } 
/*     */     
/*  85 */     return false;
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  89 */     return this.a.isEmpty();
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  93 */     return (this.a.size() == 3);
/*     */   }
/*     */   
/*     */   public void a(@Nullable bfw ☃, ceh ceh1, b b1) {
/*  97 */     List<aqa> list = a(ceh1, b1);
/*     */     
/*  99 */     if (☃ != null) {
/* 100 */       for (aqa aqa : list) {
/* 101 */         if (aqa instanceof baa) {
/* 102 */           baa baa = (baa)aqa;
/* 103 */           if (☃.cA().g(aqa.cA()) <= 16.0D) {
/* 104 */             if (!k()) {
/* 105 */               baa.h(☃); continue;
/*     */             } 
/* 107 */             baa.t(400);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private List<aqa> a(ceh ☃, b b1) {
/* 116 */     List<aqa> list = Lists.newArrayList();
/* 117 */     this.a.removeIf(a1 -> a(☃, a1, list, b1));
/* 118 */     return list;
/*     */   }
/*     */   
/*     */   public void a(aqa ☃, boolean bool) {
/* 122 */     a(☃, bool, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int j() {
/* 127 */     return this.a.size();
/*     */   }
/*     */   
/*     */   public static int a(ceh ☃) {
/* 131 */     return ((Integer)☃.c(buk.b)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean k() {
/* 136 */     return buy.a(this.d, o());
/*     */   }
/*     */   
/*     */   protected void l() {
/* 140 */     rz.a(this);
/*     */   }
/*     */   
/*     */   public void a(aqa ☃, boolean bool, int i) {
/* 144 */     if (this.a.size() >= 3) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 149 */     ☃.l();
/* 150 */     ☃.be();
/*     */     
/* 152 */     md md = new md();
/* 153 */     ☃.d(md);
/* 154 */     this.a.add(new a(md, i, bool ? 2400 : 600));
/*     */     
/* 156 */     if (this.d != null) {
/* 157 */       if (☃ instanceof baa) {
/* 158 */         baa baa = (baa)☃;
/*     */         
/* 160 */         if (baa.eL() && (!x() || this.d.t.nextBoolean())) {
/* 161 */           this.b = baa.eK();
/*     */         }
/*     */       } 
/*     */       
/* 165 */       fx fx1 = o();
/* 166 */       this.d.a((bfw)null, fx1.u(), fx1.v(), fx1.w(), adq.aF, adr.e, 1.0F, 1.0F);
/*     */     } 
/*     */     
/* 169 */     ☃.ad();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean a(ceh ☃, a a1, @Nullable List<aqa> list, b b1) {
/* 176 */     if ((this.d.N() || this.d.X()) && b1 != b.c) {
/* 177 */       return false;
/*     */     }
/*     */     
/* 180 */     fx fx1 = o();
/* 181 */     md md = a.a(a1);
/*     */ 
/*     */     
/* 184 */     md.r("Passengers");
/*     */     
/* 186 */     md.r("Leash");
/*     */     
/* 188 */     md.r("UUID");
/*     */     
/* 190 */     gc gc = (gc)☃.c(buk.a);
/* 191 */     fx fx2 = fx1.a(gc);
/* 192 */     boolean bool = !this.d.d_(fx2).k(this.d, fx2).b();
/*     */     
/* 194 */     if (bool && b1 != b.c) {
/* 195 */       return false;
/*     */     }
/*     */     
/* 198 */     aqa aqa = aqe.a(md, this.d, ☃ -> ☃);
/*     */     
/* 200 */     if (aqa != null) {
/*     */       
/* 202 */       if (!aqa.X().a(aee.d)) {
/* 203 */         return false;
/*     */       }
/*     */       
/* 206 */       if (aqa instanceof baa) {
/* 207 */         baa baa = (baa)aqa;
/*     */ 
/*     */ 
/*     */         
/* 211 */         if (x() && !baa.eL() && this.d.t.nextFloat() < 0.9F) {
/* 212 */           baa.g(this.b);
/*     */         }
/*     */         
/* 215 */         if (b1 == b.a) {
/* 216 */           baa.fb();
/*     */           
/* 218 */           if (☃.b().a(aed.aj)) {
/* 219 */             int i = a(☃);
/* 220 */             if (i < 5) {
/* 221 */               int j = (this.d.t.nextInt(100) == 0) ? 2 : 1;
/* 222 */               if (i + j > 5) {
/* 223 */                 j--;
/*     */               }
/* 225 */               this.d.a(o(), ☃.a(buk.b, Integer.valueOf(i + j)));
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 230 */         a(a.b(a1), baa);
/*     */         
/* 232 */         if (list != null) {
/* 233 */           list.add(baa);
/*     */         }
/*     */         
/* 236 */         float f = aqa.cy();
/* 237 */         double d1 = bool ? 0.0D : (0.55D + (f / 2.0F));
/* 238 */         double d2 = fx1.u() + 0.5D + d1 * gc.i();
/* 239 */         double d3 = fx1.v() + 0.5D - (aqa.cz() / 2.0F);
/* 240 */         double d4 = fx1.w() + 0.5D + d1 * gc.k();
/* 241 */         aqa.b(d2, d3, d4, aqa.p, aqa.q);
/*     */       } 
/*     */       
/* 244 */       this.d.a((bfw)null, fx1, adq.aG, adr.e, 1.0F, 1.0F);
/*     */       
/* 246 */       return this.d.c(aqa);
/*     */     } 
/*     */     
/* 249 */     return false;
/*     */   }
/*     */   
/*     */   private void a(int ☃, baa baa1) {
/* 253 */     int i = baa1.i();
/* 254 */     if (i < 0) {
/* 255 */       baa1.c_(Math.min(0, i + ☃));
/* 256 */     } else if (i > 0) {
/* 257 */       baa1.c_(Math.max(0, i - ☃));
/*     */     } 
/* 259 */     baa1.s(Math.max(0, baa1.eQ() - ☃));
/* 260 */     baa1.eO();
/*     */   }
/*     */   
/*     */   private boolean x() {
/* 264 */     return (this.b != null);
/*     */   }
/*     */   
/*     */   private void y() {
/* 268 */     Iterator<a> ☃ = this.a.iterator();
/* 269 */     ceh ceh = p();
/* 270 */     while (☃.hasNext()) {
/* 271 */       a a = ☃.next();
/* 272 */       if (a.b(a) > a.c(a)) {
/*     */         
/* 274 */         b b = a.a(a).q("HasNectar") ? b.a : b.b;
/* 275 */         if (a(ceh, a, (List<aqa>)null, b)) {
/* 276 */           ☃.remove();
/*     */         }
/*     */       } 
/* 279 */       a.d(a);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/* 285 */     if (this.d.v) {
/*     */       return;
/*     */     }
/*     */     
/* 289 */     y();
/*     */     
/* 291 */     fx ☃ = o();
/*     */     
/* 293 */     if (this.a.size() > 0 && this.d.u_().nextDouble() < 0.005D) {
/* 294 */       double d1 = ☃.u() + 0.5D;
/* 295 */       double d2 = ☃.v();
/* 296 */       double d3 = ☃.w() + 0.5D;
/* 297 */       this.d.a((bfw)null, d1, d2, d3, adq.aI, adr.e, 1.0F, 1.0F);
/*     */     } 
/*     */     
/* 300 */     l();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 305 */     super.a(☃, md1);
/*     */     
/* 307 */     this.a.clear();
/*     */     
/* 309 */     mj mj = md1.d("Bees", 10);
/* 310 */     for (int i = 0; i < mj.size(); i++) {
/* 311 */       md md2 = mj.a(i);
/* 312 */       a a = new a(md2.p("EntityData"), md2.h("TicksInHive"), md2.h("MinOccupationTicks"));
/* 313 */       this.a.add(a);
/*     */     } 
/*     */     
/* 316 */     this.b = null;
/* 317 */     if (md1.e("FlowerPos")) {
/* 318 */       this.b = mp.b(md1.p("FlowerPos"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 324 */     super.a(☃);
/*     */     
/* 326 */     ☃.a("Bees", m());
/* 327 */     if (x()) {
/* 328 */       ☃.a("FlowerPos", mp.a(this.b));
/*     */     }
/*     */     
/* 331 */     return ☃;
/*     */   }
/*     */   
/*     */   public mj m() {
/* 335 */     mj ☃ = new mj();
/* 336 */     for (a a : this.a) {
/* 337 */       a.a(a).r("UUID");
/* 338 */       md md = new md();
/* 339 */       md.a("EntityData", a.a(a));
/* 340 */       md.b("TicksInHive", a.b(a));
/* 341 */       md.b("MinOccupationTicks", a.c(a));
/* 342 */       ☃.add(md);
/*     */     } 
/* 344 */     return ☃;
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final md a;
/*     */     private int b;
/*     */     private final int c;
/*     */     
/*     */     private a(md ☃, int i, int j) {
/* 353 */       ☃.r("UUID");
/* 354 */       this.a = ☃;
/* 355 */       this.b = i;
/* 356 */       this.c = j;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */