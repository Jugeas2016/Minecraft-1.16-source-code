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
/*    */ 
/*    */ public class cim
/*    */   extends cjl<cmh>
/*    */ {
/*    */   public cim(Codec<cmh> ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 24 */     if (!☃.w(fx1) || ☃.w(fx1.b())) {
/* 25 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 29 */     fx.a a1 = fx1.i();
/* 30 */     fx.a a2 = fx1.i();
/* 31 */     boolean bool1 = true;
/* 32 */     boolean bool2 = true;
/* 33 */     boolean bool3 = true;
/* 34 */     boolean bool4 = true;
/*    */     
/* 36 */     while (☃.w(a1)) {
/* 37 */       if (brx.m(a1)) {
/* 38 */         return true;
/*    */       }
/*    */       
/* 41 */       ☃.a(a1, bup.cO.n(), 2);
/*    */       
/* 43 */       bool1 = (bool1 && b(☃, random, a2.a(a1, gc.c)));
/* 44 */       bool2 = (bool2 && b(☃, random, a2.a(a1, gc.d)));
/* 45 */       bool3 = (bool3 && b(☃, random, a2.a(a1, gc.e)));
/* 46 */       bool4 = (bool4 && b(☃, random, a2.a(a1, gc.f)));
/*    */       
/* 48 */       a1.c(gc.a);
/*    */     } 
/*    */ 
/*    */     
/* 52 */     a1.c(gc.b);
/* 53 */     a(☃, random, a2.a(a1, gc.c));
/* 54 */     a(☃, random, a2.a(a1, gc.d));
/* 55 */     a(☃, random, a2.a(a1, gc.e));
/* 56 */     a(☃, random, a2.a(a1, gc.f));
/* 57 */     a1.c(gc.a);
/*    */     
/* 59 */     fx.a a3 = new fx.a();
/* 60 */     for (int i = -3; i < 4; i++) {
/* 61 */       for (int j = -3; j < 4; j++) {
/* 62 */         int k = afm.a(i) * afm.a(j);
/* 63 */         if (random.nextInt(10) < 10 - k) {
/*    */ 
/*    */ 
/*    */           
/* 67 */           a3.g(a1.b(i, 0, j));
/* 68 */           int m = 3;
/* 69 */           while (☃.w(a2.a(a3, gc.a))) {
/* 70 */             a3.c(gc.a);
/* 71 */             m--;
/* 72 */             if (m <= 0) {
/*    */               break;
/*    */             }
/*    */           } 
/*    */           
/* 77 */           if (!☃.w(a2.a(a3, gc.a))) {
/* 78 */             ☃.a(a3, bup.cO.n(), 2);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 83 */     return true;
/*    */   }
/*    */   
/*    */   private void a(bry ☃, Random random, fx fx1) {
/* 87 */     if (random.nextBoolean()) {
/* 88 */       ☃.a(fx1, bup.cO.n(), 2);
/*    */     }
/*    */   }
/*    */   
/*    */   private boolean b(bry ☃, Random random, fx fx1) {
/* 93 */     if (random.nextInt(10) != 0) {
/* 94 */       ☃.a(fx1, bup.cO.n(), 2);
/* 95 */       return true;
/*    */     } 
/*    */     
/* 98 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cim.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */