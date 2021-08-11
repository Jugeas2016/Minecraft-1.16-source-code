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
/*     */ public abstract class arv<E extends aqm>
/*     */ {
/*     */   protected final Map<ayd<?>, aye> a;
/*  18 */   private a b = a.a;
/*     */   private long c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   
/*     */   public arv(Map<ayd<?>, aye> ☃) {
/*  24 */     this(☃, 60);
/*     */   }
/*     */   
/*     */   public arv(Map<ayd<?>, aye> ☃, int i) {
/*  28 */     this(☃, i, i);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public arv(Map<ayd<?>, aye> ☃, int i, int j) {
/*  35 */     this.d = i;
/*  36 */     this.e = j;
/*  37 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public a a() {
/*  41 */     return this.b;
/*     */   }
/*     */   
/*     */   public final boolean e(aag ☃, E e, long l) {
/*  45 */     if (a(e) && a(☃, e)) {
/*  46 */       this.b = a.b;
/*  47 */       int i = this.d + ☃.u_().nextInt(this.e + 1 - this.d);
/*  48 */       this.c = l + i;
/*  49 */       a(☃, e, l);
/*  50 */       return true;
/*     */     } 
/*  52 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, E e, long l) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public final void f(aag ☃, E e, long l) {
/*  62 */     if (!a(l) && b(☃, e, l)) {
/*  63 */       d(☃, e, l);
/*     */     } else {
/*  65 */       g(☃, e, l);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, E e, long l) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public final void g(aag ☃, E e, long l) {
/*  76 */     this.b = a.a;
/*  77 */     c(☃, e, l);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, E e, long l) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean b(aag ☃, E e, long l) {
/*  94 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(long ☃) {
/* 102 */     return (☃ > this.c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, E e) {
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 115 */     return getClass().getSimpleName();
/*     */   }
/*     */   
/*     */   private boolean a(E ☃) {
/* 119 */     for (Map.Entry<ayd<?>, aye> entry : this.a.entrySet()) {
/* 120 */       ayd<?> ayd = entry.getKey();
/* 121 */       aye aye = entry.getValue();
/* 122 */       if (!☃.cJ().a(ayd, aye)) {
/* 123 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 127 */     return true;
/*     */   }
/*     */   
/*     */   public enum a {
/* 131 */     a,
/* 132 */     b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */