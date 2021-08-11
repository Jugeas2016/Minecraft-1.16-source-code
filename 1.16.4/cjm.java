/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cjm
/*    */   extends cjl<cmd>
/*    */ {
/*    */   public cjm(Codec<cmd> ☃) {
/* 14 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmd cmd1) {
/* 19 */     fx.a a = new fx.a();
/*    */     
/* 21 */     for (int i = 0; i < 16; i++) {
/* 22 */       for (int j = 0; j < 16; j++) {
/* 23 */         int k = fx1.u() + i;
/* 24 */         int m = fx1.w() + j;
/* 25 */         int n = cmd1.b;
/* 26 */         a.d(k, n, m);
/*    */         
/* 28 */         if (☃.d_(a).g()) {
/* 29 */           ☃.a(a, cmd1.c, 2);
/*    */         }
/*    */       } 
/*    */     } 
/* 33 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */