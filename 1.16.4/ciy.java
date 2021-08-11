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
/*    */ 
/*    */ 
/*    */ public abstract class ciy
/*    */   extends cjl<cmh>
/*    */ {
/*    */   public ciy(Codec<cmh> ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 26 */     ceh ceh = ((buo)aed.Y.a(random)).n();
/* 27 */     return a(☃, random, fx1, ceh);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean b(bry ☃, Random random, fx fx1, ceh ceh1) {
/* 33 */     fx fx2 = fx1.b();
/* 34 */     ceh ceh2 = ☃.d_(fx1);
/*    */     
/* 36 */     if ((!ceh2.a(bup.A) && !ceh2.a(aed.ab)) || !☃.d_(fx2).a(bup.A)) {
/* 37 */       return false;
/*    */     }
/*    */     
/* 40 */     ☃.a(fx1, ceh1, 3);
/* 41 */     if (random.nextFloat() < 0.25F) {
/* 42 */       ☃.a(fx2, ((buo)aed.ab.a(random)).n(), 2);
/* 43 */     } else if (random.nextFloat() < 0.05F) {
/* 44 */       ☃.a(fx2, bup.kU.n().a(bzq.a, Integer.valueOf(random.nextInt(4) + 1)), 2);
/*    */     } 
/*    */     
/* 47 */     for (gc gc : gc.c.a) {
/* 48 */       if (random.nextFloat() < 0.2F) {
/* 49 */         fx fx3 = fx1.a(gc);
/* 50 */         if (☃.d_(fx3).a(bup.A)) {
/* 51 */           ceh ceh3 = ((buo)aed.Z.a(random)).n().a(buc.a, gc);
/* 52 */           ☃.a(fx3, ceh3, 2);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 57 */     return true;
/*    */   }
/*    */   
/*    */   protected abstract boolean a(bry parambry, Random paramRandom, fx paramfx, ceh paramceh);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ciy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */