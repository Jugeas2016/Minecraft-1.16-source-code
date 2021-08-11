/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bmj
/*     */   extends blx
/*     */ {
/*  20 */   private static final gw a = new gv() {
/*  21 */       private final gv b = new gv();
/*     */       
/*     */       public bmb a(fy ☃, bmb bmb1) {
/*     */         double d4;
/*  25 */         gc gc = (gc)☃.e().c(bwa.a);
/*  26 */         brx brx = ☃.h();
/*     */ 
/*     */ 
/*     */         
/*  30 */         double d1 = ☃.a() + gc.i() * 1.125D;
/*  31 */         double d2 = Math.floor(☃.b()) + gc.j();
/*  32 */         double d3 = ☃.c() + gc.k() * 1.125D;
/*     */         
/*  34 */         fx fx = ☃.d().a(gc);
/*  35 */         ceh ceh = brx.d_(fx);
/*  36 */         cfk cfk = (ceh.b() instanceof bug) ? (cfk)ceh.c(((bug)ceh.b()).d()) : cfk.a;
/*     */ 
/*     */         
/*  39 */         if (ceh.a(aed.H)) {
/*  40 */           if (cfk.c()) {
/*  41 */             d4 = 0.6D;
/*     */           } else {
/*  43 */             d4 = 0.1D;
/*     */           } 
/*  45 */         } else if (ceh.g() && brx.d_(fx.c()).a(aed.H)) {
/*  46 */           ceh ceh1 = brx.d_(fx.c());
/*  47 */           cfk cfk1 = (ceh1.b() instanceof bug) ? (cfk)ceh1.c(((bug)ceh1.b()).d()) : cfk.a;
/*  48 */           if (gc == gc.a || !cfk1.c()) {
/*  49 */             d4 = -0.9D;
/*     */           } else {
/*  51 */             d4 = -0.4D;
/*     */           } 
/*     */         } else {
/*  54 */           return this.b.dispense(☃, bmb1);
/*     */         } 
/*     */         
/*  57 */         bhl bhl = bhl.a(brx, d1, d2 + d4, d3, bmj.a((bmj)bmb1.b()));
/*  58 */         if (bmb1.t()) {
/*  59 */           bhl.a(bmb1.r());
/*     */         }
/*  61 */         brx.c(bhl);
/*     */         
/*  63 */         bmb1.g(1);
/*  64 */         return bmb1;
/*     */       }
/*     */ 
/*     */       
/*     */       protected void a(fy ☃) {
/*  69 */         ☃.h().c(1000, ☃.d(), 0);
/*     */       }
/*     */     };
/*     */   
/*     */   private final bhl.a b;
/*     */   
/*     */   public bmj(bhl.a ☃, blx.a a1) {
/*  76 */     super(a1);
/*  77 */     this.b = ☃;
/*  78 */     bwa.a(this, a);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(boa ☃) {
/*  83 */     brx brx = ☃.p();
/*  84 */     fx fx = ☃.a();
/*     */     
/*  86 */     ceh ceh = brx.d_(fx);
/*  87 */     if (!ceh.a(aed.H)) {
/*  88 */       return aou.d;
/*     */     }
/*     */     
/*  91 */     bmb bmb = ☃.m();
/*  92 */     if (!brx.v) {
/*  93 */       cfk cfk = (ceh.b() instanceof bug) ? (cfk)ceh.c(((bug)ceh.b()).d()) : cfk.a;
/*  94 */       double d = 0.0D;
/*  95 */       if (cfk.c()) {
/*  96 */         d = 0.5D;
/*     */       }
/*  98 */       bhl bhl = bhl.a(brx, fx.u() + 0.5D, fx.v() + 0.0625D + d, fx.w() + 0.5D, this.b);
/*  99 */       if (bmb.t()) {
/* 100 */         bhl.a(bmb.r());
/*     */       }
/* 102 */       brx.c(bhl);
/*     */     } 
/* 104 */     bmb.g(1);
/* 105 */     return aou.a(brx.v);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bmj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */