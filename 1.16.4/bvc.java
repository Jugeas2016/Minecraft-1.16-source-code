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
/*     */ public class bvc
/*     */   extends buo
/*     */ {
/*  39 */   public static final cfg a = cex.ar;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  48 */   private static final ddh c = a(2.0D, 4.0D, 2.0D, 14.0D, 16.0D, 14.0D);
/*     */   
/*  50 */   protected static final ddh b = dde.a(
/*  51 */       dde.b(), 
/*  52 */       dde.a(
/*  53 */         a(0.0D, 0.0D, 4.0D, 16.0D, 3.0D, 12.0D), new ddh[] {
/*  54 */           a(4.0D, 0.0D, 0.0D, 12.0D, 3.0D, 16.0D), 
/*  55 */           a(2.0D, 0.0D, 2.0D, 14.0D, 3.0D, 14.0D), c
/*     */         }), dcr.e);
/*     */ 
/*     */ 
/*     */   
/*     */   public bvc(ceg.c ☃) {
/*  61 */     super(☃);
/*  62 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  67 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh a_(ceh ☃, brc brc1, fx fx1) {
/*  72 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/*  77 */     int i = ((Integer)☃.c(a)).intValue();
/*  78 */     float f = fx1.v() + (6.0F + (3 * i)) / 16.0F;
/*     */     
/*  80 */     if (!brx1.v && aqa1.bq() && i > 0 && aqa1.cE() <= f) {
/*  81 */       aqa1.am();
/*     */       
/*  83 */       a(brx1, fx1, ☃, i - 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  89 */     bmb bmb = bfw1.b(aot1);
/*  90 */     if (bmb.a()) {
/*  91 */       return aou.c;
/*     */     }
/*     */     
/*  94 */     int i = ((Integer)☃.c(a)).intValue();
/*  95 */     blx blx = bmb.b();
/*  96 */     if (blx == bmd.lL) {
/*  97 */       if (i < 3 && !brx1.v) {
/*  98 */         if (!bfw1.bC.d) {
/*  99 */           bfw1.a(aot1, new bmb(bmd.lK));
/*     */         }
/* 101 */         bfw1.a(aea.U);
/*     */         
/* 103 */         a(brx1, fx1, ☃, 3);
/* 104 */         brx1.a((bfw)null, fx1, adq.bj, adr.e, 1.0F, 1.0F);
/*     */       } 
/* 106 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/* 109 */     if (blx == bmd.lK) {
/* 110 */       if (i == 3 && !brx1.v) {
/* 111 */         if (!bfw1.bC.d) {
/* 112 */           bmb.g(1);
/* 113 */           if (bmb.a()) {
/* 114 */             bfw1.a(aot1, new bmb(bmd.lL));
/* 115 */           } else if (!bfw1.bm.e(new bmb(bmd.lL))) {
/* 116 */             bfw1.a(new bmb(bmd.lL), false);
/*     */           } 
/*     */         } 
/* 119 */         bfw1.a(aea.V);
/*     */         
/* 121 */         a(brx1, fx1, ☃, 0);
/* 122 */         brx1.a((bfw)null, fx1, adq.bm, adr.e, 1.0F, 1.0F);
/*     */       } 
/* 124 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/* 127 */     if (blx == bmd.nw) {
/* 128 */       if (i > 0 && !brx1.v) {
/* 129 */         if (!bfw1.bC.d) {
/* 130 */           bmb bmb1 = bnv.a(new bmb(bmd.nv), bnw.b);
/* 131 */           bfw1.a(aea.V);
/*     */           
/* 133 */           bmb.g(1);
/* 134 */           if (bmb.a()) {
/* 135 */             bfw1.a(aot1, bmb1);
/* 136 */           } else if (!bfw1.bm.e(bmb1)) {
/* 137 */             bfw1.a(bmb1, false);
/* 138 */           } else if (bfw1 instanceof aah) {
/* 139 */             ((aah)bfw1).a(bfw1.bo);
/*     */           } 
/*     */         } 
/*     */         
/* 143 */         brx1.a((bfw)null, fx1, adq.bb, adr.e, 1.0F, 1.0F);
/* 144 */         a(brx1, fx1, ☃, i - 1);
/*     */       } 
/*     */       
/* 147 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/* 150 */     if (blx == bmd.nv && bnv.d(bmb) == bnw.b) {
/* 151 */       if (i < 3 && !brx1.v) {
/* 152 */         if (!bfw1.bC.d) {
/* 153 */           bmb bmb1 = new bmb(bmd.nw);
/* 154 */           bfw1.a(aea.V);
/*     */           
/* 156 */           bfw1.a(aot1, bmb1);
/*     */           
/* 158 */           if (bfw1 instanceof aah) {
/* 159 */             ((aah)bfw1).a(bfw1.bo);
/*     */           }
/*     */         } 
/*     */         
/* 163 */         brx1.a((bfw)null, fx1, adq.ba, adr.e, 1.0F, 1.0F);
/* 164 */         a(brx1, fx1, ☃, i + 1);
/*     */       } 
/*     */       
/* 167 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/* 170 */     if (i > 0 && blx instanceof blb) {
/* 171 */       blb blb = (blb)blx;
/*     */       
/* 173 */       if (blb.a(bmb) && !brx1.v) {
/* 174 */         blb.c(bmb);
/* 175 */         a(brx1, fx1, ☃, i - 1);
/* 176 */         bfw1.a(aea.W);
/* 177 */         return aou.a;
/*     */       } 
/*     */     } 
/*     */     
/* 181 */     if (i > 0 && blx instanceof bke) {
/* 182 */       if (cca.b(bmb) > 0 && !brx1.v) {
/* 183 */         bmb bmb1 = bmb.i();
/* 184 */         bmb1.e(1);
/* 185 */         cca.c(bmb1);
/* 186 */         bfw1.a(aea.X);
/*     */ 
/*     */         
/* 189 */         if (!bfw1.bC.d) {
/* 190 */           bmb.g(1);
/* 191 */           a(brx1, fx1, ☃, i - 1);
/*     */         } 
/* 193 */         if (bmb.a()) {
/* 194 */           bfw1.a(aot1, bmb1);
/* 195 */         } else if (!bfw1.bm.e(bmb1)) {
/* 196 */           bfw1.a(bmb1, false);
/* 197 */         } else if (bfw1 instanceof aah) {
/* 198 */           ((aah)bfw1).a(bfw1.bo);
/*     */         } 
/*     */       } 
/* 201 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/* 204 */     if (i > 0 && blx instanceof bkh) {
/* 205 */       buo buo1 = ((bkh)blx).e();
/* 206 */       if (buo1 instanceof bzs && !brx1.s_()) {
/* 207 */         bmb bmb1 = new bmb(bup.iP, 1);
/* 208 */         if (bmb.n()) {
/* 209 */           bmb1.c(bmb.o().g());
/*     */         }
/* 211 */         bfw1.a(aot1, bmb1);
/* 212 */         a(brx1, fx1, ☃, i - 1);
/* 213 */         bfw1.a(aea.Y);
/* 214 */         return aou.a;
/*     */       } 
/* 216 */       return aou.b;
/*     */     } 
/*     */     
/* 219 */     return aou.c;
/*     */   }
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, int i) {
/* 223 */     ☃.a(fx1, ceh1.a(a, Integer.valueOf(afm.a(i, 0, 3))), 2);
/* 224 */     ☃.c(fx1, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c(brx ☃, fx fx1) {
/* 229 */     if (☃.t.nextInt(20) != 1) {
/*     */       return;
/*     */     }
/*     */     
/* 233 */     float f = ☃.v(fx1).a(fx1);
/* 234 */     if (f < 0.15F) {
/*     */       return;
/*     */     }
/*     */     
/* 238 */     ceh ceh = ☃.d_(fx1);
/* 239 */     if (((Integer)ceh.c(a)).intValue() < 3) {
/* 240 */       ☃.a(fx1, ceh.a(a), 2);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 246 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 251 */     return ((Integer)☃.c(a)).intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 256 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 261 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */