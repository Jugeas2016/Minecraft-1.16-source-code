/*     */ import java.util.Arrays;
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
/*     */ public class ccl
/*     */   extends ccd
/*     */   implements ape, cdm
/*     */ {
/*  33 */   private static final int[] b = new int[] { 3 };
/*     */ 
/*     */   
/*  36 */   private static final int[] c = new int[] { 0, 1, 2, 3 };
/*     */ 
/*     */   
/*  39 */   private static final int[] g = new int[] { 0, 1, 2, 4 };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  49 */   private gj<bmb> h = gj.a(5, bmb.b);
/*     */   
/*     */   private int i;
/*     */   private boolean[] j;
/*     */   private blx k;
/*     */   private int l;
/*     */   
/*  56 */   protected final bil a = new bil(this)
/*     */     {
/*     */       public int a(int ☃) {
/*  59 */         switch (☃) {
/*     */           case 0:
/*  61 */             return ccl.a(this.a);
/*     */           case 1:
/*  63 */             return ccl.b(this.a);
/*     */         } 
/*  65 */         return 0;
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(int ☃, int i) {
/*  70 */         switch (☃) {
/*     */           case 0:
/*  72 */             ccl.a(this.a, i);
/*     */             break;
/*     */           case 1:
/*  75 */             ccl.b(this.a, i);
/*     */             break;
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       public int a() {
/*  82 */         return 2;
/*     */       }
/*     */     };
/*     */   
/*     */   public ccl() {
/*  87 */     super(cck.k);
/*     */   }
/*     */ 
/*     */   
/*     */   protected nr g() {
/*  92 */     return new of("container.brewing");
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/*  97 */     return this.h.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 102 */     for (bmb ☃ : this.h) {
/* 103 */       if (!☃.a()) {
/* 104 */         return false;
/*     */       }
/*     */     } 
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/* 112 */     bmb ☃ = this.h.get(4);
/* 113 */     if (this.l <= 0 && ☃.b() == bmd.nz) {
/* 114 */       this.l = 20;
/* 115 */       ☃.g(1);
/* 116 */       X_();
/*     */     } 
/*     */     
/* 119 */     boolean bool1 = h();
/* 120 */     boolean bool2 = (this.i > 0);
/* 121 */     bmb bmb1 = this.h.get(3);
/* 122 */     if (bool2) {
/* 123 */       this.i--;
/*     */       
/* 125 */       boolean bool = (this.i == 0);
/* 126 */       if (bool && bool1) {
/*     */         
/* 128 */         j();
/* 129 */         X_();
/* 130 */       } else if (!bool1) {
/* 131 */         this.i = 0;
/* 132 */         X_();
/* 133 */       } else if (this.k != bmb1.b()) {
/* 134 */         this.i = 0;
/* 135 */         X_();
/*     */       } 
/* 137 */     } else if (bool1 && this.l > 0) {
/* 138 */       this.l--;
/* 139 */       this.i = 400;
/* 140 */       this.k = bmb1.b();
/* 141 */       X_();
/*     */     } 
/*     */     
/* 144 */     if (!this.d.v) {
/* 145 */       boolean[] arrayOfBoolean = f();
/* 146 */       if (!Arrays.equals(arrayOfBoolean, this.j)) {
/* 147 */         this.j = arrayOfBoolean;
/* 148 */         ceh ceh = this.d.d_(o());
/* 149 */         if (!(ceh.b() instanceof bur)) {
/*     */           return;
/*     */         }
/* 152 */         for (int i = 0; i < bur.a.length; i++) {
/* 153 */           ceh = ceh.a(bur.a[i], Boolean.valueOf(arrayOfBoolean[i]));
/*     */         }
/* 155 */         this.d.a(this.e, ceh, 2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean[] f() {
/* 162 */     boolean[] ☃ = new boolean[3];
/* 163 */     for (int i = 0; i < 3; i++) {
/* 164 */       if (!((bmb)this.h.get(i)).a()) {
/* 165 */         ☃[i] = true;
/*     */       }
/*     */     } 
/* 168 */     return ☃;
/*     */   }
/*     */   
/*     */   private boolean h() {
/* 172 */     bmb ☃ = this.h.get(3);
/* 173 */     if (☃.a()) {
/* 174 */       return false;
/*     */     }
/*     */     
/* 177 */     if (!bnu.a(☃)) {
/* 178 */       return false;
/*     */     }
/*     */     
/* 181 */     for (int i = 0; i < 3; i++) {
/* 182 */       bmb bmb = this.h.get(i);
/* 183 */       if (!bmb.a())
/*     */       {
/*     */ 
/*     */         
/* 187 */         if (bnu.a(bmb, ☃))
/* 188 */           return true; 
/*     */       }
/*     */     } 
/* 191 */     return false;
/*     */   }
/*     */   
/*     */   private void j() {
/* 195 */     bmb ☃ = this.h.get(3);
/*     */     
/* 197 */     for (int i = 0; i < 3; i++) {
/* 198 */       this.h.set(i, bnu.d(☃, this.h.get(i)));
/*     */     }
/*     */     
/* 201 */     ☃.g(1);
/* 202 */     fx fx = o();
/* 203 */     if (☃.b().p()) {
/* 204 */       bmb bmb = new bmb(☃.b().o());
/* 205 */       if (☃.a()) {
/* 206 */         ☃ = bmb;
/*     */       }
/* 208 */       else if (!this.d.v) {
/* 209 */         aoq.a(this.d, fx.u(), fx.v(), fx.w(), bmb);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 214 */     this.h.set(3, ☃);
/*     */     
/* 216 */     this.d.c(1035, fx, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 221 */     super.a(☃, md1);
/*     */     
/* 223 */     this.h = gj.a(Z_(), bmb.b);
/* 224 */     aoo.b(md1, this.h);
/*     */     
/* 226 */     this.i = md1.g("BrewTime");
/* 227 */     this.l = md1.f("Fuel");
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 232 */     super.a(☃);
/*     */     
/* 234 */     ☃.a("BrewTime", (short)this.i);
/* 235 */     aoo.a(☃, this.h);
/*     */     
/* 237 */     ☃.a("Fuel", (byte)this.l);
/*     */     
/* 239 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃) {
/* 244 */     if (☃ >= 0 && ☃ < this.h.size()) {
/* 245 */       return this.h.get(☃);
/*     */     }
/* 247 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/* 252 */     return aoo.a(this.h, ☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(int ☃) {
/* 257 */     return aoo.a(this.h, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/* 262 */     if (☃ >= 0 && ☃ < this.h.size()) {
/* 263 */       this.h.set(☃, bmb1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 269 */     if (this.d.c(this.e) != this) {
/* 270 */       return false;
/*     */     }
/* 272 */     if (☃.h(this.e.u() + 0.5D, this.e.v() + 0.5D, this.e.w() + 0.5D) > 64.0D) {
/* 273 */       return false;
/*     */     }
/* 275 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, bmb bmb1) {
/* 280 */     if (☃ == 3) {
/* 281 */       return bnu.a(bmb1);
/*     */     }
/*     */     
/* 284 */     blx blx1 = bmb1.b();
/* 285 */     if (☃ == 4) {
/* 286 */       return (blx1 == bmd.nz);
/*     */     }
/*     */     
/* 289 */     return ((blx1 == bmd.nv || blx1 == bmd.qj || blx1 == bmd.qm || blx1 == bmd.nw) && a(☃).a());
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(gc ☃) {
/* 294 */     if (☃ == gc.b) {
/* 295 */       return b;
/*     */     }
/* 297 */     if (☃ == gc.a) {
/* 298 */       return c;
/*     */     }
/* 300 */     return g;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, bmb bmb1, @Nullable gc gc1) {
/* 305 */     return b(☃, bmb1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, bmb bmb1, gc gc1) {
/* 310 */     if (☃ == 3) {
/* 311 */       return (bmb1.b() == bmd.nw);
/*     */     }
/* 313 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 318 */     this.h.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   protected bic a(int ☃, bfv bfv1) {
/* 323 */     return new bih(☃, bfv1, this, this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */