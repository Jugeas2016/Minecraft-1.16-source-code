/*     */ import java.util.EnumSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class axf
/*     */   extends avv
/*     */ {
/*  14 */   private static final azg c = (new azg()).a(10.0D).a().b().d().c();
/*     */   
/*     */   protected final aqu a;
/*     */   private final double d;
/*     */   private double e;
/*     */   private double f;
/*     */   private double g;
/*     */   private double h;
/*     */   private double i;
/*     */   protected bfw b;
/*     */   private int j;
/*     */   private boolean k;
/*     */   private final bon l;
/*     */   private final boolean m;
/*     */   
/*     */   public axf(aqu ☃, double d, bon bon1, boolean bool) {
/*  30 */     this(☃, d, bool, bon1);
/*     */   }
/*     */   
/*     */   public axf(aqu ☃, double d, boolean bool, bon bon1) {
/*  34 */     this.a = ☃;
/*  35 */     this.d = d;
/*  36 */     this.l = bon1;
/*  37 */     this.m = bool;
/*  38 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*  39 */     if (!(☃.x() instanceof ayi) && !(☃.x() instanceof ayh)) {
/*  40 */       throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  46 */     if (this.j > 0) {
/*  47 */       this.j--;
/*  48 */       return false;
/*     */     } 
/*  50 */     this.b = this.a.l.a(c, this.a);
/*  51 */     if (this.b == null) {
/*  52 */       return false;
/*     */     }
/*  54 */     return (a(this.b.dD()) || a(this.b.dE()));
/*     */   }
/*     */   
/*     */   protected boolean a(bmb ☃) {
/*  58 */     return this.l.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  63 */     if (g()) {
/*  64 */       if (this.a.h(this.b) < 36.0D) {
/*  65 */         if (this.b.h(this.e, this.f, this.g) > 0.010000000000000002D) {
/*  66 */           return false;
/*     */         }
/*  68 */         if (Math.abs(this.b.q - this.h) > 5.0D || Math.abs(this.b.p - this.i) > 5.0D) {
/*  69 */           return false;
/*     */         }
/*     */       } else {
/*  72 */         this.e = this.b.cD();
/*  73 */         this.f = this.b.cE();
/*  74 */         this.g = this.b.cH();
/*     */       } 
/*  76 */       this.h = this.b.q;
/*  77 */       this.i = this.b.p;
/*     */     } 
/*  79 */     return a();
/*     */   }
/*     */   
/*     */   protected boolean g() {
/*  83 */     return this.m;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  88 */     this.e = this.b.cD();
/*  89 */     this.f = this.b.cE();
/*  90 */     this.g = this.b.cH();
/*  91 */     this.k = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  96 */     this.b = null;
/*  97 */     this.a.x().o();
/*  98 */     this.j = 100;
/*  99 */     this.k = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 104 */     this.a.t().a(this.b, (this.a.Q() + 20), this.a.O());
/* 105 */     if (this.a.h(this.b) < 6.25D) {
/* 106 */       this.a.x().o();
/*     */     } else {
/* 108 */       this.a.x().a(this.b, this.d);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 113 */     return this.k;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */