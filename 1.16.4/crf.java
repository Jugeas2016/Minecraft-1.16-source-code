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
/*     */ public class crf
/*     */   extends crq
/*     */ {
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   
/*     */   public crf(Random ☃, int i, int j) {
/*  35 */     super(clb.G, ☃, i, 64, j, 12, 10, 15);
/*     */   }
/*     */   
/*     */   public crf(csw ☃, md md1) {
/*  39 */     super(clb.G, md1);
/*  40 */     this.e = md1.q("placedMainChest");
/*  41 */     this.f = md1.q("placedHiddenChest");
/*  42 */     this.g = md1.q("placedTrap1");
/*  43 */     this.h = md1.q("placedTrap2");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  48 */     super.a(☃);
/*  49 */     ☃.a("placedMainChest", this.e);
/*  50 */     ☃.a("placedHiddenChest", this.f);
/*  51 */     ☃.a("placedTrap1", this.g);
/*  52 */     ☃.a("placedTrap2", this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  57 */     if (!a(☃, cra1, 0)) {
/*  58 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  62 */     a(☃, cra1, 0, -4, 0, this.a - 1, 0, this.c - 1, false, random, i);
/*     */ 
/*     */     
/*  65 */     a(☃, cra1, 2, 1, 2, 9, 2, 2, false, random, i);
/*  66 */     a(☃, cra1, 2, 1, 12, 9, 2, 12, false, random, i);
/*  67 */     a(☃, cra1, 2, 1, 3, 2, 2, 11, false, random, i);
/*  68 */     a(☃, cra1, 9, 1, 3, 9, 2, 11, false, random, i);
/*     */ 
/*     */     
/*  71 */     a(☃, cra1, 1, 3, 1, 10, 6, 1, false, random, i);
/*  72 */     a(☃, cra1, 1, 3, 13, 10, 6, 13, false, random, i);
/*  73 */     a(☃, cra1, 1, 3, 2, 1, 6, 12, false, random, i);
/*  74 */     a(☃, cra1, 10, 3, 2, 10, 6, 12, false, random, i);
/*     */ 
/*     */     
/*  77 */     a(☃, cra1, 2, 3, 2, 9, 3, 12, false, random, i);
/*  78 */     a(☃, cra1, 2, 6, 2, 9, 6, 12, false, random, i);
/*  79 */     a(☃, cra1, 3, 7, 3, 8, 7, 11, false, random, i);
/*  80 */     a(☃, cra1, 4, 8, 4, 7, 8, 10, false, random, i);
/*     */ 
/*     */     
/*  83 */     b(☃, cra1, 3, 1, 3, 8, 2, 11);
/*  84 */     b(☃, cra1, 4, 3, 6, 7, 3, 9);
/*  85 */     b(☃, cra1, 2, 4, 2, 9, 5, 12);
/*  86 */     b(☃, cra1, 4, 6, 5, 7, 6, 9);
/*  87 */     b(☃, cra1, 5, 7, 6, 6, 7, 8);
/*     */ 
/*     */     
/*  90 */     b(☃, cra1, 5, 1, 2, 6, 2, 2);
/*  91 */     b(☃, cra1, 5, 2, 12, 6, 2, 12);
/*  92 */     b(☃, cra1, 5, 5, 1, 6, 5, 1);
/*  93 */     b(☃, cra1, 5, 5, 13, 6, 5, 13);
/*  94 */     a(☃, bup.a.n(), 1, 5, 5, cra1);
/*  95 */     a(☃, bup.a.n(), 10, 5, 5, cra1);
/*  96 */     a(☃, bup.a.n(), 1, 5, 9, cra1);
/*  97 */     a(☃, bup.a.n(), 10, 5, 9, cra1);
/*     */     
/*     */     int i;
/* 100 */     for (i = 0; i <= 14; i += 14) {
/* 101 */       a(☃, cra1, 2, 4, i, 2, 5, i, false, random, i);
/* 102 */       a(☃, cra1, 4, 4, i, 4, 5, i, false, random, i);
/* 103 */       a(☃, cra1, 7, 4, i, 7, 5, i, false, random, i);
/* 104 */       a(☃, cra1, 9, 4, i, 9, 5, i, false, random, i);
/*     */     } 
/* 106 */     a(☃, cra1, 5, 6, 0, 6, 6, 0, false, random, i);
/* 107 */     for (i = 0; i <= 11; i += 11) {
/* 108 */       for (int k = 2; k <= 12; k += 2) {
/* 109 */         a(☃, cra1, i, 4, k, i, 5, k, false, random, i);
/*     */       }
/* 111 */       a(☃, cra1, i, 6, 5, i, 6, 5, false, random, i);
/* 112 */       a(☃, cra1, i, 6, 9, i, 6, 9, false, random, i);
/*     */     } 
/* 114 */     a(☃, cra1, 2, 7, 2, 2, 9, 2, false, random, i);
/* 115 */     a(☃, cra1, 9, 7, 2, 9, 9, 2, false, random, i);
/* 116 */     a(☃, cra1, 2, 7, 12, 2, 9, 12, false, random, i);
/* 117 */     a(☃, cra1, 9, 7, 12, 9, 9, 12, false, random, i);
/* 118 */     a(☃, cra1, 4, 9, 4, 4, 9, 4, false, random, i);
/* 119 */     a(☃, cra1, 7, 9, 4, 7, 9, 4, false, random, i);
/* 120 */     a(☃, cra1, 4, 9, 10, 4, 9, 10, false, random, i);
/* 121 */     a(☃, cra1, 7, 9, 10, 7, 9, 10, false, random, i);
/* 122 */     a(☃, cra1, 5, 9, 7, 6, 9, 7, false, random, i);
/*     */     
/* 124 */     ceh ceh1 = bup.ci.n().a(cak.a, gc.f);
/* 125 */     ceh ceh2 = bup.ci.n().a(cak.a, gc.e);
/* 126 */     ceh ceh3 = bup.ci.n().a(cak.a, gc.d);
/* 127 */     ceh ceh4 = bup.ci.n().a(cak.a, gc.c);
/*     */     
/* 129 */     a(☃, ceh4, 5, 9, 6, cra1);
/* 130 */     a(☃, ceh4, 6, 9, 6, cra1);
/* 131 */     a(☃, ceh3, 5, 9, 8, cra1);
/* 132 */     a(☃, ceh3, 6, 9, 8, cra1);
/*     */ 
/*     */     
/* 135 */     a(☃, ceh4, 4, 0, 0, cra1);
/* 136 */     a(☃, ceh4, 5, 0, 0, cra1);
/* 137 */     a(☃, ceh4, 6, 0, 0, cra1);
/* 138 */     a(☃, ceh4, 7, 0, 0, cra1);
/*     */ 
/*     */     
/* 141 */     a(☃, ceh4, 4, 1, 8, cra1);
/* 142 */     a(☃, ceh4, 4, 2, 9, cra1);
/* 143 */     a(☃, ceh4, 4, 3, 10, cra1);
/* 144 */     a(☃, ceh4, 7, 1, 8, cra1);
/* 145 */     a(☃, ceh4, 7, 2, 9, cra1);
/* 146 */     a(☃, ceh4, 7, 3, 10, cra1);
/* 147 */     a(☃, cra1, 4, 1, 9, 4, 1, 9, false, random, i);
/* 148 */     a(☃, cra1, 7, 1, 9, 7, 1, 9, false, random, i);
/* 149 */     a(☃, cra1, 4, 1, 10, 7, 2, 10, false, random, i);
/*     */ 
/*     */     
/* 152 */     a(☃, cra1, 5, 4, 5, 6, 4, 5, false, random, i);
/* 153 */     a(☃, ceh1, 4, 4, 5, cra1);
/* 154 */     a(☃, ceh2, 7, 4, 5, cra1);
/*     */     
/*     */     int j;
/* 157 */     for (j = 0; j < 4; j++) {
/* 158 */       a(☃, ceh3, 5, 0 - j, 6 + j, cra1);
/* 159 */       a(☃, ceh3, 6, 0 - j, 6 + j, cra1);
/* 160 */       b(☃, cra1, 5, 0 - j, 7 + j, 6, 0 - j, 9 + j);
/*     */     } 
/*     */ 
/*     */     
/* 164 */     b(☃, cra1, 1, -3, 12, 10, -1, 13);
/* 165 */     b(☃, cra1, 1, -3, 1, 3, -1, 13);
/* 166 */     b(☃, cra1, 1, -3, 1, 9, -1, 5);
/* 167 */     for (j = 1; j <= 13; j += 2) {
/* 168 */       a(☃, cra1, 1, -3, j, 1, -2, j, false, random, i);
/*     */     }
/* 170 */     for (j = 2; j <= 12; j += 2) {
/* 171 */       a(☃, cra1, 1, -1, j, 3, -1, j, false, random, i);
/*     */     }
/* 173 */     a(☃, cra1, 2, -2, 1, 5, -2, 1, false, random, i);
/* 174 */     a(☃, cra1, 7, -2, 1, 9, -2, 1, false, random, i);
/* 175 */     a(☃, cra1, 6, -3, 1, 6, -3, 1, false, random, i);
/* 176 */     a(☃, cra1, 6, -1, 1, 6, -1, 1, false, random, i);
/*     */ 
/*     */     
/* 179 */     a(☃, bup.el.n().a(cbe.a, gc.f).a(cbe.c, Boolean.valueOf(true)), 1, -3, 8, cra1);
/* 180 */     a(☃, bup.el.n().a(cbe.a, gc.e).a(cbe.c, Boolean.valueOf(true)), 4, -3, 8, cra1);
/* 181 */     a(☃, bup.em.n().a(cbd.e, Boolean.valueOf(true)).a(cbd.g, Boolean.valueOf(true)).a(cbd.b, Boolean.valueOf(true)), 2, -3, 8, cra1);
/* 182 */     a(☃, bup.em.n().a(cbd.e, Boolean.valueOf(true)).a(cbd.g, Boolean.valueOf(true)).a(cbd.b, Boolean.valueOf(true)), 3, -3, 8, cra1);
/* 183 */     ceh ceh5 = bup.bS.n().a(bzd.a, cfl.b).a(bzd.c, cfl.b);
/* 184 */     a(☃, ceh5, 5, -3, 7, cra1);
/* 185 */     a(☃, ceh5, 5, -3, 6, cra1);
/* 186 */     a(☃, ceh5, 5, -3, 5, cra1);
/* 187 */     a(☃, ceh5, 5, -3, 4, cra1);
/* 188 */     a(☃, ceh5, 5, -3, 3, cra1);
/* 189 */     a(☃, ceh5, 5, -3, 2, cra1);
/* 190 */     a(☃, bup.bS.n().a(bzd.a, cfl.b).a(bzd.d, cfl.b), 5, -3, 1, cra1);
/* 191 */     a(☃, bup.bS.n().a(bzd.b, cfl.b).a(bzd.d, cfl.b), 4, -3, 1, cra1);
/* 192 */     a(☃, bup.bJ.n(), 3, -3, 1, cra1);
/* 193 */     if (!this.g) {
/* 194 */       this.g = a(☃, cra1, random, 3, -2, 1, gc.c, cyq.B);
/*     */     }
/* 196 */     a(☃, bup.dP.n().a(cbi.d, Boolean.valueOf(true)), 3, -2, 2, cra1);
/*     */ 
/*     */     
/* 199 */     a(☃, bup.el.n().a(cbe.a, gc.c).a(cbe.c, Boolean.valueOf(true)), 7, -3, 1, cra1);
/* 200 */     a(☃, bup.el.n().a(cbe.a, gc.d).a(cbe.c, Boolean.valueOf(true)), 7, -3, 5, cra1);
/* 201 */     a(☃, bup.em.n().a(cbd.d, Boolean.valueOf(true)).a(cbd.f, Boolean.valueOf(true)).a(cbd.b, Boolean.valueOf(true)), 7, -3, 2, cra1);
/* 202 */     a(☃, bup.em.n().a(cbd.d, Boolean.valueOf(true)).a(cbd.f, Boolean.valueOf(true)).a(cbd.b, Boolean.valueOf(true)), 7, -3, 3, cra1);
/* 203 */     a(☃, bup.em.n().a(cbd.d, Boolean.valueOf(true)).a(cbd.f, Boolean.valueOf(true)).a(cbd.b, Boolean.valueOf(true)), 7, -3, 4, cra1);
/* 204 */     a(☃, bup.bS.n().a(bzd.b, cfl.b).a(bzd.d, cfl.b), 8, -3, 6, cra1);
/* 205 */     a(☃, bup.bS.n().a(bzd.d, cfl.b).a(bzd.c, cfl.b), 9, -3, 6, cra1);
/* 206 */     a(☃, bup.bS.n().a(bzd.a, cfl.b).a(bzd.c, cfl.a), 9, -3, 5, cra1);
/* 207 */     a(☃, bup.bJ.n(), 9, -3, 4, cra1);
/* 208 */     a(☃, ceh5, 9, -2, 4, cra1);
/* 209 */     if (!this.h) {
/* 210 */       this.h = a(☃, cra1, random, 9, -2, 3, gc.e, cyq.B);
/*     */     }
/* 212 */     a(☃, bup.dP.n().a(cbi.c, Boolean.valueOf(true)), 8, -1, 3, cra1);
/* 213 */     a(☃, bup.dP.n().a(cbi.c, Boolean.valueOf(true)), 8, -2, 3, cra1);
/* 214 */     if (!this.e) {
/* 215 */       this.e = a(☃, cra1, random, 8, -3, 3, cyq.A);
/*     */     }
/* 217 */     a(☃, bup.bJ.n(), 9, -3, 2, cra1);
/* 218 */     a(☃, bup.bJ.n(), 8, -3, 1, cra1);
/* 219 */     a(☃, bup.bJ.n(), 4, -3, 5, cra1);
/* 220 */     a(☃, bup.bJ.n(), 5, -2, 5, cra1);
/* 221 */     a(☃, bup.bJ.n(), 5, -1, 5, cra1);
/* 222 */     a(☃, bup.bJ.n(), 6, -3, 5, cra1);
/* 223 */     a(☃, bup.bJ.n(), 7, -2, 5, cra1);
/* 224 */     a(☃, bup.bJ.n(), 7, -1, 5, cra1);
/* 225 */     a(☃, bup.bJ.n(), 8, -3, 5, cra1);
/* 226 */     a(☃, cra1, 9, -1, 1, 9, -1, 5, false, random, i);
/*     */ 
/*     */     
/* 229 */     b(☃, cra1, 8, -3, 8, 10, -1, 10);
/* 230 */     a(☃, bup.dx.n(), 8, -2, 11, cra1);
/* 231 */     a(☃, bup.dx.n(), 9, -2, 11, cra1);
/* 232 */     a(☃, bup.dx.n(), 10, -2, 11, cra1);
/* 233 */     ceh ceh6 = bup.cp.n().a(bya.aq, gc.c).a(bya.u, cet.b);
/* 234 */     a(☃, ceh6, 8, -2, 12, cra1);
/* 235 */     a(☃, ceh6, 9, -2, 12, cra1);
/* 236 */     a(☃, ceh6, 10, -2, 12, cra1);
/* 237 */     a(☃, cra1, 8, -3, 8, 8, -3, 10, false, random, i);
/* 238 */     a(☃, cra1, 10, -3, 8, 10, -3, 10, false, random, i);
/* 239 */     a(☃, bup.bJ.n(), 10, -2, 9, cra1);
/* 240 */     a(☃, ceh5, 8, -2, 9, cra1);
/* 241 */     a(☃, ceh5, 8, -2, 10, cra1);
/* 242 */     a(☃, bup.bS.n().a(bzd.a, cfl.b).a(bzd.c, cfl.b).a(bzd.b, cfl.b).a(bzd.d, cfl.b), 10, -1, 9, cra1);
/* 243 */     a(☃, bup.aP.n().a(cea.a, gc.b), 9, -2, 8, cra1);
/* 244 */     a(☃, bup.aP.n().a(cea.a, gc.e), 10, -2, 8, cra1);
/* 245 */     a(☃, bup.aP.n().a(cea.a, gc.e), 10, -1, 8, cra1);
/* 246 */     a(☃, bup.cX.n().a(bzi.aq, gc.c), 10, -2, 10, cra1);
/* 247 */     if (!this.f) {
/* 248 */       this.f = a(☃, cra1, random, 9, -3, 10, cyq.A);
/*     */     }
/*     */     
/* 251 */     return true;
/*     */   }
/*     */   
/*     */   static class a
/*     */     extends cru.a {
/*     */     public void a(Random ☃, int i, int j, int k, boolean bool) {
/* 257 */       if (☃.nextFloat() < 0.4F) {
/* 258 */         this.a = bup.m.n();
/*     */       } else {
/* 260 */         this.a = bup.bJ.n();
/*     */       } 
/*     */     }
/*     */     private a() {} }
/*     */   
/* 265 */   private static final a i = new a();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */