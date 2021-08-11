/*     */ import java.util.concurrent.atomic.AtomicReferenceArray;
/*     */ import java.util.function.BooleanSupplier;
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
/*     */ public class dwr
/*     */   extends cfz
/*     */ {
/*  32 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final cgh b;
/*     */   private final cuo c;
/*     */   private volatile a d;
/*     */   private final dwt e;
/*     */   
/*     */   public dwr(dwt ☃, int i) {
/*  40 */     this.e = ☃;
/*  41 */     this.b = new cgc(☃, new brd(0, 0));
/*  42 */     this.c = new cuo(this, true, ☃.k().b());
/*  43 */     this.d = new a(b(i));
/*     */   }
/*     */ 
/*     */   
/*     */   public cuo l() {
/*  48 */     return this.c;
/*     */   }
/*     */   
/*     */   private static boolean a(@Nullable cgh ☃, int i, int j) {
/*  52 */     if (☃ == null) {
/*  53 */       return false;
/*     */     }
/*  55 */     brd brd = ☃.g();
/*  56 */     return (brd.b == i && brd.c == j);
/*     */   }
/*     */   
/*     */   public void d(int ☃, int i) {
/*  60 */     if (!a.a(this.d, ☃, i)) {
/*     */       return;
/*     */     }
/*  63 */     int j = a.b(this.d, ☃, i);
/*  64 */     cgh cgh1 = this.d.a(j);
/*  65 */     if (a(cgh1, ☃, i)) {
/*  66 */       this.d.a(j, cgh1, (cgh)null);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cgh b(int ☃, int i, cga cga1, boolean bool) {
/*  73 */     if (a.a(this.d, ☃, i)) {
/*  74 */       cgh cgh1 = this.d.a(a.b(this.d, ☃, i));
/*  75 */       if (a(cgh1, ☃, i)) {
/*  76 */         return cgh1;
/*     */       }
/*     */     } 
/*     */     
/*  80 */     if (bool) {
/*  81 */       return this.b;
/*     */     }
/*  83 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public brc m() {
/*  88 */     return this.e;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cgh a(int ☃, int i, @Nullable cfx cfx1, nf nf1, md md1, int j, boolean bool) {
/*  93 */     if (!a.a(this.d, ☃, i)) {
/*  94 */       a.warn("Ignoring chunk since it's not in the view range: {}, {}", Integer.valueOf(☃), Integer.valueOf(i));
/*  95 */       return null;
/*     */     } 
/*  97 */     int k = a.b(this.d, ☃, i);
/*     */     
/*  99 */     cgh cgh1 = a.a(this.d).get(k);
/* 100 */     if (bool || !a(cgh1, ☃, i)) {
/* 101 */       if (cfx1 == null) {
/* 102 */         a.warn("Ignoring chunk since we don't have complete data: {}, {}", Integer.valueOf(☃), Integer.valueOf(i));
/* 103 */         return null;
/*     */       } 
/*     */       
/* 106 */       cgh1 = new cgh(this.e, new brd(☃, i), cfx1);
/* 107 */       cgh1.a(cfx1, nf1, md1, j);
/* 108 */       this.d.a(k, cgh1);
/*     */     } else {
/* 110 */       cgh1.a(cfx1, nf1, md1, j);
/*     */     } 
/* 112 */     cgi[] arrayOfCgi = cgh1.d();
/* 113 */     cuo cuo1 = l();
/*     */     
/* 115 */     cuo1.a(new brd(☃, i), true);
/*     */     
/* 117 */     for (int m = 0; m < arrayOfCgi.length; m++) {
/* 118 */       cgi cgi = arrayOfCgi[m];
/* 119 */       cuo1.a(gp.a(☃, m, i), cgi.a(cgi));
/*     */     } 
/*     */     
/* 122 */     this.e.e(☃, i);
/*     */     
/* 124 */     return cgh1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(BooleanSupplier ☃) {}
/*     */ 
/*     */   
/*     */   public void e(int ☃, int i) {
/* 132 */     a.a(this.d, ☃);
/* 133 */     a.b(this.d, i);
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 137 */     int i = a.b(this.d);
/* 138 */     int j = b(☃);
/*     */     
/* 140 */     if (i != j) {
/* 141 */       a a1 = new a(j);
/* 142 */       a.a(a1, a.c(this.d));
/* 143 */       a.b(a1, a.d(this.d));
/* 144 */       for (int k = 0; k < a.a(this.d).length(); k++) {
/* 145 */         cgh cgh1 = a.a(this.d).get(k);
/* 146 */         if (cgh1 != null) {
/* 147 */           brd brd = cgh1.g();
/* 148 */           if (a.a(a1, brd.b, brd.c)) {
/* 149 */             a1.a(a.b(a1, brd.b, brd.c), cgh1);
/*     */           }
/*     */         } 
/*     */       } 
/* 153 */       this.d = a1;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static int b(int ☃) {
/* 159 */     return Math.max(2, ☃) + 3;
/*     */   }
/*     */ 
/*     */   
/*     */   public String e() {
/* 164 */     return "Client Chunk Cache: " + a.a(this.d).length() + ", " + h();
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 169 */     return a.e(this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bsf ☃, gp gp1) {
/* 174 */     (djz.C()).e.b(gp1.a(), gp1.b(), gp1.c());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(fx ☃) {
/* 179 */     return b(☃.u() >> 4, ☃.w() >> 4);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brd ☃) {
/* 184 */     return b(☃.b, ☃.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aqa ☃) {
/* 189 */     return b(afm.c(☃.cD()) >> 4, afm.c(☃.cH()) >> 4);
/*     */   }
/*     */   
/*     */   final class a {
/*     */     private final AtomicReferenceArray<cgh> b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private volatile int e;
/*     */     private volatile int f;
/*     */     private int g;
/*     */     
/*     */     private a(dwr this$0, int ☃) {
/* 201 */       this.c = ☃;
/* 202 */       this.d = ☃ * 2 + 1;
/* 203 */       this.b = new AtomicReferenceArray<>(this.d * this.d);
/*     */     }
/*     */     
/*     */     private int a(int ☃, int i) {
/* 207 */       return Math.floorMod(i, this.d) * this.d + Math.floorMod(☃, this.d);
/*     */     }
/*     */     
/*     */     protected void a(int ☃, @Nullable cgh cgh1) {
/* 211 */       cgh cgh2 = this.b.getAndSet(☃, cgh1);
/* 212 */       if (cgh2 != null) {
/* 213 */         this.g--;
/* 214 */         dwr.a(this.a).a(cgh2);
/*     */       } 
/*     */       
/* 217 */       if (cgh1 != null) {
/* 218 */         this.g++;
/*     */       }
/*     */     }
/*     */     
/*     */     protected cgh a(int ☃, cgh cgh1, @Nullable cgh cgh2) {
/* 223 */       if (this.b.compareAndSet(☃, cgh1, cgh2) && 
/* 224 */         cgh2 == null) {
/* 225 */         this.g--;
/*     */       }
/*     */       
/* 228 */       dwr.a(this.a).a(cgh1);
/* 229 */       return cgh1;
/*     */     }
/*     */     
/*     */     private boolean b(int ☃, int i) {
/* 233 */       return (Math.abs(☃ - this.e) <= this.c && Math.abs(i - this.f) <= this.c);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     protected cgh a(int ☃) {
/* 238 */       return this.b.get(☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */