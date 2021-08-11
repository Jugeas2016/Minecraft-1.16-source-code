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
/*     */ public class bts
/*     */   extends bwo
/*     */ {
/*  31 */   public static final cfb a = bxm.aq;
/*     */   
/*  33 */   private static final ddh b = buo.a(2.0D, 0.0D, 2.0D, 14.0D, 4.0D, 14.0D);
/*     */   
/*  35 */   private static final ddh c = buo.a(3.0D, 4.0D, 4.0D, 13.0D, 5.0D, 12.0D);
/*  36 */   private static final ddh d = buo.a(4.0D, 5.0D, 6.0D, 12.0D, 10.0D, 10.0D);
/*  37 */   private static final ddh e = buo.a(0.0D, 10.0D, 3.0D, 16.0D, 16.0D, 13.0D);
/*     */   
/*  39 */   private static final ddh f = buo.a(4.0D, 4.0D, 3.0D, 12.0D, 5.0D, 13.0D);
/*  40 */   private static final ddh g = buo.a(6.0D, 5.0D, 4.0D, 10.0D, 10.0D, 12.0D);
/*  41 */   private static final ddh h = buo.a(3.0D, 10.0D, 0.0D, 13.0D, 16.0D, 16.0D);
/*     */   
/*  43 */   private static final ddh i = dde.a(b, new ddh[] { c, d, e });
/*  44 */   private static final ddh j = dde.a(b, new ddh[] { f, g, h });
/*     */   
/*  46 */   private static final nr k = new of("container.repair");
/*     */   
/*     */   public bts(ceg.c ☃) {
/*  49 */     super(☃);
/*  50 */     j(((ceh)this.n.b()).a(a, gc.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/*  55 */     return n().a(a, ☃.f().g());
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  60 */     if (brx1.v) {
/*  61 */       return aou.a;
/*     */     }
/*     */     
/*  64 */     bfw1.a(☃.b(brx1, fx1));
/*  65 */     bfw1.a(aea.aB);
/*  66 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aox b(ceh ☃, brx brx1, fx fx1) {
/*  72 */     return new apb((i, bfv1, bfw1) -> new bie(i, bfv1, bim.a(☃, fx1)), k);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  77 */     gc gc = (gc)☃.c(a);
/*  78 */     if (gc.n() == gc.a.a) {
/*  79 */       return i;
/*     */     }
/*  81 */     return j;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(bcu ☃) {
/*  87 */     ☃.a(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, ceh ceh2, bcu bcu1) {
/*  92 */     if (!bcu1.aA()) {
/*  93 */       ☃.c(1031, fx1, 0);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, bcu bcu1) {
/*  99 */     if (!bcu1.aA()) {
/* 100 */       ☃.c(1029, fx1, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ceh c(ceh ☃) {
/* 106 */     if (☃.a(bup.fo)) {
/* 107 */       return bup.fp.n().a(a, ☃.c(a));
/*     */     }
/* 109 */     if (☃.a(bup.fp)) {
/* 110 */       return bup.fq.n().a(a, ☃.c(a));
/*     */     }
/* 112 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 117 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 122 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 127 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int c(ceh ☃, brc brc1, fx fx1) {
/* 132 */     return (☃.d(brc1, fx1)).ai;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */