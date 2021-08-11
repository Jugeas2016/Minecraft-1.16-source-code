/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cnm<P extends cnl>
/*    */ {
/*  7 */   public static final cnm<cnh> a = a("blob_foliage_placer", cnh.a);
/*  8 */   public static final cnm<cnq> b = a("spruce_foliage_placer", cnq.a);
/*  9 */   public static final cnm<cnp> c = a("pine_foliage_placer", cnp.a);
/* 10 */   public static final cnm<cng> d = a("acacia_foliage_placer", cng.a);
/* 11 */   public static final cnm<cni> e = a("bush_foliage_placer", cni.c);
/* 12 */   public static final cnm<cnk> f = a("fancy_foliage_placer", cnk.c);
/* 13 */   public static final cnm<cnn> g = a("jungle_foliage_placer", cnn.a);
/* 14 */   public static final cnm<cno> h = a("mega_pine_foliage_placer", cno.a);
/* 15 */   public static final cnm<cnj> i = a("dark_oak_foliage_placer", cnj.a);
/*    */   
/*    */   private static <P extends cnl> cnm<P> a(String ☃, Codec<P> codec) {
/* 18 */     return (cnm<P>)gm.<cnm<?>>a(gm.aX, ☃, new cnm(codec));
/*    */   }
/*    */   
/*    */   private final Codec<P> j;
/*    */   
/*    */   private cnm(Codec<P> ☃) {
/* 24 */     this.j = ☃;
/*    */   }
/*    */   
/*    */   public Codec<P> a() {
/* 28 */     return this.j;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */