/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class csr extends csu {
/*    */   public static final Codec<csr> a;
/*    */   
/*    */   static {
/* 12 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)gm.Q.fieldOf("block").forGetter(()), (App)Codec.FLOAT.fieldOf("probability").forGetter(())).apply((Applicative)☃, csr::new));
/*    */   }
/*    */ 
/*    */   
/*    */   private final buo b;
/*    */   
/*    */   private final float d;
/*    */   
/*    */   public csr(buo ☃, float f) {
/* 21 */     this.b = ☃;
/* 22 */     this.d = f;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, Random random) {
/* 27 */     return (☃.a(this.b) && random.nextFloat() < this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   protected csv<?> a() {
/* 32 */     return csv.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */