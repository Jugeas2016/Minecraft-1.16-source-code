/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cme implements cma {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(()), (App)ckb.b.c.fieldOf("type").forGetter(())).apply((Applicative)☃, cme::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cme> a;
/*    */   public final float b;
/*    */   public final ckb.b c;
/*    */   
/*    */   public cme(float ☃, ckb.b b1) {
/* 17 */     this.b = ☃;
/* 18 */     this.c = b1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cme.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */