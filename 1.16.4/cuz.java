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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class cuz
/*     */   extends cuv
/*     */ {
/*     */   public cuw d() {
/*  34 */     return cuy.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public cuw e() {
/*  39 */     return cuy.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public blx a() {
/*  44 */     return bmd.lM;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, cux cux1, Random random) {
/*  49 */     fx fx2 = fx1.b();
/*  50 */     if (☃.d_(fx2).g() && !☃.d_(fx2).i(☃, fx2)) {
/*  51 */       if (random.nextInt(100) == 0) {
/*  52 */         double d1 = fx1.u() + random.nextDouble();
/*     */         
/*  54 */         double d2 = fx1.v() + 1.0D;
/*  55 */         double d3 = fx1.w() + random.nextDouble();
/*  56 */         ☃.a(hh.M, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  57 */         ☃.a(d1, d2, d3, adq.gY, adr.e, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
/*     */       } 
/*  59 */       if (random.nextInt(200) == 0) {
/*  60 */         ☃.a(fx1.u(), fx1.v(), fx1.w(), adq.gW, adr.e, 0.2F + random.nextFloat() * 0.2F, 0.9F + random.nextFloat() * 0.15F, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(brx ☃, fx fx1, cux cux1, Random random) {
/*  67 */     if (!☃.V().b(brt.a)) {
/*     */       return;
/*     */     }
/*     */     
/*  71 */     int i = random.nextInt(3);
/*  72 */     if (i > 0) {
/*  73 */       fx fx2 = fx1;
/*     */       
/*  75 */       for (int j = 0; j < i; j++) {
/*  76 */         fx2 = fx2.b(random.nextInt(3) - 1, 1, random.nextInt(3) - 1);
/*  77 */         if (!☃.p(fx2)) {
/*     */           return;
/*     */         }
/*  80 */         ceh ceh = ☃.d_(fx2);
/*  81 */         if (ceh.g()) {
/*  82 */           if (a(☃, fx2)) {
/*  83 */             ☃.a(fx2, bue.a(☃, fx2));
/*     */             return;
/*     */           } 
/*  86 */         } else if (ceh.c().c()) {
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } else {
/*  91 */       for (int j = 0; j < 3; j++) {
/*  92 */         fx fx2 = fx1.b(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
/*  93 */         if (!☃.p(fx2)) {
/*     */           return;
/*     */         }
/*  96 */         if (☃.w(fx2.b()) && b(☃, fx2)) {
/*  97 */           ☃.a(fx2.b(), bue.a(☃, fx2));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(brz ☃, fx fx1) {
/* 104 */     for (gc gc : gc.values()) {
/* 105 */       if (b(☃, fx1.a(gc))) {
/* 106 */         return true;
/*     */       }
/*     */     } 
/* 109 */     return false;
/*     */   }
/*     */   
/*     */   private boolean b(brz ☃, fx fx1) {
/* 113 */     if (fx1.v() >= 0 && fx1.v() < 256 && !☃.C(fx1)) {
/* 114 */       return false;
/*     */     }
/* 116 */     return ☃.d_(fx1).c().d();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public hf i() {
/* 122 */     return hh.j;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bry ☃, fx fx1, ceh ceh1) {
/* 127 */     a(☃, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(brz ☃) {
/* 132 */     return ☃.k().d() ? 4 : 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh b(cux ☃) {
/* 137 */     return bup.B.n().a(byb.a, Integer.valueOf(e(☃)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cuw ☃) {
/* 142 */     return (☃ == cuy.e || ☃ == cuy.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(brz ☃) {
/* 147 */     return ☃.k().d() ? 1 : 2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cux ☃, brc brc1, fx fx1, cuw cuw1, gc gc1) {
/* 152 */     return (☃.a(brc1, fx1) >= 0.44444445F && cuw1.a(aef.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(brz ☃) {
/* 157 */     return ☃.k().d() ? 10 : 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(brx ☃, fx fx1, cux cux1, cux cux2) {
/* 162 */     int i = a(☃);
/*     */     
/* 164 */     if (!cux1.c() && !cux2.c() && !((Boolean)cux1.c(a)).booleanValue() && !((Boolean)cux2.c(a)).booleanValue() && cux2.a(☃, fx1) > cux1.a(☃, fx1) && ☃.u_().nextInt(4) != 0) {
/* 165 */       i *= 4;
/*     */     }
/* 167 */     return i;
/*     */   }
/*     */   
/*     */   private void a(bry ☃, fx fx1) {
/* 171 */     ☃.c(1501, fx1, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean f() {
/* 176 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bry ☃, fx fx1, ceh ceh1, gc gc1, cux cux1) {
/* 181 */     if (gc1 == gc.a) {
/* 182 */       cux cux2 = ☃.b(fx1);
/* 183 */       if (a(aef.c) && cux2.a(aef.b)) {
/* 184 */         if (ceh1.b() instanceof byb) {
/* 185 */           ☃.a(fx1, bup.b.n(), 3);
/*     */         }
/* 187 */         a(☃, fx1);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 192 */     super.a(☃, fx1, ceh1, gc1, cux1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean j() {
/* 197 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float c() {
/* 202 */     return 100.0F;
/*     */   }
/*     */   
/*     */   public static class b
/*     */     extends cuz {
/*     */     public int d(cux ☃) {
/* 208 */       return 8;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c(cux ☃) {
/* 213 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a
/*     */     extends cuz {
/*     */     protected void a(cei.a<cuw, cux> ☃) {
/* 220 */       super.a(☃);
/* 221 */       ☃.a((cfj<?>[])new cfj[] { b });
/*     */     }
/*     */ 
/*     */     
/*     */     public int d(cux ☃) {
/* 226 */       return ((Integer)☃.c(b)).intValue();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean c(cux ☃) {
/* 231 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cuz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */