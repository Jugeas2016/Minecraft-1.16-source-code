/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class byb
/*     */   extends buo
/*     */   implements but
/*     */ {
/*  33 */   public static final cfg a = cex.av;
/*     */   
/*     */   protected final cuv b;
/*     */   
/*     */   private final List<cux> d;
/*  38 */   public static final ddh c = buo.a(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
/*     */   
/*     */   protected byb(cuv ☃, ceg.c c1) {
/*  41 */     super(c1);
/*  42 */     this.b = ☃;
/*  43 */     this.d = Lists.newArrayList();
/*  44 */     this.d.add(☃.a(false));
/*  45 */     for (int i = 1; i < 8; i++) {
/*  46 */       this.d.add(☃.a(8 - i, false));
/*     */     }
/*  48 */     this.d.add(☃.a(8, true));
/*  49 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  55 */     if (dcs1.a(c, fx1, true) && ((Integer)☃.c(a)).intValue() == 0 && dcs1.a(brc1.b(fx1.b()), this.b)) {
/*  56 */       return c;
/*     */     }
/*  58 */     return dde.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(ceh ☃) {
/*  63 */     return ☃.m().f();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, aag aag1, fx fx1, Random random) {
/*  68 */     ☃.m().b(aag1, fx1, random);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(ceh ☃, brc brc1, fx fx1) {
/*  73 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/*  78 */     return !this.b.a(aef.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/*  83 */     int i = ((Integer)☃.c(a)).intValue();
/*  84 */     return this.d.get(Math.min(i, 8));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, ceh ceh1, gc gc1) {
/*  89 */     return ceh1.m().a().a(this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  94 */     return bzh.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<bmb> a(ceh ☃, cyv.a a1) {
/*  99 */     return Collections.emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 104 */     return dde.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 109 */     if (a(brx1, fx1, ☃)) {
/* 110 */       brx1.I().a(fx1, ☃.m().a(), this.b.a(brx1));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 116 */     if (☃.m().b() || ceh1.m().b()) {
/* 117 */       bry1.I().a(fx1, ☃.m().a(), this.b.a(bry1));
/*     */     }
/*     */     
/* 120 */     return super.a(☃, gc1, ceh1, bry1, fx1, fx2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 125 */     if (a(brx1, fx1, ☃)) {
/* 126 */       brx1.I().a(fx1, ☃.m().a(), this.b.a(brx1));
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(brx ☃, fx fx1, ceh ceh1) {
/* 131 */     if (this.b.a(aef.c)) {
/* 132 */       boolean bool = ☃.d_(fx1.c()).a(bup.cN);
/*     */       
/* 134 */       for (gc gc : gc.values()) {
/* 135 */         if (gc != gc.a) {
/*     */ 
/*     */           
/* 138 */           fx fx2 = fx1.a(gc);
/*     */           
/* 140 */           if (☃.b(fx2).a(aef.b)) {
/* 141 */             buo buo1 = ☃.b(fx1).b() ? bup.bK : bup.m;
/* 142 */             ☃.a(fx1, buo1.n());
/* 143 */             a(☃, fx1);
/* 144 */             return false;
/*     */           } 
/*     */           
/* 147 */           if (bool && ☃.d_(fx2).a(bup.kV)) {
/* 148 */             ☃.a(fx1, bup.cO.n());
/* 149 */             a(☃, fx1);
/* 150 */             return false;
/*     */           } 
/*     */         } 
/*     */       } 
/* 154 */     }  return true;
/*     */   }
/*     */   
/*     */   private void a(bry ☃, fx fx1) {
/* 158 */     ☃.c(1501, fx1, 0);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 163 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public cuw b(bry ☃, fx fx1, ceh ceh1) {
/* 168 */     if (((Integer)ceh1.c(a)).intValue() == 0) {
/* 169 */       ☃.a(fx1, bup.a.n(), 11);
/* 170 */       return this.b;
/*     */     } 
/* 172 */     return cuy.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */