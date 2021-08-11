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
/*     */ public class efn
/*     */   extends eeu<bcp>
/*     */ {
/*  25 */   private static final elu a = new elu("item_frame", "map=false");
/*  26 */   private static final elu e = new elu("item_frame", "map=true");
/*     */   
/*  28 */   private final djz f = djz.C();
/*     */   private final efo g;
/*     */   
/*     */   public efn(eet ☃, efo efo1) {
/*  32 */     super(☃);
/*  33 */     this.g = efo1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bcp ☃, float f1, float f2, dfm dfm1, eag eag1, int i) {
/*  38 */     super.a(☃, f1, f2, dfm1, eag1, i);
/*  39 */     dfm1.a();
/*     */     
/*  41 */     gc gc = ☃.bZ();
/*     */     
/*  43 */     dcn dcn = a(☃, f2);
/*     */     
/*  45 */     dfm1.a(-dcn.a(), -dcn.b(), -dcn.c());
/*     */     
/*  47 */     double d = 0.46875D;
/*  48 */     dfm1.a(gc.i() * 0.46875D, gc.j() * 0.46875D, gc.k() * 0.46875D);
/*     */     
/*  50 */     dfm1.a(g.b.a(☃.q));
/*  51 */     dfm1.a(g.d.a(180.0F - ☃.p));
/*     */     
/*  53 */     boolean bool = ☃.bF();
/*  54 */     if (!bool) {
/*  55 */       eax eax = this.f.ab();
/*  56 */       elt elt = eax.a().a();
/*  57 */       elu elu1 = (☃.o().b() == bmd.nf) ? e : a;
/*     */       
/*  59 */       dfm1.a();
/*  60 */       dfm1.a(-0.5D, -0.5D, -0.5D);
/*  61 */       eax.b().a(dfm1.c(), eag1.getBuffer(ear.g()), null, elt.a(elu1), 1.0F, 1.0F, 1.0F, i, ejw.a);
/*  62 */       dfm1.b();
/*     */     } 
/*     */     
/*  65 */     bmb bmb = ☃.o();
/*  66 */     if (!bmb.a()) {
/*  67 */       boolean bool1 = (bmb.b() == bmd.nf);
/*     */       
/*  69 */       if (bool) {
/*  70 */         dfm1.a(0.0D, 0.0D, 0.5D);
/*     */       } else {
/*  72 */         dfm1.a(0.0D, 0.0D, 0.4375D);
/*     */       } 
/*     */       
/*  75 */       int j = bool1 ? (☃.p() % 4 * 2) : ☃.p();
/*  76 */       dfm1.a(g.f.a(j * 360.0F / 8.0F));
/*     */       
/*  78 */       if (bool1) {
/*  79 */         dfm1.a(g.f.a(180.0F));
/*  80 */         float f = 0.0078125F;
/*  81 */         dfm1.a(0.0078125F, 0.0078125F, 0.0078125F);
/*  82 */         dfm1.a(-64.0D, -64.0D, 0.0D);
/*     */         
/*  84 */         cxx cxx = bmh.b(bmb, ☃.l);
/*  85 */         dfm1.a(0.0D, 0.0D, -1.0D);
/*  86 */         if (cxx != null) {
/*  87 */           this.f.h.h().a(dfm1, eag1, cxx, true, i);
/*     */         }
/*     */       } else {
/*  90 */         dfm1.a(0.5F, 0.5F, 0.5F);
/*  91 */         this.g.a(bmb, ebm.b.i, i, ejw.a, dfm1, eag1);
/*     */       } 
/*     */     } 
/*     */     
/*  95 */     dfm1.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn a(bcp ☃, float f) {
/* 100 */     return new dcn((☃.bZ().i() * 0.3F), -0.25D, (☃.bZ().k() * 0.3F));
/*     */   }
/*     */ 
/*     */   
/*     */   public vk a(bcp ☃) {
/* 105 */     return ekb.d;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(bcp ☃) {
/* 110 */     if (!djz.x() || ☃.o().a() || !☃.o().t() || this.b.c != ☃) {
/* 111 */       return false;
/*     */     }
/*     */     
/* 114 */     double d = this.b.b(☃);
/* 115 */     float f = ☃.bx() ? 32.0F : 64.0F;
/*     */     
/* 117 */     return (d < (f * f));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bcp ☃, nr nr1, dfm dfm1, eag eag1, int i) {
/* 122 */     super.a(☃, ☃.o().r(), dfm1, eag1, i);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */