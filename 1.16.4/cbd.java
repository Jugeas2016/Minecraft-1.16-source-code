/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
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
/*     */ public class cbd
/*     */   extends buo
/*     */ {
/*  25 */   public static final cey a = cex.w;
/*  26 */   public static final cey b = cex.a;
/*  27 */   public static final cey c = cex.d;
/*  28 */   public static final cey d = bys.a;
/*  29 */   public static final cey e = bys.b;
/*  30 */   public static final cey f = bys.c;
/*  31 */   public static final cey g = bys.d;
/*     */   
/*  33 */   private static final Map<gc, cey> j = bvt.f;
/*     */   
/*  35 */   protected static final ddh h = buo.a(0.0D, 1.0D, 0.0D, 16.0D, 2.5D, 16.0D);
/*  36 */   protected static final ddh i = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
/*     */   
/*     */   private final cbe k;
/*     */ 
/*     */   
/*     */   public cbd(cbe ☃, ceg.c c1) {
/*  42 */     super(c1);
/*  43 */     j(((ceh)this.n.b()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)).a(g, Boolean.valueOf(false)));
/*  44 */     this.k = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  49 */     return ((Boolean)☃.c(b)).booleanValue() ? h : i;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  54 */     brc brc = ☃.p();
/*  55 */     fx fx = ☃.a();
/*     */     
/*  57 */     return n()
/*  58 */       .a(d, Boolean.valueOf(a(brc.d_(fx.d()), gc.c)))
/*  59 */       .a(e, Boolean.valueOf(a(brc.d_(fx.g()), gc.f)))
/*  60 */       .a(f, Boolean.valueOf(a(brc.d_(fx.e()), gc.d)))
/*  61 */       .a(g, Boolean.valueOf(a(brc.d_(fx.f()), gc.e)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  66 */     if (gc1.n().d()) {
/*  67 */       return ☃.a(j.get(gc1), Boolean.valueOf(a(ceh1, gc1)));
/*     */     }
/*  69 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  74 */     if (ceh1.a(☃.b())) {
/*     */       return;
/*     */     }
/*  77 */     a(brx1, fx1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  82 */     if (bool || ☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*  85 */     a(brx1, fx1, ☃.a(a, Boolean.valueOf(true)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/*  90 */     if (!☃.v && !bfw1.dD().a() && bfw1.dD().b() == bmd.ng) {
/*  91 */       ☃.a(fx1, ceh1.a(c, Boolean.valueOf(true)), 4);
/*     */     }
/*  93 */     super.a(☃, fx1, ceh1, bfw1);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1) {
/*  97 */     for (gc gc : new gc[] { gc.d, gc.e }) {
/*  98 */       for (int i = 1; i < 42; i++) {
/*  99 */         fx fx2 = fx1.a(gc, i);
/* 100 */         ceh ceh2 = ☃.d_(fx2);
/*     */         
/* 102 */         if (ceh2.a(this.k)) {
/* 103 */           if (ceh2.c(cbe.a) == gc.f()) {
/* 104 */             this.k.a(☃, fx2, ceh2, false, true, i, ceh1);
/*     */           }
/*     */           break;
/*     */         } 
/* 108 */         if (!ceh2.a(this)) {
/*     */           break;
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/* 117 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/* 121 */     if (((Boolean)☃.c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 125 */     a(brx1, fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 130 */     if (!((Boolean)aag1.d_(fx1).c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 134 */     a(aag1, fx1);
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1) {
/* 138 */     ceh ceh = ☃.d_(fx1);
/* 139 */     boolean bool1 = ((Boolean)ceh.c(a)).booleanValue();
/* 140 */     boolean bool2 = false;
/*     */     
/* 142 */     List<? extends aqa> list = ☃.a((aqa)null, ceh.j(☃, fx1).a().a(fx1));
/* 143 */     if (!list.isEmpty()) {
/* 144 */       for (aqa aqa : list) {
/* 145 */         if (!aqa.bQ()) {
/* 146 */           bool2 = true;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 152 */     if (bool2 != bool1) {
/* 153 */       ceh = ceh.a(a, Boolean.valueOf(bool2));
/* 154 */       ☃.a(fx1, ceh, 3);
/* 155 */       a(☃, fx1, ceh);
/*     */     } 
/*     */     
/* 158 */     if (bool2) {
/* 159 */       ☃.J().a(new fx(fx1), this, 10);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ceh ☃, gc gc1) {
/* 164 */     buo buo1 = ☃.b();
/*     */     
/* 166 */     if (buo1 == this.k) {
/* 167 */       return (☃.c(cbe.a) == gc1.f());
/*     */     }
/*     */     
/* 170 */     return (buo1 == this);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 175 */     switch (null.a[bzm1.ordinal()]) {
/*     */       case 1:
/* 177 */         return ☃.a(d, ☃.c(f)).a(e, ☃.c(g)).a(f, ☃.c(d)).a(g, ☃.c(e));
/*     */       case 2:
/* 179 */         return ☃.a(d, ☃.c(e)).a(e, ☃.c(f)).a(f, ☃.c(g)).a(g, ☃.c(d));
/*     */       case 3:
/* 181 */         return ☃.a(d, ☃.c(g)).a(e, ☃.c(d)).a(f, ☃.c(e)).a(g, ☃.c(f));
/*     */     } 
/* 183 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 189 */     switch (null.b[byg1.ordinal()]) {
/*     */       case 1:
/* 191 */         return ☃.a(d, ☃.c(f)).a(f, ☃.c(d));
/*     */       case 2:
/* 193 */         return ☃.a(e, ☃.c(g)).a(g, ☃.c(e));
/*     */     } 
/*     */ 
/*     */     
/* 197 */     return super.a(☃, byg1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 202 */     ☃.a((cfj<?>[])new cfj[] { a, b, c, d, e, g, f });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */