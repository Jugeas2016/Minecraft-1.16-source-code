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
/*     */ public class caq
/*     */   extends bud
/*     */ {
/*  25 */   public static final cfe<cfo> a = cex.aM;
/*     */   
/*     */   protected caq(ceg.c ☃) {
/*  28 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/*  33 */     return new cdj();
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  38 */     ccj ccj = brx1.c(fx1);
/*  39 */     if (ccj instanceof cdj) {
/*  40 */       return ((cdj)ccj).a(bfw1) ? aou.a(brx1.v) : aou.c;
/*     */     }
/*     */     
/*  43 */     return aou.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {
/*  48 */     if (☃.v) {
/*     */       return;
/*     */     }
/*  51 */     if (aqm1 != null) {
/*  52 */       ccj ccj = ☃.c(fx1);
/*  53 */       if (ccj instanceof cdj) {
/*  54 */         ((cdj)ccj).a(aqm1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  61 */     return bzh.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  66 */     return n().a(a, cfo.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/*  71 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/*  76 */     if (!(brx1 instanceof aag)) {
/*     */       return;
/*     */     }
/*     */     
/*  80 */     ccj ccj = brx1.c(fx1);
/*  81 */     if (!(ccj instanceof cdj)) {
/*     */       return;
/*     */     }
/*     */     
/*  85 */     cdj cdj = (cdj)ccj;
/*     */     
/*  87 */     boolean bool1 = brx1.r(fx1);
/*  88 */     boolean bool2 = cdj.G();
/*     */     
/*  90 */     if (bool1 && !bool2) {
/*  91 */       cdj.c(true);
/*  92 */       a((aag)brx1, cdj);
/*  93 */     } else if (!bool1 && bool2) {
/*  94 */       cdj.c(false);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(aag ☃, cdj cdj1) {
/*  99 */     switch (null.a[cdj1.x().ordinal()]) {
/*     */       case 1:
/* 101 */         cdj1.b(false);
/*     */         break;
/*     */       case 2:
/* 104 */         cdj1.a(☃, false);
/*     */         break;
/*     */       case 3:
/* 107 */         cdj1.E();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\caq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */