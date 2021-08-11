/*     */ import java.util.Optional;
/*     */ import java.util.function.Predicate;
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
/*     */ public class cxn
/*     */ {
/*     */   private static final ceg.e a;
/*     */   private final bry b;
/*     */   private final gc.a c;
/*     */   private final gc d;
/*     */   private int e;
/*     */   @Nullable
/*     */   private fx f;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   static {
/*  29 */     a = ((☃, brc1, fx1) -> ☃.a(bup.bK));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Optional<cxn> a(bry ☃, fx fx1, gc.a a1) {
/*  41 */     return a(☃, fx1, ☃ -> (☃.a() && ☃.e == 0), a1);
/*     */   }
/*     */   
/*     */   public static Optional<cxn> a(bry ☃, fx fx1, Predicate<cxn> predicate, gc.a a1) {
/*  45 */     Optional<cxn> optional = Optional.<cxn>of(new cxn(☃, fx1, a1)).filter(predicate);
/*  46 */     if (optional.isPresent()) {
/*  47 */       return optional;
/*     */     }
/*     */     
/*  50 */     gc.a a2 = (a1 == gc.a.a) ? gc.a.c : gc.a.a;
/*  51 */     return Optional.<cxn>of(new cxn(☃, fx1, a2)).filter(predicate);
/*     */   }
/*     */   
/*     */   public cxn(bry ☃, fx fx1, gc.a a1) {
/*  55 */     this.b = ☃;
/*  56 */     this.c = a1;
/*  57 */     this.d = (a1 == gc.a.a) ? gc.e : gc.d;
/*     */     
/*  59 */     this.f = a(fx1);
/*  60 */     if (this.f == null) {
/*  61 */       this.f = fx1;
/*  62 */       this.h = 1;
/*  63 */       this.g = 1;
/*     */     } else {
/*  65 */       this.h = d();
/*     */       
/*  67 */       if (this.h > 0) {
/*  68 */         this.g = e();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private fx a(fx ☃) {
/*  76 */     int i = Math.max(0, ☃.v() - 21);
/*  77 */     while (☃.v() > i && a(this.b.d_(☃.c()))) {
/*  78 */       ☃ = ☃.c();
/*     */     }
/*     */     
/*  81 */     gc gc1 = this.d.f();
/*  82 */     int j = a(☃, gc1) - 1;
/*  83 */     if (j < 0) {
/*  84 */       return null;
/*     */     }
/*  86 */     return ☃.a(gc1, j);
/*     */   }
/*     */   
/*     */   private int d() {
/*  90 */     int ☃ = a(this.f, this.d);
/*     */     
/*  92 */     if (☃ < 2 || ☃ > 21) {
/*  93 */       return 0;
/*     */     }
/*     */     
/*  96 */     return ☃;
/*     */   }
/*     */   
/*     */   private int a(fx ☃, gc gc1) {
/* 100 */     fx.a a1 = new fx.a();
/*     */     
/* 102 */     for (int i = 0; i <= 21; i++) {
/* 103 */       a1.g(☃).c(gc1, i);
/*     */       
/* 105 */       ceh ceh1 = this.b.d_(a1);
/* 106 */       if (!a(ceh1)) {
/* 107 */         if (a.test(ceh1, this.b, a1)) {
/* 108 */           return i;
/*     */         }
/*     */         
/*     */         break;
/*     */       } 
/*     */       
/* 114 */       ceh ceh2 = this.b.d_(a1.c(gc.a));
/* 115 */       if (!a.test(ceh2, this.b, a1)) {
/*     */         break;
/*     */       }
/*     */     } 
/*     */     
/* 120 */     return 0;
/*     */   }
/*     */   
/*     */   private int e() {
/* 124 */     fx.a ☃ = new fx.a();
/* 125 */     int i = a(☃);
/*     */     
/* 127 */     if (i < 3 || i > 21 || !a(☃, i)) {
/* 128 */       return 0;
/*     */     }
/*     */     
/* 131 */     return i;
/*     */   }
/*     */   
/*     */   private boolean a(fx.a ☃, int i) {
/* 135 */     for (int j = 0; j < this.h; j++) {
/* 136 */       fx.a a1 = ☃.g(this.f).c(gc.b, i).c(this.d, j);
/* 137 */       if (!a.test(this.b.d_(a1), this.b, a1)) {
/* 138 */         return false;
/*     */       }
/*     */     } 
/* 141 */     return true;
/*     */   }
/*     */   
/*     */   private int a(fx.a ☃) {
/* 145 */     for (int i = 0; i < 21; i++) {
/*     */       
/* 147 */       ☃.g(this.f).c(gc.b, i).c(this.d, -1);
/* 148 */       if (!a.test(this.b.d_(☃), this.b, ☃)) {
/* 149 */         return i;
/*     */       }
/*     */ 
/*     */       
/* 153 */       ☃.g(this.f).c(gc.b, i).c(this.d, this.h);
/* 154 */       if (!a.test(this.b.d_(☃), this.b, ☃)) {
/* 155 */         return i;
/*     */       }
/*     */ 
/*     */       
/* 159 */       for (int j = 0; j < this.h; j++) {
/* 160 */         ☃.g(this.f).c(gc.b, i).c(this.d, j);
/*     */         
/* 162 */         ceh ceh = this.b.d_(☃);
/* 163 */         if (!a(ceh)) {
/* 164 */           return i;
/*     */         }
/*     */         
/* 167 */         if (ceh.a(bup.cT)) {
/* 168 */           this.e++;
/*     */         }
/*     */       } 
/*     */     } 
/* 172 */     return 21;
/*     */   }
/*     */   
/*     */   private static boolean a(ceh ☃) {
/* 176 */     return (☃.g() || ☃.a(aed.an) || ☃.a(bup.cT));
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 180 */     return (this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21);
/*     */   }
/*     */   
/*     */   public void b() {
/* 184 */     ceh ☃ = bup.cT.n().a(byj.a, this.c);
/*     */     
/* 186 */     fx.a(this.f, this.f.a(gc.b, this.g - 1).a(this.d, this.h - 1)).forEach(fx1 -> this.b.a(fx1, ☃, 18));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 192 */     return (a() && this.e == this.h * this.g);
/*     */   }
/*     */ 
/*     */   
/*     */   public static dcn a(i.a ☃, gc.a a1, dcn dcn1, aqb aqb1) {
/* 197 */     double d3, d4, d1 = ☃.b - aqb1.a;
/* 198 */     double d2 = ☃.c - aqb1.b;
/*     */     
/* 200 */     fx fx1 = ☃.a;
/*     */     
/* 202 */     if (d1 > 0.0D) {
/* 203 */       float f = fx1.a(a1) + aqb1.a / 2.0F;
/* 204 */       d3 = afm.a(afm.c(dcn1.a(a1) - f, 0.0D, d1), 0.0D, 1.0D);
/*     */     } else {
/* 206 */       d3 = 0.5D;
/*     */     } 
/*     */     
/* 209 */     if (d2 > 0.0D) {
/* 210 */       gc.a a3 = gc.a.b;
/* 211 */       d4 = afm.a(afm.c(dcn1.a(a3) - fx1.a(a3), 0.0D, d2), 0.0D, 1.0D);
/*     */     } else {
/* 213 */       d4 = 0.0D;
/*     */     } 
/*     */     
/* 216 */     gc.a a2 = (a1 == gc.a.a) ? gc.a.c : gc.a.a;
/* 217 */     double d5 = dcn1.a(a2) - fx1.a(a2) + 0.5D;
/*     */     
/* 219 */     return new dcn(d3, d4, d5);
/*     */   }
/*     */   
/*     */   public static cxm a(aag ☃, i.a a1, gc.a a2, dcn dcn1, aqb aqb1, dcn dcn2, float f1, float f2) {
/* 223 */     fx fx1 = a1.a;
/* 224 */     ceh ceh = ☃.d_(fx1);
/* 225 */     gc.a a3 = (gc.a)ceh.c(cex.E);
/* 226 */     double d1 = a1.b;
/* 227 */     double d2 = a1.c;
/*     */     
/* 229 */     int i = (a2 == a3) ? 0 : 90;
/* 230 */     dcn dcn3 = (a2 == a3) ? dcn2 : new dcn(dcn2.d, dcn2.c, -dcn2.b);
/*     */     
/* 232 */     double d3 = aqb1.a / 2.0D + (d1 - aqb1.a) * dcn1.a();
/* 233 */     double d4 = (d2 - aqb1.b) * dcn1.b();
/* 234 */     double d5 = 0.5D + dcn1.c();
/*     */     
/* 236 */     boolean bool = (a3 == gc.a.a);
/*     */ 
/*     */ 
/*     */     
/* 240 */     dcn dcn4 = new dcn(fx1.u() + (bool ? d3 : d5), fx1.v() + d4, fx1.w() + (bool ? d5 : d3));
/*     */ 
/*     */     
/* 243 */     return new cxm(dcn4, dcn3, f1 + i, f2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */