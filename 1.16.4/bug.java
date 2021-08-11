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
/*     */ public abstract class bug
/*     */   extends buo
/*     */ {
/*  18 */   protected static final ddh a = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D);
/*  19 */   protected static final ddh b = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
/*     */   
/*     */   private final boolean c;
/*     */   
/*     */   public static boolean a(brx ☃, fx fx1) {
/*  24 */     return g(☃.d_(fx1));
/*     */   }
/*     */   
/*     */   public static boolean g(ceh ☃) {
/*  28 */     return (☃.a(aed.H) && ☃.b() instanceof bug);
/*     */   }
/*     */   
/*     */   protected bug(boolean ☃, ceg.c c1) {
/*  32 */     super(c1);
/*  33 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  37 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  42 */     cfk cfk = ☃.a(this) ? (cfk)☃.c(d()) : null;
/*  43 */     if (cfk != null && cfk.c()) {
/*  44 */       return b;
/*     */     }
/*  46 */     return a;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  52 */     return c(brz1, fx1.c());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  57 */     if (ceh1.a(☃.b())) {
/*     */       return;
/*     */     }
/*  60 */     a(☃, brx1, fx1, bool);
/*     */   }
/*     */   
/*     */   protected ceh a(ceh ☃, brx brx1, fx fx1, boolean bool) {
/*  64 */     ☃ = a(brx1, fx1, ☃, true);
/*     */     
/*  66 */     if (this.c) {
/*  67 */       ☃.a(brx1, fx1, this, fx1, bool);
/*     */     }
/*     */     
/*  70 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  75 */     if (brx1.v || !brx1.d_(fx1).a(this)) {
/*     */       return;
/*     */     }
/*     */     
/*  79 */     cfk cfk = (cfk)☃.c(d());
/*     */     
/*  81 */     if (a(fx1, brx1, cfk)) {
/*  82 */       c(☃, brx1, fx1);
/*  83 */       brx1.a(fx1, bool);
/*     */     } else {
/*  85 */       a(☃, brx1, fx1, buo1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean a(fx ☃, brx brx1, cfk cfk1) {
/*  90 */     if (!c(brx1, ☃.c())) {
/*  91 */       return true;
/*     */     }
/*  93 */     switch (null.a[cfk1.ordinal()]) {
/*     */       case 1:
/*  95 */         return !c(brx1, ☃.g());
/*     */       case 2:
/*  97 */         return !c(brx1, ☃.f());
/*     */       case 3:
/*  99 */         return !c(brx1, ☃.d());
/*     */       case 4:
/* 101 */         return !c(brx1, ☃.e());
/*     */     } 
/* 103 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ceh ☃, brx brx1, fx fx1, buo buo1) {}
/*     */ 
/*     */   
/*     */   protected ceh a(brx ☃, fx fx1, ceh ceh1, boolean bool) {
/* 111 */     if (☃.v) {
/* 112 */       return ceh1;
/*     */     }
/* 114 */     cfk cfk = (cfk)ceh1.c(d());
/* 115 */     return (new bzb(☃, fx1, ceh1)).a(☃.r(fx1), bool, cfk).c();
/*     */   }
/*     */ 
/*     */   
/*     */   public cvc f(ceh ☃) {
/* 120 */     return cvc.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 125 */     if (bool) {
/*     */       return;
/*     */     }
/*     */     
/* 129 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */     
/* 131 */     if (((cfk)☃.c(d())).c()) {
/* 132 */       brx1.b(fx1.b(), this);
/*     */     }
/*     */     
/* 135 */     if (this.c) {
/* 136 */       brx1.b(fx1, this);
/* 137 */       brx1.b(fx1.c(), this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 143 */     ceh ceh = n();
/* 144 */     gc gc = ☃.f();
/* 145 */     boolean bool = (gc == gc.f || gc == gc.e);
/* 146 */     return ceh.a(d(), bool ? cfk.b : cfk.a);
/*     */   }
/*     */   
/*     */   public abstract cfj<cfk> d();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */