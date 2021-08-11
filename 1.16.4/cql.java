/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cql implements clw {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("noise_to_count_ratio").forGetter(()), (App)Codec.DOUBLE.fieldOf("noise_factor").forGetter(()), (App)Codec.DOUBLE.fieldOf("noise_offset").orElse(Double.valueOf(0.0D)).forGetter(())).apply((Applicative)☃, cql::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cql> a;
/*    */   
/*    */   public final int c;
/*    */   public final double d;
/*    */   public final double e;
/*    */   
/*    */   public cql(int ☃, double d1, double d2) {
/* 19 */     this.c = ☃;
/* 20 */     this.d = d1;
/* 21 */     this.e = d2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */