/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface coj<P extends coi>
/*    */ {
/*  7 */   public static final coj<coh> a = a("single_pool_element", coh.b);
/*  8 */   public static final coj<cog> b = a("list_pool_element", cog.a);
/*  9 */   public static final coj<coc> c = a("feature_pool_element", coc.a);
/* 10 */   public static final coj<cob> d = a("empty_pool_element", cob.a);
/* 11 */   public static final coj<cof> e = a("legacy_single_pool_element", cof.a);
/*    */ 
/*    */   
/*    */   Codec<P> codec();
/*    */   
/*    */   static <P extends coi> coj<P> a(String ☃, Codec<P> codec) {
/* 17 */     return (coj<P>)gm.<coj<?>>a(gm.be, ☃, () -> ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */