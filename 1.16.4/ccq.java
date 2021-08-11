/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
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
/*     */ public class ccq
/*     */   extends ccj
/*     */   implements cdm
/*     */ {
/*  39 */   private static final buo[] b = new buo[] { bup.gq, bup.gr, bup.gz, bup.gs };
/*     */   
/*     */   public int a;
/*     */   
/*     */   private float c;
/*     */   private boolean g;
/*     */   private boolean h;
/*  46 */   private final List<fx> i = Lists.newArrayList();
/*     */   
/*     */   @Nullable
/*     */   private aqm j;
/*     */   @Nullable
/*     */   private UUID k;
/*     */   private long l;
/*     */   
/*     */   public ccq() {
/*  55 */     this(cck.y);
/*     */   }
/*     */   
/*     */   public ccq(cck<?> ☃) {
/*  59 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  64 */     super.a(☃, md1);
/*     */     
/*  66 */     if (md1.b("Target")) {
/*  67 */       this.k = md1.a("Target");
/*     */     } else {
/*  69 */       this.k = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  75 */     super.a(☃);
/*     */     
/*  77 */     if (this.j != null) {
/*  78 */       ☃.a("Target", this.j.bS());
/*     */     }
/*     */     
/*  81 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/*  87 */     return new ow(this.e, 5, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/*  92 */     return a(new md());
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  97 */     this.a++;
/*     */     
/*  99 */     long ☃ = this.d.T();
/* 100 */     if (☃ % 40L == 0L) {
/* 101 */       a(h());
/* 102 */       if (!this.d.v && d()) {
/* 103 */         j();
/* 104 */         k();
/*     */       } 
/*     */     } 
/*     */     
/* 108 */     if (☃ % 80L == 0L && d()) {
/* 109 */       a(adq.bZ);
/*     */     }
/*     */     
/* 112 */     if (☃ > this.l && d()) {
/* 113 */       this.l = ☃ + 60L + this.d.u_().nextInt(40);
/* 114 */       a(adq.ca);
/*     */     } 
/*     */     
/* 117 */     if (this.d.v) {
/* 118 */       l();
/* 119 */       y();
/* 120 */       if (d()) {
/* 121 */         this.c++;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean h() {
/* 127 */     this.i.clear();
/*     */     
/*     */     int ☃;
/* 130 */     for (☃ = -1; ☃ <= 1; ☃++) {
/* 131 */       for (int i = -1; i <= 1; i++) {
/* 132 */         for (int j = -1; j <= 1; j++) {
/* 133 */           fx fx = this.e.b(☃, i, j);
/* 134 */           if (!this.d.A(fx)) {
/* 135 */             return false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 142 */     for (☃ = -2; ☃ <= 2; ☃++) {
/* 143 */       for (int i = -2; i <= 2; i++) {
/* 144 */         for (int j = -2; j <= 2; j++) {
/* 145 */           int k = Math.abs(☃);
/* 146 */           int m = Math.abs(i);
/* 147 */           int n = Math.abs(j);
/* 148 */           if (k > 1 || m > 1 || n > 1)
/*     */           {
/*     */             
/* 151 */             if ((☃ == 0 && (m == 2 || n == 2)) || (i == 0 && (k == 2 || n == 2)) || (j == 0 && (k == 2 || m == 2))) {
/* 152 */               fx fx = this.e.b(☃, i, j);
/* 153 */               ceh ceh = this.d.d_(fx);
/* 154 */               for (buo buo1 : b) {
/* 155 */                 if (ceh.a(buo1)) {
/* 156 */                   this.i.add(fx);
/*     */                 }
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 164 */     b((this.i.size() >= 42));
/*     */     
/* 166 */     return (this.i.size() >= 16);
/*     */   }
/*     */   
/*     */   private void j() {
/* 170 */     int ☃ = this.i.size();
/* 171 */     int i = ☃ / 7 * 16;
/*     */ 
/*     */     
/* 174 */     int j = this.e.u();
/* 175 */     int k = this.e.v();
/* 176 */     int m = this.e.w();
/* 177 */     dci dci = (new dci(j, k, m, (j + 1), (k + 1), (m + 1))).g(i).b(0.0D, this.d.L(), 0.0D);
/* 178 */     List<bfw> list = this.d.a(bfw.class, dci);
/*     */     
/* 180 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 184 */     for (bfw bfw : list) {
/* 185 */       if (this.e.a(bfw.cB(), i) && bfw.aF()) {
/* 186 */         bfw.c(new apu(apw.C, 260, 0, true, true));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void k() {
/* 192 */     aqm ☃ = this.j;
/* 193 */     int i = this.i.size();
/* 194 */     if (i < 42) {
/* 195 */       this.j = null;
/* 196 */     } else if (this.j == null && this.k != null) {
/*     */       
/* 198 */       this.j = x();
/* 199 */       this.k = null;
/* 200 */     } else if (this.j == null) {
/* 201 */       List<aqm> list = this.d.a(aqm.class, m(), ☃ -> (☃ instanceof bdi && ☃.aF()));
/* 202 */       if (!list.isEmpty()) {
/* 203 */         this.j = list.get(this.d.t.nextInt(list.size()));
/*     */       }
/* 205 */     } else if (!this.j.aX() || !this.e.a(this.j.cB(), 8.0D)) {
/* 206 */       this.j = null;
/*     */     } 
/*     */     
/* 209 */     if (this.j != null) {
/* 210 */       this.d.a((bfw)null, this.j.cD(), this.j.cE(), this.j.cH(), adq.cb, adr.e, 1.0F, 1.0F);
/* 211 */       this.j.a(apk.o, 4.0F);
/*     */     } 
/*     */     
/* 214 */     if (☃ != this.j) {
/* 215 */       ceh ceh = p();
/* 216 */       this.d.a(this.e, ceh, ceh, 2);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void l() {
/* 221 */     if (this.k == null) {
/* 222 */       this.j = null;
/* 223 */     } else if (this.j == null || !this.j.bS().equals(this.k)) {
/* 224 */       this.j = x();
/* 225 */       if (this.j == null) {
/* 226 */         this.k = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private dci m() {
/* 232 */     int ☃ = this.e.u();
/* 233 */     int i = this.e.v();
/* 234 */     int j = this.e.w();
/* 235 */     return (new dci(☃, i, j, (☃ + 1), (i + 1), (j + 1))).g(8.0D);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private aqm x() {
/* 240 */     List<aqm> ☃ = this.d.a(aqm.class, m(), ☃ -> ☃.bS().equals(this.k));
/* 241 */     if (☃.size() == 1) {
/* 242 */       return ☃.get(0);
/*     */     }
/* 244 */     return null;
/*     */   }
/*     */   
/*     */   private void y() {
/* 248 */     Random ☃ = this.d.t;
/*     */     
/* 250 */     double d = (afm.a((this.a + 35) * 0.1F) / 2.0F + 0.5F);
/* 251 */     d = (d * d + d) * 0.30000001192092896D;
/*     */     
/* 253 */     dcn dcn = new dcn(this.e.u() + 0.5D, this.e.v() + 1.5D + d, this.e.w() + 0.5D);
/* 254 */     for (fx fx1 : this.i) {
/* 255 */       if (☃.nextInt(50) != 0) {
/*     */         continue;
/*     */       }
/*     */       
/* 259 */       float f1 = -0.5F + ☃.nextFloat();
/* 260 */       float f2 = -2.0F + ☃.nextFloat();
/* 261 */       float f3 = -0.5F + ☃.nextFloat();
/* 262 */       fx fx2 = fx1.b(this.e);
/* 263 */       dcn dcn1 = (new dcn(f1, f2, f3)).b(fx2.u(), fx2.v(), fx2.w());
/* 264 */       this.d.a(hh.ae, dcn.b, dcn.c, dcn.d, dcn1.b, dcn1.c, dcn1.d);
/*     */     } 
/*     */     
/* 267 */     if (this.j != null) {
/* 268 */       dcn dcn1 = new dcn(this.j.cD(), this.j.cG(), this.j.cH());
/* 269 */       float f1 = (-0.5F + ☃.nextFloat()) * (3.0F + this.j.cy());
/* 270 */       float f2 = -1.0F + ☃.nextFloat() * this.j.cz();
/* 271 */       float f3 = (-0.5F + ☃.nextFloat()) * (3.0F + this.j.cy());
/* 272 */       dcn dcn2 = new dcn(f1, f2, f3);
/* 273 */       this.d.a(hh.ae, dcn1.b, dcn1.c, dcn1.d, dcn2.b, dcn2.c, dcn2.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 278 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 282 */     return this.h;
/*     */   }
/*     */   
/*     */   private void a(boolean ☃) {
/* 286 */     if (☃ != this.g) {
/* 287 */       a(☃ ? adq.bY : adq.cc);
/*     */     }
/*     */     
/* 290 */     this.g = ☃;
/*     */   }
/*     */   
/*     */   private void b(boolean ☃) {
/* 294 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 298 */     return (this.c + ☃) * -0.0375F;
/*     */   }
/*     */   
/*     */   public void a(adp ☃) {
/* 302 */     this.d.a((bfw)null, this.e, ☃, adr.e, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */