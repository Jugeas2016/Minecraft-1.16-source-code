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
/*    */ public class cjf
/*    */   extends cjl<cmh>
/*    */ {
/* 17 */   private static final cer a = cer.a(bup.C);
/*    */   
/* 19 */   private final ceh ab = bup.hS.n();
/* 20 */   private final ceh ac = bup.at.n();
/* 21 */   private final ceh ad = bup.A.n();
/*    */   
/*    */   public cjf(Codec<cmh> ☃) {
/* 24 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmh cmh1) {
/* 29 */     fx1 = fx1.b();
/*    */     
/* 31 */     while (☃.w(fx1) && fx1.v() > 2) {
/* 32 */       fx1 = fx1.c();
/*    */     }
/*    */     
/* 35 */     if (!a.a(☃.d_(fx1))) {
/* 36 */       return false;
/*    */     }
/*    */     
/*    */     int i;
/*    */     
/* 41 */     for (i = -2; i <= 2; i++) {
/* 42 */       for (int j = -2; j <= 2; j++) {
/* 43 */         if (☃.w(fx1.b(i, -1, j)) && ☃.w(fx1.b(i, -2, j))) {
/* 44 */           return false;
/*    */         }
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 50 */     for (i = -1; i <= 0; i++) {
/* 51 */       for (int j = -2; j <= 2; j++) {
/* 52 */         for (int k = -2; k <= 2; k++) {
/* 53 */           ☃.a(fx1.b(j, i, k), this.ac, 2);
/*    */         }
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 59 */     ☃.a(fx1, this.ad, 2);
/* 60 */     for (gc gc : gc.c.a) {
/* 61 */       ☃.a(fx1.a(gc), this.ad, 2);
/*    */     }
/*    */ 
/*    */     
/* 65 */     for (i = -2; i <= 2; i++) {
/* 66 */       for (int j = -2; j <= 2; j++) {
/* 67 */         if (i == -2 || i == 2 || j == -2 || j == 2) {
/* 68 */           ☃.a(fx1.b(i, 1, j), this.ac, 2);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 73 */     ☃.a(fx1.b(2, 1, 0), this.ab, 2);
/* 74 */     ☃.a(fx1.b(-2, 1, 0), this.ab, 2);
/* 75 */     ☃.a(fx1.b(0, 1, 2), this.ab, 2);
/* 76 */     ☃.a(fx1.b(0, 1, -2), this.ab, 2);
/*    */ 
/*    */     
/* 79 */     for (i = -1; i <= 1; i++) {
/* 80 */       for (int j = -1; j <= 1; j++) {
/* 81 */         if (i == 0 && j == 0) {
/* 82 */           ☃.a(fx1.b(i, 4, j), this.ac, 2);
/*    */         } else {
/* 84 */           ☃.a(fx1.b(i, 4, j), this.ab, 2);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 90 */     for (i = 1; i <= 3; i++) {
/* 91 */       ☃.a(fx1.b(-1, i, -1), this.ac, 2);
/* 92 */       ☃.a(fx1.b(-1, i, 1), this.ac, 2);
/* 93 */       ☃.a(fx1.b(1, i, -1), this.ac, 2);
/* 94 */       ☃.a(fx1.b(1, i, 1), this.ac, 2);
/*    */     } 
/*    */     
/* 97 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */