/*    */ import com.mojang.serialization.Codec;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class csk
/*    */   extends csy
/*    */ {
/* 16 */   public static final Codec<csk> a = Codec.unit(() -> b);
/* 17 */   public static final csk b = new csk();
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ctb.c a(brz ☃, fx fx1, fx fx2, ctb.c c1, ctb.c c2, csx csx1) {
/* 22 */     fx fx3 = c2.a;
/* 23 */     boolean bool = ☃.d_(fx3).a(bup.B);
/* 24 */     if (bool && !buo.a(c2.b.j(☃, fx3))) {
/* 25 */       return new ctb.c(fx3, bup.B.n(), c2.c);
/*    */     }
/* 27 */     return c2;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cta<?> a() {
/* 32 */     return cta.i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */