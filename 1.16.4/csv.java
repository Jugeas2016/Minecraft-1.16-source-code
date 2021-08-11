/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface csv<P extends csu>
/*    */ {
/*  7 */   public static final csv<csa> a = a("always_true", csa.a);
/*  8 */   public static final csv<csf> b = a("block_match", csf.a);
/*  9 */   public static final csv<csh> c = a("blockstate_match", csh.a);
/* 10 */   public static final csv<ctc> d = a("tag_match", ctc.a);
/* 11 */   public static final csv<csr> e = a("random_block_match", csr.a);
/* 12 */   public static final csv<css> f = a("random_blockstate_match", css.a);
/*    */ 
/*    */   
/*    */   Codec<P> codec();
/*    */   
/*    */   static <P extends csu> csv<P> a(String ☃, Codec<P> codec) {
/* 18 */     return (csv<P>)gm.<csv<?>>a(gm.aa, ☃, () -> ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */