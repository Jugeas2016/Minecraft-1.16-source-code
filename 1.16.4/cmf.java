/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cmf implements clw {
/*    */   static {
/*  7 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.DOUBLE.fieldOf("noise_level").forGetter(()), (App)Codec.INT.fieldOf("below_noise").forGetter(()), (App)Codec.INT.fieldOf("above_noise").forGetter(())).apply((Applicative)☃, cmf::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmf> a;
/*    */   
/*    */   public final double c;
/*    */   public final int d;
/*    */   public final int e;
/*    */   
/*    */   public cmf(double ☃, int i, int j) {
/* 18 */     this.c = ☃;
/* 19 */     this.d = i;
/* 20 */     this.e = j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */