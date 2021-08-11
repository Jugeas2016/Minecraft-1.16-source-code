/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ctg<SC extends ctv>
/*    */ {
/*    */   public static final Codec<ctg<?>> a;
/*    */   
/*    */   static {
/* 14 */     a = gm.aA.dispatch(☃ -> ☃.c, ctt::d);
/*    */   }
/* 16 */   public static final Codec<Supplier<ctg<?>>> b = vf.a(gm.as, a);
/*    */   
/*    */   public final ctt<SC> c;
/*    */   public final SC d;
/*    */   
/*    */   public ctg(ctt<SC> ☃, SC sC) {
/* 22 */     this.c = ☃;
/* 23 */     this.d = sC;
/*    */   }
/*    */   
/*    */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l) {
/* 27 */     this.c.a(☃, cfw1, bsv1, i, j, k, d, ceh1, ceh2, m, l, this.d);
/*    */   }
/*    */   
/*    */   public void a(long ☃) {
/* 31 */     this.c.a(☃);
/*    */   }
/*    */   
/*    */   public SC a() {
/* 35 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */