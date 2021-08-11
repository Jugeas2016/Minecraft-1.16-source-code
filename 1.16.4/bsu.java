/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class bsu
/*    */ {
/*    */   static {
/* 11 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)hh.au.fieldOf("options").forGetter(()), (App)Codec.FLOAT.fieldOf("probability").forGetter(())).apply((Applicative)☃, bsu::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<bsu> a;
/*    */   private final hf b;
/*    */   private final float c;
/*    */   
/*    */   public bsu(hf ☃, float f) {
/* 20 */     this.b = ☃;
/* 21 */     this.c = f;
/*    */   }
/*    */   
/*    */   public hf a() {
/* 25 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean a(Random ☃) {
/* 29 */     return (☃.nextFloat() <= this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */