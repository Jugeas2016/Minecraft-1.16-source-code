/*     */ import com.google.common.collect.ImmutableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class duh
/*     */   extends dur<bdm>
/*     */ {
/*  12 */   private static final float[] a = new float[] { 1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F };
/*  13 */   private static final float[] b = new float[] { 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F };
/*  14 */   private static final float[] f = new float[] { 0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F };
/*  15 */   private static final float[] g = new float[] { 0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F };
/*  16 */   private static final float[] h = new float[] { -8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F };
/*  17 */   private static final float[] i = new float[] { 8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F };
/*     */   
/*     */   private final dwn j;
/*     */   private final dwn k;
/*     */   private final dwn[] l;
/*     */   private final dwn[] m;
/*     */   
/*     */   public duh() {
/*  25 */     this.r = 64;
/*  26 */     this.s = 64;
/*     */     
/*  28 */     this.l = new dwn[12];
/*     */     
/*  30 */     this.j = new dwn(this);
/*  31 */     this.j.a(0, 0).a(-6.0F, 10.0F, -8.0F, 12.0F, 12.0F, 16.0F);
/*  32 */     this.j.a(0, 28).a(-8.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F);
/*  33 */     this.j.a(0, 28).a(6.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F, true);
/*  34 */     this.j.a(16, 40).a(-6.0F, 8.0F, -6.0F, 12.0F, 2.0F, 12.0F);
/*  35 */     this.j.a(16, 40).a(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F);
/*     */     
/*  37 */     for (int ☃ = 0; ☃ < this.l.length; ☃++) {
/*  38 */       this.l[☃] = new dwn(this, 0, 0);
/*  39 */       this.l[☃].a(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);
/*  40 */       this.j.b(this.l[☃]);
/*     */     } 
/*     */     
/*  43 */     this.k = new dwn(this, 8, 0);
/*  44 */     this.k.a(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F);
/*  45 */     this.j.b(this.k);
/*     */     
/*  47 */     this.m = new dwn[3];
/*  48 */     this.m[0] = new dwn(this, 40, 0);
/*  49 */     this.m[0].a(-2.0F, 14.0F, 7.0F, 4.0F, 4.0F, 8.0F);
/*  50 */     this.m[1] = new dwn(this, 0, 54);
/*  51 */     this.m[1].a(0.0F, 14.0F, 0.0F, 3.0F, 3.0F, 7.0F);
/*  52 */     this.m[2] = new dwn(this);
/*  53 */     this.m[2].a(41, 32).a(0.0F, 14.0F, 0.0F, 2.0F, 2.0F, 6.0F);
/*  54 */     this.m[2].a(25, 19).a(1.0F, 10.5F, 3.0F, 1.0F, 9.0F, 9.0F);
/*     */     
/*  56 */     this.j.b(this.m[0]);
/*  57 */     this.m[0].b(this.m[1]);
/*  58 */     this.m[1].b(this.m[2]);
/*     */     
/*  60 */     a(0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterable<dwn> a() {
/*  65 */     return (Iterable<dwn>)ImmutableList.of(this.j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bdm ☃, float f1, float f2, float f3, float f4, float f5) {
/*  70 */     float f6 = f3 - ☃.K;
/*     */     
/*  72 */     this.j.e = f4 * 0.017453292F;
/*  73 */     this.j.d = f5 * 0.017453292F;
/*     */     
/*  75 */     float f7 = (1.0F - ☃.z(f6)) * 0.55F;
/*     */     
/*  77 */     a(f3, f7);
/*     */     
/*  79 */     this.k.c = -8.25F;
/*     */     
/*  81 */     aqa aqa = djz.C().aa();
/*  82 */     if (☃.eO()) {
/*  83 */       aqa = ☃.eP();
/*     */     }
/*  85 */     if (aqa != null) {
/*  86 */       dcn dcn1 = aqa.j(0.0F);
/*  87 */       dcn dcn2 = ☃.j(0.0F);
/*  88 */       double d1 = dcn1.c - dcn2.c;
/*  89 */       if (d1 > 0.0D) {
/*  90 */         this.k.b = 0.0F;
/*     */       } else {
/*  92 */         this.k.b = 1.0F;
/*     */       } 
/*     */       
/*  95 */       dcn dcn3 = ☃.f(0.0F);
/*  96 */       dcn3 = new dcn(dcn3.b, 0.0D, dcn3.d);
/*  97 */       dcn dcn4 = (new dcn(dcn2.b - dcn1.b, 0.0D, dcn2.d - dcn1.d)).d().b(1.5707964F);
/*  98 */       double d2 = dcn3.b(dcn4);
/*  99 */       this.k.a = afm.c((float)Math.abs(d2)) * 2.0F * (float)Math.signum(d2);
/*     */     } 
/* 101 */     this.k.h = true;
/*     */     
/* 103 */     float f8 = ☃.y(f6);
/* 104 */     (this.m[0]).e = afm.a(f8) * 3.1415927F * 0.05F;
/* 105 */     (this.m[1]).e = afm.a(f8) * 3.1415927F * 0.1F;
/* 106 */     (this.m[1]).a = -1.5F;
/* 107 */     (this.m[1]).b = 0.5F;
/* 108 */     (this.m[1]).c = 14.0F;
/* 109 */     (this.m[2]).e = afm.a(f8) * 3.1415927F * 0.15F;
/* 110 */     (this.m[2]).a = 0.5F;
/* 111 */     (this.m[2]).b = 0.5F;
/* 112 */     (this.m[2]).c = 6.0F;
/*     */   }
/*     */   
/*     */   private void a(float ☃, float f1) {
/* 116 */     for (int i = 0; i < 12; i++) {
/* 117 */       (this.l[i]).d = 3.1415927F * a[i];
/* 118 */       (this.l[i]).e = 3.1415927F * b[i];
/* 119 */       (this.l[i]).f = 3.1415927F * f[i];
/* 120 */       (this.l[i]).a = g[i] * (1.0F + afm.b(☃ * 1.5F + i) * 0.01F - f1);
/* 121 */       (this.l[i]).b = 16.0F + h[i] * (1.0F + afm.b(☃ * 1.5F + i) * 0.01F - f1);
/* 122 */       (this.l[i]).c = i[i] * (1.0F + afm.b(☃ * 1.5F + i) * 0.01F - f1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */