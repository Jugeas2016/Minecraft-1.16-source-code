/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bml
/*     */   extends bkv
/*     */ {
/*  12 */   private static final Set<buo> a = (Set<buo>)ImmutableSet.of(bup.fD, bup.H, bup.m, bup.aO, bup.bU, bup.bT, (Object[])new buo[] { bup.aN, bup.bE, bup.F, bup.I, bup.cD, bup.bF, bup.G, bup.ar, bup.aq, bup.bJ, bup.cL, bup.gT, bup.kV, bup.ch, bup.cy, bup.at, bup.au, bup.av, bup.hH, bup.hI, bup.hG, bup.b, bup.c, bup.d, bup.e, bup.f, bup.g, bup.h, bup.hQ, bup.hR, bup.hS, bup.hU, bup.hV, bup.hW, bup.hX, bup.hY, bup.hZ, bup.ia, bup.ic, bup.if, bup.ig, bup.ie, bup.id, bup.cB, bup.cq, bup.lr, bup.ls, bup.lt, bup.lu, bup.lv, bup.lw, bup.lx, bup.ly, bup.lz, bup.lA, bup.lB, bup.lC, bup.lD, bup.iP, bup.jf, bup.jb, bup.jc, bup.iZ, bup.iX, bup.jd, bup.iT, bup.iY, bup.iV, bup.iS, bup.iR, bup.iW, bup.ja, bup.je, bup.iQ, bup.iU, bup.aW, bup.aP, bup.aX });
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
/*     */   protected bml(bnh ☃, int i, float f, blx.a a1) {
/* 100 */     super(i, f, ☃, a, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(ceh ☃) {
/* 105 */     int i = g().d();
/* 106 */     if (☃.a(bup.bK) || ☃
/* 107 */       .a(bup.ni) || ☃
/* 108 */       .a(bup.ng) || ☃
/* 109 */       .a(bup.nj) || ☃
/* 110 */       .a(bup.nh))
/*     */     {
/* 112 */       return (i >= 3);
/*     */     }
/* 114 */     if (☃.a(bup.bU) || ☃
/* 115 */       .a(bup.bT) || ☃
/* 116 */       .a(bup.ej) || ☃
/* 117 */       .a(bup.en) || ☃
/* 118 */       .a(bup.bE) || ☃
/* 119 */       .a(bup.F) || ☃
/* 120 */       .a(bup.cy))
/*     */     {
/* 122 */       return (i >= 2);
/*     */     }
/* 124 */     if (☃.a(bup.bF) || ☃
/* 125 */       .a(bup.G) || ☃
/* 126 */       .a(bup.ar) || ☃
/* 127 */       .a(bup.aq))
/*     */     {
/* 129 */       return (i >= 1);
/*     */     }
/*     */     
/* 132 */     cva cva = ☃.c();
/* 133 */     return (cva == cva.I || cva == cva.J || cva == cva.L || ☃
/*     */ 
/*     */       
/* 136 */       .a(bup.I));
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(bmb ☃, ceh ceh1) {
/* 141 */     cva cva = ceh1.c();
/* 142 */     if (cva == cva.J || cva == cva.L || cva == cva.I) {
/* 143 */       return this.b;
/*     */     }
/* 145 */     return super.a(☃, ceh1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */