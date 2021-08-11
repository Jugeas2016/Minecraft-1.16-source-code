/*     */ import java.util.Arrays;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
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
/*     */ public abstract class cul<M extends cui<M>, S extends cun<M>>
/*     */   extends cuj
/*     */   implements cum
/*     */ {
/*  22 */   private static final gc[] e = gc.values();
/*     */   protected final cgj a;
/*     */   protected final bsf b;
/*     */   protected final S c;
/*     */   private boolean f;
/*  27 */   protected final fx.a d = new fx.a();
/*     */ 
/*     */   
/*  30 */   private final long[] g = new long[2];
/*  31 */   private final brc[] h = new brc[2];
/*     */   
/*     */   public cul(cgj ☃, bsf bsf1, S s) {
/*  34 */     super(16, 256, 8192);
/*  35 */     this.a = ☃;
/*  36 */     this.b = bsf1;
/*  37 */     this.c = s;
/*  38 */     d();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void f(long ☃) {
/*  44 */     this.c.d();
/*     */     
/*  46 */     if (this.c.g(gp.e(☃))) {
/*  47 */       super.f(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private brc a(int ☃, int i) {
/*  53 */     long l = brd.a(☃, i);
/*  54 */     for (int j = 0; j < 2; j++) {
/*  55 */       if (l == this.g[j]) {
/*  56 */         return this.h[j];
/*     */       }
/*     */     } 
/*  59 */     brc brc1 = this.a.c(☃, i);
/*  60 */     for (int k = 1; k > 0; k--) {
/*  61 */       this.g[k] = this.g[k - 1];
/*  62 */       this.h[k] = this.h[k - 1];
/*     */     } 
/*  64 */     this.g[0] = l;
/*  65 */     this.h[0] = brc1;
/*  66 */     return brc1;
/*     */   }
/*     */   
/*     */   private void d() {
/*  70 */     Arrays.fill(this.g, brd.a);
/*  71 */     Arrays.fill((Object[])this.h, (Object)null);
/*     */   }
/*     */   
/*     */   protected ceh a(long ☃, @Nullable MutableInt mutableInt) {
/*  75 */     if (☃ == Long.MAX_VALUE) {
/*  76 */       if (mutableInt != null) {
/*  77 */         mutableInt.setValue(0);
/*     */       }
/*  79 */       return bup.a.n();
/*     */     } 
/*     */     
/*  82 */     int i = gp.a(fx.b(☃));
/*  83 */     int j = gp.a(fx.d(☃));
/*     */     
/*  85 */     brc brc1 = a(i, j);
/*     */     
/*  87 */     if (brc1 == null) {
/*  88 */       if (mutableInt != null) {
/*  89 */         mutableInt.setValue(16);
/*     */       }
/*     */       
/*  92 */       return bup.z.n();
/*     */     } 
/*  94 */     this.d.g(☃);
/*  95 */     ceh ceh = brc1.d_(this.d);
/*  96 */     boolean bool = (ceh.l() && ceh.e());
/*  97 */     if (mutableInt != null) {
/*  98 */       mutableInt.setValue(ceh.b(this.a.m(), this.d));
/*     */     }
/* 100 */     return bool ? ceh : bup.a.n();
/*     */   }
/*     */   
/*     */   protected ddh a(ceh ☃, long l, gc gc1) {
/* 104 */     return ☃.l() ? ☃.a(this.a.m(), this.d.g(l), gc1) : dde.a();
/*     */   }
/*     */   
/*     */   public static int a(brc ☃, ceh ceh1, fx fx1, ceh ceh2, fx fx2, gc gc1, int i) {
/* 108 */     boolean bool1 = (ceh1.l() && ceh1.e());
/* 109 */     boolean bool2 = (ceh2.l() && ceh2.e());
/*     */     
/* 111 */     if (!bool1 && !bool2) {
/* 112 */       return i;
/*     */     }
/*     */     
/* 115 */     ddh ddh1 = bool1 ? ceh1.c(☃, fx1) : dde.a();
/* 116 */     ddh ddh2 = bool2 ? ceh2.c(☃, fx2) : dde.a();
/*     */     
/* 118 */     if (dde.b(ddh1, ddh2, gc1)) {
/* 119 */       return 16;
/*     */     }
/*     */     
/* 122 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(long ☃) {
/* 127 */     return (☃ == Long.MAX_VALUE);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int a(long ☃, long l1, int i) {
/* 135 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int c(long ☃) {
/* 140 */     if (☃ == Long.MAX_VALUE) {
/* 141 */       return 0;
/*     */     }
/* 143 */     return 15 - this.c.i(☃);
/*     */   }
/*     */   
/*     */   protected int a(cgb ☃, long l) {
/* 147 */     return 15 - ☃.a(
/* 148 */         gp.b(fx.b(l)), 
/* 149 */         gp.b(fx.c(l)), 
/* 150 */         gp.b(fx.d(l)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(long ☃, int i) {
/* 156 */     this.c.b(☃, Math.min(15, 15 - i));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int b(long ☃, long l1, int i) {
/* 164 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 169 */     return (b() || this.c.b() || this.c.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃, boolean bool1, boolean bool2) {
/* 174 */     if (!this.f) {
/*     */ 
/*     */       
/* 177 */       if (this.c.b()) {
/* 178 */         ☃ = this.c.b(☃);
/*     */         
/* 180 */         if (☃ == 0) {
/* 181 */           return ☃;
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 186 */       this.c.a(this, bool1, bool2);
/*     */     } 
/*     */     
/* 189 */     this.f = true;
/*     */     
/* 191 */     if (b()) {
/*     */       
/* 193 */       ☃ = b(☃);
/* 194 */       d();
/*     */       
/* 196 */       if (☃ == 0) {
/* 197 */         return ☃;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 202 */     this.f = false;
/* 203 */     this.c.e();
/*     */     
/* 205 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void a(long ☃, @Nullable cgb cgb1, boolean bool) {
/* 209 */     this.c.a(☃, cgb1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public cgb a(gp ☃) {
/* 215 */     return this.c.h(☃.s());
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(fx ☃) {
/* 220 */     return this.c.d(☃.a());
/*     */   }
/*     */   
/*     */   public String b(long ☃) {
/* 224 */     return "" + this.c.c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃) {
/* 229 */     long l = ☃.a();
/* 230 */     f(l);
/* 231 */     for (gc gc1 : e) {
/* 232 */       f(fx.a(l, gc1));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(fx ☃, int i) {}
/*     */ 
/*     */   
/*     */   public void a(gp ☃, boolean bool) {
/* 242 */     this.c.d(☃.s(), bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brd ☃, boolean bool) {
/* 247 */     long l = gp.f(gp.b(☃.b, 0, ☃.c));
/* 248 */     this.c.b(l, bool);
/*     */   }
/*     */   
/*     */   public void b(brd ☃, boolean bool) {
/* 252 */     long l = gp.f(gp.b(☃.b, 0, ☃.c));
/* 253 */     this.c.c(l, bool);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */