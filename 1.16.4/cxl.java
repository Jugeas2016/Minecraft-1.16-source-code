/*     */ import java.util.Comparator;
/*     */ import java.util.Optional;
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
/*     */ public class cxl
/*     */ {
/*     */   private final aag a;
/*     */   
/*     */   public cxl(aag ☃) {
/*  46 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public Optional<i.a> a(fx ☃, boolean bool) {
/*  50 */     azo azo = this.a.y();
/*  51 */     int i = bool ? 16 : 128;
/*  52 */     azo.a(this.a, ☃, i);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     Optional<azp> optional = azo.b(☃ -> (☃ == azr.v), ☃, i, azo.b.c).sorted(Comparator.<azp>comparingDouble(azp1 -> azp1.f().j(☃)).thenComparingInt(☃ -> ☃.f().v())).filter(☃ -> this.a.d_(☃.f()).b(cex.E)).findFirst();
/*     */     
/*  59 */     return optional.map(☃ -> {
/*     */           fx fx = ☃.f();
/*     */           this.a.i().a(aal.f, new brd(fx), 3, fx);
/*     */           ceh ceh = this.a.d_(fx);
/*     */           return i.a(fx, (gc.a)ceh.c(cex.E), 21, gc.a.b, 21, ());
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Optional<i.a> a(fx ☃, gc.a a1) {
/*  70 */     gc gc = gc.a(gc.b.a, a1);
/*     */     
/*  72 */     double d1 = -1.0D;
/*  73 */     fx fx1 = null;
/*  74 */     double d2 = -1.0D;
/*  75 */     fx fx2 = null;
/*     */     
/*  77 */     cfu cfu = this.a.f();
/*  78 */     int i = this.a.ae() - 1;
/*     */     
/*  80 */     fx.a a2 = ☃.i();
/*  81 */     for (fx.a a3 : fx.a(☃, 16, gc.f, gc.d)) {
/*  82 */       int m = Math.min(i, this.a.a(chn.a.e, a3.u(), a3.w()));
/*     */ 
/*     */       
/*  85 */       int n = 1;
/*  86 */       if (!cfu.a(a3) || !cfu.a(a3.c(gc, 1))) {
/*     */         continue;
/*     */       }
/*  89 */       a3.c(gc.f(), 1);
/*     */       
/*  91 */       for (int i1 = m; i1 >= 0; i1--) {
/*  92 */         a3.p(i1);
/*  93 */         if (this.a.w(a3)) {
/*     */ 
/*     */ 
/*     */           
/*  97 */           int i2 = i1;
/*     */           
/*  99 */           while (i1 > 0 && this.a.w(a3.c(gc.a))) {
/* 100 */             i1--;
/*     */           }
/*     */ 
/*     */           
/* 104 */           if (i1 + 4 <= i) {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 109 */             int i3 = i2 - i1;
/* 110 */             if (i3 <= 0 || i3 >= 3) {
/*     */ 
/*     */ 
/*     */               
/* 114 */               a3.p(i1);
/*     */               
/* 116 */               if (a(a3, a2, gc, 0)) {
/*     */                 
/* 118 */                 double d = ☃.j(a3);
/*     */ 
/*     */                 
/* 121 */                 if (a(a3, a2, gc, -1) && 
/* 122 */                   a(a3, a2, gc, 1))
/*     */                 {
/*     */                   
/* 125 */                   if (d1 == -1.0D || d1 > d) {
/* 126 */                     d1 = d;
/* 127 */                     fx1 = a3.h();
/*     */                   } 
/*     */                 }
/*     */ 
/*     */                 
/* 132 */                 if (d1 == -1.0D && (d2 == -1.0D || d2 > d)) {
/* 133 */                   d2 = d;
/* 134 */                   fx2 = a3.h();
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 141 */     }  if (d1 == -1.0D && d2 != -1.0D) {
/* 142 */       fx1 = fx2;
/* 143 */       d1 = d2;
/*     */     } 
/*     */     
/* 146 */     if (d1 == -1.0D) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 152 */       fx1 = (new fx(☃.u(), afm.a(☃.v(), 70, this.a.ae() - 10), ☃.w())).h();
/* 153 */       gc gc1 = gc.g();
/*     */ 
/*     */       
/* 156 */       if (!cfu.a(fx1))
/*     */       {
/* 158 */         return Optional.empty();
/*     */       }
/*     */ 
/*     */       
/* 162 */       for (int m = -1; m < 2; m++) {
/* 163 */         for (int n = 0; n < 2; n++) {
/*     */           
/* 165 */           for (int i1 = -1; i1 < 3; i1++) {
/*     */             
/* 167 */             ceh ceh1 = (i1 < 0) ? bup.bK.n() : bup.a.n();
/*     */             
/* 169 */             a2.a(fx1, n * gc
/*     */                 
/* 171 */                 .i() + m * gc1.i(), i1, n * gc
/*     */                 
/* 173 */                 .k() + m * gc1.k());
/*     */             
/* 175 */             this.a.a(a2, ceh1);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 182 */     for (int j = -1; j < 3; j++) {
/* 183 */       for (int m = -1; m < 4; m++) {
/*     */         
/* 185 */         if (j == -1 || j == 2 || m == -1 || m == 3) {
/* 186 */           a2.a(fx1, j * gc
/*     */               
/* 188 */               .i(), m, j * gc
/*     */               
/* 190 */               .k());
/*     */           
/* 192 */           this.a.a(a2, bup.bK.n(), 3);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 198 */     ceh ceh = bup.cT.n().a(byj.a, a1);
/*     */     
/* 200 */     for (int k = 0; k < 2; k++) {
/* 201 */       for (int m = 0; m < 3; m++) {
/* 202 */         a2.a(fx1, k * gc
/*     */             
/* 204 */             .i(), m, k * gc
/*     */             
/* 206 */             .k());
/*     */         
/* 208 */         this.a.a(a2, ceh, 18);
/*     */       } 
/*     */     } 
/*     */     
/* 212 */     return Optional.of(new i.a(fx1.h(), 2, 3));
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃, fx.a a1, gc gc1, int i) {
/* 216 */     gc gc2 = gc1.g();
/*     */     
/* 218 */     for (int j = -1; j < 3; j++) {
/* 219 */       for (int k = -1; k < 4; k++) {
/* 220 */         a1.a(☃, gc1
/*     */             
/* 222 */             .i() * j + gc2.i() * i, k, gc1
/*     */             
/* 224 */             .k() * j + gc2.k() * i);
/*     */ 
/*     */         
/* 227 */         if (k < 0 && !this.a.d_(a1).c().b()) {
/* 228 */           return false;
/*     */         }
/* 230 */         if (k >= 0 && !this.a.w(a1)) {
/* 231 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 236 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */