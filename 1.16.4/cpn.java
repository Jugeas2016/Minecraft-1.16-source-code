/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ public class cpn implements clw {
/*    */   public static final Codec<cpn> a;
/*    */   
/*    */   static {
/*  7 */     a = Codec.INT.fieldOf("chance").xmap(cpn::new, ☃ -> Integer.valueOf(☃.c)).codec();
/*    */   }
/*    */   public final int c;
/*    */   
/*    */   public cpn(int ☃) {
/* 12 */     this.c = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */