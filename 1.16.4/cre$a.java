/*     */ import java.util.Random;
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
/*     */ public class a
/*     */   extends crx
/*     */ {
/*     */   private final vk d;
/*     */   private final bzm e;
/*     */   
/*     */   public a(csw ☃, vk vk1, fx fx1, bzm bzm1, int i) {
/*  67 */     super(clb.I, 0);
/*  68 */     this.d = vk1;
/*  69 */     fx fx2 = (fx)cre.a().get(vk1);
/*  70 */     this.c = fx1.b(fx2.u(), fx2.v() - i, fx2.w());
/*  71 */     this.e = bzm1;
/*  72 */     a(☃);
/*     */   }
/*     */   
/*     */   public a(csw ☃, md md1) {
/*  76 */     super(clb.I, md1);
/*  77 */     this.d = new vk(md1.l("Template"));
/*  78 */     this.e = bzm.valueOf(md1.l("Rot"));
/*  79 */     a(☃);
/*     */   }
/*     */   
/*     */   private void a(csw ☃) {
/*  83 */     ctb ctb = ☃.a(this.d);
/*  84 */     csx csx = (new csx()).a(this.e).a(byg.a).a((fx)cre.b().get(this.d)).a(cse.b);
/*  85 */     a(ctb, this.c, csx);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  90 */     super.a(☃);
/*  91 */     ☃.a("Template", this.d.toString());
/*  92 */     ☃.a("Rot", this.e.name());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {
/*  97 */     if (!"chest".equals(☃)) {
/*     */       return;
/*     */     }
/*     */     
/* 101 */     bsk1.a(fx1, bup.a.n(), 3);
/* 102 */     ccj ccj = bsk1.c(fx1.c());
/* 103 */     if (ccj instanceof ccn) {
/* 104 */       ((ccn)ccj).a(cyq.C, random.nextLong());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 110 */     csx csx = (new csx()).a(this.e).a(byg.a).a((fx)cre.b().get(this.d)).a(cse.b);
/*     */     
/* 112 */     fx fx2 = (fx)cre.a().get(this.d);
/* 113 */     fx fx3 = this.c.a(ctb.a(csx, new fx(3 - fx2.u(), 0, 0 - fx2.w())));
/* 114 */     int i = ☃.a(chn.a.a, fx3.u(), fx3.w());
/* 115 */     fx fx4 = this.c;
/* 116 */     this.c = this.c.b(0, i - 90 - 1, 0);
/*     */     
/* 118 */     boolean bool = super.a(☃, bsn1, cfy1, random, cra1, brd1, fx1);
/*     */     
/* 120 */     if (this.d.equals(cre.c())) {
/* 121 */       fx fx5 = this.c.a(ctb.a(csx, new fx(3, 0, 5)));
/* 122 */       ceh ceh = ☃.d_(fx5.c());
/* 123 */       if (!ceh.g() && !ceh.a(bup.cg)) {
/* 124 */         ☃.a(fx5, bup.cE.n(), 3);
/*     */       }
/*     */     } 
/*     */     
/* 128 */     this.c = fx4;
/* 129 */     return bool;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cre$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */