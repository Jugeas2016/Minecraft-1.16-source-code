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
/*     */ public class bii
/*     */   extends bic
/*     */ {
/*     */   private final bim d;
/*     */   private long e;
/*     */   
/*  28 */   public final aon c = new apa(this, 2)
/*     */     {
/*     */       public void X_() {
/*  31 */         this.a.a(this);
/*  32 */         super.X_();
/*     */       }
/*     */     };
/*  35 */   private final bjm f = new bjm(this)
/*     */     {
/*     */       public void X_()
/*     */       {
/*  39 */         this.a.a(this);
/*  40 */         super.X_();
/*     */       }
/*     */     };
/*     */   
/*     */   public bii(int ☃, bfv bfv1) {
/*  45 */     this(☃, bfv1, bim.a);
/*     */   }
/*     */   
/*     */   public bii(int ☃, bfv bfv1, bim bim1) {
/*  49 */     super(bje.w, ☃);
/*     */     
/*  51 */     this.d = bim1;
/*     */     
/*  53 */     a(new bjr(this, this.c, 0, 15, 15)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  56 */             return (☃.b() == bmd.nf);
/*     */           }
/*     */         });
/*     */     
/*  60 */     a(new bjr(this, this.c, 1, 15, 52)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  63 */             blx blx = ☃.b();
/*  64 */             return (blx == bmd.mb || blx == bmd.pc || blx == bmd.dP);
/*     */           }
/*     */         });
/*     */     
/*  68 */     a(new bjr(this, this.f, 2, 145, 39, bim1)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  71 */             return false;
/*     */           }
/*     */ 
/*     */           
/*     */           public bmb a(bfw ☃, bmb bmb1) {
/*  76 */             ((bjr)this.b.a.get(0)).a(1);
/*  77 */             ((bjr)this.b.a.get(1)).a(1);
/*     */             
/*  79 */             bmb1.b().b(bmb1, ☃.l, ☃);
/*     */             
/*  81 */             this.a.a((☃, fx1) -> {
/*     */                   long l = ☃.T();
/*     */                   
/*     */                   if (bii.a(this.b) != l) {
/*     */                     ☃.a((bfw)null, fx1, adq.pI, adr.e, 1.0F, 1.0F);
/*     */                     
/*     */                     bii.a(this.b, l);
/*     */                   } 
/*     */                 });
/*  90 */             return super.a(☃, bmb1);
/*     */           }
/*     */         });
/*     */     int i;
/*  94 */     for (i = 0; i < 3; i++) {
/*  95 */       for (int j = 0; j < 9; j++) {
/*  96 */         a(new bjr(bfv1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  99 */     for (i = 0; i < 9; i++) {
/* 100 */       a(new bjr(bfv1, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 106 */     return a(this.d, ☃, bup.lV);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/* 111 */     bmb bmb1 = this.c.a(0);
/* 112 */     bmb bmb2 = this.c.a(1);
/* 113 */     bmb bmb3 = this.f.a(2);
/*     */     
/* 115 */     if (!bmb3.a() && (bmb1.a() || bmb2.a())) {
/* 116 */       this.f.b(2);
/* 117 */     } else if (!bmb1.a() && !bmb2.a()) {
/* 118 */       a(bmb1, bmb2, bmb3);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(bmb ☃, bmb bmb1, bmb bmb2) {
/* 123 */     this.d.a((brx1, fx1) -> {
/*     */           bmb bmb3;
/*     */           blx blx = ☃.b();
/*     */           cxx cxx = bmh.a(bmb1, brx1);
/*     */           if (cxx == null) {
/*     */             return;
/*     */           }
/*     */           if (blx == bmd.mb && !cxx.h && cxx.f < 4) {
/*     */             bmb3 = bmb1.i();
/*     */             bmb3.e(1);
/*     */             bmb3.p().b("map_scale_direction", 1);
/*     */             c();
/*     */           } else if (blx == bmd.dP && !cxx.h) {
/*     */             bmb3 = bmb1.i();
/*     */             bmb3.e(1);
/*     */             bmb3.p().a("map_to_lock", true);
/*     */             c();
/*     */           } else if (blx == bmd.pc) {
/*     */             bmb3 = bmb1.i();
/*     */             bmb3.e(2);
/*     */             c();
/*     */           } else {
/*     */             this.f.b(2);
/*     */             c();
/*     */             return;
/*     */           } 
/*     */           if (!bmb.b(bmb3, bmb2)) {
/*     */             this.f.a(2, bmb3);
/*     */             c();
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, bjr bjr1) {
/* 162 */     return (bjr1.c != this.f && super.a(☃, bjr1));
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 167 */     bmb bmb = bmb.b;
/* 168 */     bjr bjr = this.a.get(i);
/* 169 */     if (bjr != null && bjr.f()) {
/* 170 */       bmb bmb1 = bjr.e();
/* 171 */       bmb bmb2 = bmb1;
/* 172 */       blx blx = bmb2.b();
/* 173 */       bmb = bmb2.i();
/*     */       
/* 175 */       if (i == 2) {
/* 176 */         blx.b(bmb2, ☃.l, ☃);
/* 177 */         if (!a(bmb2, 3, 39, true)) {
/* 178 */           return bmb.b;
/*     */         }
/* 180 */         bjr.a(bmb2, bmb);
/* 181 */       } else if (i == 1 || i == 0) {
/* 182 */         if (!a(bmb2, 3, 39, false)) {
/* 183 */           return bmb.b;
/*     */         }
/* 185 */       } else if (blx == bmd.nf) {
/* 186 */         if (!a(bmb2, 0, 1, false)) {
/* 187 */           return bmb.b;
/*     */         }
/* 189 */       } else if (blx == bmd.mb || blx == bmd.pc || blx == bmd.dP) {
/* 190 */         if (!a(bmb2, 1, 2, false)) {
/* 191 */           return bmb.b;
/*     */         }
/* 193 */       } else if (i >= 3 && i < 30) {
/* 194 */         if (!a(bmb2, 30, 39, false)) {
/* 195 */           return bmb.b;
/*     */         }
/* 197 */       } else if (i >= 30 && i < 39 && 
/* 198 */         !a(bmb2, 3, 30, false)) {
/* 199 */         return bmb.b;
/*     */       } 
/*     */ 
/*     */       
/* 203 */       if (bmb2.a()) {
/* 204 */         bjr.d(bmb.b);
/*     */       }
/*     */       
/* 207 */       bjr.d();
/*     */       
/* 209 */       if (bmb2.E() == bmb.E()) {
/* 210 */         return bmb.b;
/*     */       }
/* 212 */       bjr.a(☃, bmb2);
/* 213 */       c();
/*     */     } 
/*     */     
/* 216 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 221 */     super.b(☃);
/*     */     
/* 223 */     this.f.b(2);
/* 224 */     this.d.a((brx1, fx1) -> a(☃, ☃.l, this.c));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */