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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class avq
/*     */   extends avv
/*     */ {
/*     */   private int a;
/*     */   private final aqu b;
/*     */   private bfw c;
/*     */   private avf d;
/*     */   
/*     */   public avq(aqu ☃) {
/*  28 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  33 */     List<bhn> ☃ = this.b.l.a(bhn.class, this.b.cc().g(5.0D));
/*  34 */     boolean bool = false;
/*  35 */     for (bhn bhn : ☃) {
/*  36 */       aqa aqa = bhn.cm();
/*  37 */       if (aqa instanceof bfw && (
/*  38 */         afm.e(((bfw)aqa).aR) > 0.0F || afm.e(((bfw)aqa).aT) > 0.0F)) {
/*  39 */         bool = true;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     
/*  45 */     return ((this.c != null && (afm.e(this.c.aR) > 0.0F || afm.e(this.c.aT) > 0.0F)) || bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean C_() {
/*  50 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/*  55 */     return (this.c != null && this.c.br() && (afm.e(this.c.aR) > 0.0F || afm.e(this.c.aT) > 0.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  60 */     List<bhn> ☃ = this.b.l.a(bhn.class, this.b.cc().g(5.0D));
/*  61 */     for (bhn bhn : ☃) {
/*  62 */       if (bhn.cm() != null && bhn.cm() instanceof bfw) {
/*  63 */         this.c = (bfw)bhn.cm();
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/*  68 */     this.a = 0;
/*  69 */     this.d = avf.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  74 */     this.c = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  79 */     boolean ☃ = (afm.e(this.c.aR) > 0.0F || afm.e(this.c.aT) > 0.0F);
/*  80 */     float f = (this.d == avf.b) ? (☃ ? 0.01F : 0.0F) : 0.015F;
/*     */     
/*  82 */     this.b.a(f, new dcn(this.b.aR, this.b.aS, this.b.aT));
/*  83 */     this.b.a(aqr.a, this.b.cC());
/*     */     
/*  85 */     if (--this.a > 0) {
/*     */       return;
/*     */     }
/*  88 */     this.a = 10;
/*     */     
/*  90 */     if (this.d == avf.a) {
/*  91 */       fx fx = this.c.cB().a(this.c.bZ().f());
/*  92 */       fx = fx.b(0, -1, 0);
/*  93 */       this.b.x().a(fx.u(), fx.v(), fx.w(), 1.0D);
/*     */       
/*  95 */       if (this.b.g(this.c) < 4.0F) {
/*  96 */         this.a = 0;
/*  97 */         this.d = avf.b;
/*     */       } 
/*  99 */     } else if (this.d == avf.b) {
/*     */       
/* 101 */       gc gc = this.c.ca();
/* 102 */       fx fx = this.c.cB().a(gc, 10);
/*     */ 
/*     */       
/* 105 */       this.b.x().a(fx.u(), (fx.v() - 1), fx.w(), 1.0D);
/*     */       
/* 107 */       if (this.b.g(this.c) > 12.0F) {
/* 108 */         this.a = 0;
/* 109 */         this.d = avf.a;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */