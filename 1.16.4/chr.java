/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.util.Function12;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ 
/*     */ public class chr {
/*     */   static {
/*   9 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.intRange(0, 256).fieldOf("height").forGetter(chr::a), (App)chq.a.fieldOf("sampling").forGetter(chr::b), (App)chs.a.fieldOf("top_slide").forGetter(chr::c), (App)chs.a.fieldOf("bottom_slide").forGetter(chr::d), (App)Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(chr::e), (App)Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(chr::f), (App)Codec.DOUBLE.fieldOf("density_factor").forGetter(chr::g), (App)Codec.DOUBLE.fieldOf("density_offset").forGetter(chr::h), (App)Codec.BOOL.fieldOf("simplex_surface_noise").forGetter(chr::i), (App)Codec.BOOL.optionalFieldOf("random_density_offset", Boolean.valueOf(false), Lifecycle.experimental()).forGetter(chr::j), (App)Codec.BOOL.optionalFieldOf("island_noise_override", Boolean.valueOf(false), Lifecycle.experimental()).forGetter(chr::k), (App)Codec.BOOL.optionalFieldOf("amplified", Boolean.valueOf(false), Lifecycle.experimental()).forGetter(chr::l)).apply((Applicative)☃, chr::new));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final Codec<chr> a;
/*     */ 
/*     */   
/*     */   private final int b;
/*     */ 
/*     */   
/*     */   private final chq c;
/*     */ 
/*     */   
/*     */   private final chs d;
/*     */   
/*     */   private final chs e;
/*     */   
/*     */   private final int f;
/*     */   
/*     */   private final int g;
/*     */   
/*     */   private final double h;
/*     */   
/*     */   private final double i;
/*     */   
/*     */   private final boolean j;
/*     */   
/*     */   private final boolean k;
/*     */   
/*     */   private final boolean l;
/*     */   
/*     */   private final boolean m;
/*     */ 
/*     */   
/*     */   public chr(int ☃, chq chq1, chs chs1, chs chs2, int i, int j, double d1, double d2, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/*  45 */     this.b = ☃;
/*     */     
/*  47 */     this.c = chq1;
/*     */     
/*  49 */     this.d = chs1;
/*  50 */     this.e = chs2;
/*     */     
/*  52 */     this.f = i;
/*  53 */     this.g = j;
/*     */     
/*  55 */     this.h = d1;
/*  56 */     this.i = d2;
/*     */     
/*  58 */     this.j = bool1;
/*  59 */     this.k = bool2;
/*  60 */     this.l = bool3;
/*  61 */     this.m = bool4;
/*     */   }
/*     */   
/*     */   public int a() {
/*  65 */     return this.b;
/*     */   }
/*     */   
/*     */   public chq b() {
/*  69 */     return this.c;
/*     */   }
/*     */   
/*     */   public chs c() {
/*  73 */     return this.d;
/*     */   }
/*     */   
/*     */   public chs d() {
/*  77 */     return this.e;
/*     */   }
/*     */   
/*     */   public int e() {
/*  81 */     return this.f;
/*     */   }
/*     */   
/*     */   public int f() {
/*  85 */     return this.g;
/*     */   }
/*     */   
/*     */   public double g() {
/*  89 */     return this.h;
/*     */   }
/*     */   
/*     */   public double h() {
/*  93 */     return this.i;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public boolean i() {
/*  98 */     return this.j;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public boolean j() {
/* 103 */     return this.k;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public boolean k() {
/* 108 */     return this.l;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public boolean l() {
/* 113 */     return this.m;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */