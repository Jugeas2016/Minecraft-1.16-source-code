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
/*     */ public class bcd
/*     */   extends bbu
/*     */ {
/*     */   private int b;
/*     */   private int c;
/*     */   private apz d;
/*     */   
/*     */   public bcd(bbr ☃) {
/*  23 */     super(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  28 */     this.b++;
/*     */     
/*  30 */     if (this.b % 2 == 0 && this.b < 10) {
/*  31 */       dcn ☃ = this.a.x(1.0F).d();
/*  32 */       ☃.b(-0.7853982F);
/*  33 */       double d1 = this.a.bo.cD();
/*  34 */       double d2 = this.a.bo.e(0.5D);
/*  35 */       double d3 = this.a.bo.cH();
/*  36 */       for (int i = 0; i < 8; i++) {
/*  37 */         double d4 = d1 + this.a.cY().nextGaussian() / 2.0D;
/*  38 */         double d5 = d2 + this.a.cY().nextGaussian() / 2.0D;
/*  39 */         double d6 = d3 + this.a.cY().nextGaussian() / 2.0D;
/*  40 */         for (int j = 0; j < 6; j++) {
/*  41 */           this.a.l.a(hh.i, d4, d5, d6, -☃.b * 0.07999999821186066D * j, -☃.c * 0.6000000238418579D, -☃.d * 0.07999999821186066D * j);
/*     */         }
/*  43 */         ☃.b(0.19634955F);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/*  50 */     this.b++;
/*     */     
/*  52 */     if (this.b >= 200) {
/*  53 */       if (this.c >= 4) {
/*  54 */         this.a.eK().a(bch.e);
/*     */       } else {
/*  56 */         this.a.eK().a(bch.g);
/*     */       } 
/*  58 */     } else if (this.b == 10) {
/*  59 */       dcn ☃ = (new dcn(this.a.bo.cD() - this.a.cD(), 0.0D, this.a.bo.cH() - this.a.cH())).d();
/*  60 */       float f = 5.0F;
/*  61 */       double d1 = this.a.bo.cD() + ☃.b * 5.0D / 2.0D;
/*  62 */       double d2 = this.a.bo.cH() + ☃.d * 5.0D / 2.0D;
/*  63 */       double d3 = this.a.bo.e(0.5D);
/*  64 */       double d4 = d3;
/*     */       
/*  66 */       fx.a a = new fx.a(d1, d4, d2);
/*  67 */       while (this.a.l.w(a)) {
/*  68 */         d4--;
/*  69 */         if (d4 < 0.0D) {
/*  70 */           d4 = d3;
/*     */           break;
/*     */         } 
/*  73 */         a.c(d1, d4, d2);
/*     */       } 
/*  75 */       d4 = (afm.c(d4) + 1);
/*  76 */       this.d = new apz(this.a.l, d1, d4, d2);
/*  77 */       this.d.a(this.a);
/*  78 */       this.d.a(5.0F);
/*  79 */       this.d.b(200);
/*  80 */       this.d.a(hh.i);
/*  81 */       this.d.a(new apu(apw.g));
/*  82 */       this.a.l.c(this.d);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  88 */     this.b = 0;
/*  89 */     this.c++;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  94 */     if (this.d != null) {
/*  95 */       this.d.ad();
/*  96 */       this.d = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public bch<bcd> i() {
/* 102 */     return bch.f;
/*     */   }
/*     */   
/*     */   public void j() {
/* 106 */     this.c = 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */