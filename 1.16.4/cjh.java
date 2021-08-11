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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cjh
/*    */   extends cla<cmh>
/*    */ {
/*    */   public cjh(Codec<cmh> ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean b() {
/* 30 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(cfy ☃, bsy bsy1, long l, chx chx1, int i, int j, bsv bsv1, brd brd1, cmh cmh1) {
/* 35 */     return (b(i, j, ☃) >= 60);
/*    */   }
/*    */ 
/*    */   
/*    */   public cla.a<cmh> a() {
/* 40 */     return a::new;
/*    */   }
/*    */   
/*    */   private static int b(int ☃, int i, cfy cfy1) {
/* 44 */     Random random = new Random((☃ + i * 10387313));
/* 45 */     bzm bzm = bzm.a(random);
/*    */     
/* 47 */     int j = 5;
/* 48 */     int k = 5;
/* 49 */     if (bzm == bzm.b) {
/* 50 */       j = -5;
/* 51 */     } else if (bzm == bzm.c) {
/* 52 */       j = -5;
/* 53 */       k = -5;
/* 54 */     } else if (bzm == bzm.d) {
/* 55 */       k = -5;
/*    */     } 
/*    */     
/* 58 */     int m = (☃ << 4) + 7;
/* 59 */     int n = (i << 4) + 7;
/* 60 */     int i1 = cfy1.c(m, n, chn.a.a);
/* 61 */     int i2 = cfy1.c(m, n + k, chn.a.a);
/* 62 */     int i3 = cfy1.c(m + j, n, chn.a.a);
/* 63 */     int i4 = cfy1.c(m + j, n + k, chn.a.a);
/*    */     
/* 65 */     return Math.min(Math.min(i1, i2), Math.min(i3, i4));
/*    */   }
/*    */   
/*    */   public static class a extends crv<cmh> {
/*    */     public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/* 70 */       super(☃, i, j, cra1, k, l);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/* 75 */       bzm bzm = bzm.a(this.d);
/*    */       
/* 77 */       int k = cjh.a(i, j, cfy1);
/*    */ 
/*    */       
/* 80 */       if (k < 60) {
/*    */         return;
/*    */       }
/*    */       
/* 84 */       fx fx = new fx(i * 16 + 8, k, j * 16 + 8);
/* 85 */       crd.a(csw1, fx, bzm, this.b, this.d);
/*    */       
/* 87 */       b();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */