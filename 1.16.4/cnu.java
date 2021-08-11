/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cnu<P extends cnt>
/*    */ {
/*  7 */   public static final cnu<cny> a = a("simple_state_provider", cny.b);
/*  8 */   public static final cnu<cnz> b = a("weighted_state_provider", cnz.b);
/*  9 */   public static final cnu<cnw> c = a("plain_flower_provider", cnw.b);
/* 10 */   public static final cnu<cnv> d = a("forest_flower_provider", cnv.b);
/* 11 */   public static final cnu<cnx> e = a("rotated_block_provider", cnx.b);
/*    */   
/*    */   private static <P extends cnt> cnu<P> a(String ☃, Codec<P> codec) {
/* 14 */     return (cnu<P>)gm.<cnu<?>>a(gm.aV, ☃, new cnu(codec));
/*    */   }
/*    */   
/*    */   private final Codec<P> f;
/*    */   
/*    */   private cnu(Codec<P> ☃) {
/* 20 */     this.f = ☃;
/*    */   }
/*    */   
/*    */   public Codec<P> a() {
/* 24 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */