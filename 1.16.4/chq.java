/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class chq {
/*  7 */   private static final Codec<Double> b = Codec.doubleRange(0.001D, 1000.0D);
/*    */   static {
/*  9 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)b.fieldOf("xz_scale").forGetter(chq::a), (App)b.fieldOf("y_scale").forGetter(chq::b), (App)b.fieldOf("xz_factor").forGetter(chq::c), (App)b.fieldOf("y_factor").forGetter(chq::d)).apply((Applicative)☃, chq::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<chq> a;
/*    */   
/*    */   private final double c;
/*    */   
/*    */   private final double d;
/*    */   private final double e;
/*    */   private final double f;
/*    */   
/*    */   public chq(double ☃, double d1, double d2, double d3) {
/* 22 */     this.c = ☃;
/* 23 */     this.d = d1;
/* 24 */     this.e = d2;
/* 25 */     this.f = d3;
/*    */   }
/*    */   
/*    */   public double a() {
/* 29 */     return this.c;
/*    */   }
/*    */   
/*    */   public double b() {
/* 33 */     return this.d;
/*    */   }
/*    */   
/*    */   public double c() {
/* 37 */     return this.e;
/*    */   }
/*    */   
/*    */   public double d() {
/* 41 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */