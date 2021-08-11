/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface csp<P extends cso>
/*    */ {
/*  7 */   public static final csp<csn> a = a("always_true", csn.a);
/*  8 */   public static final csp<csl> b = a("linear_pos", csl.a);
/*  9 */   public static final csp<csb> c = a("axis_aligned_linear_pos", csb.a);
/*    */ 
/*    */   
/*    */   Codec<P> codec();
/*    */   
/*    */   static <P extends cso> csp<P> a(String ☃, Codec<P> codec) {
/* 15 */     return (csp<P>)gm.<csp<?>>a(gm.ab, ☃, () -> ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */