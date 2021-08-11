/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cqd implements clw {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("count").forGetter(()), (App)Codec.FLOAT.fieldOf("extra_chance").forGetter(()), (App)Codec.INT.fieldOf("extra_count").forGetter(())).apply((Applicative)☃, cqd::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cqd> a;
/*    */   
/*    */   public final int c;
/*    */   public final float d;
/*    */   public final int e;
/*    */   
/*    */   public cqd(int ☃, float f, int i) {
/* 19 */     this.c = ☃;
/* 20 */     this.d = f;
/* 21 */     this.e = i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cqd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */