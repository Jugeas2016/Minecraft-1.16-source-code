/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class cvd
/*     */   extends cuv
/*     */ {
/*     */   public cuw d() {
/*  29 */     return cuy.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public cuw e() {
/*  34 */     return cuy.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public blx a() {
/*  39 */     return bmd.lL;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, cux cux1, Random random) {
/*  44 */     if (!cux1.b() && !((Boolean)cux1.c(a)).booleanValue()) {
/*  45 */       if (random.nextInt(64) == 0) {
/*  46 */         ☃.a(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, adq.qC, adr.e, random.nextFloat() * 0.25F + 0.75F, random.nextFloat() + 0.5F, false);
/*     */       }
/*  48 */     } else if (random.nextInt(10) == 0) {
/*  49 */       ☃.a(hh.Y, fx1.u() + random.nextDouble(), fx1.v() + random.nextDouble(), fx1.w() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public hf i() {
/*  56 */     return hh.m;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean f() {
/*  61 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bry ☃, fx fx1, ceh ceh1) {
/*  66 */     ccj ccj = ceh1.b().q() ? ☃.c(fx1) : null;
/*  67 */     buo.a(ceh1, ☃, fx1, ccj);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(brz ☃) {
/*  72 */     return 4;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh b(cux ☃) {
/*  77 */     return bup.A.n().a(byb.a, Integer.valueOf(e(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cuw ☃) {
/*  82 */     return (☃ == cuy.c || ☃ == cuy.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(brz ☃) {
/*  87 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(brz ☃) {
/*  92 */     return 5;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cux ☃, brc brc1, fx fx1, cuw cuw1, gc gc1) {
/*  97 */     return (gc1 == gc.a && !cuw1.a(aef.b));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float c() {
/* 102 */     return 100.0F;
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends cvd {
/*     */     public int d(cux ☃) {
/* 108 */       return 8;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c(cux ☃) {
/* 113 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends cvd {
/*     */     protected void a(cei.a<cuw, cux> ☃) {
/* 120 */       super.a(☃);
/* 121 */       ☃.a((cfj<?>[])new cfj[] { b });
/*     */     }
/*     */ 
/*     */     
/*     */     public int d(cux ☃) {
/* 126 */       return ((Integer)☃.c(b)).intValue();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c(cux ☃) {
/* 131 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */