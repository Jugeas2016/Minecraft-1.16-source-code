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
/*     */ public class bjc
/*     */   extends bic
/*     */ {
/*     */   private final bim c;
/*  29 */   private final biq d = biq.a();
/*     */   private Runnable e = () -> {
/*     */     
/*     */     };
/*     */   private final bjr f;
/*     */   private final bjr g;
/*     */   private final bjr h;
/*     */   private final bjr i;
/*     */   private long j;
/*     */   
/*  39 */   private final aon k = new apa(this, 3)
/*     */     {
/*     */       public void X_() {
/*  42 */         super.X_();
/*  43 */         this.a.a(this);
/*  44 */         bjc.a(this.a).run();
/*     */       }
/*     */     };
/*     */   
/*  48 */   private final aon l = new apa(this, 1)
/*     */     {
/*     */       public void X_() {
/*  51 */         super.X_();
/*  52 */         bjc.a(this.a).run();
/*     */       }
/*     */     };
/*     */   
/*     */   public bjc(int ☃, bfv bfv1) {
/*  57 */     this(☃, bfv1, bim.a);
/*     */   }
/*     */   
/*     */   public bjc(int ☃, bfv bfv1, bim bim1) {
/*  61 */     super(bje.r, ☃);
/*  62 */     this.c = bim1;
/*     */     
/*  64 */     this.f = a(new bjr(this, this.k, 0, 13, 26)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  67 */             return ☃.b() instanceof bke;
/*     */           }
/*     */         });
/*     */     
/*  71 */     this.g = a(new bjr(this, this.k, 1, 33, 26)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  74 */             return ☃.b() instanceof bky;
/*     */           }
/*     */         });
/*     */     
/*  78 */     this.h = a(new bjr(this, this.k, 2, 23, 45)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  81 */             return ☃.b() instanceof bkf;
/*     */           }
/*     */         });
/*     */     
/*  85 */     this.i = a(new bjr(this, this.l, 0, 143, 58, bim1)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  88 */             return false;
/*     */           }
/*     */ 
/*     */           
/*     */           public bmb a(bfw ☃, bmb bmb1) {
/*  93 */             bjc.b(this.b).a(1);
/*  94 */             bjc.c(this.b).a(1);
/*  95 */             if (!bjc.b(this.b).f() || !bjc.c(this.b).f()) {
/*  96 */               bjc.d(this.b).a(0);
/*     */             }
/*  98 */             this.a.a((☃, fx1) -> {
/*     */                   long l = ☃.T();
/*     */                   
/*     */                   if (bjc.e(this.b) != l) {
/*     */                     ☃.a((bfw)null, fx1, adq.pH, adr.e, 1.0F, 1.0F);
/*     */                     
/*     */                     bjc.a(this.b, l);
/*     */                   } 
/*     */                 });
/*     */             
/* 108 */             return super.a(☃, bmb1);
/*     */           }
/*     */         });
/*     */     int i;
/* 112 */     for (i = 0; i < 3; i++) {
/* 113 */       for (int j = 0; j < 9; j++) {
/* 114 */         a(new bjr(bfv1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/* 117 */     for (i = 0; i < 9; i++) {
/* 118 */       a(new bjr(bfv1, i, 8 + i * 18, 142));
/*     */     }
/*     */     
/* 121 */     a(this.d);
/*     */   }
/*     */   
/*     */   public int e() {
/* 125 */     return this.d.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 130 */     return a(this.c, ☃, bup.lR);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃, int i) {
/* 135 */     if (i > 0 && i <= ccb.R) {
/* 136 */       this.d.a(i);
/* 137 */       j();
/* 138 */       return true;
/*     */     } 
/*     */     
/* 141 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/* 146 */     bmb bmb1 = this.f.e();
/* 147 */     bmb bmb2 = this.g.e();
/* 148 */     bmb bmb3 = this.h.e();
/* 149 */     bmb bmb4 = this.i.e();
/*     */     
/* 151 */     if (!bmb4.a() && (bmb1.a() || bmb2.a() || this.d.b() <= 0 || (this.d.b() >= ccb.P - ccb.Q && bmb3.a()))) {
/* 152 */       this.i.d(bmb.b);
/* 153 */       this.d.a(0);
/* 154 */     } else if (!bmb3.a() && bmb3.b() instanceof bkf) {
/* 155 */       md md = bmb1.a("BlockEntityTag");
/* 156 */       boolean bool = (md.c("Patterns", 9) && !bmb1.a() && md.d("Patterns", 10).size() >= 6);
/* 157 */       if (bool) {
/* 158 */         this.d.a(0);
/*     */       } else {
/* 160 */         this.d.a(((bkf)bmb3.b()).b().ordinal());
/*     */       } 
/*     */     } 
/*     */     
/* 164 */     j();
/* 165 */     c();
/*     */   }
/*     */   
/*     */   public void a(Runnable ☃) {
/* 169 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 174 */     bmb bmb = bmb.b;
/* 175 */     bjr bjr1 = this.a.get(i);
/* 176 */     if (bjr1 != null && bjr1.f()) {
/* 177 */       bmb bmb1 = bjr1.e();
/* 178 */       bmb = bmb1.i();
/*     */       
/* 180 */       if (i == this.i.d) {
/* 181 */         if (!a(bmb1, 4, 40, true)) {
/* 182 */           return bmb.b;
/*     */         }
/* 184 */         bjr1.a(bmb1, bmb);
/* 185 */       } else if (i == this.g.d || i == this.f.d || i == this.h.d) {
/* 186 */         if (!a(bmb1, 4, 40, false)) {
/* 187 */           return bmb.b;
/*     */         }
/* 189 */       } else if (bmb1.b() instanceof bke) {
/* 190 */         if (!a(bmb1, this.f.d, this.f.d + 1, false)) {
/* 191 */           return bmb.b;
/*     */         }
/* 193 */       } else if (bmb1.b() instanceof bky) {
/* 194 */         if (!a(bmb1, this.g.d, this.g.d + 1, false)) {
/* 195 */           return bmb.b;
/*     */         }
/* 197 */       } else if (bmb1.b() instanceof bkf) {
/* 198 */         if (!a(bmb1, this.h.d, this.h.d + 1, false)) {
/* 199 */           return bmb.b;
/*     */         }
/* 201 */       } else if (i >= 4 && i < 31) {
/* 202 */         if (!a(bmb1, 31, 40, false)) {
/* 203 */           return bmb.b;
/*     */         }
/* 205 */       } else if (i >= 31 && i < 40 && 
/* 206 */         !a(bmb1, 4, 31, false)) {
/* 207 */         return bmb.b;
/*     */       } 
/*     */ 
/*     */       
/* 211 */       if (bmb1.a()) {
/* 212 */         bjr1.d(bmb.b);
/*     */       } else {
/* 214 */         bjr1.d();
/*     */       } 
/* 216 */       if (bmb1.E() == bmb.E()) {
/* 217 */         return bmb.b;
/*     */       }
/* 219 */       bjr1.a(☃, bmb1);
/*     */     } 
/*     */     
/* 222 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 227 */     super.b(☃);
/* 228 */     this.c.a((brx1, fx1) -> a(☃, ☃.l, this.k));
/*     */   }
/*     */   
/*     */   private void j() {
/* 232 */     if (this.d.b() > 0) {
/* 233 */       bmb ☃ = this.f.e();
/* 234 */       bmb bmb1 = this.g.e();
/* 235 */       bmb bmb2 = bmb.b;
/*     */       
/* 237 */       if (!☃.a() && !bmb1.a()) {
/* 238 */         mj mj; bmb2 = ☃.i();
/* 239 */         bmb2.e(1);
/*     */         
/* 241 */         ccb ccb = ccb.values()[this.d.b()];
/* 242 */         bkx bkx = ((bky)bmb1.b()).d();
/*     */         
/* 244 */         md md1 = bmb2.a("BlockEntityTag");
/*     */         
/* 246 */         if (md1.c("Patterns", 9)) {
/* 247 */           mj = md1.d("Patterns", 10);
/*     */         } else {
/* 249 */           mj = new mj();
/* 250 */           md1.a("Patterns", mj);
/*     */         } 
/* 252 */         md md2 = new md();
/* 253 */         md2.a("Pattern", ccb.b());
/* 254 */         md2.b("Color", bkx.b());
/* 255 */         mj.add(md2);
/*     */       } 
/* 257 */       if (!bmb.b(bmb2, this.i.e())) {
/* 258 */         this.i.d(bmb2);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public bjr f() {
/* 264 */     return this.f;
/*     */   }
/*     */   
/*     */   public bjr g() {
/* 268 */     return this.g;
/*     */   }
/*     */   
/*     */   public bjr h() {
/* 272 */     return this.h;
/*     */   }
/*     */   
/*     */   public bjr i() {
/* 276 */     return this.i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */