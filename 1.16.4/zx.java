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
/*     */ public class zx
/*     */   extends aai
/*     */ {
/*     */   private boolean c;
/*     */   private boolean d;
/*     */   private int e;
/*     */   private int f;
/*     */   
/*     */   public zx(aag ☃) {
/*  26 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  31 */     super.a();
/*  32 */     this.f++;
/*     */     
/*  34 */     long ☃ = this.a.T();
/*  35 */     long l1 = ☃ / 24000L + 1L;
/*     */     
/*  37 */     if (!this.c && this.f > 20) {
/*  38 */       this.c = true;
/*  39 */       this.b.b.a(new pq(pq.f, 0.0F));
/*     */     } 
/*     */     
/*  42 */     this.d = (☃ > 120500L);
/*  43 */     if (this.d) {
/*  44 */       this.e++;
/*     */     }
/*     */     
/*  47 */     if (☃ % 24000L == 500L) {
/*  48 */       if (l1 <= 6L) {
/*  49 */         if (l1 == 6L) {
/*  50 */           this.b.b.a(new pq(pq.f, 104.0F));
/*     */         } else {
/*  52 */           this.b.a(new of("demo.day." + l1), x.b);
/*     */         } 
/*     */       }
/*  55 */     } else if (l1 == 1L) {
/*  56 */       if (☃ == 100L) {
/*  57 */         this.b.b.a(new pq(pq.f, 101.0F));
/*  58 */       } else if (☃ == 175L) {
/*  59 */         this.b.b.a(new pq(pq.f, 102.0F));
/*  60 */       } else if (☃ == 250L) {
/*  61 */         this.b.b.a(new pq(pq.f, 103.0F));
/*     */       } 
/*  63 */     } else if (l1 == 5L && 
/*  64 */       ☃ % 24000L == 22000L) {
/*  65 */       this.b.a(new of("demo.day.warning"), x.b);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void f() {
/*  71 */     if (this.e > 100) {
/*  72 */       this.b.a(new of("demo.reminder"), x.b);
/*  73 */       this.e = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(fx ☃, sz.a a1, gc gc1, int i) {
/*  79 */     if (this.d) {
/*  80 */       f();
/*     */       return;
/*     */     } 
/*  83 */     super.a(☃, a1, gc1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(aah ☃, brx brx1, bmb bmb1, aot aot1) {
/*  88 */     if (this.d) {
/*  89 */       f();
/*  90 */       return aou.c;
/*     */     } 
/*  92 */     return super.a(☃, brx1, bmb1, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(aah ☃, brx brx1, bmb bmb1, aot aot1, dcj dcj1) {
/*  97 */     if (this.d) {
/*  98 */       f();
/*  99 */       return aou.c;
/*     */     } 
/* 101 */     return super.a(☃, brx1, bmb1, aot1, dcj1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */