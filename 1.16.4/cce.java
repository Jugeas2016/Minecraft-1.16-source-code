/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class cce
/*     */   extends ccj
/*     */   implements aox, cdm
/*     */ {
/*  46 */   public static final aps[][] a = new aps[][] { { apw.a, apw.c }, { apw.k, apw.h }, { apw.e }, { apw.j } };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   private static final Set<aps> b = (Set<aps>)Arrays.<aps[]>stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  60 */   private List<a> c = Lists.newArrayList();
/*  61 */   private List<a> g = Lists.newArrayList();
/*     */   
/*     */   private int h;
/*  64 */   private int i = -1;
/*     */   
/*     */   @Nullable
/*     */   private aps j;
/*     */   
/*     */   @Nullable
/*     */   private aps k;
/*     */   
/*     */   @Nullable
/*     */   private nr l;
/*  74 */   private aow m = aow.a;
/*     */   
/*  76 */   private final bil n = new bil(this)
/*     */     {
/*     */       public int a(int ☃) {
/*  79 */         switch (☃) {
/*     */           case 0:
/*  81 */             return cce.a(this.a);
/*     */           case 1:
/*  83 */             return aps.a(cce.b(this.a));
/*     */           case 2:
/*  85 */             return aps.a(cce.c(this.a));
/*     */         } 
/*  87 */         return 0;
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(int ☃, int i) {
/*  92 */         switch (☃) {
/*     */           case 0:
/*  94 */             cce.a(this.a, i);
/*     */             break;
/*     */           case 1:
/*  97 */             if (!this.a.d.v && !cce.d(this.a).isEmpty()) {
/*  98 */               this.a.a(adq.ax);
/*     */             }
/* 100 */             cce.a(this.a, cce.a(i));
/*     */             break;
/*     */           case 2:
/* 103 */             cce.b(this.a, cce.a(i));
/*     */             break;
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       public int a() {
/* 110 */         return 3;
/*     */       }
/*     */     };
/*     */   
/*     */   public cce() {
/* 115 */     super(cck.n);
/*     */   }
/*     */   
/*     */   public void aj_() {
/*     */     fx fx;
/* 120 */     int ☃ = this.e.u();
/* 121 */     int i = this.e.v();
/* 122 */     int j = this.e.w();
/*     */ 
/*     */     
/* 125 */     if (this.i < i) {
/* 126 */       fx = this.e;
/* 127 */       this.g = Lists.newArrayList();
/* 128 */       this.i = fx.v() - 1;
/*     */     } else {
/* 130 */       fx = new fx(☃, this.i + 1, j);
/*     */     } 
/*     */     
/* 133 */     a a = this.g.isEmpty() ? null : this.g.get(this.g.size() - 1);
/*     */     
/* 135 */     int k = this.d.a(chn.a.b, ☃, j);
/*     */     
/*     */     int m;
/* 138 */     for (m = 0; m < 10 && 
/* 139 */       fx.v() <= k; m++) {
/*     */ 
/*     */       
/* 142 */       ceh ceh = this.d.d_(fx);
/* 143 */       buo buo = ceh.b();
/* 144 */       if (buo instanceof buh) {
/* 145 */         float[] arrayOfFloat = ((buh)buo).a().e();
/*     */         
/* 147 */         if (this.g.size() <= 1) {
/* 148 */           a = new a(arrayOfFloat);
/* 149 */           this.g.add(a);
/* 150 */         } else if (a != null) {
/*     */           
/* 152 */           if (Arrays.equals(arrayOfFloat, a.a(a))) {
/* 153 */             a.a();
/*     */           
/*     */           }
/*     */           else {
/*     */             
/* 158 */             a = new a(new float[] { (a.a(a)[0] + arrayOfFloat[0]) / 2.0F, (a.a(a)[1] + arrayOfFloat[1]) / 2.0F, (a.a(a)[2] + arrayOfFloat[2]) / 2.0F });
/*     */             
/* 160 */             this.g.add(a);
/*     */           } 
/*     */         } 
/* 163 */       } else if (a != null && (ceh.b(this.d, fx) < 15 || buo == bup.z)) {
/* 164 */         a.a();
/*     */       } else {
/* 166 */         this.g.clear();
/* 167 */         this.i = k;
/*     */         break;
/*     */       } 
/* 170 */       fx = fx.b();
/* 171 */       this.i++;
/*     */     } 
/*     */     
/* 174 */     m = this.h;
/*     */     
/* 176 */     if (this.d.T() % 80L == 0L) {
/* 177 */       if (!this.c.isEmpty()) {
/* 178 */         a(☃, i, j);
/*     */       }
/*     */       
/* 181 */       if (this.h > 0 && !this.c.isEmpty()) {
/* 182 */         j();
/*     */         
/* 184 */         a(adq.av);
/*     */       } 
/*     */     } 
/*     */     
/* 188 */     if (this.i >= k) {
/* 189 */       this.i = -1;
/* 190 */       boolean bool = (m > 0);
/*     */       
/* 192 */       this.c = this.g;
/*     */       
/* 194 */       if (!this.d.v) {
/* 195 */         boolean bool1 = (this.h > 0);
/*     */         
/* 197 */         if (!bool && bool1) {
/* 198 */           a(adq.au);
/*     */           
/* 200 */           for (aah aah : this.d.<aah>a(aah.class, (new dci(☃, i, j, ☃, (i - 4), j)).c(10.0D, 5.0D, 10.0D))) {
/* 201 */             ac.l.a(aah, this);
/*     */           }
/* 203 */         } else if (bool && !bool1) {
/* 204 */           a(adq.aw);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j) {
/* 211 */     this.h = 0;
/* 212 */     for (int k = 1; k <= 4; ) {
/* 213 */       int m = i - k;
/* 214 */       if (m < 0) {
/*     */         break;
/*     */       }
/*     */       
/* 218 */       boolean bool = true;
/* 219 */       for (int n = ☃ - k; n <= ☃ + k && bool; n++) {
/* 220 */         for (int i1 = j - k; i1 <= j + k; i1++) {
/* 221 */           if (!this.d.d_(new fx(n, m, i1)).a(aed.aq)) {
/* 222 */             bool = false;
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/* 228 */       if (bool) {
/* 229 */         this.h = k;
/*     */         k++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void al_() {
/* 238 */     a(adq.aw);
/* 239 */     super.al_();
/*     */   }
/*     */   
/*     */   private void j() {
/* 243 */     if (this.d.v || this.j == null) {
/*     */       return;
/*     */     }
/*     */     
/* 247 */     double ☃ = (this.h * 10 + 10);
/* 248 */     int i = 0;
/* 249 */     if (this.h >= 4 && this.j == this.k) {
/* 250 */       i = 1;
/*     */     }
/* 252 */     int j = (9 + this.h * 2) * 20;
/*     */     
/* 254 */     dci dci = (new dci(this.e)).g(☃).b(0.0D, this.d.L(), 0.0D);
/* 255 */     List<bfw> list = this.d.a(bfw.class, dci);
/* 256 */     for (bfw bfw : list) {
/* 257 */       bfw.c(new apu(this.j, j, i, true, true));
/*     */     }
/*     */     
/* 260 */     if (this.h >= 4 && this.j != this.k && this.k != null) {
/* 261 */       for (bfw bfw : list) {
/* 262 */         bfw.c(new apu(this.k, j, 0, true, true));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(adp ☃) {
/* 268 */     this.d.a((bfw)null, this.e, ☃, adr.e, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public List<a> f() {
/* 272 */     return (this.h == 0) ? (List<a>)ImmutableList.of() : this.c;
/*     */   }
/*     */   
/*     */   public int h() {
/* 276 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/* 282 */     return new ow(this.e, 3, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/* 287 */     return a(new md());
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/* 292 */     return 256.0D;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static aps b(int ☃) {
/* 297 */     aps aps1 = aps.a(☃);
/*     */     
/* 299 */     return b.contains(aps1) ? aps1 : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 304 */     super.a(☃, md1);
/*     */     
/* 306 */     this.j = b(md1.h("Primary"));
/* 307 */     this.k = b(md1.h("Secondary"));
/*     */     
/* 309 */     if (md1.c("CustomName", 8)) {
/* 310 */       this.l = nr.a.a(md1.l("CustomName"));
/*     */     }
/*     */     
/* 313 */     this.m = aow.b(md1);
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 318 */     super.a(☃);
/*     */     
/* 320 */     ☃.b("Primary", aps.a(this.j));
/* 321 */     ☃.b("Secondary", aps.a(this.k));
/* 322 */     ☃.b("Levels", this.h);
/*     */     
/* 324 */     if (this.l != null) {
/* 325 */       ☃.a("CustomName", nr.a.a(this.l));
/*     */     }
/*     */     
/* 328 */     this.m.a(☃);
/*     */     
/* 330 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(@Nullable nr ☃) {
/* 334 */     this.l = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bic createMenu(int ☃, bfv bfv1, bfw bfw1) {
/* 340 */     if (ccd.a(bfw1, this.m, d())) {
/* 341 */       return new bif(☃, bfv1, this.n, bim.a(this.d, o()));
/*     */     }
/* 343 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr d() {
/* 348 */     return (this.l != null) ? this.l : new of("container.beacon");
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final float[] a;
/*     */     private int b;
/*     */     
/*     */     public a(float[] ☃) {
/* 356 */       this.a = ☃;
/* 357 */       this.b = 1;
/*     */     }
/*     */     
/*     */     protected void a() {
/* 361 */       this.b++;
/*     */     }
/*     */     
/*     */     public float[] b() {
/* 365 */       return this.a;
/*     */     }
/*     */     
/*     */     public int c() {
/* 369 */       return this.b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */