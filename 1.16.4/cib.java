/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.BitSet;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cib<WC extends chz>
/*    */ {
/*    */   public static final Codec<cib<?>> a;
/*    */   
/*    */   static {
/* 17 */     a = gm.aC.dispatch(☃ -> ☃.d, cig::c);
/*    */   }
/* 19 */   public static final Codec<Supplier<cib<?>>> b = vf.a(gm.at, a);
/* 20 */   public static final Codec<List<Supplier<cib<?>>>> c = vf.b(gm.at, a);
/*    */   
/*    */   private final cig<WC> d;
/*    */   private final WC e;
/*    */   
/*    */   public cib(cig<WC> ☃, WC wC) {
/* 26 */     this.d = ☃;
/* 27 */     this.e = wC;
/*    */   }
/*    */   
/*    */   public WC a() {
/* 31 */     return this.e;
/*    */   }
/*    */   
/*    */   public boolean a(Random ☃, int i, int j) {
/* 35 */     return this.d.a(☃, i, j, this.e);
/*    */   }
/*    */   
/*    */   public boolean a(cfw ☃, Function<fx, bsv> function, Random random, int i, int j, int k, int m, int n, BitSet bitSet) {
/* 39 */     return this.d.a(☃, function, random, i, j, k, m, n, bitSet, this.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */