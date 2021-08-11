/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dkf
/*    */   extends dkc
/*    */ {
/*    */   protected final float Y;
/*    */   protected final double Z;
/*    */   protected double aa;
/*    */   private final Function<dkd, Double> ab;
/*    */   private final BiConsumer<dkd, Double> ac;
/*    */   private final BiFunction<dkd, dkf, nr> ad;
/*    */   
/*    */   public dkf(String ☃, double d1, double d2, float f, Function<dkd, Double> function, BiConsumer<dkd, Double> biConsumer, BiFunction<dkd, dkf, nr> biFunction) {
/* 21 */     super(☃);
/*    */     
/* 23 */     this.Z = d1;
/* 24 */     this.aa = d2;
/* 25 */     this.Y = f;
/* 26 */     this.ab = function;
/* 27 */     this.ac = biConsumer;
/* 28 */     this.ad = biFunction;
/*    */   }
/*    */ 
/*    */   
/*    */   public dlh a(dkd ☃, int i, int j, int k) {
/* 33 */     return new dlz(☃, i, j, k, 20, this);
/*    */   }
/*    */   
/*    */   public double a(double ☃) {
/* 37 */     return afm.a((d(☃) - this.Z) / (this.aa - this.Z), 0.0D, 1.0D);
/*    */   }
/*    */   
/*    */   public double b(double ☃) {
/* 41 */     return d(afm.d(afm.a(☃, 0.0D, 1.0D), this.Z, this.aa));
/*    */   }
/*    */   
/*    */   private double d(double ☃) {
/* 45 */     if (this.Y > 0.0F) {
/* 46 */       ☃ = (this.Y * (float)Math.round(☃ / this.Y));
/*    */     }
/* 48 */     return afm.a(☃, this.Z, this.aa);
/*    */   }
/*    */   
/*    */   public double c() {
/* 52 */     return this.Z;
/*    */   }
/*    */   
/*    */   public double d() {
/* 56 */     return this.aa;
/*    */   }
/*    */   
/*    */   public void a(float ☃) {
/* 60 */     this.aa = ☃;
/*    */   }
/*    */   
/*    */   public void a(dkd ☃, double d) {
/* 64 */     this.ac.accept(☃, Double.valueOf(d));
/*    */   }
/*    */   
/*    */   public double a(dkd ☃) {
/* 68 */     return ((Double)this.ab.apply(☃)).doubleValue();
/*    */   }
/*    */ 
/*    */   
/*    */   public nr c(dkd ☃) {
/* 73 */     return this.ad.apply(☃, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */