/*     */ import com.google.common.collect.ImmutableMultimap;
/*     */ import com.google.common.collect.Multimap;
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
/*     */ public class bnm
/*     */   extends blx
/*     */   implements bno
/*     */ {
/*     */   private final Multimap<arg, arj> a;
/*     */   
/*     */   public bnm(blx.a ☃) {
/*  35 */     super(☃);
/*     */ 
/*     */     
/*  38 */     ImmutableMultimap.Builder<arg, arj> builder = ImmutableMultimap.builder();
/*  39 */     builder.put(arl.f, new arj(f, "Tool modifier", 8.0D, arj.a.a));
/*  40 */     builder.put(arl.h, new arj(g, "Tool modifier", -2.9000000953674316D, arj.a.a));
/*  41 */     this.a = (Multimap<arg, arj>)builder.build();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brx brx1, fx fx1, bfw bfw1) {
/*  46 */     return !bfw1.b_();
/*     */   }
/*     */ 
/*     */   
/*     */   public bnn d_(bmb ☃) {
/*  51 */     return bnn.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int e_(bmb ☃) {
/*  56 */     return 72000;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, brx brx1, aqm aqm1, int i) {
/*  61 */     if (!(aqm1 instanceof bfw)) {
/*     */       return;
/*     */     }
/*     */     
/*  65 */     bfw bfw = (bfw)aqm1;
/*     */     
/*  67 */     int j = e_(☃) - i;
/*  68 */     if (j < 10) {
/*     */       return;
/*     */     }
/*     */     
/*  72 */     int k = bpu.g(☃);
/*  73 */     if (k > 0 && !bfw.aF()) {
/*     */       return;
/*     */     }
/*     */     
/*  77 */     if (!brx1.v) {
/*  78 */       ☃.a(1, bfw, bfw1 -> bfw1.d(☃.dX()));
/*     */       
/*  80 */       if (k == 0) {
/*  81 */         bgy bgy = new bgy(brx1, bfw, ☃);
/*  82 */         bgy.a(bfw, bfw.q, bfw.p, 0.0F, 2.5F + k * 0.5F, 1.0F);
/*     */         
/*  84 */         if (bfw.bC.d) {
/*  85 */           bgy.d = bga.a.c;
/*     */         }
/*     */         
/*  88 */         brx1.c(bgy);
/*     */         
/*  90 */         brx1.a((bfw)null, bgy, adq.pj, adr.h, 1.0F, 1.0F);
/*     */         
/*  92 */         if (!bfw.bC.d) {
/*  93 */           bfw.bm.f(☃);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  98 */     bfw.b(aea.c.b(this));
/*     */     
/* 100 */     if (k > 0) {
/* 101 */       adp adp; float f1 = bfw.p;
/* 102 */       float f2 = bfw.q;
/*     */ 
/*     */       
/* 105 */       float f3 = -afm.a(f1 * 0.017453292F) * afm.b(f2 * 0.017453292F);
/* 106 */       float f4 = -afm.a(f2 * 0.017453292F);
/* 107 */       float f5 = afm.b(f1 * 0.017453292F) * afm.b(f2 * 0.017453292F);
/* 108 */       float f6 = afm.c(f3 * f3 + f4 * f4 + f5 * f5);
/* 109 */       float f7 = 3.0F * (1.0F + k) / 4.0F;
/* 110 */       f3 *= f7 / f6;
/* 111 */       f4 *= f7 / f6;
/* 112 */       f5 *= f7 / f6;
/* 113 */       bfw.i(f3, f4, f5);
/*     */       
/* 115 */       bfw.r(20);
/* 116 */       if (bfw.ao()) {
/* 117 */         float f = 1.1999999F;
/* 118 */         bfw.a(aqr.a, new dcn(0.0D, 1.1999999284744263D, 0.0D));
/*     */       } 
/*     */ 
/*     */       
/* 122 */       if (k >= 3) {
/* 123 */         adp = adq.pi;
/* 124 */       } else if (k == 2) {
/* 125 */         adp = adq.ph;
/*     */       } else {
/* 127 */         adp = adq.pg;
/*     */       } 
/* 129 */       brx1.a((bfw)null, bfw, adp, adr.h, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/* 135 */     bmb bmb = bfw1.b(aot1);
/* 136 */     if (bmb.g() >= bmb.h() - 1)
/*     */     {
/* 138 */       return aov.d(bmb);
/*     */     }
/* 140 */     if (bpu.g(bmb) > 0 && !bfw1.aF())
/*     */     {
/* 142 */       return aov.d(bmb);
/*     */     }
/* 144 */     bfw1.c(aot1);
/* 145 */     return aov.b(bmb);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, aqm aqm1, aqm aqm2) {
/* 150 */     ☃.a(1, aqm2, ☃ -> ☃.c(aqf.a));
/* 151 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, brx brx1, ceh ceh1, fx fx1, aqm aqm1) {
/* 157 */     if (ceh1.h(brx1, fx1) != 0.0D) {
/* 158 */       ☃.a(2, aqm1, ☃ -> ☃.c(aqf.a));
/*     */     }
/* 160 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Multimap<arg, arj> a(aqf ☃) {
/* 165 */     if (☃ == aqf.a) {
/* 166 */       return this.a;
/*     */     }
/* 168 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 173 */     return 1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */