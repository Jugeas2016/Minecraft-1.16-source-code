/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
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
/*    */ public class clg
/*    */   extends cjl<cmh>
/*    */ {
/* 17 */   private static final gc[] a = gc.values();
/*    */   
/*    */   public clg(Codec<cmh> ☃) {
/* 20 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 25 */     fx.a a = fx1.i();
/* 26 */     for (int i = 64; i < 256; i++) {
/* 27 */       a.g(fx1);
/* 28 */       a.e(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
/* 29 */       a.p(i);
/*    */       
/* 31 */       if (☃.w(a))
/*    */       {
/*    */ 
/*    */         
/* 35 */         for (gc gc1 : a) {
/* 36 */           if (gc1 != gc.a)
/*    */           {
/*    */ 
/*    */             
/* 40 */             if (cbi.a(☃, a, gc1)) {
/* 41 */               ☃.a(a, bup.dP.n().a(cbi.a(gc1), Boolean.valueOf(true)), 2);
/*    */               break;
/*    */             }  } 
/*    */         }  } 
/*    */     } 
/* 46 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */