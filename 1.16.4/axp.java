/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
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
/*     */ public class axp
/*     */   extends axx
/*     */ {
/*  18 */   private static final azg a = (new azg()).c().e();
/*     */   
/*     */   private boolean b;
/*     */   
/*     */   private int c;
/*     */   
/*     */   private final Class<?>[] d;
/*     */   
/*     */   private Class<?>[] i;
/*     */   
/*     */   public axp(aqu ☃, Class<?>... arrayOfClass) {
/*  29 */     super(☃, true);
/*  30 */     this.d = arrayOfClass;
/*  31 */     a(EnumSet.of(avv.a.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  36 */     int ☃ = this.e.da();
/*  37 */     aqm aqm = this.e.cZ();
/*     */     
/*  39 */     if (☃ == this.c || aqm == null) {
/*  40 */       return false;
/*     */     }
/*     */     
/*  43 */     if (aqm.X() == aqe.bc && this.e.l.V().b(brt.G))
/*     */     {
/*  45 */       return false;
/*     */     }
/*     */     
/*  48 */     for (Class<?> clazz : this.d) {
/*  49 */       if (clazz.isAssignableFrom(aqm.getClass())) {
/*  50 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  54 */     return a(aqm, a);
/*     */   }
/*     */   
/*     */   public axp a(Class<?>... ☃) {
/*  58 */     this.b = true;
/*  59 */     this.i = ☃;
/*  60 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  65 */     this.e.h(this.e.cZ());
/*  66 */     this.g = this.e.A();
/*  67 */     this.c = this.e.da();
/*  68 */     this.h = 300;
/*     */     
/*  70 */     if (this.b) {
/*  71 */       g();
/*     */     }
/*     */     
/*  74 */     super.c();
/*     */   }
/*     */   
/*     */   protected void g() {
/*  78 */     double ☃ = k();
/*     */     
/*  80 */     dci dci = dci.a(this.e.cA()).c(☃, 10.0D, ☃);
/*  81 */     List<aqn> list = (List)this.e.l.b(this.e.getClass(), dci);
/*  82 */     for (aqn aqn : list) {
/*  83 */       if (this.e == aqn) {
/*     */         continue;
/*     */       }
/*  86 */       if (aqn.A() != null) {
/*     */         continue;
/*     */       }
/*  89 */       if (this.e instanceof are && ((are)this.e).eN() != ((are)aqn).eN()) {
/*     */         continue;
/*     */       }
/*  92 */       if (aqn.r(this.e.cZ())) {
/*     */         continue;
/*     */       }
/*  95 */       if (this.i != null) {
/*  96 */         boolean bool = false;
/*  97 */         for (Class<?> clazz : this.i) {
/*  98 */           if (aqn.getClass() == clazz) {
/*  99 */             bool = true;
/*     */             break;
/*     */           } 
/*     */         } 
/* 103 */         if (bool) {
/*     */           continue;
/*     */         }
/*     */       } 
/*     */       
/* 108 */       a(aqn, this.e.cZ());
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void a(aqn ☃, aqm aqm1) {
/* 113 */     ☃.h(aqm1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */