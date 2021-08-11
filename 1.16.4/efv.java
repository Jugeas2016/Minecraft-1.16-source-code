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
/*     */ public class efv<T extends bhl>
/*     */   extends eeu<T>
/*     */ {
/*  19 */   private static final vk e = new vk("textures/entity/minecart.png");
/*     */   
/*  21 */   protected final duc<T> a = (duc)new duu<>();
/*     */   
/*     */   public efv(eet ☃) {
/*  24 */     super(☃);
/*  25 */     this.c = 0.7F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(T ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  30 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*     */     
/*  32 */     dfm1.a();
/*     */     
/*  34 */     long l = ☃.Y() * 493286711L;
/*  35 */     l = l * l * 4392167121L + l * 98761L;
/*     */     
/*  37 */     float f3 = (((float)(l >> 16L & 0x7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*  38 */     float f4 = (((float)(l >> 20L & 0x7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*  39 */     float f5 = (((float)(l >> 24L & 0x7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
/*     */     
/*  41 */     dfm1.a(f3, f4, f5);
/*     */     
/*  43 */     double d1 = afm.d(f2, ((bhl)☃).D, ☃.cD());
/*  44 */     double d2 = afm.d(f2, ((bhl)☃).E, ☃.cE());
/*  45 */     double d3 = afm.d(f2, ((bhl)☃).F, ☃.cH());
/*     */     
/*  47 */     double d4 = 0.30000001192092896D;
/*     */     
/*  49 */     dcn dcn = ☃.p(d1, d2, d3);
/*     */     
/*  51 */     float f6 = afm.g(f2, ((bhl)☃).s, ((bhl)☃).q);
/*     */     
/*  53 */     if (dcn != null) {
/*  54 */       dcn dcn1 = ☃.a(d1, d2, d3, 0.30000001192092896D);
/*  55 */       dcn dcn2 = ☃.a(d1, d2, d3, -0.30000001192092896D);
/*  56 */       if (dcn1 == null) {
/*  57 */         dcn1 = dcn;
/*     */       }
/*  59 */       if (dcn2 == null) {
/*  60 */         dcn2 = dcn;
/*     */       }
/*     */       
/*  63 */       dfm1.a(dcn.b - d1, (dcn1.c + dcn2.c) / 2.0D - d2, dcn.d - d3);
/*     */       
/*  65 */       dcn dcn3 = dcn2.b(-dcn1.b, -dcn1.c, -dcn1.d);
/*  66 */       if (dcn3.f() != 0.0D) {
/*  67 */         dcn3 = dcn3.d();
/*  68 */         f1 = (float)(Math.atan2(dcn3.d, dcn3.b) * 180.0D / Math.PI);
/*  69 */         f6 = (float)(Math.atan(dcn3.c) * 73.0D);
/*     */       } 
/*     */     } 
/*  72 */     dfm1.a(0.0D, 0.375D, 0.0D);
/*     */     
/*  74 */     dfm1.a(g.d.a(180.0F - f1));
/*  75 */     dfm1.a(g.f.a(-f6));
/*  76 */     float f7 = ☃.m() - f2;
/*  77 */     float f8 = ☃.k() - f2;
/*  78 */     if (f8 < 0.0F) {
/*  79 */       f8 = 0.0F;
/*     */     }
/*  81 */     if (f7 > 0.0F) {
/*  82 */       dfm1.a(g.b.a(afm.a(f7) * f7 * f8 / 10.0F * ☃.n()));
/*     */     }
/*  84 */     int j = ☃.r();
/*     */     
/*  86 */     ceh ceh = ☃.p();
/*  87 */     if (ceh.h() != bzh.a) {
/*  88 */       dfm1.a();
/*     */       
/*  90 */       float f = 0.75F;
/*     */       
/*  92 */       dfm1.a(0.75F, 0.75F, 0.75F);
/*  93 */       dfm1.a(-0.5D, ((j - 8) / 16.0F), 0.5D);
/*  94 */       dfm1.a(g.d.a(90.0F));
/*  95 */       a(☃, f2, ceh, dfm1, eag1, i);
/*     */       
/*  97 */       dfm1.b();
/*     */     } 
/*     */     
/* 100 */     dfm1.a(-1.0F, -1.0F, 1.0F);
/* 101 */     this.a.a(☃, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
/* 102 */     dfq dfq = eag1.getBuffer(this.a.a(a(☃)));
/* 103 */     this.a.a(dfm1, dfq, i, ejw.a, 1.0F, 1.0F, 1.0F, 1.0F);
/* 104 */     dfm1.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(T ☃) {
/* 109 */     return e;
/*     */   }
/*     */   
/*     */   protected void a(T ☃, float f, ceh ceh1, dfm dfm1, eag eag1, int i) {
/* 113 */     djz.C().ab().a(ceh1, dfm1, eag1, i, ejw.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */