/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function5;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   public static final Codec<a> a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final boolean f;
/*     */   private final dci g;
/*     */   
/*     */   static {
/* 111 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("centerX").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("centerZ").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("radius").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("height").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.BOOL.fieldOf("guarded").orElse(Boolean.valueOf(false)).forGetter(())).apply((Applicative)☃, a::new));
/*     */   }
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
/*     */   public a(int ☃, int i, int j, int k, boolean bool) {
/* 127 */     this.b = ☃;
/* 128 */     this.c = i;
/* 129 */     this.d = j;
/* 130 */     this.e = k;
/* 131 */     this.f = bool;
/*     */     
/* 133 */     this.g = new dci((☃ - j), 0.0D, (i - j), (☃ + j), 256.0D, (i + j));
/*     */   }
/*     */   
/*     */   public boolean a(fx ☃) {
/* 137 */     return (☃.u() >> 4 == this.b >> 4 && ☃
/* 138 */       .w() >> 4 == this.c >> 4);
/*     */   }
/*     */   
/*     */   public int a() {
/* 142 */     return this.b;
/*     */   }
/*     */   
/*     */   public int b() {
/* 146 */     return this.c;
/*     */   }
/*     */   
/*     */   public int c() {
/* 150 */     return this.d;
/*     */   }
/*     */   
/*     */   public int d() {
/* 154 */     return this.e;
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 158 */     return this.f;
/*     */   }
/*     */   
/*     */   public dci f() {
/* 162 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */