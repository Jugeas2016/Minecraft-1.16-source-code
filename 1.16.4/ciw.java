/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ciw<FC extends cma, F extends cla<FC>>
/*    */ {
/*    */   public static final Codec<ciw<?, ?>> a;
/*    */   
/*    */   static {
/* 21 */     a = gm.aG.dispatch(☃ -> ☃.d, cla::h);
/*    */   }
/* 23 */   public static final Codec<Supplier<ciw<?, ?>>> b = vf.a(gm.av, a);
/* 24 */   public static final Codec<List<Supplier<ciw<?, ?>>>> c = vf.b(gm.av, a);
/*    */   
/*    */   public final F d;
/*    */   public final FC e;
/*    */   
/*    */   public ciw(F ☃, FC fC) {
/* 30 */     this.d = ☃;
/* 31 */     this.e = fC;
/*    */   }
/*    */   
/*    */   public crv<?> a(gn ☃, cfy cfy1, bsy bsy1, csw csw1, long l, brd brd1, bsv bsv1, int i, cmy cmy1) {
/* 35 */     return this.d.a(☃, cfy1, bsy1, csw1, l, brd1, bsv1, i, new chx(), cmy1, this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ciw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */