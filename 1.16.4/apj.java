/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
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
/*     */ public class apj
/*     */ {
/*  24 */   private final List<aph> a = Lists.newArrayList();
/*     */   private final aqm b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private boolean f;
/*     */   private boolean g;
/*     */   private String h;
/*     */   
/*     */   public apj(aqm ☃) {
/*  34 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a() {
/*  38 */     k();
/*     */     
/*  40 */     Optional<fx> ☃ = this.b.dr();
/*  41 */     if (☃.isPresent()) {
/*  42 */       ceh ceh = this.b.l.d_(☃.get());
/*     */       
/*  44 */       if (ceh.a(bup.cg) || ceh.a(aed.J)) {
/*  45 */         this.h = "ladder";
/*  46 */       } else if (ceh.a(bup.dP)) {
/*  47 */         this.h = "vines";
/*  48 */       } else if (ceh.a(bup.mx) || ceh.a(bup.my)) {
/*  49 */         this.h = "weeping_vines";
/*  50 */       } else if (ceh.a(bup.mz) || ceh.a(bup.mA)) {
/*  51 */         this.h = "twisting_vines";
/*  52 */       } else if (ceh.a(bup.lQ)) {
/*  53 */         this.h = "scaffolding";
/*     */       } else {
/*  55 */         this.h = "other_climbable";
/*     */       } 
/*  57 */     } else if (this.b.aE()) {
/*  58 */       this.h = "water";
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(apk ☃, float f1, float f2) {
/*  63 */     g();
/*  64 */     a();
/*     */     
/*  66 */     aph aph = new aph(☃, this.b.K, f1, f2, this.h, this.b.C);
/*     */     
/*  68 */     this.a.add(aph);
/*  69 */     this.c = this.b.K;
/*  70 */     this.g = true;
/*     */     
/*  72 */     if (aph.f() && !this.f && this.b.aX()) {
/*  73 */       this.f = true;
/*  74 */       this.d = this.b.K;
/*  75 */       this.e = this.d;
/*  76 */       this.b.g();
/*     */     } 
/*     */   }
/*     */   public nr b() {
/*     */     nr nr1;
/*  81 */     if (this.a.isEmpty()) {
/*  82 */       return new of("death.attack.generic", new Object[] { this.b.d() });
/*     */     }
/*     */     
/*  85 */     aph ☃ = j();
/*  86 */     aph aph1 = this.a.get(this.a.size() - 1);
/*     */     
/*  88 */     nr nr2 = aph1.h();
/*  89 */     aqa aqa = aph1.a().k();
/*     */     
/*  91 */     if (☃ != null && aph1.a() == apk.k) {
/*  92 */       nr nr = ☃.h();
/*     */       
/*  94 */       if (☃.a() == apk.k || ☃.a() == apk.m) {
/*  95 */         nr1 = new of("death.fell.accident." + a(☃), new Object[] { this.b.d() });
/*  96 */       } else if (nr != null && (nr2 == null || !nr.equals(nr2))) {
/*  97 */         aqa aqa1 = ☃.a().k();
/*  98 */         bmb bmb = (aqa1 instanceof aqm) ? ((aqm)aqa1).dD() : bmb.b;
/*     */         
/* 100 */         if (!bmb.a() && bmb.t()) {
/* 101 */           nr1 = new of("death.fell.assist.item", new Object[] { this.b.d(), nr, bmb.C() });
/*     */         } else {
/* 103 */           nr1 = new of("death.fell.assist", new Object[] { this.b.d(), nr });
/*     */         } 
/* 105 */       } else if (nr2 != null) {
/* 106 */         bmb bmb = (aqa instanceof aqm) ? ((aqm)aqa).dD() : bmb.b;
/* 107 */         if (!bmb.a() && bmb.t()) {
/* 108 */           nr1 = new of("death.fell.finish.item", new Object[] { this.b.d(), nr2, bmb.C() });
/*     */         } else {
/* 110 */           nr1 = new of("death.fell.finish", new Object[] { this.b.d(), nr2 });
/*     */         } 
/*     */       } else {
/* 113 */         nr1 = new of("death.fell.killer", new Object[] { this.b.d() });
/*     */       } 
/*     */     } else {
/* 116 */       nr1 = aph1.a().a(this.b);
/*     */     } 
/*     */     
/* 119 */     return nr1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqm c() {
/* 124 */     aqm ☃ = null;
/* 125 */     bfw bfw = null;
/* 126 */     float f1 = 0.0F;
/* 127 */     float f2 = 0.0F;
/*     */     
/* 129 */     for (aph aph : this.a) {
/* 130 */       if (aph.a().k() instanceof bfw && (bfw == null || aph.c() > f2)) {
/* 131 */         f2 = aph.c();
/* 132 */         bfw = (bfw)aph.a().k();
/*     */       } 
/*     */       
/* 135 */       if (aph.a().k() instanceof aqm && (☃ == null || aph.c() > f1)) {
/* 136 */         f1 = aph.c();
/* 137 */         ☃ = (aqm)aph.a().k();
/*     */       } 
/*     */     } 
/*     */     
/* 141 */     if (bfw != null && f2 >= f1 / 3.0F) {
/* 142 */       return bfw;
/*     */     }
/* 144 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private aph j() {
/* 150 */     aph ☃ = null;
/* 151 */     aph aph1 = null;
/* 152 */     float f1 = 0.0F;
/* 153 */     float f2 = 0.0F;
/*     */     
/* 155 */     for (int i = 0; i < this.a.size(); i++) {
/* 156 */       aph aph2 = this.a.get(i);
/* 157 */       aph aph3 = (i > 0) ? this.a.get(i - 1) : null;
/*     */       
/* 159 */       if ((aph2.a() == apk.k || aph2.a() == apk.m) && aph2.j() > 0.0F && (☃ == null || aph2.j() > f2)) {
/* 160 */         if (i > 0) {
/* 161 */           ☃ = aph3;
/*     */         } else {
/* 163 */           ☃ = aph2;
/*     */         } 
/* 165 */         f2 = aph2.j();
/*     */       } 
/*     */       
/* 168 */       if (aph2.g() != null && (aph1 == null || aph2.c() > f1)) {
/* 169 */         aph1 = aph2;
/* 170 */         f1 = aph2.c();
/*     */       } 
/*     */     } 
/*     */     
/* 174 */     if (f2 > 5.0F && ☃ != null)
/* 175 */       return ☃; 
/* 176 */     if (f1 > 5.0F && aph1 != null) {
/* 177 */       return aph1;
/*     */     }
/* 179 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private String a(aph ☃) {
/* 184 */     return (☃.g() == null) ? "generic" : ☃.g();
/*     */   }
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
/*     */   public int f() {
/* 198 */     if (this.f) {
/* 199 */       return this.b.K - this.d;
/*     */     }
/* 201 */     return this.e - this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   private void k() {
/* 206 */     this.h = null;
/*     */   }
/*     */   
/*     */   public void g() {
/* 210 */     int ☃ = this.f ? 300 : 100;
/*     */     
/* 212 */     if (this.g && (!this.b.aX() || this.b.K - this.c > ☃)) {
/* 213 */       boolean bool = this.f;
/* 214 */       this.g = false;
/* 215 */       this.f = false;
/* 216 */       this.e = this.b.K;
/*     */       
/* 218 */       if (bool) {
/* 219 */         this.b.h();
/*     */       }
/* 221 */       this.a.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   public aqm h() {
/* 226 */     return this.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */