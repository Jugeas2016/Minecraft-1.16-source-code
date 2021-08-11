/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class css extends csu {
/*    */   static {
/* 10 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)ceh.b.fieldOf("block_state").forGetter(()), (App)Codec.FLOAT.fieldOf("probability").forGetter(())).apply((Applicative)☃, css::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<css> a;
/*    */   private final ceh b;
/*    */   private final float d;
/*    */   
/*    */   public css(ceh ☃, float f) {
/* 19 */     this.b = ☃;
/* 20 */     this.d = f;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, Random random) {
/* 25 */     return (☃ == this.b && random.nextFloat() < this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   protected csv<?> a() {
/* 30 */     return csv.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\css.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */