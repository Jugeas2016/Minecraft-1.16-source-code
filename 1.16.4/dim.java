/*     */ import java.util.concurrent.locks.ReentrantLock;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class dim
/*     */   extends eoo
/*     */ {
/*  24 */   private static final Logger a = LogManager.getLogger();
/*  25 */   private static final nr b = new of("mco.terms.title");
/*  26 */   private static final nr c = new of("mco.terms.sentence.1");
/*  27 */   private static final nr p = (new oe(" ")).a((new of("mco.terms.sentence.2")).c(ob.a.c(Boolean.valueOf(true))));
/*     */   
/*     */   private final dot q;
/*     */   
/*     */   private final dfw r;
/*     */   private final dgq s;
/*     */   private boolean t;
/*  34 */   private final String u = "https://aka.ms/MinecraftRealmsTerms";
/*     */   
/*     */   public dim(dot ☃, dfw dfw1, dgq dgq1) {
/*  37 */     this.q = ☃;
/*  38 */     this.r = dfw1;
/*  39 */     this.s = dgq1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  44 */     this.i.m.a(true);
/*     */     
/*  46 */     int ☃ = this.k / 4 - 2;
/*     */     
/*  48 */     a(new dlj(this.k / 4, j(12), ☃, 20, new of("mco.terms.buttons.agree"), ☃ -> h()));
/*  49 */     a(new dlj(this.k / 2 + 4, j(12), ☃, 20, new of("mco.terms.buttons.disagree"), ☃ -> this.i.a(this.q)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  54 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  59 */     if (☃ == 256) {
/*  60 */       this.i.a(this.q);
/*  61 */       return true;
/*     */     } 
/*  63 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void h() {
/*  67 */     dgb ☃ = dgb.a();
/*     */     try {
/*  69 */       ☃.l();
/*  70 */       this.i.a(new dhz(this.q, new diz(this.r, this.q, this.s, new ReentrantLock())));
/*  71 */     } catch (dhi dhi) {
/*  72 */       a.error("Couldn't agree to TOS");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/*  78 */     if (this.t) {
/*  79 */       this.i.m.a("https://aka.ms/MinecraftRealmsTerms");
/*  80 */       x.i().a("https://aka.ms/MinecraftRealmsTerms");
/*  81 */       return true;
/*     */     } 
/*     */     
/*  84 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public String ax_() {
/*  89 */     return super.ax_() + ". " + c.getString() + " " + p.getString();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  94 */     a(☃);
/*     */     
/*  96 */     a(☃, this.o, b, this.k / 2, 17, 16777215);
/*  97 */     this.o.b(☃, c, (this.k / 2 - 120), j(5), 16777215);
/*  98 */     int k = this.o.a(c);
/*     */     
/* 100 */     int m = this.k / 2 - 121 + k;
/* 101 */     int n = j(5);
/* 102 */     int i1 = m + this.o.a(p) + 1;
/* 103 */     this.o.getClass(); int i2 = n + 1 + 9;
/*     */     
/* 105 */     this.t = (m <= i && i <= i1 && n <= j && j <= i2);
/* 106 */     this.o.b(☃, p, (this.k / 2 - 120 + k), j(5), this.t ? 7107012 : 3368635);
/*     */     
/* 108 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dim.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */