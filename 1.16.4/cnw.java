/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cnw
/*    */   extends cnt
/*    */ {
/* 13 */   public static final Codec<cnw> b = Codec.unit(() -> c);
/*    */   
/* 15 */   public static final cnw c = new cnw();
/*    */   
/* 17 */   private static final ceh[] d = new ceh[] { bup.bv
/* 18 */       .n(), bup.bu
/* 19 */       .n(), bup.bx
/* 20 */       .n(), bup.bw
/* 21 */       .n() };
/*    */   
/* 23 */   private static final ceh[] e = new ceh[] { bup.bq
/* 24 */       .n(), bup.bt
/* 25 */       .n(), bup.by
/* 26 */       .n(), bup.bz
/* 27 */       .n() };
/*    */ 
/*    */ 
/*    */   
/*    */   protected cnu<?> a() {
/* 32 */     return cnu.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(Random ☃, fx fx1) {
/* 37 */     double d = bsv.f.a(fx1.u() / 200.0D, fx1.w() / 200.0D, false);
/* 38 */     if (d < -0.8D) {
/* 39 */       return x.<ceh>a(d, ☃);
/*    */     }
/*    */     
/* 42 */     if (☃.nextInt(3) > 0) {
/* 43 */       return x.<ceh>a(e, ☃);
/*    */     }
/*    */     
/* 46 */     return bup.bp.n();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */