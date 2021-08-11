/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ccu
/*     */   extends ccj
/*     */   implements aoy, cdm
/*     */ {
/*     */   public int a;
/*     */   public float b;
/*     */   public float c;
/*     */   public float g;
/*     */   public float h;
/*     */   public float i;
/*     */   public float j;
/*     */   public float k;
/*     */   public float l;
/*     */   public float m;
/*  26 */   private static final Random n = new Random();
/*     */   private nr o;
/*     */   
/*     */   public ccu() {
/*  30 */     super(cck.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  35 */     super.a(☃);
/*  36 */     if (S()) {
/*  37 */       ☃.a("CustomName", nr.a.a(this.o));
/*     */     }
/*     */     
/*  40 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  45 */     super.a(☃, md1);
/*  46 */     if (md1.c("CustomName", 8)) {
/*  47 */       this.o = nr.a.a(md1.l("CustomName"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  53 */     this.j = this.i;
/*  54 */     this.l = this.k;
/*     */     
/*  56 */     bfw ☃ = this.d.a(this.e.u() + 0.5D, this.e.v() + 0.5D, this.e.w() + 0.5D, 3.0D, false);
/*  57 */     if (☃ != null) {
/*  58 */       double d1 = ☃.cD() - this.e.u() + 0.5D;
/*  59 */       double d2 = ☃.cH() - this.e.w() + 0.5D;
/*     */       
/*  61 */       this.m = (float)afm.d(d2, d1);
/*     */       
/*  63 */       this.i += 0.1F;
/*     */       
/*  65 */       if (this.i < 0.5F || n.nextInt(40) == 0) {
/*  66 */         float f = this.g;
/*     */         do {
/*  68 */           this.g += (n.nextInt(4) - n.nextInt(4));
/*  69 */         } while (f == this.g);
/*     */       } 
/*     */     } else {
/*  72 */       this.m += 0.02F;
/*  73 */       this.i -= 0.1F;
/*     */     } 
/*     */     
/*  76 */     while (this.k >= 3.1415927F) {
/*  77 */       this.k -= 6.2831855F;
/*     */     }
/*  79 */     while (this.k < -3.1415927F) {
/*  80 */       this.k += 6.2831855F;
/*     */     }
/*  82 */     while (this.m >= 3.1415927F) {
/*  83 */       this.m -= 6.2831855F;
/*     */     }
/*  85 */     while (this.m < -3.1415927F) {
/*  86 */       this.m += 6.2831855F;
/*     */     }
/*  88 */     float f1 = this.m - this.k;
/*  89 */     while (f1 >= 3.1415927F) {
/*  90 */       f1 -= 6.2831855F;
/*     */     }
/*  92 */     while (f1 < -3.1415927F) {
/*  93 */       f1 += 6.2831855F;
/*     */     }
/*     */     
/*  96 */     this.k += f1 * 0.4F;
/*     */     
/*  98 */     this.i = afm.a(this.i, 0.0F, 1.0F);
/*     */     
/* 100 */     this.a++;
/* 101 */     this.c = this.b;
/*     */     
/* 103 */     float f2 = (this.g - this.b) * 0.4F;
/* 104 */     float f3 = 0.2F;
/* 105 */     f2 = afm.a(f2, -0.2F, 0.2F);
/* 106 */     this.h += (f2 - this.h) * 0.9F;
/*     */     
/* 108 */     this.b += this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr R() {
/* 113 */     if (this.o != null) {
/* 114 */       return this.o;
/*     */     }
/* 116 */     return new of("container.enchant");
/*     */   }
/*     */   
/*     */   public void a(@Nullable nr ☃) {
/* 120 */     this.o = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public nr T() {
/* 126 */     return this.o;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */