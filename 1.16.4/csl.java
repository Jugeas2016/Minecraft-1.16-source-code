/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class csl
/*    */   extends cso {
/*    */   static {
/* 11 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.FLOAT.fieldOf("min_chance").orElse(Float.valueOf(0.0F)).forGetter(()), (App)Codec.FLOAT.fieldOf("max_chance").orElse(Float.valueOf(0.0F)).forGetter(()), (App)Codec.INT.fieldOf("min_dist").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("max_dist").orElse(Integer.valueOf(0)).forGetter(())).apply((Applicative)☃, csl::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<csl> a;
/*    */   
/*    */   private final float b;
/*    */   
/*    */   private final float d;
/*    */   private final int e;
/*    */   private final int f;
/*    */   
/*    */   public csl(float ☃, float f1, int i, int j) {
/* 24 */     if (i >= j) {
/* 25 */       throw new IllegalArgumentException("Invalid range: [" + i + "," + j + "]");
/*    */     }
/*    */     
/* 28 */     this.b = ☃;
/* 29 */     this.d = f1;
/* 30 */     this.e = i;
/* 31 */     this.f = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(fx ☃, fx fx1, fx fx2, Random random) {
/* 36 */     int i = fx1.k(fx2);
/*    */     
/* 38 */     float f = random.nextFloat();
/* 39 */     return (f <= afm.b(this.b, this.d, afm.c(i, this.e, this.f)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected csp<?> a() {
/* 44 */     return csp.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */