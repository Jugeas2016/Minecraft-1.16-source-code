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
/*     */ public final class cuq
/*     */   extends cul<cur.a, cur>
/*     */ {
/*  15 */   private static final gc[] e = gc.values();
/*  16 */   private static final gc[] f = new gc[] { gc.c, gc.d, gc.e, gc.f };
/*     */   
/*     */   public cuq(cgj ☃) {
/*  19 */     super(☃, bsf.a, new cur(☃));
/*     */   }
/*     */   
/*     */   protected int b(long ☃, long l1, int i) {
/*     */     gc gc1;
/*  24 */     if (l1 == Long.MAX_VALUE) {
/*  25 */       return 15;
/*     */     }
/*  27 */     if (☃ == Long.MAX_VALUE) {
/*  28 */       if (this.c.m(l1)) {
/*     */         
/*  30 */         i = 0;
/*     */       } else {
/*  32 */         return 15;
/*     */       } 
/*     */     }
/*  35 */     if (i >= 15) {
/*  36 */       return i;
/*     */     }
/*     */     
/*  39 */     MutableInt mutableInt = new MutableInt();
/*  40 */     ceh ceh1 = a(l1, mutableInt);
/*     */     
/*  42 */     if (mutableInt.getValue().intValue() >= 15) {
/*  43 */       return 15;
/*     */     }
/*     */     
/*  46 */     int j = fx.b(☃);
/*  47 */     int k = fx.c(☃);
/*  48 */     int m = fx.d(☃);
/*     */     
/*  50 */     int n = fx.b(l1);
/*  51 */     int i1 = fx.c(l1);
/*  52 */     int i2 = fx.d(l1);
/*     */     
/*  54 */     boolean bool1 = (j == n && m == i2);
/*     */     
/*  56 */     int i3 = Integer.signum(n - j);
/*  57 */     int i4 = Integer.signum(i1 - k);
/*  58 */     int i5 = Integer.signum(i2 - m);
/*     */ 
/*     */     
/*  61 */     if (☃ == Long.MAX_VALUE) {
/*  62 */       gc1 = gc.a;
/*     */     } else {
/*  64 */       gc1 = gc.a(i3, i4, i5);
/*     */     } 
/*     */     
/*  67 */     ceh ceh2 = a(☃, (MutableInt)null);
/*     */     
/*  69 */     if (gc1 != null) {
/*  70 */       ddh ddh1 = a(ceh2, ☃, gc1);
/*  71 */       ddh ddh2 = a(ceh1, l1, gc1.f());
/*     */       
/*  73 */       if (dde.b(ddh1, ddh2)) {
/*  74 */         return 15;
/*     */       }
/*     */     } else {
/*     */       
/*  78 */       ddh ddh1 = a(ceh2, ☃, gc.a);
/*  79 */       if (dde.b(ddh1, dde.a())) {
/*  80 */         return 15;
/*     */       }
/*     */       
/*  83 */       int i6 = bool1 ? -1 : 0;
/*  84 */       gc gc2 = gc.a(i3, i6, i5);
/*  85 */       if (gc2 == null)
/*     */       {
/*  87 */         return 15;
/*     */       }
/*  89 */       ddh ddh2 = a(ceh1, l1, gc2.f());
/*  90 */       if (dde.b(dde.a(), ddh2)) {
/*  91 */         return 15;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  96 */     boolean bool2 = (☃ == Long.MAX_VALUE || (bool1 && k > i1));
/*  97 */     if (bool2 && i == 0 && mutableInt.getValue().intValue() == 0) {
/*  98 */       return 0;
/*     */     }
/* 100 */     return i + Math.max(1, mutableInt.getValue().intValue());
/*     */   }
/*     */   
/*     */   protected void a(long ☃, int i, boolean bool) {
/*     */     int n;
/* 105 */     long l1 = gp.e(☃);
/* 106 */     int j = fx.c(☃);
/* 107 */     int k = gp.b(j);
/* 108 */     int m = gp.a(j);
/*     */     
/* 110 */     if (k != 0) {
/* 111 */       n = 0;
/*     */     } else {
/* 113 */       int i1 = 0;
/* 114 */       while (!this.c.g(gp.a(l1, 0, -i1 - 1, 0)) && this.c.a(m - i1 - 1)) {
/* 115 */         i1++;
/*     */       }
/* 117 */       n = i1;
/*     */     } 
/*     */     
/* 120 */     long l2 = fx.a(☃, 0, -1 - n * 16, 0);
/* 121 */     long l3 = gp.e(l2);
/* 122 */     if (l1 == l3 || this.c.g(l3)) {
/* 123 */       b(☃, l2, i, bool);
/*     */     }
/*     */     
/* 126 */     long l4 = fx.a(☃, gc.b);
/* 127 */     long l5 = gp.e(l4);
/* 128 */     if (l1 == l5 || this.c.g(l5)) {
/* 129 */       b(☃, l4, i, bool);
/*     */     }
/*     */     
/* 132 */     for (gc gc1 : f) {
/* 133 */       int i1 = 0;
/*     */       do {
/* 135 */         long l6 = fx.a(☃, gc1.i(), -i1, gc1.k());
/* 136 */         long l7 = gp.e(l6);
/*     */         
/* 138 */         if (l1 == l7) {
/* 139 */           b(☃, l6, i, bool);
/*     */           
/*     */           break;
/*     */         } 
/* 143 */         if (!this.c.g(l7))
/* 144 */           continue;  b(☃, l6, i, bool);
/*     */         
/* 146 */         ++i1;
/* 147 */       } while (i1 <= n * 16);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected int a(long ☃, long l1, int i) {
/* 153 */     int j = i;
/* 154 */     if (Long.MAX_VALUE != l1) {
/* 155 */       int k = b(Long.MAX_VALUE, ☃, 0);
/* 156 */       if (j > k) {
/* 157 */         j = k;
/*     */       }
/* 159 */       if (j == 0) {
/* 160 */         return j;
/*     */       }
/*     */     } 
/* 163 */     long l = gp.e(☃);
/* 164 */     cgb cgb = this.c.a(l, true);
/* 165 */     for (gc gc1 : e) {
/* 166 */       cgb cgb1; long l2 = fx.a(☃, gc1);
/* 167 */       long l3 = gp.e(l2);
/*     */       
/* 169 */       if (l == l3) {
/* 170 */         cgb1 = cgb;
/*     */       } else {
/* 172 */         cgb1 = this.c.a(l3, true);
/*     */       } 
/* 174 */       if (cgb1 != null) {
/* 175 */         if (l2 != l1) {
/* 176 */           int k = b(l2, ☃, a(cgb1, l2));
/* 177 */           if (j > k) {
/* 178 */             j = k;
/*     */           }
/* 180 */           if (j == 0) {
/* 181 */             return j;
/*     */           }
/*     */         } 
/* 184 */       } else if (gc1 != gc.a) {
/*     */         
/* 186 */         l2 = fx.f(l2);
/* 187 */         while (!this.c.g(l3) && !this.c.n(l3)) {
/* 188 */           l3 = gp.a(l3, gc.b);
/* 189 */           l2 = fx.a(l2, 0, 16, 0);
/*     */         } 
/* 191 */         cgb cgb2 = this.c.a(l3, true);
/* 192 */         if (l2 != l1) {
/*     */           int k;
/* 194 */           if (cgb2 != null) {
/* 195 */             k = b(l2, ☃, a(cgb2, l2));
/*     */           } else {
/* 197 */             k = this.c.o(l3) ? 0 : 15;
/*     */           } 
/* 199 */           if (j > k) {
/* 200 */             j = k;
/*     */           }
/* 202 */           if (j == 0) {
/* 203 */             return j;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 208 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void f(long ☃) {
/* 214 */     this.c.d();
/* 215 */     long l = gp.e(☃);
/* 216 */     if (this.c.g(l)) {
/* 217 */       super.f(☃);
/*     */     } else {
/* 219 */       ☃ = fx.f(☃);
/* 220 */       while (!this.c.g(l) && !this.c.n(l)) {
/* 221 */         l = gp.a(l, gc.b);
/* 222 */         ☃ = fx.a(☃, 0, 16, 0);
/*     */       } 
/* 224 */       if (this.c.g(l)) {
/* 225 */         super.f(☃);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String b(long ☃) {
/* 232 */     return super.b(☃) + (this.c.n(☃) ? "*" : "");
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cuq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */