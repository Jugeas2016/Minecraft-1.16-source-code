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
/*     */ public class bzw
/*     */   extends buo
/*     */   implements bzu
/*     */ {
/*  27 */   public static final cfe<cfm> a = cex.aK;
/*  28 */   public static final cey b = cex.C;
/*     */   
/*  30 */   protected static final ddh c = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
/*  31 */   protected static final ddh d = buo.a(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*     */   
/*     */   public bzw(ceg.c ☃) {
/*  34 */     super(☃);
/*     */     
/*  36 */     j(n().a(a, cfm.b).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c_(ceh ☃) {
/*  41 */     return (☃.c(a) != cfm.c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/*  46 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  51 */     cfm cfm = (cfm)☃.c(a);
/*  52 */     switch (null.a[cfm.ordinal()]) {
/*     */       case 1:
/*  54 */         return dde.b();
/*     */       case 2:
/*  56 */         return d;
/*     */     } 
/*  58 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  65 */     fx fx = ☃.a();
/*  66 */     ceh ceh1 = ☃.p().d_(fx);
/*  67 */     if (ceh1.a(this)) {
/*  68 */       return ceh1.a(a, cfm.c).a(b, Boolean.valueOf(false));
/*     */     }
/*     */     
/*  71 */     cux cux = ☃.p().b(fx);
/*  72 */     ceh ceh2 = n().a(a, cfm.b).a(b, Boolean.valueOf((cux.a() == cuy.c)));
/*     */     
/*  74 */     gc gc = ☃.j();
/*  75 */     if (gc == gc.a || (gc != gc.b && (☃.k()).c - fx.v() > 0.5D)) {
/*  76 */       return ceh2.a(a, cfm.a);
/*     */     }
/*  78 */     return ceh2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, bny bny1) {
/*  83 */     bmb bmb = bny1.m();
/*     */     
/*  85 */     cfm cfm = (cfm)☃.c(a);
/*  86 */     if (cfm == cfm.c || bmb.b() != h()) {
/*  87 */       return false;
/*     */     }
/*     */     
/*  90 */     if (bny1.c()) {
/*  91 */       boolean bool = ((bny1.k()).c - bny1.a().v() > 0.5D);
/*  92 */       gc gc = bny1.j();
/*  93 */       if (cfm == cfm.b) {
/*  94 */         return (gc == gc.b || (bool && gc.n().d()));
/*     */       }
/*  96 */       return (gc == gc.a || (!bool && gc.n().d()));
/*     */     } 
/*     */     
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 104 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 105 */       return cuy.c.a(false);
/*     */     }
/* 107 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bry ☃, fx fx1, ceh ceh1, cux cux1) {
/* 112 */     if (ceh1.c(a) != cfm.c) {
/* 113 */       return super.a(☃, fx1, ceh1, cux1);
/*     */     }
/* 115 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brc ☃, fx fx1, ceh ceh1, cuw cuw1) {
/* 120 */     if (ceh1.c(a) != cfm.c) {
/* 121 */       return super.a(☃, fx1, ceh1, cuw1);
/*     */     }
/* 123 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 128 */     if (((Boolean)☃.c(b)).booleanValue()) {
/* 129 */       bry1.I().a(fx1, cuy.c, cuy.c.a(bry1));
/*     */     }
/* 131 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 136 */     switch (null.b[cxe1.ordinal()]) {
/*     */       case 1:
/* 138 */         return false;
/*     */       case 2:
/* 140 */         return brc1.b(fx1).a(aef.b);
/*     */       case 3:
/* 142 */         return false;
/*     */     } 
/* 144 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */