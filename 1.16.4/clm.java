/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class clm<P extends cll>
/*    */ {
/*  7 */   public static final clm<clp> a = a("simple_block_placer", clp.b);
/*  8 */   public static final clm<clo> b = a("double_plant_placer", clo.b);
/*  9 */   public static final clm<cln> c = a("column_placer", cln.b);
/*    */   
/*    */   private static <P extends cll> clm<P> a(String ☃, Codec<P> codec) {
/* 12 */     return (clm<P>)gm.<clm<?>>a(gm.aW, ☃, new clm(codec));
/*    */   }
/*    */   
/*    */   private final Codec<P> d;
/*    */   
/*    */   private clm(Codec<P> ☃) {
/* 18 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   public Codec<P> a() {
/* 22 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */