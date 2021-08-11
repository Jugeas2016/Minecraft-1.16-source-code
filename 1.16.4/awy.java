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
/*     */ public class awy
/*     */   extends awj
/*     */ {
/*     */   private final buo g;
/*     */   private final aqn h;
/*     */   private int i;
/*     */   
/*     */   public awy(buo ☃, aqu aqu1, double d, int i) {
/*  32 */     super(aqu1, d, 24, i);
/*  33 */     this.g = ☃;
/*  34 */     this.h = aqu1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  39 */     if (!this.h.l.V().b(brt.b)) {
/*  40 */       return false;
/*     */     }
/*     */     
/*  43 */     if (this.c > 0) {
/*  44 */       this.c--;
/*  45 */       return false;
/*     */     } 
/*     */     
/*  48 */     if (n()) {
/*     */       
/*  50 */       this.c = 20;
/*  51 */       return true;
/*     */     } 
/*  53 */     this.c = a(this.a);
/*  54 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean n() {
/*  59 */     if (this.e != null && a(this.a.l, this.e)) {
/*  60 */       return true;
/*     */     }
/*     */     
/*  63 */     return m();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  68 */     super.d();
/*  69 */     this.h.C = 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  74 */     super.c();
/*  75 */     this.i = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bry ☃, fx fx1) {}
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1) {}
/*     */ 
/*     */   
/*     */   public void e() {
/*  86 */     super.e();
/*  87 */     brx ☃ = this.h.l;
/*  88 */     fx fx1 = this.h.cB();
/*     */     
/*  90 */     fx fx2 = a(fx1, ☃);
/*     */     
/*  92 */     Random random = this.h.cY();
/*  93 */     if (l() && fx2 != null) {
/*  94 */       if (this.i > 0) {
/*  95 */         dcn dcn = this.h.cC();
/*  96 */         this.h.n(dcn.b, 0.3D, dcn.d);
/*     */         
/*  98 */         if (!☃.v) {
/*  99 */           double d = 0.08D;
/* 100 */           ((aag)☃).a(new he(hh.I, new bmb(bmd.mg)), fx2
/*     */               
/* 102 */               .u() + 0.5D, fx2
/* 103 */               .v() + 0.7D, fx2
/* 104 */               .w() + 0.5D, 3, (random
/*     */               
/* 106 */               .nextFloat() - 0.5D) * 0.08D, (random
/* 107 */               .nextFloat() - 0.5D) * 0.08D, (random
/* 108 */               .nextFloat() - 0.5D) * 0.08D, 0.15000000596046448D);
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 114 */       if (this.i % 2 == 0) {
/* 115 */         dcn dcn = this.h.cC();
/* 116 */         this.h.n(dcn.b, -0.3D, dcn.d);
/*     */         
/* 118 */         if (this.i % 6 == 0) {
/* 119 */           a(☃, this.e);
/*     */         }
/*     */       } 
/*     */       
/* 123 */       if (this.i > 60) {
/* 124 */         ☃.a(fx2, false);
/* 125 */         if (!☃.v) {
/* 126 */           for (int i = 0; i < 20; i++) {
/* 127 */             double d1 = random.nextGaussian() * 0.02D;
/* 128 */             double d2 = random.nextGaussian() * 0.02D;
/* 129 */             double d3 = random.nextGaussian() * 0.02D;
/* 130 */             ((aag)☃).a(hh.P, fx2.u() + 0.5D, fx2.v(), fx2.w() + 0.5D, 1, d1, d2, d3, 0.15000000596046448D);
/*     */           } 
/* 132 */           a(☃, fx2);
/*     */         } 
/*     */       } 
/* 135 */       this.i++;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private fx a(fx ☃, brc brc1) {
/* 141 */     if (brc1.d_(☃).a(this.g)) {
/* 142 */       return ☃;
/*     */     }
/* 144 */     fx[] arrayOfFx = { ☃.c(), ☃.f(), ☃.g(), ☃.d(), ☃.e(), ☃.c().c() };
/* 145 */     for (fx fx1 : arrayOfFx) {
/* 146 */       if (brc1.d_(fx1).a(this.g)) {
/* 147 */         return fx1;
/*     */       }
/*     */     } 
/* 150 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(brz ☃, fx fx1) {
/* 155 */     cfw cfw = ☃.a(fx1.u() >> 4, fx1.w() >> 4, cga.m, false);
/* 156 */     if (cfw != null) {
/* 157 */       return (cfw.d_(fx1).a(this.g) && cfw.d_(fx1.b()).g() && cfw.d_(fx1.b(2)).g());
/*     */     }
/* 159 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */