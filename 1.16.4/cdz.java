/*     */ import java.util.Collections;
/*     */ import java.util.List;
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
/*     */ 
/*     */ public class cdz
/*     */   extends bud
/*     */ {
/*  35 */   public static final cfb a = ceb.a;
/*  36 */   public static final cfe<cfi> b = ceb.b;
/*     */   
/*     */   public cdz(ceg.c ☃) {
/*  39 */     super(☃);
/*  40 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, cfi.a));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj a(brc ☃) {
/*  46 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static ccj a(ceh ☃, gc gc1, boolean bool1, boolean bool2) {
/*  51 */     return new ced(☃, gc1, bool1, bool2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  56 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*  59 */     ccj ccj = brx1.c(fx1);
/*  60 */     if (ccj instanceof ced) {
/*  61 */       ((ced)ccj).l();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bry ☃, fx fx1, ceh ceh1) {
/*  68 */     fx fx2 = fx1.a(((gc)ceh1.c(a)).f());
/*  69 */     ceh ceh2 = ☃.d_(fx2);
/*  70 */     if (ceh2.b() instanceof cea && ((Boolean)ceh2.c(cea.b)).booleanValue()) {
/*  71 */       ☃.a(fx2, false);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  78 */     if (!brx1.v && brx1.c(fx1) == null) {
/*     */       
/*  80 */       brx1.a(fx1, false);
/*  81 */       return aou.b;
/*     */     } 
/*  83 */     return aou.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<bmb> a(ceh ☃, cyv.a a1) {
/*  89 */     ced ced = a(a1.a(), new fx(a1.<dcn>a(dbc.f)));
/*  90 */     if (ced == null) {
/*  91 */       return Collections.emptyList();
/*     */     }
/*     */     
/*  94 */     return ced.k().a(a1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 100 */     return dde.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 105 */     ced ced = a(brc1, fx1);
/* 106 */     if (ced != null) {
/* 107 */       return ced.a(brc1, fx1);
/*     */     }
/* 109 */     return dde.a();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ced a(brc ☃, fx fx1) {
/* 114 */     ccj ccj = ☃.c(fx1);
/* 115 */     if (ccj instanceof ced) {
/* 116 */       return (ced)ccj;
/*     */     }
/* 118 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 123 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 128 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 133 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 138 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 143 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */