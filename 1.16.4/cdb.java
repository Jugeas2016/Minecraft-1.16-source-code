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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cdb
/*     */   extends ccj
/*     */   implements aol, aox
/*     */ {
/*  40 */   private final aon a = new aon(this)
/*     */     {
/*     */       public int Z_() {
/*  43 */         return 1;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean c() {
/*  48 */         return cdb.a(this.a).a();
/*     */       }
/*     */ 
/*     */       
/*     */       public bmb a(int ☃) {
/*  53 */         return (☃ == 0) ? cdb.a(this.a) : bmb.b;
/*     */       }
/*     */ 
/*     */       
/*     */       public bmb a(int ☃, int i) {
/*  58 */         if (☃ == 0) {
/*  59 */           bmb bmb = cdb.a(this.a).a(i);
/*  60 */           if (cdb.a(this.a).a()) {
/*  61 */             cdb.b(this.a);
/*     */           }
/*  63 */           return bmb;
/*     */         } 
/*  65 */         return bmb.b;
/*     */       }
/*     */ 
/*     */       
/*     */       public bmb b(int ☃) {
/*  70 */         if (☃ == 0) {
/*  71 */           bmb bmb = cdb.a(this.a);
/*  72 */           cdb.a(this.a, bmb.b);
/*  73 */           cdb.b(this.a);
/*  74 */           return bmb;
/*     */         } 
/*  76 */         return bmb.b;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void a(int ☃, bmb bmb1) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public int V_() {
/*  86 */         return 1;
/*     */       }
/*     */ 
/*     */       
/*     */       public void X_() {
/*  91 */         this.a.X_();
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean a(bfw ☃) {
/*  96 */         if (this.a.d.c(this.a.e) != this.a) {
/*  97 */           return false;
/*     */         }
/*  99 */         if (☃.h(this.a.e.u() + 0.5D, this.a.e.v() + 0.5D, this.a.e.w() + 0.5D) > 64.0D) {
/* 100 */           return false;
/*     */         }
/* 102 */         return this.a.g();
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean b(int ☃, bmb bmb1) {
/* 107 */         return false;
/*     */       }
/*     */ 
/*     */       
/*     */       public void Y_() {}
/*     */     };
/*     */ 
/*     */   
/* 115 */   private final bil b = new bil(this)
/*     */     {
/*     */       public int a(int ☃) {
/* 118 */         return (☃ == 0) ? cdb.c(this.a) : 0;
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(int ☃, int i) {
/* 123 */         if (☃ == 0) {
/* 124 */           cdb.a(this.a, i);
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       public int a() {
/* 130 */         return 1;
/*     */       }
/*     */     };
/*     */   
/* 134 */   private bmb c = bmb.b;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   public cdb() {
/* 139 */     super(cck.C);
/*     */   }
/*     */   
/*     */   public bmb f() {
/* 143 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 147 */     blx ☃ = this.c.b();
/* 148 */     return (☃ == bmd.oT || ☃ == bmd.oU);
/*     */   }
/*     */   
/*     */   public void a(bmb ☃) {
/* 152 */     a(☃, (bfw)null);
/*     */   }
/*     */   
/*     */   private void k() {
/* 156 */     this.g = 0;
/* 157 */     this.h = 0;
/* 158 */     bxy.a(v(), o(), p(), false);
/*     */   }
/*     */   
/*     */   public void a(bmb ☃, @Nullable bfw bfw1) {
/* 162 */     this.c = b(☃, bfw1);
/* 163 */     this.g = 0;
/* 164 */     this.h = bns.g(this.c);
/* 165 */     X_();
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 169 */     int i = afm.a(☃, 0, this.h - 1);
/* 170 */     if (i != this.g) {
/* 171 */       this.g = i;
/* 172 */       X_();
/* 173 */       bxy.a(v(), o(), p());
/*     */     } 
/*     */   }
/*     */   
/*     */   public int h() {
/* 178 */     return this.g;
/*     */   }
/*     */   
/*     */   public int j() {
/* 182 */     float ☃ = (this.h > 1) ? (h() / (this.h - 1.0F)) : 1.0F;
/* 183 */     return afm.d(☃ * 14.0F) + (g() ? 1 : 0);
/*     */   }
/*     */   
/*     */   private bmb b(bmb ☃, @Nullable bfw bfw1) {
/* 187 */     if (this.d instanceof aag && ☃.b() == bmd.oU) {
/* 188 */       bns.a(☃, a(bfw1), bfw1);
/*     */     }
/* 190 */     return ☃;
/*     */   }
/*     */   
/*     */   private db a(@Nullable bfw ☃) {
/*     */     String str;
/*     */     nr nr;
/* 196 */     if (☃ == null) {
/* 197 */       str = "Lectern";
/* 198 */       nr = new oe("Lectern");
/*     */     } else {
/* 200 */       str = ☃.R().getString();
/* 201 */       nr = ☃.d();
/*     */     } 
/* 203 */     dcn dcn = dcn.a(this.e);
/* 204 */     return new db(da.a_, dcn, dcm.a, (aag)this.d, 2, str, nr, this.d.l(), ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t() {
/* 209 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 214 */     super.a(☃, md1);
/*     */     
/* 216 */     if (md1.c("Book", 10)) {
/* 217 */       this.c = b(bmb.a(md1.p("Book")), (bfw)null);
/*     */     } else {
/* 219 */       this.c = bmb.b;
/*     */     } 
/*     */     
/* 222 */     this.h = bns.g(this.c);
/* 223 */     this.g = afm.a(md1.h("Page"), 0, this.h - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 228 */     super.a(☃);
/*     */     
/* 230 */     if (!f().a()) {
/* 231 */       ☃.a("Book", f().b(new md()));
/* 232 */       ☃.b("Page", this.g);
/*     */     } 
/*     */     
/* 235 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 240 */     a(bmb.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public bic createMenu(int ☃, bfv bfv1, bfw bfw1) {
/* 245 */     return new bjb(☃, this.a, this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr d() {
/* 250 */     return new of("container.lectern");
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */