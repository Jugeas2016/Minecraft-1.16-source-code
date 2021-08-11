/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ctw
/*    */   extends ctt<ctu>
/*    */ {
/*    */   public ctw(Codec<ctu> ☃) {
/* 13 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Random ☃, cfw cfw1, bsv bsv1, int i, int j, int k, double d, ceh ceh1, ceh ceh2, int m, long l, ctu ctu1) {
/* 18 */     double d1 = bsv.f.a(i * 0.25D, j * 0.25D, false);
/* 19 */     if (d1 > 0.0D) {
/* 20 */       int n = i & 0xF;
/* 21 */       int i1 = j & 0xF;
/*    */       
/* 23 */       fx.a a = new fx.a();
/*    */       
/* 25 */       for (int i2 = k; i2 >= 0; i2--) {
/* 26 */         a.d(n, i2, i1);
/* 27 */         if (!cfw1.d_(a).g()) {
/* 28 */           if (i2 == 62 && !cfw1.d_(a).a(ceh2.b())) {
/* 29 */             cfw1.a(a, ceh2, false);
/*    */           }
/*    */           
/*    */           break;
/*    */         } 
/*    */       } 
/*    */     } 
/* 36 */     ctt.v.a(☃, cfw1, bsv1, i, j, k, d, ceh1, ceh2, m, l, ctu1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */