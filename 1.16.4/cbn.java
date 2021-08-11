/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public class cbn
/*     */   extends cba
/*     */ {
/*  25 */   public static final cfb a = bxm.aq;
/*     */ 
/*     */   
/*  28 */   private static final Map<gc, ddh> b = Maps.newEnumMap((Map)ImmutableMap.of(gc.c, 
/*  29 */         buo.a(5.5D, 3.0D, 11.0D, 10.5D, 13.0D, 16.0D), gc.d, 
/*  30 */         buo.a(5.5D, 3.0D, 0.0D, 10.5D, 13.0D, 5.0D), gc.e, 
/*  31 */         buo.a(11.0D, 3.0D, 5.5D, 16.0D, 13.0D, 10.5D), gc.f, 
/*  32 */         buo.a(0.0D, 3.0D, 5.5D, 5.0D, 13.0D, 10.5D)));
/*     */ 
/*     */   
/*     */   protected cbn(ceg.c ☃, hf hf1) {
/*  36 */     super(☃, hf1);
/*  37 */     j(((ceh)this.n.b()).a(a, gc.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public String i() {
/*  42 */     return h().a();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  47 */     return h(☃);
/*     */   }
/*     */   
/*     */   public static ddh h(ceh ☃) {
/*  51 */     return b.get(☃.c(a));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brz brz1, fx fx1) {
/*  56 */     gc gc = (gc)☃.c(a);
/*  57 */     fx fx2 = fx1.a(gc.f());
/*  58 */     ceh ceh1 = brz1.d_(fx2);
/*     */     
/*  60 */     return ceh1.d(brz1, fx2, gc);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ceh a(bny ☃) {
/*  66 */     ceh ceh = n();
/*     */     
/*  68 */     brz brz = ☃.p();
/*  69 */     fx fx = ☃.a();
/*     */     
/*  71 */     gc[] arrayOfGc = ☃.e();
/*  72 */     for (gc gc : arrayOfGc) {
/*  73 */       if (gc.n().d()) {
/*     */ 
/*     */ 
/*     */         
/*  77 */         gc gc1 = gc.f();
/*     */         
/*  79 */         ceh = ceh.a(a, gc1);
/*  80 */         if (ceh.a(brz, fx)) {
/*  81 */           return ceh;
/*     */         }
/*     */       } 
/*     */     } 
/*  85 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/*  90 */     if (gc1.f() == ☃.c(a) && !☃.a(bry1, fx1)) {
/*  91 */       return bup.a.n();
/*     */     }
/*  93 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/*  98 */     gc gc1 = (gc)☃.c(a);
/*  99 */     double d1 = fx1.u() + 0.5D;
/* 100 */     double d2 = fx1.v() + 0.7D;
/* 101 */     double d3 = fx1.w() + 0.5D;
/* 102 */     double d4 = 0.22D;
/* 103 */     double d5 = 0.27D;
/*     */     
/* 105 */     gc gc2 = gc1.f();
/* 106 */     brx1.a(hh.S, d1 + 0.27D * gc2.i(), d2 + 0.22D, d3 + 0.27D * gc2.k(), 0.0D, 0.0D, 0.0D);
/* 107 */     brx1.a(this.e, d1 + 0.27D * gc2.i(), d2 + 0.22D, d3 + 0.27D * gc2.k(), 0.0D, 0.0D, 0.0D);
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
/* 122 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cbn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */