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
/*     */ public class btx
/*     */   extends bud
/*     */ {
/*  32 */   public static final cfb a = cex.M;
/*  33 */   public static final cey b = cex.u;
/*     */   
/*     */   public btx(ceg.c ☃) {
/*  36 */     super(☃);
/*  37 */     j(((ceh)this.n.b()).a(a, gc.c).a(b, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  42 */     if (brx1.v) {
/*  43 */       return aou.a;
/*     */     }
/*     */     
/*  46 */     ccj ccj = brx1.c(fx1);
/*  47 */     if (ccj instanceof ccc) {
/*  48 */       bfw1.a((ccc)ccj);
/*  49 */       bfw1.a(aea.aq);
/*  50 */       bet.a(bfw1, true);
/*     */     } 
/*     */     
/*  53 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/*  58 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/*  61 */     ccj ccj = brx1.c(fx1);
/*  62 */     if (ccj instanceof aon) {
/*  63 */       aoq.a(brx1, fx1, (aon)ccj);
/*     */       
/*  65 */       brx1.c(fx1, this);
/*     */     } 
/*  67 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  72 */     ccj ccj = aag1.c(fx1);
/*     */     
/*  74 */     if (ccj instanceof ccc) {
/*  75 */       ((ccc)ccj).h();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ccj a(brc ☃) {
/*  82 */     return new ccc();
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  87 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {
/*  92 */     if (bmb1.t()) {
/*  93 */       ccj ccj = ☃.c(fx1);
/*  94 */       if (ccj instanceof ccc) {
/*  95 */         ((ccc)ccj).a(bmb1.r());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 102 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 107 */     return bic.a(brx1.c(fx1));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 112 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 117 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 122 */     ☃.a((cfj<?>[])new cfj[] { a, b });
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 127 */     return n().a(a, ☃.d().f());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */