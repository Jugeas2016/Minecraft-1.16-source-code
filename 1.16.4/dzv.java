/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class dzv
/*     */ {
/*     */   private static final Object2ObjectMap<vk, dzv> a;
/*     */   
/*     */   static {
/*  15 */     a = (Object2ObjectMap<vk, dzv>)x.a(new Object2ObjectArrayMap(), ☃ -> {
/*     */           c c = new c();
/*     */           ☃.defaultReturnValue(c);
/*     */           ☃.put(chd.a, c);
/*     */           ☃.put(chd.b, new b());
/*     */           ☃.put(chd.c, new a());
/*     */         });
/*     */   }
/*     */   
/*     */   public enum d {
/*  25 */     a,
/*  26 */     b,
/*  27 */     c;
/*     */   }
/*     */   
/*  30 */   private final float[] b = new float[4];
/*     */   private final float c;
/*     */   private final boolean d;
/*     */   private final d e;
/*     */   private final boolean f;
/*     */   private final boolean g;
/*     */   
/*     */   public dzv(float ☃, boolean bool1, d d1, boolean bool2, boolean bool3) {
/*  38 */     this.c = ☃;
/*  39 */     this.d = bool1;
/*  40 */     this.e = d1;
/*  41 */     this.f = bool2;
/*  42 */     this.g = bool3;
/*     */   }
/*     */   
/*     */   public static dzv a(chd ☃) {
/*  46 */     return (dzv)a.get(☃.p());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public float[] a(float ☃, float f1) {
/*  51 */     float f2 = 0.4F;
/*  52 */     float f3 = afm.b(☃ * 6.2831855F) - 0.0F;
/*  53 */     float f4 = -0.0F;
/*  54 */     if (f3 >= -0.4F && f3 <= 0.4F) {
/*  55 */       float f5 = (f3 - -0.0F) / 0.4F * 0.5F + 0.5F;
/*  56 */       float f6 = 1.0F - (1.0F - afm.a(f5 * 3.1415927F)) * 0.99F;
/*  57 */       f6 *= f6;
/*  58 */       this.b[0] = f5 * 0.3F + 0.7F;
/*  59 */       this.b[1] = f5 * f5 * 0.7F + 0.2F;
/*  60 */       this.b[2] = f5 * f5 * 0.0F + 0.2F;
/*  61 */       this.b[3] = f6;
/*  62 */       return this.b;
/*     */     } 
/*     */     
/*  65 */     return null;
/*     */   }
/*     */   
/*     */   public float a() {
/*  69 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  73 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public d c() {
/*  81 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  85 */     return this.f;
/*     */   }
/*     */   public abstract dcn a(dcn paramdcn, float paramFloat);
/*     */   public boolean e() {
/*  89 */     return this.g;
/*     */   }
/*     */   public abstract boolean a(int paramInt1, int paramInt2);
/*     */   
/*     */   public static class b extends dzv { public b() {
/*  94 */       super(Float.NaN, true, dzv.d.a, false, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public dcn a(dcn ☃, float f) {
/*  99 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(int ☃, int i) {
/* 104 */       return true;
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class c extends dzv {
/*     */     public c() {
/* 110 */       super(128.0F, true, dzv.d.b, false, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public dcn a(dcn ☃, float f) {
/* 115 */       return ☃.d((f * 0.94F + 0.06F), (f * 0.94F + 0.06F), (f * 0.91F + 0.09F));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(int ☃, int i) {
/* 123 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a extends dzv {
/*     */     public a() {
/* 129 */       super(Float.NaN, false, dzv.d.c, true, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public dcn a(dcn ☃, float f) {
/* 134 */       return ☃.a(0.15000000596046448D);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean a(int ☃, int i) {
/* 140 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public float[] a(float ☃, float f1) {
/* 146 */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */