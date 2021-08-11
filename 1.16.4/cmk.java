/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class cmk implements chz, cma {
/*    */   static {
/*  8 */     b = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(())).apply((Applicative)☃, cmk::new));
/*    */   }
/*    */   
/*    */   public static final Codec<cmk> b;
/*    */   public final float c;
/*    */   
/*    */   public cmk(float ☃) {
/* 15 */     this.c = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */