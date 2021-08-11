/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.BitSet;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import org.apache.commons.lang3.mutable.MutableBoolean;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cif
/*     */   extends cia
/*     */ {
/*     */   public cif(Codec<cmk> ☃) {
/*  21 */     super(☃, 256);
/*  22 */     this.j = (Set<buo>)ImmutableSet.of(bup.b, bup.c, bup.e, bup.g, bup.j, bup.k, (Object[])new buo[] { bup.l, bup.i, bup.gR, bup.fF, bup.fG, bup.fH, bup.fI, bup.fJ, bup.fK, bup.fL, bup.fM, bup.fN, bup.fO, bup.fP, bup.fQ, bup.fR, bup.fS, bup.fT, bup.fU, bup.at, bup.hG, bup.dT, bup.cC, bup.C, bup.E, bup.A, bup.B, bup.bK, bup.a, bup.lb, bup.gT });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(cfw ☃, int i, int j, int k, int m, int n, int i1, int i2, int i3) {
/*  65 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(cfw ☃, Function<fx, bsv> function, BitSet bitSet, Random random, fx.a a1, fx.a a2, fx.a a3, int i, int j, int k, int m, int n, int i1, int i2, int i3, MutableBoolean mutableBoolean) {
/*  70 */     return a(this, ☃, bitSet, random, a1, i, j, k, m, n, i1, i2, i3);
/*     */   }
/*     */   
/*     */   protected static boolean a(cig<?> ☃, cfw cfw1, BitSet bitSet, Random random, fx.a a1, int i, int j, int k, int m, int n, int i1, int i2, int i3) {
/*  74 */     if (i2 >= i) {
/*  75 */       return false;
/*     */     }
/*     */     
/*  78 */     int i4 = i1 | i3 << 4 | i2 << 8;
/*  79 */     if (bitSet.get(i4)) {
/*  80 */       return false;
/*     */     }
/*  82 */     bitSet.set(i4);
/*     */     
/*  84 */     a1.d(m, i2, n);
/*     */     
/*  86 */     ceh ceh = cfw1.d_(a1);
/*  87 */     if (!☃.a(ceh)) {
/*  88 */       return false;
/*     */     }
/*     */     
/*  91 */     if (i2 == 10) {
/*  92 */       float f = random.nextFloat();
/*  93 */       if (f < 0.25D) {
/*  94 */         cfw1.a(a1, bup.iJ.n(), false);
/*  95 */         cfw1.n().a(a1, bup.iJ, 0);
/*     */       } else {
/*  97 */         cfw1.a(a1, bup.bK.n(), false);
/*     */       } 
/*  99 */       return true;
/*     */     } 
/*     */     
/* 102 */     if (i2 < 10) {
/* 103 */       cfw1.a(a1, bup.B.n(), false);
/* 104 */       return false;
/*     */     } 
/*     */     
/* 107 */     boolean bool = false;
/* 108 */     for (gc gc : gc.c.a) {
/* 109 */       int i5 = m + gc.i();
/* 110 */       int i6 = n + gc.k();
/* 111 */       if (i5 >> 4 != j || i6 >> 4 != k || cfw1.d_(a1.d(i5, i2, i6)).g()) {
/* 112 */         cfw1.a(a1, h.g(), false);
/* 113 */         cfw1.o().a(a1, h.a(), 0);
/* 114 */         bool = true;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 119 */     a1.d(m, i2, n);
/* 120 */     if (!bool) {
/* 121 */       cfw1.a(a1, h.g(), false);
/* 122 */       return true;
/*     */     } 
/*     */     
/* 125 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cif.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */