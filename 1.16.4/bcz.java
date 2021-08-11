/*     */ import java.time.LocalDate;
/*     */ import java.time.temporal.ChronoField;
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
/*     */ public abstract class bcz
/*     */   extends bdq
/*     */   implements bdu
/*     */ {
/*  52 */   private final aww<bcz> b = new aww<>(this, 1.0D, 20, 15.0F);
/*  53 */   private final awf c = new awf(this, this, 1.2D, false)
/*     */     {
/*     */       public void d() {
/*  56 */         super.d();
/*  57 */         this.b.s(false);
/*     */       }
/*     */ 
/*     */       
/*     */       public void c() {
/*  62 */         super.c();
/*  63 */         this.b.s(true);
/*     */       }
/*     */     };
/*     */   
/*     */   protected bcz(aqe<? extends bcz> ☃, brx brx1) {
/*  68 */     super((aqe)☃, brx1);
/*     */     
/*  70 */     eL();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  75 */     this.bk.a(2, new awz(this));
/*  76 */     this.bk.a(3, new avo(this, 1.0D));
/*  77 */     this.bk.a(3, new avd<>(this, baz.class, 6.0F, 1.0D, 1.2D));
/*  78 */     this.bk.a(5, new axk(this, 1.0D));
/*  79 */     this.bk.a(6, new awd(this, (Class)bfw.class, 8.0F));
/*  80 */     this.bk.a(6, new aws(this));
/*     */     
/*  82 */     this.bl.a(1, new axp(this, new Class[0]));
/*  83 */     this.bl.a(2, new axq<>(this, bfw.class, true));
/*  84 */     this.bl.a(3, new axq<>(this, bai.class, true));
/*  85 */     this.bl.a(3, new axq<>(this, bax.class, 10, true, false, bax.bo));
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  89 */     return bdq.eR()
/*  90 */       .a(arl.d, 0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/*  95 */     a(eK(), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   abstract adp eK();
/*     */   
/*     */   public aqq dC() {
/* 102 */     return aqq.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 107 */     boolean ☃ = eG();
/* 108 */     if (☃) {
/* 109 */       bmb bmb = b(aqf.f);
/* 110 */       if (!bmb.a()) {
/* 111 */         if (bmb.e()) {
/* 112 */           bmb.b(bmb.g() + this.J.nextInt(2));
/* 113 */           if (bmb.g() >= bmb.h()) {
/* 114 */             c(aqf.f);
/* 115 */             a(aqf.f, bmb.b);
/*     */           } 
/*     */         } 
/*     */         
/* 119 */         ☃ = false;
/*     */       } 
/*     */       
/* 122 */       if (☃) {
/* 123 */         f(8);
/*     */       }
/*     */     } 
/*     */     
/* 127 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public void ba() {
/* 132 */     super.ba();
/*     */     
/* 134 */     if (ct() instanceof aqu) {
/* 135 */       aqu ☃ = (aqu)ct();
/* 136 */       this.aA = ☃.aA;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/* 142 */     super.a(☃);
/*     */     
/* 144 */     a(aqf.a, new bmb(bmd.kc));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 150 */     arc1 = super.a(☃, aos1, aqp1, arc1, md1);
/*     */     
/* 152 */     a(aos1);
/* 153 */     b(aos1);
/* 154 */     eL();
/*     */     
/* 156 */     p((this.J.nextFloat() < 0.55F * aos1.d()));
/*     */     
/* 158 */     if (b(aqf.f).a()) {
/* 159 */       LocalDate localDate = LocalDate.now();
/* 160 */       int i = localDate.get(ChronoField.DAY_OF_MONTH);
/* 161 */       int j = localDate.get(ChronoField.MONTH_OF_YEAR);
/*     */       
/* 163 */       if (j == 10 && i == 31 && this.J.nextFloat() < 0.25F) {
/*     */         
/* 165 */         a(aqf.f, new bmb((this.J.nextFloat() < 0.1F) ? bup.cV : bup.cU));
/* 166 */         this.bn[aqf.f.b()] = 0.0F;
/*     */       } 
/*     */     } 
/* 169 */     return arc1;
/*     */   }
/*     */   
/*     */   public void eL() {
/* 173 */     if (this.l == null || this.l.v) {
/*     */       return;
/*     */     }
/*     */     
/* 177 */     this.bk.a(this.c);
/* 178 */     this.bk.a(this.b);
/*     */     
/* 180 */     bmb ☃ = b(bgn.a(this, bmd.kc));
/* 181 */     if (☃.b() == bmd.kc) {
/*     */       
/* 183 */       int i = 20;
/* 184 */       if (this.l.ad() != aor.d) {
/* 185 */         i = 40;
/*     */       }
/* 187 */       this.b.a(i);
/* 188 */       this.bk.a(4, this.b);
/*     */     } else {
/* 190 */       this.bk.a(4, this.c);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 196 */     bmb bmb = f(b(bgn.a(this, bmd.kc)));
/* 197 */     bga bga = b(bmb, f);
/*     */     
/* 199 */     double d1 = ☃.cD() - cD();
/* 200 */     double d2 = ☃.e(0.3333333333333333D) - bga.cE();
/* 201 */     double d3 = ☃.cH() - cH();
/* 202 */     double d4 = afm.a(d1 * d1 + d3 * d3);
/* 203 */     bga.c(d1, d2 + d4 * 0.20000000298023224D, d3, 1.6F, (14 - this.l.ad().a() * 4));
/* 204 */     a(adq.nD, 1.0F, 1.0F / (cY().nextFloat() * 0.4F + 0.8F));
/* 205 */     this.l.c(bga);
/*     */   }
/*     */   
/*     */   protected bga b(bmb ☃, float f) {
/* 209 */     return bgn.a(this, ☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmo ☃) {
/* 214 */     return (☃ == bmd.kc);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 219 */     super.a(☃);
/*     */     
/* 221 */     eL();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqf ☃, bmb bmb1) {
/* 226 */     super.a(☃, bmb1);
/*     */     
/* 228 */     if (!this.l.v) {
/* 229 */       eL();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 235 */     return 1.74F;
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/* 240 */     return -0.6D;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */