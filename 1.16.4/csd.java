/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class csd
/*     */   extends csy
/*     */ {
/*     */   public static final Codec<csd> a;
/*     */   private final float b;
/*     */   
/*     */   static {
/*  18 */     a = Codec.FLOAT.fieldOf("mossiness").xmap(csd::new, ☃ -> Float.valueOf(☃.b)).codec();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public csd(float ☃) {
/*  26 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ctb.c a(brz ☃, fx fx1, fx fx2, ctb.c c1, ctb.c c2, csx csx1) {
/*  32 */     Random random = csx1.b(c2.a);
/*     */     
/*  34 */     ceh ceh1 = c2.b;
/*  35 */     fx fx3 = c2.a;
/*  36 */     ceh ceh2 = null;
/*  37 */     if (ceh1.a(bup.du) || ceh1.a(bup.b) || ceh1.a(bup.dx)) {
/*  38 */       ceh2 = a(random);
/*  39 */     } else if (ceh1.a(aed.D)) {
/*  40 */       ceh2 = a(random, c2.b);
/*  41 */     } else if (ceh1.a(aed.E)) {
/*  42 */       ceh2 = b(random);
/*  43 */     } else if (ceh1.a(aed.F)) {
/*  44 */       ceh2 = c(random);
/*  45 */     } else if (ceh1.a(bup.bK)) {
/*  46 */       ceh2 = d(random);
/*     */     } 
/*  48 */     if (ceh2 != null) {
/*  49 */       return new ctb.c(fx3, ceh2, c2.c);
/*     */     }
/*  51 */     return c2;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ceh a(Random ☃) {
/*  56 */     if (☃.nextFloat() >= 0.5F) {
/*  57 */       return null;
/*     */     }
/*     */ 
/*     */     
/*  61 */     ceh[] arrayOfCeh1 = { bup.dw.n(), a(☃, bup.dS) };
/*     */ 
/*     */ 
/*     */     
/*  65 */     ceh[] arrayOfCeh2 = { bup.dv.n(), a(☃, bup.lf) };
/*     */ 
/*     */     
/*  68 */     return a(☃, arrayOfCeh1, arrayOfCeh2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ceh a(Random ☃, ceh ceh1) {
/*  73 */     gc gc = (gc)ceh1.c(cak.a);
/*  74 */     cff cff = (cff)ceh1.c(cak.b);
/*     */     
/*  76 */     if (☃.nextFloat() >= 0.5F) {
/*  77 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  82 */     ceh[] arrayOfCeh1 = { bup.hQ.n(), bup.hX.n() };
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     ceh[] arrayOfCeh2 = { bup.lf.n().a(cak.a, gc).a(cak.b, cff), bup.lt.n() };
/*     */ 
/*     */     
/*  90 */     return a(☃, arrayOfCeh1, arrayOfCeh2);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ceh b(Random ☃) {
/*  95 */     if (☃.nextFloat() < this.b) {
/*  96 */       return bup.lt.n();
/*     */     }
/*  98 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ceh c(Random ☃) {
/* 103 */     if (☃.nextFloat() < this.b) {
/* 104 */       return bup.lH.n();
/*     */     }
/* 106 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ceh d(Random ☃) {
/* 111 */     if (☃.nextFloat() < 0.15F) {
/* 112 */       return bup.ni.n();
/*     */     }
/* 114 */     return null;
/*     */   }
/*     */   
/*     */   private static ceh a(Random ☃, buo buo1) {
/* 118 */     return buo1.n()
/* 119 */       .a(cak.a, gc.c.a.a(☃))
/* 120 */       .a(cak.b, cff.values()[☃.nextInt((cff.values()).length)]);
/*     */   }
/*     */   
/*     */   private ceh a(Random ☃, ceh[] arrayOfCeh1, ceh[] arrayOfCeh2) {
/* 124 */     if (☃.nextFloat() < this.b) {
/* 125 */       return a(☃, arrayOfCeh2);
/*     */     }
/* 127 */     return a(☃, arrayOfCeh1);
/*     */   }
/*     */ 
/*     */   
/*     */   private static ceh a(Random ☃, ceh[] arrayOfCeh) {
/* 132 */     return arrayOfCeh[☃.nextInt(arrayOfCeh.length)];
/*     */   }
/*     */ 
/*     */   
/*     */   protected cta<?> a() {
/* 137 */     return cta.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */