/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class biw
/*     */   extends bic
/*     */ {
/*  31 */   private final aon c = new bjm();
/*  32 */   private final aon d = new apa(this, 2)
/*     */     {
/*     */       public void X_() {
/*  35 */         super.X_();
/*  36 */         this.a.a(this);
/*     */       }
/*     */     };
/*     */   
/*     */   private final bim e;
/*     */   
/*     */   public biw(int ☃, bfv bfv1) {
/*  43 */     this(☃, bfv1, bim.a);
/*     */   }
/*     */   
/*     */   public biw(int ☃, bfv bfv1, bim bim1) {
/*  47 */     super(bje.o, ☃);
/*  48 */     this.e = bim1;
/*     */     
/*  50 */     a(new bjr(this, this.d, 0, 49, 19)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  53 */             return (☃.e() || ☃.b() == bmd.pq || ☃.x());
/*     */           }
/*     */         });
/*  56 */     a(new bjr(this, this.d, 1, 49, 40)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  59 */             return (☃.e() || ☃.b() == bmd.pq || ☃.x());
/*     */           }
/*     */         });
/*  62 */     a(new bjr(this, this.c, 2, 129, 34, bim1)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  65 */             return false;
/*     */           }
/*     */ 
/*     */           
/*     */           public bmb a(bfw ☃, bmb bmb1) {
/*  70 */             this.a.a((☃, fx1) -> {
/*     */                   int i = a(☃);
/*     */                   
/*     */                   while (i > 0) {
/*     */                     int j = aqg.a(i);
/*     */                     i -= j;
/*     */                     ☃.c(new aqg(☃, fx1.u(), fx1.v() + 0.5D, fx1.w() + 0.5D, j));
/*     */                   } 
/*     */                   ☃.c(1042, fx1, 0);
/*     */                 });
/*  80 */             biw.a(this.b).a(0, bmb.b);
/*  81 */             biw.a(this.b).a(1, bmb.b);
/*     */             
/*  83 */             return bmb1;
/*     */           }
/*     */           
/*     */           private int a(brx ☃) {
/*  87 */             int i = 0;
/*  88 */             i += e(biw.a(this.b).a(0));
/*  89 */             i += e(biw.a(this.b).a(1));
/*     */             
/*  91 */             if (i > 0) {
/*  92 */               int j = (int)Math.ceil(i / 2.0D);
/*  93 */               return j + ☃.t.nextInt(j);
/*     */             } 
/*     */             
/*  96 */             return 0;
/*     */           }
/*     */           
/*     */           private int e(bmb ☃) {
/* 100 */             int i = 0;
/* 101 */             Map<bps, Integer> map = bpu.a(☃);
/* 102 */             for (Map.Entry<bps, Integer> entry : map.entrySet()) {
/* 103 */               bps bps = entry.getKey();
/* 104 */               Integer integer = entry.getValue();
/*     */               
/* 106 */               if (!bps.c()) {
/* 107 */                 i += bps.a(integer.intValue());
/*     */               }
/*     */             } 
/*     */             
/* 111 */             return i;
/*     */           }
/*     */         });
/*     */     int i;
/* 115 */     for (i = 0; i < 3; i++) {
/* 116 */       for (int j = 0; j < 9; j++) {
/* 117 */         a(new bjr(bfv1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/* 120 */     for (i = 0; i < 9; i++) {
/* 121 */       a(new bjr(bfv1, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/* 127 */     super.a(☃);
/*     */     
/* 129 */     if (☃ == this.d) {
/* 130 */       e();
/*     */     }
/*     */   }
/*     */   
/*     */   private void e() {
/* 135 */     bmb ☃ = this.d.a(0);
/* 136 */     bmb bmb1 = this.d.a(1);
/*     */     
/* 138 */     boolean bool1 = (!☃.a() || !bmb1.a());
/* 139 */     boolean bool2 = (!☃.a() && !bmb1.a());
/*     */     
/* 141 */     if (bool1) {
/* 142 */       int i; bmb bmb; boolean bool = ((!☃.a() && ☃.b() != bmd.pq && !☃.x()) || (!bmb1.a() && bmb1.b() != bmd.pq && !bmb1.x()));
/* 143 */       if (☃.E() > 1 || bmb1.E() > 1 || (!bool2 && bool)) {
/* 144 */         this.c.a(0, bmb.b);
/* 145 */         c();
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 150 */       int j = 1;
/*     */       
/* 152 */       if (bool2) {
/* 153 */         if (☃.b() == bmb1.b()) {
/* 154 */           blx blx = ☃.b();
/* 155 */           int k = blx.j() - ☃.g();
/* 156 */           int m = blx.j() - bmb1.g();
/* 157 */           int n = k + m + blx.j() * 5 / 100;
/* 158 */           i = Math.max(blx.j() - n, 0);
/*     */           
/* 160 */           bmb = b(☃, bmb1);
/*     */           
/* 162 */           if (!bmb.e()) {
/* 163 */             if (!bmb.b(☃, bmb1)) {
/* 164 */               this.c.a(0, bmb.b);
/* 165 */               c();
/*     */               
/*     */               return;
/*     */             } 
/* 169 */             j = 2;
/*     */           } 
/*     */         } else {
/* 172 */           this.c.a(0, bmb.b);
/* 173 */           c();
/*     */           return;
/*     */         } 
/*     */       } else {
/* 177 */         boolean bool3 = !☃.a();
/* 178 */         i = bool3 ? ☃.g() : bmb1.g();
/* 179 */         bmb = bool3 ? ☃ : bmb1;
/*     */       } 
/*     */       
/* 182 */       this.c.a(0, a(bmb, i, j));
/*     */     } else {
/* 184 */       this.c.a(0, bmb.b);
/*     */     } 
/*     */     
/* 187 */     c();
/*     */   }
/*     */   
/*     */   private bmb b(bmb ☃, bmb bmb1) {
/* 191 */     bmb bmb2 = ☃.i();
/*     */     
/* 193 */     Map<bps, Integer> map = bpu.a(bmb1);
/* 194 */     for (Map.Entry<bps, Integer> entry : map.entrySet()) {
/* 195 */       bps bps = entry.getKey();
/* 196 */       if (!bps.c() || bpu.a(bps, bmb2) == 0) {
/* 197 */         bmb2.a(bps, ((Integer)entry.getValue()).intValue());
/*     */       }
/*     */     } 
/*     */     
/* 201 */     return bmb2;
/*     */   }
/*     */   
/*     */   private bmb a(bmb ☃, int i, int j) {
/* 205 */     bmb bmb1 = ☃.i();
/* 206 */     bmb1.c("Enchantments");
/* 207 */     bmb1.c("StoredEnchantments");
/*     */     
/* 209 */     if (i > 0) {
/* 210 */       bmb1.b(i);
/*     */     } else {
/* 212 */       bmb1.c("Damage");
/*     */     } 
/*     */     
/* 215 */     bmb1.e(j);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     Map<bps, Integer> map = (Map<bps, Integer>)bpu.a(☃).entrySet().stream().filter(☃ -> ((bps)☃.getKey()).c()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
/*     */     
/* 224 */     bpu.a(map, bmb1);
/* 225 */     bmb1.c(0);
/*     */     
/* 227 */     if (bmb1.b() == bmd.pq && map.size() == 0) {
/* 228 */       bmb1 = new bmb(bmd.mc);
/* 229 */       if (☃.t()) {
/* 230 */         bmb1.a(☃.r());
/*     */       }
/*     */     } 
/*     */     
/* 234 */     for (int k = 0; k < map.size(); k++) {
/* 235 */       bmb1.c(bie.d(bmb1.B()));
/*     */     }
/*     */     
/* 238 */     return bmb1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 243 */     super.b(☃);
/* 244 */     this.e.a((brx1, fx1) -> a(☃, brx1, this.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 249 */     return a(this.e, ☃, bup.lX);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 254 */     bmb bmb = bmb.b;
/* 255 */     bjr bjr = this.a.get(i);
/* 256 */     if (bjr != null && bjr.f()) {
/* 257 */       bmb bmb1 = bjr.e();
/* 258 */       bmb = bmb1.i();
/*     */       
/* 260 */       bmb bmb2 = this.d.a(0);
/* 261 */       bmb bmb3 = this.d.a(1);
/*     */       
/* 263 */       if (i == 2) {
/* 264 */         if (!a(bmb1, 3, 39, true)) {
/* 265 */           return bmb.b;
/*     */         }
/* 267 */         bjr.a(bmb1, bmb);
/* 268 */       } else if (i == 0 || i == 1) {
/* 269 */         if (!a(bmb1, 3, 39, false)) {
/* 270 */           return bmb.b;
/*     */         }
/* 272 */       } else if (bmb2.a() || bmb3.a()) {
/* 273 */         if (!a(bmb1, 0, 2, false)) {
/* 274 */           return bmb.b;
/*     */         }
/* 276 */       } else if (i >= 3 && i < 30) {
/* 277 */         if (!a(bmb1, 30, 39, false)) {
/* 278 */           return bmb.b;
/*     */         }
/* 280 */       } else if (i >= 30 && i < 39 && 
/* 281 */         !a(bmb1, 3, 30, false)) {
/* 282 */         return bmb.b;
/*     */       } 
/*     */ 
/*     */       
/* 286 */       if (bmb1.a()) {
/* 287 */         bjr.d(bmb.b);
/*     */       } else {
/* 289 */         bjr.d();
/*     */       } 
/*     */       
/* 292 */       if (bmb1.E() == bmb.E()) {
/* 293 */         return bmb.b;
/*     */       }
/* 295 */       bjr.a(☃, bmb1);
/*     */     } 
/*     */ 
/*     */     
/* 299 */     return bmb;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\biw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */