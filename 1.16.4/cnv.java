/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cnv
/*    */   extends cnt
/*    */ {
/* 13 */   public static final Codec<cnv> b = Codec.unit(() -> c);
/*    */   
/* 15 */   private static final ceh[] d = new ceh[] { bup.bp
/* 16 */       .n(), bup.bq
/* 17 */       .n(), bup.bs
/* 18 */       .n(), bup.bt
/* 19 */       .n(), bup.bu
/* 20 */       .n(), bup.bv
/* 21 */       .n(), bup.bw
/* 22 */       .n(), bup.bx
/* 23 */       .n(), bup.by
/* 24 */       .n(), bup.bz
/* 25 */       .n(), bup.bB
/* 26 */       .n() };
/*    */ 
/*    */ 
/*    */   
/*    */   protected cnu<?> a() {
/* 31 */     return cnu.d;
/*    */   }
/*    */   
/* 34 */   public static final cnv c = new cnv();
/*    */ 
/*    */   
/*    */   public ceh a(Random ☃, fx fx1) {
/* 38 */     double d = afm.a((1.0D + bsv.f.a(fx1.u() / 48.0D, fx1.w() / 48.0D, false)) / 2.0D, 0.0D, 0.9999D);
/* 39 */     return d[(int)(d * d.length)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */