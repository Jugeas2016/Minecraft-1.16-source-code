/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cnc<P extends cnb>
/*    */ {
/*  7 */   public static final cnc<cne> a = a("two_layers_feature_size", cne.c);
/*  8 */   public static final cnc<cnd> b = a("three_layers_feature_size", cnd.c);
/*    */   
/*    */   private static <P extends cnb> cnc<P> a(String ☃, Codec<P> codec) {
/* 11 */     return (cnc<P>)gm.<cnc<?>>a(gm.ba, ☃, new cnc(codec));
/*    */   }
/*    */   
/*    */   private final Codec<P> c;
/*    */   
/*    */   private cnc(Codec<P> ☃) {
/* 17 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   public Codec<P> a() {
/* 21 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */