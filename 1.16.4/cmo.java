/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cmo implements clw {
/*    */   static {
/*  7 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("bottom_offset").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("top_offset").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("maximum").orElse(Integer.valueOf(0)).forGetter(())).apply((Applicative)☃, cmo::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmo> a;
/*    */   
/*    */   public final int c;
/*    */   public final int d;
/*    */   public final int e;
/*    */   
/*    */   public cmo(int ☃, int i, int j) {
/* 18 */     this.c = ☃;
/* 19 */     this.d = i;
/* 20 */     this.e = j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */