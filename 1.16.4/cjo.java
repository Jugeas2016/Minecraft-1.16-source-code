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
/*    */ public class cjo
/*    */   extends cjl<cmh>
/*    */ {
/*    */   public cjo(Codec<cmh> ☃) {
/* 17 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 22 */     if (!☃.w(fx1)) {
/* 23 */       return false;
/*    */     }
/*    */     
/* 26 */     ceh ceh = ☃.d_(fx1.b());
/* 27 */     if (!ceh.a(bup.cL) && !ceh.a(bup.cO) && !ceh.a(bup.np)) {
/* 28 */       return false;
/*    */     }
/*    */     
/* 31 */     ☃.a(fx1, bup.cS.n(), 2);
/*    */     
/* 33 */     for (int i = 0; i < 1500; i++) {
/* 34 */       fx fx2 = fx1.b(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
/* 35 */       if (☃.d_(fx2).g()) {
/*    */ 
/*    */ 
/*    */         
/* 39 */         int j = 0;
/* 40 */         for (gc gc : gc.values()) {
/* 41 */           if (☃.d_(fx2.a(gc)).a(bup.cS)) {
/* 42 */             j++;
/*    */           }
/*    */           
/* 45 */           if (j > 1) {
/*    */             break;
/*    */           }
/*    */         } 
/*    */         
/* 50 */         if (j == 1) {
/* 51 */           ☃.a(fx2, bup.cS.n(), 2);
/*    */         }
/*    */       } 
/*    */     } 
/* 55 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */