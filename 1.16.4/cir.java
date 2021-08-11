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
/*    */ public class cir
/*    */   extends cjl<cmh>
/*    */ {
/*    */   public cir(Codec<cmh> ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 23 */     if (fx1.v() > ☃.t_() - 1) {
/* 24 */       return false;
/*    */     }
/* 26 */     if (!☃.d_(fx1).a(bup.A) && !☃.d_(fx1.c()).a(bup.A)) {
/* 27 */       return false;
/*    */     }
/*    */     
/* 30 */     boolean bool = false;
/* 31 */     for (gc gc : gc.values()) {
/* 32 */       if (gc != gc.a)
/*    */       {
/*    */         
/* 35 */         if (☃.d_(fx1.a(gc)).a(bup.gT)) {
/* 36 */           bool = true;
/*    */           break;
/*    */         }  } 
/*    */     } 
/* 40 */     if (!bool) {
/* 41 */       return false;
/*    */     }
/*    */     
/* 44 */     ☃.a(fx1, bup.kV.n(), 2);
/*    */     
/* 46 */     for (int i = 0; i < 200; i++) {
/* 47 */       int j = random.nextInt(5) - random.nextInt(6);
/* 48 */       int k = 3;
/* 49 */       if (j < 2) {
/* 50 */         k += j / 2;
/*    */       }
/* 52 */       if (k >= 1) {
/*    */ 
/*    */ 
/*    */         
/* 56 */         fx fx2 = fx1.b(random.nextInt(k) - random.nextInt(k), j, random.nextInt(k) - random.nextInt(k));
/* 57 */         ceh ceh = ☃.d_(fx2);
/* 58 */         if (ceh.c() == cva.a || ceh.a(bup.A) || ceh.a(bup.gT) || ceh.a(bup.cD))
/*    */         {
/*    */ 
/*    */           
/* 62 */           for (gc gc : gc.values()) {
/* 63 */             ceh ceh1 = ☃.d_(fx2.a(gc));
/* 64 */             if (ceh1.a(bup.kV)) {
/* 65 */               ☃.a(fx2, bup.kV.n(), 2);
/*    */               break;
/*    */             } 
/*    */           }  } 
/*    */       } 
/*    */     } 
/* 71 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */