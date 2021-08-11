/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.Map;
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
/*     */ public class asa<E extends aqn & bdd, T extends aqm>
/*     */   extends arv<E>
/*     */ {
/*     */   private int b;
/*     */   
/*     */   enum a
/*     */   {
/*  24 */     a,
/*  25 */     b,
/*  26 */     c,
/*  27 */     d;
/*     */   }
/*     */   
/*  30 */   private a c = a.a;
/*     */   
/*     */   public asa() {
/*  33 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.c, ayd.o, aye.a), 1200);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, E e) {
/*  41 */     aqm aqm = a((aqm)e);
/*  42 */     return (e.a(bmd.qQ) && arw.c((aqm)e, aqm) && arw.a((aqn)e, aqm, 0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, E e, long l) {
/*  47 */     return (e.cJ().a(ayd.o) && a(☃, e));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(aag ☃, E e, long l) {
/*  53 */     aqm aqm = a((aqm)e);
/*  54 */     b((aqn)e, aqm);
/*  55 */     a(e, aqm);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, E e, long l) {
/*  60 */     if (e.dW()) {
/*  61 */       e.ec();
/*     */     }
/*  63 */     if (e.a(bmd.qQ)) {
/*  64 */       ((bdd)e).b(false);
/*  65 */       bkt.a(e.dY(), false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(E ☃, aqm aqm1) {
/*  71 */     if (this.c == a.a) {
/*  72 */       ☃.c(bgn.a((aqm)☃, bmd.qQ));
/*  73 */       this.c = a.b;
/*  74 */       ((bdd)☃).b(true);
/*     */     }
/*  76 */     else if (this.c == a.b) {
/*  77 */       if (!☃.dW()) {
/*  78 */         this.c = a.a;
/*     */       }
/*  80 */       int i = ☃.ea();
/*  81 */       bmb bmb = ☃.dY();
/*  82 */       if (i >= bkt.g(bmb)) {
/*  83 */         ☃.eb();
/*  84 */         this.c = a.c;
/*  85 */         this.b = 20 + ☃.cY().nextInt(20);
/*  86 */         ((bdd)☃).b(false);
/*     */       }
/*     */     
/*  89 */     } else if (this.c == a.c) {
/*  90 */       this.b--;
/*  91 */       if (this.b == 0) {
/*  92 */         this.c = a.d;
/*     */       }
/*     */     }
/*  95 */     else if (this.c == a.d) {
/*  96 */       ((bdu)☃).a(aqm1, 1.0F);
/*     */       
/*  98 */       bmb bmb = ☃.b(bgn.a((aqm)☃, bmd.qQ));
/*  99 */       bkt.a(bmb, false);
/* 100 */       this.c = a.a;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(aqn ☃, aqm aqm1) {
/* 105 */     ☃.cJ().a(ayd.n, new asd(aqm1, true));
/*     */   }
/*     */   
/*     */   private static aqm a(aqm ☃) {
/* 109 */     return ☃.cJ().<aqm>c(ayd.o).get();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */