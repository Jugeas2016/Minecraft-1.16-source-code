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
/*     */ public class ccc
/*     */   extends cdd
/*     */ {
/*  24 */   private gj<bmb> a = gj.a(27, bmb.b);
/*     */   private int b;
/*     */   
/*     */   private ccc(cck<?> ☃) {
/*  28 */     super(☃);
/*     */   }
/*     */   
/*     */   public ccc() {
/*  32 */     this(cck.z);
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  37 */     super.a(☃);
/*  38 */     if (!c(☃)) {
/*  39 */       aoo.a(☃, this.a);
/*     */     }
/*  41 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  46 */     super.a(☃, md1);
/*     */     
/*  48 */     this.a = gj.a(Z_(), bmb.b);
/*  49 */     if (!b(md1)) {
/*  50 */       aoo.b(md1, this.a);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/*  56 */     return 27;
/*     */   }
/*     */ 
/*     */   
/*     */   protected gj<bmb> f() {
/*  61 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gj<bmb> ☃) {
/*  66 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected nr g() {
/*  71 */     return new of("container.barrel");
/*     */   }
/*     */ 
/*     */   
/*     */   protected bic a(int ☃, bfv bfv1) {
/*  76 */     return bij.a(☃, bfv1, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c_(bfw ☃) {
/*  81 */     if (!☃.a_()) {
/*  82 */       if (this.b < 0) {
/*  83 */         this.b = 0;
/*     */       }
/*  85 */       this.b++;
/*     */       
/*  87 */       ceh ceh = p();
/*  88 */       boolean bool = ((Boolean)ceh.c(btx.b)).booleanValue();
/*  89 */       if (!bool) {
/*  90 */         a(ceh, adq.aj);
/*  91 */         a(ceh, true);
/*     */       } 
/*  93 */       j();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void j() {
/*  98 */     this.d.J().a(o(), p().b(), 5);
/*     */   }
/*     */   
/*     */   public void h() {
/* 102 */     int ☃ = this.e.u();
/* 103 */     int i = this.e.v();
/* 104 */     int j = this.e.w();
/*     */     
/* 106 */     this.b = ccn.a(this.d, this, ☃, i, j);
/* 107 */     if (this.b > 0) {
/* 108 */       j();
/*     */     } else {
/* 110 */       ceh ceh = p();
/*     */       
/* 112 */       if (!ceh.a(bup.lS)) {
/* 113 */         al_();
/*     */         
/*     */         return;
/*     */       } 
/* 117 */       boolean bool = ((Boolean)ceh.c(btx.b)).booleanValue();
/* 118 */       if (bool) {
/* 119 */         a(ceh, adq.ai);
/* 120 */         a(ceh, false);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b_(bfw ☃) {
/* 127 */     if (!☃.a_()) {
/* 128 */       this.b--;
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(ceh ☃, boolean bool) {
/* 133 */     this.d.a(o(), ☃.a(btx.b, Boolean.valueOf(bool)), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(ceh ☃, adp adp1) {
/* 138 */     gr gr = ((gc)☃.c(btx.a)).p();
/* 139 */     double d1 = this.e.u() + 0.5D + gr.u() / 2.0D;
/* 140 */     double d2 = this.e.v() + 0.5D + gr.v() / 2.0D;
/* 141 */     double d3 = this.e.w() + 0.5D + gr.w() / 2.0D;
/*     */     
/* 143 */     this.d.a((bfw)null, d1, d2, d3, adp1, adr.e, 0.5F, this.d.t.nextFloat() * 0.1F + 0.9F);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */