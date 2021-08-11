/*     */ import java.util.Random;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class bvi
/*     */   extends bud
/*     */ {
/*  33 */   private static final Logger c = LogManager.getLogger();
/*  34 */   public static final cfb a = bvz.a;
/*  35 */   public static final cey b = cex.c;
/*     */   
/*     */   public bvi(ceg.c ☃) {
/*  38 */     super(☃);
/*  39 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/*  44 */     cco cco = new cco();
/*  45 */     cco.b((this == bup.iH));
/*  46 */     return cco;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  51 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/*  55 */     ccj ccj = brx1.c(fx1);
/*  56 */     if (!(ccj instanceof cco)) {
/*     */       return;
/*     */     }
/*     */     
/*  60 */     cco cco = (cco)ccj;
/*  61 */     boolean bool1 = brx1.r(fx1);
/*  62 */     boolean bool2 = cco.f();
/*     */     
/*  64 */     cco.a(bool1);
/*     */     
/*  66 */     if (bool2 || cco.g() || cco.m() == cco.a.a) {
/*     */       return;
/*     */     }
/*     */     
/*  70 */     if (bool1) {
/*  71 */       cco.k();
/*     */       
/*  73 */       brx1.J().a(fx1, this, 1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  79 */     ccj ccj = aag1.c(fx1);
/*  80 */     if (ccj instanceof cco) {
/*  81 */       cco cco = (cco)ccj;
/*  82 */       bqy bqy = cco.d();
/*  83 */       boolean bool1 = !aft.b(bqy.k());
/*  84 */       cco.a a = cco.m();
/*     */       
/*  86 */       boolean bool2 = cco.j();
/*  87 */       if (a == cco.a.b) {
/*  88 */         cco.k();
/*     */         
/*  90 */         if (bool2) {
/*  91 */           a(☃, aag1, fx1, bqy, bool1);
/*  92 */         } else if (cco.x()) {
/*  93 */           bqy.a(0);
/*     */         } 
/*     */         
/*  96 */         if (cco.f() || cco.g()) {
/*  97 */           aag1.j().a(fx1, this, 1);
/*     */         }
/*  99 */       } else if (a == cco.a.c) {
/* 100 */         if (bool2) {
/* 101 */           a(☃, aag1, fx1, bqy, bool1);
/* 102 */         } else if (cco.x()) {
/* 103 */           bqy.a(0);
/*     */         } 
/*     */       } 
/*     */       
/* 107 */       aag1.c(fx1, this);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(ceh ☃, brx brx1, fx fx1, bqy bqy1, boolean bool) {
/* 112 */     if (bool) {
/* 113 */       bqy1.a(brx1);
/*     */     } else {
/* 115 */       bqy1.a(0);
/*     */     } 
/*     */     
/* 118 */     a(brx1, fx1, (gc)☃.c(a));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 123 */     ccj ccj = brx1.c(fx1);
/* 124 */     if (ccj instanceof cco && bfw1.eV()) {
/* 125 */       bfw1.a((cco)ccj);
/* 126 */       return aou.a(brx1.v);
/*     */     } 
/*     */     
/* 129 */     return aou.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 134 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 139 */     ccj ccj = brx1.c(fx1);
/* 140 */     if (ccj instanceof cco) {
/* 141 */       return ((cco)ccj).d().i();
/*     */     }
/* 143 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 148 */     ccj ccj = ☃.c(fx1);
/* 149 */     if (!(ccj instanceof cco)) {
/*     */       return;
/*     */     }
/*     */     
/* 153 */     cco cco = (cco)ccj;
/* 154 */     bqy bqy = cco.d();
/*     */     
/* 156 */     if (bmb1.t()) {
/* 157 */       bqy.a(bmb1.r());
/*     */     }
/*     */     
/* 160 */     if (!☃.v) {
/* 161 */       if (bmb1.b("BlockEntityTag") == null) {
/* 162 */         bqy.a(☃.V().b(brt.n));
/* 163 */         cco.b((this == bup.iH));
/*     */       } 
/*     */       
/* 166 */       if (cco.m() == cco.a.a) {
/* 167 */         boolean bool = ☃.r(fx1);
/* 168 */         cco.a(bool);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/* 175 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 180 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 185 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 190 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 195 */     return n().a(a, ☃.d().f());
/*     */   }
/*     */   
/*     */   private static void a(brx ☃, fx fx1, gc gc1) {
/* 199 */     fx.a a = fx1.i();
/*     */     
/* 201 */     brt brt = ☃.V();
/* 202 */     int i = brt.c(brt.v);
/* 203 */     while (i-- > 0) {
/* 204 */       a.c(gc1);
/*     */       
/* 206 */       ceh ceh = ☃.d_(a);
/* 207 */       buo buo = ceh.b();
/* 208 */       if (!ceh.a(bup.iH)) {
/*     */         break;
/*     */       }
/*     */       
/* 212 */       ccj ccj = ☃.c(a);
/* 213 */       if (!(ccj instanceof cco)) {
/*     */         break;
/*     */       }
/*     */       
/* 217 */       cco cco = (cco)ccj;
/* 218 */       if (cco.m() != cco.a.a) {
/*     */         break;
/*     */       }
/*     */       
/* 222 */       if (cco.f() || cco.g()) {
/* 223 */         bqy bqy = cco.d();
/* 224 */         if (cco.k()) {
/* 225 */           if (bqy.a(☃)) {
/* 226 */             ☃.c(a, buo);
/*     */           } else {
/*     */             break;
/*     */           } 
/* 230 */         } else if (cco.x()) {
/* 231 */           bqy.a(0);
/*     */         } 
/*     */       } 
/*     */       
/* 235 */       gc1 = (gc)ceh.c(a);
/*     */     } 
/* 237 */     if (i <= 0) {
/* 238 */       int j = Math.max(brt.c(brt.v), 0);
/* 239 */       c.warn("Command Block chain tried to execute more than {} steps!", Integer.valueOf(j));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */