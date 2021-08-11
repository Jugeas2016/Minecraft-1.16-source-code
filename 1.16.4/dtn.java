/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.Arrays;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dtn
/*     */   extends dur<bhn>
/*     */ {
/*  11 */   private final dwn[] a = new dwn[2];
/*     */   private final dwn b;
/*     */   private final ImmutableList<dwn> f;
/*     */   
/*     */   public dtn() {
/*  16 */     dwn[] ☃ = new dwn[5];
/*  17 */     ☃[0] = (new dwn(this, 0, 0)).b(128, 64);
/*  18 */     ☃[1] = (new dwn(this, 0, 19)).b(128, 64);
/*  19 */     ☃[2] = (new dwn(this, 0, 27)).b(128, 64);
/*  20 */     ☃[3] = (new dwn(this, 0, 35)).b(128, 64);
/*  21 */     ☃[4] = (new dwn(this, 0, 43)).b(128, 64);
/*     */     
/*  23 */     int i = 32;
/*  24 */     int j = 6;
/*  25 */     int k = 20;
/*  26 */     int m = 4;
/*     */     
/*  28 */     int n = 28;
/*  29 */     ☃[0].a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
/*  30 */     ☃[0].a(0.0F, 3.0F, 1.0F);
/*     */     
/*  32 */     ☃[1].a(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F, 0.0F);
/*  33 */     ☃[1].a(-15.0F, 4.0F, 4.0F);
/*     */     
/*  35 */     ☃[2].a(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F);
/*  36 */     ☃[2].a(15.0F, 4.0F, 0.0F);
/*     */     
/*  38 */     ☃[3].a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
/*  39 */     ☃[3].a(0.0F, 4.0F, -9.0F);
/*     */     
/*  41 */     ☃[4].a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
/*  42 */     ☃[4].a(0.0F, 4.0F, 9.0F);
/*     */     
/*  44 */     (☃[0]).d = 1.5707964F;
/*  45 */     (☃[1]).e = 4.712389F;
/*  46 */     (☃[2]).e = 1.5707964F;
/*  47 */     (☃[3]).e = 3.1415927F;
/*     */     
/*  49 */     this.a[0] = a(true);
/*  50 */     this.a[0].a(3.0F, -5.0F, 9.0F);
/*     */     
/*  52 */     this.a[1] = a(false);
/*  53 */     this.a[1].a(3.0F, -5.0F, -9.0F);
/*  54 */     (this.a[1]).e = 3.1415927F;
/*     */     
/*  56 */     (this.a[0]).f = 0.19634955F;
/*  57 */     (this.a[1]).f = 0.19634955F;
/*     */     
/*  59 */     this.b = (new dwn(this, 0, 0)).b(128, 64);
/*  60 */     this.b.a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
/*  61 */     this.b.a(0.0F, -3.0F, 1.0F);
/*  62 */     this.b.d = 1.5707964F;
/*     */     
/*  64 */     ImmutableList.Builder<dwn> builder = ImmutableList.builder();
/*     */     
/*  66 */     builder.addAll(Arrays.asList(☃));
/*  67 */     builder.addAll(Arrays.asList(this.a));
/*     */     
/*  69 */     this.f = builder.build();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bhn ☃, float f1, float f2, float f3, float f4, float f5) {
/*  74 */     a(☃, 0, f1);
/*  75 */     a(☃, 1, f1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ImmutableList<dwn> b() {
/*  80 */     return this.f;
/*     */   }
/*     */   
/*     */   public dwn c() {
/*  84 */     return this.b;
/*     */   }
/*     */   
/*     */   protected dwn a(boolean ☃) {
/*  88 */     dwn dwn1 = (new dwn(this, 62, ☃ ? 0 : 20)).b(128, 64);
/*  89 */     int i = 20;
/*  90 */     int j = 7;
/*  91 */     int k = 6;
/*  92 */     float f = -5.0F;
/*     */     
/*  94 */     dwn1.a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F);
/*  95 */     dwn1.a(☃ ? -1.001F : 0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F);
/*     */     
/*  97 */     return dwn1;
/*     */   }
/*     */   
/*     */   protected void a(bhn ☃, int i, float f) {
/* 101 */     float f1 = ☃.a(i, f);
/* 102 */     dwn dwn1 = this.a[i];
/*     */     
/* 104 */     dwn1.d = (float)afm.b(-1.0471975803375244D, -0.2617993950843811D, ((afm.a(-f1) + 1.0F) / 2.0F));
/* 105 */     dwn1.e = (float)afm.b(-0.7853981852531433D, 0.7853981852531433D, ((afm.a(-f1 + 1.0F) + 1.0F) / 2.0F));
/*     */     
/* 107 */     if (i == 1)
/* 108 */       dwn1.e = 3.1415927F - dwn1.e; 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */