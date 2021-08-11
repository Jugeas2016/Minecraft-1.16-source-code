/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cpw implements clw {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("baseline").forGetter(()), (App)Codec.INT.fieldOf("spread").forGetter(())).apply((Applicative)☃, cpw::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cpw> a;
/*    */   public final int c;
/*    */   public final int d;
/*    */   
/*    */   public cpw(int ☃, int i) {
/* 17 */     this.c = ☃;
/* 18 */     this.d = i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */