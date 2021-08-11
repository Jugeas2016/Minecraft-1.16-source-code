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
/*     */ 
/*     */ 
/*     */ public class dza
/*     */   extends dzb
/*     */ {
/*     */   private final ceh a;
/*     */   private fx b;
/*     */   private final float D;
/*     */   private final float E;
/*     */   
/*     */   public dza(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, ceh ceh1) {
/*  22 */     super(☃, d1, d2, d3, d4, d5, d6);
/*  23 */     this.a = ceh1;
/*  24 */     a(djz.C().ab().a().a(ceh1));
/*  25 */     this.u = 1.0F;
/*  26 */     this.v = 0.6F;
/*  27 */     this.w = 0.6F;
/*  28 */     this.x = 0.6F;
/*  29 */     this.B /= 2.0F;
/*     */     
/*  31 */     this.D = this.r.nextFloat() * 3.0F;
/*  32 */     this.E = this.r.nextFloat() * 3.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public dyk b() {
/*  37 */     return dyk.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public dza a(fx ☃) {
/*  42 */     this.b = ☃;
/*  43 */     if (this.a.a(bup.i)) {
/*  44 */       return this;
/*     */     }
/*  46 */     b(☃);
/*  47 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public dza g() {
/*  52 */     this.b = new fx(this.g, this.h, this.i);
/*  53 */     if (this.a.a(bup.i)) {
/*  54 */       return this;
/*     */     }
/*  56 */     b(this.b);
/*  57 */     return this;
/*     */   }
/*     */   
/*     */   protected void b(@Nullable fx ☃) {
/*  61 */     int i = djz.C().al().a(this.a, this.c, ☃, 0);
/*  62 */     this.v *= (i >> 16 & 0xFF) / 255.0F;
/*  63 */     this.w *= (i >> 8 & 0xFF) / 255.0F;
/*  64 */     this.x *= (i & 0xFF) / 255.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float c() {
/*  69 */     return this.C.a(((this.D + 1.0F) / 4.0F * 16.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float d() {
/*  74 */     return this.C.a((this.D / 4.0F * 16.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float e() {
/*  79 */     return this.C.b((this.E / 4.0F * 16.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float f() {
/*  84 */     return this.C.b(((this.E + 1.0F) / 4.0F * 16.0F));
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(float ☃) {
/*  89 */     int i = super.a(☃);
/*  90 */     int j = 0;
/*  91 */     if (this.c.C(this.b)) {
/*  92 */       j = eae.a(this.c, this.b);
/*     */     }
/*  94 */     return (i == 0) ? j : i;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements dyj<hc> {
/*     */     public dyg a(hc ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 100 */       ceh ceh = ☃.c();
/* 101 */       if (ceh.g() || ceh.a(bup.bo)) {
/* 102 */         return null;
/*     */       }
/* 104 */       return (new dza(dwt1, d1, d2, d3, d4, d5, d6, ceh)).g();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dza.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */