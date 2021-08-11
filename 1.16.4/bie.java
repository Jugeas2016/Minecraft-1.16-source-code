/*     */ import java.util.Map;
/*     */ import org.apache.commons.lang3.StringUtils;
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
/*     */ public class bie
/*     */   extends bja
/*     */ {
/*  23 */   private static final Logger g = LogManager.getLogger();
/*     */ 
/*     */   
/*     */   private int h;
/*     */ 
/*     */   
/*     */   private String i;
/*     */   
/*  31 */   private final biq j = biq.a();
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
/*     */   public bie(int ☃, bfv bfv1) {
/*  54 */     this(☃, bfv1, bim.a);
/*     */   }
/*     */   
/*     */   public bie(int ☃, bfv bfv1, bim bim1) {
/*  58 */     super(bje.h, ☃, bfv1, bim1);
/*     */     
/*  60 */     a(this.j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(ceh ☃) {
/*  65 */     return ☃.a(aed.G);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(bfw ☃, boolean bool) {
/*  70 */     return ((☃.bC.d || ☃.bD >= this.j.b()) && this.j.b() > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb a(bfw ☃, bmb bmb1) {
/*  75 */     if (!☃.bC.d) {
/*  76 */       ☃.c(-this.j.b());
/*     */     }
/*  78 */     this.d.a(0, bmb.b);
/*     */     
/*  80 */     if (this.h > 0) {
/*  81 */       bmb bmb2 = this.d.a(1);
/*  82 */       if (!bmb2.a() && bmb2.E() > this.h) {
/*  83 */         bmb2.g(this.h);
/*  84 */         this.d.a(1, bmb2);
/*     */       } else {
/*  86 */         this.d.a(1, bmb.b);
/*     */       } 
/*     */     } else {
/*  89 */       this.d.a(1, bmb.b);
/*     */     } 
/*  91 */     this.j.a(0);
/*     */     
/*  93 */     this.e.a((brx1, fx1) -> {
/*     */           ceh ceh = brx1.d_(fx1);
/*     */           if (!☃.bC.d && ceh.a(aed.G) && ☃.cY().nextFloat() < 0.12F) {
/*     */             ceh ceh1 = bts.c(ceh);
/*     */             if (ceh1 == null) {
/*     */               brx1.a(fx1, false);
/*     */               brx1.c(1029, fx1, 0);
/*     */             } else {
/*     */               brx1.a(fx1, ceh1, 2);
/*     */               brx1.c(1030, fx1, 0);
/*     */             } 
/*     */           } else {
/*     */             brx1.c(1030, fx1, 0);
/*     */           } 
/*     */         });
/* 108 */     return bmb1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 113 */     bmb ☃ = this.d.a(0);
/* 114 */     this.j.a(1);
/* 115 */     int i = 0;
/* 116 */     int j = 0;
/* 117 */     int k = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     if (☃.a()) {
/* 124 */       this.c.a(0, bmb.b);
/* 125 */       this.j.a(0);
/*     */       
/*     */       return;
/*     */     } 
/* 129 */     bmb bmb1 = ☃.i();
/* 130 */     bmb bmb2 = this.d.a(1);
/* 131 */     Map<bps, Integer> map = bpu.a(bmb1);
/*     */     
/* 133 */     j += ☃.B() + (bmb2.a() ? 0 : bmb2.B());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 138 */     this.h = 0;
/*     */     
/* 140 */     if (!bmb2.a()) {
/* 141 */       boolean bool = (bmb2.b() == bmd.pq && !blf.d(bmb2).isEmpty());
/*     */       
/* 143 */       if (bmb1.e() && bmb1.b().a(☃, bmb2)) {
/* 144 */         int m = Math.min(bmb1.g(), bmb1.h() / 4);
/* 145 */         if (m <= 0) {
/* 146 */           this.c.a(0, bmb.b);
/* 147 */           this.j.a(0);
/*     */           return;
/*     */         } 
/* 150 */         int n = 0;
/* 151 */         while (m > 0 && n < bmb2.E()) {
/* 152 */           int i1 = bmb1.g() - m;
/* 153 */           bmb1.b(i1);
/* 154 */           i++;
/*     */           
/* 156 */           m = Math.min(bmb1.g(), bmb1.h() / 4);
/* 157 */           n++;
/*     */         } 
/* 159 */         this.h = n;
/*     */       } else {
/* 161 */         if (!bool && (bmb1.b() != bmb2.b() || !bmb1.e())) {
/* 162 */           this.c.a(0, bmb.b);
/* 163 */           this.j.a(0);
/*     */           return;
/*     */         } 
/* 166 */         if (bmb1.e() && !bool) {
/* 167 */           int m = ☃.h() - ☃.g();
/* 168 */           int n = bmb2.h() - bmb2.g();
/* 169 */           int i1 = n + bmb1.h() * 12 / 100;
/* 170 */           int i2 = m + i1;
/* 171 */           int i3 = bmb1.h() - i2;
/* 172 */           if (i3 < 0) {
/* 173 */             i3 = 0;
/*     */           }
/*     */           
/* 176 */           if (i3 < bmb1.g()) {
/* 177 */             bmb1.b(i3);
/* 178 */             i += 2;
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 185 */         Map<bps, Integer> map1 = bpu.a(bmb2);
/* 186 */         boolean bool1 = false;
/* 187 */         boolean bool2 = false;
/*     */         
/* 189 */         for (bps bps : map1.keySet()) {
/* 190 */           if (bps == null) {
/*     */             continue;
/*     */           }
/* 193 */           int m = ((Integer)map.getOrDefault(bps, Integer.valueOf(0))).intValue();
/* 194 */           int n = ((Integer)map1.get(bps)).intValue();
/* 195 */           n = (m == n) ? (n + 1) : Math.max(n, m);
/*     */           
/* 197 */           boolean bool3 = bps.a(☃);
/* 198 */           if (this.f.bC.d || ☃.b() == bmd.pq) {
/* 199 */             bool3 = true;
/*     */           }
/*     */           
/* 202 */           for (bps bps1 : map.keySet()) {
/* 203 */             if (bps1 != bps && !bps.b(bps1)) {
/* 204 */               bool3 = false;
/* 205 */               i++;
/*     */             } 
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 212 */           if (!bool3) {
/* 213 */             bool2 = true;
/*     */             continue;
/*     */           } 
/* 216 */           bool1 = true;
/* 217 */           if (n > bps.a()) {
/* 218 */             n = bps.a();
/*     */           }
/* 220 */           map.put(bps, Integer.valueOf(n));
/* 221 */           int i1 = 0;
/*     */           
/* 223 */           switch (null.a[bps.d().ordinal()]) {
/*     */             case 1:
/* 225 */               i1 = 1;
/*     */               break;
/*     */             case 2:
/* 228 */               i1 = 2;
/*     */               break;
/*     */             case 3:
/* 231 */               i1 = 4;
/*     */               break;
/*     */             case 4:
/* 234 */               i1 = 8;
/*     */               break;
/*     */           } 
/*     */           
/* 238 */           if (bool) {
/* 239 */             i1 = Math.max(1, i1 / 2);
/*     */           }
/*     */           
/* 242 */           i += i1 * n;
/*     */           
/* 244 */           if (☃.E() > 1) {
/* 245 */             i = 40;
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 252 */         if (bool2 && !bool1) {
/*     */           
/* 254 */           this.c.a(0, bmb.b);
/* 255 */           this.j.a(0);
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/* 261 */     if (StringUtils.isBlank(this.i)) {
/* 262 */       if (☃.t()) {
/* 263 */         k = 1;
/*     */         
/* 265 */         i += k;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 270 */         bmb1.s();
/*     */       } 
/* 272 */     } else if (!this.i.equals(☃.r().getString())) {
/* 273 */       k = 1;
/*     */       
/* 275 */       i += k;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 280 */       bmb1.a(new oe(this.i));
/*     */     } 
/*     */     
/* 283 */     this.j.a(j + i);
/* 284 */     if (i <= 0)
/*     */     {
/*     */ 
/*     */       
/* 288 */       bmb1 = bmb.b;
/*     */     }
/* 290 */     if (k == i && k > 0 && this.j.b() >= 40)
/*     */     {
/*     */ 
/*     */       
/* 294 */       this.j.a(39);
/*     */     }
/* 296 */     if (this.j.b() >= 40 && !this.f.bC.d)
/*     */     {
/*     */ 
/*     */       
/* 300 */       bmb1 = bmb.b;
/*     */     }
/*     */     
/* 303 */     if (!bmb1.a()) {
/* 304 */       int m = bmb1.B();
/* 305 */       if (!bmb2.a() && m < bmb2.B()) {
/* 306 */         m = bmb2.B();
/*     */       }
/*     */       
/* 309 */       if (k != i || k == 0) {
/* 310 */         m = d(m);
/*     */       }
/*     */       
/* 313 */       bmb1.c(m);
/* 314 */       bpu.a(map, bmb1);
/*     */     } 
/*     */     
/* 317 */     this.c.a(0, bmb1);
/*     */     
/* 319 */     c();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int d(int ☃) {
/* 327 */     return ☃ * 2 + 1;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 331 */     this.i = ☃;
/*     */     
/* 333 */     if (a(2).f()) {
/* 334 */       bmb bmb = a(2).e();
/*     */       
/* 336 */       if (StringUtils.isBlank(☃)) {
/* 337 */         bmb.s();
/*     */       } else {
/* 339 */         bmb.a(new oe(this.i));
/*     */       } 
/*     */     } 
/*     */     
/* 343 */     e();
/*     */   }
/*     */   
/*     */   public int f() {
/* 347 */     return this.j.b();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */