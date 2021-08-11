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
/*     */ public class eob
/*     */   implements eof
/*     */ {
/*  19 */   private static final nr a = new of("tutorial.move.title", new Object[] { eoe.a("forward"), eoe.a("left"), eoe.a("back"), eoe.a("right") });
/*  20 */   private static final nr b = new of("tutorial.move.description", new Object[] { eoe.a("jump") });
/*     */   
/*  22 */   private static final nr c = new of("tutorial.look.title");
/*  23 */   private static final nr d = new of("tutorial.look.description");
/*     */   
/*     */   private final eoe e;
/*     */   private dms f;
/*     */   private dms g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private boolean k;
/*     */   private boolean l;
/*  33 */   private int m = -1;
/*  34 */   private int n = -1;
/*     */   
/*     */   public eob(eoe ☃) {
/*  37 */     this.e = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  42 */     this.h++;
/*     */     
/*  44 */     if (this.k) {
/*  45 */       this.i++;
/*  46 */       this.k = false;
/*     */     } 
/*     */     
/*  49 */     if (this.l) {
/*  50 */       this.j++;
/*  51 */       this.l = false;
/*     */     } 
/*     */     
/*  54 */     if (this.m == -1 && this.i > 40) {
/*  55 */       if (this.f != null) {
/*  56 */         this.f.b();
/*  57 */         this.f = null;
/*     */       } 
/*  59 */       this.m = this.h;
/*     */     } 
/*     */     
/*  62 */     if (this.n == -1 && this.j > 40) {
/*  63 */       if (this.g != null) {
/*  64 */         this.g.b();
/*  65 */         this.g = null;
/*     */       } 
/*  67 */       this.n = this.h;
/*     */     } 
/*     */     
/*  70 */     if (this.m != -1 && this.n != -1) {
/*  71 */       if (this.e.f() == bru.b) {
/*  72 */         this.e.a(eog.b);
/*     */       } else {
/*  74 */         this.e.a(eog.f);
/*     */       } 
/*     */     }
/*     */     
/*  78 */     if (this.f != null) {
/*  79 */       this.f.a(this.i / 40.0F);
/*     */     }
/*     */     
/*  82 */     if (this.g != null) {
/*  83 */       this.g.a(this.j / 40.0F);
/*     */     }
/*     */     
/*  86 */     if (this.h >= 100) {
/*  87 */       if (this.m == -1 && this.f == null) {
/*  88 */         this.f = new dms(dms.a.a, a, b, true);
/*  89 */         this.e.e().an().a(this.f);
/*  90 */       } else if (this.m != -1 && this.h - this.m >= 20 && this.n == -1 && this.g == null) {
/*  91 */         this.g = new dms(dms.a.b, c, d, true);
/*  92 */         this.e.e().an().a(this.g);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  99 */     if (this.f != null) {
/* 100 */       this.f.b();
/* 101 */       this.f = null;
/*     */     } 
/* 103 */     if (this.g != null) {
/* 104 */       this.g.b();
/* 105 */       this.g = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dzk ☃) {
/* 111 */     if (☃.c || ☃.d || ☃.e || ☃.f || ☃.g) {
/* 112 */       this.k = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(double ☃, double d1) {
/* 118 */     if (Math.abs(☃) > 0.01D || Math.abs(d1) > 0.01D)
/* 119 */       this.l = true; 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */