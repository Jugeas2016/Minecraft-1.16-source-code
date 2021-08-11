/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ccv
/*     */   extends ccj
/*     */   implements cdc, cdm
/*     */ {
/*     */   public float a;
/*     */   public float b;
/*     */   public int c;
/*     */   private int g;
/*     */   
/*     */   public ccv() {
/*  17 */     super(cck.d);
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  22 */     if (++this.g % 20 * 4 == 0) {
/*  23 */       this.d.a(this.e, bup.ek, 1, this.c);
/*     */     }
/*     */     
/*  26 */     this.b = this.a;
/*     */     
/*  28 */     int ☃ = this.e.u();
/*  29 */     int i = this.e.v();
/*  30 */     int j = this.e.w();
/*     */     
/*  32 */     float f = 0.1F;
/*  33 */     if (this.c > 0 && this.a == 0.0F) {
/*  34 */       double d1 = ☃ + 0.5D;
/*  35 */       double d2 = j + 0.5D;
/*     */       
/*  37 */       this.d.a((bfw)null, d1, i + 0.5D, d2, adq.do, adr.e, 0.5F, this.d.t.nextFloat() * 0.1F + 0.9F);
/*     */     } 
/*  39 */     if ((this.c == 0 && this.a > 0.0F) || (this.c > 0 && this.a < 1.0F)) {
/*  40 */       float f1 = this.a;
/*  41 */       if (this.c > 0) {
/*  42 */         this.a += 0.1F;
/*     */       } else {
/*  44 */         this.a -= 0.1F;
/*     */       } 
/*  46 */       if (this.a > 1.0F) {
/*  47 */         this.a = 1.0F;
/*     */       }
/*  49 */       float f2 = 0.5F;
/*  50 */       if (this.a < 0.5F && f1 >= 0.5F) {
/*  51 */         double d1 = ☃ + 0.5D;
/*  52 */         double d2 = j + 0.5D;
/*     */         
/*  54 */         this.d.a((bfw)null, d1, i + 0.5D, d2, adq.dn, adr.e, 0.5F, this.d.t.nextFloat() * 0.1F + 0.9F);
/*     */       } 
/*  56 */       if (this.a < 0.0F) {
/*  57 */         this.a = 0.0F;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, int i) {
/*  64 */     if (☃ == 1) {
/*  65 */       this.c = i;
/*  66 */       return true;
/*     */     } 
/*  68 */     return super.a_(☃, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void al_() {
/*  73 */     s();
/*  74 */     super.al_();
/*     */   }
/*     */   
/*     */   public void d() {
/*  78 */     this.c++;
/*  79 */     this.d.a(this.e, bup.ek, 1, this.c);
/*     */   }
/*     */   
/*     */   public void f() {
/*  83 */     this.c--;
/*  84 */     this.d.a(this.e, bup.ek, 1, this.c);
/*     */   }
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  88 */     if (this.d.c(this.e) != this) {
/*  89 */       return false;
/*     */     }
/*  91 */     if (☃.h(this.e.u() + 0.5D, this.e.v() + 0.5D, this.e.w() + 0.5D) > 64.0D) {
/*  92 */       return false;
/*     */     }
/*     */     
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(float ☃) {
/* 100 */     return afm.g(☃, this.b, this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */