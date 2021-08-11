/*     */ import java.util.List;
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
/*     */ public class bis
/*     */   extends bic
/*     */ {
/*  25 */   private final aon f = new apa(this, 2)
/*     */     {
/*     */       public void X_() {
/*  28 */         super.X_();
/*  29 */         this.a.a(this);
/*     */       }
/*     */     };
/*     */   
/*     */   private final bim g;
/*  34 */   private final Random h = new Random();
/*  35 */   private final biq i = biq.a();
/*     */   
/*  37 */   public final int[] c = new int[3];
/*  38 */   public final int[] d = new int[] { -1, -1, -1 };
/*  39 */   public final int[] e = new int[] { -1, -1, -1 };
/*     */   
/*     */   public bis(int ☃, bfv bfv1) {
/*  42 */     this(☃, bfv1, bim.a);
/*     */   }
/*     */   
/*     */   public bis(int ☃, bfv bfv1, bim bim1) {
/*  46 */     super(bje.m, ☃);
/*  47 */     this.g = bim1;
/*  48 */     a(new bjr(this, this.f, 0, 15, 47)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  51 */             return true;
/*     */           }
/*     */ 
/*     */           
/*     */           public int a() {
/*  56 */             return 1;
/*     */           }
/*     */         });
/*     */     
/*  60 */     a(new bjr(this, this.f, 1, 35, 47)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  63 */             return (☃.b() == bmd.mt);
/*     */           }
/*     */         });
/*     */     int i;
/*  67 */     for (i = 0; i < 3; i++) {
/*  68 */       for (int j = 0; j < 9; j++) {
/*  69 */         a(new bjr(bfv1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  72 */     for (i = 0; i < 9; i++) {
/*  73 */       a(new bjr(bfv1, i, 8 + i * 18, 142));
/*     */     }
/*     */     
/*  76 */     a(biq.a(this.c, 0));
/*  77 */     a(biq.a(this.c, 1));
/*  78 */     a(biq.a(this.c, 2));
/*     */     
/*  80 */     a(this.i).a(bfv1.e.eG());
/*     */     
/*  82 */     a(biq.a(this.d, 0));
/*  83 */     a(biq.a(this.d, 1));
/*  84 */     a(biq.a(this.d, 2));
/*     */     
/*  86 */     a(biq.a(this.e, 0));
/*  87 */     a(biq.a(this.e, 1));
/*  88 */     a(biq.a(this.e, 2));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/*  93 */     if (☃ == this.f) {
/*  94 */       bmb bmb = ☃.a(0);
/*     */       
/*  96 */       if (bmb.a() || !bmb.w()) {
/*  97 */         for (int i = 0; i < 3; i++) {
/*  98 */           this.c[i] = 0;
/*  99 */           this.d[i] = -1;
/* 100 */           this.e[i] = -1;
/*     */         } 
/*     */       } else {
/* 103 */         this.g.a((brx1, fx1) -> {
/*     */               int i = 0;
/*     */               int j;
/*     */               for (j = -1; j <= 1; j++) {
/*     */                 for (int k = -1; k <= 1; k++) {
/*     */                   if (j != 0 || k != 0) {
/*     */                     if (brx1.w(fx1.b(k, 0, j)) && brx1.w(fx1.b(k, 1, j))) {
/*     */                       if (brx1.d_(fx1.b(k * 2, 0, j * 2)).a(bup.bI)) {
/*     */                         i++;
/*     */                       }
/*     */                       if (brx1.d_(fx1.b(k * 2, 1, j * 2)).a(bup.bI)) {
/*     */                         i++;
/*     */                       }
/*     */                       if (k != 0 && j != 0) {
/*     */                         if (brx1.d_(fx1.b(k * 2, 0, j)).a(bup.bI)) {
/*     */                           i++;
/*     */                         }
/*     */                         if (brx1.d_(fx1.b(k * 2, 1, j)).a(bup.bI)) {
/*     */                           i++;
/*     */                         }
/*     */                         if (brx1.d_(fx1.b(k, 0, j * 2)).a(bup.bI)) {
/*     */                           i++;
/*     */                         }
/*     */                         if (brx1.d_(fx1.b(k, 1, j * 2)).a(bup.bI)) {
/*     */                           i++;
/*     */                         }
/*     */                       } 
/*     */                     } 
/*     */                   }
/*     */                 } 
/*     */               } 
/*     */               this.h.setSeed(this.i.b());
/*     */               for (j = 0; j < 3; j++) {
/*     */                 this.c[j] = bpu.a(this.h, j, i, ☃);
/*     */                 this.d[j] = -1;
/*     */                 this.e[j] = -1;
/*     */                 if (this.c[j] < j + 1) {
/*     */                   this.c[j] = 0;
/*     */                 }
/*     */               } 
/*     */               for (j = 0; j < 3; j++) {
/*     */                 if (this.c[j] > 0) {
/*     */                   List<bpv> list = a(☃, j, this.c[j]);
/*     */                   if (list != null && !list.isEmpty()) {
/*     */                     bpv bpv = list.get(this.h.nextInt(list.size()));
/*     */                     this.d[j] = gm.R.a((T)bpv.b);
/*     */                     this.e[j] = bpv.c;
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */               c();
/*     */             });
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃, int i) {
/* 167 */     bmb bmb1 = this.f.a(0);
/* 168 */     bmb bmb2 = this.f.a(1);
/*     */     
/* 170 */     int j = i + 1;
/*     */     
/* 172 */     if ((bmb2.a() || bmb2.E() < j) && !☃.bC.d) {
/* 173 */       return false;
/*     */     }
/* 175 */     if (this.c[i] > 0 && !bmb1.a() && ((☃.bD >= j && ☃.bD >= this.c[i]) || ☃.bC.d)) {
/* 176 */       this.g.a((brx1, fx1) -> {
/*     */             bmb bmb2 = ☃;
/*     */             
/*     */             List<bpv> list = a(bmb2, i, this.c[i]);
/*     */             
/*     */             if (!list.isEmpty()) {
/*     */               bfw1.a(bmb2, j);
/*     */               
/*     */               boolean bool = (bmb2.b() == bmd.mc);
/*     */               
/*     */               if (bool) {
/*     */                 bmb2 = new bmb(bmd.pq);
/*     */                 
/*     */                 md md = ☃.o();
/*     */                 
/*     */                 if (md != null) {
/*     */                   bmb2.c(md.g());
/*     */                 }
/*     */                 
/*     */                 this.f.a(0, bmb2);
/*     */               } 
/*     */               for (int k = 0; k < list.size(); k++) {
/*     */                 bpv bpv = list.get(k);
/*     */                 if (bool) {
/*     */                   blf.a(bmb2, bpv);
/*     */                 } else {
/*     */                   bmb2.a(bpv.b, bpv.c);
/*     */                 } 
/*     */               } 
/*     */               if (!bfw1.bC.d) {
/*     */                 bmb1.g(j);
/*     */                 if (bmb1.a()) {
/*     */                   this.f.a(1, bmb.b);
/*     */                 }
/*     */               } 
/*     */               bfw1.a(aea.aj);
/*     */               if (bfw1 instanceof aah) {
/*     */                 ac.i.a((aah)bfw1, bmb2, j);
/*     */               }
/*     */               this.f.X_();
/*     */               this.i.a(bfw1.eG());
/*     */               a(this.f);
/*     */               brx1.a((bfw)null, fx1, adq.dm, adr.e, 1.0F, brx1.t.nextFloat() * 0.1F + 0.9F);
/*     */             } 
/*     */           });
/* 221 */       return true;
/*     */     } 
/* 223 */     return false;
/*     */   }
/*     */   
/*     */   private List<bpv> a(bmb ☃, int i, int j) {
/* 227 */     this.h.setSeed((this.i.b() + i));
/*     */     
/* 229 */     List<bpv> list = bpu.b(this.h, ☃, j, false);
/*     */     
/* 231 */     if (☃.b() == bmd.mc && list.size() > 1)
/*     */     {
/* 233 */       list.remove(this.h.nextInt(list.size()));
/*     */     }
/* 235 */     return list;
/*     */   }
/*     */   
/*     */   public int e() {
/* 239 */     bmb ☃ = this.f.a(1);
/* 240 */     if (☃.a()) {
/* 241 */       return 0;
/*     */     }
/* 243 */     return ☃.E();
/*     */   }
/*     */   
/*     */   public int f() {
/* 247 */     return this.i.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 252 */     super.b(☃);
/* 253 */     this.g.a((brx1, fx1) -> a(☃, ☃.l, this.f));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 258 */     return a(this.g, ☃, bup.dZ);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 263 */     bmb bmb = bmb.b;
/* 264 */     bjr bjr = this.a.get(i);
/* 265 */     if (bjr != null && bjr.f()) {
/* 266 */       bmb bmb1 = bjr.e();
/* 267 */       bmb = bmb1.i();
/*     */       
/* 269 */       if (i == 0) {
/* 270 */         if (!a(bmb1, 2, 38, true)) {
/* 271 */           return bmb.b;
/*     */         }
/* 273 */       } else if (i == 1) {
/* 274 */         if (!a(bmb1, 2, 38, true)) {
/* 275 */           return bmb.b;
/*     */         }
/* 277 */       } else if (bmb1.b() == bmd.mt) {
/* 278 */         if (!a(bmb1, 1, 2, true)) {
/* 279 */           return bmb.b;
/*     */         }
/* 281 */       } else if (!((bjr)this.a.get(0)).f() && ((bjr)this.a.get(0)).a(bmb1)) {
/* 282 */         bmb bmb2 = bmb1.i();
/* 283 */         bmb2.e(1);
/* 284 */         bmb1.g(1);
/* 285 */         ((bjr)this.a.get(0)).d(bmb2);
/*     */       } else {
/* 287 */         return bmb.b;
/*     */       } 
/* 289 */       if (bmb1.a()) {
/* 290 */         bjr.d(bmb.b);
/*     */       } else {
/* 292 */         bjr.d();
/*     */       } 
/* 294 */       if (bmb1.E() == bmb.E()) {
/* 295 */         return bmb.b;
/*     */       }
/* 297 */       bjr.a(☃, bmb1);
/*     */     } 
/*     */     
/* 300 */     return bmb;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bis.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */