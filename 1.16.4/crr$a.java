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
/*     */   private final bzm d;
/*     */   private final vk e;
/*     */   private final boolean f;
/*     */   
/*     */   public a(csw ☃, vk vk1, fx fx1, bzm bzm1, boolean bool) {
/*  79 */     super(clb.ab, 0);
/*     */     
/*  81 */     this.c = fx1;
/*  82 */     this.d = bzm1;
/*  83 */     this.e = vk1;
/*  84 */     this.f = bool;
/*  85 */     a(☃);
/*     */   }
/*     */   
/*     */   public a(csw ☃, md md1) {
/*  89 */     super(clb.ab, md1);
/*  90 */     this.e = new vk(md1.l("Template"));
/*  91 */     this.f = md1.q("isBeached");
/*  92 */     this.d = bzm.valueOf(md1.l("Rot"));
/*  93 */     a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/*  98 */     super.a(☃);
/*  99 */     ☃.a("Template", this.e.toString());
/* 100 */     ☃.a("isBeached", this.f);
/* 101 */     ☃.a("Rot", this.d.name());
/*     */   }
/*     */   
/*     */   private void a(csw ☃) {
/* 105 */     ctb ctb = ☃.a(this.e);
/* 106 */     csx csx = (new csx()).a(this.d).a(byg.a).a(crr.a()).a(cse.d);
/* 107 */     a(ctb, this.c, csx);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {
/* 112 */     if ("map_chest".equals(☃)) {
/* 113 */       cdd.a(bsk1, random, fx1.c(), cyq.H);
/* 114 */     } else if ("treasure_chest".equals(☃)) {
/* 115 */       cdd.a(bsk1, random, fx1.c(), cyq.J);
/* 116 */     } else if ("supply_chest".equals(☃)) {
/* 117 */       cdd.a(bsk1, random, fx1.c(), cyq.I);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 123 */     int i = 256;
/* 124 */     int j = 0;
/* 125 */     fx fx2 = this.a.a();
/* 126 */     chn.a a1 = this.f ? chn.a.a : chn.a.c;
/* 127 */     int k = fx2.u() * fx2.w();
/* 128 */     if (k == 0) {
/* 129 */       j = ☃.a(a1, this.c.u(), this.c.w());
/*     */     } else {
/* 131 */       fx fx3 = this.c.b(fx2.u() - 1, 0, fx2.w() - 1);
/* 132 */       for (fx fx4 : fx.a(this.c, fx3)) {
/* 133 */         int n = ☃.a(a1, fx4.u(), fx4.w());
/* 134 */         j += n;
/* 135 */         i = Math.min(i, n);
/*     */       } 
/* 137 */       j /= k;
/*     */     } 
/*     */     
/* 140 */     int m = this.f ? (i - fx2.v() / 2 - random.nextInt(3)) : j;
/* 141 */     this.c = new fx(this.c.u(), m, this.c.w());
/* 142 */     return super.a(☃, bsn1, cfy1, random, cra1, brd1, fx1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crr$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */