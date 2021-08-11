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
/*     */ public class doo
/*     */   extends dot
/*     */ {
/*     */   private final boolean a;
/*     */   
/*     */   public doo(boolean ☃) {
/*  20 */     super(☃ ? new of("menu.game") : new of("menu.paused"));
/*  21 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  26 */     if (this.a) {
/*  27 */       h();
/*     */     }
/*     */   }
/*     */   
/*     */   private void h() {
/*  32 */     int ☃ = -16;
/*  33 */     int i = 98;
/*     */     
/*  35 */     a(new dlj(this.k / 2 - 102, this.l / 4 + 24 + -16, 204, 20, new of("menu.returnToGame"), ☃ -> {
/*     */             this.i.a((dot)null);
/*     */             
/*     */             this.i.l.i();
/*     */           }));
/*  40 */     a(new dlj(this.k / 2 - 102, this.l / 4 + 48 + -16, 98, 20, new of("gui.advancements"), ☃ -> this.i.a(new dpi(this.i.s.e.h()))));
/*  41 */     a(new dlj(this.k / 2 + 4, this.l / 4 + 48 + -16, 98, 20, new of("gui.stats"), ☃ -> this.i.a(new dpb(this, this.i.s.D()))));
/*     */     
/*  43 */     String str = w.a().isStable() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game";
/*  44 */     a(new dlj(this.k / 2 - 102, this.l / 4 + 72 + -16, 98, 20, new of("menu.sendFeedback"), dlj1 -> this.i.a(new dnr((), ☃, true))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     a(new dlj(this.k / 2 + 4, this.l / 4 + 72 + -16, 98, 20, new of("menu.reportBugs"), ☃ -> this.i.a(new dnr((), "https://aka.ms/snapshotbugs?ref=game", true))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     a(new dlj(this.k / 2 - 102, this.l / 4 + 96 + -16, 98, 20, new of("menu.options"), ☃ -> this.i.a(new dok(this, this.i.k))));
/*     */     
/*  63 */     dlj dlj1 = a(new dlj(this.k / 2 + 4, this.l / 4 + 96 + -16, 98, 20, new of("menu.shareToLan"), ☃ -> this.i.a(new dou(this))));
/*     */ 
/*     */     
/*  66 */     dlj1.o = (this.i.G() && !this.i.H().n());
/*     */     
/*  68 */     dlj dlj2 = a(new dlj(this.k / 2 - 102, this.l / 4 + 120 + -16, 204, 20, new of("menu.returnToMenu"), ☃ -> {
/*     */             boolean bool1 = this.i.F();
/*     */             
/*     */             boolean bool2 = this.i.ah();
/*     */             
/*     */             ☃.o = false;
/*     */             this.i.r.S();
/*     */             if (bool1) {
/*     */               this.i.b(new dod(new of("menu.savingLevel")));
/*     */             } else {
/*     */               this.i.r();
/*     */             } 
/*     */             if (bool1) {
/*     */               this.i.a(new doy());
/*     */             } else if (bool2) {
/*     */               eok eok = new eok();
/*     */               eok.a(new doy());
/*     */             } else {
/*     */               this.i.a(new drc(new doy()));
/*     */             } 
/*     */           }));
/*  89 */     if (!this.i.F()) {
/*  90 */       dlj2.a(new of("menu.disconnect"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  96 */     super.d();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 101 */     if (this.a) {
/* 102 */       a(☃);
/* 103 */       a(☃, this.o, this.d, this.k / 2, 40, 16777215);
/*     */     } else {
/* 105 */       a(☃, this.o, this.d, this.k / 2, 10, 16777215);
/*     */     } 
/* 107 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\doo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */