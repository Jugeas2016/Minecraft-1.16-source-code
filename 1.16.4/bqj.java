/*    */ import java.util.Map;
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
/*    */ public class bqj
/*    */   extends bps
/*    */ {
/*    */   public bqj(bps.a ☃, aqf... arrayOfAqf) {
/* 17 */     super(☃, bpt.d, arrayOfAqf);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃) {
/* 22 */     return 10 + 20 * (☃ - 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(int ☃) {
/* 27 */     return super.a(☃) + 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 32 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 37 */     if (☃.b() instanceof bjy) {
/* 38 */       return true;
/*    */     }
/* 40 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(aqm ☃, aqa aqa1, int i) {
/* 45 */     Random random = ☃.cY();
/* 46 */     Map.Entry<aqf, bmb> entry = bpu.b(bpw.h, ☃);
/*    */     
/* 48 */     if (a(i, random)) {
/* 49 */       if (aqa1 != null) {
/* 50 */         aqa1.a(apk.a(☃), b(i, random));
/*    */       }
/*    */       
/* 53 */       if (entry != null) {
/* 54 */         ((bmb)entry.getValue()).a(2, ☃, aqm1 -> aqm1.c((aqf)☃.getKey()));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public static boolean a(int ☃, Random random) {
/* 60 */     if (☃ <= 0) {
/* 61 */       return false;
/*    */     }
/* 63 */     return (random.nextFloat() < 0.15F * ☃);
/*    */   }
/*    */   
/*    */   public static int b(int ☃, Random random) {
/* 67 */     if (☃ > 10) {
/* 68 */       return ☃ - 10;
/*    */     }
/* 70 */     return 1 + random.nextInt(4);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bqj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */