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
/*     */ public class crc
/*     */   extends crq
/*     */ {
/*  20 */   private final boolean[] e = new boolean[4];
/*     */   
/*     */   public crc(Random ☃, int i, int j) {
/*  23 */     super(clb.L, ☃, i, 64, j, 21, 15, 21);
/*     */   }
/*     */   
/*     */   public crc(csw ☃, md md1) {
/*  27 */     super(clb.L, md1);
/*  28 */     this.e[0] = md1.q("hasPlacedChest0");
/*  29 */     this.e[1] = md1.q("hasPlacedChest1");
/*  30 */     this.e[2] = md1.q("hasPlacedChest2");
/*  31 */     this.e[3] = md1.q("hasPlacedChest3");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  36 */     super.a(☃);
/*  37 */     ☃.a("hasPlacedChest0", this.e[0]);
/*  38 */     ☃.a("hasPlacedChest1", this.e[1]);
/*  39 */     ☃.a("hasPlacedChest2", this.e[2]);
/*  40 */     ☃.a("hasPlacedChest3", this.e[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/*  46 */     a(☃, cra1, 0, -4, 0, this.a - 1, 0, this.c - 1, bup.at.n(), bup.at.n(), false); int i;
/*  47 */     for (i = 1; i <= 9; i++) {
/*  48 */       a(☃, cra1, i, i, i, this.a - 1 - i, i, this.c - 1 - i, bup.at.n(), bup.at.n(), false);
/*  49 */       a(☃, cra1, i + 1, i, i + 1, this.a - 2 - i, i, this.c - 2 - i, bup.a.n(), bup.a.n(), false);
/*     */     } 
/*  51 */     for (i = 0; i < this.a; i++) {
/*  52 */       for (int k = 0; k < this.c; k++) {
/*  53 */         int m = -5;
/*  54 */         b(☃, bup.at.n(), i, -5, k, cra1);
/*     */       } 
/*     */     } 
/*     */     
/*  58 */     ceh ceh1 = bup.ei.n().a(cak.a, gc.c);
/*  59 */     ceh ceh2 = bup.ei.n().a(cak.a, gc.d);
/*  60 */     ceh ceh3 = bup.ei.n().a(cak.a, gc.f);
/*  61 */     ceh ceh4 = bup.ei.n().a(cak.a, gc.e);
/*     */ 
/*     */     
/*  64 */     a(☃, cra1, 0, 0, 0, 4, 9, 4, bup.at.n(), bup.a.n(), false);
/*  65 */     a(☃, cra1, 1, 10, 1, 3, 10, 3, bup.at.n(), bup.at.n(), false);
/*  66 */     a(☃, ceh1, 2, 10, 0, cra1);
/*  67 */     a(☃, ceh2, 2, 10, 4, cra1);
/*  68 */     a(☃, ceh3, 0, 10, 2, cra1);
/*  69 */     a(☃, ceh4, 4, 10, 2, cra1);
/*  70 */     a(☃, cra1, this.a - 5, 0, 0, this.a - 1, 9, 4, bup.at.n(), bup.a.n(), false);
/*  71 */     a(☃, cra1, this.a - 4, 10, 1, this.a - 2, 10, 3, bup.at.n(), bup.at.n(), false);
/*  72 */     a(☃, ceh1, this.a - 3, 10, 0, cra1);
/*  73 */     a(☃, ceh2, this.a - 3, 10, 4, cra1);
/*  74 */     a(☃, ceh3, this.a - 5, 10, 2, cra1);
/*  75 */     a(☃, ceh4, this.a - 1, 10, 2, cra1);
/*     */ 
/*     */     
/*  78 */     a(☃, cra1, 8, 0, 0, 12, 4, 4, bup.at.n(), bup.a.n(), false);
/*  79 */     a(☃, cra1, 9, 1, 0, 11, 3, 4, bup.a.n(), bup.a.n(), false);
/*  80 */     a(☃, bup.av.n(), 9, 1, 1, cra1);
/*  81 */     a(☃, bup.av.n(), 9, 2, 1, cra1);
/*  82 */     a(☃, bup.av.n(), 9, 3, 1, cra1);
/*  83 */     a(☃, bup.av.n(), 10, 3, 1, cra1);
/*  84 */     a(☃, bup.av.n(), 11, 3, 1, cra1);
/*  85 */     a(☃, bup.av.n(), 11, 2, 1, cra1);
/*  86 */     a(☃, bup.av.n(), 11, 1, 1, cra1);
/*     */ 
/*     */     
/*  89 */     a(☃, cra1, 4, 1, 1, 8, 3, 3, bup.at.n(), bup.a.n(), false);
/*  90 */     a(☃, cra1, 4, 1, 2, 8, 2, 2, bup.a.n(), bup.a.n(), false);
/*  91 */     a(☃, cra1, 12, 1, 1, 16, 3, 3, bup.at.n(), bup.a.n(), false);
/*  92 */     a(☃, cra1, 12, 1, 2, 16, 2, 2, bup.a.n(), bup.a.n(), false);
/*     */ 
/*     */     
/*  95 */     a(☃, cra1, 5, 4, 5, this.a - 6, 4, this.c - 6, bup.at.n(), bup.at.n(), false);
/*  96 */     a(☃, cra1, 9, 4, 9, 11, 4, 11, bup.a.n(), bup.a.n(), false);
/*  97 */     a(☃, cra1, 8, 1, 8, 8, 3, 8, bup.av.n(), bup.av.n(), false);
/*  98 */     a(☃, cra1, 12, 1, 8, 12, 3, 8, bup.av.n(), bup.av.n(), false);
/*  99 */     a(☃, cra1, 8, 1, 12, 8, 3, 12, bup.av.n(), bup.av.n(), false);
/* 100 */     a(☃, cra1, 12, 1, 12, 12, 3, 12, bup.av.n(), bup.av.n(), false);
/*     */ 
/*     */     
/* 103 */     a(☃, cra1, 1, 1, 5, 4, 4, 11, bup.at.n(), bup.at.n(), false);
/* 104 */     a(☃, cra1, this.a - 5, 1, 5, this.a - 2, 4, 11, bup.at.n(), bup.at.n(), false);
/* 105 */     a(☃, cra1, 6, 7, 9, 6, 7, 11, bup.at.n(), bup.at.n(), false);
/* 106 */     a(☃, cra1, this.a - 7, 7, 9, this.a - 7, 7, 11, bup.at.n(), bup.at.n(), false);
/* 107 */     a(☃, cra1, 5, 5, 9, 5, 7, 11, bup.av.n(), bup.av.n(), false);
/* 108 */     a(☃, cra1, this.a - 6, 5, 9, this.a - 6, 7, 11, bup.av.n(), bup.av.n(), false);
/* 109 */     a(☃, bup.a.n(), 5, 5, 10, cra1);
/* 110 */     a(☃, bup.a.n(), 5, 6, 10, cra1);
/* 111 */     a(☃, bup.a.n(), 6, 6, 10, cra1);
/* 112 */     a(☃, bup.a.n(), this.a - 6, 5, 10, cra1);
/* 113 */     a(☃, bup.a.n(), this.a - 6, 6, 10, cra1);
/* 114 */     a(☃, bup.a.n(), this.a - 7, 6, 10, cra1);
/*     */ 
/*     */     
/* 117 */     a(☃, cra1, 2, 4, 4, 2, 6, 4, bup.a.n(), bup.a.n(), false);
/* 118 */     a(☃, cra1, this.a - 3, 4, 4, this.a - 3, 6, 4, bup.a.n(), bup.a.n(), false);
/* 119 */     a(☃, ceh1, 2, 4, 5, cra1);
/* 120 */     a(☃, ceh1, 2, 3, 4, cra1);
/* 121 */     a(☃, ceh1, this.a - 3, 4, 5, cra1);
/* 122 */     a(☃, ceh1, this.a - 3, 3, 4, cra1);
/* 123 */     a(☃, cra1, 1, 1, 3, 2, 2, 3, bup.at.n(), bup.at.n(), false);
/* 124 */     a(☃, cra1, this.a - 3, 1, 3, this.a - 2, 2, 3, bup.at.n(), bup.at.n(), false);
/* 125 */     a(☃, bup.at.n(), 1, 1, 2, cra1);
/* 126 */     a(☃, bup.at.n(), this.a - 2, 1, 2, cra1);
/* 127 */     a(☃, bup.hS.n(), 1, 2, 2, cra1);
/* 128 */     a(☃, bup.hS.n(), this.a - 2, 2, 2, cra1);
/* 129 */     a(☃, ceh4, 2, 1, 2, cra1);
/* 130 */     a(☃, ceh3, this.a - 3, 1, 2, cra1);
/*     */ 
/*     */     
/* 133 */     a(☃, cra1, 4, 3, 5, 4, 3, 17, bup.at.n(), bup.at.n(), false);
/* 134 */     a(☃, cra1, this.a - 5, 3, 5, this.a - 5, 3, 17, bup.at.n(), bup.at.n(), false);
/* 135 */     a(☃, cra1, 3, 1, 5, 4, 2, 16, bup.a.n(), bup.a.n(), false);
/* 136 */     a(☃, cra1, this.a - 6, 1, 5, this.a - 5, 2, 16, bup.a.n(), bup.a.n(), false); int j;
/* 137 */     for (j = 5; j <= 17; j += 2) {
/* 138 */       a(☃, bup.av.n(), 4, 1, j, cra1);
/* 139 */       a(☃, bup.au.n(), 4, 2, j, cra1);
/* 140 */       a(☃, bup.av.n(), this.a - 5, 1, j, cra1);
/* 141 */       a(☃, bup.au.n(), this.a - 5, 2, j, cra1);
/*     */     } 
/* 143 */     a(☃, bup.fG.n(), 10, 0, 7, cra1);
/* 144 */     a(☃, bup.fG.n(), 10, 0, 8, cra1);
/* 145 */     a(☃, bup.fG.n(), 9, 0, 9, cra1);
/* 146 */     a(☃, bup.fG.n(), 11, 0, 9, cra1);
/* 147 */     a(☃, bup.fG.n(), 8, 0, 10, cra1);
/* 148 */     a(☃, bup.fG.n(), 12, 0, 10, cra1);
/* 149 */     a(☃, bup.fG.n(), 7, 0, 10, cra1);
/* 150 */     a(☃, bup.fG.n(), 13, 0, 10, cra1);
/* 151 */     a(☃, bup.fG.n(), 9, 0, 11, cra1);
/* 152 */     a(☃, bup.fG.n(), 11, 0, 11, cra1);
/* 153 */     a(☃, bup.fG.n(), 10, 0, 12, cra1);
/* 154 */     a(☃, bup.fG.n(), 10, 0, 13, cra1);
/* 155 */     a(☃, bup.fQ.n(), 10, 0, 10, cra1);
/*     */ 
/*     */     
/* 158 */     for (j = 0; j <= this.a - 1; j += this.a - 1) {
/* 159 */       a(☃, bup.av.n(), j, 2, 1, cra1);
/* 160 */       a(☃, bup.fG.n(), j, 2, 2, cra1);
/* 161 */       a(☃, bup.av.n(), j, 2, 3, cra1);
/* 162 */       a(☃, bup.av.n(), j, 3, 1, cra1);
/* 163 */       a(☃, bup.fG.n(), j, 3, 2, cra1);
/* 164 */       a(☃, bup.av.n(), j, 3, 3, cra1);
/* 165 */       a(☃, bup.fG.n(), j, 4, 1, cra1);
/* 166 */       a(☃, bup.au.n(), j, 4, 2, cra1);
/* 167 */       a(☃, bup.fG.n(), j, 4, 3, cra1);
/* 168 */       a(☃, bup.av.n(), j, 5, 1, cra1);
/* 169 */       a(☃, bup.fG.n(), j, 5, 2, cra1);
/* 170 */       a(☃, bup.av.n(), j, 5, 3, cra1);
/* 171 */       a(☃, bup.fG.n(), j, 6, 1, cra1);
/* 172 */       a(☃, bup.au.n(), j, 6, 2, cra1);
/* 173 */       a(☃, bup.fG.n(), j, 6, 3, cra1);
/* 174 */       a(☃, bup.fG.n(), j, 7, 1, cra1);
/* 175 */       a(☃, bup.fG.n(), j, 7, 2, cra1);
/* 176 */       a(☃, bup.fG.n(), j, 7, 3, cra1);
/* 177 */       a(☃, bup.av.n(), j, 8, 1, cra1);
/* 178 */       a(☃, bup.av.n(), j, 8, 2, cra1);
/* 179 */       a(☃, bup.av.n(), j, 8, 3, cra1);
/*     */     } 
/* 181 */     for (j = 2; j <= this.a - 3; j += this.a - 3 - 2) {
/* 182 */       a(☃, bup.av.n(), j - 1, 2, 0, cra1);
/* 183 */       a(☃, bup.fG.n(), j, 2, 0, cra1);
/* 184 */       a(☃, bup.av.n(), j + 1, 2, 0, cra1);
/* 185 */       a(☃, bup.av.n(), j - 1, 3, 0, cra1);
/* 186 */       a(☃, bup.fG.n(), j, 3, 0, cra1);
/* 187 */       a(☃, bup.av.n(), j + 1, 3, 0, cra1);
/* 188 */       a(☃, bup.fG.n(), j - 1, 4, 0, cra1);
/* 189 */       a(☃, bup.au.n(), j, 4, 0, cra1);
/* 190 */       a(☃, bup.fG.n(), j + 1, 4, 0, cra1);
/* 191 */       a(☃, bup.av.n(), j - 1, 5, 0, cra1);
/* 192 */       a(☃, bup.fG.n(), j, 5, 0, cra1);
/* 193 */       a(☃, bup.av.n(), j + 1, 5, 0, cra1);
/* 194 */       a(☃, bup.fG.n(), j - 1, 6, 0, cra1);
/* 195 */       a(☃, bup.au.n(), j, 6, 0, cra1);
/* 196 */       a(☃, bup.fG.n(), j + 1, 6, 0, cra1);
/* 197 */       a(☃, bup.fG.n(), j - 1, 7, 0, cra1);
/* 198 */       a(☃, bup.fG.n(), j, 7, 0, cra1);
/* 199 */       a(☃, bup.fG.n(), j + 1, 7, 0, cra1);
/* 200 */       a(☃, bup.av.n(), j - 1, 8, 0, cra1);
/* 201 */       a(☃, bup.av.n(), j, 8, 0, cra1);
/* 202 */       a(☃, bup.av.n(), j + 1, 8, 0, cra1);
/*     */     } 
/* 204 */     a(☃, cra1, 8, 4, 0, 12, 6, 0, bup.av.n(), bup.av.n(), false);
/* 205 */     a(☃, bup.a.n(), 8, 6, 0, cra1);
/* 206 */     a(☃, bup.a.n(), 12, 6, 0, cra1);
/* 207 */     a(☃, bup.fG.n(), 9, 5, 0, cra1);
/* 208 */     a(☃, bup.au.n(), 10, 5, 0, cra1);
/* 209 */     a(☃, bup.fG.n(), 11, 5, 0, cra1);
/*     */ 
/*     */     
/* 212 */     a(☃, cra1, 8, -14, 8, 12, -11, 12, bup.av.n(), bup.av.n(), false);
/* 213 */     a(☃, cra1, 8, -10, 8, 12, -10, 12, bup.au.n(), bup.au.n(), false);
/* 214 */     a(☃, cra1, 8, -9, 8, 12, -9, 12, bup.av.n(), bup.av.n(), false);
/* 215 */     a(☃, cra1, 8, -8, 8, 12, -1, 12, bup.at.n(), bup.at.n(), false);
/* 216 */     a(☃, cra1, 9, -11, 9, 11, -1, 11, bup.a.n(), bup.a.n(), false);
/* 217 */     a(☃, bup.cq.n(), 10, -11, 10, cra1);
/* 218 */     a(☃, cra1, 9, -13, 9, 11, -13, 11, bup.bH.n(), bup.a.n(), false);
/* 219 */     a(☃, bup.a.n(), 8, -11, 10, cra1);
/* 220 */     a(☃, bup.a.n(), 8, -10, 10, cra1);
/* 221 */     a(☃, bup.au.n(), 7, -10, 10, cra1);
/* 222 */     a(☃, bup.av.n(), 7, -11, 10, cra1);
/* 223 */     a(☃, bup.a.n(), 12, -11, 10, cra1);
/* 224 */     a(☃, bup.a.n(), 12, -10, 10, cra1);
/* 225 */     a(☃, bup.au.n(), 13, -10, 10, cra1);
/* 226 */     a(☃, bup.av.n(), 13, -11, 10, cra1);
/* 227 */     a(☃, bup.a.n(), 10, -11, 8, cra1);
/* 228 */     a(☃, bup.a.n(), 10, -10, 8, cra1);
/* 229 */     a(☃, bup.au.n(), 10, -10, 7, cra1);
/* 230 */     a(☃, bup.av.n(), 10, -11, 7, cra1);
/* 231 */     a(☃, bup.a.n(), 10, -11, 12, cra1);
/* 232 */     a(☃, bup.a.n(), 10, -10, 12, cra1);
/* 233 */     a(☃, bup.au.n(), 10, -10, 13, cra1);
/* 234 */     a(☃, bup.av.n(), 10, -11, 13, cra1);
/*     */ 
/*     */     
/* 237 */     for (gc gc : gc.c.a) {
/* 238 */       if (!this.e[gc.d()]) {
/* 239 */         int k = gc.i() * 2;
/* 240 */         int m = gc.k() * 2;
/* 241 */         this.e[gc.d()] = a(☃, cra1, random, 10 + k, -11, 10 + m, cyq.z);
/*     */       } 
/*     */     } 
/*     */     
/* 245 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */