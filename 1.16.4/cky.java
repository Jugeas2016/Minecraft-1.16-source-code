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
/*    */ public class cky
/*    */   extends cjl<cmw>
/*    */ {
/*    */   public cky(Codec<cmw> ☃) {
/* 15 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmw cmw1) {
/* 20 */     if (!cmw1.f.contains(☃.d_(fx1.b()).b())) {
/* 21 */       return false;
/*    */     }
/* 23 */     if (cmw1.c && !cmw1.f.contains(☃.d_(fx1.c()).b())) {
/* 24 */       return false;
/*    */     }
/*    */     
/* 27 */     ceh ceh = ☃.d_(fx1);
/* 28 */     if (!ceh.g() && !cmw1.f.contains(ceh.b())) {
/* 29 */       return false;
/*    */     }
/*    */     
/* 32 */     int i = 0;
/*    */     
/* 34 */     int j = 0;
/* 35 */     if (cmw1.f.contains(☃.d_(fx1.f()).b())) {
/* 36 */       j++;
/*    */     }
/* 38 */     if (cmw1.f.contains(☃.d_(fx1.g()).b())) {
/* 39 */       j++;
/*    */     }
/* 41 */     if (cmw1.f.contains(☃.d_(fx1.d()).b())) {
/* 42 */       j++;
/*    */     }
/* 44 */     if (cmw1.f.contains(☃.d_(fx1.e()).b())) {
/* 45 */       j++;
/*    */     }
/* 47 */     if (cmw1.f.contains(☃.d_(fx1.c()).b())) {
/* 48 */       j++;
/*    */     }
/*    */     
/* 51 */     int k = 0;
/* 52 */     if (☃.w(fx1.f())) {
/* 53 */       k++;
/*    */     }
/* 55 */     if (☃.w(fx1.g())) {
/* 56 */       k++;
/*    */     }
/* 58 */     if (☃.w(fx1.d())) {
/* 59 */       k++;
/*    */     }
/* 61 */     if (☃.w(fx1.e())) {
/* 62 */       k++;
/*    */     }
/* 64 */     if (☃.w(fx1.c())) {
/* 65 */       k++;
/*    */     }
/*    */     
/* 68 */     if (j == cmw1.d && k == cmw1.e) {
/* 69 */       ☃.a(fx1, cmw1.b.g(), 2);
/* 70 */       ☃.I().a(fx1, cmw1.b.a(), 0);
/* 71 */       i++;
/*    */     } 
/*    */     
/* 74 */     return (i > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cky.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */